/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DbgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_release_bp_slot(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_reserve_bp_slot(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_activate_sw_breakpoints() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbg_cmd($arg1, (const u8*)$arg2, $arg3)")
    public static void dbg_cmd(Ptr<EhciDefinitions.ehci_hcd> ehci, String label, @Unsigned int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_deactivate_sw_breakpoints() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String dbg_get_reg(int regno, Ptr<?> mem, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbg_hcc_params(Ptr<EhciDefinitions.ehci_hcd> ehci, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbg_hcs_params(Ptr<EhciDefinitions.ehci_hcd> ehci, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_io_get_char() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbg_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_notify_reboot(Ptr<misc.notifier_block> _this, @Unsigned long code2, Ptr<?> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbg_pnp_show_option(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<PnpDefinitions.pnp_option> option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbg_pnp_show_resources(Ptr<PnpDefinitions.pnp_dev> dev, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_remove_all_break() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_remove_sw_break(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_set_reg(int regno, Ptr<?> mem, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbg_set_sw_break(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbg_status($arg1, (const u8*)$arg2, $arg3)")
    public static void dbg_status(Ptr<EhciDefinitions.ehci_hcd> ehci, String label, @Unsigned int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbg_touch_watchdogs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dbg_reg_def_t")
    @NotUsableInJava
    public static class dbg_reg_def_t
    extends Struct {
        public String name;
        public int size;
        public int offset;
    }
}

