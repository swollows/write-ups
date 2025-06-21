/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FfDefinitions {

    @Type(noCCodeGeneration=true, cType="struct ff_effect_compat")
    @NotUsableInJava
    public static class ff_effect_compat
    extends Struct {
        public @Unsigned short type;
        public short id;
        public @Unsigned short direction;
        public ff_trigger trigger;
        public ff_replay replay;
        public UDefinitions.u_of_ff_effect_compat u;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_periodic_effect_compat")
    @NotUsableInJava
    public static class ff_periodic_effect_compat
    extends Struct {
        public @Unsigned short waveform;
        public @Unsigned short period;
        public short magnitude;
        public short offset;
        public @Unsigned short phase;
        public ff_envelope envelope;
        public @Unsigned int custom_len;
        public @Unsigned @OriginalName(value="compat_uptr_t") int custom_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_device")
    @NotUsableInJava
    public static class ff_device
    extends Struct {
        public Ptr<?> upload;
        public Ptr<?> erase;
        public Ptr<?> playback;
        public Ptr<?> set_gain;
        public Ptr<?> set_autocenter;
        public Ptr<?> destroy;
        public Ptr<?> _private;
        public @Unsigned long @Size(value=2) [] ffbit;
        public runtime.mutex mutex;
        public int max_effects;
        public Ptr<ff_effect> effects;
        public Ptr<runtime.file> @Size(value=0) [] effect_owners;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_effect")
    @NotUsableInJava
    public static class ff_effect
    extends Struct {
        public @Unsigned short type;
        public short id;
        public @Unsigned short direction;
        public ff_trigger trigger;
        public ff_replay replay;
        public UDefinitions.u_of_ff_effect u;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_rumble_effect")
    @NotUsableInJava
    public static class ff_rumble_effect
    extends Struct {
        public @Unsigned short strong_magnitude;
        public @Unsigned short weak_magnitude;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_periodic_effect")
    @NotUsableInJava
    public static class ff_periodic_effect
    extends Struct {
        public @Unsigned short waveform;
        public @Unsigned short period;
        public short magnitude;
        public short offset;
        public @Unsigned short phase;
        public ff_envelope envelope;
        public @Unsigned int custom_len;
        public Ptr<Short> custom_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_condition_effect")
    @NotUsableInJava
    public static class ff_condition_effect
    extends Struct {
        public @Unsigned short right_saturation;
        public @Unsigned short left_saturation;
        public short right_coeff;
        public short left_coeff;
        public @Unsigned short deadband;
        public short center;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_ramp_effect")
    @NotUsableInJava
    public static class ff_ramp_effect
    extends Struct {
        public short start_level;
        public short end_level;
        public ff_envelope envelope;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_constant_effect")
    @NotUsableInJava
    public static class ff_constant_effect
    extends Struct {
        public short level;
        public ff_envelope envelope;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_envelope")
    @NotUsableInJava
    public static class ff_envelope
    extends Struct {
        public @Unsigned short attack_length;
        public @Unsigned short attack_level;
        public @Unsigned short fade_length;
        public @Unsigned short fade_level;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_trigger")
    @NotUsableInJava
    public static class ff_trigger
    extends Struct {
        public @Unsigned short button;
        public @Unsigned short interval;
    }

    @Type(noCCodeGeneration=true, cType="struct ff_replay")
    @NotUsableInJava
    public static class ff_replay
    extends Struct {
        public @Unsigned short length;
        public @Unsigned short delay;
    }
}

