/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PvDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pv_init_lock_hash() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pv_queued_spin_lock_slowpath(Ptr<runtime.qspinlock> lock, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pv_queued_spin_unlock_slowpath(Ptr<runtime.qspinlock> lock, char locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.qspinlock>> pv_hash(Ptr<runtime.qspinlock> lock, Ptr<pv_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pv_native_get_debugreg(int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pv_native_safe_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pv_native_set_debugreg(int regno, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pv_native_wbinvd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pv_native_write_cr2(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pv_is_native_spin_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pv_is_native_vcpu_is_preempted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pv_ipi_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pv_sched_yield_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pv_tlb_flush_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pv_hash_entry")
    @NotUsableInJava
    public static class pv_hash_entry
    extends Struct {
        public Ptr<runtime.qspinlock> lock;
        public Ptr<pv_node> node;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_node")
    @NotUsableInJava
    public static class pv_node
    extends Struct {
        public misc.mcs_spinlock mcs;
        public int cpu;
        public char state;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int features; _Bool enforce; }")
    @NotUsableInJava
    public static class pv_cpuid_of_kvm_vcpu_arch
    extends Struct {
        public @Unsigned int features;
        public boolean enforce;
    }

    @Type(noCCodeGeneration=true, cType="struct { _Bool pv_unhalted; }")
    @NotUsableInJava
    public static class pv_of_kvm_vcpu_arch
    extends Struct {
        public boolean pv_unhalted;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int msr_val; struct gfn_to_hva_cache data; }")
    @NotUsableInJava
    public static class pv_eoi_of_kvm_vcpu_arch
    extends Struct {
        public @Unsigned long msr_val;
        public misc.gfn_to_hva_cache data;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct vm_struct *area; }")
    @NotUsableInJava
    public static class pv_of_anon_member_of_xenbus_map_node
    extends Struct {
        public Ptr<VmDefinitions.vm_struct> area;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_info")
    @NotUsableInJava
    public static class pv_info
    extends Struct {
        public @Unsigned short extra_user_64bit_cs;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_lock_ops")
    @NotUsableInJava
    public static class pv_lock_ops
    extends Struct {
        public Ptr<?> queued_spin_lock_slowpath;
        public misc.paravirt_callee_save queued_spin_unlock;
        public Ptr<?> wait;
        public Ptr<?> kick;
        public misc.paravirt_callee_save vcpu_is_preempted;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_mmu_ops")
    @NotUsableInJava
    public static class pv_mmu_ops
    extends Struct {
        public Ptr<?> flush_tlb_user;
        public Ptr<?> flush_tlb_kernel;
        public Ptr<?> flush_tlb_one_user;
        public Ptr<?> flush_tlb_multi;
        public Ptr<?> tlb_remove_table;
        public Ptr<?> exit_mmap;
        public Ptr<?> notify_page_enc_status_changed;
        public misc.paravirt_callee_save read_cr2;
        public Ptr<?> write_cr2;
        public Ptr<?> read_cr3;
        public Ptr<?> write_cr3;
        public Ptr<?> enter_mmap;
        public Ptr<?> pgd_alloc;
        public Ptr<?> pgd_free;
        public Ptr<?> alloc_pte;
        public Ptr<?> alloc_pmd;
        public Ptr<?> alloc_pud;
        public Ptr<?> alloc_p4d;
        public Ptr<?> release_pte;
        public Ptr<?> release_pmd;
        public Ptr<?> release_pud;
        public Ptr<?> release_p4d;
        public Ptr<?> set_pte;
        public Ptr<?> set_pmd;
        public Ptr<?> ptep_modify_prot_start;
        public Ptr<?> ptep_modify_prot_commit;
        public misc.paravirt_callee_save pte_val;
        public misc.paravirt_callee_save make_pte;
        public misc.paravirt_callee_save pgd_val;
        public misc.paravirt_callee_save make_pgd;
        public Ptr<?> set_pud;
        public misc.paravirt_callee_save pmd_val;
        public misc.paravirt_callee_save make_pmd;
        public misc.paravirt_callee_save pud_val;
        public misc.paravirt_callee_save make_pud;
        public Ptr<?> set_p4d;
        public misc.paravirt_callee_save p4d_val;
        public misc.paravirt_callee_save make_p4d;
        public Ptr<?> set_pgd;
        public pv_lazy_ops lazy_mode;
        public Ptr<?> set_fixmap;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_irq_ops")
    @NotUsableInJava
    public static class pv_irq_ops
    extends Struct {
        public misc.paravirt_callee_save save_fl;
        public misc.paravirt_callee_save irq_disable;
        public misc.paravirt_callee_save irq_enable;
        public Ptr<?> safe_halt;
        public Ptr<?> halt;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_cpu_ops")
    @NotUsableInJava
    public static class pv_cpu_ops
    extends Struct {
        public Ptr<?> io_delay;
        public Ptr<?> get_debugreg;
        public Ptr<?> set_debugreg;
        public Ptr<?> read_cr0;
        public Ptr<?> write_cr0;
        public Ptr<?> write_cr4;
        public Ptr<?> load_tr_desc;
        public Ptr<?> load_gdt;
        public Ptr<?> load_idt;
        public Ptr<?> set_ldt;
        public Ptr<?> store_tr;
        public Ptr<?> load_tls;
        public Ptr<?> load_gs_index;
        public Ptr<?> write_ldt_entry;
        public Ptr<?> write_gdt_entry;
        public Ptr<?> write_idt_entry;
        public Ptr<?> alloc_ldt;
        public Ptr<?> free_ldt;
        public Ptr<?> load_sp0;
        public Ptr<?> invalidate_io_bitmap;
        public Ptr<?> update_io_bitmap;
        public Ptr<?> wbinvd;
        public Ptr<?> cpuid;
        public Ptr<?> read_msr;
        public Ptr<?> write_msr;
        public Ptr<?> read_msr_safe;
        public Ptr<?> write_msr_safe;
        public Ptr<?> read_pmc;
        public Ptr<?> start_context_switch;
        public Ptr<?> end_context_switch;
    }

    @Type(noCCodeGeneration=true, cType="struct pv_lazy_ops")
    @NotUsableInJava
    public static class pv_lazy_ops
    extends Struct {
        public Ptr<?> enter;
        public Ptr<?> leave;
        public Ptr<?> flush;
    }
}

