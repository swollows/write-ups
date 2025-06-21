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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LpssDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lpss_atom_clk_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lpss_atom_clk_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lpss_deassert_reset(Ptr<lpss_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long lpss_ltr_mode_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long lpss_ltr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lpss_reg_read(Ptr<runtime.device> dev, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lpss_uart_setup(Ptr<lpss_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct lpss_device_links")
    @NotUsableInJava
    public static class lpss_device_links
    extends Struct {
        public String supplier_hid;
        public String supplier_uid;
        public String consumer_hid;
        public String consumer_uid;
        public @Unsigned int flags;
        public Ptr<DmiDefinitions.dmi_system_id> dep_missing_ids;
    }

    @Type(noCCodeGeneration=true, cType="struct lpss_private_data")
    @NotUsableInJava
    public static class lpss_private_data
    extends Struct {
        public Ptr<AcpiDefinitions.acpi_device> adev;
        public Ptr<?> mmio_base;
        public @Unsigned @OriginalName(value="resource_size_t") long mmio_size;
        public @Unsigned int fixed_clk_rate;
        public Ptr<runtime.clk> clk;
        public Ptr<lpss_device_desc> dev_desc;
        public @Unsigned int @Size(value=9) [] prv_reg_ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct lpss_device_desc")
    @NotUsableInJava
    public static class lpss_device_desc
    extends Struct {
        public @Unsigned int flags;
        public String clk_con_id;
        public @Unsigned int prv_offset;
        public @Unsigned long prv_size_override;
        public Ptr<misc.property_entry> properties;
        public Ptr<?> setup;
        public boolean resume_from_noirq;
    }

    @Type(noCCodeGeneration=true, cType="struct lpss_clk_data")
    @NotUsableInJava
    public static class lpss_clk_data
    extends Struct {
        public String name;
        public Ptr<runtime.clk> clk;
    }
}

