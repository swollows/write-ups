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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MousedevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_cleanup(Ptr<runtime.mousedev> mousedev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_close_device(Ptr<runtime.mousedev> mousedev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mousedev_connect($arg1, $arg2, (const struct input_device_id*)$arg3)")
    public static int mousedev_connect(Ptr<InputDefinitions.input_handler> handler, Ptr<InputDefinitions.input_dev> dev, Ptr<InputDefinitions.input_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mousedev> mousedev_create(Ptr<InputDefinitions.input_dev> dev, Ptr<InputDefinitions.input_handler> handler, boolean mixdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_destroy(Ptr<runtime.mousedev> mousedev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_disconnect(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_event(Ptr<InputDefinitions.input_handle> handle, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mousedev_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_free(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mousedev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_key_event(Ptr<runtime.mousedev> mousedev2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_notify_readers(Ptr<runtime.mousedev> mousedev2, Ptr<mousedev_hw_data> packet) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mousedev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mousedev_open_device(Ptr<runtime.mousedev> mousedev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_packet(Ptr<mousedev_client> client, Ptr<Character> ps2_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int mousedev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_psaux_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mousedev_read(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mousedev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mousedev_touchpad_event(Ptr<InputDefinitions.input_dev> dev, Ptr<runtime.mousedev> mousedev2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mousedev_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mousedev_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mousedev_client")
    @NotUsableInJava
    public static class mousedev_client
    extends Struct {
        public Ptr<misc.fasync_struct> fasync;
        public Ptr<runtime.mousedev> mousedev;
        public ListDefinitions.list_head node;
        public mousedev_motion @Size(value=16) [] packets;
        public @Unsigned int head;
        public @Unsigned int tail;
        public  @OriginalName(value="spinlock_t") runtime.spinlock packet_lock;
        public int pos_x;
        public int pos_y;
        public char @Size(value=6) [] ps2;
        public char ready;
        public char buffer;
        public char bufsiz;
        public char imexseq;
        public char impsseq;
        public mousedev_emul mode;
        public @Unsigned long last_buttons;
    }

    @Type(noCCodeGeneration=true, cType="struct mousedev_motion")
    @NotUsableInJava
    public static class mousedev_motion
    extends Struct {
        public int dx;
        public int dy;
        public int dz;
        public @Unsigned long buttons;
    }

    @Type(noCCodeGeneration=true, cType="enum mousedev_emul")
    public static enum mousedev_emul implements Enum<mousedev_emul>,
    TypedEnum<mousedev_emul, Integer>
    {
        MOUSEDEV_EMUL_PS2,
        MOUSEDEV_EMUL_IMPS,
        MOUSEDEV_EMUL_EXPS;

    }

    @Type(noCCodeGeneration=true, cType="struct mousedev_hw_data")
    @NotUsableInJava
    public static class mousedev_hw_data
    extends Struct {
        public int dx;
        public int dy;
        public int dz;
        public int x;
        public int y;
        public int abs_event;
        public @Unsigned long buttons;
    }
}

