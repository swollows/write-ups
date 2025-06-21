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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MpageDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpage_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_map_and_submit_buffers(Ptr<mpage_da_data> mpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_map_and_submit_extent(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<mpage_da_data> mpd, Ptr<@OriginalName(value="bool") Boolean> give_up_on_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_map_one_extent(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<mpage_da_data> mpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_prepare_extent_to_map(Ptr<mpage_da_data> mpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_process_folio(Ptr<mpage_da_data> mpd, Ptr<runtime.folio> folio2, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> m_lblk, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> m_pblk, Ptr<@OriginalName(value="bool") Boolean> map_bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_process_page_bufs(Ptr<mpage_da_data> mpd, Ptr<BufferDefinitions.buffer_head> head, Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpage_release_unused_pages(Ptr<mpage_da_data> mpd, boolean invalidate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_submit_folio(Ptr<mpage_da_data> mpd, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mpage_writepage(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpage_read_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_read_folio(Ptr<runtime.folio> folio2, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpage_readahead(Ptr<misc.readahead_control> rac, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpage_write_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpage_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mpage_data")
    @NotUsableInJava
    public static class mpage_data
    extends Struct {
        public Ptr<runtime.bio> bio;
        public @Unsigned @OriginalName(value="sector_t") long last_block_in_bio;
        public Ptr<?> get_block;
    }

    @Type(noCCodeGeneration=true, cType="struct mpage_readpage_args")
    @NotUsableInJava
    public static class mpage_readpage_args
    extends Struct {
        public Ptr<runtime.bio> bio;
        public Ptr<runtime.folio> folio;
        public @Unsigned int nr_pages;
        public boolean is_readahead;
        public @Unsigned @OriginalName(value="sector_t") long last_block_in_bio;
        public BufferDefinitions.buffer_head map_bh;
        public @Unsigned long first_logical_block;
        public Ptr<?> get_block;
    }

    @Type(noCCodeGeneration=true, cType="struct mpage_da_data")
    @NotUsableInJava
    public static class mpage_da_data
    extends Struct {
        public Ptr<runtime.inode> inode;
        public Ptr<WritebackDefinitions.writeback_control> wbc;
        public @Unsigned int can_map;
        public @Unsigned long first_page;
        public @Unsigned long next_page;
        public @Unsigned long last_page;
        public Ext4Definitions.ext4_map_blocks map;
        public Ext4Definitions.ext4_io_submit io_submit;
        public @Unsigned int do_map;
        public @Unsigned int scanned_until_end;
        public @Unsigned int journalled_more_data;
    }
}

