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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.StatDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SvcDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RpcDefinitions {

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int report_key_length; u8 reserved1; u8 reserved2; u8 ucca; u8 vra; u8 type_code; u8 region_mask; u8 rpc_scheme; u8 reserved3; }")
    @NotUsableInJava
    public static class rpc_state_t
    extends Struct {
        public @Unsigned short report_key_length;
        public char reserved1;
        public char reserved2;
        public char ucca;
        public char vra;
        public char type_code;
        public char region_mask;
        public char rpc_scheme;
        public char reserved3;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_version")
    @NotUsableInJava
    public static class rpc_version
    extends Struct {
        public @Unsigned int number;
        public @Unsigned int nrprocs;
        public Ptr<rpc_procinfo> procs;
        public Ptr<@Unsigned Integer> counts;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_sysfs_client")
    @NotUsableInJava
    public static class rpc_sysfs_client
    extends Struct {
        public runtime.kobject kobject;
        public Ptr<runtime.net> net;
        public Ptr<rpc_clnt> clnt;
        public Ptr<rpc_xprt_switch> xprt_switch;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_xprt_iter")
    @NotUsableInJava
    public static class rpc_xprt_iter
    extends Struct {
        public Ptr<rpc_xprt_switch> xpi_xpswitch;
        public Ptr<rpc_xprt> xpi_cursor;
        public Ptr<rpc_xprt_iter_ops> xpi_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_xprt_iter_ops")
    @NotUsableInJava
    public static class rpc_xprt_iter_ops
    extends Struct {
        public Ptr<?> xpi_rewind;
        public Ptr<?> xpi_xprt;
        public Ptr<?> xpi_next;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_pipe_dir_head")
    @NotUsableInJava
    public static class rpc_pipe_dir_head
    extends Struct {
        public ListDefinitions.list_head pdh_entries;
        public Ptr<runtime.dentry> pdh_dentry;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_rtt")
    @NotUsableInJava
    public static class rpc_rtt
    extends Struct {
        public @Unsigned long timeo;
        public @Unsigned long @Size(value=5) [] srtt;
        public @Unsigned long @Size(value=5) [] sdrtt;
        public int @Size(value=5) [] ntimeouts;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_program")
    @NotUsableInJava
    public static class rpc_program
    extends Struct {
        public String name;
        public @Unsigned int number;
        public @Unsigned int nrvers;
        public Ptr<Ptr<rpc_version>> version;
        public Ptr<rpc_stat> stats;
        public String pipe_dir_name;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_stat")
    @NotUsableInJava
    public static class rpc_stat
    extends Struct {
        public Ptr<rpc_program> program;
        public @Unsigned int netcnt;
        public @Unsigned int netudpcnt;
        public @Unsigned int nettcpcnt;
        public @Unsigned int nettcpconn;
        public @Unsigned int netreconn;
        public @Unsigned int rpccnt;
        public @Unsigned int rpcretrans;
        public @Unsigned int rpcauthrefresh;
        public @Unsigned int rpcgarbage;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_xprt_switch")
    @NotUsableInJava
    public static class rpc_xprt_switch
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock xps_lock;
        public runtime.kref xps_kref;
        public @Unsigned int xps_id;
        public @Unsigned int xps_nxprts;
        public @Unsigned int xps_nactive;
        public @Unsigned int xps_nunique_destaddr_xprts;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t xps_queuelen;
        public ListDefinitions.list_head xps_xprt_list;
        public Ptr<runtime.net> xps_net;
        public Ptr<rpc_xprt_iter_ops> xps_iter_ops;
        public @OriginalName(value="rpc_sysfs_xprt_switch") Ptr<?> xps_sysfs;
        public misc.callback_head xps_rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_xprt_ops")
    @NotUsableInJava
    public static class rpc_xprt_ops
    extends Struct {
        public Ptr<?> set_buffer_size;
        public Ptr<?> reserve_xprt;
        public Ptr<?> release_xprt;
        public Ptr<?> alloc_slot;
        public Ptr<?> free_slot;
        public Ptr<?> rpcbind;
        public Ptr<?> set_port;
        public Ptr<?> connect;
        public Ptr<?> get_srcaddr;
        public Ptr<?> get_srcport;
        public Ptr<?> buf_alloc;
        public Ptr<?> buf_free;
        public Ptr<?> prepare_request;
        public Ptr<?> send_request;
        public Ptr<?> abort_send_request;
        public Ptr<?> wait_for_reply_request;
        public Ptr<?> timer;
        public Ptr<?> release_request;
        public Ptr<?> close;
        public Ptr<?> destroy;
        public Ptr<?> set_connect_timeout;
        public Ptr<?> print_stats;
        public Ptr<?> enable_swap;
        public Ptr<?> disable_swap;
        public Ptr<?> inject_disconnect;
        public Ptr<?> bc_setup;
        public Ptr<?> bc_maxpayload;
        public Ptr<?> bc_num_slots;
        public Ptr<?> bc_free_rqst;
        public Ptr<?> bc_destroy;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_auth_create_args")
    @NotUsableInJava
    public static class rpc_auth_create_args
    extends Struct {
        public @Unsigned @OriginalName(value="rpc_authflavor_t") int pseudoflavor;
        public String target_name;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_authops")
    @NotUsableInJava
    public static class rpc_authops
    extends Struct {
        public Ptr<runtime.module> owner;
        public @Unsigned @OriginalName(value="rpc_authflavor_t") int au_flavor;
        public String au_name;
        public Ptr<?> create;
        public Ptr<?> destroy;
        public Ptr<?> hash_cred;
        public Ptr<?> lookup_cred;
        public Ptr<?> crcreate;
        public Ptr<?> info2flavor;
        public Ptr<?> flavor2info;
        public Ptr<?> key_timeout;
        public Ptr<?> ping;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_credops")
    @NotUsableInJava
    public static class rpc_credops
    extends Struct {
        public String cr_name;
        public Ptr<?> cr_init;
        public Ptr<?> crdestroy;
        public Ptr<?> crmatch;
        public Ptr<?> crmarshal;
        public Ptr<?> crrefresh;
        public Ptr<?> crvalidate;
        public Ptr<?> crwrap_req;
        public Ptr<?> crunwrap_resp;
        public Ptr<?> crkey_timeout;
        public Ptr<?> crstringify_acceptor;
        public Ptr<?> crneed_reencode;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_auth")
    @NotUsableInJava
    public static class rpc_auth
    extends Struct {
        public @Unsigned int au_cslack;
        public @Unsigned int au_rslack;
        public @Unsigned int au_verfsize;
        public @Unsigned int au_ralign;
        public @Unsigned long au_flags;
        public Ptr<rpc_authops> au_ops;
        public @Unsigned @OriginalName(value="rpc_authflavor_t") int au_flavor;
        public @OriginalName(value="refcount_t") misc.refcount_struct au_count;
        public @OriginalName(value="rpc_cred_cache") Ptr<?> au_credcache;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_timer")
    @NotUsableInJava
    public static class rpc_timer
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long expires;
        public DelayedDefinitions.delayed_work dwork;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_cred")
    @NotUsableInJava
    public static class rpc_cred
    extends Struct {
        public misc.hlist_node cr_hash;
        public ListDefinitions.list_head cr_lru;
        public misc.callback_head cr_rcu;
        public Ptr<rpc_auth> cr_auth;
        public Ptr<rpc_credops> cr_ops;
        public @Unsigned long cr_expire;
        public @Unsigned long cr_flags;
        public @OriginalName(value="refcount_t") misc.refcount_struct cr_count;
        public Ptr<runtime.cred> cr_cred;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_xprt")
    @NotUsableInJava
    public static class rpc_xprt
    extends Struct {
        public runtime.kref kref;
        public Ptr<rpc_xprt_ops> ops;
        public @Unsigned int id;
        public Ptr<rpc_timeout> timeout;
        public KernelDefinitions.__kernel_sockaddr_storage addr;
        public @Unsigned long addrlen;
        public int prot;
        public @Unsigned long cong;
        public @Unsigned long cwnd;
        public @Unsigned long max_payload;
        public rpc_wait_queue binding;
        public rpc_wait_queue sending;
        public rpc_wait_queue pending;
        public rpc_wait_queue backlog;
        public ListDefinitions.list_head free;
        public @Unsigned int max_reqs;
        public @Unsigned int min_reqs;
        public @Unsigned int num_reqs;
        public @Unsigned long state;
        public char resvport;
        public char reuseport;
        public AtomicDefinitions.atomic_t swapper;
        public @Unsigned int bind_index;
        public ListDefinitions.list_head xprt_switch;
        public @Unsigned long bind_timeout;
        public @Unsigned long reestablish_timeout;
        public misc.xprtsec_parms xprtsec;
        public @Unsigned int connect_cookie;
        public misc.work_struct task_cleanup;
        public TimerDefinitions.timer_list timer;
        public @Unsigned long last_used;
        public @Unsigned long idle_timeout;
        public @Unsigned long connect_timeout;
        public @Unsigned long max_reconnect_timeout;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t queuelen;
        public  @OriginalName(value="spinlock_t") runtime.spinlock transport_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock reserve_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock queue_lock;
        public @Unsigned int xid;
        public Ptr<rpc_task> snd_task;
        public ListDefinitions.list_head xmit_queue;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t xmit_queuelen;
        public @OriginalName(value="svc_xprt") Ptr<?> bc_xprt;
        public Ptr<SvcDefinitions.svc_serv> bc_serv;
        public @Unsigned int bc_alloc_max;
        public @Unsigned int bc_alloc_count;
        public AtomicDefinitions.atomic_t bc_slot_count;
        public  @OriginalName(value="spinlock_t") runtime.spinlock bc_pa_lock;
        public ListDefinitions.list_head bc_pa_list;
        public RbDefinitions.rb_root recv_queue;
        public StatDefinitions.stat_of_rpc_xprt stat;
        public Ptr<runtime.net> xprt_net;
        public @OriginalName(value="netns_tracker") misc.lockdep_map_p ns_tracker;
        public String servername;
        public String @Size(value=6) [] address_strings;
        public Ptr<runtime.dentry> debugfs;
        public misc.callback_head rcu;
        public Ptr<misc.xprt_class> xprt_class;
        public @OriginalName(value="rpc_sysfs_xprt") Ptr<?> xprt_sysfs;
        public boolean main;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_clnt")
    @NotUsableInJava
    public static class rpc_clnt
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct cl_count;
        public @Unsigned int cl_clid;
        public ListDefinitions.list_head cl_clients;
        public ListDefinitions.list_head cl_tasks;
        public AtomicDefinitions.atomic_t cl_pid;
        public  @OriginalName(value="spinlock_t") runtime.spinlock cl_lock;
        public Ptr<rpc_xprt> cl_xprt;
        public Ptr<rpc_procinfo> cl_procinfo;
        public @Unsigned int cl_prog;
        public @Unsigned int cl_vers;
        public @Unsigned int cl_maxproc;
        public Ptr<rpc_auth> cl_auth;
        public Ptr<rpc_stat> cl_stats;
        public @OriginalName(value="rpc_iostats") Ptr<?> cl_metrics;
        public @Unsigned int cl_softrtry;
        public @Unsigned int cl_softerr;
        public @Unsigned int cl_discrtry;
        public @Unsigned int cl_noretranstimeo;
        public @Unsigned int cl_autobind;
        public @Unsigned int cl_chatty;
        public @Unsigned int cl_shutdown;
        public misc.xprtsec_parms cl_xprtsec;
        public Ptr<rpc_rtt> cl_rtt;
        public Ptr<rpc_timeout> cl_timeout;
        public AtomicDefinitions.atomic_t cl_swapper;
        public int cl_nodelen;
        public char @Size(value=65) [] cl_nodename;
        public rpc_pipe_dir_head cl_pipedir_objects;
        public Ptr<rpc_clnt> cl_parent;
        public rpc_rtt cl_rtt_default;
        public rpc_timeout cl_timeout_default;
        public Ptr<rpc_program> cl_program;
        public String cl_principal;
        public Ptr<runtime.dentry> cl_debugfs;
        public Ptr<rpc_sysfs_client> cl_sysfs;
        @InlineUnion(value=10661)
        public @InlineUnion(value=10661) rpc_xprt_iter cl_xpi;
        @InlineUnion(value=10661)
        public @InlineUnion(value=10661) misc.work_struct cl_work;
        public Ptr<runtime.cred> cl_cred;
        public @Unsigned int cl_max_connect;
        public Ptr<SuperDefinitions.super_block> pipefs_sb;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_call_ops")
    @NotUsableInJava
    public static class rpc_call_ops
    extends Struct {
        public Ptr<?> rpc_call_prepare;
        public Ptr<?> rpc_call_done;
        public Ptr<?> rpc_count_stats;
        public Ptr<?> rpc_release;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_wait_queue")
    @NotUsableInJava
    public static class rpc_wait_queue
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head @Size(value=4) [] tasks;
        public char maxpriority;
        public char priority;
        public char nr;
        public @Unsigned int qlen;
        public rpc_timer timer_list;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_task")
    @NotUsableInJava
    public static class rpc_task
    extends Struct {
        public AtomicDefinitions.atomic_t tk_count;
        public int tk_status;
        public ListDefinitions.list_head tk_task;
        public Ptr<?> tk_callback;
        public Ptr<?> tk_action;
        public @Unsigned long tk_timeout;
        public @Unsigned long tk_runstate;
        public Ptr<rpc_wait_queue> tk_waitqueue;
        public UDefinitions.u_of_rpc_task u;
        public rpc_message tk_msg;
        public Ptr<?> tk_calldata;
        public Ptr<rpc_call_ops> tk_ops;
        public Ptr<rpc_clnt> tk_client;
        public Ptr<rpc_xprt> tk_xprt;
        public Ptr<rpc_cred> tk_op_cred;
        public Ptr<rpc_rqst> tk_rqstp;
        public Ptr<WorkqueueDefinitions.workqueue_struct> tk_workqueue;
        public @OriginalName(value="ktime_t") long tk_start;
        public @OriginalName(value="pid_t") int tk_owner;
        public int tk_rpc_status;
        public @Unsigned short tk_flags;
        public @Unsigned short tk_timeouts;
        public @Unsigned short tk_pid;
        public char tk_priority;
        public char tk_garb_retry;
        public char tk_cred_retry;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_timeout")
    @NotUsableInJava
    public static class rpc_timeout
    extends Struct {
        public @Unsigned long to_initval;
        public @Unsigned long to_maxval;
        public @Unsigned long to_increment;
        public @Unsigned int to_retries;
        public char to_exponential;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_wait")
    @NotUsableInJava
    public static class rpc_wait
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head links;
        public ListDefinitions.list_head timer_list;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_procinfo")
    @NotUsableInJava
    public static class rpc_procinfo
    extends Struct {
        public @Unsigned int p_proc;
        public @OriginalName(value="kxdreproc_t") Ptr<?> p_encode;
        public @OriginalName(value="kxdrdproc_t") Ptr<?> p_decode;
        public @Unsigned int p_arglen;
        public @Unsigned int p_replen;
        public @Unsigned int p_timer;
        public @Unsigned int p_statidx;
        public String p_name;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_message")
    @NotUsableInJava
    public static class rpc_message
    extends Struct {
        public Ptr<rpc_procinfo> rpc_proc;
        public Ptr<?> rpc_argp;
        public Ptr<?> rpc_resp;
        public Ptr<runtime.cred> rpc_cred;
    }

    @Type(noCCodeGeneration=true, cType="struct rpc_rqst")
    @NotUsableInJava
    public static class rpc_rqst
    extends Struct {
        public Ptr<rpc_xprt> rq_xprt;
        public misc.xdr_buf rq_snd_buf;
        public misc.xdr_buf rq_rcv_buf;
        public Ptr<rpc_task> rq_task;
        public Ptr<rpc_cred> rq_cred;
        public @Unsigned @OriginalName(value="__be32") int rq_xid;
        public int rq_cong;
        public @Unsigned int rq_seqno;
        public int rq_enc_pages_num;
        public Ptr<Ptr<runtime.page>> rq_enc_pages;
        public Ptr<?> rq_release_snd_buf;
        @InlineUnion(value=10580)
        public @InlineUnion(value=10580) ListDefinitions.list_head rq_list;
        @InlineUnion(value=10580)
        public  @InlineUnion(value=10580) RbDefinitions.rb_node rq_recv;
        public ListDefinitions.list_head rq_xmit;
        public ListDefinitions.list_head rq_xmit2;
        public Ptr<?> rq_buffer;
        public @Unsigned long rq_callsize;
        public Ptr<?> rq_rbuffer;
        public @Unsigned long rq_rcvsize;
        public @Unsigned long rq_xmit_bytes_sent;
        public @Unsigned long rq_reply_bytes_recvd;
        public misc.xdr_buf rq_private_buf;
        public @Unsigned long rq_majortimeo;
        public @Unsigned long rq_minortimeo;
        public @Unsigned long rq_timeout;
        public @OriginalName(value="ktime_t") long rq_rtt;
        public @Unsigned int rq_retries;
        public @Unsigned int rq_connect_cookie;
        public AtomicDefinitions.atomic_t rq_pin;
        public @Unsigned int rq_bytes_sent;
        public @OriginalName(value="ktime_t") long rq_xtime;
        public int rq_ntrans;
        public misc.lwq_node rq_bc_list;
        public @Unsigned long rq_bc_pa_state;
        public ListDefinitions.list_head rq_bc_pa_list;
    }

    @Type(noCCodeGeneration=true, cType="enum rpc_display_format_t")
    public static enum rpc_display_format_t implements Enum<rpc_display_format_t>,
    TypedEnum<rpc_display_format_t, Integer>
    {
        RPC_DISPLAY_ADDR,
        RPC_DISPLAY_PORT,
        RPC_DISPLAY_PROTO,
        RPC_DISPLAY_HEX_ADDR,
        RPC_DISPLAY_HEX_PORT,
        RPC_DISPLAY_NETID,
        RPC_DISPLAY_MAX;

    }
}

