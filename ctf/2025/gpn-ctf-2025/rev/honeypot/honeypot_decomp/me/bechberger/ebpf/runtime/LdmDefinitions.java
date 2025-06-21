/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LdmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="_ldm_printk((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void _ldm_printk(String level, String function, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_create_data_partitions($arg1, (const struct ldmdb*)$arg2)")
    public static boolean ldm_create_data_partitions(Ptr<misc.parsed_partitions> pp, Ptr<ldmdb> ldb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_frag_add((const u8*)$arg1, $arg2, $arg3)")
    public static boolean ldm_frag_add(Ptr<Character> data, int size, Ptr<ListDefinitions.list_head> frags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ldm_get_vblks(Ptr<misc.parsed_partitions> state2, @Unsigned long base, Ptr<ldmdb> ldb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_get_vnum((const u8*)$arg1)")
    public static @Unsigned long ldm_get_vnum(Ptr<Character> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_get_vstr((const u8*)$arg1, $arg2, $arg3)")
    public static int ldm_get_vstr(Ptr<Character> block, Ptr<Character> buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ldm_ldmdb_add(Ptr<Character> data, int len, Ptr<ldmdb> ldb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_parse_cmp3((const u8*)$arg1, $arg2, $arg3)")
    public static boolean ldm_parse_cmp3(Ptr<Character> buffer, int buflen, Ptr<vblk> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_parse_prt3((const u8*)$arg1, $arg2, $arg3)")
    public static boolean ldm_parse_prt3(Ptr<Character> buffer, int buflen, Ptr<vblk> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_parse_tocblock((const u8*)$arg1, $arg2)")
    public static boolean ldm_parse_tocblock(Ptr<Character> data, Ptr<tocblock> toc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_parse_vblk((const u8*)$arg1, $arg2, $arg3)")
    public static boolean ldm_parse_vblk(Ptr<Character> buf, int len, Ptr<vblk> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_parse_vol5((const u8*)$arg1, $arg2, $arg3)")
    public static boolean ldm_parse_vol5(Ptr<Character> buffer, int buflen, Ptr<vblk> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ldm_partition(Ptr<misc.parsed_partitions> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ldm_relative((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int ldm_relative(Ptr<Character> buffer, int buflen, int base, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ldm_validate_privheads(Ptr<misc.parsed_partitions> state2, Ptr<privhead> ph1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ldm_validate_tocblocks(Ptr<misc.parsed_partitions> state2, @Unsigned long base, Ptr<ldmdb> ldb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ldm_validate_vmdb(Ptr<misc.parsed_partitions> state2, @Unsigned long base, Ptr<ldmdb> ldb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vblk")
    @NotUsableInJava
    public static class vblk
    extends Struct {
        public char @Size(value=64) [] name;
        public @Unsigned long obj_id;
        public @Unsigned int sequence;
        public char flags;
        public char type;
        public misc.vblk_of_vblk vblk;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct tocblock")
    @NotUsableInJava
    public static class tocblock
    extends Struct {
        public char @Size(value=16) [] bitmap1_name;
        public @Unsigned long bitmap1_start;
        public @Unsigned long bitmap1_size;
        public char @Size(value=16) [] bitmap2_name;
        public @Unsigned long bitmap2_start;
        public @Unsigned long bitmap2_size;
    }

    @Type(noCCodeGeneration=true, cType="struct privhead")
    @NotUsableInJava
    public static class privhead
    extends Struct {
        public @Unsigned short ver_major;
        public @Unsigned short ver_minor;
        public @Unsigned long logical_disk_start;
        public @Unsigned long logical_disk_size;
        public @Unsigned long config_start;
        public @Unsigned long config_size;
        public misc.uuid_t disk_id;
    }

    @Type(noCCodeGeneration=true, cType="struct vmdb")
    @NotUsableInJava
    public static class vmdb
    extends Struct {
        public @Unsigned short ver_major;
        public @Unsigned short ver_minor;
        public @Unsigned int vblk_size;
        public @Unsigned int vblk_offset;
        public @Unsigned int last_vblk_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct ldmdb")
    @NotUsableInJava
    public static class ldmdb
    extends Struct {
        public privhead ph;
        public tocblock toc;
        public vmdb vm;
        public ListDefinitions.list_head v_dgrp;
        public ListDefinitions.list_head v_disk;
        public ListDefinitions.list_head v_volu;
        public ListDefinitions.list_head v_comp;
        public ListDefinitions.list_head v_part;
    }
}

