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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GroDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NapiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long napi_defer_hard_irqs_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="napi_defer_hard_irqs_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long napi_defer_hard_irqs_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> napi_frags_skb(Ptr<napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> napi_get_frags(Ptr<napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_gro_complete(Ptr<napi_struct> napi, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_gro_flush(Ptr<napi_struct> napi, boolean flush_old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="gro_result_t") GroDefinitions.gro_result napi_gro_frags(Ptr<napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="gro_result_t") GroDefinitions.gro_result napi_gro_receive(Ptr<napi_struct> napi, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_reuse_skb(Ptr<napi_struct> napi, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __napi_alloc_frag_align(@Unsigned int fragsz, @Unsigned int align_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __napi_build_skb(Ptr<?> data, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__napi_busy_loop($arg1, (_Bool (*)(void*, long unsigned int))$arg2, $arg3, $arg4, $arg5)")
    public static void __napi_busy_loop(@Unsigned int napi_id, Ptr<?> loop_end, Ptr<?> loop_end_arg, @Unsigned int flags, @Unsigned short budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __napi_kfree_skb(Ptr<SkDefinitions.sk_buff> skb, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __napi_poll(Ptr<napi_struct> n, Ptr<@OriginalName(value="bool") Boolean> repoll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __napi_schedule(Ptr<napi_struct> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __napi_schedule_irqoff(Ptr<napi_struct> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> napi_alloc_skb(Ptr<napi_struct> napi, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> napi_build_skb(Ptr<?> data, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="napi_busy_loop($arg1, (_Bool (*)(void*, long unsigned int))$arg2, $arg3, $arg4, $arg5)")
    public static void napi_busy_loop(@Unsigned int napi_id, Ptr<?> loop_end, Ptr<?> loop_end_arg, boolean prefer_busy_poll, @Unsigned short budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="napi_busy_loop_rcu($arg1, (_Bool (*)(void*, long unsigned int))$arg2, $arg3, $arg4, $arg5)")
    public static void napi_busy_loop_rcu(@Unsigned int napi_id, Ptr<?> loop_end, Ptr<?> loop_end_arg, boolean prefer_busy_poll, @Unsigned short budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<napi_struct> napi_by_id(@Unsigned int napi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean napi_complete_done(Ptr<napi_struct> n, int work_done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_consume_skb(Ptr<SkDefinitions.sk_buff> skb, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_disable(Ptr<napi_struct> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_enable(Ptr<napi_struct> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_get_frags_check(Ptr<napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int napi_kthread_create(Ptr<napi_struct> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean napi_pp_put_page(@Unsigned @OriginalName(value="netmem_ref") long netmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean napi_schedule_prep(Ptr<napi_struct> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> napi_skb_cache_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_skb_cache_put(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_skb_free_stolen_head(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int napi_threaded_poll(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void napi_threaded_poll_loop(Ptr<napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart napi_watchdog(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct napi_alloc_cache")
    @NotUsableInJava
    public static class napi_alloc_cache
    extends Struct {
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p bh_lock;
        public PageDefinitions.page_frag_cache page;
        public PageDefinitions.page_frag_1k page_small;
        public @Unsigned int skb_count;
        public Ptr<?> @Size(value=64) [] skb_cache;
    }

    @Type(noCCodeGeneration=true, cType="struct napi_gro_cb")
    @NotUsableInJava
    public static class napi_gro_cb
    extends Struct {
        @InlineUnion(value=25523)
        public  @InlineUnion(value=25523) AnonDefinitions.anon_member_of_anon_member_of_napi_gro_cb anon0$0;
        @InlineUnion(value=25523)
        public  @InlineUnion(value=25523) AnonDefinitions.anon_member_of_anon_member_of_napi_gro_cb anon0$1;
        public int data_offset;
        public @Unsigned short flush;
        public @Unsigned short count;
        public @Unsigned short proto;
        public @Unsigned short pad;
        @InlineUnion(value=25525)
        public  @InlineUnion(value=25525) AnonDefinitions.anon_member_of_anon_member_of_napi_gro_cb_and_zeroed_of_anon_member_of_napi_gro_cb anon6$0;
        @InlineUnion(value=25525)
        public  @InlineUnion(value=25525) AnonDefinitions.anon_member_of_anon_member_of_napi_gro_cb_and_zeroed_of_anon_member_of_napi_gro_cb zeroed;
        public @Unsigned @OriginalName(value="__wsum") int csum;
        @InlineUnion(value=25527)
        public  @InlineUnion(value=25527) AnonDefinitions.anon_member_of_anon_member_of_napi_gro_cb anon8$0;
        @InlineUnion(value=25527)
        public @InlineUnion(value=25527) @Unsigned short @Size(value=2) [] network_offsets;
    }

    @Type(noCCodeGeneration=true, cType="struct napi_struct")
    @NotUsableInJava
    public static class napi_struct
    extends Struct {
        public ListDefinitions.list_head poll_list;
        public @Unsigned long state;
        public int weight;
        public @Unsigned int defer_hard_irqs_count;
        public @Unsigned long gro_bitmask;
        public Ptr<?> poll;
        public int poll_owner;
        public int list_owner;
        public Ptr<NetDefinitions.net_device> dev;
        public GroDefinitions.gro_list @Size(value=8) [] gro_hash;
        public Ptr<SkDefinitions.sk_buff> skb;
        public ListDefinitions.list_head rx_list;
        public int rx_count;
        public @Unsigned int napi_id;
        public runtime.hrtimer timer;
        public Ptr<TaskDefinitions.task_struct> thread;
        public ListDefinitions.list_head dev_list;
        public misc.hlist_node napi_hash_node;
        public int irq;
    }
}

