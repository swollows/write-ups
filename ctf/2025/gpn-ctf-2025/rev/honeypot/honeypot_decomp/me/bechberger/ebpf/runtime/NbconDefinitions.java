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
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PrintkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NbconDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nbcon_atomic_flush_pending(@Unsigned long stop_seq, boolean allow_unsafe_takeover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nbcon_atomic_flush_pending_con(Ptr<runtime.console> con, @Unsigned long stop_seq, boolean allow_unsafe_takeover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __nbcon_context_update_unsafe(Ptr<nbcon_context> ctxt, boolean unsafe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_alloc(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_atomic_flush_pending() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_atomic_flush_pending_con(Ptr<runtime.console> con, @Unsigned long stop_seq, boolean allow_unsafe_takeover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_atomic_flush_unsafe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_can_proceed(Ptr<nbcon_write_context> wctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_context_release(Ptr<nbcon_context> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_context_try_acquire(Ptr<nbcon_context> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nbcon_context_try_acquire_requested(Ptr<nbcon_context> ctxt, Ptr<nbcon_state> cur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_cpu_emergency_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_cpu_emergency_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_device_release(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_device_try_acquire(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_emit_next_record(Ptr<nbcon_write_context> wctxt, boolean use_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_emit_one(Ptr<nbcon_write_context> wctxt, boolean use_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_enter_unsafe(Ptr<nbcon_write_context> wctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_exit_unsafe(Ptr<nbcon_write_context> wctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_free(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> nbcon_get_cpu_emergency_nesting() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static nbcon_prio nbcon_get_default_prio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_irq_work(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_kthread_create(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nbcon_kthread_func(Ptr<?> __console) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_kthread_stop(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_kthreads_wake() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nbcon_legacy_emit_next_record(Ptr<runtime.console> con, Ptr<@OriginalName(value="bool") Boolean> handover, int cookie, boolean use_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_reacquire_nobuf(Ptr<nbcon_write_context> wctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nbcon_seq_force(Ptr<runtime.console> con, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nbcon_seq_read(Ptr<runtime.console> con) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nbcon_state")
    @NotUsableInJava
    public static class nbcon_state
    extends Struct {
        @InlineUnion(value=28740)
        public @InlineUnion(value=28740) @Unsigned int atom;
        @InlineUnion(value=28740)
        public  @InlineUnion(value=28740) AnonDefinitions.anon_member_of_anon_member_of_nbcon_state anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct nbcon_write_context")
    @NotUsableInJava
    public static class nbcon_write_context
    extends Struct {
        public nbcon_context ctxt;
        public String outbuf;
        public @Unsigned int len;
        public boolean unsafe_takeover;
    }

    @Type(noCCodeGeneration=true, cType="struct nbcon_context")
    @NotUsableInJava
    public static class nbcon_context
    extends Struct {
        public Ptr<runtime.console> console;
        public @Unsigned int spinwait_max_us;
        public nbcon_prio prio;
        public @Unsigned int allow_unsafe_takeover;
        public @Unsigned int backlog;
        public Ptr<PrintkDefinitions.printk_buffers> pbufs;
        public @Unsigned long seq;
    }

    @Type(noCCodeGeneration=true, cType="enum nbcon_prio")
    public static enum nbcon_prio implements Enum<nbcon_prio>,
    TypedEnum<nbcon_prio, Integer>
    {
        NBCON_PRIO_NONE,
        NBCON_PRIO_NORMAL,
        NBCON_PRIO_EMERGENCY,
        NBCON_PRIO_PANIC,
        NBCON_PRIO_MAX;

    }
}

