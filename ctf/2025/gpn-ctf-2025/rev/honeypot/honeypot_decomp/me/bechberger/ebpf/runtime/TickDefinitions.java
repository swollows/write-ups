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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TickDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tick_nohz_full_update_tick(Ptr<tick_sched> ts, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tick_nohz_task_switch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_check_oneshot_change(int allow_nohz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_clock_notify() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_do_update_jiffies64(@OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tick_sched> tick_get_tick_sched(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_irq_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_account_idle_time(Ptr<tick_sched> ts, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_nohz_cpu_down(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_nohz_cpu_hotpluggable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_clear(tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_clear_cpu(int cpu2, tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_clear_signal(Ptr<misc.signal_struct> sig, tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_clear_task(Ptr<TaskDefinitions.task_struct> tsk, tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_set(tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_set_cpu(int cpu2, tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_set_signal(Ptr<TaskDefinitions.task_struct> tsk, tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_dep_set_task(Ptr<TaskDefinitions.task_struct> tsk, tick_dep_bits bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_nohz_full_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_full_kick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_full_kick_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_full_setup(@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tick_nohz_get_idle_calls_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long tick_nohz_get_next_hrtimer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long tick_nohz_get_sleep_length(Ptr<@OriginalName(value="ktime_t") Long> delta_next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart tick_nohz_handler(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_idle_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_idle_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_nohz_idle_got_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_idle_restart_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_idle_retain_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_idle_stop_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_irq_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_kick_task(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_lowres_handler(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long tick_nohz_next_event(Ptr<tick_sched> ts, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_restart_sched_tick(Ptr<tick_sched> ts, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_stop_idle(Ptr<tick_sched> ts, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_stop_tick(Ptr<tick_sched> ts, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_nohz_tick_stopped() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_nohz_tick_stopped_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_nohz_update_jiffies(@OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_oneshot_notify() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_sched_timer_dying(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_setup_sched_timer(boolean hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_assert_timekeeping_handover() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_broadcast_oneshot_control(tick_broadcast_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_check_new_device(Ptr<misc.clock_event_device> newdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_check_percpu(Ptr<misc.clock_event_device> curdev, Ptr<misc.clock_event_device> newdev, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_check_preferred(Ptr<misc.clock_event_device> curdev, Ptr<misc.clock_event_device> newdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_check_replacement(Ptr<misc.clock_event_device> curdev, Ptr<misc.clock_event_device> newdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_cpu_dying(@Unsigned int dying_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_freeze() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tick_device> tick_get_device(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_handle_periodic(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_install_replacement(Ptr<misc.clock_event_device> newdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_is_oneshot_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_periodic(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_resume_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tick_setup_device($arg1, $arg2, $arg3, (const struct cpumask*)$arg4)")
    public static void tick_setup_device(Ptr<tick_device> td2, Ptr<misc.clock_event_device> newdev, int cpu2, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_setup_periodic(Ptr<misc.clock_event_device> dev, int broadcast) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_shutdown(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_suspend_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_unfreeze() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_cleanup_dead_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_offline_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_setup_hrtimer_broadcast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tick_broadcast_oneshot_control(tick_broadcast_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_clear_oneshot(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_control(tick_broadcast_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_broadcast_oneshot_active() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_broadcast_oneshot_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_oneshot_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_set_event(Ptr<misc.clock_event_device> bc, int cpu2, @OriginalName(value="ktime_t") long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_setup_oneshot(Ptr<misc.clock_event_device> bc, boolean from_periodic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_broadcast_switch_to_oneshot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_broadcast_update_freq(Ptr<misc.clock_event_device> dev, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_check_broadcast_expired() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_check_oneshot_broadcast_this_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_device_setup_broadcast_func(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_device_uses_broadcast(Ptr<misc.clock_event_device> dev, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_do_broadcast(Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tick_device> tick_get_broadcast_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cpumask> tick_get_broadcast_mask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cpumask> tick_get_broadcast_oneshot_mask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct clock_event_device*)tick_get_wakeup_device($arg1))")
    public static Ptr<misc.clock_event_device> tick_get_wakeup_device(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_handle_oneshot_broadcast(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_handle_periodic_broadcast(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_init_highres() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_install_broadcast_device(Ptr<misc.clock_event_device> dev, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_is_broadcast_device(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_oneshot_mode_active() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_oneshot_wakeup_handler(Ptr<misc.clock_event_device> wd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_program_event(@OriginalName(value="ktime_t") long expires, int force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tick_receive_broadcast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_resume_broadcast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_resume_check_broadcast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_resume_oneshot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tick_set_oneshot_wakeup_device(Ptr<misc.clock_event_device> newdev, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_set_periodic_handler(Ptr<misc.clock_event_device> dev, int broadcast) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tick_setup_oneshot($arg1, (void (*)(struct clock_event_device*))$arg2, $arg3)")
    public static void tick_setup_oneshot(Ptr<misc.clock_event_device> newdev, Ptr<?> handler, @OriginalName(value="ktime_t") long next_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_stub(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tick_suspend_broadcast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tick_switch_to_oneshot((void (*)(struct clock_event_device*))$arg1)")
    public static int tick_switch_to_oneshot(Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tick_work")
    @NotUsableInJava
    public static class tick_work
    extends Struct {
        public int cpu;
        public AtomicDefinitions.atomic_t state;
        public DelayedDefinitions.delayed_work work;
    }

    @Type(noCCodeGeneration=true, cType="struct tick_sched")
    @NotUsableInJava
    public static class tick_sched
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned int stalled_jiffies;
        public @Unsigned long last_tick_jiffies;
        public runtime.hrtimer sched_timer;
        public @OriginalName(value="ktime_t") long last_tick;
        public @OriginalName(value="ktime_t") long next_tick;
        public @Unsigned long idle_jiffies;
        public @OriginalName(value="ktime_t") long idle_waketime;
        public @Unsigned int got_idle_tick;
        public @OriginalName(value="seqcount_t") runtime.seqcount idle_sleeptime_seq;
        public @OriginalName(value="ktime_t") long idle_entrytime;
        public @Unsigned long last_jiffies;
        public @Unsigned long timer_expires_base;
        public @Unsigned long timer_expires;
        public @Unsigned long next_timer;
        public @OriginalName(value="ktime_t") long idle_expires;
        public @Unsigned long idle_calls;
        public @Unsigned long idle_sleeps;
        public @OriginalName(value="ktime_t") long idle_exittime;
        public @OriginalName(value="ktime_t") long idle_sleeptime;
        public @OriginalName(value="ktime_t") long iowait_sleeptime;
        public AtomicDefinitions.atomic_t tick_dep_mask;
        public @Unsigned long check_clocks;
    }

    @Type(noCCodeGeneration=true, cType="enum tick_device_mode")
    public static enum tick_device_mode implements Enum<tick_device_mode>,
    TypedEnum<tick_device_mode, Integer>
    {
        TICKDEV_MODE_PERIODIC,
        TICKDEV_MODE_ONESHOT;

    }

    @Type(noCCodeGeneration=true, cType="enum tick_broadcast_mode")
    public static enum tick_broadcast_mode implements Enum<tick_broadcast_mode>,
    TypedEnum<tick_broadcast_mode, Integer>
    {
        TICK_BROADCAST_OFF,
        TICK_BROADCAST_ON,
        TICK_BROADCAST_FORCE;

    }

    @Type(noCCodeGeneration=true, cType="struct tick_device")
    @NotUsableInJava
    public static class tick_device
    extends Struct {
        public Ptr<misc.clock_event_device> evtdev;
        public tick_device_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="enum tick_dep_bits")
    public static enum tick_dep_bits implements Enum<tick_dep_bits>,
    TypedEnum<tick_dep_bits, Integer>
    {
        TICK_DEP_BIT_POSIX_TIMER,
        TICK_DEP_BIT_PERF_EVENTS,
        TICK_DEP_BIT_SCHED,
        TICK_DEP_BIT_CLOCK_UNSTABLE,
        TICK_DEP_BIT_RCU,
        TICK_DEP_BIT_RCU_EXP;

    }

    @Type(noCCodeGeneration=true, cType="enum tick_broadcast_state")
    public static enum tick_broadcast_state implements Enum<tick_broadcast_state>,
    TypedEnum<tick_broadcast_state, Integer>
    {
        TICK_BROADCAST_EXIT,
        TICK_BROADCAST_ENTER;

    }
}

