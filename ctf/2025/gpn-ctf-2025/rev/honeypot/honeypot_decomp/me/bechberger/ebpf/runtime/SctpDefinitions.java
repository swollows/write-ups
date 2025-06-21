/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class SctpDefinitions {

    @Type(noCCodeGeneration=true, cType="struct sctphdr")
    @NotUsableInJava
    public static class sctphdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short source;
        public @Unsigned @OriginalName(value="__be16") short dest;
        public @Unsigned @OriginalName(value="__be32") int vtag;
        public @Unsigned @OriginalName(value="__le32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="enum sctp_param")
    public static enum sctp_param implements Enum<sctp_param>,
    TypedEnum<sctp_param, Integer>
    {
        SCTP_PARAM_HEARTBEAT_INFO,
        SCTP_PARAM_IPV4_ADDRESS,
        SCTP_PARAM_IPV6_ADDRESS,
        SCTP_PARAM_STATE_COOKIE,
        SCTP_PARAM_UNRECOGNIZED_PARAMETERS,
        SCTP_PARAM_COOKIE_PRESERVATIVE,
        SCTP_PARAM_HOST_NAME_ADDRESS,
        SCTP_PARAM_SUPPORTED_ADDRESS_TYPES,
        SCTP_PARAM_ECN_CAPABLE,
        SCTP_PARAM_RANDOM,
        SCTP_PARAM_CHUNKS,
        SCTP_PARAM_HMAC_ALGO,
        SCTP_PARAM_SUPPORTED_EXT,
        SCTP_PARAM_FWD_TSN_SUPPORT,
        SCTP_PARAM_ADD_IP,
        SCTP_PARAM_DEL_IP,
        SCTP_PARAM_ERR_CAUSE,
        SCTP_PARAM_SET_PRIMARY,
        SCTP_PARAM_SUCCESS_REPORT,
        SCTP_PARAM_ADAPTATION_LAYER_IND,
        SCTP_PARAM_RESET_OUT_REQUEST,
        SCTP_PARAM_RESET_IN_REQUEST,
        SCTP_PARAM_RESET_TSN_REQUEST,
        SCTP_PARAM_RESET_RESPONSE,
        SCTP_PARAM_RESET_ADD_OUT_STREAMS,
        SCTP_PARAM_RESET_ADD_IN_STREAMS;

    }

    @Type(noCCodeGeneration=true, cType="enum sctp_event_timeout")
    public static enum sctp_event_timeout implements Enum<sctp_event_timeout>,
    TypedEnum<sctp_event_timeout, Integer>
    {
        SCTP_EVENT_TIMEOUT_NONE,
        SCTP_EVENT_TIMEOUT_T1_COOKIE,
        SCTP_EVENT_TIMEOUT_T1_INIT,
        SCTP_EVENT_TIMEOUT_T2_SHUTDOWN,
        SCTP_EVENT_TIMEOUT_T3_RTX,
        SCTP_EVENT_TIMEOUT_T4_RTO,
        SCTP_EVENT_TIMEOUT_T5_SHUTDOWN_GUARD,
        SCTP_EVENT_TIMEOUT_HEARTBEAT,
        SCTP_EVENT_TIMEOUT_RECONF,
        SCTP_EVENT_TIMEOUT_PROBE,
        SCTP_EVENT_TIMEOUT_SACK,
        SCTP_EVENT_TIMEOUT_AUTOCLOSE;

    }

    @Type(noCCodeGeneration=true, cType="enum sctp_cid")
    public static enum sctp_cid implements Enum<sctp_cid>,
    TypedEnum<sctp_cid, Integer>
    {
        SCTP_CID_DATA,
        SCTP_CID_INIT,
        SCTP_CID_INIT_ACK,
        SCTP_CID_SACK,
        SCTP_CID_HEARTBEAT,
        SCTP_CID_HEARTBEAT_ACK,
        SCTP_CID_ABORT,
        SCTP_CID_SHUTDOWN,
        SCTP_CID_SHUTDOWN_ACK,
        SCTP_CID_ERROR,
        SCTP_CID_COOKIE_ECHO,
        SCTP_CID_COOKIE_ACK,
        SCTP_CID_ECN_ECNE,
        SCTP_CID_ECN_CWR,
        SCTP_CID_SHUTDOWN_COMPLETE,
        SCTP_CID_AUTH,
        SCTP_CID_I_DATA,
        SCTP_CID_FWD_TSN,
        SCTP_CID_ASCONF,
        SCTP_CID_I_FWD_TSN,
        SCTP_CID_ASCONF_ACK,
        SCTP_CID_RECONF,
        SCTP_CID_PAD;

    }

    @Type(noCCodeGeneration=true, cType="enum sctp_msg_flags")
    public static enum sctp_msg_flags implements Enum<sctp_msg_flags>,
    TypedEnum<sctp_msg_flags, Integer>
    {
        MSG_NOTIFICATION;

    }

    @Type(noCCodeGeneration=true, cType="struct sctp_priv_assoc_stats")
    @NotUsableInJava
    public static class sctp_priv_assoc_stats
    extends Struct {
        public KernelDefinitions.__kernel_sockaddr_storage obs_rto_ipaddr;
        public @Unsigned long max_obs_rto;
        public @Unsigned long isacks;
        public @Unsigned long osacks;
        public @Unsigned long opackets;
        public @Unsigned long ipackets;
        public @Unsigned long rtxchunks;
        public @Unsigned long outofseqtsns;
        public @Unsigned long idupchunks;
        public @Unsigned long gapcnt;
        public @Unsigned long ouodchunks;
        public @Unsigned long iuodchunks;
        public @Unsigned long oodchunks;
        public @Unsigned long iodchunks;
        public @Unsigned long octrlchunks;
        public @Unsigned long ictrlchunks;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_stream")
    @NotUsableInJava
    public static class sctp_stream
    extends Struct {
        public misc.out_of_sctp_stream out;
        public InDefinitions.in_of_sctp_stream in;
        public @Unsigned short outcnt;
        public @Unsigned short incnt;
        public Ptr<sctp_stream_out> out_curr;
        @InlineUnion(value=13118)
        public  @InlineUnion(value=13118) AnonDefinitions.anon_member_of_anon_member_of_sctp_stream anon5$0;
        @InlineUnion(value=13118)
        public  @InlineUnion(value=13118) AnonDefinitions.anon_member_of_anon_member_of_sctp_stream anon5$1;
        @InlineUnion(value=13118)
        public  @InlineUnion(value=13118) AnonDefinitions.anon_member_of_anon_member_of_sctp_stream anon5$2;
        public Ptr<sctp_stream_interleave> si;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_stream_in")
    @NotUsableInJava
    public static class sctp_stream_in
    extends Struct {
        @InlineUnion(value=12945)
        public @InlineUnion(value=12945) @Unsigned int mid;
        @InlineUnion(value=12945)
        public @InlineUnion(value=12945) @Unsigned short ssn;
        public @Unsigned int mid_uo;
        public @Unsigned int fsn;
        public @Unsigned int fsn_uo;
        public char pd_mode;
        public char pd_mode_uo;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_stream_out")
    @NotUsableInJava
    public static class sctp_stream_out
    extends Struct {
        @InlineUnion(value=12945)
        public @InlineUnion(value=12945) @Unsigned int mid;
        @InlineUnion(value=12945)
        public @InlineUnion(value=12945) @Unsigned short ssn;
        public @Unsigned int mid_uo;
        public Ptr<sctp_stream_out_ext> ext;
        public char state;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_stream_out_ext")
    @NotUsableInJava
    public static class sctp_stream_out_ext
    extends Struct {
        public @Unsigned long @Size(value=3) [] abandoned_unsent;
        public @Unsigned long @Size(value=3) [] abandoned_sent;
        public ListDefinitions.list_head outq;
        @InlineUnion(value=13108)
        public  @InlineUnion(value=13108) AnonDefinitions.anon_member_of_anon_member_of_sctp_stream_out_ext anon3$0;
        @InlineUnion(value=13108)
        public  @InlineUnion(value=13108) AnonDefinitions.anon_member_of_anon_member_of_sctp_stream_out_ext anon3$1;
        @InlineUnion(value=13108)
        public  @InlineUnion(value=13108) AnonDefinitions.anon_member_of_anon_member_of_sctp_stream_out_ext anon3$2;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_stream_priorities")
    @NotUsableInJava
    public static class sctp_stream_priorities
    extends Struct {
        public ListDefinitions.list_head prio_sched;
        public ListDefinitions.list_head active;
        public Ptr<sctp_stream_out_ext> next;
        public @Unsigned short prio;
        public @Unsigned short users;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_inithdr_host")
    @NotUsableInJava
    public static class sctp_inithdr_host
    extends Struct {
        public @Unsigned int init_tag;
        public @Unsigned int a_rwnd;
        public @Unsigned short num_outbound_streams;
        public @Unsigned short num_inbound_streams;
        public @Unsigned int initial_tsn;
    }

    @Type(noCCodeGeneration=true, cType="enum sctp_endpoint_type")
    public static enum sctp_endpoint_type implements Enum<sctp_endpoint_type>,
    TypedEnum<sctp_endpoint_type, Integer>
    {
        SCTP_EP_TYPE_SOCKET,
        SCTP_EP_TYPE_ASSOCIATION;

    }

    @Type(noCCodeGeneration=true, cType="struct sctp_bind_addr")
    @NotUsableInJava
    public static class sctp_bind_addr
    extends Struct {
        public @Unsigned short port;
        public ListDefinitions.list_head address_list;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_inq")
    @NotUsableInJava
    public static class sctp_inq
    extends Struct {
        public ListDefinitions.list_head in_chunk_list;
        public Ptr<sctp_chunk> in_progress;
        public misc.work_struct immediate;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_packet")
    @NotUsableInJava
    public static class sctp_packet
    extends Struct {
        public @Unsigned short source_port;
        public @Unsigned short destination_port;
        public @Unsigned int vtag;
        public ListDefinitions.list_head chunk_list;
        public @Unsigned long overhead;
        public @Unsigned long size;
        public @Unsigned long max_size;
        public Ptr<sctp_transport> transport;
        public Ptr<sctp_chunk> auth;
        public char has_cookie_echo;
        public char has_sack;
        public char has_auth;
        public char has_data;
        public char ipfragok;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ep_common")
    @NotUsableInJava
    public static class sctp_ep_common
    extends Struct {
        public sctp_endpoint_type type;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public boolean dead;
        public Ptr<runtime.sock> sk;
        public Ptr<runtime.net> net;
        public sctp_inq inqueue;
        public sctp_bind_addr bind_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_datamsg")
    @NotUsableInJava
    public static class sctp_datamsg
    extends Struct {
        public ListDefinitions.list_head chunks;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned long expires_at;
        public int send_error;
        public char send_failed;
        public char can_delay;
        public char abandoned;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_transport")
    @NotUsableInJava
    public static class sctp_transport
    extends Struct {
        public ListDefinitions.list_head transports;
        public misc.rhlist_head node;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int rto_pending;
        public @Unsigned int hb_sent;
        public @Unsigned int pmtu_pending;
        public @Unsigned int dst_pending_confirm;
        public @Unsigned int sack_generation;
        public @Unsigned int dst_cookie;
        public runtime.flowi fl;
        public sctp_addr ipaddr;
        public Ptr<sctp_af> af_specific;
        public Ptr<sctp_association> asoc;
        public @Unsigned long rto;
        public @Unsigned int rtt;
        public @Unsigned int rttvar;
        public @Unsigned int srtt;
        public @Unsigned int cwnd;
        public @Unsigned int ssthresh;
        public @Unsigned int partial_bytes_acked;
        public @Unsigned int flight_size;
        public @Unsigned int burst_limited;
        public Ptr<DstDefinitions.dst_entry> dst;
        public sctp_addr saddr;
        public @Unsigned long hbinterval;
        public @Unsigned long probe_interval;
        public @Unsigned long sackdelay;
        public @Unsigned int sackfreq;
        public AtomicDefinitions.atomic_t mtu_info;
        public @OriginalName(value="ktime_t") long last_time_heard;
        public @Unsigned long last_time_sent;
        public @Unsigned long last_time_ecne_reduced;
        public @Unsigned @OriginalName(value="__be16") short encap_port;
        public @Unsigned short pathmaxrxt;
        public @Unsigned int flowlabel;
        public char dscp;
        public @Unsigned short pf_retrans;
        public @Unsigned short ps_retrans;
        public @Unsigned int pathmtu;
        public @Unsigned int param_flags;
        public int init_sent_count;
        public int state;
        public @Unsigned short error_count;
        public TimerDefinitions.timer_list T3_rtx_timer;
        public TimerDefinitions.timer_list hb_timer;
        public TimerDefinitions.timer_list proto_unreach_timer;
        public TimerDefinitions.timer_list reconf_timer;
        public TimerDefinitions.timer_list probe_timer;
        public ListDefinitions.list_head transmitted;
        public sctp_packet packet;
        public ListDefinitions.list_head send_ready;
        public misc.cacc_of_sctp_transport cacc;
        public misc.pl_of_sctp_transport pl;
        public @Unsigned long hb_nonce;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_af")
    @NotUsableInJava
    public static class sctp_af
    extends Struct {
        public Ptr<?> sctp_xmit;
        public Ptr<?> setsockopt;
        public Ptr<?> getsockopt;
        public Ptr<?> get_dst;
        public Ptr<?> get_saddr;
        public Ptr<?> copy_addrlist;
        public Ptr<?> cmp_addr;
        public Ptr<?> addr_copy;
        public Ptr<?> from_skb;
        public Ptr<?> from_sk;
        public Ptr<?> from_addr_param;
        public Ptr<?> to_addr_param;
        public Ptr<?> addr_valid;
        public Ptr<?> scope;
        public Ptr<?> inaddr_any;
        public Ptr<?> is_any;
        public Ptr<?> available;
        public Ptr<?> skb_iif;
        public Ptr<?> skb_sdif;
        public Ptr<?> is_ce;
        public Ptr<?> seq_dump_addr;
        public Ptr<?> ecn_capable;
        public @Unsigned short net_header_len;
        public int sockaddr_len;
        public Ptr<?> ip_options_len;
        public @Unsigned @OriginalName(value="sa_family_t") short sa_family;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_sender_hb_info")
    @NotUsableInJava
    public static class sctp_sender_hb_info
    extends Struct {
        public sctp_paramhdr param_hdr;
        public sctp_addr daddr;
        public @Unsigned long sent_at;
        public @Unsigned long hb_nonce;
        public @Unsigned int probe_size;
    }

    @Type(noCCodeGeneration=true, cType="union sctp_params")
    @NotUsableInJava
    public static class sctp_params
    extends Union {
        public Ptr<?> v;
        public Ptr<sctp_paramhdr> p;
        public Ptr<sctp_cookie_preserve_param> life;
        public Ptr<sctp_hostname_param> dns;
        public Ptr<sctp_cookie_param> cookie;
        public Ptr<sctp_supported_addrs_param> sat;
        public Ptr<sctp_ipv4addr_param> v4;
        public Ptr<sctp_ipv6addr_param> v6;
        public Ptr<sctp_addr_param> addr;
        public Ptr<sctp_adaptation_ind_param> aind;
        public Ptr<sctp_supported_ext_param> ext;
        public Ptr<sctp_random_param> random;
        public Ptr<sctp_chunks_param> chunks;
        public Ptr<sctp_hmac_algo_param> hmac_algo;
        public Ptr<sctp_addip_param> addip;
    }

    @Type(noCCodeGeneration=true, cType="union sctp_addr_param")
    @NotUsableInJava
    public static class sctp_addr_param
    extends Union {
        public sctp_paramhdr p;
        public sctp_ipv4addr_param v4;
        public sctp_ipv6addr_param v6;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_signed_cookie")
    @NotUsableInJava
    public static class sctp_signed_cookie
    extends Struct {
        public char @Size(value=32) [] signature;
        public @Unsigned int __pad;
        public sctp_cookie c;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_cookie")
    @NotUsableInJava
    public static class sctp_cookie
    extends Struct {
        public @Unsigned int my_vtag;
        public @Unsigned int peer_vtag;
        public @Unsigned int my_ttag;
        public @Unsigned int peer_ttag;
        public @OriginalName(value="ktime_t") long expiration;
        public @Unsigned short sinit_num_ostreams;
        public @Unsigned short sinit_max_instreams;
        public @Unsigned int initial_tsn;
        public sctp_addr peer_addr;
        public @Unsigned short my_port;
        public char prsctp_capable;
        public char padding;
        public @Unsigned int adaptation_ind;
        public char @Size(value=36) [] auth_random;
        public char @Size(value=10) [] auth_hmacs;
        public char @Size(value=20) [] auth_chunks;
        public @Unsigned int raw_addr_list_len;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_endpoint")
    @NotUsableInJava
    public static class sctp_endpoint
    extends Struct {
        public sctp_ep_common base;
        public misc.hlist_node node;
        public int hashent;
        public ListDefinitions.list_head asocs;
        public char @Size(value=32) [] secret_key;
        public Ptr<Character> digest;
        public @Unsigned int sndbuf_policy;
        public @Unsigned int rcvbuf_policy;
        public Ptr<Ptr<CryptoDefinitions.crypto_shash>> auth_hmacs;
        public Ptr<sctp_hmac_algo_param> auth_hmacs_list;
        public Ptr<sctp_chunks_param> auth_chunk_list;
        public ListDefinitions.list_head endpoint_shared_keys;
        public @Unsigned short active_key_id;
        public char ecn_enable;
        public char auth_enable;
        public char intl_enable;
        public char prsctp_enable;
        public char asconf_enable;
        public char reconf_enable;
        public char strreset_enable;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_pf")
    @NotUsableInJava
    public static class sctp_pf
    extends Struct {
        public Ptr<?> event_msgname;
        public Ptr<?> skb_msgname;
        public Ptr<?> af_supported;
        public Ptr<?> cmp_addr;
        public Ptr<?> bind_verify;
        public Ptr<?> send_verify;
        public Ptr<?> supported_addrs;
        public Ptr<?> create_accept_sk;
        public Ptr<?> addr_to_user;
        public Ptr<?> to_sk_saddr;
        public Ptr<?> to_sk_daddr;
        public Ptr<?> copy_ip_options;
        public Ptr<sctp_af> af;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_sock")
    @NotUsableInJava
    public static class sctp_sock
    extends Struct {
        public InetDefinitions.inet_sock inet;
        public sctp_socket_type type;
        public Ptr<sctp_pf> pf;
        public Ptr<CryptoDefinitions.crypto_shash> hmac;
        public String sctp_hmac_alg;
        public Ptr<sctp_endpoint> ep;
        public Ptr<sctp_bind_bucket> bind_hash;
        public @Unsigned short default_stream;
        public @Unsigned int default_ppid;
        public @Unsigned short default_flags;
        public @Unsigned int default_context;
        public @Unsigned int default_timetolive;
        public @Unsigned int default_rcv_context;
        public int max_burst;
        public @Unsigned int hbinterval;
        public @Unsigned int probe_interval;
        public @Unsigned @OriginalName(value="__be16") short udp_port;
        public @Unsigned @OriginalName(value="__be16") short encap_port;
        public @Unsigned short pathmaxrxt;
        public @Unsigned int flowlabel;
        public char dscp;
        public @Unsigned short pf_retrans;
        public @Unsigned short ps_retrans;
        public @Unsigned int pathmtu;
        public @Unsigned int sackdelay;
        public @Unsigned int sackfreq;
        public @Unsigned int param_flags;
        public @Unsigned int default_ss;
        public sctp_rtoinfo rtoinfo;
        public sctp_paddrparams paddrparam;
        public sctp_assocparams assocparams;
        public @Unsigned short subscribe;
        public sctp_initmsg initmsg;
        public int user_frag;
        public @Unsigned int autoclose;
        public @Unsigned int adaptation_ind;
        public @Unsigned int pd_point;
        public @Unsigned short nodelay;
        public @Unsigned short pf_expose;
        public @Unsigned short reuse;
        public @Unsigned short disable_fragments;
        public @Unsigned short v4mapped;
        public @Unsigned short frag_interleave;
        public @Unsigned short recvrcvinfo;
        public @Unsigned short recvnxtinfo;
        public @Unsigned short data_ready_signalled;
        public AtomicDefinitions.atomic_t pd_mode;
        public SkDefinitions.sk_buff_head pd_lobby;
        public ListDefinitions.list_head auto_asconf_list;
        public int do_auto_asconf;
    }

    @Type(noCCodeGeneration=true, cType="enum sctp_socket_type")
    public static enum sctp_socket_type implements Enum<sctp_socket_type>,
    TypedEnum<sctp_socket_type, Integer>
    {
        SCTP_SOCKET_UDP,
        SCTP_SOCKET_UDP_HIGH_BANDWIDTH,
        SCTP_SOCKET_TCP;

    }

    @Type(noCCodeGeneration=true, cType="struct sctp_bind_bucket")
    @NotUsableInJava
    public static class sctp_bind_bucket
    extends Struct {
        public @Unsigned short port;
        public byte fastreuse;
        public byte fastreuseport;
        public misc.kuid_t fastuid;
        public misc.hlist_node node;
        public misc.hlist_head owner;
        public Ptr<runtime.net> net;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_outq")
    @NotUsableInJava
    public static class sctp_outq
    extends Struct {
        public Ptr<sctp_association> asoc;
        public ListDefinitions.list_head out_chunk_list;
        public @OriginalName(value="sctp_sched_ops") Ptr<?> sched;
        public @Unsigned int out_qlen;
        public @Unsigned int error;
        public ListDefinitions.list_head control_chunk_list;
        public ListDefinitions.list_head sacked;
        public ListDefinitions.list_head retransmit;
        public ListDefinitions.list_head abandoned;
        public @Unsigned int outstanding_bytes;
        public char fast_rtx;
        public char cork;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_stream_interleave")
    @NotUsableInJava
    public static class sctp_stream_interleave
    extends Struct {
        public @Unsigned short data_chunk_len;
        public @Unsigned short ftsn_chunk_len;
        public Ptr<?> make_datafrag;
        public Ptr<?> assign_number;
        public Ptr<?> validate_data;
        public Ptr<?> ulpevent_data;
        public Ptr<?> enqueue_event;
        public Ptr<?> renege_events;
        public Ptr<?> start_pd;
        public Ptr<?> abort_pd;
        public Ptr<?> generate_ftsn;
        public Ptr<?> validate_ftsn;
        public Ptr<?> report_ftsn;
        public Ptr<?> handle_ftsn;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ulpq")
    @NotUsableInJava
    public static class sctp_ulpq
    extends Struct {
        public char pd_mode;
        public Ptr<sctp_association> asoc;
        public SkDefinitions.sk_buff_head reasm;
        public SkDefinitions.sk_buff_head reasm_uo;
        public SkDefinitions.sk_buff_head lobby;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_chunk")
    @NotUsableInJava
    public static class sctp_chunk
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public int sent_count;
        @InlineUnion(value=13067)
        public @InlineUnion(value=13067) ListDefinitions.list_head transmitted_list;
        @InlineUnion(value=13067)
        public @InlineUnion(value=13067) ListDefinitions.list_head stream_list;
        public ListDefinitions.list_head frag_list;
        public Ptr<SkDefinitions.sk_buff> skb;
        @InlineUnion(value=13068)
        public @InlineUnion(value=13068) Ptr<SkDefinitions.sk_buff> head_skb;
        @InlineUnion(value=13068)
        public @InlineUnion(value=13068) Ptr<sctp_shared_key> shkey;
        public sctp_params param_hdr;
        public misc.subh_of_sctp_chunk subh;
        public Ptr<Character> chunk_end;
        public Ptr<sctp_chunkhdr> chunk_hdr;
        public Ptr<sctphdr> sctp_hdr;
        public sctp_sndrcvinfo sinfo;
        public Ptr<sctp_association> asoc;
        public Ptr<sctp_ep_common> rcvr;
        public @Unsigned long sent_at;
        public sctp_addr source;
        public sctp_addr dest;
        public Ptr<sctp_datamsg> msg;
        public Ptr<sctp_transport> transport;
        public Ptr<SkDefinitions.sk_buff> auth_chunk;
        public @Unsigned short rtt_in_progress;
        public @Unsigned short has_tsn;
        public @Unsigned short has_ssn;
        public @Unsigned short singleton;
        public @Unsigned short end_of_packet;
        public @Unsigned short ecn_ce_done;
        public @Unsigned short pdiscard;
        public @Unsigned short tsn_gap_acked;
        public @Unsigned short data_accepted;
        public @Unsigned short auth;
        public @Unsigned short has_asconf;
        public @Unsigned short pmtu_probe;
        public @Unsigned short tsn_missing_report;
        public @Unsigned short fast_retransmit;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ulpevent")
    @NotUsableInJava
    public static class sctp_ulpevent
    extends Struct {
        public Ptr<sctp_association> asoc;
        public Ptr<sctp_chunk> chunk;
        public @Unsigned int rmem_len;
        @InlineUnion(value=12945)
        public @InlineUnion(value=12945) @Unsigned int mid;
        @InlineUnion(value=12945)
        public @InlineUnion(value=12945) @Unsigned short ssn;
        @InlineUnion(value=12946)
        public @InlineUnion(value=12946) @Unsigned int ppid;
        @InlineUnion(value=12946)
        public @InlineUnion(value=12946) @Unsigned int fsn;
        public @Unsigned int tsn;
        public @Unsigned int cumtsn;
        public @Unsigned short stream;
        public @Unsigned short flags;
        public @Unsigned short msg_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_tsnmap")
    @NotUsableInJava
    public static class sctp_tsnmap
    extends Struct {
        public Ptr<@Unsigned Long> tsn_map;
        public @Unsigned int base_tsn;
        public @Unsigned int cumulative_tsn_ack_point;
        public @Unsigned int max_tsn_seen;
        public @Unsigned short len;
        public @Unsigned short pending_data;
        public @Unsigned short num_dup_tsns;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=16) [] dup_tsns;
    }

    @Type(noCCodeGeneration=true, cType="enum sctp_scope")
    public static enum sctp_scope implements Enum<sctp_scope>,
    TypedEnum<sctp_scope, Integer>
    {
        SCTP_SCOPE_GLOBAL,
        SCTP_SCOPE_PRIVATE,
        SCTP_SCOPE_LINK,
        SCTP_SCOPE_LOOPBACK,
        SCTP_SCOPE_UNUSABLE;

    }

    @Type(noCCodeGeneration=true, cType="enum sctp_state")
    public static enum sctp_state implements Enum<sctp_state>,
    TypedEnum<sctp_state, Integer>
    {
        SCTP_STATE_CLOSED,
        SCTP_STATE_COOKIE_WAIT,
        SCTP_STATE_COOKIE_ECHOED,
        SCTP_STATE_ESTABLISHED,
        SCTP_STATE_SHUTDOWN_PENDING,
        SCTP_STATE_SHUTDOWN_SENT,
        SCTP_STATE_SHUTDOWN_RECEIVED,
        SCTP_STATE_SHUTDOWN_ACK_SENT;

    }

    @Type(noCCodeGeneration=true, cType="union sctp_addr")
    @NotUsableInJava
    public static class sctp_addr
    extends Union {
        public misc.sockaddr_in v4;
        public misc.sockaddr_in6 v6;
        public runtime.sockaddr sa;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_shared_key")
    @NotUsableInJava
    public static class sctp_shared_key
    extends Struct {
        public ListDefinitions.list_head key_list;
        public Ptr<sctp_auth_bytes> key;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned short key_id;
        public char deactivated;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_auth_bytes")
    @NotUsableInJava
    public static class sctp_auth_bytes
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_authhdr")
    @NotUsableInJava
    public static class sctp_authhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short shkey_id;
        public @Unsigned @OriginalName(value="__be16") short hmac_id;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_addiphdr")
    @NotUsableInJava
    public static class sctp_addiphdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int serial;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_addip_param")
    @NotUsableInJava
    public static class sctp_addip_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public @Unsigned @OriginalName(value="__be32") int crr_id;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ifwdtsn_hdr")
    @NotUsableInJava
    public static class sctp_ifwdtsn_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int new_cum_tsn;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_fwdtsn_hdr")
    @NotUsableInJava
    public static class sctp_fwdtsn_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int new_cum_tsn;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_cwrhdr")
    @NotUsableInJava
    public static class sctp_cwrhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int lowest_tsn;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ecnehdr")
    @NotUsableInJava
    public static class sctp_ecnehdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int lowest_tsn;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_errhdr")
    @NotUsableInJava
    public static class sctp_errhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short cause;
        public @Unsigned @OriginalName(value="__be16") short length;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_shutdownhdr")
    @NotUsableInJava
    public static class sctp_shutdownhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int cum_tsn_ack;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_heartbeathdr")
    @NotUsableInJava
    public static class sctp_heartbeathdr
    extends Struct {
        public sctp_paramhdr info;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_sackhdr")
    @NotUsableInJava
    public static class sctp_sackhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int cum_tsn_ack;
        public @Unsigned @OriginalName(value="__be32") int a_rwnd;
        public @Unsigned @OriginalName(value="__be16") short num_gap_ack_blocks;
        public @Unsigned @OriginalName(value="__be16") short num_dup_tsns;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_cookie_param")
    @NotUsableInJava
    public static class sctp_cookie_param
    extends Struct {
        public sctp_paramhdr p;
        public char @Size(value=0) [] body;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_hmac_algo_param")
    @NotUsableInJava
    public static class sctp_hmac_algo_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public @Unsigned @OriginalName(value="__be16") short @Size(value=0) [] hmac_ids;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_chunks_param")
    @NotUsableInJava
    public static class sctp_chunks_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public char @Size(value=0) [] chunks;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_random_param")
    @NotUsableInJava
    public static class sctp_random_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public char @Size(value=0) [] random_val;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_supported_ext_param")
    @NotUsableInJava
    public static class sctp_supported_ext_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public char @Size(value=0) [] chunks;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_adaptation_ind_param")
    @NotUsableInJava
    public static class sctp_adaptation_ind_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public @Unsigned @OriginalName(value="__be32") int adaptation_ind;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_supported_addrs_param")
    @NotUsableInJava
    public static class sctp_supported_addrs_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public @Unsigned @OriginalName(value="__be16") short @Size(value=0) [] types;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_hostname_param")
    @NotUsableInJava
    public static class sctp_hostname_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public @OriginalName(value="uint8_t") char @Size(value=0) [] hostname;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_cookie_preserve_param")
    @NotUsableInJava
    public static class sctp_cookie_preserve_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public @Unsigned @OriginalName(value="__be32") int lifespan_increment;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ipv6addr_param")
    @NotUsableInJava
    public static class sctp_ipv6addr_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public In6Definitions.in6_addr addr;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_ipv4addr_param")
    @NotUsableInJava
    public static class sctp_ipv4addr_param
    extends Struct {
        public sctp_paramhdr param_hdr;
        public InDefinitions.in_addr addr;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_inithdr")
    @NotUsableInJava
    public static class sctp_inithdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int init_tag;
        public @Unsigned @OriginalName(value="__be32") int a_rwnd;
        public @Unsigned @OriginalName(value="__be16") short num_outbound_streams;
        public @Unsigned @OriginalName(value="__be16") short num_inbound_streams;
        public @Unsigned @OriginalName(value="__be32") int initial_tsn;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_idatahdr")
    @NotUsableInJava
    public static class sctp_idatahdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int tsn;
        public @Unsigned @OriginalName(value="__be16") short stream;
        public @Unsigned @OriginalName(value="__be16") short reserved;
        public @Unsigned @OriginalName(value="__be32") int mid;
        @InlineUnion(value=12910)
        public @InlineUnion(value=12910) @Unsigned int ppid;
        @InlineUnion(value=12910)
        public @InlineUnion(value=12910) @Unsigned @OriginalName(value="__be32") int fsn;
        public char @Size(value=0) [] payload;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_datahdr")
    @NotUsableInJava
    public static class sctp_datahdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int tsn;
        public @Unsigned @OriginalName(value="__be16") short stream;
        public @Unsigned @OriginalName(value="__be16") short ssn;
        public @Unsigned int ppid;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_paramhdr")
    @NotUsableInJava
    public static class sctp_paramhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short type;
        public @Unsigned @OriginalName(value="__be16") short length;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_chunkhdr")
    @NotUsableInJava
    public static class sctp_chunkhdr
    extends Struct {
        public char type;
        public char flags;
        public @Unsigned @OriginalName(value="__be16") short length;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_paddrparams")
    @NotUsableInJava
    public static class sctp_paddrparams
    extends Struct {
        public @OriginalName(value="sctp_assoc_t") int spp_assoc_id;
        public KernelDefinitions.__kernel_sockaddr_storage spp_address;
        public @Unsigned int spp_hbinterval;
        public @Unsigned short spp_pathmaxrxt;
        public @Unsigned int spp_pathmtu;
        public @Unsigned int spp_sackdelay;
        public @Unsigned int spp_flags;
        public @Unsigned int spp_ipv6_flowlabel;
        public char spp_dscp;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_assocparams")
    @NotUsableInJava
    public static class sctp_assocparams
    extends Struct {
        public @OriginalName(value="sctp_assoc_t") int sasoc_assoc_id;
        public @Unsigned short sasoc_asocmaxrxt;
        public @Unsigned short sasoc_number_peer_destinations;
        public @Unsigned int sasoc_peer_rwnd;
        public @Unsigned int sasoc_local_rwnd;
        public @Unsigned int sasoc_cookie_life;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_rtoinfo")
    @NotUsableInJava
    public static class sctp_rtoinfo
    extends Struct {
        public @OriginalName(value="sctp_assoc_t") int srto_assoc_id;
        public @Unsigned int srto_initial;
        public @Unsigned int srto_max;
        public @Unsigned int srto_min;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_sndrcvinfo")
    @NotUsableInJava
    public static class sctp_sndrcvinfo
    extends Struct {
        public @Unsigned short sinfo_stream;
        public @Unsigned short sinfo_ssn;
        public @Unsigned short sinfo_flags;
        public @Unsigned int sinfo_ppid;
        public @Unsigned int sinfo_context;
        public @Unsigned int sinfo_timetolive;
        public @Unsigned int sinfo_tsn;
        public @Unsigned int sinfo_cumtsn;
        public @OriginalName(value="sctp_assoc_t") int sinfo_assoc_id;
    }

    @Type(noCCodeGeneration=true, cType="struct sctp_initmsg")
    @NotUsableInJava
    public static class sctp_initmsg
    extends Struct {
        public @Unsigned short sinit_num_ostreams;
        public @Unsigned short sinit_max_instreams;
        public @Unsigned short sinit_max_attempts;
        public @Unsigned short sinit_max_init_timeo;
    }

    @Type(noCCodeGeneration=true, cType="enum sctp_assoc_state_of_sk_security_struct")
    public static enum sctp_assoc_state_of_sk_security_struct implements Enum<sctp_assoc_state_of_sk_security_struct>,
    TypedEnum<sctp_assoc_state_of_sk_security_struct, Integer>
    {
        SCTP_ASSOC_UNSET,
        SCTP_ASSOC_SET;

    }

    @Type(noCCodeGeneration=true, cType="struct sctp_association")
    @NotUsableInJava
    public static class sctp_association
    extends Struct {
        public sctp_ep_common base;
        public ListDefinitions.list_head asocs;
        public @OriginalName(value="sctp_assoc_t") int assoc_id;
        public Ptr<sctp_endpoint> ep;
        public sctp_cookie c;
        public misc.peer_of_sctp_association peer;
        public sctp_state state;
        public int overall_error_count;
        public @OriginalName(value="ktime_t") long cookie_life;
        public @Unsigned long rto_initial;
        public @Unsigned long rto_max;
        public @Unsigned long rto_min;
        public int max_burst;
        public int max_retrans;
        public @Unsigned short pf_retrans;
        public @Unsigned short ps_retrans;
        public @Unsigned short max_init_attempts;
        public @Unsigned short init_retries;
        public @Unsigned long max_init_timeo;
        public @Unsigned long hbinterval;
        public @Unsigned long probe_interval;
        public @Unsigned @OriginalName(value="__be16") short encap_port;
        public @Unsigned short pathmaxrxt;
        public @Unsigned int flowlabel;
        public char dscp;
        public char pmtu_pending;
        public @Unsigned int pathmtu;
        public @Unsigned int param_flags;
        public @Unsigned int sackfreq;
        public @Unsigned long sackdelay;
        public @Unsigned long @Size(value=12) [] timeouts;
        public TimerDefinitions.timer_list @Size(value=12) [] timers;
        public Ptr<sctp_transport> shutdown_last_sent_to;
        public Ptr<sctp_transport> init_last_sent_to;
        public int shutdown_retries;
        public @Unsigned int next_tsn;
        public @Unsigned int ctsn_ack_point;
        public @Unsigned int adv_peer_ack_point;
        public @Unsigned int highest_sacked;
        public @Unsigned int fast_recovery_exit;
        public char fast_recovery;
        public @Unsigned short unack_data;
        public @Unsigned int rtx_data_chunks;
        public @Unsigned int rwnd;
        public @Unsigned int a_rwnd;
        public @Unsigned int rwnd_over;
        public @Unsigned int rwnd_press;
        public int sndbuf_used;
        public AtomicDefinitions.atomic_t rmem_alloc;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public @Unsigned int frag_point;
        public @Unsigned int user_frag;
        public int init_err_counter;
        public int init_cycle;
        public @Unsigned short default_stream;
        public @Unsigned short default_flags;
        public @Unsigned int default_ppid;
        public @Unsigned int default_context;
        public @Unsigned int default_timetolive;
        public @Unsigned int default_rcv_context;
        public sctp_stream stream;
        public sctp_outq outqueue;
        public sctp_ulpq ulpq;
        public @Unsigned int last_ecne_tsn;
        public @Unsigned int last_cwr_tsn;
        public int numduptsns;
        public Ptr<sctp_chunk> addip_last_asconf;
        public ListDefinitions.list_head asconf_ack_list;
        public ListDefinitions.list_head addip_chunk_list;
        public @Unsigned int addip_serial;
        public int src_out_of_asoc_ok;
        public Ptr<sctp_addr> asconf_addr_del_pending;
        public Ptr<sctp_transport> new_transport;
        public ListDefinitions.list_head endpoint_shared_keys;
        public Ptr<sctp_auth_bytes> asoc_shared_key;
        public Ptr<sctp_shared_key> shkey;
        public @Unsigned short default_hmac_id;
        public @Unsigned short active_key_id;
        public char need_ecne;
        public char temp;
        public char pf_expose;
        public char force_delay;
        public char strreset_enable;
        public char strreset_outstanding;
        public @Unsigned int strreset_outseq;
        public @Unsigned int strreset_inseq;
        public @Unsigned int @Size(value=2) [] strreset_result;
        public Ptr<sctp_chunk> strreset_chunk;
        public sctp_priv_assoc_stats stats;
        public int sent_cnt_removable;
        public @Unsigned short subscribe;
        public @Unsigned long @Size(value=3) [] abandoned_unsent;
        public @Unsigned long @Size(value=3) [] abandoned_sent;
        public @Unsigned int secid;
        public @Unsigned int peer_secid;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum sctp_conntrack")
    public static enum sctp_conntrack implements Enum<sctp_conntrack>,
    TypedEnum<sctp_conntrack, Integer>
    {
        SCTP_CONNTRACK_NONE,
        SCTP_CONNTRACK_CLOSED,
        SCTP_CONNTRACK_COOKIE_WAIT,
        SCTP_CONNTRACK_COOKIE_ECHOED,
        SCTP_CONNTRACK_ESTABLISHED,
        SCTP_CONNTRACK_SHUTDOWN_SENT,
        SCTP_CONNTRACK_SHUTDOWN_RECD,
        SCTP_CONNTRACK_SHUTDOWN_ACK_SENT,
        SCTP_CONNTRACK_HEARTBEAT_SENT,
        SCTP_CONNTRACK_HEARTBEAT_ACKED,
        SCTP_CONNTRACK_MAX;

    }
}

