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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PsiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_avgs_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_cgroup_alloc(Ptr<runtime.cgroup> cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_cgroup_free(Ptr<runtime.cgroup> cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_cgroup_restart(Ptr<psi_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_cpu_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_cpu_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="psi_cpu_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long psi_cpu_write(Ptr<runtime.file> file2, String user_buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_flags_change(Ptr<TaskDefinitions.task_struct> task2, int clear, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int psi_fop_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_fop_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_group_change(Ptr<psi_group> group, int cpu2, @Unsigned int clear, @Unsigned int set, boolean wake_clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_io_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_io_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="psi_io_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long psi_io_write(Ptr<runtime.file> file2, String user_buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_memory_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_memory_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="psi_memory_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long psi_memory_write(Ptr<runtime.file> file2, String user_buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_memstall_enter(Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_memstall_leave(Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_rtpoll_work(Ptr<psi_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_rtpoll_worker(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int psi_show(Ptr<SeqDefinitions.seq_file> m, Ptr<psi_group> group, psi_res res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_task_change(Ptr<TaskDefinitions.task_struct> task2, int clear, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_task_switch(Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, boolean sleep2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<psi_trigger> psi_trigger_create(Ptr<psi_group> group, String buf, psi_res res, Ptr<runtime.file> file2, Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void psi_trigger_destroy(Ptr<psi_trigger> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int psi_trigger_poll(Ptr<Ptr<?>> trigger_ptr, Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="psi_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long psi_write(Ptr<runtime.file> file2, String user_buf, @Unsigned long nbytes, psi_res res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { void *trigger; }")
    @NotUsableInJava
    public static class psi_of_cgroup_file_ctx
    extends Struct {
        public Ptr<?> trigger;
    }

    @Type(noCCodeGeneration=true, cType="struct psi_trigger")
    @NotUsableInJava
    public static class psi_trigger
    extends Struct {
        public psi_states state;
        public @Unsigned long threshold;
        public ListDefinitions.list_head node;
        public Ptr<psi_group> group;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head event_wait;
        public Ptr<KernfsDefinitions.kernfs_open_file> of;
        public int event;
        public psi_window win;
        public @Unsigned long last_event_time;
        public boolean pending_event;
        public psi_aggregators aggregator;
    }

    @Type(noCCodeGeneration=true, cType="struct psi_window")
    @NotUsableInJava
    public static class psi_window
    extends Struct {
        public @Unsigned long size;
        public @Unsigned long start_time;
        public @Unsigned long start_value;
        public @Unsigned long prev_growth;
    }

    @Type(noCCodeGeneration=true, cType="enum psi_aggregators")
    public static enum psi_aggregators implements Enum<psi_aggregators>,
    TypedEnum<psi_aggregators, Integer>
    {
        PSI_AVGS,
        PSI_POLL,
        NR_PSI_AGGREGATORS;

    }

    @Type(noCCodeGeneration=true, cType="enum psi_states")
    public static enum psi_states implements Enum<psi_states>,
    TypedEnum<psi_states, Integer>
    {
        PSI_IO_SOME,
        PSI_IO_FULL,
        PSI_MEM_SOME,
        PSI_MEM_FULL,
        PSI_CPU_SOME,
        PSI_CPU_FULL,
        PSI_NONIDLE,
        NR_PSI_STATES;

    }

    @Type(noCCodeGeneration=true, cType="enum psi_res")
    public static enum psi_res implements Enum<psi_res>,
    TypedEnum<psi_res, Integer>
    {
        PSI_IO,
        PSI_MEM,
        PSI_CPU,
        NR_PSI_RESOURCES;

    }

    @Type(noCCodeGeneration=true, cType="enum psi_task_count")
    public static enum psi_task_count implements Enum<psi_task_count>,
    TypedEnum<psi_task_count, Integer>
    {
        NR_IOWAIT,
        NR_MEMSTALL,
        NR_RUNNING,
        NR_MEMSTALL_RUNNING,
        NR_PSI_TASK_COUNTS;

    }

    @Type(noCCodeGeneration=true, cType="struct psi_group")
    @NotUsableInJava
    public static class psi_group
    extends Struct {
        public Ptr<psi_group> parent;
        public boolean enabled;
        public runtime.mutex avgs_lock;
        public Ptr<psi_group_cpu> pcpu;
        public @Unsigned long @Size(value=6) [] avg_total;
        public @Unsigned long avg_last_update;
        public @Unsigned long avg_next_update;
        public DelayedDefinitions.delayed_work avgs_work;
        public ListDefinitions.list_head avg_triggers;
        public @Unsigned int @Size(value=6) [] avg_nr_triggers;
        public @Unsigned long @Size(value=12) [] total;
        public @Unsigned long @Size(value=18) [] avg;
        public Ptr<TaskDefinitions.task_struct> rtpoll_task;
        public TimerDefinitions.timer_list rtpoll_timer;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head rtpoll_wait;
        public AtomicDefinitions.atomic_t rtpoll_wakeup;
        public AtomicDefinitions.atomic_t rtpoll_scheduled;
        public runtime.mutex rtpoll_trigger_lock;
        public ListDefinitions.list_head rtpoll_triggers;
        public @Unsigned int @Size(value=6) [] rtpoll_nr_triggers;
        public @Unsigned int rtpoll_states;
        public @Unsigned long rtpoll_min_period;
        public @Unsigned long @Size(value=6) [] rtpoll_total;
        public @Unsigned long rtpoll_next_update;
        public @Unsigned long rtpoll_until;
    }

    @Type(noCCodeGeneration=true, cType="struct psi_group_cpu")
    @NotUsableInJava
    public static class psi_group_cpu
    extends Struct {
        public  @OriginalName(value="seqcount_t") runtime.seqcount seq;
        public @Unsigned int @Size(value=4) [] tasks;
        public @Unsigned int state_mask;
        public @Unsigned int @Size(value=7) [] times;
        public @Unsigned long state_start;
        public @Unsigned int @Size(value=14) [] times_prev;
    }
}

