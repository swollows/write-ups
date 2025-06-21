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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EddDefinitions;
import me.bechberger.ebpf.runtime.EdidDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SetupDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.UvDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BootDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_alloc_snapshot(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_config_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void boot_cpu_hotplug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void boot_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_instance(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_override_clock(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_override_clocksource(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long boot_params_data_read(Ptr<runtime.file> fp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_params_ksysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_snapshot(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_delay_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void boot_init_possible_blades(Ptr<UvDefinitions.uv_hub_info_s> hub_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long boot_vga_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int boot_wait_for_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct boot_performance_record")
    @NotUsableInJava
    public static class boot_performance_record
    extends Struct {
        public misc.fpdt_record_header header;
        public @Unsigned int reserved;
        public @Unsigned long firmware_start;
        public @Unsigned long bootloader_load;
        public @Unsigned long bootloader_launch;
        public @Unsigned long exitbootservice_start;
        public @Unsigned long exitbootservice_end;
    }

    @Type(noCCodeGeneration=true, cType="struct boot_triggers")
    @NotUsableInJava
    public static class boot_triggers
    extends Struct {
        public String event;
        public String trigger;
    }

    @Type(noCCodeGeneration=true, cType="struct boot_params_to_save")
    @NotUsableInJava
    public static class boot_params_to_save
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct boot_params")
    @NotUsableInJava
    public static class boot_params
    extends Struct {
        public misc.screen_info screen_info;
        public misc.apm_bios_info apm_bios_info;
        public char @Size(value=4) [] _pad2;
        public @Unsigned long tboot_addr;
        public misc.ist_info ist_info;
        public @Unsigned long acpi_rsdp_addr;
        public char @Size(value=8) [] _pad3;
        public char @Size(value=16) [] hd0_info;
        public char @Size(value=16) [] hd1_info;
        public SysDefinitions.sys_desc_table sys_desc_table;
        public misc.olpc_ofw_header olpc_ofw_header;
        public @Unsigned int ext_ramdisk_image;
        public @Unsigned int ext_ramdisk_size;
        public @Unsigned int ext_cmd_line_ptr;
        public char @Size(value=112) [] _pad4;
        public @Unsigned int cc_blob_address;
        public EdidDefinitions.edid_info edid_info;
        public EfiDefinitions.efi_info efi_info;
        public @Unsigned int alt_mem_k;
        public @Unsigned int scratch;
        public char e820_entries;
        public char eddbuf_entries;
        public char edd_mbr_sig_buf_entries;
        public char kbd_status;
        public char secure_boot;
        public char @Size(value=2) [] _pad5;
        public char sentinel;
        public char @Size(value=1) [] _pad6;
        public SetupDefinitions.setup_header hdr;
        public char @Size(value=36) [] _pad7;
        public @Unsigned int @Size(value=16) [] edd_mbr_sig_buffer;
        public boot_e820_entry @Size(value=128) [] e820_table;
        public char @Size(value=48) [] _pad8;
        public EddDefinitions.edd_info @Size(value=6) [] eddbuf;
        public char @Size(value=276) [] _pad9;
    }

    @Type(noCCodeGeneration=true, cType="struct boot_e820_entry")
    @NotUsableInJava
    public static class boot_e820_entry
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long size;
        public @Unsigned int type;
    }
}

