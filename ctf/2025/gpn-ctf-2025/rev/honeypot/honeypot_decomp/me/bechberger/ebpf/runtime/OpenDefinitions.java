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
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class OpenDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> open_detached_copy(Ptr<runtime.path> path2, boolean recursive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_namespace(Ptr<NsDefinitions.ns_common> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_pipe_on_cpu(Ptr<TraceDefinitions.trace_array> tr, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_proxy_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="open_related_ns($arg1, (struct ns_common* (*)(struct ns_common*))$arg2)")
    public static int open_related_ns(Ptr<NsDefinitions.ns_common> ns, Ptr<?> get_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_kcore(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)open_last_lookups($arg1, $arg2, (const struct open_flags*)$arg3))")
    public static String open_last_lookups(Ptr<runtime.nameidata> nd, Ptr<runtime.file> file2, Ptr<open_flags> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_port(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="open_exec((const u8*)$arg1)")
    public static Ptr<runtime.file> open_exec(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_for_data(Ptr<CdromDefinitions.cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="open_softirq($arg1, (void (*)())$arg2)")
    public static void open_softirq(int nr, Ptr<?> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_vmcore(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int open_wait(Ptr<@OriginalName(value="Sg_device") SgDefinitions.sg_device> sdp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct open_flags")
    @NotUsableInJava
    public static class open_flags
    extends Struct {
        public int open_flag;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public int acc_mode;
        public int intent;
        public int lookup_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct open_how")
    @NotUsableInJava
    public static class open_how
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned long mode;
        public @Unsigned long resolve;
    }
}

