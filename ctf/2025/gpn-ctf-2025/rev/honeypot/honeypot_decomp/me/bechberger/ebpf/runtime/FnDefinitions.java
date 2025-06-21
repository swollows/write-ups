/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class FnDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fn_trie_dump_leaf(Ptr<KeyDefinitions.key_vector> l, Ptr<FibDefinitions.fib_table> tb, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<FibDefinitions.fib_dump_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_bare_num(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_boot_it(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_caps_on(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_caps_toggle(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_compose(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_dec_console(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_enter(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_hold(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_inc_console(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_lastcons(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_null(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_num(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_scroll_back(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_scroll_forw(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_send_intr(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_show_mem(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_show_ptregs(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_show_state(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fn_spawn_con(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

