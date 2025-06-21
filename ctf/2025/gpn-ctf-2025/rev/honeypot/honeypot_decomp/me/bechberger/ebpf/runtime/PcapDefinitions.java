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
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PcapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcap_adc_async(Ptr<pcap_chip> pcap, char bank, @Unsigned int flags, Ptr<Character> ch, Ptr<?> callback2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn pcap_adc_irq(int irq, Ptr<?> _pcap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcap_adc_sync(Ptr<pcap_chip> pcap, char bank, @Unsigned int flags, Ptr<Character> ch, Ptr<@Unsigned Short> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_adc_sync_cb(Ptr<?> param2, Ptr<@Unsigned Short> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_adc_trigger(Ptr<pcap_chip> pcap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_irq_handler(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_isr_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_mask_irq(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_msr_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcap_remove_subdev(Ptr<runtime.device> dev, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_set_ts_bits(Ptr<pcap_chip> pcap, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcap_to_irq(Ptr<pcap_chip> pcap, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcap_unmask_irq(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pcap_chip")
    @NotUsableInJava
    public static class pcap_chip
    extends Struct {
        public Ptr<SpiDefinitions.spi_device> spi;
        public @Unsigned int buf;
        public  @OriginalName(value="spinlock_t") runtime.spinlock io_lock;
        public @Unsigned int irq_base;
        public @Unsigned int msr;
        public misc.work_struct isr_work;
        public misc.work_struct msr_work;
        public Ptr<WorkqueueDefinitions.workqueue_struct> workqueue;
        public Ptr<pcap_adc_request> @Size(value=8) [] adc_queue;
        public char adc_head;
        public char adc_tail;
        public  @OriginalName(value="spinlock_t") runtime.spinlock adc_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct pcap_adc_sync_request")
    @NotUsableInJava
    public static class pcap_adc_sync_request
    extends Struct {
        public @Unsigned short @Size(value=2) [] res;
        public runtime.completion completion;
    }

    @Type(noCCodeGeneration=true, cType="struct pcap_adc_request")
    @NotUsableInJava
    public static class pcap_adc_request
    extends Struct {
        public char bank;
        public char @Size(value=2) [] ch;
        public @Unsigned int flags;
        public Ptr<?> callback;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct pcap_platform_data")
    @NotUsableInJava
    public static class pcap_platform_data
    extends Struct {
        public @Unsigned int irq_base;
        public @Unsigned int config;
        public int gpio;
        public Ptr<?> init;
        public int num_subdevs;
        public Ptr<pcap_subdev> subdevs;
    }

    @Type(noCCodeGeneration=true, cType="struct pcap_subdev")
    @NotUsableInJava
    public static class pcap_subdev
    extends Struct {
        public int id;
        public String name;
        public Ptr<?> platform_data;
    }
}

