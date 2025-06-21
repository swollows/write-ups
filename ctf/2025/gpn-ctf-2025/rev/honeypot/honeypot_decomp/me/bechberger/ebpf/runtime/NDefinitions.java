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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_null_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int n_null_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_null_read(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2, Ptr<Character> buf, @Unsigned long nr, Ptr<Ptr<?>> cookie, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_null_write($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long n_null_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2, Ptr<Character> buf, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_check_unthrottle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_close(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_flush_buffer(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_inherit_ops(Ptr<TtyDefinitions.tty_ldisc_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int n_tty_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_kick_worker((const struct tty_struct*)$arg1)")
    public static void n_tty_kick_worker(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_lookahead_flow_ctrl($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void n_tty_lookahead_flow_ctrl(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int n_tty_open(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_packet_mode_flush(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int n_tty_poll(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int n_tty_process_echo_ops(Ptr<TtyDefinitions.tty_struct> tty, Ptr<@Unsigned Long> tail, int space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_tty_read(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2, Ptr<Character> kbuf, @Unsigned long nr, Ptr<Ptr<?>> cookie, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_receive_buf($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void n_tty_receive_buf(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_receive_buf2($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned long n_tty_receive_buf2(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_receive_buf_closing($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void n_tty_receive_buf_closing(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count, boolean lookahead_done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_receive_buf_common($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @Unsigned long n_tty_receive_buf_common(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count, boolean flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_receive_buf_standard($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void n_tty_receive_buf_standard(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count, boolean lookahead_done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_receive_char(Ptr<TtyDefinitions.tty_struct> tty, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean n_tty_receive_char_canon(Ptr<TtyDefinitions.tty_struct> tty, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_receive_char_flagged(Ptr<TtyDefinitions.tty_struct> tty, char c, char flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_receive_char_special(Ptr<TtyDefinitions.tty_struct> tty, char c, boolean lookahead_done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_receive_handle_newline(Ptr<TtyDefinitions.tty_struct> tty, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_receive_signal_char(Ptr<TtyDefinitions.tty_struct> tty, int signal, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_set_termios($arg1, (const struct ktermios*)$arg2)")
    public static void n_tty_set_termios(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.ktermios> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_tty_write($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long n_tty_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2, Ptr<Character> buf, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void n_tty_write_wakeup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_alarm_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_ext_ts_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_per_out_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_pins_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int n_tty_ioctl_helper(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long n_vclocks_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="n_vclocks_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long n_vclocks_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct n_tty_data")
    @NotUsableInJava
    public static class n_tty_data
    extends Struct {
        public @Unsigned long read_head;
        public @Unsigned long commit_head;
        public @Unsigned long canon_head;
        public @Unsigned long echo_head;
        public @Unsigned long echo_commit;
        public @Unsigned long echo_mark;
        public @Unsigned long @Size(value=4) [] char_map;
        public @Unsigned long overrun_time;
        public @Unsigned int num_overrun;
        public boolean no_room;
        public char lnext;
        public char erasing;
        public char raw;
        public char real_raw;
        public char icanon;
        public char push;
        public char @Size(value=4096) [] read_buf;
        public @Unsigned long @Size(value=64) [] read_flags;
        public char @Size(value=4096) [] echo_buf;
        public @Unsigned long read_tail;
        public @Unsigned long line_start;
        public @Unsigned long lookahead_count;
        public @Unsigned int column;
        public @Unsigned int canon_column;
        public @Unsigned long echo_tail;
        public runtime.mutex atomic_read_lock;
        public runtime.mutex output_lock;
    }
}

