/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class TruncateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int truncate_bdev_range(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_cleanup_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int truncate_error_folio(Ptr<runtime.folio> folio2, @Unsigned long pfn, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_folio_batch_exceptionals(Ptr<misc.address_space> mapping, Ptr<FolioDefinitions.folio_batch> fbatch, Ptr<@Unsigned Long> indices) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int truncate_inode_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_inode_pages(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long lstart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_inode_pages_final(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_inode_pages_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean truncate_inode_partial_folio(Ptr<runtime.folio> folio2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_pagecache(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long newsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_pagecache_range(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void truncate_setsize(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long newsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int truncate_upper(Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> ia, Ptr<runtime.iattr> lower_ia) {
        throw new MethodIsBPFRelatedFunction();
    }
}

