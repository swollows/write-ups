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
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SimpledrmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simpledrm_connector_helper_get_modes(Ptr<DrmDefinitions.drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simpledrm_crtc_helper_mode_valid($arg1, (const struct drm_display_mode*)$arg2)")
    public static DrmDefinitions.drm_mode_status simpledrm_crtc_helper_mode_valid(Ptr<DrmDefinitions.drm_crtc> crtc, Ptr<DrmDefinitions.drm_display_mode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simpledrm_platform_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simpledrm_platform_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simpledrm_primary_plane_helper_atomic_check(Ptr<DrmDefinitions.drm_plane> plane, Ptr<DrmDefinitions.drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simpledrm_primary_plane_helper_atomic_disable(Ptr<DrmDefinitions.drm_plane> plane, Ptr<DrmDefinitions.drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simpledrm_primary_plane_helper_atomic_update(Ptr<DrmDefinitions.drm_plane> plane, Ptr<DrmDefinitions.drm_atomic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simpledrm_primary_plane_helper_get_scanout_buffer(Ptr<DrmDefinitions.drm_plane> plane, Ptr<DrmDefinitions.drm_scanout_buffer> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simpledrm_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simpledrm_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct simpledrm_device")
    @NotUsableInJava
    public static class simpledrm_device
    extends Struct {
        public DrmDefinitions.drm_device dev;
        public DrmDefinitions.drm_display_mode mode;
        public Ptr<DrmDefinitions.drm_format_info> format;
        public @Unsigned int pitch;
        public misc.iosys_map screen_base;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=8) [] formats;
        public @Unsigned long nformats;
        public DrmDefinitions.drm_plane primary_plane;
        public DrmDefinitions.drm_crtc crtc;
        public DrmDefinitions.drm_encoder encoder;
        public DrmDefinitions.drm_connector connector;
    }
}

