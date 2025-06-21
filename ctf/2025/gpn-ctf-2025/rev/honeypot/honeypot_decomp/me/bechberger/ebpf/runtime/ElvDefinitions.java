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
import me.bechberger.ebpf.runtime.ElevatorDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ElvDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean elv_attempt_insert_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<ListDefinitions.list_head> free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long elv_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elv_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long elv_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean elv_bio_merge_ok(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> elv_former_request(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elv_iosched_load_module($arg1, (const u8*)$arg2, $arg3)")
    public static int elv_iosched_load_module(Ptr<runtime.gendisk> disk, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long elv_iosched_show(Ptr<runtime.gendisk> disk, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elv_iosched_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long elv_iosched_store(Ptr<runtime.gendisk> disk, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> elv_latter_request(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_merge_requests(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<runtime.request> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_merged_request(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, elv_merge type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_rb_add(Ptr<RbDefinitions.rb_root> root, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_rb_del(Ptr<RbDefinitions.rb_root> root, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> elv_rb_find(Ptr<RbDefinitions.rb_root> root, @Unsigned @OriginalName(value="sector_t") long sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> elv_rb_former_request(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> elv_rb_latter_request(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elv_register(Ptr<ElevatorDefinitions.elevator_type> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elv_register_queue(Ptr<RequestDefinitions.request_queue> q, boolean uevent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_rqhash_add(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_rqhash_del(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> elv_rqhash_find(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="sector_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_rqhash_reposition(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_unregister(Ptr<ElevatorDefinitions.elevator_type> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elv_unregister_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct elv_fs_entry")
    @NotUsableInJava
    public static class elv_fs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="enum elv_merge")
    public static enum elv_merge implements Enum<elv_merge>,
    TypedEnum<elv_merge, Integer>
    {
        ELEVATOR_NO_MERGE,
        ELEVATOR_FRONT_MERGE,
        ELEVATOR_BACK_MERGE,
        ELEVATOR_DISCARD_MERGE;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct io_cq *icq; void* priv[2]; }")
    @NotUsableInJava
    public static class elv_of_request
    extends Struct {
        public Ptr<IoDefinitions.io_cq> icq;
        public Ptr<?> @Size(value=2) [] priv;
    }
}

