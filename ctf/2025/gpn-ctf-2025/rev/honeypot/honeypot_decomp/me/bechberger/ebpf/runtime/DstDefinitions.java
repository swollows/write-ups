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
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PhysDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.VirtDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class DstDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_cache_destroy(Ptr<dst_cache> dst_cache2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dst_entry> dst_cache_get(Ptr<dst_cache> dst_cache2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rtable> dst_cache_get_ip4(Ptr<dst_cache> dst_cache2, Ptr<@Unsigned @OriginalName(value="__be32") Integer> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dst_entry> dst_cache_get_ip6(Ptr<dst_cache> dst_cache2, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dst_cache_init(Ptr<dst_cache> dst_cache2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_cache_per_cpu_dst_set(Ptr<dst_cache_pcpu> dst_cache2, Ptr<dst_entry> dst, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dst_entry> dst_cache_per_cpu_get(Ptr<dst_cache> dst_cache2, Ptr<dst_cache_pcpu> idst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_cache_reset_now(Ptr<dst_cache> dst_cache2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_cache_set_ip4(Ptr<dst_cache> dst_cache2, Ptr<dst_entry> dst, @Unsigned @OriginalName(value="__be32") int saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dst_cache_set_ip6($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static void dst_cache_set_ip6(Ptr<dst_cache> dst_cache2, Ptr<dst_entry> dst, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dst_copy_metrics($arg1, (const struct dst_entry*)$arg2)")
    public static void dst_copy_metrics(Ptr<dst_entry> dest, Ptr<dst_entry> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dst_discard(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dst_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dst_destroy_metrics_generic(Ptr<dst_entry> dst, @Unsigned long old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dst_alloc(Ptr<dst_ops> ops, Ptr<NetDefinitions.net_device> dev, int initial_obsolete, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dst_entry> dst_blackhole_check(Ptr<dst_entry> dst, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> dst_blackhole_cow_metrics(Ptr<dst_entry> dst, @Unsigned long old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dst_blackhole_mtu((const struct dst_entry*)$arg1)")
    public static @Unsigned int dst_blackhole_mtu(Ptr<dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dst_blackhole_neigh_lookup((const struct dst_entry*)$arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.neighbour> dst_blackhole_neigh_lookup(Ptr<dst_entry> dst, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_blackhole_redirect(Ptr<dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_blackhole_update_pmtu(Ptr<dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, boolean confirm_neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> dst_cow_metrics_generic(Ptr<dst_entry> dst, @Unsigned long old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_destroy(Ptr<dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_destroy_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_dev_put(Ptr<dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dst_discard_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dst_entries_init(Ptr<dst_ops> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_init(Ptr<dst_entry> dst, Ptr<dst_ops> ops, Ptr<NetDefinitions.net_device> dev, int initial_obsolete, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_release(Ptr<dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dst_release_immediate(Ptr<dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dst_cache_pcpu")
    @NotUsableInJava
    public static class dst_cache_pcpu
    extends Struct {
        public @Unsigned long refresh_ts;
        public Ptr<dst_entry> dst;
        public @Unsigned int cookie;
        @InlineUnion(value=34115)
        public  @InlineUnion(value=34115) InDefinitions.in_addr in_saddr;
        @InlineUnion(value=34115)
        public  @InlineUnion(value=34115) In6Definitions.in6_addr in6_saddr;
    }

    @Type(noCCodeGeneration=true, cType="struct { union nf_inet_addr u3; union { short unsigned int all; struct { short unsigned int port; } tcp; struct { short unsigned int port; } udp; struct { u8 type; u8 code; } icmp; struct { short unsigned int port; } dccp; struct { short unsigned int port; } sctp; struct { short unsigned int key; } gre; }; u8 protonum; struct { } __nfct_hash_offsetend; u8 dir; }")
    @NotUsableInJava
    public static class dst_of_nf_conntrack_tuple
    extends Struct {
        public NfDefinitions.nf_inet_addr u3;
        public UDefinitions.u_of_dst_of_nf_conntrack_tuple u;
        public @OriginalName(value="u_int8_t") char protonum;
        public misc.lockdep_map_p __nfct_hash_offsetend;
        public @OriginalName(value="u_int8_t") char dir;
    }

    @Type(noCCodeGeneration=true, cType="struct dst_cache")
    @NotUsableInJava
    public static class dst_cache
    extends Struct {
        public Ptr<dst_cache_pcpu> cache;
        public @Unsigned long reset_ts;
    }

    @Type(noCCodeGeneration=true, cType="struct dst_metrics")
    @NotUsableInJava
    public static class dst_metrics
    extends Struct {
        public @Unsigned int @Size(value=17) [] metrics;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int ip4; struct in6_addr ip6; u8 mac_addr[6]; }")
    @NotUsableInJava
    public static class dst_of_br_ip_and_u_of_addr_of_br_mdb_entry
    extends Union {
        public @Unsigned @OriginalName(value="__be32") int ip4;
        public In6Definitions.in6_addr ip6;
        public char @Size(value=6) [] mac_addr;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { struct page *page; long unsigned int offset; } phys; struct { u8 *page; void *addr; } virt; }")
    @NotUsableInJava
    public static class dst_of_skcipher_walk_and_src_of_skcipher_walk
    extends Union {
        public PhysDefinitions.phys_of_dst_of_skcipher_walk_and_src_of_skcipher_walk phys;
        public VirtDefinitions.virt_of_dst_of_skcipher_walk_and_src_of_skcipher_walk virt;
    }

    @Type(noCCodeGeneration=true, cType="struct dst_entry")
    @NotUsableInJava
    public static class dst_entry
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<dst_ops> ops;
        public @Unsigned long _metrics;
        public @Unsigned long expires;
        public Ptr<XfrmDefinitions.xfrm_state> xfrm;
        public Ptr<?> input;
        public Ptr<?> output;
        public @Unsigned short flags;
        public short obsolete;
        public @Unsigned short header_len;
        public @Unsigned short trailer_len;
        public misc.rcuref_t __rcuref;
        public int __use;
        public @Unsigned long lastuse;
        public misc.callback_head callback_head;
        public short error;
        public short __pad;
        public @Unsigned int tclassid;
        public  @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public ListDefinitions.list_head rt_uncached;
        public Ptr<misc.uncached_list> rt_uncached_list;
        public Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate;
    }

    @Type(noCCodeGeneration=true, cType="struct dst_ops")
    @NotUsableInJava
    public static class dst_ops
    extends Struct {
        public @Unsigned short family;
        public @Unsigned int gc_thresh;
        public Ptr<?> gc;
        public Ptr<?> check;
        public Ptr<?> default_advmss;
        public Ptr<?> mtu;
        public Ptr<?> cow_metrics;
        public Ptr<?> destroy;
        public Ptr<?> ifdown;
        public Ptr<?> negative_advice;
        public Ptr<?> link_failure;
        public Ptr<?> update_pmtu;
        public Ptr<?> redirect;
        public Ptr<?> local_out;
        public Ptr<?> neigh_lookup;
        public Ptr<?> confirm_neigh;
        public Ptr<KmemDefinitions.kmem_cache> kmem_cachep;
        public PercpuDefinitions.percpu_counter pcpuc_entries;
    }
}

