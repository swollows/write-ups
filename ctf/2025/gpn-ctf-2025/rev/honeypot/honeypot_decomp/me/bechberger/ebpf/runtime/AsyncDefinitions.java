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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AsyncDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="async_cookie_t") long __async_schedule_node_domain(@OriginalName(value="async_func_t") Ptr<?> func, Ptr<?> data, int node2, Ptr<async_domain> domain, Ptr<async_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_completed(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_run_entry_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean async_schedule_dev_nocall(@OriginalName(value="async_func_t") Ptr<?> func, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="async_cookie_t") long async_schedule_node(@OriginalName(value="async_func_t") Ptr<?> func, Ptr<?> data, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="async_cookie_t") long async_schedule_node_domain(@OriginalName(value="async_func_t") Ptr<?> func, Ptr<?> data, int node2, Ptr<async_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_synchronize_cookie(@Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_synchronize_cookie_domain(@Unsigned @OriginalName(value="async_cookie_t") long cookie, Ptr<async_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_synchronize_full() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_synchronize_full_domain(Ptr<async_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long async_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="async_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long async_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __async_dev_cache_fw_image(Ptr<?> fw_entry, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_port_probe(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_free_zspage(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_resume(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_resume_early(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_resume_noirq(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_suspend(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_suspend_late(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void async_suspend_noirq(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct async_scan_data")
    @NotUsableInJava
    public static class async_scan_data
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.Scsi_Host> shost;
        public runtime.completion prev_finished;
    }

    @Type(noCCodeGeneration=true, cType="struct async_entry")
    @NotUsableInJava
    public static class async_entry
    extends Struct {
        public ListDefinitions.list_head domain_list;
        public ListDefinitions.list_head global_list;
        public misc.work_struct work;
        public @Unsigned @OriginalName(value="async_cookie_t") long cookie;
        public @OriginalName(value="async_func_t") Ptr<?> func;
        public Ptr<?> data;
        public Ptr<async_domain> domain;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int queued; struct list_head queue; struct list_head done; spinlock lock; }")
    @NotUsableInJava
    public static class async_pf_of_kvm_vcpu
    extends Struct {
        public @Unsigned int queued;
        public ListDefinitions.list_head queue;
        public ListDefinitions.list_head done;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct async_poll")
    @NotUsableInJava
    public static class async_poll
    extends Struct {
        public IoDefinitions.io_poll poll;
        public Ptr<IoDefinitions.io_poll> double_poll;
    }

    @Type(noCCodeGeneration=true, cType="struct async_domain")
    @NotUsableInJava
    public static class async_domain
    extends Struct {
        public ListDefinitions.list_head pending;
        public @Unsigned int registered;
    }
}

