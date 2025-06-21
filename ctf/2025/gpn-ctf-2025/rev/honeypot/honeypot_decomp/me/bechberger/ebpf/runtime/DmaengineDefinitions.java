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
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MempoolDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DmaengineDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmaengine_desc_attach_metadata(Ptr<DmaDefinitions.dma_async_tx_descriptor> desc, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dmaengine_desc_get_metadata_ptr(Ptr<DmaDefinitions.dma_async_tx_descriptor> desc, Ptr<@Unsigned Long> payload_len, Ptr<@Unsigned Long> max_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmaengine_desc_set_metadata_len(Ptr<DmaDefinitions.dma_async_tx_descriptor> desc, @Unsigned long payload_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmaengine_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dmaengine_unmap_data> dmaengine_get_unmap_data(Ptr<runtime.device> dev, int nr, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmaengine_put() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmaengine_summary_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmaengine_summary_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmaengine_unmap(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmaengine_unmap_put(Ptr<dmaengine_unmap_data> unmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dmaengine_desc_callback")
    @NotUsableInJava
    public static class dmaengine_desc_callback
    extends Struct {
        public @OriginalName(value="dma_async_tx_callback") Ptr<?> callback;
        public @OriginalName(value="dma_async_tx_callback_result") Ptr<?> callback_result;
        public Ptr<?> callback_param;
    }

    @Type(noCCodeGeneration=true, cType="struct dmaengine_unmap_pool")
    @NotUsableInJava
    public static class dmaengine_unmap_pool
    extends Struct {
        public Ptr<KmemDefinitions.kmem_cache> cache;
        public String name;
        public Ptr<@OriginalName(value="mempool_t") MempoolDefinitions.mempool_s> pool;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="enum dmaengine_alignment")
    public static enum dmaengine_alignment implements Enum<dmaengine_alignment>,
    TypedEnum<dmaengine_alignment, Integer>
    {
        DMAENGINE_ALIGN_1_BYTE,
        DMAENGINE_ALIGN_2_BYTES,
        DMAENGINE_ALIGN_4_BYTES,
        DMAENGINE_ALIGN_8_BYTES,
        DMAENGINE_ALIGN_16_BYTES,
        DMAENGINE_ALIGN_32_BYTES,
        DMAENGINE_ALIGN_64_BYTES,
        DMAENGINE_ALIGN_128_BYTES,
        DMAENGINE_ALIGN_256_BYTES;

    }

    @Type(noCCodeGeneration=true, cType="struct dmaengine_unmap_data")
    @NotUsableInJava
    public static class dmaengine_unmap_data
    extends Struct {
        public @Unsigned short map_cnt;
        public char to_cnt;
        public char from_cnt;
        public char bidi_cnt;
        public Ptr<runtime.device> dev;
        public runtime.kref kref;
        public @Unsigned long len;
        public @Unsigned @OriginalName(value="dma_addr_t") long @Size(value=0) [] addr;
    }

    @Type(noCCodeGeneration=true, cType="struct dmaengine_result")
    @NotUsableInJava
    public static class dmaengine_result
    extends Struct {
        public dmaengine_tx_result result;
        public @Unsigned int residue;
    }

    @Type(noCCodeGeneration=true, cType="enum dmaengine_tx_result")
    public static enum dmaengine_tx_result implements Enum<dmaengine_tx_result>,
    TypedEnum<dmaengine_tx_result, Integer>
    {
        DMA_TRANS_NOERROR,
        DMA_TRANS_READ_FAILED,
        DMA_TRANS_WRITE_FAILED,
        DMA_TRANS_ABORTED;

    }
}

