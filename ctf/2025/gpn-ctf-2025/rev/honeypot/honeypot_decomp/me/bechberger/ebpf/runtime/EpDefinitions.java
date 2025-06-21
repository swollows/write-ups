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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int __ep_eventpoll_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __ep_remove(Ptr<runtime.eventpoll> ep, Ptr<runtime.epitem> epi, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_autoremove_wake_function(Ptr<WaitDefinitions.wait_queue_entry> wq_entry, @Unsigned int mode, int sync2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ep_busy_loop_end(Ptr<?> p, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ep_clear_and_put(Ptr<runtime.eventpoll> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_create_wakeup_source(Ptr<runtime.epitem> epi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ep_destroy_wakeup_source(Ptr<runtime.epitem> epi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ep_done_scan(Ptr<runtime.eventpoll> ep, Ptr<ListDefinitions.list_head> txlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ep_eventpoll_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ep_eventpoll_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_eventpoll_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ep_insert($arg1, (const struct epoll_event*)$arg2, $arg3, $arg4, $arg5)")
    public static int ep_insert(Ptr<runtime.eventpoll> ep, Ptr<misc.epoll_event> event2, Ptr<runtime.file> tfile, int fd2, int full_check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ep_item_poll((const struct epitem*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__poll_t") int ep_item_poll(Ptr<runtime.epitem> epi, Ptr<PollDefinitions.poll_table_struct> pt2, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_loop_check_proc(Ptr<runtime.eventpoll> ep, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_poll(Ptr<runtime.eventpoll> ep, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_poll_callback(Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ep_ptable_queue_proc(Ptr<runtime.file> file2, Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> whead, Ptr<PollDefinitions.poll_table_struct> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ep_refcount_dec_and_test(Ptr<runtime.eventpoll> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ep_send_events(Ptr<runtime.eventpoll> ep, Ptr<misc.epoll_event> events, int maxevents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ep_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ep_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ep_pqueue")
    @NotUsableInJava
    public static class ep_pqueue
    extends Struct {
        public PollDefinitions.poll_table_struct pt;
        public Ptr<runtime.epitem> epi;
    }

    @Type(noCCodeGeneration=true, cType="struct ep_device")
    @NotUsableInJava
    public static class ep_device
    extends Struct {
        public Ptr<UsbDefinitions.usb_endpoint_descriptor> desc;
        public Ptr<UsbDefinitions.usb_device> udev;
        public runtime.device dev;
    }
}

