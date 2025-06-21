/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class JournalDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_unmap_buffer(Ptr<@OriginalName(value="journal_t") journal_s> journal, Ptr<BufferDefinitions.buffer_head> bh, int partial_page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_check_superblock(Ptr<@OriginalName(value="journal_t") journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void journal_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="journal_t") journal_s> journal_init_common(Ptr<BlockDefinitions.block_device> bdev, Ptr<BlockDefinitions.block_device> fs_dev, @Unsigned long start, int len, int blocksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_load_superblock(Ptr<@OriginalName(value="journal_t") journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_reset(Ptr<@OriginalName(value="journal_t") journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long journal_tag_bytes(Ptr<@OriginalName(value="journal_t") journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void journal_end_buffer_io_sync(Ptr<BufferDefinitions.buffer_head> bh, int uptodate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long journal_shrink_one_cp_list(Ptr<journal_head> jh, Jbd2Definitions.jbd2_shrink_type type2, Ptr<@OriginalName(value="bool") Boolean> released) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_submit_commit_record(Ptr<@OriginalName(value="journal_t") journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction, Ptr<Ptr<BufferDefinitions.buffer_head>> cbh, @Unsigned int crc32_sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int journal_submit_data_buffers(Ptr<@OriginalName(value="journal_t") journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct journal_block_tag_s")
    @NotUsableInJava
    public static class journal_block_tag_s
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int t_blocknr;
        public @Unsigned @OriginalName(value="__be16") short t_checksum;
        public @Unsigned @OriginalName(value="__be16") short t_flags;
        public @Unsigned @OriginalName(value="__be32") int t_blocknr_high;
    }

    @Type(noCCodeGeneration=true, cType="struct journal_block_tag3_s")
    @NotUsableInJava
    public static class journal_block_tag3_s
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int t_blocknr;
        public @Unsigned @OriginalName(value="__be32") int t_flags;
        public @Unsigned @OriginalName(value="__be32") int t_blocknr_high;
        public @Unsigned @OriginalName(value="__be32") int t_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct journal_superblock_s")
    @NotUsableInJava
    public static class journal_superblock_s
    extends Struct {
        public @OriginalName(value="journal_header_t") journal_header_s s_header;
        public @Unsigned @OriginalName(value="__be32") int s_blocksize;
        public @Unsigned @OriginalName(value="__be32") int s_maxlen;
        public @Unsigned @OriginalName(value="__be32") int s_first;
        public @Unsigned @OriginalName(value="__be32") int s_sequence;
        public @Unsigned @OriginalName(value="__be32") int s_start;
        public @Unsigned @OriginalName(value="__be32") int s_errno;
        public @Unsigned @OriginalName(value="__be32") int s_feature_compat;
        public @Unsigned @OriginalName(value="__be32") int s_feature_incompat;
        public @Unsigned @OriginalName(value="__be32") int s_feature_ro_compat;
        public char @Size(value=16) [] s_uuid;
        public @Unsigned @OriginalName(value="__be32") int s_nr_users;
        public @Unsigned @OriginalName(value="__be32") int s_dynsuper;
        public @Unsigned @OriginalName(value="__be32") int s_max_transaction;
        public @Unsigned @OriginalName(value="__be32") int s_max_trans_data;
        public char s_checksum_type;
        public char @Size(value=3) [] s_padding2;
        public @Unsigned @OriginalName(value="__be32") int s_num_fc_blks;
        public @Unsigned @OriginalName(value="__be32") int s_head;
        public @Unsigned int @Size(value=40) [] s_padding;
        public @Unsigned @OriginalName(value="__be32") int s_checksum;
        public char @Size(value=768) [] s_users;
    }

    @Type(noCCodeGeneration=true, cType="struct journal_header_s")
    @NotUsableInJava
    public static class journal_header_s
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int h_magic;
        public @Unsigned @OriginalName(value="__be32") int h_blocktype;
        public @Unsigned @OriginalName(value="__be32") int h_sequence;
    }

    @Type(noCCodeGeneration=true, cType="struct journal_s")
    @NotUsableInJava
    public static class journal_s
    extends Struct {
        public @Unsigned long j_flags;
        public int j_errno;
        public runtime.mutex j_abort_mutex;
        public Ptr<BufferDefinitions.buffer_head> j_sb_buffer;
        public Ptr<@OriginalName(value="journal_superblock_t") journal_superblock_s> j_superblock;
        public misc.rwlock_t j_state_lock;
        public int j_barrier_count;
        public runtime.mutex j_barrier;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> j_running_transaction;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> j_committing_transaction;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> j_checkpoint_transactions;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head j_wait_transaction_locked;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head j_wait_done_commit;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head j_wait_commit;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head j_wait_updates;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head j_wait_reserved;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head j_fc_wait;
        public runtime.mutex j_checkpoint_mutex;
        public Ptr<BufferDefinitions.buffer_head> @Size(value=64) [] j_chkpt_bhs;
        public Ptr<runtime.shrinker> j_shrinker;
        public PercpuDefinitions.percpu_counter j_checkpoint_jh_count;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> j_shrink_transaction;
        public @Unsigned long j_head;
        public @Unsigned long j_tail;
        public @Unsigned long j_free;
        public @Unsigned long j_first;
        public @Unsigned long j_last;
        public @Unsigned long j_fc_first;
        public @Unsigned long j_fc_off;
        public @Unsigned long j_fc_last;
        public Ptr<BlockDefinitions.block_device> j_dev;
        public int j_blocksize;
        public @Unsigned long j_blk_offset;
        public char @Size(value=56) [] j_devname;
        public Ptr<BlockDefinitions.block_device> j_fs_dev;
        public @Unsigned @OriginalName(value="errseq_t") int j_fs_dev_wb_err;
        public @Unsigned int j_total_len;
        public AtomicDefinitions.atomic_t j_reserved_credits;
        public  @OriginalName(value="spinlock_t") runtime.spinlock j_list_lock;
        public Ptr<runtime.inode> j_inode;
        public @Unsigned @OriginalName(value="tid_t") int j_tail_sequence;
        public @Unsigned @OriginalName(value="tid_t") int j_transaction_sequence;
        public @Unsigned @OriginalName(value="tid_t") int j_commit_sequence;
        public @Unsigned @OriginalName(value="tid_t") int j_commit_request;
        public char @Size(value=16) [] j_uuid;
        public Ptr<TaskDefinitions.task_struct> j_task;
        public int j_max_transaction_buffers;
        public int j_revoke_records_per_block;
        public int j_transaction_overhead_buffers;
        public @Unsigned long j_commit_interval;
        public TimerDefinitions.timer_list j_commit_timer;
        public  @OriginalName(value="spinlock_t") runtime.spinlock j_revoke_lock;
        public Ptr<Jbd2Definitions.jbd2_revoke_table_s> j_revoke;
        public Ptr<Jbd2Definitions.jbd2_revoke_table_s> @Size(value=2) [] j_revoke_table;
        public Ptr<Ptr<BufferDefinitions.buffer_head>> j_wbuf;
        public Ptr<Ptr<BufferDefinitions.buffer_head>> j_fc_wbuf;
        public int j_wbufsize;
        public int j_fc_wbufsize;
        public @OriginalName(value="pid_t") int j_last_sync_writer;
        public @Unsigned long j_average_commit_time;
        public @Unsigned int j_min_batch_time;
        public @Unsigned int j_max_batch_time;
        public Ptr<?> j_commit_callback;
        public Ptr<?> j_submit_inode_data_buffers;
        public Ptr<?> j_finish_inode_data_buffers;
        public  @OriginalName(value="spinlock_t") runtime.spinlock j_history_lock;
        public Ptr<ProcDefinitions.proc_dir_entry> j_proc_entry;
        public misc.transaction_stats_s j_stats;
        public @Unsigned int j_failed_commit;
        public Ptr<?> j_private;
        public Ptr<CryptoDefinitions.crypto_shash> j_chksum_driver;
        public @Unsigned int j_csum_seed;
        public Ptr<?> j_fc_cleanup_callback;
        public Ptr<?> j_fc_replay_callback;
        public Ptr<?> j_bmap;
    }

    @Type(noCCodeGeneration=true, cType="struct journal_head")
    @NotUsableInJava
    public static class journal_head
    extends Struct {
        public Ptr<BufferDefinitions.buffer_head> b_bh;
        public  @OriginalName(value="spinlock_t") runtime.spinlock b_state_lock;
        public int b_jcount;
        public @Unsigned int b_jlist;
        public @Unsigned int b_modified;
        public String b_frozen_data;
        public String b_committed_data;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> b_transaction;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> b_next_transaction;
        public Ptr<journal_head> b_tnext;
        public Ptr<journal_head> b_tprev;
        public Ptr<@OriginalName(value="transaction_t") misc.transaction_s> b_cp_transaction;
        public Ptr<journal_head> b_cpnext;
        public Ptr<journal_head> b_cpprev;
        public Ptr<Jbd2Definitions.jbd2_buffer_trigger_type> b_triggers;
        public Ptr<Jbd2Definitions.jbd2_buffer_trigger_type> b_frozen_triggers;
    }
}

