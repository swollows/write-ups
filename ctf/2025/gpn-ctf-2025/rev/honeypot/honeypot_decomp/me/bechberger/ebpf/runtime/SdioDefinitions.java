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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SdioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sdio_align_size(Ptr<sdio_func> func, @Unsigned int sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_claim_host(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_disable_func(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_enable_func(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char sdio_f0_readb(Ptr<sdio_func> func, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_f0_writeb(Ptr<sdio_func> func, char b, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mmc_pm_flag_t") int sdio_get_host_pm_caps(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_io_rw_ext_helper(Ptr<sdio_func> func, int write2, @Unsigned int addr2, int incr_addr, Ptr<Character> buf, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_memcpy_fromio(Ptr<sdio_func> func, Ptr<?> dst, @Unsigned int addr2, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_memcpy_toio(Ptr<sdio_func> func, @Unsigned int addr2, Ptr<?> src, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char sdio_readb(Ptr<sdio_func> func, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sdio_readl(Ptr<sdio_func> func, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_readsb(Ptr<sdio_func> func, Ptr<?> dst, @Unsigned int addr2, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short sdio_readw(Ptr<sdio_func> func, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_release_host(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_retune_crc_disable(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_retune_crc_enable(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_retune_hold_now(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_retune_release(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_set_block_size(Ptr<sdio_func> func, @Unsigned int blksz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_set_host_pm_flags(Ptr<sdio_func> func, @Unsigned @OriginalName(value="mmc_pm_flag_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_writeb(Ptr<sdio_func> func, char b, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char sdio_writeb_readb(Ptr<sdio_func> func, char write_byte, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_writel(Ptr<sdio_func> func, @Unsigned int b, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_writesb(Ptr<sdio_func> func, @Unsigned int addr2, Ptr<?> src, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_writew(Ptr<sdio_func> func, @Unsigned short b, @Unsigned int addr2, Ptr<Integer> err_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_claim_irq(Ptr<sdio_func> func, Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_disable_wide(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_enable_4bit_bus(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_irq_thread(Ptr<?> _host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_irq_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_read_cccr(Ptr<MmcDefinitions.mmc_card> card, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_release_irq(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_set_bus_speed_mode(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_signal_irq(Ptr<MmcDefinitions.mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_single_irq_set(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_free_common_cis(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_free_func_cis(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_read_cis(Ptr<MmcDefinitions.mmc_card> card, Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_read_common_cis(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_read_func_cis(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_reset(Ptr<MmcDefinitions.mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sdio_register_driver(Ptr<sdio_driver> drv, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_add_func(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sdio_func> sdio_alloc_func(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sdio_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int sdio_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sdio_bus_uevent((const struct device*)$arg1, $arg2)")
    public static int sdio_bus_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct sdio_device_id*)sdio_match_device($arg1, (const struct sdio_driver*)$arg2))")
    public static Ptr<sdio_device_id> sdio_match_device(Ptr<sdio_func> func, Ptr<sdio_driver> sdrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sdio_register_bus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_release_func(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_remove_func(Ptr<sdio_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_unregister_bus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sdio_unregister_driver(Ptr<sdio_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sdio_driver")
    @NotUsableInJava
    public static class sdio_driver
    extends Struct {
        public String name;
        public Ptr<sdio_device_id> id_table;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public DeviceDefinitions.device_driver drv;
    }

    @Type(noCCodeGeneration=true, cType="struct sdio_func_tuple")
    @NotUsableInJava
    public static class sdio_func_tuple
    extends Struct {
        public Ptr<sdio_func_tuple> next;
        public char code;
        public char size;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct sdio_func")
    @NotUsableInJava
    public static class sdio_func
    extends Struct {
        public Ptr<MmcDefinitions.mmc_card> card;
        public runtime.device dev;
        public Ptr<?> irq_handler;
        public @Unsigned int num;
        public char _class;
        public @Unsigned short vendor;
        public @Unsigned short device;
        public @Unsigned int max_blksize;
        public @Unsigned int cur_blksize;
        public @Unsigned int enable_timeout;
        public @Unsigned int state;
        public Ptr<Character> tmpbuf;
        public char major_rev;
        public char minor_rev;
        public @Unsigned int num_info;
        public Ptr<String> info;
        public Ptr<sdio_func_tuple> tuples;
    }

    @Type(noCCodeGeneration=true, cType="struct sdio_device_id")
    @NotUsableInJava
    public static class sdio_device_id
    extends Struct {
        public char _class;
        public @Unsigned short vendor;
        public @Unsigned short device;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct sdio_cis")
    @NotUsableInJava
    public static class sdio_cis
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public @Unsigned short blksize;
        public @Unsigned int max_dtr;
    }

    @Type(noCCodeGeneration=true, cType="struct sdio_cccr")
    @NotUsableInJava
    public static class sdio_cccr
    extends Struct {
        public @Unsigned int sdio_vsn;
        public @Unsigned int sd_vsn;
        public @Unsigned int multi_block;
        public @Unsigned int low_speed;
        public @Unsigned int wide_bus;
        public @Unsigned int high_power;
        public @Unsigned int high_speed;
        public @Unsigned int disable_cd;
        public @Unsigned int enable_async_irq;
    }
}

