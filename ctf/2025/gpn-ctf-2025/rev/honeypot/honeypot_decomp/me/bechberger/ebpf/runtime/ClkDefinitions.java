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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ClkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_hw_register_divider($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct clk_hw*)$arg5, (const struct clk_parent_data*)$arg6, $arg7, $arg8, $arg9, $arg10, $arg11, (const struct clk_div_table*)$arg12, $arg13)")
    public static Ptr<clk_hw> __clk_hw_register_divider(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String parent_name, Ptr<clk_hw> parent_hw, Ptr<clk_parent_data> parent_data, @Unsigned long flags, Ptr<?> reg, char shift, char width, char clk_divider_flags, Ptr<clk_div_table> table, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_hw_register_gate($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct clk_hw*)$arg5, (const struct clk_parent_data*)$arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static Ptr<clk_hw> __clk_hw_register_gate(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String parent_name, Ptr<clk_hw> parent_hw, Ptr<clk_parent_data> parent_data, @Unsigned long flags, Ptr<?> reg, char bit_idx, char clk_gate_flags, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_disable_unprepare(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_divider_bestdiv($arg1, $arg2, $arg3, $arg4, (const struct clk_div_table*)$arg5, $arg6, $arg7)")
    public static int clk_divider_bestdiv(Ptr<clk_hw> hw, Ptr<clk_hw> parent, @Unsigned long rate, Ptr<@Unsigned Long> best_parent_rate, Ptr<clk_div_table> table, char width, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_divider_determine_rate(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_divider_recalc_rate(Ptr<clk_hw> hw, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_divider_round_rate(Ptr<clk_hw> hw, @Unsigned long rate, Ptr<@Unsigned Long> prate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_divider_set_rate(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_fd_debug_init(Ptr<clk_hw> hw, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_fd_denominator_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_fd_denominator_get(Ptr<?> hw, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_fd_get_div(Ptr<clk_hw> hw, Ptr<misc.u32_fract> fract) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_fd_numerator_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_fd_numerator_get(Ptr<?> hw, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_fd_recalc_rate(Ptr<clk_hw> hw, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_fd_round_rate(Ptr<clk_hw> hw, @Unsigned long rate, Ptr<@Unsigned Long> parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_fd_set_rate(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_fractional_divider_general_approximation(Ptr<clk_hw> hw, @Unsigned long rate, Ptr<@Unsigned Long> parent_rate, Ptr<@Unsigned Long> m, Ptr<@Unsigned Long> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_gate_disable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_gate_enable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_gate_endisable(Ptr<clk_hw> hw, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_gate_is_enabled(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_fractional_divider($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static Ptr<clk_hw> clk_hw_register_fractional_divider(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, Ptr<?> reg, char mshift, char mwidth, char nshift, char nwidth, char clk_divider_flags, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_divider(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_fractional_divider(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_gate(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_prepare_enable(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_divider_table($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, (const struct clk_div_table*)$arg9, $arg10)")
    public static Ptr<runtime.clk> clk_register_divider_table(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, Ptr<?> reg, char shift, char width, char clk_divider_flags, Ptr<clk_div_table> table, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_fractional_divider($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static Ptr<runtime.clk> clk_register_fractional_divider(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, Ptr<?> reg, char mshift, char mwidth, char nshift, char nwidth, char clk_divider_flags, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_gate($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<runtime.clk> clk_register_gate(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, Ptr<?> reg, char bit_idx, char clk_gate_flags, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister_divider(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister_gate(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_core_init(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_determine_rate(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __clk_get_enable_count(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<clk_hw> __clk_get_hw(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)__clk_get_name((const struct clk*)$arg1))")
    public static String __clk_get_name(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __clk_is_enabled(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_lookup((const u8*)$arg1)")
    public static Ptr<runtime.clk> __clk_lookup(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_lookup_subtree((const u8*)$arg1, $arg2)")
    public static Ptr<clk_core> __clk_lookup_subtree(String name, Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_mux_determine_rate(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_mux_determine_rate_closest(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_notify(Ptr<clk_core> core, @Unsigned long msg, @Unsigned long old_rate, @Unsigned long new_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clk_put(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clk_recalc_accuracies(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clk_recalc_rates(Ptr<clk_core> core, boolean update_req, @Unsigned long msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.clk> __clk_register(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clk_release(Ptr<runtime.kref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clk_set_parent_after(Ptr<clk_core> core, Ptr<clk_core> parent, Ptr<clk_core> old_parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<clk_core> __clk_set_parent_before(Ptr<clk_core> core, Ptr<clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_speculate_rates(Ptr<clk_core> core, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<clk_core> clk_calc_new_rates(Ptr<clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_calc_subtree(Ptr<clk_core> core, @Unsigned long new_rate, Ptr<clk_core> new_parent, char p_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_change_rate(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_determine_round_nolock(Ptr<clk_core> core, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_disable(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_disable_lock(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_enable(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_core_evict_parent_cache_subtree($arg1, (const struct clk_core*)$arg2)")
    public static void clk_core_evict_parent_cache_subtree(Ptr<clk_core> root, Ptr<clk_core> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_core_forward_rate_req($arg1, (const struct clk_rate_request*)$arg2, $arg3, $arg4, $arg5)")
    public static void clk_core_forward_rate_req(Ptr<clk_core> core, Ptr<clk_rate_request> old_req, Ptr<clk_core> parent, Ptr<clk_rate_request> req2, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_get_boundaries(Ptr<clk_core> core, Ptr<@Unsigned Long> min_rate, Ptr<@Unsigned Long> max_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<clk_core> clk_core_get_parent_by_index(Ptr<clk_core> core, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_core_init_rate_req((const struct clk_core*)$arg1, $arg2, $arg3)")
    public static void clk_core_init_rate_req(Ptr<clk_core> core, Ptr<clk_rate_request> req2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean clk_core_is_enabled(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_core_lookup((const u8*)$arg1)")
    public static Ptr<clk_core> clk_core_lookup(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_core_populate_parent_map($arg1, (const struct clk_init_data*)$arg2)")
    public static int clk_core_populate_parent_map(Ptr<clk_core> core, Ptr<clk_init_data> init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_prepare(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_prepare_enable(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_rate_protect(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_rate_unprotect(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_restore_context(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_round_rate_nolock(Ptr<clk_core> core, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_save_context(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_set_duty_cycle_nolock(Ptr<clk_core> core, Ptr<clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_set_duty_cycle_parent_nolock(Ptr<clk_core> core, Ptr<clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_set_parent_nolock(Ptr<clk_core> core, Ptr<clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_set_phase_nolock(Ptr<clk_core> core, int degrees) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_set_rate_nolock(Ptr<clk_core> core, @Unsigned long req_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_unprepare(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_unprepare_lock(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_update_duty_cycle_nolock(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_core_update_duty_cycle_parent_nolock(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_core_update_orphan_status(Ptr<clk_core> core, boolean is_orphan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_debug_create_one(Ptr<clk_core> core, Ptr<runtime.dentry> pdentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_debug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_disable(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_disable_unused() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_disable_unused_subtree(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_dump_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_dump_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_dump_subtree(Ptr<SeqDefinitions.seq_file> s2, Ptr<clk_core> c, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_duty_cycle_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_duty_cycle_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_enable(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_enable_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_enable_unlock(@Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_fetch_parent_index(Ptr<clk_core> core, Ptr<clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_flags_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_flags_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_gate_restore_context(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_get_accuracy(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.clk> clk_get_parent(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_get_phase(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_get_rate(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_get_scaled_duty_cycle(Ptr<runtime.clk> clk2, @Unsigned int scale) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_has_parent((const struct clk*)$arg1, (const struct clk*)$arg2)")
    public static boolean clk_has_parent(Ptr<runtime.clk> clk2, Ptr<runtime.clk> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_create_clk($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static Ptr<runtime.clk> clk_hw_create_clk(Ptr<runtime.device> dev, Ptr<clk_hw> hw, String dev_id, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_hw_determine_rate_no_reparent(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_forward_rate_request((const struct clk_hw*)$arg1, (const struct clk_rate_request*)$arg2, (const struct clk_hw*)$arg3, $arg4, $arg5)")
    public static void clk_hw_forward_rate_request(Ptr<clk_hw> hw, Ptr<clk_rate_request> old_req, Ptr<clk_hw> parent, Ptr<clk_rate_request> req2, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_get_clk($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> clk_hw_get_clk(Ptr<clk_hw> hw, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_get_flags((const struct clk_hw*)$arg1)")
    public static @Unsigned long clk_hw_get_flags(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)clk_hw_get_name((const struct clk_hw*)$arg1))")
    public static String clk_hw_get_name(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_get_num_parents((const struct clk_hw*)$arg1)")
    public static @Unsigned int clk_hw_get_num_parents(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_get_parent((const struct clk_hw*)$arg1)")
    public static Ptr<clk_hw> clk_hw_get_parent(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_get_parent_by_index((const struct clk_hw*)$arg1, $arg2)")
    public static Ptr<clk_hw> clk_hw_get_parent_by_index(Ptr<clk_hw> hw, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_hw_get_parent_index(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_get_rate((const struct clk_hw*)$arg1)")
    public static @Unsigned long clk_hw_get_rate(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_get_rate_range(Ptr<clk_hw> hw, Ptr<@Unsigned Long> min_rate, Ptr<@Unsigned Long> max_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_init_rate_request((const struct clk_hw*)$arg1, $arg2, $arg3)")
    public static void clk_hw_init_rate_request(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_is_enabled((const struct clk_hw*)$arg1)")
    public static boolean clk_hw_is_enabled(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_is_prepared((const struct clk_hw*)$arg1)")
    public static boolean clk_hw_is_prepared(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_rate_is_protected((const struct clk_hw*)$arg1)")
    public static boolean clk_hw_rate_is_protected(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_hw_register(Ptr<runtime.device> dev, Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_reparent(Ptr<clk_hw> hw, Ptr<clk_hw> new_parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_hw_round_rate(Ptr<clk_hw> hw, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_hw_set_parent(Ptr<clk_hw> hw, Ptr<clk_hw> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_set_rate_range(Ptr<clk_hw> hw, @Unsigned long min_rate, @Unsigned long max_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_ignore_unused_setup(String __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean clk_is_enabled_when_prepared(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_is_match((const struct clk*)$arg1, (const struct clk*)$arg2)")
    public static boolean clk_is_match(Ptr<runtime.clk> p, Ptr<runtime.clk> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_max_rate_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_max_rate_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_min_rate_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_min_rate_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_mux_determine_rate_flags(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_nodrv_determine_rate(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_nodrv_disable_unprepare(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_nodrv_prepare_enable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_nodrv_set_parent(Ptr<clk_hw> hw, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_nodrv_set_rate(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_notifier_register(Ptr<runtime.clk> clk2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_notifier_unregister(Ptr<runtime.clk> clk2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_phase_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_phase_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_pm_runtime_get(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_pm_runtime_get_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_pm_runtime_put(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_pm_runtime_put_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_prepare(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_prepare_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_prepare_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<clk_core> clk_propagate_rate_change(Ptr<clk_core> core, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_rate_exclusive_get(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_rate_exclusive_put(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_rate_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_rate_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_recalc(Ptr<clk_core> core, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.clk> clk_register(Ptr<runtime.device> dev, Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_reparent(Ptr<clk_core> core, Ptr<clk_core> new_parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_restore_context() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_round_rate(Ptr<runtime.clk> clk2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_save_context() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_duty_cycle(Ptr<runtime.clk> clk2, @Unsigned int num, @Unsigned int den) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_max_rate(Ptr<runtime.clk> clk2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_min_rate(Ptr<runtime.clk> clk2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_parent(Ptr<runtime.clk> clk2, Ptr<runtime.clk> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_phase(Ptr<runtime.clk> clk2, int degrees) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_rate(Ptr<runtime.clk> clk2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_rate_exclusive(Ptr<runtime.clk> clk2, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_rate_range(Ptr<runtime.clk> clk2, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_set_rate_range_nolock(Ptr<runtime.clk> clk2, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_summary_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_summary_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_summary_show_one(Ptr<SeqDefinitions.seq_file> s2, Ptr<clk_core> c, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_summary_show_subtree(Ptr<SeqDefinitions.seq_file> s2, Ptr<clk_core> c, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unprepare(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unprepare_unused_subtree(Ptr<clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_hw_register_composite($arg1, (const u8*)$arg2, (const u8**)$arg3, (const struct clk_parent_data*)$arg4, $arg5, $arg6, (const struct clk_ops*)$arg7, $arg8, (const struct clk_ops*)$arg9, $arg10, (const struct clk_ops*)$arg11, $arg12)")
    public static Ptr<clk_hw> __clk_hw_register_composite(Ptr<runtime.device> dev, String name, Ptr<String> parent_names, Ptr<clk_parent_data> pdata, int num_parents, Ptr<clk_hw> mux_hw, Ptr<clk_ops> mux_ops, Ptr<clk_hw> rate_hw, Ptr<clk_ops> rate_ops, Ptr<clk_hw> gate_hw, Ptr<clk_ops> gate_ops, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_hw_register_fixed_rate($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct clk_hw*)$arg5, (const struct clk_parent_data*)$arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static Ptr<clk_hw> __clk_hw_register_fixed_rate(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String parent_name, Ptr<clk_hw> parent_hw, Ptr<clk_parent_data> parent_data, @Unsigned long flags, @Unsigned long fixed_rate, @Unsigned long fixed_accuracy, @Unsigned long clk_fixed_flags, boolean devm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_register_clkdev($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static Ptr<clk_lookup> __clk_register_clkdev(Ptr<clk_hw> hw, String con_id, String dev_id, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_add_alias((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static int clk_add_alias(String alias, String alias_dev_name, String con_id, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_composite_determine_rate(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_composite_determine_rate_for_parent($arg1, $arg2, $arg3, (const struct clk_ops*)$arg4)")
    public static int clk_composite_determine_rate_for_parent(Ptr<clk_hw> rate_hw, Ptr<clk_rate_request> req2, Ptr<clk_hw> parent_hw, Ptr<clk_ops> rate_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_composite_disable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_composite_enable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char clk_composite_get_parent(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_composite_is_enabled(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_composite_recalc_rate(Ptr<clk_hw> hw, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_composite_round_rate(Ptr<clk_hw> hw, @Unsigned long rate, Ptr<@Unsigned Long> prate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_composite_set_parent(Ptr<clk_hw> hw, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_composite_set_rate(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_composite_set_rate_and_parent(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_find_hw((const u8*)$arg1, (const u8*)$arg2)")
    public static Ptr<clk_hw> clk_find_hw(String dev_id, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_fixed_rate_recalc_accuracy(Ptr<clk_hw> hw, @Unsigned long parent_accuracy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_fixed_rate_recalc_rate(Ptr<clk_hw> hw, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> clk_get(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_get_sys((const u8*)$arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> clk_get_sys(String dev_id, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_clkdev($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int clk_hw_register_clkdev(Ptr<clk_hw> hw, String con_id, String dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_composite($arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4, $arg5, (const struct clk_ops*)$arg6, $arg7, (const struct clk_ops*)$arg8, $arg9, (const struct clk_ops*)$arg10, $arg11)")
    public static Ptr<clk_hw> clk_hw_register_composite(Ptr<runtime.device> dev, String name, Ptr<String> parent_names, int num_parents, Ptr<clk_hw> mux_hw, Ptr<clk_ops> mux_ops, Ptr<clk_hw> rate_hw, Ptr<clk_ops> rate_ops, Ptr<clk_hw> gate_hw, Ptr<clk_ops> gate_ops, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_composite_pdata($arg1, (const u8*)$arg2, (const struct clk_parent_data*)$arg3, $arg4, $arg5, (const struct clk_ops*)$arg6, $arg7, (const struct clk_ops*)$arg8, $arg9, (const struct clk_ops*)$arg10, $arg11)")
    public static Ptr<clk_hw> clk_hw_register_composite_pdata(Ptr<runtime.device> dev, String name, Ptr<clk_parent_data> parent_data, int num_parents, Ptr<clk_hw> mux_hw, Ptr<clk_ops> mux_ops, Ptr<clk_hw> rate_hw, Ptr<clk_ops> rate_ops, Ptr<clk_hw> gate_hw, Ptr<clk_ops> gate_ops, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_composite(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_fixed_rate(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_put(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_clkdev($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int clk_register_clkdev(Ptr<runtime.clk> clk2, String con_id, String dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_composite($arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4, $arg5, (const struct clk_ops*)$arg6, $arg7, (const struct clk_ops*)$arg8, $arg9, (const struct clk_ops*)$arg10, $arg11)")
    public static Ptr<runtime.clk> clk_register_composite(Ptr<runtime.device> dev, String name, Ptr<String> parent_names, int num_parents, Ptr<clk_hw> mux_hw, Ptr<clk_ops> mux_ops, Ptr<clk_hw> rate_hw, Ptr<clk_ops> rate_ops, Ptr<clk_hw> gate_hw, Ptr<clk_ops> gate_ops, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_composite_pdata($arg1, (const u8*)$arg2, (const struct clk_parent_data*)$arg3, $arg4, $arg5, (const struct clk_ops*)$arg6, $arg7, (const struct clk_ops*)$arg8, $arg9, (const struct clk_ops*)$arg10, $arg11)")
    public static Ptr<runtime.clk> clk_register_composite_pdata(Ptr<runtime.device> dev, String name, Ptr<clk_parent_data> parent_data, int num_parents, Ptr<clk_hw> mux_hw, Ptr<clk_ops> mux_ops, Ptr<clk_hw> rate_hw, Ptr<clk_ops> rate_ops, Ptr<clk_hw> gate_hw, Ptr<clk_ops> gate_ops, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_fixed_rate($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static Ptr<runtime.clk> clk_register_fixed_rate(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, @Unsigned long fixed_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister_composite(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister_fixed_rate(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clk_bulk_get(Ptr<runtime.device> dev, int num_clks, Ptr<clk_bulk_data> clks, boolean optional) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_hw_register_fixed_factor($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct clk_hw*)$arg5, (const struct clk_parent_data*)$arg6, $arg7, $arg8, $arg9, $arg10, $arg11, $arg12)")
    public static Ptr<clk_hw> __clk_hw_register_fixed_factor(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String parent_name, Ptr<clk_hw> parent_hw, Ptr<clk_parent_data> pdata, @Unsigned long flags, @Unsigned int mult, @Unsigned int div, @Unsigned long acc, @Unsigned int fixflags, boolean devm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__clk_hw_register_mux($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8**)$arg5, (const struct clk_hw**)$arg6, (const struct clk_parent_data*)$arg7, $arg8, $arg9, $arg10, $arg11, $arg12, (const unsigned int*)$arg13, $arg14)")
    public static Ptr<clk_hw> __clk_hw_register_mux(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, char num_parents, Ptr<String> parent_names, Ptr<Ptr<clk_hw>> parent_hws, Ptr<clk_parent_data> parent_data, @Unsigned long flags, Ptr<?> reg, char shift, @Unsigned int mask, char clk_mux_flags, Ptr<@Unsigned Integer> table, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_bulk_disable($arg1, (const struct clk_bulk_data*)$arg2)")
    public static void clk_bulk_disable(int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_bulk_enable($arg1, (const struct clk_bulk_data*)$arg2)")
    public static int clk_bulk_enable(int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_bulk_get(Ptr<runtime.device> dev, int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_bulk_get_all(Ptr<runtime.device> dev, Ptr<Ptr<clk_bulk_data>> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_bulk_get_optional(Ptr<runtime.device> dev, int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_bulk_prepare($arg1, (const struct clk_bulk_data*)$arg2)")
    public static int clk_bulk_prepare(int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_bulk_put(int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_bulk_put_all(int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_bulk_unprepare($arg1, (const struct clk_bulk_data*)$arg2)")
    public static void clk_bulk_unprepare(int num_clks, Ptr<clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_factor_recalc_accuracy(Ptr<clk_hw> hw, @Unsigned long parent_accuracy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_factor_recalc_rate(Ptr<clk_hw> hw, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_factor_round_rate(Ptr<clk_hw> hw, @Unsigned long rate, Ptr<@Unsigned Long> prate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_factor_set_rate(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_gpio_gate_disable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_gpio_gate_enable(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_gpio_gate_is_enabled(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_fixed_factor($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<clk_hw> clk_hw_register_fixed_factor(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_fixed_factor_fwname($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, $arg6, $arg7)")
    public static Ptr<clk_hw> clk_hw_register_fixed_factor_fwname(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String fw_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_fixed_factor_parent_hw($arg1, (const u8*)$arg2, (const struct clk_hw*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<clk_hw> clk_hw_register_fixed_factor_parent_hw(Ptr<runtime.device> dev, String name, Ptr<clk_hw> parent_hw, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_hw_register_fixed_factor_with_accuracy_fwname($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<clk_hw> clk_hw_register_fixed_factor_with_accuracy_fwname(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String fw_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div, @Unsigned long acc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_fixed_factor(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_hw_unregister_mux(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clk_multiplier_recalc_rate(Ptr<clk_hw> hw, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long clk_multiplier_round_rate(Ptr<clk_hw> hw, @Unsigned long rate, Ptr<@Unsigned Long> parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_multiplier_set_rate(Ptr<clk_hw> hw, @Unsigned long rate, @Unsigned long parent_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_mux_determine_rate(Ptr<clk_hw> hw, Ptr<clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char clk_mux_get_parent(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_mux_index_to_val((const unsigned int*)$arg1, $arg2, $arg3)")
    public static @Unsigned int clk_mux_index_to_val(Ptr<@Unsigned Integer> table, @Unsigned int flags, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_mux_set_parent(Ptr<clk_hw> hw, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_mux_val_to_index($arg1, (const unsigned int*)$arg2, $arg3, $arg4)")
    public static int clk_mux_val_to_index(Ptr<clk_hw> hw, Ptr<@Unsigned Integer> table, @Unsigned int flags, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_fixed_factor($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.clk> clk_register_fixed_factor(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clk_register_mux_table($arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, (const unsigned int*)$arg10, $arg11)")
    public static Ptr<runtime.clk> clk_register_mux_table(Ptr<runtime.device> dev, String name, Ptr<String> parent_names, char num_parents, @Unsigned long flags, Ptr<?> reg, char shift, @Unsigned int mask, char clk_mux_flags, Ptr<@Unsigned Integer> table, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_sleeping_gpio_gate_is_prepared(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clk_sleeping_gpio_gate_prepare(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_sleeping_gpio_gate_unprepare(Ptr<clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister_fixed_factor(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clk_unregister_mux(Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct clk_composite")
    @NotUsableInJava
    public static class clk_composite
    extends Struct {
        public clk_hw hw;
        public clk_ops ops;
        public Ptr<clk_hw> mux_hw;
        public Ptr<clk_hw> rate_hw;
        public Ptr<clk_hw> gate_hw;
        public Ptr<clk_ops> mux_ops;
        public Ptr<clk_ops> rate_ops;
        public Ptr<clk_ops> gate_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_fixed_rate")
    @NotUsableInJava
    public static class clk_fixed_rate
    extends Struct {
        public clk_hw hw;
        public @Unsigned long fixed_rate;
        public @Unsigned long fixed_accuracy;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_lookup_alloc")
    @NotUsableInJava
    public static class clk_lookup_alloc
    extends Struct {
        public clk_lookup cl;
        public char @Size(value=24) [] dev_id;
        public char @Size(value=16) [] con_id;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_notifier_devres")
    @NotUsableInJava
    public static class clk_notifier_devres
    extends Struct {
        public Ptr<runtime.clk> clk;
        public Ptr<misc.notifier_block> nb;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_parent_map")
    @NotUsableInJava
    public static class clk_parent_map
    extends Struct {
        public Ptr<clk_hw> hw;
        public Ptr<clk_core> core;
        public String fw_name;
        public String name;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_core")
    @NotUsableInJava
    public static class clk_core
    extends Struct {
        public String name;
        public Ptr<clk_ops> ops;
        public Ptr<clk_hw> hw;
        public Ptr<runtime.module> owner;
        public Ptr<runtime.device> dev;
        public misc.hlist_node rpm_node;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<clk_core> parent;
        public Ptr<clk_parent_map> parents;
        public char num_parents;
        public char new_parent_index;
        public @Unsigned long rate;
        public @Unsigned long req_rate;
        public @Unsigned long new_rate;
        public Ptr<clk_core> new_parent;
        public Ptr<clk_core> new_child;
        public @Unsigned long flags;
        public boolean orphan;
        public boolean rpm_enabled;
        public @Unsigned int enable_count;
        public @Unsigned int prepare_count;
        public @Unsigned int protect_count;
        public @Unsigned long min_rate;
        public @Unsigned long max_rate;
        public @Unsigned long accuracy;
        public int phase;
        public clk_duty duty;
        public misc.hlist_head children;
        public misc.hlist_node child_node;
        public misc.hlist_head clks;
        public @Unsigned int notifier_count;
        public Ptr<runtime.dentry> dentry;
        public misc.hlist_node debug_node;
        public runtime.kref ref;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_notifier_data")
    @NotUsableInJava
    public static class clk_notifier_data
    extends Struct {
        public Ptr<runtime.clk> clk;
        public @Unsigned long old_rate;
        public @Unsigned long new_rate;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_notifier")
    @NotUsableInJava
    public static class clk_notifier
    extends Struct {
        public Ptr<runtime.clk> clk;
        public SrcuDefinitions.srcu_notifier_head notifier_head;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_fractional_divider")
    @NotUsableInJava
    public static class clk_fractional_divider
    extends Struct {
        public clk_hw hw;
        public Ptr<?> reg;
        public char mshift;
        public char mwidth;
        public char nshift;
        public char nwidth;
        public char flags;
        public Ptr<?> approximation;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_gate")
    @NotUsableInJava
    public static class clk_gate
    extends Struct {
        public clk_hw hw;
        public Ptr<?> reg;
        public char bit_idx;
        public char flags;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_divider")
    @NotUsableInJava
    public static class clk_divider
    extends Struct {
        public clk_hw hw;
        public Ptr<?> reg;
        public char shift;
        public char width;
        public char flags;
        public Ptr<clk_div_table> table;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_div_table")
    @NotUsableInJava
    public static class clk_div_table
    extends Struct {
        public @Unsigned int val;
        public @Unsigned int div;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_bulk_devres")
    @NotUsableInJava
    public static class clk_bulk_devres
    extends Struct {
        public Ptr<clk_bulk_data> clks;
        public int num_clks;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_plt_data")
    @NotUsableInJava
    public static class clk_plt_data
    extends Struct {
        public Ptr<Ptr<clk_plt_fixed>> parents;
        public char nparents;
        public Ptr<clk_plt> @Size(value=6) [] clks;
        public Ptr<clk_lookup> mclk_lookup;
        public Ptr<clk_lookup> ether_clk_lookup;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_plt")
    @NotUsableInJava
    public static class clk_plt
    extends Struct {
        public clk_hw hw;
        public Ptr<?> reg;
        public Ptr<clk_lookup> lookup;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_plt_fixed")
    @NotUsableInJava
    public static class clk_plt_fixed
    extends Struct {
        public Ptr<clk_hw> clk;
        public Ptr<clk_lookup> lookup;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_lookup")
    @NotUsableInJava
    public static class clk_lookup
    extends Struct {
        public ListDefinitions.list_head node;
        public String dev_id;
        public String con_id;
        public Ptr<runtime.clk> clk;
        public Ptr<clk_hw> clk_hw;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_gpio")
    @NotUsableInJava
    public static class clk_gpio
    extends Struct {
        public clk_hw hw;
        public Ptr<GpioDefinitions.gpio_desc> gpiod;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_mux")
    @NotUsableInJava
    public static class clk_mux
    extends Struct {
        public clk_hw hw;
        public Ptr<?> reg;
        public Ptr<@Unsigned Integer> table;
        public @Unsigned int mask;
        public char shift;
        public char flags;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_multiplier")
    @NotUsableInJava
    public static class clk_multiplier
    extends Struct {
        public clk_hw hw;
        public Ptr<?> reg;
        public char shift;
        public char width;
        public char flags;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_fixed_factor")
    @NotUsableInJava
    public static class clk_fixed_factor
    extends Struct {
        public clk_hw hw;
        public @Unsigned int mult;
        public @Unsigned int div;
        public @Unsigned long acc;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_init_data")
    @NotUsableInJava
    public static class clk_init_data
    extends Struct {
        public String name;
        public Ptr<clk_ops> ops;
        public Ptr<String> parent_names;
        public Ptr<clk_parent_data> parent_data;
        public Ptr<Ptr<clk_hw>> parent_hws;
        public char num_parents;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_parent_data")
    @NotUsableInJava
    public static class clk_parent_data
    extends Struct {
        public Ptr<clk_hw> hw;
        public String fw_name;
        public String name;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_ops")
    @NotUsableInJava
    public static class clk_ops
    extends Struct {
        public Ptr<?> prepare;
        public Ptr<?> unprepare;
        public Ptr<?> is_prepared;
        public Ptr<?> unprepare_unused;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> is_enabled;
        public Ptr<?> disable_unused;
        public Ptr<?> save_context;
        public Ptr<?> restore_context;
        public Ptr<?> recalc_rate;
        public Ptr<?> round_rate;
        public Ptr<?> determine_rate;
        public Ptr<?> set_parent;
        public Ptr<?> get_parent;
        public Ptr<?> set_rate;
        public Ptr<?> set_rate_and_parent;
        public Ptr<?> recalc_accuracy;
        public Ptr<?> get_phase;
        public Ptr<?> set_phase;
        public Ptr<?> get_duty_cycle;
        public Ptr<?> set_duty_cycle;
        public Ptr<?> init;
        public Ptr<?> terminate;
        public Ptr<?> debug_init;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_duty")
    @NotUsableInJava
    public static class clk_duty
    extends Struct {
        public @Unsigned int num;
        public @Unsigned int den;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_hw")
    @NotUsableInJava
    public static class clk_hw
    extends Struct {
        public Ptr<clk_core> core;
        public Ptr<runtime.clk> clk;
        public Ptr<clk_init_data> init;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_rate_request")
    @NotUsableInJava
    public static class clk_rate_request
    extends Struct {
        public Ptr<clk_core> core;
        public @Unsigned long rate;
        public @Unsigned long min_rate;
        public @Unsigned long max_rate;
        public @Unsigned long best_parent_rate;
        public Ptr<clk_hw> best_parent_hw;
    }

    @Type(noCCodeGeneration=true, cType="struct clk_bulk_data")
    @NotUsableInJava
    public static class clk_bulk_data
    extends Struct {
        public String id;
        public Ptr<runtime.clk> clk;
    }
}

