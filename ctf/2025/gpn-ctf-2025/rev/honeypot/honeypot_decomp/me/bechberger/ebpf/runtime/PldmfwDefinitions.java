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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PldmfwDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="pldmfw_flash_image($arg1, (const struct firmware*)$arg2)")
    public static int pldmfw_flash_image(Ptr<pldmfw> context2, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pldmfw_op_pci_match_record(Ptr<pldmfw> context2, Ptr<pldmfw_record> record) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pldmfw")
    @NotUsableInJava
    public static class pldmfw
    extends Struct {
        public Ptr<pldmfw_ops> ops;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct pldmfw_priv")
    @NotUsableInJava
    public static class pldmfw_priv
    extends Struct {
        public Ptr<pldmfw> context;
        public Ptr<runtime.firmware> fw;
        public @Unsigned long offset;
        public ListDefinitions.list_head records;
        public ListDefinitions.list_head components;
        public Ptr<misc.__pldm_header> header;
        public @Unsigned short total_header_size;
        public @Unsigned short component_bitmap_len;
        public @Unsigned short bitmap_size;
        public @Unsigned short component_count;
        public Ptr<Character> component_start;
        public Ptr<Character> record_start;
        public char record_count;
        public @Unsigned int header_crc;
        public Ptr<pldmfw_record> matching_record;
    }

    @Type(noCCodeGeneration=true, cType="struct __pldmfw_component_area")
    @NotUsableInJava
    public static class __pldmfw_component_area
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short component_image_count;
        public char @Size(value=0) [] components;
    }

    @Type(noCCodeGeneration=true, cType="struct __pldmfw_component_info")
    @NotUsableInJava
    public static class __pldmfw_component_info
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short classification;
        public @Unsigned @OriginalName(value="__le16") short identifier;
        public @Unsigned @OriginalName(value="__le32") int comparison_stamp;
        public @Unsigned @OriginalName(value="__le16") short options;
        public @Unsigned @OriginalName(value="__le16") short activation_method;
        public @Unsigned @OriginalName(value="__le32") int location_offset;
        public @Unsigned @OriginalName(value="__le32") int size;
        public char version_type;
        public char version_len;
        public char @Size(value=0) [] version_string;
    }

    @Type(noCCodeGeneration=true, cType="struct __pldmfw_record_area")
    @NotUsableInJava
    public static class __pldmfw_record_area
    extends Struct {
        public char record_count;
        public char @Size(value=0) [] records;
    }

    @Type(noCCodeGeneration=true, cType="struct __pldmfw_desc_tlv")
    @NotUsableInJava
    public static class __pldmfw_desc_tlv
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short type;
        public @Unsigned @OriginalName(value="__le16") short size;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct __pldmfw_record_info")
    @NotUsableInJava
    public static class __pldmfw_record_info
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short record_len;
        public char descriptor_count;
        public @Unsigned @OriginalName(value="__le32") int device_update_flags;
        public char version_type;
        public char version_len;
        public @Unsigned @OriginalName(value="__le16") short package_data_len;
        public char @Size(value=0) [] variable_record_data;
    }

    @Type(noCCodeGeneration=true, cType="struct pldmfw_ops")
    @NotUsableInJava
    public static class pldmfw_ops
    extends Struct {
        public Ptr<?> match_record;
        public Ptr<?> send_package_data;
        public Ptr<?> send_component_table;
        public Ptr<?> flash_component;
        public Ptr<?> finalize_update;
    }

    @Type(noCCodeGeneration=true, cType="struct pldmfw_component")
    @NotUsableInJava
    public static class pldmfw_component
    extends Struct {
        public ListDefinitions.list_head entry;
        public @Unsigned short classification;
        public @Unsigned short identifier;
        public @Unsigned short options;
        public @Unsigned short activation_method;
        public @Unsigned int comparison_stamp;
        public @Unsigned int component_size;
        public Ptr<Character> component_data;
        public Ptr<Character> version_string;
        public char version_type;
        public char version_len;
        public char index;
    }

    @Type(noCCodeGeneration=true, cType="struct pldmfw_desc_tlv")
    @NotUsableInJava
    public static class pldmfw_desc_tlv
    extends Struct {
        public ListDefinitions.list_head entry;
        public Ptr<Character> data;
        public @Unsigned short type;
        public @Unsigned short size;
    }

    @Type(noCCodeGeneration=true, cType="struct pldmfw_record")
    @NotUsableInJava
    public static class pldmfw_record
    extends Struct {
        public ListDefinitions.list_head entry;
        public ListDefinitions.list_head descs;
        public Ptr<Character> version_string;
        public char version_type;
        public char version_len;
        public @Unsigned short package_data_len;
        public @Unsigned int device_update_flags;
        public Ptr<Character> package_data;
        public Ptr<@Unsigned Long> component_bitmap;
        public @Unsigned short component_bitmap_len;
    }
}

