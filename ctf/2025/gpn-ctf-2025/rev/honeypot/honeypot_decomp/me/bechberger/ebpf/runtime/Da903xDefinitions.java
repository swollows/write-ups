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
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Da903xDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __da903x_write(Ptr<I2cDefinitions.i2c_client> client, int reg, @OriginalName(value="uint8_t") char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_clr_bits(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da903x_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn da903x_irq_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da903x_irq_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_query_status(Ptr<runtime.device> dev, @Unsigned int sbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_read(Ptr<runtime.device> dev, int reg, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_reads(Ptr<runtime.device> dev, int reg, int len, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_register_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb, @Unsigned int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da903x_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_set_bits(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_unregister_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb, @Unsigned int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_update(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char val, @OriginalName(value="uint8_t") char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_write(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da903x_writes(Ptr<runtime.device> dev, int reg, int len, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct da903x_chip")
    @NotUsableInJava
    public static class da903x_chip
    extends Struct {
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<runtime.device> dev;
        public Ptr<da903x_chip_ops> ops;
        public int type;
        public @Unsigned @OriginalName(value="uint32_t") int events_mask;
        public runtime.mutex lock;
        public misc.work_struct irq_work;
        public misc.blocking_notifier_head notifier_list;
    }

    @Type(noCCodeGeneration=true, cType="struct da903x_chip_ops")
    @NotUsableInJava
    public static class da903x_chip_ops
    extends Struct {
        public Ptr<?> init_chip;
        public Ptr<?> unmask_events;
        public Ptr<?> mask_events;
        public Ptr<?> read_events;
        public Ptr<?> read_status;
    }

    @Type(noCCodeGeneration=true, cType="struct da903x_platform_data")
    @NotUsableInJava
    public static class da903x_platform_data
    extends Struct {
        public int num_subdevs;
        public Ptr<da903x_subdev_info> subdevs;
    }

    @Type(noCCodeGeneration=true, cType="struct da903x_subdev_info")
    @NotUsableInJava
    public static class da903x_subdev_info
    extends Struct {
        public int id;
        public String name;
        public Ptr<?> platform_data;
    }
}

