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
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MctrlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctrl_gpio_disable_irq_wake(Ptr<mctrl_gpios> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctrl_gpio_disable_ms(Ptr<mctrl_gpios> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctrl_gpio_enable_irq_wake(Ptr<mctrl_gpios> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctrl_gpio_enable_ms(Ptr<mctrl_gpios> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctrl_gpio_free(Ptr<runtime.device> dev, Ptr<mctrl_gpios> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mctrl_gpio_get(Ptr<mctrl_gpios> gpios, Ptr<@Unsigned Integer> mctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mctrl_gpio_get_outputs(Ptr<mctrl_gpios> gpios, Ptr<@Unsigned Integer> mctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mctrl_gpios> mctrl_gpio_init(Ptr<UartDefinitions.uart_port> port2, @Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mctrl_gpios> mctrl_gpio_init_noauto(Ptr<runtime.device> dev, @Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn mctrl_gpio_irq_handle(int irq, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctrl_gpio_set(Ptr<mctrl_gpios> gpios, @Unsigned int mctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<GpioDefinitions.gpio_desc> mctrl_gpio_to_gpiod(Ptr<mctrl_gpios> gpios, mctrl_gpio_idx gidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mctrl_gpios")
    @NotUsableInJava
    public static class mctrl_gpios
    extends Struct {
        public Ptr<UartDefinitions.uart_port> port;
        public Ptr<GpioDefinitions.gpio_desc> @Size(value=6) [] gpio;
        public int @Size(value=6) [] irq;
        public @Unsigned int mctrl_prev;
        public boolean mctrl_on;
    }

    @Type(noCCodeGeneration=true, cType="enum mctrl_gpio_idx")
    public static enum mctrl_gpio_idx implements Enum<mctrl_gpio_idx>,
    TypedEnum<mctrl_gpio_idx, Integer>
    {
        UART_GPIO_CTS,
        UART_GPIO_DSR,
        UART_GPIO_DCD,
        UART_GPIO_RNG,
        UART_GPIO_RI,
        UART_GPIO_RTS,
        UART_GPIO_DTR,
        UART_GPIO_MAX;

    }
}

