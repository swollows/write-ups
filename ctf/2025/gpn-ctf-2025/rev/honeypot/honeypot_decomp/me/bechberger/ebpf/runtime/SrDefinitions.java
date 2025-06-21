/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_audio_ioctl(Ptr<CdromDefinitions.cdrom_device_info> cdi, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_disk_status(Ptr<CdromDefinitions.cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_do_ioctl(Ptr<@OriginalName(value="Scsi_CD") ScsiDefinitions.scsi_cd> cd, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_drive_status(Ptr<CdromDefinitions.cdrom_device_info> cdi, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_fake_playtrkind(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<CdromDefinitions.cdrom_ti> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_get_last_session(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<CdromDefinitions.cdrom_multisession> ms_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_get_mcn(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<CdromDefinitions.cdrom_mcn> mcn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_is_xa(Ptr<@OriginalName(value="Scsi_CD") ScsiDefinitions.scsi_cd> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_lock_door(Ptr<CdromDefinitions.cdrom_device_info> cdi, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_read_cd(Ptr<@OriginalName(value="Scsi_CD") ScsiDefinitions.scsi_cd> cd, String dest, int lba, int format, int blksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_reset(Ptr<CdromDefinitions.cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_select_speed(Ptr<CdromDefinitions.cdrom_device_info> cdi, @Unsigned long speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_tray_move(Ptr<CdromDefinitions.cdrom_device_info> cdi, int pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_cd_check(Ptr<CdromDefinitions.cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_set_blocklength(Ptr<@OriginalName(value="Scsi_CD") ScsiDefinitions.scsi_cd> cd, int blocklength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sr_vendor_init(Ptr<@OriginalName(value="Scsi_CD") ScsiDefinitions.scsi_cd> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sr_block_check_events(Ptr<runtime.gendisk> disk, @Unsigned int clearing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_block_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_block_open(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sr_block_release(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sr_check_events(Ptr<CdromDefinitions.cdrom_device_info> cdi, @Unsigned int clearing, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_done(Ptr<ScsiDefinitions.scsi_cmnd> SCpnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sr_free_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char sr_init_command(Ptr<ScsiDefinitions.scsi_cmnd> SCpnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_open(Ptr<CdromDefinitions.cdrom_device_info> cdi, int purpose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_packet(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_read_cdda_bpc(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> ubuf, @Unsigned int lba, @Unsigned int nr, Ptr<Character> last_sense) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sr_release(Ptr<CdromDefinitions.cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sr_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sr_wait_node")
    @NotUsableInJava
    public static class sr_wait_node
    extends Struct {
        public AtomicDefinitions.atomic_t inuse;
        public misc.llist_node node;
    }
}

