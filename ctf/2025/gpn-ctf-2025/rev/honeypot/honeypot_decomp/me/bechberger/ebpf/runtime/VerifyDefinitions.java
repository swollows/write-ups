/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FsverityDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.Pkcs7Definitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class VerifyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_data_block($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static boolean verify_data_block(Ptr<runtime.inode> inode2, Ptr<FsverityDefinitions.fsverity_info> vi, Ptr<?> data, @Unsigned long data_pos, @Unsigned long max_ra_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean verify_data_blocks(Ptr<runtime.folio> data_folio, @Unsigned long len, @Unsigned long offset, @Unsigned long max_ra_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int verify_dfa(Ptr<AaDefinitions.aa_dfa> dfa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void verify_bh(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int verify_group_input(Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_new_group_data> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_pefile_signature((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static int verify_pefile_signature(Ptr<?> pebuf, @Unsigned int pelen, Ptr<runtime.key> trusted_keys, KeyDefinitions.key_being_used_for usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int verify_reserved_gdb(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int end, Ptr<BufferDefinitions.buffer_head> primary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_dirent_name((const u8*)$arg1, $arg2)")
    public static int verify_dirent_name(String name, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_signature((const struct key*)$arg1, (const struct public_key_signature*)$arg2)")
    public static int verify_signature(Ptr<runtime.key> key2, Ptr<misc.public_key_signature> sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_container((const u8*)$arg1, $arg2)")
    public static boolean verify_container(Ptr<Character> buf, @Unsigned long buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void verify_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_equivalence_table((const u8*)$arg1, $arg2)")
    public static boolean verify_equivalence_table(Ptr<Character> buf, @Unsigned long buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_patch((const u8*)$arg1, $arg2, $arg3)")
    public static int verify_patch(Ptr<Character> buf, @Unsigned long buf_size, Ptr<@Unsigned Integer> patch_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean verify_perms(Ptr<AaDefinitions.aa_policydb> pdb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_pkcs7_message_sig((const void*)$arg1, $arg2, $arg3, $arg4, $arg5, (int (*)(void*, const void*, long unsigned int, long unsigned int))$arg6, $arg7)")
    public static int verify_pkcs7_message_sig(Ptr<?> data, @Unsigned long len, Ptr<Pkcs7Definitions.pkcs7_message> pkcs7, Ptr<runtime.key> trusted_keys, KeyDefinitions.key_being_used_for usage, Ptr<?> view_content, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="verify_pkcs7_signature((const void*)$arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, (int (*)(void*, const void*, long unsigned int, long unsigned int))$arg7, $arg8)")
    public static int verify_pkcs7_signature(Ptr<?> data, @Unsigned long len, Ptr<?> raw_pkcs7, @Unsigned long pkcs7_len, Ptr<runtime.key> trusted_keys, KeyDefinitions.key_being_used_for usage, Ptr<?> view_content, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int verify_profile(Ptr<AaDefinitions.aa_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int verify_spi_info(char proto2, @Unsigned int min, @Unsigned int max, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }
}

