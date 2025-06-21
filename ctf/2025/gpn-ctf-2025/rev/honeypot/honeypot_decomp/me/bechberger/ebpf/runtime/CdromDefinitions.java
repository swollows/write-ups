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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class CdromDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cdrom_check_events(Ptr<cdrom_device_info> cdi, @Unsigned int clearing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cdrom_count_tracks(Ptr<cdrom_device_info> cdi, Ptr<runtime.tracktype> tracks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_dummy_generic_packet(Ptr<cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cdrom_dvd_rw_close_write(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cdrom_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_get_disc_info(Ptr<cdrom_device_info> cdi, Ptr<misc.disc_information> di) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_get_last_written(Ptr<cdrom_device_info> cdi, Ptr<Long> last_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_get_media_event(Ptr<cdrom_device_info> cdi, Ptr<misc.media_event_desc> med) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_get_random_writable(Ptr<cdrom_device_info> cdi, Ptr<misc.rwrt_feature_desc> rfd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_ioctl(Ptr<cdrom_device_info> cdi, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_ioctl_drive_status(Ptr<cdrom_device_info> cdi, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_ioctl_media_changed(Ptr<cdrom_device_info> cdi, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_load_unload(Ptr<cdrom_device_info> cdi, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_mode_select(Ptr<cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_mode_sense(Ptr<cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc, int page_code, int page_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_mrw_bgformat(Ptr<cdrom_device_info> cdi, int cont) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_mrw_exit(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_mrw_probe_pc(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_mrw_set_lba_space(Ptr<cdrom_device_info> cdi, int space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_number_of_slots(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_open(Ptr<cdrom_device_info> cdi, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_open_write(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_ram_open_write(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_read_block(Ptr<cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc, int lba, int nblocks, int format, int blksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_read_cdda_old(Ptr<cdrom_device_info> cdi, Ptr<Character> ubuf, int lba, int nframes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_read_mech_status(Ptr<cdrom_device_info> cdi, Ptr<cdrom_changer_info> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_read_subchannel(Ptr<cdrom_device_info> cdi, Ptr<cdrom_subchnl> subchnl, int mcn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_read_tocentry(Ptr<cdrom_device_info> cdi, Ptr<cdrom_tocentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cdrom_release(Ptr<cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_select_disc(Ptr<cdrom_device_info> cdi, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cdrom_switch_blocksize(Ptr<cdrom_device_info> cdi, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cdrom_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int cdrom_sysctl_handler(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cdrom_sysctl_info((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int cdrom_sysctl_info(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cdrom_sysctl_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cdrom_update_settings() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum cdrom_print_option")
    public static enum cdrom_print_option implements Enum<cdrom_print_option>,
    TypedEnum<cdrom_print_option, Integer>
    {
        CTL_NAME,
        CTL_SPEED,
        CTL_SLOTS,
        CTL_CAPABILITY;

    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_sysctl_settings")
    @NotUsableInJava
    public static class cdrom_sysctl_settings
    extends Struct {
        public char @Size(value=1000) [] info;
        public int autoclose;
        public int autoeject;
        public int debug;
        public int lock;
        public int check;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_changer_info")
    @NotUsableInJava
    public static class cdrom_changer_info
    extends Struct {
        public cdrom_mechstat_header hdr;
        public cdrom_slot @Size(value=256) [] slots;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_slot")
    @NotUsableInJava
    public static class cdrom_slot
    extends Struct {
        public char change;
        public char reserved1;
        public char disc_present;
        public char @Size(value=3) [] reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_mechstat_header")
    @NotUsableInJava
    public static class cdrom_mechstat_header
    extends Struct {
        public char curslot;
        public char changer_state;
        public char fault;
        public char reserved1;
        public char door_open;
        public char mech_state;
        public char @Size(value=3) [] curlba;
        public char nslots;
        public @Unsigned short slot_tablelen;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_timed_media_change_info")
    @NotUsableInJava
    public static class cdrom_timed_media_change_info
    extends Struct {
        public long last_media_change;
        public @Unsigned long media_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_blk")
    @NotUsableInJava
    public static class cdrom_blk
    extends Struct {
        public @Unsigned int from;
        public @Unsigned short len;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_read_audio")
    @NotUsableInJava
    public static class cdrom_read_audio
    extends Struct {
        public cdrom_addr addr;
        public char addr_format;
        public int nframes;
        public Ptr<Character> buf;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_subchnl")
    @NotUsableInJava
    public static class cdrom_subchnl
    extends Struct {
        public char cdsc_format;
        public char cdsc_audiostatus;
        public char cdsc_adr;
        public char cdsc_ctrl;
        public char cdsc_trk;
        public char cdsc_ind;
        public cdrom_addr cdsc_absaddr;
        public cdrom_addr cdsc_reladdr;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_volctrl")
    @NotUsableInJava
    public static class cdrom_volctrl
    extends Struct {
        public char channel0;
        public char channel1;
        public char channel2;
        public char channel3;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_msf")
    @NotUsableInJava
    public static class cdrom_msf
    extends Struct {
        public char cdmsf_min0;
        public char cdmsf_sec0;
        public char cdmsf_frame0;
        public char cdmsf_min1;
        public char cdmsf_sec1;
        public char cdmsf_frame1;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_tocentry")
    @NotUsableInJava
    public static class cdrom_tocentry
    extends Struct {
        public char cdte_track;
        public char cdte_adr;
        public char cdte_ctrl;
        public char cdte_format;
        public cdrom_addr cdte_addr;
        public char cdte_datamode;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_tochdr")
    @NotUsableInJava
    public static class cdrom_tochdr
    extends Struct {
        public char cdth_trk0;
        public char cdth_trk1;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_ti")
    @NotUsableInJava
    public static class cdrom_ti
    extends Struct {
        public char cdti_trk0;
        public char cdti_ind0;
        public char cdti_trk1;
        public char cdti_ind1;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_generic_command")
    @NotUsableInJava
    public static class cdrom_generic_command
    extends Struct {
        public char @Size(value=12) [] cmd;
        public String buffer;
        public @Unsigned int buflen;
        public int stat;
        public Ptr<RequestDefinitions.request_sense> sense;
        public char data_direction;
        public int quiet;
        public int timeout;
        @InlineUnion(value=32488)
        public @InlineUnion(value=32488) Ptr<?> @Size(value=1) [] reserved;
        @InlineUnion(value=32488)
        public @InlineUnion(value=32488) Ptr<?> unused;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_device_ops")
    @NotUsableInJava
    public static class cdrom_device_ops
    extends Struct {
        public Ptr<?> open;
        public Ptr<?> release;
        public Ptr<?> drive_status;
        public Ptr<?> check_events;
        public Ptr<?> tray_move;
        public Ptr<?> lock_door;
        public Ptr<?> select_speed;
        public Ptr<?> get_last_session;
        public Ptr<?> get_mcn;
        public Ptr<?> reset;
        public Ptr<?> audio_ioctl;
        public Ptr<?> generic_packet;
        public Ptr<?> read_cdda_bpc;
        public int capability;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_mcn")
    @NotUsableInJava
    public static class cdrom_mcn
    extends Struct {
        public char @Size(value=14) [] medium_catalog_number;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_multisession")
    @NotUsableInJava
    public static class cdrom_multisession
    extends Struct {
        public cdrom_addr addr;
        public char xa_flag;
        public char addr_format;
    }

    @Type(noCCodeGeneration=true, cType="union cdrom_addr")
    @NotUsableInJava
    public static class cdrom_addr
    extends Union {
        public cdrom_msf0 msf;
        public int lba;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_msf0")
    @NotUsableInJava
    public static class cdrom_msf0
    extends Struct {
        public char minute;
        public char second;
        public char frame;
    }

    @Type(noCCodeGeneration=true, cType="struct cdrom_device_info")
    @NotUsableInJava
    public static class cdrom_device_info
    extends Struct {
        public Ptr<cdrom_device_ops> ops;
        public ListDefinitions.list_head list;
        public Ptr<runtime.gendisk> disk;
        public Ptr<?> handle;
        public int mask;
        public int speed;
        public int capacity;
        public @Unsigned int options;
        public @Unsigned int mc_flags;
        public @Unsigned int vfs_events;
        public @Unsigned int ioctl_events;
        public int use_count;
        public char @Size(value=20) [] name;
        public char sanyo_slot;
        public char keeplocked;
        public char reserved;
        public int cdda_method;
        public char last_sense;
        public char media_written;
        public @Unsigned short mmc3_profile;
        public Ptr<?> exit;
        public int mrw_mode_page;
        public boolean opened_for_data;
        public long last_media_change_ms;
    }
}

