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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.ScmDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerlatDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WaitDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_device_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_owner_exiting(int ret, Ptr<TaskDefinitions.task_struct> exiting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_random_bytes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_space(Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_stable_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_unix_gc(Ptr<ScmDefinitions.scm_fp_list> fpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_next_period(Ptr<TimerlatDefinitions.timerlat_variables> tlat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_on_page_writeback(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_on_pipe(Ptr<TraceDefinitions.trace_iterator> iter2, int full) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wait_pipe_cond(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_transaction_locked(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__wait_for_common($arg1, (long int (*)(long int))$arg2, $arg3, $arg4)")
    public static long __wait_for_common(Ptr<runtime.completion> x, Ptr<?> action, long timeout, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __wait_on_bit(Ptr<wait_queue_head> wq_head, Ptr<wait_bit_queue_entry> wbq_entry, Ptr<?> action, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __wait_on_bit_lock(Ptr<wait_queue_head> wq_head, Ptr<wait_bit_queue_entry> wbq_entry, Ptr<?> action, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wait_on_buffer(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wait_rcu_gp(boolean checktiny, @Unsigned int state2, int n, Ptr<@OriginalName(value="call_rcu_func_t") Ptr<?>> crcu_array, Ptr<RcuDefinitions.rcu_synchronize> rs_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_bit_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_completion(Ptr<runtime.completion> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_completion_interruptible(Ptr<runtime.completion> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long wait_for_completion_interruptible_timeout(Ptr<runtime.completion> x, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_completion_io(Ptr<runtime.completion> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long wait_for_completion_io_timeout(Ptr<runtime.completion> x, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_completion_killable(Ptr<runtime.completion> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long wait_for_completion_killable_timeout(Ptr<runtime.completion> x, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_completion_state(Ptr<runtime.completion> x, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long wait_for_completion_timeout(Ptr<runtime.completion> x, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_kprobe_optimizer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_lsr(Ptr<runtime.uart_8250_port> up, int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_panic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_xmitr(Ptr<runtime.uart_8250_port> up, int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long wait_woken(Ptr<wait_queue_entry> wq_entry, @Unsigned int mode, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wait_on_freeing_inode(Ptr<runtime.inode> inode2, boolean is_inode_hash_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_consider_task(Ptr<wait_opts> wo, int ptrace, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_init_devices_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_tpm_stat(Ptr<TpmDefinitions.tpm_chip> chip, char mask, @Unsigned long timeout, Ptr<@OriginalName(value="wait_queue_head_t") wait_queue_head> queue, boolean check_cancel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wait_for_tpm_stat_cond(Ptr<TpmDefinitions.tpm_chip> chip, char mask, boolean check_cancel, Ptr<@OriginalName(value="bool") Boolean> canceled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wait_probe_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_rcu_exp_gp(Ptr<KthreadDefinitions.kthread_work> wp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_sb_inodes(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long wait_task_inactive(Ptr<TaskDefinitions.task_struct> p, @Unsigned int match_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_task_stopped(Ptr<wait_opts> wo, int ptrace, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_task_zombie(Ptr<wait_opts> wo, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_entry_unlocked(Ptr<XaDefinitions.xa_state> xas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_devices(Ptr<XenbusDefinitions.xenbus_driver> xendrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_for_initramfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_key_construction(Ptr<runtime.key> key2, boolean intr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_for_partner(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<@Unsigned Integer> cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wait_loop(@Unsigned long start, @Unsigned int max_delay, Ptr<@Unsigned Integer> seconds_waited) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_nvdimm_bus_probe_idle(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wait_port_writable(Ptr<runtime.port> port2, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wait_while_offlining() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wait_opts")
    @NotUsableInJava
    public static class wait_opts
    extends Struct {
        public PidDefinitions.pid_type wo_type;
        public int wo_flags;
        public Ptr<runtime.pid> wo_pid;
        public Ptr<misc.waitid_info> wo_info;
        public int wo_stat;
        public Ptr<runtime.rusage> wo_rusage;
        public @OriginalName(value="wait_queue_entry_t") wait_queue_entry child_wait;
        public int notask_error;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_exceptional_entry_queue")
    @NotUsableInJava
    public static class wait_exceptional_entry_queue
    extends Struct {
        public @OriginalName(value="wait_queue_entry_t") wait_queue_entry wait;
        public misc.exceptional_entry_key key;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_page_key")
    @NotUsableInJava
    public static class wait_page_key
    extends Struct {
        public Ptr<runtime.folio> folio;
        public int bit_nr;
        public int page_match;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_bit_queue_entry")
    @NotUsableInJava
    public static class wait_bit_queue_entry
    extends Struct {
        public wait_bit_key key;
        public wait_queue_entry wq_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_bit_key")
    @NotUsableInJava
    public static class wait_bit_key
    extends Struct {
        public Ptr<?> flags;
        public int bit_nr;
        public @Unsigned long timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_page_queue")
    @NotUsableInJava
    public static class wait_page_queue
    extends Struct {
        public Ptr<runtime.folio> folio;
        public int bit_nr;
        public @OriginalName(value="wait_queue_entry_t") wait_queue_entry wait;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_queue_entry")
    @NotUsableInJava
    public static class wait_queue_entry
    extends Struct {
        public @Unsigned int flags;
        public Ptr<?> _private;
        public @OriginalName(value="wait_queue_func_t") Ptr<?> func;
        public ListDefinitions.list_head entry;
    }

    @Type(noCCodeGeneration=true, cType="struct wait_queue_head")
    @NotUsableInJava
    public static class wait_queue_head
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head head;
    }
}

