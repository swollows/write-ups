/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.JournalDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Jbd2Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_journal_file_buffer(Ptr<JournalDefinitions.journal_head> jh, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2, int jlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __jbd2_journal_refile_buffer(Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_journal_temp_unlink_buffer(Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_journal_unreserve_handle(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_buffer_abort_trigger(Ptr<JournalDefinitions.journal_head> jh, Ptr<jbd2_buffer_trigger_type> triggers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_buffer_frozen_trigger(Ptr<JournalDefinitions.journal_head> jh, Ptr<?> mapped_data, Ptr<jbd2_buffer_trigger_type> triggers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_freeze_jh_data(Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_handle_buffer_credits(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_begin_ordered_truncate(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<jbd2_inode> jinode, @OriginalName(value="loff_t") long new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_transaction_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_dirty_metadata(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_extend(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, int nblocks, int revoke_records) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_file_buffer(Ptr<JournalDefinitions.journal_head> jh, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2, int jlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_file_inode(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<jbd2_inode> jinode, @Unsigned long flags, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_forget(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_free_reserved(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_free_transaction(Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_get_create_access(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_get_undo_access(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_get_write_access(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_init_transaction_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_inode_ranged_wait(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<jbd2_inode> jinode, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_inode_ranged_write(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<jbd2_inode> jinode, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_invalidate_folio(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_lock_updates(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_refile_buffer(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_restart(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, int nblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_set_triggers(Ptr<BufferDefinitions.buffer_head> bh, Ptr<jbd2_buffer_trigger_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> jbd2_journal_start(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int nblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_start_reserved(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, @Unsigned int type2, @Unsigned int line_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_stop(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean jbd2_journal_try_to_free_buffers(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_unfile_buffer(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_unlock_updates(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_wait_updates(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean jbd2_write_access_granted(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<BufferDefinitions.buffer_head> bh, boolean undo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_clear_buffer_revoked_flags(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean jbd2_commit_block_csum_verify_partial(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> j, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_descriptor_block_csum_verify(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> j, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_cancel_revoke(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_clear_revoke(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_revoke(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_revoke_record_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_revoke_table(Ptr<jbd2_revoke_table_s> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_revoke_table_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_init_revoke(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int hash_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_init_revoke_record_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<jbd2_revoke_table_s> jbd2_journal_init_revoke_table(int hash_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_init_revoke_table_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_recover(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_revoke(Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> handle, @Unsigned long blocknr, Ptr<BufferDefinitions.buffer_head> bh_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_set_revoke(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long blocknr, @Unsigned @OriginalName(value="tid_t") int sequence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_skip_recovery(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_switch_revoke_table(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_test_revoke(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long blocknr, @Unsigned @OriginalName(value="tid_t") int sequence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_write_revoke_records(Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2, Ptr<ListDefinitions.list_head> log_bufs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __jbd2_fc_end_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid, boolean fallback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __jbd2_journal_erase(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __jbd2_journal_force_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __jbd2_log_start_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __jbd2_update_log_tail(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> jbd2_alloc(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_complete_transaction(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_descriptor_block_csum_set(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> j, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_fc_begin_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_fc_end_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_fc_end_commit_fallback(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_fc_get_buf(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<Ptr<BufferDefinitions.buffer_head>> bh_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_fc_release_bufs(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_fc_wait_bufs(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int num_blks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_free(Ptr<?> ptr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_abort(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int errno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_ack_err(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<JournalDefinitions.journal_head> jbd2_journal_add_journal_head(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_blocks_per_page(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_bmap(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long blocknr, Ptr<@Unsigned Long> retp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_check_available_features(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long compat, @Unsigned long ro, @Unsigned long incompat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_check_used_features(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long compat, @Unsigned long ro, @Unsigned long incompat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_clear_err(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_clear_features(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long compat, @Unsigned long ro, @Unsigned long incompat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_destroy(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_caches() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_errno(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_flush(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_force_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_force_commit_nested(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> jbd2_journal_get_descriptor_buffer(Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_get_log_tail(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@Unsigned @OriginalName(value="tid_t") Integer> tid, Ptr<@Unsigned Long> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<JournalDefinitions.journal_head> jbd2_journal_grab_journal_head(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> jbd2_journal_init_dev(Ptr<BlockDefinitions.block_device> bdev, Ptr<BlockDefinitions.block_device> fs_dev, @Unsigned long start, int len, int blocksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> jbd2_journal_init_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_init_jbd_inode(Ptr<jbd2_inode> jinode, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_init_transaction_limits(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_load(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_next_log_block(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@Unsigned Long> retp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_put_journal_head(Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_release_jbd_inode(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_set_features(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long compat, @Unsigned long ro, @Unsigned long incompat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long jbd2_journal_shrink_count(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long jbd2_journal_shrink_scan(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_start_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@Unsigned @OriginalName(value="tid_t") Integer> ptid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_update_sb_errno(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_update_sb_log_tail(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tail_tid, @Unsigned long tail_block, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_wipe(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_write_metadata_buffer(Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2, Ptr<JournalDefinitions.journal_head> jh_in, Ptr<Ptr<BufferDefinitions.buffer_head>> bh_out, @Unsigned @OriginalName(value="sector_t") long blocknr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_log_start_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_log_wait_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_mark_journal_empty(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_remove_jbd_stats_proc_entry() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> jbd2_seq_info_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_seq_info_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_seq_info_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_seq_info_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> jbd2_seq_info_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_seq_info_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_trans_will_send_data_barrier(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_transaction_committed(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_update_log_tail(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_write_superblock(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_journal_clean_checkpoint_list(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, jbd2_shrink_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_journal_drop_transaction(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_journal_insert_checkpoint(Ptr<JournalDefinitions.journal_head> jh, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> transaction2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __jbd2_journal_remove_checkpoint(Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jbd2_log_wait_for_space(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_cleanup_journal_tail(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_commit_transaction(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jbd2_journal_destroy_checkpoint(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_finish_inode_data_buffers(Ptr<jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long jbd2_journal_shrink_checkpoint_list(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@Unsigned Long> nr_to_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_journal_try_remove_checkpoint(Ptr<JournalDefinitions.journal_head> jh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_log_do_checkpoint(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_submit_inode_data(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jbd2_wait_inode_data(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_stats_proc_session")
    @NotUsableInJava
    public static class jbd2_stats_proc_session
    extends Struct {
        public Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal;
        public Ptr<misc.transaction_stats_s> stats;
        public int start;
        public int max;
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_revoke_record_s")
    @NotUsableInJava
    public static class jbd2_revoke_record_s
    extends Struct {
        public ListDefinitions.list_head hash;
        public @Unsigned @OriginalName(value="tid_t") int sequence;
        public @Unsigned long blocknr;
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_revoke_table_s")
    @NotUsableInJava
    public static class jbd2_revoke_table_s
    extends Struct {
        public int hash_size;
        public int hash_shift;
        public Ptr<ListDefinitions.list_head> hash_table;
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_journal_revoke_header_s")
    @NotUsableInJava
    public static class jbd2_journal_revoke_header_s
    extends Struct {
        public  @OriginalName(value="journal_header_t") JournalDefinitions.journal_header_s r_header;
        public @Unsigned @OriginalName(value="__be32") int r_count;
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_journal_block_tail")
    @NotUsableInJava
    public static class jbd2_journal_block_tail
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int t_checksum;
    }

    @Type(noCCodeGeneration=true, cType="enum jbd2_shrink_type")
    public static enum jbd2_shrink_type implements Enum<jbd2_shrink_type>,
    TypedEnum<jbd2_shrink_type, Integer>
    {
        JBD2_SHRINK_DESTROY,
        JBD2_SHRINK_BUSY_STOP,
        JBD2_SHRINK_BUSY_SKIP;

    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_inode")
    @NotUsableInJava
    public static class jbd2_inode
    extends Struct {
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> i_transaction;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> i_next_transaction;
        public ListDefinitions.list_head i_list;
        public Ptr<runtime.inode> i_vfs_inode;
        public @Unsigned long i_flags;
        public @OriginalName(value="loff_t") long i_dirty_start;
        public @OriginalName(value="loff_t") long i_dirty_end;
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_journal_handle")
    @NotUsableInJava
    public static class jbd2_journal_handle
    extends Struct {
        @InlineUnion(value=11259)
        public @InlineUnion(value=11259) Ptr<@OriginalName(value="transaction_t") misc.transaction_s> h_transaction;
        @InlineUnion(value=11259)
        public @InlineUnion(value=11259) Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> h_journal;
        public Ptr<@OriginalName(value="handle_t") jbd2_journal_handle> h_rsv_handle;
        public int h_total_credits;
        public int h_revoke_credits;
        public int h_revoke_credits_requested;
        public int h_ref;
        public int h_err;
        public @Unsigned int h_sync;
        public @Unsigned int h_jdata;
        public @Unsigned int h_reserved;
        public @Unsigned int h_aborted;
        public @Unsigned int h_type;
        public @Unsigned int h_line_no;
        public @Unsigned long h_start_jiffies;
        public @Unsigned int h_requested_credits;
        public @Unsigned int saved_alloc_context;
    }

    @Type(noCCodeGeneration=true, cType="struct jbd2_buffer_trigger_type")
    @NotUsableInJava
    public static class jbd2_buffer_trigger_type
    extends Struct {
        public Ptr<?> t_frozen;
        public Ptr<?> t_abort;
    }
}

