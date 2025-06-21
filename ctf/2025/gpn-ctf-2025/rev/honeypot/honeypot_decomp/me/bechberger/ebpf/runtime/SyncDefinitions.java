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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SyncDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_bdevs(boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_blockdev(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_blockdev_nowait(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_blockdev_range(Ptr<BlockDefinitions.block_device> bdev, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_completed_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_core() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_force_parallel_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sync_force_parallel_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long sync_force_parallel_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_global_pgds(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_global_pgds_l4(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_global_pgds_l5(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_io_complete(@Unsigned long error, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_max_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sync_max_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long sync_max_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_min_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sync_min_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long sync_min_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_page_io(Ptr<MdDefinitions.md_rdev> rdev, @Unsigned @OriginalName(value="sector_t") long sector, int size, Ptr<runtime.page> page2, @Unsigned @OriginalName(value="blk_opf_t") int opf, boolean metadata_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_speed_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sync_dirty_buffer(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="blk_opf_t") int op_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_core_before_usermode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_dirty_buffer(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_mapping_buffers(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_on_suspend_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sync_on_suspend_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sync_on_suspend_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sync_pt> sync_pt_create(Ptr<sync_timeline> obj, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_runqueues_membarrier_state(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sync_timeline_create((const u8*)$arg1)")
    public static Ptr<sync_timeline> sync_timeline_create(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_timeline_signal(Ptr<sync_timeline> obj, @Unsigned int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sync_rcu_exp_select_node_cpus(Ptr<RcuDefinitions.rcu_exp_work> rewp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sync_file> sync_file_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sync_file> sync_file_create(Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_fence> sync_file_get_fence(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String sync_file_get_name(Ptr<sync_file> sync_file2, String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sync_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sync_file_ioctl_fence_info(Ptr<sync_file> sync_file2, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sync_file_merge((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<sync_file> sync_file_merge(String name, Ptr<sync_file> a, Ptr<sync_file> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int sync_file_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_file_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_fill_fence_info(Ptr<DmaDefinitions.dma_fence> fence, Ptr<sync_fence_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_inode_metadata(Ptr<runtime.inode> inode2, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_inodes_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_linked_regs(Ptr<BpfDefinitions.bpf_verifier_state> vstate, Ptr<BpfDefinitions.bpf_reg_state> known_reg, Ptr<misc.linked_regs> linked_regs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_pcpu(@Unsigned @OriginalName(value="uint32_t") int cpu2, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> max_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_rcu_do_polled_gp(Ptr<misc.work_struct> wp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sync_rcu_exp_done_unlocked(Ptr<RcuDefinitions.rcu_node> rnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_rcu_exp_select_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_rcu_exp_select_node_cpus(Ptr<KthreadDefinitions.kthread_work> wp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_socket_options(Ptr<MptcpDefinitions.mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sync_state_only_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_state_resume_initcall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_debugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_file_debug_add(Ptr<sync_file> sync_file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_file_debug_remove(Ptr<sync_file> sync_file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_file_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long nbytes, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_filesystem(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_fs_one_sb(Ptr<SuperDefinitions.super_block> sb, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_hw_clock(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_info_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sync_info_debugfs_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_inodes_one_sb(Ptr<SuperDefinitions.super_block> sb, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_overcommit_as(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_print_fence(Ptr<SeqDefinitions.seq_file> s2, Ptr<DmaDefinitions.dma_fence> fence, boolean show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_print_sync_file(Ptr<SeqDefinitions.seq_file> s2, Ptr<sync_file> sync_file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PtDefinitions.pt_regs> sync_regs(Ptr<PtDefinitions.pt_regs> eregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_timeline_debug_add(Ptr<sync_timeline> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sync_timeline_debug_remove(Ptr<sync_timeline> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart sync_timer_callback(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sync_set_deadline")
    @NotUsableInJava
    public static class sync_set_deadline
    extends Struct {
        public @Unsigned long deadline_ns;
        public @Unsigned long pad;
    }

    @Type(noCCodeGeneration=true, cType="struct sync_file_info")
    @NotUsableInJava
    public static class sync_file_info
    extends Struct {
        public char @Size(value=32) [] name;
        public int status;
        public @Unsigned int flags;
        public @Unsigned int num_fences;
        public @Unsigned int pad;
        public @Unsigned long sync_fence_info;
    }

    @Type(noCCodeGeneration=true, cType="struct sync_fence_info")
    @NotUsableInJava
    public static class sync_fence_info
    extends Struct {
        public char @Size(value=32) [] obj_name;
        public char @Size(value=32) [] driver_name;
        public int status;
        public @Unsigned int flags;
        public @Unsigned long timestamp_ns;
    }

    @Type(noCCodeGeneration=true, cType="struct sync_merge_data")
    @NotUsableInJava
    public static class sync_merge_data
    extends Struct {
        public char @Size(value=32) [] name;
        public int fd2;
        public int fence;
        public @Unsigned int flags;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct sync_io")
    @NotUsableInJava
    public static class sync_io
    extends Struct {
        public @Unsigned long error_bits;
        public runtime.completion wait;
    }

    @Type(noCCodeGeneration=true, cType="enum sync_action")
    public static enum sync_action implements Enum<sync_action>,
    TypedEnum<sync_action, Integer>
    {
        ACTION_RESYNC,
        ACTION_RECOVER,
        ACTION_CHECK,
        ACTION_REPAIR,
        ACTION_RESHAPE,
        ACTION_FROZEN,
        ACTION_IDLE,
        NR_SYNC_ACTIONS;

    }

    @Type(noCCodeGeneration=true, cType="struct sync_pt")
    @NotUsableInJava
    public static class sync_pt
    extends Struct {
        public DmaDefinitions.dma_fence base;
        public ListDefinitions.list_head link;
        public RbDefinitions.rb_node node;
        public @OriginalName(value="ktime_t") long deadline;
    }

    @Type(noCCodeGeneration=true, cType="struct sync_timeline")
    @NotUsableInJava
    public static class sync_timeline
    extends Struct {
        public runtime.kref kref;
        public char @Size(value=32) [] name;
        public @Unsigned long context;
        public int value;
        public RbDefinitions.rb_root pt_tree;
        public ListDefinitions.list_head pt_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head sync_timeline_list;
    }

    @Type(noCCodeGeneration=true, cType="struct sync_file")
    @NotUsableInJava
    public static class sync_file
    extends Struct {
        public Ptr<runtime.file> file;
        public char @Size(value=32) [] user_name;
        public ListDefinitions.list_head sync_file_list;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wq;
        public @Unsigned long flags;
        public Ptr<DmaDefinitions.dma_fence> fence;
        public DmaDefinitions.dma_fence_cb cb;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int clock_rate; unsigned int clock_type; short unsigned int loopback; }")
    @NotUsableInJava
    public static class sync_serial_settings
    extends Struct {
        public @Unsigned int clock_rate;
        public @Unsigned int clock_type;
        public @Unsigned short loopback;
    }
}

