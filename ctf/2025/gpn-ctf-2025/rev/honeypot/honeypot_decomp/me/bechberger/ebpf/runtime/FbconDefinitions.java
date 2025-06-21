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
import me.bechberger.ebpf.runtime.ConDefinitions;
import me.bechberger.ebpf.runtime.ConsoleDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FbconDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fbcon_clear(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int sy, @Unsigned int sx, @Unsigned int height, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fbcon_blank(Ptr<VcDefinitions.vc_data> vc2, misc.vesa_blank_mode blank2, boolean mode_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_clear(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int sy, @Unsigned int sx, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_clear_margins(Ptr<VcDefinitions.vc_data> vc2, int bottom_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_cursor(Ptr<VcDefinitions.vc_data> vc2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_debug_enter(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_debug_leave(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_deinit(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fbcon_do_set_font($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int fbcon_do_set_font(Ptr<VcDefinitions.vc_data> vc2, int w, int h, int charcount, Ptr<Character> data, int userfont) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_fb_blanked(Ptr<FbDefinitions.fb_info> info2, int blank2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_fb_registered(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_fb_unbind(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_fb_unregistered(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_get_con2fb_map_ioctl(Ptr<?> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_get_font(Ptr<VcDefinitions.vc_data> vc2, Ptr<ConsoleDefinitions.console_font> font, @Unsigned int vpitch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_get_requirement(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_blit_caps> caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_init(Ptr<VcDefinitions.vc_data> vc2, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_invert_region(Ptr<VcDefinitions.vc_data> vc2, Ptr<@Unsigned Short> p, int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_mode_deleted(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_videomode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_modechange_possible(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_var_screeninfo> var) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_modechanged(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_new_modelist(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_open(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_output_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_prepare_logo(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, int cols, int rows, int new_cols, int new_rows) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fbcon_putcs($arg1, (const short unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static void fbcon_putcs(Ptr<VcDefinitions.vc_data> vc2, Ptr<@Unsigned Short> s2, @Unsigned int count, @Unsigned int ypos, @Unsigned int xpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_redraw(Ptr<VcDefinitions.vc_data> vc2, int line2, int count, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_register_existing_fbs(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_release(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_remap_all(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_resize(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int width, @Unsigned int height, boolean from_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_resumed(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_rotate_font(Ptr<FbDefinitions.fb_info> info2, Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fbcon_scroll(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int t, @Unsigned int b, ConDefinitions.con_scroll dir, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_set_all_vcs(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fbcon_set_con2fb_map_ioctl(Ptr<?> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fbcon_set_def_font($arg1, $arg2, (const u8*)$arg3)")
    public static int fbcon_set_def_font(Ptr<VcDefinitions.vc_data> vc2, Ptr<ConsoleDefinitions.console_font> font, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_set_disp(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_var_screeninfo> var, int unit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fbcon_set_font($arg1, (const struct console_font*)$arg2, $arg3, $arg4)")
    public static int fbcon_set_font(Ptr<VcDefinitions.vc_data> vc2, Ptr<ConsoleDefinitions.console_font> font, @Unsigned int vpitch, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fbcon_set_palette($arg1, (const u8*)$arg2)")
    public static void fbcon_set_palette(Ptr<VcDefinitions.vc_data> vc2, String table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_set_rotate(Ptr<fbcon_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fbcon_startup())")
    public static String fbcon_startup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_suspended(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fbcon_switch(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_update_vcs(Ptr<FbDefinitions.fb_info> info2, boolean all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_rotate_cw(Ptr<fbcon_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_set_tileops(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_rotate_ud(Ptr<fbcon_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_rotate_ccw(Ptr<fbcon_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fbcon_set_bitops(Ptr<fbcon_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fbcon_ops")
    @NotUsableInJava
    public static class fbcon_ops
    extends Struct {
        public Ptr<?> bmove;
        public Ptr<?> clear;
        public Ptr<?> putcs;
        public Ptr<?> clear_margins;
        public Ptr<?> cursor;
        public Ptr<?> update_start;
        public Ptr<?> rotate_font;
        public FbDefinitions.fb_var_screeninfo var;
        public DelayedDefinitions.delayed_work cursor_work;
        public FbDefinitions.fb_cursor cursor_state;
        public Ptr<fbcon_display> p;
        public Ptr<FbDefinitions.fb_info> info;
        public int currcon;
        public int cur_blink_jiffies;
        public int cursor_flash;
        public int cursor_reset;
        public int blank_state;
        public int graphics;
        public int save_graphics;
        public boolean initialized;
        public int rotate;
        public int cur_rotate;
        public String cursor_data;
        public Ptr<Character> fontbuffer;
        public Ptr<Character> fontdata;
        public Ptr<Character> cursor_src;
        public @Unsigned int cursor_size;
        public @Unsigned int fd_size;
    }

    @Type(noCCodeGeneration=true, cType="struct fbcon_display")
    @NotUsableInJava
    public static class fbcon_display
    extends Struct {
        public Ptr<@OriginalName(value="u_char") Character> fontdata;
        public int userfont;
        public @Unsigned @OriginalName(value="u_short") short inverse;
        public short yscroll;
        public int vrows;
        public int cursor_shape;
        public int con_rotate;
        public @Unsigned int xres_virtual;
        public @Unsigned int yres_virtual;
        public @Unsigned int height;
        public @Unsigned int width;
        public @Unsigned int bits_per_pixel;
        public @Unsigned int grayscale;
        public @Unsigned int nonstd;
        public @Unsigned int accel_flags;
        public @Unsigned int rotate;
        public FbDefinitions.fb_bitfield red;
        public FbDefinitions.fb_bitfield green;
        public FbDefinitions.fb_bitfield blue;
        public FbDefinitions.fb_bitfield transp;
        public Ptr<FbDefinitions.fb_videomode> mode;
    }
}

