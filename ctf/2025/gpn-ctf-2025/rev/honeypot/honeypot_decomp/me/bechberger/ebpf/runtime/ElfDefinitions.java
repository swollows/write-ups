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
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ElfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elf_core_dump(Ptr<misc.coredump_params> cprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elf_validity_cache_copy(Ptr<LoadDefinitions.load_info> info2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elf_coredump_extra_notes_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int elf_coredump_extra_notes_write(Ptr<misc.coredump_params> cprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="elf_strtbl_add((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned int elf_strtbl_add(String name, Ptr<?> ehdr, char _class2, Ptr<@Unsigned Long> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct elf_note_info")
    @NotUsableInJava
    public static class elf_note_info
    extends Struct {
        public Ptr<elf_thread_core_info> thread;
        public runtime.memelfnote psinfo;
        public runtime.memelfnote signote;
        public runtime.memelfnote auxv;
        public runtime.memelfnote files;
        public  @OriginalName(value="siginfo_t") runtime.siginfo csigdata;
        public @Unsigned long size;
        public int thread_notes;
    }

    @Type(noCCodeGeneration=true, cType="struct elf_thread_core_info")
    @NotUsableInJava
    public static class elf_thread_core_info
    extends Struct {
        public Ptr<elf_thread_core_info> next;
        public Ptr<TaskDefinitions.task_struct> task;
        public elf_prstatus prstatus;
        public runtime.memelfnote @Size(value=0) [] notes;
    }

    @Type(noCCodeGeneration=true, cType="struct elf_prpsinfo")
    @NotUsableInJava
    public static class elf_prpsinfo
    extends Struct {
        public char pr_state;
        public char pr_sname;
        public char pr_zomb;
        public char pr_nice;
        public @Unsigned long pr_flag;
        public @Unsigned @OriginalName(value="__kernel_uid_t") int pr_uid;
        public @Unsigned @OriginalName(value="__kernel_gid_t") int pr_gid;
        public @OriginalName(value="pid_t") int pr_pid;
        public @OriginalName(value="pid_t") int pr_ppid;
        public @OriginalName(value="pid_t") int pr_pgrp;
        public @OriginalName(value="pid_t") int pr_sid;
        public char @Size(value=16) [] pr_fname;
        public char @Size(value=80) [] pr_psargs;
    }

    @Type(noCCodeGeneration=true, cType="struct elf_prstatus")
    @NotUsableInJava
    public static class elf_prstatus
    extends Struct {
        public elf_prstatus_common common;
        public @Unsigned @OriginalName(value="elf_greg_t") long @Size(value=27) @OriginalName(value="elf_gregset_t") [] pr_reg;
        public int pr_fpvalid;
    }

    @Type(noCCodeGeneration=true, cType="struct elf_prstatus_common")
    @NotUsableInJava
    public static class elf_prstatus_common
    extends Struct {
        public elf_siginfo pr_info;
        public short pr_cursig;
        public @Unsigned long pr_sigpend;
        public @Unsigned long pr_sighold;
        public @OriginalName(value="pid_t") int pr_pid;
        public @OriginalName(value="pid_t") int pr_ppid;
        public @OriginalName(value="pid_t") int pr_pgrp;
        public @OriginalName(value="pid_t") int pr_sid;
        public KernelDefinitions.__kernel_old_timeval pr_utime;
        public KernelDefinitions.__kernel_old_timeval pr_stime;
        public KernelDefinitions.__kernel_old_timeval pr_cutime;
        public KernelDefinitions.__kernel_old_timeval pr_cstime;
    }

    @Type(noCCodeGeneration=true, cType="struct elf_siginfo")
    @NotUsableInJava
    public static class elf_siginfo
    extends Struct {
        public int si_signo;
        public int si_code;
        public int si_errno;
    }
}

