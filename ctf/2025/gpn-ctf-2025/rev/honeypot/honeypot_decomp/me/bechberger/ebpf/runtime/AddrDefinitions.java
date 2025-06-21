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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.IcmpDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.PvclockDefinitions;
import me.bechberger.ebpf.runtime.VcpuDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class AddrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> addr_from_call(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.xarray> addr_to_vb_xa(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long addr_assign_type_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long addr_len_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct icmp_ext_echo_ctype3_hdr ctype3_hdr; union { unsigned int ipv4_addr; struct in6_addr ipv6_addr; }; }")
    @NotUsableInJava
    public static class addr_of_ident_of_icmp_ext_echo_iio
    extends Struct {
        public IcmpDefinitions.icmp_ext_echo_ctype3_hdr ctype3_hdr;
        public IpDefinitions.ip_addr_of_addr_of_ident_of_icmp_ext_echo_iio ip_addr;
    }

    @Type(noCCodeGeneration=true, cType="enum addr_type_t")
    public static enum addr_type_t implements Enum<addr_type_t>,
    TypedEnum<addr_type_t, Integer>
    {
        UNICAST_ADDR,
        MULTICAST_ADDR,
        ANYCAST_ADDR;

    }

    @Type(noCCodeGeneration=true, cType="union { struct vcpu_runstate_info *h; struct vcpu_runstate_info *v; long long unsigned int p; }")
    @NotUsableInJava
    public static class addr_of_vcpu_register_runstate_memory_area
    extends Union {
        public @OriginalName(value="__guest_handle_vcpu_runstate_info") Ptr<VcpuDefinitions.vcpu_runstate_info> h;
        public Ptr<VcpuDefinitions.vcpu_runstate_info> v;
        public @Unsigned @OriginalName(value="uint64_t") long p;
    }

    @Type(noCCodeGeneration=true, cType="union { struct vcpu_time_info *h; struct pvclock_vcpu_time_info *v; long long unsigned int p; }")
    @NotUsableInJava
    public static class addr_of_vcpu_register_time_memory_area
    extends Union {
        public @OriginalName(value="__guest_handle_vcpu_time_info") Ptr<VcpuDefinitions.vcpu_time_info> h;
        public Ptr<PvclockDefinitions.pvclock_vcpu_time_info> v;
        public @Unsigned @OriginalName(value="uint64_t") long p;
    }

    @Type(noCCodeGeneration=true, cType="struct { union { unsigned int ip4; struct in6_addr ip6; u8 mac_addr[6]; }; short unsigned int proto; }")
    @NotUsableInJava
    public static class addr_of_br_mdb_entry
    extends Struct {
        public DstDefinitions.dst_of_br_ip_and_u_of_addr_of_br_mdb_entry u;
        public @Unsigned @OriginalName(value="__be16") short proto;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 nbytes; u8 buswidth; u8 dtr; u8 __pad; long long unsigned int val; }")
    @NotUsableInJava
    public static class addr_of_spi_mem_op
    extends Struct {
        public char nbytes;
        public char buswidth;
        public char dtr;
        public char __pad;
        public @Unsigned long val;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 _dummy_pkey[4]; unsigned int _pkey; }")
    @NotUsableInJava
    public static class _addr_pkey_of_anon_member_of__sigfault_of__sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t
    extends Struct {
        public char @Size(value=4) [] _dummy_pkey;
        public @Unsigned int _pkey;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 _dummy_bnd[4]; unsigned int _lower; unsigned int _upper; }")
    @NotUsableInJava
    public static class _addr_bnd_of_anon_member_of__sigfault_of__sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t
    extends Struct {
        public char @Size(value=4) [] _dummy_bnd;
        public @Unsigned @OriginalName(value="compat_uptr_t") int _lower;
        public @Unsigned @OriginalName(value="compat_uptr_t") int _upper;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int ipv4; struct in6_addr ipv6; }")
    @NotUsableInJava
    public static class addr_of_netnode_security_struct_and_anon_member_of_nh_notifier_single_info_and_gw_of_nh_config
    extends Union {
        public @Unsigned @OriginalName(value="__be32") int ipv4;
        public In6Definitions.in6_addr ipv6;
    }

    @Type(noCCodeGeneration=true, cType="struct addr_marker")
    @NotUsableInJava
    public static class addr_marker
    extends Struct {
        public @Unsigned long start_address;
        public String name;
        public @Unsigned long max_lines;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 _dummy_pkey[8]; unsigned int _pkey; }")
    @NotUsableInJava
    public static class _addr_pkey_of_anon_member_of__sigfault_of___sifields
    extends Struct {
        public char @Size(value=8) [] _dummy_pkey;
        public @Unsigned int _pkey;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 _dummy_bnd[8]; void *_lower; void *_upper; }")
    @NotUsableInJava
    public static class _addr_bnd_of_anon_member_of__sigfault_of___sifields
    extends Struct {
        public char @Size(value=8) [] _dummy_bnd;
        public Ptr<?> _lower;
        public Ptr<?> _upper;
    }
}

