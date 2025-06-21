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
import me.bechberger.ebpf.runtime.ConsoleDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ConDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_allocate_new(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_clear_unimap(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_copy_unimap(Ptr<VcDefinitions.vc_data> dst_vc, Ptr<VcDefinitions.vc_data> src_vc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_free_unimap(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_get_trans_new(Ptr<@Unsigned @OriginalName(value="ushort") Short> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_get_trans_old(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_get_unimap(Ptr<VcDefinitions.vc_data> vc2, @Unsigned @OriginalName(value="ushort") short ct, Ptr<@Unsigned @OriginalName(value="ushort") Short> uct, Ptr<unipair> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_insert_unipair(Ptr<misc.uni_pagedict> p, @Unsigned @OriginalName(value="u_short") short unicode, @Unsigned @OriginalName(value="u_short") short fontpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_release_unimap(Ptr<misc.uni_pagedict> dict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_set_default_unimap(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_set_trans_new(Ptr<@Unsigned @OriginalName(value="ushort") Short> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_set_trans_old(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_set_unimap(Ptr<VcDefinitions.vc_data> vc2, @Unsigned @OriginalName(value="ushort") short ct, Ptr<unipair> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_unify_unimap(Ptr<VcDefinitions.vc_data> conp, Ptr<misc.uni_pagedict> dict1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_cleanup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_close(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_debug_enter(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_debug_leave() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_driver_unregister_callback(Ptr<misc.work_struct> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_flush_chars(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_font_get(Ptr<VcDefinitions.vc_data> vc2, Ptr<ConsoleDefinitions.console_font_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_font_op(Ptr<VcDefinitions.vc_data> vc2, Ptr<ConsoleDefinitions.console_font_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_get_cmap(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="con_is_bound((const struct consw*)$arg1)")
    public static int con_is_bound(Ptr<runtime.consw> csw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="con_is_visible((const struct vc_data*)$arg1)")
    public static boolean con_is_visible(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_ldisc_ok(Ptr<TtyDefinitions.tty_struct> tty, int ldisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_open(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_put_char(Ptr<TtyDefinitions.tty_struct> tty, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_putc(Ptr<VcDefinitions.vc_data> vc2, @Unsigned short ca, @Unsigned int y, @Unsigned int x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int con_set_cmap(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_shutdown(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_start(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_stop(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_throttle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void con_unthrottle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="con_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long con_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int con_write_room(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct unipair")
    @NotUsableInJava
    public static class unipair
    extends Struct {
        public @Unsigned short unicode;
        public @Unsigned short fontpos;
    }

    @Type(noCCodeGeneration=true, cType="struct con_driver")
    @NotUsableInJava
    public static class con_driver
    extends Struct {
        public Ptr<runtime.consw> con;
        public String desc;
        public Ptr<runtime.device> dev;
        public int node;
        public int first;
        public int last;
        public int flag;
    }

    @Type(noCCodeGeneration=true, cType="enum con_msg_format_flags")
    public static enum con_msg_format_flags implements Enum<con_msg_format_flags>,
    TypedEnum<con_msg_format_flags, Integer>
    {
        MSG_FORMAT_DEFAULT,
        MSG_FORMAT_SYSLOG;

    }

    @Type(noCCodeGeneration=true, cType="enum con_flush_mode")
    public static enum con_flush_mode implements Enum<con_flush_mode>,
    TypedEnum<con_flush_mode, Integer>
    {
        CONSOLE_FLUSH_PENDING,
        CONSOLE_REPLAY_ALL;

    }

    @Type(noCCodeGeneration=true, cType="enum con_scroll")
    public static enum con_scroll implements Enum<con_scroll>,
    TypedEnum<con_scroll, Integer>
    {
        SM_UP,
        SM_DOWN;

    }
}

