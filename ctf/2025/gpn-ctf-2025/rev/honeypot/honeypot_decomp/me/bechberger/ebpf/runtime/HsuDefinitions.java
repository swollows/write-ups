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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.VirtDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HsuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<hsu_dma_desc> hsu_dma_alloc_desc(@Unsigned int nents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hsu_dma_chan_start(Ptr<hsu_dma_chan> hsuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hsu_dma_desc_free(Ptr<VirtDefinitions.virt_dma_desc> vdesc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_do_irq(Ptr<hsu_dma_chip> chip, @Unsigned short nr, @Unsigned int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hsu_dma_free_chan_resources(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_get_status(Ptr<hsu_dma_chip> chip, @Unsigned short nr, Ptr<@Unsigned Integer> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hsu_dma_issue_pending(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_pause(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_async_tx_descriptor> hsu_dma_prep_slave_sg(Ptr<DmaDefinitions.dma_chan> chan, Ptr<runtime.scatterlist> sgl, @Unsigned int sg_len, DmaDefinitions.dma_transfer_direction direction, @Unsigned long flags, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_probe(Ptr<hsu_dma_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_remove(Ptr<hsu_dma_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_resume(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_slave_config(Ptr<DmaDefinitions.dma_chan> chan, Ptr<DmaDefinitions.dma_slave_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hsu_dma_synchronize(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hsu_dma_terminate_all(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DmaDefinitions.dma_status hsu_dma_tx_status(Ptr<DmaDefinitions.dma_chan> chan, @OriginalName(value="dma_cookie_t") int cookie, Ptr<DmaDefinitions.dma_tx_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hsu_dma_slave")
    @NotUsableInJava
    public static class hsu_dma_slave
    extends Struct {
        public Ptr<runtime.device> dma_dev;
        public int chan_id;
    }

    @Type(noCCodeGeneration=true, cType="struct hsu_dma_chan")
    @NotUsableInJava
    public static class hsu_dma_chan
    extends Struct {
        public VirtDefinitions.virt_dma_chan vchan;
        public Ptr<?> reg;
        public DmaDefinitions.dma_transfer_direction direction;
        public DmaDefinitions.dma_slave_config config;
        public Ptr<hsu_dma_desc> desc;
    }

    @Type(noCCodeGeneration=true, cType="struct hsu_dma_desc")
    @NotUsableInJava
    public static class hsu_dma_desc
    extends Struct {
        public VirtDefinitions.virt_dma_desc vdesc;
        public DmaDefinitions.dma_transfer_direction direction;
        public Ptr<hsu_dma_sg> sg;
        public @Unsigned int nents;
        public @Unsigned long length;
        public @Unsigned int active;
        public DmaDefinitions.dma_status status;
    }

    @Type(noCCodeGeneration=true, cType="struct hsu_dma_sg")
    @NotUsableInJava
    public static class hsu_dma_sg
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long addr;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct hsu_dma")
    @NotUsableInJava
    public static class hsu_dma
    extends Struct {
        public DmaDefinitions.dma_device dma;
        public Ptr<hsu_dma_chan> chan;
        public @Unsigned short nr_channels;
    }

    @Type(noCCodeGeneration=true, cType="struct hsu_dma_chip")
    @NotUsableInJava
    public static class hsu_dma_chip
    extends Struct {
        public Ptr<runtime.device> dev;
        public int irq;
        public Ptr<?> regs;
        public @Unsigned int length;
        public @Unsigned int offset;
        public Ptr<hsu_dma> hsu;
    }
}

