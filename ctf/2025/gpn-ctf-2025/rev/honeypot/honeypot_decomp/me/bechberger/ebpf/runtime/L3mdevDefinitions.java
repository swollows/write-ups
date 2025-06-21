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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class L3mdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int l3mdev_fib_rule_match(Ptr<runtime.net> net2, Ptr<runtime.flowi> fl, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int l3mdev_fib_table_by_index(Ptr<runtime.net> net2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="l3mdev_fib_table_rcu((const struct net_device*)$arg1)")
    public static @Unsigned int l3mdev_fib_table_rcu(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int l3mdev_ifindex_lookup_by_table_id(l3mdev_type l3type, Ptr<runtime.net> net2, @Unsigned int table_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> l3mdev_link_scope_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi6> fl6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="l3mdev_master_ifindex_rcu((const struct net_device*)$arg1)")
    public static int l3mdev_master_ifindex_rcu(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int l3mdev_master_upper_ifindex_by_index_rcu(Ptr<runtime.net> net2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int l3mdev_table_lookup_register(l3mdev_type l3type, @OriginalName(value="lookup_by_table_id_t") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void l3mdev_table_lookup_unregister(l3mdev_type l3type, @OriginalName(value="lookup_by_table_id_t") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void l3mdev_update_flow(Ptr<runtime.net> net2, Ptr<runtime.flowi> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct l3mdev_handler")
    @NotUsableInJava
    public static class l3mdev_handler
    extends Struct {
        public @OriginalName(value="lookup_by_table_id_t") Ptr<?> dev_lookup;
    }

    @Type(noCCodeGeneration=true, cType="enum l3mdev_type")
    public static enum l3mdev_type implements Enum<l3mdev_type>,
    TypedEnum<l3mdev_type, Integer>
    {
        L3MDEV_TYPE_UNSPEC,
        L3MDEV_TYPE_VRF,
        __L3MDEV_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct l3mdev_ops")
    @NotUsableInJava
    public static class l3mdev_ops
    extends Struct {
        public Ptr<?> l3mdev_fib_table;
        public Ptr<?> l3mdev_l3_rcv;
        public Ptr<?> l3mdev_l3_out;
        public Ptr<?> l3mdev_link_scope_lookup;
    }
}

