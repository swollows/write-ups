/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class IsolateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean isolate_folio_to_list(Ptr<runtime.folio> folio2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean isolate_movable_page(Ptr<runtime.page> page2, @Unsigned @OriginalName(value="isolate_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean isolate_folio(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isolate_folios(Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc, int swappiness, Ptr<Integer> type_scanned, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void isolate_freepages(Ptr<misc.compact_control> cc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long isolate_freepages_block(Ptr<misc.compact_control> cc, Ptr<@Unsigned Long> start_pfn, @Unsigned long end_pfn, Ptr<ListDefinitions.list_head> freelist, @Unsigned int stride, boolean strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long isolate_freepages_range(Ptr<misc.compact_control> cc, @Unsigned long start_pfn, @Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean isolate_hugetlb(Ptr<runtime.folio> folio2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long isolate_lru_folios(@Unsigned long nr_to_scan, Ptr<runtime.lruvec> lruvec2, Ptr<ListDefinitions.list_head> dst, Ptr<@Unsigned Long> nr_scanned, Ptr<ScanDefinitions.scan_control> sc, LruDefinitions.lru_list lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="isolate_migrate_t") runtime.ISOLATE isolate_migratepages(Ptr<misc.compact_control> cc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isolate_migratepages_block(Ptr<misc.compact_control> cc, @Unsigned long low_pfn, @Unsigned long end_pfn, @Unsigned @OriginalName(value="isolate_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isolate_migratepages_range(Ptr<misc.compact_control> cc, @Unsigned long start_pfn, @Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isolate_or_dissolve_huge_page(Ptr<runtime.page> page2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __isolate_free_page(Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }
}

