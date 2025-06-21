/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TickDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CanDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="can_map_frag((const skb_frag*)$arg1)")
    public static boolean can_map_frag(Ptr<@OriginalName(value="skb_frag_t") SkbDefinitions.skb_frag> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int can_migrate_task(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.lb_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_stop_idle_tick(int cpu2, Ptr<TickDefinitions.tick_sched> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_change_pte_writable(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long can_clear_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="can_clear_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long can_clear_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_demote(int nid, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_do_mlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_modify_vma_madv(Ptr<VmDefinitions.vm_area_struct> vma, int behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="can_skip_ioresource_align((const struct dmi_system_id*)$arg1)")
    public static int can_skip_ioresource_align(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_vma_merge_after(Ptr<VmaDefinitions.vma_merge_struct> vmg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_vma_merge_right(Ptr<VmaDefinitions.vma_merge_struct> vmg, boolean can_merge_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_follow_write_pmd(PmdDefinitions.pmd_t pmd, Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_follow_write_pte(PteDefinitions.pte_t pte, Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_boost(Ptr<runtime.insn> insn2, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_change_pmd_writable(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="can_nice((const struct task_struct*)$arg1, (const int)$arg2)")
    public static int can_nice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int can_optimize(@Unsigned long paddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_probe(@Unsigned long paddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int can_request_irq(@Unsigned int irq, @Unsigned long irqflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean can_split_folio(Ptr<runtime.folio> folio2, int caller_pins, Ptr<Integer> pextra_pins) {
        throw new MethodIsBPFRelatedFunction();
    }
}

