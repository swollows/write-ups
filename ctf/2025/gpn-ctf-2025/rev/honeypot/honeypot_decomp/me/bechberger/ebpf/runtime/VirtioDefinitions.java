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
import me.bechberger.ebpf.runtime.BalloonDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VirtioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_blk_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_blk_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_commit_rqs(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_iommu_drv_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_iommu_drv_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_net_hdr_to_skb($arg1, (const struct virtio_net_hdr*)$arg2, $arg3)")
    public static int virtio_net_hdr_to_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<virtio_net_hdr> hdr, boolean little_endian) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_pci_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int virtio_pci_probe(Ptr<PciDefinitions.pci_dev> pci_dev2, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_pci_release_dev(Ptr<runtime.device> _d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_pci_remove(Ptr<PciDefinitions.pci_dev> pci_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_sriov_configure(Ptr<PciDefinitions.pci_dev> pci_dev2, int num_vfs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<virtio_device> virtio_pci_vf_get_pf_dev(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_queue_rq($arg1, (const struct blk_mq_queue_data*)$arg2)")
    public static @OriginalName(value="blk_status_t") char virtio_queue_rq(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<BlkDefinitions.blk_mq_queue_data> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_queue_rqs(Ptr<Ptr<runtime.request>> rqlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_scsi_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_scsi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __virtio_config_changed(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_add_status(Ptr<virtio_device> dev, @Unsigned int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_check_driver_offered_feature((const struct virtio_device*)$arg1, $arg2)")
    public static void virtio_check_driver_offered_feature(Ptr<virtio_device> vdev, @Unsigned int fbit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_config_changed(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_config_driver_disable(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_config_driver_enable(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_dev_match($arg1, (const struct device_driver*)$arg2)")
    public static int virtio_dev_match(Ptr<runtime.device> _dv, Ptr<DeviceDefinitions.device_driver> _dr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_dev_probe(Ptr<runtime.device> _d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_dev_remove(Ptr<runtime.device> _d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_device_freeze(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_device_restore(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_features_ok(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_mmio_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_mmio_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_mmio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_mmio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_mmio_release_dev(Ptr<runtime.device> _d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_mmio_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_mmio_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtio_no_restricted_mem_acc(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtio_pci_admin_has_legacy_io(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_common_io_read(Ptr<PciDefinitions.pci_dev> pdev, char offset, char size, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_common_io_write(Ptr<PciDefinitions.pci_dev> pdev, char offset, char size, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_device_io_read(Ptr<PciDefinitions.pci_dev> pdev, char offset, char size, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_device_io_write(Ptr<PciDefinitions.pci_dev> pdev, char offset, char size, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_io_notify_info(Ptr<PciDefinitions.pci_dev> pdev, char req_bar_flags, Ptr<Character> bar, Ptr<@Unsigned Long> bar_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_io_read(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short opcode, char offset, char size, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_admin_legacy_io_write(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short opcode, char offset, char size, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtio_require_restricted_mem_acc(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_reset_device(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_uevent((const struct device*)$arg1, $arg2)")
    public static int virtio_uevent(Ptr<runtime.device> _dv, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_net_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_net_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_pci_admin_cmd_list_init(Ptr<virtio_device> virtio_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_find_shm_cap(Ptr<PciDefinitions.pci_dev> dev, char required_id, Ptr<Character> bar, Ptr<@Unsigned Long> offset, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_modern_probe(Ptr<virtio_pci_device> vp_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_pci_modern_remove(Ptr<virtio_pci_device> vp_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __virtio_unbreak_device(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int virtio_balloon_cmd_id_received(Ptr<virtio_balloon> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_balloon_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_balloon_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_balloon_oom_notify(Ptr<misc.notifier_block> nb, @Unsigned long dummy, Ptr<?> parm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_balloon_report_free_page(Ptr<virtio_balloon> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long virtio_balloon_shrinker_count(Ptr<runtime.shrinker> shrinker2, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long virtio_balloon_shrinker_scan(Ptr<runtime.shrinker> shrinker2, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_break_device(Ptr<virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_console_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_console_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtio_max_dma_size((const struct virtio_device*)$arg1)")
    public static @Unsigned long virtio_max_dma_size(Ptr<virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtio_pci_legacy_probe(Ptr<virtio_pci_device> vp_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtio_pci_legacy_remove(Ptr<virtio_pci_device> vp_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int vq_index; short unsigned int reserved[3]; long long unsigned int types_bitmap[1]; }")
    @NotUsableInJava
    public static class AnonymousType160696258C117
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short vq_index;
        public @Unsigned @OriginalName(value="__le16") short @Size(value=3) [] reserved;
        public @Unsigned @OriginalName(value="__le64") long @Size(value=1) [] types_bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_common_hdr")
    @NotUsableInJava
    public static class virtio_net_common_hdr
    extends Struct {
        @InlineUnion(value=95241)
        public @InlineUnion(value=95241) virtio_net_hdr hdr;
        @InlineUnion(value=95241)
        public @InlineUnion(value=95241) virtio_net_hdr_mrg_rxbuf mrg_hdr;
        @InlineUnion(value=95241)
        public @InlineUnion(value=95241) virtio_net_hdr_v1_hash hash_v1_hdr;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_rss")
    @NotUsableInJava
    public static class virtio_net_ctrl_rss
    extends Struct {
        public @Unsigned int hash_types;
        public @Unsigned short indirection_table_mask;
        public @Unsigned short unclassified_queue;
        public @Unsigned short hash_cfg_reserved;
        public @Unsigned short max_tx_vq;
        public char hash_key_length;
        public char @Size(value=40) [] key;
        public Ptr<@Unsigned Short> indirection_table;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_stats_reply_hdr")
    @NotUsableInJava
    public static class virtio_net_stats_reply_hdr
    extends Struct {
        public char type;
        public char reserved;
        public @Unsigned @OriginalName(value="__le16") short vq_index;
        public @Unsigned @OriginalName(value="__le16") short reserved1;
        public @Unsigned @OriginalName(value="__le16") short size;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_queue_stats")
    @NotUsableInJava
    public static class virtio_net_ctrl_queue_stats
    extends Struct {
        public AnonymousType160696258C117 @Size(value=1) [] stats;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_stats_capabilities")
    @NotUsableInJava
    public static class virtio_net_stats_capabilities
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long @Size(value=1) [] supported_stats_types;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_coal_vq")
    @NotUsableInJava
    public static class virtio_net_ctrl_coal_vq
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short vqn;
        public @Unsigned @OriginalName(value="__le16") short reserved;
        public virtio_net_ctrl_coal coal;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_coal")
    @NotUsableInJava
    public static class virtio_net_ctrl_coal
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int max_packets;
        public @Unsigned @OriginalName(value="__le32") int max_usecs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_coal_rx")
    @NotUsableInJava
    public static class virtio_net_ctrl_coal_rx
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int rx_max_packets;
        public @Unsigned @OriginalName(value="__le32") int rx_usecs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_coal_tx")
    @NotUsableInJava
    public static class virtio_net_ctrl_coal_tx
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int tx_max_packets;
        public @Unsigned @OriginalName(value="__le32") int tx_usecs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_mq")
    @NotUsableInJava
    public static class virtio_net_ctrl_mq
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short virtqueue_pairs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_mac")
    @NotUsableInJava
    public static class virtio_net_ctrl_mac
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int entries;
        public char @Size(value=0) [] macs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_ctrl_hdr")
    @NotUsableInJava
    public static class virtio_net_ctrl_hdr
    extends Struct {
        public char _class;
        public char cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_hdr_v1_hash")
    @NotUsableInJava
    public static class virtio_net_hdr_v1_hash
    extends Struct {
        public virtio_net_hdr_v1 hdr;
        public @Unsigned @OriginalName(value="__le32") int hash_value;
        public @Unsigned @OriginalName(value="__le16") short hash_report;
        public @Unsigned @OriginalName(value="__le16") short padding;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_hdr_v1")
    @NotUsableInJava
    public static class virtio_net_hdr_v1
    extends Struct {
        public char flags;
        public char gso_type;
        public @Unsigned @OriginalName(value="__virtio16") short hdr_len;
        public @Unsigned @OriginalName(value="__virtio16") short gso_size;
        @InlineUnion(value=95195)
        public  @InlineUnion(value=95195) AnonDefinitions.anon_member_of_anon_member_of_virtio_net_hdr_v1 anon4$0;
        @InlineUnion(value=95195)
        public  @InlineUnion(value=95195) CsumDefinitions.csum_of_anon_member_of_virtio_net_hdr_v1 csum;
        @InlineUnion(value=95195)
        public @InlineUnion(value=95195) misc.rsc_of_anon_member_of_virtio_net_hdr_v1 rsc;
        public @Unsigned @OriginalName(value="__virtio16") short num_buffers;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_config")
    @NotUsableInJava
    public static class virtio_net_config
    extends Struct {
        public char @Size(value=6) [] mac;
        public @Unsigned @OriginalName(value="__virtio16") short status;
        public @Unsigned @OriginalName(value="__virtio16") short max_virtqueue_pairs;
        public @Unsigned @OriginalName(value="__virtio16") short mtu;
        public @Unsigned @OriginalName(value="__le32") int speed;
        public char duplex;
        public char rss_max_key_size;
        public @Unsigned @OriginalName(value="__le16") short rss_max_indirection_table_length;
        public @Unsigned @OriginalName(value="__le32") int supported_hash_types;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd_status")
    @NotUsableInJava
    public static class virtio_admin_cmd_status
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short status;
        public @Unsigned @OriginalName(value="__le16") short status_qualifier;
        public char @Size(value=4) [] reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd_hdr")
    @NotUsableInJava
    public static class virtio_admin_cmd_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short opcode;
        public @Unsigned @OriginalName(value="__le16") short group_type;
        public char @Size(value=12) [] reserved1;
        public @Unsigned @OriginalName(value="__le64") long group_member_id;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_modern_common_cfg")
    @NotUsableInJava
    public static class virtio_pci_modern_common_cfg
    extends Struct {
        public virtio_pci_common_cfg cfg;
        public @Unsigned @OriginalName(value="__le16") short queue_notify_data;
        public @Unsigned @OriginalName(value="__le16") short queue_reset;
        public @Unsigned @OriginalName(value="__le16") short admin_queue_index;
        public @Unsigned @OriginalName(value="__le16") short admin_queue_num;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_hdr_mrg_rxbuf")
    @NotUsableInJava
    public static class virtio_net_hdr_mrg_rxbuf
    extends Struct {
        public virtio_net_hdr hdr;
        public @Unsigned @OriginalName(value="__virtio16") short num_buffers;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd_notify_info_result")
    @NotUsableInJava
    public static class virtio_admin_cmd_notify_info_result
    extends Struct {
        public virtio_admin_cmd_notify_info_data @Size(value=4) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd_notify_info_data")
    @NotUsableInJava
    public static class virtio_admin_cmd_notify_info_data
    extends Struct {
        public char flags;
        public char bar;
        public char @Size(value=6) [] padding;
        public @Unsigned @OriginalName(value="__le64") long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd_legacy_rd_data")
    @NotUsableInJava
    public static class virtio_admin_cmd_legacy_rd_data
    extends Struct {
        public char offset;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd_legacy_wr_data")
    @NotUsableInJava
    public static class virtio_admin_cmd_legacy_wr_data
    extends Struct {
        public char offset;
        public char @Size(value=7) [] reserved;
        public char @Size(value=0) [] registers;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_admin_cmd")
    @NotUsableInJava
    public static class virtio_admin_cmd
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short opcode;
        public @Unsigned @OriginalName(value="__le16") short group_type;
        public @Unsigned @OriginalName(value="__le64") long group_member_id;
        public Ptr<runtime.scatterlist> data_sg;
        public Ptr<runtime.scatterlist> result_sg;
        public runtime.completion completion;
        public int ret;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_mmio_vq_info")
    @NotUsableInJava
    public static class virtio_mmio_vq_info
    extends Struct {
        public Ptr<runtime.virtqueue> vq;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_mmio_device")
    @NotUsableInJava
    public static class virtio_mmio_device
    extends Struct {
        public virtio_device vdev;
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public Ptr<?> base;
        public @Unsigned long version;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head virtqueues;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_net_hdr")
    @NotUsableInJava
    public static class virtio_net_hdr
    extends Struct {
        public char flags;
        public char gso_type;
        public @Unsigned @OriginalName(value="__virtio16") short hdr_len;
        public @Unsigned @OriginalName(value="__virtio16") short gso_size;
        public @Unsigned @OriginalName(value="__virtio16") short csum_start;
        public @Unsigned @OriginalName(value="__virtio16") short csum_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_vq")
    @NotUsableInJava
    public static class virtio_scsi_vq
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock vq_lock;
        public Ptr<runtime.virtqueue> vq;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi")
    @NotUsableInJava
    public static class virtio_scsi
    extends Struct {
        public Ptr<virtio_device> vdev;
        public virtio_scsi_event_node @Size(value=8) [] event_list;
        public @Unsigned int num_queues;
        public int @Size(value=3) [] io_queues;
        public misc.hlist_node node;
        public boolean stop_events;
        public virtio_scsi_vq ctrl_vq;
        public virtio_scsi_vq event_vq;
        public virtio_scsi_vq @Size(value=0) [] req_vqs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_event_node")
    @NotUsableInJava
    public static class virtio_scsi_event_node
    extends Struct {
        public Ptr<virtio_scsi> vscsi;
        public virtio_scsi_event event;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_cmd")
    @NotUsableInJava
    public static class virtio_scsi_cmd
    extends Struct {
        public Ptr<ScsiDefinitions.scsi_cmnd> sc;
        public Ptr<runtime.completion> comp;
        public misc.req_of_virtio_scsi_cmd req;
        public misc.resp_of_virtio_scsi_cmd resp;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_config")
    @NotUsableInJava
    public static class virtio_scsi_config
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int num_queues;
        public @Unsigned @OriginalName(value="__virtio32") int seg_max;
        public @Unsigned @OriginalName(value="__virtio32") int max_sectors;
        public @Unsigned @OriginalName(value="__virtio32") int cmd_per_lun;
        public @Unsigned @OriginalName(value="__virtio32") int event_info_size;
        public @Unsigned @OriginalName(value="__virtio32") int sense_size;
        public @Unsigned @OriginalName(value="__virtio32") int cdb_size;
        public @Unsigned @OriginalName(value="__virtio16") short max_channel;
        public @Unsigned @OriginalName(value="__virtio16") short max_target;
        public @Unsigned @OriginalName(value="__virtio32") int max_lun;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_event")
    @NotUsableInJava
    public static class virtio_scsi_event
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int event;
        public char @Size(value=8) [] lun;
        public @Unsigned @OriginalName(value="__virtio32") int reason;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_ctrl_an_resp")
    @NotUsableInJava
    public static class virtio_scsi_ctrl_an_resp
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int event_actual;
        public char response;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_ctrl_an_req")
    @NotUsableInJava
    public static class virtio_scsi_ctrl_an_req
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int type;
        public char @Size(value=8) [] lun;
        public @Unsigned @OriginalName(value="__virtio32") int event_requested;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_ctrl_tmf_resp")
    @NotUsableInJava
    public static class virtio_scsi_ctrl_tmf_resp
    extends Struct {
        public char response;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_ctrl_tmf_req")
    @NotUsableInJava
    public static class virtio_scsi_ctrl_tmf_req
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int type;
        public @Unsigned @OriginalName(value="__virtio32") int subtype;
        public char @Size(value=8) [] lun;
        public @Unsigned @OriginalName(value="__virtio64") long tag;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_cmd_resp")
    @NotUsableInJava
    public static class virtio_scsi_cmd_resp
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int sense_len;
        public @Unsigned @OriginalName(value="__virtio32") int resid;
        public @Unsigned @OriginalName(value="__virtio16") short status_qualifier;
        public char status;
        public char response;
        public char @Size(value=96) [] sense;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_cmd_req_pi")
    @NotUsableInJava
    public static class virtio_scsi_cmd_req_pi
    extends Struct {
        public char @Size(value=8) [] lun;
        public @Unsigned @OriginalName(value="__virtio64") long tag;
        public char task_attr;
        public char prio;
        public char crn;
        public @Unsigned @OriginalName(value="__virtio32") int pi_bytesout;
        public @Unsigned @OriginalName(value="__virtio32") int pi_bytesin;
        public char @Size(value=32) [] cdb;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_scsi_cmd_req")
    @NotUsableInJava
    public static class virtio_scsi_cmd_req
    extends Struct {
        public char @Size(value=8) [] lun;
        public @Unsigned @OriginalName(value="__virtio64") long tag;
        public char task_attr;
        public char prio;
        public char crn;
        public char @Size(value=32) [] cdb;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk")
    @NotUsableInJava
    public static class virtio_blk
    extends Struct {
        public runtime.mutex vdev_mutex;
        public Ptr<virtio_device> vdev;
        public Ptr<runtime.gendisk> disk;
        public BlkDefinitions.blk_mq_tag_set tag_set;
        public misc.work_struct config_work;
        public int index;
        public int num_vqs;
        public int @Size(value=3) [] io_queues;
        public Ptr<virtio_blk_vq> vqs;
        public @Unsigned int zone_sectors;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_vq")
    @NotUsableInJava
    public static class virtio_blk_vq
    extends Struct {
        public Ptr<runtime.virtqueue> vq;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_discard_write_zeroes")
    @NotUsableInJava
    public static class virtio_blk_discard_write_zeroes
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long sector;
        public @Unsigned @OriginalName(value="__le32") int num_sectors;
        public @Unsigned @OriginalName(value="__le32") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_zone_report")
    @NotUsableInJava
    public static class virtio_blk_zone_report
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio64") long nr_zones;
        public char @Size(value=56) [] reserved;
        public virtio_blk_zone_descriptor @Size(value=0) [] zones;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_zone_descriptor")
    @NotUsableInJava
    public static class virtio_blk_zone_descriptor
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio64") long z_cap;
        public @Unsigned @OriginalName(value="__virtio64") long z_start;
        public @Unsigned @OriginalName(value="__virtio64") long z_wp;
        public char z_type;
        public char z_state;
        public char @Size(value=38) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_outhdr")
    @NotUsableInJava
    public static class virtio_blk_outhdr
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int type;
        public @Unsigned @OriginalName(value="__virtio32") int ioprio;
        public @Unsigned @OriginalName(value="__virtio64") long sector;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_config")
    @NotUsableInJava
    public static class virtio_blk_config
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio64") long capacity;
        public @Unsigned @OriginalName(value="__virtio32") int size_max;
        public @Unsigned @OriginalName(value="__virtio32") int seg_max;
        public virtio_blk_geometry geometry;
        public @Unsigned @OriginalName(value="__virtio32") int blk_size;
        public char physical_block_exp;
        public char alignment_offset;
        public @Unsigned @OriginalName(value="__virtio16") short min_io_size;
        public @Unsigned @OriginalName(value="__virtio32") int opt_io_size;
        public char wce;
        public char unused;
        public @Unsigned @OriginalName(value="__virtio16") short num_queues;
        public @Unsigned @OriginalName(value="__virtio32") int max_discard_sectors;
        public @Unsigned @OriginalName(value="__virtio32") int max_discard_seg;
        public @Unsigned @OriginalName(value="__virtio32") int discard_sector_alignment;
        public @Unsigned @OriginalName(value="__virtio32") int max_write_zeroes_sectors;
        public @Unsigned @OriginalName(value="__virtio32") int max_write_zeroes_seg;
        public char write_zeroes_may_unmap;
        public char @Size(value=3) [] unused1;
        public @Unsigned @OriginalName(value="__virtio32") int max_secure_erase_sectors;
        public @Unsigned @OriginalName(value="__virtio32") int max_secure_erase_seg;
        public @Unsigned @OriginalName(value="__virtio32") int secure_erase_sector_alignment;
        public virtio_blk_zoned_characteristics zoned;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_zoned_characteristics")
    @NotUsableInJava
    public static class virtio_blk_zoned_characteristics
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int zone_sectors;
        public @Unsigned @OriginalName(value="__virtio32") int max_open_zones;
        public @Unsigned @OriginalName(value="__virtio32") int max_active_zones;
        public @Unsigned @OriginalName(value="__virtio32") int max_append_sectors;
        public @Unsigned @OriginalName(value="__virtio32") int write_granularity;
        public char model;
        public char @Size(value=3) [] unused2;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_blk_geometry")
    @NotUsableInJava
    public static class virtio_blk_geometry
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short cylinders;
        public char heads;
        public char sectors;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_fault")
    @NotUsableInJava
    public static class virtio_iommu_fault
    extends Struct {
        public char reason;
        public char @Size(value=3) [] reserved;
        public @Unsigned @OriginalName(value="__le32") int flags;
        public @Unsigned @OriginalName(value="__le32") int endpoint;
        public char @Size(value=4) [] reserved2;
        public @Unsigned @OriginalName(value="__le64") long address;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_probe")
    @NotUsableInJava
    public static class virtio_iommu_req_probe
    extends Struct {
        public virtio_iommu_req_head head;
        public @Unsigned @OriginalName(value="__le32") int endpoint;
        public char @Size(value=64) [] reserved;
        public char @Size(value=0) [] properties;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_probe_resv_mem")
    @NotUsableInJava
    public static class virtio_iommu_probe_resv_mem
    extends Struct {
        public virtio_iommu_probe_property head;
        public char subtype;
        public char @Size(value=3) [] reserved;
        public @Unsigned @OriginalName(value="__le64") long start;
        public @Unsigned @OriginalName(value="__le64") long end;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_probe_property")
    @NotUsableInJava
    public static class virtio_iommu_probe_property
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short type;
        public @Unsigned @OriginalName(value="__le16") short length;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_unmap")
    @NotUsableInJava
    public static class virtio_iommu_req_unmap
    extends Struct {
        public virtio_iommu_req_head head;
        public @Unsigned @OriginalName(value="__le32") int domain;
        public @Unsigned @OriginalName(value="__le64") long virt_start;
        public @Unsigned @OriginalName(value="__le64") long virt_end;
        public char @Size(value=4) [] reserved;
        public virtio_iommu_req_tail tail;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_map")
    @NotUsableInJava
    public static class virtio_iommu_req_map
    extends Struct {
        public virtio_iommu_req_head head;
        public @Unsigned @OriginalName(value="__le32") int domain;
        public @Unsigned @OriginalName(value="__le64") long virt_start;
        public @Unsigned @OriginalName(value="__le64") long virt_end;
        public @Unsigned @OriginalName(value="__le64") long phys_start;
        public @Unsigned @OriginalName(value="__le32") int flags;
        public virtio_iommu_req_tail tail;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_detach")
    @NotUsableInJava
    public static class virtio_iommu_req_detach
    extends Struct {
        public virtio_iommu_req_head head;
        public @Unsigned @OriginalName(value="__le32") int domain;
        public @Unsigned @OriginalName(value="__le32") int endpoint;
        public char @Size(value=8) [] reserved;
        public virtio_iommu_req_tail tail;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_attach")
    @NotUsableInJava
    public static class virtio_iommu_req_attach
    extends Struct {
        public virtio_iommu_req_head head;
        public @Unsigned @OriginalName(value="__le32") int domain;
        public @Unsigned @OriginalName(value="__le32") int endpoint;
        public @Unsigned @OriginalName(value="__le32") int flags;
        public char @Size(value=4) [] reserved;
        public virtio_iommu_req_tail tail;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_tail")
    @NotUsableInJava
    public static class virtio_iommu_req_tail
    extends Struct {
        public char status;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_req_head")
    @NotUsableInJava
    public static class virtio_iommu_req_head
    extends Struct {
        public char type;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_config")
    @NotUsableInJava
    public static class virtio_iommu_config
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long page_size_mask;
        public virtio_iommu_range_64 input_range;
        public virtio_iommu_range_32 domain_range;
        public @Unsigned @OriginalName(value="__le32") int probe_size;
        public char bypass;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_range_32")
    @NotUsableInJava
    public static class virtio_iommu_range_32
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int start;
        public @Unsigned @OriginalName(value="__le32") int end;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_iommu_range_64")
    @NotUsableInJava
    public static class virtio_iommu_range_64
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long start;
        public @Unsigned @OriginalName(value="__le64") long end;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_console_control")
    @NotUsableInJava
    public static class virtio_console_control
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int id;
        public @Unsigned @OriginalName(value="__virtio16") short event;
        public @Unsigned @OriginalName(value="__virtio16") short value;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_console_config")
    @NotUsableInJava
    public static class virtio_console_config
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short cols;
        public @Unsigned @OriginalName(value="__virtio16") short rows;
        public @Unsigned @OriginalName(value="__virtio32") int max_nr_ports;
        public @Unsigned @OriginalName(value="__virtio32") int emerg_wr;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_balloon")
    @NotUsableInJava
    public static class virtio_balloon
    extends Struct {
        public Ptr<virtio_device> vdev;
        public Ptr<runtime.virtqueue> inflate_vq;
        public Ptr<runtime.virtqueue> deflate_vq;
        public Ptr<runtime.virtqueue> stats_vq;
        public Ptr<runtime.virtqueue> free_page_vq;
        public Ptr<WorkqueueDefinitions.workqueue_struct> balloon_wq;
        public misc.work_struct report_free_page_work;
        public misc.work_struct update_balloon_stats_work;
        public misc.work_struct update_balloon_size_work;
        public  @OriginalName(value="spinlock_t") runtime.spinlock stop_update_lock;
        public boolean stop_update;
        public @Unsigned long config_read_bitmap;
        public ListDefinitions.list_head free_page_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock free_page_list_lock;
        public @Unsigned long num_free_page_blocks;
        public @Unsigned int cmd_id_received_cache;
        public @Unsigned @OriginalName(value="__virtio32") int cmd_id_active;
        public @Unsigned @OriginalName(value="__virtio32") int cmd_id_stop;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head acked;
        public @Unsigned int num_pages;
        public BalloonDefinitions.balloon_dev_info vb_dev_info;
        public runtime.mutex balloon_lock;
        public @Unsigned int num_pfns;
        public @Unsigned @OriginalName(value="__virtio32") int @Size(value=256) [] pfns;
        public virtio_balloon_stat @Size(value=16) [] stats;
        public Ptr<runtime.shrinker> shrinker;
        public misc.notifier_block oom_nb;
        public Ptr<runtime.virtqueue> reporting_vq;
        public PageDefinitions.page_reporting_dev_info pr_dev_info;
        public  @OriginalName(value="spinlock_t") runtime.spinlock wakeup_lock;
        public boolean processing_wakeup_event;
        public @Unsigned int wakeup_signal_mask;
    }

    @Type(noCCodeGeneration=true, cType="enum virtio_balloon_config_read")
    public static enum virtio_balloon_config_read implements Enum<virtio_balloon_config_read>,
    TypedEnum<virtio_balloon_config_read, Integer>
    {
        VIRTIO_BALLOON_CONFIG_READ_CMD_ID;

    }

    @Type(noCCodeGeneration=true, cType="enum virtio_balloon_vq")
    public static enum virtio_balloon_vq implements Enum<virtio_balloon_vq>,
    TypedEnum<virtio_balloon_vq, Integer>
    {
        VIRTIO_BALLOON_VQ_INFLATE,
        VIRTIO_BALLOON_VQ_DEFLATE,
        VIRTIO_BALLOON_VQ_STATS,
        VIRTIO_BALLOON_VQ_FREE_PAGE,
        VIRTIO_BALLOON_VQ_REPORTING,
        VIRTIO_BALLOON_VQ_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct virtio_balloon_stat")
    @NotUsableInJava
    public static class virtio_balloon_stat
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short tag;
        public @Unsigned @OriginalName(value="__virtio64") long val;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_balloon_config")
    @NotUsableInJava
    public static class virtio_balloon_config
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int num_pages;
        public @Unsigned @OriginalName(value="__le32") int actual;
        @InlineUnion(value=17575)
        public @InlineUnion(value=17575) @Unsigned @OriginalName(value="__le32") int free_page_hint_cmd_id;
        @InlineUnion(value=17575)
        public @InlineUnion(value=17575) @Unsigned @OriginalName(value="__le32") int free_page_report_cmd_id;
        public @Unsigned @OriginalName(value="__le32") int poison_val;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_driver")
    @NotUsableInJava
    public static class virtio_driver
    extends Struct {
        public DeviceDefinitions.device_driver driver;
        public Ptr<virtio_device_id> id_table;
        public Ptr<@Unsigned Integer> feature_table;
        public @Unsigned int feature_table_size;
        public Ptr<@Unsigned Integer> feature_table_legacy;
        public @Unsigned int feature_table_size_legacy;
        public Ptr<?> validate;
        public Ptr<?> probe;
        public Ptr<?> scan;
        public Ptr<?> remove;
        public Ptr<?> config_changed;
        public Ptr<?> freeze;
        public Ptr<?> restore;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_device")
    @NotUsableInJava
    public static class virtio_pci_device
    extends Struct {
        public virtio_device vdev;
        public Ptr<PciDefinitions.pci_dev> pci_dev;
        @InlineUnion(value=17558)
        public @InlineUnion(value=17558) virtio_pci_legacy_device ldev;
        @InlineUnion(value=17558)
        public @InlineUnion(value=17558) virtio_pci_modern_device mdev;
        public boolean is_legacy;
        public Ptr<Character> isr;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head virtqueues;
        public ListDefinitions.list_head slow_virtqueues;
        public Ptr<Ptr<virtio_pci_vq_info>> vqs;
        public virtio_pci_admin_vq admin_vq;
        public int msix_enabled;
        public int intx_enabled;
        public Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> msix_affinity_masks;
        public Ptr<char @Size(value=256) []> msix_names;
        public @Unsigned int msix_vectors;
        public @Unsigned int msix_used_vectors;
        public boolean per_vq_vectors;
        public Ptr<?> setup_vq;
        public Ptr<?> del_vq;
        public Ptr<?> config_vector;
        public Ptr<?> avq_index;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_admin_vq")
    @NotUsableInJava
    public static class virtio_pci_admin_vq
    extends Struct {
        public Ptr<virtio_pci_vq_info> info;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned long supported_cmds;
        public char @Size(value=10) [] name;
        public @Unsigned short vq_index;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_vq_info")
    @NotUsableInJava
    public static class virtio_pci_vq_info
    extends Struct {
        public Ptr<runtime.virtqueue> vq;
        public ListDefinitions.list_head node;
        public @Unsigned int msix_vector;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_modern_device")
    @NotUsableInJava
    public static class virtio_pci_modern_device
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pci_dev;
        public Ptr<virtio_pci_common_cfg> common;
        public Ptr<?> device;
        public Ptr<?> notify_base;
        public @Unsigned @OriginalName(value="resource_size_t") long notify_pa;
        public Ptr<Character> isr;
        public @Unsigned long notify_len;
        public @Unsigned long device_len;
        public @Unsigned long common_len;
        public int notify_map_cap;
        public @Unsigned int notify_offset_multiplier;
        public int modern_bars;
        public virtio_device_id id;
        public Ptr<?> device_id_check;
        public @Unsigned long dma_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_legacy_device")
    @NotUsableInJava
    public static class virtio_pci_legacy_device
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pci_dev;
        public Ptr<Character> isr;
        public Ptr<?> ioaddr;
        public virtio_device_id id;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_pci_common_cfg")
    @NotUsableInJava
    public static class virtio_pci_common_cfg
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int device_feature_select;
        public @Unsigned @OriginalName(value="__le32") int device_feature;
        public @Unsigned @OriginalName(value="__le32") int guest_feature_select;
        public @Unsigned @OriginalName(value="__le32") int guest_feature;
        public @Unsigned @OriginalName(value="__le16") short msix_config;
        public @Unsigned @OriginalName(value="__le16") short num_queues;
        public char device_status;
        public char config_generation;
        public @Unsigned @OriginalName(value="__le16") short queue_select;
        public @Unsigned @OriginalName(value="__le16") short queue_size;
        public @Unsigned @OriginalName(value="__le16") short queue_msix_vector;
        public @Unsigned @OriginalName(value="__le16") short queue_enable;
        public @Unsigned @OriginalName(value="__le16") short queue_notify_off;
        public @Unsigned @OriginalName(value="__le32") int queue_desc_lo;
        public @Unsigned @OriginalName(value="__le32") int queue_desc_hi;
        public @Unsigned @OriginalName(value="__le32") int queue_avail_lo;
        public @Unsigned @OriginalName(value="__le32") int queue_avail_hi;
        public @Unsigned @OriginalName(value="__le32") int queue_used_lo;
        public @Unsigned @OriginalName(value="__le32") int queue_used_hi;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_shm_region")
    @NotUsableInJava
    public static class virtio_shm_region
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_config_ops")
    @NotUsableInJava
    public static class virtio_config_ops
    extends Struct {
        public Ptr<?> get;
        public Ptr<?> set;
        public Ptr<?> generation;
        public Ptr<?> get_status;
        public Ptr<?> set_status;
        public Ptr<?> reset;
        public Ptr<?> find_vqs;
        public Ptr<?> del_vqs;
        public Ptr<?> synchronize_cbs;
        public Ptr<?> get_features;
        public Ptr<?> finalize_features;
        public Ptr<?> bus_name;
        public Ptr<?> set_vq_affinity;
        public Ptr<?> get_vq_affinity;
        public Ptr<?> get_shm_region;
        public Ptr<?> disable_vq_and_reset;
        public Ptr<?> enable_vq_after_reset;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_device")
    @NotUsableInJava
    public static class virtio_device
    extends Struct {
        public int index;
        public boolean failed;
        public boolean config_core_enabled;
        public boolean config_driver_disabled;
        public boolean config_change_pending;
        public  @OriginalName(value="spinlock_t") runtime.spinlock config_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock vqs_list_lock;
        public runtime.device dev;
        public virtio_device_id id;
        public Ptr<virtio_config_ops> config;
        public @OriginalName(value="vringh_config_ops") Ptr<?> vringh_config;
        public ListDefinitions.list_head vqs;
        public @Unsigned long features;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct virtio_device_id")
    @NotUsableInJava
    public static class virtio_device_id
    extends Struct {
        public @Unsigned int device;
        public @Unsigned int vendor;
    }
}

