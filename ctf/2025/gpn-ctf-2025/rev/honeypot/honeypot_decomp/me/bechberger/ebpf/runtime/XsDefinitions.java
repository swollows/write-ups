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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class XsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xs_reboot_notify(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xs_request_exit(Ptr<misc.xb_req_data> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xs_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xs_send(Ptr<misc.xb_req_data> req2, Ptr<misc.xsd_sockmsg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xs_single($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<?> xs_single(XenbusDefinitions.xenbus_transaction t, misc.xsd_sockmsg_type type2, String string, Ptr<@Unsigned Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xs_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xs_suspend_cancel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xs_talkv($arg1, $arg2, (const struct kvec*)$arg3, $arg4, $arg5)")
    public static Ptr<?> xs_talkv(XenbusDefinitions.xenbus_transaction t, misc.xsd_sockmsg_type type2, Ptr<runtime.kvec> iovec2, @Unsigned int num_vecs, Ptr<@Unsigned Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xs_unwatch((const u8*)$arg1, (const u8*)$arg2)")
    public static int xs_unwatch(String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xs_wake_up(Ptr<misc.xb_req_data> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xs_watch((const u8*)$arg1, (const u8*)$arg2)")
    public static int xs_watch(String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xs_watch_msg(Ptr<xs_watch_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xs_hvm_defer_init_for_callback() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xs_watch_event")
    @NotUsableInJava
    public static class xs_watch_event
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned int len;
        public Ptr<XenbusDefinitions.xenbus_watch> handle;
        public String path;
        public String token;
        public char @Size(value=0) [] body;
    }
}

