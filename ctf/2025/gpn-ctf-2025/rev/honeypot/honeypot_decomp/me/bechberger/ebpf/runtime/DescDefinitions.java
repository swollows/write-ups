/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PrbDefinitions;
import me.bechberger.ebpf.runtime.PrintkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DescDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void desc_free_label(Ptr<misc.callback_head> rh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="desc_set_label($arg1, (const u8*)$arg2)")
    public static int desc_set_label(Ptr<GpioDefinitions.gpio_desc> desc, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="desc_smp_init($arg1, $arg2, (const struct cpumask*)$arg3)")
    public static void desc_smp_init(Ptr<IrqDefinitions.irq_desc> desc, int node2, Ptr<runtime.cpumask> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="desc_to_gpio((const struct gpio_desc*)$arg1)")
    public static int desc_to_gpio(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void desc_make_final(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static desc_state desc_read(Ptr<PrbDefinitions.prb_desc_ring> desc_ring, @Unsigned long id, Ptr<PrbDefinitions.prb_desc> desc_out, Ptr<@Unsigned Long> seq_out, Ptr<@Unsigned Integer> caller_id_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int desc_read_finalized_seq(Ptr<PrbDefinitions.prb_desc_ring> desc_ring, @Unsigned long id, @Unsigned long seq, Ptr<PrbDefinitions.prb_desc> desc_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean desc_reserve(Ptr<PrintkDefinitions.printk_ringbuffer> rb, Ptr<@Unsigned Long> id_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void desc_update_last_finalized(Ptr<PrintkDefinitions.printk_ringbuffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum desc_state")
    public static enum desc_state implements Enum<desc_state>,
    TypedEnum<desc_state, Integer>
    {
        desc_miss,
        desc_reserved,
        desc_committed,
        desc_finalized,
        desc_reusable;

    }

    @Type(noCCodeGeneration=true, cType="struct desc_ptr")
    @NotUsableInJava
    public static class desc_ptr
    extends Struct {
        public @Unsigned short size;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct desc_struct")
    @NotUsableInJava
    public static class desc_struct
    extends Struct {
        public @Unsigned short limit0;
        public @Unsigned short base0;
        public @Unsigned short base1;
        public @Unsigned short type;
        public @Unsigned short s;
        public @Unsigned short dpl;
        public @Unsigned short p;
        public @Unsigned short limit1;
        public @Unsigned short avl;
        public @Unsigned short l;
        public @Unsigned short d;
        public @Unsigned short g;
        public @Unsigned short base2;
    }
}

