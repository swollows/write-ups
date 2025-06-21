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
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CmisDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_cdb_advertisement_get(Ptr<EthtoolDefinitions.ethtool_cmis_cdb> cdb, Ptr<NetDefinitions.net_device> dev, Ptr<EthnlDefinitions.ethnl_module_fw_flash_ntf_params> ntf_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_cdb_module_features_get(Ptr<EthtoolDefinitions.ethtool_cmis_cdb> cdb, Ptr<NetDefinitions.net_device> dev, Ptr<EthnlDefinitions.ethnl_module_fw_flash_ntf_params> ntf_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_cdb_process_reply(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_module_eeprom> page_data, Ptr<EthtoolDefinitions.ethtool_cmis_cdb_cmd_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_rev_major_get(Ptr<NetDefinitions.net_device> dev, Ptr<Character> rev_major) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_fw_update_fw_mng_features_get(Ptr<EthtoolDefinitions.ethtool_cmis_cdb> cdb, Ptr<NetDefinitions.net_device> dev, Ptr<cmis_fw_update_fw_mng_features> fw_mng, Ptr<EthnlDefinitions.ethnl_module_fw_flash_ntf_params> ntf_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_fw_update_start_download(Ptr<EthtoolDefinitions.ethtool_cmis_cdb> cdb, Ptr<EthtoolDefinitions.ethtool_cmis_fw_update_params> fw_update, Ptr<cmis_fw_update_fw_mng_features> fw_mng) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmis_fw_update_write_image(Ptr<EthtoolDefinitions.ethtool_cmis_cdb> cdb, Ptr<EthtoolDefinitions.ethtool_cmis_fw_update_params> fw_update, Ptr<cmis_fw_update_fw_mng_features> fw_mng) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_wait_for_cond_rpl")
    @NotUsableInJava
    public static class cmis_wait_for_cond_rpl
    extends Struct {
        public char state;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_module_features_rpl")
    @NotUsableInJava
    public static class cmis_cdb_module_features_rpl
    extends Struct {
        public char @Size(value=34) [] resv1;
        public @Unsigned @OriginalName(value="__be16") short max_completion_time;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_query_status_rpl")
    @NotUsableInJava
    public static class cmis_cdb_query_status_rpl
    extends Struct {
        public char length;
        public char status;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_query_status_pl")
    @NotUsableInJava
    public static class cmis_cdb_query_status_pl
    extends Struct {
        public @Unsigned short response_delay;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_password_entry_pl")
    @NotUsableInJava
    public static class cmis_password_entry_pl
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int password;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_advert_rpl")
    @NotUsableInJava
    public static class cmis_cdb_advert_rpl
    extends Struct {
        public char inst_supported;
        public char read_write_len_ext;
        public char resv1;
        public char resv2;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_rev_rpl")
    @NotUsableInJava
    public static class cmis_rev_rpl
    extends Struct {
        public char rev;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_run_fw_image_pl")
    @NotUsableInJava
    public static class cmis_cdb_run_fw_image_pl
    extends Struct {
        public char resv1;
        public char image_to_run;
        public @Unsigned short delay_to_reset;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_write_fw_block_lpl_pl")
    @NotUsableInJava
    public static class cmis_cdb_write_fw_block_lpl_pl
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int block_address;
        public char @Size(value=116) [] fw_block;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_start_fw_download_pl")
    @NotUsableInJava
    public static class cmis_cdb_start_fw_download_pl
    extends Struct {
        @InlineUnion(value=25367)
        public  @InlineUnion(value=25367) AnonDefinitions.anon_member_of_anon_member_of_cmis_cdb_start_fw_download_pl anon0$0;
        @InlineUnion(value=25367)
        public @InlineUnion(value=25367) cmis_cdb_start_fw_download_pl_h head;
        public char @Size(value=112) [] vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_start_fw_download_pl_h")
    @NotUsableInJava
    public static class cmis_cdb_start_fw_download_pl_h
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int image_size;
        public @Unsigned @OriginalName(value="__be32") int resv1;
    }

    @Type(noCCodeGeneration=true, cType="enum cmis_cdb_fw_write_mechanism")
    public static enum cmis_cdb_fw_write_mechanism implements Enum<cmis_cdb_fw_write_mechanism>,
    TypedEnum<cmis_cdb_fw_write_mechanism, Integer>
    {
        CMIS_CDB_FW_WRITE_MECHANISM_LPL,
        CMIS_CDB_FW_WRITE_MECHANISM_BOTH;

    }

    @Type(noCCodeGeneration=true, cType="struct cmis_cdb_fw_mng_features_rpl")
    @NotUsableInJava
    public static class cmis_cdb_fw_mng_features_rpl
    extends Struct {
        public char resv1;
        public char resv2;
        public char start_cmd_payload_size;
        public char resv3;
        public char read_write_len_ext;
        public char write_mechanism;
        public char resv4;
        public char resv5;
        public @Unsigned @OriginalName(value="__be16") short max_duration_start;
        public @Unsigned @OriginalName(value="__be16") short resv6;
        public @Unsigned @OriginalName(value="__be16") short max_duration_write;
        public @Unsigned @OriginalName(value="__be16") short max_duration_complete;
        public @Unsigned @OriginalName(value="__be16") short resv7;
    }

    @Type(noCCodeGeneration=true, cType="struct cmis_fw_update_fw_mng_features")
    @NotUsableInJava
    public static class cmis_fw_update_fw_mng_features
    extends Struct {
        public char start_cmd_payload_size;
        public @Unsigned short max_duration_start;
        public @Unsigned short max_duration_write;
        public @Unsigned short max_duration_complete;
    }
}

