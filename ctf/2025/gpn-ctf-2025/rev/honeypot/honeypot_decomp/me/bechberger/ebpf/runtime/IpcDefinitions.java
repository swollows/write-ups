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
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IpcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_addid(Ptr<ipc_ids> ids, Ptr<misc.kern_ipc_perm> _new, int limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.kern_ipc_perm> ipc_findkey(Ptr<ipc_ids> ids, @OriginalName(value="key_t") int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_idr_alloc(Ptr<ipc_ids> ids, Ptr<misc.kern_ipc_perm> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipc_init_ids(Ptr<ipc_ids> ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipc_init_proc_interface((const u8*)$arg1, (const u8*)$arg2, $arg3, (int (*)(struct seq_file*, void*))$arg4)")
    public static void ipc_init_proc_interface(String path2, String header, int ids, Ptr<?> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipc_kht_remove(Ptr<ipc_ids> ids, Ptr<misc.kern_ipc_perm> ipcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_ns_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.kern_ipc_perm> ipc_obtain_object_check(Ptr<ipc_ids> ids, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.kern_ipc_perm> ipc_obtain_object_idr(Ptr<ipc_ids> ids, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipc_rcu_getref(Ptr<misc.kern_ipc_perm> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipc_rcu_putref($arg1, (void (*)(struct callback_head*))$arg2)")
    public static void ipc_rcu_putref(Ptr<misc.kern_ipc_perm> ptr, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipc_rmid(Ptr<ipc_ids> ids, Ptr<misc.kern_ipc_perm> ipcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PidDefinitions.pid_namespace> ipc_seq_pid_ns(Ptr<SeqDefinitions.seq_file> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipc_set_key_private(Ptr<ipc_ids> ids, Ptr<misc.kern_ipc_perm> ipcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_update_perm(Ptr<misc.ipc64_perm> in, Ptr<misc.kern_ipc_perm> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_mni_extend(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipc_permissions($arg1, (const struct ctl_table*)$arg2)")
    public static int ipc_permissions(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipc_set_ownership(Ptr<misc.ctl_table_header> head, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipc_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_proc_iter")
    @NotUsableInJava
    public static class ipc_proc_iter
    extends Struct {
        public Ptr<ipc_namespace> ns;
        public Ptr<PidDefinitions.pid_namespace> pid_ns;
        public Ptr<ipc_proc_iface> iface;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_proc_iface")
    @NotUsableInJava
    public static class ipc_proc_iface
    extends Struct {
        public String path;
        public String header;
        public int ids;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_security_struct")
    @NotUsableInJava
    public static class ipc_security_struct
    extends Struct {
        public @Unsigned short sclass;
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_ops")
    @NotUsableInJava
    public static class ipc_ops
    extends Struct {
        public Ptr<?> getnew;
        public Ptr<?> associate;
        public Ptr<?> more_checks;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_params")
    @NotUsableInJava
    public static class ipc_params
    extends Struct {
        public @OriginalName(value="key_t") int key;
        public int flg;
        public UDefinitions.u_of_ipc_params u;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_perm")
    @NotUsableInJava
    public static class ipc_perm
    extends Struct {
        public @OriginalName(value="__kernel_key_t") int key;
        public @Unsigned @OriginalName(value="__kernel_uid_t") int uid;
        public @Unsigned @OriginalName(value="__kernel_gid_t") int gid;
        public @Unsigned @OriginalName(value="__kernel_uid_t") int cuid;
        public @Unsigned @OriginalName(value="__kernel_gid_t") int cgid;
        public @Unsigned @OriginalName(value="__kernel_mode_t") int mode;
        public @Unsigned short seq;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_ids")
    @NotUsableInJava
    public static class ipc_ids
    extends Struct {
        public int in_use;
        public @Unsigned short seq;
        public misc.rw_semaphore rwsem;
        public runtime.idr ipcs_idr;
        public int max_idx;
        public int last_idx;
        public int next_id;
        public runtime.rhashtable key_ht;
    }

    @Type(noCCodeGeneration=true, cType="struct ipc_namespace")
    @NotUsableInJava
    public static class ipc_namespace
    extends Struct {
        public ipc_ids @Size(value=3) [] ids;
        public int @Size(value=4) [] sem_ctls;
        public int used_sems;
        public @Unsigned int msg_ctlmax;
        public @Unsigned int msg_ctlmnb;
        public @Unsigned int msg_ctlmni;
        public PercpuDefinitions.percpu_counter percpu_msg_bytes;
        public PercpuDefinitions.percpu_counter percpu_msg_hdrs;
        public @Unsigned long shm_ctlmax;
        public @Unsigned long shm_ctlall;
        public @Unsigned long shm_tot;
        public int shm_ctlmni;
        public int shm_rmid_forced;
        public misc.notifier_block ipcns_nb;
        public Ptr<runtime.vfsmount> mq_mnt;
        public @Unsigned int mq_queues_count;
        public @Unsigned int mq_queues_max;
        public @Unsigned int mq_msg_max;
        public @Unsigned int mq_msgsize_max;
        public @Unsigned int mq_msg_default;
        public @Unsigned int mq_msgsize_default;
        public misc.ctl_table_set mq_set;
        public Ptr<misc.ctl_table_header> mq_sysctls;
        public misc.ctl_table_set ipc_set;
        public Ptr<misc.ctl_table_header> ipc_sysctls;
        public Ptr<UserDefinitions.user_namespace> user_ns;
        public Ptr<runtime.ucounts> ucounts;
        public misc.llist_node mnt_llist;
        public NsDefinitions.ns_common ns;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { unsigned int val; } uid; struct { unsigned int val; } gid; short unsigned int mode; unsigned int osid; int has_perm; unsigned int perm_uid; unsigned int perm_gid; short unsigned int perm_mode; long unsigned int qbytes; }")
    @NotUsableInJava
    public static class ipc_of_anon_member_of_audit_context
    extends Struct {
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public @Unsigned int osid;
        public int has_perm;
        public @Unsigned @OriginalName(value="uid_t") int perm_uid;
        public @Unsigned @OriginalName(value="gid_t") int perm_gid;
        public @Unsigned @OriginalName(value="umode_t") short perm_mode;
        public @Unsigned long qbytes;
    }
}

