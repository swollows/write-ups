/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class PnpacpiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pnpacpi_allocated_resource(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_build_resource_template(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<AcpiDefinitions.acpi_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pnpacpi_count_resources(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_encode_resources(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<AcpiDefinitions.acpi_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pnpacpi_option_resource(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_parse_allocated_resource(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnpacpi_parse_allocated_vendor(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<AcpiDefinitions.acpi_resource_vendor_typed> vendor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_parse_resource_option_data(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pnpacpi_type_resources(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_add_device(Ptr<AcpiDefinitions.acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pnpacpi_add_device_handler(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pnpacpi_can_wakeup(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_disable_resources(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_get_resources(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_resume(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_set_resources(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnpacpi_suspend(Ptr<PnpDefinitions.pnp_dev> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

