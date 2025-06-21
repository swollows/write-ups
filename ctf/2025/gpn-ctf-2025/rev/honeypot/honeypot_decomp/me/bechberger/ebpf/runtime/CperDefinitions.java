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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CperDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cper_dimm_err_location(Ptr<cper_mem_err_compact> mem, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_estatus_check((const struct acpi_hest_generic_status*)$arg1)")
    public static int cper_estatus_check(Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_estatus_check_header((const struct acpi_hest_generic_status*)$arg1)")
    public static int cper_estatus_check_header(Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_estatus_print((const u8*)$arg1, (const struct acpi_hest_generic_status*)$arg2)")
    public static void cper_estatus_print(String pfx, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_estatus_print_section((const u8*)$arg1, $arg2, $arg3)")
    public static void cper_estatus_print_section(String pfx, Ptr<AcpiDefinitions.acpi_hest_generic_data> gdata, int sec_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cper_mem_err_location(Ptr<cper_mem_err_compact> mem, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_mem_err_pack((const struct cper_sec_mem_err*)$arg1, $arg2)")
    public static void cper_mem_err_pack(Ptr<cper_sec_mem_err> mem, Ptr<cper_mem_err_compact> cmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)cper_mem_err_status_str($arg1))")
    public static String cper_mem_err_status_str(@Unsigned long status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)cper_mem_err_type_str($arg1))")
    public static String cper_mem_err_type_str(@Unsigned int etype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)cper_mem_err_unpack($arg1, $arg2))")
    public static String cper_mem_err_unpack(Ptr<TraceDefinitions.trace_seq> p, Ptr<cper_mem_err_compact> cmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cper_next_record_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_print_bits((const u8*)$arg1, $arg2, (const u8**)$arg3, $arg4)")
    public static void cper_print_bits(String pfx, @Unsigned int bits, Ptr<String> strs, @Unsigned int strs_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_print_mem((const u8*)$arg1, (const struct cper_sec_mem_err*)$arg2, $arg3)")
    public static void cper_print_mem(String pfx, Ptr<cper_sec_mem_err> mem, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_print_pcie((const u8*)$arg1, (const struct cper_sec_pcie*)$arg2, (const struct acpi_hest_generic_data*)$arg3)")
    public static void cper_print_pcie(String pfx, Ptr<cper_sec_pcie> pcie, Ptr<AcpiDefinitions.acpi_hest_generic_data> gdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_print_proc_generic((const u8*)$arg1, (const struct cper_sec_proc_generic*)$arg2)")
    public static void cper_print_proc_generic(String pfx, Ptr<cper_sec_proc_generic> proc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)cper_severity_str($arg1))")
    public static String cper_severity_str(@Unsigned int severity2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_get_err_type((const struct {\n  u8 b[16];\n}*)$arg1)")
    public static misc.err_types cper_get_err_type(Ptr<@OriginalName(value="guid_t") misc.uuid_t> err_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_print_proc_ia((const u8*)$arg1, (const struct cper_sec_proc_ia*)$arg2)")
    public static void cper_print_proc_ia(String pfx, Ptr<cper_sec_proc_ia> proc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cper_severity_to_aer(int cper_severity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cper_print_prot_err((const u8*)$arg1, (const struct cper_sec_prot_err*)$arg2)")
    public static void cper_print_prot_err(String pfx, Ptr<cper_sec_prot_err> prot_err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cper_ia_err_info")
    @NotUsableInJava
    public static class cper_ia_err_info
    extends Struct {
        public @OriginalName(value="guid_t") misc.uuid_t err_type;
        public @Unsigned long validation_bits;
        public @Unsigned long check_info;
        public @Unsigned long target_id;
        public @Unsigned long requestor_id;
        public @Unsigned long responder_id;
        public @Unsigned long ip;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_cxl_event_sn")
    @NotUsableInJava
    public static class cper_cxl_event_sn
    extends Struct {
        public @Unsigned int lower_dw;
        public @Unsigned int upper_dw;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_cxl_event_devid")
    @NotUsableInJava
    public static class cper_cxl_event_devid
    extends Struct {
        public @Unsigned short vendor_id;
        public @Unsigned short device_id;
        public char func_num;
        public char device_num;
        public char bus_num;
        public @Unsigned short segment_num;
        public @Unsigned short slot_num;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_arm_err_info")
    @NotUsableInJava
    public static class cper_arm_err_info
    extends Struct {
        public char version;
        public char length;
        public @Unsigned short validation_bits;
        public char type;
        public @Unsigned short multiple_error;
        public char flags;
        public @Unsigned long error_info;
        public @Unsigned long virt_fault_addr;
        public @Unsigned long physical_fault_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_mce_record")
    @NotUsableInJava
    public static class cper_mce_record
    extends Struct {
        public cper_record_header hdr;
        public cper_section_descriptor sec_hdr;
        public runtime.mce mce;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_ia_proc_ctx")
    @NotUsableInJava
    public static class cper_ia_proc_ctx
    extends Struct {
        public @Unsigned short reg_ctx_type;
        public @Unsigned short reg_arr_size;
        public @Unsigned int msr_addr;
        public @Unsigned long mm_reg_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_proc_arm")
    @NotUsableInJava
    public static class cper_sec_proc_arm
    extends Struct {
        public @Unsigned int validation_bits;
        public @Unsigned short err_info_num;
        public @Unsigned short context_info_num;
        public @Unsigned int section_length;
        public char affinity_level;
        public char @Size(value=3) [] reserved;
        public @Unsigned long mpidr;
        public @Unsigned long midr;
        public @Unsigned int running_state;
        public @Unsigned int psci_state;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_fw_err_rec_ref")
    @NotUsableInJava
    public static class cper_sec_fw_err_rec_ref
    extends Struct {
        public char record_type;
        public char revision;
        public char @Size(value=6) [] reserved;
        public @Unsigned long record_identifier;
        public @OriginalName(value="guid_t") misc.uuid_t record_identifier_guid;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_pcie")
    @NotUsableInJava
    public static class cper_sec_pcie
    extends Struct {
        public @Unsigned long validation_bits;
        public @Unsigned int port_type;
        public misc.version_of_cper_sec_pcie version;
        public @Unsigned short command;
        public @Unsigned short status;
        public @Unsigned int reserved;
        public DeviceDefinitions.device_id_of_cper_sec_pcie device_id;
        public AnonDefinitions.anon_member_of_pn_and_anon_member_of_pn_t_and_serial_number_of_cper_sec_pcie serial_number;
        public misc.bridge_of_cper_sec_pcie bridge;
        public char @Size(value=60) [] capability;
        public char @Size(value=96) [] aer_info;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_proc_ia")
    @NotUsableInJava
    public static class cper_sec_proc_ia
    extends Struct {
        public @Unsigned long validation_bits;
        public @Unsigned long lapic_id;
        public char @Size(value=48) [] cpuid;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_proc_generic")
    @NotUsableInJava
    public static class cper_sec_proc_generic
    extends Struct {
        public @Unsigned long validation_bits;
        public char proc_type;
        public char proc_isa;
        public char proc_error_type;
        public char operation;
        public char flags;
        public char level;
        public @Unsigned short reserved;
        public @Unsigned long cpu_version;
        public char @Size(value=128) [] cpu_brand;
        public @Unsigned long proc_id;
        public @Unsigned long target_addr;
        public @Unsigned long requestor_id;
        public @Unsigned long responder_id;
        public @Unsigned long ip;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_mem_err_compact")
    @NotUsableInJava
    public static class cper_mem_err_compact
    extends Struct {
        public @Unsigned long validation_bits;
        public @Unsigned short node;
        public @Unsigned short card;
        public @Unsigned short module;
        public @Unsigned short bank;
        public @Unsigned short device;
        public @Unsigned short row;
        public @Unsigned short column;
        public @Unsigned short bit_pos;
        public @Unsigned long requestor_id;
        public @Unsigned long responder_id;
        public @Unsigned long target_id;
        public @Unsigned short rank;
        public @Unsigned short mem_array_handle;
        public @Unsigned short mem_dev_handle;
        public char extended;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_mem_err")
    @NotUsableInJava
    public static class cper_sec_mem_err
    extends Struct {
        public @Unsigned long validation_bits;
        public @Unsigned long error_status;
        public @Unsigned long physical_addr;
        public @Unsigned long physical_addr_mask;
        public @Unsigned short node;
        public @Unsigned short card;
        public @Unsigned short module;
        public @Unsigned short bank;
        public @Unsigned short device;
        public @Unsigned short row;
        public @Unsigned short column;
        public @Unsigned short bit_pos;
        public @Unsigned long requestor_id;
        public @Unsigned long responder_id;
        public @Unsigned long target_id;
        public char error_type;
        public char extended;
        public @Unsigned short rank;
        public @Unsigned short mem_array_handle;
        public @Unsigned short mem_dev_handle;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_sec_prot_err")
    @NotUsableInJava
    public static class cper_sec_prot_err
    extends Struct {
        public @Unsigned long valid_bits;
        public char agent_type;
        public char @Size(value=7) [] reserved;
        public misc.agent_addr_of_cper_sec_prot_err agent_addr;
        public DeviceDefinitions.device_id_of_cper_sec_prot_err device_id;
        public DevDefinitions.dev_serial_num_of_cper_sec_prot_err dev_serial_num;
        public char @Size(value=60) [] capability;
        public @Unsigned short dvsec_len;
        public @Unsigned short err_len;
        public char @Size(value=4) [] reserved_2;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_pstore_record")
    @NotUsableInJava
    public static class cper_pstore_record
    extends Struct {
        public cper_record_header hdr;
        public cper_section_descriptor sec_hdr;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_section_descriptor")
    @NotUsableInJava
    public static class cper_section_descriptor
    extends Struct {
        public @Unsigned int section_offset;
        public @Unsigned int section_length;
        public @Unsigned short revision;
        public char validation_bits;
        public char reserved;
        public @Unsigned int flags;
        public @OriginalName(value="guid_t") misc.uuid_t section_type;
        public @OriginalName(value="guid_t") misc.uuid_t fru_id;
        public @Unsigned int section_severity;
        public char @Size(value=20) [] fru_text;
    }

    @Type(noCCodeGeneration=true, cType="struct cper_record_header")
    @NotUsableInJava
    public static class cper_record_header
    extends Struct {
        public char @Size(value=4) [] signature;
        public @Unsigned short revision;
        public @Unsigned int signature_end;
        public @Unsigned short section_count;
        public @Unsigned int error_severity;
        public @Unsigned int validation_bits;
        public @Unsigned int record_length;
        public @Unsigned long timestamp;
        public @OriginalName(value="guid_t") misc.uuid_t platform_id;
        public @OriginalName(value="guid_t") misc.uuid_t partition_id;
        public @OriginalName(value="guid_t") misc.uuid_t creator_id;
        public @OriginalName(value="guid_t") misc.uuid_t notification_type;
        public @Unsigned long record_id;
        public @Unsigned int flags;
        public @Unsigned long persistence_information;
        public char @Size(value=12) [] reserved;
    }
}

