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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.IcmpDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RawDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __raw_read_lock_irqsave(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __raw_spin_lock_irqsave(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __raw_write_lock_irqsave(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_lock(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_lock_bh(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_lock_irq(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _raw_read_lock_irqsave(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _raw_read_trylock(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_unlock(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_unlock_bh(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_unlock_irq(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_read_unlock_irqrestore(Ptr<misc.rwlock_t> lock, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_lock(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_lock_bh(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_lock_irq(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _raw_spin_lock_irqsave(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _raw_spin_rq_lock_irqsave(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _raw_spin_trylock(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _raw_spin_trylock_bh(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_unlock(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_unlock_bh(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_unlock_irq(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_spin_unlock_irqrestore(Ptr<@OriginalName(value="raw_spinlock_t") raw_spinlock> lock, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_lock(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_lock_bh(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_lock_irq(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _raw_write_lock_irqsave(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_lock_nested(Ptr<misc.rwlock_t> lock, int subclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _raw_write_trylock(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_unlock(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_unlock_bh(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_unlock_irq(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _raw_write_unlock_irqrestore(Ptr<misc.rwlock_t> lock, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_abort(Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_bind(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_destroy(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> raw_get_first(Ptr<SeqDefinitions.seq_file> seq, int bucket2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> raw_get_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_getfrag(Ptr<?> from, String to, int offset, int len, int odd, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_hash_sk(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_icmp_error(Ptr<SkDefinitions.sk_buff> skb, int protocol, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<Integer> karg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_local_deliver(Ptr<SkDefinitions.sk_buff> skb, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_proc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="raw_send_hdrinc($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct sockcm_cookie*)$arg7)")
    public static int raw_send_hdrinc(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4, Ptr<runtime.msghdr> msg, @Unsigned long length, Ptr<Ptr<runtime.rtable>> rtp, @Unsigned int flags, Ptr<misc.sockcm_cookie> sockc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> raw_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> raw_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_seticmpfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_sk_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_sysctl_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_unhash_sk(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="raw_v4_input($arg1, $arg2, (const struct iphdr*)$arg3, $arg4)")
    public static int raw_v4_input(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.iphdr> iph, int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="raw_v4_match($arg1, (const struct sock*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static boolean raw_v4_match(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, @Unsigned short num, @Unsigned @OriginalName(value="__be32") int raddr, @Unsigned @OriginalName(value="__be32") int laddr, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_pci_read(@Unsigned int domain, @Unsigned int bus, @Unsigned int devfn, int reg, int len, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_pci_write(@Unsigned int domain, @Unsigned int bus, @Unsigned int devfn, int reg, int len, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_spin_rq_lock_nested(Ptr<runtime.rq> rq2, int subclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean raw_spin_rq_trylock(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_spin_rq_unlock(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)raw_tp_prog_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> raw_tp_prog_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="raw_tp_prog_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean raw_tp_prog_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="raw_tp_writable_prog_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean raw_tp_writable_prog_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="raw_v6_match($arg1, (const struct sock*)$arg2, $arg3, (const struct in6_addr*)$arg4, (const struct in6_addr*)$arg5, $arg6, $arg7)")
    public static boolean raw_v6_match(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, @Unsigned short num, Ptr<In6Definitions.in6_addr> loc_addr, Ptr<In6Definitions.in6_addr> rmt_addr, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __raw_xsave_addr(Ptr<misc.xregs_state> xsave, int xfeature_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void raw_irqentry_exit_cond_resched() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_notifier_call_chain(Ptr<raw_notifier_head> nh, @Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_notifier_call_chain_robust(Ptr<raw_notifier_head> nh, @Unsigned long val_up, @Unsigned long val_down, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_notifier_chain_register(Ptr<raw_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int raw_notifier_chain_unregister(Ptr<raw_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct raw_frag_vec")
    @NotUsableInJava
    public static class raw_frag_vec
    extends Struct {
        public Ptr<runtime.msghdr> msg;
        public misc.hdr_of_raw_frag_vec hdr;
        public int hlen;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_sock")
    @NotUsableInJava
    public static class raw_sock
    extends Struct {
        public InetDefinitions.inet_sock inet;
        public IcmpDefinitions.icmp_filter filter;
        public @Unsigned int ipmr_table;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_iter_state")
    @NotUsableInJava
    public static class raw_iter_state
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public int bucket;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_hwp_page")
    @NotUsableInJava
    public static class raw_hwp_page
    extends Struct {
        public misc.llist_node node;
        public Ptr<runtime.page> page;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_data_entry")
    @NotUsableInJava
    public static class raw_data_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned int id;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_hashinfo")
    @NotUsableInJava
    public static class raw_hashinfo
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_head @Size(value=256) [] ht;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int raw1; long unsigned int raw2; }")
    @NotUsableInJava
    public static class raw_of_anon_member_of_bpf_reg_state
    extends Struct {
        public @Unsigned long raw1;
        public @Unsigned long raw2;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int encoding; short unsigned int parity; }")
    @NotUsableInJava
    public static class raw_hdlc_proto
    extends Struct {
        public @Unsigned short encoding;
        public @Unsigned short parity;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int tp_name; unsigned int tp_name_len; }")
    @NotUsableInJava
    public static class raw_tracepoint_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long tp_name;
        public @Unsigned int tp_name_len;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_notifier_head")
    @NotUsableInJava
    public static class raw_notifier_head
    extends Struct {
        public Ptr<misc.notifier_block> head;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int name; unsigned int prog_fd; long long unsigned int cookie; }")
    @NotUsableInJava
    public static class raw_tracepoint_of_bpf_attr
    extends Struct {
        public @Unsigned long name;
        public @Unsigned int prog_fd;
        public @Unsigned long cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct raw_spinlock")
    @NotUsableInJava
    public static class raw_spinlock
    extends Struct {
        public  @OriginalName(value="arch_spinlock_t") runtime.qspinlock raw_lock;
    }
}

