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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LoopDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_rw_iter(int ddir, Ptr<IoDefinitions.io_rw> rw, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __loop_clr_fd(Ptr<loop_device> lo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __loop_update_dio(Ptr<loop_device> lo, boolean dio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_add(int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_backing_file_show(Ptr<loop_device> lo, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_do_show_autoclear(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_do_show_backing_file(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_do_show_dio(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_do_show_offset(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_do_show_partscan(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long loop_attr_do_show_sizelimit(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_change_fd(Ptr<loop_device> lo, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_clear_limits(Ptr<loop_device> lo, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_configure($arg1, $arg2, $arg3, (const struct loop_config*)$arg4)")
    public static int loop_configure(Ptr<loop_device> lo, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<BlockDefinitions.block_device> bdev, Ptr<loop_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long loop_control_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long parm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_free_idle_workers(Ptr<loop_device> lo, boolean delete_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_free_idle_workers_timer(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_get_status(Ptr<loop_device> lo, Ptr<loop_info64> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_get_status_compat(Ptr<loop_device> lo, Ptr<CompatDefinitions.compat_loop_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_get_status_old(Ptr<loop_device> lo, Ptr<loop_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_info64_from_compat((const struct compat_loop_info*)$arg1, $arg2)")
    public static int loop_info64_from_compat(Ptr<CompatDefinitions.compat_loop_info> arg2, Ptr<loop_info64> info64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_info64_from_old((const struct loop_info*)$arg1, $arg2)")
    public static void loop_info64_from_old(Ptr<loop_info> info2, Ptr<loop_info64> info64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_info64_to_compat((const struct loop_info64*)$arg1, $arg2)")
    public static int loop_info64_to_compat(Ptr<loop_info64> info64, Ptr<CompatDefinitions.compat_loop_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_info64_to_old((const struct loop_info64*)$arg1, $arg2)")
    public static int loop_info64_to_old(Ptr<loop_info64> info64, Ptr<loop_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_probe(@Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_process_work(Ptr<loop_worker> worker2, Ptr<ListDefinitions.list_head> cmd_list, Ptr<loop_device> lo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_queue_rq($arg1, (const struct blk_mq_queue_data*)$arg2)")
    public static @OriginalName(value="blk_status_t") char loop_queue_rq(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<BlkDefinitions.blk_mq_queue_data> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_queue_work(Ptr<loop_device> lo, Ptr<loop_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_reconfigure_limits(Ptr<loop_device> lo, @Unsigned int bsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_remove(Ptr<loop_device> lo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_reread_partitions(Ptr<loop_device> lo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_rootcg_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_set_hw_queue_depth((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int loop_set_hw_queue_depth(String s2, Ptr<KernelDefinitions.kernel_param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_set_status($arg1, (const struct loop_info64*)$arg2)")
    public static int loop_set_status(Ptr<loop_device> lo, Ptr<loop_info64> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_set_status_compat($arg1, (const struct compat_loop_info*)$arg2)")
    public static int loop_set_status_compat(Ptr<loop_device> lo, Ptr<CompatDefinitions.compat_loop_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_set_status_from_info($arg1, (const struct loop_info64*)$arg2)")
    public static int loop_set_status_from_info(Ptr<loop_device> lo, Ptr<loop_info64> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="loop_set_status_old($arg1, (const struct loop_info*)$arg2)")
    public static int loop_set_status_old(Ptr<loop_device> lo, Ptr<loop_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int loop_validate_file(Ptr<runtime.file> file2, Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void loop_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int loop_timeout(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct loop_worker")
    @NotUsableInJava
    public static class loop_worker
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public misc.work_struct work;
        public ListDefinitions.list_head cmd_list;
        public ListDefinitions.list_head idle_list;
        public Ptr<loop_device> lo;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css;
        public @Unsigned long last_ran_at;
    }

    @Type(noCCodeGeneration=true, cType="struct loop_cmd")
    @NotUsableInJava
    public static class loop_cmd
    extends Struct {
        public ListDefinitions.list_head list_entry;
        public boolean use_aio;
        public AtomicDefinitions.atomic_t ref;
        public long ret;
        public runtime.kiocb iocb;
        public Ptr<BioDefinitions.bio_vec> bvec;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> memcg_css;
    }

    @Type(noCCodeGeneration=true, cType="struct loop_device")
    @NotUsableInJava
    public static class loop_device
    extends Struct {
        public int lo_number;
        public @OriginalName(value="loff_t") long lo_offset;
        public @OriginalName(value="loff_t") long lo_sizelimit;
        public int lo_flags;
        public char @Size(value=64) [] lo_file_name;
        public Ptr<runtime.file> lo_backing_file;
        public Ptr<BlockDefinitions.block_device> lo_device;
        public @Unsigned @OriginalName(value="gfp_t") int old_gfp_mask;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lo_lock;
        public int lo_state;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lo_work_lock;
        public Ptr<WorkqueueDefinitions.workqueue_struct> workqueue;
        public misc.work_struct rootcg_work;
        public ListDefinitions.list_head rootcg_cmd_list;
        public ListDefinitions.list_head idle_worker_list;
        public RbDefinitions.rb_root worker_tree;
        public TimerDefinitions.timer_list timer;
        public boolean use_dio;
        public boolean sysfs_inited;
        public Ptr<RequestDefinitions.request_queue> lo_queue;
        public BlkDefinitions.blk_mq_tag_set tag_set;
        public Ptr<runtime.gendisk> lo_disk;
        public runtime.mutex lo_mutex;
        public boolean idr_visible;
    }

    @Type(noCCodeGeneration=true, cType="struct loop_config")
    @NotUsableInJava
    public static class loop_config
    extends Struct {
        public @Unsigned int fd;
        public @Unsigned int block_size;
        public loop_info64 info;
        public @Unsigned long @Size(value=8) [] __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct loop_info64")
    @NotUsableInJava
    public static class loop_info64
    extends Struct {
        public @Unsigned long lo_device;
        public @Unsigned long lo_inode;
        public @Unsigned long lo_rdevice;
        public @Unsigned long lo_offset;
        public @Unsigned long lo_sizelimit;
        public @Unsigned int lo_number;
        public @Unsigned int lo_encrypt_type;
        public @Unsigned int lo_encrypt_key_size;
        public @Unsigned int lo_flags;
        public char @Size(value=64) [] lo_file_name;
        public char @Size(value=64) [] lo_crypt_name;
        public char @Size(value=32) [] lo_encrypt_key;
        public @Unsigned long @Size(value=2) [] lo_init;
    }

    @Type(noCCodeGeneration=true, cType="struct loop_info")
    @NotUsableInJava
    public static class loop_info
    extends Struct {
        public int lo_number;
        public @Unsigned @OriginalName(value="__kernel_old_dev_t") long lo_device;
        public @Unsigned long lo_inode;
        public @Unsigned @OriginalName(value="__kernel_old_dev_t") long lo_rdevice;
        public int lo_offset;
        public int lo_encrypt_type;
        public int lo_encrypt_key_size;
        public int lo_flags;
        public char @Size(value=64) [] lo_name;
        public char @Size(value=32) [] lo_encrypt_key;
        public @Unsigned long @Size(value=2) [] lo_init;
        public char @Size(value=4) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 type; u8 asize; }")
    @NotUsableInJava
    public static class loop_of_anon_member_of_arch_specific_insn
    extends Struct {
        public char type;
        public char asize;
    }
}

