/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.BPFInterface;
import me.bechberger.ebpf.annotations.bpf.InternalBody;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;

@BPFInterface
@InternalBody(value="\n\nenum CGroupAction {\n  CGROUP_PASS = 0,\n  CGROUP_DROP = 1\n};")
public interface CGroupHook {
    @BPFFunction(section="cgroup_skb/ingress")
    @NotUsableInJava
    default public CGroupAction cgroupHandleIngress(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(section="cgroup_skb/egress")
    @NotUsableInJava
    default public CGroupAction cgroupHandleEgress(Ptr<SkDefinitions.__sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    default public void cgroupAttachIngress(String cgroupName) {
        CGroupHook cGroupHook = this;
        if (!(cGroupHook instanceof BPFProgram)) {
            throw new IllegalStateException("Cannot attach cgroup hooks to non-BPFProgram");
        }
        BPFProgram program = (BPFProgram)((Object)cGroupHook);
        program.cgroupAttach(program.getProgramByName("cgroupHandleIngress"), cgroupName);
    }

    default public void cgroupAttachIngress() {
        this.cgroupAttachIngress("user.slice");
    }

    default public void cgroupAttachEgress(String cgroupName) {
        CGroupHook cGroupHook = this;
        if (!(cGroupHook instanceof BPFProgram)) {
            throw new IllegalStateException("Cannot attach cgroup hooks to non-BPFProgram");
        }
        BPFProgram program = (BPFProgram)((Object)cGroupHook);
        program.cgroupAttach(program.getProgramByName("cgroupHandleEgress"), cgroupName);
    }

    default public void cgroupAttachEgress() {
        this.cgroupAttachEgress("user.slice");
    }

    @Type
    public static enum CGroupAction implements Enum<CGroupAction>
    {
        DROP,
        PASS;

    }
}

