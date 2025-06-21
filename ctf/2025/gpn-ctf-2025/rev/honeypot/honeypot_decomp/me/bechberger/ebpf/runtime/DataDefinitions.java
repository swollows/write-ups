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
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.FreqDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PrbDefinitions;
import me.bechberger.ebpf.runtime.PrintkDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class DataDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long data_node_show_path(Ptr<AcpiDefinitions.acpi_data_node> dn, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String data_alloc(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned int size, Ptr<PrbDefinitions.prb_data_blk_lpos> blk_lpos, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean data_push_tail(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned long lpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String data_realloc(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned int size, Ptr<PrbDefinitions.prb_data_blk_lpos> blk_lpos, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct icmphdr icmph; unsigned int times[3]; }")
    @NotUsableInJava
    public static class data_of_icmp_bxm
    extends Struct {
        public runtime.icmphdr icmph;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=3) [] times;
    }

    @Type(noCCodeGeneration=true, cType="union { struct ata_port *ap; struct ata_device *dev; }")
    @NotUsableInJava
    public static class data_of_ata_acpi_hotplug_context
    extends Union {
        public Ptr<AtaDefinitions.ata_port> ap;
        public Ptr<AtaDefinitions.ata_device> dev;
    }

    @Type(noCCodeGeneration=true, cType="union { struct detailed_pixel_timing pixel_data; struct detailed_non_pixel other_data; }")
    @NotUsableInJava
    public static class data_of_detailed_timing
    extends Union {
        public misc.detailed_pixel_timing pixel_data;
        public misc.detailed_non_pixel other_data;
    }

    @Type(noCCodeGeneration=true, cType="union { struct detailed_data_string str; struct detailed_data_monitor_range range; struct detailed_data_wpindex color; struct std_timing timings[6]; struct cvt_timing cvt[4]; }")
    @NotUsableInJava
    public static class data_of_detailed_non_pixel
    extends Union {
        public misc.detailed_data_string str;
        public misc.detailed_data_monitor_range range;
        public misc.detailed_data_wpindex color;
        public misc.std_timing @Size(value=6) [] timings;
        public misc.cvt_timing @Size(value=4) [] cvt;
    }

    @Type(noCCodeGeneration=true, cType="struct data_directory")
    @NotUsableInJava
    public static class data_directory
    extends Struct {
        public data_dirent exports;
        public data_dirent imports;
        public data_dirent resources;
        public data_dirent exceptions;
        public data_dirent certs;
        public data_dirent base_relocations;
        public data_dirent debug;
        public data_dirent arch;
        public data_dirent global_ptr;
        public data_dirent tls;
        public data_dirent load_config;
        public data_dirent bound_imports;
        public data_dirent import_addrs;
        public data_dirent delay_imports;
        public data_dirent clr_runtime_hdr;
        public data_dirent reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct data_dirent")
    @NotUsableInJava
    public static class data_dirent
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int virtual_address;
        public @Unsigned @OriginalName(value="uint32_t") int size;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 sensor_num; }")
    @NotUsableInJava
    public static class data_of_anon_member_of_ec_params_motion_sense_and_fifo_flush_of_anon_member_of_ec_params_motion_sense_and_info_3_of_anon_member_of_ec_params_motion_sense
    extends Struct {
        public @OriginalName(value="uint8_t") char sensor_num;
    }

    @Type(noCCodeGeneration=true, cType="enum data_formats")
    public static enum data_formats implements Enum<data_formats>,
    TypedEnum<data_formats, Integer>
    {
        DATA_FMT_DIGEST,
        DATA_FMT_DIGEST_WITH_ALGO,
        DATA_FMT_DIGEST_WITH_TYPE_AND_ALGO,
        DATA_FMT_STRING,
        DATA_FMT_HEX,
        DATA_FMT_UINT;

    }

    @Type(noCCodeGeneration=true, cType="union { struct { struct { } __empty_vmx; struct kvm_vmx_nested_state_data vmx[0]; }; struct { struct { } __empty_svm; struct kvm_svm_nested_state_data svm[0]; }; }")
    @NotUsableInJava
    public static class data_of_kvm_nested_state
    extends Union {
        public AnonDefinitions.anon_member_of_data_of_kvm_nested_state anon0;
        public AnonDefinitions.anon_member_of_data_of_kvm_nested_state anon1;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int hard; unsigned int proto; unsigned int byid; unsigned int aevent; unsigned int type; }")
    @NotUsableInJava
    public static class data_of_km_event
    extends Union {
        public @Unsigned int hard;
        public @Unsigned int proto;
        public @Unsigned int byid;
        public @Unsigned int aevent;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="enum data_source")
    public static enum data_source implements Enum<data_source>,
    TypedEnum<data_source, Integer>
    {
        CM_BATTERY_PRESENT,
        CM_NO_BATTERY,
        CM_FUEL_GAUGE,
        CM_CHARGER_STAT;

    }

    @Type(noCCodeGeneration=true, cType="struct { u8 buswidth; u8 dtr; u8 ecc; u8 __pad; enum spi_mem_data_dir dir; unsigned int nbytes; union { void *in; const void*; }; }")
    @NotUsableInJava
    public static class data_of_spi_mem_op
    extends Struct {
        public char buswidth;
        public char dtr;
        public char ecc;
        public char __pad;
        public SpiDefinitions.spi_mem_data_dir dir;
        public @Unsigned int nbytes;
        public misc.buf_of_data_of_spi_mem_op buf;
    }

    @Type(noCCodeGeneration=true, cType="struct data_chunk")
    @NotUsableInJava
    public static class data_chunk
    extends Struct {
        public @Unsigned long size;
        public @Unsigned long icg;
        public @Unsigned long dst_icg;
        public @Unsigned long src_icg;
    }

    @Type(noCCodeGeneration=true, cType="union { struct pinctrl_setting_mux mux; struct pinctrl_setting_configs configs; }")
    @NotUsableInJava
    public static class data_of_pinctrl_setting
    extends Union {
        public PinctrlDefinitions.pinctrl_setting_mux mux;
        public PinctrlDefinitions.pinctrl_setting_configs configs;
    }

    @Type(noCCodeGeneration=true, cType="union { struct pinctrl_map_mux mux; struct pinctrl_map_configs configs; }")
    @NotUsableInJava
    public static class data_of_pinctrl_map
    extends Union {
        public PinctrlDefinitions.pinctrl_map_mux mux;
        public PinctrlDefinitions.pinctrl_map_configs configs;
    }

    @Type(noCCodeGeneration=true, cType="union { struct plist_node pnode; struct pm_qos_flags_request flr; struct freq_qos_request freq; }")
    @NotUsableInJava
    public static class data_of_dev_pm_qos_request
    extends Union {
        public misc.plist_node pnode;
        public PmDefinitions.pm_qos_flags_request flr;
        public FreqDefinitions.freq_qos_request freq;
    }
}

