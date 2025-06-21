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
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SramDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sram_add_partition(Ptr<sram_dev> sram, Ptr<sram_reserve> block, @Unsigned @OriginalName(value="phys_addr_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sram_free_partitions(Ptr<sram_dev> sram) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sram_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sram_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sram_read(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sram_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sram_reserve_cmp($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int sram_reserve_cmp(Ptr<?> priv, Ptr<ListDefinitions.list_head> a, Ptr<ListDefinitions.list_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sram_reserve_regions(Ptr<sram_dev> sram, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sram_write(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sram_reserve")
    @NotUsableInJava
    public static class sram_reserve
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned int start;
        public @Unsigned int size;
        public runtime.resource res;
        public boolean export;
        public boolean pool;
        public boolean protect_exec;
        public String label;
    }

    @Type(noCCodeGeneration=true, cType="struct sram_dev")
    @NotUsableInJava
    public static class sram_dev
    extends Struct {
        public Ptr<sram_config> config;
        public Ptr<runtime.device> dev;
        public Ptr<?> virt_base;
        public boolean no_memory_wc;
        public Ptr<GenDefinitions.gen_pool> pool;
        public Ptr<sram_partition> partition;
        public @Unsigned int partitions;
    }

    @Type(noCCodeGeneration=true, cType="struct sram_partition")
    @NotUsableInJava
    public static class sram_partition
    extends Struct {
        public Ptr<?> base;
        public Ptr<GenDefinitions.gen_pool> pool;
        public misc.bin_attribute battr;
        public runtime.mutex lock;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct sram_config")
    @NotUsableInJava
    public static class sram_config
    extends Struct {
        public Ptr<?> init;
        public boolean map_only_reserved;
    }
}

