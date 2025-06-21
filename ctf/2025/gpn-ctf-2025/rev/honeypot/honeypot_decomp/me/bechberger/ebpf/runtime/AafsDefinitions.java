/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class AafsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__aafs_ns_mkdir($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __aafs_ns_mkdir(Ptr<AaDefinitions.aa_ns> ns, Ptr<runtime.dentry> parent, String name, Ptr<runtime.dentry> dent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __aafs_ns_mkdir_entries(Ptr<AaDefinitions.aa_ns> ns, Ptr<runtime.dentry> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aafs_ns_rmdir(Ptr<AaDefinitions.aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aafs_profile_migrate_dents(Ptr<AaDefinitions.aa_profile> old, Ptr<AaDefinitions.aa_profile> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __aafs_profile_mkdir(Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aafs_profile_rmdir(Ptr<AaDefinitions.aa_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aafs_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aafs_remove(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aafs_show_path(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum aafs_prof_type")
    public static enum aafs_prof_type implements Enum<aafs_prof_type>,
    TypedEnum<aafs_prof_type, Integer>
    {
        AAFS_PROF_DIR,
        AAFS_PROF_PROFS,
        AAFS_PROF_NAME,
        AAFS_PROF_MODE,
        AAFS_PROF_ATTACH,
        AAFS_PROF_HASH,
        AAFS_PROF_RAW_DATA,
        AAFS_PROF_RAW_HASH,
        AAFS_PROF_RAW_ABI,
        AAFS_PROF_SIZEOF;

    }

    @Type(noCCodeGeneration=true, cType="enum aafs_ns_type")
    public static enum aafs_ns_type implements Enum<aafs_ns_type>,
    TypedEnum<aafs_ns_type, Integer>
    {
        AAFS_NS_DIR,
        AAFS_NS_PROFS,
        AAFS_NS_NS,
        AAFS_NS_RAW_DATA,
        AAFS_NS_LOAD,
        AAFS_NS_REPLACE,
        AAFS_NS_REMOVE,
        AAFS_NS_REVISION,
        AAFS_NS_COUNT,
        AAFS_NS_MAX_COUNT,
        AAFS_NS_SIZE,
        AAFS_NS_MAX_SIZE,
        AAFS_NS_OWNER,
        AAFS_NS_SIZEOF;

    }
}

