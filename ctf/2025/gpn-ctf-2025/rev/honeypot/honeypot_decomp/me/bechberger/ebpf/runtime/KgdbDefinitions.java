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
import me.bechberger.ebpf.runtime.FifoDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KgdbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_hex2long(Ptr<String> ptr, Ptr<@Unsigned Long> long_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_hex2mem(String buf, String mem, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String kgdb_mem2hex(String mem, String buf, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_driver> kgdb_nmi_console_device(Ptr<runtime.console> co, Ptr<Integer> idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmi_console_setup(Ptr<runtime.console> co, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kgdb_nmi_console_write($arg1, (const u8*)$arg2, $arg3)")
    public static void kgdb_nmi_console_write(Ptr<runtime.console> co, String s2, @Unsigned @OriginalName(value="uint") int c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kgdb_nmi_poll_knock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmi_poll_one_knock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmi_tty_activate(Ptr<TtyDefinitions.tty_port> port2, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_nmi_tty_cleanup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_nmi_tty_close(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_nmi_tty_hangup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmi_tty_install(Ptr<TtyDefinitions.tty_driver> drv, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmi_tty_open(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_nmi_tty_receiver(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_nmi_tty_shutdown(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kgdb_nmi_tty_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long kgdb_nmi_tty_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned long c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kgdb_nmi_tty_write_room(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_register_nmi_console() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_unregister_nmi_console() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kgdb_notify(Ptr<misc.die_args> args, @Unsigned long cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_arch_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_arch_handle_exception(int e_vector, int signo, int err_code, String remcomInBuffer, String remcomOutBuffer, Ptr<PtDefinitions.pt_regs> linux_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_arch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_arch_late() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kgdb_arch_pc(int exception2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_arch_remove_breakpoint(Ptr<kgdb_bkpt> bpt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_arch_set_breakpoint(Ptr<kgdb_bkpt> bpt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_arch_set_pc(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_breakpoint() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_call_nmi_hook(Ptr<?> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_correct_hw_break() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_cpu_enter(Ptr<kgdb_state> ks, Ptr<PtDefinitions.pt_regs> regs, int exception_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_disable_hw_debug(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_flush_swbreak_addr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_free_init_mem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_handle_exception(int evector, int signo, int ecode, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_has_hit_break(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_hw_overflow_handler(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_initial_breakpoint() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_io_ready(int print_wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_isremovedbreak(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kgdb_ll_trap($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int kgdb_ll_trap(int cmd, String str, Ptr<PtDefinitions.pt_regs> regs, long err, int trap, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmi_handler(@Unsigned int cmd, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmicallback(int cpu2, Ptr<?> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_nmicallin(int cpu2, int trapnr, Ptr<?> regs, int err_code, Ptr<AtomicDefinitions.atomic_t> send_ready) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_notify(Ptr<misc.notifier_block> self, @Unsigned long cmd, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kgdb_panic((const u8*)$arg1)")
    public static void kgdb_panic(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_reenter_check(Ptr<kgdb_state> ks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_register_io_module(Ptr<kgdb_io> new_dbg_io_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_remove_all_hw_break() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_remove_hw_break(@Unsigned long addr2, int len, kgdb_bptype bptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_roundup_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_set_hw_break(@Unsigned long addr2, int len, kgdb_bptype bptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_skipexception(int exception2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kgdb_unregister_io_module(Ptr<kgdb_io> old_dbg_io_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_validate_break_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kgdb_transition_check(String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kgdb_bkpt")
    @NotUsableInJava
    public static class kgdb_bkpt
    extends Struct {
        public @Unsigned long bpt_addr;
        public char @Size(value=1) [] saved_instr;
        public kgdb_bptype type;
        public kgdb_bpstate state;
    }

    @Type(noCCodeGeneration=true, cType="enum kgdb_bpstate")
    public static enum kgdb_bpstate implements Enum<kgdb_bpstate>,
    TypedEnum<kgdb_bpstate, Integer>
    {
        BP_UNDEFINED,
        BP_REMOVED,
        BP_SET,
        BP_ACTIVE;

    }

    @Type(noCCodeGeneration=true, cType="struct kgdb_nmi_tty_priv")
    @NotUsableInJava
    public static class kgdb_nmi_tty_priv
    extends Struct {
        public TtyDefinitions.tty_port port;
        public TimerDefinitions.timer_list timer;
        public FifoDefinitions.fifo_of_kgdb_nmi_tty_priv fifo;
    }

    @Type(noCCodeGeneration=true, cType="struct kgdb_state")
    @NotUsableInJava
    public static class kgdb_state
    extends Struct {
        public int ex_vector;
        public int signo;
        public int err_code;
        public int cpu;
        public int pass_exception;
        public @Unsigned long thr_query;
        public @Unsigned long threadid;
        public long kgdb_usethreadid;
        public Ptr<PtDefinitions.pt_regs> linux_regs;
        public Ptr<AtomicDefinitions.atomic_t> send_ready;
    }

    @Type(noCCodeGeneration=true, cType="struct kgdb_io")
    @NotUsableInJava
    public static class kgdb_io
    extends Struct {
        public String name;
        public Ptr<?> read_char;
        public Ptr<?> write_char;
        public Ptr<?> flush;
        public Ptr<?> init;
        public Ptr<?> deinit;
        public Ptr<?> pre_exception;
        public Ptr<?> post_exception;
        public Ptr<runtime.console> cons;
    }

    @Type(noCCodeGeneration=true, cType="struct kgdb_arch")
    @NotUsableInJava
    public static class kgdb_arch
    extends Struct {
        public char @Size(value=1) [] gdb_bpt_instr;
        public @Unsigned long flags;
        public Ptr<?> set_breakpoint;
        public Ptr<?> remove_breakpoint;
        public Ptr<?> set_hw_breakpoint;
        public Ptr<?> remove_hw_breakpoint;
        public Ptr<?> disable_hw_break;
        public Ptr<?> remove_all_hw_break;
        public Ptr<?> correct_hw_break;
        public Ptr<?> enable_nmi;
    }

    @Type(noCCodeGeneration=true, cType="enum kgdb_bptype")
    public static enum kgdb_bptype implements Enum<kgdb_bptype>,
    TypedEnum<kgdb_bptype, Integer>
    {
        BP_BREAKPOINT,
        BP_HARDWARE_BREAKPOINT,
        BP_WRITE_WATCHPOINT,
        BP_READ_WATCHPOINT,
        BP_ACCESS_WATCHPOINT,
        BP_POKE_BREAKPOINT;

    }
}

