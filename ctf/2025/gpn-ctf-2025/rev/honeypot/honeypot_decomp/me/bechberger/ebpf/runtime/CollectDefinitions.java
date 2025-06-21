/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.ApeiDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KprobeDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PagesDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.PsiDefinitions;
import me.bechberger.ebpf.runtime.SyscallDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CollectDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="collect_domain_accesses((const const struct landlock_ruleset*)$arg1, (const const struct dentry*)$arg2, $arg3, (const short unsigned int[16]*)$arg4)")
    public static boolean collect_domain_accesses(Ptr<LandlockDefinitions.landlock_ruleset> domain, Ptr<runtime.dentry> mnt_root, Ptr<runtime.dentry> dir, Ptr<@Unsigned @OriginalName(value="layer_mask_t") short @Size(value=16) []> layer_masks_dom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="collect_mounts((const struct path*)$arg1)")
    public static Ptr<runtime.vfsmount> collect_mounts(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_posix_cputimers(Ptr<PosixDefinitions.posix_cputimers> pct, Ptr<@Unsigned Long> samples, Ptr<ListDefinitions.list_head> firing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_procs(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<ListDefinitions.list_head> tokill, int force_early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_procs_anon(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<ListDefinitions.list_head> to_kill2, int force_early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_res_callback(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_sigign_sigcatch(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.sigset_t> sigign, Ptr<misc.sigset_t> sigcatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_garbage_slots(Ptr<KprobeDefinitions.kprobe_insn_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean collect_one_slot(Ptr<KprobeDefinitions.kprobe_insn_page> kip, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_percpu_times(Ptr<PsiDefinitions.psi_group> group, PsiDefinitions.psi_aggregators aggregator, Ptr<@Unsigned Integer> pchanged_states) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_signal(int sig, Ptr<runtime.sigpending> list, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, Ptr<@OriginalName(value="bool") Boolean> resched_timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_syscall(Ptr<TaskDefinitions.task_struct> target, Ptr<SyscallDefinitions.syscall_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_cpu_info(int cpu_num, Ptr<CpuDefinitions.cpu_signature> csig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_linked_regs(Ptr<BpfDefinitions.bpf_verifier_state> vstate, @Unsigned int id, Ptr<misc.linked_regs> linked_regs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long collect_longterm_unpinnable_folios(Ptr<ListDefinitions.list_head> movable_folio_list, Ptr<PagesDefinitions.pages_or_folios> pofs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_mm_slot(Ptr<misc.khugepaged_mm_slot> mm_slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_cpu_info_amd(int cpu2, Ptr<CpuDefinitions.cpu_signature> csig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_event(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2, int max_count, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int collect_events(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> leader, boolean dogrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_procs_ksm(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<ListDefinitions.list_head> to_kill2, int force_early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void collect_wb_stats(Ptr<WbDefinitions.wb_stats> stats, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }
}

