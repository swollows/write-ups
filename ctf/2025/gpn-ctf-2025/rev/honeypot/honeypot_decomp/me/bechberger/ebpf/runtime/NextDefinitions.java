/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MemblockDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class NextDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static String next_arg(String args, Ptr<String> param2, Ptr<String> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="next_northbridge($arg1, (const struct pci_device_id*)$arg2)")
    public static Ptr<PciDefinitions.pci_dev> next_northbridge(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> next_object(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int next_signal(Ptr<runtime.sigpending> pending, Ptr<misc.sigset_t> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long next_timer_interrupt(Ptr<TimerDefinitions.timer_base> base, @Unsigned long basej) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __next_mem_pfn_range(Ptr<Integer> idx, int nid, Ptr<@Unsigned Long> out_start_pfn, Ptr<@Unsigned Long> out_end_pfn, Ptr<Integer> out_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __next_mem_range(Ptr<@Unsigned Long> idx, int nid, MemblockDefinitions.memblock_flags flags, Ptr<MemblockDefinitions.memblock_type> type_a, Ptr<MemblockDefinitions.memblock_type> type_b, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> out_start, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> out_end, Ptr<Integer> out_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __next_mem_range_rev(Ptr<@Unsigned Long> idx, int nid, MemblockDefinitions.memblock_flags flags, Ptr<MemblockDefinitions.memblock_type> type_a, Ptr<MemblockDefinitions.memblock_type> type_b, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> out_start, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> out_end, Ptr<Integer> out_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.zoneref> __next_zones_zonelist(Ptr<runtime.zoneref> z, ZoneDefinitions.zone_type highest_zoneidx, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int next_demotion_node(int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.pglist_data> next_online_pgdat(Ptr<misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.zone> next_zone(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mount> next_group(Ptr<runtime.mount> m, Ptr<runtime.mount> origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long next_present_section_nr(@Unsigned long section_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.tgid_iter next_tgid(Ptr<PidDefinitions.pid_namespace> ns, misc.tgid_iter iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> next_uptodate_folio(Ptr<XaDefinitions.xa_state> xas, Ptr<misc.address_space> mapping, @Unsigned long end_pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }
}

