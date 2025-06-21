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
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MipiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_attach(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_compression_mode(Ptr<mipi_dsi_device> dsi, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_compression_mode_ext(Ptr<mipi_dsi_device> dsi, boolean enable, mipi_dsi_compression_algo algo, @Unsigned int pps_selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_compression_mode_ext_multi(Ptr<mipi_dsi_multi_context> ctx, boolean enable, mipi_dsi_compression_algo algo, @Unsigned int pps_selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_create_packet($arg1, (const struct mipi_dsi_msg*)$arg2)")
    public static int mipi_dsi_create_packet(Ptr<mipi_dsi_packet> packet, Ptr<mipi_dsi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_enter_sleep_mode(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_enter_sleep_mode_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_exit_sleep_mode(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_exit_sleep_mode_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_get_display_brightness(Ptr<mipi_dsi_device> dsi, Ptr<@Unsigned Short> brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_get_display_brightness_large(Ptr<mipi_dsi_device> dsi, Ptr<@Unsigned Short> brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_get_pixel_format(Ptr<mipi_dsi_device> dsi, Ptr<Character> format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_get_power_mode(Ptr<mipi_dsi_device> dsi, Ptr<Character> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_nop(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_nop_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mipi_dsi_dcs_read(Ptr<mipi_dsi_device> dsi, char cmd, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_column_address(Ptr<mipi_dsi_device> dsi, @Unsigned short start, @Unsigned short end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_column_address_multi(Ptr<mipi_dsi_multi_context> ctx, @Unsigned short start, @Unsigned short end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_display_brightness(Ptr<mipi_dsi_device> dsi, @Unsigned short brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_display_brightness_large(Ptr<mipi_dsi_device> dsi, @Unsigned short brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_display_brightness_multi(Ptr<mipi_dsi_multi_context> ctx, @Unsigned short brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_display_off(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_display_off_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_display_on(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_display_on_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_page_address(Ptr<mipi_dsi_device> dsi, @Unsigned short start, @Unsigned short end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_page_address_multi(Ptr<mipi_dsi_multi_context> ctx, @Unsigned short start, @Unsigned short end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_pixel_format(Ptr<mipi_dsi_device> dsi, char format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_pixel_format_multi(Ptr<mipi_dsi_multi_context> ctx, char format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_tear_off(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_tear_on(Ptr<mipi_dsi_device> dsi, mipi_dsi_dcs_tear_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_tear_on_multi(Ptr<mipi_dsi_multi_context> ctx, mipi_dsi_dcs_tear_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_set_tear_scanline(Ptr<mipi_dsi_device> dsi, @Unsigned short scanline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_set_tear_scanline_multi(Ptr<mipi_dsi_multi_context> ctx, @Unsigned short scanline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_dcs_soft_reset(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dcs_soft_reset_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_dcs_write($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mipi_dsi_dcs_write(Ptr<mipi_dsi_device> dsi, char cmd, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_dcs_write_buffer($arg1, (const void*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long mipi_dsi_dcs_write_buffer(Ptr<mipi_dsi_device> dsi, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_dcs_write_buffer_chatty($arg1, (const void*)$arg2, $arg3)")
    public static int mipi_dsi_dcs_write_buffer_chatty(Ptr<mipi_dsi_device> dsi, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_dcs_write_buffer_multi($arg1, (const void*)$arg2, $arg3)")
    public static void mipi_dsi_dcs_write_buffer_multi(Ptr<mipi_dsi_multi_context> ctx, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_detach(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_device_match($arg1, (const struct device_driver*)$arg2)")
    public static int mipi_dsi_device_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_device_register_full($arg1, (const struct mipi_dsi_device_info*)$arg2)")
    public static Ptr<mipi_dsi_device> mipi_dsi_device_register_full(Ptr<mipi_dsi_host> host, Ptr<mipi_dsi_device_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mipi_dsi_device_transfer(Ptr<mipi_dsi_device> dsi, Ptr<mipi_dsi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_device_unregister(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_driver_register_full(Ptr<mipi_dsi_driver> drv, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_driver_unregister(Ptr<mipi_dsi_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_drv_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_drv_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_drv_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_generic_read($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long mipi_dsi_generic_read(Ptr<mipi_dsi_device> dsi, Ptr<?> params, @Unsigned long num_params, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_generic_write($arg1, (const void*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long mipi_dsi_generic_write(Ptr<mipi_dsi_device> dsi, Ptr<?> payload, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_generic_write_chatty($arg1, (const void*)$arg2, $arg3)")
    public static int mipi_dsi_generic_write_chatty(Ptr<mipi_dsi_device> dsi, Ptr<?> payload, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_generic_write_multi($arg1, (const void*)$arg2, $arg3)")
    public static void mipi_dsi_generic_write_multi(Ptr<mipi_dsi_multi_context> ctx, Ptr<?> payload, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_host_register(Ptr<mipi_dsi_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_host_unregister(Ptr<mipi_dsi_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mipi_dsi_packet_format_is_long(char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mipi_dsi_packet_format_is_short(char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_picture_parameter_set($arg1, (const struct drm_dsc_picture_parameter_set*)$arg2)")
    public static int mipi_dsi_picture_parameter_set(Ptr<mipi_dsi_device> dsi, Ptr<DrmDefinitions.drm_dsc_picture_parameter_set> pps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_picture_parameter_set_multi($arg1, (const struct drm_dsc_picture_parameter_set*)$arg2)")
    public static void mipi_dsi_picture_parameter_set_multi(Ptr<mipi_dsi_multi_context> ctx, Ptr<DrmDefinitions.drm_dsc_picture_parameter_set> pps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_remove_device_fn(Ptr<runtime.device> dev, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_set_maximum_return_packet_size(Ptr<mipi_dsi_device> dsi, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_shutdown_peripheral(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mipi_dsi_turn_on_peripheral(Ptr<mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mipi_dsi_turn_on_peripheral_multi(Ptr<mipi_dsi_multi_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mipi_dsi_uevent((const struct device*)$arg1, $arg2)")
    public static int mipi_dsi_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_driver")
    @NotUsableInJava
    public static class mipi_dsi_driver
    extends Struct {
        public DeviceDefinitions.device_driver driver;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
    }

    @Type(noCCodeGeneration=true, cType="enum mipi_dsi_dcs_tear_mode")
    public static enum mipi_dsi_dcs_tear_mode implements Enum<mipi_dsi_dcs_tear_mode>,
    TypedEnum<mipi_dsi_dcs_tear_mode, Integer>
    {
        MIPI_DSI_DCS_TEAR_MODE_VBLANK,
        MIPI_DSI_DCS_TEAR_MODE_VHBLANK;

    }

    @Type(noCCodeGeneration=true, cType="enum mipi_dsi_compression_algo")
    public static enum mipi_dsi_compression_algo implements Enum<mipi_dsi_compression_algo>,
    TypedEnum<mipi_dsi_compression_algo, Integer>
    {
        MIPI_DSI_COMPRESSION_DSC,
        MIPI_DSI_COMPRESSION_VENDOR;

    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_multi_context")
    @NotUsableInJava
    public static class mipi_dsi_multi_context
    extends Struct {
        public Ptr<mipi_dsi_device> dsi;
        public int accum_err;
    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_device_info")
    @NotUsableInJava
    public static class mipi_dsi_device_info
    extends Struct {
        public char @Size(value=20) [] type;
        public @Unsigned int channel;
        public Ptr<DeviceDefinitions.device_node> node;
    }

    @Type(noCCodeGeneration=true, cType="enum mipi_dsi_pixel_format")
    public static enum mipi_dsi_pixel_format implements Enum<mipi_dsi_pixel_format>,
    TypedEnum<mipi_dsi_pixel_format, Integer>
    {
        MIPI_DSI_FMT_RGB888,
        MIPI_DSI_FMT_RGB666,
        MIPI_DSI_FMT_RGB666_PACKED,
        MIPI_DSI_FMT_RGB565;

    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_device")
    @NotUsableInJava
    public static class mipi_dsi_device
    extends Struct {
        public Ptr<mipi_dsi_host> host;
        public runtime.device dev;
        public boolean attached;
        public char @Size(value=20) [] name;
        public @Unsigned int channel;
        public @Unsigned int lanes;
        public mipi_dsi_pixel_format format;
        public @Unsigned long mode_flags;
        public @Unsigned long hs_rate;
        public @Unsigned long lp_rate;
        public Ptr<DrmDefinitions.drm_dsc_config> dsc;
    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_host")
    @NotUsableInJava
    public static class mipi_dsi_host
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<mipi_dsi_host_ops> ops;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_host_ops")
    @NotUsableInJava
    public static class mipi_dsi_host_ops
    extends Struct {
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> transfer;
    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_packet")
    @NotUsableInJava
    public static class mipi_dsi_packet
    extends Struct {
        public @Unsigned long size;
        public char @Size(value=4) [] header;
        public @Unsigned long payload_length;
        public Ptr<Character> payload;
    }

    @Type(noCCodeGeneration=true, cType="struct mipi_dsi_msg")
    @NotUsableInJava
    public static class mipi_dsi_msg
    extends Struct {
        public char channel;
        public char type;
        public @Unsigned short flags;
        public @Unsigned long tx_len;
        public Ptr<?> tx_buf;
        public @Unsigned long rx_len;
        public Ptr<?> rx_buf;
    }
}

