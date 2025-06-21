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
import me.bechberger.ebpf.runtime.CallDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SmpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_prepare_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_setup_processor_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_shutdown_nonboot_cpus(@Unsigned int primary_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smp_stop_nmi_callback(@Unsigned int val, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_kick_mwait_play_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_prepare_cpus_common() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_store_cpu_info(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __smp_call_single_queue(int cpu2, Ptr<misc.llist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_call_function(@OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<?> info2, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smp_call_function_any((const struct cpumask*)$arg1, $arg2, $arg3, $arg4)")
    public static int smp_call_function_any(Ptr<runtime.cpumask> mask, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<?> info2, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smp_call_function_many((const struct cpumask*)$arg1, $arg2, $arg3, $arg4)")
    public static void smp_call_function_many(Ptr<runtime.cpumask> mask, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<?> info2, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smp_call_function_many_cond((const struct cpumask*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static void smp_call_function_many_cond(Ptr<runtime.cpumask> mask, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<?> info2, @Unsigned int scf_flags, @OriginalName(value="smp_cond_func_t") Ptr<?> cond_func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smp_call_function_single(int cpu2, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<?> info2, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smp_call_function_single_async(int cpu2, Ptr<@OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smp_call_on_cpu($arg1, (int (*)(void*))$arg2, $arg3, $arg4)")
    public static int smp_call_on_cpu(@Unsigned int cpu2, Ptr<?> func, Ptr<?> par, boolean phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_call_on_cpu_callback(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smp_check_mpc(Ptr<misc.mpc_table> mpc, String oem, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_dump_mptable(Ptr<misc.mpc_table> mpc, String mpt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smp_scan_config(@Unsigned long base, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smp_mon_event_count(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct smp_call_on_cpu_struct")
    @NotUsableInJava
    public static class smp_call_on_cpu_struct
    extends Struct {
        public misc.work_struct work;
        public runtime.completion done;
        public Ptr<?> func;
        public Ptr<?> data;
        public int ret;
        public int cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct smp_alt_module")
    @NotUsableInJava
    public static class smp_alt_module
    extends Struct {
        public Ptr<runtime.module> mod;
        public String name;
        public Ptr<Integer> locks;
        public Ptr<Integer> locks_end;
        public Ptr<Character> text;
        public Ptr<Character> text_end;
        public ListDefinitions.list_head next;
    }

    @Type(noCCodeGeneration=true, cType="struct smp_hotplug_thread")
    @NotUsableInJava
    public static class smp_hotplug_thread
    extends Struct {
        public Ptr<Ptr<TaskDefinitions.task_struct>> store;
        public ListDefinitions.list_head list;
        public Ptr<?> thread_should_run;
        public Ptr<?> thread_fn;
        public Ptr<?> create;
        public Ptr<?> setup;
        public Ptr<?> cleanup;
        public Ptr<?> park;
        public Ptr<?> unpark;
        public boolean selfparking;
        public String thread_comm;
    }

    @Type(noCCodeGeneration=true, cType="struct smp_ops")
    @NotUsableInJava
    public static class smp_ops
    extends Struct {
        public Ptr<?> smp_prepare_boot_cpu;
        public Ptr<?> smp_prepare_cpus;
        public Ptr<?> smp_cpus_done;
        public Ptr<?> stop_other_cpus;
        public Ptr<?> crash_stop_other_cpus;
        public Ptr<?> smp_send_reschedule;
        public Ptr<?> cleanup_dead_cpu;
        public Ptr<?> poll_sync_state;
        public Ptr<?> kick_ap_alive;
        public Ptr<?> cpu_disable;
        public Ptr<?> cpu_die;
        public Ptr<?> play_dead;
        public Ptr<?> stop_this_cpu;
        public Ptr<?> send_call_func_ipi;
        public Ptr<?> send_call_func_single_ipi;
    }
}

