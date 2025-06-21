/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.FutexDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class FixupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixup_ht_bug() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fixup_red_left(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixup_cpu_id(Ptr<misc.cpuinfo_x86> c, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixup_exception(Ptr<PtDefinitions.pt_regs> regs, int trapnr, @Unsigned long error_code, @Unsigned long fault_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixup_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixup_mpss_256(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixup_rev1_53c810(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixup_ti816x_class(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixup_detailed_cea_mode_clock(Ptr<DrmDefinitions.drm_connector> connector, Ptr<DrmDefinitions.drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixup_kfunc_call(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<BpfDefinitions.bpf_insn> insn_buf, int insn_idx, Ptr<Integer> cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fixup_umip_exception(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixup_user_fault(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long address, @Unsigned int fault_flags, Ptr<@OriginalName(value="bool") Boolean> unlocked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fixup_pi_state_owner(Ptr<@Unsigned Integer> uaddr, Ptr<FutexDefinitions.futex_q> q, Ptr<TaskDefinitions.task_struct> argowner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PtDefinitions.pt_regs> fixup_bad_iret(Ptr<PtDefinitions.pt_regs> bad_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixup_pi_owner(Ptr<@Unsigned Integer> uaddr, Ptr<FutexDefinitions.futex_q> q, int locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fixup_vdso_exception(Ptr<PtDefinitions.pt_regs> regs, int trapnr, @Unsigned long error_code, @Unsigned long fault_addr) {
        throw new MethodIsBPFRelatedFunction();
    }
}

