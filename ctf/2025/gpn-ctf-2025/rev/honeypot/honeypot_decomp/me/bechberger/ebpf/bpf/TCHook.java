/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import java.util.List;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.bpf.NetworkUtil;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.type.Ptr;

public interface TCHook {
    @BPFFunction(section="tc")
    @NotUsableInJava
    default public SkDefinitions.__sk_action tcHandleIngress(Ptr<SkDefinitions.__sk_buff> packet) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(section="tc")
    @NotUsableInJava
    default public SkDefinitions.__sk_action tcHandleEgress(Ptr<SkDefinitions.__sk_buff> packet) {
        while (true) {
            // Infinite loop
        }
    }

    default public void tcAttachIngress(int ifindex) {
        this.tcAttachIngress(List.of((Object)ifindex));
    }

    default public void tcAttachIngress(List<Integer> ifindexes) {
        TCHook tCHook = this;
        if (!(tCHook instanceof BPFProgram)) {
            throw new IllegalStateException("This is not a BPF program");
        }
        BPFProgram program = (BPFProgram)((Object)tCHook);
        program.tcAttach(program.getProgramByName("tcHandleIngress"), ifindexes, true);
    }

    default public void tcAttachIngress() {
        this.tcAttachIngress(NetworkUtil.getNetworkInterfaceIndexes());
    }

    default public void tcAttachEgress(int ifindex) {
        this.tcAttachEgress(List.of((Object)ifindex));
    }

    default public void tcAttachEgress(List<Integer> ifindexes) {
        TCHook tCHook = this;
        if (!(tCHook instanceof BPFProgram)) {
            throw new IllegalStateException("This is not a BPF program");
        }
        BPFProgram program = (BPFProgram)((Object)tCHook);
        program.tcAttach(program.getProgramByName("tcHandleEgress"), ifindexes, false);
    }

    default public void tcAttachEgress() {
        this.tcAttachEgress(NetworkUtil.getNetworkInterfaceIndexes());
    }
}

