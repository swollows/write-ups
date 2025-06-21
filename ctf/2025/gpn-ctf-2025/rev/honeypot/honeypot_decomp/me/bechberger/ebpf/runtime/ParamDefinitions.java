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
import me.bechberger.ebpf.runtime.Cfg80211Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ModuleDefinitions;
import me.bechberger.ebpf.runtime.MountDefinitions;
import me.bechberger.ebpf.runtime.Nl80211Definitions;
import me.bechberger.ebpf.runtime.PathDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UnixDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class ParamDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void param_array_free(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_array_get($arg1, (const struct kernel_param*)$arg2)")
    public static int param_array_get(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_array_set((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_array_set(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long param_attr_show(Ptr<ModuleDefinitions.module_attribute> mattr, Ptr<ModuleDefinitions.module_kobject> mk, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long param_attr_store(Ptr<ModuleDefinitions.module_attribute> mattr, Ptr<ModuleDefinitions.module_kobject> mk, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_check_unsafe((const struct kernel_param*)$arg1)")
    public static boolean param_check_unsafe(Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void param_free_charp(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_aabool($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_aabool(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_aacompressionlevel($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_aacompressionlevel(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_aaintbool($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_aaintbool(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_aalockpolicy($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_aalockpolicy(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_aauint($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_aauint(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_action($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_action(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_audit($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_audit(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_bool($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_bool(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_byte($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_byte(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_charp($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_charp(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_dyndbg_classes($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_dyndbg_classes(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_hexint($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_hexint(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_int($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_int(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_invbool($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_invbool(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_lid_init_state($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_lid_init_state(String buf, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_local64($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_local64(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_long($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_long(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_mode($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_mode(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_short($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_short(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_string($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_string(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_uint($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_uint(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_ullong($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_ullong(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_ulong($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_ulong(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_ushort($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_ushort(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_aabool((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_aabool(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_aacompressionlevel((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_aacompressionlevel(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_aaintbool((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_aaintbool(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_aalockpolicy((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_aalockpolicy(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_aauint((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_aauint(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_action((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_action(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_audit((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_audit(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_bint((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_bint(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_bool((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_bool(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_bool_enable_only((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_bool_enable_only(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_byte((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_byte(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_charp((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_charp(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_copystring((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_copystring(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_dyndbg_classes((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_dyndbg_classes(String instr, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_dyndbg_classnames((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_dyndbg_classnames(String instr, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_hexint((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_hexint(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_int((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_int(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_invbool((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_invbool(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_kgdboc_var((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_kgdboc_var(String kmessage, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_lid_init_state((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_lid_init_state(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_local64((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_local64(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_long((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_long(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_mode((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_mode(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_short((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_short(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_uint((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_uint(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_uint_minmax((const u8*)$arg1, (const struct kernel_param*)$arg2, $arg3, $arg4)")
    public static int param_set_uint_minmax(String val, Ptr<KernelDefinitions.kernel_param> kp, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_ullong((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_ullong(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_ulong((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_ulong(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_ushort((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_ushort(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void param_sysfs_builtin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int param_sysfs_builtin_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int param_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_acpica_version($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_acpica_version(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_debug_layer($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_debug_layer(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_debug_level($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_debug_level(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_event_clearing($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_event_clearing(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_sample_interval($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_sample_interval(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_trace_method_name($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_trace_method_name(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_trace_state($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_trace_state(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_event_clearing((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_event_clearing(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_sample_interval((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_sample_interval(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_trace_method_name((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_trace_method_name(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_trace_state((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_trace_state(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_get_do_rcu_barrier($arg1, (const struct kernel_param*)$arg2)")
    public static int param_get_do_rcu_barrier(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_bufsize((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_bufsize(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_do_rcu_barrier((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_do_rcu_barrier(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_first_fqs_jiffies((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_first_fqs_jiffies(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="param_set_next_fqs_jiffies((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int param_set_next_fqs_jiffies(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int param_setup_earlycon(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { enum nl80211_band band_pref; struct cfg80211_bss_select_adjust adjust; }")
    @NotUsableInJava
    public static class param_of_cfg80211_bss_selection
    extends Union {
        public Nl80211Definitions.nl80211_band band_pref;
        public Cfg80211Definitions.cfg80211_bss_select_adjust adjust;
    }

    @Type(noCCodeGeneration=true, cType="struct param_attribute")
    @NotUsableInJava
    public static class param_attribute
    extends Struct {
        public ModuleDefinitions.module_attribute mattr;
        public Ptr<KernelDefinitions.kernel_param> param;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { const struct tomoyo_path_info*; const struct tomoyo_path_info*; u8 operation; } path; struct { const struct tomoyo_path_info*; const struct tomoyo_path_info*; u8 operation; } path2; struct { const struct tomoyo_path_info*; unsigned int mode; unsigned int major; unsigned int minor; u8 operation; } mkdev; struct { const struct tomoyo_path_info*; long unsigned int number; u8 operation; } path_number; struct { const struct tomoyo_path_info*; } environ; struct { const unsigned int*; short unsigned int port; u8 protocol; u8 operation; _Bool is_ipv6; } inet_network; struct { const struct tomoyo_path_info*; u8 protocol; u8 operation; } unix_network; struct { const struct tomoyo_path_info*; const struct tomoyo_path_info*; const struct tomoyo_path_info*; long unsigned int flags; int need_dev; } mount; struct { const struct tomoyo_path_info*; } task; }")
    @NotUsableInJava
    public static class param_of_tomoyo_request_info
    extends Union {
        public PathDefinitions.path_of_param_of_tomoyo_request_info path;
        public misc.path2_of_param_of_tomoyo_request_info path2;
        public misc.mkdev_of_param_of_tomoyo_request_info mkdev;
        public PathDefinitions.path_number_of_param_of_tomoyo_request_info path_number;
        public misc.environ_of_param_of_tomoyo_request_info environ;
        public InetDefinitions.inet_network_of_param_of_tomoyo_request_info inet_network;
        public UnixDefinitions.unix_network_of_param_of_tomoyo_request_info unix_network;
        public MountDefinitions.mount_of_param_of_tomoyo_request_info mount;
        public TaskDefinitions.task_of_param_of_tomoyo_request_info task;
    }
}

