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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KsysDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_fallocate(int fd2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_fchown(@Unsigned int fd2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_msgctl(int msqid, int cmd, Ptr<misc.msqid_ds> buf, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_msgget(@OriginalName(value="key_t") int key2, int msgflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_msgrcv(int msqid, Ptr<msgbuf> msgp, @Unsigned long msgsz, long msgtyp, int msgflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_msgsnd(int msqid, Ptr<msgbuf> msgp, @Unsigned long msgsz, int msgflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_setsid() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ksys_readahead(int fd2, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_semctl(int semid, int semnum, int cmd, @Unsigned long arg2, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_semget(@OriginalName(value="key_t") int key2, int nsems, int semflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ksys_semtimedop($arg1, $arg2, $arg3, (const struct __kernel_timespec*)$arg4)")
    public static long ksys_semtimedop(int semid, Ptr<runtime.sembuf> tsops, @Unsigned int nsops, Ptr<KernelDefinitions.__kernel_timespec> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ksys_sync_helper() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_unshare(@Unsigned long unshare_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_dup3(@Unsigned int oldfd, @Unsigned int newfd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_fadvise64_64(int fd2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int advice) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="off_t") long ksys_lseek(@Unsigned int fd2, @OriginalName(value="off_t") long offset, @Unsigned int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ksys_mmap_pgoff(@Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flags, @Unsigned long fd2, @Unsigned long pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ksys_pread64(@Unsigned int fd2, String buf, @Unsigned long count, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ksys_pwrite64($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ksys_pwrite64(@Unsigned int fd2, String buf, @Unsigned long count, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ksys_read(@Unsigned int fd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_shmctl(int shmid, int cmd, Ptr<misc.shmid_ds> buf, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_shmdt(String shmaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_shmget(@OriginalName(value="key_t") int key2, @Unsigned long size, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ksys_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long ksys_write(@Unsigned int fd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksys_ioperm(@Unsigned long from, @Unsigned long num, int turn_on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ksys_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksys_sync_file_range(int fd2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long nbytes, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct msgbuf")
    @NotUsableInJava
    public static class msgbuf
    extends Struct {
        public @OriginalName(value="__kernel_long_t") long mtype;
        public char @Size(value=1) [] mtext;
    }
}

