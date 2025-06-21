/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.CrosDefinitions;
import me.bechberger.ebpf.runtime.DquotDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class PrepareDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_domain_attach_device(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_elf64_ram_headers_callback(Ptr<runtime.resource> res, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_elf_headers(Ptr<Ptr<?>> addr2, Ptr<@Unsigned Long> sz, Ptr<@Unsigned Long> nr_mem_ranges) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_ftrace_return(@Unsigned long ip, Ptr<@Unsigned Long> parent, @Unsigned long frame_pointer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="prepare_seq_file($arg1, $arg2, (const struct bpf_iter_seq_info*)$arg3)")
    public static int prepare_seq_file(Ptr<runtime.file> file2, Ptr<BpfDefinitions.bpf_iter_link> link2, Ptr<BpfDefinitions.bpf_iter_seq_info> seq_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_threshold_block(@Unsigned int bank, @Unsigned int block, @Unsigned int addr2, int offset, @Unsigned int misc_high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_tx(Ptr<CrosDefinitions.cros_ec_device> ec_dev, Ptr<CrosDefinitions.cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_warning(Ptr<DquotDefinitions.dquot_warn> warn, Ptr<runtime.dquot> dquot2, int warntype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __prepare_to_swait(Ptr<misc.swait_queue_head> q, Ptr<misc.swait_queue> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prepare_kswapd_sleep(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, int order, int highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_namespace() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_scan_control(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prepare_signal(int sig, Ptr<TaskDefinitions.task_struct> p, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_signaling(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_atomic_state> state2, Ptr<DrmDefinitions.drm_mode_atomic> arg2, Ptr<DrmDefinitions.drm_file> file_priv2, Ptr<Ptr<DrmDefinitions.drm_out_fence_state>> fence_state, Ptr<@Unsigned Integer> num_fences) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long prepare_to_swait_event(Ptr<misc.swait_queue_head> q, Ptr<misc.swait_queue> wait, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_to_swait_exclusive(Ptr<misc.swait_queue_head> q, Ptr<misc.swait_queue> wait, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_to_wait(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long prepare_to_wait_event(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prepare_to_wait_exclusive(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UprobeDefinitions.uprobe_cpu_buffer> prepare_uprobe_buffer(Ptr<TraceDefinitions.trace_uprobe> tu, Ptr<PtDefinitions.pt_regs> regs, Ptr<Ptr<UprobeDefinitions.uprobe_cpu_buffer>> ucbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cred> prepare_creds() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cred> prepare_exec_creds() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_func_exit(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<Integer> insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cred> prepare_kernel_cred(Ptr<TaskDefinitions.task_struct> daemon2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_lsm(Ptr<LsmDefinitions.lsm_info> lsm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_ring(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_ring> ep_ring, @Unsigned int ep_state, @Unsigned int num_trbs, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_task_switch(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_transfer(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_virt_device> xdev, @Unsigned int ep_index, @Unsigned int stream_id, @Unsigned int num_trbs, Ptr<runtime.urb> urb2, @Unsigned int td_index, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prepare_uretprobe(Ptr<runtime.uprobe> uprobe2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="prepare_arg_info($arg1, (const u8*)$arg2, (const u8*)$arg3, (const struct btf_type*)$arg4, $arg5)")
    public static int prepare_arg_info(Ptr<runtime.btf> btf2, String st_ops_name, String member_name, Ptr<BtfDefinitions.btf_type> func_proto, Ptr<BpfDefinitions.bpf_struct_ops_arg_info> arg_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_emulation(Ptr<runtime.kprobe> p, Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_image(Ptr<MemoryDefinitions.memory_bitmap> new_bm, Ptr<MemoryDefinitions.memory_bitmap> bm, Ptr<MemoryDefinitions.memory_bitmap> zero_bm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_percpu_nmi(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prepare_reply(Ptr<GenlDefinitions.genl_info> info2, char cmd, Ptr<Ptr<SkDefinitions.sk_buff>> skbp, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }
}

