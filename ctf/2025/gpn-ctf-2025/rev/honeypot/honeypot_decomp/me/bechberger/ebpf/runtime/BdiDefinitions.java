/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BdiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bdi_set_min_ratio(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int min_ratio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bdi_get_max_bytes(Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bdi_get_min_bytes(Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_max_bytes(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned long max_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_max_ratio(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int max_ratio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_max_ratio_no_scale(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int max_ratio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_min_bytes(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned long min_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_min_ratio(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int min_ratio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_min_ratio_no_scale(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int min_ratio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_set_strict_limit(Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int strict_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdi_split_work_to_wbs(Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<WbDefinitions.wb_writeback_work> base_work, boolean skip_if_busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BackingDefinitions.backing_dev_info> bdi_alloc(int node_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_debug_stats_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_debug_stats_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)bdi_dev_name($arg1))")
    public static String bdi_dev_name(Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BackingDefinitions.backing_dev_info> bdi_get_by_id(@Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdi_init(Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdi_put(Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bdi_register($arg1, (const u8*)$arg2, $arg3_)")
    public static int bdi_register(Ptr<BackingDefinitions.backing_dev_info> bdi, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bdi_register_va($arg1, (const u8*)$arg2, $arg3)")
    public static int bdi_register_va(Ptr<BackingDefinitions.backing_dev_info> bdi, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdi_set_owner(Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<runtime.device> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdi_unregister(Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bdi_writeback")
    @NotUsableInJava
    public static class bdi_writeback
    extends Struct {
        public Ptr<BackingDefinitions.backing_dev_info> bdi;
        public @Unsigned long state;
        public @Unsigned long last_old_flush;
        public ListDefinitions.list_head b_dirty;
        public ListDefinitions.list_head b_io;
        public ListDefinitions.list_head b_more_io;
        public ListDefinitions.list_head b_dirty_time;
        public  @OriginalName(value="spinlock_t") runtime.spinlock list_lock;
        public AtomicDefinitions.atomic_t writeback_inodes;
        public PercpuDefinitions.percpu_counter @Size(value=4) [] stat;
        public @Unsigned long bw_time_stamp;
        public @Unsigned long dirtied_stamp;
        public @Unsigned long written_stamp;
        public @Unsigned long write_bandwidth;
        public @Unsigned long avg_write_bandwidth;
        public @Unsigned long dirty_ratelimit;
        public @Unsigned long balanced_dirty_ratelimit;
        public misc.fprop_local_percpu completions;
        public int dirty_exceeded;
        public WbDefinitions.wb_reason start_all_reason;
        public  @OriginalName(value="spinlock_t") runtime.spinlock work_lock;
        public ListDefinitions.list_head work_list;
        public DelayedDefinitions.delayed_work dwork;
        public DelayedDefinitions.delayed_work bw_dwork;
        public ListDefinitions.list_head bdi_node;
        public PercpuDefinitions.percpu_ref refcnt;
        public misc.fprop_local_percpu memcg_completions;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> memcg_css;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css;
        public ListDefinitions.list_head memcg_node;
        public ListDefinitions.list_head blkcg_node;
        public ListDefinitions.list_head b_attached;
        public ListDefinitions.list_head offline_node;
        @InlineUnion(value=1813)
        public @InlineUnion(value=1813) misc.work_struct release_work;
        @InlineUnion(value=1813)
        public @InlineUnion(value=1813) misc.callback_head rcu;
    }
}

