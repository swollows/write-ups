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
import me.bechberger.ebpf.runtime.HvDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HvcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hvc_poll(Ptr<hvc_struct> hp, boolean may_sleep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hvc_resize(Ptr<hvc_struct> hp, runtime.winsize ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hvc_alloc($arg1, $arg2, (const struct hv_ops*)$arg3, $arg4)")
    public static Ptr<hvc_struct> hvc_alloc(@Unsigned @OriginalName(value="uint32_t") int vtermno, int data, Ptr<HvDefinitions.hv_ops> ops, int outbuf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int hvc_chars_in_buffer(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_cleanup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_close(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_driver> hvc_console_device(Ptr<runtime.console> c, Ptr<Integer> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_console_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hvc_console_print($arg1, (const u8*)$arg2, $arg3)")
    public static void hvc_console_print(Ptr<runtime.console> co, String b, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_console_setup(Ptr<runtime.console> co, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<hvc_struct> hvc_get_by_index(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_hangup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hvc_instantiate($arg1, $arg2, (const struct hv_ops*)$arg3)")
    public static int hvc_instantiate(@Unsigned @OriginalName(value="uint32_t") int vtermno, int index2, Ptr<HvDefinitions.hv_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_kick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_open(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_poll(Ptr<hvc_struct> hp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_poll_get_char(Ptr<TtyDefinitions.tty_driver> driver, int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_poll_init(Ptr<TtyDefinitions.tty_driver> driver, int line2, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_poll_put_char(Ptr<TtyDefinitions.tty_driver> driver, int line2, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_port_destruct(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_push(Ptr<hvc_struct> hp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_remove(Ptr<hvc_struct> hp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_set_winsz(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_tiocmget(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hvc_tiocmset(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int set, @Unsigned int clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hvc_unthrottle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hvc_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hvc_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int hvc_write_room(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn hvc_handle_interrupt(int irq, Ptr<?> dev_instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hvc_struct")
    @NotUsableInJava
    public static class hvc_struct
    extends Struct {
        public TtyDefinitions.tty_port port;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int index;
        public int do_wakeup;
        public int outbuf_size;
        public int n_outbuf;
        public @Unsigned @OriginalName(value="uint32_t") int vtermno;
        public Ptr<HvDefinitions.hv_ops> ops;
        public int irq_requested;
        public int data;
        public runtime.winsize ws;
        public misc.work_struct tty_resize;
        public ListDefinitions.list_head next;
        public @Unsigned long flags;
        public char @Size(value=0) [] outbuf;
    }
}

