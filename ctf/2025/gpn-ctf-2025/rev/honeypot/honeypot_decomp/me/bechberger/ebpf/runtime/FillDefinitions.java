/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.ConfigDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DebugDefinitions;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.ElfDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.XzDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class FillDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fill_map(Ptr<@Unsigned Long> obj_map, Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fill_async_buffer(Ptr<DebugDefinitions.debug_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_files_note(Ptr<runtime.memelfnote> note, Ptr<misc.coredump_params> cprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fill_item_path(Ptr<ConfigDefinitions.config_item> item, String buffer, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fill_kobj_path((const struct kobject*)$arg1, $arg2, $arg3)")
    public static int fill_kobj_path(Ptr<runtime.kobject> kobj, String path2, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_meta_index(Ptr<runtime.inode> inode2, int index2, Ptr<@Unsigned Long> index_block, Ptr<Integer> index_offset, Ptr<@Unsigned Long> data_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fill_periodic_buffer(Ptr<DebugDefinitions.debug_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> fill_pmd(Ptr<PudDefinitions.pud_t> pud, @Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> fill_pte(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_ptr_key(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PudDefinitions.pud_t> fill_pud(Ptr<misc.p4d_t> p4d, @Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fill_registers_buffer(Ptr<DebugDefinitions.debug_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fill_rwbs($arg1, (const struct blk_io_trace*)$arg2)")
    public static void fill_rwbs(String rwbs, Ptr<BlkDefinitions.blk_io_trace> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fill_thread_core_info($arg1, (const struct user_regset_view*)$arg2, $arg3, $arg4)")
    public static int fill_thread_core_info(Ptr<ElfDefinitions.elf_thread_core_info> t, Ptr<UserDefinitions.user_regset_view> view, long signr, Ptr<ElfDefinitions.elf_note_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fill_var(Ptr<FbDefinitions.fb_var_screeninfo> var, Ptr<FbDefinitions.fb_info> info2, Ptr<DrmDefinitions.drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fill_analog_mode($arg1, $arg2, (const struct analog_parameters*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int fill_analog_mode(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_display_mode> mode, Ptr<misc.analog_parameters> params, @Unsigned long pixel_clock_hz, @Unsigned int hactive, @Unsigned int vactive, boolean interlace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fill_temp(Ptr<XzDefinitions.xz_dec> s2, Ptr<XzDefinitions.xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fill_user_desc($arg1, $arg2, (const struct desc_struct*)$arg3)")
    public static void fill_user_desc(Ptr<UserDefinitions.user_desc> info2, int idx, Ptr<DescDefinitions.desc_struct> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fill_window(Ptr<DeflateDefinitions.deflate_state> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fill_bandwidth_buffer(Ptr<DebugDefinitions.debug_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_list(@Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_object_idr(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_file> lessor_priv, Ptr<runtime.idr> leases, int object_count, Ptr<@Unsigned Integer> object_ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fill_page_cache_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fill_ac(Ptr< @OriginalName(value="acct_t") AcctDefinitions.acct_v3> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fill_balloon(Ptr<VirtioDefinitions.virtio_balloon> vb, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fill_local_addresses_vec(Ptr<MptcpDefinitions.mptcp_sock> msk, Ptr<MptcpDefinitions.mptcp_addr_info> remote, Ptr<MptcpDefinitions.mptcp_pm_local> locals) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fill_mtrr_var_range(@Unsigned int index2, @Unsigned int base_lo, @Unsigned int base_hi, @Unsigned int mask_lo, @Unsigned int mask_hi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_powernow_table(Ptr<misc.powernow_k8_data> data, Ptr<misc.pst_s> pst, char maxvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_powernow_table_fidvid(Ptr<misc.powernow_k8_data> data, Ptr<CpufreqDefinitions.cpufreq_frequency_table> powernow_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_queue(Ptr<runtime.virtqueue> vq, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fill_readbuf(Ptr<runtime.port> port2, Ptr<Character> out_buf, @Unsigned long out_count, boolean to_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fill_remote_addresses_vec(Ptr<MptcpDefinitions.mptcp_sock> msk, Ptr<MptcpDefinitions.mptcp_addr_info> local, boolean fullmesh, Ptr<MptcpDefinitions.mptcp_addr_info> addrs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fill_stats(Ptr<UserDefinitions.user_namespace> user_ns, Ptr<PidDefinitions.pid_namespace> pid_ns, Ptr<TaskDefinitions.task_struct> tsk, Ptr<runtime.taskstats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fill_stats_for_tgid(@OriginalName(value="pid_t") int tgid, Ptr<runtime.taskstats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }
}

