/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class XenpfDefinitions {

    @Type(noCCodeGeneration=true, cType="struct xenpf_symdata")
    @NotUsableInJava
    public static class xenpf_symdata
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int namelen;
        public @Unsigned @OriginalName(value="uint32_t") int symnum;
        public @OriginalName(value="__guest_handle_char") String name;
        public @Unsigned @OriginalName(value="uint64_t") long address;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_core_parking")
    @NotUsableInJava
    public static class xenpf_core_parking
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int type;
        public @Unsigned @OriginalName(value="uint32_t") int idle_nums;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_mem_hotadd")
    @NotUsableInJava
    public static class xenpf_mem_hotadd
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long spfn;
        public @Unsigned @OriginalName(value="uint64_t") long epfn;
        public @Unsigned @OriginalName(value="uint32_t") int pxm;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_cpu_hotadd")
    @NotUsableInJava
    public static class xenpf_cpu_hotadd
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int apic_id;
        public @Unsigned @OriginalName(value="uint32_t") int acpi_id;
        public @Unsigned @OriginalName(value="uint32_t") int pxm;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_cpu_ol")
    @NotUsableInJava
    public static class xenpf_cpu_ol
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int cpuid;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_pcpuinfo")
    @NotUsableInJava
    public static class xenpf_pcpuinfo
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int xen_cpuid;
        public @Unsigned @OriginalName(value="uint32_t") int max_present;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int apic_id;
        public @Unsigned @OriginalName(value="uint32_t") int acpi_id;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_set_processor_pminfo")
    @NotUsableInJava
    public static class xenpf_set_processor_pminfo
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int id;
        public @Unsigned @OriginalName(value="uint32_t") int type;
        @InlineUnion(value=4019)
        public @InlineUnion(value=4019) XenDefinitions.xen_processor_power power;
        @InlineUnion(value=4019)
        public @InlineUnion(value=4019) XenDefinitions.xen_processor_performance perf;
        @InlineUnion(value=4019)
        public @InlineUnion(value=4019) @OriginalName(value="__guest_handle_uint32_t") Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> pdc;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_getidletime")
    @NotUsableInJava
    public static class xenpf_getidletime
    extends Struct {
        public @OriginalName(value="__guest_handle_uchar") String cpumap_bitmap;
        public @Unsigned @OriginalName(value="uint32_t") int cpumap_nr_cpus;
        public @OriginalName(value="__guest_handle_uint64_t") Ptr<@Unsigned @OriginalName(value="uint64_t") Long> idletime;
        public @Unsigned @OriginalName(value="uint64_t") long now;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_change_freq")
    @NotUsableInJava
    public static class xenpf_change_freq
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int cpu;
        public @Unsigned @OriginalName(value="uint64_t") long freq;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_enter_acpi_sleep")
    @NotUsableInJava
    public static class xenpf_enter_acpi_sleep
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short val_a;
        public @Unsigned @OriginalName(value="uint16_t") short val_b;
        public @Unsigned @OriginalName(value="uint32_t") int sleep_state;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_firmware_info")
    @NotUsableInJava
    public static class xenpf_firmware_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int type;
        public @Unsigned @OriginalName(value="uint32_t") int index;
        public UDefinitions.u_of_xenpf_firmware_info u;
    }

    @Type(noCCodeGeneration=true, cType="union xenpf_efi_info")
    @NotUsableInJava
    public static class xenpf_efi_info
    extends Union {
        public @Unsigned @OriginalName(value="uint32_t") int version;
        public misc.cfg_of_xenpf_efi_info cfg;
        public misc.vendor_of_xenpf_efi_info vendor;
        public MemDefinitions.mem_of_xenpf_efi_info mem;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_efi_runtime_call")
    @NotUsableInJava
    public static class xenpf_efi_runtime_call
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int function;
        public @Unsigned @OriginalName(value="uint32_t") int misc;
        public @Unsigned @OriginalName(value="xen_ulong_t") long status;
        public UDefinitions.u_of_xenpf_efi_runtime_call u;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_efi_guid")
    @NotUsableInJava
    public static class xenpf_efi_guid
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int data1;
        public @Unsigned @OriginalName(value="uint16_t") short data2;
        public @Unsigned @OriginalName(value="uint16_t") short data3;
        public @OriginalName(value="uint8_t") char @Size(value=8) [] data4;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_efi_time")
    @NotUsableInJava
    public static class xenpf_efi_time
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short year;
        public @OriginalName(value="uint8_t") char month;
        public @OriginalName(value="uint8_t") char day;
        public @OriginalName(value="uint8_t") char hour;
        public @OriginalName(value="uint8_t") char min;
        public @OriginalName(value="uint8_t") char sec;
        public @Unsigned @OriginalName(value="uint32_t") int ns;
        public @OriginalName(value="int16_t") short tz;
        public @OriginalName(value="uint8_t") char daylight;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_platform_quirk")
    @NotUsableInJava
    public static class xenpf_platform_quirk
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int quirk_id;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_microcode_update")
    @NotUsableInJava
    public static class xenpf_microcode_update
    extends Struct {
        public @OriginalName(value="__guest_handle_void") Ptr<?> data;
        public @Unsigned @OriginalName(value="uint32_t") int length;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_read_memtype")
    @NotUsableInJava
    public static class xenpf_read_memtype
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int reg;
        public @Unsigned @OriginalName(value="xen_pfn_t") long mfn;
        public @Unsigned @OriginalName(value="uint64_t") long nr_mfns;
        public @Unsigned @OriginalName(value="uint32_t") int type;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_del_memtype")
    @NotUsableInJava
    public static class xenpf_del_memtype
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int handle;
        public @Unsigned @OriginalName(value="uint32_t") int reg;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_add_memtype")
    @NotUsableInJava
    public static class xenpf_add_memtype
    extends Struct {
        public @Unsigned @OriginalName(value="xen_pfn_t") long mfn;
        public @Unsigned @OriginalName(value="uint64_t") long nr_mfns;
        public @Unsigned @OriginalName(value="uint32_t") int type;
        public @Unsigned @OriginalName(value="uint32_t") int handle;
        public @Unsigned @OriginalName(value="uint32_t") int reg;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_settime64")
    @NotUsableInJava
    public static class xenpf_settime64
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long secs;
        public @Unsigned @OriginalName(value="uint32_t") int nsecs;
        public @Unsigned @OriginalName(value="uint32_t") int mbz;
        public @Unsigned @OriginalName(value="uint64_t") long system_time;
    }

    @Type(noCCodeGeneration=true, cType="struct xenpf_settime32")
    @NotUsableInJava
    public static class xenpf_settime32
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int secs;
        public @Unsigned @OriginalName(value="uint32_t") int nsecs;
        public @Unsigned @OriginalName(value="uint64_t") long system_time;
    }
}

