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
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.SplitDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Union;

public final class FromDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NsDefinitions.ns_common> from_mnt_ns(Ptr<MntDefinitions.mnt_namespace> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="gid_t") int from_kgid(Ptr<UserDefinitions.user_namespace> targ, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="gid_t") int from_kgid_munged(Ptr<UserDefinitions.user_namespace> targ, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="projid_t") int from_kprojid(Ptr<UserDefinitions.user_namespace> targ, misc.kprojid_t kprojid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="projid_t") int from_kprojid_munged(Ptr<UserDefinitions.user_namespace> targ, misc.kprojid_t kprojid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uid_t") int from_kuid(Ptr<UserDefinitions.user_namespace> targ, misc.kuid_t kuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uid_t") int from_kuid_munged(Ptr<UserDefinitions.user_namespace> targ, misc.kuid_t kuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.kgid_t from_vfsgid(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<UserDefinitions.user_namespace> fs_userns,  @OriginalName(value="vfsgid_t") misc.kgid_t vfsgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.kuid_t from_vfsuid(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<UserDefinitions.user_namespace> fs_userns,  @OriginalName(value="vfsuid_t") misc.kuid_t vfsuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="qid_t") int from_kqid(Ptr<UserDefinitions.user_namespace> targ, runtime.kqid kqid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="qid_t") int from_kqid_munged(Ptr<UserDefinitions.user_namespace> targ, runtime.kqid kqid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { struct { long long unsigned int ip; long long unsigned int ip_sign_ext; long long unsigned int mispredict; } split; long long unsigned int full; }")
    @NotUsableInJava
    public static class from_of_branch_entry
    extends Union {
        public SplitDefinitions.split_of_from_of_branch_entry split;
        public @Unsigned long full;
    }
}

