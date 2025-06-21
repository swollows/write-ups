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
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MempoolDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sg_alloc_table(Ptr<sg_table> table, @Unsigned int nents, @Unsigned int max_ents, Ptr<runtime.scatterlist> first_chunk, @Unsigned int nents_first_chunk, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> alloc_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sg_free_table(Ptr<sg_table> table, @Unsigned int max_ents, @Unsigned int nents_first_chunk, Ptr<?> free_fn, @Unsigned int num_ents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __sg_page_iter_dma_next(Ptr<sg_dma_page_iter> dma_iter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __sg_page_iter_next(Ptr<sg_page_iter> piter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sg_page_iter_start(Ptr<sg_page_iter> piter, Ptr<runtime.scatterlist> sglist, @Unsigned int nents, @Unsigned long pgoffset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_alloc_append_table_from_pages(Ptr<sg_append_table> sgt_append, Ptr<Ptr<runtime.page>> pages, @Unsigned int n_pages, @Unsigned int offset, @Unsigned long size, @Unsigned int max_segment, @Unsigned int left_pages, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_alloc_table(Ptr<sg_table> table, @Unsigned int nents, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_alloc_table_from_pages_segment(Ptr<sg_table> sgt, Ptr<Ptr<runtime.page>> pages, @Unsigned int n_pages, @Unsigned int offset, @Unsigned long size, @Unsigned int max_segment, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sg_copy_buffer(Ptr<runtime.scatterlist> sgl, @Unsigned int nents, Ptr<?> buf, @Unsigned long buflen, @OriginalName(value="off_t") long skip, boolean to_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sg_copy_from_buffer($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @Unsigned long sg_copy_from_buffer(Ptr<runtime.scatterlist> sgl, @Unsigned int nents, Ptr<?> buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sg_copy_to_buffer(Ptr<runtime.scatterlist> sgl, @Unsigned int nents, Ptr<?> buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_free_append_table(Ptr<sg_append_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_free_table(Ptr<sg_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sg_init_one($arg1, (const void*)$arg2, $arg3)")
    public static void sg_init_one(Ptr<runtime.scatterlist> sg2, Ptr<?> buf, @Unsigned int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_init_table(Ptr<runtime.scatterlist> sgl, @Unsigned int nents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_io(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<sg_io_hdr> hdr, boolean open_for_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.scatterlist> sg_kmalloc(@Unsigned int nents, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.scatterlist> sg_last(Ptr<runtime.scatterlist> sgl, @Unsigned int nents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sg_miter_get_next_page(Ptr<sg_mapping_iter> miter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sg_miter_next(Ptr<sg_mapping_iter> miter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sg_miter_skip(Ptr<sg_mapping_iter> miter, @OriginalName(value="off_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_miter_start(Ptr<sg_mapping_iter> miter, Ptr<runtime.scatterlist> sgl, @Unsigned int nents, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_miter_stop(Ptr<sg_mapping_iter> miter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_nents(Ptr<runtime.scatterlist> sg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_nents_for_len(Ptr<runtime.scatterlist> sg2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.scatterlist> sg_next(Ptr<runtime.scatterlist> sg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sg_pcopy_from_buffer($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static @Unsigned long sg_pcopy_from_buffer(Ptr<runtime.scatterlist> sgl, @Unsigned int nents, Ptr<?> buf, @Unsigned long buflen, @OriginalName(value="off_t") long skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sg_pcopy_to_buffer(Ptr<runtime.scatterlist> sgl, @Unsigned int nents, Ptr<?> buf, @Unsigned long buflen, @OriginalName(value="off_t") long skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_scsi_ioctl(Ptr<RequestDefinitions.request_queue> q, boolean open_for_write, Ptr<ScsiDefinitions.scsi_ioctl_command> sic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sg_zero_buffer(Ptr<runtime.scatterlist> sgl, @Unsigned int nents, @Unsigned long buflen, @OriginalName(value="off_t") long skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_alloc_table_chained(Ptr<sg_table> table, int nents, Ptr<runtime.scatterlist> first_chunk, @Unsigned int nents_first_chunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_complete(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_free_table_chained(Ptr<sg_table> table, @Unsigned int nents_first_chunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.scatterlist> sg_pool_alloc(@Unsigned int nents, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_pool_free(Ptr<runtime.scatterlist> sgl, @Unsigned int nents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_pool_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_add_device(Ptr<runtime.device> cl_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="Sg_request") sg_request> sg_add_request(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="Sg_fd") sg_fd> sg_add_sfp(Ptr<@OriginalName(value="Sg_device") sg_device> sdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="Sg_device") sg_device> sg_alloc(Ptr<ScsiDefinitions.scsi_device> scsidp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_build_indirect(Ptr<@OriginalName(value="Sg_scatter_hold") sg_scatter_hold> schp, Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, int buff_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_build_reserve(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, int req_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_common_write(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, Ptr<@OriginalName(value="Sg_request") sg_request> srp, String cmnd, int timeout, int blocking) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_device_destroy(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_fasync(int fd2, Ptr<runtime.file> filp, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_finish_rem_req(Ptr<@OriginalName(value="Sg_request") sg_request> srp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="Sg_request") sg_request> sg_get_rq_mark(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, int pack_id, Ptr<@OriginalName(value="bool") Boolean> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_idr_max_id(int id, Ptr<?> p, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sg_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd_in, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sg_ioctl_common(Ptr<runtime.file> filp, Ptr<@OriginalName(value="Sg_device") sg_device> sdp, Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, @Unsigned int cmd_in, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_mmap(Ptr<runtime.file> filp, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sg_new_read(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, String buf, @Unsigned long count, Ptr<@OriginalName(value="Sg_request") sg_request> srp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int sg_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_proc_debug_helper(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="Sg_device") sg_device> sdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_seq_show_debug(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_seq_show_dev(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_seq_show_devhdr(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_seq_show_devstrs(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_seq_show_int(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_seq_show_version(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_single_open_adio(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_proc_single_open_dressz(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sg_proc_write_adio($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sg_proc_write_adio(Ptr<runtime.file> filp, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sg_proc_write_dressz($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sg_proc_write_dressz(Ptr<runtime.file> filp, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sg_read(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_read_oxfer(Ptr<@OriginalName(value="Sg_request") sg_request> srp, String outp, int num_read_xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_remove_device(Ptr<runtime.device> cl_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_remove_request(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, Ptr<@OriginalName(value="Sg_request") sg_request> srp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_remove_scat(Ptr<@OriginalName(value="Sg_fd") sg_fd> sfp, Ptr<@OriginalName(value="Sg_scatter_hold") sg_scatter_hold> schp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_remove_sfp(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_remove_sfp_usercontext(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static RqDefinitions.rq_end_io_ret sg_rq_end_io(Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sg_rq_end_io_usercontext(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sg_start_req(Ptr<@OriginalName(value="Sg_request") sg_request> srp, String cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int sg_vma_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sg_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sg_write(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sg_pool")
    @NotUsableInJava
    public static class sg_pool
    extends Struct {
        public @Unsigned long size;
        public String name;
        public Ptr<KmemDefinitions.kmem_cache> slab;
        public Ptr<@OriginalName(value="mempool_t") MempoolDefinitions.mempool_s> pool;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_mapping_iter")
    @NotUsableInJava
    public static class sg_mapping_iter
    extends Struct {
        public Ptr<runtime.page> page;
        public Ptr<?> addr;
        public @Unsigned long length;
        public @Unsigned long consumed;
        public sg_page_iter piter;
        public @Unsigned int __offset;
        public @Unsigned int __remaining;
        public @Unsigned int __flags;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_append_table")
    @NotUsableInJava
    public static class sg_append_table
    extends Struct {
        public sg_table sgt;
        public Ptr<runtime.scatterlist> prv;
        public @Unsigned int total_nents;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_io_v4")
    @NotUsableInJava
    public static class sg_io_v4
    extends Struct {
        public int guard;
        public @Unsigned int protocol;
        public @Unsigned int subprotocol;
        public @Unsigned int request_len;
        public @Unsigned long request;
        public @Unsigned long request_tag;
        public @Unsigned int request_attr;
        public @Unsigned int request_priority;
        public @Unsigned int request_extra;
        public @Unsigned int max_response_len;
        public @Unsigned long response;
        public @Unsigned int dout_iovec_count;
        public @Unsigned int dout_xfer_len;
        public @Unsigned int din_iovec_count;
        public @Unsigned int din_xfer_len;
        public @Unsigned long dout_xferp;
        public @Unsigned long din_xferp;
        public @Unsigned int timeout;
        public @Unsigned int flags;
        public @Unsigned long usr_ptr;
        public @Unsigned int spare_in;
        public @Unsigned int driver_status;
        public @Unsigned int transport_status;
        public @Unsigned int device_status;
        public @Unsigned int retry_delay;
        public @Unsigned int info;
        public @Unsigned int duration;
        public @Unsigned int response_len;
        public int din_resid;
        public int dout_resid;
        public @Unsigned long generated_tag;
        public @Unsigned int spare_out;
        public @Unsigned int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_lb_stats")
    @NotUsableInJava
    public static class sg_lb_stats
    extends Struct {
        public @Unsigned long avg_load;
        public @Unsigned long group_load;
        public @Unsigned long group_capacity;
        public @Unsigned long group_util;
        public @Unsigned long group_runnable;
        public @Unsigned int sum_nr_running;
        public @Unsigned int sum_h_nr_running;
        public @Unsigned int idle_cpus;
        public @Unsigned int group_weight;
        public GroupDefinitions.group_type group_type;
        public @Unsigned int group_asym_packing;
        public @Unsigned int group_smt_balance;
        public @Unsigned long group_misfit_task_load;
        public @Unsigned int nr_numa_running;
        public @Unsigned int nr_preferred_running;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_dma_page_iter")
    @NotUsableInJava
    public static class sg_dma_page_iter
    extends Struct {
        public sg_page_iter base;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_proc_deviter")
    @NotUsableInJava
    public static class sg_proc_deviter
    extends Struct {
        public @OriginalName(value="loff_t") long index;
        public @Unsigned long max;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_device")
    @NotUsableInJava
    public static class sg_device
    extends Struct {
        public Ptr<ScsiDefinitions.scsi_device> device;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head open_wait;
        public runtime.mutex open_rel_lock;
        public int sg_tablesize;
        public @Unsigned int index;
        public ListDefinitions.list_head sfds;
        public misc.rwlock_t sfd_lock;
        public AtomicDefinitions.atomic_t detaching;
        public boolean exclude;
        public int open_cnt;
        public char sgdebug;
        public char @Size(value=32) [] name;
        public Ptr<runtime.cdev> cdev;
        public runtime.kref d_ref;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_fd")
    @NotUsableInJava
    public static class sg_fd
    extends Struct {
        public ListDefinitions.list_head sfd_siblings;
        public Ptr<sg_device> parentdp;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head read_wait;
        public misc.rwlock_t rq_list_lock;
        public runtime.mutex f_mutex;
        public int timeout;
        public int timeout_user;
        public @OriginalName(value="Sg_scatter_hold") sg_scatter_hold reserve;
        public ListDefinitions.list_head rq_list;
        public Ptr<misc.fasync_struct> async_qp;
        public @OriginalName(value="Sg_request") sg_request @Size(value=16) [] req_arr;
        public char force_packid;
        public char cmd_q;
        public char next_cmd_len;
        public char keep_orphan;
        public char mmap_called;
        public char res_in_use;
        public runtime.kref f_ref;
        public misc.execute_work ew;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_request")
    @NotUsableInJava
    public static class sg_request
    extends Struct {
        public ListDefinitions.list_head entry;
        public Ptr<sg_fd> parentfp;
        public @OriginalName(value="Sg_scatter_hold") sg_scatter_hold data;
        public @OriginalName(value="sg_io_hdr_t") sg_io_hdr header;
        public char @Size(value=96) [] sense_b;
        public char res_used;
        public char orphan;
        public char sg_io_owned;
        public char done;
        public Ptr<runtime.request> rq;
        public Ptr<runtime.bio> bio;
        public misc.execute_work ew;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_scatter_hold")
    @NotUsableInJava
    public static class sg_scatter_hold
    extends Struct {
        public @Unsigned short k_use_sg;
        public @Unsigned int sglist_len;
        public @Unsigned int bufflen;
        public Ptr<Ptr<runtime.page>> pages;
        public int page_order;
        public char dio_in_use;
        public char cmd_opcode;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_header")
    @NotUsableInJava
    public static class sg_header
    extends Struct {
        public int pack_len;
        public int reply_len;
        public int pack_id;
        public int result;
        public @Unsigned int twelve_byte;
        public @Unsigned int target_status;
        public @Unsigned int host_status;
        public @Unsigned int driver_status;
        public @Unsigned int other_flags;
        public char @Size(value=16) [] sense_buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_req_info")
    @NotUsableInJava
    public static class sg_req_info
    extends Struct {
        public char req_state;
        public char orphan;
        public char sg_io_owned;
        public char problem;
        public int pack_id;
        public Ptr<?> usr_ptr;
        public @Unsigned int duration;
        public int unused;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_scsi_id")
    @NotUsableInJava
    public static class sg_scsi_id
    extends Struct {
        public int host_no;
        public int channel;
        public int scsi_id;
        public int lun;
        public int scsi_type;
        public short h_cmd_per_lun;
        public short d_queue_depth;
        public int @Size(value=2) [] unused;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_io_hdr")
    @NotUsableInJava
    public static class sg_io_hdr
    extends Struct {
        public int interface_id;
        public int dxfer_direction;
        public char cmd_len;
        public char mx_sb_len;
        public @Unsigned short iovec_count;
        public @Unsigned int dxfer_len;
        public Ptr<?> dxferp;
        public String cmdp;
        public Ptr<?> sbp;
        public @Unsigned int timeout;
        public @Unsigned int flags;
        public int pack_id;
        public Ptr<?> usr_ptr;
        public char status;
        public char masked_status;
        public char msg_status;
        public char sb_len_wr;
        public @Unsigned short host_status;
        public @Unsigned short driver_status;
        public int resid;
        public @Unsigned int duration;
        public @Unsigned int info;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_page_iter")
    @NotUsableInJava
    public static class sg_page_iter
    extends Struct {
        public Ptr<runtime.scatterlist> sg;
        public @Unsigned int sg_pgoffset;
        public @Unsigned int __nents;
        public int __pg_advance;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_list")
    @NotUsableInJava
    public static class sg_list
    extends Struct {
        public @Unsigned int n;
        public @Unsigned int size;
        public @Unsigned long len;
        public Ptr<runtime.scatterlist> sg;
    }

    @Type(noCCodeGeneration=true, cType="struct sg_table")
    @NotUsableInJava
    public static class sg_table
    extends Struct {
        public Ptr<runtime.scatterlist> sgl;
        public @Unsigned int nents;
        public @Unsigned int orig_nents;
    }
}

