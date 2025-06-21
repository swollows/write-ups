/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SavedDefinitions;
import me.bechberger.ebpf.runtime.SnapshotDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SaveDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __save_processor_state(Ptr<SavedDefinitions.saved_context> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_async_options(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean save_fsave_header(Ptr<TaskDefinitions.task_struct> tsk, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_ioapic_entries() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_processor_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean save_xstate_epilog(Ptr<?> buf, int ia32_frame, Ptr<runtime.fpstate> fpstate2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __save_altstack(Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> uss, @Unsigned long sp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_compressed_image(Ptr<SwapDefinitions.swap_map_handle> handle, Ptr<SnapshotDefinitions.snapshot_handle> snapshot, @Unsigned int nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_fpregs_to_fpstate(Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_ftrace_mod_rec(Ptr<FtraceDefinitions.ftrace_mod_map> mod_map, Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_image(Ptr<SwapDefinitions.swap_map_handle> handle, Ptr<SnapshotDefinitions.snapshot_handle> snapshot, @Unsigned int nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_aux_ptr_type(Ptr<BpfDefinitions.bpf_verifier_env> env, BpfDefinitions.bpf_reg_type type2, boolean allow_trust_mismatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_builtin_microcode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_cur(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_register_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> state2, int spi, Ptr<BpfDefinitions.bpf_reg_state> reg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_screen(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="save_args((const struct btf_func_model*)$arg1, $arg2, $arg3, $arg4)")
    public static void save_args(Ptr<BtfDefinitions.btf_func_model> m, Ptr<Ptr<Character>> prog, int stack_size, boolean for_call_origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="save_mem_devices((const struct dmi_header*)$arg1, $arg2)")
    public static void save_mem_devices(Ptr<DmiDefinitions.dmi_header> dm, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int save_microcode_in_initrd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="save_named_trigger((const u8*)$arg1, $arg2)")
    public static int save_named_trigger(String name, Ptr<EventDefinitions.event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_track_data_snapshot(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TracingDefinitions.tracing_map_elt> elt, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> rbe, Ptr<?> key2, Ptr<ActionDefinitions.action_data> data, Ptr<@Unsigned Long> var_ref_vals) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void save_track_data_vars(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TracingDefinitions.tracing_map_elt> elt, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> rbe, Ptr<?> key2, Ptr<ActionDefinitions.action_data> data, Ptr<@Unsigned Long> var_ref_vals) {
        throw new MethodIsBPFRelatedFunction();
    }
}

