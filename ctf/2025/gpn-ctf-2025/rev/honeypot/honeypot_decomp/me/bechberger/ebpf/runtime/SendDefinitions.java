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
import me.bechberger.ebpf.runtime.CtDefinitions;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.FsnotifyDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.VirtnetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SendDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_sig_all(int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_sigio(Ptr<misc.fown_struct> fown, int fd2, int band) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_sigio_to_task(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.fown_struct> fown, int fd2, int reason, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_sigtrap(Ptr<PtDefinitions.pt_regs> regs, int error_code, int si_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sigurg(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__send_ipi_mask_ex((const struct cpumask*)$arg1, $arg2, $arg3)")
    public static boolean __send_ipi_mask_ex(Ptr<runtime.cpumask> mask, int vector, boolean exclude_self) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __send_ipi_one(int cpu2, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __send_signal_locked(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> t, PidDefinitions.pid_type type2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sig(int sig, Ptr<TaskDefinitions.task_struct> p, int priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sig_fault(int sig, int code2, Ptr<?> addr2, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sig_fault_trapno(int sig, int code2, Ptr<?> addr2, int trapno, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sig_info(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sig_mceerr(int code2, Ptr<?> addr2, short lsb, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sig_perf(Ptr<?> addr2, @Unsigned int type2, @Unsigned long sig_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_signal_locked(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> t, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_sigqueue(Ptr<runtime.sigqueue> q, Ptr<runtime.pid> pid2, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_vblank_event(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_pending_vblank_event> e, @Unsigned long seq, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __send_duplicate_bios(Ptr<misc.clone_info> ci, Ptr<DmDefinitions.dm_target> ti, @Unsigned int num_bios, Ptr<@Unsigned Integer> len, @Unsigned @OriginalName(value="gfp_t") int gfp_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __send_empty_flush(Ptr<misc.clone_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char __send_zone_reset_all_emulated(Ptr<misc.clone_info> ci, Ptr<DmDefinitions.dm_target> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_all_trees(Ptr<DeflateDefinitions.deflate_state> s2, int lcodes, int dcodes, int blcodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_break(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_dm_alert(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_pcc_cmd(int pcc_ss_id, @Unsigned short cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int send_signal_irq_work_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="send_to_group($arg1, (const void*)$arg2, $arg3, $arg4, (const struct qstr*)$arg5, $arg6, $arg7)")
    public static int send_to_group(@Unsigned int mask, Ptr<?> data, int data_type, Ptr<runtime.inode> dir, Ptr<runtime.qstr> file_name, @Unsigned int cookie, Ptr<FsnotifyDefinitions.fsnotify_iter_info> iter_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void send_tree(Ptr<DeflateDefinitions.deflate_state> s2, Ptr<CtDefinitions.ct_data_s> tree, int max_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __send_control_msg(Ptr<misc.ports_device> portdev, @Unsigned int port_id, @Unsigned int event2, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __send_to_port(Ptr<runtime.port> port2, Ptr<runtime.scatterlist> sg2, int nents, @Unsigned long in_count, Ptr<?> data, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct send_queue")
    @NotUsableInJava
    public static class send_queue
    extends Struct {
        public Ptr<runtime.virtqueue> vq;
        public runtime.scatterlist @Size(value=19) [] sg;
        public char @Size(value=16) [] name;
        public VirtnetDefinitions.virtnet_sq_stats stats;
        public VirtnetDefinitions.virtnet_interrupt_coalesce intr_coal;
        public NapiDefinitions.napi_struct napi;
        public boolean reset;
    }

    @Type(noCCodeGeneration=true, cType="struct send_signal_irq_work")
    @NotUsableInJava
    public static class send_signal_irq_work
    extends Struct {
        public IrqDefinitions.irq_work irq_work;
        public Ptr<TaskDefinitions.task_struct> task;
        public @Unsigned int sig;
        public PidDefinitions.pid_type type;
    }
}

