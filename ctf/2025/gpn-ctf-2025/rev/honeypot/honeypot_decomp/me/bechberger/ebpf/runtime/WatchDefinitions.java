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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class WatchDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="watch_fired($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void watch_fired(Ptr<XenbusDefinitions.xenbus_watch> watch2, String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="watch_target($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void watch_target(Ptr<XenbusDefinitions.xenbus_watch> watch2, String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watch_queue_clear(Ptr<watch_queue> wqueue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watch_queue_init(Ptr<PipeDefinitions.pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watch_queue_pipe_buf_release(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long watch_queue_set_filter(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<watch_notification_filter> _filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long watch_queue_set_size(Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned int nr_notes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct watch_notification_removal")
    @NotUsableInJava
    public static class watch_notification_removal
    extends Struct {
        public watch_notification watch;
        public @Unsigned long id;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_adapter")
    @NotUsableInJava
    public static class watch_adapter
    extends Struct {
        public ListDefinitions.list_head list;
        public XenbusDefinitions.xenbus_watch watch;
        public Ptr<XenbusDefinitions.xenbus_file_priv> dev_data;
        public String token;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_filter")
    @NotUsableInJava
    public static class watch_filter
    extends Struct {
        @InlineUnion(value=9944)
        public @InlineUnion(value=9944) misc.callback_head rcu;
        @InlineUnion(value=9944)
        public @InlineUnion(value=9944) @Unsigned long @Size(value=1) [] type_filter;
        public @Unsigned int nr_filters;
        public watch_type_filter @Size(value=0) [] filters;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_type_filter")
    @NotUsableInJava
    public static class watch_type_filter
    extends Struct {
        public watch_notification_type type;
        public @Unsigned int @Size(value=1) [] subtype_filter;
        public @Unsigned int info_filter;
        public @Unsigned int info_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_notification_filter")
    @NotUsableInJava
    public static class watch_notification_filter
    extends Struct {
        public @Unsigned int nr_filters;
        public @Unsigned int __reserved;
        public watch_notification_type_filter @Size(value=0) [] filters;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_notification_type_filter")
    @NotUsableInJava
    public static class watch_notification_type_filter
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int info_filter;
        public @Unsigned int info_mask;
        public @Unsigned int @Size(value=8) [] subtype_filter;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_notification")
    @NotUsableInJava
    public static class watch_notification
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int subtype;
        public @Unsigned int info;
    }

    @Type(noCCodeGeneration=true, cType="enum watch_meta_notification_subtype")
    public static enum watch_meta_notification_subtype implements Enum<watch_meta_notification_subtype>,
    TypedEnum<watch_meta_notification_subtype, Integer>
    {
        WATCH_META_REMOVAL_NOTIFICATION,
        WATCH_META_LOSS_NOTIFICATION;

    }

    @Type(noCCodeGeneration=true, cType="enum watch_notification_type")
    public static enum watch_notification_type implements Enum<watch_notification_type>,
    TypedEnum<watch_notification_type, Integer>
    {
        WATCH_TYPE_META,
        WATCH_TYPE_KEY_NOTIFY,
        WATCH_TYPE__NR;

    }

    @Type(noCCodeGeneration=true, cType="struct watch_queue")
    @NotUsableInJava
    public static class watch_queue
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<watch_filter> filter;
        public Ptr<PipeDefinitions.pipe_inode_info> pipe;
        public misc.hlist_head watches;
        public Ptr<Ptr<runtime.page>> notes;
        public Ptr<@Unsigned Long> notes_bitmap;
        public runtime.kref usage;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int nr_notes;
        public @Unsigned int nr_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct watch_list")
    @NotUsableInJava
    public static class watch_list
    extends Struct {
        public misc.callback_head rcu;
        public misc.hlist_head watchers;
        public Ptr<?> release_watch;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }
}

