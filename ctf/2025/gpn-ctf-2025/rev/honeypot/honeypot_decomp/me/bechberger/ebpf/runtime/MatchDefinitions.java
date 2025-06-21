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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MatchDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="match_export($arg1, (const void*)$arg2)")
    public static int match_export(Ptr<runtime.device> dev, Ptr<?> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_mnt((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const struct path*)$arg5, $arg6, (const u8*)$arg7, $arg8, $arg9, $arg10)")
    public static int match_mnt(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.path> path2, String buffer, Ptr<runtime.path> devpath, String devbuffer, String type2, @Unsigned long flags, Ptr<?> data, boolean binary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_mnt_path_str((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const u8*)$arg5, (const u8*)$arg6, $arg7, $arg8, $arg9, (const u8*)$arg10)")
    public static int match_mnt_path_str(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.path> mntpath, String buffer, String devname, String type2, @Unsigned long flags, Ptr<?> data, boolean binary, String devinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_option((const u8*)$arg1, $arg2, (const u8*)$arg3)")
    public static boolean match_option(String arg2, int arglen, String opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_pci_dev_by_id($arg1, (const void*)$arg2)")
    public static int match_pci_dev_by_id(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_devname_and_update_preferred_console((const u8*)$arg1, (const u8*)$arg2, (const short int)$arg3)")
    public static int match_devname_and_update_preferred_console(String devname, String name, short idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean match_endpoint(Ptr<UsbDefinitions.usb_endpoint_descriptor> epd, Ptr<Ptr<UsbDefinitions.usb_endpoint_descriptor>> bulk_in, Ptr<Ptr<UsbDefinitions.usb_endpoint_descriptor>> bulk_out, Ptr<Ptr<UsbDefinitions.usb_endpoint_descriptor>> int_in, Ptr<Ptr<UsbDefinitions.usb_endpoint_descriptor>> int_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean match_exception(Ptr<ListDefinitions.list_head> exceptions, short type2, @Unsigned int major, @Unsigned int minor, short access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean match_exception_partial(Ptr<ListDefinitions.list_head> exceptions, short type2, @Unsigned int major, @Unsigned int minor, short access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean match_fanout_group(Ptr<PacketDefinitions.packet_type> ptype, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_file((const void*)$arg1, $arg2, $arg3)")
    public static int match_file(Ptr<?> p, Ptr<runtime.file> file2, @Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_hid_uid($arg1, (const void*)$arg2)")
    public static int match_hid_uid(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_pci_dev(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_records(Ptr<FtraceDefinitions.ftrace_hash> hash2, String func, int len, String mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean match_smt(Ptr<misc.cpuinfo_x86> c, Ptr<misc.cpuinfo_x86> o) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_identity((const struct detailed_timing*)$arg1, $arg2)")
    public static void match_identity(Ptr<misc.detailed_timing> timing, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_location(Ptr<UsbDefinitions.usb_device> peer_hdev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_string((const u8**)$arg1, $arg2, (const u8*)$arg3)")
    public static int match_string(Ptr<String> array, @Unsigned long n, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_config_table((const struct {\n  u8 b[16];\n}*)$arg1, $arg2, (const struct {\n  struct {\n    u8 b[16];\n  } guid;\n  long unsigned int *ptr;\n  const const u8[16] name;\n}*)$arg3)")
    public static int match_config_table(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> guid, @Unsigned long table, Ptr<EfiDefinitions.efi_config_table_type_t> table_types) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_dev_by_label($arg1, (const void*)$arg2)")
    public static int match_dev_by_label(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_dev_by_uuid($arg1, (const void*)$arg2)")
    public static int match_dev_by_uuid(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_device_ids(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_dimm(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_hex(Ptr<misc.substring_t> s2, Ptr<Integer> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_int(Ptr<misc.substring_t> s2, Ptr<Integer> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_number(Ptr<misc.substring_t> s2, Ptr<Integer> result, int base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_octal(Ptr<misc.substring_t> s2, Ptr<Integer> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_one($arg1, (const u8*)$arg2, $arg3)")
    public static int match_one(String s2, String p, Ptr<misc.substring_t> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_strdup((const struct {\n  u8 *from;\n  u8 *to;\n}*)$arg1)")
    public static String match_strdup(Ptr<misc.substring_t> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_strlcpy($arg1, (const struct {\n  u8 *from;\n  u8 *to;\n}*)$arg2, $arg3)")
    public static @Unsigned long match_strlcpy(String dest, Ptr<misc.substring_t> src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_u64(Ptr<misc.substring_t> s2, Ptr<@Unsigned Long> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int match_uint(Ptr<misc.substring_t> s2, Ptr<@Unsigned Integer> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="match_wildcard((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean match_wildcard(String pattern, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct match_workbuf")
    @NotUsableInJava
    public static class match_workbuf
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int pos;
        public @Unsigned int len;
        public @Unsigned int size;
        public @Unsigned int @Size(value=24) [] history;
    }

    @Type(noCCodeGeneration=true, cType="struct match_ids_walk_data")
    @NotUsableInJava
    public static class match_ids_walk_data
    extends Struct {
        public Ptr<AcpiDefinitions.acpi_device_id> ids;
        public Ptr<AcpiDefinitions.acpi_device> adev;
    }

    @Type(noCCodeGeneration=true, cType="struct match_token")
    @NotUsableInJava
    public static class match_token
    extends Struct {
        public int token;
        public String pattern;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 *event; u8 *event_system; }")
    @NotUsableInJava
    public static class match_data_of_anon_member_of_action_data
    extends Struct {
        public String event;
        public String event_system;
    }
}

