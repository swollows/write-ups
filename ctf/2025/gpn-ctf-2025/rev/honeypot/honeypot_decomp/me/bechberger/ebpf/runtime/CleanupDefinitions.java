/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiphpDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class CleanupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cleanup_mnt(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_group_ids(Ptr<runtime.mount> mnt, Ptr<runtime.mount> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_highmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_mnt(Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_prefix_route(Ptr<Inet6Definitions.inet6_ifaddr> ifp, @Unsigned long expires, boolean del_rt, boolean del_peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_srcu_struct(Ptr<SrcuDefinitions.srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cleanup_sighand(Ptr<misc.sighand_struct> sighand) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_bridge(Ptr<AcpiphpDefinitions.acpiphp_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_encrypted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_uevent_env(Ptr<misc.subprocess_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_glue_dir(Ptr<runtime.device> dev, Ptr<runtime.kobject> glue_dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_mapped_device(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_net(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cleanup_offline_cgwb(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)__cleanup_nmi($arg1, $arg2))")
    public static Ptr<?> __cleanup_nmi(@Unsigned int irq, Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cleanup_dev(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_offline_cgwbs_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_tis() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cleanup_trusted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum cleanup_prefix_rt_t")
    public static enum cleanup_prefix_rt_t implements Enum<cleanup_prefix_rt_t>,
    TypedEnum<cleanup_prefix_rt_t, Integer>
    {
        CLEANUP_PREFIX_RT_NOP,
        CLEANUP_PREFIX_RT_DEL,
        CLEANUP_PREFIX_RT_EXPIRE;

    }
}

