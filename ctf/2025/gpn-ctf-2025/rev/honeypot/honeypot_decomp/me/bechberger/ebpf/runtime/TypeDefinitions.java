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
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.IbDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TypeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void type_attribute_bounds_av(Ptr<runtime.policydb> policydb2, Ptr<runtime.context> scontext, Ptr<runtime.context> tcontext, @Unsigned short tclass, Ptr<misc.av_decision> avd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int type_bounds_sanity_check(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int type_destroy(Ptr<?> key2, Ptr<?> datum, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int type_index(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int type_read(Ptr<runtime.policydb> p, Ptr<runtime.symtab> s2, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="type_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long type_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int type_write(Ptr<?> vkey, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int type_pmu_register(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char type_merge(char type2, char new_type, Ptr<Character> uniform) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct type_mismatch_data_common")
    @NotUsableInJava
    public static class type_mismatch_data_common
    extends Struct {
        public Ptr<misc.source_location> location;
        public Ptr<type_descriptor> type;
        public @Unsigned long alignment;
        public char type_check_kind;
    }

    @Type(noCCodeGeneration=true, cType="struct type_mismatch_data_v1")
    @NotUsableInJava
    public static class type_mismatch_data_v1
    extends Struct {
        public misc.source_location location;
        public Ptr<type_descriptor> type;
        public char log_alignment;
        public char type_check_kind;
    }

    @Type(noCCodeGeneration=true, cType="struct type_mismatch_data")
    @NotUsableInJava
    public static class type_mismatch_data
    extends Struct {
        public misc.source_location location;
        public Ptr<type_descriptor> type;
        public @Unsigned long alignment;
        public char type_check_kind;
    }

    @Type(noCCodeGeneration=true, cType="struct type_descriptor")
    @NotUsableInJava
    public static class type_descriptor
    extends Struct {
        public @Unsigned short type_kind;
        public @Unsigned short type_info;
        public char @Size(value=0) [] type_name;
    }

    @Type(noCCodeGeneration=true, cType="enum type_of_xz_dec_bcj")
    public static enum type_of_xz_dec_bcj implements Enum<type_of_xz_dec_bcj>,
    TypedEnum<type_of_xz_dec_bcj, Integer>
    {
        BCJ_X86,
        BCJ_POWERPC,
        BCJ_IA64,
        BCJ_ARM,
        BCJ_ARMTHUMB,
        BCJ_SPARC,
        BCJ_ARM64,
        BCJ_RISCV;

    }

    @Type(noCCodeGeneration=true, cType="enum type_of_tcp_key")
    public static enum type_of_tcp_key implements Enum<type_of_tcp_key>,
    TypedEnum<type_of_tcp_key, Integer>
    {
        TCP_KEY_NONE,
        TCP_KEY_MD5,
        TCP_KEY_AO;

    }

    @Type(noCCodeGeneration=true, cType="enum type_of_dsa_port")
    public static enum type_of_dsa_port implements Enum<type_of_dsa_port>,
    TypedEnum<type_of_dsa_port, Integer>
    {
        DSA_PORT_TYPE_UNUSED,
        DSA_PORT_TYPE_CPU,
        DSA_PORT_TYPE_DSA,
        DSA_PORT_TYPE_USER;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int bit7; unsigned int bit6; unsigned int bit5; unsigned int bit4; unsigned int bit3; unsigned int bit2; unsigned int bit1; unsigned int bit0; unsigned int bit15; unsigned int bit14; unsigned int bit13; unsigned int bit12; unsigned int bit11; unsigned int bit10; unsigned int bit9; unsigned int bit8; unsigned int bit23; unsigned int bit22; unsigned int bit21; unsigned int bit20; unsigned int bit19; unsigned int bit18; unsigned int bit17; unsigned int bit16; }")
    @NotUsableInJava
    public static class type_of_anon_member_of_ioam6_trace_hdr
    extends Struct {
        public @Unsigned int bit7;
        public @Unsigned int bit6;
        public @Unsigned int bit5;
        public @Unsigned int bit4;
        public @Unsigned int bit3;
        public @Unsigned int bit2;
        public @Unsigned int bit1;
        public @Unsigned int bit0;
        public @Unsigned int bit15;
        public @Unsigned int bit14;
        public @Unsigned int bit13;
        public @Unsigned int bit12;
        public @Unsigned int bit11;
        public @Unsigned int bit10;
        public @Unsigned int bit9;
        public @Unsigned int bit8;
        public @Unsigned int bit23;
        public @Unsigned int bit22;
        public @Unsigned int bit21;
        public @Unsigned int bit20;
        public @Unsigned int bit19;
        public @Unsigned int bit18;
        public @Unsigned int bit17;
        public @Unsigned int bit16;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct ib_device *ibdev; }")
    @NotUsableInJava
    public static class type_ib_of_anon_member_of_devlink_port
    extends Struct {
        public Ptr<IbDefinitions.ib_device> ibdev;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct net_device *netdev; int ifindex; u8 ifname[16]; }")
    @NotUsableInJava
    public static class type_eth_of_anon_member_of_devlink_port
    extends Struct {
        public Ptr<NetDefinitions.net_device> netdev;
        public int ifindex;
        public char @Size(value=16) [] ifname;
    }

    @Type(noCCodeGeneration=true, cType="enum type_of_ptp_clock_request")
    public static enum type_of_ptp_clock_request implements Enum<type_of_ptp_clock_request>,
    TypedEnum<type_of_ptp_clock_request, Integer>
    {
        PTP_CLK_REQ_EXTTS,
        PTP_CLK_REQ_PEROUT,
        PTP_CLK_REQ_PPS;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct rtattr attr; struct crypto_attr_type data; }")
    @NotUsableInJava
    public static class type_of_cryptomgr_param
    extends Struct {
        public runtime.rtattr attr;
        public CryptoDefinitions.crypto_attr_type data;
    }

    @Type(noCCodeGeneration=true, cType="struct type_datum")
    @NotUsableInJava
    public static class type_datum
    extends Struct {
        public @Unsigned int value;
        public @Unsigned int bounds;
        public char primary;
        public char attribute;
    }

    @Type(noCCodeGeneration=true, cType="struct type_set")
    @NotUsableInJava
    public static class type_set
    extends Struct {
        public runtime.ebitmap types;
        public runtime.ebitmap negset;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum type_of_nfs4_stateid_and_type_of_nfs4_stateid_struct")
    public static enum type_of_nfs4_stateid_and_type_of_nfs4_stateid_struct implements Enum<type_of_nfs4_stateid_and_type_of_nfs4_stateid_struct>,
    TypedEnum<type_of_nfs4_stateid_and_type_of_nfs4_stateid_struct, Integer>
    {
        NFS4_INVALID_STATEID_TYPE,
        NFS4_SPECIAL_STATEID_TYPE,
        NFS4_OPEN_STATEID_TYPE,
        NFS4_LOCK_STATEID_TYPE,
        NFS4_DELEGATION_STATEID_TYPE,
        NFS4_LAYOUT_STATEID_TYPE,
        NFS4_PNFS_DS_STATEID_TYPE,
        NFS4_REVOKED_STATEID_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum type_of_ctl_table_header")
    public static enum type_of_ctl_table_header implements Enum<type_of_ctl_table_header>,
    TypedEnum<type_of_ctl_table_header, Integer>
    {
        SYSCTL_TABLE_TYPE_DEFAULT,
        SYSCTL_TABLE_TYPE_PERMANENTLY_EMPTY;

    }
}

