/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class AmlDefinitions {

    @Type(noCCodeGeneration=true, cType="union aml_resource")
    @NotUsableInJava
    public static class aml_resource
    extends Union {
        public char descriptor_type;
        public aml_resource_small_header small_header;
        public aml_resource_large_header large_header;
        public aml_resource_irq irq;
        public aml_resource_dma dma;
        public aml_resource_start_dependent start_dpf;
        public aml_resource_end_dependent end_dpf;
        public aml_resource_io io;
        public aml_resource_fixed_io fixed_io;
        public aml_resource_fixed_dma fixed_dma;
        public aml_resource_vendor_small vendor_small;
        public aml_resource_end_tag end_tag;
        public aml_resource_memory24 memory24;
        public aml_resource_generic_register generic_reg;
        public aml_resource_vendor_large vendor_large;
        public aml_resource_memory32 memory32;
        public aml_resource_fixed_memory32 fixed_memory32;
        public aml_resource_address16 address16;
        public aml_resource_address32 address32;
        public aml_resource_address64 address64;
        public aml_resource_extended_address64 ext_address64;
        public aml_resource_extended_irq extended_irq;
        public aml_resource_gpio gpio;
        public aml_resource_i2c_serialbus i2c_serial_bus;
        public aml_resource_spi_serialbus spi_serial_bus;
        public aml_resource_uart_serialbus uart_serial_bus;
        public aml_resource_csi2_serialbus csi2_serial_bus;
        public aml_resource_common_serialbus common_serial_bus;
        public aml_resource_pin_function pin_function;
        public aml_resource_pin_config pin_config;
        public aml_resource_pin_group pin_group;
        public aml_resource_pin_group_function pin_group_function;
        public aml_resource_pin_group_config pin_group_config;
        public aml_resource_clock_input clock_input;
        public aml_resource_address address;
        public @Unsigned int dword_item;
        public @Unsigned short word_item;
        public char byte_item;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_pin_group_config")
    @NotUsableInJava
    public static class aml_resource_pin_group_config
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public @Unsigned short flags;
        public char pin_config_type;
        public @Unsigned int pin_config_value;
        public char res_source_index;
        public @Unsigned short res_source_offset;
        public @Unsigned short res_source_label_offset;
        public @Unsigned short vendor_offset;
        public @Unsigned short vendor_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_pin_group_function")
    @NotUsableInJava
    public static class aml_resource_pin_group_function
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public @Unsigned short flags;
        public @Unsigned short function_number;
        public char res_source_index;
        public @Unsigned short res_source_offset;
        public @Unsigned short res_source_label_offset;
        public @Unsigned short vendor_offset;
        public @Unsigned short vendor_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_pin_group")
    @NotUsableInJava
    public static class aml_resource_pin_group
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public @Unsigned short flags;
        public @Unsigned short pin_table_offset;
        public @Unsigned short label_offset;
        public @Unsigned short vendor_offset;
        public @Unsigned short vendor_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_clock_input")
    @NotUsableInJava
    public static class aml_resource_clock_input
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public @Unsigned short flags;
        public @Unsigned short frequency_divisor;
        public @Unsigned int frequency_numerator;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_pin_config")
    @NotUsableInJava
    public static class aml_resource_pin_config
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public @Unsigned short flags;
        public char pin_config_type;
        public @Unsigned int pin_config_value;
        public @Unsigned short pin_table_offset;
        public char res_source_index;
        public @Unsigned short res_source_offset;
        public @Unsigned short vendor_offset;
        public @Unsigned short vendor_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_pin_function")
    @NotUsableInJava
    public static class aml_resource_pin_function
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public @Unsigned short flags;
        public char pin_config;
        public @Unsigned short function_number;
        public @Unsigned short pin_table_offset;
        public char res_source_index;
        public @Unsigned short res_source_offset;
        public @Unsigned short vendor_offset;
        public @Unsigned short vendor_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_uart_serialbus")
    @NotUsableInJava
    public static class aml_resource_uart_serialbus
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public char res_source_index;
        public char type;
        public char flags;
        public @Unsigned short type_specific_flags;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned int default_baud_rate;
        public @Unsigned short rx_fifo_size;
        public @Unsigned short tx_fifo_size;
        public char parity;
        public char lines_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_spi_serialbus")
    @NotUsableInJava
    public static class aml_resource_spi_serialbus
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public char res_source_index;
        public char type;
        public char flags;
        public @Unsigned short type_specific_flags;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned int connection_speed;
        public char data_bit_length;
        public char clock_phase;
        public char clock_polarity;
        public @Unsigned short device_selection;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_i2c_serialbus")
    @NotUsableInJava
    public static class aml_resource_i2c_serialbus
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public char res_source_index;
        public char type;
        public char flags;
        public @Unsigned short type_specific_flags;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned int connection_speed;
        public @Unsigned short slave_address;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_csi2_serialbus")
    @NotUsableInJava
    public static class aml_resource_csi2_serialbus
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public char res_source_index;
        public char type;
        public char flags;
        public @Unsigned short type_specific_flags;
        public char type_revision_id;
        public @Unsigned short type_data_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_common_serialbus")
    @NotUsableInJava
    public static class aml_resource_common_serialbus
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public char res_source_index;
        public char type;
        public char flags;
        public @Unsigned short type_specific_flags;
        public char type_revision_id;
        public @Unsigned short type_data_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_gpio")
    @NotUsableInJava
    public static class aml_resource_gpio
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char revision_id;
        public char connection_type;
        public @Unsigned short flags;
        public @Unsigned short int_flags;
        public char pin_config;
        public @Unsigned short drive_strength;
        public @Unsigned short debounce_timeout;
        public @Unsigned short pin_table_offset;
        public char res_source_index;
        public @Unsigned short res_source_offset;
        public @Unsigned short vendor_offset;
        public @Unsigned short vendor_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_generic_register")
    @NotUsableInJava
    public static class aml_resource_generic_register
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char address_space_id;
        public char bit_width;
        public char bit_offset;
        public char access_size;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_extended_irq")
    @NotUsableInJava
    public static class aml_resource_extended_irq
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char flags;
        public char interrupt_count;
        @InlineUnion(value=15600)
        public @InlineUnion(value=15600) @Unsigned int interrupt;
        @InlineUnion(value=15600)
        public  @InlineUnion(value=15600) AnonDefinitions.anon_member_of_anon_member_of_acpi_resource_extended_irq_and_anon_member_of_aml_resource_extended_irq anon4$1;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_address16")
    @NotUsableInJava
    public static class aml_resource_address16
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char resource_type;
        public char flags;
        public char specific_flags;
        public @Unsigned short granularity;
        public @Unsigned short minimum;
        public @Unsigned short maximum;
        public @Unsigned short translation_offset;
        public @Unsigned short address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_address32")
    @NotUsableInJava
    public static class aml_resource_address32
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char resource_type;
        public char flags;
        public char specific_flags;
        public @Unsigned int granularity;
        public @Unsigned int minimum;
        public @Unsigned int maximum;
        public @Unsigned int translation_offset;
        public @Unsigned int address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_address64")
    @NotUsableInJava
    public static class aml_resource_address64
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char resource_type;
        public char flags;
        public char specific_flags;
        public @Unsigned long granularity;
        public @Unsigned long minimum;
        public @Unsigned long maximum;
        public @Unsigned long translation_offset;
        public @Unsigned long address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_extended_address64")
    @NotUsableInJava
    public static class aml_resource_extended_address64
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char resource_type;
        public char flags;
        public char specific_flags;
        public char revision_ID;
        public char reserved;
        public @Unsigned long granularity;
        public @Unsigned long minimum;
        public @Unsigned long maximum;
        public @Unsigned long translation_offset;
        public @Unsigned long address_length;
        public @Unsigned long type_specific;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_address")
    @NotUsableInJava
    public static class aml_resource_address
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char resource_type;
        public char flags;
        public char specific_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_fixed_memory32")
    @NotUsableInJava
    public static class aml_resource_fixed_memory32
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char flags;
        public @Unsigned int address;
        public @Unsigned int address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_memory32")
    @NotUsableInJava
    public static class aml_resource_memory32
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char flags;
        public @Unsigned int minimum;
        public @Unsigned int maximum;
        public @Unsigned int alignment;
        public @Unsigned int address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_vendor_large")
    @NotUsableInJava
    public static class aml_resource_vendor_large
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_memory24")
    @NotUsableInJava
    public static class aml_resource_memory24
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
        public char flags;
        public @Unsigned short minimum;
        public @Unsigned short maximum;
        public @Unsigned short alignment;
        public @Unsigned short address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_large_header")
    @NotUsableInJava
    public static class aml_resource_large_header
    extends Struct {
        public char descriptor_type;
        public @Unsigned short resource_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_fixed_dma")
    @NotUsableInJava
    public static class aml_resource_fixed_dma
    extends Struct {
        public char descriptor_type;
        public @Unsigned short request_lines;
        public @Unsigned short channels;
        public char width;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_end_tag")
    @NotUsableInJava
    public static class aml_resource_end_tag
    extends Struct {
        public char descriptor_type;
        public char checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_vendor_small")
    @NotUsableInJava
    public static class aml_resource_vendor_small
    extends Struct {
        public char descriptor_type;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_fixed_io")
    @NotUsableInJava
    public static class aml_resource_fixed_io
    extends Struct {
        public char descriptor_type;
        public @Unsigned short address;
        public char address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_io")
    @NotUsableInJava
    public static class aml_resource_io
    extends Struct {
        public char descriptor_type;
        public char flags;
        public @Unsigned short minimum;
        public @Unsigned short maximum;
        public char alignment;
        public char address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_end_dependent")
    @NotUsableInJava
    public static class aml_resource_end_dependent
    extends Struct {
        public char descriptor_type;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_start_dependent")
    @NotUsableInJava
    public static class aml_resource_start_dependent
    extends Struct {
        public char descriptor_type;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_dma")
    @NotUsableInJava
    public static class aml_resource_dma
    extends Struct {
        public char descriptor_type;
        public char dma_channel_mask;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_irq")
    @NotUsableInJava
    public static class aml_resource_irq
    extends Struct {
        public char descriptor_type;
        public @Unsigned short irq_mask;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct aml_resource_small_header")
    @NotUsableInJava
    public static class aml_resource_small_header
    extends Struct {
        public char descriptor_type;
    }
}

