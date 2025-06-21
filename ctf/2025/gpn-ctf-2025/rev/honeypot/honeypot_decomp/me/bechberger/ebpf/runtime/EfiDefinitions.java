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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class EfiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __efi_memmap_init(Ptr<efi_memory_map_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_apply_memmap_quirks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_arch_mem_reserve(@Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efi_capsule_pending(Ptr<Integer> reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_capsule_supported(@OriginalName(value="efi_guid_t") misc.uuid_t guid, @Unsigned int flags, @Unsigned long size, Ptr<Integer> reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_capsule_update(Ptr<efi_capsule_header_t> capsule, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_crash_gracefully_on_page_fault(@Unsigned long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_delete_dummy_variable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> efi_earlycon_map(@Unsigned long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_earlycon_remap_fb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_earlycon_reprobe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_earlycon_scroll_up() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_earlycon_setup($arg1, (const u8*)$arg2)")
    public static int efi_earlycon_setup(Ptr<misc.earlycon_device> device2, String opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_earlycon_unmap(Ptr<?> addr2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_earlycon_unmap_fb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_earlycon_write($arg1, (const u8*)$arg2, $arg3)")
    public static void efi_earlycon_write(Ptr<runtime.console> con, String str, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_free_boot_services() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_mem_desc_lookup(@Unsigned long phys_addr, Ptr<efi_memory_desc_t> out_md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memattr_apply_permissions(Ptr<MmDefinitions.mm_struct> mm, @OriginalName(value="efi_memattr_perm_setter") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memattr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memmap_init_early(Ptr<efi_memory_map_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memmap_init_late(@Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_memmap_unmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efi_poweroff_required() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_query_variable_store(@Unsigned int attributes, @Unsigned long size, boolean nonblocking) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_rci2_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efi_reboot_required() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_reserve_boot_services() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_reuse_config(@Unsigned long tables, int nr_tables) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __efi_call() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_check_for_embedded_firmwares() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_check_md_for_embedded_firmware($arg1, (const struct efi_embedded_fw_desc*)$arg2)")
    public static int efi_check_md_for_embedded_firmware(Ptr<efi_memory_desc_t> md, Ptr<efi_embedded_fw_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_get_device_by_path((const struct efi_dev_path**)$arg1, $arg2)")
    public static Ptr<runtime.device> efi_get_device_by_path(Ptr<Ptr<efi_dev_path>> node2, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_get_embedded_fw((const u8*)$arg1, (const u8**)$arg2, $arg3)")
    public static int efi_get_embedded_fw(String name, Ptr<Ptr<Character>> data, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_get_runtime_map_desc_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_get_runtime_map_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memmap_alloc(@Unsigned int num_entries, Ptr<efi_memory_map_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_memmap_insert(Ptr<efi_memory_map> old_memmap, Ptr<?> buf, Ptr<efi_mem_range> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memmap_install(Ptr<efi_memory_map_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memmap_split_count(Ptr<efi_memory_desc_t> md, Ptr<runtime.range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_partition(Ptr<misc.parsed_partitions> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_runtime_map_copy(Ptr<?> buf, @Unsigned long bufsz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_runtime_map_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_tpm_eventlog_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_alloc_page_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_dump_pagetable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_enter_mm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_esrt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_leave_mm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_map_region(Ptr<efi_memory_desc_t> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_map_region_fixed(Ptr<efi_memory_desc_t> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_power_off(Ptr<SysDefinitions.sys_off_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_reboot($arg1, (const u8*)$arg2)")
    public static void efi_reboot(misc.reboot_mode reboot_mode2, String __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_runtime_update_mappings() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_set_secure_boot(efi_secureboot_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_set_virtual_address_map(@Unsigned long memory_map_size, @Unsigned long descriptor_size, @Unsigned int descriptor_version, Ptr<efi_memory_desc_t> virtual_map, @Unsigned long systab_phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_setup_page_tables(@Unsigned long pa_memmap, @Unsigned int num_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_shutdown_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_sync_low_kernel_mappings() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_get_next_high_mono_count(Ptr<@Unsigned Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_get_next_variable(Ptr<@Unsigned Long> name_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_get_time(Ptr<efi_time_t> tm2, Ptr<efi_time_cap_t> tc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_get_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, Ptr<@Unsigned Integer> attr2, Ptr<@Unsigned Long> data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_get_wakeup_time(Ptr<@OriginalName(value="efi_bool_t") Character> enabled, Ptr<@OriginalName(value="efi_bool_t") Character> pending, Ptr<efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_query_capsule_caps(Ptr<Ptr<efi_capsule_header_t>> capsules, @Unsigned long count, Ptr<@Unsigned Long> max_size, Ptr<Integer> reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_query_variable_info(@Unsigned int attr2, Ptr<@Unsigned Long> storage_space, Ptr<@Unsigned Long> remaining_space, Ptr<@Unsigned Long> max_variable_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_query_variable_info_nonblocking(@Unsigned int attr2, Ptr<@Unsigned Long> storage_space, Ptr<@Unsigned Long> remaining_space, Ptr<@Unsigned Long> max_variable_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_thunk_reset_system(int reset_type, @Unsigned @OriginalName(value="efi_status_t") long status, @Unsigned long data_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_thunk_runtime_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_set_time(Ptr<efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_set_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_set_variable_nonblocking(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_set_virtual_address_map(@Unsigned long memory_map_size, @Unsigned long descriptor_size, @Unsigned int descriptor_version, Ptr<efi_memory_desc_t> virtual_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_set_wakeup_time(@OriginalName(value="efi_bool_t") char enabled, Ptr<efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_thunk_update_capsule(Ptr<Ptr<efi_capsule_header_t>> capsules, @Unsigned long count, @Unsigned long sg_list2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_update_mappings(Ptr<efi_memory_desc_t> md, @Unsigned long pf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_update_mem_attr(Ptr<MmDefinitions.mm_struct> mm, Ptr<efi_memory_desc_t> md, boolean has_ibt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __efi_enter_virtual_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __efi_mem_desc_lookup(@Unsigned long phys_addr, Ptr<efi_memory_desc_t> out_md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long __efi_queue_work(efi_rts_ids id, Ptr<efi_rts_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __efi_soft_reserve_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short efi_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_bgrt_init(Ptr<AcpiDefinitions.acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_call_acpi_prm_handler((long unsigned int (*)(long long unsigned int, void*))$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="efi_status_t") long efi_call_acpi_prm_handler(Ptr<?> handler_addr, @Unsigned long param_buffer_addr, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_call_rts(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_call_virt_check_flags($arg1, (const void*)$arg2)")
    public static void efi_call_virt_check_flags(@Unsigned long flags, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long efi_call_virt_save_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_clean_memmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_config_parse_tables((const union {\n  struct {\n    struct {\n      u8 b[16];\n    } guid;\n    void *table;\n  };\n  struct {\n    struct {\n      u8 b[16];\n    } guid;\n    unsigned int table;\n  } mixed_mode;\n}*)$arg1, $arg2, (const struct {\n  struct {\n    u8 b[16];\n  } guid;\n  long unsigned int *ptr;\n  const const u8[16] name;\n}*)$arg3)")
    public static int efi_config_parse_tables(Ptr<efi_config_table_t> config_tables, int count, Ptr<efi_config_table_type_t> arch_tables) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_enter_virtual_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_find_mirror() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efi_is_table_address(@Unsigned long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> efi_map_regions(Ptr<Integer> count, Ptr<Integer> pg_shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_md_typeattr_format($arg1, $arg2, (const struct {\n  unsigned int type;\n  unsigned int pad;\n  long long unsigned int phys_addr;\n  long long unsigned int virt_addr;\n  long long unsigned int num_pages;\n  long long unsigned int attribute;\n}*)$arg3)")
    public static String efi_md_typeattr_format(String buf, @Unsigned long size, Ptr<efi_memory_desc_t> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long efi_mem_attributes(@Unsigned long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long efi_mem_desc_end(Ptr<efi_memory_desc_t> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_mem_reserve(@Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_mem_reserve_iomem(@Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_mem_reserve_persistent(@Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_mem_type(@Unsigned long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memblock_x86_reserve_range() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_memmap_entry_valid((const struct {\n  unsigned int type;\n  unsigned int pad;\n  long long unsigned int phys_addr;\n  long long unsigned int virt_addr;\n  long long unsigned int num_pages;\n  long long unsigned int attribute;\n}*)$arg1, $arg2)")
    public static boolean efi_memmap_entry_valid(Ptr<efi_memory_desc_t> md, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memreserve_map_root() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_memreserve_root_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_mokvar_entry_find((const u8*)$arg1)")
    public static Ptr<efi_mokvar_table_entry> efi_mokvar_entry_find(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<efi_mokvar_table_entry> efi_mokvar_entry_next(Ptr<Ptr<efi_mokvar_table_entry>> mokvar_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_mokvar_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long efi_mokvar_sysfs_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_mokvar_table_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_native_runtime_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long efi_pa_va_lookup(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> guid, @Unsigned long pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efi_print_memmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efi_runtime_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_status_cmp_bsearch((const void*)$arg1, (const void*)$arg2)")
    public static int efi_status_cmp_bsearch(Ptr<?> key2, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_status_to_err(@Unsigned @OriginalName(value="efi_status_t") long status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)efi_status_to_str($arg1))")
    public static String efi_status_to_str(@Unsigned @OriginalName(value="efi_status_t") long status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_systab_check_header((const struct {\n  long long unsigned int signature;\n  unsigned int revision;\n  unsigned int headersize;\n  unsigned int crc32;\n  unsigned int reserved;\n}*)$arg1)")
    public static int efi_systab_check_header(Ptr<efi_table_hdr_t> systab_hdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efi_systab_init(@Unsigned long phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efi_systab_report_header((const struct {\n  long long unsigned int signature;\n  unsigned int revision;\n  unsigned int headersize;\n  unsigned int crc32;\n  unsigned int reserved;\n}*)$arg1, $arg2)")
    public static void efi_systab_report_header(Ptr<efi_table_hdr_t> systab_hdr, @Unsigned long fw_vendor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String efi_systab_show_arch(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; } *time; }")
    @NotUsableInJava
    public static class SET_TIME_of_efi_rts_args
    extends Struct {
        public Ptr<efi_time_t> time;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int *name; struct { u8 b[16]; } *vendor; unsigned int *attr; long unsigned int *data_size; void *data; }")
    @NotUsableInJava
    public static class GET_VARIABLE_of_efi_rts_args
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name;
        public Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor;
        public Ptr<@Unsigned Integer> attr;
        public Ptr<@Unsigned Long> data_size;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int *high_count; }")
    @NotUsableInJava
    public static class GET_NEXT_HIGH_MONO_COUNT_of_efi_rts_args
    extends Struct {
        public Ptr<@Unsigned Integer> high_count;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int *name; struct { u8 b[16]; } *vendor; unsigned int attr; long unsigned int data_size; void *data; }")
    @NotUsableInJava
    public static class SET_VARIABLE_of_efi_rts_args
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name;
        public Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor;
        public @Unsigned int attr;
        public @Unsigned long data_size;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; } *time; struct { unsigned int resolution; unsigned int accuracy; u8 sets_to_zero; } *capabilities; }")
    @NotUsableInJava
    public static class GET_TIME_of_efi_rts_args
    extends Struct {
        public Ptr<efi_time_t> time;
        public Ptr<efi_time_cap_t> capabilities;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 enable; struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; } *time; }")
    @NotUsableInJava
    public static class SET_WAKEUP_TIME_of_efi_rts_args
    extends Struct {
        public @OriginalName(value="efi_bool_t") char enable;
        public Ptr<efi_time_t> time;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int *name_size; short unsigned int *name; struct { u8 b[16]; } *vendor; }")
    @NotUsableInJava
    public static class GET_NEXT_VARIABLE_of_efi_rts_args
    extends Struct {
        public Ptr<@Unsigned Long> name_size;
        public Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name;
        public Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; } **capsules; long unsigned int count; long long unsigned int *max_size; int *reset_type; }")
    @NotUsableInJava
    public static class QUERY_CAPSULE_CAPS_of_efi_rts_args
    extends Struct {
        public Ptr<Ptr<efi_capsule_header_t>> capsules;
        public @Unsigned long count;
        public Ptr<@Unsigned Long> max_size;
        public Ptr<Integer> reset_type;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; } **capsules; long unsigned int count; long unsigned int sg_list; }")
    @NotUsableInJava
    public static class UPDATE_CAPSULE_of_efi_rts_args
    extends Struct {
        public Ptr<Ptr<efi_capsule_header_t>> capsules;
        public @Unsigned long count;
        public @Unsigned long sg_list;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int attr; long long unsigned int *storage_space; long long unsigned int *remaining_space; long long unsigned int *max_variable_size; }")
    @NotUsableInJava
    public static class QUERY_VARIABLE_INFO_of_efi_rts_args
    extends Struct {
        public @Unsigned int attr;
        public Ptr<@Unsigned Long> storage_space;
        public Ptr<@Unsigned Long> remaining_space;
        public Ptr<@Unsigned Long> max_variable_size;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int (*acpi_prm_handler)(long long unsigned int, void*); long long unsigned int param_buffer_addr; void *context; }")
    @NotUsableInJava
    public static class ACPI_PRM_HANDLER_of_efi_rts_args
    extends Struct {
        public Ptr<?> acpi_prm_handler;
        public @Unsigned long param_buffer_addr;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 *enabled; u8 *pending; struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; } *time; }")
    @NotUsableInJava
    public static class GET_WAKEUP_TIME_of_efi_rts_args
    extends Struct {
        public Ptr<@OriginalName(value="efi_bool_t") Character> enabled;
        public Ptr<@OriginalName(value="efi_bool_t") Character> pending;
        public Ptr<efi_time_t> time;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_system_resource_table")
    @NotUsableInJava
    public static class efi_system_resource_table
    extends Struct {
        public @Unsigned int fw_resource_count;
        public @Unsigned int fw_resource_count_max;
        public @Unsigned long fw_resource_version;
        public char @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_system_resource_entry_v1")
    @NotUsableInJava
    public static class efi_system_resource_entry_v1
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t fw_class;
        public @Unsigned int fw_type;
        public @Unsigned int fw_version;
        public @Unsigned int lowest_supported_fw_version;
        public @Unsigned int capsule_flags;
        public @Unsigned int last_attempt_version;
        public @Unsigned int last_attempt_status;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_embedded_fw_desc")
    @NotUsableInJava
    public static class efi_embedded_fw_desc
    extends Struct {
        public String name;
        public char @Size(value=8) [] prefix;
        public @Unsigned int length;
        public char @Size(value=32) [] sha256;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_embedded_fw")
    @NotUsableInJava
    public static class efi_embedded_fw
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public Ptr<Character> data;
        public @Unsigned long length;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_dev_path")
    @NotUsableInJava
    public static class efi_dev_path
    extends Struct {
        @InlineUnion(value=65984)
        public @InlineUnion(value=65984) efi_generic_dev_path header;
        @InlineUnion(value=65984)
        public @InlineUnion(value=65984) efi_acpi_dev_path acpi;
        @InlineUnion(value=65984)
        public @InlineUnion(value=65984) efi_pci_dev_path pci;
        @InlineUnion(value=65984)
        public @InlineUnion(value=65984) efi_vendor_dev_path vendor;
        @InlineUnion(value=65984)
        public @InlineUnion(value=65984) efi_rel_offset_dev_path rel_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_rel_offset_dev_path")
    @NotUsableInJava
    public static class efi_rel_offset_dev_path
    extends Struct {
        public efi_generic_dev_path header;
        public @Unsigned int reserved;
        public @Unsigned long starting_offset;
        public @Unsigned long ending_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_vendor_dev_path")
    @NotUsableInJava
    public static class efi_vendor_dev_path
    extends Struct {
        public efi_generic_dev_path header;
        public @OriginalName(value="efi_guid_t") misc.uuid_t vendorguid;
        public char @Size(value=0) [] vendordata;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_pci_dev_path")
    @NotUsableInJava
    public static class efi_pci_dev_path
    extends Struct {
        public efi_generic_dev_path header;
        public char fn;
        public char dev;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_acpi_dev_path")
    @NotUsableInJava
    public static class efi_acpi_dev_path
    extends Struct {
        public efi_generic_dev_path header;
        public @Unsigned int hid;
        public @Unsigned int uid;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_tcg2_final_events_table")
    @NotUsableInJava
    public static class efi_tcg2_final_events_table
    extends Struct {
        public @Unsigned long version;
        public @Unsigned long nr_events;
        public char @Size(value=0) [] events;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_runtime_map_entry")
    @NotUsableInJava
    public static class efi_runtime_map_entry
    extends Struct {
        public efi_memory_desc_t md;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int length; long long unsigned int data; }")
    @NotUsableInJava
    public static class efi_capsule_block_desc_t
    extends Struct {
        public @Unsigned long length;
        public @Unsigned long data;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int version; unsigned int num_entries; unsigned int desc_size; unsigned int flags; struct { unsigned int type; unsigned int pad; long long unsigned int phys_addr; long long unsigned int virt_addr; long long unsigned int num_pages; long long unsigned int attribute; } entry[0]; }")
    @NotUsableInJava
    public static class efi_memory_attributes_table_t
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int num_entries;
        public @Unsigned int desc_size;
        public @Unsigned int flags;
        public efi_memory_desc_t @Size(value=0) [] entry;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { u8 b[16]; } signature_type; unsigned int signature_list_size; unsigned int signature_header_size; unsigned int signature_size; u8 signature_header[0]; }")
    @NotUsableInJava
    public static class efi_signature_list_t
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t signature_type;
        public @Unsigned int signature_list_size;
        public @Unsigned int signature_header_size;
        public @Unsigned int signature_size;
        public char @Size(value=0) [] signature_header;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { u8 b[16]; } signature_owner; u8 signature_data[0]; }")
    @NotUsableInJava
    public static class efi_signature_data_t
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t signature_owner;
        public char @Size(value=0) [] signature_data;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_mem_range")
    @NotUsableInJava
    public static class efi_mem_range
    extends Struct {
        public runtime.range range;
        public @Unsigned long attribute;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_mokvar_sysfs_attr")
    @NotUsableInJava
    public static class efi_mokvar_sysfs_attr
    extends Struct {
        public misc.bin_attribute bin_attr;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_mokvar_table_entry")
    @NotUsableInJava
    public static class efi_mokvar_table_entry
    extends Struct {
        public char @Size(value=256) [] name;
        public @Unsigned long data_size;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="union efi_rts_args")
    @NotUsableInJava
    public static class efi_rts_args
    extends Union {
        public GET_TIME_of_efi_rts_args GET_TIME;
        public SET_TIME_of_efi_rts_args SET_TIME;
        public GET_WAKEUP_TIME_of_efi_rts_args GET_WAKEUP_TIME;
        public SET_WAKEUP_TIME_of_efi_rts_args SET_WAKEUP_TIME;
        public GET_VARIABLE_of_efi_rts_args GET_VARIABLE;
        public GET_NEXT_VARIABLE_of_efi_rts_args GET_NEXT_VARIABLE;
        public SET_VARIABLE_of_efi_rts_args SET_VARIABLE;
        public QUERY_VARIABLE_INFO_of_efi_rts_args QUERY_VARIABLE_INFO;
        public GET_NEXT_HIGH_MONO_COUNT_of_efi_rts_args GET_NEXT_HIGH_MONO_COUNT;
        public UPDATE_CAPSULE_of_efi_rts_args UPDATE_CAPSULE;
        public QUERY_CAPSULE_CAPS_of_efi_rts_args QUERY_CAPSULE_CAPS;
        public ACPI_PRM_HANDLER_of_efi_rts_args ACPI_PRM_HANDLER;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_runtime_work")
    @NotUsableInJava
    public static class efi_runtime_work
    extends Struct {
        public Ptr<efi_rts_args> args;
        public @Unsigned @OriginalName(value="efi_status_t") long status;
        public misc.work_struct work;
        public efi_rts_ids efi_rts_id;
        public runtime.completion efi_rts_comp;
        public Ptr<?> caller;
    }

    @Type(noCCodeGeneration=true, cType="enum efi_rts_ids")
    public static enum efi_rts_ids implements Enum<efi_rts_ids>,
    TypedEnum<efi_rts_ids, Integer>
    {
        EFI_NONE,
        EFI_GET_TIME,
        EFI_SET_TIME,
        EFI_GET_WAKEUP_TIME,
        EFI_SET_WAKEUP_TIME,
        EFI_GET_VARIABLE,
        EFI_GET_NEXT_VARIABLE,
        EFI_SET_VARIABLE,
        EFI_QUERY_VARIABLE_INFO,
        EFI_GET_NEXT_HIGH_MONO_COUNT,
        EFI_RESET_SYSTEM,
        EFI_UPDATE_CAPSULE,
        EFI_QUERY_CAPSULE_CAPS,
        EFI_ACPI_PRM_HANDLER;

    }

    @Type(noCCodeGeneration=true, cType="struct efi_error_code")
    @NotUsableInJava
    public static class efi_error_code
    extends Struct {
        public @Unsigned @OriginalName(value="efi_status_t") long status;
        public int errno;
        public String description;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int version; short unsigned int length; unsigned int runtime_services_supported; }")
    @NotUsableInJava
    public static class efi_rt_properties_table_t
    extends Struct {
        public @Unsigned short version;
        public @Unsigned short length;
        public @Unsigned int runtime_services_supported;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_unaccepted_memory")
    @NotUsableInJava
    public static class efi_unaccepted_memory
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int unit_size;
        public @Unsigned long phys_base;
        public @Unsigned long size;
        public @Unsigned long @Size(value=0) [] bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { u8 b[16]; } guid; long long unsigned int table; }")
    @NotUsableInJava
    public static class efi_config_table_64_t
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t guid;
        public @Unsigned long table;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_generic_dev_path")
    @NotUsableInJava
    public static class efi_generic_dev_path
    extends Struct {
        public char type;
        public char sub_type;
        public @Unsigned short length;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_variable")
    @NotUsableInJava
    public static class efi_variable
    extends Struct {
        public @Unsigned @OriginalName(value="efi_char16_t") short @Size(value=512) [] VariableName;
        public @OriginalName(value="efi_guid_t") misc.uuid_t VendorGuid;
        public @Unsigned int Attributes;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_setup_data")
    @NotUsableInJava
    public static class efi_setup_data
    extends Struct {
        public @Unsigned long fw_vendor;
        public @Unsigned long __unused;
        public @Unsigned long tables;
        public @Unsigned long smbios;
        public @Unsigned long @Size(value=8) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int version; unsigned int length; long long unsigned int memory_protection_attribute; }")
    @NotUsableInJava
    public static class efi_properties_table_t
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int length;
        public @Unsigned long memory_protection_attribute;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_memory_map_data")
    @NotUsableInJava
    public static class efi_memory_map_data
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long phys_map;
        public @Unsigned long size;
        public @Unsigned long desc_version;
        public @Unsigned long desc_size;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; long long unsigned int fw_vendor; unsigned int fw_revision; unsigned int __pad1; long long unsigned int con_in_handle; long long unsigned int con_in; long long unsigned int con_out_handle; long long unsigned int con_out; long long unsigned int stderr_handle; long long unsigned int stderr; long long unsigned int runtime; long long unsigned int boottime; unsigned int nr_tables; unsigned int __pad2; long long unsigned int tables; }")
    @NotUsableInJava
    public static class efi_system_table_64_t
    extends Struct {
        public efi_table_hdr_t hdr;
        public @Unsigned long fw_vendor;
        public @Unsigned int fw_revision;
        public @Unsigned int __pad1;
        public @Unsigned long con_in_handle;
        public @Unsigned long con_in;
        public @Unsigned long con_out_handle;
        public @Unsigned long con_out;
        public @Unsigned long stderr_handle;
        public @Unsigned long stderr;
        public @Unsigned long runtime;
        public @Unsigned long boottime;
        public @Unsigned int nr_tables;
        public @Unsigned int __pad2;
        public @Unsigned long tables;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { u8 b[16]; } guid; long unsigned int *ptr; const const u8[16] name; }")
    @NotUsableInJava
    public static class efi_config_table_type_t
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t guid;
        public Ptr<@Unsigned Long> ptr;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { struct { u8 b[16]; } guid; void *table; }; struct { struct { u8 b[16]; } guid; unsigned int table; } mixed_mode; }")
    @NotUsableInJava
    public static class efi_config_table_t
    extends Union {
        public AnonDefinitions.anon_member_of_efi_config_table_t anon0;
        public efi_config_table_32_t mixed_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { u8 b[16]; } guid; unsigned int table; }")
    @NotUsableInJava
    public static class efi_config_table_32_t
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t guid;
        public @Unsigned int table;
    }

    @Type(noCCodeGeneration=true, cType="enum efi_secureboot_mode")
    public static enum efi_secureboot_mode implements Enum<efi_secureboot_mode>,
    TypedEnum<efi_secureboot_mode, Integer>
    {
        efi_secureboot_mode_unset,
        efi_secureboot_mode_unknown,
        efi_secureboot_mode_disabled,
        efi_secureboot_mode_enabled;

    }

    @Type(noCCodeGeneration=true, cType="union { struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; long unsigned int fw_vendor; unsigned int fw_revision; long unsigned int con_in_handle; efi_simple_text_input_protocol *con_in; long unsigned int con_out_handle; efi_simple_text_output_protocol *con_out; long unsigned int stderr_handle; long unsigned int stderr; union { struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; long unsigned int (*get_time)(struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*, struct { unsigned int resolution; unsigned int accuracy; u8 sets_to_zero; }*); long unsigned int (*set_time)(struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*); long unsigned int (*get_wakeup_time)(u8*, u8*, struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*); long unsigned int (*set_wakeup_time)(u8, struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*); long unsigned int (*set_virtual_address_map)(long unsigned int, long unsigned int, unsigned int, struct { unsigned int type; unsigned int pad; long long unsigned int phys_addr; long long unsigned int virt_addr; long long unsigned int num_pages; long long unsigned int attribute; }*); void *convert_pointer; long unsigned int (*get_variable)(short unsigned int*, struct { u8 b[16]; }*, unsigned int*, long unsigned int*, void*); long unsigned int (*get_next_variable)(long unsigned int*, short unsigned int*, struct { u8 b[16]; }*); long unsigned int (*set_variable)(short unsigned int*, struct { u8 b[16]; }*, unsigned int, long unsigned int, void*); long unsigned int (*get_next_high_mono_count)(unsigned int*); void (*reset_system)(int, long unsigned int, long unsigned int, short unsigned int*); long unsigned int (*update_capsule)(struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; }**, long unsigned int, long unsigned int); long unsigned int (*query_capsule_caps)(struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; }**, long unsigned int, long long unsigned int*, int*); long unsigned int (*query_variable_info)(unsigned int, long long unsigned int*, long long unsigned int*, long long unsigned int*); }; struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; unsigned int get_time; unsigned int set_time; unsigned int get_wakeup_time; unsigned int set_wakeup_time; unsigned int set_virtual_address_map; unsigned int convert_pointer; unsigned int get_variable; unsigned int get_next_variable; unsigned int set_variable; unsigned int get_next_high_mono_count; unsigned int reset_system; unsigned int update_capsule; unsigned int query_capsule_caps; unsigned int query_variable_info; } mixed_mode; } *runtime; efi_boot_services *boottime; long unsigned int nr_tables; long unsigned int tables; }; struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; unsigned int fw_vendor; unsigned int fw_revision; unsigned int con_in_handle; unsigned int con_in; unsigned int con_out_handle; unsigned int con_out; unsigned int stderr_handle; unsigned int stderr; unsigned int runtime; unsigned int boottime; unsigned int nr_tables; unsigned int tables; } mixed_mode; }")
    @NotUsableInJava
    public static class efi_system_table_t
    extends Union {
        public AnonDefinitions.anon_member_of_efi_system_table_t anon0;
        public efi_system_table_32_t mixed_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; unsigned int fw_vendor; unsigned int fw_revision; unsigned int con_in_handle; unsigned int con_in; unsigned int con_out_handle; unsigned int con_out; unsigned int stderr_handle; unsigned int stderr; unsigned int runtime; unsigned int boottime; unsigned int nr_tables; unsigned int tables; }")
    @NotUsableInJava
    public static class efi_system_table_32_t
    extends Struct {
        public efi_table_hdr_t hdr;
        public @Unsigned int fw_vendor;
        public @Unsigned int fw_revision;
        public @Unsigned int con_in_handle;
        public @Unsigned int con_in;
        public @Unsigned int con_out_handle;
        public @Unsigned int con_out;
        public @Unsigned int stderr_handle;
        public @Unsigned int stderr;
        public @Unsigned int runtime;
        public @Unsigned int boottime;
        public @Unsigned int nr_tables;
        public @Unsigned int tables;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_info")
    @NotUsableInJava
    public static class efi_info
    extends Struct {
        public @Unsigned int efi_loader_signature;
        public @Unsigned int efi_systab;
        public @Unsigned int efi_memdesc_size;
        public @Unsigned int efi_memdesc_version;
        public @Unsigned int efi_memmap;
        public @Unsigned int efi_memmap_size;
        public @Unsigned int efi_systab_hi;
        public @Unsigned int efi_memmap_hi;
    }

    @Type(noCCodeGeneration=true, cType="struct efi_memory_map")
    @NotUsableInJava
    public static class efi_memory_map
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long phys_map;
        public Ptr<?> map;
        public Ptr<?> map_end;
        public int nr_map;
        public @Unsigned long desc_version;
        public @Unsigned long desc_size;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; long unsigned int (*get_time)(struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*, struct { unsigned int resolution; unsigned int accuracy; u8 sets_to_zero; }*); long unsigned int (*set_time)(struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*); long unsigned int (*get_wakeup_time)(u8*, u8*, struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*); long unsigned int (*set_wakeup_time)(u8, struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }*); long unsigned int (*set_virtual_address_map)(long unsigned int, long unsigned int, unsigned int, struct { unsigned int type; unsigned int pad; long long unsigned int phys_addr; long long unsigned int virt_addr; long long unsigned int num_pages; long long unsigned int attribute; }*); void *convert_pointer; long unsigned int (*get_variable)(short unsigned int*, struct { u8 b[16]; }*, unsigned int*, long unsigned int*, void*); long unsigned int (*get_next_variable)(long unsigned int*, short unsigned int*, struct { u8 b[16]; }*); long unsigned int (*set_variable)(short unsigned int*, struct { u8 b[16]; }*, unsigned int, long unsigned int, void*); long unsigned int (*get_next_high_mono_count)(unsigned int*); void (*reset_system)(int, long unsigned int, long unsigned int, short unsigned int*); long unsigned int (*update_capsule)(struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; }**, long unsigned int, long unsigned int); long unsigned int (*query_capsule_caps)(struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; }**, long unsigned int, long long unsigned int*, int*); long unsigned int (*query_variable_info)(unsigned int, long long unsigned int*, long long unsigned int*, long long unsigned int*); }; struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; unsigned int get_time; unsigned int set_time; unsigned int get_wakeup_time; unsigned int set_wakeup_time; unsigned int set_virtual_address_map; unsigned int convert_pointer; unsigned int get_variable; unsigned int get_next_variable; unsigned int set_variable; unsigned int get_next_high_mono_count; unsigned int reset_system; unsigned int update_capsule; unsigned int query_capsule_caps; unsigned int query_variable_info; } mixed_mode; }")
    @NotUsableInJava
    public static class efi_runtime_services_t
    extends Union {
        public AnonDefinitions.anon_member_of_efi_runtime_services_t anon0;
        public efi_runtime_services_32_t mixed_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; } hdr; unsigned int get_time; unsigned int set_time; unsigned int get_wakeup_time; unsigned int set_wakeup_time; unsigned int set_virtual_address_map; unsigned int convert_pointer; unsigned int get_variable; unsigned int get_next_variable; unsigned int set_variable; unsigned int get_next_high_mono_count; unsigned int reset_system; unsigned int update_capsule; unsigned int query_capsule_caps; unsigned int query_variable_info; }")
    @NotUsableInJava
    public static class efi_runtime_services_32_t
    extends Struct {
        public efi_table_hdr_t hdr;
        public @Unsigned int get_time;
        public @Unsigned int set_time;
        public @Unsigned int get_wakeup_time;
        public @Unsigned int set_wakeup_time;
        public @Unsigned int set_virtual_address_map;
        public @Unsigned int convert_pointer;
        public @Unsigned int get_variable;
        public @Unsigned int get_next_variable;
        public @Unsigned int set_variable;
        public @Unsigned int get_next_high_mono_count;
        public @Unsigned int reset_system;
        public @Unsigned int update_capsule;
        public @Unsigned int query_capsule_caps;
        public @Unsigned int query_variable_info;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int resolution; unsigned int accuracy; u8 sets_to_zero; }")
    @NotUsableInJava
    public static class efi_time_cap_t
    extends Struct {
        public @Unsigned int resolution;
        public @Unsigned int accuracy;
        public char sets_to_zero;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int year; u8 month; u8 day; u8 hour; u8 minute; u8 second; u8 pad1; unsigned int nanosecond; short int timezone; u8 daylight; u8 pad2; }")
    @NotUsableInJava
    public static class efi_time_t
    extends Struct {
        public @Unsigned short year;
        public char month;
        public char day;
        public char hour;
        public char minute;
        public char second;
        public char pad1;
        public @Unsigned int nanosecond;
        public short timezone;
        public char daylight;
        public char pad2;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { u8 b[16]; } guid; unsigned int headersize; unsigned int flags; unsigned int imagesize; }")
    @NotUsableInJava
    public static class efi_capsule_header_t
    extends Struct {
        public @OriginalName(value="efi_guid_t") misc.uuid_t guid;
        public @Unsigned int headersize;
        public @Unsigned int flags;
        public @Unsigned int imagesize;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int type; unsigned int pad; long long unsigned int phys_addr; long long unsigned int virt_addr; long long unsigned int num_pages; long long unsigned int attribute; }")
    @NotUsableInJava
    public static class efi_memory_desc_t
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int pad;
        public @Unsigned long phys_addr;
        public @Unsigned long virt_addr;
        public @Unsigned long num_pages;
        public @Unsigned long attribute;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int signature; unsigned int revision; unsigned int headersize; unsigned int crc32; unsigned int reserved; }")
    @NotUsableInJava
    public static class efi_table_hdr_t
    extends Struct {
        public @Unsigned long signature;
        public @Unsigned int revision;
        public @Unsigned int headersize;
        public @Unsigned int crc32;
        public @Unsigned int reserved;
    }
}

