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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ElantsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_calibrate(Ptr<elants_data> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elants_i2c_do_update_firmware($arg1, (const struct firmware*)$arg2, $arg3)")
    public static int elants_i2c_do_update_firmware(Ptr<I2cDefinitions.i2c_client> client, Ptr<runtime.firmware> fw, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elants_i2c_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elants_i2c_event(Ptr<elants_data> ts, Ptr<Character> buf, @Unsigned long packet_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elants_i2c_execute_command($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, (const u8*)$arg7)")
    public static int elants_i2c_execute_command(Ptr<I2cDefinitions.i2c_client> client, Ptr<Character> cmd, @Unsigned long cmd_size, Ptr<Character> resp, @Unsigned long resp_size, int retries, String cmd_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_initialize(Ptr<elants_data> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn elants_i2c_irq(int irq, Ptr<?> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elants_i2c_mt_event(Ptr<elants_data> ts, Ptr<Character> buf, @Unsigned long packet_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void elants_i2c_power_off(Ptr<?> _data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_power_on(Ptr<elants_data> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_query_ts_info_ekth(Ptr<elants_data> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_read(Ptr<I2cDefinitions.i2c_client> client, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elants_i2c_send($arg1, (const void*)$arg2, $arg3)")
    public static int elants_i2c_send(Ptr<I2cDefinitions.i2c_client> client, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elants_i2c_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long elants_version_attribute_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> dattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct elants_version_attribute")
    @NotUsableInJava
    public static class elants_version_attribute
    extends Struct {
        public DeviceDefinitions.device_attribute dattr;
        public @Unsigned long field_offset;
        public @Unsigned long field_size;
    }

    @Type(noCCodeGeneration=true, cType="struct elants_data")
    @NotUsableInJava
    public static class elants_data
    extends Struct {
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<InputDefinitions.input_dev> input;
        public Ptr<runtime.regulator> vcc33;
        public Ptr<runtime.regulator> vccio;
        public Ptr<GpioDefinitions.gpio_desc> reset_gpio;
        public @Unsigned short fw_version;
        public char test_version;
        public char solution_version;
        public char bc_version;
        public char iap_version;
        public @Unsigned short hw_version;
        public char major_res;
        public @Unsigned int x_res;
        public @Unsigned int y_res;
        public @Unsigned int x_max;
        public @Unsigned int y_max;
        public @Unsigned int phy_x;
        public @Unsigned int phy_y;
        public misc.touchscreen_properties prop;
        public elants_state state;
        public elants_chip_id chip_id;
        public elants_iap_mode iap_mode;
        public runtime.mutex sysfs_mutex;
        public char @Size(value=4) [] cmd_resp;
        public runtime.completion cmd_done;
        public boolean keep_power_in_suspend;
        public char @Size(value=169) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="enum elants_iap_mode")
    public static enum elants_iap_mode implements Enum<elants_iap_mode>,
    TypedEnum<elants_iap_mode, Integer>
    {
        ELAN_IAP_OPERATIONAL,
        ELAN_IAP_RECOVERY;

    }

    @Type(noCCodeGeneration=true, cType="enum elants_state")
    public static enum elants_state implements Enum<elants_state>,
    TypedEnum<elants_state, Integer>
    {
        ELAN_STATE_NORMAL,
        ELAN_WAIT_QUEUE_HEADER,
        ELAN_WAIT_RECALIBRATION;

    }

    @Type(noCCodeGeneration=true, cType="enum elants_chip_id")
    public static enum elants_chip_id implements Enum<elants_chip_id>,
    TypedEnum<elants_chip_id, Integer>
    {
        EKTH3500,
        EKTF3624;

    }
}

