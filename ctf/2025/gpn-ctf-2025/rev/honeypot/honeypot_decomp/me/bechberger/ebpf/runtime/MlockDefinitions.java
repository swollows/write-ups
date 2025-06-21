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
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MlockDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.lruvec> __mlock_folio(Ptr<runtime.folio> folio2, Ptr<runtime.lruvec> lruvec2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.lruvec> __mlock_new_folio(Ptr<runtime.folio> folio2, Ptr<runtime.lruvec> lruvec2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mlock_drain_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mlock_drain_remote(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mlock_fixup(Ptr<VmaDefinitions.vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start, @Unsigned long end, @Unsigned @OriginalName(value="vm_flags_t") long newflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mlock_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mlock_folio_batch(Ptr<FolioDefinitions.folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mlock_new_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mlock_pte_range(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mlock_future_ok(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long flags, @Unsigned long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mlock_fbatch")
    @NotUsableInJava
    public static class mlock_fbatch
    extends Struct {
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p lock;
        public FolioDefinitions.folio_batch fbatch;
    }
}

