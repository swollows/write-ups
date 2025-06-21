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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CoreDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CnDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_filter(Ptr<runtime.sock> dsk, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cn_proc_mcast_ctl(Ptr<cn_msg> msg, Ptr<NetlinkDefinitions.netlink_skb_parms> nsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_cb_equal((const struct cb_id*)$arg1, (const struct cb_id*)$arg2)")
    public static int cn_cb_equal(Ptr<misc.cb_id> i1, Ptr<misc.cb_id> i2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_esc_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static int cn_esc_printf(Ptr<CoreDefinitions.core_name> cn, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_print_exe_file(Ptr<CoreDefinitions.core_name> cn, boolean name_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static int cn_printf(Ptr<CoreDefinitions.core_name> cn, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_queue_add_callback($arg1, (const u8*)$arg2, (const struct cb_id*)$arg3, (void (*)(struct cn_msg*, struct netlink_skb_parms*))$arg4)")
    public static int cn_queue_add_callback(Ptr<cn_queue_dev> dev, String name, Ptr<misc.cb_id> id, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_queue_alloc_callback_entry($arg1, (const u8*)$arg2, (const struct cb_id*)$arg3, (void (*)(struct cn_msg*, struct netlink_skb_parms*))$arg4)")
    public static Ptr<cn_callback_entry> cn_queue_alloc_callback_entry(Ptr<cn_queue_dev> dev, String name, Ptr<misc.cb_id> id, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_queue_alloc_dev((const u8*)$arg1, $arg2)")
    public static Ptr<cn_queue_dev> cn_queue_alloc_dev(String name, Ptr<runtime.sock> nls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_queue_del_callback($arg1, (const struct cb_id*)$arg2)")
    public static void cn_queue_del_callback(Ptr<cn_queue_dev> dev, Ptr<misc.cb_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cn_queue_free_dev(Ptr<cn_queue_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cn_queue_release_callback(Ptr<cn_callback_entry> cbq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_vprintf($arg1, (const u8*)$arg2, $arg3)")
    public static int cn_vprintf(Ptr<CoreDefinitions.core_name> cn, String fmt, Ptr<misc.__va_list_tag> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_add_callback((const struct cb_id*)$arg1, (const u8*)$arg2, (void (*)(struct cn_msg*, struct netlink_skb_parms*))$arg3)")
    public static int cn_add_callback(Ptr<misc.cb_id> id, String name, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_bind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cn_del_callback((const struct cb_id*)$arg1)")
    public static void cn_del_callback(Ptr<misc.cb_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cn_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_netlink_send(Ptr<cn_msg> msg, @Unsigned int portid, @Unsigned int __group, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_netlink_send_mult(Ptr<cn_msg> msg, @Unsigned short len, @Unsigned int portid, @Unsigned int __group, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @OriginalName(value="netlink_filter_fn") Ptr<?> filter, Ptr<?> filter_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cn_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cn_release(Ptr<runtime.sock> sk, Ptr<@Unsigned Long> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cn_rx_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cn_dev")
    @NotUsableInJava
    public static class cn_dev
    extends Struct {
        public misc.cb_id id;
        public @Unsigned int seq;
        public @Unsigned int groups;
        public Ptr<runtime.sock> nls;
        public Ptr<cn_queue_dev> cbdev;
    }

    @Type(noCCodeGeneration=true, cType="struct cn_callback_entry")
    @NotUsableInJava
    public static class cn_callback_entry
    extends Struct {
        public ListDefinitions.list_head callback_entry;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public Ptr<cn_queue_dev> pdev;
        public cn_callback_id id;
        public Ptr<?> callback;
        public @Unsigned int seq;
        public @Unsigned int group;
    }

    @Type(noCCodeGeneration=true, cType="struct cn_callback_id")
    @NotUsableInJava
    public static class cn_callback_id
    extends Struct {
        public char @Size(value=32) [] name;
        public misc.cb_id id;
    }

    @Type(noCCodeGeneration=true, cType="struct cn_queue_dev")
    @NotUsableInJava
    public static class cn_queue_dev
    extends Struct {
        public AtomicDefinitions.atomic_t refcnt;
        public char @Size(value=32) [] name;
        public ListDefinitions.list_head queue_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock queue_lock;
        public Ptr<runtime.sock> nls;
    }

    @Type(noCCodeGeneration=true, cType="struct cn_msg")
    @NotUsableInJava
    public static class cn_msg
    extends Struct {
        public misc.cb_id id;
        public @Unsigned int seq;
        public @Unsigned int ack;
        public @Unsigned short len;
        public @Unsigned short flags;
        public char @Size(value=0) [] data;
    }
}

