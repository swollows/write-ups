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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NfsDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RpcDefinitions;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Nfs4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nfs4_stat_to_errno(int stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_state_owner")
    @NotUsableInJava
    public static class nfs4_state_owner
    extends Struct {
        public Ptr<NfsDefinitions.nfs_server> so_server;
        public ListDefinitions.list_head so_lru;
        public @Unsigned long so_expires;
        public RbDefinitions.rb_node so_server_node;
        public Ptr<runtime.cred> so_cred;
        public  @OriginalName(value="spinlock_t") runtime.spinlock so_lock;
        public AtomicDefinitions.atomic_t so_count;
        public @Unsigned long so_flags;
        public ListDefinitions.list_head so_states;
        public NfsDefinitions.nfs_seqid_counter so_seqid;
        public runtime.mutex so_delegreturn_mutex;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_mig_recovery_ops")
    @NotUsableInJava
    public static class nfs4_mig_recovery_ops
    extends Struct {
        public Ptr<?> get_locations;
        public Ptr<?> fsid_present;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_state_maintenance_ops")
    @NotUsableInJava
    public static class nfs4_state_maintenance_ops
    extends Struct {
        public Ptr<?> sched_state_renewal;
        public Ptr<?> get_state_renewal_cred;
        public Ptr<?> renew_lease;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_state_recovery_ops")
    @NotUsableInJava
    public static class nfs4_state_recovery_ops
    extends Struct {
        public int owner_flag_bit;
        public int state_flag_bit;
        public Ptr<?> recover_open;
        public Ptr<?> recover_lock;
        public Ptr<?> establish_clid;
        public Ptr<?> reclaim_complete;
        public Ptr<?> detect_trunking;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_lock_state")
    @NotUsableInJava
    public static class nfs4_lock_state
    extends Struct {
        public ListDefinitions.list_head ls_locks;
        public Ptr<nfs4_state> ls_state;
        public @Unsigned long ls_flags;
        public NfsDefinitions.nfs_seqid_counter ls_seqid;
        public nfs4_stateid_struct ls_stateid;
        public  @OriginalName(value="refcount_t") misc.refcount_struct ls_count;
        public @OriginalName(value="fl_owner_t") Ptr<?> ls_owner;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_ssc_client_ops")
    @NotUsableInJava
    public static class nfs4_ssc_client_ops
    extends Struct {
        public Ptr<?> sco_open;
        public Ptr<?> sco_close;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_state")
    @NotUsableInJava
    public static class nfs4_state
    extends Struct {
        public ListDefinitions.list_head open_states;
        public ListDefinitions.list_head inode_states;
        public ListDefinitions.list_head lock_states;
        public Ptr<nfs4_state_owner> owner;
        public Ptr<runtime.inode> inode;
        public @Unsigned long flags;
        public  @OriginalName(value="spinlock_t") runtime.spinlock state_lock;
        public misc.seqlock_t seqlock;
        public nfs4_stateid_struct stateid;
        public nfs4_stateid_struct open_stateid;
        public @Unsigned int n_rdonly;
        public @Unsigned int n_wronly;
        public @Unsigned int n_rdwr;
        public @Unsigned @OriginalName(value="fmode_t") int state;
        public  @OriginalName(value="refcount_t") misc.refcount_struct count;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_minor_version_ops")
    @NotUsableInJava
    public static class nfs4_minor_version_ops
    extends Struct {
        public @Unsigned int minor_version;
        public @Unsigned int init_caps;
        public Ptr<?> init_client;
        public Ptr<?> shutdown_client;
        public Ptr<?> match_stateid;
        public Ptr<?> find_root_sec;
        public Ptr<?> free_lock_state;
        public Ptr<?> test_and_free_expired;
        public Ptr<?> alloc_seqid;
        public Ptr<?> session_trunk;
        public Ptr<RpcDefinitions.rpc_call_ops> call_sync_ops;
        public Ptr<nfs4_state_recovery_ops> reboot_recovery_ops;
        public Ptr<nfs4_state_recovery_ops> nograce_recovery_ops;
        public Ptr<nfs4_state_maintenance_ops> state_renewal_ops;
        public Ptr<nfs4_mig_recovery_ops> mig_recovery_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_fs_locations")
    @NotUsableInJava
    public static class nfs4_fs_locations
    extends Struct {
        public Ptr<NfsDefinitions.nfs_fattr> fattr;
        public Ptr<NfsDefinitions.nfs_server> server;
        public nfs4_pathname fs_path;
        public int nlocations;
        public nfs4_fs_location @Size(value=10) [] locations;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_fs_location")
    @NotUsableInJava
    public static class nfs4_fs_location
    extends Struct {
        public @Unsigned int nservers;
        public nfs4_string @Size(value=10) [] servers;
        public nfs4_pathname rootpath;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_pathname")
    @NotUsableInJava
    public static class nfs4_pathname
    extends Struct {
        public @Unsigned int ncomponents;
        public nfs4_string @Size(value=512) [] components;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_sequence_res")
    @NotUsableInJava
    public static class nfs4_sequence_res
    extends Struct {
        public @OriginalName(value="nfs4_slot") Ptr<?> sr_slot;
        public @Unsigned long sr_timestamp;
        public int sr_status;
        public @Unsigned int sr_status_flags;
        public @Unsigned int sr_highest_slotid;
        public @Unsigned int sr_target_highest_slotid;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_sequence_args")
    @NotUsableInJava
    public static class nfs4_sequence_args
    extends Struct {
        public @OriginalName(value="nfs4_slot") Ptr<?> sa_slot;
        public char sa_cache_this;
        public char sa_privileged;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_change_info")
    @NotUsableInJava
    public static class nfs4_change_info
    extends Struct {
        public @Unsigned int atomic;
        public @Unsigned long before;
        public @Unsigned long after;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_threshold")
    @NotUsableInJava
    public static class nfs4_threshold
    extends Struct {
        public @Unsigned int bm;
        public @Unsigned int l_type;
        public @Unsigned long rd_sz;
        public @Unsigned long wr_sz;
        public @Unsigned long rd_io_sz;
        public @Unsigned long wr_io_sz;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_string")
    @NotUsableInJava
    public static class nfs4_string
    extends Struct {
        public @Unsigned int len;
        public String data;
    }

    @Type(noCCodeGeneration=true, cType="enum nfs4_change_attr_type")
    public static enum nfs4_change_attr_type implements Enum<nfs4_change_attr_type>,
    TypedEnum<nfs4_change_attr_type, Integer>
    {
        NFS4_CHANGE_TYPE_IS_MONOTONIC_INCR,
        NFS4_CHANGE_TYPE_IS_VERSION_COUNTER,
        NFS4_CHANGE_TYPE_IS_VERSION_COUNTER_NOPNFS,
        NFS4_CHANGE_TYPE_IS_TIME_METADATA,
        NFS4_CHANGE_TYPE_IS_UNDEFINED;

    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_stateid_struct")
    @NotUsableInJava
    public static class nfs4_stateid_struct
    extends Struct {
        @InlineUnion(value=10680)
        public @InlineUnion(value=10680) char @Size(value=16) [] data;
        @InlineUnion(value=10680)
        public  @InlineUnion(value=10680) AnonDefinitions.anon_member_of_anon_member_of_nfs4_stateid_and_anon_member_of_nfs4_stateid_struct anon0$1;
        public TypeDefinitions.type_of_nfs4_stateid_and_type_of_nfs4_stateid_struct type;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 data[8]; }")
    @NotUsableInJava
    public static class nfs4_verifier
    extends Struct {
        public char @Size(value=8) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_label")
    @NotUsableInJava
    public static class nfs4_label
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int lfs;
        public @Unsigned @OriginalName(value="uint32_t") int pi;
        public @Unsigned int len;
        public String label;
    }

    @Type(noCCodeGeneration=true, cType="struct nfs4_lock_info")
    @NotUsableInJava
    public static class nfs4_lock_info
    extends Struct {
        public Ptr<nfs4_lock_state> owner;
    }
}

