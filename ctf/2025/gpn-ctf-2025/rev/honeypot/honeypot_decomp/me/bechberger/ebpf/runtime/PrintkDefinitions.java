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
import me.bechberger.ebpf.runtime.ConsoleDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.PrbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PrintkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_get_console_flush_type(Ptr<ConsoleDefinitions.console_flush_type> ft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __printk_cpu_sync_put() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __printk_cpu_sync_try_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __printk_cpu_sync_wait() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__printk_ratelimit((const u8*)$arg1)")
    public static int __printk_ratelimit(String func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_printk_deferred((const u8*)$arg1, $arg2_)")
    public static int _printk_deferred(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="printk_get_level((const u8*)$arg1)")
    public static int printk_get_level(String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean printk_get_next_message(Ptr<printk_message> pmsg, @Unsigned long seq, boolean is_extended, boolean may_suppress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_kthreads_check_locked() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_kthreads_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int printk_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_legacy_allow_panic_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="printk_parse_prefix((const u8*)$arg1, $arg2, $arg3)")
    public static @Unsigned short printk_parse_prefix(String text, Ptr<Integer> level, Ptr<printk_info_flags> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean printk_percpu_data_ready() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int printk_set_kthreads_ready() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="printk_sprint($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static @Unsigned short printk_sprint(String text, @Unsigned short size, int facility, Ptr<printk_info_flags> flags, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean printk_timed_ratelimit(Ptr<@Unsigned Long> caller_jiffies, @Unsigned int interval_msecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_trigger_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __printk_deferred_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __printk_deferred_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __printk_safe_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __printk_safe_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_all_partitions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void printk_prot(Ptr<SeqDefinitions.seq_file> m, @Unsigned @OriginalName(value="pgprotval_t") long pr, int level, boolean dmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum printk_info_flags")
    public static enum printk_info_flags implements Enum<printk_info_flags>,
    TypedEnum<printk_info_flags, Integer>
    {
        LOG_NEWLINE,
        LOG_CONT;

    }

    @Type(noCCodeGeneration=true, cType="struct printk_message")
    @NotUsableInJava
    public static class printk_message
    extends Struct {
        public Ptr<printk_buffers> pbufs;
        public @Unsigned int outbuf_len;
        public @Unsigned long seq;
        public @Unsigned long dropped;
    }

    @Type(noCCodeGeneration=true, cType="struct printk_buffers")
    @NotUsableInJava
    public static class printk_buffers
    extends Struct {
        public char @Size(value=2048) [] outbuf;
        public char @Size(value=1024) [] scratchbuf;
    }

    @Type(noCCodeGeneration=true, cType="struct printk_ringbuffer")
    @NotUsableInJava
    public static class printk_ringbuffer
    extends Struct {
        public PrbDefinitions.prb_desc_ring desc_ring;
        public PrbDefinitions.prb_data_ring text_data_ring;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t fail;
    }

    @Type(noCCodeGeneration=true, cType="struct printk_record")
    @NotUsableInJava
    public static class printk_record
    extends Struct {
        public Ptr<printk_info> info;
        public String text_buf;
        public @Unsigned int text_buf_size;
    }

    @Type(noCCodeGeneration=true, cType="struct printk_info")
    @NotUsableInJava
    public static class printk_info
    extends Struct {
        public @Unsigned long seq;
        public @Unsigned long ts_nsec;
        public @Unsigned short text_len;
        public char facility;
        public char flags;
        public char level;
        public @Unsigned int caller_id;
        public DevDefinitions.dev_printk_info dev_info;
    }
}

