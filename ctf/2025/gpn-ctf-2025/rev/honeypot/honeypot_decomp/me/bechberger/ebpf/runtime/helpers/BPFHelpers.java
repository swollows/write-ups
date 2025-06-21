/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime.helpers;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.Udp6Definitions;
import me.bechberger.ebpf.runtime.UnixDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class BPFHelpers {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_bind(Ptr<BpfDefinitions.bpf_sock_addr> ctx, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_bprm_opts_set(Ptr<LinuxDefinitions.linux_binprm> bprm, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_btf_find_by_name_kind(String name, int name_sz, @Unsigned int kind, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_cgrp_storage_delete(Ptr<?> map2, Ptr<runtime.cgroup> cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_cgrp_storage_get(Ptr<?> map2, Ptr<runtime.cgroup> cgroup2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_check_mtu(Ptr<?> ctx, @Unsigned int ifindex, Ptr<@Unsigned Integer> mtu_len, int len_diff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_clone_redirect(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int ifindex, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_copy_from_user($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_copy_from_user(Ptr<?> dst, @Unsigned int size, Ptr<?> user_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_copy_from_user_task($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static long bpf_copy_from_user_task(Ptr<?> dst, @Unsigned int size, Ptr<?> user_ptr, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_csum_diff(Ptr<@Unsigned @OriginalName(value="__be32") Integer> from, @Unsigned int from_size, Ptr<@Unsigned @OriginalName(value="__be32") Integer> to, @Unsigned int to_size, @Unsigned @OriginalName(value="__wsum") int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_csum_level(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned long level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_csum_update(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned @OriginalName(value="__wsum") int csum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_current_task_under_cgroup(Ptr<?> map2, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_d_path(Ptr<runtime.path> path2, String buf, @Unsigned int sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_data((const struct bpf_dynptr*)$arg1, $arg2, $arg3)")
    public static Ptr<?> bpf_dynptr_data(Ptr<BpfDefinitions.bpf_dynptr> ptr, @Unsigned int offset, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_dynptr_from_mem(Ptr<?> data, @Unsigned int size, @Unsigned long flags, Ptr<BpfDefinitions.bpf_dynptr> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_read($arg1, $arg2, (const struct bpf_dynptr*)$arg3, $arg4, $arg5)")
    public static long bpf_dynptr_read(Ptr<?> dst, @Unsigned int len, Ptr<BpfDefinitions.bpf_dynptr> src, @Unsigned int offset, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_write((const struct bpf_dynptr*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static long bpf_dynptr_write(Ptr<BpfDefinitions.bpf_dynptr> dst, @Unsigned int offset, Ptr<?> src, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_fib_lookup(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_fib_lookup> params, int plen, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_find_vma(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long addr2, Ptr<?> callback_fn, Ptr<?> callback_ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_for_each_map_elem(Ptr<?> map2, Ptr<?> callback_fn, Ptr<?> callback_ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_branch_snapshot(Ptr<?> entries, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_get_cgroup_classid(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_ancestor_cgroup_id(int ancestor_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_cgroup_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_current_comm(Ptr<?> buf, @Unsigned int size_of_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_pid_tgid() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_task() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> bpf_get_current_task_btf() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_uid_gid() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_func_arg(Ptr<?> ctx, @Unsigned int n, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_func_arg_cnt(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_func_ip(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_func_ret(Ptr<?> ctx, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_get_hash_recalc(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_sock> bpf_get_listener_sock(Ptr<BpfDefinitions.bpf_sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_get_local_storage(Ptr<?> map2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_netns_cookie(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_ns_current_pid_tgid(@Unsigned long dev, @Unsigned long ino, Ptr<BpfDefinitions.bpf_pidns_info> nsdata, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_numa_node_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_get_prandom_u32() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_get_retval() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_get_route_realm(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_get_smp_processor_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_cookie(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_get_socket_uid(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_stack(Ptr<?> ctx, Ptr<?> buf, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_stackid(Ptr<?> ctx, Ptr<?> map2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_get_task_stack(Ptr<TaskDefinitions.task_struct> task2, Ptr<?> buf, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_getsockopt(Ptr<?> bpf_socket, int level, int optname, Ptr<?> optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_ima_file_hash(Ptr<runtime.file> file2, Ptr<?> dst, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_ima_inode_hash(Ptr<runtime.inode> inode2, Ptr<?> dst, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_inode_storage_delete(Ptr<?> map2, Ptr<?> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_inode_storage_get(Ptr<?> map2, Ptr<?> inode2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_jiffies64() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kallsyms_lookup_name((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static long bpf_kallsyms_lookup_name(String name, int name_sz, int flags, Ptr<@Unsigned Long> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_kptr_xchg(Ptr<?> map_value, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_boot_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_coarse_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_tai_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_l3_csum_replace(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int offset, @Unsigned long from, @Unsigned long to, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_l4_csum_replace(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int offset, @Unsigned long from, @Unsigned long to, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_load_hdr_opt(Ptr<BpfDefinitions.bpf_sock_ops> skops, Ptr<?> searchby_res, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_loop(@Unsigned int nr_loops, Ptr<?> callback_fn, Ptr<?> callback_ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_lwt_push_encap(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int type2, Ptr<?> hdr, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_lwt_seg6_action(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int action, Ptr<?> param2, @Unsigned int param_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_lwt_seg6_adjust_srh(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int offset, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lwt_seg6_store_bytes($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static long bpf_lwt_seg6_store_bytes(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int offset, Ptr<?> from, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_delete_elem($arg1, (const void*)$arg2)")
    public static long bpf_map_delete_elem(Ptr<?> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_lookup_elem($arg1, (const void*)$arg2)")
    public static Ptr<?> bpf_map_lookup_elem(Ptr<?> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_lookup_percpu_elem($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> bpf_map_lookup_percpu_elem(Ptr<?> map2, Ptr<?> key2, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_map_peek_elem(Ptr<?> map2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_map_pop_elem(Ptr<?> map2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_push_elem($arg1, (const void*)$arg2, $arg3)")
    public static long bpf_map_push_elem(Ptr<?> map2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_update_elem($arg1, (const void*)$arg2, (const void*)$arg3, $arg4)")
    public static long bpf_map_update_elem(Ptr<?> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_apply_bytes(Ptr<SkDefinitions.sk_msg_md> msg, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_cork_bytes(Ptr<SkDefinitions.sk_msg_md> msg, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_pop_data(Ptr<SkDefinitions.sk_msg_md> msg, @Unsigned int start, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_pull_data(Ptr<SkDefinitions.sk_msg_md> msg, @Unsigned int start, @Unsigned int end, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_push_data(Ptr<SkDefinitions.sk_msg_md> msg, @Unsigned int start, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_redirect_hash(Ptr<SkDefinitions.sk_msg_md> msg, Ptr<?> map2, Ptr<?> key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_msg_redirect_map(Ptr<SkDefinitions.sk_msg_md> msg, Ptr<?> map2, @Unsigned int key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_override_return(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_per_cpu_ptr((const void*)$arg1, $arg2)")
    public static Ptr<?> bpf_per_cpu_ptr(Ptr<?> percpu_ptr, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_perf_event_output(Ptr<?> ctx, Ptr<?> map2, @Unsigned long flags, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_event_read(Ptr<?> map2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_perf_event_read_value(Ptr<?> map2, @Unsigned long flags, Ptr<BpfDefinitions.bpf_perf_event_value> buf, @Unsigned int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_perf_prog_read_value(Ptr<BpfDefinitions.bpf_perf_event_data> ctx, Ptr<BpfDefinitions.bpf_perf_event_value> buf, @Unsigned int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_read($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_probe_read(Ptr<?> dst, @Unsigned int size, Ptr<?> unsafe_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_read_kernel($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_probe_read_kernel(Ptr<?> dst, @Unsigned int size, Ptr<?> unsafe_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_probe_read_kernel_str(Ptr<?> dst, @Unsigned int size, Ptr<?> unsafe_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_read_str($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_probe_read_str(Ptr<?> dst, @Unsigned int size, Ptr<?> unsafe_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_read_user($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_probe_read_user(Ptr<?> dst, @Unsigned int size, Ptr<?> unsafe_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_read_user_str($arg1, $arg2, (const void*)$arg3)")
    public static long bpf_probe_read_user_str(Ptr<?> dst, @Unsigned int size, Ptr<?> unsafe_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_probe_write_user($arg1, (const void*)$arg2, $arg3)")
    public static long bpf_probe_write_user(Ptr<?> dst, Ptr<?> src, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_rc_keydown(Ptr<?> ctx, @Unsigned int protocol, @Unsigned long scancode, @Unsigned int toggle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_rc_pointer_rel(Ptr<?> ctx, int rel_x, int rel_y) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_rc_repeat(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_read_branch_records(Ptr<BpfDefinitions.bpf_perf_event_data> ctx, Ptr<?> buf, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_redirect(@Unsigned int ifindex, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_redirect_map(Ptr<?> map2, @Unsigned long key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_redirect_neigh(@Unsigned int ifindex, Ptr<BpfDefinitions.bpf_redir_neigh> params, int plen, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_redirect_peer(@Unsigned int ifindex, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_reserve_hdr_opt(Ptr<BpfDefinitions.bpf_sock_ops> skops, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ringbuf_discard(Ptr<?> data, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ringbuf_discard_dynptr(Ptr<BpfDefinitions.bpf_dynptr> ptr, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_ringbuf_output(Ptr<?> ringbuf, Ptr<?> data, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_query(Ptr<?> ringbuf, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_ringbuf_reserve(Ptr<?> ringbuf, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_ringbuf_reserve_dynptr(Ptr<?> ringbuf, @Unsigned int size, @Unsigned long flags, Ptr<BpfDefinitions.bpf_dynptr> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ringbuf_submit(Ptr<?> data, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ringbuf_submit_dynptr(Ptr<BpfDefinitions.bpf_dynptr> ptr, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_send_signal(@Unsigned int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_send_signal_thread(@Unsigned int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_seq_printf($arg1, (const u8*)$arg2, $arg3, (const void*)$arg4, $arg5)")
    public static long bpf_seq_printf(Ptr<SeqDefinitions.seq_file> m, String fmt, @Unsigned int fmt_size, Ptr<?> data, @Unsigned int data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_seq_printf_btf(Ptr<SeqDefinitions.seq_file> m, Ptr<BtfDefinitions.btf_ptr> ptr, @Unsigned int ptr_size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_seq_write($arg1, (const void*)$arg2, $arg3)")
    public static long bpf_seq_write(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_set_hash(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_set_hash_invalid(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_set_retval(int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_setsockopt(Ptr<?> bpf_socket, int level, int optname, Ptr<?> optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_ancestor_cgroup_id(Ptr<?> sk, int ancestor_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sk_assign(Ptr<?> ctx, Ptr<?> sk, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_cgroup_id(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_sock> bpf_sk_fullsock(Ptr<BpfDefinitions.bpf_sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_sock> bpf_sk_lookup_tcp(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_sock_tuple> tuple, @Unsigned int tuple_size, @Unsigned long netns2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_sock> bpf_sk_lookup_udp(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_sock_tuple> tuple, @Unsigned int tuple_size, @Unsigned long netns2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sk_redirect_hash(Ptr<SkDefinitions.__sk_buff> skb, Ptr<?> map2, Ptr<?> key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sk_redirect_map(Ptr<SkDefinitions.__sk_buff> skb, Ptr<?> map2, @Unsigned int key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sk_release(Ptr<?> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sk_select_reuseport(Ptr<SkDefinitions.sk_reuseport_md> reuse, Ptr<?> map2, Ptr<?> key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sk_storage_delete(Ptr<?> map2, Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_sk_storage_get(Ptr<?> map2, Ptr<?> sk, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_adjust_room(Ptr<SkDefinitions.__sk_buff> skb, int len_diff, @Unsigned int mode, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_ancestor_cgroup_id(Ptr<SkDefinitions.__sk_buff> skb, int ancestor_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_cgroup_classid(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_cgroup_id(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_change_head(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_change_proto(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_change_tail(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_change_type(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_ecn_set_ce(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_get_tunnel_key(Ptr<SkDefinitions.__sk_buff> skb, Ptr<BpfDefinitions.bpf_tunnel_key> key2, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_get_tunnel_opt(Ptr<SkDefinitions.__sk_buff> skb, Ptr<?> opt, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_get_xfrm_state(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int index2, Ptr<BpfDefinitions.bpf_xfrm_state> xfrm_state2, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_skb_load_bytes((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static long bpf_skb_load_bytes(Ptr<?> skb, @Unsigned int offset, Ptr<?> to, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_skb_load_bytes_relative((const void*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static long bpf_skb_load_bytes_relative(Ptr<?> skb, @Unsigned int offset, Ptr<?> to, @Unsigned int len, @Unsigned int start_header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_output(Ptr<?> ctx, Ptr<?> map2, @Unsigned long flags, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_pull_data(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_set_tstamp(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned long tstamp, @Unsigned int tstamp_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_set_tunnel_key(Ptr<SkDefinitions.__sk_buff> skb, Ptr<BpfDefinitions.bpf_tunnel_key> key2, @Unsigned int size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_set_tunnel_opt(Ptr<SkDefinitions.__sk_buff> skb, Ptr<?> opt, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_skb_store_bytes($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static long bpf_skb_store_bytes(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned int offset, Ptr<?> from, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_under_cgroup(Ptr<SkDefinitions.__sk_buff> skb, Ptr<?> map2, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_vlan_pop(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_skb_vlan_push(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned @OriginalName(value="__be16") short vlan_proto, @Unsigned short vlan_tci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_sock> bpf_skc_lookup_tcp(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_sock_tuple> tuple, @Unsigned int tuple_size, @Unsigned long netns2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MptcpDefinitions.mptcp_sock> bpf_skc_to_mptcp_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.tcp6_sock> bpf_skc_to_tcp6_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TcpDefinitions.tcp_request_sock> bpf_skc_to_tcp_request_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TcpDefinitions.tcp_sock> bpf_skc_to_tcp_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TcpDefinitions.tcp_timewait_sock> bpf_skc_to_tcp_timewait_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Udp6Definitions.udp6_sock> bpf_skc_to_udp6_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UnixDefinitions.unix_sock> bpf_skc_to_unix_sock(Ptr<?> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_snprintf($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static long bpf_snprintf(String str, @Unsigned int str_size, String fmt, Ptr<@Unsigned Long> data, @Unsigned int data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_snprintf_btf(String str, @Unsigned int str_size, Ptr<BtfDefinitions.btf_ptr> ptr, @Unsigned int btf_ptr_size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.socket> bpf_sock_from_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sock_hash_update(Ptr<BpfDefinitions.bpf_sock_ops> skops, Ptr<?> map2, Ptr<?> key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sock_map_update(Ptr<BpfDefinitions.bpf_sock_ops> skops, Ptr<?> map2, Ptr<?> key2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sock_ops_cb_flags_set(Ptr<BpfDefinitions.bpf_sock_ops> bpf_sock2, int argval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_spin_lock(Ptr<BpfDefinitions.bpf_spin_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_spin_unlock(Ptr<BpfDefinitions.bpf_spin_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_store_hdr_opt($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static long bpf_store_hdr_opt(Ptr<BpfDefinitions.bpf_sock_ops> skops, Ptr<?> from, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_strncmp((const u8*)$arg1, $arg2, (const u8*)$arg3)")
    public static long bpf_strncmp(String s1, @Unsigned int s1_sz, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_strtol((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static long bpf_strtol(String buf, @Unsigned long buf_len, @Unsigned long flags, Ptr<Long> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_strtoul((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static long bpf_strtoul(String buf, @Unsigned long buf_len, @Unsigned long flags, Ptr<@Unsigned Long> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sys_bpf(@Unsigned int cmd, Ptr<?> attr2, @Unsigned int attr_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sys_close(@Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sysctl_get_current_value(Ptr<BpfDefinitions.bpf_sysctl> ctx, String buf, @Unsigned long buf_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sysctl_get_name(Ptr<BpfDefinitions.bpf_sysctl> ctx, String buf, @Unsigned long buf_len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_sysctl_get_new_value(Ptr<BpfDefinitions.bpf_sysctl> ctx, String buf, @Unsigned long buf_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sysctl_set_new_value($arg1, (const u8*)$arg2, $arg3)")
    public static long bpf_sysctl_set_new_value(Ptr<BpfDefinitions.bpf_sysctl> ctx, String buf, @Unsigned long buf_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tail_call(Ptr<?> ctx, Ptr<?> prog_array_map, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_task_pt_regs(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_task_storage_delete(Ptr<?> map2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_task_storage_get(Ptr<?> map2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_check_syncookie(Ptr<?> sk, Ptr<?> iph, @Unsigned int iph_len, Ptr<runtime.tcphdr> th, @Unsigned int th_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_gen_syncookie(Ptr<?> sk, Ptr<?> iph, @Unsigned int iph_len, Ptr<runtime.tcphdr> th, @Unsigned int th_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_raw_check_syncookie_ipv4(Ptr<runtime.iphdr> iph, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_raw_check_syncookie_ipv6(Ptr<runtime.ipv6hdr> iph, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_raw_gen_syncookie_ipv4(Ptr<runtime.iphdr> iph, Ptr<runtime.tcphdr> th, @Unsigned int th_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_raw_gen_syncookie_ipv6(Ptr<runtime.ipv6hdr> iph, Ptr<runtime.tcphdr> th, @Unsigned int th_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_tcp_send_ack(Ptr<?> tp, @Unsigned int rcv_nxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_tcp_sock> bpf_tcp_sock(Ptr<BpfDefinitions.bpf_sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_this_cpu_ptr((const void*)$arg1)")
    public static Ptr<?> bpf_this_cpu_ptr(Ptr<?> percpu_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_timer_cancel(Ptr<BpfDefinitions.bpf_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_timer_init(Ptr<BpfDefinitions.bpf_timer> timer, Ptr<?> map2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_timer_set_callback(Ptr<BpfDefinitions.bpf_timer> timer, Ptr<?> callback_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_timer_start(Ptr<BpfDefinitions.bpf_timer> timer, @Unsigned long nsecs, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_trace_printk((const u8*)$arg1, $arg2, $arg3_)")
    public static long bpf_trace_printk(String fmt, @Unsigned int fmt_size, Object ... args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_trace_vprintk((const u8*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static long bpf_trace_vprintk(String fmt, @Unsigned int fmt_size, Ptr<?> data, @Unsigned int data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_user_ringbuf_drain(Ptr<?> map2, Ptr<?> callback_fn, Ptr<?> ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_xdp_adjust_head(Ptr<XdpDefinitions.xdp_md> xdp_md2, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_xdp_adjust_meta(Ptr<XdpDefinitions.xdp_md> xdp_md2, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_xdp_adjust_tail(Ptr<XdpDefinitions.xdp_md> xdp_md2, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_get_buff_len(Ptr<XdpDefinitions.xdp_md> xdp_md2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_xdp_load_bytes(Ptr<XdpDefinitions.xdp_md> xdp_md2, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_xdp_output(Ptr<?> ctx, Ptr<?> map2, @Unsigned long flags, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_xdp_store_bytes(Ptr<XdpDefinitions.xdp_md> xdp_md2, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }
}

