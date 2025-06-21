/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import java.util.List;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.bpf.NetworkUtil;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.type.Ptr;

public interface XDPHook {
    public static final short ETH_P_8021Q = -32512;
    public static final short ETH_P_8021AD = -30552;
    public static final short ETH_P_IP = 2048;
    public static final int ETH_P_IPV6 = 34525;
    public static final short ETH_P_ARP = 2054;

    @BPFFunction(section="xdp")
    @NotUsableInJava
    public XdpDefinitions.xdp_action xdpHandlePacket(Ptr<XdpDefinitions.xdp_md> var1);

    default public void xdpAttach(List<Integer> ifindexes) {
        XDPHook xDPHook = this;
        if (!(xDPHook instanceof BPFProgram)) {
            throw new IllegalStateException("This is not a BPF program");
        }
        BPFProgram program = (BPFProgram)((Object)xDPHook);
        program.xdpAttach(program.getProgramByName("xdpHandlePacket"), ifindexes);
    }

    default public void xdpAttach(int ifindex) {
        this.xdpAttach(List.of((Object)ifindex));
    }

    default public void xdpAttach() {
        this.xdpAttach(NetworkUtil.getNetworkInterfaceIndexes());
    }

    @BuiltinBPFFunction
    @NotUsableInJava
    public static short bpf_htons(short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction
    @NotUsableInJava
    public static long bpf_htonl(int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction
    @NotUsableInJava
    public static int bpf_ntohl(int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction
    @NotUsableInJava
    public static long bpf_cpu_to_be64(long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction
    @NotUsableInJava
    public static long bpf_be64_to_cpu(long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction
    @NotUsableInJava
    public static short bpf_ntohs(short value) {
        throw new MethodIsBPFRelatedFunction();
    }
}

