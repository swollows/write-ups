/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ArchDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimensDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VdsoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vdso_update_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vdso_update_end(@Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vdso_fault((const struct vm_special_mapping*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int vdso_fault(Ptr<VmDefinitions.vm_special_mapping> sm, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vdso_join_timens(Ptr<TaskDefinitions.task_struct> task2, Ptr<misc.time_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vdso_mremap((const struct vm_special_mapping*)$arg1, $arg2)")
    public static int vdso_mremap(Ptr<VmDefinitions.vm_special_mapping> sm, Ptr<VmDefinitions.vm_area_struct> new_vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vdso_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vdso_exception_table_entry")
    @NotUsableInJava
    public static class vdso_exception_table_entry
    extends Struct {
        public int insn;
        public int fixup;
    }

    @Type(noCCodeGeneration=true, cType="struct vdso_rng_data")
    @NotUsableInJava
    public static class vdso_rng_data
    extends Struct {
        public @Unsigned long generation;
        public char is_ready;
    }

    @Type(noCCodeGeneration=true, cType="struct vdso_data")
    @NotUsableInJava
    public static class vdso_data
    extends Struct {
        public @Unsigned int seq;
        public int clock_mode;
        public @Unsigned long cycle_last;
        public @Unsigned long max_cycles;
        public @Unsigned long mask;
        public @Unsigned int mult;
        public @Unsigned int shift;
        @InlineUnion(value=3316)
        public @InlineUnion(value=3316) vdso_timestamp @Size(value=12) [] basetime;
        @InlineUnion(value=3316)
        public @InlineUnion(value=3316) TimensDefinitions.timens_offset @Size(value=12) [] offset;
        public int tz_minuteswest;
        public int tz_dsttime;
        public @Unsigned int hrtimer_res;
        public @Unsigned int __unused;
        public ArchDefinitions.arch_vdso_data arch_data;
    }

    @Type(noCCodeGeneration=true, cType="struct vdso_timestamp")
    @NotUsableInJava
    public static class vdso_timestamp
    extends Struct {
        public @Unsigned long sec;
        public @Unsigned long nsec;
    }

    @Type(noCCodeGeneration=true, cType="enum vdso_clock_mode")
    public static enum vdso_clock_mode implements Enum<vdso_clock_mode>,
    TypedEnum<vdso_clock_mode, Integer>
    {
        VDSO_CLOCKMODE_NONE,
        VDSO_CLOCKMODE_TSC,
        VDSO_CLOCKMODE_PVCLOCK,
        VDSO_CLOCKMODE_HVCLOCK,
        VDSO_CLOCKMODE_MAX,
        VDSO_CLOCKMODE_TIMENS;

    }

    @Type(noCCodeGeneration=true, cType="struct vdso_image")
    @NotUsableInJava
    public static class vdso_image
    extends Struct {
        public Ptr<?> data;
        public @Unsigned long size;
        public @Unsigned long alt;
        public @Unsigned long alt_len;
        public @Unsigned long extable_base;
        public @Unsigned long extable_len;
        public Ptr<?> extable;
        public long sym_vvar_start;
        public long sym_vvar_page;
        public long sym_pvclock_page;
        public long sym_hvclock_page;
        public long sym_timens_page;
        public long sym_VDSO32_NOTE_MASK;
        public long sym___kernel_sigreturn;
        public long sym___kernel_rt_sigreturn;
        public long sym___kernel_vsyscall;
        public long sym_int80_landing_pad;
        public long sym_vdso32_sigreturn_landing_pad;
        public long sym_vdso32_rt_sigreturn_landing_pad;
    }
}

