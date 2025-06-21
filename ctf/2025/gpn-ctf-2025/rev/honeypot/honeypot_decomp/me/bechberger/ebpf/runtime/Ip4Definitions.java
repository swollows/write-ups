/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class Ip4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_addr_string($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static String ip4_addr_string(String buf, String end, Ptr<Character> addr2, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_addr_string_sa($arg1, $arg2, (const struct sockaddr_in*)$arg3, $arg4, (const u8*)$arg5)")
    public static String ip4_addr_string_sa(String buf, String end, Ptr<misc.sockaddr_in> sa, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip4_frag_free(Ptr<InetDefinitions.inet_frag_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_frag_init($arg1, (const void*)$arg2)")
    public static void ip4_frag_init(Ptr<InetDefinitions.inet_frag_queue> q, Ptr<?> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_key_hashfn((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int ip4_key_hashfn(Ptr<?> data, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_obj_cmpfn($arg1, (const void*)$arg2)")
    public static int ip4_obj_cmpfn(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_obj_hashfn((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int ip4_obj_hashfn(Ptr<?> data, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip4_string($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static String ip4_string(String p, Ptr<Character> addr2, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip4_datagram_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip4_datagram_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip4_datagram_release_cb(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }
}

