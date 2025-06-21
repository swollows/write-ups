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
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CmosDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_aie_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_alarm_irq_enable(Ptr<runtime.device> dev, @Unsigned int enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_check_wkalrm(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_checkintr(Ptr<cmos_rtc> cmos, char rtc_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_do_probe(Ptr<runtime.device> dev, Ptr<runtime.resource> ports, int rtc_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_do_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="irqreturn_t") runtime.irqreturn cmos_interrupt(int irq, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_irq_disable(Ptr<cmos_rtc> cmos, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_irq_enable(Ptr<cmos_rtc> cmos, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_nvram_read(Ptr<?> priv, @Unsigned int off, Ptr<?> val, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_nvram_write(Ptr<?> priv, @Unsigned int off, Ptr<?> val, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_platform_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_platform_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_platform_shutdown(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmos_pnp_probe($arg1, (const struct pnp_device_id*)$arg2)")
    public static int cmos_pnp_probe(Ptr<PnpDefinitions.pnp_dev> pnp, Ptr<PnpDefinitions.pnp_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_pnp_remove(Ptr<PnpDefinitions.pnp_dev> pnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_pnp_shutdown(Ptr<PnpDefinitions.pnp_dev> pnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_procfs(Ptr<runtime.device> dev, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_read_alarm(Ptr<runtime.device> dev, Ptr<RtcDefinitions.rtc_wkalrm> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_read_alarm_callback(char seconds, Ptr<?> param_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_read_time(Ptr<runtime.device> dev, Ptr<RtcDefinitions.rtc_time> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_set_alarm(Ptr<runtime.device> dev, Ptr<RtcDefinitions.rtc_wkalrm> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmos_set_alarm_callback(char seconds, Ptr<?> param_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_set_time(Ptr<runtime.device> dev, Ptr<RtcDefinitions.rtc_time> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmos_validate_alarm(Ptr<runtime.device> dev, Ptr<RtcDefinitions.rtc_wkalrm> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cmos_set_alarm_callback_param")
    @NotUsableInJava
    public static class cmos_set_alarm_callback_param
    extends Struct {
        public Ptr<cmos_rtc> cmos;
        public char mon;
        public char mday;
        public char hrs;
        public char min;
        public char sec;
        public Ptr<RtcDefinitions.rtc_wkalrm> t;
    }

    @Type(noCCodeGeneration=true, cType="struct cmos_read_alarm_callback_param")
    @NotUsableInJava
    public static class cmos_read_alarm_callback_param
    extends Struct {
        public Ptr<cmos_rtc> cmos;
        public Ptr<RtcDefinitions.rtc_time> time;
        public char rtc_control;
    }

    @Type(noCCodeGeneration=true, cType="struct cmos_rtc")
    @NotUsableInJava
    public static class cmos_rtc
    extends Struct {
        public Ptr<RtcDefinitions.rtc_device> rtc;
        public Ptr<runtime.device> dev;
        public int irq;
        public Ptr<runtime.resource> iomem;
        public @OriginalName(value="time64_t") long alarm_expires;
        public Ptr<?> wake_on;
        public Ptr<?> wake_off;
        public char enabled_wake;
        public char suspend_ctrl;
        public char day_alrm;
        public char mon_alrm;
        public char century;
        public RtcDefinitions.rtc_wkalrm saved_wkalrm;
    }

    @Type(noCCodeGeneration=true, cType="struct cmos_rtc_board_info")
    @NotUsableInJava
    public static class cmos_rtc_board_info
    extends Struct {
        public Ptr<?> wake_on;
        public Ptr<?> wake_off;
        public @Unsigned int flags;
        public int address_space;
        public char rtc_day_alarm;
        public char rtc_mon_alarm;
        public char rtc_century;
    }
}

