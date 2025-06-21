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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DentryDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.Nfs4Definitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RpcDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nfs_stat_to_errno(nfs_stat status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nfs_ssc_register((const struct nfs_ssc_client_ops*)$arg1)")
    public static void nfs_ssc_register(Ptr<nfs_ssc_client_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nfs_ssc_unregister((const struct nfs_ssc_client_ops*)$arg1)")
    public static void nfs_ssc_unregister(Ptr<nfs_ssc_client_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum nfs_stat")
    public static enum nfs_stat implements Enum<nfs_stat>,
    TypedEnum<nfs_stat, Integer>
    {
        NFS_OK,
        NFSERR_PERM,
        NFSERR_NOENT,
        NFSERR_IO,
        NFSERR_NXIO,
        NFSERR_EAGAIN,
        NFSERR_ACCES,
        NFSERR_EXIST,
        NFSERR_XDEV,
        NFSERR_NODEV,
        NFSERR_NOTDIR,
        NFSERR_ISDIR,
        NFSERR_INVAL,
        NFSERR_FBIG,
        NFSERR_NOSPC,
        NFSERR_ROFS,
        NFSERR_MLINK,
        NFSERR_NAMETOOLONG,
        NFSERR_NOTEMPTY,
        NFSERR_DQUOT,
        NFSERR_STALE,
        NFSERR_REMOTE,
        NFSERR_WFLUSH,
        NFSERR_BADHANDLE,
        NFSERR_NOT_SYNC,
        NFSERR_BAD_COOKIE,
        NFSERR_NOTSUPP,
        NFSERR_TOOSMALL,
        NFSERR_SERVERFAULT,
        NFSERR_BADTYPE,
        NFSERR_JUKEBOX,
        NFSERR_SAME,
        NFSERR_DENIED,
        NFSERR_EXPIRED,
        NFSERR_LOCKED,
        NFSERR_GRACE,
        NFSERR_FHEXPIRED,
        NFSERR_SHARE_DENIED,
        NFSERR_WRONGSEC,
        NFSERR_CLID_INUSE,
        NFSERR_RESOURCE,
        NFSERR_MOVED,
        NFSERR_NOFILEHANDLE,
        NFSERR_MINOR_VERS_MISMATCH,
        NFSERR_STALE_CLIENTID,
        NFSERR_STALE_STATEID,
        NFSERR_OLD_STATEID,
        NFSERR_BAD_STATEID,
        NFSERR_BAD_SEQID,
        NFSERR_NOT_SAME,
        NFSERR_LOCK_RANGE,
        NFSERR_SYMLINK,
        NFSERR_RESTOREFH,
        NFSERR_LEASE_MOVED,
        NFSERR_ATTRNOTSUPP,
        NFSERR_NO_GRACE,
        NFSERR_RECLAIM_BAD,
        NFSERR_RECLAIM_CONFLICT,
        NFSERR_BAD_XDR,
        NFSERR_LOCKS_HELD,
        NFSERR_OPENMODE,
        NFSERR_BADOWNER,
        NFSERR_BADCHAR,
        NFSERR_BADNAME,
        NFSERR_BAD_RANGE,
        NFSERR_LOCK_NOTSUPP,
        NFSERR_OP_ILLEGAL,
        NFSERR_DEADLOCK,
        NFSERR_FILE_OPEN,
        NFSERR_ADMIN_REVOKED,
        NFSERR_CB_PATH_DOWN;

    }

    @Type(noCCodeGeneration=true, cType="struct nfs_seqid_counter")
    @NotUsableInJava
    public static class nfs_seqid_counter
    extends Struct {
        public @OriginalName(value="ktime_t") long create_time;
        public @Unsigned long owner_id;
        public int flags;
        public @Unsigned int counter;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head list;
        public RpcDefinitions.rpc_wait_queue wait;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_ssc_client_ops")
    @NotUsableInJava
    public static class nfs_ssc_client_ops
    extends Struct {
        public Ptr<?> sco_sb_deactive;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_ssc_client_ops_tbl")
    @NotUsableInJava
    public static class nfs_ssc_client_ops_tbl
    extends Struct {
        public Ptr<Nfs4Definitions.nfs4_ssc_client_ops> ssc_nfs4_ops;
        public Ptr<nfs_ssc_client_ops> ssc_nfs_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_access_entry")
    @NotUsableInJava
    public static class nfs_access_entry
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public ListDefinitions.list_head lru;
        public misc.kuid_t fsuid;
        public misc.kgid_t fsgid;
        public Ptr<GroupDefinitions.group_info> group_info;
        public @Unsigned long timestamp;
        public @Unsigned int mask;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_rpc_ops")
    @NotUsableInJava
    public static class nfs_rpc_ops
    extends Struct {
        public @Unsigned int version;
        public Ptr<DentryDefinitions.dentry_operations> dentry_ops;
        public Ptr<InodeDefinitions.inode_operations> dir_inode_ops;
        public Ptr<InodeDefinitions.inode_operations> file_inode_ops;
        public Ptr<FileDefinitions.file_operations> file_ops;
        public @OriginalName(value="nlmclnt_operations") Ptr<?> nlmclnt_ops;
        public Ptr<?> getroot;
        public Ptr<?> submount;
        public Ptr<?> try_get_tree;
        public Ptr<?> getattr;
        public Ptr<?> setattr;
        public Ptr<?> lookup;
        public Ptr<?> lookupp;
        public Ptr<?> access;
        public Ptr<?> readlink;
        public Ptr<?> create;
        public Ptr<?> remove;
        public Ptr<?> unlink_setup;
        public Ptr<?> unlink_rpc_prepare;
        public Ptr<?> unlink_done;
        public Ptr<?> rename_setup;
        public Ptr<?> rename_rpc_prepare;
        public Ptr<?> rename_done;
        public Ptr<?> link;
        public Ptr<?> symlink;
        public Ptr<?> mkdir;
        public Ptr<?> rmdir;
        public Ptr<?> readdir;
        public Ptr<?> mknod;
        public Ptr<?> statfs;
        public Ptr<?> fsinfo;
        public Ptr<?> pathconf;
        public Ptr<?> set_capabilities;
        public Ptr<?> decode_dirent;
        public Ptr<?> pgio_rpc_prepare;
        public Ptr<?> read_setup;
        public Ptr<?> read_done;
        public Ptr<?> write_setup;
        public Ptr<?> write_done;
        public Ptr<?> commit_setup;
        public Ptr<?> commit_rpc_prepare;
        public Ptr<?> commit_done;
        public Ptr<?> lock;
        public Ptr<?> lock_check_bounds;
        public Ptr<?> clear_acl_cache;
        public Ptr<?> close_context;
        public Ptr<?> open_context;
        public Ptr<?> have_delegation;
        public Ptr<?> return_delegation;
        public Ptr<?> alloc_client;
        public Ptr<?> init_client;
        public Ptr<?> free_client;
        public Ptr<?> create_server;
        public Ptr<?> clone_server;
        public Ptr<?> discover_trunking;
        public Ptr<?> enable_swap;
        public Ptr<?> disable_swap;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_renamedata")
    @NotUsableInJava
    public static class nfs_renamedata
    extends Struct {
        public nfs_renameargs args;
        public nfs_renameres res;
        public RpcDefinitions.rpc_task task;
        public Ptr<runtime.cred> cred;
        public Ptr<runtime.inode> old_dir;
        public Ptr<runtime.dentry> old_dentry;
        public nfs_fattr old_fattr;
        public Ptr<runtime.inode> new_dir;
        public Ptr<runtime.dentry> new_dentry;
        public nfs_fattr new_fattr;
        public Ptr<?> complete;
        public long timeout;
        public boolean cancelled;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_unlinkdata")
    @NotUsableInJava
    public static class nfs_unlinkdata
    extends Struct {
        public nfs_removeargs args;
        public nfs_removeres res;
        public Ptr<runtime.dentry> dentry;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wq;
        public Ptr<runtime.cred> cred;
        public nfs_fattr dir_attr;
        public long timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_commit_info")
    @NotUsableInJava
    public static class nfs_commit_info
    extends Struct {
        public Ptr<runtime.inode> inode;
        public Ptr<nfs_mds_commit_info> mds;
        public Ptr<misc.pnfs_ds_commit_info> ds;
        public @OriginalName(value="nfs_direct_req") Ptr<?> dreq;
        public Ptr<nfs_commit_completion_ops> completion_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_commit_data")
    @NotUsableInJava
    public static class nfs_commit_data
    extends Struct {
        public RpcDefinitions.rpc_task task;
        public Ptr<runtime.inode> inode;
        public Ptr<runtime.cred> cred;
        public nfs_fattr fattr;
        public nfs_writeverf verf;
        public ListDefinitions.list_head pages;
        public ListDefinitions.list_head list;
        public @OriginalName(value="nfs_direct_req") Ptr<?> dreq;
        public nfs_commitargs args;
        public nfs_commitres res;
        public Ptr<nfs_open_context> context;
        public @OriginalName(value="pnfs_layout_segment") Ptr<?> lseg;
        public Ptr<nfs_client> ds_clp;
        public int ds_commit_index;
        public @OriginalName(value="loff_t") long lwb;
        public Ptr<RpcDefinitions.rpc_call_ops> mds_ops;
        public Ptr<nfs_commit_completion_ops> completion_ops;
        public Ptr<?> commit_done_cb;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_commit_completion_ops")
    @NotUsableInJava
    public static class nfs_commit_completion_ops
    extends Struct {
        public Ptr<?> completion;
        public Ptr<?> resched_write;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_mds_commit_info")
    @NotUsableInJava
    public static class nfs_mds_commit_info
    extends Struct {
        public AtomicDefinitions.atomic_t rpcs_out;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t ncommit;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_pgio_completion_ops")
    @NotUsableInJava
    public static class nfs_pgio_completion_ops
    extends Struct {
        public Ptr<?> error_cleanup;
        public Ptr<?> init_hdr;
        public Ptr<?> completion;
        public Ptr<?> reschedule_io;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_pgio_header")
    @NotUsableInJava
    public static class nfs_pgio_header
    extends Struct {
        public Ptr<runtime.inode> inode;
        public Ptr<runtime.cred> cred;
        public ListDefinitions.list_head pages;
        public @OriginalName(value="nfs_page") Ptr<?> req;
        public nfs_writeverf verf;
        public @Unsigned @OriginalName(value="fmode_t") int rw_mode;
        public @OriginalName(value="pnfs_layout_segment") Ptr<?> lseg;
        public @OriginalName(value="loff_t") long io_start;
        public Ptr<RpcDefinitions.rpc_call_ops> mds_ops;
        public Ptr<?> release;
        public Ptr<nfs_pgio_completion_ops> completion_ops;
        public @OriginalName(value="nfs_rw_ops") Ptr<?> rw_ops;
        public @OriginalName(value="nfs_io_completion") Ptr<?> io_completion;
        public @OriginalName(value="nfs_direct_req") Ptr<?> dreq;
        public Ptr<?> netfs;
        public int pnfs_error;
        public int error;
        public @Unsigned int good_bytes;
        public @Unsigned long flags;
        public RpcDefinitions.rpc_task task;
        public nfs_fattr fattr;
        public nfs_pgio_args args;
        public nfs_pgio_res res;
        public @Unsigned long timestamp;
        public Ptr<?> pgio_done_cb;
        public @Unsigned long mds_offset;
        public nfs_page_array page_array;
        public Ptr<nfs_client> ds_clp;
        public @Unsigned int ds_commit_idx;
        public @Unsigned int pgio_mirror_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_page_array")
    @NotUsableInJava
    public static class nfs_page_array
    extends Struct {
        public Ptr<Ptr<runtime.page>> pagevec;
        public @Unsigned int npages;
        public Ptr<runtime.page> @Size(value=8) [] page_array;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_readdir_res")
    @NotUsableInJava
    public static class nfs_readdir_res
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> verf;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_readdir_arg")
    @NotUsableInJava
    public static class nfs_readdir_arg
    extends Struct {
        public Ptr<runtime.dentry> dentry;
        public Ptr<runtime.cred> cred;
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> verf;
        public @Unsigned long cookie;
        public Ptr<Ptr<runtime.page>> pages;
        public @Unsigned int page_len;
        public boolean plus;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_entry")
    @NotUsableInJava
    public static class nfs_entry
    extends Struct {
        public @Unsigned long ino;
        public @Unsigned long cookie;
        public String name;
        public @Unsigned int len;
        public int eof;
        public Ptr<nfs_fh> fh;
        public Ptr<nfs_fattr> fattr;
        public char d_type;
        public Ptr<nfs_server> server;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_auth_info")
    @NotUsableInJava
    public static class nfs_auth_info
    extends Struct {
        public @Unsigned int flavor_len;
        public @Unsigned @OriginalName(value="rpc_authflavor_t") int @Size(value=12) [] flavors;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_renameres")
    @NotUsableInJava
    public static class nfs_renameres
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_res seq_res;
        public Ptr<nfs_server> server;
        public Nfs4Definitions.nfs4_change_info old_cinfo;
        public Ptr<nfs_fattr> old_fattr;
        public Nfs4Definitions.nfs4_change_info new_cinfo;
        public Ptr<nfs_fattr> new_fattr;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_renameargs")
    @NotUsableInJava
    public static class nfs_renameargs
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_args seq_args;
        public Ptr<nfs_fh> old_dir;
        public Ptr<nfs_fh> new_dir;
        public Ptr<runtime.qstr> old_name;
        public Ptr<runtime.qstr> new_name;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_removeres")
    @NotUsableInJava
    public static class nfs_removeres
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_res seq_res;
        public Ptr<nfs_server> server;
        public Ptr<nfs_fattr> dir_attr;
        public Nfs4Definitions.nfs4_change_info cinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_removeargs")
    @NotUsableInJava
    public static class nfs_removeargs
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_args seq_args;
        public Ptr<nfs_fh> fh;
        public runtime.qstr name;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_commitres")
    @NotUsableInJava
    public static class nfs_commitres
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_res seq_res;
        public @Unsigned int op_status;
        public Ptr<nfs_fattr> fattr;
        public Ptr<nfs_writeverf> verf;
        public Ptr<nfs_server> server;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_commitargs")
    @NotUsableInJava
    public static class nfs_commitargs
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_args seq_args;
        public Ptr<nfs_fh> fh;
        public @Unsigned long offset;
        public @Unsigned int count;
        public Ptr<@Unsigned Integer> bitmask;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_pgio_res")
    @NotUsableInJava
    public static class nfs_pgio_res
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_res seq_res;
        public Ptr<nfs_fattr> fattr;
        public @Unsigned long count;
        public @Unsigned int op_status;
        @InlineUnion(value=10755)
        public  @InlineUnion(value=10755) AnonDefinitions.anon_member_of_anon_member_of_nfs_pgio_res anon4$0;
        @InlineUnion(value=10755)
        public  @InlineUnion(value=10755) AnonDefinitions.anon_member_of_anon_member_of_nfs_pgio_res anon4$1;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_lock_context")
    @NotUsableInJava
    public static class nfs_lock_context
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public ListDefinitions.list_head list;
        public Ptr<nfs_open_context> open_context;
        public @OriginalName(value="fl_owner_t") Ptr<?> lockowner;
        public AtomicDefinitions.atomic_t io_count;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_pgio_args")
    @NotUsableInJava
    public static class nfs_pgio_args
    extends Struct {
        public Nfs4Definitions.nfs4_sequence_args seq_args;
        public Ptr<nfs_fh> fh;
        public Ptr<nfs_open_context> context;
        public Ptr<nfs_lock_context> lock_context;
        public Nfs4Definitions.nfs4_stateid_struct stateid;
        public @Unsigned long offset;
        public @Unsigned int count;
        public @Unsigned int pgbase;
        public Ptr<Ptr<runtime.page>> pages;
        @InlineUnion(value=10748)
        public @InlineUnion(value=10748) @Unsigned int replen;
        @InlineUnion(value=10748)
        public  @InlineUnion(value=10748) AnonDefinitions.anon_member_of_anon_member_of_nfs_pgio_args anon9$1;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_writeverf")
    @NotUsableInJava
    public static class nfs_writeverf
    extends Struct {
        public nfs_write_verifier verifier;
        public misc.nfs3_stable_how committed;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_write_verifier")
    @NotUsableInJava
    public static class nfs_write_verifier
    extends Struct {
        public char @Size(value=8) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_seqid")
    @NotUsableInJava
    public static class nfs_seqid
    extends Struct {
        public Ptr<nfs_seqid_counter> sequence;
        public ListDefinitions.list_head list;
        public Ptr<RpcDefinitions.rpc_task> task;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_client")
    @NotUsableInJava
    public static class nfs_client
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct cl_count;
        public AtomicDefinitions.atomic_t cl_mds_count;
        public int cl_cons_state;
        public @Unsigned long cl_res_state;
        public @Unsigned long cl_flags;
        public KernelDefinitions.__kernel_sockaddr_storage cl_addr;
        public @Unsigned long cl_addrlen;
        public String cl_hostname;
        public String cl_acceptor;
        public ListDefinitions.list_head cl_share_link;
        public ListDefinitions.list_head cl_superblocks;
        public Ptr<RpcDefinitions.rpc_clnt> cl_rpcclient;
        public Ptr<nfs_rpc_ops> rpc_ops;
        public int cl_proto;
        public @OriginalName(value="nfs_subversion") Ptr<?> cl_nfs_mod;
        public @Unsigned int cl_minorversion;
        public @Unsigned int cl_nconnect;
        public @Unsigned int cl_max_connect;
        public String cl_principal;
        public misc.xprtsec_parms cl_xprtsec;
        public ListDefinitions.list_head cl_ds_clients;
        public @Unsigned long cl_clientid;
        public Nfs4Definitions.nfs4_verifier cl_confirm;
        public @Unsigned long cl_state;
        public  @OriginalName(value="spinlock_t") runtime.spinlock cl_lock;
        public @Unsigned long cl_lease_time;
        public @Unsigned long cl_last_renewal;
        public DelayedDefinitions.delayed_work cl_renewd;
        public RpcDefinitions.rpc_wait_queue cl_rpcwaitq;
        public @OriginalName(value="idmap") Ptr<?> cl_idmap;
        public String cl_owner_id;
        public @Unsigned int cl_cb_ident;
        public Ptr<Nfs4Definitions.nfs4_minor_version_ops> cl_mvops;
        public @Unsigned long cl_mig_gen;
        public @OriginalName(value="nfs4_slot_table") Ptr<?> cl_slot_tbl;
        public @Unsigned int cl_seqid;
        public @Unsigned int cl_exchange_flags;
        public @OriginalName(value="nfs4_session") Ptr<?> cl_session;
        public boolean cl_preserve_clid;
        public Ptr<misc.nfs41_server_owner> cl_serverowner;
        public Ptr<misc.nfs41_server_scope> cl_serverscope;
        public Ptr<misc.nfs41_impl_id> cl_implid;
        public @Unsigned long cl_sp4_flags;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head cl_lock_waitq;
        public char @Size(value=48) [] cl_ipaddr;
        public Ptr<runtime.net> cl_net;
        public ListDefinitions.list_head pending_cb_stateids;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_server")
    @NotUsableInJava
    public static class nfs_server
    extends Struct {
        public Ptr<nfs_client> nfs_client;
        public ListDefinitions.list_head client_link;
        public ListDefinitions.list_head master_link;
        public Ptr<RpcDefinitions.rpc_clnt> client;
        public Ptr<RpcDefinitions.rpc_clnt> client_acl;
        public @OriginalName(value="nlm_host") Ptr<?> nlm_host;
        public @OriginalName(value="nfs_iostats") Ptr<?> io_stats;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head write_congestion_wait;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t writeback;
        public @Unsigned int write_congested;
        public @Unsigned int flags;
        public @Unsigned int fattr_valid;
        public @Unsigned int caps;
        public @Unsigned int rsize;
        public @Unsigned int rpages;
        public @Unsigned int wsize;
        public @Unsigned int wpages;
        public @Unsigned int wtmult;
        public @Unsigned int dtsize;
        public @Unsigned short port;
        public @Unsigned int bsize;
        public @Unsigned int gxasize;
        public @Unsigned int sxasize;
        public @Unsigned int lxasize;
        public @Unsigned int acregmin;
        public @Unsigned int acregmax;
        public @Unsigned int acdirmin;
        public @Unsigned int acdirmax;
        public @Unsigned int namelen;
        public @Unsigned int options;
        public @Unsigned int clone_blksize;
        public Nfs4Definitions.nfs4_change_attr_type change_attr_type;
        public nfs_fsid fsid;
        public int s_sysfs_id;
        public @Unsigned long maxfilesize;
        public runtime.timespec64 time_delta;
        public @Unsigned long mount_time;
        public Ptr<SuperDefinitions.super_block> _super;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public nfs_auth_info auth_info;
        public @OriginalName(value="fscache_volume") Ptr<?> fscache;
        public String fscache_uniq;
        public @Unsigned int pnfs_blksize;
        public @Unsigned int @Size(value=3) [] attr_bitmask;
        public @Unsigned int @Size(value=3) [] attr_bitmask_nl;
        public @Unsigned int @Size(value=3) [] exclcreat_bitmask;
        public @Unsigned int @Size(value=3) [] cache_consistency_bitmask;
        public @Unsigned int acl_bitmask;
        public @Unsigned int fh_expire_type;
        public @OriginalName(value="pnfs_layoutdriver_type") Ptr<?> pnfs_curr_ld;
        public RpcDefinitions.rpc_wait_queue roc_rpcwaitq;
        public Ptr<?> pnfs_ld_data;
        public RbDefinitions.rb_root state_owners;
        public misc.atomic64_t owner_ctr;
        public ListDefinitions.list_head state_owners_lru;
        public ListDefinitions.list_head layouts;
        public ListDefinitions.list_head delegations;
        public ListDefinitions.list_head ss_copies;
        public ListDefinitions.list_head ss_src_copies;
        public @Unsigned long delegation_gen;
        public @Unsigned long mig_gen;
        public @Unsigned long mig_status;
        public Ptr<?> destroy;
        public AtomicDefinitions.atomic_t active;
        public KernelDefinitions.__kernel_sockaddr_storage mountd_address;
        public @Unsigned long mountd_addrlen;
        public @Unsigned int mountd_version;
        public @Unsigned short mountd_port;
        public @Unsigned short mountd_protocol;
        public RpcDefinitions.rpc_wait_queue uoc_rpcwaitq;
        public @Unsigned int read_hdrsize;
        public Ptr<runtime.cred> cred;
        public boolean has_sec_mnt_opts;
        public runtime.kobject kobj;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_open_context")
    @NotUsableInJava
    public static class nfs_open_context
    extends Struct {
        public nfs_lock_context lock_context;
        public @OriginalName(value="fl_owner_t") Ptr<?> flock_owner;
        public Ptr<runtime.dentry> dentry;
        public Ptr<runtime.cred> cred;
        public Ptr<RpcDefinitions.rpc_cred> ll_cred;
        public Ptr<Nfs4Definitions.nfs4_state> state;
        public @Unsigned @OriginalName(value="fmode_t") int mode;
        public @Unsigned long flags;
        public int error;
        public ListDefinitions.list_head list;
        public Ptr<Nfs4Definitions.nfs4_threshold> mdsthreshold;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_pathconf")
    @NotUsableInJava
    public static class nfs_pathconf
    extends Struct {
        public Ptr<nfs_fattr> fattr;
        public @Unsigned int max_link;
        public @Unsigned int max_namelen;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_fsstat")
    @NotUsableInJava
    public static class nfs_fsstat
    extends Struct {
        public Ptr<nfs_fattr> fattr;
        public @Unsigned long tbytes;
        public @Unsigned long fbytes;
        public @Unsigned long abytes;
        public @Unsigned long tfiles;
        public @Unsigned long ffiles;
        public @Unsigned long afiles;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_fsinfo")
    @NotUsableInJava
    public static class nfs_fsinfo
    extends Struct {
        public Ptr<nfs_fattr> fattr;
        public @Unsigned int rtmax;
        public @Unsigned int rtpref;
        public @Unsigned int rtmult;
        public @Unsigned int wtmax;
        public @Unsigned int wtpref;
        public @Unsigned int wtmult;
        public @Unsigned int dtpref;
        public @Unsigned long maxfilesize;
        public runtime.timespec64 time_delta;
        public @Unsigned int lease_time;
        public @Unsigned int nlayouttypes;
        public @Unsigned int @Size(value=8) [] layouttype;
        public @Unsigned int blksize;
        public @Unsigned int clone_blksize;
        public Nfs4Definitions.nfs4_change_attr_type change_attr_type;
        public @Unsigned int xattr_support;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_fattr")
    @NotUsableInJava
    public static class nfs_fattr
    extends Struct {
        public @Unsigned int valid;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public @Unsigned int nlink;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="dev_t") int rdev;
        public @Unsigned long size;
        public misc.du_of_nfs_fattr du;
        public nfs_fsid fsid;
        public @Unsigned long fileid;
        public @Unsigned long mounted_on_fileid;
        public runtime.timespec64 atime;
        public runtime.timespec64 mtime;
        public runtime.timespec64 ctime;
        public @Unsigned long change_attr;
        public @Unsigned long pre_change_attr;
        public @Unsigned long pre_size;
        public runtime.timespec64 pre_mtime;
        public runtime.timespec64 pre_ctime;
        public @Unsigned long time_start;
        public @Unsigned long gencount;
        public Ptr<Nfs4Definitions.nfs4_string> owner_name;
        public Ptr<Nfs4Definitions.nfs4_string> group_name;
        public Ptr<Nfs4Definitions.nfs4_threshold> mdsthreshold;
        public Ptr<Nfs4Definitions.nfs4_label> label;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_fsid")
    @NotUsableInJava
    public static class nfs_fsid
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long major;
        public @Unsigned @OriginalName(value="uint64_t") long minor;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_fh")
    @NotUsableInJava
    public static class nfs_fh
    extends Struct {
        public @Unsigned short size;
        public char @Size(value=128) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs_lock_info")
    @NotUsableInJava
    public static class nfs_lock_info
    extends Struct {
        public @Unsigned int state;
        public @OriginalName(value="nlm_lockowner") Ptr<?> owner;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="enum nfs_opnum4")
    public static enum nfs_opnum4 implements Enum<nfs_opnum4>,
    TypedEnum<nfs_opnum4, Integer>
    {
        OP_ACCESS,
        OP_CLOSE,
        OP_COMMIT,
        OP_CREATE,
        OP_DELEGPURGE,
        OP_DELEGRETURN,
        OP_GETATTR,
        OP_GETFH,
        OP_LINK,
        OP_LOCK,
        OP_LOCKT,
        OP_LOCKU,
        OP_LOOKUP,
        OP_LOOKUPP,
        OP_NVERIFY,
        OP_OPEN,
        OP_OPENATTR,
        OP_OPEN_CONFIRM,
        OP_OPEN_DOWNGRADE,
        OP_PUTFH,
        OP_PUTPUBFH,
        OP_PUTROOTFH,
        OP_READ,
        OP_READDIR,
        OP_READLINK,
        OP_REMOVE,
        OP_RENAME,
        OP_RENEW,
        OP_RESTOREFH,
        OP_SAVEFH,
        OP_SECINFO,
        OP_SETATTR,
        OP_SETCLIENTID,
        OP_SETCLIENTID_CONFIRM,
        OP_VERIFY,
        OP_WRITE,
        OP_RELEASE_LOCKOWNER,
        OP_BACKCHANNEL_CTL,
        OP_BIND_CONN_TO_SESSION,
        OP_EXCHANGE_ID,
        OP_CREATE_SESSION,
        OP_DESTROY_SESSION,
        OP_FREE_STATEID,
        OP_GET_DIR_DELEGATION,
        OP_GETDEVICEINFO,
        OP_GETDEVICELIST,
        OP_LAYOUTCOMMIT,
        OP_LAYOUTGET,
        OP_LAYOUTRETURN,
        OP_SECINFO_NO_NAME,
        OP_SEQUENCE,
        OP_SET_SSV,
        OP_TEST_STATEID,
        OP_WANT_DELEGATION,
        OP_DESTROY_CLIENTID,
        OP_RECLAIM_COMPLETE,
        OP_ALLOCATE,
        OP_COPY,
        OP_COPY_NOTIFY,
        OP_DEALLOCATE,
        OP_IO_ADVISE,
        OP_LAYOUTERROR,
        OP_LAYOUTSTATS,
        OP_OFFLOAD_CANCEL,
        OP_OFFLOAD_STATUS,
        OP_READ_PLUS,
        OP_SEEK,
        OP_WRITE_SAME,
        OP_CLONE,
        OP_GETXATTR,
        OP_SETXATTR,
        OP_LISTXATTRS,
        OP_REMOVEXATTR,
        OP_ILLEGAL;

    }
}

