/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.StatsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MacsecDefinitions {

    @Type(noCCodeGeneration=true, cType="struct macsec_info")
    @NotUsableInJava
    public static class macsec_info
    extends Struct {
        public @Unsigned @OriginalName(value="sci_t") long sci;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_context")
    @NotUsableInJava
    public static class macsec_context
    extends Struct {
        @InlineUnion(value=23870)
        public @InlineUnion(value=23870) Ptr<NetDefinitions.net_device> netdev;
        @InlineUnion(value=23870)
        public @InlineUnion(value=23870) Ptr<PhyDefinitions.phy_device> phydev;
        public macsec_offload offload;
        public Ptr<macsec_secy> secy;
        public Ptr<macsec_rx_sc> rx_sc;
        public misc.sa_of_macsec_context sa;
        public StatsDefinitions.stats_of_macsec_context stats;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_secy")
    @NotUsableInJava
    public static class macsec_secy
    extends Struct {
        public Ptr<NetDefinitions.net_device> netdev;
        public @Unsigned int n_rx_sc;
        public @Unsigned @OriginalName(value="sci_t") long sci;
        public @Unsigned short key_len;
        public @Unsigned short icv_len;
        public macsec_validation_type validate_frames;
        public boolean xpn;
        public boolean operational;
        public boolean protect_frames;
        public boolean replay_protect;
        public @Unsigned int replay_window;
        public macsec_tx_sc tx_sc;
        public Ptr<macsec_rx_sc> rx_sc;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_tx_sc")
    @NotUsableInJava
    public static class macsec_tx_sc
    extends Struct {
        public boolean active;
        public char encoding_sa;
        public boolean encrypt;
        public boolean send_sci;
        public boolean end_station;
        public boolean scb;
        public Ptr<macsec_tx_sa> @Size(value=4) [] sa;
        public Ptr<PcpuDefinitions.pcpu_tx_sc_stats> stats;
        public Ptr<misc.metadata_dst> md_dst;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_tx_sa")
    @NotUsableInJava
    public static class macsec_tx_sa
    extends Struct {
        public macsec_key key;
        public @Unsigned @OriginalName(value="ssci_t") int ssci;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        @InlineUnion(value=23850)
        public  @InlineUnion(value=23850) @OriginalName(value="pn_t") runtime.pn next_pn_halves;
        @InlineUnion(value=23850)
        public @InlineUnion(value=23850) @Unsigned long next_pn;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public boolean active;
        public Ptr<macsec_tx_sa_stats> stats;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_rx_sc")
    @NotUsableInJava
    public static class macsec_rx_sc
    extends Struct {
        public Ptr<macsec_rx_sc> next;
        public @Unsigned @OriginalName(value="sci_t") long sci;
        public boolean active;
        public Ptr<macsec_rx_sa> @Size(value=4) [] sa;
        public Ptr<PcpuDefinitions.pcpu_rx_sc_stats> stats;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_rx_sa")
    @NotUsableInJava
    public static class macsec_rx_sa
    extends Struct {
        public macsec_key key;
        public @Unsigned @OriginalName(value="ssci_t") int ssci;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        @InlineUnion(value=23850)
        public  @InlineUnion(value=23850) @OriginalName(value="pn_t") runtime.pn next_pn_halves;
        @InlineUnion(value=23850)
        public @InlineUnion(value=23850) @Unsigned long next_pn;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public boolean active;
        public Ptr<macsec_rx_sa_stats> stats;
        public Ptr<macsec_rx_sc> sc;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_dev_stats")
    @NotUsableInJava
    public static class macsec_dev_stats
    extends Struct {
        public @Unsigned long OutPktsUntagged;
        public @Unsigned long InPktsUntagged;
        public @Unsigned long OutPktsTooLong;
        public @Unsigned long InPktsNoTag;
        public @Unsigned long InPktsBadTag;
        public @Unsigned long InPktsUnknownSCI;
        public @Unsigned long InPktsNoSCI;
        public @Unsigned long InPktsOverrun;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_tx_sc_stats")
    @NotUsableInJava
    public static class macsec_tx_sc_stats
    extends Struct {
        public @Unsigned long OutPktsProtected;
        public @Unsigned long OutPktsEncrypted;
        public @Unsigned long OutOctetsProtected;
        public @Unsigned long OutOctetsEncrypted;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_tx_sa_stats")
    @NotUsableInJava
    public static class macsec_tx_sa_stats
    extends Struct {
        public @Unsigned int OutPktsProtected;
        public @Unsigned int OutPktsEncrypted;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_rx_sa_stats")
    @NotUsableInJava
    public static class macsec_rx_sa_stats
    extends Struct {
        public @Unsigned int InPktsOK;
        public @Unsigned int InPktsInvalid;
        public @Unsigned int InPktsNotValid;
        public @Unsigned int InPktsNotUsingSA;
        public @Unsigned int InPktsUnusedSA;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_rx_sc_stats")
    @NotUsableInJava
    public static class macsec_rx_sc_stats
    extends Struct {
        public @Unsigned long InOctetsValidated;
        public @Unsigned long InOctetsDecrypted;
        public @Unsigned long InPktsUnchecked;
        public @Unsigned long InPktsDelayed;
        public @Unsigned long InPktsOK;
        public @Unsigned long InPktsInvalid;
        public @Unsigned long InPktsLate;
        public @Unsigned long InPktsNotValid;
        public @Unsigned long InPktsNotUsingSA;
        public @Unsigned long InPktsUnusedSA;
    }

    @Type(noCCodeGeneration=true, cType="struct macsec_key")
    @NotUsableInJava
    public static class macsec_key
    extends Struct {
        public char @Size(value=16) [] id;
        public Ptr<CryptoDefinitions.crypto_aead> tfm;
        public  @OriginalName(value="salt_t") runtime.salt salt;
    }

    @Type(noCCodeGeneration=true, cType="enum macsec_offload")
    public static enum macsec_offload implements Enum<macsec_offload>,
    TypedEnum<macsec_offload, Integer>
    {
        MACSEC_OFFLOAD_OFF,
        MACSEC_OFFLOAD_PHY,
        MACSEC_OFFLOAD_MAC,
        __MACSEC_OFFLOAD_END,
        MACSEC_OFFLOAD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum macsec_validation_type")
    public static enum macsec_validation_type implements Enum<macsec_validation_type>,
    TypedEnum<macsec_validation_type, Integer>
    {
        MACSEC_VALIDATE_DISABLED,
        MACSEC_VALIDATE_CHECK,
        MACSEC_VALIDATE_STRICT,
        __MACSEC_VALIDATE_END,
        MACSEC_VALIDATE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct macsec_ops")
    @NotUsableInJava
    public static class macsec_ops
    extends Struct {
        public Ptr<?> mdo_dev_open;
        public Ptr<?> mdo_dev_stop;
        public Ptr<?> mdo_add_secy;
        public Ptr<?> mdo_upd_secy;
        public Ptr<?> mdo_del_secy;
        public Ptr<?> mdo_add_rxsc;
        public Ptr<?> mdo_upd_rxsc;
        public Ptr<?> mdo_del_rxsc;
        public Ptr<?> mdo_add_rxsa;
        public Ptr<?> mdo_upd_rxsa;
        public Ptr<?> mdo_del_rxsa;
        public Ptr<?> mdo_add_txsa;
        public Ptr<?> mdo_upd_txsa;
        public Ptr<?> mdo_del_txsa;
        public Ptr<?> mdo_get_dev_stats;
        public Ptr<?> mdo_get_tx_sc_stats;
        public Ptr<?> mdo_get_tx_sa_stats;
        public Ptr<?> mdo_get_rx_sc_stats;
        public Ptr<?> mdo_get_rx_sa_stats;
        public Ptr<?> mdo_insert_tx_tag;
        public @Unsigned int needed_headroom;
        public @Unsigned int needed_tailroom;
        public boolean rx_uses_md_dst;
    }
}

