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
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KgdbDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KdbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_ftdump($arg1, (const u8**)$arg2)")
    public static int kdb_ftdump(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_ftrace_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_getarea_size(Ptr<?> res, @Unsigned long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_getphys(Ptr<?> res, @Unsigned long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_getphysword(Ptr<@Unsigned Long> word, @Unsigned long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_getword(Ptr<@Unsigned Long> word, @Unsigned long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_lsmod($arg1, (const u8**)$arg2)")
    public static int kdb_lsmod(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_process_cpu((const struct task_struct*)$arg1)")
    public static int kdb_process_cpu(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_putarea_size(@Unsigned long addr2, Ptr<?> res, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_putword(@Unsigned long addr2, @Unsigned long word, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_restore_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_save_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_strdup((const u8*)$arg1, $arg2)")
    public static String kdb_strdup(String str, @Unsigned @OriginalName(value="gfp_t") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_symbol_print($arg1, (const __ksymtab*)$arg2, $arg3)")
    public static void kdb_symbol_print(@Unsigned long addr2, Ptr< @OriginalName(value="kdb_symtab_t") runtime.__ksymtab> symtab_p, @Unsigned int punc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_task_state((const struct task_struct*)$arg1, (const u8*)$arg2)")
    public static boolean kdb_task_state(Ptr<TaskDefinitions.task_struct> p, String mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_task_state_char((const struct task_struct*)$arg1)")
    public static char kdb_task_state_char(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)kdb_walk_kallsyms($arg1))")
    public static String kdb_walk_kallsyms(Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_bt($arg1, (const u8**)$arg2)")
    public static int kdb_bt(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_bt1($arg1, (const u8*)$arg2, $arg3)")
    public static int kdb_bt1(Ptr<TaskDefinitions.task_struct> p, String mask, boolean btaprompt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_bt_cpu(@Unsigned long cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_get_kbd_char() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_kbd_cleanup_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_send_sig(Ptr<TaskDefinitions.task_struct> t, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_show_stack(Ptr<TaskDefinitions.task_struct> p, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_cpu($arg1, (const u8**)$arg2)")
    public static int kdb_cpu(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_cpu_status() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_defcmd($arg1, (const u8**)$arg2)")
    public static int kdb_defcmd(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_defcmd2((const u8*)$arg1, (const u8*)$arg2)")
    public static int kdb_defcmd2(String cmdstr, String argv0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_disable_nmi($arg1, (const u8**)$arg2)")
    public static int kdb_disable_nmi(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_dmesg($arg1, (const u8**)$arg2)")
    public static int kdb_dmesg(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_dump_stack_on_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_ef($arg1, (const u8**)$arg2)")
    public static int kdb_ef(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_env($arg1, (const u8**)$arg2)")
    public static int kdb_env(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_exec_defcmd($arg1, (const u8**)$arg2)")
    public static int kdb_exec_defcmd(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_go($arg1, (const u8**)$arg2)")
    public static int kdb_go(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_grep_help($arg1, (const u8**)$arg2)")
    public static int kdb_grep_help(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_help($arg1, (const u8**)$arg2)")
    public static int kdb_help(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_init(int lvl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_kgdb($arg1, (const u8**)$arg2)")
    public static int kdb_kgdb(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_kill($arg1, (const u8**)$arg2)")
    public static int kdb_kill(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_main_loop( @OriginalName(value="kdb_reason_t") runtime.KDB_REASON reason,  @OriginalName(value="kdb_reason_t") runtime.KDB_REASON reason2, int error,  @OriginalName(value="kdb_dbtrap_t") runtime.KDB_DB db_result, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_md($arg1, (const u8**)$arg2)")
    public static int kdb_md(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_md_line((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void kdb_md_line(String fmtstr, @Unsigned long addr2, int symbolic, int nosect, int bytesperword, int num, int repeat, int phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_mm($arg1, (const u8**)$arg2)")
    public static int kdb_mm(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_param_enable_nmi((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int kdb_param_enable_nmi(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_parse((const u8*)$arg1)")
    public static int kdb_parse(String cmdstr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_per_cpu($arg1, (const u8**)$arg2)")
    public static int kdb_per_cpu(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_pid($arg1, (const u8**)$arg2)")
    public static int kdb_pid(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_print_state((const u8*)$arg1, $arg2)")
    public static void kdb_print_state(String text, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_ps($arg1, (const u8**)$arg2)")
    public static int kdb_ps(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_ps1((const struct task_struct*)$arg1)")
    public static void kdb_ps1(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_ps_suppressed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_rd($arg1, (const u8**)$arg2)")
    public static int kdb_rd(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_reboot($arg1, (const u8**)$arg2)")
    public static int kdb_reboot(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_register(Ptr< @OriginalName(value="kdbtab_t") runtime._kdbtab> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_register_table(Ptr< @OriginalName(value="kdbtab_t") runtime._kdbtab> kp, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_rm($arg1, (const u8**)$arg2)")
    public static int kdb_rm(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_set($arg1, (const u8**)$arg2)")
    public static int kdb_set(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_setenv((const u8*)$arg1, (const u8*)$arg2)")
    public static int kdb_setenv(String var, String val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_sr($arg1, (const u8**)$arg2)")
    public static int kdb_sr(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_summary($arg1, (const u8**)$arg2)")
    public static int kdb_summary(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_unregister(Ptr< @OriginalName(value="kdbtab_t") runtime._kdbtab> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_bc($arg1, (const u8**)$arg2)")
    public static int kdb_bc(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_bp($arg1, (const u8**)$arg2)")
    public static int kdb_bp(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_bp_install(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_bp_remove() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_common_deinit_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_common_init_state(Ptr<KgdbDefinitions.kgdb_state> ks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_gdb_state_pass(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char kdb_getchar() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_getstr($arg1, $arg2, (const u8*)$arg3)")
    public static String kdb_getstr(String buffer, @Unsigned long bufsize, String prompt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_initbptab() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_input_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_msg_write((const u8*)$arg1, $arg2)")
    public static void kdb_msg_write(String msg, int msg_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kdb_printbp(Ptr<@OriginalName(value="kdb_bp_t") _kdb_bp> bp, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_printf((const u8*)$arg1, $arg2_)")
    public static int kdb_printf(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String kdb_read(String buffer, @Unsigned long bufsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_search_string(String searched, String searchfor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kdb_ss($arg1, (const u8**)$arg2)")
    public static int kdb_ss(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kdb_stub(Ptr<KgdbDefinitions.kgdb_state> ks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kdb_macro_statement")
    @NotUsableInJava
    public static class kdb_macro_statement
    extends Struct {
        public String statement;
        public ListDefinitions.list_head list_node;
    }

    @Type(noCCodeGeneration=true, cType="struct kdb_macro")
    @NotUsableInJava
    public static class kdb_macro
    extends Struct {
        public  @OriginalName(value="kdbtab_t") runtime._kdbtab cmd;
        public ListDefinitions.list_head statements;
    }

    @Type(noCCodeGeneration=true, cType="struct _kdb_bp")
    @NotUsableInJava
    public static class _kdb_bp
    extends Struct {
        public @Unsigned long bp_addr;
        public @Unsigned int bp_free;
        public @Unsigned int bp_enabled;
        public @Unsigned int bp_type;
        public @Unsigned int bp_installed;
        public @Unsigned int bp_delay;
        public @Unsigned int bp_delayed;
        public @Unsigned int bph_length;
    }

    @Type(noCCodeGeneration=true, cType="enum kdb_msgsrc")
    public static enum kdb_msgsrc implements Enum<kdb_msgsrc>,
    TypedEnum<kdb_msgsrc, Integer>
    {
        KDB_MSGSRC_INTERNAL,
        KDB_MSGSRC_PRINTK;

    }
}

