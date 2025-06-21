/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CountDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_device(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_dimms(Ptr<runtime.device> dev, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="count_mod_symbols($arg1, (const u8*)$arg2, $arg3)")
    public static int count_mod_symbols(Ptr<?> data, String name, @Unsigned long unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_mounts(Ptr<MntDefinitions.mnt_namespace> ns, Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long count_partial_free_approx(Ptr<KmemDefinitions.kmem_cache_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long count_shadow_nodes(Ptr<runtime.shrinker> shrinker2, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="count_strings((const u8*)$arg1, $arg2)")
    public static @Unsigned int count_strings(String strings, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_symbols(Ptr<?> data, @Unsigned long unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __count_memcg_events(Ptr<MemDefinitions.mem_cgroup> memcg, VmDefinitions.vm_event_item idx, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_memory_range_altmaps_cb(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_semcnt(Ptr<misc.sem_array> sma, @Unsigned @OriginalName(value="ushort") short semnum, boolean count_zero) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_system_ram_pages_cb(@Unsigned long start_pfn, @Unsigned long nr_pages, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_tags(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int count_overhead(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int grp, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="count_strings_kernel((const u8**)$arg1)")
    public static int count_strings_kernel(Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int count_trbs(@Unsigned long addr2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int count_data_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="count_mem_devices((const struct dmi_header*)$arg1, $arg2)")
    public static void count_mem_devices(Ptr<DmiDefinitions.dmi_header> dm, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int count_swap_pages(int type2, int free) {
        throw new MethodIsBPFRelatedFunction();
    }
}

