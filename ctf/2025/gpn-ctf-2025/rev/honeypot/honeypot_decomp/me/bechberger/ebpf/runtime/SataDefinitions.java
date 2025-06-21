/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class SataDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sata_set_spd_needed(Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> scontrol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_async_notification(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_down_spd_limit(Ptr<AtaDefinitions.ata_link> link2, @Unsigned int spd_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sata_link_debounce($arg1, (const unsigned int*)$arg2, $arg3)")
    public static int sata_link_debounce(Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> params, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sata_link_hardreset($arg1, (const unsigned int*)$arg2, $arg3, $arg4, (int (*)(struct ata_link*))$arg5)")
    public static int sata_link_hardreset(Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> timing, @Unsigned long deadline, Ptr<@OriginalName(value="bool") Boolean> online, Ptr<?> check_ready) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sata_link_resume($arg1, (const unsigned int*)$arg2, $arg3)")
    public static int sata_link_resume(Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> params, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_link_scr_lpm(Ptr<AtaDefinitions.ata_link> link2, AtaDefinitions.ata_lpm_policy policy, boolean spm_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sata_lpm_ignore_phy_events(Ptr<AtaDefinitions.ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_scr_read(Ptr<AtaDefinitions.ata_link> link2, int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_scr_valid(Ptr<AtaDefinitions.ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_scr_write(Ptr<AtaDefinitions.ata_link> link2, int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_scr_write_flush(Ptr<AtaDefinitions.ata_link> link2, int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_set_spd(Ptr<AtaDefinitions.ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_std_hardreset(Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_attach(Ptr<AtaDefinitions.ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_configure(Ptr<AtaDefinitions.ata_device> dev, int print_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sata_pmp_detach(Ptr<AtaDefinitions.ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_eh_recover(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_eh_recover_pmp(Ptr<AtaDefinitions.ata_port> ap, @OriginalName(value="ata_prereset_fn_t") Ptr<?> prereset, @OriginalName(value="ata_reset_fn_t") Ptr<?> softreset, @OriginalName(value="ata_reset_fn_t") Ptr<?> hardreset, @OriginalName(value="ata_postreset_fn_t") Ptr<?> postreset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sata_pmp_error_handler(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_handle_link_fail(Ptr<AtaDefinitions.ata_link> link2, Ptr<Integer> link_tries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_qc_defer_cmd_switch(Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sata_pmp_quirks(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sata_pmp_read(Ptr<AtaDefinitions.ata_link> link2, int reg, Ptr<@Unsigned Integer> r_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_read_gscr(Ptr<AtaDefinitions.ata_device> dev, Ptr<@Unsigned Integer> gscr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_revalidate(Ptr<AtaDefinitions.ata_device> dev, @Unsigned int new_class) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_scr_read(Ptr<AtaDefinitions.ata_link> link2, int reg, Ptr<@Unsigned Integer> r_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_scr_write(Ptr<AtaDefinitions.ata_link> link2, int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_pmp_set_lpm(Ptr<AtaDefinitions.ata_link> link2, AtaDefinitions.ata_lpm_policy policy, @Unsigned int hints) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sata_pmp_write(Ptr<AtaDefinitions.ata_link> link2, int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_link_init_spd(Ptr<AtaDefinitions.ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sata_print_link_status(Ptr<AtaDefinitions.ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)sata_spd_string($arg1))")
    public static String sata_spd_string(@Unsigned int spd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sata_sff_hardreset(Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }
}

