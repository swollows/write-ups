/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BacklightDefinitions;
import me.bechberger.ebpf.runtime.CeaDefinitions;
import me.bechberger.ebpf.runtime.DebugfsDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DisplayidDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.HdmiDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.KmsgDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SwitchDefinitions;
import me.bechberger.ebpf.runtime.SyncDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class DrmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_crtc_init_with_planes($arg1, $arg2, $arg3, $arg4, (const struct drm_crtc_funcs*)$arg5, (const u8*)$arg6, $arg7)")
    public static int __drm_crtc_init_with_planes(Ptr<drm_device> dev, Ptr<drm_crtc> crtc, Ptr<drm_plane> primary, Ptr<drm_plane> cursor, Ptr<drm_crtc_funcs> funcs, String name, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_encoder_init($arg1, $arg2, (const struct drm_encoder_funcs*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int __drm_encoder_init(Ptr<drm_device> dev, Ptr<drm_encoder> encoder, Ptr<drm_encoder_funcs> funcs, int encoder_type, String name, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_gem_fb_end_cpu_access(Ptr<drm_framebuffer> fb, DmaDefinitions.dma_data_direction dir, @Unsigned int num_planes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_mode_set_config_internal(Ptr<drm_mode_set> set, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_plane_get_damage_clips((const struct drm_plane_state*)$arg1)")
    public static Ptr<drm_mode_rect> __drm_plane_get_damage_clips(Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_universal_plane_alloc($arg1, $arg2, $arg3, $arg4, (const struct drm_plane_funcs*)$arg5, (const unsigned int*)$arg6, $arg7, (const long long unsigned int*)$arg8, $arg9, (const u8*)$arg10, $arg11_)")
    public static Ptr<?> __drm_universal_plane_alloc(Ptr<drm_device> dev, @Unsigned long size, @Unsigned long offset, @Unsigned @OriginalName(value="uint32_t") int possible_crtcs, Ptr<drm_plane_funcs> funcs, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> formats, @Unsigned int format_count, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> format_modifiers, drm_plane_type type2, String name, Object ... param10) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_universal_plane_init($arg1, $arg2, $arg3, (const struct drm_plane_funcs*)$arg4, (const unsigned int*)$arg5, $arg6, (const long long unsigned int*)$arg7, $arg8, (const u8*)$arg9, $arg10)")
    public static int __drm_universal_plane_init(Ptr<drm_device> dev, Ptr<drm_plane> plane, @Unsigned @OriginalName(value="uint32_t") int possible_crtcs, Ptr<drm_plane_funcs> funcs, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> formats, @Unsigned int format_count, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> format_modifiers, drm_plane_type type2, String name, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_any_plane_has_format(Ptr<drm_device> dev, @Unsigned int format, @Unsigned long modifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_async_check(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_async_commit(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> drm_atomic_helper_bridge_propagate_bus_fmt(Ptr<drm_bridge> bridge, Ptr<drm_bridge_state> bridge_state, Ptr<drm_crtc_state> crtc_state, Ptr<drm_connector_state> conn_state, @Unsigned int output_fmt, Ptr<@Unsigned Integer> num_input_fmts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_calc_timestamping_constants(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_check(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_check_crtc_primary_plane(Ptr<drm_crtc_state> crtc_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_check_modeset(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_helper_check_plane_state($arg1, (const struct drm_crtc_state*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int drm_atomic_helper_check_plane_state(Ptr<drm_plane_state> plane_state, Ptr<drm_crtc_state> crtc_state, int min_scale, int max_scale, boolean can_position, boolean can_update_disabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_check_planes(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_check_wb_connector_state(Ptr<drm_connector> connector, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_cleanup_planes(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_commit(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_cleanup_done(Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_commit_duplicated_state(Ptr<drm_atomic_state> state2, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_hw_done(Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_modeset_disables(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_modeset_enables(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_planes(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state, @Unsigned @OriginalName(value="uint32_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_planes_on_crtc(Ptr<drm_crtc_state> old_crtc_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_tail(Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_commit_tail_rpm(Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_crtc_normalize_zpos(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> crtc_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_disable_all(Ptr<drm_device> dev, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_disable_plane(Ptr<drm_plane> plane, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_disable_planes_on_crtc(Ptr<drm_crtc_state> old_crtc_state, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_atomic_state> drm_atomic_helper_duplicate_state(Ptr<drm_device> dev, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_fake_vblank(Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_page_flip(Ptr<drm_crtc> crtc, Ptr<drm_framebuffer> fb, Ptr<drm_pending_vblank_event> event2, @Unsigned @OriginalName(value="uint32_t") int flags, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_page_flip_target(Ptr<drm_crtc> crtc, Ptr<drm_framebuffer> fb, Ptr<drm_pending_vblank_event> event2, @Unsigned @OriginalName(value="uint32_t") int flags, @Unsigned @OriginalName(value="uint32_t") int target, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_prepare_planes(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_resume(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_set_config(Ptr<drm_mode_set> set, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_setup_commit(Ptr<drm_atomic_state> state2, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_shutdown(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_atomic_state> drm_atomic_helper_suspend(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_swap_state(Ptr<drm_atomic_state> state2, boolean stall) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_unprepare_planes(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_update_legacy_modeset_state(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_update_plane(Ptr<drm_plane> plane, Ptr<drm_crtc> crtc, Ptr<drm_framebuffer> fb, int crtc_x, int crtc_y, @Unsigned int crtc_w, @Unsigned int crtc_h, @Unsigned @OriginalName(value="uint32_t") int src_x, @Unsigned @OriginalName(value="uint32_t") int src_y, @Unsigned @OriginalName(value="uint32_t") int src_w, @Unsigned @OriginalName(value="uint32_t") int src_h, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_wait_for_dependencies(Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_wait_for_fences(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2, boolean pre_swap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_wait_for_flip_done(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_wait_for_vblanks(Ptr<drm_device> dev, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_normalize_zpos(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_state_zpos_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int drm_atomic_state_zpos_cmp(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_bridge_is_panel((const struct drm_bridge*)$arg1)")
    public static boolean drm_bridge_is_panel(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_can_sleep() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_connectors_enabled(Ptr<Ptr<drm_connector>> connectors, @Unsigned int connector_count, Ptr<@OriginalName(value="bool") Boolean> enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_check(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_commit(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_commit_atomic(Ptr<drm_client_dev> client, boolean active, boolean check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_commit_locked(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_create(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_dpms(Ptr<drm_client_dev> client, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_modeset_free(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_modeset_probe(Ptr<drm_client_dev> client, @Unsigned int width, @Unsigned int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_modeset_release(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_pick_crtcs(Ptr<drm_client_dev> client, Ptr<Ptr<drm_connector>> connectors, @Unsigned int connector_count, Ptr<Ptr<drm_crtc>> best_crtcs, Ptr<Ptr<drm_display_mode>> modes, int n, int width, int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_client_rotation(Ptr<drm_mode_set> modeset, Ptr<@Unsigned Integer> rotation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_client_target_preferred(Ptr<drm_device> dev, Ptr<Ptr<drm_connector>> connectors, @Unsigned int connector_count, Ptr<Ptr<drm_display_mode>> modes, Ptr<drm_client_offset> offsets, Ptr<@OriginalName(value="bool") Boolean> enabled, int width, int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long drm_compat_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_connector_pick_cmdline_mode(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_property> drm_create_scaling_filter_prop(Ptr<drm_device> dev, @Unsigned int supported_filters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_add_crc_entry(Ptr<drm_crtc> crtc, boolean has_frame, @Unsigned @OriginalName(value="uint32_t") int frame, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> crcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_crtc_check_viewport((const struct drm_crtc*)$arg1, $arg2, $arg3, (const struct drm_display_mode*)$arg4, (const struct drm_framebuffer*)$arg5)")
    public static int drm_crtc_check_viewport(Ptr<drm_crtc> crtc, int x, int y, Ptr<drm_display_mode> mode, Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_cleanup(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_fence> drm_crtc_create_fence(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_create_scaling_filter_property(Ptr<drm_crtc> crtc, @Unsigned int supported_filters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_crtc_fence_get_driver_name($arg1))")
    public static String drm_crtc_fence_get_driver_name(Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_crtc_fence_get_timeline_name($arg1))")
    public static String drm_crtc_fence_get_timeline_name(Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_force_disable(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_crtc> drm_crtc_from_index(Ptr<drm_device> dev, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_crtc_init_with_planes($arg1, $arg2, $arg3, $arg4, (const struct drm_crtc_funcs*)$arg5, (const u8*)$arg6, $arg7_)")
    public static int drm_crtc_init_with_planes(Ptr<drm_device> dev, Ptr<drm_crtc> crtc, Ptr<drm_plane> primary, Ptr<drm_plane> cursor, Ptr<drm_crtc_funcs> funcs, String name, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_register_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_unregister_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_crtc_crc_add(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_eld_sad_get((const u8*)$arg1, $arg2, $arg3)")
    public static int drm_eld_sad_get(Ptr<Character> eld, int sad_index, Ptr<CeaDefinitions.cea_sad> cta_sad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_eld_sad_set($arg1, $arg2, (const struct cea_sad*)$arg3)")
    public static int drm_eld_sad_set(Ptr<Character> eld, int sad_index, Ptr<CeaDefinitions.cea_sad> cta_sad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_encoder_cleanup(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_encoder_init($arg1, $arg2, (const struct drm_encoder_funcs*)$arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static int drm_encoder_init(Ptr<drm_device> dev, Ptr<drm_encoder> encoder, Ptr<drm_encoder_funcs> funcs, int encoder_type, String name, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_encoder_register_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_encoder_unregister_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_flip_work_cleanup(Ptr<drm_flip_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_flip_work_commit(Ptr<drm_flip_work> work, Ptr<WorkqueueDefinitions.workqueue_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_flip_work_init($arg1, (const u8*)$arg2, $arg3)")
    public static void drm_flip_work_init(Ptr<drm_flip_work> work, String name, @OriginalName(value="drm_flip_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_flip_work_queue(Ptr<drm_flip_work> work, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_afbc_min_size($arg1, (const struct drm_mode_fb_cmd2*)$arg2, $arg3)")
    public static int drm_gem_afbc_min_size(Ptr<drm_device> dev, Ptr<drm_mode_fb_cmd2> mode_cmd, Ptr<drm_afbc_framebuffer> afbc_fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_close_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_create_mmap_offset(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_create_mmap_offset_size(Ptr<drm_gem_object> obj, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long drm_gem_dma_resv_wait(Ptr<drm_file> filep, @Unsigned int handle, boolean wait_all, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_dumb_map_offset(Ptr<drm_file> file2, Ptr<drm_device> dev, @Unsigned int handle, Ptr<@Unsigned Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_evict(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_fb_afbc_init($arg1, (const struct drm_mode_fb_cmd2*)$arg2, $arg3)")
    public static int drm_gem_fb_afbc_init(Ptr<drm_device> dev, Ptr<drm_mode_fb_cmd2> mode_cmd, Ptr<drm_afbc_framebuffer> afbc_fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_fb_begin_cpu_access(Ptr<drm_framebuffer> fb, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_fb_create($arg1, $arg2, (const struct drm_mode_fb_cmd2*)$arg3)")
    public static Ptr<drm_framebuffer> drm_gem_fb_create(Ptr<drm_device> dev, Ptr<drm_file> file2, Ptr<drm_mode_fb_cmd2> mode_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_fb_create_handle(Ptr<drm_framebuffer> fb, Ptr<drm_file> file2, Ptr<@Unsigned Integer> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_fb_create_with_dirty($arg1, $arg2, (const struct drm_mode_fb_cmd2*)$arg3)")
    public static Ptr<drm_framebuffer> drm_gem_fb_create_with_dirty(Ptr<drm_device> dev, Ptr<drm_file> file2, Ptr<drm_mode_fb_cmd2> mode_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_fb_create_with_funcs($arg1, $arg2, (const struct drm_mode_fb_cmd2*)$arg3, (const struct drm_framebuffer_funcs*)$arg4)")
    public static Ptr<drm_framebuffer> drm_gem_fb_create_with_funcs(Ptr<drm_device> dev, Ptr<drm_file> file2, Ptr<drm_mode_fb_cmd2> mode_cmd, Ptr<drm_framebuffer_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_fb_destroy(Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_fb_end_cpu_access(Ptr<drm_framebuffer> fb, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_object> drm_gem_fb_get_obj(Ptr<drm_framebuffer> fb, @Unsigned int plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_fb_init_with_funcs($arg1, $arg2, $arg3, (const struct drm_mode_fb_cmd2*)$arg4, (const struct drm_framebuffer_funcs*)$arg5)")
    public static int drm_gem_fb_init_with_funcs(Ptr<drm_device> dev, Ptr<drm_framebuffer> fb, Ptr<drm_file> file2, Ptr<drm_mode_fb_cmd2> mode_cmd, Ptr<drm_framebuffer_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_fb_vmap(Ptr<drm_framebuffer> fb, Ptr<misc.iosys_map> map2, Ptr<misc.iosys_map> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_fb_vunmap(Ptr<drm_framebuffer> fb, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_flink_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_free_mmap_offset(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.page>> drm_gem_get_pages(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_handle_create(Ptr<drm_file> file_priv2, Ptr<drm_gem_object> obj, Ptr<@Unsigned Integer> handlep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_handle_create_tail(Ptr<drm_file> file_priv2, Ptr<drm_gem_object> obj, Ptr<@Unsigned Integer> handlep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_handle_delete(Ptr<drm_file> filp, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_init(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_init_release(Ptr<drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_lock(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_lock_reservations(Ptr<Ptr<drm_gem_object>> objs, int count, Ptr<misc.ww_acquire_ctx> acquire_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_lru_init(Ptr<drm_gem_lru> lru, Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_lru_move_tail(Ptr<drm_gem_lru> lru, Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_lru_move_tail_locked(Ptr<drm_gem_lru> lru, Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_lru_remove(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_lru_scan($arg1, $arg2, $arg3, (_Bool (*)(struct drm_gem_object*))$arg4)")
    public static @Unsigned long drm_gem_lru_scan(Ptr<drm_gem_lru> lru, @Unsigned int nr_to_scan, Ptr<@Unsigned Long> remaining, Ptr<?> shrink) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_mmap(Ptr<runtime.file> filp, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_mmap_obj(Ptr<drm_gem_object> obj, @Unsigned long obj_size, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_object_free(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_object_handle_put_unlocked(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_object_init(Ptr<drm_device> dev, Ptr<drm_gem_object> obj, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_object> drm_gem_object_lookup(Ptr<drm_file> filp, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_object_release(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_object_release_handle(int id, Ptr<?> ptr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_objects_lookup(Ptr<drm_file> filp, Ptr<?> bo_handles, int count, Ptr<Ptr<Ptr<drm_gem_object>>> objs_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_open_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_pin(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_pin_locked(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_print_info($arg1, $arg2, (const struct drm_gem_object*)$arg3)")
    public static void drm_gem_print_info(Ptr<drm_printer> p, @Unsigned int indent, Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_private_object_fini(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_private_object_init(Ptr<drm_device> dev, Ptr<drm_gem_object> obj, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_put_pages(Ptr<drm_gem_object> obj, Ptr<Ptr<runtime.page>> pages, boolean dirty, boolean accessed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_release(Ptr<drm_device> dev, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_unlock(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_unlock_reservations(Ptr<Ptr<drm_gem_object>> objs, int count, Ptr<misc.ww_acquire_ctx> acquire_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_unpin(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_unpin_locked(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_vm_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_vm_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_vmap(Ptr<drm_gem_object> obj, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_vmap_unlocked(Ptr<drm_gem_object> obj, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_vunmap(Ptr<drm_gem_object> obj, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_vunmap_unlocked(Ptr<drm_gem_object> obj, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_config_cleanup(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_config_init_release(Ptr<drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_config_reset(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_config_validate(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_standard_properties(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_crtc_set_obj_prop(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_cursor2_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_cursor_common(Ptr<drm_device> dev, Ptr<drm_mode_cursor2> req2, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_cursor_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_cursor_universal(Ptr<drm_crtc> crtc, Ptr<drm_mode_cursor2> req2, Ptr<drm_file> file_priv2, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getcrtc(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getencoder(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getplane(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getplane_res(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getresources(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_page_flip_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_plane_set_obj_prop(Ptr<drm_plane> plane, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_set_config_internal(Ptr<drm_mode_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_setcrtc(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_setplane(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_modeset_register_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_unregister_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_bridge> drm_panel_bridge_add(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_bridge> drm_panel_bridge_add_typed(Ptr<drm_panel> panel, @Unsigned int connector_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_connector> drm_panel_bridge_connector(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panel_bridge_remove(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_bridge_set_orientation(Ptr<drm_connector> connector, Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_plane_add_size_hints_property($arg1, (const struct drm_plane_size_hint*)$arg2, $arg3)")
    public static int drm_plane_add_size_hints_property(Ptr<drm_plane> plane, Ptr<drm_plane_size_hint> hints, int num_hints) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_plane_cleanup(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_alpha_property(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_blend_mode_property(Ptr<drm_plane> plane, @Unsigned int supported_modes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_rotation_property(Ptr<drm_plane> plane, @Unsigned int rotation, @Unsigned int supported_rotations) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_scaling_filter_property(Ptr<drm_plane> plane, @Unsigned int supported_filters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_zpos_immutable_property(Ptr<drm_plane> plane, @Unsigned int zpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_zpos_property(Ptr<drm_plane> plane, @Unsigned int zpos, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_plane_enable_fb_damage_clips(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_plane_force_disable(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_plane> drm_plane_from_index(Ptr<drm_device> dev, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_plane_get_damage_clips((const struct drm_plane_state*)$arg1)")
    public static Ptr<drm_mode_rect> drm_plane_get_damage_clips(Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_plane_get_damage_clips_count((const struct drm_plane_state*)$arg1)")
    public static @Unsigned int drm_plane_get_damage_clips_count(Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_plane_has_format(Ptr<drm_plane> plane, @Unsigned int format, @Unsigned long modifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_register_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_plane_unregister_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_rect_calc_hscale((const struct drm_rect*)$arg1, (const struct drm_rect*)$arg2, $arg3, $arg4)")
    public static int drm_rect_calc_hscale(Ptr<drm_rect> src, Ptr<drm_rect> dst, int min_hscale, int max_hscale) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_rect_calc_vscale((const struct drm_rect*)$arg1, (const struct drm_rect*)$arg2, $arg3, $arg4)")
    public static int drm_rect_calc_vscale(Ptr<drm_rect> src, Ptr<drm_rect> dst, int min_vscale, int max_vscale) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_rect_clip_scaled($arg1, $arg2, (const struct drm_rect*)$arg3)")
    public static boolean drm_rect_clip_scaled(Ptr<drm_rect> src, Ptr<drm_rect> dst, Ptr<drm_rect> clip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_rect_debug_print((const u8*)$arg1, (const struct drm_rect*)$arg2, $arg3)")
    public static void drm_rect_debug_print(String prefix, Ptr<drm_rect> r, boolean fixed_point) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_rect_intersect($arg1, (const struct drm_rect*)$arg2)")
    public static boolean drm_rect_intersect(Ptr<drm_rect> r1, Ptr<drm_rect> r2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_rect_rotate(Ptr<drm_rect> r, int width, int height, @Unsigned int rotation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_rect_rotate_inv(Ptr<drm_rect> r, int width, int height, @Unsigned int rotation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int drm_rotation_simplify(@Unsigned int rotation, @Unsigned int supported_rotations) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_universal_plane_init($arg1, $arg2, $arg3, (const struct drm_plane_funcs*)$arg4, (const unsigned int*)$arg5, $arg6, (const long long unsigned int*)$arg7, $arg8, (const u8*)$arg9, $arg10_)")
    public static int drm_universal_plane_init(Ptr<drm_device> dev, Ptr<drm_plane> plane, @Unsigned @OriginalName(value="uint32_t") int possible_crtcs, Ptr<drm_plane_funcs> funcs, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> formats, @Unsigned int format_count, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> format_modifiers, drm_plane_type type2, String name, Object ... param9) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_fb_helper_find_sizes(Ptr<drm_fb_helper> fb_helper, Ptr<drm_fb_helper_surface_size> sizes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_fb_helper_initial_config_and_unlock(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_fb_helper_restore_fbdev_mode_unlocked(Ptr<drm_fb_helper> fb_helper, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_format_info*)__drm_format_info($arg1))")
    public static Ptr<drm_format_info> __drm_format_info(@Unsigned int format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_gem_destroy_shadow_plane_state(Ptr<drm_shadow_plane_state> shadow_plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_gem_duplicate_shadow_plane_state(Ptr<drm_plane> plane, Ptr<drm_shadow_plane_state> new_shadow_plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_gem_reset_shadow_plane(Ptr<drm_plane> plane, Ptr<drm_shadow_plane_state> shadow_plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_shmem_object> __drm_gem_shmem_create(Ptr<drm_device> dev, @Unsigned long size, boolean _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_helper_update_and_validate(Ptr<drm_connector> connector, @Unsigned @OriginalName(value="uint32_t") int maxX, @Unsigned @OriginalName(value="uint32_t") int maxY, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_analog_tv_mode(Ptr<drm_device> dev, drm_connector_tv_mode tv_mode, @Unsigned long pixel_clock_hz, @Unsigned int hdisplay, @Unsigned int vdisplay, boolean interlace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_connector_commit_dpms(Ptr<drm_atomic_state> state2, Ptr<drm_connector> connector, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_connector_get_property($arg1, (const struct drm_connector_state*)$arg2, $arg3, $arg4)")
    public static int drm_atomic_connector_get_property(Ptr<drm_connector> connector, Ptr<drm_connector_state> state2, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_connector_set_property(Ptr<drm_connector> connector, Ptr<drm_connector_state> state2, Ptr<drm_file> file_priv2, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_crtc_get_property($arg1, (const struct drm_crtc_state*)$arg2, $arg3, $arg4)")
    public static int drm_atomic_crtc_get_property(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> state2, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_crtc_set_property(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> state2, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_get_property(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_check_plane_damage(Ptr<drm_atomic_state> state2, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_helper_damage_iter_init($arg1, (const struct drm_plane_state*)$arg2, (const struct drm_plane_state*)$arg3)")
    public static void drm_atomic_helper_damage_iter_init(Ptr<drm_atomic_helper_damage_iter> iter2, Ptr<drm_plane_state> old_state, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_atomic_helper_damage_iter_next(Ptr<drm_atomic_helper_damage_iter> iter2, Ptr<drm_rect> rect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_helper_damage_merged((const struct drm_plane_state*)$arg1, $arg2, $arg3)")
    public static boolean drm_atomic_helper_damage_merged(Ptr<drm_plane_state> old_state, Ptr<drm_plane_state> state2, Ptr<drm_rect> rect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_dirtyfb(Ptr<drm_framebuffer> fb, Ptr<drm_file> file_priv2, @Unsigned int flags, @Unsigned int color, Ptr<drm_clip_rect> clips, @Unsigned int num_clips) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_plane_get_property($arg1, (const struct drm_plane_state*)$arg2, $arg3, $arg4)")
    public static int drm_atomic_plane_get_property(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_plane_set_property(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2, Ptr<drm_file> file_priv2, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_set_crtc_for_connector(Ptr<drm_connector_state> conn_state, Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_set_crtc_for_plane(Ptr<drm_plane_state> plane_state, Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_set_fb_for_plane(Ptr<drm_plane_state> plane_state, Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_set_mode_for_crtc($arg1, (const struct drm_display_mode*)$arg2)")
    public static int drm_atomic_set_mode_for_crtc(Ptr<drm_crtc_state> state2, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_set_mode_prop_for_crtc(Ptr<drm_crtc_state> state2, Ptr<drm_property_blob> blob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_set_property(Ptr<drm_atomic_state> state2, Ptr<drm_file> file_priv2, Ptr<drm_mode_object> obj, Ptr<drm_property> prop, @Unsigned long prop_value, boolean async_flip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_bus_flags_from_videomode((const struct videomode*)$arg1, $arg2)")
    public static void drm_bus_flags_from_videomode(Ptr<runtime.videomode> vm, Ptr<@Unsigned Integer> bus_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_calc_timestamping_constants($arg1, (const struct drm_display_mode*)$arg2)")
    public static void drm_calc_timestamping_constants(Ptr<drm_crtc> crtc, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_buffer_addfb(Ptr<drm_client_buffer> buffer, @Unsigned int width, @Unsigned int height, @Unsigned int format, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_buffer_delete(Ptr<drm_client_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_buffer_vmap(Ptr<drm_client_buffer> buffer, Ptr<misc.iosys_map> map_copy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_buffer_vmap_local(Ptr<drm_client_buffer> buffer, Ptr<misc.iosys_map> map_copy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_buffer_vunmap(Ptr<drm_client_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_buffer_vunmap_local(Ptr<drm_client_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_debugfs_init(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_debugfs_internal_clients(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_dev_hotplug(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_dev_restore(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_dev_unregister(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_client_buffer> drm_client_framebuffer_create(Ptr<drm_client_dev> client, @Unsigned int width, @Unsigned int height, @Unsigned int format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_framebuffer_delete(Ptr<drm_client_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_client_framebuffer_flush(Ptr<drm_client_buffer> buffer, Ptr<drm_rect> rect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_client_init($arg1, $arg2, (const u8*)$arg3, (const struct drm_client_funcs*)$arg4)")
    public static int drm_client_init(Ptr<drm_device> dev, Ptr<drm_client_dev> client, String name, Ptr<drm_client_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_register(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_client_release(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_helper_detect_from_ddc(Ptr<drm_connector> connector, Ptr<drm_modeset_acquire_ctx> ctx, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_helper_get_modes(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_connector_helper_get_modes_fixed($arg1, (const struct drm_display_mode*)$arg2)")
    public static int drm_connector_helper_get_modes_fixed(Ptr<drm_connector> connector, Ptr<drm_display_mode> fixed_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_connector_helper_hpd_irq_event(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_helper_tv_get_modes(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_list_update(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_mode_valid(Ptr<drm_connector> connector, Ptr<drm_display_mode> mode, Ptr<drm_modeset_acquire_ctx> ctx, Ptr<drm_mode_status> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_core_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_crtc_accurate_vblank_count(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_arm_vblank_event(Ptr<drm_crtc> crtc, Ptr<drm_pending_vblank_event> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_crtc_get_last_vbltimestamp(Ptr<drm_crtc> crtc, Ptr<@OriginalName(value="ktime_t") Long> tvblank, boolean in_vblank_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_get_sequence_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_crtc_handle_vblank(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_crtc_helper_mode_valid_fixed($arg1, (const struct drm_display_mode*)$arg2, (const struct drm_display_mode*)$arg3)")
    public static drm_mode_status drm_crtc_helper_mode_valid_fixed(Ptr<drm_crtc> crtc, Ptr<drm_display_mode> mode, Ptr<drm_display_mode> fixed_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_crtc_mode_valid($arg1, (const struct drm_display_mode*)$arg2)")
    public static drm_mode_status drm_crtc_mode_valid(Ptr<drm_crtc> crtc, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_next_vblank_start(Ptr<drm_crtc> crtc, Ptr<@OriginalName(value="ktime_t") Long> vblanktime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_queue_sequence_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_send_vblank_event(Ptr<drm_crtc> crtc, Ptr<drm_pending_vblank_event> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_set_max_vblank_count(Ptr<drm_crtc> crtc, @Unsigned int max_vblank_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_crtc_vblank_count(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_crtc_vblank_count_and_time(Ptr<drm_crtc> crtc, Ptr<@OriginalName(value="ktime_t") Long> vblanktime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_vblank_crtc> drm_crtc_vblank_crtc(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_vblank_get(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_crtc_vblank_helper_get_vblank_timestamp(Ptr<drm_crtc> crtc, Ptr<Integer> max_error, Ptr<@OriginalName(value="ktime_t") Long> vblank_time, boolean in_vblank_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_crtc_vblank_helper_get_vblank_timestamp_internal(Ptr<drm_crtc> crtc, Ptr<Integer> max_error, Ptr<@OriginalName(value="ktime_t") Long> vblank_time, boolean in_vblank_irq, @OriginalName(value="drm_vblank_get_scanout_position_func") Ptr<?> get_scanout_position) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_vblank_off(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_vblank_on(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_crtc_vblank_on_config($arg1, (const struct drm_vblank_crtc_config*)$arg2)")
    public static void drm_crtc_vblank_on_config(Ptr<drm_crtc> crtc, Ptr<drm_vblank_crtc_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_vblank_put(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_vblank_reset(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_vblank_restore(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> drm_crtc_vblank_waitqueue(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_wait_one_vblank(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_cvt_mode(Ptr<drm_device> dev, int hdisplay, int vdisplay, int vrefresh, boolean reduced, boolean interlaced, boolean margins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_dev_alloc((const struct drm_driver*)$arg1, $arg2)")
    public static Ptr<drm_device> drm_dev_alloc(Ptr<drm_driver> driver, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_dev_enter(Ptr<drm_device> dev, Ptr<Integer> idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_dev_exit(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_dev_get(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_dev_has_vblank((const struct drm_device*)$arg1)")
    public static boolean drm_dev_has_vblank(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_dev_init($arg1, (const struct drm_driver*)$arg2, $arg3)")
    public static int drm_dev_init(Ptr<drm_device> dev, Ptr<drm_driver> driver, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_dev_init_release(Ptr<drm_device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_dev_put(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_dev_register(Ptr<drm_device> dev, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_dev_unplug(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_dev_unregister(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_display_mode_from_videomode((const struct videomode*)$arg1, $arg2)")
    public static void drm_display_mode_from_videomode(Ptr<runtime.videomode> vm, Ptr<drm_display_mode> dmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_display_mode_to_videomode((const struct drm_display_mode*)$arg1, $arg2)")
    public static void drm_display_mode_to_videomode(Ptr<drm_display_mode> dmode, Ptr<runtime.videomode> vm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int drm_driver_legacy_fb_format(Ptr<drm_device> dev, @Unsigned @OriginalName(value="uint32_t") int bpp, @Unsigned @OriginalName(value="uint32_t") int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_load_firmware($arg1))")
    public static Ptr<drm_edid> drm_edid_load_firmware(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_encoder_mode_valid($arg1, (const struct drm_display_mode*)$arg2)")
    public static drm_mode_status drm_encoder_mode_valid(Ptr<drm_encoder> encoder, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FbDefinitions.fb_info> drm_fb_helper_alloc_info(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_blank(int blank2, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_check_var(Ptr<FbDefinitions.fb_var_screeninfo> var, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_damage_area(Ptr<FbDefinitions.fb_info> info2, @Unsigned int x, @Unsigned int y, @Unsigned int width, @Unsigned int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_damage_range(Ptr<FbDefinitions.fb_info> info2, @OriginalName(value="off_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_damage_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_debug_enter(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_debug_leave(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_deferred_io(Ptr<FbDefinitions.fb_info> info2, Ptr<ListDefinitions.list_head> pagereflist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_fill_info(Ptr<FbDefinitions.fb_info> info2, Ptr<drm_fb_helper> fb_helper, Ptr<drm_fb_helper_surface_size> sizes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_helper_fill_pixel_fmt($arg1, (const struct drm_format_info*)$arg2)")
    public static void drm_fb_helper_fill_pixel_fmt(Ptr<FbDefinitions.fb_var_screeninfo> var, Ptr<drm_format_info> format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_fini(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_hotplug_event(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_init(Ptr<drm_device> dev, Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_initial_config(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_ioctl(Ptr<FbDefinitions.fb_info> info2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_lastclose(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_pan_display(Ptr<FbDefinitions.fb_var_screeninfo> var, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_helper_prepare($arg1, $arg2, $arg3, (const struct drm_fb_helper_funcs*)$arg4)")
    public static void drm_fb_helper_prepare(Ptr<drm_device> dev, Ptr<drm_fb_helper> helper, @Unsigned int preferred_bpp, Ptr<drm_fb_helper_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_release_info(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_restore_fbdev_mode_unlocked(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_restore_work_fn(Ptr<misc.work_struct> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_resume_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_set_par(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_set_suspend(Ptr<drm_fb_helper> fb_helper, boolean suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_set_suspend_unlocked(Ptr<drm_fb_helper> fb_helper, boolean suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_setcmap(Ptr<FbDefinitions.fb_cmap> cmap, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fb_helper_single_fb_probe(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_sysrq(char dummy1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_unprepare(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_helper_unregister_info(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fb_release(Ptr<drm_file> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_format_info_block_height((const struct drm_format_info*)$arg1, $arg2)")
    public static @Unsigned int drm_format_info_block_height(Ptr<drm_format_info> info2, int plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_format_info_block_width((const struct drm_format_info*)$arg1, $arg2)")
    public static @Unsigned int drm_format_info_block_width(Ptr<drm_format_info> info2, int plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_format_info_bpp((const struct drm_format_info*)$arg1, $arg2)")
    public static @Unsigned int drm_format_info_bpp(Ptr<drm_format_info> info2, int plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_format_info_min_pitch((const struct drm_format_info*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="uint64_t") long drm_format_info_min_pitch(Ptr<drm_format_info> info2, int plane, @Unsigned int buffer_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_framebuffer_check_src_coords($arg1, $arg2, $arg3, $arg4, (const struct drm_framebuffer*)$arg5)")
    public static int drm_framebuffer_check_src_coords(@Unsigned @OriginalName(value="uint32_t") int src_x, @Unsigned @OriginalName(value="uint32_t") int src_y, @Unsigned @OriginalName(value="uint32_t") int src_w, @Unsigned @OriginalName(value="uint32_t") int src_h, Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_framebuffer_cleanup(Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_framebuffer_debugfs_init(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_framebuffer_free(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_framebuffer_info(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_framebuffer_init($arg1, $arg2, (const struct drm_framebuffer_funcs*)$arg3)")
    public static int drm_framebuffer_init(Ptr<drm_device> dev, Ptr<drm_framebuffer> fb, Ptr<drm_framebuffer_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_framebuffer> drm_framebuffer_lookup(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, @Unsigned @OriginalName(value="uint32_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_framebuffer_print_info($arg1, $arg2, (const struct drm_framebuffer*)$arg3)")
    public static void drm_framebuffer_print_info(Ptr<drm_printer> p, @Unsigned int indent, Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_framebuffer_remove(Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_framebuffer_unregister_private(Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_begin_shadow_fb_access(Ptr<drm_plane> plane, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_destroy_shadow_plane_state(Ptr<drm_plane> plane, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_plane_state> drm_gem_duplicate_shadow_plane_state(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_end_shadow_fb_access(Ptr<drm_plane> plane, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_plane_helper_prepare_fb(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_reset_shadow_plane(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_shmem_object> drm_gem_shmem_create(Ptr<drm_device> dev, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_dumb_create(Ptr<drm_file> file2, Ptr<drm_device> dev, Ptr<drm_mode_create_dumb> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int drm_gem_shmem_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_free(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_get_pages(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> drm_gem_shmem_get_pages_sgt(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> drm_gem_shmem_get_sg_table(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_madvise(Ptr<drm_gem_shmem_object> shmem, int madv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_mmap(Ptr<drm_gem_shmem_object> shmem, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_object_free(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> drm_gem_shmem_object_get_sg_table(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_object_mmap(Ptr<drm_gem_object> obj, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_object_pin(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_shmem_object_print_info($arg1, $arg2, (const struct drm_gem_object*)$arg3)")
    public static void drm_gem_shmem_object_print_info(Ptr<drm_printer> p, @Unsigned int indent, Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_object_unpin(Ptr<drm_gem_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_object_vmap(Ptr<drm_gem_object> obj, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_object_vunmap(Ptr<drm_gem_object> obj, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_pin(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_pin_locked(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_object> drm_gem_shmem_prime_import_sg_table(Ptr<drm_device> dev, Ptr<DmaDefinitions.dma_buf_attachment> attach, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gem_shmem_print_info((const struct drm_gem_shmem_object*)$arg1, $arg2, $arg3)")
    public static void drm_gem_shmem_print_info(Ptr<drm_gem_shmem_object> shmem, Ptr<drm_printer> p, @Unsigned int indent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_purge(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_put_pages(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_unpin(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_unpin_locked(Ptr<drm_gem_shmem_object> shmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_vm_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_vm_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_shmem_vmap(Ptr<drm_gem_shmem_object> shmem, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_shmem_vunmap(Ptr<drm_gem_shmem_object> shmem, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_simple_kms_begin_shadow_fb_access(Ptr<drm_simple_display_pipe> pipe2, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_simple_kms_destroy_shadow_plane_state(Ptr<drm_simple_display_pipe> pipe2, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_plane_state> drm_gem_simple_kms_duplicate_shadow_plane_state(Ptr<drm_simple_display_pipe> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_simple_kms_end_shadow_fb_access(Ptr<drm_simple_display_pipe> pipe2, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_simple_kms_reset_shadow_plane(Ptr<drm_simple_display_pipe> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_format_info*)drm_get_format_info($arg1, (const struct drm_mode_fb_cmd2*)$arg2))")
    public static Ptr<drm_format_info> drm_get_format_info(Ptr<drm_device> dev, Ptr<drm_mode_fb_cmd2> mode_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_mode_status_name($arg1))")
    public static String drm_get_mode_status_name(drm_mode_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_get_panel_orientation_quirk(int width, int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_gtf_mode(Ptr<drm_device> dev, int hdisplay, int vdisplay, int vrefresh, boolean interlaced, int margins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_gtf_mode_complex(Ptr<drm_device> dev, int hdisplay, int vdisplay, int vrefresh, boolean interlaced, int margins, int GTF_M, int GTF_2C, int GTF_K, int GTF_2J) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_handle_vblank(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_handle_vblank_events(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_helper_hpd_irq_event(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_helper_probe_detect(Ptr<drm_connector> connector, Ptr<drm_modeset_acquire_ctx> ctx, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static drm_connector_status drm_helper_probe_detect_ctx(Ptr<drm_connector> connector, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_helper_probe_single_connector_modes(Ptr<drm_connector> connector, @Unsigned @OriginalName(value="uint32_t") int maxX, @Unsigned @OriginalName(value="uint32_t") int maxY) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_internal_framebuffer_create($arg1, (const struct drm_mode_fb_cmd2*)$arg2, $arg3)")
    public static Ptr<drm_framebuffer> drm_internal_framebuffer_create(Ptr<drm_device> dev, Ptr<drm_mode_fb_cmd2> r, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_connector_hotplug_event(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_disable_hpd(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_hotplug_event(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_kms_helper_is_poll_worker() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_poll_disable(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_poll_enable(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_poll_fini(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_poll_init(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_poll_init_release(Ptr<drm_device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_kms_helper_poll_reschedule(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_managed_release(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_minor> drm_minor_acquire(Ptr<runtime.xarray> minor_xa, @Unsigned int minor_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_minor_alloc(Ptr<drm_device> dev, drm_minor_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_minor_alloc_release(Ptr<drm_device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_minor_register(Ptr<drm_device> dev, drm_minor_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_minor_release(Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_minor_unregister(Ptr<drm_device> dev, drm_minor_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_addfb(Ptr<drm_device> dev, Ptr<drm_mode_fb_cmd> or, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_addfb2(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_addfb2_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_addfb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_atomic_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_closefb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_compare($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int drm_mode_compare(Ptr<?> priv, Ptr<ListDefinitions.list_head> lh_a, Ptr<ListDefinitions.list_head> lh_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_convert_to_umode($arg1, (const struct drm_display_mode*)$arg2)")
    public static void drm_mode_convert_to_umode(Ptr<drm_mode_modeinfo> out, Ptr<drm_display_mode> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_convert_umode($arg1, $arg2, (const struct drm_mode_modeinfo*)$arg3)")
    public static int drm_mode_convert_umode(Ptr<drm_device> dev, Ptr<drm_display_mode> out, Ptr<drm_mode_modeinfo> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_copy($arg1, (const struct drm_display_mode*)$arg2)")
    public static void drm_mode_copy(Ptr<drm_display_mode> dst, Ptr<drm_display_mode> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_mode_create(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_mode_create_from_cmdline_mode(Ptr<drm_device> dev, Ptr<drm_cmdline_mode> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_createblob_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_debug_printmodeline((const struct drm_display_mode*)$arg1)")
    public static void drm_mode_debug_printmodeline(Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_destroy(Ptr<drm_device> dev, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_destroyblob_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_dirtyfb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_duplicate($arg1, (const struct drm_display_mode*)$arg2)")
    public static Ptr<drm_display_mode> drm_mode_duplicate(Ptr<drm_device> dev, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_equal((const struct drm_display_mode*)$arg1, (const struct drm_display_mode*)$arg2)")
    public static boolean drm_mode_equal(Ptr<drm_display_mode> mode1, Ptr<drm_display_mode> mode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_equal_no_clocks((const struct drm_display_mode*)$arg1, (const struct drm_display_mode*)$arg2)")
    public static boolean drm_mode_equal_no_clocks(Ptr<drm_display_mode> mode1, Ptr<drm_display_mode> mode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_equal_no_clocks_no_stereo((const struct drm_display_mode*)$arg1, (const struct drm_display_mode*)$arg2)")
    public static boolean drm_mode_equal_no_clocks_no_stereo(Ptr<drm_display_mode> mode1, Ptr<drm_display_mode> mode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_get_hv_timing((const struct drm_display_mode*)$arg1, $arg2, $arg3)")
    public static void drm_mode_get_hv_timing(Ptr<drm_display_mode> mode, Ptr<Integer> hdisplay, Ptr<Integer> vdisplay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getblob_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getfb(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getfb2_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getproperty_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_init($arg1, (const struct drm_display_mode*)$arg2)")
    public static void drm_mode_init(Ptr<drm_display_mode> dst, Ptr<drm_display_mode> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_is_420((const struct drm_display_info*)$arg1, (const struct drm_display_mode*)$arg2)")
    public static boolean drm_mode_is_420(Ptr<drm_display_info> display, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_is_420_also((const struct drm_display_info*)$arg1, (const struct drm_display_mode*)$arg2)")
    public static boolean drm_mode_is_420_also(Ptr<drm_display_info> display, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_is_420_only((const struct drm_display_info*)$arg1, (const struct drm_display_mode*)$arg2)")
    public static boolean drm_mode_is_420_only(Ptr<drm_display_info> display, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int drm_mode_legacy_fb_format(@Unsigned @OriginalName(value="uint32_t") int bpp, @Unsigned @OriginalName(value="uint32_t") int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_match((const struct drm_display_mode*)$arg1, (const struct drm_display_mode*)$arg2, $arg3)")
    public static boolean drm_mode_match(Ptr<drm_display_mode> mode1, Ptr<drm_display_mode> mode2, @Unsigned int match_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_parse_cmdline_extra((const u8*)$arg1, $arg2, $arg3, (const struct drm_connector*)$arg4, $arg5)")
    public static int drm_mode_parse_cmdline_extra(String str, int length, boolean freestanding, Ptr<drm_connector> connector, Ptr<drm_cmdline_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_parse_cmdline_named_mode((const u8*)$arg1, $arg2, $arg3)")
    public static int drm_mode_parse_cmdline_named_mode(String name, @Unsigned int name_end, Ptr<drm_cmdline_mode> cmdline_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_parse_command_line_for_connector((const u8*)$arg1, (const struct drm_connector*)$arg2, $arg3)")
    public static boolean drm_mode_parse_command_line_for_connector(String mode_option, Ptr<drm_connector> connector, Ptr<drm_cmdline_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_parse_panel_orientation((const u8*)$arg1, $arg2)")
    public static int drm_mode_parse_panel_orientation(String delim, Ptr<drm_cmdline_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_probed_add(Ptr<drm_connector> connector, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_prune_invalid(Ptr<drm_device> dev, Ptr<ListDefinitions.list_head> mode_list, boolean verbose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_rmfb(Ptr<drm_device> dev, @Unsigned int fb_id, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_rmfb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_rmfb_work_fn(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_set_crtcinfo(Ptr<drm_display_mode> p, int adjust_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_set_name(Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_sort(Ptr<ListDefinitions.list_head> mode_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_validate_driver($arg1, (const struct drm_display_mode*)$arg2)")
    public static drm_mode_status drm_mode_validate_driver(Ptr<drm_device> dev, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_validate_size((const struct drm_display_mode*)$arg1, $arg2, $arg3)")
    public static drm_mode_status drm_mode_validate_size(Ptr<drm_display_mode> mode, int maxX, int maxY) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_validate_ycbcr420((const struct drm_display_mode*)$arg1, $arg2)")
    public static drm_mode_status drm_mode_validate_ycbcr420(Ptr<drm_display_mode> mode, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_vrefresh((const struct drm_display_mode*)$arg1)")
    public static int drm_mode_vrefresh(Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_pci_set_busid(Ptr<drm_device> dev, Ptr<drm_master> master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_add_enum($arg1, $arg2, (const u8*)$arg3)")
    public static int drm_property_add_enum(Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long value, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_property_blob> drm_property_blob_get(Ptr<drm_property_blob> blob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_property_blob_put(Ptr<drm_property_blob> blob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_property_change_valid_get(Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long value, Ptr<Ptr<drm_mode_object>> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_property_change_valid_put(Ptr<drm_property> property2, Ptr<drm_mode_object> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<drm_property> drm_property_create(Ptr<drm_device> dev, @Unsigned int flags, String name, int num_values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_bitmask($arg1, $arg2, (const u8*)$arg3, (const struct drm_prop_enum_list*)$arg4, $arg5, $arg6)")
    public static Ptr<drm_property> drm_property_create_bitmask(Ptr<drm_device> dev, @Unsigned int flags, String name, Ptr<drm_prop_enum_list> props, int num_props, @Unsigned @OriginalName(value="uint64_t") long supported_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_blob($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<drm_property_blob> drm_property_create_blob(Ptr<drm_device> dev, @Unsigned long length, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_bool($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<drm_property> drm_property_create_bool(Ptr<drm_device> dev, @Unsigned int flags, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_enum($arg1, $arg2, (const u8*)$arg3, (const struct drm_prop_enum_list*)$arg4, $arg5)")
    public static Ptr<drm_property> drm_property_create_enum(Ptr<drm_device> dev, @Unsigned int flags, String name, Ptr<drm_prop_enum_list> props, int num_values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_object($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<drm_property> drm_property_create_object(Ptr<drm_device> dev, @Unsigned int flags, String name, @Unsigned @OriginalName(value="uint32_t") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_range($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static Ptr<drm_property> drm_property_create_range(Ptr<drm_device> dev, @Unsigned int flags, String name, @Unsigned @OriginalName(value="uint64_t") long min, @Unsigned @OriginalName(value="uint64_t") long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_create_signed_range($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static Ptr<drm_property> drm_property_create_signed_range(Ptr<drm_device> dev, @Unsigned int flags, String name, @OriginalName(value="int64_t") long min, @OriginalName(value="int64_t") long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_property_destroy(Ptr<drm_device> dev, Ptr<drm_property> property2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_property_destroy_user_blobs(Ptr<drm_device> dev, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_property_free_blob(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_property_blob> drm_property_lookup_blob(Ptr<drm_device> dev, @Unsigned @OriginalName(value="uint32_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_property_replace_blob(Ptr<Ptr<drm_property_blob>> blob, Ptr<drm_property_blob> new_blob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_property_replace_blob_from_id(Ptr<drm_device> dev, Ptr<Ptr<drm_property_blob>> blob, @Unsigned @OriginalName(value="uint64_t") long blob_id, @OriginalName(value="ssize_t") long expected_size, @OriginalName(value="ssize_t") long expected_elem_size, Ptr<@OriginalName(value="bool") Boolean> replaced) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_property_replace_global_blob($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int drm_property_replace_global_blob(Ptr<drm_device> dev, Ptr<Ptr<drm_property_blob>> replace, @Unsigned long length, Ptr<?> data, Ptr<drm_mode_object> obj_holds_id, Ptr<drm_property> prop_holds_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_put_dev(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_queue_vblank_event(Ptr<drm_device> dev, @Unsigned int pipe2, @Unsigned long req_seq, Ptr<drm_wait_vblank> vblwait, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_set_preferred_mode(Ptr<drm_connector> connector, int hpref, int vpref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_setup_crtcs_fb(Ptr<drm_fb_helper> fb_helper) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_stub_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_update_vblank_count(Ptr<drm_device> dev, @Unsigned int pipe2, boolean in_vblank_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_vblank_count(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_vblank_count_and_time(Ptr<drm_device> dev, @Unsigned int pipe2, Ptr<@OriginalName(value="ktime_t") Long> vblanktime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_disable_and_save(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vblank_enable(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vblank_get(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vblank_init(Ptr<drm_device> dev, @Unsigned int num_crtcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_init_release(Ptr<drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_put(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_restore(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_wait_one_vblank(Ptr<drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_wait_vblank_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_bridge_duplicate_state(Ptr<drm_bridge> bridge, Ptr<drm_bridge_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_bridge_reset(Ptr<drm_bridge> bridge, Ptr<drm_bridge_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_connector_destroy_state(Ptr<drm_connector_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_connector_duplicate_state(Ptr<drm_connector> connector, Ptr<drm_connector_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_connector_reset(Ptr<drm_connector> connector, Ptr<drm_connector_state> conn_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_connector_state_reset(Ptr<drm_connector_state> conn_state, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_crtc_destroy_state(Ptr<drm_crtc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_crtc_duplicate_state(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_crtc_reset(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> crtc_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_crtc_state_reset(Ptr<drm_crtc_state> crtc_state, Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_atomic_helper_disable_plane(Ptr<drm_plane> plane, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_plane_destroy_state(Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_plane_duplicate_state(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_plane_reset(Ptr<drm_plane> plane, Ptr<drm_plane_state> plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_plane_state_reset(Ptr<drm_plane_state> plane_state, Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_helper_private_obj_duplicate_state(Ptr<drm_private_obj> obj, Ptr<drm_private_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_atomic_helper_set_config(Ptr<drm_mode_set> set, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_atomic_state_free(Ptr<runtime.kref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_connector_init($arg1, $arg2, (const struct drm_connector_funcs*)$arg3, $arg4, $arg5)")
    public static int __drm_connector_init(Ptr<drm_device> dev, Ptr<drm_connector> connector, Ptr<drm_connector_funcs> funcs, int connector_type, Ptr<I2cDefinitions.i2c_adapter> ddc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_connector_put_safe(Ptr<drm_connector> conn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_crtc_commit_free(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_dev_dbg($arg1, (const struct device*)$arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void __drm_dev_dbg(Ptr<runtime._ddebug> desc, Ptr<runtime.device> dev, drm_debug_category category, String format, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_dev_vprintk((const struct device*)$arg1, (const u8*)$arg2, (const void*)$arg3, (const u8*)$arg4, $arg5)")
    public static void __drm_dev_vprintk(Ptr<runtime.device> dev, String level, Ptr<?> origin, String prefix, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)__drm_edid_iter_next($arg1))")
    public static Ptr<?> __drm_edid_iter_next(Ptr<drm_edid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_err((const u8*)$arg1, $arg2_)")
    public static void __drm_err(String format, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_printfn_coredump(Ptr<drm_printer> p, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_printfn_dbg(Ptr<drm_printer> p, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_printfn_err(Ptr<drm_printer> p, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_printfn_info(Ptr<drm_printer> p, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_printfn_seq_file(Ptr<drm_printer> p, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_puts_coredump($arg1, (const u8*)$arg2)")
    public static void __drm_puts_coredump(Ptr<drm_printer> p, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_puts_seq_file($arg1, (const u8*)$arg2)")
    public static void __drm_puts_seq_file(Ptr<drm_printer> p, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_state_dump(Ptr<drm_device> dev, Ptr<drm_printer> p, boolean take_locks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.edid> _drm_do_get_edid(Ptr<drm_connector> connector, Ptr<?> read_block, Ptr<?> context2, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)_drm_edid_alloc((const void*)$arg1, $arg2))")
    public static Ptr<drm_edid> _drm_edid_alloc(Ptr<?> edid2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_drm_edid_connector_add_modes($arg1, (const struct drm_edid*)$arg2)")
    public static int _drm_edid_connector_add_modes(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_drm_edid_connector_property_update($arg1, (const struct drm_edid*)$arg2)")
    public static int _drm_edid_connector_property_update(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_drm_edid_to_sad((const struct drm_edid*)$arg1, $arg2)")
    public static int _drm_edid_to_sad(Ptr<drm_edid> drm_edid2, Ptr<Ptr<CeaDefinitions.cea_sad>> psads) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean _drm_lease_held(Ptr<drm_file> file_priv2, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _drm_lease_revoke(Ptr<drm_master> top) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_add_edid_modes(Ptr<drm_connector> connector, Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_add_modes_noedid(Ptr<drm_connector> connector, int hdisplay, int vdisplay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_add_affected_connectors(Ptr<drm_atomic_state> state2, Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_add_affected_planes(Ptr<drm_atomic_state> state2, Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_add_encoder_bridges(Ptr<drm_atomic_state> state2, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_bridge_call_post_disable(Ptr<drm_bridge> bridge, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_bridge_call_pre_enable(Ptr<drm_bridge> bridge, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_bridge_chain_check(Ptr<drm_bridge> bridge, Ptr<drm_crtc_state> crtc_state, Ptr<drm_connector_state> conn_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_bridge_chain_disable(Ptr<drm_bridge> bridge, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_bridge_chain_enable(Ptr<drm_bridge> bridge, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_bridge_chain_post_disable(Ptr<drm_bridge> bridge, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_bridge_chain_pre_enable(Ptr<drm_bridge> bridge, Ptr<drm_atomic_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_check_only(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_commit(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_connector_check(Ptr<drm_connector> connector, Ptr<drm_connector_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_connector_print_state($arg1, (const struct drm_connector_state*)$arg2)")
    public static void drm_atomic_connector_print_state(Ptr<drm_printer> p, Ptr<drm_connector_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_crtc_check((const struct drm_crtc_state*)$arg1, (const struct drm_crtc_state*)$arg2)")
    public static int drm_atomic_crtc_check(Ptr<drm_crtc_state> old_crtc_state, Ptr<drm_crtc_state> new_crtc_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_crtc_print_state($arg1, (const struct drm_crtc_state*)$arg2)")
    public static void drm_atomic_crtc_print_state(Ptr<drm_printer> p, Ptr<drm_crtc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_debugfs_init(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_bridge_state> drm_atomic_get_bridge_state(Ptr<drm_atomic_state> state2, Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_connector_state> drm_atomic_get_connector_state(Ptr<drm_atomic_state> state2, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_crtc_state> drm_atomic_get_crtc_state(Ptr<drm_atomic_state> state2, Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_get_new_bridge_state((const struct drm_atomic_state*)$arg1, $arg2)")
    public static Ptr<drm_bridge_state> drm_atomic_get_new_bridge_state(Ptr<drm_atomic_state> state2, Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_get_new_connector_for_encoder((const struct drm_atomic_state*)$arg1, $arg2)")
    public static Ptr<drm_connector> drm_atomic_get_new_connector_for_encoder(Ptr<drm_atomic_state> state2, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_crtc> drm_atomic_get_new_crtc_for_encoder(Ptr<drm_atomic_state> state2, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_get_new_private_obj_state((const struct drm_atomic_state*)$arg1, $arg2)")
    public static Ptr<drm_private_state> drm_atomic_get_new_private_obj_state(Ptr<drm_atomic_state> state2, Ptr<drm_private_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_get_old_bridge_state((const struct drm_atomic_state*)$arg1, $arg2)")
    public static Ptr<drm_bridge_state> drm_atomic_get_old_bridge_state(Ptr<drm_atomic_state> state2, Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_get_old_connector_for_encoder((const struct drm_atomic_state*)$arg1, $arg2)")
    public static Ptr<drm_connector> drm_atomic_get_old_connector_for_encoder(Ptr<drm_atomic_state> state2, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_crtc> drm_atomic_get_old_crtc_for_encoder(Ptr<drm_atomic_state> state2, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_get_old_private_obj_state((const struct drm_atomic_state*)$arg1, $arg2)")
    public static Ptr<drm_private_state> drm_atomic_get_old_private_obj_state(Ptr<drm_atomic_state> state2, Ptr<drm_private_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_plane_state> drm_atomic_get_plane_state(Ptr<drm_atomic_state> state2, Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_private_state> drm_atomic_get_private_obj_state(Ptr<drm_atomic_state> state2, Ptr<drm_private_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_bridge_destroy_state(Ptr<drm_bridge> bridge, Ptr<drm_bridge_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_bridge_state> drm_atomic_helper_bridge_duplicate_state(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_bridge_state> drm_atomic_helper_bridge_reset(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_connector_destroy_state(Ptr<drm_connector> connector, Ptr<drm_connector_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_connector_state> drm_atomic_helper_connector_duplicate_state(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_connector_reset(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_helper_connector_tv_check(Ptr<drm_connector> connector, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_connector_tv_margins_reset(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_connector_tv_reset(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_crtc_destroy_state(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_crtc_state> drm_atomic_helper_crtc_duplicate_state(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_crtc_reset(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_plane_destroy_state(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_plane_state> drm_atomic_helper_plane_duplicate_state(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_helper_plane_reset(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_nonblocking_commit(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_plane_check((const struct drm_plane_state*)$arg1, (const struct drm_plane_state*)$arg2)")
    public static int drm_atomic_plane_check(Ptr<drm_plane_state> old_plane_state, Ptr<drm_plane_state> new_plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_plane_print_state($arg1, (const struct drm_plane_state*)$arg2)")
    public static void drm_atomic_plane_print_state(Ptr<drm_printer> p, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_print_new_state((const struct drm_atomic_state*)$arg1, $arg2)")
    public static void drm_atomic_print_new_state(Ptr<drm_atomic_state> state2, Ptr<drm_printer> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_private_obj_fini(Ptr<drm_private_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_atomic_private_obj_init($arg1, $arg2, $arg3, (const struct drm_private_state_funcs*)$arg4)")
    public static void drm_atomic_private_obj_init(Ptr<drm_device> dev, Ptr<drm_private_obj> obj, Ptr<drm_private_state> state2, Ptr<drm_private_state_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_atomic_state> drm_atomic_state_alloc(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_state_clear(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_state_default_clear(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_atomic_state_default_release(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_atomic_state_init(Ptr<drm_device> dev, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_av_sync_delay($arg1, (const struct drm_display_mode*)$arg2)")
    public static int drm_av_sync_delay(Ptr<drm_connector> connector, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_add(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_atomic_destroy_priv_state(Ptr<drm_private_obj> obj, Ptr<drm_private_state> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_private_state> drm_bridge_atomic_duplicate_priv_state(Ptr<drm_private_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_bridge_attach(Ptr<drm_encoder> encoder, Ptr<drm_bridge> bridge, Ptr<drm_bridge> previous, drm_bridge_attach_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_bridge_chain_mode_set($arg1, (const struct drm_display_mode*)$arg2, (const struct drm_display_mode*)$arg3)")
    public static void drm_bridge_chain_mode_set(Ptr<drm_bridge> bridge, Ptr<drm_display_mode> mode, Ptr<drm_display_mode> adjusted_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_bridge_chain_mode_valid($arg1, (const struct drm_display_info*)$arg2, (const struct drm_display_mode*)$arg3)")
    public static drm_mode_status drm_bridge_chain_mode_valid(Ptr<drm_bridge> bridge, Ptr<drm_display_info> info2, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_detach(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static drm_connector_status drm_bridge_detect(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_bridge_edid_read($arg1, $arg2))")
    public static Ptr<drm_edid> drm_bridge_edid_read(Ptr<drm_bridge> bridge, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_bridge_get_modes(Ptr<drm_bridge> bridge, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_hpd_disable(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_bridge_hpd_enable($arg1, (void (*)(void*, enum drm_connector_status))$arg2, $arg3)")
    public static void drm_bridge_hpd_enable(Ptr<drm_bridge> bridge, Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_hpd_notify(Ptr<drm_bridge> bridge, drm_connector_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_remove(Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_bridge_remove_void(Ptr<?> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_clients_info(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_connector_atomic_hdr_metadata_equal(Ptr<drm_connector_state> old_state, Ptr<drm_connector_state> new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_broadcast_rgb_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_colorspace_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_content_type_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_attach_dp_subconnector_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_attach_edid_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_encoder(Ptr<drm_connector> connector, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_hdr_output_metadata_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_max_bpc_property(Ptr<drm_connector> connector, int min, int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_attach_privacy_screen_properties(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_attach_privacy_screen_provider(Ptr<drm_connector> connector, Ptr<drm_privacy_screen> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_scaling_mode_property(Ptr<drm_connector> connector, @Unsigned int scaling_mode_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_attach_tv_margin_properties(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_attach_vrr_capable_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_cleanup(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_cleanup_action(Ptr<drm_device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_create_privacy_screen_properties(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_create_standard_properties(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_connector> drm_connector_find_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_free(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_free_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_get_cmdline_mode(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_connector_has_possible_encoder(Ptr<drm_connector> connector, Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_ida_destroy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_ida_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_connector_init($arg1, $arg2, (const struct drm_connector_funcs*)$arg3, $arg4)")
    public static int drm_connector_init(Ptr<drm_device> dev, Ptr<drm_connector> connector, Ptr<drm_connector_funcs> funcs, int connector_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_connector_init_with_ddc($arg1, $arg2, (const struct drm_connector_funcs*)$arg3, $arg4, $arg5)")
    public static int drm_connector_init_with_ddc(Ptr<drm_device> dev, Ptr<drm_connector> connector, Ptr<drm_connector_funcs> funcs, int connector_type, Ptr<I2cDefinitions.i2c_adapter> ddc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_list_iter_begin(Ptr<drm_device> dev, Ptr<drm_connector_list_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_list_iter_end(Ptr<drm_connector_list_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_connector> drm_connector_list_iter_next(Ptr<drm_connector_list_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_oob_hotplug_event(Ptr<FwnodeDefinitions.fwnode_handle> connector_fwnode, drm_connector_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_privacy_screen_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_property_set_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_register(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_register_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_set_link_status_property(Ptr<drm_connector> connector, @Unsigned @OriginalName(value="uint64_t") long link_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_set_obj_prop(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_set_orientation_from_panel(Ptr<drm_connector> connector, Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_set_panel_orientation(Ptr<drm_connector> connector, drm_panel_orientation panel_orientation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_set_panel_orientation_with_quirk(Ptr<drm_connector> connector, drm_panel_orientation panel_orientation, int width, int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_connector_set_path_property($arg1, (const u8*)$arg2)")
    public static int drm_connector_set_path_property(Ptr<drm_connector> connector, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_connector_set_tile_property(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_set_vrr_capable_property(Ptr<drm_connector> connector, boolean capable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_unregister(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_connector_unregister_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_connector_update_edid_property($arg1, (const struct edid*)$arg2)")
    public static int drm_connector_update_edid_property(Ptr<drm_connector> connector, Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_connector_update_privacy_screen((const struct drm_connector_state*)$arg1)")
    public static void drm_connector_update_privacy_screen(Ptr<drm_connector_state> connector_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_commit_wait(Ptr<drm_crtc_commit> commit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_crtc_init($arg1, $arg2, (const struct drm_crtc_funcs*)$arg3)")
    public static int drm_crtc_init(Ptr<drm_device> dev, Ptr<drm_crtc> crtc, Ptr<drm_crtc_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_cvt_modes($arg1, (const struct detailed_timing*)$arg2)")
    public static int drm_cvt_modes(Ptr<drm_connector> connector, Ptr<misc.detailed_timing> timing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_debugfs_add_file($arg1, (const u8*)$arg2, (int (*)(struct seq_file*, void*))$arg3, $arg4)")
    public static void drm_debugfs_add_file(Ptr<drm_device> dev, String name, Ptr<?> show, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_debugfs_add_files($arg1, (const struct drm_debugfs_info*)$arg2, $arg3)")
    public static void drm_debugfs_add_files(Ptr<drm_device> dev, Ptr<drm_debugfs_info> files, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_connector_add(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_connector_remove(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_debugfs_create_files((const struct drm_info_list*)$arg1, $arg2, $arg3, $arg4)")
    public static void drm_debugfs_create_files(Ptr<drm_info_list> files, int count, Ptr<runtime.dentry> root, Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_crtc_add(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_crtc_remove(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_dev_fini(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_dev_init(Ptr<drm_device> dev, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_dev_register(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_encoder_add(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_encoder_remove(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_debugfs_entry_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_debugfs_gpuva_info(Ptr<SeqDefinitions.seq_file> m, Ptr<drm_gpuvm> gpuvm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_debugfs_register(Ptr<drm_minor> minor, int minor_id, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_debugfs_remove_files((const struct drm_info_list*)$arg1, $arg2, $arg3, $arg4)")
    public static int drm_debugfs_remove_files(Ptr<drm_info_list> files, int count, Ptr<runtime.dentry> root, Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_debugfs_unregister(Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_default_rgb_quant_range((const struct drm_display_mode*)$arg1)")
    public static HdmiDefinitions.hdmi_quantization_range drm_default_rgb_quant_range(Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_detect_hdmi_monitor((const struct edid*)$arg1)")
    public static boolean drm_detect_hdmi_monitor(Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_detect_monitor_audio((const struct edid*)$arg1)")
    public static boolean drm_detect_monitor_audio(Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_dev_printk((const struct device*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void drm_dev_printk(Ptr<runtime.device> dev, String level, String format, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_display_info_set_bus_formats($arg1, (const unsigned int*)$arg2, $arg3)")
    public static int drm_display_info_set_bus_formats(Ptr<drm_display_info> info2, Ptr<@Unsigned Integer> formats, @Unsigned int num_formats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_display_mode_from_cea_vic(Ptr<drm_device> dev, char video_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_display_mode_from_vic_index(Ptr<drm_connector> connector, int vic_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_do_probe_ddc_edid(Ptr<?> data, Ptr<Character> buf, @Unsigned int block, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_alloc((const void*)$arg1, $arg2))")
    public static Ptr<drm_edid> drm_edid_alloc(Ptr<?> edid2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_edid_connector_add_modes(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long drm_edid_connector_property_show(Ptr<drm_connector> connector, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_connector_update($arg1, (const struct drm_edid*)$arg2)")
    public static int drm_edid_connector_update(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_cta_sad_get((const struct cea_sad*)$arg1, $arg2)")
    public static void drm_edid_cta_sad_get(Ptr<CeaDefinitions.cea_sad> cta_sad, Ptr<Character> sad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_cta_sad_set($arg1, (const u8*)$arg2)")
    public static void drm_edid_cta_sad_set(Ptr<CeaDefinitions.cea_sad> cta_sad, Ptr<Character> sad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_dup((const struct drm_edid*)$arg1))")
    public static Ptr<drm_edid> drm_edid_dup(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_duplicate((const struct edid*)$arg1)")
    public static Ptr<runtime.edid> drm_edid_duplicate(Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_edid_find_extension((const struct drm_edid*)$arg1, $arg2, $arg3))")
    public static Ptr<Character> drm_edid_find_extension(Ptr<drm_edid> drm_edid2, int ext_id, Ptr<Integer> ext_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_free((const struct drm_edid*)$arg1)")
    public static void drm_edid_free(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_get_monitor_name((const struct edid*)$arg1, $arg2, $arg3)")
    public static void drm_edid_get_monitor_name(Ptr<runtime.edid> edid2, String name, int bufsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_get_panel_id((const struct drm_edid*)$arg1)")
    public static @Unsigned int drm_edid_get_panel_id(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_get_product_id((const struct drm_edid*)$arg1, $arg2)")
    public static void drm_edid_get_product_id(Ptr<drm_edid> drm_edid2, Ptr<drm_edid_product_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_header_is_valid((const void*)$arg1)")
    public static int drm_edid_header_is_valid(Ptr<?> _edid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_is_digital((const struct drm_edid*)$arg1)")
    public static boolean drm_edid_is_digital(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_edid_is_valid(Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_iter_begin((const struct drm_edid*)$arg1, $arg2)")
    public static void drm_edid_iter_begin(Ptr<drm_edid> drm_edid2, Ptr<drm_edid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_edid_iter_end(Ptr<drm_edid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_legacy_init($arg1, (const struct edid*)$arg2))")
    public static Ptr<drm_edid> drm_edid_legacy_init(Ptr<drm_edid> drm_edid2, Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_match((const struct drm_edid*)$arg1, (const struct drm_edid_ident*)$arg2)")
    public static boolean drm_edid_match(Ptr<drm_edid> drm_edid2, Ptr<drm_edid_ident> ident2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_edid_override_connector_update(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_override_get($arg1))")
    public static Ptr<drm_edid> drm_edid_override_get(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_edid_override_reset(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_override_set($arg1, (const void*)$arg2, $arg3)")
    public static int drm_edid_override_set(Ptr<drm_connector> connector, Ptr<?> edid2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_edid_override_show(Ptr<drm_connector> connector, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_print_product_id($arg1, (const struct drm_edid_product_id*)$arg2, $arg3)")
    public static void drm_edid_print_product_id(Ptr<drm_printer> p, Ptr<drm_edid_product_id> id, boolean raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct edid*)drm_edid_raw((const struct drm_edid*)$arg1))")
    public static Ptr<runtime.edid> drm_edid_raw(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_read($arg1))")
    public static Ptr<drm_edid> drm_edid_read(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_read_base_block($arg1))")
    public static Ptr<drm_edid> drm_edid_read_base_block(Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_read_custom($arg1, $arg2, $arg3))")
    public static Ptr<drm_edid> drm_edid_read_custom(Ptr<drm_connector> connector, Ptr<?> read_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_read_ddc($arg1, $arg2))")
    public static Ptr<drm_edid> drm_edid_read_ddc(Ptr<drm_connector> connector, Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct drm_edid*)drm_edid_read_switcheroo($arg1, $arg2))")
    public static Ptr<drm_edid> drm_edid_read_switcheroo(Ptr<drm_connector> connector, Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_to_eld($arg1, (const struct drm_edid*)$arg2)")
    public static void drm_edid_to_eld(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_to_sad((const struct edid*)$arg1, $arg2)")
    public static int drm_edid_to_sad(Ptr<runtime.edid> edid2, Ptr<Ptr<CeaDefinitions.cea_sad>> sads) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_to_speaker_allocation((const struct edid*)$arg1, $arg2)")
    public static int drm_edid_to_speaker_allocation(Ptr<runtime.edid> edid2, Ptr<Ptr<Character>> sadb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_edid_valid((const struct drm_edid*)$arg1)")
    public static boolean drm_edid_valid(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_for_each_detailed_block((const struct drm_edid*)$arg1, $arg2, $arg3)")
    public static void drm_for_each_detailed_block(Ptr<drm_edid> drm_edid2, Ptr<?> cb, Ptr<?> closure2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_name_info(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_one_name_info(int id, Ptr<?> ptr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_colorspace_name($arg1))")
    public static String drm_get_colorspace_name(drm_colorspace colorspace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_connector_force_name($arg1))")
    public static String drm_get_connector_force_name(drm_connector_force force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_connector_status_name($arg1))")
    public static String drm_get_connector_status_name(drm_connector_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_connector_type_name($arg1))")
    public static String drm_get_connector_type_name(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_dp_subconnector_name($arg1))")
    public static String drm_get_dp_subconnector_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_dpms_name($arg1))")
    public static String drm_get_dpms_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_dvi_i_select_name($arg1))")
    public static String drm_get_dvi_i_select_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_dvi_i_subconnector_name($arg1))")
    public static String drm_get_dvi_i_subconnector_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.edid> drm_get_edid(Ptr<drm_connector> connector, Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.edid> drm_get_edid_switcheroo(Ptr<drm_connector> connector, Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_get_max_frl_rate(int max_frl_rate, Ptr<Character> max_lanes, Ptr<Character> max_rate_per_lane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_subpixel_order_name($arg1))")
    public static String drm_get_subpixel_order_name(misc.subpixel_order order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_get_tv_mode_from_name((const u8*)$arg1, $arg2)")
    public static int drm_get_tv_mode_from_name(String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_tv_mode_name($arg1))")
    public static String drm_get_tv_mode_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_tv_select_name($arg1))")
    public static String drm_get_tv_select_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_tv_subconnector_name($arg1))")
    public static String drm_get_tv_subconnector_name(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_gtf2_mode($arg1, (const struct drm_edid*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<drm_display_mode> drm_gtf2_mode(Ptr<drm_device> dev, Ptr<drm_edid> drm_edid2, int hsize, int vsize, int vrefresh_rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_hdmi_avi_infoframe_from_display_mode($arg1, (const struct drm_connector*)$arg2, (const struct drm_display_mode*)$arg3)")
    public static int drm_hdmi_avi_infoframe_from_display_mode(Ptr<HdmiDefinitions.hdmi_avi_infoframe> frame, Ptr<drm_connector> connector, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_hdmi_avi_infoframe_quant_range($arg1, (const struct drm_connector*)$arg2, (const struct drm_display_mode*)$arg3, $arg4)")
    public static void drm_hdmi_avi_infoframe_quant_range(Ptr<HdmiDefinitions.hdmi_avi_infoframe> frame, Ptr<drm_connector> connector, Ptr<drm_display_mode> mode, HdmiDefinitions.hdmi_quantization_range rgb_quant_range) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_hdmi_connector_get_broadcast_rgb_name($arg1))")
    public static String drm_hdmi_connector_get_broadcast_rgb_name(drm_hdmi_broadcast_rgb broadcast_rgb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_hdmi_connector_get_output_format_name($arg1))")
    public static String drm_hdmi_connector_get_output_format_name(HdmiDefinitions.hdmi_colorspace fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_hdmi_vendor_infoframe_from_display_mode($arg1, (const struct drm_connector*)$arg2, (const struct drm_display_mode*)$arg3)")
    public static int drm_hdmi_vendor_infoframe_from_display_mode(Ptr<HdmiDefinitions.hdmi_vendor_infoframe> frame, Ptr<drm_connector> connector, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_helper_mode_fill_fb_struct($arg1, $arg2, (const struct drm_mode_fb_cmd2*)$arg3)")
    public static void drm_helper_mode_fill_fb_struct(Ptr<drm_device> dev, Ptr<drm_framebuffer> fb, Ptr<drm_mode_fb_cmd2> mode_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_helper_move_panel_connectors_to_head(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_commit(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_destroy(Ptr<drm_encoder> drm_encoder2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static drm_connector_status drm_i2c_encoder_detect(Ptr<drm_encoder> encoder, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_dpms(Ptr<drm_encoder> encoder, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_i2c_encoder_init($arg1, $arg2, $arg3, (const struct i2c_board_info*)$arg4)")
    public static int drm_i2c_encoder_init(Ptr<drm_device> dev, Ptr<drm_encoder_slave> encoder, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_board_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_i2c_encoder_mode_fixup($arg1, (const struct drm_display_mode*)$arg2, $arg3)")
    public static boolean drm_i2c_encoder_mode_fixup(Ptr<drm_encoder> encoder, Ptr<drm_display_mode> mode, Ptr<drm_display_mode> adjusted_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_mode_set(Ptr<drm_encoder> encoder, Ptr<drm_display_mode> mode, Ptr<drm_display_mode> adjusted_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_prepare(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_restore(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_i2c_encoder_save(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_master> drm_lease_create(Ptr<drm_master> lessor, Ptr<runtime.idr> leases) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_lease_destroy(Ptr<drm_master> master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int drm_lease_filter_crtcs(Ptr<drm_file> file_priv2, @Unsigned @OriginalName(value="uint32_t") int crtcs_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_lease_held(Ptr<drm_file> file_priv2, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_master> drm_lease_owner(Ptr<drm_master> master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_lease_revoke(Ptr<drm_master> top) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_match_cea_mode((const struct drm_display_mode*)$arg1)")
    public static char drm_match_cea_mode(Ptr<drm_display_mode> to_match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_match_cea_mode_clock_tolerance((const struct drm_display_mode*)$arg1, $arg2)")
    public static char drm_match_cea_mode_clock_tolerance(Ptr<drm_display_mode> to_match, @Unsigned int clock_tolerance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_match_hdmi_mode((const struct drm_display_mode*)$arg1)")
    public static char drm_match_hdmi_mode(Ptr<drm_display_mode> to_match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_config_helper_resume(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_config_helper_suspend(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_aspect_ratio_property(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_colorspace_property(Ptr<drm_connector> connector, @Unsigned int supported_colorspaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_content_type_property(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_dp_colorspace_property(Ptr<drm_connector> connector, @Unsigned int supported_colorspaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_dvi_i_properties(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_hdmi_colorspace_property(Ptr<drm_connector> connector, @Unsigned int supported_colorspaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_lease_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> lessor_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_scaling_mode_property(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_suggested_offset_properties(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_create_tile_group($arg1, (const u8*)$arg2)")
    public static Ptr<drm_tile_group> drm_mode_create_tile_group(Ptr<drm_device> dev, String topology) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_tv_margin_properties(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_tv_properties(Ptr<drm_device> dev, @Unsigned int supported_tv_modes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_create_tv_properties_legacy($arg1, $arg2, (const u8**)$arg3)")
    public static int drm_mode_create_tv_properties_legacy(Ptr<drm_device> dev, @Unsigned int num_modes, Ptr<String> modes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_detailed($arg1, (const struct drm_edid*)$arg2, (const struct detailed_timing*)$arg3)")
    public static Ptr<drm_display_mode> drm_mode_detailed(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2, Ptr<misc.detailed_timing> timing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_mode_displayid_detailed(Ptr<drm_device> dev, Ptr<DisplayidDefinitions.displayid_detailed_timings_1> timings, boolean type_7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_display_mode> drm_mode_find_dmt(Ptr<drm_device> dev, int hsize, int vsize, int fresh, boolean rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_fixup_1366x768(Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_get_lease_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> lessee_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_get_tile_group($arg1, (const u8*)$arg2)")
    public static Ptr<drm_tile_group> drm_mode_get_tile_group(Ptr<drm_device> dev, String topology) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_getconnector(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_list_lessees_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> lessor_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_put_tile_group(Ptr<drm_device> dev, Ptr<drm_tile_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_revoke_lease_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> lessor_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mode_std($arg1, (const struct drm_edid*)$arg2, (const struct std_timing*)$arg3)")
    public static Ptr<drm_display_mode> drm_mode_std(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2, Ptr<misc.std_timing> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_acquire_fini(Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_acquire_init(Ptr<drm_modeset_acquire_ctx> ctx, @Unsigned @OriginalName(value="uint32_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_modeset_backoff(Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_drop_locks(Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_lock_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_modeset_lock_all_ctx(Ptr<drm_device> dev, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_lock_init(Ptr<drm_modeset_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_modeset_lock_single_interruptible(Ptr<drm_modeset_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_unlock(Ptr<drm_modeset_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_modeset_unlock_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_monitor_supports_rb((const struct drm_edid*)$arg1)")
    public static boolean drm_monitor_supports_rb(Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_name_info(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panic(Ptr<KmsgDefinitions.kmsg_dumper> dumper, Ptr<KmsgDefinitions.kmsg_dump_detail> detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panic_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panic_fill(Ptr<drm_scanout_buffer> sb, Ptr<drm_rect> clip, @Unsigned int color) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panic_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_panic_is_enabled(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panic_register(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panic_unregister(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_parse_cea_ext($arg1, (const struct drm_edid*)$arg2)")
    public static void drm_parse_cea_ext(Ptr<drm_connector> connector, Ptr<drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_parse_hdmi_deep_color_info($arg1, (const u8*)$arg2)")
    public static void drm_parse_hdmi_deep_color_info(Ptr<drm_connector> connector, Ptr<Character> hdmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_parse_tiled_block($arg1, (const struct displayid_block*)$arg2)")
    public static void drm_parse_tiled_block(Ptr<drm_connector> connector, Ptr<DisplayidDefinitions.displayid_block> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_parse_vesa_mso_data($arg1, (const struct displayid_block*)$arg2)")
    public static void drm_parse_vesa_mso_data(Ptr<drm_connector> connector, Ptr<DisplayidDefinitions.displayid_block> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_print_bits($arg1, $arg2, (const u8**)$arg3, $arg4)")
    public static void drm_print_bits(Ptr<drm_printer> p, @Unsigned long value, Ptr<String> bits, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_print_regset32(Ptr<drm_printer> p, Ptr<DebugfsDefinitions.debugfs_regset32> regset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void drm_printf(Ptr<drm_printer> p, String f, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_lookup_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_lookup_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_probe_ddc(Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_puts($arg1, (const u8*)$arg2)")
    public static void drm_puts(Ptr<drm_printer> p, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_reset_display_info(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_self_refresh_helper_alter_state(Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_self_refresh_helper_cleanup(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_self_refresh_helper_entry_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_self_refresh_helper_init(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_self_refresh_helper_update_avg_times(Ptr<drm_atomic_state> state2, @Unsigned int commit_time_ms, @Unsigned int new_self_refresh_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_state_dump(Ptr<drm_device> dev, Ptr<drm_printer> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_state_info(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_add_point(Ptr<drm_syncobj> syncobj, Ptr<DmaDefinitions.dma_fence_chain> chain, Ptr<DmaDefinitions.dma_fence> fence, @Unsigned @OriginalName(value="uint64_t") long point) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_array_find(Ptr<drm_file> file_private, Ptr<?> user_handles, @Unsigned @OriginalName(value="uint32_t") int count_handles, Ptr<Ptr<Ptr<drm_syncobj>>> syncobjs_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_array_free(Ptr<Ptr<drm_syncobj>> syncobjs, @Unsigned @OriginalName(value="uint32_t") int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long drm_syncobj_array_wait_timeout(Ptr<Ptr<drm_syncobj>> syncobjs, Ptr<?> user_points, @Unsigned @OriginalName(value="uint32_t") int count, @Unsigned @OriginalName(value="uint32_t") int flags, long timeout, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> idx, Ptr<@OriginalName(value="ktime_t") Long> deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_create_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_destroy_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_eventfd_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_fd_to_handle_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_fence_add_wait(Ptr<drm_syncobj> syncobj, Ptr<misc.syncobj_wait_entry> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_file_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_syncobj> drm_syncobj_find(Ptr<drm_file> file_private, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_find_fence(Ptr<drm_file> file_private, @Unsigned int handle, @Unsigned long point, @Unsigned long flags, Ptr<Ptr<DmaDefinitions.dma_fence>> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_free(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_get_fd(Ptr<drm_syncobj> syncobj, Ptr<Integer> p_fd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_get_handle(Ptr<drm_file> file_private, Ptr<drm_syncobj> syncobj, Ptr<@Unsigned Integer> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_handle_to_fd_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_open(Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_query_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_release(Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_release_handle(int id, Ptr<?> ptr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_syncobj_replace_fence(Ptr<drm_syncobj> syncobj, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_reset_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_signal_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_timeline_signal_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_timeline_wait_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_transfer_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_syncobj_wait_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long drm_timeout_abs_to_jiffies(@OriginalName(value="int64_t") long timeout_nsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vma_node_allow(Ptr<drm_vma_offset_node> node2, Ptr<drm_file> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vma_node_allow_once(Ptr<drm_vma_offset_node> node2, Ptr<drm_file> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_vma_node_is_allowed(Ptr<drm_vma_offset_node> node2, Ptr<drm_file> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vma_node_revoke(Ptr<drm_vma_offset_node> node2, Ptr<drm_file> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vma_offset_add(Ptr<drm_vma_offset_manager> mgr, Ptr<drm_vma_offset_node> node2, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_vma_offset_node> drm_vma_offset_lookup_locked(Ptr<drm_vma_offset_manager> mgr, @Unsigned long start, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vma_offset_manager_destroy(Ptr<drm_vma_offset_manager> mgr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vma_offset_manager_init(Ptr<drm_vma_offset_manager> mgr, @Unsigned long page_offset, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vma_offset_remove(Ptr<drm_vma_offset_manager> mgr, Ptr<drm_vma_offset_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_warn_on_modeset_not_all_locked(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_writeback_cleanup_job(Ptr<drm_writeback_job> job) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_writeback_connector_init($arg1, $arg2, (const struct drm_connector_funcs*)$arg3, (const struct drm_encoder_helper_funcs*)$arg4, (const unsigned int*)$arg5, $arg6, $arg7)")
    public static int drm_writeback_connector_init(Ptr<drm_device> dev, Ptr<drm_writeback_connector> wb_connector, Ptr<drm_connector_funcs> con_funcs, Ptr<drm_encoder_helper_funcs> enc_helper_funcs, Ptr<@Unsigned Integer> formats, int n_formats, @Unsigned int possible_crtcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_writeback_connector_init_with_encoder($arg1, $arg2, $arg3, (const struct drm_connector_funcs*)$arg4, (const unsigned int*)$arg5, $arg6)")
    public static int drm_writeback_connector_init_with_encoder(Ptr<drm_device> dev, Ptr<drm_writeback_connector> wb_connector, Ptr<drm_encoder> enc, Ptr<drm_connector_funcs> con_funcs, Ptr<@Unsigned Integer> formats, int n_formats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_writeback_fence_enable_signaling(Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_writeback_fence_get_driver_name($arg1))")
    public static String drm_writeback_fence_get_driver_name(Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_writeback_fence_get_timeline_name($arg1))")
    public static String drm_writeback_fence_get_timeline_name(Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_fence> drm_writeback_get_out_fence(Ptr<drm_writeback_connector> wb_connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_writeback_prepare_job(Ptr<drm_writeback_job> job) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_writeback_queue_job(Ptr<drm_writeback_connector> wb_connector, Ptr<drm_connector_state> conn_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_writeback_set_fb(Ptr<drm_connector_state> conn_state, Ptr<drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_writeback_signal_completion(Ptr<drm_writeback_connector> wb_connector, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_fb_xfrm($arg1, $arg2, $arg3, (const void*)$arg4, (const struct drm_framebuffer*)$arg5, (const struct drm_rect*)$arg6, $arg7, $arg8, (void (*)(void*, const void*, unsigned int))$arg9)")
    public static int __drm_fb_xfrm(Ptr<?> dst, @Unsigned long dst_pitch, @Unsigned long dst_pixsize, Ptr<?> vaddr, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, boolean vaddr_cached_hint, Ptr<drm_format_conv_state> state2, Ptr<?> xfrm_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_fb_xfrm_toio($arg1, $arg2, $arg3, (const void*)$arg4, (const struct drm_framebuffer*)$arg5, (const struct drm_rect*)$arg6, $arg7, $arg8, (void (*)(void*, const void*, unsigned int))$arg9)")
    public static int __drm_fb_xfrm_toio(Ptr<?> dst, @Unsigned long dst_pitch, @Unsigned long dst_pixsize, Ptr<?> vaddr, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, boolean vaddr_cached_hint, Ptr<drm_format_conv_state> state2, Ptr<?> xfrm_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __drm_helper_disable_unused_functions(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_memcpy_from_wc($arg1, (const void*)$arg2, $arg3)")
    public static void __drm_memcpy_from_wc(Ptr<?> dst, Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_mm_interval_first((const struct drm_mm*)$arg1, $arg2, $arg3)")
    public static Ptr<drm_mm_node> __drm_mm_interval_first(Ptr<drm_mm> mm, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__drm_mode_object_add($arg1, $arg2, $arg3, $arg4, (void (*)(struct kref*))$arg5)")
    public static int __drm_mode_object_add(Ptr<drm_device> dev, Ptr<drm_mode_object> obj, @Unsigned @OriginalName(value="uint32_t") int obj_type, boolean register_obj, Ptr<?> obj_free_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_mode_object> __drm_mode_object_find(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, @Unsigned @OriginalName(value="uint32_t") int id, @Unsigned @OriginalName(value="uint32_t") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __drm_object_property_get_value(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_aperture_remove_conflicting_framebuffers($arg1, $arg2, (const struct drm_driver*)$arg3)")
    public static int drm_aperture_remove_conflicting_framebuffers(@Unsigned @OriginalName(value="resource_size_t") long base, @Unsigned @OriginalName(value="resource_size_t") long size, Ptr<drm_driver> req_driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_aperture_remove_conflicting_pci_framebuffers($arg1, (const struct drm_driver*)$arg2)")
    public static int drm_aperture_remove_conflicting_pci_framebuffers(Ptr<PciDefinitions.pci_dev> pdev, Ptr<drm_driver> req_driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_authmagic(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_class_device_register(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_class_device_unregister(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_clflush_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_clflush_pages(Ptr<Ptr<runtime.page>> pages, @Unsigned long num_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_clflush_sg(Ptr<SgDefinitions.sg_table> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_clflush_virt_range(Ptr<?> addr2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_color_ctm_s31_32_to_qm_n(@Unsigned long user_input, @Unsigned int m, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_color_lut_check((const struct drm_property_blob*)$arg1, $arg2)")
    public static int drm_color_lut_check(Ptr<drm_property_blob> lut, @Unsigned int tests) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_connector_acpi_bus_match(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AcpiDefinitions.acpi_device> drm_connector_acpi_find_companion(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_encoder> drm_connector_get_single_encoder(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_copy_field($arg1, $arg2, (const u8*)$arg3)")
    public static int drm_copy_field(String buf, Ptr<@Unsigned Long> buf_len, String value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_crtc_enable_color_mgmt(Ptr<drm_crtc> crtc, @Unsigned @OriginalName(value="uint") int degamma_lut_size, boolean has_ctm, @Unsigned @OriginalName(value="uint") int gamma_lut_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_helper_atomic_check(Ptr<drm_crtc> crtc, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_helper_set_config(Ptr<drm_mode_set> set, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_crtc_helper_set_mode(Ptr<drm_crtc> crtc, Ptr<drm_display_mode> mode, int x, int y, Ptr<drm_framebuffer> old_fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_crtc_legacy_gamma_set(Ptr<drm_crtc> crtc, Ptr<@Unsigned Short> red, Ptr<@Unsigned Short> green, Ptr<@Unsigned Short> blue, @Unsigned int size, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_dev_needs_global_mutex(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_devnode((const struct device*)$arg1, $arg2)")
    public static String drm_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_dropmaster_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_encoder_disable(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_event_cancel_free(Ptr<drm_device> dev, Ptr<drm_pending_event> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_event_reserve_init(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, Ptr<drm_pending_event> p, Ptr<drm_event> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_event_reserve_init_locked(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, Ptr<drm_pending_event> p, Ptr<drm_event> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_blit($arg1, (const unsigned int*)$arg2, $arg3, (const struct iosys_map*)$arg4, (const struct drm_framebuffer*)$arg5, (const struct drm_rect*)$arg6, $arg7)")
    public static int drm_fb_blit(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, @Unsigned @OriginalName(value="uint32_t") int dst_format, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_build_fourcc_list($arg1, (const unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long drm_fb_build_fourcc_list(Ptr<drm_device> dev, Ptr<@Unsigned Integer> native_fourccs, @Unsigned long native_nfourccs, Ptr<@Unsigned Integer> fourccs_out, @Unsigned long nfourccs_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_clip_offset($arg1, (const struct drm_format_info*)$arg2, (const struct drm_rect*)$arg3)")
    public static @Unsigned int drm_fb_clip_offset(@Unsigned int pitch, Ptr<drm_format_info> format, Ptr<drm_rect> clip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_memcpy($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5)")
    public static void drm_fb_memcpy(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_swab($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6, $arg7)")
    public static void drm_fb_swab(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, boolean cached, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_swab16_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_swab16_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_swab32_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_swab32_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xfrm($arg1, (const unsigned int*)$arg2, (const u8*)$arg3, (const struct iosys_map*)$arg4, (const struct drm_framebuffer*)$arg5, (const struct drm_rect*)$arg6, $arg7, $arg8, (void (*)(void*, const void*, unsigned int))$arg9)")
    public static int drm_fb_xfrm(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<Character> dst_pixsize, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, boolean vaddr_cached_hint, Ptr<drm_format_conv_state> state2, Ptr<?> xfrm_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_abgr8888_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_abgr8888_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_argb1555($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_argb1555(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_argb1555_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_argb1555_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_argb2101010($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_argb2101010(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_argb2101010_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_argb2101010_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_argb8888($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_argb8888(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_argb8888_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_argb8888_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_gray8($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_gray8(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_gray8_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_gray8_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_mono($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_mono(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb332($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_rgb332(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb332_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_rgb332_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb565($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6, $arg7)")
    public static void drm_fb_xrgb8888_to_rgb565(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2, boolean __swab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb565_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_rgb565_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb565_swab_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_rgb565_swab_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb888($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_rgb888(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgb888_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_rgb888_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgba5551($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_rgba5551(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_rgba5551_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_rgba5551_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_xbgr8888_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_xbgr8888_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_xrgb1555($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_xrgb1555(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_xrgb1555_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_xrgb1555_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_xrgb2101010($arg1, (const unsigned int*)$arg2, (const struct iosys_map*)$arg3, (const struct drm_framebuffer*)$arg4, (const struct drm_rect*)$arg5, $arg6)")
    public static void drm_fb_xrgb8888_to_xrgb2101010(Ptr<misc.iosys_map> dst, Ptr<@Unsigned Integer> dst_pitch, Ptr<misc.iosys_map> src, Ptr<drm_framebuffer> fb, Ptr<drm_rect> clip, Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fb_xrgb8888_to_xrgb2101010_line($arg1, (const void*)$arg2, $arg3)")
    public static void drm_fb_xrgb8888_to_xrgb2101010_line(Ptr<?> dbuf, Ptr<?> sbuf, @Unsigned int pixels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_client_hotplug(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_client_restore(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fbdev_shmem_client_unregister(Ptr<drm_client_dev> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fbdev_shmem_defio_copyarea($arg1, (const struct fb_copyarea*)$arg2)")
    public static void drm_fbdev_shmem_defio_copyarea(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_copyarea> area) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fbdev_shmem_defio_fillrect($arg1, (const struct fb_fillrect*)$arg2)")
    public static void drm_fbdev_shmem_defio_fillrect(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_fillrect> rect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fbdev_shmem_defio_imageblit($arg1, (const struct fb_image*)$arg2)")
    public static void drm_fbdev_shmem_defio_imageblit(Ptr<FbDefinitions.fb_info> info2, Ptr<FbDefinitions.fb_image> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long drm_fbdev_shmem_defio_read(Ptr<FbDefinitions.fb_info> info2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_fbdev_shmem_defio_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long drm_fbdev_shmem_defio_write(Ptr<FbDefinitions.fb_info> info2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fbdev_shmem_fb_destroy(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_fb_mmap(Ptr<FbDefinitions.fb_info> info2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_fb_open(Ptr<FbDefinitions.fb_info> info2, int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_fb_release(Ptr<FbDefinitions.fb_info> info2, int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> drm_fbdev_shmem_get_page(Ptr<FbDefinitions.fb_info> info2, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_helper_fb_dirty(Ptr<drm_fb_helper> helper, Ptr<drm_clip_rect> clip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_fbdev_shmem_helper_fb_probe(Ptr<drm_fb_helper> fb_helper, Ptr<drm_fb_helper_surface_size> sizes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_fbdev_shmem_setup(Ptr<drm_device> dev, @Unsigned int preferred_bpp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_file> drm_file_alloc(Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_file_free(Ptr<drm_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_master> drm_file_get_master(Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_file_update_pid(Ptr<drm_file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_format_conv_state_copy($arg1, (const struct drm_format_conv_state*)$arg2)")
    public static void drm_format_conv_state_copy(Ptr<drm_format_conv_state> state2, Ptr<drm_format_conv_state> old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_format_conv_state_init(Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_format_conv_state_release(Ptr<drm_format_conv_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> drm_format_conv_state_reserve(Ptr<drm_format_conv_state> state2, @Unsigned long new_size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_buf> drm_gem_dmabuf_export(Ptr<drm_device> dev, Ptr<DmaDefinitions.dma_buf_export_info> exp_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_dmabuf_mmap(Ptr<DmaDefinitions.dma_buf> dma_buf2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_dmabuf_release(Ptr<DmaDefinitions.dma_buf> dma_buf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_dmabuf_vmap(Ptr<DmaDefinitions.dma_buf> dma_buf2, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_dmabuf_vunmap(Ptr<DmaDefinitions.dma_buf> dma_buf2, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_map_attach(Ptr<DmaDefinitions.dma_buf> dma_buf2, Ptr<DmaDefinitions.dma_buf_attachment> attach) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_map_detach(Ptr<DmaDefinitions.dma_buf> dma_buf2, Ptr<DmaDefinitions.dma_buf_attachment> attach) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> drm_gem_map_dma_buf(Ptr<DmaDefinitions.dma_buf_attachment> attach, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_buf> drm_gem_prime_export(Ptr<drm_gem_object> obj, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_prime_fd_to_handle(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, int prime_fd, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_buf> drm_gem_prime_handle_to_dmabuf(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, @Unsigned @OriginalName(value="uint32_t") int handle, @Unsigned @OriginalName(value="uint32_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_prime_handle_to_fd(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, @Unsigned @OriginalName(value="uint32_t") int handle, @Unsigned @OriginalName(value="uint32_t") int flags, Ptr<Integer> prime_fd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_object> drm_gem_prime_import(Ptr<drm_device> dev, Ptr<DmaDefinitions.dma_buf> dma_buf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_gem_object> drm_gem_prime_import_dev(Ptr<drm_device> dev, Ptr<DmaDefinitions.dma_buf> dma_buf2, Ptr<runtime.device> attach_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_gem_prime_mmap(Ptr<drm_gem_object> obj, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_gem_unmap_dma_buf(Ptr<DmaDefinitions.dma_buf_attachment> attach, Ptr<SgDefinitions.sg_table> sgt, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_color_encoding_name($arg1))")
    public static String drm_get_color_encoding_name(drm_color_encoding encoding) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)drm_get_color_range_name($arg1))")
    public static String drm_get_color_range_name(drm_color_range range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_getcap(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_getclient(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_getmagic(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_getstats(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_getunique(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_handle_vblank_works(Ptr<drm_vblank_crtc> vblank) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_helper_choose_crtc_dpms(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_helper_connector_dpms(Ptr<drm_connector> connector, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_helper_crtc_in_use(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_helper_disable_unused_functions(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_helper_encoder_in_use(Ptr<drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_helper_force_disable_all(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_helper_resume_force_mode(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_invalid_op(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long drm_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long drm_ioctl_kernel(Ptr<runtime.file> file2, Ptr<?> func, Ptr<?> kdata, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_is_current_master(Ptr<drm_file> fpriv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_is_panel_follower(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_master> drm_master_create(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_master_destroy(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_master> drm_master_get(Ptr<drm_master> master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_master_internal_acquire(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_master_internal_release(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_master_open(Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_master_put(Ptr<Ptr<drm_master>> master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_master_release(Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_memcpy_from_wc($arg1, (const struct iosys_map*)$arg2, $arg3)")
    public static void drm_memcpy_from_wc(Ptr<misc.iosys_map> dst, Ptr<misc.iosys_map> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_memcpy_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_init(Ptr<drm_mm> mm, @Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mm_insert_node_in_range((const struct drm_mm*)$arg1, (const struct drm_mm_node*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int drm_mm_insert_node_in_range(Ptr<drm_mm> mm, Ptr<drm_mm_node> node2, @Unsigned long size, @Unsigned long alignment, @Unsigned long color, @Unsigned long range_start, @Unsigned long range_end, drm_mm_insert_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_interval_tree_add_node(Ptr<drm_mm_node> hole_node, Ptr<drm_mm_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_interval_tree_augment_rotate(Ptr<RbDefinitions.rb_node> rb_old, Ptr<RbDefinitions.rb_node> rb_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_interval_tree_remove(Ptr<drm_mm_node> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_mm_print((const struct drm_mm*)$arg1, $arg2)")
    public static void drm_mm_print(Ptr<drm_mm> mm, Ptr<drm_printer> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_remove_node(Ptr<drm_mm_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mm_reserve_node(Ptr<drm_mm> mm, Ptr<drm_mm_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_mm_scan_add_block(Ptr<drm_mm_scan> scan, Ptr<drm_mm_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_mm_node> drm_mm_scan_color_evict(Ptr<drm_mm_scan> scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_scan_init_with_range(Ptr<drm_mm_scan> scan, Ptr<drm_mm> mm, @Unsigned long size, @Unsigned long alignment, @Unsigned long color, @Unsigned long start, @Unsigned long end, drm_mm_insert_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_mm_scan_remove_block(Ptr<drm_mm_scan> scan, Ptr<drm_mm_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mm_takedown(Ptr<drm_mm> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_create_dumb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_crtc_set_gamma_size(Ptr<drm_crtc> crtc, int gamma_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_destroy_dumb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_gamma_get_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_gamma_set_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_mmap_dumb_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_property> drm_mode_obj_find_prop_id(Ptr<drm_mode_object> obj, @Unsigned @OriginalName(value="uint32_t") int prop_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_obj_get_properties_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_obj_set_property_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_object_add(Ptr<drm_device> dev, Ptr<drm_mode_object> obj, @Unsigned @OriginalName(value="uint32_t") int obj_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_mode_object> drm_mode_object_find(Ptr<drm_device> dev, Ptr<drm_file> file_priv2, @Unsigned @OriginalName(value="uint32_t") int id, @Unsigned @OriginalName(value="uint32_t") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_object_get(Ptr<drm_mode_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_mode_object_get_properties(Ptr<drm_mode_object> obj, boolean atomic, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> prop_ptr, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> prop_values, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> arg_count_props) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_mode_object_lease_required(@Unsigned @OriginalName(value="uint32_t") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_object_put(Ptr<drm_mode_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_object_register(Ptr<drm_device> dev, Ptr<drm_mode_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_mode_object_unregister(Ptr<drm_device> dev, Ptr<drm_mode_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_need_swiotlb(int dma_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_new_set_master(Ptr<drm_device> dev, Ptr<drm_file> fpriv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_noop(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_object_attach_property(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_object_property_get_default_value(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_object_property_get_value(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_object_property_set_value(Ptr<drm_mode_object> obj, Ptr<drm_property> property2, @Unsigned @OriginalName(value="uint64_t") long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_open_helper(Ptr<runtime.file> filp, Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panel_add(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_add_follower(Ptr<runtime.device> follower_dev, Ptr<drm_panel_follower> follower) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_disable(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_enable(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_get_modes(Ptr<drm_panel> panel, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_panel_init($arg1, $arg2, (const struct drm_panel_funcs*)$arg3, $arg4)")
    public static void drm_panel_init(Ptr<drm_panel> panel, Ptr<runtime.device> dev, Ptr<drm_panel_funcs> funcs, int connector_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_of_backlight(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_prepare(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panel_remove(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_panel_remove_follower(Ptr<drm_panel_follower> follower) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_panel_unprepare(Ptr<drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_create_color_properties(Ptr<drm_plane> plane, @Unsigned int supported_encodings, @Unsigned int supported_ranges, drm_color_encoding default_encoding, drm_color_range default_range) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_plane_helper_destroy(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_helper_disable_primary(Ptr<drm_plane> plane, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_plane_helper_update_primary(Ptr<drm_plane> plane, Ptr<drm_crtc> crtc, Ptr<drm_framebuffer> fb, int crtc_x, int crtc_y, @Unsigned int crtc_w, @Unsigned int crtc_h, @Unsigned @OriginalName(value="uint32_t") int src_x, @Unsigned @OriginalName(value="uint32_t") int src_y, @Unsigned @OriginalName(value="uint32_t") int src_w, @Unsigned @OriginalName(value="uint32_t") int src_h, Ptr<drm_modeset_acquire_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int drm_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_prime_add_buf_handle(Ptr<drm_prime_file_private> prime_fpriv, Ptr<DmaDefinitions.dma_buf> dma_buf2, @Unsigned @OriginalName(value="uint32_t") int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_prime_destroy_file_private(Ptr<drm_prime_file_private> prime_fpriv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_prime_fd_to_handle_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_prime_gem_destroy(Ptr<drm_gem_object> obj, Ptr<SgDefinitions.sg_table> sg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long drm_prime_get_contiguous_size(Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_prime_handle_to_fd_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_prime_init_file_private(Ptr<drm_prime_file_private> prime_fpriv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> drm_prime_pages_to_sg(Ptr<drm_device> dev, Ptr<Ptr<runtime.page>> pages, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_prime_remove_buf_handle(Ptr<drm_prime_file_private> prime_fpriv, @Unsigned @OriginalName(value="uint32_t") int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_prime_sg_to_dma_addr_array(Ptr<SgDefinitions.sg_table> sgt, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> addrs2, int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_prime_sg_to_page_array(Ptr<SgDefinitions.sg_table> sgt, Ptr<Ptr<runtime.page>> pages, int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_print_memory_stats($arg1, (const struct drm_memory_stats*)$arg2, $arg3, (const u8*)$arg4)")
    public static void drm_print_memory_stats(Ptr<drm_printer> p, Ptr<drm_memory_stats> stats, drm_gem_object_status supported_status, String region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_call_notifier_chain(Ptr<drm_privacy_screen> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_privacy_screen_get($arg1, (const u8*)$arg2)")
    public static Ptr<drm_privacy_screen> drm_privacy_screen_get(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_get_state(Ptr<drm_privacy_screen> priv, Ptr<drm_privacy_screen_status> sw_state_ret, Ptr<drm_privacy_screen_status> hw_state_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_lookup_add(Ptr<drm_privacy_screen_lookup> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_lookup_remove(Ptr<drm_privacy_screen_lookup> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_put(Ptr<drm_privacy_screen> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_privacy_screen_register($arg1, (const struct drm_privacy_screen_ops*)$arg2, $arg3)")
    public static Ptr<drm_privacy_screen> drm_privacy_screen_register(Ptr<runtime.device> parent, Ptr<drm_privacy_screen_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_privacy_screen_register_notifier(Ptr<drm_privacy_screen> priv, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_privacy_screen_set_sw_state(Ptr<drm_privacy_screen> priv, drm_privacy_screen_status sw_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_privacy_screen_unregister(Ptr<drm_privacy_screen> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_privacy_screen_unregister_notifier(Ptr<drm_privacy_screen> priv, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long drm_read(Ptr<runtime.file> filp, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_release_noglobal(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_send_event(Ptr<drm_device> dev, Ptr<drm_pending_event> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_send_event_helper(Ptr<drm_device> dev, Ptr<drm_pending_event> e, @OriginalName(value="ktime_t") long timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_send_event_locked(Ptr<drm_device> dev, Ptr<drm_pending_event> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_send_event_timestamp_locked(Ptr<drm_device> dev, Ptr<drm_pending_event> e, @OriginalName(value="ktime_t") long timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_set_busid(Ptr<drm_device> dev, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_setclientcap(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_setmaster_ioctl(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_setversion(Ptr<drm_device> dev, Ptr<?> data, Ptr<drm_file> file_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_show_memory_stats(Ptr<drm_printer> p, Ptr<drm_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_display_pipe_attach_bridge(Ptr<drm_simple_display_pipe> pipe2, Ptr<drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_simple_display_pipe_init($arg1, $arg2, (const struct drm_simple_display_pipe_funcs*)$arg3, (const unsigned int*)$arg4, $arg5, (const long long unsigned int*)$arg6, $arg7)")
    public static int drm_simple_display_pipe_init(Ptr<drm_device> dev, Ptr<drm_simple_display_pipe> pipe2, Ptr<drm_simple_display_pipe_funcs> funcs, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> formats, @Unsigned int format_count, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> format_modifiers, Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_encoder_init(Ptr<drm_device> dev, Ptr<drm_encoder> encoder, int encoder_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_kms_crtc_check(Ptr<drm_crtc> crtc, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_crtc_destroy_state(Ptr<drm_crtc> crtc, Ptr<drm_crtc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_crtc_disable(Ptr<drm_crtc> crtc, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_crtc_disable_vblank(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_crtc_state> drm_simple_kms_crtc_duplicate_state(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_crtc_enable(Ptr<drm_crtc> crtc, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_kms_crtc_enable_vblank(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_simple_kms_crtc_mode_valid($arg1, (const struct drm_display_mode*)$arg2)")
    public static drm_mode_status drm_simple_kms_crtc_mode_valid(Ptr<drm_crtc> crtc, Ptr<drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_crtc_reset(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_simple_kms_format_mod_supported(Ptr<drm_plane> plane, @Unsigned @OriginalName(value="uint32_t") int format, @Unsigned @OriginalName(value="uint64_t") long modifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_kms_plane_atomic_check(Ptr<drm_plane> plane, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_plane_atomic_update(Ptr<drm_plane> plane, Ptr<drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_kms_plane_begin_fb_access(Ptr<drm_plane> plane, Ptr<drm_plane_state> new_plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_plane_cleanup_fb(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_plane_destroy_state(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<drm_plane_state> drm_simple_kms_plane_duplicate_state(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_plane_end_fb_access(Ptr<drm_plane> plane, Ptr<drm_plane_state> new_plane_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_simple_kms_plane_prepare_fb(Ptr<drm_plane> plane, Ptr<drm_plane_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_simple_kms_plane_reset(Ptr<drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_sysfs_connector_add(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_sysfs_connector_add_late(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_connector_hotplug_event(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_connector_property_event(Ptr<drm_connector> connector, Ptr<drm_property> property2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_connector_remove(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_connector_remove_early(Ptr<drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_destroy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_hotplug_event(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_lease_event(Ptr<drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> drm_sysfs_minor_alloc(Ptr<drm_minor> minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_sysfs_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_cancel_pending_works(Ptr<drm_vblank_crtc> vblank) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean drm_vblank_work_cancel_sync(Ptr<drm_vblank_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_work_flush(Ptr<drm_vblank_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drm_vblank_work_flush_all(Ptr<drm_crtc> crtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drm_vblank_work_init($arg1, $arg2, (void (*)(struct kthread_work*))$arg3)")
    public static void drm_vblank_work_init(Ptr<drm_vblank_work> work, Ptr<drm_crtc> crtc, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vblank_work_schedule(Ptr<drm_vblank_work> work, @Unsigned long count, boolean nextonmiss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drm_vblank_worker_init(Ptr<drm_vblank_crtc> vblank) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int value; enum drm_stat_type type; }")
    @NotUsableInJava
    public static class AnonymousType741370455C59
    extends Struct {
        public @Unsigned int value;
        public drm_stat_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int value; enum drm_stat_type type; }")
    @NotUsableInJava
    public static class AnonymousType1929284175C64
    extends Struct {
        public @Unsigned long value;
        public drm_stat_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_dsc_picture_parameter_set")
    @NotUsableInJava
    public static class drm_dsc_picture_parameter_set
    extends Struct {
        public char dsc_version;
        public char pps_identifier;
        public char pps_reserved;
        public char pps_3;
        public char pps_4;
        public char bits_per_pixel_low;
        public @Unsigned @OriginalName(value="__be16") short pic_height;
        public @Unsigned @OriginalName(value="__be16") short pic_width;
        public @Unsigned @OriginalName(value="__be16") short slice_height;
        public @Unsigned @OriginalName(value="__be16") short slice_width;
        public @Unsigned @OriginalName(value="__be16") short chunk_size;
        public char initial_xmit_delay_high;
        public char initial_xmit_delay_low;
        public @Unsigned @OriginalName(value="__be16") short initial_dec_delay;
        public char pps20_reserved;
        public char initial_scale_value;
        public @Unsigned @OriginalName(value="__be16") short scale_increment_interval;
        public char scale_decrement_interval_high;
        public char scale_decrement_interval_low;
        public char pps26_reserved;
        public char first_line_bpg_offset;
        public @Unsigned @OriginalName(value="__be16") short nfl_bpg_offset;
        public @Unsigned @OriginalName(value="__be16") short slice_bpg_offset;
        public @Unsigned @OriginalName(value="__be16") short initial_offset;
        public @Unsigned @OriginalName(value="__be16") short final_offset;
        public char flatness_min_qp;
        public char flatness_max_qp;
        public @Unsigned @OriginalName(value="__be16") short rc_model_size;
        public char rc_edge_factor;
        public char rc_quant_incr_limit0;
        public char rc_quant_incr_limit1;
        public char rc_tgt_offset;
        public char @Size(value=14) [] rc_buf_thresh;
        public @Unsigned @OriginalName(value="__be16") short @Size(value=15) [] rc_range_parameters;
        public char native_422_420;
        public char second_line_bpg_offset;
        public @Unsigned @OriginalName(value="__be16") short nsl_bpg_offset;
        public @Unsigned @OriginalName(value="__be16") short second_line_offset_adj;
        public @Unsigned int pps_long_94_reserved;
        public @Unsigned int pps_long_98_reserved;
        public @Unsigned int pps_long_102_reserved;
        public @Unsigned int pps_long_106_reserved;
        public @Unsigned int pps_long_110_reserved;
        public @Unsigned int pps_long_114_reserved;
        public @Unsigned int pps_long_118_reserved;
        public @Unsigned int pps_long_122_reserved;
        public @Unsigned @OriginalName(value="__be16") short pps_short_126_reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_dsc_config")
    @NotUsableInJava
    public static class drm_dsc_config
    extends Struct {
        public char line_buf_depth;
        public char bits_per_component;
        public boolean convert_rgb;
        public char slice_count;
        public @Unsigned short slice_width;
        public @Unsigned short slice_height;
        public boolean simple_422;
        public @Unsigned short pic_width;
        public @Unsigned short pic_height;
        public char rc_tgt_offset_high;
        public char rc_tgt_offset_low;
        public @Unsigned short bits_per_pixel;
        public char rc_edge_factor;
        public char rc_quant_incr_limit1;
        public char rc_quant_incr_limit0;
        public @Unsigned short initial_xmit_delay;
        public @Unsigned short initial_dec_delay;
        public boolean block_pred_enable;
        public char first_line_bpg_offset;
        public @Unsigned short initial_offset;
        public @Unsigned short @Size(value=14) [] rc_buf_thresh;
        public drm_dsc_rc_range_parameters @Size(value=15) [] rc_range_params;
        public @Unsigned short rc_model_size;
        public char flatness_min_qp;
        public char flatness_max_qp;
        public char initial_scale_value;
        public @Unsigned short scale_decrement_interval;
        public @Unsigned short scale_increment_interval;
        public @Unsigned short nfl_bpg_offset;
        public @Unsigned short slice_bpg_offset;
        public @Unsigned short final_offset;
        public boolean vbr_enable;
        public char mux_word_size;
        public @Unsigned short slice_chunk_size;
        public @Unsigned short rc_bits;
        public char dsc_version_minor;
        public char dsc_version_major;
        public boolean native_422;
        public boolean native_420;
        public char second_line_bpg_offset;
        public @Unsigned short nsl_bpg_offset;
        public @Unsigned short second_line_offset_adj;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_dsc_rc_range_parameters")
    @NotUsableInJava
    public static class drm_dsc_rc_range_parameters
    extends Struct {
        public char range_min_qp;
        public char range_max_qp;
        public char range_bpg_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_self_refresh_data")
    @NotUsableInJava
    public static class drm_self_refresh_data
    extends Struct {
        public Ptr<drm_crtc> crtc;
        public DelayedDefinitions.delayed_work entry_work;
        public runtime.mutex avg_mutex;
        public misc.ewma_psr_time entry_avg_ms;
        public misc.ewma_psr_time exit_avg_ms;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_i2c_encoder_driver")
    @NotUsableInJava
    public static class drm_i2c_encoder_driver
    extends Struct {
        public I2cDefinitions.i2c_driver i2c_driver;
        public Ptr<?> encoder_init;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_encoder_slave")
    @NotUsableInJava
    public static class drm_encoder_slave
    extends Struct {
        public drm_encoder base;
        public Ptr<drm_encoder_slave_funcs> slave_funcs;
        public Ptr<?> slave_priv;
        public Ptr<?> bus_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_encoder_slave_funcs")
    @NotUsableInJava
    public static class drm_encoder_slave_funcs
    extends Struct {
        public Ptr<?> set_config;
        public Ptr<?> destroy;
        public Ptr<?> dpms;
        public Ptr<?> save;
        public Ptr<?> restore;
        public Ptr<?> mode_fixup;
        public Ptr<?> mode_valid;
        public Ptr<?> mode_set;
        public Ptr<?> detect;
        public Ptr<?> get_modes;
        public Ptr<?> create_resources;
        public Ptr<?> set_property;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_panic_line")
    @NotUsableInJava
    public static class drm_panic_line
    extends Struct {
        public @Unsigned int len;
        public String txt;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuva_op")
    @NotUsableInJava
    public static class drm_gpuva_op
    extends Struct {
        public ListDefinitions.list_head entry;
        public drm_gpuva_op_type op;
        @InlineUnion(value=94981)
        public @InlineUnion(value=94981) drm_gpuva_op_map map;
        @InlineUnion(value=94981)
        public @InlineUnion(value=94981) drm_gpuva_op_remap remap;
        @InlineUnion(value=94981)
        public @InlineUnion(value=94981) drm_gpuva_op_unmap unmap;
        @InlineUnion(value=94981)
        public @InlineUnion(value=94981) drm_gpuva_op_prefetch prefetch;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuva_op_prefetch")
    @NotUsableInJava
    public static class drm_gpuva_op_prefetch
    extends Struct {
        public Ptr<drm_gpuva> va;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuva_op_remap")
    @NotUsableInJava
    public static class drm_gpuva_op_remap
    extends Struct {
        public Ptr<drm_gpuva_op_map> prev;
        public Ptr<drm_gpuva_op_map> next;
        public Ptr<drm_gpuva_op_unmap> unmap;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuva_op_unmap")
    @NotUsableInJava
    public static class drm_gpuva_op_unmap
    extends Struct {
        public Ptr<drm_gpuva> va;
        public boolean keep;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuva_op_map")
    @NotUsableInJava
    public static class drm_gpuva_op_map
    extends Struct {
        public misc.va_of_drm_gpuva_and_va_of_drm_gpuva_op_map va;
        public misc.gem_of_drm_gpuva_op_map gem;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_gpuva_op_type")
    public static enum drm_gpuva_op_type implements Enum<drm_gpuva_op_type>,
    TypedEnum<drm_gpuva_op_type, Integer>
    {
        DRM_GPUVA_OP_MAP,
        DRM_GPUVA_OP_REMAP,
        DRM_GPUVA_OP_UNMAP,
        DRM_GPUVA_OP_PREFETCH;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuvm_ops")
    @NotUsableInJava
    public static class drm_gpuvm_ops
    extends Struct {
        public Ptr<?> vm_free;
        public Ptr<?> op_alloc;
        public Ptr<?> op_free;
        public Ptr<?> vm_bo_alloc;
        public Ptr<?> vm_bo_free;
        public Ptr<?> vm_bo_validate;
        public Ptr<?> sm_step_map;
        public Ptr<?> sm_step_remap;
        public Ptr<?> sm_step_unmap;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_gpuvm_flags")
    public static enum drm_gpuvm_flags implements Enum<drm_gpuvm_flags>,
    TypedEnum<drm_gpuvm_flags, Integer>
    {
        DRM_GPUVM_RESV_PROTECTED,
        DRM_GPUVM_USERBITS;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuvm_bo")
    @NotUsableInJava
    public static class drm_gpuvm_bo
    extends Struct {
        public Ptr<drm_gpuvm> vm;
        public Ptr<drm_gem_object> obj;
        public boolean evicted;
        public runtime.kref kref;
        public ListDefinitions.list_of_drm_gpuvm_bo list;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuvm")
    @NotUsableInJava
    public static class drm_gpuvm
    extends Struct {
        public String name;
        public drm_gpuvm_flags flags;
        public Ptr<drm_device> drm;
        public @Unsigned long mm_start;
        public @Unsigned long mm_range;
        public RbDefinitions.rb_of_drm_gpuvm rb;
        public runtime.kref kref;
        public drm_gpuva kernel_alloc_node;
        public Ptr<drm_gpuvm_ops> ops;
        public Ptr<drm_gem_object> r_obj;
        public misc.evict_of_drm_gpuvm_and_extobj_of_drm_gpuvm extobj;
        public misc.evict_of_drm_gpuvm_and_extobj_of_drm_gpuvm evict;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gpuva")
    @NotUsableInJava
    public static class drm_gpuva
    extends Struct {
        public Ptr<drm_gpuvm> vm;
        public Ptr<drm_gpuvm_bo> vm_bo;
        public drm_gpuva_flags flags;
        public misc.va_of_drm_gpuva_and_va_of_drm_gpuva_op_map va;
        public misc.gem_of_drm_gpuva gem;
        public RbDefinitions.rb_of_drm_gpuva rb;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_gpuva_flags")
    public static enum drm_gpuva_flags implements Enum<drm_gpuva_flags>,
    TypedEnum<drm_gpuva_flags, Integer>
    {
        DRM_GPUVA_INVALIDATED,
        DRM_GPUVA_SPARSE,
        DRM_GPUVA_USERBITS;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_exec")
    @NotUsableInJava
    public static class drm_exec
    extends Struct {
        public @Unsigned int flags;
        public misc.ww_acquire_ctx ticket;
        public @Unsigned int num_objects;
        public @Unsigned int max_objects;
        public Ptr<Ptr<drm_gem_object>> objects;
        public Ptr<drm_gem_object> contended;
        public Ptr<drm_gem_object> prelocked;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_vma_offset_file")
    @NotUsableInJava
    public static class drm_vma_offset_file
    extends Struct {
        public RbDefinitions.rb_node vm_rb;
        public Ptr<drm_file> vm_tag;
        public @Unsigned long vm_count;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj")
    @NotUsableInJava
    public static class drm_syncobj
    extends Struct {
        public runtime.kref refcount;
        public Ptr<DmaDefinitions.dma_fence> fence;
        public ListDefinitions.list_head cb_list;
        public ListDefinitions.list_head ev_fd_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<runtime.file> file;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_timeline_array")
    @NotUsableInJava
    public static class drm_syncobj_timeline_array
    extends Struct {
        public @Unsigned long handles;
        public @Unsigned long points;
        public @Unsigned int count_handles;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_array")
    @NotUsableInJava
    public static class drm_syncobj_array
    extends Struct {
        public @Unsigned long handles;
        public @Unsigned int count_handles;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_eventfd")
    @NotUsableInJava
    public static class drm_syncobj_eventfd
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int flags;
        public @Unsigned long point;
        public int fd;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_timeline_wait")
    @NotUsableInJava
    public static class drm_syncobj_timeline_wait
    extends Struct {
        public @Unsigned long handles;
        public @Unsigned long points;
        public long timeout_nsec;
        public @Unsigned int count_handles;
        public @Unsigned int flags;
        public @Unsigned int first_signaled;
        public @Unsigned int pad;
        public @Unsigned long deadline_nsec;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_wait")
    @NotUsableInJava
    public static class drm_syncobj_wait
    extends Struct {
        public @Unsigned long handles;
        public long timeout_nsec;
        public @Unsigned int count_handles;
        public @Unsigned int flags;
        public @Unsigned int first_signaled;
        public @Unsigned int pad;
        public @Unsigned long deadline_nsec;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_transfer")
    @NotUsableInJava
    public static class drm_syncobj_transfer
    extends Struct {
        public @Unsigned int src_handle;
        public @Unsigned int dst_handle;
        public @Unsigned long src_point;
        public @Unsigned long dst_point;
        public @Unsigned int flags;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_handle")
    @NotUsableInJava
    public static class drm_syncobj_handle
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int flags;
        public int fd;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_destroy")
    @NotUsableInJava
    public static class drm_syncobj_destroy
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_syncobj_create")
    @NotUsableInJava
    public static class drm_syncobj_create
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_print_iterator")
    @NotUsableInJava
    public static class drm_print_iterator
    extends Struct {
        public Ptr<?> data;
        public @OriginalName(value="ssize_t") long start;
        public @OriginalName(value="ssize_t") long remain;
        public @OriginalName(value="ssize_t") long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_revoke_lease")
    @NotUsableInJava
    public static class drm_mode_revoke_lease
    extends Struct {
        public @Unsigned int lessee_id;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_lease")
    @NotUsableInJava
    public static class drm_mode_get_lease
    extends Struct {
        public @Unsigned int count_objects;
        public @Unsigned int pad;
        public @Unsigned long objects_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_list_lessees")
    @NotUsableInJava
    public static class drm_mode_list_lessees
    extends Struct {
        public @Unsigned int count_lessees;
        public @Unsigned int pad;
        public @Unsigned long lessees_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_create_lease")
    @NotUsableInJava
    public static class drm_mode_create_lease
    extends Struct {
        public @Unsigned long object_ids;
        public @Unsigned int object_count;
        public @Unsigned int flags;
        public @Unsigned int lessee_id;
        public @Unsigned int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_edid_iter")
    @NotUsableInJava
    public static class drm_edid_iter
    extends Struct {
        public Ptr<drm_edid> drm_edid;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_edid_match_closure")
    @NotUsableInJava
    public static class drm_edid_match_closure
    extends Struct {
        public Ptr<drm_edid_ident> ident;
        public boolean matched;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_edid_ident")
    @NotUsableInJava
    public static class drm_edid_ident
    extends Struct {
        public @Unsigned int panel_id;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_conn_prop_enum_list")
    @NotUsableInJava
    public static class drm_conn_prop_enum_list
    extends Struct {
        public int type;
        public String name;
        public runtime.ida ida;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_connector_set_property")
    @NotUsableInJava
    public static class drm_mode_connector_set_property
    extends Struct {
        public @Unsigned long value;
        public @Unsigned int prop_id;
        public @Unsigned int connector_id;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_connector")
    @NotUsableInJava
    public static class drm_mode_get_connector
    extends Struct {
        public @Unsigned long encoders_ptr;
        public @Unsigned long modes_ptr;
        public @Unsigned long props_ptr;
        public @Unsigned long prop_values_ptr;
        public @Unsigned int count_modes;
        public @Unsigned int count_props;
        public @Unsigned int count_encoders;
        public @Unsigned int encoder_id;
        public @Unsigned int connector_id;
        public @Unsigned int connector_type;
        public @Unsigned int connector_type_id;
        public @Unsigned int connection;
        public @Unsigned int mm_width;
        public @Unsigned int mm_height;
        public @Unsigned int subpixel;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_edid_product_id")
    @NotUsableInJava
    public static class drm_edid_product_id
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short manufacturer_name;
        public @Unsigned @OriginalName(value="__le16") short product_code;
        public @Unsigned @OriginalName(value="__le32") int serial_number;
        public char week_of_manufacture;
        public char year_of_manufacture;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_dmi_panel_orientation_data")
    @NotUsableInJava
    public static class drm_dmi_panel_orientation_data
    extends Struct {
        public int width;
        public int height;
        public Ptr<String> bios_dates;
        public int orientation;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_queue_sequence")
    @NotUsableInJava
    public static class drm_crtc_queue_sequence
    extends Struct {
        public @Unsigned int crtc_id;
        public @Unsigned int flags;
        public @Unsigned long sequence;
        public @Unsigned long user_data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_get_sequence")
    @NotUsableInJava
    public static class drm_crtc_get_sequence
    extends Struct {
        public @Unsigned int crtc_id;
        public @Unsigned int active;
        public @Unsigned long sequence;
        public long sequence_ns;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_property_enum")
    @NotUsableInJava
    public static class drm_property_enum
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long value;
        public ListDefinitions.list_head head;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_destroy_blob")
    @NotUsableInJava
    public static class drm_mode_destroy_blob
    extends Struct {
        public @Unsigned int blob_id;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_create_blob")
    @NotUsableInJava
    public static class drm_mode_create_blob
    extends Struct {
        public @Unsigned long data;
        public @Unsigned int length;
        public @Unsigned int blob_id;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_blob")
    @NotUsableInJava
    public static class drm_mode_get_blob
    extends Struct {
        public @Unsigned int blob_id;
        public @Unsigned int length;
        public @Unsigned long data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_property")
    @NotUsableInJava
    public static class drm_mode_get_property
    extends Struct {
        public @Unsigned long values_ptr;
        public @Unsigned long enum_blob_ptr;
        public @Unsigned int prop_id;
        public @Unsigned int flags;
        public char @Size(value=32) [] name;
        public @Unsigned int count_values;
        public @Unsigned int count_enum_blobs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_property_enum")
    @NotUsableInJava
    public static class drm_mode_property_enum
    extends Struct {
        public @Unsigned long value;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_named_mode")
    @NotUsableInJava
    public static class drm_named_mode
    extends Struct {
        public String name;
        public @Unsigned int pixel_clock_khz;
        public @Unsigned int xres;
        public @Unsigned int yres;
        public @Unsigned int flags;
        public @Unsigned int tv_mode;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_mode_analog")
    public static enum drm_mode_analog implements Enum<drm_mode_analog>,
    TypedEnum<drm_mode_analog, Integer>
    {
        DRM_MODE_ANALOG_NTSC,
        DRM_MODE_ANALOG_PAL;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_bus_flags")
    public static enum drm_bus_flags implements Enum<drm_bus_flags>,
    TypedEnum<drm_bus_flags, Integer>
    {
        DRM_BUS_FLAG_DE_LOW,
        DRM_BUS_FLAG_DE_HIGH,
        DRM_BUS_FLAG_PIXDATA_DRIVE_POSEDGE,
        DRM_BUS_FLAG_PIXDATA_DRIVE_NEGEDGE,
        DRM_BUS_FLAG_PIXDATA_SAMPLE_POSEDGE,
        DRM_BUS_FLAG_PIXDATA_SAMPLE_NEGEDGE,
        DRM_BUS_FLAG_DATA_MSB_TO_LSB,
        DRM_BUS_FLAG_DATA_LSB_TO_MSB,
        DRM_BUS_FLAG_SYNC_DRIVE_POSEDGE,
        DRM_BUS_FLAG_SYNC_DRIVE_NEGEDGE,
        DRM_BUS_FLAG_SYNC_SAMPLE_POSEDGE,
        DRM_BUS_FLAG_SYNC_SAMPLE_NEGEDGE,
        DRM_BUS_FLAG_SHARP_SIGNALS;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_rmfb_work")
    @NotUsableInJava
    public static class drm_mode_rmfb_work
    extends Struct {
        public misc.work_struct work;
        public ListDefinitions.list_head fbs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_closefb")
    @NotUsableInJava
    public static class drm_mode_closefb
    extends Struct {
        public @Unsigned int fb_id;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_fb_dirty_cmd")
    @NotUsableInJava
    public static class drm_mode_fb_dirty_cmd
    extends Struct {
        public @Unsigned int fb_id;
        public @Unsigned int flags;
        public @Unsigned int color;
        public @Unsigned int num_clips;
        public @Unsigned long clips_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_fb_cmd")
    @NotUsableInJava
    public static class drm_mode_fb_cmd
    extends Struct {
        public @Unsigned int fb_id;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int pitch;
        public @Unsigned int bpp;
        public @Unsigned int depth;
        public @Unsigned int handle;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_debugfs_entry")
    @NotUsableInJava
    public static class drm_debugfs_entry
    extends Struct {
        public Ptr<drm_device> dev;
        public drm_debugfs_info file;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_debugfs_info")
    @NotUsableInJava
    public static class drm_debugfs_info
    extends Struct {
        public String name;
        public Ptr<?> show;
        public @Unsigned int driver_features;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_out_fence_state")
    @NotUsableInJava
    public static class drm_out_fence_state
    extends Struct {
        public Ptr<Integer> out_fence_ptr;
        public Ptr<SyncDefinitions.sync_file> sync_file;
        public int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_atomic")
    @NotUsableInJava
    public static class drm_mode_atomic
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int count_objs;
        public @Unsigned long objs_ptr;
        public @Unsigned long count_props_ptr;
        public @Unsigned long props_ptr;
        public @Unsigned long prop_values_ptr;
        public @Unsigned long reserved;
        public @Unsigned long user_data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_afbc_framebuffer")
    @NotUsableInJava
    public static class drm_afbc_framebuffer
    extends Struct {
        public drm_framebuffer base;
        public @Unsigned int block_width;
        public @Unsigned int block_height;
        public @Unsigned int aligned_width;
        public @Unsigned int aligned_height;
        public @Unsigned int offset;
        public @Unsigned int afbc_size;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_flip_task")
    @NotUsableInJava
    public static class drm_flip_task
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_flip_work")
    @NotUsableInJava
    public static class drm_flip_work
    extends Struct {
        public String name;
        public @OriginalName(value="drm_flip_func_t") Ptr<?> func;
        public misc.work_struct worker;
        public ListDefinitions.list_head queued;
        public ListDefinitions.list_head commited;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_writeback_connector")
    @NotUsableInJava
    public static class drm_writeback_connector
    extends Struct {
        public drm_connector base;
        public drm_encoder encoder;
        public Ptr<drm_property_blob> pixel_formats_blob_ptr;
        public  @OriginalName(value="spinlock_t") runtime.spinlock job_lock;
        public ListDefinitions.list_head job_queue;
        public @Unsigned int fence_context;
        public  @OriginalName(value="spinlock_t") runtime.spinlock fence_lock;
        public @Unsigned long fence_seqno;
        public char @Size(value=32) [] timeline_name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_writeback_job")
    @NotUsableInJava
    public static class drm_writeback_job
    extends Struct {
        public Ptr<drm_writeback_connector> connector;
        public boolean prepared;
        public misc.work_struct cleanup_work;
        public ListDefinitions.list_head list_entry;
        public Ptr<drm_framebuffer> fb;
        public Ptr<DmaDefinitions.dma_fence> out_fence;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_info_node")
    @NotUsableInJava
    public static class drm_info_node
    extends Struct {
        public Ptr<drm_minor> minor;
        public Ptr<drm_info_list> info_ent;
        public ListDefinitions.list_head list;
        public Ptr<runtime.dentry> dent;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_info_list")
    @NotUsableInJava
    public static class drm_info_list
    extends Struct {
        public String name;
        public Ptr<?> show;
        public @Unsigned int driver_features;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_fb_cmd232")
    @NotUsableInJava
    public static class drm_mode_fb_cmd232
    extends Struct {
        public @Unsigned int fb_id;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int pixel_format;
        public @Unsigned int flags;
        public @Unsigned int @Size(value=4) [] handles;
        public @Unsigned int @Size(value=4) [] pitches;
        public @Unsigned int @Size(value=4) [] offsets;
        public @Unsigned long @Size(value=4) [] modifier;
    }

    @Type(noCCodeGeneration=true, cType="union drm_wait_vblank32")
    @NotUsableInJava
    public static class drm_wait_vblank32
    extends Union {
        public drm_wait_vblank_request32 request;
        public drm_wait_vblank_reply32 reply;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_wait_vblank_reply32")
    @NotUsableInJava
    public static class drm_wait_vblank_reply32
    extends Struct {
        public drm_vblank_seq_type type;
        public @Unsigned int sequence;
        public int tval_sec;
        public int tval_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_wait_vblank_request32")
    @NotUsableInJava
    public static class drm_wait_vblank_request32
    extends Struct {
        public drm_vblank_seq_type type;
        public @Unsigned int sequence;
        public @Unsigned int signal;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_stats32")
    @NotUsableInJava
    public static class drm_stats32
    extends Struct {
        public @Unsigned int count;
        public AnonymousType741370455C59 @Size(value=15) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_client32")
    @NotUsableInJava
    public static class drm_client32
    extends Struct {
        public int idx;
        public int auth;
        public @Unsigned int pid;
        public @Unsigned int uid;
        public @Unsigned int magic;
        public @Unsigned int iocs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_unique32")
    @NotUsableInJava
    public static class drm_unique32
    extends Struct {
        public @Unsigned int unique_len;
        public @Unsigned int unique;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_version_32")
    @NotUsableInJava
    public static class drm_version_32
    extends Struct {
        public int version_major;
        public int version_minor;
        public int version_patchlevel;
        public @Unsigned int name_len;
        public @Unsigned int name;
        public @Unsigned int date_len;
        public @Unsigned int date;
        public @Unsigned int desc_len;
        public @Unsigned int desc;
    }

    @Type(noCCodeGeneration=true, cType="union drm_wait_vblank")
    @NotUsableInJava
    public static class drm_wait_vblank
    extends Union {
        public drm_wait_vblank_request request;
        public drm_wait_vblank_reply reply;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_wait_vblank_reply")
    @NotUsableInJava
    public static class drm_wait_vblank_reply
    extends Struct {
        public drm_vblank_seq_type type;
        public @Unsigned int sequence;
        public long tval_sec;
        public long tval_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_wait_vblank_request")
    @NotUsableInJava
    public static class drm_wait_vblank_request
    extends Struct {
        public drm_vblank_seq_type type;
        public @Unsigned int sequence;
        public @Unsigned long signal;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_vblank_seq_type")
    public static enum drm_vblank_seq_type implements Enum<drm_vblank_seq_type>,
    TypedEnum<drm_vblank_seq_type, Integer>
    {
        _DRM_VBLANK_ABSOLUTE,
        _DRM_VBLANK_RELATIVE,
        _DRM_VBLANK_HIGH_CRTC_MASK,
        _DRM_VBLANK_EVENT,
        _DRM_VBLANK_FLIP,
        _DRM_VBLANK_NEXTONMISS,
        _DRM_VBLANK_SECONDARY,
        _DRM_VBLANK_SIGNAL;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_rect")
    @NotUsableInJava
    public static class drm_mode_rect
    extends Struct {
        public int x1;
        public int y1;
        public int x2;
        public int y2;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_format_modifier")
    @NotUsableInJava
    public static class drm_format_modifier
    extends Struct {
        public @Unsigned long formats;
        public @Unsigned int offset;
        public @Unsigned int pad;
        public @Unsigned long modifier;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_format_modifier_blob")
    @NotUsableInJava
    public static class drm_format_modifier_blob
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int flags;
        public @Unsigned int count_formats;
        public @Unsigned int formats_offset;
        public @Unsigned int count_modifiers;
        public @Unsigned int modifiers_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_crtc_page_flip_target")
    @NotUsableInJava
    public static class drm_mode_crtc_page_flip_target
    extends Struct {
        public @Unsigned int crtc_id;
        public @Unsigned int fb_id;
        public @Unsigned int flags;
        public @Unsigned int sequence;
        public @Unsigned long user_data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_plane_size_hint")
    @NotUsableInJava
    public static class drm_plane_size_hint
    extends Struct {
        public @Unsigned short width;
        public @Unsigned short height;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_cursor2")
    @NotUsableInJava
    public static class drm_mode_cursor2
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int crtc_id;
        public int x;
        public int y;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int handle;
        public int hot_x;
        public int hot_y;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_cursor")
    @NotUsableInJava
    public static class drm_mode_cursor
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int crtc_id;
        public int x;
        public int y;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int handle;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_plane_res")
    @NotUsableInJava
    public static class drm_mode_get_plane_res
    extends Struct {
        public @Unsigned long plane_id_ptr;
        public @Unsigned int count_planes;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_plane")
    @NotUsableInJava
    public static class drm_mode_get_plane
    extends Struct {
        public @Unsigned int plane_id;
        public @Unsigned int crtc_id;
        public @Unsigned int fb_id;
        public @Unsigned int possible_crtcs;
        public @Unsigned int gamma_size;
        public @Unsigned int count_format_types;
        public @Unsigned long format_type_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_set_plane")
    @NotUsableInJava
    public static class drm_mode_set_plane
    extends Struct {
        public @Unsigned int plane_id;
        public @Unsigned int crtc_id;
        public @Unsigned int fb_id;
        public @Unsigned int flags;
        public int crtc_x;
        public int crtc_y;
        public @Unsigned int crtc_w;
        public @Unsigned int crtc_h;
        public @Unsigned int src_x;
        public @Unsigned int src_y;
        public @Unsigned int src_h;
        public @Unsigned int src_w;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_card_res")
    @NotUsableInJava
    public static class drm_mode_card_res
    extends Struct {
        public @Unsigned long fb_id_ptr;
        public @Unsigned long crtc_id_ptr;
        public @Unsigned long connector_id_ptr;
        public @Unsigned long encoder_id_ptr;
        public @Unsigned int count_fbs;
        public @Unsigned int count_crtcs;
        public @Unsigned int count_connectors;
        public @Unsigned int count_encoders;
        public @Unsigned int min_width;
        public @Unsigned int max_width;
        public @Unsigned int min_height;
        public @Unsigned int max_height;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_open")
    @NotUsableInJava
    public static class drm_gem_open
    extends Struct {
        public @Unsigned int name;
        public @Unsigned int handle;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_flink")
    @NotUsableInJava
    public static class drm_gem_flink
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_close")
    @NotUsableInJava
    public static class drm_gem_close
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_get_encoder")
    @NotUsableInJava
    public static class drm_mode_get_encoder
    extends Struct {
        public @Unsigned int encoder_id;
        public @Unsigned int encoder_type;
        public @Unsigned int crtc_id;
        public @Unsigned int possible_crtcs;
        public @Unsigned int possible_clones;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_crtc")
    @NotUsableInJava
    public static class drm_mode_crtc
    extends Struct {
        public @Unsigned long set_connectors_ptr;
        public @Unsigned int count_connectors;
        public @Unsigned int crtc_id;
        public @Unsigned int fb_id;
        public @Unsigned int x;
        public @Unsigned int y;
        public @Unsigned int gamma_size;
        public @Unsigned int mode_valid;
        public drm_mode_modeinfo mode;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_modeinfo")
    @NotUsableInJava
    public static class drm_mode_modeinfo
    extends Struct {
        public @Unsigned int clock;
        public @Unsigned short hdisplay;
        public @Unsigned short hsync_start;
        public @Unsigned short hsync_end;
        public @Unsigned short htotal;
        public @Unsigned short hskew;
        public @Unsigned short vdisplay;
        public @Unsigned short vsync_start;
        public @Unsigned short vsync_end;
        public @Unsigned short vtotal;
        public @Unsigned short vscan;
        public @Unsigned int vrefresh;
        public @Unsigned int flags;
        public @Unsigned int type;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_client_offset")
    @NotUsableInJava
    public static class drm_client_offset
    extends Struct {
        public int x;
        public int y;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_shadow_plane_state")
    @NotUsableInJava
    public static class drm_shadow_plane_state
    extends Struct {
        public drm_plane_state base;
        public drm_format_conv_state fmtcnv_state;
        public misc.iosys_map @Size(value=4) [] map;
        public misc.iosys_map @Size(value=4) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_atomic_helper_damage_iter")
    @NotUsableInJava
    public static class drm_atomic_helper_damage_iter
    extends Struct {
        public drm_rect plane_src;
        public Ptr<drm_rect> clips;
        public @Unsigned @OriginalName(value="uint32_t") int num_clips;
        public @Unsigned @OriginalName(value="uint32_t") int curr_clip;
        public boolean full_update;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_scanout_buffer")
    @NotUsableInJava
    public static class drm_scanout_buffer
    extends Struct {
        public Ptr<drm_format_info> format;
        public misc.iosys_map @Size(value=4) [] map;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int @Size(value=4) [] pitch;
        public Ptr<?> set_pixel;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_simple_display_pipe")
    @NotUsableInJava
    public static class drm_simple_display_pipe
    extends Struct {
        public drm_crtc crtc;
        public drm_plane plane;
        public drm_encoder encoder;
        public Ptr<drm_connector> connector;
        public Ptr<drm_simple_display_pipe_funcs> funcs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_simple_display_pipe_funcs")
    @NotUsableInJava
    public static class drm_simple_display_pipe_funcs
    extends Struct {
        public Ptr<?> mode_valid;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> check;
        public Ptr<?> update;
        public Ptr<?> prepare_fb;
        public Ptr<?> cleanup_fb;
        public Ptr<?> begin_fb_access;
        public Ptr<?> end_fb_access;
        public Ptr<?> enable_vblank;
        public Ptr<?> disable_vblank;
        public Ptr<?> reset_crtc;
        public Ptr<?> duplicate_crtc_state;
        public Ptr<?> destroy_crtc_state;
        public Ptr<?> reset_plane;
        public Ptr<?> duplicate_plane_state;
        public Ptr<?> destroy_plane_state;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_bridge_ops")
    public static enum drm_bridge_ops implements Enum<drm_bridge_ops>,
    TypedEnum<drm_bridge_ops, Integer>
    {
        DRM_BRIDGE_OP_DETECT,
        DRM_BRIDGE_OP_EDID,
        DRM_BRIDGE_OP_HPD,
        DRM_BRIDGE_OP_MODES,
        DRM_BRIDGE_OP_HDMI;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_bridge_timings")
    @NotUsableInJava
    public static class drm_bridge_timings
    extends Struct {
        public @Unsigned int input_bus_flags;
        public @Unsigned int setup_time_ps;
        public @Unsigned int hold_time_ps;
        public boolean dual_link;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_bridge_funcs")
    @NotUsableInJava
    public static class drm_bridge_funcs
    extends Struct {
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> mode_valid;
        public Ptr<?> mode_fixup;
        public Ptr<?> disable;
        public Ptr<?> post_disable;
        public Ptr<?> mode_set;
        public Ptr<?> pre_enable;
        public Ptr<?> enable;
        public Ptr<?> atomic_pre_enable;
        public Ptr<?> atomic_enable;
        public Ptr<?> atomic_disable;
        public Ptr<?> atomic_post_disable;
        public Ptr<?> atomic_duplicate_state;
        public Ptr<?> atomic_destroy_state;
        public Ptr<?> atomic_get_output_bus_fmts;
        public Ptr<?> atomic_get_input_bus_fmts;
        public Ptr<?> atomic_check;
        public Ptr<?> atomic_reset;
        public Ptr<?> detect;
        public Ptr<?> get_modes;
        public Ptr<?> edid_read;
        public Ptr<?> hpd_notify;
        public Ptr<?> hpd_enable;
        public Ptr<?> hpd_disable;
        public Ptr<?> hdmi_tmds_char_rate_valid;
        public Ptr<?> hdmi_clear_infoframe;
        public Ptr<?> hdmi_write_infoframe;
        public Ptr<?> debugfs_init;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_bridge_attach_flags")
    public static enum drm_bridge_attach_flags implements Enum<drm_bridge_attach_flags>,
    TypedEnum<drm_bridge_attach_flags, Integer>
    {
        DRM_BRIDGE_ATTACH_NO_CONNECTOR;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_bridge")
    @NotUsableInJava
    public static class drm_bridge
    extends Struct {
        public drm_private_obj base;
        public Ptr<drm_device> dev;
        public Ptr<drm_encoder> encoder;
        public ListDefinitions.list_head chain_node;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public ListDefinitions.list_head list;
        public Ptr<drm_bridge_timings> timings;
        public Ptr<drm_bridge_funcs> funcs;
        public Ptr<?> driver_private;
        public drm_bridge_ops ops;
        public int type;
        public boolean interlace_allowed;
        public boolean pre_enable_prev_first;
        public Ptr<I2cDefinitions.i2c_adapter> ddc;
        public runtime.mutex hpd_mutex;
        public Ptr<?> hpd_cb;
        public Ptr<?> hpd_data;
        public String vendor;
        public String product;
        public @Unsigned int supported_formats;
        public @Unsigned int max_bpc;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_bridge_state")
    @NotUsableInJava
    public static class drm_bridge_state
    extends Struct {
        public drm_private_state base;
        public Ptr<drm_bridge> bridge;
        public drm_bus_cfg input_bus_cfg;
        public drm_bus_cfg output_bus_cfg;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_bus_cfg")
    @NotUsableInJava
    public static class drm_bus_cfg
    extends Struct {
        public @Unsigned int format;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_format_conv_state")
    @NotUsableInJava
    public static class drm_format_conv_state
    extends Struct {
        public misc.tmp_of_drm_format_conv_state tmp;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_encoder_helper_funcs")
    @NotUsableInJava
    public static class drm_encoder_helper_funcs
    extends Struct {
        public Ptr<?> dpms;
        public Ptr<?> mode_valid;
        public Ptr<?> mode_fixup;
        public Ptr<?> prepare;
        public Ptr<?> commit;
        public Ptr<?> mode_set;
        public Ptr<?> atomic_mode_set;
        public Ptr<?> detect;
        public Ptr<?> atomic_disable;
        public Ptr<?> atomic_enable;
        public Ptr<?> disable;
        public Ptr<?> enable;
        public Ptr<?> atomic_check;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_encoder_funcs")
    @NotUsableInJava
    public static class drm_encoder_funcs
    extends Struct {
        public Ptr<?> reset;
        public Ptr<?> destroy;
        public Ptr<?> late_register;
        public Ptr<?> early_unregister;
        public Ptr<?> debugfs_init;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_list_iter")
    @NotUsableInJava
    public static class drm_connector_list_iter
    extends Struct {
        public Ptr<drm_device> dev;
        public Ptr<drm_connector> conn;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_encoder")
    @NotUsableInJava
    public static class drm_encoder
    extends Struct {
        public Ptr<drm_device> dev;
        public ListDefinitions.list_head head;
        public drm_mode_object base;
        public String name;
        public int encoder_type;
        public @Unsigned int index;
        public @Unsigned @OriginalName(value="uint32_t") int possible_crtcs;
        public @Unsigned @OriginalName(value="uint32_t") int possible_clones;
        public Ptr<drm_crtc> crtc;
        public ListDefinitions.list_head bridge_chain;
        public Ptr<drm_encoder_funcs> funcs;
        public Ptr<drm_encoder_helper_funcs> helper_private;
        public Ptr<runtime.dentry> debugfs_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_shmem_object")
    @NotUsableInJava
    public static class drm_gem_shmem_object
    extends Struct {
        public drm_gem_object base;
        public Ptr<Ptr<runtime.page>> pages;
        public @Unsigned int pages_use_count;
        public int madv;
        public ListDefinitions.list_head madv_list;
        public Ptr<SgDefinitions.sg_table> sgt;
        public Ptr<?> vaddr;
        public @Unsigned int vmap_use_count;
        public boolean pages_mark_dirty_on_put;
        public boolean pages_mark_accessed_on_put;
        public boolean map_wc;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_fb_helper_funcs")
    @NotUsableInJava
    public static class drm_fb_helper_funcs
    extends Struct {
        public Ptr<?> fb_probe;
        public Ptr<?> fb_dirty;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_fb_helper_surface_size")
    @NotUsableInJava
    public static class drm_fb_helper_surface_size
    extends Struct {
        public @Unsigned int fb_width;
        public @Unsigned int fb_height;
        public @Unsigned int surface_width;
        public @Unsigned int surface_height;
        public @Unsigned int surface_bpp;
        public @Unsigned int surface_depth;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_client_buffer")
    @NotUsableInJava
    public static class drm_client_buffer
    extends Struct {
        public Ptr<drm_client_dev> client;
        public @Unsigned int pitch;
        public Ptr<drm_gem_object> gem;
        public misc.iosys_map map;
        public Ptr<drm_framebuffer> fb;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_client_dev")
    @NotUsableInJava
    public static class drm_client_dev
    extends Struct {
        public Ptr<drm_device> dev;
        public String name;
        public ListDefinitions.list_head list;
        public Ptr<drm_client_funcs> funcs;
        public Ptr<drm_file> file;
        public runtime.mutex modeset_mutex;
        public Ptr<drm_mode_set> modesets;
        public boolean hotplug_failed;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_client_funcs")
    @NotUsableInJava
    public static class drm_client_funcs
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> unregister;
        public Ptr<?> restore;
        public Ptr<?> hotplug;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_fb_helper")
    @NotUsableInJava
    public static class drm_fb_helper
    extends Struct {
        public drm_client_dev client;
        public Ptr<drm_client_buffer> buffer;
        public Ptr<drm_framebuffer> fb;
        public Ptr<drm_device> dev;
        public Ptr<drm_fb_helper_funcs> funcs;
        public Ptr<FbDefinitions.fb_info> info;
        public @Unsigned int @Size(value=17) [] pseudo_palette;
        public drm_clip_rect damage_clip;
        public  @OriginalName(value="spinlock_t") runtime.spinlock damage_lock;
        public misc.work_struct damage_work;
        public misc.work_struct resume_work;
        public runtime.mutex lock;
        public ListDefinitions.list_head kernel_fb_list;
        public boolean delayed_hotplug;
        public boolean deferred_setup;
        public int preferred_bpp;
        public FbDefinitions.fb_deferred_io fbdefio;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_privacy_screen_ops")
    @NotUsableInJava
    public static class drm_privacy_screen_ops
    extends Struct {
        public Ptr<?> set_sw_state;
        public Ptr<?> get_hw_state;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_privacy_screen")
    @NotUsableInJava
    public static class drm_privacy_screen
    extends Struct {
        public runtime.device dev;
        public runtime.mutex lock;
        public ListDefinitions.list_head list;
        public misc.blocking_notifier_head notifier_head;
        public Ptr<drm_privacy_screen_ops> ops;
        public drm_privacy_screen_status sw_state;
        public drm_privacy_screen_status hw_state;
        public Ptr<?> drvdata;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_privacy_screen_lookup")
    @NotUsableInJava
    public static class drm_privacy_screen_lookup
    extends Struct {
        public ListDefinitions.list_head list;
        public String dev_id;
        public String con_id;
        public String provider;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_panel_follower")
    @NotUsableInJava
    public static class drm_panel_follower
    extends Struct {
        public Ptr<drm_panel_follower_funcs> funcs;
        public ListDefinitions.list_head list;
        public Ptr<drm_panel> panel;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_panel_follower_funcs")
    @NotUsableInJava
    public static class drm_panel_follower_funcs
    extends Struct {
        public Ptr<?> panel_prepared;
        public Ptr<?> panel_unpreparing;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_panel")
    @NotUsableInJava
    public static class drm_panel
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<BacklightDefinitions.backlight_device> backlight;
        public Ptr<drm_panel_funcs> funcs;
        public int connector_type;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head followers;
        public runtime.mutex follower_lock;
        public boolean prepare_prev_first;
        public boolean prepared;
        public boolean enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_panel_funcs")
    @NotUsableInJava
    public static class drm_panel_funcs
    extends Struct {
        public Ptr<?> prepare;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> unprepare;
        public Ptr<?> get_modes;
        public Ptr<?> get_orientation;
        public Ptr<?> get_timings;
        public Ptr<?> debugfs_init;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_vblank_work")
    @NotUsableInJava
    public static class drm_vblank_work
    extends Struct {
        public KthreadDefinitions.kthread_work base;
        public Ptr<drm_vblank_crtc> vblank;
        public @Unsigned long count;
        public int cancelling;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_prime_member")
    @NotUsableInJava
    public static class drm_prime_member
    extends Struct {
        public Ptr<DmaDefinitions.dma_buf> dma_buf;
        public @Unsigned @OriginalName(value="uint32_t") int handle;
        public RbDefinitions.rb_node dmabuf_rb;
        public RbDefinitions.rb_node handle_rb;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_framebuffer_funcs")
    @NotUsableInJava
    public static class drm_framebuffer_funcs
    extends Struct {
        public Ptr<?> destroy;
        public Ptr<?> create_handle;
        public Ptr<?> dirty;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_framebuffer")
    @NotUsableInJava
    public static class drm_framebuffer
    extends Struct {
        public Ptr<drm_device> dev;
        public ListDefinitions.list_head head;
        public drm_mode_object base;
        public char @Size(value=16) [] comm;
        public Ptr<drm_format_info> format;
        public Ptr<drm_framebuffer_funcs> funcs;
        public @Unsigned int @Size(value=4) [] pitches;
        public @Unsigned int @Size(value=4) [] offsets;
        public @Unsigned @OriginalName(value="uint64_t") long modifier;
        public @Unsigned int width;
        public @Unsigned int height;
        public int flags;
        public ListDefinitions.list_head filp_head;
        public Ptr<drm_gem_object> @Size(value=4) [] obj;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_prime_handle")
    @NotUsableInJava
    public static class drm_prime_handle
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int flags;
        public int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_clip_rect")
    @NotUsableInJava
    public static class drm_clip_rect
    extends Struct {
        public @Unsigned short x1;
        public @Unsigned short y1;
        public @Unsigned short x2;
        public @Unsigned short y2;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_obj_set_property")
    @NotUsableInJava
    public static class drm_mode_obj_set_property
    extends Struct {
        public @Unsigned long value;
        public @Unsigned int prop_id;
        public @Unsigned int obj_id;
        public @Unsigned int obj_type;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_obj_get_properties")
    @NotUsableInJava
    public static class drm_mode_obj_get_properties
    extends Struct {
        public @Unsigned long props_ptr;
        public @Unsigned long prop_values_ptr;
        public @Unsigned int count_props;
        public @Unsigned int obj_id;
        public @Unsigned int obj_type;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mm_scan")
    @NotUsableInJava
    public static class drm_mm_scan
    extends Struct {
        public Ptr<drm_mm> mm;
        public @Unsigned long size;
        public @Unsigned long alignment;
        public @Unsigned long remainder_mask;
        public @Unsigned long range_start;
        public @Unsigned long range_end;
        public @Unsigned long hit_start;
        public @Unsigned long hit_end;
        public @Unsigned long color;
        public drm_mm_insert_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_mm_insert_mode")
    public static enum drm_mm_insert_mode implements Enum<drm_mm_insert_mode>,
    TypedEnum<drm_mm_insert_mode, Integer>
    {
        DRM_MM_INSERT_BEST,
        DRM_MM_INSERT_LOW,
        DRM_MM_INSERT_HIGH,
        DRM_MM_INSERT_EVICT,
        DRM_MM_INSERT_ONCE,
        DRM_MM_INSERT_HIGHEST,
        DRM_MM_INSERT_LOWEST;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_pending_vblank_event")
    @NotUsableInJava
    public static class drm_pending_vblank_event
    extends Struct {
        public drm_pending_event base;
        public @Unsigned int pipe;
        public @Unsigned long sequence;
        public EventDefinitions.event_of_drm_pending_vblank_event event;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_event_crtc_sequence")
    @NotUsableInJava
    public static class drm_event_crtc_sequence
    extends Struct {
        public drm_event base;
        public @Unsigned long user_data;
        public long time_ns;
        public @Unsigned long sequence;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_event_vblank")
    @NotUsableInJava
    public static class drm_event_vblank
    extends Struct {
        public drm_event base;
        public @Unsigned long user_data;
        public @Unsigned int tv_sec;
        public @Unsigned int tv_usec;
        public @Unsigned int sequence;
        public @Unsigned int crtc_id;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_set_client_cap")
    @NotUsableInJava
    public static class drm_set_client_cap
    extends Struct {
        public @Unsigned long capability;
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_get_cap")
    @NotUsableInJava
    public static class drm_get_cap
    extends Struct {
        public @Unsigned long capability;
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_set_version")
    @NotUsableInJava
    public static class drm_set_version
    extends Struct {
        public int drm_di_major;
        public int drm_di_minor;
        public int drm_dd_major;
        public int drm_dd_minor;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_stats")
    @NotUsableInJava
    public static class drm_stats
    extends Struct {
        public @Unsigned long count;
        public AnonymousType1929284175C64 @Size(value=15) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_stat_type")
    public static enum drm_stat_type implements Enum<drm_stat_type>,
    TypedEnum<drm_stat_type, Integer>
    {
        _DRM_STAT_LOCK,
        _DRM_STAT_OPENS,
        _DRM_STAT_CLOSES,
        _DRM_STAT_IOCTLS,
        _DRM_STAT_LOCKS,
        _DRM_STAT_UNLOCKS,
        _DRM_STAT_VALUE,
        _DRM_STAT_BYTE,
        _DRM_STAT_COUNT,
        _DRM_STAT_IRQ,
        _DRM_STAT_PRIMARY,
        _DRM_STAT_SECONDARY,
        _DRM_STAT_DMA,
        _DRM_STAT_SPECIAL,
        _DRM_STAT_MISSED;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_client")
    @NotUsableInJava
    public static class drm_client
    extends Struct {
        public int idx;
        public int auth;
        public @Unsigned long pid;
        public @Unsigned long uid;
        public @Unsigned long magic;
        public @Unsigned long iocs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_unique")
    @NotUsableInJava
    public static class drm_unique
    extends Struct {
        public @Unsigned @OriginalName(value="__kernel_size_t") long unique_len;
        public String unique;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_version")
    @NotUsableInJava
    public static class drm_version
    extends Struct {
        public int version_major;
        public int version_minor;
        public int version_patchlevel;
        public @Unsigned @OriginalName(value="__kernel_size_t") long name_len;
        public String name;
        public @Unsigned @OriginalName(value="__kernel_size_t") long date_len;
        public String date;
        public @Unsigned @OriginalName(value="__kernel_size_t") long desc_len;
        public String desc;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_memory_stats")
    @NotUsableInJava
    public static class drm_memory_stats
    extends Struct {
        public @Unsigned long shared;
        public @Unsigned long _private;
        public @Unsigned long resident;
        public @Unsigned long purgeable;
        public @Unsigned long active;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_pending_event")
    @NotUsableInJava
    public static class drm_pending_event
    extends Struct {
        public Ptr<runtime.completion> completion;
        public Ptr<?> completion_release;
        public Ptr<drm_event> event;
        public Ptr<DmaDefinitions.dma_fence> fence;
        public Ptr<drm_file> file_priv;
        public ListDefinitions.list_head link;
        public ListDefinitions.list_head pending_link;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_minor_type")
    public static enum drm_minor_type implements Enum<drm_minor_type>,
    TypedEnum<drm_minor_type, Integer>
    {
        DRM_MINOR_PRIMARY,
        DRM_MINOR_CONTROL,
        DRM_MINOR_RENDER,
        DRM_MINOR_ACCEL;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_event")
    @NotUsableInJava
    public static class drm_event
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int length;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_lru")
    @NotUsableInJava
    public static class drm_gem_lru
    extends Struct {
        public Ptr<runtime.mutex> lock;
        public long count;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_object_funcs")
    @NotUsableInJava
    public static class drm_gem_object_funcs
    extends Struct {
        public Ptr<?> free;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> print_info;
        public Ptr<?> export;
        public Ptr<?> pin;
        public Ptr<?> unpin;
        public Ptr<?> get_sg_table;
        public Ptr<?> vmap;
        public Ptr<?> vunmap;
        public Ptr<?> mmap;
        public Ptr<?> evict;
        public Ptr<?> status;
        public Ptr<?> rss;
        public Ptr<VmDefinitions.vm_operations_struct> vm_ops;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_gem_object_status")
    public static enum drm_gem_object_status implements Enum<drm_gem_object_status>,
    TypedEnum<drm_gem_object_status, Integer>
    {
        DRM_GEM_OBJECT_RESIDENT,
        DRM_GEM_OBJECT_PURGEABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_vma_offset_node")
    @NotUsableInJava
    public static class drm_vma_offset_node
    extends Struct {
        public misc.rwlock_t vm_lock;
        public drm_mm_node vm_node;
        public RbDefinitions.rb_root vm_files;
        public Ptr<?> driver_private;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mm")
    @NotUsableInJava
    public static class drm_mm
    extends Struct {
        public Ptr<?> color_adjust;
        public ListDefinitions.list_head hole_stack;
        public drm_mm_node head_node;
        public RbDefinitions.rb_root_cached interval_tree;
        public RbDefinitions.rb_root_cached holes_size;
        public RbDefinitions.rb_root holes_addr;
        public @Unsigned long scan_active;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mm_node")
    @NotUsableInJava
    public static class drm_mm_node
    extends Struct {
        public @Unsigned long color;
        public @Unsigned long start;
        public @Unsigned long size;
        public Ptr<drm_mm> mm;
        public ListDefinitions.list_head node_list;
        public ListDefinitions.list_head hole_stack;
        public RbDefinitions.rb_node rb;
        public RbDefinitions.rb_node rb_hole_size;
        public RbDefinitions.rb_node rb_hole_addr;
        public @Unsigned long __subtree_last;
        public @Unsigned long hole_size;
        public @Unsigned long subtree_max_hole;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_destroy_dumb")
    @NotUsableInJava
    public static class drm_mode_destroy_dumb
    extends Struct {
        public @Unsigned int handle;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_map_dumb")
    @NotUsableInJava
    public static class drm_mode_map_dumb
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int pad;
        public @Unsigned long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_gem_object")
    @NotUsableInJava
    public static class drm_gem_object
    extends Struct {
        public runtime.kref refcount;
        public @Unsigned int handle_count;
        public Ptr<drm_device> dev;
        public Ptr<runtime.file> filp;
        public drm_vma_offset_node vma_node;
        public @Unsigned long size;
        public int name;
        public Ptr<DmaDefinitions.dma_buf> dma_buf;
        public Ptr<DmaDefinitions.dma_buf_attachment> import_attach;
        public Ptr<DmaDefinitions.dma_resv> resv;
        public DmaDefinitions.dma_resv _resv;
        public misc.gpuva_of_drm_gem_object gpuva;
        public Ptr<drm_gem_object_funcs> funcs;
        public ListDefinitions.list_head lru_node;
        public Ptr<drm_gem_lru> lru;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_vma_offset_manager")
    @NotUsableInJava
    public static class drm_vma_offset_manager
    extends Struct {
        public misc.rwlock_t vm_lock;
        public drm_mm vm_addr_space_mm;
    }

    @Type(noCCodeGeneration=true, cType="struct __drm_private_objs_state")
    @NotUsableInJava
    public static class __drm_private_objs_state
    extends Struct {
        public Ptr<drm_private_obj> ptr;
        public Ptr<drm_private_state> state;
        public Ptr<drm_private_state> old_state;
        public Ptr<drm_private_state> new_state;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_private_obj")
    @NotUsableInJava
    public static class drm_private_obj
    extends Struct {
        public ListDefinitions.list_head head;
        public drm_modeset_lock lock;
        public Ptr<drm_private_state> state;
        public Ptr<drm_private_state_funcs> funcs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_private_state")
    @NotUsableInJava
    public static class drm_private_state
    extends Struct {
        public Ptr<drm_atomic_state> state;
        public Ptr<drm_private_obj> obj;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_private_state_funcs")
    @NotUsableInJava
    public static class drm_private_state_funcs
    extends Struct {
        public Ptr<?> atomic_duplicate_state;
        public Ptr<?> atomic_destroy_state;
        public Ptr<?> atomic_print_state;
    }

    @Type(noCCodeGeneration=true, cType="struct __drm_connnectors_state")
    @NotUsableInJava
    public static class __drm_connnectors_state
    extends Struct {
        public Ptr<drm_connector> ptr;
        public Ptr<drm_connector_state> state;
        public Ptr<drm_connector_state> old_state;
        public Ptr<drm_connector_state> new_state;
        public Ptr<Integer> out_fence_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct __drm_crtcs_state")
    @NotUsableInJava
    public static class __drm_crtcs_state
    extends Struct {
        public Ptr<drm_crtc> ptr;
        public Ptr<drm_crtc_state> state;
        public Ptr<drm_crtc_state> old_state;
        public Ptr<drm_crtc_state> new_state;
        public Ptr<drm_crtc_commit> commit;
        public Ptr<Integer> out_fence_ptr;
        public @Unsigned long last_vblank_count;
    }

    @Type(noCCodeGeneration=true, cType="struct __drm_planes_state")
    @NotUsableInJava
    public static class __drm_planes_state
    extends Struct {
        public Ptr<drm_plane> ptr;
        public Ptr<drm_plane_state> state;
        public Ptr<drm_plane_state> old_state;
        public Ptr<drm_plane_state> new_state;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_helper_funcs")
    @NotUsableInJava
    public static class drm_crtc_helper_funcs
    extends Struct {
        public Ptr<?> dpms;
        public Ptr<?> prepare;
        public Ptr<?> commit;
        public Ptr<?> mode_valid;
        public Ptr<?> mode_fixup;
        public Ptr<?> mode_set;
        public Ptr<?> mode_set_nofb;
        public Ptr<?> mode_set_base;
        public Ptr<?> mode_set_base_atomic;
        public Ptr<?> disable;
        public Ptr<?> atomic_check;
        public Ptr<?> atomic_begin;
        public Ptr<?> atomic_flush;
        public Ptr<?> atomic_enable;
        public Ptr<?> atomic_disable;
        public Ptr<?> get_scanout_position;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_set")
    @NotUsableInJava
    public static class drm_mode_set
    extends Struct {
        public Ptr<drm_framebuffer> fb;
        public Ptr<drm_crtc> crtc;
        public Ptr<drm_display_mode> mode;
        public @Unsigned @OriginalName(value="uint32_t") int x;
        public @Unsigned @OriginalName(value="uint32_t") int y;
        public Ptr<Ptr<drm_connector>> connectors;
        public @Unsigned long num_connectors;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_funcs")
    @NotUsableInJava
    public static class drm_crtc_funcs
    extends Struct {
        public Ptr<?> reset;
        public Ptr<?> cursor_set;
        public Ptr<?> cursor_set2;
        public Ptr<?> cursor_move;
        public Ptr<?> gamma_set;
        public Ptr<?> destroy;
        public Ptr<?> set_config;
        public Ptr<?> page_flip;
        public Ptr<?> page_flip_target;
        public Ptr<?> set_property;
        public Ptr<?> atomic_duplicate_state;
        public Ptr<?> atomic_destroy_state;
        public Ptr<?> atomic_set_property;
        public Ptr<?> atomic_get_property;
        public Ptr<?> late_register;
        public Ptr<?> early_unregister;
        public Ptr<?> set_crc_source;
        public Ptr<?> verify_crc_source;
        public Ptr<?> get_crc_sources;
        public Ptr<?> atomic_print_state;
        public Ptr<?> get_vblank_counter;
        public Ptr<?> enable_vblank;
        public Ptr<?> disable_vblank;
        public Ptr<?> get_vblank_timestamp;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_state")
    @NotUsableInJava
    public static class drm_crtc_state
    extends Struct {
        public Ptr<drm_crtc> crtc;
        public boolean enable;
        public boolean active;
        public boolean planes_changed;
        public boolean mode_changed;
        public boolean active_changed;
        public boolean connectors_changed;
        public boolean zpos_changed;
        public boolean color_mgmt_changed;
        public boolean no_vblank;
        public @Unsigned int plane_mask;
        public @Unsigned int connector_mask;
        public @Unsigned int encoder_mask;
        public drm_display_mode adjusted_mode;
        public drm_display_mode mode;
        public Ptr<drm_property_blob> mode_blob;
        public Ptr<drm_property_blob> degamma_lut;
        public Ptr<drm_property_blob> ctm;
        public Ptr<drm_property_blob> gamma_lut;
        public @Unsigned int target_vblank;
        public boolean async_flip;
        public boolean vrr_enabled;
        public boolean self_refresh_active;
        public drm_scaling_filter scaling_filter;
        public Ptr<drm_pending_vblank_event> event;
        public Ptr<drm_crtc_commit> commit;
        public Ptr<drm_atomic_state> state;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_crc")
    @NotUsableInJava
    public static class drm_crtc_crc
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public String source;
        public boolean opened;
        public boolean overflow;
        public Ptr<drm_crtc_crc_entry> entries;
        public int head;
        public int tail;
        public @Unsigned long values_cnt;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wq;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_crc_entry")
    @NotUsableInJava
    public static class drm_crtc_crc_entry
    extends Struct {
        public boolean has_frame_counter;
        public @Unsigned @OriginalName(value="uint32_t") int frame;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=10) [] crcs;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_plane_helper_funcs")
    @NotUsableInJava
    public static class drm_plane_helper_funcs
    extends Struct {
        public Ptr<?> prepare_fb;
        public Ptr<?> cleanup_fb;
        public Ptr<?> begin_fb_access;
        public Ptr<?> end_fb_access;
        public Ptr<?> atomic_check;
        public Ptr<?> atomic_update;
        public Ptr<?> atomic_enable;
        public Ptr<?> atomic_disable;
        public Ptr<?> atomic_async_check;
        public Ptr<?> atomic_async_update;
        public Ptr<?> get_scanout_buffer;
        public Ptr<?> panic_flush;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_plane_type")
    public static enum drm_plane_type implements Enum<drm_plane_type>,
    TypedEnum<drm_plane_type, Integer>
    {
        DRM_PLANE_TYPE_OVERLAY,
        DRM_PLANE_TYPE_PRIMARY,
        DRM_PLANE_TYPE_CURSOR;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_plane_funcs")
    @NotUsableInJava
    public static class drm_plane_funcs
    extends Struct {
        public Ptr<?> update_plane;
        public Ptr<?> disable_plane;
        public Ptr<?> destroy;
        public Ptr<?> reset;
        public Ptr<?> set_property;
        public Ptr<?> atomic_duplicate_state;
        public Ptr<?> atomic_destroy_state;
        public Ptr<?> atomic_set_property;
        public Ptr<?> atomic_get_property;
        public Ptr<?> late_register;
        public Ptr<?> early_unregister;
        public Ptr<?> atomic_print_state;
        public Ptr<?> format_mod_supported;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_plane")
    @NotUsableInJava
    public static class drm_plane
    extends Struct {
        public Ptr<drm_device> dev;
        public ListDefinitions.list_head head;
        public String name;
        public drm_modeset_lock mutex;
        public drm_mode_object base;
        public @Unsigned @OriginalName(value="uint32_t") int possible_crtcs;
        public Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> format_types;
        public @Unsigned int format_count;
        public boolean format_default;
        public Ptr<@Unsigned @OriginalName(value="uint64_t") Long> modifiers;
        public @Unsigned int modifier_count;
        public Ptr<drm_crtc> crtc;
        public Ptr<drm_framebuffer> fb;
        public Ptr<drm_framebuffer> old_fb;
        public Ptr<drm_plane_funcs> funcs;
        public drm_object_properties properties;
        public drm_plane_type type;
        public @Unsigned int index;
        public Ptr<drm_plane_helper_funcs> helper_private;
        public Ptr<drm_plane_state> state;
        public Ptr<drm_property> alpha_property;
        public Ptr<drm_property> zpos_property;
        public Ptr<drm_property> rotation_property;
        public Ptr<drm_property> blend_mode_property;
        public Ptr<drm_property> color_encoding_property;
        public Ptr<drm_property> color_range_property;
        public Ptr<drm_property> scaling_filter_property;
        public Ptr<drm_property> hotspot_x_property;
        public Ptr<drm_property> hotspot_y_property;
        public KmsgDefinitions.kmsg_dumper kmsg_panic;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_plane_state")
    @NotUsableInJava
    public static class drm_plane_state
    extends Struct {
        public Ptr<drm_plane> plane;
        public Ptr<drm_crtc> crtc;
        public Ptr<drm_framebuffer> fb;
        public Ptr<DmaDefinitions.dma_fence> fence;
        public @OriginalName(value="int32_t") int crtc_x;
        public @OriginalName(value="int32_t") int crtc_y;
        public @Unsigned @OriginalName(value="uint32_t") int crtc_w;
        public @Unsigned @OriginalName(value="uint32_t") int crtc_h;
        public @Unsigned @OriginalName(value="uint32_t") int src_x;
        public @Unsigned @OriginalName(value="uint32_t") int src_y;
        public @Unsigned @OriginalName(value="uint32_t") int src_h;
        public @Unsigned @OriginalName(value="uint32_t") int src_w;
        public @OriginalName(value="int32_t") int hotspot_x;
        public @OriginalName(value="int32_t") int hotspot_y;
        public @Unsigned short alpha;
        public @Unsigned @OriginalName(value="uint16_t") short pixel_blend_mode;
        public @Unsigned int rotation;
        public @Unsigned int zpos;
        public @Unsigned int normalized_zpos;
        public drm_color_encoding color_encoding;
        public drm_color_range color_range;
        public Ptr<drm_property_blob> fb_damage_clips;
        public boolean ignore_damage_clips;
        public drm_rect src;
        public drm_rect dst;
        public boolean visible;
        public drm_scaling_filter scaling_filter;
        public Ptr<drm_crtc_commit> commit;
        public Ptr<drm_atomic_state> state;
        public boolean color_mgmt_changed;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_scaling_filter")
    public static enum drm_scaling_filter implements Enum<drm_scaling_filter>,
    TypedEnum<drm_scaling_filter, Integer>
    {
        DRM_SCALING_FILTER_DEFAULT,
        DRM_SCALING_FILTER_NEAREST_NEIGHBOR;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_rect")
    @NotUsableInJava
    public static class drm_rect
    extends Struct {
        public int x1;
        public int y1;
        public int x2;
        public int y2;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_color_lut_tests")
    public static enum drm_color_lut_tests implements Enum<drm_color_lut_tests>,
    TypedEnum<drm_color_lut_tests, Integer>
    {
        DRM_COLOR_LUT_EQUAL_CHANNELS,
        DRM_COLOR_LUT_NON_DECREASING;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_color_range")
    public static enum drm_color_range implements Enum<drm_color_range>,
    TypedEnum<drm_color_range, Integer>
    {
        DRM_COLOR_YCBCR_LIMITED_RANGE,
        DRM_COLOR_YCBCR_FULL_RANGE,
        DRM_COLOR_RANGE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_color_encoding")
    public static enum drm_color_encoding implements Enum<drm_color_encoding>,
    TypedEnum<drm_color_encoding, Integer>
    {
        DRM_COLOR_YCBCR_BT601,
        DRM_COLOR_YCBCR_BT709,
        DRM_COLOR_YCBCR_BT2020,
        DRM_COLOR_ENCODING_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_tile_group")
    @NotUsableInJava
    public static class drm_tile_group
    extends Struct {
        public runtime.kref refcount;
        public Ptr<drm_device> dev;
        public int id;
        public char @Size(value=8) [] group_data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_edid")
    @NotUsableInJava
    public static class drm_edid
    extends Struct {
        public @Unsigned long size;
        public Ptr<runtime.edid> edid;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_helper_funcs")
    @NotUsableInJava
    public static class drm_connector_helper_funcs
    extends Struct {
        public Ptr<?> get_modes;
        public Ptr<?> detect_ctx;
        public Ptr<?> mode_valid;
        public Ptr<?> mode_valid_ctx;
        public Ptr<?> best_encoder;
        public Ptr<?> atomic_best_encoder;
        public Ptr<?> atomic_check;
        public Ptr<?> atomic_commit;
        public Ptr<?> prepare_writeback_job;
        public Ptr<?> cleanup_writeback_job;
        public Ptr<?> enable_hpd;
        public Ptr<?> disable_hpd;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_hdmi")
    @NotUsableInJava
    public static class drm_connector_hdmi
    extends Struct {
        public char @Size(value=8) [] vendor;
        public char @Size(value=16) [] product;
        public @Unsigned long supported_formats;
        public Ptr<drm_connector_hdmi_funcs> funcs;
        public misc.infoframes_of_drm_connector_hdmi infoframes;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_cmdline_mode")
    @NotUsableInJava
    public static class drm_cmdline_mode
    extends Struct {
        public char @Size(value=32) [] name;
        public boolean specified;
        public boolean refresh_specified;
        public boolean bpp_specified;
        public @Unsigned int pixel_clock;
        public int xres;
        public int yres;
        public int bpp;
        public int refresh;
        public boolean rb;
        public boolean interlace;
        public boolean cvt;
        public boolean margins;
        public drm_connector_force force;
        public @Unsigned int rotation_reflection;
        public drm_panel_orientation panel_orientation;
        public drm_connector_tv_margins tv_margins;
        public drm_connector_tv_mode tv_mode;
        public boolean tv_mode_specified;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_funcs")
    @NotUsableInJava
    public static class drm_connector_funcs
    extends Struct {
        public Ptr<?> dpms;
        public Ptr<?> reset;
        public Ptr<?> detect;
        public Ptr<?> force;
        public Ptr<?> fill_modes;
        public Ptr<?> set_property;
        public Ptr<?> late_register;
        public Ptr<?> early_unregister;
        public Ptr<?> destroy;
        public Ptr<?> atomic_duplicate_state;
        public Ptr<?> atomic_destroy_state;
        public Ptr<?> atomic_set_property;
        public Ptr<?> atomic_get_property;
        public Ptr<?> atomic_print_state;
        public Ptr<?> oob_hotplug_event;
        public Ptr<?> debugfs_init;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_hdmi_funcs")
    @NotUsableInJava
    public static class drm_connector_hdmi_funcs
    extends Struct {
        public Ptr<?> tmds_char_rate_valid;
        public Ptr<?> clear_infoframe;
        public Ptr<?> write_infoframe;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc_commit")
    @NotUsableInJava
    public static class drm_crtc_commit
    extends Struct {
        public Ptr<drm_crtc> crtc;
        public runtime.kref ref;
        public runtime.completion flip_done;
        public runtime.completion hw_done;
        public runtime.completion cleanup_done;
        public ListDefinitions.list_head commit_entry;
        public Ptr<drm_pending_vblank_event> event;
        public boolean abort_completion;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_atomic_state")
    @NotUsableInJava
    public static class drm_atomic_state
    extends Struct {
        public runtime.kref ref;
        public Ptr<drm_device> dev;
        public boolean allow_modeset;
        public boolean legacy_cursor_update;
        public boolean async_update;
        public boolean duplicated;
        public Ptr<__drm_planes_state> planes;
        public Ptr<__drm_crtcs_state> crtcs;
        public int num_connector;
        public Ptr<__drm_connnectors_state> connectors;
        public int num_private_objs;
        public Ptr<__drm_private_objs_state> private_objs;
        public Ptr<drm_modeset_acquire_ctx> acquire_ctx;
        public Ptr<drm_crtc_commit> fake_commit;
        public misc.work_struct commit_work;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_crtc")
    @NotUsableInJava
    public static class drm_crtc
    extends Struct {
        public Ptr<drm_device> dev;
        public Ptr<DeviceDefinitions.device_node> port;
        public ListDefinitions.list_head head;
        public String name;
        public drm_modeset_lock mutex;
        public drm_mode_object base;
        public Ptr<drm_plane> primary;
        public Ptr<drm_plane> cursor;
        public @Unsigned int index;
        public int cursor_x;
        public int cursor_y;
        public boolean enabled;
        public drm_display_mode mode;
        public drm_display_mode hwmode;
        public int x;
        public int y;
        public Ptr<drm_crtc_funcs> funcs;
        public @Unsigned @OriginalName(value="uint32_t") int gamma_size;
        public Ptr<@Unsigned @OriginalName(value="uint16_t") Short> gamma_store;
        public Ptr<drm_crtc_helper_funcs> helper_private;
        public drm_object_properties properties;
        public Ptr<drm_property> scaling_filter_property;
        public Ptr<drm_crtc_state> state;
        public ListDefinitions.list_head commit_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock commit_lock;
        public Ptr<runtime.dentry> debugfs_entry;
        public drm_crtc_crc crc;
        public @Unsigned int fence_context;
        public  @OriginalName(value="spinlock_t") runtime.spinlock fence_lock;
        public @Unsigned long fence_seqno;
        public char @Size(value=32) [] timeline_name;
        public Ptr<drm_self_refresh_data> self_refresh_data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector")
    @NotUsableInJava
    public static class drm_connector
    extends Struct {
        public Ptr<drm_device> dev;
        public Ptr<runtime.device> kdev;
        public Ptr<DeviceDefinitions.device_attribute> attr;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public ListDefinitions.list_head head;
        public ListDefinitions.list_head global_connector_list_entry;
        public drm_mode_object base;
        public String name;
        public runtime.mutex mutex;
        public @Unsigned int index;
        public int connector_type;
        public int connector_type_id;
        public boolean interlace_allowed;
        public boolean doublescan_allowed;
        public boolean stereo_allowed;
        public boolean ycbcr_420_allowed;
        public drm_connector_registration_state registration_state;
        public ListDefinitions.list_head modes;
        public drm_connector_status status;
        public ListDefinitions.list_head probed_modes;
        public drm_display_info display_info;
        public Ptr<drm_connector_funcs> funcs;
        public Ptr<drm_property_blob> edid_blob_ptr;
        public drm_object_properties properties;
        public Ptr<drm_property> scaling_mode_property;
        public Ptr<drm_property> vrr_capable_property;
        public Ptr<drm_property> colorspace_property;
        public Ptr<drm_property_blob> path_blob_ptr;
        public @Unsigned int max_bpc;
        public Ptr<drm_property> max_bpc_property;
        public Ptr<drm_privacy_screen> privacy_screen;
        public misc.notifier_block privacy_screen_notifier;
        public Ptr<drm_property> privacy_screen_sw_state_property;
        public Ptr<drm_property> privacy_screen_hw_state_property;
        public Ptr<drm_property> broadcast_rgb_property;
        public @OriginalName(value="uint8_t") char polled;
        public int dpms;
        public Ptr<drm_connector_helper_funcs> helper_private;
        public drm_cmdline_mode cmdline_mode;
        public drm_connector_force force;
        public Ptr<drm_edid> edid_override;
        public runtime.mutex edid_override_mutex;
        public @Unsigned long epoch_counter;
        public @Unsigned int possible_encoders;
        public Ptr<drm_encoder> encoder;
        public @OriginalName(value="uint8_t") char @Size(value=128) [] eld;
        public boolean @Size(value=2) [] latency_present;
        public int @Size(value=2) [] video_latency;
        public int @Size(value=2) [] audio_latency;
        public Ptr<I2cDefinitions.i2c_adapter> ddc;
        public int null_edid_counter;
        public @Unsigned int bad_edid_counter;
        public boolean edid_corrupt;
        public char real_edid_checksum;
        public Ptr<runtime.dentry> debugfs_entry;
        public Ptr<drm_connector_state> state;
        public Ptr<drm_property_blob> tile_blob_ptr;
        public boolean has_tile;
        public Ptr<drm_tile_group> tile_group;
        public boolean tile_is_single_monitor;
        public @OriginalName(value="uint8_t") char num_h_tile;
        public @OriginalName(value="uint8_t") char num_v_tile;
        public @OriginalName(value="uint8_t") char tile_h_loc;
        public @OriginalName(value="uint8_t") char tile_v_loc;
        public @Unsigned @OriginalName(value="uint16_t") short tile_h_size;
        public @Unsigned @OriginalName(value="uint16_t") short tile_v_size;
        public misc.llist_node free_node;
        public misc.hdr_sink_metadata hdr_sink_metadata;
        public drm_connector_hdmi hdmi;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_state")
    @NotUsableInJava
    public static class drm_connector_state
    extends Struct {
        public Ptr<drm_connector> connector;
        public Ptr<drm_crtc> crtc;
        public Ptr<drm_encoder> best_encoder;
        public drm_link_status link_status;
        public Ptr<drm_atomic_state> state;
        public Ptr<drm_crtc_commit> commit;
        public drm_tv_connector_state tv;
        public boolean self_refresh_aware;
        public HdmiDefinitions.hdmi_picture_aspect picture_aspect_ratio;
        public @Unsigned int content_type;
        public @Unsigned int hdcp_content_type;
        public @Unsigned int scaling_mode;
        public @Unsigned int content_protection;
        public drm_colorspace colorspace;
        public Ptr<drm_writeback_job> writeback_job;
        public char max_requested_bpc;
        public char max_bpc;
        public drm_privacy_screen_status privacy_screen_sw_state;
        public Ptr<drm_property_blob> hdr_output_metadata;
        public drm_connector_hdmi_state hdmi;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_hdmi_state")
    @NotUsableInJava
    public static class drm_connector_hdmi_state
    extends Struct {
        public drm_hdmi_broadcast_rgb broadcast_rgb;
        public misc.infoframes_of_drm_connector_hdmi_state infoframes;
        public boolean is_limited_range;
        public @Unsigned int output_bpc;
        public HdmiDefinitions.hdmi_colorspace output_format;
        public @Unsigned long tmds_char_rate;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_hdmi_infoframe")
    @NotUsableInJava
    public static class drm_connector_hdmi_infoframe
    extends Struct {
        public HdmiDefinitions.hdmi_infoframe data;
        public boolean set;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_tv_connector_state")
    @NotUsableInJava
    public static class drm_tv_connector_state
    extends Struct {
        public drm_mode_subconnector select_subconnector;
        public drm_mode_subconnector subconnector;
        public drm_connector_tv_margins margins;
        public @Unsigned int legacy_mode;
        public @Unsigned int mode;
        public @Unsigned int brightness;
        public @Unsigned int contrast;
        public @Unsigned int flicker_reduction;
        public @Unsigned int overscan;
        public @Unsigned int saturation;
        public @Unsigned int hue;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_connector_tv_margins")
    @NotUsableInJava
    public static class drm_connector_tv_margins
    extends Struct {
        public @Unsigned int bottom;
        public @Unsigned int left;
        public @Unsigned int right;
        public @Unsigned int top;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_display_info")
    @NotUsableInJava
    public static class drm_display_info
    extends Struct {
        public @Unsigned int width_mm;
        public @Unsigned int height_mm;
        public @Unsigned int bpc;
        public misc.subpixel_order subpixel_order;
        public int panel_orientation;
        public @Unsigned int color_formats;
        public Ptr<@Unsigned Integer> bus_formats;
        public @Unsigned int num_bus_formats;
        public @Unsigned int bus_flags;
        public int max_tmds_clock;
        public boolean dvi_dual;
        public boolean is_hdmi;
        public boolean has_audio;
        public boolean has_hdmi_infoframe;
        public boolean rgb_quant_range_selectable;
        public char edid_hdmi_rgb444_dc_modes;
        public char edid_hdmi_ycbcr444_dc_modes;
        public char cea_rev;
        public drm_hdmi_info hdmi;
        public boolean non_desktop;
        public drm_monitor_range_info monitor_range;
        public drm_luminance_range_info luminance_range;
        public char mso_stream_count;
        public char mso_pixel_overlap;
        public @Unsigned int max_dsc_bpp;
        public Ptr<Character> vics;
        public int vics_len;
        public @Unsigned int quirks;
        public @Unsigned short source_physical_address;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_colorspace")
    public static enum drm_colorspace implements Enum<drm_colorspace>,
    TypedEnum<drm_colorspace, Integer>
    {
        DRM_MODE_COLORIMETRY_DEFAULT,
        DRM_MODE_COLORIMETRY_NO_DATA,
        DRM_MODE_COLORIMETRY_SMPTE_170M_YCC,
        DRM_MODE_COLORIMETRY_BT709_YCC,
        DRM_MODE_COLORIMETRY_XVYCC_601,
        DRM_MODE_COLORIMETRY_XVYCC_709,
        DRM_MODE_COLORIMETRY_SYCC_601,
        DRM_MODE_COLORIMETRY_OPYCC_601,
        DRM_MODE_COLORIMETRY_OPRGB,
        DRM_MODE_COLORIMETRY_BT2020_CYCC,
        DRM_MODE_COLORIMETRY_BT2020_RGB,
        DRM_MODE_COLORIMETRY_BT2020_YCC,
        DRM_MODE_COLORIMETRY_DCI_P3_RGB_D65,
        DRM_MODE_COLORIMETRY_DCI_P3_RGB_THEATER,
        DRM_MODE_COLORIMETRY_RGB_WIDE_FIXED,
        DRM_MODE_COLORIMETRY_RGB_WIDE_FLOAT,
        DRM_MODE_COLORIMETRY_BT601_YCC,
        DRM_MODE_COLORIMETRY_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_privacy_screen_status")
    public static enum drm_privacy_screen_status implements Enum<drm_privacy_screen_status>,
    TypedEnum<drm_privacy_screen_status, Integer>
    {
        PRIVACY_SCREEN_DISABLED,
        PRIVACY_SCREEN_ENABLED,
        PRIVACY_SCREEN_DISABLED_LOCKED,
        PRIVACY_SCREEN_ENABLED_LOCKED;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_luminance_range_info")
    @NotUsableInJava
    public static class drm_luminance_range_info
    extends Struct {
        public @Unsigned int min_luminance;
        public @Unsigned int max_luminance;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_monitor_range_info")
    @NotUsableInJava
    public static class drm_monitor_range_info
    extends Struct {
        public @Unsigned short min_vfreq;
        public @Unsigned short max_vfreq;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_hdmi_broadcast_rgb")
    public static enum drm_hdmi_broadcast_rgb implements Enum<drm_hdmi_broadcast_rgb>,
    TypedEnum<drm_hdmi_broadcast_rgb, Integer>
    {
        DRM_HDMI_BROADCAST_RGB_AUTO,
        DRM_HDMI_BROADCAST_RGB_FULL,
        DRM_HDMI_BROADCAST_RGB_LIMITED;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_panel_orientation")
    public static enum drm_panel_orientation implements Enum<drm_panel_orientation>,
    TypedEnum<drm_panel_orientation, Integer>
    {
        DRM_MODE_PANEL_ORIENTATION_UNKNOWN,
        DRM_MODE_PANEL_ORIENTATION_NORMAL,
        DRM_MODE_PANEL_ORIENTATION_BOTTOM_UP,
        DRM_MODE_PANEL_ORIENTATION_LEFT_UP,
        DRM_MODE_PANEL_ORIENTATION_RIGHT_UP;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_link_status")
    public static enum drm_link_status implements Enum<drm_link_status>,
    TypedEnum<drm_link_status, Integer>
    {
        DRM_LINK_STATUS_GOOD,
        DRM_LINK_STATUS_BAD;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_hdmi_info")
    @NotUsableInJava
    public static class drm_hdmi_info
    extends Struct {
        public drm_scdc scdc;
        public @Unsigned long @Size(value=4) [] y420_vdb_modes;
        public @Unsigned long @Size(value=4) [] y420_cmdb_modes;
        public char y420_dc_modes;
        public char max_frl_rate_per_lane;
        public char max_lanes;
        public drm_hdmi_dsc_cap dsc_cap;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_hdmi_dsc_cap")
    @NotUsableInJava
    public static class drm_hdmi_dsc_cap
    extends Struct {
        public boolean v_1p2;
        public boolean native_420;
        public boolean all_bpp;
        public char bpc_supported;
        public char max_slices;
        public int clk_per_slice;
        public char max_lanes;
        public char max_frl_rate_per_lane;
        public char total_chunk_kbytes;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_scdc")
    @NotUsableInJava
    public static class drm_scdc
    extends Struct {
        public boolean supported;
        public boolean read_request;
        public drm_scrambling scrambling;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_scrambling")
    @NotUsableInJava
    public static class drm_scrambling
    extends Struct {
        public boolean supported;
        public boolean low_rates;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_connector_tv_mode")
    public static enum drm_connector_tv_mode implements Enum<drm_connector_tv_mode>,
    TypedEnum<drm_connector_tv_mode, Integer>
    {
        DRM_MODE_TV_MODE_NTSC,
        DRM_MODE_TV_MODE_NTSC_443,
        DRM_MODE_TV_MODE_NTSC_J,
        DRM_MODE_TV_MODE_PAL,
        DRM_MODE_TV_MODE_PAL_M,
        DRM_MODE_TV_MODE_PAL_N,
        DRM_MODE_TV_MODE_SECAM,
        DRM_MODE_TV_MODE_MONOCHROME,
        DRM_MODE_TV_MODE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_connector_registration_state")
    public static enum drm_connector_registration_state implements Enum<drm_connector_registration_state>,
    TypedEnum<drm_connector_registration_state, Integer>
    {
        DRM_CONNECTOR_INITIALIZING,
        DRM_CONNECTOR_REGISTERED,
        DRM_CONNECTOR_UNREGISTERED;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_connector_status")
    public static enum drm_connector_status implements Enum<drm_connector_status>,
    TypedEnum<drm_connector_status, Integer>
    {
        connector_status_connected,
        connector_status_disconnected,
        connector_status_unknown;

    }

    @Type(noCCodeGeneration=true, cType="enum drm_connector_force")
    public static enum drm_connector_force implements Enum<drm_connector_force>,
    TypedEnum<drm_connector_force, Integer>
    {
        DRM_FORCE_UNSPECIFIED,
        DRM_FORCE_OFF,
        DRM_FORCE_ON,
        DRM_FORCE_ON_DIGITAL;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_prop_enum_list")
    @NotUsableInJava
    public static class drm_prop_enum_list
    extends Struct {
        public int type;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_property_blob")
    @NotUsableInJava
    public static class drm_property_blob
    extends Struct {
        public drm_mode_object base;
        public Ptr<drm_device> dev;
        public ListDefinitions.list_head head_global;
        public ListDefinitions.list_head head_file;
        public @Unsigned long length;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_color_lut")
    @NotUsableInJava
    public static class drm_color_lut
    extends Struct {
        public @Unsigned short red;
        public @Unsigned short green;
        public @Unsigned short blue;
        public @Unsigned short reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_crtc_lut")
    @NotUsableInJava
    public static class drm_mode_crtc_lut
    extends Struct {
        public @Unsigned int crtc_id;
        public @Unsigned int gamma_size;
        public @Unsigned long red;
        public @Unsigned long green;
        public @Unsigned long blue;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_mode_subconnector")
    public static enum drm_mode_subconnector implements Enum<drm_mode_subconnector>,
    TypedEnum<drm_mode_subconnector, Integer>
    {
        DRM_MODE_SUBCONNECTOR_Automatic,
        DRM_MODE_SUBCONNECTOR_Unknown,
        DRM_MODE_SUBCONNECTOR_VGA,
        DRM_MODE_SUBCONNECTOR_DVID,
        DRM_MODE_SUBCONNECTOR_DVIA,
        DRM_MODE_SUBCONNECTOR_Composite,
        DRM_MODE_SUBCONNECTOR_SVIDEO,
        DRM_MODE_SUBCONNECTOR_Component,
        DRM_MODE_SUBCONNECTOR_SCART,
        DRM_MODE_SUBCONNECTOR_DisplayPort,
        DRM_MODE_SUBCONNECTOR_HDMIA,
        DRM_MODE_SUBCONNECTOR_Native,
        DRM_MODE_SUBCONNECTOR_Wireless;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_vblank_crtc_config")
    @NotUsableInJava
    public static class drm_vblank_crtc_config
    extends Struct {
        public int offdelay_ms;
        public boolean disable_immediate;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_object_properties")
    @NotUsableInJava
    public static class drm_object_properties
    extends Struct {
        public int count;
        public Ptr<drm_property> @Size(value=64) [] properties;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=64) [] values;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_object")
    @NotUsableInJava
    public static class drm_mode_object
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int id;
        public @Unsigned @OriginalName(value="uint32_t") int type;
        public Ptr<drm_object_properties> properties;
        public runtime.kref refcount;
        public Ptr<?> free_cb;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_ioctl_flags")
    public static enum drm_ioctl_flags implements Enum<drm_ioctl_flags>,
    TypedEnum<drm_ioctl_flags, Integer>
    {
        DRM_AUTH,
        DRM_MASTER,
        DRM_ROOT_ONLY,
        DRM_RENDER_ALLOW;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_prime_file_private")
    @NotUsableInJava
    public static class drm_prime_file_private
    extends Struct {
        public runtime.mutex lock;
        public RbDefinitions.rb_root dmabufs;
        public RbDefinitions.rb_root handles;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_auth")
    @NotUsableInJava
    public static class drm_auth
    extends Struct {
        public @Unsigned @OriginalName(value="drm_magic_t") int magic;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_driver_feature")
    public static enum drm_driver_feature implements Enum<drm_driver_feature>,
    TypedEnum<drm_driver_feature, Integer>
    {
        DRIVER_GEM,
        DRIVER_MODESET,
        DRIVER_RENDER,
        DRIVER_ATOMIC,
        DRIVER_SYNCOBJ,
        DRIVER_SYNCOBJ_TIMELINE,
        DRIVER_COMPUTE_ACCEL,
        DRIVER_GEM_GPUVA,
        DRIVER_CURSOR_HOTSPOT,
        DRIVER_USE_AGP,
        DRIVER_LEGACY,
        DRIVER_PCI_DMA,
        DRIVER_SG,
        DRIVER_HAVE_DMA,
        DRIVER_HAVE_IRQ;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_vblank_crtc")
    @NotUsableInJava
    public static class drm_vblank_crtc
    extends Struct {
        public Ptr<drm_device> dev;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head queue;
        public TimerDefinitions.timer_list disable_timer;
        public misc.seqlock_t seqlock;
        public misc.atomic64_t count;
        public @OriginalName(value="ktime_t") long time;
        public AtomicDefinitions.atomic_t refcount;
        public @Unsigned int last;
        public @Unsigned int max_vblank_count;
        public @Unsigned int inmodeset;
        public @Unsigned int pipe;
        public int framedur_ns;
        public int linedur_ns;
        public drm_display_mode hwmode;
        public drm_vblank_crtc_config config;
        public boolean enabled;
        public Ptr<KthreadDefinitions.kthread_worker> worker;
        public ListDefinitions.list_head pending_work;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head work_wait_queue;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_minor")
    @NotUsableInJava
    public static class drm_minor
    extends Struct {
        public int index;
        public int type;
        public Ptr<runtime.device> kdev;
        public Ptr<drm_device> dev;
        public Ptr<runtime.dentry> debugfs_symlink;
        public Ptr<runtime.dentry> debugfs_root;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_property")
    @NotUsableInJava
    public static class drm_property
    extends Struct {
        public ListDefinitions.list_head head;
        public drm_mode_object base;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="uint32_t") int num_values;
        public Ptr<@Unsigned @OriginalName(value="uint64_t") Long> values;
        public Ptr<drm_device> dev;
        public ListDefinitions.list_head enum_list;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_mode_status")
    public static enum drm_mode_status implements Enum<drm_mode_status>,
    TypedEnum<drm_mode_status, Integer>
    {
        MODE_OK,
        MODE_HSYNC,
        MODE_VSYNC,
        MODE_H_ILLEGAL,
        MODE_V_ILLEGAL,
        MODE_BAD_WIDTH,
        MODE_NOMODE,
        MODE_NO_INTERLACE,
        MODE_NO_DBLESCAN,
        MODE_NO_VSCAN,
        MODE_MEM,
        MODE_VIRTUAL_X,
        MODE_VIRTUAL_Y,
        MODE_MEM_VIRT,
        MODE_NOCLOCK,
        MODE_CLOCK_HIGH,
        MODE_CLOCK_LOW,
        MODE_CLOCK_RANGE,
        MODE_BAD_HVALUE,
        MODE_BAD_VVALUE,
        MODE_BAD_VSCAN,
        MODE_HSYNC_NARROW,
        MODE_HSYNC_WIDE,
        MODE_HBLANK_NARROW,
        MODE_HBLANK_WIDE,
        MODE_VSYNC_NARROW,
        MODE_VSYNC_WIDE,
        MODE_VBLANK_NARROW,
        MODE_VBLANK_WIDE,
        MODE_PANEL,
        MODE_INTERLACE_WIDTH,
        MODE_ONE_WIDTH,
        MODE_ONE_HEIGHT,
        MODE_ONE_SIZE,
        MODE_NO_REDUCED,
        MODE_NO_STEREO,
        MODE_NO_420,
        MODE_STALE,
        MODE_BAD,
        MODE_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_file")
    @NotUsableInJava
    public static class drm_file
    extends Struct {
        public boolean authenticated;
        public boolean stereo_allowed;
        public boolean universal_planes;
        public boolean atomic;
        public boolean aspect_ratio_allowed;
        public boolean writeback_connectors;
        public boolean was_master;
        public boolean is_master;
        public boolean supports_virtualized_cursor_plane;
        public Ptr<drm_master> master;
        public  @OriginalName(value="spinlock_t") runtime.spinlock master_lookup_lock;
        public Ptr<runtime.pid> pid;
        public @Unsigned long client_id;
        public @Unsigned @OriginalName(value="drm_magic_t") int magic;
        public ListDefinitions.list_head lhead;
        public Ptr<drm_minor> minor;
        public runtime.idr object_idr;
        public  @OriginalName(value="spinlock_t") runtime.spinlock table_lock;
        public runtime.idr syncobj_idr;
        public  @OriginalName(value="spinlock_t") runtime.spinlock syncobj_table_lock;
        public Ptr<runtime.file> filp;
        public Ptr<?> driver_priv;
        public ListDefinitions.list_head fbs;
        public runtime.mutex fbs_lock;
        public ListDefinitions.list_head blobs;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head event_wait;
        public ListDefinitions.list_head pending_event_list;
        public ListDefinitions.list_head event_list;
        public int event_space;
        public runtime.mutex event_read_lock;
        public drm_prime_file_private prime;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_master")
    @NotUsableInJava
    public static class drm_master
    extends Struct {
        public runtime.kref refcount;
        public Ptr<drm_device> dev;
        public String unique;
        public int unique_len;
        public runtime.idr magic_map;
        public Ptr<?> driver_priv;
        public Ptr<drm_master> lessor;
        public int lessee_id;
        public ListDefinitions.list_head lessee_list;
        public ListDefinitions.list_head lessees;
        public runtime.idr leases;
        public runtime.idr lessee_idr;
    }

    @Type(noCCodeGeneration=true, cType="enum drm_debug_category")
    public static enum drm_debug_category implements Enum<drm_debug_category>,
    TypedEnum<drm_debug_category, Integer>
    {
        DRM_UT_CORE,
        DRM_UT_DRIVER,
        DRM_UT_KMS,
        DRM_UT_PRIME,
        DRM_UT_ATOMIC,
        DRM_UT_VBL,
        DRM_UT_STATE,
        DRM_UT_LEASE,
        DRM_UT_DP,
        DRM_UT_DRMRES;

    }

    @Type(noCCodeGeneration=true, cType="struct drm_ioctl_desc")
    @NotUsableInJava
    public static class drm_ioctl_desc
    extends Struct {
        public @Unsigned int cmd;
        public drm_ioctl_flags flags;
        public Ptr<?> func;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_printer")
    @NotUsableInJava
    public static class drm_printer
    extends Struct {
        public Ptr<?> printfn;
        public Ptr<?> puts;
        public Ptr<?> arg;
        public Ptr<?> origin;
        public String prefix;
        public drm_debug_category category;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_create_dumb")
    @NotUsableInJava
    public static class drm_mode_create_dumb
    extends Struct {
        public @Unsigned int height;
        public @Unsigned int width;
        public @Unsigned int bpp;
        public @Unsigned int flags;
        public @Unsigned int handle;
        public @Unsigned int pitch;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_driver")
    @NotUsableInJava
    public static class drm_driver
    extends Struct {
        public Ptr<?> load;
        public Ptr<?> open;
        public Ptr<?> postclose;
        public Ptr<?> unload;
        public Ptr<?> release;
        public Ptr<?> master_set;
        public Ptr<?> master_drop;
        public Ptr<?> debugfs_init;
        public Ptr<?> gem_create_object;
        public Ptr<?> prime_handle_to_fd;
        public Ptr<?> prime_fd_to_handle;
        public Ptr<?> gem_prime_import;
        public Ptr<?> gem_prime_import_sg_table;
        public Ptr<?> dumb_create;
        public Ptr<?> dumb_map_offset;
        public Ptr<?> show_fdinfo;
        public int major;
        public int minor;
        public int patchlevel;
        public String name;
        public String desc;
        public String date;
        public @Unsigned int driver_features;
        public Ptr<drm_ioctl_desc> ioctls;
        public int num_ioctls;
        public Ptr<FileDefinitions.file_operations> fops;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_config_helper_funcs")
    @NotUsableInJava
    public static class drm_mode_config_helper_funcs
    extends Struct {
        public Ptr<?> atomic_commit_tail;
        public Ptr<?> atomic_commit_setup;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_config")
    @NotUsableInJava
    public static class drm_mode_config
    extends Struct {
        public runtime.mutex mutex;
        public drm_modeset_lock connection_mutex;
        public Ptr<drm_modeset_acquire_ctx> acquire_ctx;
        public runtime.mutex idr_mutex;
        public runtime.idr object_idr;
        public runtime.idr tile_idr;
        public runtime.mutex fb_lock;
        public int num_fb;
        public ListDefinitions.list_head fb_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock connector_list_lock;
        public int num_connector;
        public runtime.ida connector_ida;
        public ListDefinitions.list_head connector_list;
        public misc.llist_head connector_free_list;
        public misc.work_struct connector_free_work;
        public int num_encoder;
        public ListDefinitions.list_head encoder_list;
        public int num_total_plane;
        public ListDefinitions.list_head plane_list;
        public RawDefinitions.raw_spinlock panic_lock;
        public int num_crtc;
        public ListDefinitions.list_head crtc_list;
        public ListDefinitions.list_head property_list;
        public ListDefinitions.list_head privobj_list;
        public int min_width;
        public int min_height;
        public int max_width;
        public int max_height;
        public Ptr<drm_mode_config_funcs> funcs;
        public boolean poll_enabled;
        public boolean poll_running;
        public boolean delayed_event;
        public DelayedDefinitions.delayed_work output_poll_work;
        public runtime.mutex blob_lock;
        public ListDefinitions.list_head property_blob_list;
        public Ptr<drm_property> edid_property;
        public Ptr<drm_property> dpms_property;
        public Ptr<drm_property> path_property;
        public Ptr<drm_property> tile_property;
        public Ptr<drm_property> link_status_property;
        public Ptr<drm_property> plane_type_property;
        public Ptr<drm_property> prop_src_x;
        public Ptr<drm_property> prop_src_y;
        public Ptr<drm_property> prop_src_w;
        public Ptr<drm_property> prop_src_h;
        public Ptr<drm_property> prop_crtc_x;
        public Ptr<drm_property> prop_crtc_y;
        public Ptr<drm_property> prop_crtc_w;
        public Ptr<drm_property> prop_crtc_h;
        public Ptr<drm_property> prop_fb_id;
        public Ptr<drm_property> prop_in_fence_fd;
        public Ptr<drm_property> prop_out_fence_ptr;
        public Ptr<drm_property> prop_crtc_id;
        public Ptr<drm_property> prop_fb_damage_clips;
        public Ptr<drm_property> prop_active;
        public Ptr<drm_property> prop_mode_id;
        public Ptr<drm_property> prop_vrr_enabled;
        public Ptr<drm_property> dvi_i_subconnector_property;
        public Ptr<drm_property> dvi_i_select_subconnector_property;
        public Ptr<drm_property> dp_subconnector_property;
        public Ptr<drm_property> tv_subconnector_property;
        public Ptr<drm_property> tv_select_subconnector_property;
        public Ptr<drm_property> legacy_tv_mode_property;
        public Ptr<drm_property> tv_mode_property;
        public Ptr<drm_property> tv_left_margin_property;
        public Ptr<drm_property> tv_right_margin_property;
        public Ptr<drm_property> tv_top_margin_property;
        public Ptr<drm_property> tv_bottom_margin_property;
        public Ptr<drm_property> tv_brightness_property;
        public Ptr<drm_property> tv_contrast_property;
        public Ptr<drm_property> tv_flicker_reduction_property;
        public Ptr<drm_property> tv_overscan_property;
        public Ptr<drm_property> tv_saturation_property;
        public Ptr<drm_property> tv_hue_property;
        public Ptr<drm_property> scaling_mode_property;
        public Ptr<drm_property> aspect_ratio_property;
        public Ptr<drm_property> content_type_property;
        public Ptr<drm_property> degamma_lut_property;
        public Ptr<drm_property> degamma_lut_size_property;
        public Ptr<drm_property> ctm_property;
        public Ptr<drm_property> gamma_lut_property;
        public Ptr<drm_property> gamma_lut_size_property;
        public Ptr<drm_property> suggested_x_property;
        public Ptr<drm_property> suggested_y_property;
        public Ptr<drm_property> non_desktop_property;
        public Ptr<drm_property> panel_orientation_property;
        public Ptr<drm_property> writeback_fb_id_property;
        public Ptr<drm_property> writeback_pixel_formats_property;
        public Ptr<drm_property> writeback_out_fence_ptr_property;
        public Ptr<drm_property> hdr_output_metadata_property;
        public Ptr<drm_property> content_protection_property;
        public Ptr<drm_property> hdcp_content_type_property;
        public @Unsigned @OriginalName(value="uint32_t") int preferred_depth;
        public @Unsigned @OriginalName(value="uint32_t") int prefer_shadow;
        public boolean quirk_addfb_prefer_xbgr_30bpp;
        public boolean quirk_addfb_prefer_host_byte_order;
        public boolean async_page_flip;
        public boolean fb_modifiers_not_supported;
        public boolean normalize_zpos;
        public Ptr<drm_property> modifiers_property;
        public Ptr<drm_property> size_hints_property;
        public @Unsigned @OriginalName(value="uint32_t") int cursor_width;
        public @Unsigned @OriginalName(value="uint32_t") int cursor_height;
        public Ptr<drm_atomic_state> suspend_state;
        public Ptr<drm_mode_config_helper_funcs> helper_private;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_display_mode")
    @NotUsableInJava
    public static class drm_display_mode
    extends Struct {
        public int clock;
        public @Unsigned short hdisplay;
        public @Unsigned short hsync_start;
        public @Unsigned short hsync_end;
        public @Unsigned short htotal;
        public @Unsigned short hskew;
        public @Unsigned short vdisplay;
        public @Unsigned short vsync_start;
        public @Unsigned short vsync_end;
        public @Unsigned short vtotal;
        public @Unsigned short vscan;
        public @Unsigned int flags;
        public int crtc_clock;
        public @Unsigned short crtc_hdisplay;
        public @Unsigned short crtc_hblank_start;
        public @Unsigned short crtc_hblank_end;
        public @Unsigned short crtc_hsync_start;
        public @Unsigned short crtc_hsync_end;
        public @Unsigned short crtc_htotal;
        public @Unsigned short crtc_hskew;
        public @Unsigned short crtc_vdisplay;
        public @Unsigned short crtc_vblank_start;
        public @Unsigned short crtc_vblank_end;
        public @Unsigned short crtc_vsync_start;
        public @Unsigned short crtc_vsync_end;
        public @Unsigned short crtc_vtotal;
        public @Unsigned short width_mm;
        public @Unsigned short height_mm;
        public char type;
        public boolean expose_to_userspace;
        public ListDefinitions.list_head head;
        public char @Size(value=32) [] name;
        public drm_mode_status status;
        public HdmiDefinitions.hdmi_picture_aspect picture_aspect_ratio;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_format_info")
    @NotUsableInJava
    public static class drm_format_info
    extends Struct {
        public @Unsigned int format;
        public char depth;
        public char num_planes;
        @InlineUnion(value=20399)
        public @InlineUnion(value=20399) char @Size(value=4) [] cpp;
        @InlineUnion(value=20399)
        public @InlineUnion(value=20399) char @Size(value=4) [] char_per_block;
        public char @Size(value=4) [] block_w;
        public char @Size(value=4) [] block_h;
        public char hsub;
        public char vsub;
        public boolean has_alpha;
        public boolean is_yuv;
        public boolean is_color_indexed;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_fb_cmd2")
    @NotUsableInJava
    public static class drm_mode_fb_cmd2
    extends Struct {
        public @Unsigned int fb_id;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int pixel_format;
        public @Unsigned int flags;
        public @Unsigned int @Size(value=4) [] handles;
        public @Unsigned int @Size(value=4) [] pitches;
        public @Unsigned int @Size(value=4) [] offsets;
        public @Unsigned long @Size(value=4) [] modifier;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_device")
    @NotUsableInJava
    public static class drm_device
    extends Struct {
        public int if_version;
        public runtime.kref ref;
        public Ptr<runtime.device> dev;
        public misc.managed_of_drm_device managed;
        public Ptr<drm_driver> driver;
        public Ptr<?> dev_private;
        public Ptr<drm_minor> primary;
        public Ptr<drm_minor> render;
        public Ptr<drm_minor> accel;
        public boolean registered;
        public Ptr<drm_master> master;
        public @Unsigned int driver_features;
        public boolean unplugged;
        public Ptr<runtime.inode> anon_inode;
        public String unique;
        public runtime.mutex struct_mutex;
        public runtime.mutex master_mutex;
        public AtomicDefinitions.atomic_t open_count;
        public runtime.mutex filelist_mutex;
        public ListDefinitions.list_head filelist;
        public ListDefinitions.list_head filelist_internal;
        public runtime.mutex clientlist_mutex;
        public ListDefinitions.list_head clientlist;
        public boolean vblank_disable_immediate;
        public Ptr<drm_vblank_crtc> vblank;
        public  @OriginalName(value="spinlock_t") runtime.spinlock vblank_time_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock vbl_lock;
        public @Unsigned int max_vblank_count;
        public ListDefinitions.list_head vblank_event_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock event_lock;
        public @Unsigned int num_crtcs;
        public drm_mode_config mode_config;
        public runtime.mutex object_name_lock;
        public runtime.idr object_name_idr;
        public Ptr<drm_vma_offset_manager> vma_offset_manager;
        public @OriginalName(value="drm_vram_mm") Ptr<?> vram_mm;
        public SwitchDefinitions.switch_power_state switch_power_state;
        public Ptr<drm_fb_helper> fb_helper;
        public Ptr<runtime.dentry> debugfs_root;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_mode_config_funcs")
    @NotUsableInJava
    public static class drm_mode_config_funcs
    extends Struct {
        public Ptr<?> fb_create;
        public Ptr<?> get_format_info;
        public Ptr<?> mode_valid;
        public Ptr<?> atomic_check;
        public Ptr<?> atomic_commit;
        public Ptr<?> atomic_state_alloc;
        public Ptr<?> atomic_state_clear;
        public Ptr<?> atomic_state_free;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_modeset_lock")
    @NotUsableInJava
    public static class drm_modeset_lock
    extends Struct {
        public misc.ww_mutex mutex;
        public ListDefinitions.list_head head;
    }

    @Type(noCCodeGeneration=true, cType="struct drm_modeset_acquire_ctx")
    @NotUsableInJava
    public static class drm_modeset_acquire_ctx
    extends Struct {
        public misc.ww_acquire_ctx ww_ctx;
        public Ptr<drm_modeset_lock> contended;
        public @Unsigned @OriginalName(value="depot_stack_handle_t") int stack_depot;
        public ListDefinitions.list_head locked;
        public boolean trylock_only;
        public boolean interruptible;
    }
}

