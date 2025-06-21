/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FilterDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.HteDefinitions;
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TrackDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ProcessDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __process_echoes(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_cpu_clock_get((const int)$arg1, $arg2)")
    public static int process_cpu_clock_get(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_cpu_clock_getres((const int)$arg1, $arg2)")
    public static int process_cpu_clock_getres(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_cpu_nsleep((const int)$arg1, $arg2, (const struct timespec64*)$arg3)")
    public static int process_cpu_nsleep(@OriginalName(value="clockid_t") int which_clock, int flags, Ptr<runtime.timespec64> rqtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_cpu_timer_create(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_echoes(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_fetch_insn(Ptr<misc.fetch_insn> code2, Ptr<?> rec, Ptr<?> edata, Ptr<?> dest, Ptr<?> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_output_block($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long process_output_block(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_slab(Ptr<misc.loc_track> t, Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, TrackDefinitions.track_item alloc, Ptr<@Unsigned Long> obj_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_srcu(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HteDefinitions.hte_return process_hw_ts(Ptr<HteDefinitions.hte_ts_data> ts, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HteDefinitions.hte_return process_hw_ts_thread(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_jobs($arg1, $arg2, (int (*)(struct kcopyd_job*))$arg3)")
    public static int process_jobs(Ptr<ListDefinitions.list_head> jobs, Ptr<DmDefinitions.dm_kcopyd_client> kc, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_mod_list(Ptr<ListDefinitions.list_head> head, Ptr<FtraceDefinitions.ftrace_ops> ops, String mod, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_msg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_sdio_pending_irqs(Ptr<MmcDefinitions.mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean process_shares_mm(Ptr<TaskDefinitions.task_struct> p, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_timeout(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_writes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __process_kf_arg_ptr_to_graph_node(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned int regno, Ptr<BpfDefinitions.bpf_kfunc_call_arg_meta> meta, BtfDefinitions.btf_field_type head_field_type, BtfDefinitions.btf_field_type node_field_type, Ptr<Ptr<BtfDefinitions.btf_field>> node_field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_backlog(Ptr<NapiDefinitions.napi_struct> napi, int quota) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_bit1(Ptr<runtime.writer> wr, Ptr<runtime.rc> rc2, Ptr<runtime.cstate> cst, Ptr<@Unsigned @OriginalName(value="uint16_t") Short> p, int pos_state, Ptr<@Unsigned @OriginalName(value="uint16_t") Short> prob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_bulk_intr_td(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_virt_ep> ep, Ptr<XhciDefinitions.xhci_ring> ep_ring, Ptr<XhciDefinitions.xhci_td> td2, Ptr<XhciDefinitions.xhci_trb> ep_trb, Ptr<XhciDefinitions.xhci_transfer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_dynptr_func(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, int insn_idx, BpfDefinitions.bpf_arg_type arg_type, int clone_ref_obj_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_init_reply(Ptr<FuseDefinitions.fuse_mount> fm, Ptr<FuseDefinitions.fuse_args> args, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_isoc_td(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_virt_ep> ep, Ptr<XhciDefinitions.xhci_ring> ep_ring, Ptr<XhciDefinitions.xhci_td> td2, Ptr<XhciDefinitions.xhci_trb> ep_trb, Ptr<XhciDefinitions.xhci_transfer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_iter_arg(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, int insn_idx, Ptr<BpfDefinitions.bpf_kfunc_call_arg_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_iter_next_call(Ptr<BpfDefinitions.bpf_verifier_env> env, int insn_idx, Ptr<BpfDefinitions.bpf_kfunc_call_arg_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_kf_arg_ptr_to_btf_id($arg1, $arg2, (const struct btf_type*)$arg3, (const u8*)$arg4, $arg5, $arg6, $arg7)")
    public static int process_kf_arg_ptr_to_btf_id(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, Ptr<BtfDefinitions.btf_type> ref_t, String ref_tname, @Unsigned int ref_id, Ptr<BpfDefinitions.bpf_kfunc_call_arg_meta> meta, int argno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_preds($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int process_preds(Ptr<TraceDefinitions.trace_event_call> call, String filter_string, Ptr<EventDefinitions.event_filter> filter, Ptr<FilterDefinitions.filter_parse_error> pe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_request_key_err(long err_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_spin_lock(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, boolean is_lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_sysctl_arg($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int process_sysctl_arg(String param2, String val, String unused, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int process_system_preds(Ptr<TraceDefinitions.trace_subsystem_dir> dir, Ptr<TraceDefinitions.trace_array> tr, Ptr<FilterDefinitions.filter_parse_error> pe, String filter_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __process_new_adapter(Ptr<DeviceDefinitions.device_driver> d, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __process_new_driver(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __process_removed_adapter(Ptr<DeviceDefinitions.device_driver> d, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __process_removed_driver(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_adjtimex_modes((const struct __kernel_timex*)$arg1, $arg2)")
    public static void process_adjtimex_modes(Ptr<KernelDefinitions.__kernel_timex> txc, Ptr<Integer> time_tai) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_buffer_measurement($arg1, $arg2, (const void*)$arg3, $arg4, (const u8*)$arg5, $arg6, $arg7, (const u8*)$arg8, $arg9, $arg10, $arg11)")
    public static int process_buffer_measurement(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<?> buf, int size, String eventname, ImaDefinitions.ima_hooks func, int pcr, String func_data, boolean buf_hash, Ptr<Character> digest, @Unsigned long digest_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_ddsp_deferred_locals(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_measurement($arg1, (const struct cred*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int process_measurement(Ptr<runtime.file> file2, Ptr<runtime.cred> cred2, @Unsigned int secid, String buf, @OriginalName(value="loff_t") long size, int mask, ImaDefinitions.ima_hooks func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void process_one_work(Ptr<runtime.worker> worker2, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="process_vm_rw($arg1, (const struct iovec*)$arg2, $arg3, (const struct iovec*)$arg4, $arg5, $arg6, $arg7)")
    public static @OriginalName(value="ssize_t") long process_vm_rw(@OriginalName(value="pid_t") int pid2, Ptr<runtime.iovec> lvec, @Unsigned long liovcnt, Ptr<runtime.iovec> rvec, @Unsigned long riovcnt, @Unsigned long flags, int vm_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct process_timer")
    @NotUsableInJava
    public static class process_timer
    extends Struct {
        public TimerDefinitions.timer_list timer;
        public Ptr<TaskDefinitions.task_struct> task;
    }
}

