/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class XpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<XdpDefinitions.xdp_buff_xsk> __xp_alloc(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xp_dma_unmap(Ptr<XskDefinitions.xsk_dma_map> dma_map, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_add_xsk(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XdpDefinitions.xdp_sock> xs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<XdpDefinitions.xdp_buff> xp_alloc(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xp_alloc_batch(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<Ptr<XdpDefinitions.xdp_buff>> xdp2, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xp_alloc_new_from_fq(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<Ptr<XdpDefinitions.xdp_buff>> xdp2, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xp_alloc_tx_descs(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XdpDefinitions.xdp_sock> xs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xp_assign_dev(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<NetDefinitions.net_device> netdev, @Unsigned short queue_id, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xp_assign_dev_shared(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XdpDefinitions.xdp_sock> umem_xs, Ptr<NetDefinitions.net_device> dev, @Unsigned short queue_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xp_can_alloc(Ptr<XskDefinitions.xsk_buff_pool> pool, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xp_check_unaligned(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<@Unsigned Long> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_clear_dev(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<XskDefinitions.xsk_buff_pool> xp_create_and_assign_umem(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_umem> umem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_del_xsk(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XdpDefinitions.xdp_sock> xs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_destroy(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_disable_drv_zc(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xp_dma_map(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<runtime.device> dev, @Unsigned long attrs, Ptr<Ptr<runtime.page>> pages, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_dma_unmap(Ptr<XskDefinitions.xsk_buff_pool> pool, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_fill_cb(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XskDefinitions.xsk_cb_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_free(Ptr<XdpDefinitions.xdp_buff_xsk> xskb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_get_pool(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xp_init_dma_info(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XskDefinitions.xsk_dma_map> dma_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xp_put_pool(Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xp_raw_get_data(Ptr<XskDefinitions.xsk_buff_pool> pool, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long xp_raw_get_dma(Ptr<XskDefinitions.xsk_buff_pool> pool, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_release_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xp_set_rxq_info(Ptr<XskDefinitions.xsk_buff_pool> pool, Ptr<XdpDefinitions.xdp_rxq_info> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }
}

