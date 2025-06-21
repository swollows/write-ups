/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IocgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iocg_activate(Ptr<IocDefinitions.ioc_gq> iocg, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iocg_build_inner_walk(Ptr<IocDefinitions.ioc_gq> iocg, Ptr<ListDefinitions.list_head> inner_walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iocg_commit_bio(Ptr<IocDefinitions.ioc_gq> iocg, Ptr<runtime.bio> bio2, @Unsigned long abs_cost, @Unsigned long cost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iocg_flush_stat_upward(Ptr<IocDefinitions.ioc_gq> iocg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iocg_incur_debt(Ptr<IocDefinitions.ioc_gq> iocg, @Unsigned long abs_cost, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iocg_kick_delay(Ptr<IocDefinitions.ioc_gq> iocg, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iocg_kick_waitq(Ptr<IocDefinitions.ioc_gq> iocg, boolean pay_debt, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart iocg_waitq_timer_fn(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iocg_wake_fn(Ptr<WaitDefinitions.wait_queue_entry> wq_entry, @Unsigned int mode, int flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iocg_wake_ctx")
    @NotUsableInJava
    public static class iocg_wake_ctx
    extends Struct {
        public Ptr<IocDefinitions.ioc_gq> iocg;
        public @Unsigned int hw_inuse;
        public long vbudget;
    }

    @Type(noCCodeGeneration=true, cType="struct iocg_wait")
    @NotUsableInJava
    public static class iocg_wait
    extends Struct {
        public WaitDefinitions.wait_queue_entry wait;
        public Ptr<runtime.bio> bio;
        public @Unsigned long abs_cost;
        public boolean committed;
    }

    @Type(noCCodeGeneration=true, cType="struct iocg_stat")
    @NotUsableInJava
    public static class iocg_stat
    extends Struct {
        public @Unsigned long usage_us;
        public @Unsigned long wait_us;
        public @Unsigned long indebt_us;
        public @Unsigned long indelay_us;
    }

    @Type(noCCodeGeneration=true, cType="struct iocg_pcpu_stat")
    @NotUsableInJava
    public static class iocg_pcpu_stat
    extends Struct {
        public misc.local64_t abs_vusage;
    }
}

