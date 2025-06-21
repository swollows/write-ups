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
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PpsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pps_echo_client_default(Ptr<pps_device> pps, int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pps_event(Ptr<pps_device> pps, Ptr<pps_event_time> ts, int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pps_device> pps_register_source(Ptr<pps_source_info> info2, int default_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pps_unregister_source(Ptr<pps_device> pps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pps_cdev_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pps_cdev_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pps_cdev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pps_cdev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int pps_cdev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pps_cdev_pps_fetch(Ptr<pps_device> pps, Ptr<pps_fdata> fdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pps_cdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pps_device_destruct(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pps_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pps_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pps_lookup_dev((const void*)$arg1)")
    public static Ptr<pps_device> pps_lookup_dev(Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pps_register_cdev(Ptr<pps_device> pps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pps_unregister_cdev(Ptr<pps_device> pps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pps_enable_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long pps_enable_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pps_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pps_bind_args")
    @NotUsableInJava
    public static class pps_bind_args
    extends Struct {
        public int tsformat;
        public int edge;
        public int consumer;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_fdata_compat")
    @NotUsableInJava
    public static class pps_fdata_compat
    extends Struct {
        public pps_kinfo_compat info;
        public pps_ktime_compat timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_fdata")
    @NotUsableInJava
    public static class pps_fdata
    extends Struct {
        public pps_kinfo info;
        public pps_ktime timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_kinfo_compat")
    @NotUsableInJava
    public static class pps_kinfo_compat
    extends Struct {
        public @Unsigned int assert_sequence;
        public @Unsigned int clear_sequence;
        public pps_ktime_compat assert_tu;
        public pps_ktime_compat clear_tu;
        public int current_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_kinfo")
    @NotUsableInJava
    public static class pps_kinfo
    extends Struct {
        public @Unsigned int assert_sequence;
        public @Unsigned int clear_sequence;
        public pps_ktime assert_tu;
        public pps_ktime clear_tu;
        public int current_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_ktime_compat")
    @NotUsableInJava
    public static class pps_ktime_compat
    extends Struct {
        public long sec;
        public int nsec;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_event_time")
    @NotUsableInJava
    public static class pps_event_time
    extends Struct {
        public runtime.timespec64 ts_real;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_device")
    @NotUsableInJava
    public static class pps_device
    extends Struct {
        public pps_source_info info;
        public pps_kparams params;
        public @Unsigned int assert_sequence;
        public @Unsigned int clear_sequence;
        public pps_ktime assert_tu;
        public pps_ktime clear_tu;
        public int current_mode;
        public @Unsigned int last_ev;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head queue;
        public @Unsigned int id;
        public Ptr<?> lookup_cookie;
        public runtime.cdev cdev;
        public Ptr<runtime.device> dev;
        public Ptr<misc.fasync_struct> async_queue;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_source_info")
    @NotUsableInJava
    public static class pps_source_info
    extends Struct {
        public char @Size(value=32) [] name;
        public char @Size(value=32) [] path;
        public int mode;
        public Ptr<?> echo;
        public Ptr<runtime.module> owner;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_kparams")
    @NotUsableInJava
    public static class pps_kparams
    extends Struct {
        public int api_version;
        public int mode;
        public pps_ktime assert_off_tu;
        public pps_ktime clear_off_tu;
    }

    @Type(noCCodeGeneration=true, cType="struct pps_ktime")
    @NotUsableInJava
    public static class pps_ktime
    extends Struct {
        public long sec;
        public int nsec;
        public @Unsigned int flags;
    }
}

