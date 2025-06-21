/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.ElvDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ElevatorDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__elevator_find((const u8*)$arg1)")
    public static Ptr<elevator_type> __elevator_find(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<elevator_queue> elevator_alloc(Ptr<RequestDefinitions.request_queue> q, Ptr<elevator_type> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elevator_disable(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elevator_exit(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elevator_init_mq(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elevator_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elevator_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elevator_switch(Ptr<RequestDefinitions.request_queue> q, Ptr<elevator_type> new_e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct elevator_type")
    @NotUsableInJava
    public static class elevator_type
    extends Struct {
        public Ptr<KmemDefinitions.kmem_cache> icq_cache;
        public elevator_mq_ops ops;
        public @Unsigned long icq_size;
        public @Unsigned long icq_align;
        public Ptr<ElvDefinitions.elv_fs_entry> elevator_attrs;
        public String elevator_name;
        public String elevator_alias;
        public Ptr<runtime.module> elevator_owner;
        public Ptr<BlkDefinitions.blk_mq_debugfs_attr> queue_debugfs_attrs;
        public Ptr<BlkDefinitions.blk_mq_debugfs_attr> hctx_debugfs_attrs;
        public char @Size(value=22) [] icq_cache_name;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct elevator_mq_ops")
    @NotUsableInJava
    public static class elevator_mq_ops
    extends Struct {
        public Ptr<?> init_sched;
        public Ptr<?> exit_sched;
        public Ptr<?> init_hctx;
        public Ptr<?> exit_hctx;
        public Ptr<?> depth_updated;
        public Ptr<?> allow_merge;
        public Ptr<?> bio_merge;
        public Ptr<?> request_merge;
        public Ptr<?> request_merged;
        public Ptr<?> requests_merged;
        public Ptr<?> limit_depth;
        public Ptr<?> prepare_request;
        public Ptr<?> finish_request;
        public Ptr<?> insert_requests;
        public Ptr<?> dispatch_request;
        public Ptr<?> has_work;
        public Ptr<?> completed_request;
        public Ptr<?> requeue_request;
        public Ptr<?> former_request;
        public Ptr<?> next_request;
        public Ptr<?> init_icq;
        public Ptr<?> exit_icq;
    }

    @Type(noCCodeGeneration=true, cType="struct elevator_queue")
    @NotUsableInJava
    public static class elevator_queue
    extends Struct {
        public Ptr<elevator_type> type;
        public Ptr<?> elevator_data;
        public runtime.kobject kobj;
        public runtime.mutex sysfs_lock;
        public @Unsigned long flags;
        public misc.hlist_head @Size(value=64) [] hash;
    }
}

