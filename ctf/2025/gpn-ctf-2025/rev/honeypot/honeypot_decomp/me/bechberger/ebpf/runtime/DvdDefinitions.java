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
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class DvdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dvd_do_auth(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<dvd_authinfo> ai) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dvd_read_bca(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<dvd_struct> s2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dvd_read_disckey(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<dvd_struct> s2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dvd_read_manufact(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<dvd_struct> s2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dvd_read_physical(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<dvd_struct> s2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { u8 type; struct dvd_lu_send_agid lsa; struct dvd_host_send_challenge hsc; struct dvd_send_key lsk; struct dvd_lu_send_challenge lsc; struct dvd_send_key hsk; struct dvd_lu_send_title_key lstk; struct dvd_lu_send_asf lsasf; struct dvd_host_send_rpcstate hrpcs; struct dvd_lu_send_rpcstate lrpcs; }")
    @NotUsableInJava
    public static class dvd_authinfo
    extends Union {
        public char type;
        public dvd_lu_send_agid lsa;
        public dvd_host_send_challenge hsc;
        public dvd_send_key lsk;
        public dvd_lu_send_challenge lsc;
        public dvd_send_key hsk;
        public dvd_lu_send_title_key lstk;
        public dvd_lu_send_asf lsasf;
        public dvd_host_send_rpcstate hrpcs;
        public dvd_lu_send_rpcstate lrpcs;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_lu_send_rpcstate")
    @NotUsableInJava
    public static class dvd_lu_send_rpcstate
    extends Struct {
        public char type;
        public char vra;
        public char ucca;
        public char region_mask;
        public char rpc_scheme;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_host_send_rpcstate")
    @NotUsableInJava
    public static class dvd_host_send_rpcstate
    extends Struct {
        public char type;
        public char pdrc;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_lu_send_asf")
    @NotUsableInJava
    public static class dvd_lu_send_asf
    extends Struct {
        public char type;
        public @Unsigned int agid;
        public @Unsigned int asf;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_lu_send_title_key")
    @NotUsableInJava
    public static class dvd_lu_send_title_key
    extends Struct {
        public char type;
        public @Unsigned int agid;
        public char @Size(value=5) @OriginalName(value="dvd_key") [] title_key;
        public int lba;
        public @Unsigned int cpm;
        public @Unsigned int cp_sec;
        public @Unsigned int cgms;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_lu_send_challenge")
    @NotUsableInJava
    public static class dvd_lu_send_challenge
    extends Struct {
        public char type;
        public @Unsigned int agid;
        public char @Size(value=10) @OriginalName(value="dvd_challenge") [] chal;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_send_key")
    @NotUsableInJava
    public static class dvd_send_key
    extends Struct {
        public char type;
        public @Unsigned int agid;
        public char @Size(value=5) @OriginalName(value="dvd_key") [] key;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_host_send_challenge")
    @NotUsableInJava
    public static class dvd_host_send_challenge
    extends Struct {
        public char type;
        public @Unsigned int agid;
        public char @Size(value=10) @OriginalName(value="dvd_challenge") [] chal;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_lu_send_agid")
    @NotUsableInJava
    public static class dvd_lu_send_agid
    extends Struct {
        public char type;
        public @Unsigned int agid;
    }

    @Type(noCCodeGeneration=true, cType="union { u8 type; struct dvd_physical physical; struct dvd_copyright copyright; struct dvd_disckey disckey; struct dvd_bca bca; struct dvd_manufact manufact; }")
    @NotUsableInJava
    public static class dvd_struct
    extends Union {
        public char type;
        public dvd_physical physical;
        public dvd_copyright copyright;
        public dvd_disckey disckey;
        public dvd_bca bca;
        public dvd_manufact manufact;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_manufact")
    @NotUsableInJava
    public static class dvd_manufact
    extends Struct {
        public char type;
        public char layer_num;
        public int len;
        public char @Size(value=2048) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_bca")
    @NotUsableInJava
    public static class dvd_bca
    extends Struct {
        public char type;
        public int len;
        public char @Size(value=188) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_disckey")
    @NotUsableInJava
    public static class dvd_disckey
    extends Struct {
        public char type;
        public @Unsigned int agid;
        public char @Size(value=2048) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_copyright")
    @NotUsableInJava
    public static class dvd_copyright
    extends Struct {
        public char type;
        public char layer_num;
        public char cpst;
        public char rmi;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_physical")
    @NotUsableInJava
    public static class dvd_physical
    extends Struct {
        public char type;
        public char layer_num;
        public dvd_layer @Size(value=4) [] layer;
    }

    @Type(noCCodeGeneration=true, cType="struct dvd_layer")
    @NotUsableInJava
    public static class dvd_layer
    extends Struct {
        public char book_version;
        public char book_type;
        public char min_rate;
        public char disc_size;
        public char layer_type;
        public char track_path;
        public char nlayers;
        public char track_density;
        public char linear_density;
        public char bca;
        public @Unsigned int start_sector;
        public @Unsigned int end_sector;
        public @Unsigned int end_sector_l0;
    }
}

