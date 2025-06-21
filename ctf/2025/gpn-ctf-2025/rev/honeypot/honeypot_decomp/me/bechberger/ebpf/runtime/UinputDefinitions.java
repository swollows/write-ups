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
import me.bechberger.ebpf.runtime.FfDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UinputDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uinput_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_create_device(Ptr<uinput_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uinput_destroy_device(Ptr<uinput_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_dev_erase_effect(Ptr<InputDefinitions.input_dev> dev, int effect_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_dev_event(Ptr<InputDefinitions.input_dev> dev, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_dev_flush(Ptr<InputDefinitions.input_dev> dev, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_dev_playback(Ptr<InputDefinitions.input_dev> dev, int effect_id, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uinput_dev_set_autocenter(Ptr<InputDefinitions.input_dev> dev, @Unsigned short magnitude) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uinput_dev_set_gain(Ptr<InputDefinitions.input_dev> dev, @Unsigned short gain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_dev_setup(Ptr<uinput_device> udev, Ptr<uinput_setup> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_dev_upload_effect(Ptr<InputDefinitions.input_dev> dev, Ptr<FfDefinitions.ff_effect> effect, Ptr<FfDefinitions.ff_effect> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uinput_ff_upload_from_user((const u8*)$arg1, $arg2)")
    public static int uinput_ff_upload_from_user(String buffer, Ptr<uinput_ff_upload> ff_up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uinput_ff_upload_to_user($arg1, (const struct uinput_ff_upload*)$arg2)")
    public static int uinput_ff_upload_to_user(String buffer, Ptr<uinput_ff_upload> ff_up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uinput_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uinput_misc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_misc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int uinput_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long uinput_read(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_request_reserve_slot(Ptr<uinput_device> udev, Ptr<uinput_request> request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uinput_request_submit(Ptr<uinput_device> udev, Ptr<uinput_request> request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uinput_setup_device_legacy($arg1, (const u8*)$arg2, $arg3)")
    public static int uinput_setup_device_legacy(Ptr<uinput_device> udev, String buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uinput_str_to_user($arg1, (const u8*)$arg2, $arg3)")
    public static int uinput_str_to_user(Ptr<?> dest, String str, @Unsigned int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uinput_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long uinput_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_ff_upload_compat")
    @NotUsableInJava
    public static class uinput_ff_upload_compat
    extends Struct {
        public @Unsigned int request_id;
        public int retval;
        public FfDefinitions.ff_effect_compat effect;
        public FfDefinitions.ff_effect_compat old;
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_device")
    @NotUsableInJava
    public static class uinput_device
    extends Struct {
        public Ptr<InputDefinitions.input_dev> dev;
        public runtime.mutex mutex;
        public uinput_state state;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public char ready;
        public char head;
        public char tail;
        public InputDefinitions.input_event @Size(value=16) [] buff;
        public @Unsigned int ff_effects_max;
        public Ptr<uinput_request> @Size(value=16) [] requests;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head requests_waitq;
        public  @OriginalName(value="spinlock_t") runtime.spinlock requests_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_request")
    @NotUsableInJava
    public static class uinput_request
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int code;
        public int retval;
        public runtime.completion done;
        public UDefinitions.u_of_uinput_request u;
    }

    @Type(noCCodeGeneration=true, cType="enum uinput_state")
    public static enum uinput_state implements Enum<uinput_state>,
    TypedEnum<uinput_state, Integer>
    {
        UIST_NEW_DEVICE,
        UIST_SETUP_COMPLETE,
        UIST_CREATED;

    }

    @Type(noCCodeGeneration=true, cType="struct uinput_user_dev")
    @NotUsableInJava
    public static class uinput_user_dev
    extends Struct {
        public char @Size(value=80) [] name;
        public InputDefinitions.input_id id;
        public @Unsigned int ff_effects_max;
        public int @Size(value=64) [] absmax;
        public int @Size(value=64) [] absmin;
        public int @Size(value=64) [] absfuzz;
        public int @Size(value=64) [] absflat;
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_abs_setup")
    @NotUsableInJava
    public static class uinput_abs_setup
    extends Struct {
        public @Unsigned short code;
        public InputDefinitions.input_absinfo absinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_setup")
    @NotUsableInJava
    public static class uinput_setup
    extends Struct {
        public InputDefinitions.input_id id;
        public char @Size(value=80) [] name;
        public @Unsigned int ff_effects_max;
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_ff_erase")
    @NotUsableInJava
    public static class uinput_ff_erase
    extends Struct {
        public @Unsigned int request_id;
        public int retval;
        public @Unsigned int effect_id;
    }

    @Type(noCCodeGeneration=true, cType="struct uinput_ff_upload")
    @NotUsableInJava
    public static class uinput_ff_upload
    extends Struct {
        public @Unsigned int request_id;
        public int retval;
        public FfDefinitions.ff_effect effect;
        public FfDefinitions.ff_effect old;
    }
}

