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
import me.bechberger.ebpf.runtime.Cfg80211Definitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.Ieee80211Definitions;
import me.bechberger.ebpf.runtime.IwDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.Nl80211Definitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class WirelessDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wireless_nlevent_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wireless_nlevent_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wireless_nlevent_process(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wireless_send_event($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void wireless_send_event(Ptr<NetDefinitions.net_device> dev, @Unsigned int cmd, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wireless_warn_cfg80211_wext() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wireless_spy_update(Ptr<NetDefinitions.net_device> dev, String address, Ptr<IwDefinitions.iw_quality> wstats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> wireless_dev_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wireless_dev_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> wireless_dev_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wireless_dev_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wireless_status_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { cfg80211_internal_bss *current_bss; }")
    @NotUsableInJava
    public static class AnonymousType253767021C48
    extends Struct {
        public @OriginalName(value="cfg80211_internal_bss") Ptr<?> current_bss;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int beacon_interval; struct cfg80211_chan_def chandef; }")
    @NotUsableInJava
    public static class AnonymousType726107869C78
    extends Struct {
        public @Unsigned int beacon_interval;
        public Cfg80211Definitions.cfg80211_chan_def chandef;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 addr[6]; union { struct { unsigned int beacon_interval; struct cfg80211_chan_def chandef; } ap; struct { cfg80211_internal_bss *current_bss; } client; }; _Bool cac_started; long unsigned int cac_start_time; unsigned int cac_time_ms; }")
    @NotUsableInJava
    public static class AnonymousType1661803311C292
    extends Struct {
        public char @Size(value=6) [] addr;
        @InlineUnion(value=35115)
        public @InlineUnion(value=35115) AnonymousType726107869C78 ap;
        @InlineUnion(value=35115)
        public @InlineUnion(value=35115) AnonymousType253767021C48 client;
        public boolean cac_started;
        public @Unsigned long cac_start_time;
        public @Unsigned int cac_time_ms;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int beacon_interval; struct cfg80211_chan_def chandef; } ap; struct { cfg80211_internal_bss *current_bss; } client; }")
    @NotUsableInJava
    public static class AnonymousType1625428489C163
    extends Union {
        public AnonymousType726107869C78 ap;
        public AnonymousType253767021C48 client;
    }

    @Type(noCCodeGeneration=true, cType="struct wireless_dev")
    @NotUsableInJava
    public static class wireless_dev
    extends Struct {
        public Ptr<runtime.wiphy> wiphy;
        public Nl80211Definitions.nl80211_iftype iftype;
        public ListDefinitions.list_head list;
        public Ptr<NetDefinitions.net_device> netdev;
        public @Unsigned int identifier;
        public ListDefinitions.list_head mgmt_registrations;
        public char mgmt_registrations_need_update;
        public boolean use_4addr;
        public boolean is_running;
        public boolean registered;
        public boolean registering;
        public char @Size(value=6) [] address;
        public @OriginalName(value="cfg80211_conn") Ptr<?> conn;
        public @OriginalName(value="cfg80211_cached_keys") Ptr<?> connect_keys;
        public Ieee80211Definitions.ieee80211_bss_type conn_bss_type;
        public @Unsigned int conn_owner_nlportid;
        public misc.work_struct disconnect_wk;
        public char @Size(value=6) [] disconnect_bssid;
        public ListDefinitions.list_head event_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock event_lock;
        public char connected;
        public boolean ps;
        public int ps_timeout;
        public @Unsigned int ap_unexpected_nlportid;
        public @Unsigned int owner_nlportid;
        public boolean nl_owner_dead;
        public misc.wext_of_wireless_dev wext;
        public misc.wiphy_work cqm_rssi_work;
        public @OriginalName(value="cfg80211_cqm_config") Ptr<?> cqm_config;
        public ListDefinitions.list_head pmsr_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pmsr_lock;
        public misc.work_struct pmsr_free_wk;
        public @Unsigned long unprot_beacon_reported;
        public UDefinitions.u_of_wireless_dev u;
        public AnonymousType1661803311C292 @Size(value=15) [] links;
        public @Unsigned short valid_links;
    }
}

