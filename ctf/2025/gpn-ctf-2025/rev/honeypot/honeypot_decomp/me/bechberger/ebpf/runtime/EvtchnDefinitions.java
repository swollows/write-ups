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
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EvtchnDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __evtchn_fifo_handle_events(@Unsigned int cpu2, Ptr<evtchn_loop_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evtchn_fifo_alloc_control_block(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_bind_to_cpu(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn, @Unsigned int cpu2, @Unsigned int old_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_clear_pending(@Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_handle_events(@Unsigned int cpu2, Ptr<evtchn_loop_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean evtchn_fifo_is_pending(@Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_mask(@Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int evtchn_fifo_max_channels() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int evtchn_fifo_nr_channels() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evtchn_fifo_percpu_deinit(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evtchn_fifo_percpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_set_pending(@Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evtchn_fifo_setup(@Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_fifo_unmask(@Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evtchn_get(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evtchn_make_refcounted(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn, boolean is_static) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evtchn_put(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_info> evtchn_to_info(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_loop_ctrl")
    @NotUsableInJava
    public static class evtchn_loop_ctrl
    extends Struct {
        public @OriginalName(value="ktime_t") long timeout;
        public @Unsigned int count;
        public boolean defer_eoi;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_set_priority")
    @NotUsableInJava
    public static class evtchn_set_priority
    extends Struct {
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
        public @Unsigned @OriginalName(value="uint32_t") int priority;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_bind_vcpu")
    @NotUsableInJava
    public static class evtchn_bind_vcpu
    extends Struct {
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_status")
    @NotUsableInJava
    public static class evtchn_status
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short dom;
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
        public @Unsigned @OriginalName(value="uint32_t") int status;
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
        public UDefinitions.u_of_evtchn_status u;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_bind_ipi")
    @NotUsableInJava
    public static class evtchn_bind_ipi
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_bind_pirq")
    @NotUsableInJava
    public static class evtchn_bind_pirq
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int pirq;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_bind_virq")
    @NotUsableInJava
    public static class evtchn_bind_virq
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int virq;
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_bind_interdomain")
    @NotUsableInJava
    public static class evtchn_bind_interdomain
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short remote_dom;
        public @Unsigned @OriginalName(value="evtchn_port_t") int remote_port;
        public @Unsigned @OriginalName(value="evtchn_port_t") int local_port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_send")
    @NotUsableInJava
    public static class evtchn_send
    extends Struct {
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_fifo_queue")
    @NotUsableInJava
    public static class evtchn_fifo_queue
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=16) [] head;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_ops")
    @NotUsableInJava
    public static class evtchn_ops
    extends Struct {
        public Ptr<?> max_channels;
        public Ptr<?> nr_channels;
        public Ptr<?> setup;
        public Ptr<?> remove;
        public Ptr<?> bind_to_cpu;
        public Ptr<?> clear_pending;
        public Ptr<?> set_pending;
        public Ptr<?> is_pending;
        public Ptr<?> mask;
        public Ptr<?> unmask;
        public Ptr<?> handle_events;
        public Ptr<?> resume;
        public Ptr<?> percpu_init;
        public Ptr<?> percpu_deinit;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_fifo_control_block")
    @NotUsableInJava
    public static class evtchn_fifo_control_block
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int ready;
        public @Unsigned @OriginalName(value="uint32_t") int _rsvd;
        public @Unsigned @OriginalName(value="event_word_t") int @Size(value=16) [] head;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_expand_array")
    @NotUsableInJava
    public static class evtchn_expand_array
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long array_gfn;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_init_control")
    @NotUsableInJava
    public static class evtchn_init_control
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long control_gfn;
        public @Unsigned @OriginalName(value="uint32_t") int offset;
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
        public @OriginalName(value="uint8_t") char link_bits;
        public @OriginalName(value="uint8_t") char @Size(value=7) [] _pad;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_unmask")
    @NotUsableInJava
    public static class evtchn_unmask
    extends Struct {
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_close")
    @NotUsableInJava
    public static class evtchn_close
    extends Struct {
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }

    @Type(noCCodeGeneration=true, cType="struct evtchn_alloc_unbound")
    @NotUsableInJava
    public static class evtchn_alloc_unbound
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short dom;
        public @Unsigned @OriginalName(value="domid_t") short remote_dom;
        public @Unsigned @OriginalName(value="evtchn_port_t") int port;
    }
}

