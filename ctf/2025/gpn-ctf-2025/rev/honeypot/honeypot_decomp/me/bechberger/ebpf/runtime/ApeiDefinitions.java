/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ApeiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __apei_exec_read_register(Ptr<AcpiDefinitions.acpi_whea_header> entry, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __apei_exec_run(Ptr<apei_exec_context> ctx, char action, boolean optional) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __apei_exec_write_register(Ptr<AcpiDefinitions.acpi_whea_header> entry, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_check_gar(Ptr<AcpiDefinitions.acpi_generic_address> reg, Ptr<@Unsigned Long> paddr, Ptr<@Unsigned Integer> access_bit_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_collect_resources(Ptr<apei_exec_context> ctx, Ptr<apei_resources> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apei_exec_ctx_init(Ptr<apei_exec_context> ctx, Ptr<apei_exec_ins_type> ins_table, @Unsigned int instructions, Ptr<AcpiDefinitions.acpi_whea_header> action_table, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_noop(Ptr<apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_post_unmap_gars(Ptr<apei_exec_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_pre_map_gars(Ptr<apei_exec_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_read_register(Ptr<apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_read_register_value(Ptr<apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_write_register(Ptr<apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_exec_write_register_value(Ptr<apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> apei_get_debugfs_dir() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_get_res_callback(@Unsigned long start, @Unsigned long size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_map_generic_address(Ptr<AcpiDefinitions.acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_osc_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_read(Ptr<@Unsigned Long> val, Ptr<AcpiDefinitions.acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_res_add(Ptr<ListDefinitions.list_head> res_list, @Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_res_sub(Ptr<ListDefinitions.list_head> res_list1, Ptr<ListDefinitions.list_head> res_list2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_resources_add(Ptr<apei_resources> resources, @Unsigned long start, @Unsigned long size, boolean iomem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apei_resources_fini(Ptr<apei_resources> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apei_resources_release(Ptr<apei_resources> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apei_resources_request($arg1, (const u8*)$arg2)")
    public static int apei_resources_request(Ptr<apei_resources> resources, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_resources_sub(Ptr<apei_resources> resources1, Ptr<apei_resources> resources2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_write(@Unsigned long val, Ptr<AcpiDefinitions.acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_hest_parse(@OriginalName(value="apei_hest_func_t") Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_check_mce() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_clear_mce(@Unsigned long record_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apei_mce_report_mem_error(int severity2, Ptr<CperDefinitions.cper_sec_mem_err> mem_err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long apei_read_mce(Ptr<runtime.mce> m, Ptr<@Unsigned Long> record_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_smca_report_x86_error(Ptr<CperDefinitions.cper_ia_proc_ctx> ctx_info, @Unsigned long lapic_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apei_write_mce(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct apei_res")
    @NotUsableInJava
    public static class apei_res
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long start;
        public @Unsigned long end;
    }

    @Type(noCCodeGeneration=true, cType="struct apei_resources")
    @NotUsableInJava
    public static class apei_resources
    extends Struct {
        public ListDefinitions.list_head iomem;
        public ListDefinitions.list_head ioport;
    }

    @Type(noCCodeGeneration=true, cType="struct apei_exec_ins_type")
    @NotUsableInJava
    public static class apei_exec_ins_type
    extends Struct {
        public @Unsigned int flags;
        public @OriginalName(value="apei_exec_ins_func_t") Ptr<?> run;
    }

    @Type(noCCodeGeneration=true, cType="struct apei_exec_context")
    @NotUsableInJava
    public static class apei_exec_context
    extends Struct {
        public @Unsigned int ip;
        public @Unsigned long value;
        public @Unsigned long var1;
        public @Unsigned long var2;
        public @Unsigned long src_base;
        public @Unsigned long dst_base;
        public Ptr<apei_exec_ins_type> ins_table;
        public @Unsigned int instructions;
        public Ptr<AcpiDefinitions.acpi_whea_header> action_table;
        public @Unsigned int entries;
    }
}

