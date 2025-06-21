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
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class EcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="ec_clear_on_resume((const struct dmi_system_id*)$arg1)")
    public static int ec_clear_on_resume(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ec_correct_ecdt((const struct dmi_system_id*)$arg1)")
    public static int ec_correct_ecdt(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="acpi_handle") Ptr<?> ec_get_handle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ec_guard(Ptr<AcpiDefinitions.acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ec_honor_dsdt_gpe((const struct dmi_system_id*)$arg1)")
    public static int ec_honor_dsdt_gpe(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ec_install_handlers(Ptr<AcpiDefinitions.acpi_ec> ec, Ptr<AcpiDefinitions.acpi_device> device2, boolean call_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int ec_parse_device(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int Level, Ptr<?> context2, Ptr<Ptr<?>> retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int ec_parse_io_ports(Ptr<AcpiDefinitions.acpi_resource> resource2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ec_read(char addr2, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ec_remove_handlers(Ptr<AcpiDefinitions.acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ec_transaction($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int ec_transaction(char command, Ptr<Character> wdata, @Unsigned int wdata_len, Ptr<Character> rdata, @Unsigned int rdata_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ec_write(char addr2, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum ec_command")
    public static enum ec_command implements Enum<ec_command>,
    TypedEnum<ec_command, Integer>
    {
        ACPI_EC_COMMAND_READ,
        ACPI_EC_COMMAND_WRITE,
        ACPI_EC_BURST_ENABLE,
        ACPI_EC_BURST_DISABLE,
        ACPI_EC_COMMAND_QUERY;

    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_host_event_mask")
    @NotUsableInJava
    public static class ec_response_host_event_mask
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_get_next_event_v3")
    @NotUsableInJava
    public static class ec_response_get_next_event_v3
    extends Struct {
        public @OriginalName(value="uint8_t") char event_type;
        public ec_response_get_next_data_v3 data;
    }

    @Type(noCCodeGeneration=true, cType="union ec_response_get_next_data_v3")
    @NotUsableInJava
    public static class ec_response_get_next_data_v3
    extends Union {
        public @OriginalName(value="uint8_t") char @Size(value=18) [] key_matrix;
        public @Unsigned @OriginalName(value="uint32_t") int host_event;
        public @Unsigned @OriginalName(value="uint64_t") long host_event64;
        public misc.sensor_fifo_of_ec_response_get_next_data_v3 sensor_fifo;
        public @Unsigned @OriginalName(value="uint32_t") int buttons;
        public @Unsigned @OriginalName(value="uint32_t") int switches;
        public @Unsigned @OriginalName(value="uint32_t") int fp_events;
        public @Unsigned @OriginalName(value="uint32_t") int sysrq;
        public @Unsigned @OriginalName(value="uint32_t") int cec_events;
        public @OriginalName(value="uint8_t") char @Size(value=16) [] cec_message;
    }

    @Type(noCCodeGeneration=true, cType="enum ec_mkbp_event")
    public static enum ec_mkbp_event implements Enum<ec_mkbp_event>,
    TypedEnum<ec_mkbp_event, Integer>
    {
        EC_MKBP_EVENT_KEY_MATRIX,
        EC_MKBP_EVENT_HOST_EVENT,
        EC_MKBP_EVENT_SENSOR_FIFO,
        EC_MKBP_EVENT_BUTTON,
        EC_MKBP_EVENT_SWITCH,
        EC_MKBP_EVENT_FINGERPRINT,
        EC_MKBP_EVENT_SYSRQ,
        EC_MKBP_EVENT_HOST_EVENT64,
        EC_MKBP_EVENT_CEC_EVENT,
        EC_MKBP_EVENT_CEC_MESSAGE,
        EC_MKBP_EVENT_PCHG,
        EC_MKBP_EVENT_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_motion_sense")
    @NotUsableInJava
    public static class ec_response_motion_sense
    extends Struct {
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) DumpDefinitions.dump_of_anon_member_of_ec_response_motion_sense dump;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) misc.info_of_anon_member_of_ec_response_motion_sense info;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) AnonDefinitions.info_3_of_anon_member_of_ec_response_motion_sense info_3;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_response_motion_sensor_data data;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense ec_rate;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense sensor_odr;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense sensor_range;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense kb_wake_angle;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense fifo_int_enable;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense spoof;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) misc.perform_calib_of_anon_member_of_ec_response_motion_sense_and_sensor_offset_of_anon_member_of_ec_response_motion_sense sensor_offset;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) misc.perform_calib_of_anon_member_of_ec_response_motion_sense_and_sensor_offset_of_anon_member_of_ec_response_motion_sense perform_calib;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) misc.sensor_scale_of_anon_member_of_ec_response_motion_sense sensor_scale;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_response_motion_sense_fifo_info fifo_info;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_response_motion_sense_fifo_info fifo_flush;
        @InlineUnion(value=33702)
        public @InlineUnion(value=33702) ec_response_motion_sense_fifo_data fifo_read;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) ListDefinitions.list_activities_of_anon_member_of_ec_response_motion_sense list_activities;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) misc.lid_angle_of_anon_member_of_ec_response_motion_sense lid_angle;
        @InlineUnion(value=33702)
        public  @InlineUnion(value=33702) misc.tablet_mode_threshold_of_anon_member_of_ec_response_motion_sense tablet_mode_threshold;
    }

    @Type(noCCodeGeneration=true, cType="struct { int ret; }")
    @NotUsableInJava
    public static class ec_rate_of_anon_member_of_ec_response_motion_sense_and_fifo_int_enable_of_anon_member_of_ec_response_motion_sense_and_kb_wake_angle_of_anon_member_of_ec_response_motion_sense
    extends Struct {
        public @OriginalName(value="int32_t") int ret;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_params_motion_sense")
    @NotUsableInJava
    public static class ec_params_motion_sense
    extends Struct {
        public @OriginalName(value="uint8_t") char cmd;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DumpDefinitions.dump_of_anon_member_of_ec_params_motion_sense dump;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) misc.kb_wake_angle_of_anon_member_of_ec_params_motion_sense kb_wake_angle;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DataDefinitions.data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense info;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DataDefinitions.data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense info_3;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DataDefinitions.data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense data;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DataDefinitions.data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense fifo_flush;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DataDefinitions.data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense perform_calib;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) DataDefinitions.data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense list_activities;
        @InlineUnion(value=33690)
        public @InlineUnion(value=33690) ec_rate_of_anon_member_of_ec_params_motion_sense_and_sensor_odr_of_anon_member_of_ec_params_motion_sense_and_sensor_range_of_anon_member_of_ec_params_motion_sense ec_rate;
        @InlineUnion(value=33690)
        public @InlineUnion(value=33690) ec_rate_of_anon_member_of_ec_params_motion_sense_and_sensor_odr_of_anon_member_of_ec_params_motion_sense_and_sensor_range_of_anon_member_of_ec_params_motion_sense sensor_odr;
        @InlineUnion(value=33690)
        public @InlineUnion(value=33690) ec_rate_of_anon_member_of_ec_params_motion_sense_and_sensor_odr_of_anon_member_of_ec_params_motion_sense_and_sensor_range_of_anon_member_of_ec_params_motion_sense sensor_range;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) misc.sensor_offset_of_anon_member_of_ec_params_motion_sense sensor_offset;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) misc.sensor_scale_of_anon_member_of_ec_params_motion_sense sensor_scale;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) FifoDefinitions.fifo_read_of_anon_member_of_ec_params_motion_sense fifo_read;
        @InlineUnion(value=33690)
        public @InlineUnion(value=33690) ec_motion_sense_activity set_activity;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) FifoDefinitions.fifo_int_enable_of_anon_member_of_ec_params_motion_sense fifo_int_enable;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) misc.spoof_of_anon_member_of_ec_params_motion_sense spoof;
        @InlineUnion(value=33690)
        public  @InlineUnion(value=33690) misc.tablet_mode_threshold_of_anon_member_of_ec_params_motion_sense tablet_mode_threshold;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 sensor_num; u8 roundup; short unsigned int reserved; int data; }")
    @NotUsableInJava
    public static class ec_rate_of_anon_member_of_ec_params_motion_sense_and_sensor_odr_of_anon_member_of_ec_params_motion_sense_and_sensor_range_of_anon_member_of_ec_params_motion_sense
    extends Struct {
        public @OriginalName(value="uint8_t") char sensor_num;
        public @OriginalName(value="uint8_t") char roundup;
        public @Unsigned @OriginalName(value="uint16_t") short reserved;
        public @OriginalName(value="int32_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_motion_sense_activity")
    @NotUsableInJava
    public static class ec_motion_sense_activity
    extends Struct {
        public @OriginalName(value="uint8_t") char sensor_num;
        public @OriginalName(value="uint8_t") char activity;
        public @OriginalName(value="uint8_t") char enable;
        public @OriginalName(value="uint8_t") char reserved;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] parameters;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_motion_sense_fifo_data")
    @NotUsableInJava
    public static class ec_response_motion_sense_fifo_data
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int number_data;
        public ec_response_motion_sensor_data @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_motion_sense_fifo_info")
    @NotUsableInJava
    public static class ec_response_motion_sense_fifo_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short size;
        public @Unsigned @OriginalName(value="uint16_t") short count;
        public @Unsigned @OriginalName(value="uint32_t") int timestamp;
        public @Unsigned @OriginalName(value="uint16_t") short total_lost;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=0) [] lost;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_motion_sensor_data")
    @NotUsableInJava
    public static class ec_response_motion_sensor_data
    extends Struct {
        public @OriginalName(value="uint8_t") char flags;
        public @OriginalName(value="uint8_t") char sensor_num;
        @InlineUnion(value=33672)
        public @InlineUnion(value=33672) @OriginalName(value="int16_t") short @Size(value=3) [] data;
        @InlineUnion(value=33672)
        public  @InlineUnion(value=33672) AnonDefinitions.anon_member_of_anon_member_of_ec_response_motion_sensor_data anon2$1;
        @InlineUnion(value=33672)
        public  @InlineUnion(value=33672) AnonDefinitions.anon_member_of_anon_member_of_ec_response_motion_sensor_data anon2$2;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_get_features")
    @NotUsableInJava
    public static class ec_response_get_features
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=2) [] flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_get_protocol_info")
    @NotUsableInJava
    public static class ec_response_get_protocol_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int protocol_versions;
        public @Unsigned @OriginalName(value="uint16_t") short max_request_packet_size;
        public @Unsigned @OriginalName(value="uint16_t") short max_response_packet_size;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_get_comms_status")
    @NotUsableInJava
    public static class ec_response_get_comms_status
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum ec_comms_status")
    public static enum ec_comms_status implements Enum<ec_comms_status>,
    TypedEnum<ec_comms_status, Integer>
    {
        EC_COMMS_STATUS_PROCESSING;

    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_get_cmd_versions")
    @NotUsableInJava
    public static class ec_response_get_cmd_versions
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int version_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_params_get_cmd_versions_v1")
    @NotUsableInJava
    public static class ec_params_get_cmd_versions_v1
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_params_get_cmd_versions")
    @NotUsableInJava
    public static class ec_params_get_cmd_versions
    extends Struct {
        public @OriginalName(value="uint8_t") char cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_params_read_memmap")
    @NotUsableInJava
    public static class ec_params_read_memmap
    extends Struct {
        public @OriginalName(value="uint8_t") char offset;
        public @OriginalName(value="uint8_t") char size;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_response_hello")
    @NotUsableInJava
    public static class ec_response_hello
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int out_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_params_hello")
    @NotUsableInJava
    public static class ec_params_hello
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int in_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ec_host_request")
    @NotUsableInJava
    public static class ec_host_request
    extends Struct {
        public @OriginalName(value="uint8_t") char struct_version;
        public @OriginalName(value="uint8_t") char checksum;
        public @Unsigned @OriginalName(value="uint16_t") short command;
        public @OriginalName(value="uint8_t") char command_version;
        public @OriginalName(value="uint8_t") char reserved;
        public @Unsigned @OriginalName(value="uint16_t") short data_len;
    }

    @Type(noCCodeGeneration=true, cType="enum ec_temp_thresholds")
    public static enum ec_temp_thresholds implements Enum<ec_temp_thresholds>,
    TypedEnum<ec_temp_thresholds, Integer>
    {
        EC_TEMP_THRESH_WARN,
        EC_TEMP_THRESH_HIGH,
        EC_TEMP_THRESH_HALT,
        EC_TEMP_THRESH_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum ec_led_colors")
    public static enum ec_led_colors implements Enum<ec_led_colors>,
    TypedEnum<ec_led_colors, Integer>
    {
        EC_LED_COLOR_RED,
        EC_LED_COLOR_GREEN,
        EC_LED_COLOR_BLUE,
        EC_LED_COLOR_YELLOW,
        EC_LED_COLOR_WHITE,
        EC_LED_COLOR_AMBER,
        EC_LED_COLOR_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum ec_status")
    public static enum ec_status implements Enum<ec_status>,
    TypedEnum<ec_status, Integer>
    {
        EC_RES_SUCCESS,
        EC_RES_INVALID_COMMAND,
        EC_RES_ERROR,
        EC_RES_INVALID_PARAM,
        EC_RES_ACCESS_DENIED,
        EC_RES_INVALID_RESPONSE,
        EC_RES_INVALID_VERSION,
        EC_RES_INVALID_CHECKSUM,
        EC_RES_IN_PROGRESS,
        EC_RES_UNAVAILABLE,
        EC_RES_TIMEOUT,
        EC_RES_OVERFLOW,
        EC_RES_INVALID_HEADER,
        EC_RES_REQUEST_TRUNCATED,
        EC_RES_RESPONSE_TOO_BIG,
        EC_RES_BUS_ERROR,
        EC_RES_BUSY,
        EC_RES_INVALID_HEADER_VERSION,
        EC_RES_INVALID_HEADER_CRC,
        EC_RES_INVALID_DATA_CRC,
        EC_RES_DUP_UNAVAILABLE;

    }
}

