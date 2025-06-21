/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long k_d_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="k_d_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long k_d_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long k_i_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="k_i_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long k_i_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long k_po_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="k_po_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long k_po_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long k_pu_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="k_pu_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long k_pu_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_ascii(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_brl(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_brlcommit(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int pattern, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_cons(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_cur(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_dead(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_dead2(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_fn(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_ignore(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_itimer_rcu_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_lock(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_lowercase(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_meta(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_pad(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_self(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_shift(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_slock(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_spec(Ptr<VcDefinitions.vc_data> vc2, char value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void k_unicode(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int value, char up_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sigaction")
    @NotUsableInJava
    public static class sigaction
    extends Struct {
        public @OriginalName(value="__sighandler_t") Ptr<?> sa_handler;
        public @Unsigned long sa_flags;
        public @OriginalName(value="__sigrestore_t") Ptr<?> sa_restorer;
        public misc.sigset_t sa_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct k_clock")
    @NotUsableInJava
    public static class k_clock
    extends Struct {
        public Ptr<?> clock_getres;
        public Ptr<?> clock_set;
        public Ptr<?> clock_get_timespec;
        public Ptr<?> clock_get_ktime;
        public Ptr<?> clock_adj;
        public Ptr<?> timer_create;
        public Ptr<?> nsleep;
        public Ptr<?> timer_set;
        public Ptr<?> timer_del;
        public Ptr<?> timer_get;
        public Ptr<?> timer_rearm;
        public Ptr<?> timer_forward;
        public Ptr<?> timer_remaining;
        public Ptr<?> timer_try_to_cancel;
        public Ptr<?> timer_arm;
        public Ptr<?> timer_wait_running;
    }

    @Type(noCCodeGeneration=true, cType="struct k_itimer")
    @NotUsableInJava
    public static class k_itimer
    extends Struct {
        public misc.hlist_node list;
        public misc.hlist_node t_hash;
        public  @OriginalName(value="spinlock_t") runtime.spinlock it_lock;
        public Ptr<k_clock> kclock;
        public @OriginalName(value="clockid_t") int it_clock;
        public @OriginalName(value="timer_t") int it_id;
        public int it_active;
        public long it_overrun;
        public long it_overrun_last;
        public int it_requeue_pending;
        public int it_sigev_notify;
        public @OriginalName(value="ktime_t") long it_interval;
        public Ptr<misc.signal_struct> it_signal;
        @InlineUnion(value=7783)
        public @InlineUnion(value=7783) Ptr<runtime.pid> it_pid;
        @InlineUnion(value=7783)
        public @InlineUnion(value=7783) Ptr<TaskDefinitions.task_struct> it_process;
        public Ptr<runtime.sigqueue> sigq;
        public misc.it_of_k_itimer it;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct k_sigaction")
    @NotUsableInJava
    public static class k_sigaction
    extends Struct {
        public sigaction sa;
    }
}

