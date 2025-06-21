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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class XenbusDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_command_reply($arg1, $arg2, (const u8*)$arg3)")
    public static int xenbus_command_reply(Ptr<xenbus_file_priv> u, @Unsigned int msg_type, String reply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_dev_queue_reply(Ptr<misc.xb_req_data> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_dev_request_and_reply(Ptr<misc.xsd_sockmsg> msg, Ptr<?> par) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_directory($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<String> xenbus_directory(xenbus_transaction t, String dir, String node2, Ptr<@Unsigned Integer> num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_exists($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int xenbus_exists(xenbus_transaction t, String dir, String node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int xenbus_file_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long xenbus_file_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_file_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_file_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long xenbus_file_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_gather($arg1, (const u8*)$arg2, $arg3_)")
    public static int xenbus_gather(xenbus_transaction t, String dir, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_mkdir($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int xenbus_mkdir(xenbus_transaction t, String dir, String node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_printf($arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5_)")
    public static int xenbus_printf(xenbus_transaction t, String dir, String node2, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_read($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<?> xenbus_read(xenbus_transaction t, String dir, String node2, Ptr<@Unsigned Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_read_unsigned((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned int xenbus_read_unsigned(String dir, String node2, @Unsigned int default_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_rm($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int xenbus_rm(xenbus_transaction t, String dir, String node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_scanf($arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5_)")
    public static int xenbus_scanf(xenbus_transaction t, String dir, String node2, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_transaction_end(xenbus_transaction t, int abort) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_transaction_start(Ptr<xenbus_transaction> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_worker(Ptr<misc.work_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_write($arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int xenbus_write(xenbus_transaction t, String dir, String node2, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_write_transaction(@Unsigned int msg_type, Ptr<xenbus_file_priv> u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_write_watch(@Unsigned int msg_type, Ptr<xenbus_file_priv> u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xenbus_register_backend($arg1, $arg2, (const u8*)$arg3)")
    public static int __xenbus_register_backend(Ptr<xenbus_driver> drv, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_dev_is_online(Ptr<xenbus_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_probe_backend($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int xenbus_probe_backend(Ptr<XenDefinitions.xen_bus_type> bus, String type2, String domid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_probe_backend_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_thread(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_uevent_backend((const struct device*)$arg1, $arg2)")
    public static int xenbus_uevent_backend(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_backend_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long xenbus_backend_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_backend_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_backend_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xenbus_map_ring(Ptr<xenbus_device> dev, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> gnt_refs, @Unsigned int nr_grefs, Ptr<@Unsigned @OriginalName(value="grant_handle_t") Integer> handles, Ptr<MapDefinitions.map_ring_valloc> info2, @Unsigned int flags, Ptr<@OriginalName(value="bool") Boolean> leaked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xenbus_register_frontend($arg1, $arg2, (const u8*)$arg3)")
    public static int __xenbus_register_frontend(Ptr<xenbus_driver> drv, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xenbus_switch_state(Ptr<xenbus_device> dev, xenbus_state state2, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_alloc_evtchn(Ptr<xenbus_device> dev, Ptr<@Unsigned @OriginalName(value="evtchn_port_t") Integer> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_dev_cancel(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_dev_changed((const u8*)$arg1, $arg2)")
    public static void xenbus_dev_changed(String node2, Ptr<XenDefinitions.xen_bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_dev_error($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void xenbus_dev_error(Ptr<xenbus_device> dev, int err, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_dev_fatal($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void xenbus_dev_fatal(Ptr<xenbus_device> dev, int err, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_dev_probe(Ptr<runtime.device> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_dev_remove(Ptr<runtime.device> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_dev_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_dev_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_free_evtchn(Ptr<xenbus_device> dev, @Unsigned @OriginalName(value="evtchn_port_t") int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_frontend_closed(Ptr<xenbus_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_frontend_delayed_resume(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_frontend_dev_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_frontend_dev_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_frontend_dev_shutdown(Ptr<runtime.device> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xenbus_late_init(int irq, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_map_ring_hvm(Ptr<xenbus_device> dev, Ptr<MapDefinitions.map_ring_valloc> info2, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> gnt_ref, @Unsigned int nr_grefs, Ptr<Ptr<?>> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_map_ring_pv(Ptr<xenbus_device> dev, Ptr<MapDefinitions.map_ring_valloc> info2, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> gnt_refs, @Unsigned int nr_grefs, Ptr<Ptr<?>> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_map_ring_setup_grant_hvm(@Unsigned long gfn, @Unsigned int goffset, @Unsigned int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_map_ring_valloc(Ptr<xenbus_device> dev, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> gnt_refs, @Unsigned int nr_grefs, Ptr<Ptr<?>> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_match($arg1, (const struct device_driver*)$arg2)")
    public static int xenbus_match(Ptr<runtime.device> _dev, Ptr<DeviceDefinitions.device_driver> _drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_otherend_changed($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void xenbus_otherend_changed(Ptr<xenbus_watch> watch2, String path2, String token, int ignore_on_shutdown) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_probe_devices(Ptr<XenDefinitions.xen_bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_probe_frontend($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int xenbus_probe_frontend(Ptr<XenDefinitions.xen_bus_type> bus, String type2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_probe_frontend_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_probe_initcall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_probe_node($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int xenbus_probe_node(Ptr<XenDefinitions.xen_bus_type> bus, String type2, String nodename) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_probe_thread(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_read_driver_state((const u8*)$arg1)")
    public static xenbus_state xenbus_read_driver_state(String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_read_otherend_details(Ptr<xenbus_device> xendev, String id_node, String path_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_register_driver_common($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int xenbus_register_driver_common(Ptr<xenbus_driver> drv, Ptr<XenDefinitions.xen_bus_type> bus, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_reset_backend_state_changed($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void xenbus_reset_backend_state_changed(Ptr<xenbus_watch> w, String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_reset_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_reset_wait_for_backend(String be, int expected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_resume_cb(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_ring_ops_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_setup_ring(Ptr<xenbus_device> dev, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<Ptr<?>> vaddr, @Unsigned int nr_pages, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> grefs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xenbus_strstate($arg1))")
    public static String xenbus_strstate(xenbus_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_switch_fatal($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void xenbus_switch_fatal(Ptr<xenbus_device> dev, int depth, int err, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_switch_state(Ptr<xenbus_device> dev, xenbus_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_teardown_ring(Ptr<Ptr<?>> vaddr, @Unsigned int nr_pages, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> grefs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_uevent_frontend((const struct device*)$arg1, $arg2)")
    public static int xenbus_uevent_frontend(Ptr<runtime.device> _dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_unmap_ring(Ptr<xenbus_device> dev, Ptr<@Unsigned @OriginalName(value="grant_handle_t") Integer> handles, @Unsigned int nr_handles, Ptr<@Unsigned Long> vaddrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_unmap_ring_hvm(Ptr<xenbus_device> dev, Ptr<?> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_unmap_ring_pv(Ptr<xenbus_device> dev, Ptr<?> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_unmap_ring_setup_grant_hvm(@Unsigned long gfn, @Unsigned int goffset, @Unsigned int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xenbus_unmap_ring_vfree(Ptr<xenbus_device> dev, Ptr<?> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xenbus_unregister_driver(Ptr<xenbus_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_va_dev_error($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void xenbus_va_dev_error(Ptr<xenbus_device> dev, int err, String fmt, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_watch_path($arg1, (const u8*)$arg2, $arg3, (_Bool (*)(struct xenbus_watch*, const u8*, const u8*))$arg4, (void (*)(struct xenbus_watch*, const u8*, const u8*))$arg5)")
    public static int xenbus_watch_path(Ptr<xenbus_device> dev, String path2, Ptr<xenbus_watch> watch2, Ptr<?> will_handle, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xenbus_watch_pathfmt($arg1, $arg2, (_Bool (*)(struct xenbus_watch*, const u8*, const u8*))$arg3, (void (*)(struct xenbus_watch*, const u8*, const u8*))$arg4, (const u8*)$arg5, $arg6_)")
    public static int xenbus_watch_pathfmt(Ptr<xenbus_device> dev, Ptr<xenbus_watch> watch2, Ptr<?> will_handle, Ptr<?> callback2, String pathfmt, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_file_priv")
    @NotUsableInJava
    public static class xenbus_file_priv
    extends Struct {
        public runtime.mutex msgbuffer_mutex;
        public ListDefinitions.list_head transactions;
        public ListDefinitions.list_head watches;
        public @Unsigned int len;
        public UDefinitions.u_of_xenbus_file_priv u;
        public runtime.mutex reply_mutex;
        public ListDefinitions.list_head read_buffers;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head read_waitq;
        public runtime.kref kref;
        public misc.work_struct wq;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_transaction_holder")
    @NotUsableInJava
    public static class xenbus_transaction_holder
    extends Struct {
        public ListDefinitions.list_head list;
        public xenbus_transaction handle;
        public @Unsigned int generation_id;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_driver")
    @NotUsableInJava
    public static class xenbus_driver
    extends Struct {
        public String name;
        public Ptr<xenbus_device_id> ids;
        public boolean allow_rebind;
        public boolean not_essential;
        public Ptr<?> probe;
        public Ptr<?> otherend_changed;
        public Ptr<?> remove;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> uevent;
        public DeviceDefinitions.device_driver driver;
        public Ptr<?> read_otherend_details;
        public Ptr<?> is_ready;
        public Ptr<?> reclaim_memory;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_device_id")
    @NotUsableInJava
    public static class xenbus_device_id
    extends Struct {
        public char @Size(value=32) [] devicetype;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_ring_ops")
    @NotUsableInJava
    public static class xenbus_ring_ops
    extends Struct {
        public Ptr<?> map;
        public Ptr<?> unmap;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_map_node")
    @NotUsableInJava
    public static class xenbus_map_node
    extends Struct {
        public ListDefinitions.list_head next;
        @InlineUnion(value=17625)
        public  @InlineUnion(value=17625) PvDefinitions.pv_of_anon_member_of_xenbus_map_node pv;
        @InlineUnion(value=17625)
        public @InlineUnion(value=17625) misc.hvm_of_anon_member_of_xenbus_map_node hvm;
        public @Unsigned @OriginalName(value="grant_handle_t") int @Size(value=16) [] handles;
        public @Unsigned int nr_handles;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_transaction")
    @NotUsableInJava
    public static class xenbus_transaction
    extends Struct {
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_device")
    @NotUsableInJava
    public static class xenbus_device
    extends Struct {
        public String devicetype;
        public String nodename;
        public String otherend;
        public int otherend_id;
        public xenbus_watch otherend_watch;
        public runtime.device dev;
        public xenbus_state state;
        public runtime.completion down;
        public misc.work_struct work;
        public runtime.semaphore reclaim_sem;
        public AtomicDefinitions.atomic_t event_channels;
        public AtomicDefinitions.atomic_t events;
        public AtomicDefinitions.atomic_t spurious_events;
        public AtomicDefinitions.atomic_t jiffies_eoi_delayed;
        public @Unsigned int spurious_threshold;
    }

    @Type(noCCodeGeneration=true, cType="struct xenbus_watch")
    @NotUsableInJava
    public static class xenbus_watch
    extends Struct {
        public ListDefinitions.list_head list;
        public String node;
        public @Unsigned int nr_pending;
        public Ptr<?> will_handle;
        public Ptr<?> callback;
    }

    @Type(noCCodeGeneration=true, cType="enum xenbus_state")
    public static enum xenbus_state implements Enum<xenbus_state>,
    TypedEnum<xenbus_state, Integer>
    {
        XenbusStateUnknown,
        XenbusStateInitialising,
        XenbusStateInitWait,
        XenbusStateInitialised,
        XenbusStateConnected,
        XenbusStateClosing,
        XenbusStateClosed,
        XenbusStateReconfiguring,
        XenbusStateReconfigured;

    }
}

