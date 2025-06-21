/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.ConfigfsDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FutexDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovaDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.OldDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScmDefinitions;
import me.bechberger.ebpf.runtime.SeccompDefinitions;
import me.bechberger.ebpf.runtime.Seg6Definitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class PutDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_mountpoint(Ptr<runtime.mountpoint> mp, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_partials(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> partial_slab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_anon_vma(Ptr<AnonDefinitions.anon_vma> anon_vma2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_child(Ptr<KeyDefinitions.key_vector> tn, @Unsigned long i, Ptr<KeyDefinitions.key_vector> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_cmsg_compat(Ptr<runtime.msghdr> kmsg, int level, int type2, int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_cpu_partial(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, int drain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_cred_many((const struct cred*)$arg1, $arg2)")
    public static void put_cred_many(Ptr<runtime.cred> _cred, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_crypt_info(Ptr<FscryptDefinitions.fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String put_dec(String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String put_dec_full8(String buf, @Unsigned int r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String put_dec_trunc8(String buf, @Unsigned int r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_free_entry_locked(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_io_context(Ptr<IoDefinitions.io_context> ioc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_ipc_ns(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_itimerspec64((const struct itimerspec64*)$arg1, $arg2)")
    public static int put_itimerspec64(Ptr<runtime.itimerspec64> it, Ptr<KernelDefinitions.__kernel_itimerspec> uit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_mnt_ns(Ptr<MntDefinitions.mnt_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_ndd(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_nsset(Ptr<runtime.nsset> nsset2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_old_itimerspec32((const struct itimerspec64*)$arg1, $arg2)")
    public static int put_old_itimerspec32(Ptr<runtime.itimerspec64> its, Ptr<OldDefinitions.old_itimerspec32> uits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_old_timespec32((const struct timespec64*)$arg1, $arg2)")
    public static int put_old_timespec32(Ptr<runtime.timespec64> ts, Ptr<?> uts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_old_timex32($arg1, (const struct __kernel_timex*)$arg2)")
    public static int put_old_timex32(Ptr<OldDefinitions.old_timex32> utp, Ptr<KernelDefinitions.__kernel_timex> txc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_packet(String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_page_bootmem(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_partials(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_partition(Ptr<misc.parsed_partitions> p, int n, @Unsigned @OriginalName(value="sector_t") long from, @Unsigned @OriginalName(value="sector_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_pid_ns(Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_entity(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_probe_ref() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_sg_io_hdr((const struct sg_io_hdr*)$arg1, $arg2)")
    public static int put_sg_io_hdr(Ptr<SgDefinitions.sg_io_hdr> hdr, Ptr<?> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_task_struct(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_timespec64((const struct timespec64*)$arg1, $arg2)")
    public static int put_timespec64(Ptr<runtime.timespec64> ts, Ptr<KernelDefinitions.__kernel_timespec> uts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_user_ifreq(Ptr<runtime.ifreq> ifr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __put_devmap_managed_folio_refs(Ptr<runtime.folio> folio2, int refs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_task_struct(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_task_struct_rcu_cb(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_ns(Ptr<UserDefinitions.user_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_entry((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static int put_entry(Ptr<?> buf, @Unsigned long bytes, @Unsigned long num, Ptr<PolicyDefinitions.policy_file> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_fb_info(Ptr<FbDefinitions.fb_info> fb_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_fragment(Ptr<ConfigfsDefinitions.configfs_fragment> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_bpf(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_counters(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_flavors(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_iif(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_nh4(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_nh6(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_oif(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_srh(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_table(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_nla_vrftable(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_online_mems() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_task_stop(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_rng(Ptr<runtime.hwrng> rng) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_task_stack(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_tree_ref(Ptr<AuditDefinitions.audit_context> ctx, Ptr<AuditDefinitions.audit_chunk> chunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_anon_vma(Ptr<AnonDefinitions.anon_vma> anon_vma2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_cred(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_seccomp_filter(Ptr<SeccompDefinitions.seccomp_filter> orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_watch_queue(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_aio_ring_file(Ptr<runtime.kioctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_callchain_buffers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_callchain_entry(int rctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_compat_rusage((const struct rusage*)$arg1, $arg2)")
    public static int put_compat_rusage(Ptr<runtime.rusage> r, Ptr<CompatDefinitions.compat_rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_cred_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_files_struct(Ptr<misc.files_struct> files) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_iova_domain(Ptr<IovaDefinitions.iova_domain> iovad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_links(Ptr<misc.ctl_table_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_memory_type(Ptr<MemoryDefinitions.memory_dev_type> memtype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_pid(Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_reqs_available(Ptr<runtime.kioctx> ctx, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_task_struct_rcu_user(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_ucounts(Ptr<runtime.ucounts> ucounts2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_unused_fd(@Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_uprobe(Ptr<runtime.uprobe> uprobe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_watch_queue(Ptr<WatchDefinitions.watch_queue> wqueue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_xdp_frags(Ptr<XdpDefinitions.xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_chunk(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_super(Ptr<SuperDefinitions.super_block> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_system(Ptr<EventDefinitions.event_subsystem> system) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_system_dir(Ptr<TraceDefinitions.trace_subsystem_dir> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_4() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_8() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_nocheck_1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_nocheck_2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_nocheck_4() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __put_user_nocheck_8() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="put_chars($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long put_chars(@Unsigned int vtermno, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_cmsg(Ptr<runtime.msghdr> msg, int level, int type2, int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_cmsg_scm_timestamping(Ptr<runtime.msghdr> msg, Ptr<ScmDefinitions.scm_timestamping_internal> tss_internal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_cmsg_scm_timestamping64(Ptr<runtime.msghdr> msg, Ptr<ScmDefinitions.scm_timestamping_internal> tss_internal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_compat_statfs(Ptr<CompatDefinitions.compat_statfs> ubuf, Ptr<runtime.kstatfs> kbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int put_compat_statfs64(Ptr<CompatDefinitions.compat_statfs64> ubuf, Ptr<runtime.kstatfs> kbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_css_set_locked(Ptr<CssDefinitions.css_set> cset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_ctx(Ptr<PerfDefinitions.perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_dax(Ptr<DaxDefinitions.dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_filesystem(Ptr<FileDefinitions.file_system_type> fs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean put_page_back_buddy(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_pages_list(Ptr<ListDefinitions.list_head> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_pi_state(Ptr<FutexDefinitions.futex_pi_state> pi_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_pmu_ctx(Ptr<PerfDefinitions.perf_event_pmu_context> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_task_dl(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_task_idle(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_task_rt(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_prev_task_scx(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_queue(Ptr<VcDefinitions.vc_data> vc2, int ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_swap_folio(Ptr<runtime.folio> folio2, misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_tree(Ptr<AuditDefinitions.audit_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void put_unbound_pool(Ptr<misc.worker_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }
}

