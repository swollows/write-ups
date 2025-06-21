/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.CtrlDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TtyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_copy((const struct tty_struct*)$arg1, $arg2, $arg3, $arg4)")
    public static void tty_copy(Ptr<tty_struct> tty, Ptr<?> to, @Unsigned long tail, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_port_alloc_xmit_buf(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_port_block_til_ready(Ptr<tty_port> port2, Ptr<tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tty_port_carrier_raised(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_close(Ptr<tty_port> port2, Ptr<tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_close_end(Ptr<tty_port> port2, Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_port_close_start(Ptr<tty_port> port2, Ptr<tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_port_default_lookahead_buf($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void tty_port_default_lookahead_buf(Ptr<tty_port> port2, Ptr<Character> p, Ptr<Character> f, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_port_default_receive_buf($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned long tty_port_default_receive_buf(Ptr<tty_port> port2, Ptr<Character> p, Ptr<Character> f, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_default_wakeup(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_destroy(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_destructor(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_free_xmit_buf(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_hangup(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_init(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_port_install(Ptr<tty_port> port2, Ptr<tty_driver> driver, Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_link_device(Ptr<tty_port> port2, Ptr<tty_driver> driver, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_lower_dtr_rts(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_port_open(Ptr<tty_port> port2, Ptr<tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_put(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_raise_dtr_rts(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> tty_port_register_device(Ptr<tty_port> port2, Ptr<tty_driver> driver, @Unsigned int index2, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_port_register_device_attr($arg1, $arg2, $arg3, $arg4, $arg5, (const struct attribute_group**)$arg6)")
    public static Ptr<runtime.device> tty_port_register_device_attr(Ptr<tty_port> port2, Ptr<tty_driver> driver, @Unsigned int index2, Ptr<runtime.device> device2, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_port_register_device_attr_serdev($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct attribute_group**)$arg7)")
    public static Ptr<runtime.device> tty_port_register_device_attr_serdev(Ptr<tty_port> port2, Ptr<tty_driver> driver, @Unsigned int index2, Ptr<runtime.device> host, Ptr<runtime.device> parent, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> tty_port_register_device_serdev(Ptr<tty_port> port2, Ptr<tty_driver> driver, @Unsigned int index2, Ptr<runtime.device> host, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_shutdown(Ptr<tty_port> port2, Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_struct> tty_port_tty_get(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_tty_hangup(Ptr<tty_port> port2, boolean check_clocal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_tty_set(Ptr<tty_port> port2, Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_tty_wakeup(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_port_unregister_device(Ptr<tty_port> port2, Ptr<tty_driver> driver, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_close(Ptr<tty_struct> tty, Ptr<tty_ldisc> ld) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_deinit(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_deref(Ptr<tty_ldisc> ld) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldisc_failto(Ptr<tty_struct> tty, int ld) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_flush(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_ldisc> tty_ldisc_get(Ptr<tty_struct> tty, int disc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_hangup(Ptr<tty_struct> tty, boolean reinit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldisc_init(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldisc_lock(Ptr<tty_struct> tty, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldisc_open(Ptr<tty_struct> tty, Ptr<tty_ldisc> ld) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_ldisc> tty_ldisc_ref(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_ldisc> tty_ldisc_ref_wait(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldisc_reinit(Ptr<tty_struct> tty, int disc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_release(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldisc_setup(Ptr<tty_struct> tty, Ptr<tty_struct> o_tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldisc_unlock(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tty_ldiscs_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_ldiscs_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tty_ldiscs_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_ldiscs_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_register_ldisc(Ptr<tty_ldisc_ops> new_ldisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_set_ldisc(Ptr<tty_struct> tty, int disc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_unregister_ldisc(Ptr<tty_ldisc_ops> ldisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_driver> __tty_alloc_driver(@Unsigned int lines, Ptr<runtime.module> owner, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tty_buffer_request_room(Ptr<tty_port> port2, @Unsigned long size, boolean flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tty_hangup(Ptr<tty_struct> tty, int exit_session) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tty_insert_flip_string_flags($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @Unsigned long __tty_insert_flip_string_flags(Ptr<tty_port> port2, Ptr<Character> chars, Ptr<Character> flags, boolean mutable_flags, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_add_file(Ptr<tty_struct> tty, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_alloc_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_audit_add_data((const struct tty_struct*)$arg1, (const void*)$arg2, $arg3)")
    public static void tty_audit_add_data(Ptr<tty_struct> tty, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_audit_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_audit_fork(Ptr<misc.signal_struct> sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_audit_log((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void tty_audit_log(String description, @Unsigned @OriginalName(value="dev_t") int dev, Ptr<Character> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_audit_push() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_audit_tiocsti((const struct tty_struct*)$arg1, $arg2)")
    public static void tty_audit_tiocsti(Ptr<tty_struct> tty, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_buffer> tty_buffer_alloc(Ptr<tty_port> port2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tty_buffer_cancel_work(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_flush(Ptr<tty_struct> tty, Ptr<tty_ldisc> ld) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_flush_work(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_free(Ptr<tty_port> port2, Ptr<tty_buffer> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_free_all(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_init(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_lock_exclusive(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_buffer_request_room(Ptr<tty_port> port2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tty_buffer_restart_work(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_buffer_set_limit(Ptr<tty_port> port2, int limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_set_lock_subclass(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tty_buffer_space_avail(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_buffer_unlock_exclusive(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_cdev_add(Ptr<tty_driver> driver, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned int index2, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tty_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_default_fops(Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_dev_name_to_number((const u8*)$arg1, $arg2)")
    public static int tty_dev_name_to_number(String name, Ptr<@Unsigned @OriginalName(value="dev_t") Integer> number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_device_create_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_devnode((const struct device*)$arg1, $arg2)")
    public static String tty_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dev_t") int tty_devnum(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_do_resize(Ptr<tty_struct> tty, Ptr<runtime.winsize> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_driver_kref_put(Ptr<tty_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)tty_driver_name((const struct tty_struct*)$arg1))")
    public static String tty_driver_name(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_encode_baud_rate(Ptr<tty_struct> tty, @Unsigned @OriginalName(value="speed_t") int ibaud, @Unsigned @OriginalName(value="speed_t") int obaud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_fasync(int fd2, Ptr<runtime.file> filp, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_driver> tty_find_polling_driver(String name, Ptr<Integer> line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_flip_buffer_push(Ptr<tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_free_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_get_icount(Ptr<tty_struct> tty, Ptr<SerialDefinitions.serial_icounter_struct> icount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_get_tiocm(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_hangup(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_hung_up_p(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_struct> tty_init_dev(Ptr<tty_driver> driver, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_init_termios(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_insert_flip_string_and_push_buffer($arg1, (const u8*)$arg2, $arg3)")
    public static int tty_insert_flip_string_and_push_buffer(Ptr<tty_port> port2, Ptr<Character> chars, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tty_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_kclose(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_struct> tty_kopen(@Unsigned @OriginalName(value="dev_t") int device2, int shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_struct> tty_kopen_exclusive(@Unsigned @OriginalName(value="dev_t") int device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_struct> tty_kopen_shared(@Unsigned @OriginalName(value="dev_t") int device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_kref_put(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_ldisc_receive_buf($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned long tty_ldisc_receive_buf(Ptr<tty_ldisc> ld, Ptr<Character> p, Ptr<Character> f, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tty_driver> tty_lookup_driver(@Unsigned @OriginalName(value="dev_t") int device2, Ptr<runtime.file> filp, Ptr<Integer> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)tty_name((const struct tty_struct*)$arg1))")
    public static String tty_name(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tty_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tty_prepare_flip_string(Ptr<tty_port> port2, Ptr<Ptr<Character>> chars, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_put_char(Ptr<tty_struct> tty, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tty_read(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> tty_register_device(Ptr<tty_driver> driver, @Unsigned int index2, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_register_device_attr($arg1, $arg2, $arg3, $arg4, (const struct attribute_group**)$arg5)")
    public static Ptr<runtime.device> tty_register_device_attr(Ptr<tty_driver> driver, @Unsigned int index2, Ptr<runtime.device> device2, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_register_driver(Ptr<tty_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_release_checks(Ptr<tty_struct> tty, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_release_struct(Ptr<tty_struct> tty, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_reopen(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_save_termios(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_send_xchar(Ptr<tty_struct> tty, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_set_serial(Ptr<tty_struct> tty, Ptr<SerialDefinitions.serial_struct> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_standard_install(Ptr<tty_driver> driver, Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_termios_baud_rate((const struct ktermios*)$arg1)")
    public static @Unsigned @OriginalName(value="speed_t") int tty_termios_baud_rate(Ptr<runtime.ktermios> termios3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_termios_encode_baud_rate(Ptr<runtime.ktermios> termios3, @Unsigned @OriginalName(value="speed_t") int ibaud, @Unsigned @OriginalName(value="speed_t") int obaud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_termios_input_baud_rate((const struct ktermios*)$arg1)")
    public static @Unsigned @OriginalName(value="speed_t") int tty_termios_input_baud_rate(Ptr<runtime.ktermios> termios3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_unregister_device(Ptr<tty_driver> driver, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_unregister_driver(Ptr<tty_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_update_time(Ptr<tty_struct> tty, boolean mtime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_vhangup(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_vhangup_self() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_vhangup_session(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_wakeup(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tty_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_write_lock(Ptr<tty_struct> tty, boolean ndelay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_write_unlock(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tty_check_change(Ptr<tty_struct> tty, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tty_perform_flush(Ptr<tty_struct> tty, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tty_chars_in_buffer(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_check_change(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_driver_flush_buffer(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char tty_get_char_size(@Unsigned int cflag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char tty_get_frame_size(@Unsigned int cflag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> tty_get_pgrp(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tty_jobctrl_ioctl(Ptr<tty_struct> tty, Ptr<tty_struct> real_tty, Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_lock(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_lock_interruptible(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_lock_slave(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_mode_ioctl(Ptr<tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_open_proc_set_tty(Ptr<runtime.file> filp, Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_perform_flush(Ptr<tty_struct> tty, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_set_lock_subclass(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_set_termios(Ptr<tty_struct> tty, Ptr<runtime.ktermios> new_termios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tty_signal_session_leader(Ptr<tty_struct> tty, int exit_session) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_termios_copy_hw($arg1, (const struct ktermios*)$arg2)")
    public static void tty_termios_copy_hw(Ptr<runtime.ktermios> _new, Ptr<runtime.ktermios> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tty_termios_hw_change((const struct ktermios*)$arg1, (const struct ktermios*)$arg2)")
    public static boolean tty_termios_hw_change(Ptr<runtime.ktermios> a, Ptr<runtime.ktermios> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tty_throttle_safe(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_unlock(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_unlock_slave(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_unthrottle(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tty_unthrottle_safe(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tty_wait_until_sent(Ptr<tty_struct> tty, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tty_write_room(Ptr<tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tty_audit_buf")
    @NotUsableInJava
    public static class tty_audit_buf
    extends Struct {
        public runtime.mutex mutex;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public boolean icanon;
        public @Unsigned long valid;
        public Ptr<Character> data;
    }

    @Type(noCCodeGeneration=true, cType="enum tty_flow_change")
    public static enum tty_flow_change implements Enum<tty_flow_change>,
    TypedEnum<tty_flow_change, Integer>
    {
        TTY_FLOW_NO_CHANGE,
        TTY_THROTTLE_SAFE,
        TTY_UNTHROTTLE_SAFE;

    }

    @Type(noCCodeGeneration=true, cType="struct tty_file_private")
    @NotUsableInJava
    public static class tty_file_private
    extends Struct {
        public Ptr<tty_struct> tty;
        public Ptr<runtime.file> file;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_port_client_operations")
    @NotUsableInJava
    public static class tty_port_client_operations
    extends Struct {
        public Ptr<?> receive_buf;
        public Ptr<?> lookahead_buf;
        public Ptr<?> write_wakeup;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_port_operations")
    @NotUsableInJava
    public static class tty_port_operations
    extends Struct {
        public Ptr<?> carrier_raised;
        public Ptr<?> dtr_rts;
        public Ptr<?> shutdown;
        public Ptr<?> activate;
        public Ptr<?> destruct;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_bufhead")
    @NotUsableInJava
    public static class tty_bufhead
    extends Struct {
        public Ptr<tty_buffer> head;
        public misc.work_struct work;
        public runtime.mutex lock;
        public AtomicDefinitions.atomic_t priority;
        public tty_buffer sentinel;
        public misc.llist_head free;
        public AtomicDefinitions.atomic_t mem_used;
        public int mem_limit;
        public Ptr<tty_buffer> tail;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_buffer")
    @NotUsableInJava
    public static class tty_buffer
    extends Struct {
        @InlineUnion(value=5138)
        public @InlineUnion(value=5138) Ptr<tty_buffer> next;
        @InlineUnion(value=5138)
        public @InlineUnion(value=5138) misc.llist_node free;
        public @Unsigned int used;
        public @Unsigned int size;
        public @Unsigned int commit;
        public @Unsigned int lookahead;
        public @Unsigned int read;
        public boolean flags;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_ldisc")
    @NotUsableInJava
    public static class tty_ldisc
    extends Struct {
        public Ptr<tty_ldisc_ops> ops;
        public Ptr<tty_struct> tty;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_ldisc_ops")
    @NotUsableInJava
    public static class tty_ldisc_ops
    extends Struct {
        public String name;
        public int num;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> flush_buffer;
        public Ptr<?> read;
        public Ptr<?> write;
        public Ptr<?> ioctl;
        public Ptr<?> compat_ioctl;
        public Ptr<?> set_termios;
        public Ptr<?> poll;
        public Ptr<?> hangup;
        public Ptr<?> receive_buf;
        public Ptr<?> write_wakeup;
        public Ptr<?> dcd_change;
        public Ptr<?> receive_buf2;
        public Ptr<?> lookahead_buf;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_port")
    @NotUsableInJava
    public static class tty_port
    extends Struct {
        public tty_bufhead buf;
        public Ptr<tty_struct> tty;
        public Ptr<tty_struct> itty;
        public Ptr<tty_port_operations> ops;
        public Ptr<tty_port_client_operations> client_ops;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int blocked_open;
        public int count;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head open_wait;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head delta_msr_wait;
        public @Unsigned long flags;
        public @Unsigned long iflags;
        public char console;
        public runtime.mutex mutex;
        public runtime.mutex buf_mutex;
        public Ptr<Character> xmit_buf;
        public misc.xmit_fifo_of_tty_port xmit_fifo;
        public @Unsigned int close_delay;
        public @Unsigned int closing_wait;
        public int drain_delay;
        public runtime.kref kref;
        public Ptr<?> client_data;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_operations")
    @NotUsableInJava
    public static class tty_operations
    extends Struct {
        public Ptr<?> lookup;
        public Ptr<?> install;
        public Ptr<?> remove;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> shutdown;
        public Ptr<?> cleanup;
        public Ptr<?> write;
        public Ptr<?> put_char;
        public Ptr<?> flush_chars;
        public Ptr<?> write_room;
        public Ptr<?> chars_in_buffer;
        public Ptr<?> ioctl;
        public Ptr<?> compat_ioctl;
        public Ptr<?> set_termios;
        public Ptr<?> throttle;
        public Ptr<?> unthrottle;
        public Ptr<?> stop;
        public Ptr<?> start;
        public Ptr<?> hangup;
        public Ptr<?> break_ctl;
        public Ptr<?> flush_buffer;
        public Ptr<?> ldisc_ok;
        public Ptr<?> set_ldisc;
        public Ptr<?> wait_until_sent;
        public Ptr<?> send_xchar;
        public Ptr<?> tiocmget;
        public Ptr<?> tiocmset;
        public Ptr<?> resize;
        public Ptr<?> get_icount;
        public Ptr<?> get_serial;
        public Ptr<?> set_serial;
        public Ptr<?> show_fdinfo;
        public Ptr<?> poll_init;
        public Ptr<?> poll_get_char;
        public Ptr<?> poll_put_char;
        public Ptr<?> proc_show;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_driver")
    @NotUsableInJava
    public static class tty_driver
    extends Struct {
        public runtime.kref kref;
        public Ptr<Ptr<runtime.cdev>> cdevs;
        public Ptr<runtime.module> owner;
        public String driver_name;
        public String name;
        public int name_base;
        public int major;
        public int minor_start;
        public @Unsigned int num;
        public short type;
        public short subtype;
        public runtime.ktermios init_termios;
        public @Unsigned long flags;
        public Ptr<ProcDefinitions.proc_dir_entry> proc_entry;
        public Ptr<tty_driver> other;
        public Ptr<Ptr<tty_struct>> ttys;
        public Ptr<Ptr<tty_port>> ports;
        public Ptr<Ptr<runtime.ktermios>> termios;
        public Ptr<?> driver_state;
        public Ptr<tty_operations> ops;
        public ListDefinitions.list_head tty_drivers;
    }

    @Type(noCCodeGeneration=true, cType="struct tty_struct")
    @NotUsableInJava
    public static class tty_struct
    extends Struct {
        public runtime.kref kref;
        public int index;
        public Ptr<runtime.device> dev;
        public Ptr<tty_driver> driver;
        public Ptr<tty_port> port;
        public Ptr<tty_operations> ops;
        public Ptr<tty_ldisc> ldisc;
        public misc.ld_semaphore ldisc_sem;
        public runtime.mutex atomic_write_lock;
        public runtime.mutex legacy_mutex;
        public runtime.mutex throttle_mutex;
        public misc.rw_semaphore termios_rwsem;
        public runtime.mutex winsize_mutex;
        public runtime.ktermios termios;
        public runtime.ktermios termios_locked;
        public char @Size(value=64) [] name;
        public @Unsigned long flags;
        public int count;
        public @Unsigned int receive_room;
        public runtime.winsize winsize;
        public FlowDefinitions.flow_of_tty_struct flow;
        public CtrlDefinitions.ctrl_of_tty_struct ctrl;
        public boolean hw_stopped;
        public boolean closing;
        public int flow_change;
        public Ptr<tty_struct> link;
        public Ptr<misc.fasync_struct> fasync;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head write_wait;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head read_wait;
        public misc.work_struct hangup_work;
        public Ptr<?> disc_data;
        public Ptr<?> driver_data;
        public  @OriginalName(value="spinlock_t") runtime.spinlock files_lock;
        public int write_cnt;
        public Ptr<Character> write_buf;
        public ListDefinitions.list_head tty_files;
        public misc.work_struct SAK_work;
    }
}

