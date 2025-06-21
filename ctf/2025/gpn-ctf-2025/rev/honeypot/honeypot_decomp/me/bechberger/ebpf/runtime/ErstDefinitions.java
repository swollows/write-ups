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
import me.bechberger.ebpf.runtime.ApeiDefinitions;
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.PstoreDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ErstDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __erst_clear_from_storage(@Unsigned long record_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __erst_read(@Unsigned long record_id, Ptr<CperDefinitions.cper_record_header> record, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __erst_record_id_cache_add_one() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __erst_record_id_cache_compact() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __erst_write_to_storage(@Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_clear(@Unsigned long record_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void erst_clear_cache(@Unsigned long record_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_clearer(Ptr<PstoreDefinitions.pstore_record> record) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_close_pstore(Ptr<PstoreDefinitions.pstore_info> psi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_add(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_add_value(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void erst_exec_ctx_init(Ptr<ApeiDefinitions.apei_exec_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_goto(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_load_var1(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_load_var2(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_move_data(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_set_dst_address_base(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_set_src_address_base(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_skip_next_instruction_if_true(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_stall(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_stall_while_true(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_store_var1(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_subtract(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_exec_subtract_value(Ptr<ApeiDefinitions.apei_exec_context> ctx, Ptr<AcpiDefinitions.acpi_whea_header> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_get_erange(Ptr<erst_erange> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long erst_get_record_count() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_get_record_id_begin(Ptr<Integer> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void erst_get_record_id_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_get_record_id_next(Ptr<Integer> pos, Ptr<@Unsigned Long> record_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_open_pstore(Ptr<PstoreDefinitions.pstore_info> psi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long erst_read(@Unsigned long record_id, Ptr<CperDefinitions.cper_record_header> record, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="erst_read_record($arg1, $arg2, $arg3, $arg4, (const struct {\n  u8 b[16];\n}*)$arg5)")
    public static @OriginalName(value="ssize_t") long erst_read_record(@Unsigned long record_id, Ptr<CperDefinitions.cper_record_header> record, @Unsigned long buflen, @Unsigned long recordlen, Ptr< @OriginalName(value="guid_t") misc.uuid_t> creatorid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long erst_reader(Ptr<PstoreDefinitions.pstore_record> record) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="erst_write((const struct cper_record_header*)$arg1)")
    public static int erst_write(Ptr<CperDefinitions.cper_record_header> record) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int erst_writer(Ptr<PstoreDefinitions.pstore_record> record) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct erst_record_id_cache")
    @NotUsableInJava
    public static class erst_record_id_cache
    extends Struct {
        public runtime.mutex lock;
        public Ptr<@Unsigned Long> entries;
        public int len;
        public int size;
        public int refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct erst_erange")
    @NotUsableInJava
    public static class erst_erange
    extends Struct {
        public @Unsigned long base;
        public @Unsigned long size;
        public Ptr<?> vaddr;
        public @Unsigned int attr;
        public @Unsigned long timings;
    }
}

