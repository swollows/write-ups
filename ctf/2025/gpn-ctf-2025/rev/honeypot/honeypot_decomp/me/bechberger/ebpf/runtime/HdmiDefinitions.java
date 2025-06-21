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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class HdmiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_audio_infoframe_check((const struct hdmi_audio_infoframe*)$arg1)")
    public static int hdmi_audio_infoframe_check(Ptr<hdmi_audio_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_audio_infoframe_init(Ptr<hdmi_audio_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_audio_infoframe_log((const u8*)$arg1, $arg2, (const struct hdmi_audio_infoframe*)$arg3)")
    public static void hdmi_audio_infoframe_log(String level, Ptr<runtime.device> dev, Ptr<hdmi_audio_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_audio_infoframe_pack(Ptr<hdmi_audio_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_audio_infoframe_pack_for_dp((const struct hdmi_audio_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_audio_infoframe_pack_for_dp(Ptr<hdmi_audio_infoframe> frame, Ptr<misc.dp_sdp> sdp, char dp_version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_audio_infoframe_pack_only((const struct hdmi_audio_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_audio_infoframe_pack_only(Ptr<hdmi_audio_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_audio_infoframe_pack_payload((const struct hdmi_audio_infoframe*)$arg1, $arg2)")
    public static void hdmi_audio_infoframe_pack_payload(Ptr<hdmi_audio_infoframe> frame, Ptr<Character> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_avi_infoframe_check(Ptr<hdmi_avi_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hdmi_avi_infoframe_init(Ptr<hdmi_avi_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_avi_infoframe_log((const u8*)$arg1, $arg2, (const struct hdmi_avi_infoframe*)$arg3)")
    public static void hdmi_avi_infoframe_log(String level, Ptr<runtime.device> dev, Ptr<hdmi_avi_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_avi_infoframe_pack(Ptr<hdmi_avi_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_avi_infoframe_pack_only((const struct hdmi_avi_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_avi_infoframe_pack_only(Ptr<hdmi_avi_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_avi_infoframe_unpack($arg1, (const void*)$arg2, $arg3)")
    public static int hdmi_avi_infoframe_unpack(Ptr<hdmi_avi_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_drm_infoframe_check(Ptr<hdmi_drm_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_drm_infoframe_init(Ptr<hdmi_drm_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_drm_infoframe_pack(Ptr<hdmi_drm_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_drm_infoframe_pack_only((const struct hdmi_drm_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_drm_infoframe_pack_only(Ptr<hdmi_drm_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_drm_infoframe_unpack_only($arg1, (const void*)$arg2, $arg3)")
    public static int hdmi_drm_infoframe_unpack_only(Ptr<hdmi_drm_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_infoframe_check(Ptr<hdmi_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_infoframe_log((const u8*)$arg1, $arg2, (const union hdmi_infoframe*)$arg3)")
    public static void hdmi_infoframe_log(String level, Ptr<runtime.device> dev, Ptr<hdmi_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_infoframe_log_header((const u8*)$arg1, $arg2, (const struct hdmi_any_infoframe*)$arg3)")
    public static void hdmi_infoframe_log_header(String level, Ptr<runtime.device> dev, Ptr<hdmi_any_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_infoframe_pack(Ptr<hdmi_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_infoframe_pack_only((const union hdmi_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_infoframe_pack_only(Ptr<hdmi_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_infoframe_unpack($arg1, (const void*)$arg2, $arg3)")
    public static int hdmi_infoframe_unpack(Ptr<hdmi_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_read_infoframe(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_spd_infoframe_check(Ptr<hdmi_spd_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_spd_infoframe_init($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int hdmi_spd_infoframe_init(Ptr<hdmi_spd_infoframe> frame, String vendor, String product) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_spd_infoframe_pack(Ptr<hdmi_spd_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_spd_infoframe_pack_only((const struct hdmi_spd_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_spd_infoframe_pack_only(Ptr<hdmi_spd_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_vendor_infoframe_check(Ptr<hdmi_vendor_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_vendor_infoframe_check_only((const struct hdmi_vendor_infoframe*)$arg1)")
    public static int hdmi_vendor_infoframe_check_only(Ptr<hdmi_vendor_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hdmi_vendor_infoframe_init(Ptr<hdmi_vendor_infoframe> frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hdmi_vendor_infoframe_pack(Ptr<hdmi_vendor_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hdmi_vendor_infoframe_pack_only((const struct hdmi_vendor_infoframe*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long hdmi_vendor_infoframe_pack_only(Ptr<hdmi_vendor_infoframe> frame, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_3d_structure")
    public static enum hdmi_3d_structure implements Enum<hdmi_3d_structure>,
    TypedEnum<hdmi_3d_structure, Integer>
    {
        HDMI_3D_STRUCTURE_INVALID,
        HDMI_3D_STRUCTURE_FRAME_PACKING,
        HDMI_3D_STRUCTURE_FIELD_ALTERNATIVE,
        HDMI_3D_STRUCTURE_LINE_ALTERNATIVE,
        HDMI_3D_STRUCTURE_SIDE_BY_SIDE_FULL,
        HDMI_3D_STRUCTURE_L_DEPTH,
        HDMI_3D_STRUCTURE_L_DEPTH_GFX_GFX_DEPTH,
        HDMI_3D_STRUCTURE_TOP_AND_BOTTOM,
        HDMI_3D_STRUCTURE_SIDE_BY_SIDE_HALF;

    }

    @Type(noCCodeGeneration=true, cType="union hdmi_infoframe")
    @NotUsableInJava
    public static class hdmi_infoframe
    extends Union {
        public hdmi_any_infoframe any;
        public hdmi_avi_infoframe avi;
        public hdmi_spd_infoframe spd;
        public hdmi_vendor_any_infoframe vendor;
        public hdmi_audio_infoframe audio;
        public hdmi_drm_infoframe drm;
    }

    @Type(noCCodeGeneration=true, cType="union hdmi_vendor_any_infoframe")
    @NotUsableInJava
    public static class hdmi_vendor_any_infoframe
    extends Union {
        public misc.any_of_hdmi_vendor_any_infoframe any;
        public hdmi_vendor_infoframe hdmi;
    }

    @Type(noCCodeGeneration=true, cType="struct hdmi_vendor_infoframe")
    @NotUsableInJava
    public static class hdmi_vendor_infoframe
    extends Struct {
        public hdmi_infoframe_type type;
        public char version;
        public char length;
        public @Unsigned int oui;
        public char vic;
        public hdmi_3d_structure s3d_struct;
        public @Unsigned int s3d_ext_data;
    }

    @Type(noCCodeGeneration=true, cType="struct hdmi_audio_infoframe")
    @NotUsableInJava
    public static class hdmi_audio_infoframe
    extends Struct {
        public hdmi_infoframe_type type;
        public char version;
        public char length;
        public char channels;
        public hdmi_audio_coding_type coding_type;
        public hdmi_audio_sample_size sample_size;
        public hdmi_audio_sample_frequency sample_frequency;
        public hdmi_audio_coding_type_ext coding_type_ext;
        public char channel_allocation;
        public char level_shift_value;
        public boolean downmix_inhibit;
    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_audio_coding_type_ext")
    public static enum hdmi_audio_coding_type_ext implements Enum<hdmi_audio_coding_type_ext>,
    TypedEnum<hdmi_audio_coding_type_ext, Integer>
    {
        HDMI_AUDIO_CODING_TYPE_EXT_CT,
        HDMI_AUDIO_CODING_TYPE_EXT_HE_AAC,
        HDMI_AUDIO_CODING_TYPE_EXT_HE_AAC_V2,
        HDMI_AUDIO_CODING_TYPE_EXT_MPEG_SURROUND,
        HDMI_AUDIO_CODING_TYPE_EXT_MPEG4_HE_AAC,
        HDMI_AUDIO_CODING_TYPE_EXT_MPEG4_HE_AAC_V2,
        HDMI_AUDIO_CODING_TYPE_EXT_MPEG4_AAC_LC,
        HDMI_AUDIO_CODING_TYPE_EXT_DRA,
        HDMI_AUDIO_CODING_TYPE_EXT_MPEG4_HE_AAC_SURROUND,
        HDMI_AUDIO_CODING_TYPE_EXT_MPEG4_AAC_LC_SURROUND;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_audio_sample_frequency")
    public static enum hdmi_audio_sample_frequency implements Enum<hdmi_audio_sample_frequency>,
    TypedEnum<hdmi_audio_sample_frequency, Integer>
    {
        HDMI_AUDIO_SAMPLE_FREQUENCY_STREAM,
        HDMI_AUDIO_SAMPLE_FREQUENCY_32000,
        HDMI_AUDIO_SAMPLE_FREQUENCY_44100,
        HDMI_AUDIO_SAMPLE_FREQUENCY_48000,
        HDMI_AUDIO_SAMPLE_FREQUENCY_88200,
        HDMI_AUDIO_SAMPLE_FREQUENCY_96000,
        HDMI_AUDIO_SAMPLE_FREQUENCY_176400,
        HDMI_AUDIO_SAMPLE_FREQUENCY_192000;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_audio_sample_size")
    public static enum hdmi_audio_sample_size implements Enum<hdmi_audio_sample_size>,
    TypedEnum<hdmi_audio_sample_size, Integer>
    {
        HDMI_AUDIO_SAMPLE_SIZE_STREAM,
        HDMI_AUDIO_SAMPLE_SIZE_16,
        HDMI_AUDIO_SAMPLE_SIZE_20,
        HDMI_AUDIO_SAMPLE_SIZE_24;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_audio_coding_type")
    public static enum hdmi_audio_coding_type implements Enum<hdmi_audio_coding_type>,
    TypedEnum<hdmi_audio_coding_type, Integer>
    {
        HDMI_AUDIO_CODING_TYPE_STREAM,
        HDMI_AUDIO_CODING_TYPE_PCM,
        HDMI_AUDIO_CODING_TYPE_AC3,
        HDMI_AUDIO_CODING_TYPE_MPEG1,
        HDMI_AUDIO_CODING_TYPE_MP3,
        HDMI_AUDIO_CODING_TYPE_MPEG2,
        HDMI_AUDIO_CODING_TYPE_AAC_LC,
        HDMI_AUDIO_CODING_TYPE_DTS,
        HDMI_AUDIO_CODING_TYPE_ATRAC,
        HDMI_AUDIO_CODING_TYPE_DSD,
        HDMI_AUDIO_CODING_TYPE_EAC3,
        HDMI_AUDIO_CODING_TYPE_DTS_HD,
        HDMI_AUDIO_CODING_TYPE_MLP,
        HDMI_AUDIO_CODING_TYPE_DST,
        HDMI_AUDIO_CODING_TYPE_WMA_PRO,
        HDMI_AUDIO_CODING_TYPE_CXT;

    }

    @Type(noCCodeGeneration=true, cType="struct hdmi_spd_infoframe")
    @NotUsableInJava
    public static class hdmi_spd_infoframe
    extends Struct {
        public hdmi_infoframe_type type;
        public char version;
        public char length;
        public char @Size(value=8) [] vendor;
        public char @Size(value=16) [] product;
        public hdmi_spd_sdi sdi;
    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_spd_sdi")
    public static enum hdmi_spd_sdi implements Enum<hdmi_spd_sdi>,
    TypedEnum<hdmi_spd_sdi, Integer>
    {
        HDMI_SPD_SDI_UNKNOWN,
        HDMI_SPD_SDI_DSTB,
        HDMI_SPD_SDI_DVDP,
        HDMI_SPD_SDI_DVHS,
        HDMI_SPD_SDI_HDDVR,
        HDMI_SPD_SDI_DVC,
        HDMI_SPD_SDI_DSC,
        HDMI_SPD_SDI_VCD,
        HDMI_SPD_SDI_GAME,
        HDMI_SPD_SDI_PC,
        HDMI_SPD_SDI_BD,
        HDMI_SPD_SDI_SACD,
        HDMI_SPD_SDI_HDDVD,
        HDMI_SPD_SDI_PMP;

    }

    @Type(noCCodeGeneration=true, cType="struct hdmi_drm_infoframe")
    @NotUsableInJava
    public static class hdmi_drm_infoframe
    extends Struct {
        public hdmi_infoframe_type type;
        public char version;
        public char length;
        public hdmi_eotf eotf;
        public hdmi_metadata_type metadata_type;
        public misc.white_point_of_hdmi_drm_infoframe @Size(value=3) [] display_primaries;
        public misc.white_point_of_hdmi_drm_infoframe white_point;
        public @Unsigned short max_display_mastering_luminance;
        public @Unsigned short min_display_mastering_luminance;
        public @Unsigned short max_cll;
        public @Unsigned short max_fall;
    }

    @Type(noCCodeGeneration=true, cType="struct hdmi_avi_infoframe")
    @NotUsableInJava
    public static class hdmi_avi_infoframe
    extends Struct {
        public hdmi_infoframe_type type;
        public char version;
        public char length;
        public boolean itc;
        public char pixel_repeat;
        public hdmi_colorspace colorspace;
        public hdmi_scan_mode scan_mode;
        public hdmi_colorimetry colorimetry;
        public hdmi_picture_aspect picture_aspect;
        public hdmi_active_aspect active_aspect;
        public hdmi_extended_colorimetry extended_colorimetry;
        public hdmi_quantization_range quantization_range;
        public hdmi_nups nups;
        public char video_code;
        public hdmi_ycc_quantization_range ycc_quantization_range;
        public hdmi_content_type content_type;
        public @Unsigned short top_bar;
        public @Unsigned short bottom_bar;
        public @Unsigned short left_bar;
        public @Unsigned short right_bar;
    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_eotf")
    public static enum hdmi_eotf implements Enum<hdmi_eotf>,
    TypedEnum<hdmi_eotf, Integer>
    {
        HDMI_EOTF_TRADITIONAL_GAMMA_SDR,
        HDMI_EOTF_TRADITIONAL_GAMMA_HDR,
        HDMI_EOTF_SMPTE_ST2084,
        HDMI_EOTF_BT_2100_HLG;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_metadata_type")
    public static enum hdmi_metadata_type implements Enum<hdmi_metadata_type>,
    TypedEnum<hdmi_metadata_type, Integer>
    {
        HDMI_STATIC_METADATA_TYPE1;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_content_type")
    public static enum hdmi_content_type implements Enum<hdmi_content_type>,
    TypedEnum<hdmi_content_type, Integer>
    {
        HDMI_CONTENT_TYPE_GRAPHICS,
        HDMI_CONTENT_TYPE_PHOTO,
        HDMI_CONTENT_TYPE_CINEMA,
        HDMI_CONTENT_TYPE_GAME;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_ycc_quantization_range")
    public static enum hdmi_ycc_quantization_range implements Enum<hdmi_ycc_quantization_range>,
    TypedEnum<hdmi_ycc_quantization_range, Integer>
    {
        HDMI_YCC_QUANTIZATION_RANGE_LIMITED,
        HDMI_YCC_QUANTIZATION_RANGE_FULL;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_nups")
    public static enum hdmi_nups implements Enum<hdmi_nups>,
    TypedEnum<hdmi_nups, Integer>
    {
        HDMI_NUPS_UNKNOWN,
        HDMI_NUPS_HORIZONTAL,
        HDMI_NUPS_VERTICAL,
        HDMI_NUPS_BOTH;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_quantization_range")
    public static enum hdmi_quantization_range implements Enum<hdmi_quantization_range>,
    TypedEnum<hdmi_quantization_range, Integer>
    {
        HDMI_QUANTIZATION_RANGE_DEFAULT,
        HDMI_QUANTIZATION_RANGE_LIMITED,
        HDMI_QUANTIZATION_RANGE_FULL,
        HDMI_QUANTIZATION_RANGE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_extended_colorimetry")
    public static enum hdmi_extended_colorimetry implements Enum<hdmi_extended_colorimetry>,
    TypedEnum<hdmi_extended_colorimetry, Integer>
    {
        HDMI_EXTENDED_COLORIMETRY_XV_YCC_601,
        HDMI_EXTENDED_COLORIMETRY_XV_YCC_709,
        HDMI_EXTENDED_COLORIMETRY_S_YCC_601,
        HDMI_EXTENDED_COLORIMETRY_OPYCC_601,
        HDMI_EXTENDED_COLORIMETRY_OPRGB,
        HDMI_EXTENDED_COLORIMETRY_BT2020_CONST_LUM,
        HDMI_EXTENDED_COLORIMETRY_BT2020,
        HDMI_EXTENDED_COLORIMETRY_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_active_aspect")
    public static enum hdmi_active_aspect implements Enum<hdmi_active_aspect>,
    TypedEnum<hdmi_active_aspect, Integer>
    {
        HDMI_ACTIVE_ASPECT_16_9_TOP,
        HDMI_ACTIVE_ASPECT_14_9_TOP,
        HDMI_ACTIVE_ASPECT_16_9_CENTER,
        HDMI_ACTIVE_ASPECT_PICTURE,
        HDMI_ACTIVE_ASPECT_4_3,
        HDMI_ACTIVE_ASPECT_16_9,
        HDMI_ACTIVE_ASPECT_14_9,
        HDMI_ACTIVE_ASPECT_4_3_SP_14_9,
        HDMI_ACTIVE_ASPECT_16_9_SP_14_9,
        HDMI_ACTIVE_ASPECT_16_9_SP_4_3;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_colorimetry")
    public static enum hdmi_colorimetry implements Enum<hdmi_colorimetry>,
    TypedEnum<hdmi_colorimetry, Integer>
    {
        HDMI_COLORIMETRY_NONE,
        HDMI_COLORIMETRY_ITU_601,
        HDMI_COLORIMETRY_ITU_709,
        HDMI_COLORIMETRY_EXTENDED;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_scan_mode")
    public static enum hdmi_scan_mode implements Enum<hdmi_scan_mode>,
    TypedEnum<hdmi_scan_mode, Integer>
    {
        HDMI_SCAN_MODE_NONE,
        HDMI_SCAN_MODE_OVERSCAN,
        HDMI_SCAN_MODE_UNDERSCAN,
        HDMI_SCAN_MODE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_colorspace")
    public static enum hdmi_colorspace implements Enum<hdmi_colorspace>,
    TypedEnum<hdmi_colorspace, Integer>
    {
        HDMI_COLORSPACE_RGB,
        HDMI_COLORSPACE_YUV422,
        HDMI_COLORSPACE_YUV444,
        HDMI_COLORSPACE_YUV420,
        HDMI_COLORSPACE_RESERVED4,
        HDMI_COLORSPACE_RESERVED5,
        HDMI_COLORSPACE_RESERVED6,
        HDMI_COLORSPACE_IDO_DEFINED;

    }

    @Type(noCCodeGeneration=true, cType="struct hdmi_any_infoframe")
    @NotUsableInJava
    public static class hdmi_any_infoframe
    extends Struct {
        public hdmi_infoframe_type type;
        public char version;
        public char length;
    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_infoframe_type")
    public static enum hdmi_infoframe_type implements Enum<hdmi_infoframe_type>,
    TypedEnum<hdmi_infoframe_type, Integer>
    {
        HDMI_INFOFRAME_TYPE_VENDOR,
        HDMI_INFOFRAME_TYPE_AVI,
        HDMI_INFOFRAME_TYPE_SPD,
        HDMI_INFOFRAME_TYPE_AUDIO,
        HDMI_INFOFRAME_TYPE_DRM;

    }

    @Type(noCCodeGeneration=true, cType="enum hdmi_picture_aspect")
    public static enum hdmi_picture_aspect implements Enum<hdmi_picture_aspect>,
    TypedEnum<hdmi_picture_aspect, Integer>
    {
        HDMI_PICTURE_ASPECT_NONE,
        HDMI_PICTURE_ASPECT_4_3,
        HDMI_PICTURE_ASPECT_16_9,
        HDMI_PICTURE_ASPECT_64_27,
        HDMI_PICTURE_ASPECT_256_135,
        HDMI_PICTURE_ASPECT_RESERVED;

    }
}

