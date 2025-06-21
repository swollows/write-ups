/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class UvhDefinitions {

    @Type(noCCodeGeneration=true, cType="union uvh_apicid")
    @NotUsableInJava
    public static class uvh_apicid
    extends Union {
        public @Unsigned long v;
        public uvh_apicid_s s;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_apicid_s")
    @NotUsableInJava
    public static class uvh_apicid_s
    extends Struct {
        public @Unsigned long local_apic_mask;
        public @Unsigned long local_apic_shift;
        public @Unsigned long unused1;
        public @Unsigned long pnode_mask;
        public @Unsigned long pnode_shift;
        public @Unsigned long unused2;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_mmr_overlay_config_u")
    @NotUsableInJava
    public static class uvh_rh_gam_mmr_overlay_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_mmr_overlay_config_s s;
        public misc.uvxh_rh_gam_mmr_overlay_config_s sx;
        public misc.uv4h_rh_gam_mmr_overlay_config_s s4;
        public misc.uv3h_rh_gam_mmr_overlay_config_s s3;
        public misc.uv2h_rh_gam_mmr_overlay_config_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_mmr_overlay_config_s")
    @NotUsableInJava
    public static class uvh_rh_gam_mmr_overlay_config_s
    extends Struct {
        public @Unsigned long rsvd_0_25;
        public @Unsigned long base;
        public @Unsigned long rsvd_46_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_mmioh_overlay_config1_u")
    @NotUsableInJava
    public static class uvh_rh_gam_mmioh_overlay_config1_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_mmioh_overlay_config1_s s;
        public misc.uvxh_rh_gam_mmioh_overlay_config1_s sx;
        public misc.uv4ah_rh_gam_mmioh_overlay_config1_mmr_s s4a;
        public misc.uv4h_rh_gam_mmioh_overlay_config1_s s4;
        public misc.uv3h_rh_gam_mmioh_overlay_config1_s s3;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_mmioh_overlay_config1_s")
    @NotUsableInJava
    public static class uvh_rh_gam_mmioh_overlay_config1_s
    extends Struct {
        public @Unsigned long rsvd_0_25;
        public @Unsigned long base;
        public @Unsigned long m_io;
        public @Unsigned long n_io;
        public @Unsigned long rsvd_56_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_mmioh_overlay_config0_u")
    @NotUsableInJava
    public static class uvh_rh_gam_mmioh_overlay_config0_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_mmioh_overlay_config0_s s;
        public misc.uvxh_rh_gam_mmioh_overlay_config0_s sx;
        public misc.uv4ah_rh_gam_mmioh_overlay_config0_mmr_s s4a;
        public misc.uv4h_rh_gam_mmioh_overlay_config0_s s4;
        public misc.uv3h_rh_gam_mmioh_overlay_config0_s s3;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_mmioh_overlay_config0_s")
    @NotUsableInJava
    public static class uvh_rh_gam_mmioh_overlay_config0_s
    extends Struct {
        public @Unsigned long rsvd_0_25;
        public @Unsigned long base;
        public @Unsigned long m_io;
        public @Unsigned long n_io;
        public @Unsigned long rsvd_56_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_mmioh_overlay_config_u")
    @NotUsableInJava
    public static class uvh_rh_gam_mmioh_overlay_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_mmioh_overlay_config_s s;
        public misc.uvxh_rh_gam_mmioh_overlay_config_s sx;
        public misc.uv2h_rh_gam_mmioh_overlay_config_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_mmioh_overlay_config_s")
    @NotUsableInJava
    public static class uvh_rh_gam_mmioh_overlay_config_s
    extends Struct {
        public @Unsigned long rsvd_0_26;
        public @Unsigned long base;
        public @Unsigned long m_io;
        public @Unsigned long n_io;
        public @Unsigned long rsvd_56_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_gru_overlay_config_u")
    @NotUsableInJava
    public static class uvh_rh_gam_gru_overlay_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_gru_overlay_config_s s;
        public misc.uvxh_rh_gam_gru_overlay_config_s sx;
        public misc.uv4ah_rh_gam_gru_overlay_config_s s4a;
        public misc.uv4h_rh_gam_gru_overlay_config_s s4;
        public misc.uv3h_rh_gam_gru_overlay_config_s s3;
        public misc.uv2h_rh_gam_gru_overlay_config_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_gru_overlay_config_s")
    @NotUsableInJava
    public static class uvh_rh_gam_gru_overlay_config_s
    extends Struct {
        public @Unsigned long rsvd_0_45;
        public @Unsigned long rsvd_46_51;
        public @Unsigned long n_gru;
        public @Unsigned long rsvd_56_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_alias_2_redirect_config_u")
    @NotUsableInJava
    public static class uvh_rh_gam_alias_2_redirect_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_alias_2_redirect_config_s s;
        public misc.uvxh_rh_gam_alias_2_redirect_config_s sx;
        public misc.uv4h_rh_gam_alias_2_redirect_config_s s4;
        public misc.uv3h_rh_gam_alias_2_redirect_config_s s3;
        public misc.uv2h_rh_gam_alias_2_redirect_config_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_alias_2_redirect_config_s")
    @NotUsableInJava
    public static class uvh_rh_gam_alias_2_redirect_config_s
    extends Struct {
        public @Unsigned long rsvd_0_23;
        public @Unsigned long dest_base;
        public @Unsigned long rsvd_46_63;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_alias_2_overlay_config_u")
    @NotUsableInJava
    public static class uvh_rh_gam_alias_2_overlay_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_alias_2_overlay_config_s s;
        public misc.uvxh_rh_gam_alias_2_overlay_config_s sx;
        public misc.uv4h_rh_gam_alias_2_overlay_config_s s4;
        public misc.uv3h_rh_gam_alias_2_overlay_config_s s3;
        public misc.uv2h_rh_gam_alias_2_overlay_config_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_alias_2_overlay_config_s")
    @NotUsableInJava
    public static class uvh_rh_gam_alias_2_overlay_config_s
    extends Struct {
        public @Unsigned long rsvd_0_23;
        public @Unsigned long base;
        public @Unsigned long rsvd_32_47;
        public @Unsigned long m_alias;
        public @Unsigned long rsvd_53_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh_gam_addr_map_config_u")
    @NotUsableInJava
    public static class uvh_rh_gam_addr_map_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh_gam_addr_map_config_s s;
        public misc.uvxh_rh_gam_addr_map_config_s sx;
        public misc.uv4h_rh_gam_addr_map_config_s s4;
        public misc.uv3h_rh_gam_addr_map_config_s s3;
        public misc.uv2h_rh_gam_addr_map_config_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh_gam_addr_map_config_s")
    @NotUsableInJava
    public static class uvh_rh_gam_addr_map_config_s
    extends Struct {
        public @Unsigned long rsvd_0_5;
        public @Unsigned long n_skt;
        public @Unsigned long rsvd_10_63;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh10_gam_mmr_overlay_config_u")
    @NotUsableInJava
    public static class uvh_rh10_gam_mmr_overlay_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh10_gam_mmr_overlay_config_s s;
        public misc.uvyh_rh10_gam_mmr_overlay_config_s sy;
        public misc.uv5h_rh10_gam_mmr_overlay_config_s s5;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh10_gam_mmr_overlay_config_s")
    @NotUsableInJava
    public static class uvh_rh10_gam_mmr_overlay_config_s
    extends Struct {
        public @Unsigned long undef_0_24;
        public @Unsigned long base;
        public @Unsigned long undef_52_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh10_gam_mmioh_overlay_config1_u")
    @NotUsableInJava
    public static class uvh_rh10_gam_mmioh_overlay_config1_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh10_gam_mmioh_overlay_config1_s s;
        public misc.uvyh_rh10_gam_mmioh_overlay_config1_s sy;
        public misc.uv5h_rh10_gam_mmioh_overlay_config1_s s5;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh10_gam_mmioh_overlay_config1_s")
    @NotUsableInJava
    public static class uvh_rh10_gam_mmioh_overlay_config1_s
    extends Struct {
        public @Unsigned long rsvd_0_25;
        public @Unsigned long base;
        public @Unsigned long m_io;
        public @Unsigned long n_io;
        public @Unsigned long undef_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh10_gam_mmioh_overlay_config0_u")
    @NotUsableInJava
    public static class uvh_rh10_gam_mmioh_overlay_config0_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh10_gam_mmioh_overlay_config0_s s;
        public misc.uvyh_rh10_gam_mmioh_overlay_config0_s sy;
        public misc.uv5h_rh10_gam_mmioh_overlay_config0_s s5;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh10_gam_mmioh_overlay_config0_s")
    @NotUsableInJava
    public static class uvh_rh10_gam_mmioh_overlay_config0_s
    extends Struct {
        public @Unsigned long rsvd_0_25;
        public @Unsigned long base;
        public @Unsigned long m_io;
        public @Unsigned long n_io;
        public @Unsigned long undef_62;
        public @Unsigned long enable;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_rh10_gam_addr_map_config_u")
    @NotUsableInJava
    public static class uvh_rh10_gam_addr_map_config_u
    extends Union {
        public @Unsigned long v;
        public uvh_rh10_gam_addr_map_config_s s;
        public misc.uvyh_rh10_gam_addr_map_config_s sy;
        public misc.uv5h_rh10_gam_addr_map_config_s s5;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_rh10_gam_addr_map_config_s")
    @NotUsableInJava
    public static class uvh_rh10_gam_addr_map_config_s
    extends Struct {
        public @Unsigned long undef_0_5;
        public @Unsigned long n_skt;
        public @Unsigned long undef_9_11;
        public @Unsigned long ls_enable;
        public @Unsigned long undef_13_15;
        public @Unsigned long mk_tme_keyid_bits;
        public @Unsigned long rsvd_20_63;
    }

    @Type(noCCodeGeneration=true, cType="union uvh_node_id_u")
    @NotUsableInJava
    public static class uvh_node_id_u
    extends Union {
        public @Unsigned long v;
        public uvh_node_id_s s;
        public misc.uvxh_node_id_s sx;
        public misc.uvyh_node_id_s sy;
        public misc.uv5h_node_id_s s5;
        public misc.uv4h_node_id_s s4;
        public misc.uv3h_node_id_s s3;
        public misc.uv2h_node_id_s s2;
    }

    @Type(noCCodeGeneration=true, cType="struct uvh_node_id_s")
    @NotUsableInJava
    public static class uvh_node_id_s
    extends Struct {
        public @Unsigned long force1;
        public @Unsigned long manufacturer;
        public @Unsigned long part_number;
        public @Unsigned long revision;
        public @Unsigned long rsvd_32_63;
    }
}

