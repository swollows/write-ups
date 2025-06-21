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
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class CxlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cxl_cper_kfifo_get(Ptr<cxl_cper_work_data> wd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cxl_cper_post_event(cxl_event_type event_type, Ptr<cxl_cper_event_rec> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cxl_cper_register_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cxl_cper_unregister_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cxl_mem_active() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cxl_mem_active_dec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cxl_mem_active_inc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cxl_rch_handle_error_iter(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cxl_reset_bus_function(Ptr<PciDefinitions.pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_mbox_cmd_rc")
    @NotUsableInJava
    public static class cxl_mbox_cmd_rc
    extends Struct {
        public int err;
        public String desc;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_cper_work_data")
    @NotUsableInJava
    public static class cxl_cper_work_data
    extends Struct {
        public cxl_event_type event_type;
        public cxl_cper_event_rec rec;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_cper_event_rec")
    @NotUsableInJava
    public static class cxl_cper_event_rec
    extends Struct {
        public misc.hdr_of_cxl_cper_event_rec hdr;
        public cxl_event event;
    }

    @Type(noCCodeGeneration=true, cType="enum cxl_event_type")
    public static enum cxl_event_type implements Enum<cxl_event_type>,
    TypedEnum<cxl_event_type, Integer>
    {
        CXL_CPER_EVENT_GENERIC,
        CXL_CPER_EVENT_GEN_MEDIA,
        CXL_CPER_EVENT_DRAM,
        CXL_CPER_EVENT_MEM_MODULE;

    }

    @Type(noCCodeGeneration=true, cType="union cxl_event")
    @NotUsableInJava
    public static class cxl_event
    extends Union {
        public cxl_event_generic generic;
        public cxl_event_gen_media gen_media;
        public cxl_event_dram dram;
        public cxl_event_mem_module mem_module;
        public cxl_event_media_hdr media_hdr;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_event_mem_module")
    @NotUsableInJava
    public static class cxl_event_mem_module
    extends Struct {
        public cxl_event_record_hdr hdr;
        public char event_type;
        public cxl_get_health_info info;
        public char @Size(value=61) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_get_health_info")
    @NotUsableInJava
    public static class cxl_get_health_info
    extends Struct {
        public char health_status;
        public char media_status;
        public char add_status;
        public char life_used;
        public char @Size(value=2) [] device_temp;
        public char @Size(value=4) [] dirty_shutdown_cnt;
        public char @Size(value=4) [] cor_vol_err_cnt;
        public char @Size(value=4) [] cor_per_err_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_event_dram")
    @NotUsableInJava
    public static class cxl_event_dram
    extends Struct {
        public cxl_event_media_hdr media_hdr;
        public char @Size(value=3) [] nibble_mask;
        public char bank_group;
        public char bank;
        public char @Size(value=3) [] row;
        public char @Size(value=2) [] column;
        public char @Size(value=32) [] correction_mask;
        public char @Size(value=23) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_event_gen_media")
    @NotUsableInJava
    public static class cxl_event_gen_media
    extends Struct {
        public cxl_event_media_hdr media_hdr;
        public char @Size(value=3) [] device;
        public char @Size(value=16) [] component_id;
        public char @Size(value=46) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_event_generic")
    @NotUsableInJava
    public static class cxl_event_generic
    extends Struct {
        public cxl_event_record_hdr hdr;
        public char @Size(value=80) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_event_media_hdr")
    @NotUsableInJava
    public static class cxl_event_media_hdr
    extends Struct {
        public cxl_event_record_hdr hdr;
        public @Unsigned @OriginalName(value="__le64") long phys_addr;
        public char descriptor;
        public char type;
        public char transaction_type;
        public char @Size(value=2) [] validity_flags;
        public char channel;
        public char rank;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_event_record_hdr")
    @NotUsableInJava
    public static class cxl_event_record_hdr
    extends Struct {
        public char length;
        public char @Size(value=3) [] flags;
        public @Unsigned @OriginalName(value="__le16") short handle;
        public @Unsigned @OriginalName(value="__le16") short related_handle;
        public @Unsigned @OriginalName(value="__le64") long timestamp;
        public char maint_op_class;
        public char @Size(value=15) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct cxl_ras_capability_regs")
    @NotUsableInJava
    public static class cxl_ras_capability_regs
    extends Struct {
        public @Unsigned int uncor_status;
        public @Unsigned int uncor_mask;
        public @Unsigned int uncor_severity;
        public @Unsigned int cor_status;
        public @Unsigned int cor_mask;
        public @Unsigned int cap_control;
        public @Unsigned int @Size(value=16) [] header_log;
    }
}

