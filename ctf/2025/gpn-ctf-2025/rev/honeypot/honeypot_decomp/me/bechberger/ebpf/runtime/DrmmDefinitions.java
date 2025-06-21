/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class DrmmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_crtc_alloc_with_planes($arg1, $arg2, $arg3, $arg4, $arg5, (const struct drm_crtc_funcs*)$arg6, (const u8*)$arg7, $arg8_)")
    public static Ptr<?> __drmm_crtc_alloc_with_planes(Ptr<DrmDefinitions.drm_device> dev, @Unsigned long size, @Unsigned long offset, Ptr<DrmDefinitions.drm_plane> primary, Ptr<DrmDefinitions.drm_plane> cursor, Ptr<DrmDefinitions.drm_crtc_funcs> funcs, String name, Object ... param7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_crtc_init_with_planes($arg1, $arg2, $arg3, $arg4, (const struct drm_crtc_funcs*)$arg5, (const u8*)$arg6, $arg7)")
    public static int __drmm_crtc_init_with_planes(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_crtc> crtc, Ptr<DrmDefinitions.drm_plane> primary, Ptr<DrmDefinitions.drm_plane> cursor, Ptr<DrmDefinitions.drm_crtc_funcs> funcs, String name, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_encoder_alloc($arg1, $arg2, $arg3, (const struct drm_encoder_funcs*)$arg4, $arg5, (const u8*)$arg6, $arg7_)")
    public static Ptr<?> __drmm_encoder_alloc(Ptr<DrmDefinitions.drm_device> dev, @Unsigned long size, @Unsigned long offset, Ptr<DrmDefinitions.drm_encoder_funcs> funcs, int encoder_type, String name, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_encoder_init($arg1, $arg2, (const struct drm_encoder_funcs*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int __drmm_encoder_init(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_encoder> encoder, Ptr<DrmDefinitions.drm_encoder_funcs> funcs, int encoder_type, String name, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_universal_plane_alloc($arg1, $arg2, $arg3, $arg4, (const struct drm_plane_funcs*)$arg5, (const unsigned int*)$arg6, $arg7, (const long long unsigned int*)$arg8, $arg9, (const u8*)$arg10, $arg11_)")
    public static Ptr<?> __drmm_universal_plane_alloc(Ptr<DrmDefinitions.drm_device> dev, @Unsigned long size, @Unsigned long offset, @Unsigned @OriginalName(value="uint32_t") int possible_crtcs, Ptr<DrmDefinitions.drm_plane_funcs> funcs, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> formats, @Unsigned int format_count, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> format_modifiers, DrmDefinitions.drm_plane_type type2, String name, Object ... param10) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drmm_crtc_init_with_planes($arg1, $arg2, $arg3, $arg4, (const struct drm_crtc_funcs*)$arg5, (const u8*)$arg6, $arg7_)")
    public static int drmm_crtc_init_with_planes(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_crtc> crtc, Ptr<DrmDefinitions.drm_plane> primary, Ptr<DrmDefinitions.drm_plane> cursor, Ptr<DrmDefinitions.drm_crtc_funcs> funcs, String name, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_crtc_init_with_planes_cleanup(Ptr<DrmDefinitions.drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_drm_panel_bridge_release(Ptr<DrmDefinitions.drm_device> drm, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_encoder_alloc_release(Ptr<DrmDefinitions.drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drmm_encoder_init($arg1, $arg2, (const struct drm_encoder_funcs*)$arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static int drmm_encoder_init(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_encoder> encoder, Ptr<DrmDefinitions.drm_encoder_funcs> funcs, int encoder_type, String name, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drmm_mode_config_init(Ptr<DrmDefinitions.drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DrmDefinitions.drm_bridge> drmm_panel_bridge_add(Ptr<DrmDefinitions.drm_device> drm, Ptr<DrmDefinitions.drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_universal_plane_alloc_release(Ptr<DrmDefinitions.drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_add_action($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int __drmm_add_action(Ptr<DrmDefinitions.drm_device> dev, @OriginalName(value="drmres_release_t") Ptr<?> action, Ptr<?> data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drmm_add_action_or_reset($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int __drmm_add_action_or_reset(Ptr<DrmDefinitions.drm_device> dev, @OriginalName(value="drmres_release_t") Ptr<?> action, Ptr<?> data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drmm_mutex_release(Ptr<DrmDefinitions.drm_device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_add_final_kfree(Ptr<DrmDefinitions.drm_device> dev, Ptr<?> container) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_kfree(Ptr<DrmDefinitions.drm_device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> drmm_kmalloc(Ptr<DrmDefinitions.drm_device> dev, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drmm_kms_helper_poll_init(Ptr<DrmDefinitions.drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drmm_kstrdup($arg1, (const u8*)$arg2, $arg3)")
    public static String drmm_kstrdup(Ptr<DrmDefinitions.drm_device> dev, String s2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drmm_release_action(Ptr<DrmDefinitions.drm_device> dev, @OriginalName(value="drmres_release_t") Ptr<?> action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drmm_connector_hdmi_init($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct drm_connector_funcs*)$arg5, (const struct drm_connector_hdmi_funcs*)$arg6, $arg7, $arg8, $arg9, $arg10)")
    public static int drmm_connector_hdmi_init(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_connector> connector, String vendor, String product, Ptr<DrmDefinitions.drm_connector_funcs> funcs, Ptr<DrmDefinitions.drm_connector_hdmi_funcs> hdmi_funcs, int connector_type, Ptr<I2cDefinitions.i2c_adapter> ddc, @Unsigned long supported_formats, @Unsigned int max_bpc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drmm_connector_init($arg1, $arg2, (const struct drm_connector_funcs*)$arg3, $arg4, $arg5)")
    public static int drmm_connector_init(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_connector> connector, Ptr<DrmDefinitions.drm_connector_funcs> funcs, int connector_type, Ptr<I2cDefinitions.i2c_adapter> ddc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __drmm_simple_encoder_alloc(Ptr<DrmDefinitions.drm_device> dev, @Unsigned long size, @Unsigned long offset, int encoder_type) {
        throw new MethodIsBPFRelatedFunction();
    }
}

