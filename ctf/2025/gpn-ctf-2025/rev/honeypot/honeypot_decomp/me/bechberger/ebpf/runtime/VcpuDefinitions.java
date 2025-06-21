/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AddrDefinitions;
import me.bechberger.ebpf.runtime.ArchDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.FpuDefinitions;
import me.bechberger.ebpf.runtime.PvclockDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VcpuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_guest_context")
    @NotUsableInJava
    public static class vcpu_guest_context
    extends Struct {
        public FpuDefinitions.fpu_ctxt_of_vcpu_guest_context fpu_ctxt;
        public @Unsigned long flags;
        public CpuDefinitions.cpu_user_regs user_regs;
        public misc.trap_info @Size(value=256) [] trap_ctxt;
        public @Unsigned long ldt_base;
        public @Unsigned long ldt_ents;
        public @Unsigned long @Size(value=16) [] gdt_frames;
        public @Unsigned long gdt_ents;
        public @Unsigned long kernel_ss;
        public @Unsigned long kernel_sp;
        public @Unsigned long @Size(value=8) [] ctrlreg;
        public @Unsigned long @Size(value=8) [] debugreg;
        public @Unsigned long event_callback_eip;
        public @Unsigned long failsafe_callback_eip;
        public @Unsigned long syscall_callback_eip;
        public @Unsigned long vm_assist;
        public @Unsigned @OriginalName(value="uint64_t") long fs_base;
        public @Unsigned @OriginalName(value="uint64_t") long gs_base_kernel;
        public @Unsigned @OriginalName(value="uint64_t") long gs_base_user;
    }

    @Type(noCCodeGeneration=true, cType="enum vcpu_state")
    public static enum vcpu_state implements Enum<vcpu_state>,
    TypedEnum<vcpu_state, Integer>
    {
        vcpu_running,
        vcpu_halted,
        vcpu_hashed;

    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_register_vcpu_info")
    @NotUsableInJava
    public static class vcpu_register_vcpu_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long mfn;
        public @Unsigned @OriginalName(value="uint32_t") int offset;
        public @Unsigned @OriginalName(value="uint32_t") int rsvd;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_register_runstate_memory_area")
    @NotUsableInJava
    public static class vcpu_register_runstate_memory_area
    extends Struct {
        public AddrDefinitions.addr_of_vcpu_register_runstate_memory_area addr;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_runstate_info")
    @NotUsableInJava
    public static class vcpu_runstate_info
    extends Struct {
        public int state;
        public @Unsigned @OriginalName(value="uint64_t") long state_entry_time;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=4) [] time;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_register_time_memory_area")
    @NotUsableInJava
    public static class vcpu_register_time_memory_area
    extends Struct {
        public AddrDefinitions.addr_of_vcpu_register_time_memory_area addr;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_set_singleshot_timer")
    @NotUsableInJava
    public static class vcpu_set_singleshot_timer
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long timeout_abs_ns;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_time_info")
    @NotUsableInJava
    public static class vcpu_time_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int version;
        public @Unsigned @OriginalName(value="uint32_t") int pad0;
        public @Unsigned @OriginalName(value="uint64_t") long tsc_timestamp;
        public @Unsigned @OriginalName(value="uint64_t") long system_time;
        public @Unsigned @OriginalName(value="uint32_t") int tsc_to_system_mul;
        public @OriginalName(value="int8_t") byte tsc_shift;
        public @OriginalName(value="int8_t") byte @Size(value=3) [] pad1;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_data")
    @NotUsableInJava
    public static class vcpu_data
    extends Struct {
        public @Unsigned long pi_desc_addr;
        public @Unsigned int vector;
    }

    @Type(noCCodeGeneration=true, cType="struct vcpu_info")
    @NotUsableInJava
    public static class vcpu_info
    extends Struct {
        public @OriginalName(value="uint8_t") char evtchn_upcall_pending;
        public @OriginalName(value="uint8_t") char evtchn_upcall_mask;
        public @Unsigned @OriginalName(value="xen_ulong_t") long evtchn_pending_sel;
        public ArchDefinitions.arch_vcpu_info arch;
        public PvclockDefinitions.pvclock_vcpu_time_info time;
    }
}

