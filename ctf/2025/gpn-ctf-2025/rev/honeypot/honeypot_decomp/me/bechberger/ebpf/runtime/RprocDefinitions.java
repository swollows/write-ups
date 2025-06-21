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
import me.bechberger.ebpf.runtime.FwDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.ResourceDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VirtqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RprocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_carveouts_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_carveouts_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_coredump_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rproc_coredump_write(Ptr<runtime.file> filp, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_crash_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rproc_crash_write(Ptr<runtime.file> filp, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_create_debug_dir(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_create_trace_file((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> rproc_create_trace_file(String name, Ptr<runtime.rproc> rproc2, Ptr<rproc_debug_trace> trace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_delete_debug_dir(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_elf_find_loaded_rsc_table($arg1, (const struct firmware*)$arg2)")
    public static Ptr<ResourceDefinitions.resource_table> rproc_elf_find_loaded_rsc_table(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_elf_get_boot_addr($arg1, (const struct firmware*)$arg2)")
    public static @Unsigned long rproc_elf_get_boot_addr(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_elf_load_rsc_table($arg1, (const struct firmware*)$arg2)")
    public static int rproc_elf_load_rsc_table(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_elf_load_segments($arg1, (const struct firmware*)$arg2)")
    public static int rproc_elf_load_segments(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_elf_sanity_check($arg1, (const struct firmware*)$arg2)")
    public static int rproc_elf_sanity_check(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_exit_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_init_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rproc_name_read(Ptr<runtime.file> filp, String userbuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rproc_recovery_read(Ptr<runtime.file> filp, String userbuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_recovery_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rproc_recovery_write(Ptr<runtime.file> filp, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_remove_trace_file(Ptr<runtime.dentry> tfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_rsc_table_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_rsc_table_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rproc_trace_read(Ptr<runtime.file> filp, String userbuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rproc_attach(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rproc_detach(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_add(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_add_carveout(Ptr<runtime.rproc> rproc2, Ptr<rproc_mem_entry> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_add_rvdev(Ptr<runtime.rproc> rproc2, Ptr<rproc_vdev> rvdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_add_subdev(Ptr<runtime.rproc> rproc2, Ptr<rproc_subdev> subdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_alloc($arg1, (const u8*)$arg2, (const struct rproc_ops*)$arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<runtime.rproc> rproc_alloc(Ptr<runtime.device> dev, String name, Ptr<rproc_ops> ops, String firmware2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_alloc_carveout(Ptr<runtime.rproc> rproc2, Ptr<rproc_mem_entry> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_alloc_registered_carveouts(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_alloc_vring(Ptr<rproc_vdev> rvdev, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_attach(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_auto_boot_callback((const struct firmware*)$arg1, $arg2)")
    public static void rproc_auto_boot_callback(Ptr<runtime.firmware> fw, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_boot(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_cdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_cdev_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rproc_cdev_write(Ptr<runtime.file> filp, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_char_device_add(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_char_device_remove(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_check_carveout_da(Ptr<runtime.rproc> rproc2, Ptr<rproc_mem_entry> mem, @Unsigned int da, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_crash_handler_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rproc_da_to_va(Ptr<runtime.rproc> rproc2, @Unsigned long da, @Unsigned long len, Ptr<@OriginalName(value="bool") Boolean> is_iomem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_del(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_detach(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long rproc_device_ioctl(Ptr<runtime.file> filp, @Unsigned int ioctl, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_disable_iommu(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_enable_iommu(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_exit_panic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_find_carveout_by_name($arg1, (const u8*)$arg2, $arg3_)")
    public static Ptr<rproc_mem_entry> rproc_find_carveout_by_name(Ptr<runtime.rproc> rproc2, String name, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_free(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_free_vring(Ptr<rproc_vring> rvring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_fw_boot($arg1, (const struct firmware*)$arg2)")
    public static int rproc_fw_boot(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rproc> rproc_get_by_child(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rproc> rproc_get_by_phandle(@Unsigned @OriginalName(value="phandle") int phandle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_handle_carveout(Ptr<runtime.rproc> rproc2, Ptr<?> ptr, int offset, int avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_handle_devmem(Ptr<runtime.rproc> rproc2, Ptr<?> ptr, int offset, int avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_handle_resources(Ptr<runtime.rproc> rproc2, Ptr<@OriginalName(value="rproc_handle_resource_t") Ptr<?>> handlers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_handle_trace(Ptr<runtime.rproc> rproc2, Ptr<?> ptr, int offset, int avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_handle_vdev(Ptr<runtime.rproc> rproc2, Ptr<?> ptr, int offset, int avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_init_cdev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_iommu_fault(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev, @Unsigned long iova2, int flags, Ptr<?> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_mem_entry_init($arg1, $arg2, $arg3, $arg4, $arg5, (int (*)(struct rproc*, struct rproc_mem_entry*))$arg6, (int (*)(struct rproc*, struct rproc_mem_entry*))$arg7, (const u8*)$arg8, $arg9_)")
    public static Ptr<rproc_mem_entry> rproc_mem_entry_init(Ptr<runtime.device> dev, Ptr<?> va, @Unsigned @OriginalName(value="dma_addr_t") long dma, @Unsigned long len, @Unsigned int da, Ptr<?> alloc, Ptr<?> release, String name, Object ... param8) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_of_parse_firmware($arg1, $arg2, (const u8**)$arg3)")
    public static int rproc_of_parse_firmware(Ptr<runtime.device> dev, int index2, Ptr<String> fw_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_of_resm_mem_entry_init($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static Ptr<rproc_mem_entry> rproc_of_resm_mem_entry_init(Ptr<runtime.device> dev, @Unsigned int of_resm_idx, @Unsigned long len, @Unsigned int da, String name, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_panic_handler(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_parse_vring(Ptr<rproc_vdev> rvdev, Ptr<FwDefinitions.fw_rsc_vdev> rsc, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_prepare_subdevices(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_put(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_release_carveout(Ptr<runtime.rproc> rproc2, Ptr<rproc_mem_entry> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_remove_rvdev(Ptr<rproc_vdev> rvdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_remove_subdev(Ptr<runtime.rproc> rproc2, Ptr<rproc_subdev> subdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_report_crash(Ptr<runtime.rproc> rproc2, rproc_crash_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_reset_rsc_table_on_detach(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_resource_cleanup(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_set_firmware($arg1, (const u8*)$arg2)")
    public static int rproc_set_firmware(Ptr<runtime.rproc> rproc2, String fw_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_shutdown(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_start($arg1, (const struct firmware*)$arg2)")
    public static int rproc_start(Ptr<runtime.rproc> rproc2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_start_subdevices(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_stop(Ptr<runtime.rproc> rproc2, boolean crashed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_stop_subdevices(Ptr<runtime.rproc> rproc2, boolean crashed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_trigger_recovery(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_type_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_unprepare_device(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_unprepare_subdevices(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long rproc_va_to_pa(Ptr<?> cpu_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_exit_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_init_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short rproc_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_add_virtio_dev(Ptr<rproc_vdev> rvdev, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_copy_segment(Ptr<runtime.rproc> rproc2, Ptr<?> dest, Ptr<rproc_dump_segment> segment, @Unsigned long offset, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_coredump(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_coredump_add_custom_segment($arg1, $arg2, $arg3, (void (*)(struct rproc*, struct rproc_dump_segment*, void*, long unsigned int, long unsigned int))$arg4, $arg5)")
    public static int rproc_coredump_add_custom_segment(Ptr<runtime.rproc> rproc2, @Unsigned @OriginalName(value="dma_addr_t") long da, @Unsigned long size, Ptr<?> dumpfn, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_coredump_add_segment(Ptr<runtime.rproc> rproc2, @Unsigned @OriginalName(value="dma_addr_t") long da, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_coredump_cleanup(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_coredump_free(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_coredump_set_elf_info(Ptr<runtime.rproc> rproc2, char _class2, @Unsigned short machine) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_coredump_using_sections(Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_remove_virtio_dev(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_vdev_do_start(Ptr<rproc_subdev> subdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_vdev_do_stop(Ptr<rproc_subdev> subdev, boolean crashed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_virtio_del_vqs(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_virtio_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_virtio_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_virtio_finalize_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_virtio_find_vqs(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int nvqs, Ptr<Ptr<runtime.virtqueue>> vqs, Ptr<VirtqueueDefinitions.virtqueue_info> vqs_info, Ptr<IrqDefinitions.irq_affinity> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_virtio_get(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rproc_virtio_get_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char rproc_virtio_get_status(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rproc_virtio_notify(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rproc_virtio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_virtio_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_virtio_reset(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rproc_virtio_set($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void rproc_virtio_set(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rproc_virtio_set_status(Ptr<VirtioDefinitions.virtio_device> vdev, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn rproc_vq_interrupt(Ptr<runtime.rproc> rproc2, int notifyid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rproc_debug_trace")
    @NotUsableInJava
    public static class rproc_debug_trace
    extends Struct {
        public Ptr<runtime.rproc> rproc;
        public Ptr<runtime.dentry> tfile;
        public ListDefinitions.list_head node;
        public rproc_mem_entry trace_mem;
    }

    @Type(noCCodeGeneration=true, cType="enum rproc_crash_type")
    public static enum rproc_crash_type implements Enum<rproc_crash_type>,
    TypedEnum<rproc_crash_type, Integer>
    {
        RPROC_MMUFAULT,
        RPROC_WATCHDOG,
        RPROC_FATAL_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum rproc_state")
    public static enum rproc_state implements Enum<rproc_state>,
    TypedEnum<rproc_state, Integer>
    {
        RPROC_OFFLINE,
        RPROC_SUSPENDED,
        RPROC_RUNNING,
        RPROC_CRASHED,
        RPROC_DELETED,
        RPROC_ATTACHED,
        RPROC_DETACHED,
        RPROC_LAST;

    }

    @Type(noCCodeGeneration=true, cType="struct rproc_vdev_data")
    @NotUsableInJava
    public static class rproc_vdev_data
    extends Struct {
        public @Unsigned int rsc_offset;
        public @Unsigned int id;
        public @Unsigned int index;
        public Ptr<FwDefinitions.fw_rsc_vdev> rsc;
    }

    @Type(noCCodeGeneration=true, cType="struct rproc_vdev")
    @NotUsableInJava
    public static class rproc_vdev
    extends Struct {
        public rproc_subdev subdev;
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public @Unsigned int id;
        public ListDefinitions.list_head node;
        public Ptr<runtime.rproc> rproc;
        public rproc_vring @Size(value=2) [] vring;
        public @Unsigned int rsc_offset;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct rproc_vring")
    @NotUsableInJava
    public static class rproc_vring
    extends Struct {
        public Ptr<?> va;
        public int num;
        public @Unsigned int da;
        public @Unsigned int align;
        public int notifyid;
        public Ptr<rproc_vdev> rvdev;
        public Ptr<runtime.virtqueue> vq;
    }

    @Type(noCCodeGeneration=true, cType="struct rproc_subdev")
    @NotUsableInJava
    public static class rproc_subdev
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<?> prepare;
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> unprepare;
    }

    @Type(noCCodeGeneration=true, cType="struct rproc_mem_entry")
    @NotUsableInJava
    public static class rproc_mem_entry
    extends Struct {
        public Ptr<?> va;
        public boolean is_iomem;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public @Unsigned long len;
        public @Unsigned int da;
        public Ptr<?> priv;
        public char @Size(value=32) [] name;
        public ListDefinitions.list_head node;
        public @Unsigned int rsc_offset;
        public @Unsigned int flags;
        public @Unsigned int of_resm_idx;
        public Ptr<?> alloc;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct rproc_coredump_state")
    @NotUsableInJava
    public static class rproc_coredump_state
    extends Struct {
        public Ptr<runtime.rproc> rproc;
        public Ptr<?> header;
        public runtime.completion dump_done;
    }

    @Type(noCCodeGeneration=true, cType="enum rproc_features")
    public static enum rproc_features implements Enum<rproc_features>,
    TypedEnum<rproc_features, Integer>
    {
        RPROC_FEAT_ATTACH_ON_RECOVERY,
        RPROC_MAX_FEATURES;

    }

    @Type(noCCodeGeneration=true, cType="struct rproc_dump_segment")
    @NotUsableInJava
    public static class rproc_dump_segment
    extends Struct {
        public ListDefinitions.list_head node;
        public @Unsigned @OriginalName(value="dma_addr_t") long da;
        public @Unsigned long size;
        public Ptr<?> priv;
        public Ptr<?> dump;
        public @OriginalName(value="loff_t") long offset;
    }

    @Type(noCCodeGeneration=true, cType="enum rproc_dump_mechanism")
    public static enum rproc_dump_mechanism implements Enum<rproc_dump_mechanism>,
    TypedEnum<rproc_dump_mechanism, Integer>
    {
        RPROC_COREDUMP_DISABLED,
        RPROC_COREDUMP_ENABLED,
        RPROC_COREDUMP_INLINE;

    }

    @Type(noCCodeGeneration=true, cType="struct rproc_ops")
    @NotUsableInJava
    public static class rproc_ops
    extends Struct {
        public Ptr<?> prepare;
        public Ptr<?> unprepare;
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> kick;
        public Ptr<?> da_to_va;
        public Ptr<?> parse_fw;
        public Ptr<?> handle_rsc;
        public Ptr<?> find_loaded_rsc_table;
        public Ptr<?> get_loaded_rsc_table;
        public Ptr<?> load;
        public Ptr<?> sanity_check;
        public Ptr<?> get_boot_addr;
        public Ptr<?> panic;
        public Ptr<?> coredump;
    }
}

