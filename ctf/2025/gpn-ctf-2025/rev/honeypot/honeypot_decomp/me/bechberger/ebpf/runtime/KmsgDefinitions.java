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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KmsgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kmsg_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int kmsg_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kmsg_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kmsg_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kmsg_dump_desc($arg1, (const u8*)$arg2)")
    public static void kmsg_dump_desc(kmsg_dump_reason reason, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kmsg_dump_get_buffer(Ptr<kmsg_dump_iter> iter2, boolean syslog, String buf, @Unsigned long size, Ptr<@Unsigned Long> len_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kmsg_dump_get_line(Ptr<kmsg_dump_iter> iter2, boolean syslog, String line2, @Unsigned long size, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)kmsg_dump_reason_str($arg1))")
    public static String kmsg_dump_reason_str(kmsg_dump_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kmsg_dump_register(Ptr<kmsg_dumper> dumper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kmsg_dump_rewind(Ptr<kmsg_dump_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kmsg_dump_unregister(Ptr<kmsg_dumper> dumper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kmsg_dump_iter")
    @NotUsableInJava
    public static class kmsg_dump_iter
    extends Struct {
        public @Unsigned long cur_seq;
        public @Unsigned long next_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct kmsg_dumper")
    @NotUsableInJava
    public static class kmsg_dumper
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> dump;
        public kmsg_dump_reason max_reason;
        public boolean registered;
    }

    @Type(noCCodeGeneration=true, cType="struct kmsg_dump_detail")
    @NotUsableInJava
    public static class kmsg_dump_detail
    extends Struct {
        public kmsg_dump_reason reason;
        public String description;
    }

    @Type(noCCodeGeneration=true, cType="enum kmsg_dump_reason")
    public static enum kmsg_dump_reason implements Enum<kmsg_dump_reason>,
    TypedEnum<kmsg_dump_reason, Integer>
    {
        KMSG_DUMP_UNDEF,
        KMSG_DUMP_PANIC,
        KMSG_DUMP_OOPS,
        KMSG_DUMP_EMERG,
        KMSG_DUMP_SHUTDOWN,
        KMSG_DUMP_MAX;

    }
}

