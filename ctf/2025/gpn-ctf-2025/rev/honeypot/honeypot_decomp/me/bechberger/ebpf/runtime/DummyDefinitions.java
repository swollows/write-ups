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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DummyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_regulator_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_set_flag(Ptr<TraceDefinitions.trace_array> tr, @Unsigned int old_flags, @Unsigned int bit, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummy_sysfs_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_ops_test_ret_function(Ptr<BpfDefinitions.bpf_dummy_ops_state> state2, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dummy_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int dummy_cmp(Ptr<?> p1, Ptr<?> p2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_icmpv6_err_convert(char type2, char code2, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummy_ip6_datagram_recv_ctl(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dummy_ipv6_chk_addr($arg1, (const struct in6_addr*)$arg2, (const struct net_device*)$arg3, $arg4)")
    public static int dummy_ipv6_chk_addr(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummy_ipv6_icmp_error(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int err, @Unsigned @OriginalName(value="__be16") short port2, @Unsigned int info2, Ptr<Character> payload) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_ipv6_recv_error(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int len, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dummy_ack(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dummy_clock_read(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_numa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dummy_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 nbytes; u8 buswidth; u8 dtr; u8 __pad; }")
    @NotUsableInJava
    public static class dummy_of_spi_mem_op
    extends Struct {
        public char nbytes;
        public char buswidth;
        public char dtr;
        public char __pad;
    }
}

