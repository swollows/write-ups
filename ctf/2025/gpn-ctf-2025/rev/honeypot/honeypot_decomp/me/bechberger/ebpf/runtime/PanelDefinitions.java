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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PanelDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void panel_bridge_atomic_disable(Ptr<DrmDefinitions.drm_bridge> bridge, Ptr<DrmDefinitions.drm_bridge_state> old_bridge_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void panel_bridge_atomic_enable(Ptr<DrmDefinitions.drm_bridge> bridge, Ptr<DrmDefinitions.drm_bridge_state> old_bridge_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void panel_bridge_atomic_post_disable(Ptr<DrmDefinitions.drm_bridge> bridge, Ptr<DrmDefinitions.drm_bridge_state> old_bridge_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void panel_bridge_atomic_pre_enable(Ptr<DrmDefinitions.drm_bridge> bridge, Ptr<DrmDefinitions.drm_bridge_state> old_bridge_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int panel_bridge_attach(Ptr<DrmDefinitions.drm_bridge> bridge, DrmDefinitions.drm_bridge_attach_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int panel_bridge_connector_get_modes(Ptr<DrmDefinitions.drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void panel_bridge_debugfs_init(Ptr<DrmDefinitions.drm_bridge> bridge, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void panel_bridge_detach(Ptr<DrmDefinitions.drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int panel_bridge_get_modes(Ptr<DrmDefinitions.drm_bridge> bridge, Ptr<DrmDefinitions.drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long panel_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct panel_bridge")
    @NotUsableInJava
    public static class panel_bridge
    extends Struct {
        public DrmDefinitions.drm_bridge bridge;
        public DrmDefinitions.drm_connector connector;
        public Ptr<DrmDefinitions.drm_panel> panel;
        public @Unsigned int connector_type;
    }
}

