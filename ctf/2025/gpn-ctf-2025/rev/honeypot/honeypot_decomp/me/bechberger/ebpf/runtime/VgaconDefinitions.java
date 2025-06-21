/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ConDefinitions;
import me.bechberger.ebpf.runtime.ConsoleDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class VgaconDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vgacon_adjust_height(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int fontheight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vgacon_blank(Ptr<VcDefinitions.vc_data> c, misc.vesa_blank_mode blank2, boolean mode_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char vgacon_build_attr(Ptr<VcDefinitions.vc_data> c, char color, VcDefinitions.vc_intensity intensity, boolean blink, boolean underline, boolean reverse, boolean italic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_clear(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int sy, @Unsigned int sx, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_cursor(Ptr<VcDefinitions.vc_data> c, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_deinit(Ptr<VcDefinitions.vc_data> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_doresize(Ptr<VcDefinitions.vc_data> c, @Unsigned int width, @Unsigned int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vgacon_font_get(Ptr<VcDefinitions.vc_data> c, Ptr<ConsoleDefinitions.console_font> font, @Unsigned int vpitch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vgacon_font_set($arg1, (const struct console_font*)$arg2, $arg3, $arg4)")
    public static int vgacon_font_set(Ptr<VcDefinitions.vc_data> c, Ptr<ConsoleDefinitions.console_font> font, @Unsigned int vpitch, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_init(Ptr<VcDefinitions.vc_data> c, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_invert_region(Ptr<VcDefinitions.vc_data> c, Ptr<@Unsigned Short> p, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vgacon_putcs($arg1, (const short unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static void vgacon_putcs(Ptr<VcDefinitions.vc_data> vc2, Ptr<@Unsigned Short> s2, @Unsigned int count, @Unsigned int ypos, @Unsigned int xpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_register_screen(Ptr<misc.screen_info> si) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vgacon_resize(Ptr<VcDefinitions.vc_data> c, @Unsigned int width, @Unsigned int height, boolean from_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_save_screen(Ptr<VcDefinitions.vc_data> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vgacon_scroll(Ptr<VcDefinitions.vc_data> c, @Unsigned int t, @Unsigned int b, ConDefinitions.con_scroll dir, @Unsigned int lines) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_scrolldelta(Ptr<VcDefinitions.vc_data> c, int lines) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vgacon_set_cursor_size(int from, int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vgacon_set_origin(Ptr<VcDefinitions.vc_data> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vgacon_set_palette($arg1, (const u8*)$arg2)")
    public static void vgacon_set_palette(Ptr<VcDefinitions.vc_data> vc2, String table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vgacon_startup())")
    public static String vgacon_startup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vgacon_switch(Ptr<VcDefinitions.vc_data> c) {
        throw new MethodIsBPFRelatedFunction();
    }
}

