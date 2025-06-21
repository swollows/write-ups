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
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NotifyDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SeccompDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__seccomp_filter($arg1, (const struct seccomp_data*)$arg2, (const _Bool)$arg3)")
    public static int __seccomp_filter(int this_syscall, Ptr<seccomp_data> sd, boolean recheck_after_trace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __seccomp_filter_orphan(Ptr<seccomp_filter> orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seccomp_actions_logged_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int seccomp_actions_logged_handler(Ptr<misc.ctl_table> ro_table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long seccomp_attach_filter(@Unsigned int flags, Ptr<seccomp_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seccomp_check_filter(Ptr<SockDefinitions.sock_filter> filter, @Unsigned int flen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seccomp_filter_release(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long seccomp_get_filter(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long filter_off, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long seccomp_get_metadata(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long seccomp_notify_addfd(Ptr<seccomp_filter> filter, Ptr<seccomp_notif_addfd> uaddfd, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seccomp_notify_detach(Ptr<seccomp_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long seccomp_notify_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int seccomp_notify_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> poll_tab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long seccomp_notify_recv(Ptr<seccomp_filter> filter, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seccomp_notify_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seccomp_set_mode_filter($arg1, (const u8*)$arg2)")
    public static long seccomp_set_mode_filter(@Unsigned int flags, String filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seccomp_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct notification")
    @NotUsableInJava
    public static class notification
    extends Struct {
        public AtomicDefinitions.atomic_t requests;
        public @Unsigned int flags;
        public @Unsigned long next_id;
        public ListDefinitions.list_head notifications;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_log_name")
    @NotUsableInJava
    public static class seccomp_log_name
    extends Struct {
        public @Unsigned int log;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_kaddfd")
    @NotUsableInJava
    public static class seccomp_kaddfd
    extends Struct {
        public Ptr<runtime.file> file;
        public int fd;
        public @Unsigned int flags;
        public @Unsigned int ioctl_flags;
        @InlineUnion(value=90458)
        public @InlineUnion(value=90458) boolean setfd;
        @InlineUnion(value=90458)
        public @InlineUnion(value=90458) int ret;
        public runtime.completion completion;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_knotif")
    @NotUsableInJava
    public static class seccomp_knotif
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public @Unsigned long id;
        public Ptr<seccomp_data> data;
        public NotifyDefinitions.notify_state state;
        public int error;
        public long val;
        public @Unsigned int flags;
        public runtime.completion ready;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head addfd;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_notif_addfd")
    @NotUsableInJava
    public static class seccomp_notif_addfd
    extends Struct {
        public @Unsigned long id;
        public @Unsigned int flags;
        public @Unsigned int srcfd;
        public @Unsigned int newfd;
        public @Unsigned int newfd_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_notif_resp")
    @NotUsableInJava
    public static class seccomp_notif_resp
    extends Struct {
        public @Unsigned long id;
        public long val;
        public int error;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_notif")
    @NotUsableInJava
    public static class seccomp_notif
    extends Struct {
        public @Unsigned long id;
        public @Unsigned int pid;
        public @Unsigned int flags;
        public seccomp_data data;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_notif_sizes")
    @NotUsableInJava
    public static class seccomp_notif_sizes
    extends Struct {
        public @Unsigned short seccomp_notif;
        public @Unsigned short seccomp_notif_resp;
        public @Unsigned short seccomp_data;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_metadata")
    @NotUsableInJava
    public static class seccomp_metadata
    extends Struct {
        public @Unsigned long filter_off;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_filter")
    @NotUsableInJava
    public static class seccomp_filter
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public @OriginalName(value="refcount_t") misc.refcount_struct users;
        public boolean log;
        public boolean wait_killable_recv;
        public ActionDefinitions.action_cache cache;
        public Ptr<seccomp_filter> prev;
        public Ptr<BpfDefinitions.bpf_prog> prog;
        public Ptr<notification> notif;
        public runtime.mutex notify_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wqh;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int nr; long long unsigned int args[6]; unsigned int ret_data; }")
    @NotUsableInJava
    public static class seccomp_of_anon_member_of_ptrace_syscall_info
    extends Struct {
        public @Unsigned long nr;
        public @Unsigned long @Size(value=6) [] args;
        public @Unsigned int ret_data;
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp_data")
    @NotUsableInJava
    public static class seccomp_data
    extends Struct {
        public int nr;
        public @Unsigned int arch;
        public @Unsigned long instruction_pointer;
        public @Unsigned long @Size(value=6) [] args;
    }
}

