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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AsyncDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.EventfdDefinitions;
import me.bechberger.ebpf.runtime.FixedDefinitions;
import me.bechberger.ebpf.runtime.FutexDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.OpenDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __io_complete_rw_common(Ptr<io_kiocb> req2, long res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_kiocb> __io_disarm_linked_timeout(Ptr<io_kiocb> req2, Ptr<io_kiocb> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_import_iovec(int ddir, Ptr<io_kiocb> req2, Ptr<io_async_rw> io2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_put_kbuf(Ptr<io_kiocb> req2, int len, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_read(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_register_iowq_aff(Ptr<io_ring_ctx> ctx, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> new_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_remove_buffers(Ptr<io_ring_ctx> ctx, Ptr<io_buffer_list> bl, @Unsigned int nbufs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__io_timeout_prep($arg1, (const struct io_uring_sqe*)$arg2, $arg3)")
    public static int __io_timeout_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe, boolean is_timeout_link) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_uring_add_tctx_node(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_uring_add_tctx_node_from_submit(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__io_uring_cmd_do_in_task($arg1, (void (*)(struct io_uring_cmd*, unsigned int))$arg2, $arg3)")
    public static void __io_uring_cmd_do_in_task(Ptr<io_uring_cmd> ioucmd, Ptr<?> task_work_cb, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_uring_free(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_uring_register(Ptr<io_ring_ctx> ctx, @Unsigned int opcode, Ptr<?> arg2, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_apic_init_mappings() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_apic_print_entries(@Unsigned int apic2, @Unsigned int nr_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_apic_set_fixmap(FixedDefinitions.fixed_addresses idx, @Unsigned @OriginalName(value="phys_addr_t") long phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_apic_sync(Ptr<IrqDefinitions.irq_pin_list> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char io_apic_unique_id(int idx, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_async_buf_func(Ptr<WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> io_buffer_select(Ptr<io_kiocb> req2, Ptr<@Unsigned Long> len, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_buffers_peek(Ptr<io_kiocb> req2, Ptr<misc.buf_sel_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_buffers_select(Ptr<io_kiocb> req2, Ptr<misc.buf_sel_arg> arg2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_check_error(char reason, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_complete_rw(Ptr<runtime.kiocb> kiocb2, long res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_complete_rw_iopoll(Ptr<runtime.kiocb> kiocb2, long res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_delay_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_delay_param(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_destroy_buffers(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_disarm_next(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_do_iopoll(Ptr<io_ring_ctx> ctx, boolean force_nonspin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_file_supports_nowait(Ptr<io_kiocb> req2, @Unsigned @OriginalName(value="__poll_t") int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_flush_timeouts(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_kbuf_recycle_legacy(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_kill_timeout(Ptr<io_kiocb> req2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_kill_timeouts(Ptr<io_ring_ctx> ctx, Ptr<TaskDefinitions.task_struct> tsk, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_link_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart io_link_timeout_fn(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_link_timeout_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_link_timeout_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_linkat(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_linkat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_linkat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_mkdirat(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_mkdirat_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_mkdirat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_mkdirat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_msg_cache_free((const void*)$arg1)")
    public static void io_msg_cache_free(Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_msg_install_complete(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_msg_ring(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_msg_ring_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_msg_ring_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_msg_ring_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_msg_tw_complete(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_msg_tw_fd_complete(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_buffer_list> io_pbuf_get_bl(Ptr<io_ring_ctx> ctx, @Unsigned long bgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_pbuf_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_read($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_prep_read(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_read_fixed($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_prep_read_fixed(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_readv($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_prep_readv(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_rw($arg1, (const struct io_uring_sqe*)$arg2, $arg3, $arg4)")
    public static int io_prep_rw(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe, int ddir, boolean do_import) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_rw_fixed($arg1, (const struct io_uring_sqe*)$arg2, $arg3)")
    public static int io_prep_rw_fixed(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe, int ddir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_rwv($arg1, (const struct io_uring_sqe*)$arg2, $arg3)")
    public static int io_prep_rwv(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe, int ddir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_write($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_prep_write(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_write_fixed($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_prep_write_fixed(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_prep_writev($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_prep_writev(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_provide_buffers(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_provide_buffers_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_provide_buffers_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> io_provided_buffer_select(Ptr<io_kiocb> req2, Ptr<@Unsigned Long> len, Ptr<io_buffer_list> bl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_put_bl(Ptr<io_ring_ctx> ctx, Ptr<io_buffer_list> bl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_queue_linked_timeout(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_read(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_read_mshot(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_read_mshot_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_read_mshot_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_readv_writev_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_refill_buffer_cache(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_iowq_aff(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_iowq_max_workers(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_pbuf_ring(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_pbuf_status(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_restrictions(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_remove_buffers(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_remove_buffers_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_remove_buffers_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_renameat(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_renameat_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_renameat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_renameat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_end_write(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_io_end(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_rw_cleanup(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_rw_complete(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_link_timeout(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_tw_fail_links(Ptr<io_kiocb> link2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_ring_add_registered_file(Ptr<io_uring_task> tctx, Ptr<runtime.file> file2, int start, int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_ring_buffers_peek(Ptr<io_kiocb> req2, Ptr<misc.buf_sel_arg> arg2, Ptr<io_buffer_list> bl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_ringfd_register(Ptr<io_ring_ctx> ctx, Ptr<?> __arg, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_ringfd_unregister(Ptr<io_ring_ctx> ctx, Ptr<?> __arg, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_rw_cache_free((const void*)$arg1)")
    public static void io_rw_cache_free(Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_rw_fail(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_rw_init_file(Ptr<io_kiocb> req2, @Unsigned @OriginalName(value="fmode_t") int mode, int rw_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_rw_should_reissue(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_submit_flush_completions(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_symlinkat(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_symlinkat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_symlinkat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_timeout_cancel(Ptr<io_ring_ctx> ctx, Ptr<io_cancel_data> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_timeout_complete(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_kiocb> io_timeout_extract(Ptr<io_ring_ctx> ctx, Ptr<io_cancel_data> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart io_timeout_fn(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_timeout_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_timeout_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_timeout_remove(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_timeout_remove_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_timeout_remove_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_tlb_hiwater_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_tlb_hiwater_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_tlb_transient_used_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_tlb_used_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_unlinkat(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_unlinkat_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_unlinkat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_unlinkat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_unregister_pbuf_ring(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_unregister_personality(Ptr<io_ring_ctx> ctx, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_alloc_task_context(Ptr<TaskDefinitions.task_struct> task2, Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_clean_tctx(Ptr<io_uring_task> tctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_cmd_done(Ptr<io_uring_cmd> ioucmd, @OriginalName(value="ssize_t") long ret, @OriginalName(value="ssize_t") long res2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_cmd_import_fixed(@Unsigned long ubuf, @Unsigned long len, int rw, Ptr<IovDefinitions.iov_iter> iter2, Ptr<?> ioucmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_cmd_issue_blocking(Ptr<io_uring_cmd> ioucmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_cmd_mark_cancelable(Ptr<io_uring_cmd> cmd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_uring_cmd_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_uring_cmd_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_uring_cmd_prep_setup($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_uring_cmd_prep_setup(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_cmd_sock(Ptr<io_uring_cmd> cmd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_cmd_work(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_del_tctx_node(@Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> io_uring_register_get_file(@Unsigned int fd2, boolean registered) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_uring_try_cancel_uring_cmd(Ptr<io_ring_ctx> ctx, Ptr<TaskDefinitions.task_struct> task2, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_unreg_ringfd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_watchdog_func(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_write(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_account_mem(Ptr<UserDefinitions.user_struct> user, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_fixed_fd_install(Ptr<io_ring_ctx> ctx, Ptr<runtime.file> file2, @Unsigned int file_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_napi_add(Ptr<io_ring_ctx> ctx, Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_napi_busy_loop(Ptr<io_ring_ctx> ctx, Ptr<io_wait_queue> iowq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __io_napi_do_busy_loop(Ptr<io_ring_ctx> ctx, Ptr<?> loop_end_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_napi_remove_stale(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_sqe_buffers_unregister(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_sqe_buffers_update(Ptr<io_ring_ctx> ctx, Ptr<io_uring_rsrc_update2> up, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_sqe_files_unregister(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_sqe_files_update(Ptr<io_ring_ctx> ctx, Ptr<io_uring_rsrc_update2> up, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_accept_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_accept_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_alloc_file_tables(Ptr<io_file_table> table, @Unsigned int nr_files) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_bind_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_bind_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_buffer_account_pin(Ptr<io_ring_ctx> ctx, Ptr<Ptr<runtime.page>> pages, int nr_pages, Ptr<io_mapped_ubuf> imu, Ptr<Ptr<runtime.page>> last_hpage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_buffer_unmap(Ptr<io_ring_ctx> ctx, Ptr<Ptr<io_mapped_ubuf>> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_buffer_validate(Ptr<runtime.iovec> iov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_compat_msg_copy_hdr(Ptr<io_kiocb> req2, Ptr<io_async_msghdr> iomsg, Ptr<CompatDefinitions.compat_msghdr> msg, int ddir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_connect_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_connect_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_do_coalesce_buffer(Ptr<Ptr<Ptr<runtime.page>>> pages, Ptr<Integer> nr_pages, Ptr<io_imu_folio_data> data, int nr_folios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_fadvise_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_fadvise_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_file_bitmap_set(Ptr<io_file_table> table, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_files_update(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_files_update_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_files_update_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_fixed_fd_install(Ptr<io_kiocb> req2, @Unsigned int issue_flags, Ptr<runtime.file> file2, @Unsigned int file_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_fixed_fd_remove(Ptr<io_ring_ctx> ctx, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_free_file_tables(Ptr<io_file_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_ftruncate(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_ftruncate_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_ftruncate_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_sq_data> io_get_sq_data(Ptr<io_uring_params> p, Ptr<@OriginalName(value="bool") Boolean> attached) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_import_fixed(int ddir, Ptr<IovDefinitions.iov_iter> iter2, Ptr<io_mapped_ubuf> imu, @Unsigned long buf_addr, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_install_fixed_file(Ptr<io_ring_ctx> ctx, Ptr<runtime.file> file2, @Unsigned int slot_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long io_is_busy_show(Ptr<misc.gov_attr_set> attr_set, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_is_busy_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long io_is_busy_store(Ptr<misc.gov_attr_set> attr_set, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_listen_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_listen_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_madvise_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_madvise_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_async_msghdr> io_msg_alloc_async(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_msg_copy_hdr(Ptr<io_kiocb> req2, Ptr<io_async_msghdr> iomsg, Ptr<UserDefinitions.user_msghdr> msg, int ddir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_napi_busy_loop_should_end(Ptr<?> data, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_napi_free(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_napi_init(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_napi_sqpoll_busy_poll(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_netmsg_cache_free((const void*)$arg1)")
    public static void io_netmsg_cache_free(Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_netmsg_recycle(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_put_sq_data(Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_queue_rsrc_removal(Ptr<io_rsrc_data> data, @Unsigned int idx, Ptr<?> rsrc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_recv(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_recv_finish(Ptr<io_kiocb> req2, Ptr<Integer> ret, Ptr<io_async_msghdr> kmsg, boolean mshot_finished, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_recvmsg(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_recvmsg_multishot(Ptr<runtime.socket> sock2, Ptr<io_sr_msg> io2, Ptr<io_async_msghdr> kmsg, @Unsigned int flags, Ptr<@OriginalName(value="bool") Boolean> finished) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_recvmsg_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_recvmsg_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_clone_buffers(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_file_alloc_range(Ptr<io_ring_ctx> ctx, Ptr<io_uring_file_index_range> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_files_update(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int nr_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_napi(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_rsrc(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int size, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_register_rsrc_update(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int size, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_rsrc_data_alloc(Ptr<io_ring_ctx> ctx, int type2, Ptr<@Unsigned Long> utags, @Unsigned int nr, Ptr<Ptr<io_rsrc_data>> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_rsrc_data_free(Ptr<io_rsrc_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_rsrc_node> io_rsrc_node_alloc(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_rsrc_node_destroy(Ptr<io_ring_ctx> ctx, Ptr<io_rsrc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_rsrc_node_ref_zero(Ptr<io_rsrc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_rsrc_ref_quiesce(Ptr<io_rsrc_data> data, Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_run_task_work() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_send(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_send_zc(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_send_zc_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_send_zc_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_send_zc_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sendmsg(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_sendmsg_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_sendmsg_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sendmsg_prep_setup(Ptr<io_kiocb> req2, int is_msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sendmsg_recvmsg_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sendmsg_zc(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sendrecv_fail(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sg_from_iter(Ptr<SkDefinitions.sk_buff> skb, Ptr<IovDefinitions.iov_iter> from, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sg_from_iter_iovec(Ptr<SkDefinitions.sk_buff> skb, Ptr<IovDefinitions.iov_iter> from, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_shutdown_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_shutdown_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_socket_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_socket_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sq_offload_create(Ptr<io_ring_ctx> ctx, Ptr<io_uring_params> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sq_thread(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sq_thread_finish(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sq_thread_park(Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sq_thread_stop(Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sq_thread_unpark(Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int io_sq_tw(Ptr<Ptr<misc.llist_node>> retry_list, int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sq_update_worktime(Ptr<io_sq_data> sqd, Ptr<runtime.rusage> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_sqd_handle_event(Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sqd_update_thread_idle(Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sqe_buffer_register(Ptr<io_ring_ctx> ctx, Ptr<runtime.iovec> iov, Ptr<Ptr<io_mapped_ubuf>> pimu, Ptr<Ptr<runtime.page>> last_hpage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sqe_buffers_register(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int nr_args, Ptr<@Unsigned Long> tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sqe_buffers_unregister(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sqe_files_register(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int nr_args, Ptr<@Unsigned Long> tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sqe_files_unregister(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_sqpoll_wait_sq(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sqpoll_wq_cpu_affinity(Ptr<io_ring_ctx> ctx, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_try_coalesce_buffer(Ptr<Ptr<Ptr<runtime.page>>> pages, Ptr<Integer> nr_pages, Ptr<io_imu_folio_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_unregister_napi(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_uring_show_cred($arg1, $arg2, (const struct cred*)$arg3)")
    public static int io_uring_show_cred(Ptr<SeqDefinitions.seq_file> m, @Unsigned int id, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __io_alloc_req_refill(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_arm_ltimeout(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_async_cancel(Ptr<io_cancel_data> cd, Ptr<io_uring_task> tctx, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_close_fixed(Ptr<io_ring_ctx> ctx, @Unsigned int issue_flags, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_commit_cqring_flush(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_cqring_overflow_flush(Ptr<io_ring_ctx> ctx, boolean dying) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__io_openat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int __io_openat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_kiocb> __io_prep_linked_timeout(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_req_task_work_add(Ptr<io_kiocb> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_run_local_work(Ptr<io_ring_ctx> ctx, Ptr<io_tw_state> ts, int min_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_submit_flush_completions(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_sync_cancel(Ptr<io_uring_task> tctx, Ptr<io_cancel_data> cd, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __io_uaddr_map(Ptr<Ptr<Ptr<runtime.page>>> pages, Ptr<@Unsigned Short> npages, @Unsigned long uaddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_uring_cancel(boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_activate_pollwq(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_activate_pollwq_cb(Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_add_aux_cqe(Ptr<io_ring_ctx> ctx, @Unsigned long user_data, int res, @Unsigned int cflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_alloc_async_data(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_alloc_cache_free($arg1, (void (*)(const void*))$arg2)")
    public static void io_alloc_cache_free(Ptr<io_alloc_cache> cache, Ptr<?> free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_alloc_cache_init(Ptr<io_alloc_cache> cache, @Unsigned int max_nr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_alloc_hash_table(Ptr<io_hash_table> table, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_allocate_scq_urings(Ptr<io_ring_ctx> ctx, Ptr<io_uring_params> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_async_cancel(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_async_cancel_one(Ptr<io_uring_task> tctx, Ptr<io_cancel_data> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_async_cancel_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_async_cancel_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_cancel_cb(Ptr<io_wq_work> work, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_cancel_ctx_cb(Ptr<io_wq_work> work, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_cancel_req_match(Ptr<io_kiocb> req2, Ptr<io_cancel_data> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_cancel_task_cb(Ptr<io_wq_work> work, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_clean_op(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_close_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_close_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_cq_unlock_post(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_cqe_cache_refill(Ptr<io_ring_ctx> ctx, boolean overflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_cqring_event_overflow(Ptr<io_ring_ctx> ctx, @Unsigned long user_data, int res, @Unsigned int cflags, @Unsigned long extra1, @Unsigned long extra2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart io_cqring_min_timer_wakeup(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart io_cqring_timer_wakeup(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_cqring_wait(Ptr<io_ring_ctx> ctx, int min_events, @Unsigned int flags, Ptr<misc.ext_arg> ext_arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_drain_req(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_epoll_ctl(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_epoll_ctl_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_epoll_ctl_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_eventfd_do_signal(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_eventfd_flush_signal(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_eventfd_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_eventfd_register(Ptr<io_ring_ctx> ctx, Ptr<?> arg2, @Unsigned int eventfd_async) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_eventfd_signal(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_eventfd_unregister(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_fallback_req_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_fallback_tw(Ptr<io_uring_task> tctx, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> io_file_get_fixed(Ptr<io_kiocb> req2, int fd2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="io_req_flags_t") long io_file_get_flags(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> io_file_get_normal(Ptr<io_kiocb> req2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_fill_cqe_aux(Ptr<io_ring_ctx> ctx, @Unsigned long user_data, int res, @Unsigned int cflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_free_batch_list(Ptr<io_ring_ctx> ctx, Ptr<io_wq_work_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_free_req(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_futex_cache_free(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_futex_cache_init(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_futex_cancel(Ptr<io_ring_ctx> ctx, Ptr<io_cancel_data> cd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_futex_complete(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_futex_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_futex_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_futex_remove_all(Ptr<io_ring_ctx> ctx, Ptr<TaskDefinitions.task_struct> task2, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_futex_wait(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_futex_wake(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_futex_wake_fn(Ptr<WakeDefinitions.wake_q_head> wake_q, Ptr<FutexDefinitions.futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_futex_wakev_fn(Ptr<WakeDefinitions.wake_q_head> wake_q, Ptr<FutexDefinitions.futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_futexv_claim(Ptr<io_futex> iof) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_futexv_complete(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_futexv_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_futexv_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_futexv_wait(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.llist_node> io_handle_tw_list(Ptr<misc.llist_node> node2, Ptr<@Unsigned Integer> count, @Unsigned int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_idle(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_init_fail_req(Ptr<io_kiocb> req2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_init_req($arg1, $arg2, (const struct io_uring_sqe*)$arg3)")
    public static int io_init_req(Ptr<io_ring_ctx> ctx, Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_install_fixed_fd(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_install_fixed_fd_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_install_fixed_fd_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_iopoll_check(Ptr<io_ring_ctx> ctx, long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_is_uring_fops(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_issue_sqe(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_match_task_safe(Ptr<io_kiocb> head, Ptr<TaskDefinitions.task_struct> task2, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_nop_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_nop_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_open_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_openat(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_openat2(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_openat2_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_openat2_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_openat_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_openat_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_pages_free(Ptr<Ptr<Ptr<runtime.page>>> pages, int npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> io_pages_map(Ptr<Ptr<Ptr<runtime.page>>> out_pages, Ptr<@Unsigned Short> npages, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_pages_unmap(Ptr<?> ptr, Ptr<Ptr<Ptr<runtime.page>>> pages, Ptr<@Unsigned Short> npages, boolean put_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.page>> io_pin_pages(@Unsigned long uaddr, @Unsigned long len, Ptr<Integer> npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_issue(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_post_aux_cqe(Ptr<io_ring_ctx> ctx, @Unsigned long user_data, int res, @Unsigned int cflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_prep_async_link(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_prep_async_work(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_queue_async(Ptr<io_kiocb> req2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_queue_iowq(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_queue_next(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_queue_sqe_fallback(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_caches_free(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_complete_post(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_cqe_overflow(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_defer_failed(Ptr<io_kiocb> req2, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_normal_work_add(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_req_post_cqe(Ptr<io_kiocb> req2, int res, @Unsigned int cflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_queue_iowq(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_queue_iowq_tw(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_cancel(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_complete(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_queue(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_queue_fail(Ptr<io_kiocb> req2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_submit(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_req_task_work_add_remote(Ptr<io_kiocb> req2, Ptr<io_ring_ctx> ctx, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_ring_ctx> io_ring_ctx_alloc(Ptr<io_uring_params> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_ring_ctx_free(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_ring_ctx_ref_free(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_ring_ctx_wait_and_kill(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_ring_exit_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_rings_free(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_run_local_work(Ptr<io_ring_ctx> ctx, int min_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_run_task_work_sig(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_schedule() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_schedule_finish(int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_schedule_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long io_schedule_timeout(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_splice_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_splice_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_submit_fail_init((const struct io_uring_sqe*)$arg1, $arg2, $arg3)")
    public static int io_submit_fail_init(Ptr<io_uring_sqe> sqe, Ptr<io_kiocb> req2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_submit_one(Ptr<runtime.kioctx> ctx, Ptr<runtime.iocb> user_iocb, boolean compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_submit_sqes(Ptr<io_ring_ctx> ctx, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sync_cancel(Ptr<io_ring_ctx> ctx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_task_refs_refill(Ptr<io_uring_task> tctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_tctx_exit_cb(Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_tee(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_tee_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_tee_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_try_cancel(Ptr<io_uring_task> tctx, Ptr<io_cancel_data> cd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_cancel_generic(boolean cancel_all, Ptr<io_sq_data> sqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_create(@Unsigned int entries, Ptr<io_uring_params> p, Ptr<io_uring_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_drop_tctx_refs(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long io_uring_get_unmapped_area(Ptr<runtime.file> filp, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_mmap_pages(Ptr<io_ring_ctx> ctx, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<runtime.page>> pages, int npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int io_uring_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_uring_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long io_uring_setup(@Unsigned int entries, Ptr<io_uring_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_uring_try_cancel_requests(Ptr<io_ring_ctx> ctx, Ptr<TaskDefinitions.task_struct> task2, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wake_function(Ptr<WaitDefinitions.wait_queue_entry> curr, @Unsigned int mode, int wake_flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_wq_work> io_wq_free_work(Ptr<io_wq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_submit_work(Ptr<io_wq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __io_arm_poll_handler(Ptr<io_kiocb> req2, Ptr<io_poll> poll, Ptr<io_poll_table> ipt, @Unsigned @OriginalName(value="__poll_t") int mask, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__io_getxattr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int __io_getxattr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_poll_execute(Ptr<io_kiocb> req2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __io_queue_proc(Ptr<io_poll> poll, Ptr<io_poll_table> pt2, Ptr<WaitDefinitions.wait_queue_head> head, Ptr<Ptr<io_poll>> poll_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__io_setxattr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int __io_setxattr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_acct_cancel_pending_work(Ptr<io_wq> wq, Ptr<io_wq_acct> acct2, Ptr<io_cb_cancel_data> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_acct_run_queue(Ptr<io_wq_acct> acct2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_kiocb> io_alloc_notif(Ptr<io_ring_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_arm_poll_handler(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_async_queue_proc(Ptr<runtime.file> file2, Ptr<WaitDefinitions.wait_queue_head> head, Ptr<PollDefinitions.poll_table_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_bitmap_exit(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_bitmap_share(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_eopnotsupp_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_eopnotsupp_prep(Ptr<io_kiocb> kiocb2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_err_clone_and_map_rq(Ptr<DmDefinitions.dm_target> ti, Ptr<runtime.request> rq2, Ptr<MapDefinitions.map_info> map_context, Ptr<Ptr<runtime.request>> clone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_err_ctr(Ptr<DmDefinitions.dm_target> tt, @Unsigned int argc, Ptr<String> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long io_err_dax_direct_access(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, long nr_pages, DaxDefinitions.dax_access_mode mode, Ptr<Ptr<?>> kaddr, Ptr<@OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_err_dtr(Ptr<DmDefinitions.dm_target> tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_err_io_hints(Ptr<DmDefinitions.dm_target> ti, Ptr<QueueDefinitions.queue_limits> limits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_err_iterate_devices(Ptr<DmDefinitions.dm_target> ti, @OriginalName(value="iterate_devices_callout_fn") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_err_map(Ptr<DmDefinitions.dm_target> tt, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_err_release_clone_rq(Ptr<runtime.request> clone, Ptr<MapDefinitions.map_info> map_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_err_report_zones(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_report_zones_args> args, @Unsigned int nr_zones) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_fallocate(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_fallocate_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_fallocate_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_fgetxattr(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_fgetxattr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_fgetxattr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_fsetxattr(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_fsetxattr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_fsetxattr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_fsync(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_fsync_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_fsync_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_wq_work> io_get_next_work(Ptr<io_wq_acct> acct2, Ptr<io_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_getxattr(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_getxattr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_getxattr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_init_new_worker(Ptr<io_wq> wq, Ptr<io_worker> worker2, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_link_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.ubuf_info> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_no_issue(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_notif_tw_complete(Ptr<io_kiocb> notif, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_add(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_poll_add_hash(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_poll_add_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_poll_add_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_poll_can_finish_inline(Ptr<io_kiocb> req2, Ptr<io_poll_table> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_cancel(Ptr<io_ring_ctx> ctx, Ptr<io_cancel_data> cd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_check_events(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_disarm(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_poll_get_ownership_slowpath(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_poll_queue_proc(Ptr<runtime.file> file2, Ptr<WaitDefinitions.wait_queue_head> head, Ptr<PollDefinitions.poll_table_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_remove(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_poll_remove_all(Ptr<io_ring_ctx> ctx, Ptr<TaskDefinitions.task_struct> tsk, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_poll_remove_all_table(Ptr<TaskDefinitions.task_struct> tsk, Ptr<io_hash_table> table, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_poll_remove_entries(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_poll_remove_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_poll_remove_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_poll_task_func(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_poll_wake(Ptr<WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_queue_worker_create(Ptr<io_worker> worker2, Ptr<io_wq_acct> acct2, @OriginalName(value="task_work_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_run_cancel(Ptr<io_wq_work> work, Ptr<io_wq> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_setxattr(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_setxattr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_setxattr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_sfr_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_sfr_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_statx_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_statx_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_statx_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_sync_file_range(Ptr<io_kiocb> req2, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_task_work_match(Ptr<misc.callback_head> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_task_worker_match(Ptr<misc.callback_head> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_tx_ubuf_complete(Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.ubuf_info> uarg, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long io_type_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)io_uring_get_opcode($arg1))")
    public static String io_uring_get_opcode(char opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_uring_op_supported(char opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_uring_optable_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_waitid_cancel(Ptr<io_ring_ctx> ctx, Ptr<io_cancel_data> cd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_waitid_cb(Ptr<io_kiocb> req2, Ptr<io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_waitid_complete(Ptr<io_kiocb> req2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_waitid_copy_si(Ptr<io_kiocb> req2, int signo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_waitid_prep($arg1, (const struct io_uring_sqe*)$arg2)")
    public static int io_waitid_prep(Ptr<io_kiocb> req2, Ptr<io_uring_sqe> sqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_waitid_remove_all(Ptr<io_ring_ctx> ctx, Ptr<TaskDefinitions.task_struct> task2, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_waitid_wait(Ptr<WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_worker_cancel_cb(Ptr<io_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_worker_handle_work(Ptr<io_wq_acct> acct2, Ptr<io_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_worker_ref_put(Ptr<io_wq> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_worker_release(Ptr<io_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_workqueue_create(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_activate_free_worker(Ptr<io_wq> wq, Ptr<io_wq_acct> acct2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static io_wq_cancel io_wq_cancel_cb(Ptr<io_wq> wq, Ptr<?> cancel, Ptr<?> data, boolean cancel_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_cpu_affinity(Ptr<io_uring_task> tctx, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_cpu_offline(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_cpu_online(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_wq> io_wq_create(@Unsigned int bounded, Ptr<io_wq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_dec_running(Ptr<io_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_enqueue(Ptr<io_wq> wq, Ptr<io_wq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_exit_start(Ptr<io_wq> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="io_wq_for_each_worker($arg1, (_Bool (*)(struct io_worker*, void*))$arg2, $arg3)")
    public static boolean io_wq_for_each_worker(Ptr<io_wq> wq, Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<io_wq_acct> io_wq_get_acct(Ptr<io_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_hash_wake(Ptr<WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_hash_work(Ptr<io_wq_work> work, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_max_workers(Ptr<io_wq> wq, Ptr<Integer> new_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_put_and_exit(Ptr<io_wq> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_work_match_all(Ptr<io_wq_work> work, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_work_match_item(Ptr<io_wq_work> work, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int io_wq_worker(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_worker_affinity(Ptr<io_worker> worker2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_worker_cancel(Ptr<io_worker> worker2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_worker_running(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_wq_worker_sleeping(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_worker_stopped() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean io_wq_worker_wake(Ptr<io_worker> worker2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void io_xattr_cleanup(Ptr<io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct io_futex_data")
    @NotUsableInJava
    public static class io_futex_data
    extends Struct {
        public FutexDefinitions.futex_q q;
        public Ptr<io_kiocb> req;
    }

    @Type(noCCodeGeneration=true, cType="struct io_futex")
    @NotUsableInJava
    public static class io_futex
    extends Struct {
        public Ptr<runtime.file> file;
        @InlineUnion(value=93412)
        public @InlineUnion(value=93412) Ptr<@Unsigned Integer> uaddr;
        @InlineUnion(value=93412)
        public @InlineUnion(value=93412) Ptr<FutexDefinitions.futex_waitv> uwaitv;
        public @Unsigned long futex_val;
        public @Unsigned long futex_mask;
        public @Unsigned long futexv_owned;
        public @Unsigned int futex_flags;
        public @Unsigned int futex_nr;
        public boolean futexv_unqueued;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cancel")
    @NotUsableInJava
    public static class io_cancel
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long addr;
        public @Unsigned int flags;
        public int fd;
        public char opcode;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_sync_cancel_reg")
    @NotUsableInJava
    public static class io_uring_sync_cancel_reg
    extends Struct {
        public @Unsigned long addr;
        public int fd;
        public @Unsigned int flags;
        public KernelDefinitions.__kernel_timespec timeout;
        public char opcode;
        public char @Size(value=7) [] pad;
        public @Unsigned long @Size(value=3) [] pad2;
    }

    @Type(noCCodeGeneration=true, cType="struct io_epoll")
    @NotUsableInJava
    public static class io_epoll
    extends Struct {
        public Ptr<runtime.file> file;
        public int epfd;
        public int op;
        public int fd;
        public misc.epoll_event event;
    }

    @Type(noCCodeGeneration=true, cType="struct io_splice")
    @NotUsableInJava
    public static class io_splice
    extends Struct {
        public Ptr<runtime.file> file_out;
        public @OriginalName(value="loff_t") long off_out;
        public @OriginalName(value="loff_t") long off_in;
        public @Unsigned long len;
        public int splice_fd_in;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_nop")
    @NotUsableInJava
    public static class io_nop
    extends Struct {
        public Ptr<runtime.file> file;
        public int result;
    }

    @Type(noCCodeGeneration=true, cType="struct io_fixed_install")
    @NotUsableInJava
    public static class io_fixed_install
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned int o_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_close")
    @NotUsableInJava
    public static class io_close
    extends Struct {
        public Ptr<runtime.file> file;
        public int fd;
        public @Unsigned int file_slot;
    }

    @Type(noCCodeGeneration=true, cType="struct io_open")
    @NotUsableInJava
    public static class io_open
    extends Struct {
        public Ptr<runtime.file> file;
        public int dfd;
        public @Unsigned int file_slot;
        public Ptr<runtime.filename> filename;
        public OpenDefinitions.open_how how;
        public @Unsigned long nofile;
    }

    @Type(noCCodeGeneration=true, cType="struct io_ev_fd")
    @NotUsableInJava
    public static class io_ev_fd
    extends Struct {
        public Ptr<EventfdDefinitions.eventfd_ctx> cq_ev_fd;
        public @Unsigned int eventfd_async;
        public misc.callback_head rcu;
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public AtomicDefinitions.atomic_t ops;
    }

    @Type(noCCodeGeneration=true, cType="struct io_task_cancel")
    @NotUsableInJava
    public static class io_task_cancel
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public boolean all;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tctx_exit")
    @NotUsableInJava
    public static class io_tctx_exit
    extends Struct {
        public misc.callback_head task_work;
        public runtime.completion completion;
        public Ptr<io_ring_ctx> ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct io_defer_entry")
    @NotUsableInJava
    public static class io_defer_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<io_kiocb> req;
        public @Unsigned int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_getevents_arg")
    @NotUsableInJava
    public static class io_uring_getevents_arg
    extends Struct {
        public @Unsigned long sigmask;
        public @Unsigned int sigmask_sz;
        public @Unsigned int min_wait_usec;
        public @Unsigned long ts;
    }

    @Type(noCCodeGeneration=true, cType="struct io_event")
    @NotUsableInJava
    public static class io_event
    extends Struct {
        public @Unsigned long data;
        public @Unsigned long obj;
        public long res;
        public long res2;
    }

    @Type(noCCodeGeneration=true, cType="struct io_napi_entry")
    @NotUsableInJava
    public static class io_napi_entry
    extends Struct {
        public @Unsigned int napi_id;
        public ListDefinitions.list_head list;
        public @Unsigned long timeout;
        public misc.hlist_node node;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct io_wait_queue")
    @NotUsableInJava
    public static class io_wait_queue
    extends Struct {
        public WaitDefinitions.wait_queue_entry wq;
        public Ptr<io_ring_ctx> ctx;
        public @Unsigned int cq_tail;
        public @Unsigned int cq_min_tail;
        public @Unsigned int nr_timeouts;
        public int hit_timeout;
        public @OriginalName(value="ktime_t") long min_timeout;
        public @OriginalName(value="ktime_t") long timeout;
        public runtime.hrtimer t;
        public @OriginalName(value="ktime_t") long napi_busy_poll_dt;
        public boolean napi_prefer_busy_poll;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_napi")
    @NotUsableInJava
    public static class io_uring_napi
    extends Struct {
        public @Unsigned int busy_poll_to;
        public char prefer_busy_poll;
        public char @Size(value=3) [] pad;
        public @Unsigned long resv;
    }

    @Type(noCCodeGeneration=true, cType="struct io_ftrunc")
    @NotUsableInJava
    public static class io_ftrunc
    extends Struct {
        public Ptr<runtime.file> file;
        public @OriginalName(value="loff_t") long len;
    }

    @Type(noCCodeGeneration=true, cType="struct io_overflow_cqe")
    @NotUsableInJava
    public static class io_overflow_cqe
    extends Struct {
        public ListDefinitions.list_head list;
        public io_uring_cqe cqe;
    }

    @Type(noCCodeGeneration=true, cType="struct io_madvise")
    @NotUsableInJava
    public static class io_madvise
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long addr;
        public @Unsigned long len;
        public @Unsigned int advice;
    }

    @Type(noCCodeGeneration=true, cType="struct io_fadvise")
    @NotUsableInJava
    public static class io_fadvise
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long offset;
        public @Unsigned long len;
        public @Unsigned int advice;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_params")
    @NotUsableInJava
    public static class io_uring_params
    extends Struct {
        public @Unsigned int sq_entries;
        public @Unsigned int cq_entries;
        public @Unsigned int flags;
        public @Unsigned int sq_thread_cpu;
        public @Unsigned int sq_thread_idle;
        public @Unsigned int features;
        public @Unsigned int wq_fd;
        public @Unsigned int @Size(value=3) [] resv;
        public io_sqring_offsets sq_off;
        public io_cqring_offsets cq_off;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cqring_offsets")
    @NotUsableInJava
    public static class io_cqring_offsets
    extends Struct {
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int ring_mask;
        public @Unsigned int ring_entries;
        public @Unsigned int overflow;
        public @Unsigned int cqes;
        public @Unsigned int flags;
        public @Unsigned int resv1;
        public @Unsigned long user_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct io_sqring_offsets")
    @NotUsableInJava
    public static class io_sqring_offsets
    extends Struct {
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int ring_mask;
        public @Unsigned int ring_entries;
        public @Unsigned int flags;
        public @Unsigned int dropped;
        public @Unsigned int array;
        public @Unsigned int resv1;
        public @Unsigned long user_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct io_recvmsg_multishot_hdr")
    @NotUsableInJava
    public static class io_recvmsg_multishot_hdr
    extends Struct {
        public io_uring_recvmsg_out msg;
        public KernelDefinitions.__kernel_sockaddr_storage addr;
    }

    @Type(noCCodeGeneration=true, cType="struct io_sr_msg")
    @NotUsableInJava
    public static class io_sr_msg
    extends Struct {
        public Ptr<runtime.file> file;
        @InlineUnion(value=63470)
        public @InlineUnion(value=63470) Ptr<CompatDefinitions.compat_msghdr> umsg_compat;
        @InlineUnion(value=63470)
        public @InlineUnion(value=63470) Ptr<UserDefinitions.user_msghdr> umsg;
        @InlineUnion(value=63470)
        public @InlineUnion(value=63470) Ptr<?> buf;
        public int len;
        public @Unsigned int done_io;
        public @Unsigned int msg_flags;
        public @Unsigned int nr_multishot_loops;
        public @Unsigned short flags;
        public @Unsigned short addr_len;
        public @Unsigned short buf_group;
        public Ptr<?> addr;
        public Ptr<?> msg_control;
        public Ptr<io_kiocb> notif;
    }

    @Type(noCCodeGeneration=true, cType="struct io_listen")
    @NotUsableInJava
    public static class io_listen
    extends Struct {
        public Ptr<runtime.file> file;
        public int backlog;
    }

    @Type(noCCodeGeneration=true, cType="struct io_bind")
    @NotUsableInJava
    public static class io_bind
    extends Struct {
        public Ptr<runtime.file> file;
        public int addr_len;
    }

    @Type(noCCodeGeneration=true, cType="struct io_connect")
    @NotUsableInJava
    public static class io_connect
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<runtime.sockaddr> addr;
        public int addr_len;
        public boolean in_progress;
        public boolean seen_econnaborted;
    }

    @Type(noCCodeGeneration=true, cType="struct io_socket")
    @NotUsableInJava
    public static class io_socket
    extends Struct {
        public Ptr<runtime.file> file;
        public int domain;
        public int type;
        public int protocol;
        public int flags;
        public @Unsigned int file_slot;
        public @Unsigned long nofile;
    }

    @Type(noCCodeGeneration=true, cType="struct io_accept")
    @NotUsableInJava
    public static class io_accept
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<runtime.sockaddr> addr;
        public Ptr<Integer> addr_len;
        public int flags;
        public int iou_flags;
        public @Unsigned int file_slot;
        public @Unsigned long nofile;
    }

    @Type(noCCodeGeneration=true, cType="struct io_shutdown")
    @NotUsableInJava
    public static class io_shutdown
    extends Struct {
        public Ptr<runtime.file> file;
        public int how;
    }

    @Type(noCCodeGeneration=true, cType="struct io_async_msghdr")
    @NotUsableInJava
    public static class io_async_msghdr
    extends Struct {
        public runtime.iovec fast_iov;
        public Ptr<runtime.iovec> free_iov;
        public int free_iov_nr;
        public int namelen;
        public @Unsigned @OriginalName(value="__kernel_size_t") long controllen;
        public @Unsigned @OriginalName(value="__kernel_size_t") long payloadlen;
        public Ptr<runtime.sockaddr> uaddr;
        public runtime.msghdr msg;
        public KernelDefinitions.__kernel_sockaddr_storage addr;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_recvmsg_out")
    @NotUsableInJava
    public static class io_uring_recvmsg_out
    extends Struct {
        public @Unsigned int namelen;
        public @Unsigned int controllen;
        public @Unsigned int payloadlen;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_rsrc_update")
    @NotUsableInJava
    public static class io_rsrc_update
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long arg;
        public @Unsigned int nr_args;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct io_imu_folio_data")
    @NotUsableInJava
    public static class io_imu_folio_data
    extends Struct {
        public @Unsigned int nr_pages_head;
        public @Unsigned int nr_pages_mid;
        public @Unsigned int folio_shift;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_clone_buffers")
    @NotUsableInJava
    public static class io_uring_clone_buffers
    extends Struct {
        public @Unsigned int src_fd;
        public @Unsigned int flags;
        public @Unsigned int @Size(value=6) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_rsrc_update2")
    @NotUsableInJava
    public static class io_uring_rsrc_update2
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int resv;
        public @Unsigned long data;
        public @Unsigned long tags;
        public @Unsigned int nr;
        public @Unsigned int resv2;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_rsrc_register")
    @NotUsableInJava
    public static class io_uring_rsrc_register
    extends Struct {
        public @Unsigned int nr;
        public @Unsigned int flags;
        public @Unsigned long resv2;
        public @Unsigned long data;
        public @Unsigned long tags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_stats_per_prio")
    @NotUsableInJava
    public static class io_stats_per_prio
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int inserted;
        public @Unsigned @OriginalName(value="uint32_t") int merged;
        public @Unsigned @OriginalName(value="uint32_t") int dispatched;
        public AtomicDefinitions.atomic_t completed;
    }

    @Type(noCCodeGeneration=true, cType="enum io_pgtable_caps")
    public static enum io_pgtable_caps implements Enum<io_pgtable_caps>,
    TypedEnum<io_pgtable_caps, Integer>
    {
        IO_PGTABLE_CAP_CUSTOM_ALLOCATOR;

    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_file_index_range")
    @NotUsableInJava
    public static class io_uring_file_index_range
    extends Struct {
        public @Unsigned int off;
        public @Unsigned int len;
        public @Unsigned long resv;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_register_restriction_op")
    public static enum io_uring_register_restriction_op implements Enum<io_uring_register_restriction_op>,
    TypedEnum<io_uring_register_restriction_op, Integer>
    {
        IORING_RESTRICTION_REGISTER_OP,
        IORING_RESTRICTION_SQE_OP,
        IORING_RESTRICTION_SQE_FLAGS_ALLOWED,
        IORING_RESTRICTION_SQE_FLAGS_REQUIRED,
        IORING_RESTRICTION_LAST;

    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_clock_register")
    @NotUsableInJava
    public static class io_uring_clock_register
    extends Struct {
        public @Unsigned int clockid;
        public @Unsigned int @Size(value=3) [] __resv;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_restriction")
    @NotUsableInJava
    public static class io_uring_restriction
    extends Struct {
        public @Unsigned short opcode;
        @InlineUnion(value=30949)
        public @InlineUnion(value=30949) char register_op;
        @InlineUnion(value=30949)
        public @InlineUnion(value=30949) char sqe_op;
        @InlineUnion(value=30949)
        public @InlineUnion(value=30949) char sqe_flags;
        public char resv;
        public @Unsigned int @Size(value=3) [] resv2;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_probe")
    @NotUsableInJava
    public static class io_uring_probe
    extends Struct {
        public char last_op;
        public char ops_len;
        public @Unsigned short resv;
        public @Unsigned int @Size(value=3) [] resv2;
        public io_uring_probe_op @Size(value=0) [] ops;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_probe_op")
    @NotUsableInJava
    public static class io_uring_probe_op
    extends Struct {
        public char op;
        public char resv;
        public @Unsigned short flags;
        public @Unsigned int resv2;
    }

    @Type(noCCodeGeneration=true, cType="struct io_timeout_rem")
    @NotUsableInJava
    public static class io_timeout_rem
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long addr;
        public runtime.timespec64 ts;
        public @Unsigned int flags;
        public boolean ltimeout;
    }

    @Type(noCCodeGeneration=true, cType="struct io_timeout")
    @NotUsableInJava
    public static class io_timeout
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned int off;
        public @Unsigned int target_seq;
        public @Unsigned int repeats;
        public ListDefinitions.list_head list;
        public Ptr<io_kiocb> head;
        public Ptr<io_kiocb> prev;
    }

    @Type(noCCodeGeneration=true, cType="struct io_timeout_data")
    @NotUsableInJava
    public static class io_timeout_data
    extends Struct {
        public Ptr<io_kiocb> req;
        public runtime.hrtimer timer;
        public runtime.timespec64 ts;
        public HrtimerDefinitions.hrtimer_mode mode;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_msg")
    @NotUsableInJava
    public static class io_msg
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<runtime.file> src_file;
        public misc.callback_head tw;
        public @Unsigned long user_data;
        public @Unsigned int len;
        public @Unsigned int cmd;
        public @Unsigned int src_fd;
        @InlineUnion(value=30935)
        public @InlineUnion(value=30935) @Unsigned int dst_fd;
        @InlineUnion(value=30935)
        public @InlineUnion(value=30935) @Unsigned int cqe_flags;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_msg_ring_flags")
    public static enum io_uring_msg_ring_flags implements Enum<io_uring_msg_ring_flags>,
    TypedEnum<io_uring_msg_ring_flags, Integer>
    {
        IORING_MSG_DATA,
        IORING_MSG_SEND_FD;

    }

    @Type(noCCodeGeneration=true, cType="struct io_link")
    @NotUsableInJava
    public static class io_link
    extends Struct {
        public Ptr<runtime.file> file;
        public int old_dfd;
        public int new_dfd;
        public Ptr<runtime.filename> oldpath;
        public Ptr<runtime.filename> newpath;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_mkdir")
    @NotUsableInJava
    public static class io_mkdir
    extends Struct {
        public Ptr<runtime.file> file;
        public int dfd;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public Ptr<runtime.filename> filename;
    }

    @Type(noCCodeGeneration=true, cType="struct io_unlink")
    @NotUsableInJava
    public static class io_unlink
    extends Struct {
        public Ptr<runtime.file> file;
        public int dfd;
        public int flags;
        public Ptr<runtime.filename> filename;
    }

    @Type(noCCodeGeneration=true, cType="struct io_rename")
    @NotUsableInJava
    public static class io_rename
    extends Struct {
        public Ptr<runtime.file> file;
        public int old_dfd;
        public int new_dfd;
        public Ptr<runtime.filename> oldpath;
        public Ptr<runtime.filename> newpath;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_socket_op")
    public static enum io_uring_socket_op implements Enum<io_uring_socket_op>,
    TypedEnum<io_uring_socket_op, Integer>
    {
        SOCKET_URING_OP_SIOCINQ,
        SOCKET_URING_OP_SIOCOUTQ,
        SOCKET_URING_OP_GETSOCKOPT,
        SOCKET_URING_OP_SETSOCKOPT;

    }

    @Type(noCCodeGeneration=true, cType="struct io_rw")
    @NotUsableInJava
    public static class io_rw
    extends Struct {
        public runtime.kiocb kiocb;
        public @Unsigned long addr;
        public @Unsigned int len;
        public @OriginalName(value="rwf_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_async_rw")
    @NotUsableInJava
    public static class io_async_rw
    extends Struct {
        public @Unsigned long bytes_done;
        public IovDefinitions.iov_iter iter;
        public IovDefinitions.iov_iter_state iter_state;
        public runtime.iovec fast_iov;
        public Ptr<runtime.iovec> free_iovec;
        public int free_iov_nr;
        public WaitDefinitions.wait_page_queue wpq;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tctx_node")
    @NotUsableInJava
    public static class io_tctx_node
    extends Struct {
        public ListDefinitions.list_head ctx_node;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<io_ring_ctx> ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_rsrc_update")
    @NotUsableInJava
    public static class io_uring_rsrc_update
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int resv;
        public @Unsigned long data;
    }

    @Type(noCCodeGeneration=true, cType="struct io_provide_buf")
    @NotUsableInJava
    public static class io_provide_buf
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long addr;
        public @Unsigned int len;
        public @Unsigned int bgid;
        public @Unsigned int nbufs;
        public @Unsigned short bid;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_buf_status")
    @NotUsableInJava
    public static class io_uring_buf_status
    extends Struct {
        public @Unsigned int buf_group;
        public @Unsigned int head;
        public @Unsigned int @Size(value=8) [] resv;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_buf_reg")
    @NotUsableInJava
    public static class io_uring_buf_reg
    extends Struct {
        public @Unsigned long ring_addr;
        public @Unsigned int ring_entries;
        public @Unsigned short bgid;
        public @Unsigned short flags;
        public @Unsigned long @Size(value=3) [] resv;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_register_pbuf_ring_flags")
    public static enum io_uring_register_pbuf_ring_flags implements Enum<io_uring_register_pbuf_ring_flags>,
    TypedEnum<io_uring_register_pbuf_ring_flags, Integer>
    {
        IOU_PBUF_RING_MMAP,
        IOU_PBUF_RING_INC;

    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_cmd")
    @NotUsableInJava
    public static class io_uring_cmd
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<io_uring_sqe> sqe;
        public Ptr<?> task_work_cb;
        public @Unsigned int cmd_op;
        public @Unsigned int flags;
        public char @Size(value=32) [] pdu;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tlb_slot")
    @NotUsableInJava
    public static class io_tlb_slot
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long orig_addr;
        public @Unsigned long alloc_size;
        public @Unsigned short list;
        public @Unsigned short pad_slots;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tlb_area")
    @NotUsableInJava
    public static class io_tlb_area
    extends Struct {
        public @Unsigned long used;
        public @Unsigned int index;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct io_apic")
    @NotUsableInJava
    public static class io_apic
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int @Size(value=3) [] unused;
        public @Unsigned int data;
        public @Unsigned int @Size(value=11) [] unused2;
        public @Unsigned int eoi;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 direction; u8 size; short unsigned int port; unsigned int count; long long unsigned int data_offset; }")
    @NotUsableInJava
    public static class io_of_anon_member_of_kvm_run
    extends Struct {
        public char direction;
        public char size;
        public @Unsigned short port;
        public @Unsigned int count;
        public @Unsigned long data_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct io_err_c")
    @NotUsableInJava
    public static class io_err_c
    extends Struct {
        public Ptr<DmDefinitions.dm_dev> dev;
        public @Unsigned @OriginalName(value="sector_t") long start;
    }

    @Type(noCCodeGeneration=true, cType="struct io_pgtable_init_fns")
    @NotUsableInJava
    public static class io_pgtable_init_fns
    extends Struct {
        public Ptr<?> alloc;
        public Ptr<?> free;
        public @Unsigned int caps;
    }

    @Type(noCCodeGeneration=true, cType="struct io_pgtable")
    @NotUsableInJava
    public static class io_pgtable
    extends Struct {
        public io_pgtable_fmt fmt;
        public Ptr<?> cookie;
        public io_pgtable_cfg cfg;
        public io_pgtable_ops ops;
    }

    @Type(noCCodeGeneration=true, cType="struct io_pgtable_ops")
    @NotUsableInJava
    public static class io_pgtable_ops
    extends Struct {
        public Ptr<?> map_pages;
        public Ptr<?> unmap_pages;
        public Ptr<?> iova_to_phys;
        public Ptr<?> read_and_clear_dirty;
    }

    @Type(noCCodeGeneration=true, cType="struct io_pgtable_cfg")
    @NotUsableInJava
    public static class io_pgtable_cfg
    extends Struct {
        public @Unsigned long quirks;
        public @Unsigned long pgsize_bitmap;
        public @Unsigned int ias;
        public @Unsigned int oas;
        public boolean coherent_walk;
        public Ptr<IommuDefinitions.iommu_flush_ops> tlb;
        public Ptr<runtime.device> iommu_dev;
        public Ptr<?> alloc;
        public Ptr<?> free;
        @InlineUnion(value=18363)
        public @InlineUnion(value=18363) misc.arm_lpae_s1_cfg_of_anon_member_of_io_pgtable_cfg arm_lpae_s1_cfg;
        @InlineUnion(value=18363)
        public @InlineUnion(value=18363) misc.arm_lpae_s2_cfg_of_anon_member_of_io_pgtable_cfg arm_lpae_s2_cfg;
        @InlineUnion(value=18363)
        public @InlineUnion(value=18363) misc.arm_v7s_cfg_of_anon_member_of_io_pgtable_cfg arm_v7s_cfg;
        @InlineUnion(value=18363)
        public @InlineUnion(value=18363) misc.arm_mali_lpae_cfg_of_anon_member_of_io_pgtable_cfg arm_mali_lpae_cfg;
        @InlineUnion(value=18363)
        public @InlineUnion(value=18363) misc.apple_dart_cfg_of_anon_member_of_io_pgtable_cfg apple_dart_cfg;
        @InlineUnion(value=18363)
        public  @InlineUnion(value=18363) AmdDefinitions.amd_of_anon_member_of_io_pgtable_cfg amd;
    }

    @Type(noCCodeGeneration=true, cType="enum io_pgtable_fmt")
    public static enum io_pgtable_fmt implements Enum<io_pgtable_fmt>,
    TypedEnum<io_pgtable_fmt, Integer>
    {
        ARM_32_LPAE_S1,
        ARM_32_LPAE_S2,
        ARM_64_LPAE_S1,
        ARM_64_LPAE_S2,
        ARM_V7S,
        ARM_MALI_LPAE,
        AMD_IOMMU_V1,
        AMD_IOMMU_V2,
        APPLE_DART,
        APPLE_DART2,
        IO_PGTABLE_NUM_FMTS;

    }

    @Type(noCCodeGeneration=true, cType="struct io_cb_cancel_data")
    @NotUsableInJava
    public static class io_cb_cancel_data
    extends Struct {
        public Ptr<?> fn;
        public Ptr<?> data;
        public int nr_running;
        public int nr_pending;
        public boolean cancel_all;
    }

    @Type(noCCodeGeneration=true, cType="struct io_wq_acct")
    @NotUsableInJava
    public static class io_wq_acct
    extends Struct {
        public @Unsigned int nr_workers;
        public @Unsigned int max_workers;
        public int index;
        public AtomicDefinitions.atomic_t nr_running;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public io_wq_work_list work_list;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_worker")
    @NotUsableInJava
    public static class io_worker
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct ref;
        public int create_index;
        public @Unsigned long flags;
        public misc.hlist_nulls_node nulls_node;
        public ListDefinitions.list_head all_list;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<io_wq> wq;
        public Ptr<io_wq_work> cur_work;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public runtime.completion ref_done;
        public @Unsigned long create_state;
        public misc.callback_head create_work;
        public int init_retries;
        @InlineUnion(value=1993)
        public @InlineUnion(value=1993) misc.callback_head rcu;
        @InlineUnion(value=1993)
        public @InlineUnion(value=1993) misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct io_wq_data")
    @NotUsableInJava
    public static class io_wq_data
    extends Struct {
        public Ptr<io_wq_hash> hash;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<?> do_work;
        public Ptr<?> free_work;
    }

    @Type(noCCodeGeneration=true, cType="enum io_wq_cancel")
    public static enum io_wq_cancel implements Enum<io_wq_cancel>,
    TypedEnum<io_wq_cancel, Integer>
    {
        IO_WQ_CANCEL_OK,
        IO_WQ_CANCEL_RUNNING,
        IO_WQ_CANCEL_NOTFOUND;

    }

    @Type(noCCodeGeneration=true, cType="struct io_wq")
    @NotUsableInJava
    public static class io_wq
    extends Struct {
        public @Unsigned long state;
        public Ptr<?> free_work;
        public Ptr<?> do_work;
        public Ptr<io_wq_hash> hash;
        public AtomicDefinitions.atomic_t worker_refs;
        public runtime.completion worker_done;
        public misc.hlist_node cpuhp_node;
        public Ptr<TaskDefinitions.task_struct> task;
        public io_wq_acct @Size(value=2) [] acct;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public misc.hlist_nulls_head free_list;
        public ListDefinitions.list_head all_list;
        public WaitDefinitions.wait_queue_entry wait;
        public Ptr<io_wq_work> @Size(value=64) [] hash_tail;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpu_mask;
    }

    @Type(noCCodeGeneration=true, cType="enum io_wq_type")
    public static enum io_wq_type implements Enum<io_wq_type>,
    TypedEnum<io_wq_type, Integer>
    {
        IO_WQ_BOUND,
        IO_WQ_UNBOUND;

    }

    @Type(noCCodeGeneration=true, cType="struct io_waitid")
    @NotUsableInJava
    public static class io_waitid
    extends Struct {
        public Ptr<runtime.file> file;
        public int which;
        public @OriginalName(value="pid_t") int upid;
        public int options;
        public AtomicDefinitions.atomic_t refs;
        public Ptr<WaitDefinitions.wait_queue_head> head;
        public Ptr<runtime.siginfo> infop;
        public misc.waitid_info info;
    }

    @Type(noCCodeGeneration=true, cType="struct io_waitid_async")
    @NotUsableInJava
    public static class io_waitid_async
    extends Struct {
        public Ptr<io_kiocb> req;
        public WaitDefinitions.wait_opts wo;
    }

    @Type(noCCodeGeneration=true, cType="struct io_statx")
    @NotUsableInJava
    public static class io_statx
    extends Struct {
        public Ptr<runtime.file> file;
        public int dfd;
        public @Unsigned int mask;
        public @Unsigned int flags;
        public Ptr<runtime.filename> filename;
        public Ptr<runtime.statx> buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct io_sync")
    @NotUsableInJava
    public static class io_sync
    extends Struct {
        public Ptr<runtime.file> file;
        public @OriginalName(value="loff_t") long len;
        public @OriginalName(value="loff_t") long off;
        public int flags;
        public int mode;
    }

    @Type(noCCodeGeneration=true, cType="struct io_xattr")
    @NotUsableInJava
    public static class io_xattr
    extends Struct {
        public Ptr<runtime.file> file;
        public XattrDefinitions.xattr_ctx ctx;
        public Ptr<runtime.filename> filename;
    }

    @Type(noCCodeGeneration=true, cType="struct io_poll_table")
    @NotUsableInJava
    public static class io_poll_table
    extends Struct {
        public PollDefinitions.poll_table_struct pt;
        public Ptr<io_kiocb> req;
        public int nr_entries;
        public int error;
        public boolean owning;
        public @Unsigned @OriginalName(value="__poll_t") int result_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct io_poll_update")
    @NotUsableInJava
    public static class io_poll_update
    extends Struct {
        public Ptr<runtime.file> file;
        public @Unsigned long old_user_data;
        public @Unsigned long new_user_data;
        public @Unsigned @OriginalName(value="__poll_t") int events;
        public boolean update_events;
        public boolean update_user_data;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cancel_data")
    @NotUsableInJava
    public static class io_cancel_data
    extends Struct {
        public Ptr<io_ring_ctx> ctx;
        @InlineUnion(value=14692)
        public @InlineUnion(value=14692) @Unsigned long data;
        @InlineUnion(value=14692)
        public @InlineUnion(value=14692) Ptr<runtime.file> file;
        public char opcode;
        public @Unsigned int flags;
        public int seq;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_cmd_flags")
    public static enum io_uring_cmd_flags implements Enum<io_uring_cmd_flags>,
    TypedEnum<io_uring_cmd_flags, Integer>
    {
        IO_URING_F_COMPLETE_DEFER,
        IO_URING_F_UNLOCKED,
        IO_URING_F_MULTISHOT,
        IO_URING_F_IOWQ,
        IO_URING_F_NONBLOCK,
        IO_URING_F_SQE128,
        IO_URING_F_CQE32,
        IO_URING_F_IOPOLL,
        IO_URING_F_CANCEL,
        IO_URING_F_COMPAT;

    }

    @Type(noCCodeGeneration=true, cType="struct io_notif_data")
    @NotUsableInJava
    public static class io_notif_data
    extends Struct {
        public Ptr<runtime.file> file;
        public misc.ubuf_info uarg;
        public Ptr<io_notif_data> next;
        public Ptr<io_notif_data> head;
        public @Unsigned int account_pages;
        public boolean zc_report;
        public boolean zc_used;
        public boolean zc_copied;
    }

    @Type(noCCodeGeneration=true, cType="struct io_poll")
    @NotUsableInJava
    public static class io_poll
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<WaitDefinitions.wait_queue_head> head;
        public @Unsigned @OriginalName(value="__poll_t") int events;
        public int retries;
        public WaitDefinitions.wait_queue_entry wait;
    }

    @Type(noCCodeGeneration=true, cType="struct io_rsrc_put")
    @NotUsableInJava
    public static class io_rsrc_put
    extends Struct {
        public @Unsigned long tag;
        @InlineUnion(value=14667)
        public @InlineUnion(value=14667) Ptr<?> rsrc;
        @InlineUnion(value=14667)
        public @InlineUnion(value=14667) Ptr<runtime.file> file;
        @InlineUnion(value=14667)
        public @InlineUnion(value=14667) Ptr<io_mapped_ubuf> buf;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cold_def")
    @NotUsableInJava
    public static class io_cold_def
    extends Struct {
        public String name;
        public Ptr<?> cleanup;
        public Ptr<?> fail;
    }

    @Type(noCCodeGeneration=true, cType="struct io_issue_def")
    @NotUsableInJava
    public static class io_issue_def
    extends Struct {
        public @Unsigned int needs_file;
        public @Unsigned int plug;
        public @Unsigned int hash_reg_file;
        public @Unsigned int unbound_nonreg_file;
        public @Unsigned int pollin;
        public @Unsigned int pollout;
        public @Unsigned int poll_exclusive;
        public @Unsigned int buffer_select;
        public @Unsigned int audit_skip;
        public @Unsigned int ioprio;
        public @Unsigned int iopoll;
        public @Unsigned int iopoll_queue;
        public @Unsigned int vectored;
        public @Unsigned short async_size;
        public Ptr<?> issue;
        public Ptr<?> prep;
    }

    @Type(noCCodeGeneration=true, cType="struct io_buffer_list")
    @NotUsableInJava
    public static class io_buffer_list
    extends Struct {
        @InlineUnion(value=14666)
        public @InlineUnion(value=14666) ListDefinitions.list_head buf_list;
        @InlineUnion(value=14666)
        public  @InlineUnion(value=14666) AnonDefinitions.anon_member_of_anon_member_of_io_buffer_list anon0$1;
        @InlineUnion(value=14666)
        public @InlineUnion(value=14666) misc.callback_head rcu;
        public @Unsigned short bgid;
        public @Unsigned short buf_nr_pages;
        public @Unsigned short nr_entries;
        public @Unsigned short head;
        public @Unsigned short mask;
        public @Unsigned short flags;
        public AtomicDefinitions.atomic_t refs;
    }

    @Type(noCCodeGeneration=true, cType="struct io_buffer")
    @NotUsableInJava
    public static class io_buffer
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long addr;
        public @Unsigned int len;
        public @Unsigned short bid;
        public @Unsigned short bgid;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cmd_data")
    @NotUsableInJava
    public static class io_cmd_data
    extends Struct {
        public Ptr<runtime.file> file;
        public char @Size(value=56) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cqe")
    @NotUsableInJava
    public static class io_cqe
    extends Struct {
        public @Unsigned long user_data;
        public int res;
        @InlineUnion(value=14635)
        public @InlineUnion(value=14635) @Unsigned int flags;
        @InlineUnion(value=14635)
        public @InlineUnion(value=14635) int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct io_task_work")
    @NotUsableInJava
    public static class io_task_work
    extends Struct {
        public misc.llist_node node;
        public @OriginalName(value="io_req_tw_func_t") Ptr<?> func;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tw_state")
    @NotUsableInJava
    public static class io_tw_state
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct io_wq_hash")
    @NotUsableInJava
    public static class io_wq_hash
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public @Unsigned long map;
        public WaitDefinitions.wait_queue_head wait;
    }

    @Type(noCCodeGeneration=true, cType="struct io_rsrc_data")
    @NotUsableInJava
    public static class io_rsrc_data
    extends Struct {
        public Ptr<io_ring_ctx> ctx;
        public Ptr<Ptr<@Unsigned Long>> tags;
        public @Unsigned int nr;
        public @Unsigned short rsrc_type;
        public boolean quiesce;
    }

    @Type(noCCodeGeneration=true, cType="struct io_sq_data")
    @NotUsableInJava
    public static class io_sq_data
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public AtomicDefinitions.atomic_t park_pending;
        public runtime.mutex lock;
        public ListDefinitions.list_head ctx_list;
        public Ptr<TaskDefinitions.task_struct> thread;
        public WaitDefinitions.wait_queue_head wait;
        public @Unsigned int sq_thread_idle;
        public int sq_cpu;
        public @OriginalName(value="pid_t") int task_pid;
        public @OriginalName(value="pid_t") int task_tgid;
        public @Unsigned long work_time;
        public @Unsigned long state;
        public runtime.completion exited;
    }

    @Type(noCCodeGeneration=true, cType="struct io_mapped_ubuf")
    @NotUsableInJava
    public static class io_mapped_ubuf
    extends Struct {
        public @Unsigned long ubuf;
        public @Unsigned int len;
        public @Unsigned int nr_bvecs;
        public @Unsigned int folio_shift;
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public @Unsigned long acct_pages;
        public BioDefinitions.bio_vec @Size(value=0) [] bvec;
    }

    @Type(noCCodeGeneration=true, cType="struct io_rsrc_node")
    @NotUsableInJava
    public static class io_rsrc_node
    extends Struct {
        public Ptr<io_ring_ctx> ctx;
        public int refs;
        public boolean empty;
        public @Unsigned short type;
        public ListDefinitions.list_head node;
        public io_rsrc_put item;
    }

    @Type(noCCodeGeneration=true, cType="struct io_alloc_cache")
    @NotUsableInJava
    public static class io_alloc_cache
    extends Struct {
        public Ptr<Ptr<?>> entries;
        public @Unsigned int nr_cached;
        public @Unsigned int max_cached;
        public @Unsigned long elem_size;
    }

    @Type(noCCodeGeneration=true, cType="struct io_submit_state")
    @NotUsableInJava
    public static class io_submit_state
    extends Struct {
        public io_wq_work_node free_list;
        public io_wq_work_list compl_reqs;
        public io_submit_link link;
        public boolean plug_started;
        public boolean need_plug;
        public boolean cq_flush;
        public @Unsigned short submit_nr;
        public BlkDefinitions.blk_plug plug;
    }

    @Type(noCCodeGeneration=true, cType="struct io_kiocb")
    @NotUsableInJava
    public static class io_kiocb
    extends Struct {
        @InlineUnion(value=14638)
        public @InlineUnion(value=14638) Ptr<runtime.file> file;
        @InlineUnion(value=14638)
        public @InlineUnion(value=14638) io_cmd_data cmd;
        public char opcode;
        public char iopoll_completed;
        public @Unsigned short buf_index;
        public @Unsigned int nr_tw;
        public @Unsigned @OriginalName(value="io_req_flags_t") long flags;
        public io_cqe cqe;
        public Ptr<io_ring_ctx> ctx;
        public Ptr<TaskDefinitions.task_struct> task;
        @InlineUnion(value=14639)
        public @InlineUnion(value=14639) Ptr<io_mapped_ubuf> imu;
        @InlineUnion(value=14639)
        public @InlineUnion(value=14639) Ptr<io_buffer> kbuf;
        @InlineUnion(value=14639)
        public @InlineUnion(value=14639) Ptr<io_buffer_list> buf_list;
        @InlineUnion(value=14644)
        public @InlineUnion(value=14644) io_wq_work_node comp_list;
        @InlineUnion(value=14644)
        public @InlineUnion(value=14644) @Unsigned @OriginalName(value="__poll_t") int apoll_events;
        public Ptr<io_rsrc_node> rsrc_node;
        public AtomicDefinitions.atomic_t refs;
        public boolean cancel_seq_set;
        public io_task_work io_task_work;
        public misc.hlist_node hash_node;
        public Ptr<AsyncDefinitions.async_poll> apoll;
        public Ptr<?> async_data;
        public AtomicDefinitions.atomic_t poll_refs;
        public Ptr<io_kiocb> link;
        public Ptr<runtime.cred> creds;
        public io_wq_work work;
        public misc.big_cqe_of_io_kiocb big_cqe;
    }

    @Type(noCCodeGeneration=true, cType="struct io_submit_link")
    @NotUsableInJava
    public static class io_submit_link
    extends Struct {
        public Ptr<io_kiocb> head;
        public Ptr<io_kiocb> last;
    }

    @Type(noCCodeGeneration=true, cType="struct io_restriction")
    @NotUsableInJava
    public static class io_restriction
    extends Struct {
        public @Unsigned long @Size(value=1) [] register_op;
        public @Unsigned long @Size(value=1) [] sqe_op;
        public char sqe_flags_allowed;
        public char sqe_flags_required;
        public boolean registered;
    }

    @Type(noCCodeGeneration=true, cType="struct io_rings")
    @NotUsableInJava
    public static class io_rings
    extends Struct {
        public io_uring sq;
        public io_uring cq;
        public @Unsigned int sq_ring_mask;
        public @Unsigned int cq_ring_mask;
        public @Unsigned int sq_ring_entries;
        public @Unsigned int cq_ring_entries;
        public @Unsigned int sq_dropped;
        public AtomicDefinitions.atomic_t sq_flags;
        public @Unsigned int cq_flags;
        public @Unsigned int cq_overflow;
        public io_uring_cqe @Size(value=0) [] cqes;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring")
    @NotUsableInJava
    public static class io_uring
    extends Struct {
        public @Unsigned int head;
        public @Unsigned int tail;
    }

    @Type(noCCodeGeneration=true, cType="struct io_ring_ctx")
    @NotUsableInJava
    public static class io_ring_ctx
    extends Struct {
        public AnonDefinitions.anon_member_of_io_ring_ctx anon0;
        public AnonDefinitions.anon_member_of_io_ring_ctx anon1;
        public AnonDefinitions.anon_member_of_io_ring_ctx anon2;
        public AnonDefinitions.anon_member_of_io_ring_ctx anon3;
        public AnonDefinitions.anon_member_of_io_ring_ctx anon4;
        public  @OriginalName(value="spinlock_t") runtime.spinlock completion_lock;
        public ListDefinitions.list_head io_buffers_comp;
        public ListDefinitions.list_head cq_overflow_list;
        public io_hash_table cancel_table;
        public misc.hlist_head waitid_list;
        public misc.hlist_head futex_list;
        public io_alloc_cache futex_cache;
        public Ptr<runtime.cred> sq_creds;
        public Ptr<io_sq_data> sq_data;
        public WaitDefinitions.wait_queue_head sqo_sq_wait;
        public ListDefinitions.list_head sqd_list;
        public @Unsigned int file_alloc_start;
        public @Unsigned int file_alloc_end;
        public ListDefinitions.list_head io_buffers_cache;
        public WaitDefinitions.wait_queue_head poll_wq;
        public io_restriction restrictions;
        public Ptr<io_rsrc_data> file_data;
        public Ptr<io_rsrc_data> buf_data;
        public ListDefinitions.list_head rsrc_ref_list;
        public io_alloc_cache rsrc_node_cache;
        public WaitDefinitions.wait_queue_head rsrc_quiesce_wq;
        public @Unsigned int rsrc_quiesce;
        public @Unsigned int pers_next;
        public runtime.xarray personalities;
        public Ptr<io_wq_hash> hash_map;
        public Ptr<UserDefinitions.user_struct> user;
        public Ptr<MmDefinitions.mm_struct> mm_account;
        public misc.llist_head fallback_llist;
        public DelayedDefinitions.delayed_work fallback_work;
        public misc.work_struct exit_work;
        public ListDefinitions.list_head tctx_list;
        public runtime.completion ref_comp;
        public @Unsigned int @Size(value=2) [] iowq_limits;
        public misc.callback_head poll_wq_task_work;
        public ListDefinitions.list_head defer_list;
        public io_alloc_cache msg_cache;
        public  @OriginalName(value="spinlock_t") runtime.spinlock msg_lock;
        public ListDefinitions.list_head napi_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock napi_lock;
        public @OriginalName(value="ktime_t") long napi_busy_poll_dt;
        public boolean napi_prefer_busy_poll;
        public boolean napi_enabled;
        public misc.hlist_head @Size(value=16) [] napi_ht;
        public @Unsigned int evfd_last_cq_tail;
        public @Unsigned short n_ring_pages;
        public @Unsigned short n_sqe_pages;
        public Ptr<Ptr<runtime.page>> ring_pages;
        public Ptr<Ptr<runtime.page>> sqe_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct io_hash_table")
    @NotUsableInJava
    public static class io_hash_table
    extends Struct {
        public Ptr<io_hash_bucket> hbs;
        public @Unsigned int hash_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct io_hash_bucket")
    @NotUsableInJava
    public static class io_hash_bucket
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct io_file_table")
    @NotUsableInJava
    public static class io_file_table
    extends Struct {
        public Ptr<io_fixed_file> files;
        public Ptr<@Unsigned Long> bitmap;
        public @Unsigned int alloc_hint;
    }

    @Type(noCCodeGeneration=true, cType="struct io_fixed_file")
    @NotUsableInJava
    public static class io_fixed_file
    extends Struct {
        public @Unsigned long file_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct io_wq_work")
    @NotUsableInJava
    public static class io_wq_work
    extends Struct {
        public io_wq_work_node list;
        public AtomicDefinitions.atomic_t flags;
        public int cancel_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct io_wq_work_list")
    @NotUsableInJava
    public static class io_wq_work_list
    extends Struct {
        public Ptr<io_wq_work_node> first;
        public Ptr<io_wq_work_node> last;
    }

    @Type(noCCodeGeneration=true, cType="struct io_wq_work_node")
    @NotUsableInJava
    public static class io_wq_work_node
    extends Struct {
        public Ptr<io_wq_work_node> next;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_buf_ring")
    @NotUsableInJava
    public static class io_uring_buf_ring
    extends Struct {
        @InlineUnion(value=14580)
        public  @InlineUnion(value=14580) AnonDefinitions.anon_member_of_anon_member_of_io_uring_buf_ring anon0$0;
        @InlineUnion(value=14580)
        public  @InlineUnion(value=14580) AnonDefinitions.anon_member_of_anon_member_of_io_uring_buf_ring anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_buf")
    @NotUsableInJava
    public static class io_uring_buf
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned int len;
        public @Unsigned short bid;
        public @Unsigned short resv;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_register_op")
    public static enum io_uring_register_op implements Enum<io_uring_register_op>,
    TypedEnum<io_uring_register_op, Integer>
    {
        IORING_REGISTER_BUFFERS,
        IORING_UNREGISTER_BUFFERS,
        IORING_REGISTER_FILES,
        IORING_UNREGISTER_FILES,
        IORING_REGISTER_EVENTFD,
        IORING_UNREGISTER_EVENTFD,
        IORING_REGISTER_FILES_UPDATE,
        IORING_REGISTER_EVENTFD_ASYNC,
        IORING_REGISTER_PROBE,
        IORING_REGISTER_PERSONALITY,
        IORING_UNREGISTER_PERSONALITY,
        IORING_REGISTER_RESTRICTIONS,
        IORING_REGISTER_ENABLE_RINGS,
        IORING_REGISTER_FILES2,
        IORING_REGISTER_FILES_UPDATE2,
        IORING_REGISTER_BUFFERS2,
        IORING_REGISTER_BUFFERS_UPDATE,
        IORING_REGISTER_IOWQ_AFF,
        IORING_UNREGISTER_IOWQ_AFF,
        IORING_REGISTER_IOWQ_MAX_WORKERS,
        IORING_REGISTER_RING_FDS,
        IORING_UNREGISTER_RING_FDS,
        IORING_REGISTER_PBUF_RING,
        IORING_UNREGISTER_PBUF_RING,
        IORING_REGISTER_SYNC_CANCEL,
        IORING_REGISTER_FILE_ALLOC_RANGE,
        IORING_REGISTER_PBUF_STATUS,
        IORING_REGISTER_NAPI,
        IORING_UNREGISTER_NAPI,
        IORING_REGISTER_CLOCK,
        IORING_REGISTER_CLONE_BUFFERS,
        IORING_REGISTER_LAST,
        IORING_REGISTER_USE_REGISTERED_RING;

    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_cqe")
    @NotUsableInJava
    public static class io_uring_cqe
    extends Struct {
        public @Unsigned long user_data;
        public int res;
        public @Unsigned int flags;
        public @Unsigned long @Size(value=0) [] big_cqe;
    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_op")
    public static enum io_uring_op implements Enum<io_uring_op>,
    TypedEnum<io_uring_op, Integer>
    {
        IORING_OP_NOP,
        IORING_OP_READV,
        IORING_OP_WRITEV,
        IORING_OP_FSYNC,
        IORING_OP_READ_FIXED,
        IORING_OP_WRITE_FIXED,
        IORING_OP_POLL_ADD,
        IORING_OP_POLL_REMOVE,
        IORING_OP_SYNC_FILE_RANGE,
        IORING_OP_SENDMSG,
        IORING_OP_RECVMSG,
        IORING_OP_TIMEOUT,
        IORING_OP_TIMEOUT_REMOVE,
        IORING_OP_ACCEPT,
        IORING_OP_ASYNC_CANCEL,
        IORING_OP_LINK_TIMEOUT,
        IORING_OP_CONNECT,
        IORING_OP_FALLOCATE,
        IORING_OP_OPENAT,
        IORING_OP_CLOSE,
        IORING_OP_FILES_UPDATE,
        IORING_OP_STATX,
        IORING_OP_READ,
        IORING_OP_WRITE,
        IORING_OP_FADVISE,
        IORING_OP_MADVISE,
        IORING_OP_SEND,
        IORING_OP_RECV,
        IORING_OP_OPENAT2,
        IORING_OP_EPOLL_CTL,
        IORING_OP_SPLICE,
        IORING_OP_PROVIDE_BUFFERS,
        IORING_OP_REMOVE_BUFFERS,
        IORING_OP_TEE,
        IORING_OP_SHUTDOWN,
        IORING_OP_RENAMEAT,
        IORING_OP_UNLINKAT,
        IORING_OP_MKDIRAT,
        IORING_OP_SYMLINKAT,
        IORING_OP_LINKAT,
        IORING_OP_MSG_RING,
        IORING_OP_FSETXATTR,
        IORING_OP_SETXATTR,
        IORING_OP_FGETXATTR,
        IORING_OP_GETXATTR,
        IORING_OP_SOCKET,
        IORING_OP_URING_CMD,
        IORING_OP_SEND_ZC,
        IORING_OP_SENDMSG_ZC,
        IORING_OP_READ_MULTISHOT,
        IORING_OP_WAITID,
        IORING_OP_FUTEX_WAIT,
        IORING_OP_FUTEX_WAKE,
        IORING_OP_FUTEX_WAITV,
        IORING_OP_FIXED_FD_INSTALL,
        IORING_OP_FTRUNCATE,
        IORING_OP_BIND,
        IORING_OP_LISTEN,
        IORING_OP_LAST;

    }

    @Type(noCCodeGeneration=true, cType="enum io_uring_sqe_flags_bit")
    public static enum io_uring_sqe_flags_bit implements Enum<io_uring_sqe_flags_bit>,
    TypedEnum<io_uring_sqe_flags_bit, Integer>
    {
        IOSQE_FIXED_FILE_BIT,
        IOSQE_IO_DRAIN_BIT,
        IOSQE_IO_LINK_BIT,
        IOSQE_IO_HARDLINK_BIT,
        IOSQE_ASYNC_BIT,
        IOSQE_BUFFER_SELECT_BIT,
        IOSQE_CQE_SKIP_SUCCESS_BIT;

    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_sqe")
    @NotUsableInJava
    public static class io_uring_sqe
    extends Struct {
        public char opcode;
        public char flags;
        public @Unsigned short ioprio;
        public int fd;
        @InlineUnion(value=14560)
        public @InlineUnion(value=14560) @Unsigned long off;
        @InlineUnion(value=14560)
        public @InlineUnion(value=14560) @Unsigned long addr2;
        @InlineUnion(value=14560)
        public  @InlineUnion(value=14560) AnonDefinitions.anon_member_of_anon_member_of_io_uring_sqe anon4$2;
        @InlineUnion(value=14562)
        public @InlineUnion(value=14562) @Unsigned long addr;
        @InlineUnion(value=14562)
        public @InlineUnion(value=14562) @Unsigned long splice_off_in;
        @InlineUnion(value=14562)
        public  @InlineUnion(value=14562) AnonDefinitions.anon_member_of_anon_member_of_io_uring_sqe anon5$2;
        public @Unsigned int len;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @OriginalName(value="__kernel_rwf_t") int rw_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int fsync_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned short poll_events;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int poll32_events;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int sync_range_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int msg_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int timeout_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int accept_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int cancel_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int open_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int statx_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int fadvise_advice;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int splice_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int rename_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int unlink_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int hardlink_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int xattr_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int msg_ring_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int uring_cmd_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int waitid_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int futex_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int install_fd_flags;
        @InlineUnion(value=14563)
        public @InlineUnion(value=14563) @Unsigned int nop_flags;
        public @Unsigned long user_data;
        @InlineUnion(value=14564)
        public @InlineUnion(value=14564) @Unsigned short buf_index;
        @InlineUnion(value=14564)
        public @InlineUnion(value=14564) @Unsigned short buf_group;
        public @Unsigned short personality;
        @InlineUnion(value=14566)
        public @InlineUnion(value=14566) int splice_fd_in;
        @InlineUnion(value=14566)
        public @InlineUnion(value=14566) @Unsigned int file_index;
        @InlineUnion(value=14566)
        public @InlineUnion(value=14566) @Unsigned int optlen;
        @InlineUnion(value=14566)
        public  @InlineUnion(value=14566) AnonDefinitions.anon_member_of_anon_member_of_io_uring_sqe anon11$3;
        @InlineUnion(value=14569)
        public  @InlineUnion(value=14569) AnonDefinitions.anon_member_of_anon_member_of_io_uring_sqe anon12$0;
        @InlineUnion(value=14569)
        public @InlineUnion(value=14569) @Unsigned long optval;
        @InlineUnion(value=14569)
        public @InlineUnion(value=14569) char @Size(value=0) [] cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct io_uring_task")
    @NotUsableInJava
    public static class io_uring_task
    extends Struct {
        public int cached_refs;
        public Ptr<io_ring_ctx> last;
        public Ptr<io_wq> io_wq;
        public Ptr<runtime.file> @Size(value=16) [] registered_rings;
        public runtime.xarray xa;
        public WaitDefinitions.wait_queue_head wait;
        public AtomicDefinitions.atomic_t in_cancel;
        public AtomicDefinitions.atomic_t inflight_tracked;
        public PercpuDefinitions.percpu_counter inflight;
        public AnonDefinitions.anon_member_of_io_uring_task anon9;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tlb_pool")
    @NotUsableInJava
    public static class io_tlb_pool
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long start;
        public @Unsigned @OriginalName(value="phys_addr_t") long end;
        public Ptr<?> vaddr;
        public @Unsigned long nslabs;
        public boolean late_alloc;
        public @Unsigned int nareas;
        public @Unsigned int area_nslabs;
        public Ptr<io_tlb_area> areas;
        public Ptr<io_tlb_slot> slots;
        public ListDefinitions.list_head node;
        public misc.callback_head rcu;
        public boolean _transient;
    }

    @Type(noCCodeGeneration=true, cType="struct io_tlb_mem")
    @NotUsableInJava
    public static class io_tlb_mem
    extends Struct {
        public io_tlb_pool defpool;
        public @Unsigned long nslabs;
        public Ptr<runtime.dentry> debugfs;
        public boolean force_bounce;
        public boolean for_alloc;
        public boolean can_grow;
        public @Unsigned long phys_limit;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head pools;
        public misc.work_struct dyn_alloc;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t total_used;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t used_hiwater;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t transient_nslabs;
    }

    @Type(noCCodeGeneration=true, cType="struct io_bitmap")
    @NotUsableInJava
    public static class io_bitmap
    extends Struct {
        public @Unsigned long sequence;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int max;
        public @Unsigned long @Size(value=1024) [] bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct io_comp_batch")
    @NotUsableInJava
    public static class io_comp_batch
    extends Struct {
        public Ptr<runtime.request> req_list;
        public boolean need_ts;
        public Ptr<?> complete;
    }

    @Type(noCCodeGeneration=true, cType="struct io_cq")
    @NotUsableInJava
    public static class io_cq
    extends Struct {
        public Ptr<RequestDefinitions.request_queue> q;
        public Ptr<io_context> ioc;
        @InlineUnion(value=1115)
        public @InlineUnion(value=1115) ListDefinitions.list_head q_node;
        @InlineUnion(value=1115)
        public @InlineUnion(value=1115) Ptr<KmemDefinitions.kmem_cache> __rcu_icq_cache;
        @InlineUnion(value=1116)
        public @InlineUnion(value=1116) misc.hlist_node ioc_node;
        @InlineUnion(value=1116)
        public @InlineUnion(value=1116) misc.callback_head __rcu_head;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct io_context")
    @NotUsableInJava
    public static class io_context
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t refcount;
        public AtomicDefinitions.atomic_t active_ref;
        public @Unsigned short ioprio;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public runtime.xarray icq_tree;
        public Ptr<io_cq> icq_hint;
        public misc.hlist_head icq_list;
        public misc.work_struct release_work;
    }
}

