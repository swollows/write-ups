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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.EmDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class RioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rio_local_read_config_16(Ptr<rio_mport> mport, @Unsigned int offset, Ptr<@Unsigned Short> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rio_local_read_config_32(Ptr<rio_mport> mport, @Unsigned int offset, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rio_local_read_config_8(Ptr<rio_mport> mport, @Unsigned int offset, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rio_local_write_config_16(Ptr<rio_mport> mport, @Unsigned int offset, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rio_local_write_config_32(Ptr<rio_mport> mport, @Unsigned int offset, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rio_local_write_config_8(Ptr<rio_mport> mport, @Unsigned int offset, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_read_config_16(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount, @Unsigned int offset, Ptr<@Unsigned Short> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_read_config_32(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount, @Unsigned int offset, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_read_config_8(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount, @Unsigned int offset, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_send_doorbell(Ptr<rio_mport> mport, @Unsigned short destid, @Unsigned short data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_write_config_16(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount, @Unsigned int offset, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_write_config_32(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount, @Unsigned int offset, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_write_config_8(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount, @Unsigned int offset, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short rio_dev_is_attr_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rio_read_config(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rio_write_config(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_add_device(Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_add_mport_pw_handler($arg1, $arg2, (int (*)(struct rio_mport*, void*, union rio_pw_msg*, int))$arg3)")
    public static int rio_add_mport_pw_handler(Ptr<rio_mport> mport, Ptr<?> context2, Ptr<?> pwcback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_add_net(Ptr<rio_net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rio_net> rio_alloc_net(Ptr<rio_mport> mport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rio_chan_filter(Ptr<DmaDefinitions.dma_chan> chan, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_clr_err_stopped(Ptr<rio_dev> rdev, @Unsigned int pnum, @Unsigned int err_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_del_device(Ptr<rio_dev> rdev, rio_device_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_del_mport_pw_handler($arg1, $arg2, (int (*)(struct rio_mport*, void*, union rio_pw_msg*, int))$arg3)")
    public static int rio_del_mport_pw_handler(Ptr<rio_mport> mport, Ptr<?> context2, Ptr<?> pwcback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_async_tx_descriptor> rio_dma_prep_slave_sg(Ptr<rio_dev> rdev, Ptr<DmaDefinitions.dma_chan> dchan, Ptr<rio_dma_data> data, DmaDefinitions.dma_transfer_direction direction, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_async_tx_descriptor> rio_dma_prep_xfer(Ptr<DmaDefinitions.dma_chan> dchan, @Unsigned short destid, Ptr<rio_dma_data> data, DmaDefinitions.dma_transfer_direction direction, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_enable_rx_tx_port(Ptr<rio_mport> port2, int local, @Unsigned short destid, char hopcount, char port_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rio_mport> rio_find_mport(int mport_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_free_net(Ptr<rio_net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rio_dev> rio_get_comptag(@Unsigned int comp_tag, Ptr<rio_dev> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_inb_pwrite_handler(Ptr<rio_mport> mport, Ptr<rio_pw_msg> pw_msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_init_mports() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short rio_local_get_device_id(Ptr<rio_mport> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_local_set_device_id(Ptr<rio_mport> port2, @Unsigned short did) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_lock_device(Ptr<rio_mport> port2, @Unsigned short destid, char hopcount, int wait_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_map_inb_region(Ptr<rio_mport> mport, @Unsigned @OriginalName(value="dma_addr_t") long local, @Unsigned long rbase, @Unsigned int size, @Unsigned int rflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_map_outb_region(Ptr<rio_mport> mport, @Unsigned short destid, @Unsigned long rbase, @Unsigned int size, @Unsigned int rflags, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> local) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_chk_dev_access(Ptr<rio_mport> mport, @Unsigned short destid, char hopcount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_cleanup_callback(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int rio_mport_get_efb(Ptr<rio_mport> port2, int local, @Unsigned short destid, char hopcount, @Unsigned int from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int rio_mport_get_feature(Ptr<rio_mport> port2, int local, @Unsigned short destid, char hopcount, int ftr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int rio_mport_get_physefb(Ptr<rio_mport> port2, int local, @Unsigned short destid, char hopcount, Ptr<@Unsigned Integer> rmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_initialize(Ptr<rio_mport> mport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_mport_scan(int mport_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_pw_enable(Ptr<rio_mport> mport, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_query_mport(Ptr<rio_mport> port2, Ptr<rio_mport_attr> mport_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_register_mport(Ptr<rio_mport> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_register_scan(int mport_id, Ptr<rio_scan> scan_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_release_dma(Ptr<DmaDefinitions.dma_chan> dchan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_release_inb_dbell(Ptr<rio_mport> mport, @Unsigned short start, @Unsigned short end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_release_inb_mbox(Ptr<rio_mport> mport, int mbox) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_release_inb_pwrite(Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_release_outb_dbell(Ptr<rio_dev> rdev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_release_outb_mbox(Ptr<rio_mport> mport, int mbox) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_chan> rio_request_dma(Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_request_inb_dbell($arg1, $arg2, $arg3, $arg4, (void (*)(struct rio_mport*, void*, short unsigned int, short unsigned int, short unsigned int))$arg5)")
    public static int rio_request_inb_dbell(Ptr<rio_mport> mport, Ptr<?> dev_id, @Unsigned short start, @Unsigned short end, Ptr<?> dinb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_request_inb_mbox($arg1, $arg2, $arg3, $arg4, (void (*)(struct rio_mport*, void*, int, int))$arg5)")
    public static int rio_request_inb_mbox(Ptr<rio_mport> mport, Ptr<?> dev_id, int mbox, int entries, Ptr<?> minb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_request_inb_pwrite($arg1, (int (*)(struct rio_dev*, union rio_pw_msg*, int))$arg2)")
    public static int rio_request_inb_pwrite(Ptr<rio_dev> rdev, Ptr<?> pwcback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_chan> rio_request_mport_dma(Ptr<rio_mport> mport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> rio_request_outb_dbell(Ptr<rio_dev> rdev, @Unsigned short start, @Unsigned short end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_request_outb_mbox($arg1, $arg2, $arg3, $arg4, (void (*)(struct rio_mport*, void*, int, int))$arg5)")
    public static int rio_request_outb_mbox(Ptr<rio_mport> mport, Ptr<?> dev_id, int mbox, int entries, Ptr<?> moutb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_route_add_entry(Ptr<rio_dev> rdev, @Unsigned short table, @Unsigned short route_destid, char route_port, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_route_clr_table(Ptr<rio_dev> rdev, @Unsigned short table, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_route_get_entry(Ptr<rio_dev> rdev, @Unsigned short table, @Unsigned short route_destid, Ptr<Character> route_port, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_set_port_lockout(Ptr<rio_dev> rdev, @Unsigned int pnum, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_unlock_device(Ptr<rio_mport> port2, @Unsigned short destid, char hopcount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_unmap_inb_region(Ptr<rio_mport> mport, @Unsigned @OriginalName(value="dma_addr_t") long lstart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_unmap_outb_region(Ptr<rio_mport> mport, @Unsigned short destid, @Unsigned long rstart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_unregister_mport(Ptr<rio_mport> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_unregister_scan(int mport_id, Ptr<rio_scan> scan_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_attach_device(Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rio_dev> rio_dev_get(Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_dev_put(Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_device_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_device_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_match_bus($arg1, (const struct device_driver*)$arg2)")
    public static int rio_match_bus(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct rio_device_id*)rio_match_device((const struct rio_device_id*)$arg1, (const struct rio_dev*)$arg2))")
    public static Ptr<rio_device_id> rio_match_device(Ptr<rio_device_id> id, Ptr<rio_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rio_register_driver(Ptr<rio_driver> rdrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rio_uevent((const struct device*)$arg1, $arg2)")
    public static int rio_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rio_unregister_driver(Ptr<rio_driver> rdrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rio_disc_work")
    @NotUsableInJava
    public static class rio_disc_work
    extends Struct {
        public misc.work_struct work;
        public Ptr<rio_mport> mport;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_pwrite")
    @NotUsableInJava
    public static class rio_pwrite
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<?> pwcback;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_scan_node")
    @NotUsableInJava
    public static class rio_scan_node
    extends Struct {
        public int mport_id;
        public ListDefinitions.list_head node;
        public Ptr<rio_scan> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_dma_data")
    @NotUsableInJava
    public static class rio_dma_data
    extends Struct {
        public Ptr<runtime.scatterlist> sg;
        public @Unsigned int sg_len;
        public @Unsigned long rio_addr;
        public char rio_addr_u;
        public rio_write_type wr_type;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_dma_ext")
    @NotUsableInJava
    public static class rio_dma_ext
    extends Struct {
        public @Unsigned short destid;
        public @Unsigned long rio_addr;
        public char rio_addr_u;
        public rio_write_type wr_type;
    }

    @Type(noCCodeGeneration=true, cType="enum rio_write_type")
    public static enum rio_write_type implements Enum<rio_write_type>,
    TypedEnum<rio_write_type, Integer>
    {
        RDW_DEFAULT,
        RDW_ALL_NWRITE,
        RDW_ALL_NWRITE_R,
        RDW_LAST_NWRITE_R;

    }

    @Type(noCCodeGeneration=true, cType="struct rio_dbell")
    @NotUsableInJava
    public static class rio_dbell
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.resource> res;
        public Ptr<?> dinb;
        public Ptr<?> dev_id;
    }

    @Type(noCCodeGeneration=true, cType="enum rio_device_state")
    public static enum rio_device_state implements Enum<rio_device_state>,
    TypedEnum<rio_device_state, Integer>
    {
        RIO_DEVICE_INITIALIZING,
        RIO_DEVICE_RUNNING,
        RIO_DEVICE_GONE,
        RIO_DEVICE_SHUTDOWN;

    }

    @Type(noCCodeGeneration=true, cType="struct rio_mport_attr")
    @NotUsableInJava
    public static class rio_mport_attr
    extends Struct {
        public int flags;
        public int link_speed;
        public int link_width;
        public int dma_max_sge;
        public int dma_max_size;
        public int dma_align;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_scan")
    @NotUsableInJava
    public static class rio_scan
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> enumerate;
        public Ptr<?> discover;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_ops")
    @NotUsableInJava
    public static class rio_ops
    extends Struct {
        public Ptr<?> lcread;
        public Ptr<?> lcwrite;
        public Ptr<?> cread;
        public Ptr<?> cwrite;
        public Ptr<?> dsend;
        public Ptr<?> pwenable;
        public Ptr<?> open_outb_mbox;
        public Ptr<?> close_outb_mbox;
        public Ptr<?> open_inb_mbox;
        public Ptr<?> close_inb_mbox;
        public Ptr<?> add_outb_message;
        public Ptr<?> add_inb_buffer;
        public Ptr<?> get_inb_message;
        public Ptr<?> map_inb;
        public Ptr<?> unmap_inb;
        public Ptr<?> query_mport;
        public Ptr<?> map_outb;
        public Ptr<?> unmap_outb;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_msg")
    @NotUsableInJava
    public static class rio_msg
    extends Struct {
        public Ptr<runtime.resource> res;
        public Ptr<?> mcback;
    }

    @Type(noCCodeGeneration=true, cType="union rio_pw_msg")
    @NotUsableInJava
    public static class rio_pw_msg
    extends Union {
        public EmDefinitions.em_of_rio_pw_msg em;
        public @Unsigned int @Size(value=16) [] raw;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_driver")
    @NotUsableInJava
    public static class rio_driver
    extends Struct {
        public ListDefinitions.list_head node;
        public String name;
        public Ptr<rio_device_id> id_table;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> enable_wake;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_net")
    @NotUsableInJava
    public static class rio_net
    extends Struct {
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head devices;
        public ListDefinitions.list_head switches;
        public ListDefinitions.list_head mports;
        public Ptr<rio_mport> hport;
        public char id;
        public runtime.device dev;
        public Ptr<?> enum_data;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_mport")
    @NotUsableInJava
    public static class rio_mport
    extends Struct {
        public ListDefinitions.list_head dbells;
        public ListDefinitions.list_head pwrites;
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head nnode;
        public Ptr<rio_net> net;
        public runtime.mutex lock;
        public runtime.resource iores;
        public runtime.resource @Size(value=16) [] riores;
        public rio_msg @Size(value=4) [] inb_msg;
        public rio_msg @Size(value=4) [] outb_msg;
        public int host_deviceid;
        public Ptr<rio_ops> ops;
        public char id;
        public char index;
        public @Unsigned int sys_size;
        public @Unsigned int phys_efptr;
        public @Unsigned int phys_rmap;
        public char @Size(value=40) [] name;
        public runtime.device dev;
        public Ptr<?> priv;
        public DmaDefinitions.dma_device dma;
        public Ptr<rio_scan> nscan;
        public AtomicDefinitions.atomic_t state;
        public @Unsigned int pwe_refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_dev")
    @NotUsableInJava
    public static class rio_dev
    extends Struct {
        public ListDefinitions.list_head global_list;
        public ListDefinitions.list_head net_list;
        public Ptr<rio_net> net;
        public boolean do_enum;
        public @Unsigned short did;
        public @Unsigned short vid;
        public @Unsigned int device_rev;
        public @Unsigned short asm_did;
        public @Unsigned short asm_vid;
        public @Unsigned short asm_rev;
        public @Unsigned short efptr;
        public @Unsigned int pef;
        public @Unsigned int swpinfo;
        public @Unsigned int src_ops;
        public @Unsigned int dst_ops;
        public @Unsigned int comp_tag;
        public @Unsigned int phys_efptr;
        public @Unsigned int phys_rmap;
        public @Unsigned int em_efptr;
        public @Unsigned long dma_mask;
        public Ptr<rio_driver> driver;
        public runtime.device dev;
        public runtime.resource @Size(value=16) [] riores;
        public Ptr<?> pwcback;
        public @Unsigned short destid;
        public char hopcount;
        public Ptr<rio_dev> prev;
        public AtomicDefinitions.atomic_t state;
        public rio_switch @Size(value=0) [] rswitch;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_switch_ops")
    @NotUsableInJava
    public static class rio_switch_ops
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> add_entry;
        public Ptr<?> get_entry;
        public Ptr<?> clr_table;
        public Ptr<?> set_domain;
        public Ptr<?> get_domain;
        public Ptr<?> em_init;
        public Ptr<?> em_handle;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_switch")
    @NotUsableInJava
    public static class rio_switch
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<Character> route_table;
        public @Unsigned int port_ok;
        public Ptr<rio_switch_ops> ops;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<rio_dev> @Size(value=0) [] nextdev;
    }

    @Type(noCCodeGeneration=true, cType="struct rio_device_id")
    @NotUsableInJava
    public static class rio_device_id
    extends Struct {
        public @Unsigned short did;
        public @Unsigned short vid;
        public @Unsigned short asm_did;
        public @Unsigned short asm_vid;
    }
}

