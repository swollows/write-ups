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
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HugepageDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hugepage_movable_supported(Ptr<runtime.hstate> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<hugepage_subpool> hugepage_new_subpool(Ptr<runtime.hstate> h, long max_hpages, long min_hpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugepage_put_subpool(Ptr<hugepage_subpool> spool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hugepage_subpool_get_pages(Ptr<hugepage_subpool> spool, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hugepage_subpool_put_pages(Ptr<hugepage_subpool> spool, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugepage_madvise(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<@Unsigned Long> vm_flags, int advice) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hugepage_pmd_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugepage_vma_revalidate(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long address, boolean expect_anon, Ptr<Ptr<VmDefinitions.vm_area_struct>> vmap, Ptr<misc.collapse_control> cc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugepage_exit_sysfs(Ptr<runtime.kobject> hugepage_kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugepage_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hugepage_subpool")
    @NotUsableInJava
    public static class hugepage_subpool
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public long count;
        public long max_hpages;
        public long used_hpages;
        public Ptr<runtime.hstate> hstate;
        public long min_hpages;
        public long rsv_hpages;
    }
}

