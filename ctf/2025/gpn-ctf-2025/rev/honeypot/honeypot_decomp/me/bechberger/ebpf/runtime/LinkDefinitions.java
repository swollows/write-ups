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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ConfigDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.KprobeDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetkitDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LinkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void link_group(Ptr<ConfigDefinitions.config_group> parent_group, Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long link_mode_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="link_path_walk((const u8*)$arg1, $arg2)")
    public static int link_path_walk(String name, Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int link_rcec_helper(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __link_name(Ptr<HashDefinitions.hash_cell> new_hc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __link_uuid(Ptr<HashDefinitions.hash_cell> new_hc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int link_peers(Ptr<UsbDefinitions.usb_port> left, Ptr<UsbDefinitions.usb_port> right) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void link_peers_report(Ptr<UsbDefinitions.usb_port> left, Ptr<UsbDefinitions.usb_port> right) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int link_create(Ptr<BpfDefinitions.bpf_attr> attr2, @OriginalName(value="bpfptr_t") misc.sockptr_t uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void link_css_set(Ptr<ListDefinitions.list_head> tmp_links, Ptr<CssDefinitions.css_set> cset, Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int link_update(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int supported[4]; unsigned int advertising[4]; unsigned int lp_advertising[4]; }")
    @NotUsableInJava
    public static class link_modes_of_ethtool_link_usettings
    extends Struct {
        public @Unsigned int @Size(value=4) [] supported;
        public @Unsigned int @Size(value=4) [] advertising;
        public @Unsigned int @Size(value=4) [] lp_advertising;
    }

    @Type(noCCodeGeneration=true, cType="struct link_mode_info")
    @NotUsableInJava
    public static class link_mode_info
    extends Struct {
        public int speed;
        public char lanes;
        public char duplex;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int supported[2]; long unsigned int advertising[2]; long unsigned int lp_advertising[2]; }")
    @NotUsableInJava
    public static class link_modes_of_ethtool_link_ksettings
    extends Struct {
        public @Unsigned long @Size(value=2) [] supported;
        public @Unsigned long @Size(value=2) [] advertising;
        public @Unsigned long @Size(value=2) [] lp_advertising;
    }

    @Type(noCCodeGeneration=true, cType="struct link_free")
    @NotUsableInJava
    public static class link_free
    extends Struct {
        @InlineUnion(value=9857)
        public @InlineUnion(value=9857) @Unsigned long next;
        @InlineUnion(value=9857)
        public @InlineUnion(value=9857) @Unsigned long handle;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int link_fd; }")
    @NotUsableInJava
    public static class link_detach_of_bpf_attr
    extends Struct {
        public @Unsigned int link_fd;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int link_fd; union { unsigned int new_prog_fd; unsigned int new_map_fd; }; unsigned int flags; union { unsigned int old_prog_fd; unsigned int old_map_fd; }; }")
    @NotUsableInJava
    public static class link_update_of_bpf_attr
    extends Struct {
        public @Unsigned int link_fd;
        @InlineUnion(value=1787)
        public @InlineUnion(value=1787) @Unsigned int new_prog_fd;
        @InlineUnion(value=1787)
        public @InlineUnion(value=1787) @Unsigned int new_map_fd;
        public @Unsigned int flags;
        @InlineUnion(value=1788)
        public @InlineUnion(value=1788) @Unsigned int old_prog_fd;
        @InlineUnion(value=1788)
        public @InlineUnion(value=1788) @Unsigned int old_map_fd;
    }

    @Type(noCCodeGeneration=true, cType="struct { union { unsigned int prog_fd; unsigned int map_fd; }; union { unsigned int target_fd; unsigned int target_ifindex; }; unsigned int attach_type; unsigned int flags; union { unsigned int target_btf_id; struct { long long unsigned int iter_info; unsigned int iter_info_len; }; struct { long long unsigned int bpf_cookie; } perf_event; struct { unsigned int flags; unsigned int cnt; long long unsigned int syms; long long unsigned int addrs; long long unsigned int cookies; } kprobe_multi; struct { unsigned int target_btf_id; long long unsigned int cookie; } tracing; struct { unsigned int pf; unsigned int hooknum; int priority; unsigned int flags; } netfilter; struct { union { unsigned int relative_fd; unsigned int relative_id; }; long long unsigned int expected_revision; } tcx; struct { long long unsigned int path; long long unsigned int offsets; long long unsigned int ref_ctr_offsets; long long unsigned int cookies; unsigned int cnt; unsigned int flags; unsigned int pid; } uprobe_multi; struct { union { unsigned int relative_fd; unsigned int relative_id; }; long long unsigned int expected_revision; } netkit; }; }")
    @NotUsableInJava
    public static class link_create_of_bpf_attr
    extends Struct {
        @InlineUnion(value=1777)
        public @InlineUnion(value=1777) @Unsigned int prog_fd;
        @InlineUnion(value=1777)
        public @InlineUnion(value=1777) @Unsigned int map_fd;
        @InlineUnion(value=1765)
        public @InlineUnion(value=1765) @Unsigned int target_fd;
        @InlineUnion(value=1765)
        public @InlineUnion(value=1765) @Unsigned int target_ifindex;
        public @Unsigned int attach_type;
        public @Unsigned int flags;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) @Unsigned int target_btf_id;
        @InlineUnion(value=1785)
        public  @InlineUnion(value=1785) AnonDefinitions.anon_member_of_anon_member_of_link_create_of_bpf_attr anon4$1;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) PerfDefinitions.perf_event_of_anon_member_of_link_create_of_bpf_attr perf_event;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) KprobeDefinitions.kprobe_multi_of_anon_member_of_link_create_of_bpf_attr kprobe_multi;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) TracingDefinitions.tracing_of_anon_member_of_link_create_of_bpf_attr tracing;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) misc.netfilter_of_anon_member_of_bpf_link_info_and_netfilter_of_anon_member_of_link_create_of_bpf_attr netfilter;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) NetkitDefinitions.netkit_of_anon_member_of_link_create_of_bpf_attr_and_tcx_of_anon_member_of_link_create_of_bpf_attr tcx;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) UprobeDefinitions.uprobe_multi_of_anon_member_of_link_create_of_bpf_attr uprobe_multi;
        @InlineUnion(value=1785)
        public @InlineUnion(value=1785) NetkitDefinitions.netkit_of_anon_member_of_link_create_of_bpf_attr_and_tcx_of_anon_member_of_link_create_of_bpf_attr netkit;
    }
}

