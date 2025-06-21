/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class ImsttfbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_blank(int blank2, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_check_var(Ptr<FbDefinitions.fb_var_screeninfo> var, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="imsttfb_copyarea($arg1, (const struct fb_copyarea*)$arg2)")
    public static void imsttfb_copyarea(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_copyarea> area) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void imsttfb_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="imsttfb_fillrect($arg1, (const struct fb_fillrect*)$arg2)")
    public static void imsttfb_fillrect(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_fillrect> rect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_ioctl(Ptr<FbDefinitions.fb_info> info2, @Unsigned @OriginalName(value="u_int") int cmd, @Unsigned @OriginalName(value="u_long") long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_pan_display(Ptr<FbDefinitions.fb_var_screeninfo> var, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="imsttfb_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int imsttfb_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void imsttfb_remove(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_set_par(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int imsttfb_setcolreg(@Unsigned @OriginalName(value="u_int") int regno, @Unsigned @OriginalName(value="u_int") int red, @Unsigned @OriginalName(value="u_int") int green, @Unsigned @OriginalName(value="u_int") int blue, @Unsigned @OriginalName(value="u_int") int transp, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

