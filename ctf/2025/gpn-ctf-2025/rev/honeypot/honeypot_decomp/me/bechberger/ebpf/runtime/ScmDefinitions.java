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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.UnixDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ScmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scm_detach_fds_compat(Ptr<runtime.msghdr> msg, Ptr<scm_cookie> scm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __scm_destroy(Ptr<scm_cookie> scm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __scm_recv_common(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, Ptr<scm_cookie> scm, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __scm_send(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, Ptr<scm_cookie> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scm_detach_fds(Ptr<runtime.msghdr> msg, Ptr<scm_cookie> scm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scm_fp_copy(Ptr<runtime.cmsghdr> cmsg, Ptr<Ptr<scm_fp_list>> fplp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scm_fp_list> scm_fp_dup(Ptr<scm_fp_list> fpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct scm_ts_pktinfo")
    @NotUsableInJava
    public static class scm_ts_pktinfo
    extends Struct {
        public @Unsigned int if_index;
        public @Unsigned int pkt_length;
        public @Unsigned int @Size(value=2) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_stat")
    @NotUsableInJava
    public static class scm_stat
    extends Struct {
        public AtomicDefinitions.atomic_t nr_fds;
        public @Unsigned long nr_unix_fds;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_timestamping64")
    @NotUsableInJava
    public static class scm_timestamping64
    extends Struct {
        public KernelDefinitions.__kernel_timespec @Size(value=3) [] ts;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_timestamping")
    @NotUsableInJava
    public static class scm_timestamping
    extends Struct {
        public KernelDefinitions.__kernel_old_timespec @Size(value=3) [] ts;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_cookie")
    @NotUsableInJava
    public static class scm_cookie
    extends Struct {
        public Ptr<runtime.pid> pid;
        public Ptr<scm_fp_list> fp;
        public scm_creds creds;
        public @Unsigned int secid;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_fp_list")
    @NotUsableInJava
    public static class scm_fp_list
    extends Struct {
        public short count;
        public short count_unix;
        public short max;
        public boolean inflight;
        public boolean dead;
        public ListDefinitions.list_head vertices;
        public Ptr<UnixDefinitions.unix_edge> edges;
        public Ptr<UserDefinitions.user_struct> user;
        public Ptr<runtime.file> @Size(value=253) [] fp;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_timestamping_internal")
    @NotUsableInJava
    public static class scm_timestamping_internal
    extends Struct {
        public runtime.timespec64 @Size(value=3) [] ts;
    }

    @Type(noCCodeGeneration=true, cType="struct scm_creds")
    @NotUsableInJava
    public static class scm_creds
    extends Struct {
        public @Unsigned int pid;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
    }
}

