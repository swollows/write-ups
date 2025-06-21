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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PwmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_lpss_driver_platform_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_lpss_driver_platform_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_lpss_probe_platform(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_lpss_driver_pci_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_lpss_driver_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_lpss_probe_pci($arg1, (const struct pci_device_id*)$arg2)")
    public static int pwm_lpss_probe_pci(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_lpss_remove_pci(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pwm_apply($arg1, (const struct pwm_state*)$arg2)")
    public static int __pwm_apply(Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_add_table(Ptr<pwm_lookup> table, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_adjust_config(Ptr<pwm_device> pwm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_apply_atomic($arg1, (const struct pwm_state*)$arg2)")
    public static int pwm_apply_atomic(Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_apply_might_sleep($arg1, (const struct pwm_state*)$arg2)")
    public static int pwm_apply_might_sleep(Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pwm_export> pwm_class_get_state(Ptr<runtime.device> pwmchip_dev, Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_class_resume(Ptr<runtime.device> pwmchip_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_class_resume_npwm(Ptr<runtime.device> pwmchip_dev, @Unsigned int npwm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_class_suspend(Ptr<runtime.device> pwmchip_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_device_request($arg1, (const u8*)$arg2)")
    public static int pwm_device_request(Ptr<pwm_device> pwm, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_export_child(Ptr<runtime.device> pwmchip_dev, Ptr<pwm_device> pwm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_export_release(Ptr<runtime.device> pwm_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_get($arg1, (const u8*)$arg2)")
    public static Ptr<pwm_device> pwm_get(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_put(Ptr<pwm_device> pwm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_remove_table(Ptr<pwm_lookup> table, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pwm_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pwm_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pwm_seq_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_unexport_child(Ptr<runtime.device> pwmchip_dev, Ptr<pwm_device> pwm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_unexport_match(Ptr<runtime.device> pwm_dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_lpss_apply($arg1, $arg2, (const struct pwm_state*)$arg3)")
    public static int pwm_lpss_apply(Ptr<pwm_chip> chip, Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pwm_lpss_get_state(Ptr<pwm_chip> chip, Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pwm_lpss_prepare_enable($arg1, $arg2, (const struct pwm_state*)$arg3)")
    public static int pwm_lpss_prepare_enable(Ptr<pwm_lpss_chip> lpwm, Ptr<pwm_device> pwm, Ptr<pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_export")
    @NotUsableInJava
    public static class pwm_export
    extends Struct {
        public runtime.device pwm_dev;
        public Ptr<pwm_device> pwm;
        public runtime.mutex lock;
        public pwm_state suspend;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_lookup")
    @NotUsableInJava
    public static class pwm_lookup
    extends Struct {
        public ListDefinitions.list_head list;
        public String provider;
        public @Unsigned int index;
        public String dev_id;
        public String con_id;
        public @Unsigned int period;
        public pwm_polarity polarity;
        public String module;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_lpss_chip")
    @NotUsableInJava
    public static class pwm_lpss_chip
    extends Struct {
        public Ptr<?> regs;
        public Ptr<pwm_lpss_boardinfo> info;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_lpss_boardinfo")
    @NotUsableInJava
    public static class pwm_lpss_boardinfo
    extends Struct {
        public @Unsigned long clk_rate;
        public @Unsigned int npwm;
        public @Unsigned long base_unit_bits;
        public boolean bypass;
        public boolean other_devices_aml_touches_pwm_regs;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_ops")
    @NotUsableInJava
    public static class pwm_ops
    extends Struct {
        public Ptr<?> request;
        public Ptr<?> free;
        public Ptr<?> capture;
        public Ptr<?> apply;
        public Ptr<?> get_state;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_capture")
    @NotUsableInJava
    public static class pwm_capture
    extends Struct {
        public @Unsigned int period;
        public @Unsigned int duty_cycle;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_chip")
    @NotUsableInJava
    public static class pwm_chip
    extends Struct {
        public runtime.device dev;
        public Ptr<pwm_ops> ops;
        public Ptr<runtime.module> owner;
        public @Unsigned int id;
        public @Unsigned int npwm;
        public Ptr<?> of_xlate;
        public boolean atomic;
        public boolean uses_pwmchip_alloc;
        public pwm_device @Size(value=0) [] pwms;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_device")
    @NotUsableInJava
    public static class pwm_device
    extends Struct {
        public String label;
        public @Unsigned long flags;
        public @Unsigned int hwpwm;
        public Ptr<pwm_chip> chip;
        public pwm_args args;
        public pwm_state state;
        public pwm_state last;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_state")
    @NotUsableInJava
    public static class pwm_state
    extends Struct {
        public @Unsigned long period;
        public @Unsigned long duty_cycle;
        public pwm_polarity polarity;
        public boolean enabled;
        public boolean usage_power;
    }

    @Type(noCCodeGeneration=true, cType="struct pwm_args")
    @NotUsableInJava
    public static class pwm_args
    extends Struct {
        public @Unsigned long period;
        public pwm_polarity polarity;
    }

    @Type(noCCodeGeneration=true, cType="enum pwm_polarity")
    public static enum pwm_polarity implements Enum<pwm_polarity>,
    TypedEnum<pwm_polarity, Integer>
    {
        PWM_POLARITY_NORMAL,
        PWM_POLARITY_INVERSED;

    }
}

