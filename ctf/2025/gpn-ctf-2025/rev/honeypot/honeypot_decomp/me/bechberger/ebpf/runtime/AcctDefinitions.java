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
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AcctDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acct_update_integrals(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long utime, @Unsigned long stime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_account_cputime(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_clear_integrals(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_update_integrals(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acct_reclaim_writeback(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<runtime.folio> folio2, int nr_throttled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_collect(long exitcode, int group_dead) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_exit_ns(Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acct_on(Ptr<runtime.filename> pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_pin_kill(Ptr<FsDefinitions.fs_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acct_process() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct acct_v3")
    @NotUsableInJava
    public static class acct_v3
    extends Struct {
        public char ac_flag;
        public char ac_version;
        public @Unsigned short ac_tty;
        public @Unsigned int ac_exitcode;
        public @Unsigned int ac_uid;
        public @Unsigned int ac_gid;
        public @Unsigned int ac_pid;
        public @Unsigned int ac_ppid;
        public @Unsigned int ac_btime;
        public @Unsigned int ac_etime;
        public @Unsigned @OriginalName(value="comp_t") short ac_utime;
        public @Unsigned @OriginalName(value="comp_t") short ac_stime;
        public @Unsigned @OriginalName(value="comp_t") short ac_mem;
        public @Unsigned @OriginalName(value="comp_t") short ac_io;
        public @Unsigned @OriginalName(value="comp_t") short ac_rw;
        public @Unsigned @OriginalName(value="comp_t") short ac_minflt;
        public @Unsigned @OriginalName(value="comp_t") short ac_majflt;
        public @Unsigned @OriginalName(value="comp_t") short ac_swaps;
        public char @Size(value=16) [] ac_comm;
    }
}

