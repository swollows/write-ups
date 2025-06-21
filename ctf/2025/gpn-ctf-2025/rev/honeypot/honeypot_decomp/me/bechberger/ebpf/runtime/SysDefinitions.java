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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.OldDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SysDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ____sys_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg_sys, Ptr<UserDefinitions.user_msghdr> msg, Ptr<runtime.sockaddr> uaddr, @Unsigned int flags, int nosec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ____sys_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg_sys, @Unsigned int flags, Ptr<misc.used_address> used_address2, @Unsigned int allowed_msghdr_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ___sys_recvmsg(Ptr<runtime.socket> sock2, Ptr<UserDefinitions.user_msghdr> msg, Ptr<runtime.msghdr> msg_sys, @Unsigned int flags, int nosec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ___sys_sendmsg(Ptr<runtime.socket> sock2, Ptr<UserDefinitions.user_msghdr> msg, Ptr<runtime.msghdr> msg_sys, @Unsigned int flags, Ptr<misc.used_address> used_address2, @Unsigned int allowed_msghdr_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_accept4(int fd2, Ptr<runtime.sockaddr> upeer_sockaddr, Ptr<Integer> upeer_addrlen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_bind(int fd2, Ptr<runtime.sockaddr> umyaddr, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_bind_socket(Ptr<runtime.socket> sock2, Ptr<KernelDefinitions.__kernel_sockaddr_storage> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_connect(int fd2, Ptr<runtime.sockaddr> uservaddr, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_connect_file(Ptr<runtime.file> file2, Ptr<KernelDefinitions.__kernel_sockaddr_storage> address, int addrlen, int file_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_getpeername(int fd2, Ptr<runtime.sockaddr> usockaddr, Ptr<Integer> usockaddr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_getsockname(int fd2, Ptr<runtime.sockaddr> usockaddr, Ptr<Integer> usockaddr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_getsockopt(int fd2, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_listen(int fd2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_listen_socket(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_recvfrom(int fd2, Ptr<?> ubuf, @Unsigned long size, @Unsigned int flags, Ptr<runtime.sockaddr> addr2, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_recvmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, Ptr<KernelDefinitions.__kernel_timespec> timeout, Ptr<OldDefinitions.old_timespec32> timeout32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_recvmsg(int fd2, Ptr<UserDefinitions.user_msghdr> msg, @Unsigned int flags, boolean forbid_cmsg_compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_recvmsg_sock(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, Ptr<UserDefinitions.user_msghdr> umsg, Ptr<runtime.sockaddr> uaddr, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_sendmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, boolean forbid_cmsg_compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_sendmsg(int fd2, Ptr<UserDefinitions.user_msghdr> msg, @Unsigned int flags, boolean forbid_cmsg_compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_sendmsg_sock(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_sendto(int fd2, Ptr<?> buff, @Unsigned long len, @Unsigned int flags, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setfsgid(@Unsigned @OriginalName(value="gid_t") int gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setfsuid(@Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setgid(@Unsigned @OriginalName(value="gid_t") int gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setregid(@Unsigned @OriginalName(value="gid_t") int rgid, @Unsigned @OriginalName(value="gid_t") int egid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setresgid(@Unsigned @OriginalName(value="gid_t") int rgid, @Unsigned @OriginalName(value="gid_t") int egid, @Unsigned @OriginalName(value="gid_t") int sgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setresuid(@Unsigned @OriginalName(value="uid_t") int ruid, @Unsigned @OriginalName(value="uid_t") int euid, @Unsigned @OriginalName(value="uid_t") int suid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setreuid(@Unsigned @OriginalName(value="uid_t") int ruid, @Unsigned @OriginalName(value="uid_t") int euid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_setsockopt(int fd2, int level, int optname, String user_optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __sys_setuid(@Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_shutdown(int fd2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_shutdown_sock(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_socket(int family, int type2, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> __sys_socket_file(int family, int type2, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_socketpair(int family, int type2, int protocol, Ptr<Integer> usockvec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sys_fillrect($arg1, (const struct fb_fillrect*)$arg2)")
    public static void sys_fillrect(Ptr<FbDefinitions.fb_info> p, Ptr<FbDefinitions.fb_fillrect> rect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sys_ni_syscall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sys_copyarea($arg1, (const struct fb_copyarea*)$arg2)")
    public static void sys_copyarea(Ptr<FbDefinitions.fb_info> p, Ptr<FbDefinitions.fb_copyarea> area) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sys_off_notify(Ptr<misc.notifier_block> nb, @Unsigned long mode, Ptr<?> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sys_size_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sys_dmi_field_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sys_dmi_modalias_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sys_imageblit($arg1, (const struct fb_image*)$arg2)")
    public static void sys_imageblit(Ptr<FbDefinitions.fb_info> p, Ptr<FbDefinitions.fb_image> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sys_bpf(BpfDefinitions.bpf_cmd cmd, @OriginalName(value="bpfptr_t") misc.sockptr_t uattr, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sys_off_handler")
    @NotUsableInJava
    public static class sys_off_handler
    extends Struct {
        public misc.notifier_block nb;
        public Ptr<?> sys_off_cb;
        public Ptr<?> cb_data;
        public sys_off_mode mode;
        public boolean blocking;
        public Ptr<?> list;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct sys_off_data")
    @NotUsableInJava
    public static class sys_off_data
    extends Struct {
        public int mode;
        public Ptr<?> cb_data;
        public String cmd;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="enum sys_off_mode")
    public static enum sys_off_mode implements Enum<sys_off_mode>,
    TypedEnum<sys_off_mode, Integer>
    {
        SYS_OFF_MODE_POWER_OFF_PREPARE,
        SYS_OFF_MODE_POWER_OFF,
        SYS_OFF_MODE_RESTART_PREPARE,
        SYS_OFF_MODE_RESTART;

    }

    @Type(noCCodeGeneration=true, cType="struct sys_desc_table")
    @NotUsableInJava
    public static class sys_desc_table
    extends Struct {
        public @Unsigned short length;
        public char @Size(value=14) [] table;
    }
}

