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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SpliceDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SockDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sock_create(Ptr<runtime.net> net2, int family, int type2, int protocol, Ptr<Ptr<runtime.socket>> res, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> __sock_hash_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_recv_cmsgs(Ptr<runtime.msghdr> msg, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_recv_timestamp(Ptr<runtime.msghdr> msg, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_recv_wifi_status(Ptr<runtime.msghdr> msg, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_release(Ptr<runtime.socket> sock2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_tx_timestamp(@Unsigned short tsflags, Ptr<Character> tx_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.socket> sock_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_alloc_file($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.file> sock_alloc_file(Ptr<runtime.socket> sock2, int flags, String dname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> sock_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_close(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_create(int family, int type2, int protocol, Ptr<Ptr<runtime.socket>> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_create_kern(Ptr<runtime.net> net2, int family, int type2, int protocol, Ptr<Ptr<runtime.socket>> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_create_lite(int family, int type2, int protocol, Ptr<Ptr<runtime.socket>> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sock_do_ioctl(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_fasync(int fd2, Ptr<runtime.file> filp, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.socket> sock_from_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> sock_hash_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_shtab_elem> sock_hash_alloc_elem(Ptr<BpfDefinitions.bpf_shtab> htab, Ptr<?> key2, @Unsigned int key_size, @Unsigned int hash2, Ptr<runtime.sock> sk, Ptr<BpfDefinitions.bpf_shtab_elem> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sock_hash_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_hash_fini_seq_private(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_hash_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_hash_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> key_next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_hash_init_seq_private(Ptr<?> priv_data, Ptr<BpfDefinitions.bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_hash_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_shtab_elem> sock_hash_lookup_elem_raw(Ptr<misc.hlist_head> head, @Unsigned int hash2, Ptr<?> key2, @Unsigned int key_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_hash_lookup_sys(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_hash_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long sock_hash_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_hash_release_progs(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_hash_seq_find_next(Ptr<sock_hash_seq_info> info2, Ptr<BpfDefinitions.bpf_shtab_elem> prev_elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_hash_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_hash_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_hash_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_hash_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_hash_update_common(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<runtime.sock> sk, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sock_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sock_is_registered(int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> sock_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_bpf_prog_query((const union bpf_attr*)$arg1, $arg2)")
    public static int sock_map_bpf_prog_query(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sock_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_destroy(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_fini_seq_private(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_get_from_fd((const union bpf_attr*)$arg1, $arg2)")
    public static int sock_map_get_from_fd(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_init_seq_private(Ptr<?> priv_data, Ptr<BpfDefinitions.bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_iter_attach_target(Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_iter_link_info> linfo, Ptr<BpfDefinitions.bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_iter_detach_target(Ptr<BpfDefinitions.bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_link(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_link_create((const union bpf_attr*)$arg1, $arg2)")
    public static int sock_map_link_create(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_link_dealloc(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_link_detach(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_link_fill_info((const struct bpf_link*)$arg1, $arg2)")
    public static int sock_map_link_fill_info(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_link_release(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void sock_map_link_show_fdinfo(Ptr<BpfDefinitions.bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_link_update_prog(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_prog> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_map_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_map_lookup_sys(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long sock_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_prog_detach((const union bpf_attr*)$arg1, $arg2)")
    public static int sock_map_prog_detach(Ptr<BpfDefinitions.bpf_attr> attr2, BpfDefinitions.bpf_prog_type ptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_prog_link_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<Ptr<Ptr<BpfDefinitions.bpf_prog>>> pprog, Ptr<Ptr<Ptr<BpfDefinitions.bpf_link>>> plink, @Unsigned int which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_prog_update(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_prog> old, Ptr<BpfDefinitions.bpf_link> link2, @Unsigned int which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_release_progs(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_remove_links(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_map_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_map_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_map_sk_state_allowed((const struct sock*)$arg1)")
    public static boolean sock_map_sk_state_allowed(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_unhash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_map_unref(Ptr<runtime.sock> sk, Ptr<?> link_raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_update_common(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned int idx, Ptr<runtime.sock> sk, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sock_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_map_update_elem_sys(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int sock_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_put(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sock_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_register((const struct net_proto_family*)$arg1)")
    public static int sock_register(Ptr<NetDefinitions.net_proto_family> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_reset_flag(Ptr<runtime.sock> sk, sock_flags flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_flag(Ptr<runtime.sock> sk, sock_flags flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_splice_eof(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sock_splice_read(Ptr<runtime.file> file2, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_unregister(int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_wake_async(Ptr<misc.socket_wq> wq, int how, int band) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sock_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sock_cmsg_send(Ptr<runtime.sock> sk, Ptr<runtime.cmsghdr> cmsg, Ptr<misc.sockcm_cookie> sockc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __sock_gen_cookie(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __sock_i_ino(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sock_queue_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_set_timestamps(Ptr<runtime.sock> sk, boolean val, boolean _new, boolean ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sock_wfree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> sock_alloc_send_pskb(Ptr<runtime.sock> sk, @Unsigned long header_len, @Unsigned long data_len, int noblock, Ptr<Integer> errcode, int max_page_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_bind_add(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_bindtoindex(Ptr<runtime.sock> sk, int ifindex, boolean lock_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_bindtoindex_locked(Ptr<runtime.sock> sk, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_cmsg_send(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<misc.sockcm_cookie> sockc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_common_getsockopt(Ptr<runtime.socket> sock2, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_common_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_common_setsockopt(Ptr<runtime.socket> sock2, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_copy($arg1, (const struct sock*)$arg2)")
    public static void sock_copy(Ptr<runtime.sock> nsk, Ptr<runtime.sock> osk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_copy_user_timeval(Ptr<KernelDefinitions.__kernel_sock_timeval> tv, misc.sockptr_t optval, int optlen, boolean old_timeval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_def_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_def_error_report(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_def_readable(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_def_wakeup(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_def_write_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_devmem_dontneed(Ptr<runtime.sock> sk, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_diag_bind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_diag_broadcast_destroy(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_diag_broadcast_destroy_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_diag_check_cookie($arg1, (const unsigned int*)$arg2)")
    public static int sock_diag_check_cookie(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_diag_destroy(Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_diag_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_diag_put_filterinfo(boolean may_report_filterinfo, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int attrtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_diag_put_meminfo(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int attrtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_diag_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_diag_rcv_msg(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_diag_register((const struct sock_diag_handler*)$arg1)")
    public static int sock_diag_register(Ptr<sock_diag_handler> hndl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_diag_register_inet_compat((const struct sock_diag_inet_compat*)$arg1)")
    public static void sock_diag_register_inet_compat(Ptr<sock_diag_inet_compat> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_diag_save_cookie(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_diag_unregister((const struct sock_diag_handler*)$arg1)")
    public static void sock_diag_unregister(Ptr<sock_diag_handler> hndl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_diag_unregister_inet_compat((const struct sock_diag_inet_compat*)$arg1)")
    public static void sock_diag_unregister_inet_compat(Ptr<sock_diag_inet_compat> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_edemux(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_efree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_enable_timestamp(Ptr<runtime.sock> sk, sock_flags flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_enable_timestamps(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_gen_put(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_get_timeout(long timeo, Ptr<?> optval, boolean old_timeval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_gettstamp(Ptr<runtime.socket> sock2, Ptr<?> userstamp, boolean timeval2, boolean time32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_has_perm(Ptr<runtime.sock> sk, @Unsigned int perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sock_i_ino(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.kuid_t sock_i_uid(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_init_data(Ptr<runtime.socket> sock2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_init_data_uid(Ptr<runtime.socket> sock2, Ptr<runtime.sock> sk, misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_inuse_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_inuse_get(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_inuse_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_ioctl_inout(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<?> arg2, Ptr<?> karg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_kfree_s(Ptr<runtime.sock> sk, Ptr<?> mem, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sock_kmalloc(Ptr<runtime.sock> sk, int size, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_kzfree_s(Ptr<runtime.sock> sk, Ptr<?> mem, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_load_diag_module(int family, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock, Ptr<ProtoDefinitions.proto_accept_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> saddr, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> saddr, int len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_getname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> saddr, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_no_linger(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_mmap(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> m, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> m, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_sendmsg_locked(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> m, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_shutdown(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_no_socketpair(Ptr<runtime.socket> sock1, Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_ofree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> sock_omalloc(Ptr<runtime.sock> sk, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_pfree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_prot_inuse_get(Ptr<runtime.net> net2, Ptr<runtime.proto> prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_queue_rcv_skb_reason(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkbDefinitions.skb_drop_reason> reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_recv_errqueue(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int len, int level, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_rfree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_keepalive(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_mark(Ptr<runtime.sock> sk, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_priority(Ptr<runtime.sock> sk, @Unsigned int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_rcvbuf(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_reuseaddr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_reuseport(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_sndtimeo(Ptr<runtime.sock> sk, long secs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_set_timeout(Ptr<Long> timeo_p, misc.sockptr_t optval, int optlen, boolean old_timeval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_set_timestamp(Ptr<runtime.sock> sk, int optname, boolean valbool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_set_timestamping(Ptr<runtime.sock> sk, int optname, misc.so_timestamping timestamping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_setsockopt(Ptr<runtime.socket> sock2, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_struct_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_valbool_flag(Ptr<runtime.sock> sk, sock_flags bit, int valbool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sock_wait_for_wmem(Ptr<runtime.sock> sk, long timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_wfree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> sock_wmalloc(Ptr<runtime.sock> sk, @Unsigned long size, int force, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> sock_dequeue_err_skb(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sock_queue_err_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_rmem_free(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sock_spd_release(Ptr<SpliceDefinitions.splice_pipe_desc> spd, @Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_addr_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sock_addr_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sock_addr_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sock_addr_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_addr_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sock_addr_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sock_filter_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sock_filter_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_filter_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sock_filter_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_ops_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sock_ops_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sock_ops_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sock_ops_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sock_ops_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sock_ops_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sock_diag_inet_compat")
    @NotUsableInJava
    public static class sock_diag_inet_compat
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> fn;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_diag_handler")
    @NotUsableInJava
    public static class sock_diag_handler
    extends Struct {
        public Ptr<runtime.module> owner;
        public char family;
        public Ptr<?> dump;
        public Ptr<?> get_info;
        public Ptr<?> destroy;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_diag_req")
    @NotUsableInJava
    public static class sock_diag_req
    extends Struct {
        public char sdiag_family;
        public char sdiag_protocol;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_txtime")
    @NotUsableInJava
    public static class sock_txtime
    extends Struct {
        public @OriginalName(value="__kernel_clockid_t") int clockid;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_fprog32")
    @NotUsableInJava
    public static class sock_fprog32
    extends Struct {
        public @Unsigned short len;
        public @Unsigned @OriginalName(value="compat_caddr_t") int filter;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_bh_locked")
    @NotUsableInJava
    public static class sock_bh_locked
    extends Struct {
        public Ptr<runtime.sock> sock;
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p bh_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_hash_seq_info")
    @NotUsableInJava
    public static class sock_hash_seq_info
    extends Struct {
        public Ptr<BpfDefinitions.bpf_map> map;
        public Ptr<BpfDefinitions.bpf_shtab> htab;
        public @Unsigned int bucket_id;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_map_seq_info")
    @NotUsableInJava
    public static class sock_map_seq_info
    extends Struct {
        public Ptr<BpfDefinitions.bpf_map> map;
        public Ptr<runtime.sock> sk;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="enum sock_shutdown_cmd")
    public static enum sock_shutdown_cmd implements Enum<sock_shutdown_cmd>,
    TypedEnum<sock_shutdown_cmd, Integer>
    {
        SHUT_RD,
        SHUT_WR,
        SHUT_RDWR;

    }

    @Type(noCCodeGeneration=true, cType="struct sock_skb_cb")
    @NotUsableInJava
    public static class sock_skb_cb
    extends Struct {
        public @Unsigned int dropcount;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_exterr_skb")
    @NotUsableInJava
    public static class sock_exterr_skb
    extends Struct {
        public AnonDefinitions.anon_member_of_ipfrag_skb_cb_and_header_of_anon_member_of_tcp_skb_cb_and_header_of_sock_exterr_skb header;
        public sock_extended_err ee;
        public @Unsigned short addr_offset;
        public @Unsigned @OriginalName(value="__be16") short port;
        public char opt_stats;
        public char unused;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_extended_err")
    @NotUsableInJava
    public static class sock_extended_err
    extends Struct {
        public @Unsigned int ee_errno;
        public char ee_origin;
        public char ee_type;
        public char ee_code;
        public char ee_pad;
        public @Unsigned int ee_info;
        @InlineUnion(value=25415)
        public @InlineUnion(value=25415) @Unsigned int ee_data;
        @InlineUnion(value=25415)
        public @InlineUnion(value=25415) sock_ee_data_rfc4884 ee_rfc4884;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_ee_data_rfc4884")
    @NotUsableInJava
    public static class sock_ee_data_rfc4884
    extends Struct {
        public @Unsigned short len;
        public char flags;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_fprog")
    @NotUsableInJava
    public static class sock_fprog
    extends Struct {
        public @Unsigned short len;
        public Ptr<sock_filter> filter;
    }

    @Type(noCCodeGeneration=true, cType="enum sock_flags")
    public static enum sock_flags implements Enum<sock_flags>,
    TypedEnum<sock_flags, Integer>
    {
        SOCK_DEAD,
        SOCK_DONE,
        SOCK_URGINLINE,
        SOCK_KEEPOPEN,
        SOCK_LINGER,
        SOCK_DESTROY,
        SOCK_BROADCAST,
        SOCK_TIMESTAMP,
        SOCK_ZAPPED,
        SOCK_USE_WRITE_QUEUE,
        SOCK_DBG,
        SOCK_RCVTSTAMP,
        SOCK_RCVTSTAMPNS,
        SOCK_LOCALROUTE,
        SOCK_MEMALLOC,
        SOCK_TIMESTAMPING_RX_SOFTWARE,
        SOCK_FASYNC,
        SOCK_RXQ_OVFL,
        SOCK_ZEROCOPY,
        SOCK_WIFI_STATUS,
        SOCK_NOFCS,
        SOCK_FILTER_LOCKED,
        SOCK_SELECT_ERR_QUEUE,
        SOCK_RCU_FREE,
        SOCK_TXTIME,
        SOCK_XDP,
        SOCK_TSTAMP_NEW,
        SOCK_RCVMARK;

    }

    @Type(noCCodeGeneration=true, cType="struct sock_reuseport")
    @NotUsableInJava
    public static class sock_reuseport
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned short max_socks;
        public @Unsigned short num_socks;
        public @Unsigned short num_closed_socks;
        public @Unsigned short incoming_cpu;
        public @Unsigned int synq_overflow_ts;
        public @Unsigned int reuseport_id;
        public @Unsigned int bind_inany;
        public @Unsigned int has_conns;
        public Ptr<BpfDefinitions.bpf_prog> prog;
        public Ptr<runtime.sock> @Size(value=0) [] socks;
    }

    @Type(noCCodeGeneration=true, cType="enum sock_type")
    public static enum sock_type implements Enum<sock_type>,
    TypedEnum<sock_type, Integer>
    {
        SOCK_STREAM,
        SOCK_DGRAM,
        SOCK_RAW,
        SOCK_RDM,
        SOCK_SEQPACKET,
        SOCK_DCCP,
        SOCK_PACKET;

    }

    @Type(noCCodeGeneration=true, cType="struct sock_common")
    @NotUsableInJava
    public static class sock_common
    extends Struct {
        @InlineUnion(value=6512)
        public @InlineUnion(value=6512) @Unsigned @OriginalName(value="__addrpair") long skc_addrpair;
        @InlineUnion(value=6512)
        public  @InlineUnion(value=6512) AnonDefinitions.anon_member_of_anon_member_of_sock_common anon0$1;
        @InlineUnion(value=6513)
        public @InlineUnion(value=6513) @Unsigned int skc_hash;
        @InlineUnion(value=6513)
        public @InlineUnion(value=6513) @Unsigned short @Size(value=2) [] skc_u16hashes;
        @InlineUnion(value=6516)
        public @InlineUnion(value=6516) @Unsigned @OriginalName(value="__portpair") int skc_portpair;
        @InlineUnion(value=6516)
        public  @InlineUnion(value=6516) AnonDefinitions.anon_member_of_anon_member_of_sock_common anon2$1;
        public @Unsigned short skc_family;
        public char skc_state;
        public char skc_reuse;
        public char skc_reuseport;
        public char skc_ipv6only;
        public char skc_net_refcnt;
        public int skc_bound_dev_if;
        @InlineUnion(value=6517)
        public @InlineUnion(value=6517) misc.hlist_node skc_bind_node;
        @InlineUnion(value=6517)
        public @InlineUnion(value=6517) misc.hlist_node skc_portaddr_node;
        public Ptr<runtime.proto> skc_prot;
        public misc.possible_net_t skc_net;
        public In6Definitions.in6_addr skc_v6_daddr;
        public In6Definitions.in6_addr skc_v6_rcv_saddr;
        public misc.atomic64_t skc_cookie;
        @InlineUnion(value=6518)
        public @InlineUnion(value=6518) @Unsigned long skc_flags;
        @InlineUnion(value=6518)
        public @InlineUnion(value=6518) Ptr<runtime.sock> skc_listener;
        @InlineUnion(value=6518)
        public @InlineUnion(value=6518) Ptr<InetDefinitions.inet_timewait_death_row> skc_tw_dr;
        public int @Size(value=0) [] skc_dontcopy_begin;
        @InlineUnion(value=6520)
        public @InlineUnion(value=6520) misc.hlist_node skc_node;
        @InlineUnion(value=6520)
        public @InlineUnion(value=6520) misc.hlist_nulls_node skc_nulls_node;
        public @Unsigned short skc_tx_queue_mapping;
        public @Unsigned short skc_rx_queue_mapping;
        @InlineUnion(value=6521)
        public @InlineUnion(value=6521) int skc_incoming_cpu;
        @InlineUnion(value=6521)
        public @InlineUnion(value=6521) @Unsigned int skc_rcv_wnd;
        @InlineUnion(value=6521)
        public @InlineUnion(value=6521) @Unsigned int skc_tw_rcv_nxt;
        public @OriginalName(value="refcount_t") misc.refcount_struct skc_refcnt;
        public int @Size(value=0) [] skc_dontcopy_end;
        @InlineUnion(value=6522)
        public @InlineUnion(value=6522) @Unsigned int skc_rxhash;
        @InlineUnion(value=6522)
        public @InlineUnion(value=6522) @Unsigned int skc_window_clamp;
        @InlineUnion(value=6522)
        public @InlineUnion(value=6522) @Unsigned int skc_tw_snd_nxt;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_cgroup_data")
    @NotUsableInJava
    public static class sock_cgroup_data
    extends Struct {
        public Ptr<runtime.cgroup> cgroup;
        public @Unsigned int classid;
        public @Unsigned short prioidx;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_fprog_kern")
    @NotUsableInJava
    public static class sock_fprog_kern
    extends Struct {
        public @Unsigned short len;
        public Ptr<sock_filter> filter;
    }

    @Type(noCCodeGeneration=true, cType="struct sock_filter")
    @NotUsableInJava
    public static class sock_filter
    extends Struct {
        public @Unsigned short code;
        public char jt;
        public char jf;
        public @Unsigned int k;
    }
}

