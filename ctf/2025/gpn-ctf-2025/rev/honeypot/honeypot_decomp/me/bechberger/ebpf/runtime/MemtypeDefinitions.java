/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class MemtypeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_check_insert(Ptr<runtime.memtype> entry_new, Ptr<PageDefinitions.page_cache_mode> ret_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_copy_nth_element(Ptr<runtime.memtype> entry_out, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.memtype> memtype_erase(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.memtype> memtype_lookup(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.memtype> memtype_match(@Unsigned long start, @Unsigned long end, int match_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_free(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memtype_free_io(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.memtype> memtype_get_idx(@OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_kernel_map_sync(@Unsigned long base, @Unsigned long size, PageDefinitions.page_cache_mode pcm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_reserve(@Unsigned long start, @Unsigned long end, PageDefinitions.page_cache_mode req_type, Ptr<PageDefinitions.page_cache_mode> new_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_reserve_io(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end, Ptr<PageDefinitions.page_cache_mode> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> memtype_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_seq_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memtype_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> memtype_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memtype_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }
}

