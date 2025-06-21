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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TbootDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tboot_dying_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tboot_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tboot_extended_sleep(char sleep_state, @Unsigned int val_a, @Unsigned int val_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AcpiDefinitions.acpi_table_header> tboot_get_dmar_table(Ptr<AcpiDefinitions.acpi_table_header> dmar_tbl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tboot_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tboot_log_read(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tboot_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tboot_shutdown(@Unsigned int shutdown_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tboot_sleep(char sleep_state, @Unsigned int pm1a_control, @Unsigned int pm1b_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tboot_acpi_sleep_info")
    @NotUsableInJava
    public static class tboot_acpi_sleep_info
    extends Struct {
        public tboot_acpi_generic_address pm1a_cnt_blk;
        public tboot_acpi_generic_address pm1b_cnt_blk;
        public tboot_acpi_generic_address pm1a_evt_blk;
        public tboot_acpi_generic_address pm1b_evt_blk;
        public @Unsigned short pm1a_cnt_val;
        public @Unsigned short pm1b_cnt_val;
        public @Unsigned long wakeup_vector;
        public @Unsigned int vector_width;
        public @Unsigned long kernel_s3_resume_vector;
    }

    @Type(noCCodeGeneration=true, cType="struct tboot_acpi_generic_address")
    @NotUsableInJava
    public static class tboot_acpi_generic_address
    extends Struct {
        public char space_id;
        public char bit_width;
        public char bit_offset;
        public char access_width;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct tboot_mac_region")
    @NotUsableInJava
    public static class tboot_mac_region
    extends Struct {
        public @Unsigned long start;
        public @Unsigned int size;
    }
}

