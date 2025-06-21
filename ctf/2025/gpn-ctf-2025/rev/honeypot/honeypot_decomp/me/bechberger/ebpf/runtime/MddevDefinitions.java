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
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class MddevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mddev_put(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mddev_resume(Ptr<runtime.mddev> mddev2, boolean recovery_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mddev> mddev_alloc(@Unsigned @OriginalName(value="dev_t") int unit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_create_serial_pool(Ptr<runtime.mddev> mddev2, Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_delayed_delete(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_destroy(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_destroy_serial_pool(Ptr<runtime.mddev> mddev2, Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_detach(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mddev> mddev_get(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mddev_init(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_put(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_resume(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mddev_set_closing_and_sync_blockdev(Ptr<runtime.mddev> mddev2, int opener_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mddev_stack_new_rdev(Ptr<runtime.mddev> mddev2, Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mddev_stack_rdev_limits(Ptr<runtime.mddev> mddev2, Ptr<QueueDefinitions.queue_limits> lim, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mddev_suspend(Ptr<runtime.mddev> mddev2, boolean interruptible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mddev_suspend_and_lock(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_unlock(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_unlock_and_resume(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_update_io_opt(Ptr<runtime.mddev> mddev2, @Unsigned int nr_stripes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mddev_set_bitmap_ops(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum mddev_sb_flags")
    public static enum mddev_sb_flags implements Enum<mddev_sb_flags>,
    TypedEnum<mddev_sb_flags, Integer>
    {
        MD_SB_CHANGE_DEVS,
        MD_SB_CHANGE_CLEAN,
        MD_SB_CHANGE_PENDING,
        MD_SB_NEED_REWRITE;

    }

    @Type(noCCodeGeneration=true, cType="enum mddev_flags")
    public static enum mddev_flags implements Enum<mddev_flags>,
    TypedEnum<mddev_flags, Integer>
    {
        MD_ARRAY_FIRST_USE,
        MD_CLOSING,
        MD_JOURNAL_CLEAN,
        MD_HAS_JOURNAL,
        MD_CLUSTER_RESYNC_LOCKED,
        MD_FAILFAST_SUPPORTED,
        MD_HAS_PPL,
        MD_HAS_MULTIPLE_PPLS,
        MD_NOT_READY,
        MD_BROKEN,
        MD_DELETED;

    }
}

