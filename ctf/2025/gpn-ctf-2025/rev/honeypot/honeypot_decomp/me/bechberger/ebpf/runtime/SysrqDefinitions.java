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
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SysrqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__sysrq_swap_key_ops($arg1, (const struct sysrq_key_op*)$arg2, (const struct sysrq_key_op*)$arg3)")
    public static int __sysrq_swap_key_ops(char key2, Ptr<sysrq_key_op> insert_op_p, Ptr<sysrq_key_op> remove_op_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysrq_always_enabled_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysrq_connect($arg1, $arg2, (const struct input_device_id*)$arg3)")
    public static int sysrq_connect(Ptr<InputDefinitions.input_handler> handler, Ptr<InputDefinitions.input_dev> dev, Ptr<InputDefinitions.input_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_disconnect(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_do_reset(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sysrq_filter(Ptr<InputDefinitions.input_handle> handle, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_ftrace_dump(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_SAK(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_crash(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sysrq_handle_keypress(Ptr<sysrq_state> sysrq, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_kill(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_loglevel(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_moom(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_mountro(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_reboot(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_replay_logs(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_show_timers(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_showallcpus(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_showmem(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_showregs(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_showstate(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_showstate_blocked(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_sync(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_term(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_thaw(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_unraw(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_unrt(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysrq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysrq_mask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sysrq_on() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_register_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_reinject_alt_sysrq(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysrq_reset_seq_param_set((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int sysrq_reset_seq_param_set(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysrq_toggle_support(int enable_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_sched_debug_show() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_timer_list_show() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_dbg(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysrq_handler($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void sysrq_handler(Ptr<XenbusDefinitions.xenbus_watch> watch2, String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_show_rcu(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_sched_ext_dump(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysrq_handle_sched_ext_reset(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysrq_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysrq_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sysrq_state")
    @NotUsableInJava
    public static class sysrq_state
    extends Struct {
        public InputDefinitions.input_handle handle;
        public misc.work_struct reinject_work;
        public @Unsigned long @Size(value=12) [] key_down;
        public @Unsigned int alt;
        public @Unsigned int alt_use;
        public @Unsigned int shift;
        public @Unsigned int shift_use;
        public boolean active;
        public boolean need_reinject;
        public boolean reinjecting;
        public boolean reset_canceled;
        public boolean reset_requested;
        public @Unsigned long @Size(value=12) [] reset_keybit;
        public int reset_seq_len;
        public int reset_seq_cnt;
        public int reset_seq_version;
        public TimerDefinitions.timer_list keyreset_timer;
    }

    @Type(noCCodeGeneration=true, cType="struct sysrq_key_op")
    @NotUsableInJava
    public static class sysrq_key_op
    extends Struct {
        public Ptr<?> handler;
        public String help_msg;
        public String action_msg;
        public int enable_mask;
    }
}

