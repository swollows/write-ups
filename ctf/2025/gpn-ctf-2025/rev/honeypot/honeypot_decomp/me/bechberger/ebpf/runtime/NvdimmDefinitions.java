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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.CpuhpDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NvdimmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__nvdimm_create($arg1, $arg2, (const struct attribute_group**)$arg3, $arg4, $arg5, $arg6, $arg7, (const u8*)$arg8, (const struct nvdimm_security_ops*)$arg9, (const struct nvdimm_fw_ops*)$arg10)")
    public static Ptr<runtime.nvdimm> __nvdimm_create(Ptr<nvdimm_bus> nvdimm_bus2, Ptr<?> provider_data, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, @Unsigned long flags, @Unsigned long cmd_mask, int num_flush, Ptr<runtime.resource> flush_wpq, String dimm_id, Ptr<nvdimm_security_ops> sec_ops, Ptr<nvdimm_fw_ops> fw_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> nvdimm_allocate_dpa(Ptr<nvdimm_drvdata> ndd, Ptr<NdDefinitions.nd_label_id> label_id, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long nvdimm_allocated_dpa(Ptr<nvdimm_drvdata> ndd, Ptr<NdDefinitions.nd_label_id> label_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvdimm_badblocks_populate($arg1, $arg2, (const struct range*)$arg3)")
    public static void nvdimm_badblocks_populate(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<runtime.badblocks> bb, Ptr<runtime.range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_bus_check_dimm_count(Ptr<nvdimm_bus> nvdimm_bus2, int dimm_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_check_config_data(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_clear_locked(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nvdimm_cmd_mask(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_delete(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_devs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_drvdata_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nvdimm_firmware_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_free_dpa(Ptr<nvdimm_drvdata> ndd, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_get_config_data(Ptr<nvdimm_drvdata> ndd, Ptr<?> buf, @Unsigned long offset, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_in_overwrite(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_init_nsarea(Ptr<nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> nvdimm_kobj(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)nvdimm_name($arg1))")
    public static String nvdimm_name(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> nvdimm_provider_data(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_security_freeze(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_security_setup_events(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_set_config_data(Ptr<nvdimm_drvdata> ndd, @Unsigned long offset, Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_set_labeling(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_set_locked(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nvdimm_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_num_label_slots(Ptr<nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long __nvdimm_namespace_capacity(Ptr<NdDefinitions.nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nvdimm_setup_pfn(Ptr<NdDefinitions.nd_pfn> nd_pfn2, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_bus_add_badrange(Ptr<nvdimm_bus> nvdimm_bus2, @Unsigned long addr2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nvdimm_bus_firmware_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_lock(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_unlock(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long nvdimm_events_sysfs_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_map_put(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_map_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long nvdimm_namespace_capacity(Ptr<NdDefinitions.nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_namespace_common> nvdimm_namespace_common_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)nvdimm_namespace_disk_name($arg1, $arg2))")
    public static String nvdimm_namespace_disk_name(Ptr<NdDefinitions.nd_namespace_common> ndns, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nvdimm_namespace_locked(Ptr<NdDefinitions.nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_pmu_cpu_hotplug_init(Ptr<nvdimm_pmu> nd_pmu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_pmu_cpu_offline(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_pmu_cpu_online(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long nvdimm_pmu_cpumask_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_pmu_free_hotplug_memory(Ptr<nvdimm_pmu> nd_pmu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_setup_pfn(Ptr<NdDefinitions.nd_pfn> nd_pfn2, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nvdimm_security_overwrite_query(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nvdimm_security_unlock(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_bus_create_ndctl(Ptr<nvdimm_bus> nvdimm_bus2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_destroy_ndctl(Ptr<nvdimm_bus> nvdimm_bus2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvdimm_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int nvdimm_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<nvdimm_bus> nvdimm_bus_register(Ptr<runtime.device> parent, Ptr<nvdimm_bus_descriptor> nd_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvdimm_bus_uevent((const struct device*)$arg1, $arg2)")
    public static int nvdimm_bus_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_bus_unregister(Ptr<nvdimm_bus> nvdimm_bus2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_check_and_set_ro(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_clear_badblocks_region(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long nvdimm_clear_poison(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_dev_to_target_node(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_flush(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)nvdimm_get_user_key_payload($arg1, $arg2, $arg3, $arg4))")
    public static Ptr<?> nvdimm_get_user_key_payload(Ptr<runtime.nvdimm> nvdimm2, @OriginalName(value="key_serial_t") int id, int subclass, Ptr<Ptr<runtime.key>> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_has_cache(Ptr<NdDefinitions.nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_has_flush(Ptr<NdDefinitions.nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_map_flush(Ptr<runtime.device> dev, Ptr<runtime.nvdimm> nvdimm2, int dimm, Ptr<NdDefinitions.nd_region_data> ndrd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_region> nvdimm_pmem_region_create(Ptr<nvdimm_bus> nvdimm_bus2, Ptr<NdDefinitions.nd_region_desc> ndr_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_region_delete(Ptr<NdDefinitions.nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_region_notify(Ptr<NdDefinitions.nd_region> nd_region2, nvdimm_event event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.key> nvdimm_request_key(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvdimm_security_overwrite_query(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvdimm_security_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long nvdimm_security_store(Ptr<runtime.device> dev, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvdimm_security_unlock(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<nvdimm_bus> nvdimm_to_bus(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_region> nvdimm_volatile_region_create(Ptr<nvdimm_bus> nvdimm_bus2, Ptr<NdDefinitions.nd_region_desc> ndr_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_pmu")
    @NotUsableInJava
    public static class nvdimm_pmu
    extends Struct {
        public runtime.pmu pmu;
        public Ptr<runtime.device> dev;
        public int cpu;
        public misc.hlist_node node;
        public CpuhpDefinitions.cpuhp_state cpuhp_state;
        public runtime.cpumask arch_cpumask;
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_map")
    @NotUsableInJava
    public static class nvdimm_map
    extends Struct {
        public Ptr<nvdimm_bus> nvdimm_bus;
        public ListDefinitions.list_head list;
        public @Unsigned @OriginalName(value="resource_size_t") long offset;
        public @Unsigned long flags;
        public @Unsigned long size;
        @InlineUnion(value=94466)
        public @InlineUnion(value=94466) Ptr<?> mem;
        @InlineUnion(value=94466)
        public @InlineUnion(value=94466) Ptr<?> iomem;
        public runtime.kref kref;
    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_security_bits")
    public static enum nvdimm_security_bits implements Enum<nvdimm_security_bits>,
    TypedEnum<nvdimm_security_bits, Integer>
    {
        NVDIMM_SECURITY_DISABLED,
        NVDIMM_SECURITY_UNLOCKED,
        NVDIMM_SECURITY_LOCKED,
        NVDIMM_SECURITY_FROZEN,
        NVDIMM_SECURITY_OVERWRITE;

    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_cxl_label")
    @NotUsableInJava
    public static class nvdimm_cxl_label
    extends Struct {
        public char @Size(value=16) [] type;
        public char @Size(value=16) [] uuid;
        public char @Size(value=64) [] name;
        public @Unsigned @OriginalName(value="__le32") int flags;
        public @Unsigned @OriginalName(value="__le16") short nrange;
        public @Unsigned @OriginalName(value="__le16") short position;
        public @Unsigned @OriginalName(value="__le64") long dpa;
        public @Unsigned @OriginalName(value="__le64") long rawsize;
        public @Unsigned @OriginalName(value="__le32") int slot;
        public @Unsigned @OriginalName(value="__le32") int align;
        public char @Size(value=16) [] region_uuid;
        public char @Size(value=16) [] abstraction_uuid;
        public @Unsigned @OriginalName(value="__le16") short lbasize;
        public char @Size(value=86) [] reserved;
        public @Unsigned @OriginalName(value="__le64") long checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_efi_label")
    @NotUsableInJava
    public static class nvdimm_efi_label
    extends Struct {
        public char @Size(value=16) [] uuid;
        public char @Size(value=64) [] name;
        public @Unsigned @OriginalName(value="__le32") int flags;
        public @Unsigned @OriginalName(value="__le16") short nlabel;
        public @Unsigned @OriginalName(value="__le16") short position;
        public @Unsigned @OriginalName(value="__le64") long isetcookie;
        public @Unsigned @OriginalName(value="__le64") long lbasize;
        public @Unsigned @OriginalName(value="__le64") long dpa;
        public @Unsigned @OriginalName(value="__le64") long rawsize;
        public @Unsigned @OriginalName(value="__le32") int slot;
        public char align;
        public char @Size(value=3) [] reserved;
        public @OriginalName(value="guid_t") misc.uuid_t type_guid;
        public @OriginalName(value="guid_t") misc.uuid_t abstraction_guid;
        public char @Size(value=88) [] reserved2;
        public @Unsigned @OriginalName(value="__le64") long checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_bus")
    @NotUsableInJava
    public static class nvdimm_bus
    extends Struct {
        public Ptr<nvdimm_bus_descriptor> nd_desc;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public ListDefinitions.list_head list;
        public runtime.device dev;
        public int id;
        public int probe_active;
        public AtomicDefinitions.atomic_t ioctl_active;
        public ListDefinitions.list_head mapping_list;
        public runtime.mutex reconfig_mutex;
        public runtime.badrange badrange;
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_drvdata")
    @NotUsableInJava
    public static class nvdimm_drvdata
    extends Struct {
        public Ptr<runtime.device> dev;
        public int nslabel_size;
        public NdDefinitions.nd_cmd_get_config_size nsarea;
        public Ptr<?> data;
        public boolean cxl;
        public int ns_current;
        public int ns_next;
        public runtime.resource dpa;
        public runtime.kref kref;
    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_claim_class")
    public static enum nvdimm_claim_class implements Enum<nvdimm_claim_class>,
    TypedEnum<nvdimm_claim_class, Integer>
    {
        NVDIMM_CCLASS_NONE,
        NVDIMM_CCLASS_BTT,
        NVDIMM_CCLASS_BTT2,
        NVDIMM_CCLASS_PFN,
        NVDIMM_CCLASS_DAX,
        NVDIMM_CCLASS_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_event")
    public static enum nvdimm_event implements Enum<nvdimm_event>,
    TypedEnum<nvdimm_event, Integer>
    {
        NVDIMM_REVALIDATE_POISON,
        NVDIMM_REVALIDATE_REGION;

    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_fw_ops")
    @NotUsableInJava
    public static class nvdimm_fw_ops
    extends Struct {
        public Ptr<?> activate_state;
        public Ptr<?> activate_result;
        public Ptr<?> arm;
    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_fwa_result")
    public static enum nvdimm_fwa_result implements Enum<nvdimm_fwa_result>,
    TypedEnum<nvdimm_fwa_result, Integer>
    {
        NVDIMM_FWA_RESULT_INVALID,
        NVDIMM_FWA_RESULT_NONE,
        NVDIMM_FWA_RESULT_SUCCESS,
        NVDIMM_FWA_RESULT_NOTSTAGED,
        NVDIMM_FWA_RESULT_NEEDRESET,
        NVDIMM_FWA_RESULT_FAIL;

    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_fwa_capability")
    public static enum nvdimm_fwa_capability implements Enum<nvdimm_fwa_capability>,
    TypedEnum<nvdimm_fwa_capability, Integer>
    {
        NVDIMM_FWA_CAP_INVALID,
        NVDIMM_FWA_CAP_NONE,
        NVDIMM_FWA_CAP_QUIESCE,
        NVDIMM_FWA_CAP_LIVE;

    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_fwa_trigger")
    public static enum nvdimm_fwa_trigger implements Enum<nvdimm_fwa_trigger>,
    TypedEnum<nvdimm_fwa_trigger, Integer>
    {
        NVDIMM_FWA_ARM,
        NVDIMM_FWA_DISARM;

    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_fwa_state")
    public static enum nvdimm_fwa_state implements Enum<nvdimm_fwa_state>,
    TypedEnum<nvdimm_fwa_state, Integer>
    {
        NVDIMM_FWA_INVALID,
        NVDIMM_FWA_IDLE,
        NVDIMM_FWA_ARMED,
        NVDIMM_FWA_BUSY,
        NVDIMM_FWA_ARM_OVERFLOW;

    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_security_ops")
    @NotUsableInJava
    public static class nvdimm_security_ops
    extends Struct {
        public Ptr<?> get_flags;
        public Ptr<?> freeze;
        public Ptr<?> change_key;
        public Ptr<?> unlock;
        public Ptr<?> disable;
        public Ptr<?> erase;
        public Ptr<?> overwrite;
        public Ptr<?> query_overwrite;
        public Ptr<?> disable_master;
    }

    @Type(noCCodeGeneration=true, cType="enum nvdimm_passphrase_type")
    public static enum nvdimm_passphrase_type implements Enum<nvdimm_passphrase_type>,
    TypedEnum<nvdimm_passphrase_type, Integer>
    {
        NVDIMM_USER,
        NVDIMM_MASTER;

    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_key_data")
    @NotUsableInJava
    public static class nvdimm_key_data
    extends Struct {
        public char @Size(value=32) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_bus_fw_ops")
    @NotUsableInJava
    public static class nvdimm_bus_fw_ops
    extends Struct {
        public Ptr<?> activate_state;
        public Ptr<?> capability;
        public Ptr<?> activate;
    }

    @Type(noCCodeGeneration=true, cType="struct nvdimm_bus_descriptor")
    @NotUsableInJava
    public static class nvdimm_bus_descriptor
    extends Struct {
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_groups;
        public @Unsigned long cmd_mask;
        public @Unsigned long dimm_family_mask;
        public @Unsigned long bus_family_mask;
        public Ptr<runtime.module> module;
        public String provider_name;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public @OriginalName(value="ndctl_fn") Ptr<?> ndctl;
        public Ptr<?> flush_probe;
        public Ptr<?> clear_to_send;
        public Ptr<nvdimm_bus_fw_ops> fw_ops;
    }
}

