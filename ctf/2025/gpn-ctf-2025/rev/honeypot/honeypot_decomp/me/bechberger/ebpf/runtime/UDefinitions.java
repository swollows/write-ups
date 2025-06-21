/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AvtabDefinitions;
import me.bechberger.ebpf.runtime.BlkifDefinitions;
import me.bechberger.ebpf.runtime.DiskDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FfDefinitions;
import me.bechberger.ebpf.runtime.GetDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.HwDefinitions;
import me.bechberger.ebpf.runtime.IcmpDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.Ipv4Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LogDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.MacsecDefinitions;
import me.bechberger.ebpf.runtime.NodeDefinitions;
import me.bechberger.ebpf.runtime.PhysdevDefinitions;
import me.bechberger.ebpf.runtime.PirqDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.PortDefinitions;
import me.bechberger.ebpf.runtime.ResctrlDefinitions;
import me.bechberger.ebpf.runtime.RpcDefinitions;
import me.bechberger.ebpf.runtime.Rt6Definitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.SwitchdevDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TextDefinitions;
import me.bechberger.ebpf.runtime.UpdateDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.XenpfDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class UDefinitions {

    @Type(noCCodeGeneration=true, cType="union { u8 stp_state; struct switchdev_mst_state mst_state; struct switchdev_brport_flags brport_flags; _Bool mrouter; long int ageing_time; _Bool vlan_filtering; short unsigned int vlan_protocol; _Bool mst; _Bool mc_disabled; u8 mrp_port_role; struct switchdev_vlan_msti vlan_msti; }")
    @NotUsableInJava
    public static class u_of_switchdev_attr
    extends Union {
        public char stp_state;
        public SwitchdevDefinitions.switchdev_mst_state mst_state;
        public SwitchdevDefinitions.switchdev_brport_flags brport_flags;
        public boolean mrouter;
        public @OriginalName(value="clock_t") long ageing_time;
        public boolean vlan_filtering;
        public @Unsigned short vlan_protocol;
        public boolean mst;
        public boolean mc_disabled;
        public char mrp_port_role;
        public SwitchdevDefinitions.switchdev_vlan_msti vlan_msti;
    }

    @Type(noCCodeGeneration=true, cType="union { struct physdev_pci_device pci; }")
    @NotUsableInJava
    public static class u_of_physdev_dbgp_op
    extends Union {
        public PhysdevDefinitions.physdev_pci_device pci;
    }

    @Type(noCCodeGeneration=true, cType="union { short unsigned int virq; enum ipi_vector ipi; struct { short unsigned int pirq; short unsigned int gsi; u8 vector; u8 flags; short unsigned int domid; } pirq; struct xenbus_device *interdomain; }")
    @NotUsableInJava
    public static class u_of_irq_info
    extends Union {
        public @Unsigned short virq;
        public misc.ipi_vector ipi;
        public PirqDefinitions.pirq_of_u_of_irq_info pirq;
        public Ptr<XenbusDefinitions.xenbus_device> interdomain;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { short unsigned int dom; } unbound; struct { short unsigned int dom; unsigned int port; } interdomain; unsigned int pirq; unsigned int virq; }")
    @NotUsableInJava
    public static class u_of_evtchn_status
    extends Union {
        public misc.unbound_of_u_of_evtchn_status unbound;
        public misc.interdomain_of_u_of_evtchn_status interdomain;
        public @Unsigned @OriginalName(value="uint32_t") int pirq;
        public @Unsigned @OriginalName(value="uint32_t") int virq;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int index; struct erspan_md2 md2; }")
    @NotUsableInJava
    public static class u_of_erspan_metadata
    extends Union {
        public @Unsigned @OriginalName(value="__be32") int index;
        public misc.erspan_md2 md2;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int effect_id; struct { struct ff_effect *effect; struct ff_effect *old; } upload; }")
    @NotUsableInJava
    public static class u_of_uinput_request
    extends Union {
        public @Unsigned int effect_id;
        public misc.upload_of_u_of_uinput_request upload;
    }

    @Type(noCCodeGeneration=true, cType="union { struct ff_constant_effect constant; struct ff_ramp_effect ramp; struct ff_periodic_effect_compat periodic; struct ff_condition_effect condition[2]; struct ff_rumble_effect rumble; }")
    @NotUsableInJava
    public static class u_of_ff_effect_compat
    extends Union {
        public FfDefinitions.ff_constant_effect constant;
        public FfDefinitions.ff_ramp_effect ramp;
        public FfDefinitions.ff_periodic_effect_compat periodic;
        public FfDefinitions.ff_condition_effect @Size(value=2) [] condition;
        public FfDefinitions.ff_rumble_effect rumble;
    }

    @Type(noCCodeGeneration=true, cType="union { struct xen_mc_fetch mc_fetch; struct xen_mc_notifydomain mc_notifydomain; struct xen_mc_physcpuinfo mc_physcpuinfo; struct xen_mc_msrinject mc_msrinject; struct xen_mc_mceinject mc_mceinject; }")
    @NotUsableInJava
    public static class u_of_xen_mc
    extends Union {
        public XenDefinitions.xen_mc_fetch mc_fetch;
        public XenDefinitions.xen_mc_notifydomain mc_notifydomain;
        public XenDefinitions.xen_mc_physcpuinfo mc_physcpuinfo;
        public XenDefinitions.xen_mc_msrinject mc_msrinject;
        public XenDefinitions.xen_mc_mceinject mc_mceinject;
    }

    @Type(noCCodeGeneration=true, cType="union { struct list_head pa_tmp_list; struct callback_head pa_rcu; }")
    @NotUsableInJava
    public static class u_of_ext4_prealloc_space
    extends Union {
        public ListDefinitions.list_head pa_tmp_list;
        public misc.callback_head pa_rcu;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { u8 connected_addr[6]; u8 ssid[32]; u8 ssid_len; } client; struct { int beacon_interval; struct cfg80211_chan_def preset_chandef; struct cfg80211_chan_def chandef; u8 id[32]; u8 id_len; u8 id_up_len; } mesh; struct { struct cfg80211_chan_def preset_chandef; u8 ssid[32]; u8 ssid_len; } ap; struct { cfg80211_internal_bss *current_bss; struct cfg80211_chan_def chandef; int beacon_interval; u8 ssid[32]; u8 ssid_len; } ibss; struct { struct cfg80211_chan_def chandef; } ocb; }")
    @NotUsableInJava
    public static class u_of_wireless_dev
    extends Union {
        public misc.client_of_u_of_wireless_dev client;
        public misc.mesh_of_u_of_wireless_dev mesh;
        public misc.ap_of_u_of_wireless_dev ap;
        public misc.ibss_of_u_of_wireless_dev ibss;
        public misc.ocb_of_u_of_wireless_dev ocb;
    }

    @Type(noCCodeGeneration=true, cType="union { struct dst_entry dst; struct rtable rt; struct rt6_info rt6; }")
    @NotUsableInJava
    public static class u_of_xfrm_dst
    extends Union {
        public DstDefinitions.dst_entry dst;
        public runtime.rtable rt;
        public Rt6Definitions.rt6_info rt6;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int copy_len; short unsigned int group; short unsigned int qthreshold; short unsigned int flags; } ulog; struct { u8 level; u8 logflags; } log; }")
    @NotUsableInJava
    public static class u_of_nf_loginfo
    extends Union {
        public misc.ulog_of_u_of_nf_loginfo ulog;
        public LogDefinitions.log_of_u_of_nf_loginfo log;
    }

    @Type(noCCodeGeneration=true, cType="union { struct xsd_sockmsg msg; u8 buffer[4096]; }")
    @NotUsableInJava
    public static class u_of_xenbus_file_priv
    extends Union {
        public misc.xsd_sockmsg msg;
        public char @Size(value=4096) [] buffer;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int ref; long unsigned int gmfn; }")
    @NotUsableInJava
    public static class u_of_gnttab_copy_ptr
    extends Union {
        public @Unsigned @OriginalName(value="grant_ref_t") int ref;
        public @Unsigned @OriginalName(value="xen_pfn_t") long gmfn;
    }

    @Type(noCCodeGeneration=true, cType="union { struct ahash_request ahreq; struct skcipher_request skreq; }")
    @NotUsableInJava
    public static class u_of_crypto_gcm_req_priv_ctx
    extends Union {
        public misc.ahash_request ahreq;
        public SkcipherDefinitions.skcipher_request skreq;
    }

    @Type(noCCodeGeneration=true, cType="union { long unsigned int size; int nsems; }")
    @NotUsableInJava
    public static class u_of_ipc_params
    extends Union {
        public @Unsigned long size;
        public int nsems;
    }

    @Type(noCCodeGeneration=true, cType="union { long long unsigned int payload[30]; }")
    @NotUsableInJava
    public static class u_of_hv_message
    extends Union {
        public @Unsigned long @Size(value=30) [] payload;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int id; unsigned int reserved; }")
    @NotUsableInJava
    public static class u_of_hv_port_id
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int longmode; unsigned int cpl; long long unsigned int input; long long unsigned int result; long long unsigned int params[6]; } hcall; }")
    @NotUsableInJava
    public static class u_of_kvm_xen_exit
    extends Union {
        public misc.hcall_of_u_of_kvm_xen_exit hcall;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int msr; unsigned int pad2; long long unsigned int control; long long unsigned int evt_page; long long unsigned int msg_page; } synic; struct { long long unsigned int input; long long unsigned int result; long long unsigned int params[2]; } hcall; struct { unsigned int msr; unsigned int pad2; long long unsigned int control; long long unsigned int status; long long unsigned int send_page; long long unsigned int recv_page; long long unsigned int pending_page; } syndbg; }")
    @NotUsableInJava
    public static class u_of_kvm_hyperv_exit
    extends Union {
        public misc.synic_of_u_of_kvm_hyperv_exit synic;
        public misc.hcall_of_u_of_kvm_hyperv_exit hcall;
        public misc.syndbg_of_u_of_kvm_hyperv_exit syndbg;
    }

    @Type(noCCodeGeneration=true, cType="union { short unsigned int all; struct { short unsigned int port; } tcp; struct { short unsigned int port; } udp; struct { u8 type; u8 code; } icmp; struct { short unsigned int port; } dccp; struct { short unsigned int port; } sctp; struct { short unsigned int key; } gre; }")
    @NotUsableInJava
    public static class u_of_dst_of_nf_conntrack_tuple
    extends Union {
        public @Unsigned @OriginalName(value="__be16") short all;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto tcp;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto udp;
        public IcmpDefinitions.icmp_of_u_of_dst_of_nf_conntrack_tuple icmp;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto dccp;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto sctp;
        public misc.gre_of_nf_conntrack_man_proto_and_gre_of_u_of_dst_of_nf_conntrack_tuple gre;
    }

    @Type(noCCodeGeneration=true, cType="union { struct ip_tunnel_info tun_info; struct hw_port_info port_info; struct macsec_info macsec_info; struct xfrm_md_info xfrm_info; }")
    @NotUsableInJava
    public static class u_of_metadata_dst
    extends Union {
        public IpDefinitions.ip_tunnel_info tun_info;
        public HwDefinitions.hw_port_info port_info;
        public MacsecDefinitions.macsec_info macsec_info;
        public XfrmDefinitions.xfrm_md_info xfrm_info;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int src; unsigned int dst; } ipv4; struct { struct in6_addr src; struct in6_addr dst; } ipv6; }")
    @NotUsableInJava
    public static class u_of_ip_tunnel_key
    extends Union {
        public Ipv4Definitions.ipv4_of_u_of_ip_tunnel_key ipv4;
        public Ipv6Definitions.ipv6_of_u_of_ip_tunnel_key ipv6;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { u8 DeviceRemovable[4]; u8 PortPwrCtrlMask[4]; } hs; struct { u8 bHubHdrDecLat; short unsigned int wHubDelay; short unsigned int DeviceRemovable; } ss; }")
    @NotUsableInJava
    public static class u_of_usb_hub_descriptor
    extends Union {
        public misc.hs_of_u_of_usb_hub_descriptor hs;
        public misc.ss_of_u_of_usb_hub_descriptor ss;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { short unsigned int size; u8 type; u8 pad; short unsigned int features; } gso; struct { u8 addr[6]; } mcast; struct { u8 type; u8 algorithm; u8 value[4]; } hash; struct { short unsigned int headroom; short unsigned int pad[2]; } xdp; short unsigned int pad[3]; }")
    @NotUsableInJava
    public static class u_of_xen_netif_extra_info
    extends Union {
        public misc.gso_of_u_of_xen_netif_extra_info gso;
        public misc.mcast_of_u_of_xen_netif_extra_info mcast;
        public HashDefinitions.hash_of_u_of_xen_netif_extra_info hash;
        public XdpDefinitions.xdp_of_u_of_xen_netif_extra_info xdp;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="union { struct blkif_request_rw rw; struct blkif_request_discard discard; struct blkif_request_other other; struct blkif_request_indirect indirect; }")
    @NotUsableInJava
    public static class u_of_blkif_request
    extends Union {
        public BlkifDefinitions.blkif_request_rw rw;
        public BlkifDefinitions.blkif_request_discard discard;
        public BlkifDefinitions.blkif_request_other other;
        public BlkifDefinitions.blkif_request_indirect indirect;
    }

    @Type(noCCodeGeneration=true, cType="union { void *userptr; struct file *file; void *data; }")
    @NotUsableInJava
    public static class u_of_splice_desc
    extends Union {
        public Ptr<?> userptr;
        public Ptr<runtime.file> file;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="union { struct ff_constant_effect constant; struct ff_ramp_effect ramp; struct ff_periodic_effect periodic; struct ff_condition_effect condition[2]; struct ff_rumble_effect rumble; }")
    @NotUsableInJava
    public static class u_of_ff_effect
    extends Union {
        public FfDefinitions.ff_constant_effect constant;
        public FfDefinitions.ff_ramp_effect ramp;
        public FfDefinitions.ff_periodic_effect periodic;
        public FfDefinitions.ff_condition_effect @Size(value=2) [] condition;
        public FfDefinitions.ff_rumble_effect rumble;
    }

    @Type(noCCodeGeneration=true, cType="union { struct pnp_port port; struct pnp_irq irq; struct pnp_dma dma; struct pnp_mem mem; }")
    @NotUsableInJava
    public static class u_of_pnp_option
    extends Union {
        public PnpDefinitions.pnp_port port;
        public PnpDefinitions.pnp_irq irq;
        public PnpDefinitions.pnp_dma dma;
        public PnpDefinitions.pnp_mem mem;
    }

    @Type(noCCodeGeneration=true, cType="union { u8 *name; struct { u8 protocol; short unsigned int low_port; short unsigned int high_port; } port; struct { unsigned int addr; unsigned int mask; } node; struct { unsigned int addr[4]; unsigned int mask[4]; } node6; struct { long long unsigned int subnet_prefix; short unsigned int low_pkey; short unsigned int high_pkey; } ibpkey; struct { u8 *dev_name; u8 port; } ibendport; }")
    @NotUsableInJava
    public static class u_of_ocontext
    extends Union {
        public String name;
        public PortDefinitions.port_of_u_of_ocontext port;
        public NodeDefinitions.node_of_u_of_ocontext node;
        public misc.node6_of_u_of_ocontext node6;
        public misc.ibpkey_of_u_of_ocontext ibpkey;
        public misc.ibendport_of_u_of_ocontext ibendport;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int data; struct avtab_extended_perms *xperms; }")
    @NotUsableInJava
    public static class u_of_avtab_datum
    extends Union {
        public @Unsigned int data;
        public Ptr<AvtabDefinitions.avtab_extended_perms> xperms;
    }

    @Type(noCCodeGeneration=true, cType="union { struct path path; struct dentry *dentry; struct inode *inode; struct lsm_network_audit *net; int cap; int ipc_id; struct task_struct *tsk; struct { int key; u8 *key_desc; } key_struct; u8 *kmod_name; struct lsm_ioctlop_audit *op; struct file *file; struct lsm_ibpkey_audit *ibpkey; struct lsm_ibendport_audit *ibendport; int reason; const u8*; }")
    @NotUsableInJava
    public static class u_of_common_audit_data
    extends Union {
        public runtime.path path;
        public Ptr<runtime.dentry> dentry;
        public Ptr<runtime.inode> inode;
        public Ptr<LsmDefinitions.lsm_network_audit> net;
        public int cap;
        public int ipc_id;
        public Ptr<TaskDefinitions.task_struct> tsk;
        public KeyDefinitions.key_struct_of_u_of_common_audit_data key_struct;
        public String kmod_name;
        public Ptr<LsmDefinitions.lsm_ioctlop_audit> op;
        public Ptr<runtime.file> file;
        public Ptr<LsmDefinitions.lsm_ibpkey_audit> ibpkey;
        public Ptr<LsmDefinitions.lsm_ibendport_audit> ibendport;
        public int reason;
        public String anonclass;
    }

    @Type(noCCodeGeneration=true, cType="union { u8* ent12_p[2]; short unsigned int *ent16_p; unsigned int *ent32_p; }")
    @NotUsableInJava
    public static class u_of_fat_entry
    extends Union {
        public Ptr<Character> @Size(value=2) [] ent12_p;
        public Ptr<@Unsigned @OriginalName(value="__le16") Short> ent16_p;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> ent32_p;
    }

    @Type(noCCodeGeneration=true, cType="union { int offset; void *explicit_ptr; }")
    @NotUsableInJava
    public static class u_of_ext4_attr
    extends Union {
        public int offset;
        public Ptr<?> explicit_ptr;
    }

    @Type(noCCodeGeneration=true, cType="union { struct work_struct tk_work; struct rpc_wait tk_wait; }")
    @NotUsableInJava
    public static class u_of_rpc_task
    extends Union {
        public misc.work_struct tk_work;
        public RpcDefinitions.rpc_wait tk_wait;
    }

    @Type(noCCodeGeneration=true, cType="union { u8 __reserved[32]; u8 descriptor[8]; u8 identifier[16]; }")
    @NotUsableInJava
    public static class u_of_fscrypt_key_specifier
    extends Union {
        public char @Size(value=32) [] __reserved;
        public char @Size(value=8) [] descriptor;
        public char @Size(value=16) [] identifier;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { int counter; } count; struct callback_head head; }")
    @NotUsableInJava
    public static class u_of_external_name
    extends Union {
        public AtomicDefinitions.atomic_t count;
        public misc.callback_head head;
    }

    @Type(noCCodeGeneration=true, cType="union { struct flowi_common __fl_common; struct flowi4 ip4; struct flowi6 ip6; }")
    @NotUsableInJava
    public static class u_of_flowi
    extends Union {
        public misc.flowi_common __fl_common;
        public runtime.flowi4 ip4;
        public runtime.flowi6 ip6;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int rid; enum resctrl_event_id evtid; unsigned int sum; unsigned int domid; }")
    @NotUsableInJava
    public static class u_of_mon_data_bits
    extends Struct {
        public @Unsigned int rid;
        public ResctrlDefinitions.resctrl_event_id evtid;
        public @Unsigned int sum;
        public @Unsigned int domid;
    }

    @Type(noCCodeGeneration=true, cType="union { struct xenpf_settime32 settime32; struct xenpf_settime64 settime64; struct xenpf_add_memtype add_memtype; struct xenpf_del_memtype del_memtype; struct xenpf_read_memtype read_memtype; struct xenpf_microcode_update microcode; struct xenpf_platform_quirk platform_quirk; struct xenpf_efi_runtime_call efi_runtime_call; struct xenpf_firmware_info firmware_info; struct xenpf_enter_acpi_sleep enter_acpi_sleep; struct xenpf_change_freq change_freq; struct xenpf_getidletime getidletime; struct xenpf_set_processor_pminfo set_pminfo; struct xenpf_pcpuinfo pcpu_info; struct xenpf_cpu_ol cpu_ol; struct xenpf_cpu_hotadd cpu_add; struct xenpf_mem_hotadd mem_add; struct xenpf_core_parking core_parking; struct xenpf_symdata symdata; struct dom0_vga_console_info dom0_console; u8 pad[128]; }")
    @NotUsableInJava
    public static class u_of_xen_platform_op
    extends Union {
        public XenpfDefinitions.xenpf_settime32 settime32;
        public XenpfDefinitions.xenpf_settime64 settime64;
        public XenpfDefinitions.xenpf_add_memtype add_memtype;
        public XenpfDefinitions.xenpf_del_memtype del_memtype;
        public XenpfDefinitions.xenpf_read_memtype read_memtype;
        public XenpfDefinitions.xenpf_microcode_update microcode;
        public XenpfDefinitions.xenpf_platform_quirk platform_quirk;
        public XenpfDefinitions.xenpf_efi_runtime_call efi_runtime_call;
        public XenpfDefinitions.xenpf_firmware_info firmware_info;
        public XenpfDefinitions.xenpf_enter_acpi_sleep enter_acpi_sleep;
        public XenpfDefinitions.xenpf_change_freq change_freq;
        public XenpfDefinitions.xenpf_getidletime getidletime;
        public XenpfDefinitions.xenpf_set_processor_pminfo set_pminfo;
        public XenpfDefinitions.xenpf_pcpuinfo pcpu_info;
        public XenpfDefinitions.xenpf_cpu_ol cpu_ol;
        public XenpfDefinitions.xenpf_cpu_hotadd cpu_add;
        public XenpfDefinitions.xenpf_mem_hotadd mem_add;
        public XenpfDefinitions.xenpf_core_parking core_parking;
        public XenpfDefinitions.xenpf_symdata symdata;
        public misc.dom0_vga_console_info dom0_console;
        public @OriginalName(value="uint8_t") char @Size(value=128) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { u8 device; u8 version; short unsigned int interface_support; short unsigned int legacy_max_cylinder; u8 legacy_max_head; u8 legacy_sectors_per_track; void *edd_params; } disk_info; struct { u8 device; unsigned int mbr_signature; } disk_mbr_signature; struct { u8 capabilities; u8 edid_transfer_time; u8 *edid; } vbeddc_info; union xenpf_efi_info efi_info; u8 kbd_shift_flags; }")
    @NotUsableInJava
    public static class u_of_xenpf_firmware_info
    extends Union {
        public DiskDefinitions.disk_info_of_u_of_xenpf_firmware_info disk_info;
        public DiskDefinitions.disk_mbr_signature_of_u_of_xenpf_firmware_info disk_mbr_signature;
        public misc.vbeddc_info_of_u_of_xenpf_firmware_info vbeddc_info;
        public XenpfDefinitions.xenpf_efi_info efi_info;
        public @OriginalName(value="uint8_t") char kbd_shift_flags;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { struct xenpf_efi_time time; unsigned int resolution; unsigned int accuracy; } get_time; struct xenpf_efi_time set_time; struct xenpf_efi_time get_wakeup_time; struct xenpf_efi_time set_wakeup_time; struct { void *name; long unsigned int size; void *data; struct xenpf_efi_guid vendor_guid; } get_variable; struct { void *name; long unsigned int size; void *data; struct xenpf_efi_guid vendor_guid; } set_variable; struct { long unsigned int size; void *name; struct xenpf_efi_guid vendor_guid; } get_next_variable_name; struct { unsigned int attr; long long unsigned int max_store_size; long long unsigned int remain_store_size; long long unsigned int max_size; } query_variable_info; struct { void *capsule_header_array; long unsigned int capsule_count; long long unsigned int max_capsule_size; unsigned int reset_type; } query_capsule_capabilities; struct { void *capsule_header_array; long unsigned int capsule_count; long long unsigned int sg_list; } update_capsule; }")
    @NotUsableInJava
    public static class u_of_xenpf_efi_runtime_call
    extends Union {
        public GetDefinitions.get_time_of_u_of_xenpf_efi_runtime_call get_time;
        public XenpfDefinitions.xenpf_efi_time set_time;
        public XenpfDefinitions.xenpf_efi_time get_wakeup_time;
        public XenpfDefinitions.xenpf_efi_time set_wakeup_time;
        public GetDefinitions.get_variable_of_u_of_xenpf_efi_runtime_call_and_set_variable_of_u_of_xenpf_efi_runtime_call get_variable;
        public GetDefinitions.get_variable_of_u_of_xenpf_efi_runtime_call_and_set_variable_of_u_of_xenpf_efi_runtime_call set_variable;
        public GetDefinitions.get_next_variable_name_of_u_of_xenpf_efi_runtime_call get_next_variable_name;
        public misc.query_variable_info_of_u_of_xenpf_efi_runtime_call query_variable_info;
        public misc.query_capsule_capabilities_of_u_of_xenpf_efi_runtime_call query_capsule_capabilities;
        public UpdateDefinitions.update_capsule_of_u_of_xenpf_efi_runtime_call update_capsule;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { short unsigned int font_height; short unsigned int cursor_x; short unsigned int cursor_y; short unsigned int rows; short unsigned int columns; } text_mode_3; struct { short unsigned int width; short unsigned int height; short unsigned int bytes_per_line; short unsigned int bits_per_pixel; unsigned int lfb_base; unsigned int lfb_size; u8 red_pos; u8 red_size; u8 green_pos; u8 green_size; u8 blue_pos; u8 blue_size; u8 rsvd_pos; u8 rsvd_size; unsigned int gbl_caps; short unsigned int mode_attrs; short unsigned int pad; unsigned int ext_lfb_base; } vesa_lfb; }")
    @NotUsableInJava
    public static class u_of_dom0_vga_console_info
    extends Union {
        public TextDefinitions.text_mode_3_of_u_of_dom0_vga_console_info text_mode_3;
        public misc.vesa_lfb_of_u_of_dom0_vga_console_info vesa_lfb;
    }
}

