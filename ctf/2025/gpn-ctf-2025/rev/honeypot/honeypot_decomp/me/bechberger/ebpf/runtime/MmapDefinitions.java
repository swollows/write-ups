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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mmap_address_hint_valid(@Unsigned long addr2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mmap_base(@Unsigned long rnd, @Unsigned long task_size, Ptr<runtime.rlimit> rlim_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmap_read_unlock(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmap_udmabuf(Ptr<DmaDefinitions.dma_buf> buf, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmap_lock_do_trace_acquire_returned(Ptr<MmDefinitions.mm_struct> mm, boolean write2, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmap_lock_do_trace_released(Ptr<MmDefinitions.mm_struct> mm, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmap_lock_do_trace_start_locking(Ptr<MmDefinitions.mm_struct> mm, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmap_mem(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmap_zero(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __mmap_region(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmap_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmap_min_addr_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int mmap_min_addr_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mmap_region(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmap_violation_check($arg1, $arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static int mmap_violation_check(ImaDefinitions.ima_hooks func, Ptr<runtime.file> file2, Ptr<String> pathbuf, Ptr<String> pathname, String filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmap_vmcore(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int mmap_vmcore_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mmap_unlock_irq_work")
    @NotUsableInJava
    public static class mmap_unlock_irq_work
    extends Struct {
        public IrqDefinitions.irq_work irq_work;
        public Ptr<MmDefinitions.mm_struct> mm;
    }

    @Type(noCCodeGeneration=true, cType="struct mmap_arg_struct32")
    @NotUsableInJava
    public static class mmap_arg_struct32
    extends Struct {
        public @Unsigned int addr;
        public @Unsigned int len;
        public @Unsigned int prot;
        public @Unsigned int flags;
        public @Unsigned int fd;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct { int fd; int flags; }")
    @NotUsableInJava
    public static class mmap_of_anon_member_of_audit_context
    extends Struct {
        public int fd;
        public int flags;
    }
}

