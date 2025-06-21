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
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class WritebackDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __writeback_inodes_sb_nr(Ptr<SuperDefinitions.super_block> sb, @Unsigned long nr, WbDefinitions.wb_reason reason, boolean skip_if_busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __writeback_inodes_wb(Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __writeback_single_inode(Ptr<runtime.inode> inode2, Ptr<writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> writeback_get_folio(Ptr<misc.address_space> mapping, Ptr<writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void writeback_inodes_sb(Ptr<SuperDefinitions.super_block> sb, WbDefinitions.wb_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void writeback_inodes_sb_nr(Ptr<SuperDefinitions.super_block> sb, @Unsigned long nr, WbDefinitions.wb_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> writeback_iter(Ptr<misc.address_space> mapping, Ptr<writeback_control> wbc, Ptr<runtime.folio> folio2, Ptr<Integer> error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long writeback_sb_inodes(Ptr<SuperDefinitions.super_block> sb, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void writeback_set_ratelimit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int writeback_single_inode(Ptr<runtime.inode> inode2, Ptr<writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum writeback_sync_modes")
    public static enum writeback_sync_modes implements Enum<writeback_sync_modes>,
    TypedEnum<writeback_sync_modes, Integer>
    {
        WB_SYNC_NONE,
        WB_SYNC_ALL;

    }

    @Type(noCCodeGeneration=true, cType="struct writeback_control")
    @NotUsableInJava
    public static class writeback_control
    extends Struct {
        public long nr_to_write;
        public long pages_skipped;
        public @OriginalName(value="loff_t") long range_start;
        public @OriginalName(value="loff_t") long range_end;
        public writeback_sync_modes sync_mode;
        public @Unsigned int for_kupdate;
        public @Unsigned int for_background;
        public @Unsigned int tagged_writepages;
        public @Unsigned int for_reclaim;
        public @Unsigned int range_cyclic;
        public @Unsigned int for_sync;
        public @Unsigned int unpinned_netfs_wb;
        public @Unsigned int no_cgroup_owner;
        public Ptr<Ptr<SwapDefinitions.swap_iocb>> swap_plug;
        public Ptr<ListDefinitions.list_head> list;
        public FolioDefinitions.folio_batch fbatch;
        public @Unsigned long index;
        public int saved_err;
        public Ptr<BdiDefinitions.bdi_writeback> wb;
        public Ptr<runtime.inode> inode;
        public int wb_id;
        public int wb_lcand_id;
        public int wb_tcand_id;
        public @Unsigned long wb_bytes;
        public @Unsigned long wb_lcand_bytes;
        public @Unsigned long wb_tcand_bytes;
    }
}

