/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DmiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_disable_acpi((const struct dmi_system_id*)$arg1)")
    public static int dmi_disable_acpi(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_ignore_irq0_timer_override((const struct dmi_system_id*)$arg1)")
    public static int dmi_ignore_irq0_timer_override(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_io_delay_0xed_port((const struct dmi_system_id*)$arg1)")
    public static int dmi_io_delay_0xed_port(Ptr<dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_pcie_pme_disable_msi((const struct dmi_system_id*)$arg1)")
    public static int dmi_pcie_pme_disable_msi(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmi_check_pciprobe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmi_check_skip_isa_align() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_disable_ioapicreroute((const struct dmi_system_id*)$arg1)")
    public static int dmi_disable_ioapicreroute(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_matched_7k62_bios_bug((const struct dmi_system_id*)$arg1)")
    public static int dmi_matched_7k62_bios_bug(Ptr<dmi_system_id> dmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_callback((const struct dmi_system_id*)$arg1)")
    public static int dmi_callback(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_callback_siemens((const struct dmi_system_id*)$arg1)")
    public static int dmi_callback_siemens(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmi_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_dev_uevent((const struct device*)$arg1, $arg2)")
    public static int dmi_dev_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmi_id_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmi_id_init_attr_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_check_system((const struct dmi_system_id*)$arg1)")
    public static int dmi_check_system(Ptr<dmi_system_id> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_checksum((const u8*)$arg1, $arg2)")
    public static int dmi_checksum(Ptr<Character> buf, char len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_decode((const struct dmi_header*)$arg1, $arg2)")
    public static void dmi_decode(Ptr<dmi_header> dm, Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_decode_table($arg1, (void (*)(const struct dmi_header*, void*))$arg2, $arg3)")
    public static void dmi_decode_table(Ptr<Character> buf, Ptr<?> decode, Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_disable_osi_vista((const struct dmi_system_id*)$arg1)")
    public static int dmi_disable_osi_vista(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_disable_osi_win7((const struct dmi_system_id*)$arg1)")
    public static int dmi_disable_osi_win7(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_disable_osi_win8((const struct dmi_system_id*)$arg1)")
    public static int dmi_disable_osi_win8(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_enable_osi_linux((const struct dmi_system_id*)$arg1)")
    public static int dmi_enable_osi_linux(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_enable_rev_override((const struct dmi_system_id*)$arg1)")
    public static int dmi_enable_rev_override(Ptr<dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct dmi_device*)dmi_find_device($arg1, (const u8*)$arg2, (const struct dmi_device*)$arg3))")
    public static Ptr<dmi_device> dmi_find_device(int type2, String name, Ptr<dmi_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct dmi_system_id*)dmi_first_match((const struct dmi_system_id*)$arg1))")
    public static Ptr<dmi_system_id> dmi_first_match(Ptr<dmi_system_id> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmi_get_bios_year() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dmi_get_date(int field, Ptr<Integer> yearp, Ptr<Integer> monthp, Ptr<Integer> dayp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dmi_get_system_info($arg1))")
    public static String dmi_get_system_info(int field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_match($arg1, (const u8*)$arg2)")
    public static boolean dmi_match(dmi_field f, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_matches((const struct dmi_system_id*)$arg1)")
    public static boolean dmi_matches(Ptr<dmi_system_id> dmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short dmi_memdev_handle(int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_memdev_name($arg1, (const u8**)$arg2, (const u8**)$arg3)")
    public static void dmi_memdev_name(@Unsigned short handle, Ptr<String> bank, Ptr<String> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dmi_memdev_size(@Unsigned short handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char dmi_memdev_type(@Unsigned short handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_name_in_serial((const u8*)$arg1)")
    public static int dmi_name_in_serial(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_name_in_vendors((const u8*)$arg1)")
    public static int dmi_name_in_vendors(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_present((const u8*)$arg1)")
    public static int dmi_present(Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_save_dev_pciaddr($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void dmi_save_dev_pciaddr(int instance, int segment, int bus, int devfn, String name, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_save_ident((const struct dmi_header*)$arg1, $arg2, $arg3)")
    public static void dmi_save_ident(Ptr<dmi_header> dm, int slot2, int string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_save_ipmi_device((const struct dmi_header*)$arg1)")
    public static void dmi_save_ipmi_device(Ptr<dmi_header> dm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_save_one_device($arg1, (const u8*)$arg2)")
    public static void dmi_save_one_device(int type2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_save_release((const struct dmi_header*)$arg1, $arg2, $arg3)")
    public static void dmi_save_release(Ptr<dmi_header> dm, int slot2, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmi_scan_machine() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmi_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_smbios3_present((const u8*)$arg1)")
    public static int dmi_smbios3_present(Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dmi_string((const struct dmi_header*)$arg1, $arg2))")
    public static String dmi_string(Ptr<dmi_header> dm, char s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dmi_string_nosave((const struct dmi_header*)$arg1, $arg2))")
    public static String dmi_string_nosave(Ptr<dmi_header> dm, char s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_walk((void (*)(const struct dmi_header*, void*))$arg1, $arg2)")
    public static int dmi_walk(Ptr<?> decode, Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dmi_walk_early((void (*)(const struct dmi_header*, void*))$arg1)")
    public static int dmi_walk_early(Ptr<?> decode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dmi_device_attribute")
    @NotUsableInJava
    public static class dmi_device_attribute
    extends Struct {
        public DeviceDefinitions.device_attribute dev_attr;
        public int field;
    }

    @Type(noCCodeGeneration=true, cType="struct dmi_memdev_info")
    @NotUsableInJava
    public static class dmi_memdev_info
    extends Struct {
        public String device;
        public String bank;
        public @Unsigned long size;
        public @Unsigned short handle;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="enum dmi_entry_type")
    public static enum dmi_entry_type implements Enum<dmi_entry_type>,
    TypedEnum<dmi_entry_type, Integer>
    {
        DMI_ENTRY_BIOS,
        DMI_ENTRY_SYSTEM,
        DMI_ENTRY_BASEBOARD,
        DMI_ENTRY_CHASSIS,
        DMI_ENTRY_PROCESSOR,
        DMI_ENTRY_MEM_CONTROLLER,
        DMI_ENTRY_MEM_MODULE,
        DMI_ENTRY_CACHE,
        DMI_ENTRY_PORT_CONNECTOR,
        DMI_ENTRY_SYSTEM_SLOT,
        DMI_ENTRY_ONBOARD_DEVICE,
        DMI_ENTRY_OEMSTRINGS,
        DMI_ENTRY_SYSCONF,
        DMI_ENTRY_BIOS_LANG,
        DMI_ENTRY_GROUP_ASSOC,
        DMI_ENTRY_SYSTEM_EVENT_LOG,
        DMI_ENTRY_PHYS_MEM_ARRAY,
        DMI_ENTRY_MEM_DEVICE,
        DMI_ENTRY_32_MEM_ERROR,
        DMI_ENTRY_MEM_ARRAY_MAPPED_ADDR,
        DMI_ENTRY_MEM_DEV_MAPPED_ADDR,
        DMI_ENTRY_BUILTIN_POINTING_DEV,
        DMI_ENTRY_PORTABLE_BATTERY,
        DMI_ENTRY_SYSTEM_RESET,
        DMI_ENTRY_HW_SECURITY,
        DMI_ENTRY_SYSTEM_POWER_CONTROLS,
        DMI_ENTRY_VOLTAGE_PROBE,
        DMI_ENTRY_COOLING_DEV,
        DMI_ENTRY_TEMP_PROBE,
        DMI_ENTRY_ELECTRICAL_CURRENT_PROBE,
        DMI_ENTRY_OOB_REMOTE_ACCESS,
        DMI_ENTRY_BIS_ENTRY,
        DMI_ENTRY_SYSTEM_BOOT,
        DMI_ENTRY_MGMT_DEV,
        DMI_ENTRY_MGMT_DEV_COMPONENT,
        DMI_ENTRY_MGMT_DEV_THRES,
        DMI_ENTRY_MEM_CHANNEL,
        DMI_ENTRY_IPMI_DEV,
        DMI_ENTRY_SYS_POWER_SUPPLY,
        DMI_ENTRY_ADDITIONAL,
        DMI_ENTRY_ONBOARD_DEV_EXT,
        DMI_ENTRY_MGMT_CONTROLLER_HOST,
        DMI_ENTRY_INACTIVE,
        DMI_ENTRY_END_OF_TABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct dmi_header")
    @NotUsableInJava
    public static class dmi_header
    extends Struct {
        public char type;
        public char length;
        public @Unsigned short handle;
    }

    @Type(noCCodeGeneration=true, cType="struct dmi_dev_onboard")
    @NotUsableInJava
    public static class dmi_dev_onboard
    extends Struct {
        public dmi_device dev;
        public int instance;
        public int segment;
        public int bus;
        public int devfn;
    }

    @Type(noCCodeGeneration=true, cType="struct dmi_device")
    @NotUsableInJava
    public static class dmi_device
    extends Struct {
        public ListDefinitions.list_head list;
        public int type;
        public String name;
        public Ptr<?> device_data;
    }

    @Type(noCCodeGeneration=true, cType="enum dmi_device_type")
    public static enum dmi_device_type implements Enum<dmi_device_type>,
    TypedEnum<dmi_device_type, Integer>
    {
        DMI_DEV_TYPE_ANY,
        DMI_DEV_TYPE_OTHER,
        DMI_DEV_TYPE_UNKNOWN,
        DMI_DEV_TYPE_VIDEO,
        DMI_DEV_TYPE_SCSI,
        DMI_DEV_TYPE_ETHERNET,
        DMI_DEV_TYPE_TOKENRING,
        DMI_DEV_TYPE_SOUND,
        DMI_DEV_TYPE_PATA,
        DMI_DEV_TYPE_SATA,
        DMI_DEV_TYPE_SAS,
        DMI_DEV_TYPE_IPMI,
        DMI_DEV_TYPE_OEM_STRING,
        DMI_DEV_TYPE_DEV_ONBOARD,
        DMI_DEV_TYPE_DEV_SLOT;

    }

    @Type(noCCodeGeneration=true, cType="struct dmi_system_id")
    @NotUsableInJava
    public static class dmi_system_id
    extends Struct {
        public Ptr<?> callback;
        public String ident;
        public dmi_strmatch @Size(value=4) [] matches;
        public Ptr<?> driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct dmi_strmatch")
    @NotUsableInJava
    public static class dmi_strmatch
    extends Struct {
        public char slot;
        public char exact_match;
        public char @Size(value=79) [] substr;
    }

    @Type(noCCodeGeneration=true, cType="enum dmi_field")
    public static enum dmi_field implements Enum<dmi_field>,
    TypedEnum<dmi_field, Integer>
    {
        DMI_NONE,
        DMI_BIOS_VENDOR,
        DMI_BIOS_VERSION,
        DMI_BIOS_DATE,
        DMI_BIOS_RELEASE,
        DMI_EC_FIRMWARE_RELEASE,
        DMI_SYS_VENDOR,
        DMI_PRODUCT_NAME,
        DMI_PRODUCT_VERSION,
        DMI_PRODUCT_SERIAL,
        DMI_PRODUCT_UUID,
        DMI_PRODUCT_SKU,
        DMI_PRODUCT_FAMILY,
        DMI_BOARD_VENDOR,
        DMI_BOARD_NAME,
        DMI_BOARD_VERSION,
        DMI_BOARD_SERIAL,
        DMI_BOARD_ASSET_TAG,
        DMI_CHASSIS_VENDOR,
        DMI_CHASSIS_TYPE,
        DMI_CHASSIS_VERSION,
        DMI_CHASSIS_SERIAL,
        DMI_CHASSIS_ASSET_TAG,
        DMI_STRING_MAX,
        DMI_OEM_STRING;

    }
}

