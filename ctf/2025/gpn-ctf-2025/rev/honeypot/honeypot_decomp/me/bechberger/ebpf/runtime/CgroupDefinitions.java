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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PsiDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CgroupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cgroup_account_cputime(Ptr<runtime.cgroup> cgrp, @Unsigned long delta_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cgroup_account_cputime_field(Ptr<runtime.cgroup> cgrp, CpuDefinitions.cpu_usage_stat index2, @Unsigned long delta_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cgroup_rstat_lock(Ptr<runtime.cgroup> cgrp, int cpu_in_loop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_base_stat_cputime_show(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_do_freeze(Ptr<runtime.cgroup> cgrp, boolean freeze) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_enter_frozen() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_freeze(Ptr<runtime.cgroup> cgrp, boolean freeze) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_freeze_task(Ptr<TaskDefinitions.task_struct> task2, boolean freeze) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_freezer_migrate_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<runtime.cgroup> src, Ptr<runtime.cgroup> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_iter_seq_fini(Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_iter_seq_init(Ptr<?> priv, Ptr<BpfDefinitions.bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_iter_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_iter_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_iter_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_iter_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_leave_frozen(boolean always_leave) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_propagate_frozen(Ptr<runtime.cgroup> cgrp, boolean frozen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_boot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_exit(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_flush(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_flush_hold(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_flush_locked(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_flush_release(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_rstat_init(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_rstat_updated(Ptr<runtime.cgroup> cgrp, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> cgroup_rstat_updated_list(Ptr<runtime.cgroup> root, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_update_frozen(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_attach(Ptr<runtime.cgroup> cgrp, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_prog> replace_prog, Ptr<BpfDefinitions.bpf_cgroup_link> link2, BpfDefinitions.bpf_attach_type type2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_check_dev_permission(short dev_type2, @Unsigned int major, @Unsigned int minor, short access2, cgroup_bpf_attach_type atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_detach(Ptr<runtime.cgroup> cgrp, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_cgroup_link> link2, BpfDefinitions.bpf_attach_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cgroup_bpf_query($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int __cgroup_bpf_query(Ptr<runtime.cgroup> cgrp, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_getsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, misc.sockptr_t optlen, int max_optlen, int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_getsockopt_kern(Ptr<runtime.sock> sk, int level, int optname, Ptr<?> optval, Ptr<Integer> optlen, int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_setsockopt(Ptr<runtime.sock> sk, Ptr<Integer> level, Ptr<Integer> optname, misc.sockptr_t optval, Ptr<Integer> optlen, Ptr<String> kernel_optval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_sk(Ptr<runtime.sock> sk, cgroup_bpf_attach_type atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, cgroup_bpf_attach_type atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_sock_addr(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, Ptr<Integer> uaddrlen, cgroup_bpf_attach_type atype, Ptr<?> t_ctx, Ptr<@Unsigned Integer> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_sock_ops(Ptr<runtime.sock> sk, Ptr<BpfDefinitions.bpf_sock_ops_kern> sock_ops, cgroup_bpf_attach_type atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cgroup_bpf_run_filter_sysctl(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table, int write2, Ptr<String> buf, Ptr<@Unsigned Long> pcount, Ptr<@OriginalName(value="loff_t") Long> ppos, cgroup_bpf_attach_type atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cgroup_bpf_run_lsm_current((const void*)$arg1, (const struct bpf_insn*)$arg2)")
    public static @Unsigned int __cgroup_bpf_run_lsm_current(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cgroup_bpf_run_lsm_sock((const void*)$arg1, (const struct bpf_insn*)$arg2)")
    public static @Unsigned int __cgroup_bpf_run_lsm_sock(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cgroup_bpf_run_lsm_socket((const void*)$arg1, (const struct bpf_insn*)$arg2)")
    public static @Unsigned int __cgroup_bpf_run_lsm_socket(Ptr<?> ctx, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_bpf_inherit(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_bpf_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int cgroup_bpf_link_attach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_bpf_offline(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_bpf_prog_attach((const union bpf_attr*)$arg1, $arg2, $arg3)")
    public static int cgroup_bpf_prog_attach(Ptr<BpfDefinitions.bpf_attr> attr2, BpfDefinitions.bpf_prog_type ptype, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_bpf_prog_detach((const union bpf_attr*)$arg1, $arg2)")
    public static int cgroup_bpf_prog_detach(Ptr<BpfDefinitions.bpf_attr> attr2, BpfDefinitions.bpf_prog_type ptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_bpf_prog_query((const union bpf_attr*)$arg1, $arg2)")
    public static int cgroup_bpf_prog_query(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_bpf_release(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_bpf_release_fn(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_bpf_replace(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_prog> new_prog, Ptr<BpfDefinitions.bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_bpf_wq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)cgroup_common_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> cgroup_common_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)cgroup_current_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> cgroup_current_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)cgroup_dev_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> cgroup_dev_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_dev_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean cgroup_dev_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cgroup_freezing(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_memory(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_move_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<CssDefinitions.css_set> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_storage_check_btf((const struct bpf_map*)$arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, (const struct btf_type*)$arg4)")
    public static int cgroup_storage_check_btf(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> key_type2, Ptr<BtfDefinitions.btf_type> value_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cgroup_storage_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_storage_get_next_key(Ptr<BpfDefinitions.bpf_map> _map, Ptr<?> key2, Ptr<?> _next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_storage_lookup_elem(Ptr<BpfDefinitions.bpf_map> _map, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> cgroup_storage_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_storage_map_free(Ptr<BpfDefinitions.bpf_map> _map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_storage_map_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long cgroup_storage_map_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_storage_seq_show_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cgroup_storage_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_attach_task_all(Ptr<TaskDefinitions.task_struct> from, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cgroup_clone_children_read(Ptr<cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_clone_children_write(Ptr<cgroup_subsys_state> css, Ptr<runtime.cftype> cft, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_no_v1(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_pidlist_destroy_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_pidlist_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_pidlist_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_pidlist_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_pidlist_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cgroup_read_notify_on_release(Ptr<cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_release_agent_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_release_agent_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_sane_behavior_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_transfer_tasks(Ptr<runtime.cgroup> to, Ptr<runtime.cgroup> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_write_notify_on_release(Ptr<cgroup_subsys_state> css, Ptr<runtime.cftype> cft, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_writeback_by_id(@Unsigned long bdi_id, int memcg_id, WbDefinitions.wb_reason reason, Ptr<WbDefinitions.wb_completion> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_writeback_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_writeback_umount(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cgroup_kill(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __cgroup_procs_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos, @Unsigned int iter_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __cgroup_procs_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cgroup_task_count((const struct cgroup*)$arg1)")
    public static int __cgroup_task_count(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_add_cftypes(Ptr<cgroup_subsys> ss, Ptr<runtime.cftype> cfts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_add_dfl_cftypes(Ptr<cgroup_subsys> ss, Ptr<runtime.cftype> cfts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_add_legacy_cftypes(Ptr<cgroup_subsys> ss, Ptr<runtime.cftype> cfts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_addrm_files(Ptr<cgroup_subsys_state> css, Ptr<runtime.cgroup> cgrp, Ptr<runtime.cftype> cfts, boolean is_add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_apply_cftypes(Ptr<runtime.cftype> cfts, boolean is_add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_apply_control_disable(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_apply_control_enable(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_attach_lock(boolean lock_threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_attach_permissions(Ptr<runtime.cgroup> src_cgrp, Ptr<runtime.cgroup> dst_cgrp, Ptr<SuperDefinitions.super_block> sb, boolean threadgroup, Ptr<cgroup_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_attach_task(Ptr<runtime.cgroup> dst_cgrp, Ptr<TaskDefinitions.task_struct> leader, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_attach_unlock(boolean lock_threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_can_fork(Ptr<TaskDefinitions.task_struct> child, Ptr<KernelDefinitions.kernel_clone_args> kargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_cancel_fork(Ptr<TaskDefinitions.task_struct> child, Ptr<KernelDefinitions.kernel_clone_args> kargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_cancel_move_stub(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cgroup> from, Ptr<runtime.cgroup> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_controllers_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_cpu_pressure_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_cpu_pressure_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_create($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.cgroup> cgroup_create(Ptr<runtime.cgroup> parent, String name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_css_set_fork(Ptr<KernelDefinitions.kernel_clone_args> kargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_css_set_put_fork(Ptr<KernelDefinitions.kernel_clone_args> kargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_destroy_locked(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_destroy_root(Ptr<cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_disable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_do_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cgroup_subsys_state> cgroup_e_css(Ptr<runtime.cgroup> cgrp, Ptr<cgroup_subsys> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_events_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_exit(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_exit_cftypes(Ptr<runtime.cftype> cfts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_exit_stub(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_favor_dynmods(Ptr<cgroup_root> root, boolean favor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_favordynmods_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_fd_array_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_fd_array_get_ptr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> map_file, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_fd_array_put_ptr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> ptr, boolean need_defer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_file_name($arg1, (const struct cftype*)$arg2, $arg3)")
    public static String cgroup_file_name(Ptr<runtime.cgroup> cgrp, Ptr<runtime.cftype> cft, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_file_notify(Ptr<cgroup_file> cfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_file_notify_timer(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_file_open(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int cgroup_file_poll(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<PollDefinitions.poll_table_struct> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_file_release(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_file_show(Ptr<cgroup_file> cfile, boolean show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_file_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_fork(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_free(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_free_root(Ptr<cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_freeze_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_freeze_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_fs_context_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cgroup_subsys_state> cgroup_get_e_css(Ptr<runtime.cgroup> cgrp, Ptr<cgroup_subsys> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> cgroup_get_from_fd(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> cgroup_get_from_id(@Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_get_from_path((const u8*)$arg1)")
    public static Ptr<runtime.cgroup> cgroup_get_from_path(String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_get_live(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_idr_alloc(Ptr<runtime.idr> idr2, Ptr<?> ptr, int start, int end, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_init_cftypes(Ptr<cgroup_subsys> ss, Ptr<runtime.cftype> cfts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_init_stub(Ptr<runtime.cgroup> cgrp, Ptr<ScxDefinitions.scx_cgroup_init_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_init_subsys(Ptr<cgroup_subsys> ss, boolean early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_io_pressure_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_io_pressure_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cgroup_is_valid_domain(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_kill_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> cgroup_kn_lock_live(Ptr<KernfsDefinitions.kernfs_node> kn, boolean drain_offline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_kn_unlock(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_lock_and_drain_offline(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_max_depth_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_max_depth_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_max_descendants_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_max_descendants_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_memory_pressure_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_memory_pressure_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_migrate(Ptr<TaskDefinitions.task_struct> leader, boolean threadgroup, Ptr<cgroup_mgctx> mgctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_migrate_add_src(Ptr<CssDefinitions.css_set> src_cset, Ptr<runtime.cgroup> dst_cgrp, Ptr<cgroup_mgctx> mgctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_migrate_add_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<cgroup_mgctx> mgctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_migrate_execute(Ptr<cgroup_mgctx> mgctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_migrate_finish(Ptr<cgroup_mgctx> mgctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_migrate_prepare_dst(Ptr<cgroup_mgctx> mgctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_migrate_vet_dst(Ptr<runtime.cgroup> dst_cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_mkdir($arg1, (const u8*)$arg2, $arg3)")
    public static int cgroup_mkdir(Ptr<KernfsDefinitions.kernfs_node> parent_kn, String name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_move_stub(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cgroup> from, Ptr<runtime.cgroup> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_on_dfl((const struct cgroup*)$arg1)")
    public static boolean cgroup_on_dfl(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_parse_float((const u8*)$arg1, $arg2, $arg3)")
    public static int cgroup_parse_float(String input, @Unsigned int dec_shift, Ptr<Long> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_path_from_kernfs_id(@Unsigned long id, String buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_path_ns(Ptr<runtime.cgroup> cgrp, String buf, @Unsigned long buflen, Ptr<cgroup_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_path_ns_locked(Ptr<runtime.cgroup> cgrp, String buf, @Unsigned long buflen, Ptr<cgroup_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_post_fork(Ptr<TaskDefinitions.task_struct> child, Ptr<KernelDefinitions.kernel_clone_args> kargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_prep_move_stub(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cgroup> from, Ptr<runtime.cgroup> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int cgroup_pressure_poll(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<PollDefinitions.poll_table_struct> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_pressure_release(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_pressure_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_pressure_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_print_ss_mask(Ptr<SeqDefinitions.seq_file> seq, @Unsigned short ss_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_procs_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_procs_release(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_procs_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_procs_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_procs_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_procs_write_finish(Ptr<TaskDefinitions.task_struct> task2, boolean threadgroup_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> cgroup_procs_write_start(String buf, boolean threadgroup, Ptr<@OriginalName(value="bool") Boolean> threadgroup_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_propagate_control(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cgroup_psi_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_release(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_restore_control(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_rm_cftypes(Ptr<runtime.cftype> cfts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_rmdir(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cgroup_root> cgroup_root_from_kf(Ptr<KernfsDefinitions.kernfs_root> kf_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_save_control(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_seqfile_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_seqfile_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_seqfile_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_seqfile_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_set_weight_stub(Ptr<runtime.cgroup> cgrp, @Unsigned int weight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_setup_root(Ptr<cgroup_root> root, @Unsigned short ss_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<KernfsDefinitions.kernfs_root> kf_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_show_path(Ptr<SeqDefinitions.seq_file> sf, Ptr<KernfsDefinitions.kernfs_node> kf_node, Ptr<KernfsDefinitions.kernfs_root> kf_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_sk_alloc(Ptr<SockDefinitions.sock_cgroup_data> skcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_sk_clone(Ptr<SockDefinitions.sock_cgroup_data> skcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_sk_free(Ptr<SockDefinitions.sock_cgroup_data> skcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cgroup_ssid_enabled(int ssid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_stat_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<BpfDefinitions.bpf_local_storage>> cgroup_storage_ptr(Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_subtree_control_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_subtree_control_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cgroup_task_count((const struct cgroup*)$arg1)")
    public static int cgroup_task_count(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> cgroup_taskset_first(Ptr<cgroup_taskset> tset, Ptr<Ptr<cgroup_subsys_state>> dst_cssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> cgroup_taskset_next(Ptr<cgroup_taskset> tset, Ptr<Ptr<cgroup_subsys_state>> dst_cssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cgroup_threads_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_threads_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cgroup_subsys_state> cgroup_tryget_css(Ptr<runtime.cgroup> cgrp, Ptr<cgroup_subsys> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_type_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cgroup_type_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_update_dfl_csses(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cgroup_update_populated(Ptr<runtime.cgroup> cgrp, boolean populated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> cgroup_v1v2_get_from_fd(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cgroup_wq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum cgroup_filetype")
    public static enum cgroup_filetype implements Enum<cgroup_filetype>,
    TypedEnum<cgroup_filetype, Integer>
    {
        CGROUP_FILE_PROCS,
        CGROUP_FILE_TASKS;

    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_pidlist")
    @NotUsableInJava
    public static class cgroup_pidlist
    extends Struct {
        public KeyDefinitions.key_of_cgroup_pidlist key;
        public Ptr<@OriginalName(value="pid_t") Integer> list;
        public int length;
        public ListDefinitions.list_head links;
        public Ptr<runtime.cgroup> owner;
        public DelayedDefinitions.delayed_work destroy_dwork;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_lsm_atype")
    @NotUsableInJava
    public static class cgroup_lsm_atype
    extends Struct {
        public @Unsigned int attach_btf_id;
        public int refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_iter_priv")
    @NotUsableInJava
    public static class cgroup_iter_priv
    extends Struct {
        public Ptr<cgroup_subsys_state> start_css;
        public boolean visited_all;
        public boolean terminate;
        public int order;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_cls_state")
    @NotUsableInJava
    public static class cgroup_cls_state
    extends Struct {
        public cgroup_subsys_state css;
        public @Unsigned int classid;
    }

    @Type(noCCodeGeneration=true, cType="struct { enum bpf_cgroup_iter_order order; unsigned int cgroup_fd; long long unsigned int cgroup_id; }")
    @NotUsableInJava
    public static class cgroup_of_bpf_iter_link_info
    extends Struct {
        public BpfDefinitions.bpf_cgroup_iter_order order;
        public @Unsigned int cgroup_fd;
        public @Unsigned long cgroup_id;
    }

    @Type(noCCodeGeneration=true, cType="enum cgroup_opt_features")
    public static enum cgroup_opt_features implements Enum<cgroup_opt_features>,
    TypedEnum<cgroup_opt_features, Integer>
    {
        OPT_FEATURE_PRESSURE,
        OPT_FEATURE_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_mgctx")
    @NotUsableInJava
    public static class cgroup_mgctx
    extends Struct {
        public ListDefinitions.list_head preloaded_src_csets;
        public ListDefinitions.list_head preloaded_dst_csets;
        public cgroup_taskset tset;
        public @Unsigned short ss_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_file_ctx")
    @NotUsableInJava
    public static class cgroup_file_ctx
    extends Struct {
        public Ptr<cgroup_namespace> ns;
        public PsiDefinitions.psi_of_cgroup_file_ctx psi;
        public misc.procs_of_cgroup_file_ctx procs;
        public misc.procs1_of_cgroup_file_ctx procs1;
        public cgroup_of_peak peak;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_fs_context")
    @NotUsableInJava
    public static class cgroup_fs_context
    extends Struct {
        public KernfsDefinitions.kernfs_fs_context kfc;
        public Ptr<cgroup_root> root;
        public Ptr<cgroup_namespace> ns;
        public @Unsigned int flags;
        public boolean cpuset_clone_children;
        public boolean none;
        public boolean all_ss;
        public @Unsigned short subsys_mask;
        public String name;
        public String release_agent;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_of_peak")
    @NotUsableInJava
    public static class cgroup_of_peak
    extends Struct {
        public @Unsigned long value;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_taskset")
    @NotUsableInJava
    public static class cgroup_taskset
    extends Struct {
        public ListDefinitions.list_head src_csets;
        public ListDefinitions.list_head dst_csets;
        public int nr_tasks;
        public int ssid;
        public Ptr<ListDefinitions.list_head> csets;
        public Ptr<CssDefinitions.css_set> cur_cset;
        public Ptr<TaskDefinitions.task_struct> cur_task;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int cgroup_id; unsigned int order; }")
    @NotUsableInJava
    public static class cgroup_of_anon_member_of_iter_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long cgroup_id;
        public @Unsigned int order;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int cgroup_id; unsigned int attach_type; }")
    @NotUsableInJava
    public static class cgroup_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long cgroup_id;
        public @Unsigned int attach_type;
    }

    @Type(noCCodeGeneration=true, cType="enum cgroup_subsys_id")
    public static enum cgroup_subsys_id implements Enum<cgroup_subsys_id>,
    TypedEnum<cgroup_subsys_id, Integer>
    {
        cpuset_cgrp_id,
        cpu_cgrp_id,
        cpuacct_cgrp_id,
        io_cgrp_id,
        memory_cgrp_id,
        devices_cgrp_id,
        freezer_cgrp_id,
        net_cls_cgrp_id,
        perf_event_cgrp_id,
        net_prio_cgrp_id,
        hugetlb_cgrp_id,
        pids_cgrp_id,
        rdma_cgrp_id,
        misc_cgrp_id,
        CGROUP_SUBSYS_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum cgroup_bpf_attach_type")
    public static enum cgroup_bpf_attach_type implements Enum<cgroup_bpf_attach_type>,
    TypedEnum<cgroup_bpf_attach_type, Integer>
    {
        CGROUP_BPF_ATTACH_TYPE_INVALID,
        CGROUP_INET_INGRESS,
        CGROUP_INET_EGRESS,
        CGROUP_INET_SOCK_CREATE,
        CGROUP_SOCK_OPS,
        CGROUP_DEVICE,
        CGROUP_INET4_BIND,
        CGROUP_INET6_BIND,
        CGROUP_INET4_CONNECT,
        CGROUP_INET6_CONNECT,
        CGROUP_UNIX_CONNECT,
        CGROUP_INET4_POST_BIND,
        CGROUP_INET6_POST_BIND,
        CGROUP_UDP4_SENDMSG,
        CGROUP_UDP6_SENDMSG,
        CGROUP_UNIX_SENDMSG,
        CGROUP_SYSCTL,
        CGROUP_UDP4_RECVMSG,
        CGROUP_UDP6_RECVMSG,
        CGROUP_UNIX_RECVMSG,
        CGROUP_GETSOCKOPT,
        CGROUP_SETSOCKOPT,
        CGROUP_INET4_GETPEERNAME,
        CGROUP_INET6_GETPEERNAME,
        CGROUP_UNIX_GETPEERNAME,
        CGROUP_INET4_GETSOCKNAME,
        CGROUP_INET6_GETSOCKNAME,
        CGROUP_UNIX_GETSOCKNAME,
        CGROUP_INET_SOCK_RELEASE,
        CGROUP_LSM_START,
        CGROUP_LSM_END,
        MAX_CGROUP_BPF_ATTACH_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct cgroup *start; enum bpf_cgroup_iter_order order; }")
    @NotUsableInJava
    public static class cgroup_of_bpf_iter_aux_info
    extends Struct {
        public Ptr<runtime.cgroup> start;
        public BpfDefinitions.bpf_cgroup_iter_order order;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_root")
    @NotUsableInJava
    public static class cgroup_root
    extends Struct {
        public Ptr<KernfsDefinitions.kernfs_root> kf_root;
        public @Unsigned int subsys_mask;
        public int hierarchy_id;
        public ListDefinitions.list_head root_list;
        public misc.callback_head rcu;
        public runtime.cgroup cgrp;
        public Ptr<runtime.cgroup> cgrp_ancestor_storage;
        public AtomicDefinitions.atomic_t nr_cgrps;
        public @Unsigned int flags;
        public char @Size(value=4096) [] release_agent_path;
        public char @Size(value=64) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_freezer_state")
    @NotUsableInJava
    public static class cgroup_freezer_state
    extends Struct {
        public boolean freeze;
        public int e_freeze;
        public int nr_frozen_descendants;
        public int nr_frozen_tasks;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_rstat_cpu")
    @NotUsableInJava
    public static class cgroup_rstat_cpu
    extends Struct {
        public misc.u64_stats_sync bsync;
        public cgroup_base_stat bstat;
        public cgroup_base_stat last_bstat;
        public cgroup_base_stat subtree_bstat;
        public cgroup_base_stat last_subtree_bstat;
        public Ptr<runtime.cgroup> updated_children;
        public Ptr<runtime.cgroup> updated_next;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_base_stat")
    @NotUsableInJava
    public static class cgroup_base_stat
    extends Struct {
        public TaskDefinitions.task_cputime cputime;
        public @Unsigned long forceidle_sum;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_subsys")
    @NotUsableInJava
    public static class cgroup_subsys
    extends Struct {
        public Ptr<?> css_alloc;
        public Ptr<?> css_online;
        public Ptr<?> css_offline;
        public Ptr<?> css_released;
        public Ptr<?> css_free;
        public Ptr<?> css_reset;
        public Ptr<?> css_rstat_flush;
        public Ptr<?> css_extra_stat_show;
        public Ptr<?> css_local_stat_show;
        public Ptr<?> can_attach;
        public Ptr<?> cancel_attach;
        public Ptr<?> attach;
        public Ptr<?> post_attach;
        public Ptr<?> can_fork;
        public Ptr<?> cancel_fork;
        public Ptr<?> fork;
        public Ptr<?> exit;
        public Ptr<?> release;
        public Ptr<?> bind;
        public boolean early_init;
        public boolean implicit_on_dfl;
        public boolean threaded;
        public int id;
        public String name;
        public String legacy_name;
        public Ptr<cgroup_root> root;
        public runtime.idr css_idr;
        public ListDefinitions.list_head cfts;
        public Ptr<runtime.cftype> dfl_cftypes;
        public Ptr<runtime.cftype> legacy_cftypes;
        public @Unsigned int depends_on;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_subsys_state")
    @NotUsableInJava
    public static class cgroup_subsys_state
    extends Struct {
        public Ptr<runtime.cgroup> cgroup;
        public Ptr<cgroup_subsys> ss;
        public PercpuDefinitions.percpu_ref refcnt;
        public ListDefinitions.list_head sibling;
        public ListDefinitions.list_head children;
        public ListDefinitions.list_head rstat_css_node;
        public int id;
        public @Unsigned int flags;
        public @Unsigned long serial_nr;
        public AtomicDefinitions.atomic_t online_cnt;
        public misc.work_struct destroy_work;
        public RcuDefinitions.rcu_work destroy_rwork;
        public Ptr<cgroup_subsys_state> parent;
        public int nr_descendants;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_file")
    @NotUsableInJava
    public static class cgroup_file
    extends Struct {
        public Ptr<KernfsDefinitions.kernfs_node> kn;
        public @Unsigned long notified_at;
        public TimerDefinitions.timer_list notify_timer;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_bpf")
    @NotUsableInJava
    public static class cgroup_bpf
    extends Struct {
        public Ptr<BpfDefinitions.bpf_prog_array> @Size(value=38) [] effective;
        public misc.hlist_head @Size(value=38) [] progs;
        public char @Size(value=38) [] flags;
        public ListDefinitions.list_head storages;
        public Ptr<BpfDefinitions.bpf_prog_array> inactive;
        public PercpuDefinitions.percpu_ref refcnt;
        public misc.work_struct release_work;
    }

    @Type(noCCodeGeneration=true, cType="struct cgroup_namespace")
    @NotUsableInJava
    public static class cgroup_namespace
    extends Struct {
        public NsDefinitions.ns_common ns;
        public Ptr<UserDefinitions.user_namespace> user_ns;
        public Ptr<runtime.ucounts> ucounts;
        public Ptr<CssDefinitions.css_set> root_cset;
    }
}

