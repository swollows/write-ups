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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FirmwareDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class FwDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fw_copy_to_prealloc_buf(Ptr<runtime.firmware> fw, Ptr<?> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_fallback_set_cache_timeout() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_fallback_set_default_timeout() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_load_sysfs_fallback(Ptr<fw_sysfs> fw_sysfs2, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fw_devlink_link_to_consumers(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fw_devlink_link_to_suppliers(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fw_devlink_pickup_dangling_consumers(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_handle> new_sup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __fw_devlink_relax_cycles(Ptr<FwnodeDefinitions.fwnode_handle> con_handle, Ptr<FwnodeDefinitions.fwnode_handle> sup_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fw_add_devm_name($arg1, (const u8*)$arg2)")
    public static int fw_add_devm_name(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_class_show(Ptr<misc.esre_entry> entry, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fw_decompress_xz($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static int fw_decompress_xz(Ptr<runtime.device> dev, Ptr<fw_priv> fw_priv2, @Unsigned long in_size, Ptr<?> in_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fw_decompress_zstd($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static int fw_decompress_zstd(Ptr<runtime.device> dev, Ptr<fw_priv> fw_priv2, @Unsigned long in_size, Ptr<?> in_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devlink_create_devlink(Ptr<runtime.device> con, Ptr<FwnodeDefinitions.fwnode_handle> sup_handle, Ptr<FwnodeDefinitions.fwnode_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devlink_dev_sync_state(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_devlink_drivers_done() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fw_devlink_is_strict() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devlink_no_driver(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_devlink_parse_fwtree(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_devlink_probing_done() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_devlink_purge_absent_suppliers(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_devlink_relax_link(Ptr<DeviceDefinitions.device_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devlink_setup(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devlink_strict_setup(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devlink_sync_state_setup(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_devm_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_free_paged_buf(Ptr<fw_priv> fw_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fw_get_filesystem_firmware($arg1, $arg2, (const u8*)$arg3, (int (*)(struct device*, struct fw_priv*, long unsigned int, const void*))$arg4)")
    public static int fw_get_filesystem_firmware(Ptr<runtime.device> device2, Ptr<fw_priv> fw_priv2, String suffix, Ptr<?> decompress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_grow_paged_buf(Ptr<fw_priv> fw_priv2, int pages_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fw_is_paged_buf(Ptr<fw_priv> fw_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fw_log_firmware_info((const struct firmware*)$arg1, (const u8*)$arg2, $arg3)")
    public static void fw_log_firmware_info(Ptr<runtime.firmware> fw, String name, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_map_paged_buf(Ptr<fw_priv> fw_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_name_devm_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_pm_notify(Ptr<misc.notifier_block> notify_block, @Unsigned long mode, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_resource_count_max_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_resource_count_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_resource_version_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_set_page_data(Ptr<fw_priv> fw_priv2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_shutdown_notify(Ptr<misc.notifier_block> unused1, @Unsigned long unused2, Ptr<?> unused3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_state_init(Ptr<fw_priv> fw_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_type_show(Ptr<misc.esre_entry> entry, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_upload_free(Ptr<fw_sysfs> fw_sysfs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short fw_upload_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_upload_main(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fw_upload_start(Ptr<fw_sysfs> fw_sysfs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fw_load_abort(Ptr<fw_priv> fw_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fw_create_instance($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<fw_sysfs> fw_create_instance(Ptr<runtime.firmware> firmware2, String fw_name, Ptr<runtime.device> device2, @Unsigned int opt_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fw_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_platform_size_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fw_vendor_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fw_upload_priv")
    @NotUsableInJava
    public static class fw_upload_priv
    extends Struct {
        public Ptr<fw_upload> fw_upload;
        public Ptr<runtime.module> module;
        public String name;
        public Ptr<fw_upload_ops> ops;
        public runtime.mutex lock;
        public misc.work_struct work;
        public Ptr<Character> data;
        public @Unsigned int remaining_size;
        public fw_upload_prog progress;
        public fw_upload_prog err_progress;
        public fw_upload_err err_code;
    }

    @Type(noCCodeGeneration=true, cType="enum fw_upload_prog")
    public static enum fw_upload_prog implements Enum<fw_upload_prog>,
    TypedEnum<fw_upload_prog, Integer>
    {
        FW_UPLOAD_PROG_IDLE,
        FW_UPLOAD_PROG_RECEIVING,
        FW_UPLOAD_PROG_PREPARING,
        FW_UPLOAD_PROG_TRANSFERRING,
        FW_UPLOAD_PROG_PROGRAMMING,
        FW_UPLOAD_PROG_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct fw_upload_ops")
    @NotUsableInJava
    public static class fw_upload_ops
    extends Struct {
        public Ptr<?> prepare;
        public Ptr<?> write;
        public Ptr<?> poll_complete;
        public Ptr<?> cancel;
        public Ptr<?> cleanup;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_upload")
    @NotUsableInJava
    public static class fw_upload
    extends Struct {
        public Ptr<?> dd_handle;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="enum fw_upload_err")
    public static enum fw_upload_err implements Enum<fw_upload_err>,
    TypedEnum<fw_upload_err, Integer>
    {
        FW_UPLOAD_ERR_NONE,
        FW_UPLOAD_ERR_HW_ERROR,
        FW_UPLOAD_ERR_TIMEOUT,
        FW_UPLOAD_ERR_CANCELED,
        FW_UPLOAD_ERR_BUSY,
        FW_UPLOAD_ERR_INVALID_SIZE,
        FW_UPLOAD_ERR_RW_ERROR,
        FW_UPLOAD_ERR_WEAROUT,
        FW_UPLOAD_ERR_FW_INVALID,
        FW_UPLOAD_ERR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct fw_name_devm")
    @NotUsableInJava
    public static class fw_name_devm
    extends Struct {
        public @Unsigned long magic;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_cache_entry")
    @NotUsableInJava
    public static class fw_cache_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_rsc_trace")
    @NotUsableInJava
    public static class fw_rsc_trace
    extends Struct {
        public @Unsigned int da;
        public @Unsigned int len;
        public @Unsigned int reserved;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_rsc_devmem")
    @NotUsableInJava
    public static class fw_rsc_devmem
    extends Struct {
        public @Unsigned int da;
        public @Unsigned int pa;
        public @Unsigned int len;
        public @Unsigned int flags;
        public @Unsigned int reserved;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_rsc_carveout")
    @NotUsableInJava
    public static class fw_rsc_carveout
    extends Struct {
        public @Unsigned int da;
        public @Unsigned int pa;
        public @Unsigned int len;
        public @Unsigned int flags;
        public @Unsigned int reserved;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="enum fw_resource_type")
    public static enum fw_resource_type implements Enum<fw_resource_type>,
    TypedEnum<fw_resource_type, Integer>
    {
        RSC_CARVEOUT,
        RSC_DEVMEM,
        RSC_TRACE,
        RSC_VDEV,
        RSC_LAST,
        RSC_VENDOR_START,
        RSC_VENDOR_END;

    }

    @Type(noCCodeGeneration=true, cType="struct fw_rsc_hdr")
    @NotUsableInJava
    public static class fw_rsc_hdr
    extends Struct {
        public @Unsigned int type;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_rsc_vdev")
    @NotUsableInJava
    public static class fw_rsc_vdev
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int notifyid;
        public @Unsigned int dfeatures;
        public @Unsigned int gfeatures;
        public @Unsigned int config_len;
        public char status;
        public char num_of_vrings;
        public char @Size(value=2) [] reserved;
        public fw_rsc_vdev_vring @Size(value=0) [] vring;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_rsc_vdev_vring")
    @NotUsableInJava
    public static class fw_rsc_vdev_vring
    extends Struct {
        public @Unsigned int da;
        public @Unsigned int align;
        public @Unsigned int num;
        public @Unsigned int notifyid;
        public @Unsigned int pa;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_sysfs")
    @NotUsableInJava
    public static class fw_sysfs
    extends Struct {
        public boolean nowait;
        public runtime.device dev;
        public Ptr<fw_priv> fw_priv;
        public Ptr<runtime.firmware> fw;
        public Ptr<?> fw_upload_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_priv")
    @NotUsableInJava
    public static class fw_priv
    extends Struct {
        public runtime.kref ref;
        public ListDefinitions.list_head list;
        public Ptr<FirmwareDefinitions.firmware_cache> fwc;
        public fw_state fw_st;
        public Ptr<?> data;
        public @Unsigned long size;
        public @Unsigned long allocated_size;
        public @Unsigned long offset;
        public @Unsigned int opt_flags;
        public boolean is_paged_buf;
        public Ptr<Ptr<runtime.page>> pages;
        public int nr_pages;
        public int page_array_size;
        public boolean need_uevent;
        public ListDefinitions.list_head pending_list;
        public String fw_name;
    }

    @Type(noCCodeGeneration=true, cType="struct fw_state")
    @NotUsableInJava
    public static class fw_state
    extends Struct {
        public runtime.completion completion;
        public fw_status status;
    }

    @Type(noCCodeGeneration=true, cType="enum fw_status")
    public static enum fw_status implements Enum<fw_status>,
    TypedEnum<fw_status, Integer>
    {
        FW_STATUS_UNKNOWN,
        FW_STATUS_LOADING,
        FW_STATUS_DONE,
        FW_STATUS_ABORTED;

    }

    @Type(noCCodeGeneration=true, cType="enum fw_opt")
    public static enum fw_opt implements Enum<fw_opt>,
    TypedEnum<fw_opt, Integer>
    {
        FW_OPT_UEVENT,
        FW_OPT_NOWAIT,
        FW_OPT_USERHELPER,
        FW_OPT_NO_WARN,
        FW_OPT_NOCACHE,
        FW_OPT_NOFALLBACK_SYSFS,
        FW_OPT_FALLBACK_PLATFORM,
        FW_OPT_PARTIAL;

    }

    @Type(noCCodeGeneration=true, cType="union fw_table_header")
    @NotUsableInJava
    public static class fw_table_header
    extends Union {
        public AcpiDefinitions.acpi_table_header acpi;
        public AcpiDefinitions.acpi_table_cdat cdat;
    }
}

