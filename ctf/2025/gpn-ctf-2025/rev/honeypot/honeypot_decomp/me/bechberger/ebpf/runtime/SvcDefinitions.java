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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SvcDefinitions {

    @Type(noCCodeGeneration=true, cType="struct svc_version")
    @NotUsableInJava
    public static class svc_version
    extends Struct {
        public @Unsigned int vs_vers;
        public @Unsigned int vs_nproc;
        public Ptr<svc_procedure> vs_proc;
        public Ptr<@Unsigned Long> vs_count;
        public @Unsigned int vs_xdrsize;
        public boolean vs_hidden;
        public boolean vs_rpcb_optnl;
        public boolean vs_need_cong_ctrl;
        public Ptr<?> vs_dispatch;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_process_info")
    @NotUsableInJava
    public static class svc_process_info
    extends Struct {
        @InlineUnion(value=10981)
        public @InlineUnion(value=10981) Ptr<?> dispatch;
        @InlineUnion(value=10981)
        public @InlineUnion(value=10981) misc.mismatch_of_anon_member_of_svc_process_info mismatch;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_deferred_req")
    @NotUsableInJava
    public static class svc_deferred_req
    extends Struct {
        public @Unsigned int prot;
        public @OriginalName(value="svc_xprt") Ptr<?> xprt;
        public KernelDefinitions.__kernel_sockaddr_storage addr;
        public @Unsigned long addrlen;
        public KernelDefinitions.__kernel_sockaddr_storage daddr;
        public @Unsigned long daddrlen;
        public Ptr<?> xprt_ctxt;
        public CacheDefinitions.cache_deferred_req handle;
        public int argslen;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=0) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_procedure")
    @NotUsableInJava
    public static class svc_procedure
    extends Struct {
        public Ptr<?> pc_func;
        public Ptr<?> pc_decode;
        public Ptr<?> pc_encode;
        public Ptr<?> pc_release;
        public @Unsigned int pc_argsize;
        public @Unsigned int pc_argzero;
        public @Unsigned int pc_ressize;
        public @Unsigned int pc_cachetype;
        public @Unsigned int pc_xdrressize;
        public String pc_name;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_pool")
    @NotUsableInJava
    public static class svc_pool
    extends Struct {
        public @Unsigned int sp_id;
        public runtime.lwq sp_xprts;
        public @Unsigned int sp_nrthreads;
        public ListDefinitions.list_head sp_all_threads;
        public misc.llist_head sp_idle_threads;
        public PercpuDefinitions.percpu_counter sp_messages_arrived;
        public PercpuDefinitions.percpu_counter sp_sockets_queued;
        public PercpuDefinitions.percpu_counter sp_threads_woken;
        public @Unsigned long sp_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_rqst")
    @NotUsableInJava
    public static class svc_rqst
    extends Struct {
        public ListDefinitions.list_head rq_all;
        public misc.llist_node rq_idle;
        public misc.callback_head rq_rcu_head;
        public @OriginalName(value="svc_xprt") Ptr<?> rq_xprt;
        public KernelDefinitions.__kernel_sockaddr_storage rq_addr;
        public @Unsigned long rq_addrlen;
        public KernelDefinitions.__kernel_sockaddr_storage rq_daddr;
        public @Unsigned long rq_daddrlen;
        public Ptr<svc_serv> rq_server;
        public Ptr<svc_pool> rq_pool;
        public Ptr<svc_procedure> rq_procinfo;
        public Ptr<misc.auth_ops> rq_authop;
        public svc_cred rq_cred;
        public Ptr<?> rq_xprt_ctxt;
        public Ptr<svc_deferred_req> rq_deferred;
        public misc.xdr_buf rq_arg;
        public misc.xdr_stream rq_arg_stream;
        public misc.xdr_stream rq_res_stream;
        public Ptr<runtime.page> rq_scratch_page;
        public misc.xdr_buf rq_res;
        public Ptr<runtime.page> @Size(value=260) [] rq_pages;
        public Ptr<Ptr<runtime.page>> rq_respages;
        public Ptr<Ptr<runtime.page>> rq_next_page;
        public Ptr<Ptr<runtime.page>> rq_page_end;
        public FolioDefinitions.folio_batch rq_fbatch;
        public runtime.kvec @Size(value=259) [] rq_vec;
        public BioDefinitions.bio_vec @Size(value=259) [] rq_bvec;
        public @Unsigned @OriginalName(value="__be32") int rq_xid;
        public @Unsigned int rq_prog;
        public @Unsigned int rq_vers;
        public @Unsigned int rq_proc;
        public @Unsigned int rq_prot;
        public int rq_cachetype;
        public @Unsigned long rq_flags;
        public @OriginalName(value="ktime_t") long rq_qtime;
        public Ptr<?> rq_argp;
        public Ptr<?> rq_resp;
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> rq_accept_statp;
        public Ptr<?> rq_auth_data;
        public @Unsigned @OriginalName(value="__be32") int rq_auth_stat;
        public int rq_auth_slack;
        public int rq_reserved;
        public @OriginalName(value="ktime_t") long rq_stime;
        public CacheDefinitions.cache_req rq_chandle;
        public Ptr<misc.auth_domain> rq_client;
        public Ptr<misc.auth_domain> rq_gssclient;
        public Ptr<TaskDefinitions.task_struct> rq_task;
        public Ptr<runtime.net> rq_bc_net;
        public int rq_err;
        public @Unsigned long bc_to_initval;
        public @Unsigned int bc_to_retries;
        public Ptr<Ptr<?>> rq_lease_breaker;
        public @Unsigned int rq_status_counter;
    }

    @Type(noCCodeGeneration=true, cType="enum svc_auth_status")
    public static enum svc_auth_status implements Enum<svc_auth_status>,
    TypedEnum<svc_auth_status, Integer>
    {
        SVC_GARBAGE,
        SVC_SYSERR,
        SVC_VALID,
        SVC_NEGATIVE,
        SVC_OK,
        SVC_DROP,
        SVC_CLOSE,
        SVC_DENIED,
        SVC_PENDING,
        SVC_COMPLETE;

    }

    @Type(noCCodeGeneration=true, cType="struct svc_cred")
    @NotUsableInJava
    public static class svc_cred
    extends Struct {
        public misc.kuid_t cr_uid;
        public misc.kgid_t cr_gid;
        public Ptr<GroupDefinitions.group_info> cr_group_info;
        public @Unsigned int cr_flavor;
        public String cr_raw_principal;
        public String cr_principal;
        public String cr_targ_princ;
        public Ptr<misc.gss_api_mech> cr_gss_mech;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_program")
    @NotUsableInJava
    public static class svc_program
    extends Struct {
        public @Unsigned int pg_prog;
        public @Unsigned int pg_lovers;
        public @Unsigned int pg_hivers;
        public @Unsigned int pg_nvers;
        public Ptr<Ptr<svc_version>> pg_vers;
        public String pg_name;
        public String pg_class;
        public Ptr<?> pg_authenticate;
        public Ptr<?> pg_init_request;
        public Ptr<?> pg_rpcbind_set;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_stat")
    @NotUsableInJava
    public static class svc_stat
    extends Struct {
        public Ptr<svc_program> program;
        public @Unsigned int netcnt;
        public @Unsigned int netudpcnt;
        public @Unsigned int nettcpcnt;
        public @Unsigned int nettcpconn;
        public @Unsigned int rpccnt;
        public @Unsigned int rpcbadfmt;
        public @Unsigned int rpcbadauth;
        public @Unsigned int rpcbadclnt;
    }

    @Type(noCCodeGeneration=true, cType="struct svc_serv")
    @NotUsableInJava
    public static class svc_serv
    extends Struct {
        public Ptr<svc_program> sv_programs;
        public Ptr<svc_stat> sv_stats;
        public  @OriginalName(value="spinlock_t") runtime.spinlock sv_lock;
        public @Unsigned int sv_nprogs;
        public @Unsigned int sv_nrthreads;
        public @Unsigned int sv_maxconn;
        public @Unsigned int sv_max_payload;
        public @Unsigned int sv_max_mesg;
        public @Unsigned int sv_xdrsize;
        public ListDefinitions.list_head sv_permsocks;
        public ListDefinitions.list_head sv_tempsocks;
        public int sv_tmpcnt;
        public TimerDefinitions.timer_list sv_temptimer;
        public String sv_name;
        public @Unsigned int sv_nrpools;
        public boolean sv_is_pooled;
        public Ptr<svc_pool> sv_pools;
        public Ptr<?> sv_threadfn;
        public runtime.lwq sv_cb_list;
        public boolean sv_bc_enabled;
    }
}

