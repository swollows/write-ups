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
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_driver> vt_console_device(Ptr<runtime.console> c, Ptr<Integer> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vt_console_print($arg1, (const u8*)$arg2, $arg3)")
    public static void vt_console_print(Ptr<runtime.console> co, String b, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_console_setup(Ptr<runtime.console> co, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_kmsg_redirect(int _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_resize(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.winsize> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_clr_kbd_mode_bit(@Unsigned int console2, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long vt_compat_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_disallocate_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_diacrit(@Unsigned int cmd, Ptr<?> udp, int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kbkeycode_ioctl(int cmd, Ptr<kbkeycode> user_kbkc, int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdgkb_ioctl(int cmd, Ptr<kbsentry> user_kdgkb, int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdgkbmeta(@Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdgkbmode(@Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdsk_ioctl(int cmd, Ptr<kbentry> user_kbe, int perm, @Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdskbmeta(@Unsigned int console2, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdskbmode(@Unsigned int console2, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_do_kdskled(@Unsigned int console2, int cmd, @Unsigned long arg2, int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_event_post(@Unsigned int event2, @Unsigned int old, @Unsigned int _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_event_wait_ioctl(Ptr<vt_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_get_kbd_mode_bit(@Unsigned int console2, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_get_leds(@Unsigned int console2, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_get_shift_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_io_ioctl(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int cmd, Ptr<?> up, boolean perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_k_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2, boolean perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_kbd_con_start(@Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_kbd_con_stop(@Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_kdskbent(char kbdmode, char idx, char map2, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String vt_kdskbsent(String kbs, char cur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_move_to_console(@Unsigned int vt, int alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_reset_keyboard(@Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_reset_unicode(@Unsigned int console2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_resizex(Ptr<VcDefinitions.vc_data> vc2, Ptr<vt_consize> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_set_kbd_mode_bit(@Unsigned int console2, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_set_led_state(@Unsigned int console2, int leds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vt_set_leds_compute_shiftstate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vt_waitactive(int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kbkeycode")
    @NotUsableInJava
    public static class kbkeycode
    extends Struct {
        public @Unsigned int scancode;
        public @Unsigned int keycode;
    }

    @Type(noCCodeGeneration=true, cType="struct kbentry")
    @NotUsableInJava
    public static class kbentry
    extends Struct {
        public char kb_table;
        public char kb_index;
        public @Unsigned short kb_value;
    }

    @Type(noCCodeGeneration=true, cType="struct kbsentry")
    @NotUsableInJava
    public static class kbsentry
    extends Struct {
        public char kb_func;
        public char @Size(value=512) [] kb_string;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_notifier_param")
    @NotUsableInJava
    public static class vt_notifier_param
    extends Struct {
        public Ptr<VcDefinitions.vc_data> vc;
        public @Unsigned int c;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_event_wait")
    @NotUsableInJava
    public static class vt_event_wait
    extends Struct {
        public ListDefinitions.list_head list;
        public vt_event event;
        public int done;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_spawn_console")
    @NotUsableInJava
    public static class vt_spawn_console
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<runtime.pid> pid;
        public int sig;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_setactivate")
    @NotUsableInJava
    public static class vt_setactivate
    extends Struct {
        public @Unsigned int console;
        public vt_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_event")
    @NotUsableInJava
    public static class vt_event
    extends Struct {
        public @Unsigned int event;
        public @Unsigned int oldev;
        public @Unsigned int newev;
        public @Unsigned int @Size(value=4) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_consize")
    @NotUsableInJava
    public static class vt_consize
    extends Struct {
        public @Unsigned short v_rows;
        public @Unsigned short v_cols;
        public @Unsigned short v_vlin;
        public @Unsigned short v_clin;
        public @Unsigned short v_vcol;
        public @Unsigned short v_ccol;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_sizes")
    @NotUsableInJava
    public static class vt_sizes
    extends Struct {
        public @Unsigned short v_rows;
        public @Unsigned short v_cols;
        public @Unsigned short v_scrollsize;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_stat")
    @NotUsableInJava
    public static class vt_stat
    extends Struct {
        public @Unsigned short v_active;
        public @Unsigned short v_signal;
        public @Unsigned short v_state;
    }

    @Type(noCCodeGeneration=true, cType="struct vt_mode")
    @NotUsableInJava
    public static class vt_mode
    extends Struct {
        public char mode;
        public char waitv;
        public short relsig;
        public short acqsig;
        public short frsig;
    }
}

