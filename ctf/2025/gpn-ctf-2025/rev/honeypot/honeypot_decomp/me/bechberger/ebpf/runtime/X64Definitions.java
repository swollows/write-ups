/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class X64Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_accept((const struct pt_regs*)$arg1)")
    public static long __x64_sys_accept(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_accept4((const struct pt_regs*)$arg1)")
    public static long __x64_sys_accept4(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_access((const struct pt_regs*)$arg1)")
    public static long __x64_sys_access(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_acct((const struct pt_regs*)$arg1)")
    public static long __x64_sys_acct(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_add_key((const struct pt_regs*)$arg1)")
    public static long __x64_sys_add_key(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_adjtimex((const struct pt_regs*)$arg1)")
    public static long __x64_sys_adjtimex(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_adjtimex_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_adjtimex_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_alarm((const struct pt_regs*)$arg1)")
    public static long __x64_sys_alarm(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_bind((const struct pt_regs*)$arg1)")
    public static long __x64_sys_bind(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_bpf((const struct pt_regs*)$arg1)")
    public static long __x64_sys_bpf(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_cachestat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_cachestat(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_capget((const struct pt_regs*)$arg1)")
    public static long __x64_sys_capget(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_capset((const struct pt_regs*)$arg1)")
    public static long __x64_sys_capset(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_chdir((const struct pt_regs*)$arg1)")
    public static long __x64_sys_chdir(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_chmod((const struct pt_regs*)$arg1)")
    public static long __x64_sys_chmod(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_chown((const struct pt_regs*)$arg1)")
    public static long __x64_sys_chown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_chown16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_chown16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_chroot((const struct pt_regs*)$arg1)")
    public static long __x64_sys_chroot(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_adjtime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_adjtime(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_adjtime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_adjtime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_getres_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_getres_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_gettime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_gettime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_nanosleep_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_nanosleep_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_settime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_settime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_close((const struct pt_regs*)$arg1)")
    public static long __x64_sys_close(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_close_range((const struct pt_regs*)$arg1)")
    public static long __x64_sys_close_range(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_connect((const struct pt_regs*)$arg1)")
    public static long __x64_sys_connect(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_copy_file_range((const struct pt_regs*)$arg1)")
    public static long __x64_sys_copy_file_range(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_creat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_creat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_delete_module((const struct pt_regs*)$arg1)")
    public static long __x64_sys_delete_module(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_epoll_create((const struct pt_regs*)$arg1)")
    public static long __x64_sys_epoll_create(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_epoll_create1((const struct pt_regs*)$arg1)")
    public static long __x64_sys_epoll_create1(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_epoll_ctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_epoll_ctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_epoll_pwait((const struct pt_regs*)$arg1)")
    public static long __x64_sys_epoll_pwait(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_epoll_pwait2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_epoll_pwait2(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_epoll_wait((const struct pt_regs*)$arg1)")
    public static long __x64_sys_epoll_wait(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_eventfd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_eventfd(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_eventfd2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_eventfd2(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_execveat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_execveat(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_faccessat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_faccessat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_faccessat2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_faccessat2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fadvise64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fadvise64(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fadvise64_64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fadvise64_64(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fallocate((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fallocate(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fanotify_init((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fanotify_init(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fanotify_mark((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fanotify_mark(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchdir((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchdir(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchmod((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchmod(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchmodat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchmodat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchmodat2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchmodat2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchown((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchown16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchown16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fchownat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fchownat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fcntl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fcntl(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_finit_module((const struct pt_regs*)$arg1)")
    public static long __x64_sys_finit_module(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_flock((const struct pt_regs*)$arg1)")
    public static long __x64_sys_flock(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fsmount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fsmount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fstat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fstat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ftruncate((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ftruncate(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futex((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futex(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futex_requeue((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futex_requeue(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futex_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futex_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futex_wait((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futex_wait(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futex_waitv((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futex_waitv(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futex_wake((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futex_wake(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futimesat_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futimesat_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_get_mempolicy((const struct pt_regs*)$arg1)")
    public static long __x64_sys_get_mempolicy(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_get_robust_list((const struct pt_regs*)$arg1)")
    public static long __x64_sys_get_robust_list(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getcpu((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getcpu(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getcwd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getcwd(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getegid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getegid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_geteuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_geteuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getgid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getgid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getgroups((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getgroups(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getgroups16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getgroups16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_gethostname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_gethostname(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getitimer((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getitimer(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getpeername((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getpeername(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getpgid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getpgid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getpriority((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getpriority(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getrandom((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getrandom(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getresgid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getresgid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getresgid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getresgid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getresuid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getresuid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getresuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getresuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getrlimit((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getrlimit(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getrusage((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getrusage(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getsid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getsid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getsockname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getsockname(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getsockopt((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getsockopt(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_gettimeofday((const struct pt_regs*)$arg1)")
    public static long __x64_sys_gettimeofday(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_fadvise64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_fadvise64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_fadvise64_64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_fadvise64_64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_fallocate((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_fallocate(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_ftruncate64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_ftruncate64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_pread64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_pread64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_pwrite64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_pwrite64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_readahead((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_readahead(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_sync_file_range((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_sync_file_range(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ia32_truncate64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ia32_truncate64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_init_module((const struct pt_regs*)$arg1)")
    public static long __x64_sys_init_module(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_inotify_add_watch((const struct pt_regs*)$arg1)")
    public static long __x64_sys_inotify_add_watch(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_inotify_init((const struct pt_regs*)$arg1)")
    public static long __x64_sys_inotify_init(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_inotify_init1((const struct pt_regs*)$arg1)")
    public static long __x64_sys_inotify_init1(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_inotify_rm_watch((const struct pt_regs*)$arg1)")
    public static long __x64_sys_inotify_rm_watch(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_cancel((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_cancel(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_destroy((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_destroy(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_getevents((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_getevents(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_getevents_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_getevents_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_pgetevents((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_pgetevents(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_pgetevents_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_pgetevents_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_setup((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_setup(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_submit((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_submit(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_uring_enter((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_uring_enter(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_uring_register((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_uring_register(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_io_uring_setup((const struct pt_regs*)$arg1)")
    public static long __x64_sys_io_uring_setup(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ioprio_get((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ioprio_get(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ioprio_set((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ioprio_set(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ipc((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ipc(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_kcmp((const struct pt_regs*)$arg1)")
    public static long __x64_sys_kcmp(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_kexec_file_load((const struct pt_regs*)$arg1)")
    public static long __x64_sys_kexec_file_load(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_kexec_load((const struct pt_regs*)$arg1)")
    public static long __x64_sys_kexec_load(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_keyctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_keyctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_landlock_add_rule((const struct pt_regs*)$arg1)")
    public static long __x64_sys_landlock_add_rule(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_landlock_create_ruleset((const struct pt_regs*)$arg1)")
    public static long __x64_sys_landlock_create_ruleset(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_landlock_restrict_self((const struct pt_regs*)$arg1)")
    public static long __x64_sys_landlock_restrict_self(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lchown((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lchown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lchown16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lchown16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_listen((const struct pt_regs*)$arg1)")
    public static long __x64_sys_listen(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_listmount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_listmount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lsm_get_self_attr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lsm_get_self_attr(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lsm_list_modules((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lsm_list_modules(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lsm_set_self_attr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lsm_set_self_attr(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lstat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lstat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_madvise((const struct pt_regs*)$arg1)")
    public static long __x64_sys_madvise(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_map_shadow_stack((const struct pt_regs*)$arg1)")
    public static long __x64_sys_map_shadow_stack(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mbind((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mbind(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_membarrier((const struct pt_regs*)$arg1)")
    public static long __x64_sys_membarrier(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_memfd_create((const struct pt_regs*)$arg1)")
    public static long __x64_sys_memfd_create(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_memfd_secret((const struct pt_regs*)$arg1)")
    public static long __x64_sys_memfd_secret(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_migrate_pages((const struct pt_regs*)$arg1)")
    public static long __x64_sys_migrate_pages(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mincore((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mincore(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mlock((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mlock(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mlock2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mlock2(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mlockall((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mlockall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_modify_ldt((const struct pt_regs*)$arg1)")
    public static long __x64_sys_modify_ldt(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mount_setattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mount_setattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_move_mount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_move_mount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_move_pages((const struct pt_regs*)$arg1)")
    public static long __x64_sys_move_pages(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mprotect((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mprotect(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_getsetattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_getsetattr(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_notify((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_notify(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_open((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_open(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_timedreceive((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_timedreceive(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_timedreceive_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_timedreceive_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_timedsend((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_timedsend(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_timedsend_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_timedsend_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mq_unlink((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mq_unlink(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mremap((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mremap(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mseal((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mseal(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_msgctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_msgctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_msgget((const struct pt_regs*)$arg1)")
    public static long __x64_sys_msgget(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_msgrcv((const struct pt_regs*)$arg1)")
    public static long __x64_sys_msgrcv(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_msgsnd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_msgsnd(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_msync((const struct pt_regs*)$arg1)")
    public static long __x64_sys_msync(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_munlock((const struct pt_regs*)$arg1)")
    public static long __x64_sys_munlock(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_munlockall((const struct pt_regs*)$arg1)")
    public static long __x64_sys_munlockall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_name_to_handle_at((const struct pt_regs*)$arg1)")
    public static long __x64_sys_name_to_handle_at(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_nanosleep_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_nanosleep_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_newfstat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_newfstat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_newfstatat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_newfstatat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_newlstat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_newlstat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_newstat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_newstat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_newuname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_newuname(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_old_getrlimit((const struct pt_regs*)$arg1)")
    public static long __x64_sys_old_getrlimit(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_old_msgctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_old_msgctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_old_semctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_old_semctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_old_shmctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_old_shmctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_oldumount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_oldumount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_olduname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_olduname(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_open((const struct pt_regs*)$arg1)")
    public static long __x64_sys_open(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_open_by_handle_at((const struct pt_regs*)$arg1)")
    public static long __x64_sys_open_by_handle_at(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_open_tree((const struct pt_regs*)$arg1)")
    public static long __x64_sys_open_tree(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_openat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_openat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_openat2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_openat2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pciconfig_iobase((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pciconfig_iobase(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pciconfig_read((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pciconfig_read(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pciconfig_write((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pciconfig_write(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_perf_event_open((const struct pt_regs*)$arg1)")
    public static long __x64_sys_perf_event_open(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pivot_root((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pivot_root(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pkey_alloc((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pkey_alloc(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pkey_free((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pkey_free(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pkey_mprotect((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pkey_mprotect(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_poll((const struct pt_regs*)$arg1)")
    public static long __x64_sys_poll(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ppoll((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ppoll(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ppoll_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ppoll_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_prctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_prctl(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_prlimit64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_prlimit64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_process_madvise((const struct pt_regs*)$arg1)")
    public static long __x64_sys_process_madvise(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_process_mrelease((const struct pt_regs*)$arg1)")
    public static long __x64_sys_process_mrelease(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_process_vm_readv((const struct pt_regs*)$arg1)")
    public static long __x64_sys_process_vm_readv(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_process_vm_writev((const struct pt_regs*)$arg1)")
    public static long __x64_sys_process_vm_writev(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pselect6((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pselect6(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pselect6_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pselect6_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_quotactl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_quotactl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_quotactl_fd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_quotactl_fd(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_readlink((const struct pt_regs*)$arg1)")
    public static long __x64_sys_readlink(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_readlinkat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_readlinkat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_recv((const struct pt_regs*)$arg1)")
    public static long __x64_sys_recv(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_recvfrom((const struct pt_regs*)$arg1)")
    public static long __x64_sys_recvfrom(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_recvmmsg((const struct pt_regs*)$arg1)")
    public static long __x64_sys_recvmmsg(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_recvmmsg_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_recvmmsg_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_recvmsg((const struct pt_regs*)$arg1)")
    public static long __x64_sys_recvmsg(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_remap_file_pages((const struct pt_regs*)$arg1)")
    public static long __x64_sys_remap_file_pages(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_request_key((const struct pt_regs*)$arg1)")
    public static long __x64_sys_request_key(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rseq((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rseq(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigtimedwait_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigtimedwait_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rtas((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rtas(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_s390_ipc((const struct pt_regs*)$arg1)")
    public static long __x64_sys_s390_ipc(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_s390_pci_mmio_read((const struct pt_regs*)$arg1)")
    public static long __x64_sys_s390_pci_mmio_read(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_s390_pci_mmio_write((const struct pt_regs*)$arg1)")
    public static long __x64_sys_s390_pci_mmio_write(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_rr_get_interval_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_rr_get_interval_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_seccomp((const struct pt_regs*)$arg1)")
    public static long __x64_sys_seccomp(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_select((const struct pt_regs*)$arg1)")
    public static long __x64_sys_select(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_semctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_semctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_semget((const struct pt_regs*)$arg1)")
    public static long __x64_sys_semget(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_semop((const struct pt_regs*)$arg1)")
    public static long __x64_sys_semop(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_semtimedop((const struct pt_regs*)$arg1)")
    public static long __x64_sys_semtimedop(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_semtimedop_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_semtimedop_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_send((const struct pt_regs*)$arg1)")
    public static long __x64_sys_send(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sendmmsg((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sendmmsg(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sendmsg((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sendmsg(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sendto((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sendto(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_set_mempolicy((const struct pt_regs*)$arg1)")
    public static long __x64_sys_set_mempolicy(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_set_mempolicy_home_node((const struct pt_regs*)$arg1)")
    public static long __x64_sys_set_mempolicy_home_node(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_set_robust_list((const struct pt_regs*)$arg1)")
    public static long __x64_sys_set_robust_list(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setdomainname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setdomainname(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setfsgid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setfsgid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setfsgid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setfsgid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setfsuid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setfsuid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setfsuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setfsuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setgid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setgid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setgid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setgid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setgroups((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setgroups(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setgroups16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setgroups16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sethostname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sethostname(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setitimer((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setitimer(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setns((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setns(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setpgid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setpgid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setpriority((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setpriority(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setregid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setregid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setregid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setregid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setresgid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setresgid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setresgid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setresgid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setresuid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setresuid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setresuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setresuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setreuid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setreuid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setreuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setreuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setrlimit((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setrlimit(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setsockopt((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setsockopt(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_settimeofday((const struct pt_regs*)$arg1)")
    public static long __x64_sys_settimeofday(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setuid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setuid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setuid16((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sgetmask((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sgetmask(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_shmat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_shmat(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_shmctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_shmctl(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_shmdt((const struct pt_regs*)$arg1)")
    public static long __x64_sys_shmdt(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_shmget((const struct pt_regs*)$arg1)")
    public static long __x64_sys_shmget(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_shutdown((const struct pt_regs*)$arg1)")
    public static long __x64_sys_shutdown(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_signalfd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_signalfd(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_signalfd4((const struct pt_regs*)$arg1)")
    public static long __x64_sys_signalfd4(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_socket((const struct pt_regs*)$arg1)")
    public static long __x64_sys_socket(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_socketcall((const struct pt_regs*)$arg1)")
    public static long __x64_sys_socketcall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_socketpair((const struct pt_regs*)$arg1)")
    public static long __x64_sys_socketpair(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_splice((const struct pt_regs*)$arg1)")
    public static long __x64_sys_splice(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_spu_create((const struct pt_regs*)$arg1)")
    public static long __x64_sys_spu_create(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_spu_run((const struct pt_regs*)$arg1)")
    public static long __x64_sys_spu_run(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ssetmask((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ssetmask(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_stat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_stat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_statmount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_statmount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_statx((const struct pt_regs*)$arg1)")
    public static long __x64_sys_statx(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_stime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_stime(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_stime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_stime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_subpage_prot((const struct pt_regs*)$arg1)")
    public static long __x64_sys_subpage_prot(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_swapoff((const struct pt_regs*)$arg1)")
    public static long __x64_sys_swapoff(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_swapon((const struct pt_regs*)$arg1)")
    public static long __x64_sys_swapon(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sysfs((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sysfs(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sysinfo((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sysinfo(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_syslog((const struct pt_regs*)$arg1)")
    public static long __x64_sys_syslog(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_tee((const struct pt_regs*)$arg1)")
    public static long __x64_sys_tee(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_time((const struct pt_regs*)$arg1)")
    public static long __x64_sys_time(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_create((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_create(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_delete((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_delete(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_getoverrun((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_getoverrun(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_gettime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_gettime(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_gettime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_gettime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_settime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_settime(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timer_settime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timer_settime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timerfd_create((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timerfd_create(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timerfd_gettime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timerfd_gettime(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timerfd_gettime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timerfd_gettime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timerfd_settime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timerfd_settime(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_timerfd_settime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_timerfd_settime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_times((const struct pt_regs*)$arg1)")
    public static long __x64_sys_times(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_truncate((const struct pt_regs*)$arg1)")
    public static long __x64_sys_truncate(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_umask((const struct pt_regs*)$arg1)")
    public static long __x64_sys_umask(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_umount((const struct pt_regs*)$arg1)")
    public static long __x64_sys_umount(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_uname((const struct pt_regs*)$arg1)")
    public static long __x64_sys_uname(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_uretprobe((const struct pt_regs*)$arg1)")
    public static long __x64_sys_uretprobe(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_uselib((const struct pt_regs*)$arg1)")
    public static long __x64_sys_uselib(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_userfaultfd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_userfaultfd(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_utime32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_utime32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_utimensat_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_utimensat_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_utimes_time32((const struct pt_regs*)$arg1)")
    public static long __x64_sys_utimes_time32(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_vm86((const struct pt_regs*)$arg1)")
    public static long __x64_sys_vm86(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_vm86old((const struct pt_regs*)$arg1)")
    public static long __x64_sys_vm86old(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_vmsplice((const struct pt_regs*)$arg1)")
    public static long __x64_sys_vmsplice(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x64_setup_rt_frame(Ptr<runtime.ksignal> ksig, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_arch_prctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_arch_prctl(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clone((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clone(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clone3((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clone3(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_futimesat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_futimesat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_get_thread_area((const struct pt_regs*)$arg1)")
    public static long __x64_sys_get_thread_area(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_kill((const struct pt_regs*)$arg1)")
    public static long __x64_sys_kill(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_link((const struct pt_regs*)$arg1)")
    public static long __x64_sys_link(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_linkat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_linkat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mkdir((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mkdir(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mkdirat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mkdirat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mknod((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mknod(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mknodat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mknodat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pidfd_send_signal((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pidfd_send_signal(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_readahead((const struct pt_regs*)$arg1)")
    public static long __x64_sys_readahead(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_reboot((const struct pt_regs*)$arg1)")
    public static long __x64_sys_reboot(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rename((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rename(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_renameat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_renameat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_renameat2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_renameat2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rmdir((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rmdir(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigaction((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigaction(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigpending((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigpending(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigprocmask((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigprocmask(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigqueueinfo((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigqueueinfo(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigsuspend((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigsuspend(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_sigtimedwait((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_sigtimedwait(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_rt_tgsigqueueinfo((const struct pt_regs*)$arg1)")
    public static long __x64_sys_rt_tgsigqueueinfo(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_set_thread_area((const struct pt_regs*)$arg1)")
    public static long __x64_sys_set_thread_area(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_set_tid_address((const struct pt_regs*)$arg1)")
    public static long __x64_sys_set_tid_address(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sigaltstack((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sigaltstack(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_signal((const struct pt_regs*)$arg1)")
    public static long __x64_sys_signal(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sigpending((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sigpending(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sigprocmask((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sigprocmask(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sigsuspend((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sigsuspend(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_symlink((const struct pt_regs*)$arg1)")
    public static long __x64_sys_symlink(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_symlinkat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_symlinkat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_tgkill((const struct pt_regs*)$arg1)")
    public static long __x64_sys_tgkill(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_tkill((const struct pt_regs*)$arg1)")
    public static long __x64_sys_tkill(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_unlink((const struct pt_regs*)$arg1)")
    public static long __x64_sys_unlink(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_unlinkat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_unlinkat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_unshare((const struct pt_regs*)$arg1)")
    public static long __x64_sys_unshare(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_utime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_utime(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_utimensat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_utimensat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_utimes((const struct pt_regs*)$arg1)")
    public static long __x64_sys_utimes(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_brk((const struct pt_regs*)$arg1)")
    public static long __x64_sys_brk(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_dup((const struct pt_regs*)$arg1)")
    public static long __x64_sys_dup(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_dup2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_dup2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_dup3((const struct pt_regs*)$arg1)")
    public static long __x64_sys_dup3(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_execve((const struct pt_regs*)$arg1)")
    public static long __x64_sys_execve(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_exit((const struct pt_regs*)$arg1)")
    public static long __x64_sys_exit(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_exit_group((const struct pt_regs*)$arg1)")
    public static long __x64_sys_exit_group(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getdents((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getdents(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getdents64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getdents64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_llseek((const struct pt_regs*)$arg1)")
    public static long __x64_sys_llseek(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lseek((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lseek(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mmap_pgoff((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mmap_pgoff(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_munmap((const struct pt_regs*)$arg1)")
    public static long __x64_sys_munmap(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_nanosleep((const struct pt_regs*)$arg1)")
    public static long __x64_sys_nanosleep(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_old_readdir((const struct pt_regs*)$arg1)")
    public static long __x64_sys_old_readdir(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_personality((const struct pt_regs*)$arg1)")
    public static long __x64_sys_personality(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pidfd_getfd((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pidfd_getfd(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pidfd_open((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pidfd_open(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pread64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pread64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_preadv((const struct pt_regs*)$arg1)")
    public static long __x64_sys_preadv(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_preadv2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_preadv2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ptrace((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ptrace(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pwrite64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pwrite64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pwritev((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pwritev(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pwritev2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pwritev2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_read((const struct pt_regs*)$arg1)")
    public static long __x64_sys_read(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_readv((const struct pt_regs*)$arg1)")
    public static long __x64_sys_readv(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sendfile((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sendfile(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sendfile64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sendfile64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_wait4((const struct pt_regs*)$arg1)")
    public static long __x64_sys_wait4(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_waitid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_waitid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_waitpid((const struct pt_regs*)$arg1)")
    public static long __x64_sys_waitpid(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_write((const struct pt_regs*)$arg1)")
    public static long __x64_sys_write(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_writev((const struct pt_regs*)$arg1)")
    public static long __x64_sys_writev(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_getres((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_getres(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_gettime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_gettime(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_nanosleep((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_nanosleep(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_clock_settime((const struct pt_regs*)$arg1)")
    public static long __x64_sys_clock_settime(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fdatasync((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fdatasync(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fgetxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fgetxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_flistxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_flistxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fremovexattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fremovexattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fsconfig((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fsconfig(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fsetxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fsetxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fsopen((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fsopen(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fspick((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fspick(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fstatfs((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fstatfs(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fstatfs64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fstatfs64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_fsync((const struct pt_regs*)$arg1)")
    public static long __x64_sys_fsync(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_getxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_getxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ioctl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ioctl(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ioperm((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ioperm(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_iopl((const struct pt_regs*)$arg1)")
    public static long __x64_sys_iopl(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lgetxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lgetxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_listxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_listxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_llistxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_llistxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lremovexattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lremovexattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_lsetxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_lsetxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_mmap((const struct pt_regs*)$arg1)")
    public static long __x64_sys_mmap(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_nice((const struct pt_regs*)$arg1)")
    public static long __x64_sys_nice(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pipe((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pipe(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_pipe2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_pipe2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_removexattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_removexattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_get_priority_max((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_get_priority_max(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_get_priority_min((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_get_priority_min(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_getaffinity((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_getaffinity(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_getattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_getattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_getparam((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_getparam(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_getscheduler((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_getscheduler(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_rr_get_interval((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_rr_get_interval(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_setaffinity((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_setaffinity(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_setattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_setattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_setparam((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_setparam(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sched_setscheduler((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sched_setscheduler(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_setxattr((const struct pt_regs*)$arg1)")
    public static long __x64_sys_setxattr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_statfs((const struct pt_regs*)$arg1)")
    public static long __x64_sys_statfs(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_statfs64((const struct pt_regs*)$arg1)")
    public static long __x64_sys_statfs64(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sync_file_range((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sync_file_range(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_sync_file_range2((const struct pt_regs*)$arg1)")
    public static long __x64_sys_sync_file_range2(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_syncfs((const struct pt_regs*)$arg1)")
    public static long __x64_sys_syncfs(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__x64_sys_ustat((const struct pt_regs*)$arg1)")
    public static long __x64_sys_ustat(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x64_sys_call((const struct pt_regs*)$arg1, $arg2)")
    public static long x64_sys_call(Ptr<PtDefinitions.pt_regs> regs, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct x64_jit_data")
    @NotUsableInJava
    public static class x64_jit_data
    extends Struct {
        public Ptr<BpfDefinitions.bpf_binary_header> rw_header;
        public Ptr<BpfDefinitions.bpf_binary_header> header;
        public Ptr<Integer> addrs;
        public Ptr<Character> image;
        public int proglen;
        public misc.jit_context ctx;
    }
}

