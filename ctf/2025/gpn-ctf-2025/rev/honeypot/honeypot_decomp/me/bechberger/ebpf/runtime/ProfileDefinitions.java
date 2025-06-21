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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.ApparmorDefinitions;
import me.bechberger.ebpf.runtime.FgraphDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.PathDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class ProfileDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void profile_hits(int type2, Ptr<?> __pc, @Unsigned int nr_hits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int profile_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_onexec((const struct cred*)$arg1, $arg2, $arg3, $arg4, (const struct linux_binprm*)$arg5, $arg6, $arg7, $arg8)")
    public static int profile_onexec(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<AaDefinitions.aa_label> onexec, boolean stack, Ptr<LinuxDefinitions.linux_binprm> bprm, String buffer, Ptr<PathDefinitions.path_cond> cond, Ptr<@OriginalName(value="bool") Boolean> secure_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int profile_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long profile_pc(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_ptrace_perm((const struct cred*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int profile_ptrace_perm(Ptr<runtime.cred> cred2, Ptr<AaDefinitions.aa_profile> profile, Ptr<AaDefinitions.aa_label> peer, @Unsigned int request2, Ptr<ApparmorDefinitions.apparmor_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int profile_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void profile_tick(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_transition((const struct cred*)$arg1, $arg2, (const struct linux_binprm*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<AaDefinitions.aa_label> profile_transition(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<LinuxDefinitions.linux_binprm> bprm, String buffer, Ptr<PathDefinitions.path_cond> cond, Ptr<@OriginalName(value="bool") Boolean> secure_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_umount((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4)")
    public static int profile_umount(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.path> path2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int profile_cmp(Ptr<AaDefinitions.aa_profile> a, Ptr<AaDefinitions.aa_profile> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int profile_graph_entry(Ptr<FtraceDefinitions.ftrace_graph_ent> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void profile_graph_return(Ptr<FtraceDefinitions.ftrace_graph_ret> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_load($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long profile_load(Ptr<runtime.file> f, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_query_cb($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void profile_query_cb(Ptr<AaDefinitions.aa_profile> profile, Ptr<AaDefinitions.aa_perms> perms, String match_str, @Unsigned long match_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_remove($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long profile_remove(Ptr<runtime.file> f, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_replace($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long profile_replace(Ptr<runtime.file> f, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_signal_perm((const struct cred*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int profile_signal_perm(Ptr<runtime.cred> cred2, Ptr<AaDefinitions.aa_profile> profile, Ptr<AaDefinitions.aa_label> peer, @Unsigned int request2, Ptr<ApparmorDefinitions.apparmor_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_path_link((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const struct path*)$arg5, $arg6, $arg7)")
    public static int profile_path_link(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.path> link2, String buffer, Ptr<runtime.path> target, String buffer2, Ptr<PathDefinitions.path_cond> cond) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="profile_path_perm((const u8*)$arg1, (const struct cred*)$arg2, $arg3, (const struct path*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static int profile_path_perm(String op, Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.path> path2, String buffer, @Unsigned int request2, Ptr<PathDefinitions.path_cond> cond, int flags, Ptr<AaDefinitions.aa_perms> perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum profile_mode")
    public static enum profile_mode implements Enum<profile_mode>,
    TypedEnum<profile_mode, Integer>
    {
        APPARMOR_ENFORCE,
        APPARMOR_COMPLAIN,
        APPARMOR_KILL,
        APPARMOR_UNCONFINED,
        APPARMOR_USER;

    }
}

