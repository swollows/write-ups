/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MdioDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MdiobusDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_c45_modify_changed(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_c45_read(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_c45_write(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_modify(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_modify_changed(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_read(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_register(Ptr<misc.mii_bus> bus, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mdiobus_write(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mii_bus> mdiobus_alloc_size(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_c45_modify(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_c45_modify_changed(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_c45_read(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_c45_read_nested(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_c45_write(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_c45_write_nested(Ptr<misc.mii_bus> bus, int addr2, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_create_device(Ptr<misc.mii_bus> bus, Ptr<MdioDefinitions.mdio_board_info> bi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MdioDefinitions.mdio_device> mdiobus_find_device(Ptr<misc.mii_bus> bus, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdiobus_free(Ptr<misc.mii_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> mdiobus_get_phy(Ptr<misc.mii_bus> bus, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mdiobus_is_registered_device(Ptr<misc.mii_bus> bus, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_modify(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_modify_changed(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_read(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_read_nested(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_register_device(Ptr<MdioDefinitions.mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdiobus_release(Ptr<runtime.device> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> mdiobus_scan_c22(Ptr<misc.mii_bus> bus, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdiobus_unregister(Ptr<misc.mii_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_unregister_device(Ptr<MdioDefinitions.mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_write(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_write_nested(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdiobus_devres_match(Ptr<runtime.device> dev, Ptr<?> _this, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mdiobus_register_board_info((const struct mdio_board_info*)$arg1, $arg2)")
    public static int mdiobus_register_board_info(Ptr<MdioDefinitions.mdio_board_info> info2, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mdiobus_setup_mdiodev_from_board_info($arg1, (int (*)(struct mii_bus*, struct mdio_board_info*))$arg2)")
    public static void mdiobus_setup_mdiodev_from_board_info(Ptr<misc.mii_bus> bus, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mdiobus_devres")
    @NotUsableInJava
    public static class mdiobus_devres
    extends Struct {
        public Ptr<misc.mii_bus> mii;
    }
}

