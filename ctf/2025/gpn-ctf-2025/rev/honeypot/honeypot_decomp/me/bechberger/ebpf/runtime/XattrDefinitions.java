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
import me.bechberger.ebpf.runtime.EvmDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.IntegrityDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.Sha1Definitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class XattrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="xattr_find_entry($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int xattr_find_entry(Ptr<runtime.inode> inode2, Ptr<Ptr<Ext4Definitions.ext4_xattr_entry>> pentry, Ptr<?> end, int name_index, String name, int sorted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xattr_verify($arg1, $arg2, $arg3, $arg4, $arg5, (const u8**)$arg6)")
    public static int xattr_verify(ImaDefinitions.ima_hooks func, Ptr<ImaDefinitions.ima_iint_cache> iint, Ptr<EvmDefinitions.evm_ima_xattr_data> xattr_value, int xattr_len, Ptr<IntegrityDefinitions.integrity_status> status, Ptr<String> cause) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xattr_full_name((const struct xattr_handler*)$arg1, (const u8*)$arg2))")
    public static String xattr_full_name(Ptr<xattr_handler> handler, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xattr_getsecurity($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long xattr_getsecurity(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xattr_list_one($arg1, $arg2, (const u8*)$arg3)")
    public static int xattr_list_one(Ptr<String> buffer, Ptr<@OriginalName(value="ssize_t") Long> remaining_size, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xattr_permission($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int xattr_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct xattr_handler*)xattr_resolve_name($arg1, (const u8**)$arg2))")
    public static Ptr<xattr_handler> xattr_resolve_name(Ptr<runtime.inode> inode2, Ptr<String> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xattr_supports_user_prefix(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xattr_list")
    @NotUsableInJava
    public static class xattr_list
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public boolean enabled;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { u8 unused; u8 type; } sha1; struct { u8 type; u8 algo; } ng; u8 data[2]; }")
    @NotUsableInJava
    public static class xattr_of_anon_member_of_anon_member_of_ima_digest_data_and_xattr_of_ima_digest_data_hdr
    extends Union {
        public Sha1Definitions.sha1_of_xattr_of_anon_member_of_anon_member_of_ima_digest_data_and_xattr_of_ima_digest_data_hdr sha1;
        public misc.ng_of_xattr_of_anon_member_of_anon_member_of_ima_digest_data_and_xattr_of_ima_digest_data_hdr ng;
        public char @Size(value=2) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct xattr_ctx")
    @NotUsableInJava
    public static class xattr_ctx
    extends Struct {
        @InlineUnion(value=10069)
        public @InlineUnion(value=10069) Ptr<?> cvalue;
        @InlineUnion(value=10069)
        public @InlineUnion(value=10069) Ptr<?> value;
        public Ptr<?> kvalue;
        public @Unsigned long size;
        public Ptr<xattr_name> kname;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xattr_name")
    @NotUsableInJava
    public static class xattr_name
    extends Struct {
        public char @Size(value=256) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct xattr_handler")
    @NotUsableInJava
    public static class xattr_handler
    extends Struct {
        public String name;
        public String prefix;
        public int flags;
        public Ptr<?> list;
        public Ptr<?> get;
        public Ptr<?> set;
    }
}

