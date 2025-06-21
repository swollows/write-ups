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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.VirtDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LdmaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_alloc_chan_resources(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_chan_cfg(Ptr<ldma_chan> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ldma_chan_desc_hw_cfg(Ptr<ldma_chan> c, @Unsigned @OriginalName(value="dma_addr_t") long desc_base, int desc_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_chan_off(Ptr<ldma_chan> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_chan_on(Ptr<ldma_chan> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_chan_reset(Ptr<ldma_chan> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ldma_clk_disable(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_dev_cfg(Ptr<ldma_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ldma_free_chan_resources(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ldma_issue_pending(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_parse_dt(Ptr<ldma_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_pause_chan(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_port_cfg(Ptr<ldma_port> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_async_tx_descriptor> ldma_prep_slave_sg(Ptr<DmaDefinitions.dma_chan> chan, Ptr<runtime.scatterlist> sgl, @Unsigned int sglen, DmaDefinitions.dma_transfer_direction dir, @Unsigned long flags, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_resume_chan(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_slave_config(Ptr<DmaDefinitions.dma_chan> chan, Ptr<DmaDefinitions.dma_slave_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ldma_synchronize(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldma_terminate_all(Ptr<DmaDefinitions.dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DmaDefinitions.dma_status ldma_tx_status(Ptr<DmaDefinitions.dma_chan> chan, @OriginalName(value="dma_cookie_t") int cookie, Ptr<DmaDefinitions.dma_tx_state> txstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ldma_inst_data")
    @NotUsableInJava
    public static class ldma_inst_data
    extends Struct {
        public boolean desc_in_sram;
        public boolean chan_fc;
        public boolean desc_fod;
        public boolean valid_desc_fetch_ack;
        public @Unsigned int orrc;
        public String name;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="struct ldma_dev")
    @NotUsableInJava
    public static class ldma_dev
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<?> base;
        public Ptr<ResetDefinitions.reset_control> rst;
        public Ptr<runtime.clk> core_clk;
        public DmaDefinitions.dma_device dma_dev;
        public @Unsigned int ver;
        public int irq;
        public Ptr<ldma_port> ports;
        public Ptr<ldma_chan> chans;
        public @OriginalName(value="spinlock_t") runtime.spinlock dev_lock;
        public @Unsigned int chan_nrs;
        public @Unsigned int port_nrs;
        public @Unsigned int channels_mask;
        public @Unsigned int flags;
        public @Unsigned int pollcnt;
        public Ptr<ldma_inst_data> inst;
        public Ptr<WorkqueueDefinitions.workqueue_struct> wq;
    }

    @Type(noCCodeGeneration=true, cType="struct ldma_port")
    @NotUsableInJava
    public static class ldma_port
    extends Struct {
        public Ptr<ldma_dev> ldev;
        public @Unsigned int portid;
        public @Unsigned int rxbl;
        public @Unsigned int txbl;
        public @Unsigned int rxendi;
        public @Unsigned int txendi;
        public @Unsigned int pkt_drop;
    }

    @Type(noCCodeGeneration=true, cType="struct ldma_chan")
    @NotUsableInJava
    public static class ldma_chan
    extends Struct {
        public VirtDefinitions.virt_dma_chan vchan;
        public Ptr<ldma_port> port;
        public char @Size(value=8) [] name;
        public int nr;
        public @Unsigned int flags;
        public ldma_chan_on_off onoff;
        public @Unsigned @OriginalName(value="dma_addr_t") long desc_phys;
        public Ptr<?> desc_base;
        public @Unsigned int desc_cnt;
        public int rst;
        public @Unsigned int hdrm_len;
        public boolean hdrm_csum;
        public @Unsigned int boff_len;
        public @Unsigned int data_endian;
        public @Unsigned int desc_endian;
        public boolean pden;
        public boolean desc_rx_np;
        public boolean data_endian_en;
        public boolean desc_endian_en;
        public boolean abc_en;
        public boolean desc_init;
        public Ptr<DmaDefinitions.dma_pool> desc_pool;
        public @Unsigned int desc_num;
        public Ptr<misc.dw2_desc_sw> ds;
        public misc.work_struct work;
        public DmaDefinitions.dma_slave_config config;
    }

    @Type(noCCodeGeneration=true, cType="enum ldma_chan_on_off")
    public static enum ldma_chan_on_off implements Enum<ldma_chan_on_off>,
    TypedEnum<ldma_chan_on_off, Integer>
    {
        DMA_CH_OFF,
        DMA_CH_ON;

    }
}

