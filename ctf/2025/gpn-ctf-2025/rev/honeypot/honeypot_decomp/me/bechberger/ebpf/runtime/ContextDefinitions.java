/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ContextDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void context_destroy(Ptr<runtime.context> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int context_flip_pri(Ptr<DeviceDefinitions.device_domain_info> info2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int context_setup_pass_through_cb(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void context_struct_compute_av(Ptr<runtime.policydb> policydb2, Ptr<runtime.context> scontext, Ptr<runtime.context> tcontext, @Unsigned short tclass, Ptr<misc.av_decision> avd, Ptr<misc.extended_perms> xperms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int context_struct_to_string(Ptr<runtime.policydb> p, Ptr<runtime.context> context2, Ptr<String> scontext, Ptr<@Unsigned Integer> scontext_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int context_read_and_validate(Ptr<runtime.context> c, Ptr<runtime.policydb> p, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean context_tracking_recursion_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="context_compute_hash((const struct context*)$arg1)")
    public static @Unsigned int context_compute_hash(Ptr<runtime.context> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int context_to_sid(Ptr<runtime.sidtab> s2, Ptr<runtime.context> context2, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __context_flush_dev_iotlb(Ptr<DeviceDefinitions.device_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct context_entry")
    @NotUsableInJava
    public static class context_entry
    extends Struct {
        public @Unsigned long lo;
        public @Unsigned long hi;
    }

    @Type(noCCodeGeneration=true, cType="enum context_of_audit_context")
    public static enum context_of_audit_context implements Enum<context_of_audit_context>,
    TypedEnum<context_of_audit_context, Integer>
    {
        AUDIT_CTX_UNUSED,
        AUDIT_CTX_SYSCALL,
        AUDIT_CTX_URING;

    }

    @Type(noCCodeGeneration=true, cType="struct context_tracking")
    @NotUsableInJava
    public static class context_tracking
    extends Struct {
        public boolean active;
        public int recursion;
        public AtomicDefinitions.atomic_t state;
        public long nesting;
        public long nmi_nesting;
    }
}

