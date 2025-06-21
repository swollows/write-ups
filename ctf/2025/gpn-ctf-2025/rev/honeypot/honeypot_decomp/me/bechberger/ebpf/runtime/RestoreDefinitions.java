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
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.SavedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RestoreDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __restore_fpregs_from_user(Ptr<?> buf, @Unsigned long ufeatures, @Unsigned long xrestore, boolean fx_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __restore_processor_state(Ptr<SavedDefinitions.saved_context> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_boot_irq_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_bytes(Ptr<KmemDefinitions.kmem_cache> s2, String message, char data, Ptr<?> from, Ptr<?> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_exclusive_pte(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.page> page2, @Unsigned long address, Ptr<PteDefinitions.pte_t> ptep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean restore_fpregs_from_user(Ptr<?> buf, @Unsigned long xrestore, boolean fx_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int restore_ioapic_entries() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_processor_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean restore_sigcontext(Ptr<PtDefinitions.pt_regs> regs, Ptr<runtime.sigcontext_64> usc, @Unsigned long uc_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int restore_signal_shadow_stack() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restore_altstack((const sigaltstack*)$arg1)")
    public static int restore_altstack(Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> uss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_fpregs_from_fpstate(Ptr<runtime.fpstate> fpstate2, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_fpregs_from_init_fpstate(@Unsigned long features_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int restore_online_page_callback(@OriginalName(value="online_page_callback_t") Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_reserve_on_error(Ptr<runtime.hstate> h, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __restore_freezer_state(Ptr<TaskDefinitions.task_struct> p, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_cur(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_image() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void restore_registers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restore_regs((const struct btf_func_model*)$arg1, $arg2, $arg3)")
    public static void restore_regs(Ptr<BtfDefinitions.btf_func_model> m, Ptr<Ptr<Character>> prog, int stack_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct restore_data_record")
    @NotUsableInJava
    public static class restore_data_record
    extends Struct {
        public @Unsigned long jump_address;
        public @Unsigned long jump_address_phys;
        public @Unsigned long cr3;
        public @Unsigned long magic;
        public @Unsigned long e820_checksum;
    }
}

