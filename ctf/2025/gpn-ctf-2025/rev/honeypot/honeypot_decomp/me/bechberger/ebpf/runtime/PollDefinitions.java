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
import me.bechberger.ebpf.runtime.CpuidleDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PollDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void poll_freewait(Ptr<poll_wqueues> pwq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void poll_initwait(Ptr<poll_wqueues> pwq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int poll_select_finish(Ptr<runtime.timespec64> end_time, Ptr<?> p, poll_time_type pt_type, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int poll_select_set_timeout(Ptr<runtime.timespec64> to, @OriginalName(value="time64_t") long sec, long nsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void poll_spurious_irqs(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean poll_state_synchronize_srcu(Ptr<SrcuDefinitions.srcu_struct> ssp, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int poll_thread(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void poll_one_napi(Ptr<NapiDefinitions.napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void poll_timer_fn(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int poll_idle(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean poll_state_synchronize_rcu(@Unsigned long oldstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean poll_state_synchronize_rcu_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct poll_iocb")
    @NotUsableInJava
    public static class poll_iocb
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<WaitDefinitions.wait_queue_head> head;
        public @Unsigned @OriginalName(value="__poll_t") int events;
        public boolean cancelled;
        public boolean work_scheduled;
        public boolean work_need_resched;
        public WaitDefinitions.wait_queue_entry wait;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct poll_list")
    @NotUsableInJava
    public static class poll_list
    extends Struct {
        public Ptr<poll_list> next;
        public @Unsigned int len;
        public runtime.pollfd @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="enum poll_time_type")
    public static enum poll_time_type implements Enum<poll_time_type>,
    TypedEnum<poll_time_type, Integer>
    {
        PT_TIMEVAL,
        PT_OLD_TIMEVAL,
        PT_TIMESPEC,
        PT_OLD_TIMESPEC;

    }

    @Type(noCCodeGeneration=true, cType="struct poll_table_page")
    @NotUsableInJava
    public static class poll_table_page
    extends Struct {
        public Ptr<poll_table_page> next;
        public Ptr<poll_table_entry> entry;
        public poll_table_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct poll_wqueues")
    @NotUsableInJava
    public static class poll_wqueues
    extends Struct {
        public poll_table_struct pt;
        public Ptr<poll_table_page> table;
        public Ptr<TaskDefinitions.task_struct> polling_task;
        public int triggered;
        public int error;
        public int inline_index;
        public poll_table_entry @Size(value=9) [] inline_entries;
    }

    @Type(noCCodeGeneration=true, cType="struct poll_table_entry")
    @NotUsableInJava
    public static class poll_table_entry
    extends Struct {
        public Ptr<runtime.file> filp;
        public @Unsigned @OriginalName(value="__poll_t") int key;
        public @OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry wait;
        public Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> wait_address;
    }

    @Type(noCCodeGeneration=true, cType="struct poll_table_struct")
    @NotUsableInJava
    public static class poll_table_struct
    extends Struct {
        public @OriginalName(value="poll_queue_proc") Ptr<?> _qproc;
        public @Unsigned @OriginalName(value="__poll_t") int _key;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct pollfd *ufds; int nfds; int has_timeout; long unsigned int tv_sec; long unsigned int tv_nsec; }")
    @NotUsableInJava
    public static class poll_of_anon_member_of_restart_block
    extends Struct {
        public Ptr<runtime.pollfd> ufds;
        public int nfds;
        public int has_timeout;
        public @Unsigned long tv_sec;
        public @Unsigned long tv_nsec;
    }
}

