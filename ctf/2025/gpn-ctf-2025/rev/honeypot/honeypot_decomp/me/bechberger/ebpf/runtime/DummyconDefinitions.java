/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ConDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class DummyconDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dummycon_blank(Ptr<VcDefinitions.vc_data> vc2, misc.vesa_blank_mode blank2, boolean mode_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_clear(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int sy, @Unsigned int sx, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_cursor(Ptr<VcDefinitions.vc_data> vc2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_deinit(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_init(Ptr<VcDefinitions.vc_data> vc2, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_putc(Ptr<VcDefinitions.vc_data> vc2, @Unsigned short c, @Unsigned int y, @Unsigned int x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dummycon_putcs($arg1, (const short unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static void dummycon_putcs(Ptr<VcDefinitions.vc_data> vc2, Ptr<@Unsigned Short> s2, @Unsigned int count, @Unsigned int ypos, @Unsigned int xpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_register_output_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dummycon_scroll(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int top, @Unsigned int bottom, ConDefinitions.con_scroll dir, @Unsigned int lines) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dummycon_startup())")
    public static String dummycon_startup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dummycon_switch(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummycon_unregister_output_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }
}

