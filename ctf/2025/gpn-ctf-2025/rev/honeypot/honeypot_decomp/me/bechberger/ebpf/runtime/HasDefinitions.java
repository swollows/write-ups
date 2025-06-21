/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class HasDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_capability(Ptr<TaskDefinitions.task_struct> t, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_capability_noaudit(Ptr<TaskDefinitions.task_struct> t, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_extra_refcount(Ptr<PageDefinitions.page_state> ps, Ptr<runtime.page> p, boolean extra_pins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_locked_children(Ptr<runtime.mount> mnt, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_ns_capability(Ptr<TaskDefinitions.task_struct> t, Ptr<UserDefinitions.user_namespace> ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_ns_capability_noaudit(Ptr<TaskDefinitions.task_struct> t, Ptr<UserDefinitions.user_namespace> ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_bh_in_lru(int cpu2, Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_cap_mac_admin(boolean audit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_busy_rmid(Ptr<RdtDefinitions.rdt_mon_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="has_uuid_at_pos($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, $arg3, $arg4)")
    public static boolean has_uuid_at_pos(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<misc.uuid_t> uuid, @Unsigned long cookie, @Unsigned short pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_managed_dma() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_target_index() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> has_unmovable_pages(@Unsigned long start_pfn, @Unsigned long end_pfn, int migratetype2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean has_usable_swap() {
        throw new MethodIsBPFRelatedFunction();
    }
}

