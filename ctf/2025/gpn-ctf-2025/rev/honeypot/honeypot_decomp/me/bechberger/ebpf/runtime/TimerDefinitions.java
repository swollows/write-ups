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
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TimerDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn timer_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_irq_works() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __timer_delete_sync(Ptr<timer_list> timer, boolean shutdown2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean timer_base_is_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long timer_base_try_to_set_idle(@Unsigned long basej, @Unsigned long basem, Ptr<@OriginalName(value="bool") Boolean> idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_clear_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_delete(Ptr<timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_delete_sync(Ptr<timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_expire_remote(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> timer_list_next(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_list_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_list_show_tickdevices_header(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> timer_list_start(Ptr<SeqDefinitions.seq_file> file2, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_list_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_lock_remote_bases(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="timer_migration_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int timer_migration_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_recalc_next_expiry(Ptr<timer_base> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_reduce(Ptr<timer_list> timer, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_shutdown(Ptr<timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_shutdown_sync(Ptr<timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timer_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_unlock_remote_bases(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timer_update_keys(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long timer_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="timer_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long timer_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct timer_list_iter")
    @NotUsableInJava
    public static class timer_list_iter
    extends Struct {
        public int cpu;
        public boolean second_pass;
        public @Unsigned long now;
    }

    @Type(noCCodeGeneration=true, cType="struct timer_base")
    @NotUsableInJava
    public static class timer_base
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public Ptr<timer_list> running_timer;
        public @Unsigned long clk;
        public @Unsigned long next_expiry;
        public @Unsigned int cpu;
        public boolean next_expiry_recalc;
        public boolean is_idle;
        public boolean timers_pending;
        public @Unsigned long @Size(value=9) [] pending_map;
        public misc.hlist_head @Size(value=576) [] vectors;
    }

    @Type(noCCodeGeneration=true, cType="struct timer_events")
    @NotUsableInJava
    public static class timer_events
    extends Struct {
        public @Unsigned long local;
        public @Unsigned long global;
    }

    @Type(noCCodeGeneration=true, cType="struct timer_rand_state")
    @NotUsableInJava
    public static class timer_rand_state
    extends Struct {
        public @Unsigned long last_time;
        public long last_delta;
        public long last_delta2;
    }

    @Type(noCCodeGeneration=true, cType="struct { int _tid; int _overrun; compat_sigval _sigval; }")
    @NotUsableInJava
    public static class _timer_of__sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t
    extends Struct {
        public @OriginalName(value="compat_timer_t") int _tid;
        public int _overrun;
        public @OriginalName(value="compat_sigval_t") CompatDefinitions.compat_sigval _sigval;
    }

    @Type(noCCodeGeneration=true, cType="struct { int _tid; int _overrun; sigval _sigval; int _sys_private; }")
    @NotUsableInJava
    public static class _timer_of___sifields
    extends Struct {
        public @OriginalName(value="__kernel_timer_t") int _tid;
        public int _overrun;
        public  @OriginalName(value="sigval_t") runtime.sigval _sigval;
        public int _sys_private;
    }

    @Type(noCCodeGeneration=true, cType="struct timer_list")
    @NotUsableInJava
    public static class timer_list
    extends Struct {
        public misc.hlist_node entry;
        public @Unsigned long expires;
        public Ptr<?> function;
        public @Unsigned int flags;
    }
}

