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
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Twl6040Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_clear_bits(Ptr<twl6040> twl60402, @Unsigned int reg, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl6040_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_get_pll(Ptr<twl6040> twl60402) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int twl6040_get_sysclk(Ptr<twl6040> twl60402) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_get_vibralr_status(Ptr<twl6040> twl60402) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_power(Ptr<twl6040> twl60402, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_power_up_manual(Ptr<twl6040> twl60402) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean twl6040_readable_reg(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn twl6040_readyint_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_reg_read(Ptr<twl6040> twl60402, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_reg_write(Ptr<twl6040> twl60402, @Unsigned int reg, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl6040_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_set_bits(Ptr<twl6040> twl60402, @Unsigned int reg, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl6040_set_pll(Ptr<twl6040> twl60402, int pll_id, @Unsigned int freq_in, @Unsigned int freq_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn twl6040_thint_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean twl6040_volatile_reg(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean twl6040_writeable_reg(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct twl6040")
    @NotUsableInJava
    public static class twl6040
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<runtime.regmap> regmap;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data;
        public RegulatorDefinitions.regulator_bulk_data @Size(value=2) [] supplies;
        public Ptr<runtime.clk> clk32k;
        public Ptr<runtime.clk> mclk;
        public runtime.mutex mutex;
        public runtime.mutex irq_mutex;
        public misc.mfd_cell @Size(value=4) [] cells;
        public runtime.completion ready;
        public Ptr<GpioDefinitions.gpio_desc> audpwron;
        public int power_count;
        public int rev;
        public int pll;
        public @Unsigned int sysclk_rate;
        public @Unsigned int mclk_rate;
        public @Unsigned int irq;
        public @Unsigned int irq_ready;
        public @Unsigned int irq_th;
    }
}

