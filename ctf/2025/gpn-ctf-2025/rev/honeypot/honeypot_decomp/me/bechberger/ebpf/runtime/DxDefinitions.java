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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ext4Definitions.ext4_dir_entry_2> dx_move_dirents(Ptr<runtime.inode> dir, String from, String to, Ptr<dx_map_entry> map2, int count, @Unsigned int blocksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ext4Definitions.ext4_dir_entry_2> dx_pack_dirents(Ptr<runtime.inode> dir, String base, @Unsigned int blocksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dx_frame> dx_probe(Ptr<Ext4Definitions.ext4_filename> fname2, Ptr<runtime.inode> dir, Ptr<dx_hash_info> hinfo, Ptr<dx_frame> frame_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dx_tail")
    @NotUsableInJava
    public static class dx_tail
    extends Struct {
        public @Unsigned int dt_reserved;
        public @Unsigned @OriginalName(value="__le32") int dt_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_map_entry")
    @NotUsableInJava
    public static class dx_map_entry
    extends Struct {
        public @Unsigned int hash;
        public @Unsigned short offs;
        public @Unsigned short size;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_frame")
    @NotUsableInJava
    public static class dx_frame
    extends Struct {
        public Ptr<BufferDefinitions.buffer_head> bh;
        public Ptr<dx_entry> entries;
        public Ptr<dx_entry> at;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_node")
    @NotUsableInJava
    public static class dx_node
    extends Struct {
        public misc.fake_dirent fake;
        public dx_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_root")
    @NotUsableInJava
    public static class dx_root
    extends Struct {
        public misc.fake_dirent dot;
        public char @Size(value=4) [] dot_name;
        public misc.fake_dirent dotdot;
        public char @Size(value=4) [] dotdot_name;
        public dx_root_info info;
        public dx_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_root_info")
    @NotUsableInJava
    public static class dx_root_info
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int reserved_zero;
        public char hash_version;
        public char info_length;
        public char indirect_levels;
        public char unused_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_entry")
    @NotUsableInJava
    public static class dx_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hash;
        public @Unsigned @OriginalName(value="__le32") int block;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_countlimit")
    @NotUsableInJava
    public static class dx_countlimit
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short limit;
        public @Unsigned @OriginalName(value="__le16") short count;
    }

    @Type(noCCodeGeneration=true, cType="struct dx_hash_info")
    @NotUsableInJava
    public static class dx_hash_info
    extends Struct {
        public @Unsigned int hash;
        public @Unsigned int minor_hash;
        public int hash_version;
        public Ptr<@Unsigned Integer> seed;
    }
}

