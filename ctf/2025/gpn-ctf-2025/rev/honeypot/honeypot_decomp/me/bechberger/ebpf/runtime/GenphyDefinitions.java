/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class GenphyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_an_config_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_an_config_eee_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_an_disable_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_aneg_done(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_baset1_an_config_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_baset1_read_lpa(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_baset1_read_status(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_check_and_restart_aneg(Ptr<PhyDefinitions.phy_device> phydev, boolean restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_config_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_eee_is_active(Ptr<PhyDefinitions.phy_device> phydev, Ptr<@Unsigned Long> adv, Ptr<@Unsigned Long> lp, Ptr<@OriginalName(value="bool") Boolean> is_enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_ethtool_get_eee(Ptr<PhyDefinitions.phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_keee> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_ethtool_set_eee(Ptr<PhyDefinitions.phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_keee> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_fast_retrain(Ptr<PhyDefinitions.phy_device> phydev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_loopback(Ptr<PhyDefinitions.phy_device> phydev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_plca_get_cfg(Ptr<PhyDefinitions.phy_device> phydev, Ptr<PhyDefinitions.phy_plca_cfg> plca_cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_plca_get_status(Ptr<PhyDefinitions.phy_device> phydev, Ptr<PhyDefinitions.phy_plca_status> plca_st) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genphy_c45_plca_set_cfg($arg1, (const struct phy_plca_cfg*)$arg2)")
    public static int genphy_c45_plca_set_cfg(Ptr<PhyDefinitions.phy_device> phydev, Ptr<PhyDefinitions.phy_plca_cfg> plca_cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_baset1_read_abilities(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_baset1_read_master_slave(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_baset1_setup_master_slave(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_read_abilities(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_read_ext_abilities(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_resume(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_setup_forced(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_pma_suspend(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_eee_abilities(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_eee_adv(Ptr<PhyDefinitions.phy_device> phydev, Ptr<@Unsigned Long> adv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_link(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_lpa(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_mdix(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_pma(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_read_status(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_restart_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c45_write_eee_adv(Ptr<PhyDefinitions.phy_device> phydev, Ptr<@Unsigned Long> adv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __genphy_config_aneg(Ptr<PhyDefinitions.phy_device> phydev, boolean changed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_aneg_done(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c37_config_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_c37_read_status(Ptr<PhyDefinitions.phy_device> phydev, Ptr<@OriginalName(value="bool") Boolean> changed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_check_and_restart_aneg(Ptr<PhyDefinitions.phy_device> phydev, boolean restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genphy_config_advert($arg1, (const long unsigned int*)$arg2)")
    public static int genphy_config_advert(Ptr<PhyDefinitions.phy_device> phydev, Ptr<@Unsigned Long> advert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_config_eee_advert(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn genphy_handle_interrupt_no_ack(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_loopback(Ptr<PhyDefinitions.phy_device> phydev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_read_abilities(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_read_lpa(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_read_master_slave(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_read_mmd_unsupported(Ptr<PhyDefinitions.phy_device> phdev, int devad, @Unsigned short regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_read_status(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_read_status_fixed(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_restart_aneg(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_resume(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_setup_forced(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_soft_reset(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_suspend(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_update_link(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genphy_write_mmd_unsupported(Ptr<PhyDefinitions.phy_device> phdev, int devnum, @Unsigned short regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }
}

