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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlkcgDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ElevatorDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SavedDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.ThrotlDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RequestDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__request_region($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<runtime.resource> __request_region(Ptr<runtime.resource> parent, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long n, String name, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__request_region_locked($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int __request_region_locked(Ptr<runtime.resource> res, Ptr<runtime.resource> parent, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long n, String name, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> __request_resource(Ptr<runtime.resource> root, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_free_mem_region($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.resource> request_free_mem_region(Ptr<runtime.resource> base, @Unsigned long size, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_master_key($arg1, (const u8**)$arg2, $arg3)")
    public static Ptr<runtime.key> request_master_key(Ptr<misc.encrypted_key_payload> epayload, Ptr<Ptr<Character>> master_key, Ptr<@Unsigned Long> master_keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int request_resource(Ptr<runtime.resource> root, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> request_resource_conflict(Ptr<runtime.resource> root, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_request_firmware((const struct firmware**)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int _request_firmware(Ptr<Ptr<runtime.firmware>> firmware_p, String name, Ptr<runtime.device> device2, Ptr<?> buf, @Unsigned long size, @Unsigned long offset, @Unsigned int opt_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_request_firmware_nowait($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, (void (*)(const struct firmware*, void*))$arg7, $arg8)")
    public static int _request_firmware_nowait(Ptr<runtime.module> module2, boolean uevent, String name, Ptr<runtime.device> device2, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<?> context2, Ptr<?> cont, boolean nowarn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_firmware((const struct firmware**)$arg1, (const u8*)$arg2, $arg3)")
    public static int request_firmware(Ptr<Ptr<runtime.firmware>> firmware_p, String name, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_firmware_direct((const struct firmware**)$arg1, (const u8*)$arg2, $arg3)")
    public static int request_firmware_direct(Ptr<Ptr<runtime.firmware>> firmware_p, String name, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_firmware_into_buf((const struct firmware**)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int request_firmware_into_buf(Ptr<Ptr<runtime.firmware>> firmware_p, String name, Ptr<runtime.device> device2, Ptr<?> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_firmware_nowait($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, (void (*)(const struct firmware*, void*))$arg7)")
    public static int request_firmware_nowait(Ptr<runtime.module> module2, boolean uevent, String name, Ptr<runtime.device> device2, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<?> context2, Ptr<?> cont) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void request_firmware_work_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_auth_describe((const struct key*)$arg1, $arg2)")
    public static void request_key_auth_describe(Ptr<runtime.key> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void request_key_auth_destroy(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void request_key_auth_free_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int request_key_auth_instantiate(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_auth_new($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static Ptr<runtime.key> request_key_auth_new(Ptr<runtime.key> target, String op, Ptr<?> callout_info, @Unsigned long callout_len, Ptr<runtime.key> dest_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int request_key_auth_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void request_key_auth_rcu_disposal(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_auth_read((const struct key*)$arg1, $arg2, $arg3)")
    public static long request_key_auth_read(Ptr<runtime.key> key2, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void request_key_auth_revoke(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.ucode_state request_microcode_fw(int cpu2, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_partial_firmware_into_buf((const struct firmware**)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int request_partial_firmware_into_buf(Ptr<Ptr<runtime.firmware>> firmware_p, String name, Ptr<runtime.device> device2, Ptr<?> buf, @Unsigned long size, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__request_module($arg1, (const u8*)$arg2, $arg3_)")
    public static int __request_module(boolean wait, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__request_percpu_irq($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int __request_percpu_irq(@Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long flags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_any_context_irq($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int request_any_context_irq(@Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long flags, String name, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.key> request_asymmetric_key(Ptr<runtime.key> keyring, @Unsigned @OriginalName(value="uint32_t") int keyid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_dma($arg1, (const u8*)$arg2)")
    public static int request_dma(@Unsigned int dmanr, String device_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_and_link($arg1, (const u8*)$arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<runtime.key> request_key_and_link(Ptr<KeyDefinitions.key_type> type2, String description, Ptr<KeyDefinitions.key_tag> domain_tag, Ptr<?> callout_info, @Unsigned long callout_len, Ptr<?> aux, Ptr<runtime.key> dest_keyring, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_rcu($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.key> request_key_rcu(Ptr<KeyDefinitions.key_type> type2, String description, Ptr<KeyDefinitions.key_tag> domain_tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_tag($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.key> request_key_tag(Ptr<KeyDefinitions.key_type> type2, String description, Ptr<KeyDefinitions.key_tag> domain_tag, String callout_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_key_with_auxdata($arg1, (const u8*)$arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static Ptr<runtime.key> request_key_with_auxdata(Ptr<KeyDefinitions.key_type> type2, String description, Ptr<KeyDefinitions.key_tag> domain_tag, Ptr<?> callout_info, @Unsigned long callout_len, Ptr<?> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.ucode_state request_microcode_amd(int cpu2, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_nmi($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int request_nmi(@Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String name, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_percpu_nmi($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int request_percpu_nmi(@Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, String name, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_threaded_irq($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int request_threaded_irq(@Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, @OriginalName(value="irq_handler_t") Ptr<?> thread_fn, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="request_trusted_key((const u8*)$arg1, (const u8**)$arg2, $arg3)")
    public static Ptr<runtime.key> request_trusted_key(String trusted_desc, Ptr<Ptr<Character>> master_key, Ptr<@Unsigned Long> master_keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void request_wait_answer(Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct request_sock__safe_rcu_or_null")
    @NotUsableInJava
    public static class request_sock__safe_rcu_or_null
    extends Struct {
        public Ptr<runtime.sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="struct request_sense")
    @NotUsableInJava
    public static class request_sense
    extends Struct {
        public char error_code;
        public char valid;
        public char segment_number;
        public char sense_key;
        public char reserved2;
        public char ili;
        public char reserved1;
        public char @Size(value=4) [] information;
        public char add_sense_len;
        public char @Size(value=4) [] command_info;
        public char asc;
        public char ascq;
        public char fruc;
        public char @Size(value=3) [] sks;
        public char @Size(value=46) [] asb;
    }

    @Type(noCCodeGeneration=true, cType="struct request_sock_queue")
    @NotUsableInJava
    public static class request_sock_queue
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock rskq_lock;
        public char rskq_defer_accept;
        public @Unsigned int synflood_warned;
        public AtomicDefinitions.atomic_t qlen;
        public AtomicDefinitions.atomic_t young;
        public Ptr<request_sock> rskq_accept_head;
        public Ptr<request_sock> rskq_accept_tail;
        public misc.fastopen_queue fastopenq;
    }

    @Type(noCCodeGeneration=true, cType="struct request_key_auth")
    @NotUsableInJava
    public static class request_key_auth
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<runtime.key> target_key;
        public Ptr<runtime.key> dest_keyring;
        public Ptr<runtime.cred> cred;
        public Ptr<?> callout_info;
        public @Unsigned long callout_len;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=8) [] op;
    }

    @Type(noCCodeGeneration=true, cType="struct request_sock")
    @NotUsableInJava
    public static class request_sock
    extends Struct {
        public SockDefinitions.sock_common __req_common;
        public Ptr<request_sock> dl_next;
        public @Unsigned short mss;
        public char num_retrans;
        public char syncookie;
        public char num_timeout;
        public @Unsigned int ts_recent;
        public TimerDefinitions.timer_list rsk_timer;
        public Ptr<request_sock_ops> rsk_ops;
        public Ptr<runtime.sock> sk;
        public Ptr<SavedDefinitions.saved_syn> saved_syn;
        public @Unsigned int secid;
        public @Unsigned int peer_secid;
        public @Unsigned int timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct request_sock_ops")
    @NotUsableInJava
    public static class request_sock_ops
    extends Struct {
        public int family;
        public @Unsigned int obj_size;
        public Ptr<KmemDefinitions.kmem_cache> slab;
        public String slab_name;
        public Ptr<?> rtx_syn_ack;
        public Ptr<?> send_ack;
        public Ptr<?> send_reset;
        public Ptr<?> destructor;
        public Ptr<?> syn_ack_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct request_queue")
    @NotUsableInJava
    public static class request_queue
    extends Struct {
        public Ptr<?> queuedata;
        public Ptr<ElevatorDefinitions.elevator_queue> elevator;
        public Ptr<BlkDefinitions.blk_mq_ops> mq_ops;
        public Ptr<BlkDefinitions.blk_mq_ctx> queue_ctx;
        public @Unsigned long queue_flags;
        public @Unsigned int rq_timeout;
        public @Unsigned int queue_depth;
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public @Unsigned int nr_hw_queues;
        public runtime.xarray hctx_table;
        public PercpuDefinitions.percpu_ref q_usage_counter;
        public LockDefinitions.lock_class_key io_lock_cls_key;
        public misc.lockdep_map io_lockdep_map;
        public LockDefinitions.lock_class_key q_lock_cls_key;
        public misc.lockdep_map q_lockdep_map;
        public Ptr<runtime.request> last_merge;
        public  @OriginalName(value="spinlock_t") runtime.spinlock queue_lock;
        public int quiesce_depth;
        public Ptr<runtime.gendisk> disk;
        public Ptr<runtime.kobject> mq_kobj;
        public QueueDefinitions.queue_limits limits;
        public Ptr<runtime.device> dev;
        public RpmDefinitions.rpm_status rpm_status;
        public AtomicDefinitions.atomic_t pm_only;
        public Ptr<BlkDefinitions.blk_queue_stats> stats;
        public Ptr<RqDefinitions.rq_qos> rq_qos;
        public runtime.mutex rq_qos_mutex;
        public int id;
        public @Unsigned long nr_requests;
        public Ptr<BlkDefinitions.blk_crypto_profile> crypto_profile;
        public Ptr<runtime.kobject> crypto_kobject;
        public TimerDefinitions.timer_list timeout;
        public misc.work_struct timeout_work;
        public AtomicDefinitions.atomic_t nr_active_requests_shared_tags;
        public Ptr<BlkDefinitions.blk_mq_tags> sched_shared_tags;
        public ListDefinitions.list_head icq_list;
        public @Unsigned long @Size(value=1) [] blkcg_pols;
        public Ptr<BlkcgDefinitions.blkcg_gq> root_blkg;
        public ListDefinitions.list_head blkg_list;
        public runtime.mutex blkcg_mutex;
        public int node;
        public  @OriginalName(value="spinlock_t") runtime.spinlock requeue_lock;
        public ListDefinitions.list_head requeue_list;
        public DelayedDefinitions.delayed_work requeue_work;
        public Ptr<BlkDefinitions.blk_trace> blk_trace;
        public Ptr<BlkDefinitions.blk_flush_queue> fq;
        public ListDefinitions.list_head flush_list;
        public runtime.mutex sysfs_lock;
        public runtime.mutex sysfs_dir_lock;
        public runtime.mutex limits_lock;
        public ListDefinitions.list_head unused_hctx_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock unused_hctx_lock;
        public int mq_freeze_depth;
        public Ptr<ThrotlDefinitions.throtl_data> td;
        public misc.callback_head callback_head;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head mq_freeze_wq;
        public runtime.mutex mq_freeze_lock;
        public Ptr<BlkDefinitions.blk_mq_tag_set> tag_set;
        public ListDefinitions.list_head tag_set_list;
        public Ptr<runtime.dentry> debugfs_dir;
        public Ptr<runtime.dentry> sched_debugfs_dir;
        public Ptr<runtime.dentry> rqos_debugfs_dir;
        public runtime.mutex debugfs_mutex;
        public boolean mq_sysfs_init_done;
    }
}

