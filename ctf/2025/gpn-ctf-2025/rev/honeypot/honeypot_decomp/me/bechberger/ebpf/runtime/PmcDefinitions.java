/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PmcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_atom_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_atom_read(int offset, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmc_dev_state_check($arg1, (const struct pmc_bit_map*)$arg2, $arg3, (const struct pmc_bit_map*)$arg4, $arg5)")
    public static void pmc_dev_state_check(@Unsigned int sts, Ptr<pmc_bit_map> sts_map, @Unsigned int fd2, Ptr<pmc_bit_map> fd_map, @Unsigned int sts_possible_false_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_dev_state_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmc_dev_state_print($arg1, $arg2, $arg3, (const struct pmc_bit_map*)$arg4, $arg5, (const struct pmc_bit_map*)$arg6)")
    public static void pmc_dev_state_print(Ptr<SeqDefinitions.seq_file> s2, int reg_index, @Unsigned int sts, Ptr<pmc_bit_map> sts_map, @Unsigned int fd2, Ptr<pmc_bit_map> fd_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_dev_state_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pmc_power_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_pss_state_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_pss_state_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pmc_s2idle_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmc_setup_dev($arg1, (const struct pci_device_id*)$arg2)")
    public static int pmc_setup_dev(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_sleep_tmr_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmc_sleep_tmr_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pmc_dev")
    @NotUsableInJava
    public static class pmc_dev
    extends Struct {
        public @Unsigned int base_addr;
        public Ptr<?> regmap;
        public Ptr<pmc_reg_map> map;
        public Ptr<runtime.dentry> dbgfs_dir;
        public boolean init;
    }

    @Type(noCCodeGeneration=true, cType="struct pmc_data")
    @NotUsableInJava
    public static class pmc_data
    extends Struct {
        public Ptr<pmc_reg_map> map;
        public Ptr<pmc_clk> clks;
    }

    @Type(noCCodeGeneration=true, cType="struct pmc_reg_map")
    @NotUsableInJava
    public static class pmc_reg_map
    extends Struct {
        public Ptr<pmc_bit_map> d3_sts_0;
        public Ptr<pmc_bit_map> d3_sts_1;
        public Ptr<pmc_bit_map> func_dis;
        public Ptr<pmc_bit_map> func_dis_2;
        public Ptr<pmc_bit_map> pss;
    }

    @Type(noCCodeGeneration=true, cType="struct pmc_bit_map")
    @NotUsableInJava
    public static class pmc_bit_map
    extends Struct {
        public String name;
        public @Unsigned int bit_mask;
    }

    @Type(noCCodeGeneration=true, cType="enum pmc_type")
    public static enum pmc_type implements Enum<pmc_type>,
    TypedEnum<pmc_type, Integer>
    {
        KVM_PMC_GP,
        KVM_PMC_FIXED;

    }

    @Type(noCCodeGeneration=true, cType="struct pmc_clk_data")
    @NotUsableInJava
    public static class pmc_clk_data
    extends Struct {
        public Ptr<?> base;
        public Ptr<pmc_clk> clks;
        public boolean critical;
    }

    @Type(noCCodeGeneration=true, cType="struct pmc_clk")
    @NotUsableInJava
    public static class pmc_clk
    extends Struct {
        public String name;
        public @Unsigned long freq;
        public String parent_name;
    }
}

