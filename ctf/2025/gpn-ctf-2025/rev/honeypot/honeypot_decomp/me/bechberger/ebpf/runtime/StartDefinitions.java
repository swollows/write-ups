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
import me.bechberger.ebpf.runtime.ConsoleDefinitions;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class StartDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_cfs_bandwidth(Ptr<misc.cfs_bandwidth> cfs_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_kernel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_kthread(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long start_poll_synchronize_srcu(Ptr<SrcuDefinitions.srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_this_handle(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __start_timer(Ptr<TimerDefinitions.timer_list> t, @Unsigned long interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="start_creating((const u8*)$arg1, $arg2)")
    public static Ptr<runtime.dentry> start_creating(String name, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_func_tracer(Ptr<TraceDefinitions.trace_array> tr, int graph) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_graph_tracing() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> start_object(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_periodic_check_for_corruption() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_secondary(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_thread(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long new_ip, @Unsigned long new_sp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_thread_common(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long new_ip, @Unsigned long new_sp, @Unsigned short _cs, @Unsigned short _ss, @Unsigned short _ds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __start_tty(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_dirtytime_writeback() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_iaa_cycle(Ptr<EhciDefinitions.ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long start_poll_synchronize_rcu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_poll_synchronize_rcu_common() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long start_poll_synchronize_rcu_expedited() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_poll_synchronize_rcu_expedited_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_poll_synchronize_rcu_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_stop_khugepaged() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_sync_check_timer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_tty(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_unlink_async(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_unlink_intr(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx start_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_admin1LSP_opal_session(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_anybodyASP_opal_session(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_auth_opal_session(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_cpu_kthread(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_dl_timer(Ptr<SchedDefinitions.sched_dl_entity> dl_se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="start_generic_opal_session($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int start_generic_opal_session(Ptr<OpalDefinitions.opal_dev> dev, OpalDefinitions.opal_uid auth, OpalDefinitions.opal_uid sp_type, String key2, char key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_isolate_page_range(@Unsigned long start_pfn, @Unsigned long end_pfn, int migratetype2, int flags, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_opal_session_cont(Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int start_single_kthread(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void start_wakeup_event(Ptr<VirtioDefinitions.virtio_balloon> vb, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct start_info")
    @NotUsableInJava
    public static class start_info
    extends Struct {
        public char @Size(value=32) [] magic;
        public @Unsigned long nr_pages;
        public @Unsigned long shared_info;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="xen_pfn_t") long store_mfn;
        public @Unsigned @OriginalName(value="uint32_t") int store_evtchn;
        public ConsoleDefinitions.console_of_start_info console;
        public @Unsigned long pt_base;
        public @Unsigned long nr_pt_frames;
        public @Unsigned long mfn_list;
        public @Unsigned long mod_start;
        public @Unsigned long mod_len;
        public @OriginalName(value="int8_t") byte @Size(value=1024) [] cmd_line;
        public @Unsigned long first_p2m_pfn;
        public @Unsigned long nr_p2m_frames;
    }
}

