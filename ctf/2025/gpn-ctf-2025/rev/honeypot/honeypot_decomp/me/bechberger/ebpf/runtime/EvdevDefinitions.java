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
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EvdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __evdev_queue_syn_dropped(Ptr<evdev_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evdev_cleanup(Ptr<evdev> evdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evdev_connect($arg1, $arg2, (const struct input_device_id*)$arg3)")
    public static int evdev_connect(Ptr<InputDefinitions.input_handler> handler, Ptr<InputDefinitions.input_dev> dev, Ptr<InputDefinitions.input_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evdev_disconnect(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long evdev_do_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, Ptr<?> p, int compat_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int evdev_events(Ptr<InputDefinitions.input_handle> handle, Ptr<InputDefinitions.input_value> vals, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evdev_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evdev_free(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_get_mask(Ptr<evdev_client> client, @Unsigned int type2, Ptr<?> codes, @Unsigned int codes_size, int compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_handle_get_keycode(Ptr<InputDefinitions.input_dev> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_handle_get_keycode_v2(Ptr<InputDefinitions.input_dev> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_handle_get_val(Ptr<evdev_client> client, Ptr<InputDefinitions.input_dev> dev, @Unsigned int type2, Ptr<@Unsigned Long> bits, @Unsigned int maxbit, @Unsigned int maxlen, Ptr<?> p, int compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_handle_set_keycode(Ptr<InputDefinitions.input_dev> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_handle_set_keycode_v2(Ptr<InputDefinitions.input_dev> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long evdev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long evdev_ioctl_compat(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evdev_pass_values($arg1, (const struct input_value*)$arg2, $arg3, $arg4)")
    public static void evdev_pass_values(Ptr<evdev_client> client, Ptr<InputDefinitions.input_value> vals, @Unsigned int count, Ptr<@OriginalName(value="ktime_t") Long> ev_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int evdev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long evdev_read(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evdev_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long evdev_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct evdev")
    @NotUsableInJava
    public static class evdev
    extends Struct {
        public int open;
        public InputDefinitions.input_handle handle;
        public Ptr<evdev_client> grab;
        public ListDefinitions.list_head client_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock client_lock;
        public runtime.mutex mutex;
        public runtime.device dev;
        public runtime.cdev cdev;
        public boolean exist;
    }

    @Type(noCCodeGeneration=true, cType="struct evdev_client")
    @NotUsableInJava
    public static class evdev_client
    extends Struct {
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int packet_head;
        public  @OriginalName(value="spinlock_t") runtime.spinlock buffer_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public Ptr<misc.fasync_struct> fasync;
        public Ptr<evdev> evdev;
        public ListDefinitions.list_head node;
        public InputDefinitions.input_clock_type clk_type;
        public boolean revoked;
        public Ptr<@Unsigned Long> @Size(value=32) [] evmasks;
        public @Unsigned int bufsize;
        public InputDefinitions.input_event @Size(value=0) [] buffer;
    }
}

