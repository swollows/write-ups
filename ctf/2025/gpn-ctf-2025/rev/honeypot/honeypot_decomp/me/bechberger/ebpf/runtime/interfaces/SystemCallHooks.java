/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime.interfaces;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.BPFInterface;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.runtime.DoDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KexecDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MqDefinitions;
import me.bechberger.ebpf.runtime.OldDefinitions;
import me.bechberger.ebpf.runtime.OpenDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

@BPFInterface
public interface SystemCallHooks {
    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* file, struct proto_accept_arg* arg, struct sockaddr* upeer_sockaddr, int* upeer_addrlen, int flags)", lastStatement="return 0;", section="fentry/do_accept", autoAttach=true)
    default public void enterAccept(Ptr<runtime.file> file2, Ptr<ProtoDefinitions.proto_accept_arg> arg2, Ptr<runtime.sockaddr> upeer_sockaddr, Ptr<Integer> upeer_addrlen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* file, struct proto_accept_arg* arg, struct sockaddr* upeer_sockaddr, int* upeer_addrlen, int flags, struct file* ret)", lastStatement="return 0;", section="fexit/do_accept", autoAttach=true)
    default public void exitAccept(Ptr<runtime.file> file2, Ptr<ProtoDefinitions.proto_accept_arg> arg2, Ptr<runtime.sockaddr> upeer_sockaddr, Ptr<Integer> upeer_addrlen, int flags, Ptr<runtime.file> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct file* file, struct proto_accept_arg* arg, struct sockaddr* upeer_sockaddr, int* upeer_addrlen, int flags)", lastStatement="return 0;", section="kprobe/do_accept", autoAttach=true)
    default public void kprobeEnterAccept(Ptr<runtime.file> file2, Ptr<ProtoDefinitions.proto_accept_arg> arg2, Ptr<runtime.sockaddr> upeer_sockaddr, Ptr<Integer> upeer_addrlen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct file* file, struct proto_accept_arg* arg, struct sockaddr* upeer_sockaddr, int* upeer_addrlen, int flags, struct file* ret)", lastStatement="return 0;", section="kretprobe/do_accept", autoAttach=true)
    default public void kprobeExitAccept(Ptr<runtime.file> file2, Ptr<ProtoDefinitions.proto_accept_arg> arg2, Ptr<runtime.sockaddr> upeer_sockaddr, Ptr<Integer> upeer_addrlen, int flags, Ptr<runtime.file> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* _type, const u8* _description, const void* _payload, long unsigned int plen, int ringid)", lastStatement="return 0;", section="fentry/__do_sys_add_key", autoAttach=true)
    default public void enterAddKey(String _type, String _description, Ptr<?> _payload, @Unsigned long plen, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* _type, const u8* _description, const void* _payload, long unsigned int plen, int ringid, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_add_key", autoAttach=true)
    default public void exitAddKey(String _type, String _description, Ptr<?> _payload, @Unsigned long plen, @OriginalName(value="key_serial_t") int ringid, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* _type, const u8* _description, const void* _payload, long unsigned int plen, int ringid)", lastStatement="return 0;", section="kprobe/__do_sys_add_key", autoAttach=true)
    default public void kprobeEnterAddKey(String _type, String _description, Ptr<?> _payload, @Unsigned long plen, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* _type, const u8* _description, const void* _payload, long unsigned int plen, int ringid, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_add_key", autoAttach=true)
    default public void kprobeExitAddKey(String _type, String _description, Ptr<?> _payload, @Unsigned long plen, @OriginalName(value="key_serial_t") int ringid, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct __kernel_timex* txc)", lastStatement="return 0;", section="fentry/do_adjtimex", autoAttach=true)
    default public void enterAdjtimex(Ptr<KernelDefinitions.__kernel_timex> txc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct __kernel_timex* txc, int ret)", lastStatement="return 0;", section="fexit/do_adjtimex", autoAttach=true)
    default public void exitAdjtimex(Ptr<KernelDefinitions.__kernel_timex> txc, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct __kernel_timex* txc)", lastStatement="return 0;", section="kprobe/do_adjtimex", autoAttach=true)
    default public void kprobeEnterAdjtimex(Ptr<KernelDefinitions.__kernel_timex> txc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct __kernel_timex* txc, int ret)", lastStatement="return 0;", section="kretprobe/do_adjtimex", autoAttach=true)
    default public void kprobeExitAdjtimex(Ptr<KernelDefinitions.__kernel_timex> txc, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int brk)", lastStatement="return 0;", section="fentry/__do_sys_brk", autoAttach=true)
    default public void enterBrk(@Unsigned long brk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int brk, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_brk", autoAttach=true)
    default public void exitBrk(@Unsigned long brk2, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int brk)", lastStatement="return 0;", section="kprobe/__do_sys_brk", autoAttach=true)
    default public void kprobeEnterBrk(@Unsigned long brk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int brk, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_brk", autoAttach=true)
    default public void kprobeExitBrk(@Unsigned long brk2, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct __user_cap_header_struct* header, struct __user_cap_data_struct* dataptr)", lastStatement="return 0;", section="fentry/__do_sys_capget", autoAttach=true)
    default public void enterCapget(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> dataptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct __user_cap_header_struct* header, struct __user_cap_data_struct* dataptr, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_capget", autoAttach=true)
    default public void exitCapget(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> dataptr, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct __user_cap_header_struct* header, struct __user_cap_data_struct* dataptr)", lastStatement="return 0;", section="kprobe/__do_sys_capget", autoAttach=true)
    default public void kprobeEnterCapget(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> dataptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct __user_cap_header_struct* header, struct __user_cap_data_struct* dataptr, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_capget", autoAttach=true)
    default public void kprobeExitCapget(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> dataptr, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct __user_cap_header_struct* header, const struct __user_cap_data_struct* data)", lastStatement="return 0;", section="fentry/__do_sys_capset", autoAttach=true)
    default public void enterCapset(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct __user_cap_header_struct* header, const struct __user_cap_data_struct* data, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_capset", autoAttach=true)
    default public void exitCapset(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> data, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct __user_cap_header_struct* header, const struct __user_cap_data_struct* data)", lastStatement="return 0;", section="kprobe/__do_sys_capset", autoAttach=true)
    default public void kprobeEnterCapset(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct __user_cap_header_struct* header, const struct __user_cap_data_struct* data, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_capset", autoAttach=true)
    default public void kprobeExitCapset(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> data, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const int which_clock, struct __kernel_timex* ktx)", lastStatement="return 0;", section="fentry/do_clock_adjtime", autoAttach=true)
    default public void enterClockAdjtime(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> ktx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const int which_clock, struct __kernel_timex* ktx, int ret)", lastStatement="return 0;", section="fexit/do_clock_adjtime", autoAttach=true)
    default public void exitClockAdjtime(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> ktx, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const int which_clock, struct __kernel_timex* ktx)", lastStatement="return 0;", section="kprobe/do_clock_adjtime", autoAttach=true)
    default public void kprobeEnterClockAdjtime(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> ktx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const int which_clock, struct __kernel_timex* ktx, int ret)", lastStatement="return 0;", section="kretprobe/do_clock_adjtime", autoAttach=true)
    default public void kprobeExitClockAdjtime(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> ktx, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int clone_flags, long unsigned int newsp, int* parent_tidptr, int* child_tidptr, long unsigned int tls)", lastStatement="return 0;", section="fentry/__do_sys_clone", autoAttach=true)
    default public void enterClone(@Unsigned long clone_flags, @Unsigned long newsp, Ptr<Integer> parent_tidptr, Ptr<Integer> child_tidptr, @Unsigned long tls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int clone_flags, long unsigned int newsp, int* parent_tidptr, int* child_tidptr, long unsigned int tls, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_clone", autoAttach=true)
    default public void exitClone(@Unsigned long clone_flags, @Unsigned long newsp, Ptr<Integer> parent_tidptr, Ptr<Integer> child_tidptr, @Unsigned long tls, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int clone_flags, long unsigned int newsp, int* parent_tidptr, int* child_tidptr, long unsigned int tls)", lastStatement="return 0;", section="kprobe/__do_sys_clone", autoAttach=true)
    default public void kprobeEnterClone(@Unsigned long clone_flags, @Unsigned long newsp, Ptr<Integer> parent_tidptr, Ptr<Integer> child_tidptr, @Unsigned long tls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int clone_flags, long unsigned int newsp, int* parent_tidptr, int* child_tidptr, long unsigned int tls, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_clone", autoAttach=true)
    default public void kprobeExitClone(@Unsigned long clone_flags, @Unsigned long newsp, Ptr<Integer> parent_tidptr, Ptr<Integer> child_tidptr, @Unsigned long tls, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct clone_args* uargs, long unsigned int size)", lastStatement="return 0;", section="fentry/__do_sys_clone3", autoAttach=true)
    default public void enterClone3(Ptr<misc.clone_args> uargs, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct clone_args* uargs, long unsigned int size, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_clone3", autoAttach=true)
    default public void exitClone3(Ptr<misc.clone_args> uargs, @Unsigned long size, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct clone_args* uargs, long unsigned int size)", lastStatement="return 0;", section="kprobe/__do_sys_clone3", autoAttach=true)
    default public void kprobeEnterClone3(Ptr<misc.clone_args> uargs, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct clone_args* uargs, long unsigned int size, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_clone3", autoAttach=true)
    default public void kprobeExitClone3(Ptr<misc.clone_args> uargs, @Unsigned long size, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd_in, long long int* off_in, int fd_out, long long int* off_out, long unsigned int len, unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_copy_file_range", autoAttach=true)
    default public void enterCopyFileRange(int fd_in, Ptr<@OriginalName(value="loff_t") Long> off_in, int fd_out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd_in, long long int* off_in, int fd_out, long long int* off_out, long unsigned int len, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_copy_file_range", autoAttach=true)
    default public void exitCopyFileRange(int fd_in, Ptr<@OriginalName(value="loff_t") Long> off_in, int fd_out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int fd_in, long long int* off_in, int fd_out, long long int* off_out, long unsigned int len, unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_copy_file_range", autoAttach=true)
    default public void kprobeEnterCopyFileRange(int fd_in, Ptr<@OriginalName(value="loff_t") Long> off_in, int fd_out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int fd_in, long long int* off_in, int fd_out, long long int* off_out, long unsigned int len, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_copy_file_range", autoAttach=true)
    default public void kprobeExitCopyFileRange(int fd_in, Ptr<@OriginalName(value="loff_t") Long> off_in, int fd_out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* name_user, unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_delete_module", autoAttach=true)
    default public void enterDeleteModule(String name_user, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* name_user, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_delete_module", autoAttach=true)
    default public void exitDeleteModule(String name_user, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* name_user, unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_delete_module", autoAttach=true)
    default public void kprobeEnterDeleteModule(String name_user, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* name_user, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_delete_module", autoAttach=true)
    default public void kprobeExitDeleteModule(String name_user, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct files_struct* files, struct file* file, unsigned int fd, unsigned int flags)", lastStatement="return 0;", section="fentry/do_dup2", autoAttach=true)
    default public void enterDup2(Ptr<misc.files_struct> files, Ptr<runtime.file> file2, @Unsigned int fd2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct files_struct* files, struct file* file, unsigned int fd, unsigned int flags, int ret)", lastStatement="return 0;", section="fexit/do_dup2", autoAttach=true)
    default public void exitDup2(Ptr<misc.files_struct> files, Ptr<runtime.file> file2, @Unsigned int fd2, @Unsigned int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct files_struct* files, struct file* file, unsigned int fd, unsigned int flags)", lastStatement="return 0;", section="kprobe/do_dup2", autoAttach=true)
    default public void kprobeEnterDup2(Ptr<misc.files_struct> files, Ptr<runtime.file> file2, @Unsigned int fd2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct files_struct* files, struct file* file, unsigned int fd, unsigned int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_dup2", autoAttach=true)
    default public void kprobeExitDup2(Ptr<misc.files_struct> files, Ptr<runtime.file> file2, @Unsigned int fd2, @Unsigned int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int flags)", lastStatement="return 0;", section="fentry/do_epoll_create", autoAttach=true)
    default public void enterEpollCreate(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int flags, int ret)", lastStatement="return 0;", section="fexit/do_epoll_create", autoAttach=true)
    default public void exitEpollCreate(int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int flags)", lastStatement="return 0;", section="kprobe/do_epoll_create", autoAttach=true)
    default public void kprobeEnterEpollCreate(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_epoll_create", autoAttach=true)
    default public void kprobeExitEpollCreate(int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int epfd, int op, int fd, struct epoll_event* epds, _Bool nonblock)", lastStatement="return 0;", section="fentry/do_epoll_ctl", autoAttach=true)
    default public void enterEpollCtl(int epfd, int op, int fd2, Ptr<misc.epoll_event> epds, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int epfd, int op, int fd, struct epoll_event* epds, _Bool nonblock, int ret)", lastStatement="return 0;", section="fexit/do_epoll_ctl", autoAttach=true)
    default public void exitEpollCtl(int epfd, int op, int fd2, Ptr<misc.epoll_event> epds, boolean nonblock, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int epfd, int op, int fd, struct epoll_event* epds, _Bool nonblock)", lastStatement="return 0;", section="kprobe/do_epoll_ctl", autoAttach=true)
    default public void kprobeEnterEpollCtl(int epfd, int op, int fd2, Ptr<misc.epoll_event> epds, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int epfd, int op, int fd, struct epoll_event* epds, _Bool nonblock, int ret)", lastStatement="return 0;", section="kretprobe/do_epoll_ctl", autoAttach=true)
    default public void kprobeExitEpollCtl(int epfd, int op, int fd2, Ptr<misc.epoll_event> epds, boolean nonblock, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int epfd, struct epoll_event* events, int maxevents, struct timespec64* to)", lastStatement="return 0;", section="fentry/do_epoll_wait", autoAttach=true)
    default public void enterEpollWait(int epfd, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int epfd, struct epoll_event* events, int maxevents, struct timespec64* to, int ret)", lastStatement="return 0;", section="fexit/do_epoll_wait", autoAttach=true)
    default public void exitEpollWait(int epfd, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> to, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int epfd, struct epoll_event* events, int maxevents, struct timespec64* to)", lastStatement="return 0;", section="kprobe/do_epoll_wait", autoAttach=true)
    default public void kprobeEnterEpollWait(int epfd, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int epfd, struct epoll_event* events, int maxevents, struct timespec64* to, int ret)", lastStatement="return 0;", section="kretprobe/do_epoll_wait", autoAttach=true)
    default public void kprobeExitEpollWait(int epfd, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> to, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int count, int flags)", lastStatement="return 0;", section="fentry/do_eventfd", autoAttach=true)
    default public void enterEventfd(@Unsigned int count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int count, int flags, int ret)", lastStatement="return 0;", section="fexit/do_eventfd", autoAttach=true)
    default public void exitEventfd(@Unsigned int count, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int count, int flags)", lastStatement="return 0;", section="kprobe/do_eventfd", autoAttach=true)
    default public void kprobeEnterEventfd(@Unsigned int count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int count, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_eventfd", autoAttach=true)
    default public void kprobeExitEventfd(@Unsigned int count, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, int mode, int flags)", lastStatement="return 0;", section="fentry/do_faccessat", autoAttach=true)
    default public void enterFaccessat(int dfd, String filename2, int mode, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, int mode, int flags, long int ret)", lastStatement="return 0;", section="fexit/do_faccessat", autoAttach=true)
    default public void exitFaccessat(int dfd, String filename2, int mode, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, const u8* filename, int mode, int flags)", lastStatement="return 0;", section="kprobe/do_faccessat", autoAttach=true)
    default public void kprobeEnterFaccessat(int dfd, String filename2, int mode, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, const u8* filename, int mode, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_faccessat", autoAttach=true)
    default public void kprobeExitFaccessat(int dfd, String filename2, int mode, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int flags, unsigned int event_f_flags)", lastStatement="return 0;", section="fentry/__do_sys_fanotify_init", autoAttach=true)
    default public void enterFanotifyInit(@Unsigned int flags, @Unsigned int event_f_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int flags, unsigned int event_f_flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_fanotify_init", autoAttach=true)
    default public void exitFanotifyInit(@Unsigned int flags, @Unsigned int event_f_flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int flags, unsigned int event_f_flags)", lastStatement="return 0;", section="kprobe/__do_sys_fanotify_init", autoAttach=true)
    default public void kprobeEnterFanotifyInit(@Unsigned int flags, @Unsigned int event_f_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int flags, unsigned int event_f_flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_fanotify_init", autoAttach=true)
    default public void kprobeExitFanotifyInit(@Unsigned int flags, @Unsigned int event_f_flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fanotify_fd, unsigned int flags, long long unsigned int mask, int dfd, const u8* pathname)", lastStatement="return 0;", section="fentry/do_fanotify_mark", autoAttach=true)
    default public void enterFanotifyMark(int fanotify_fd, @Unsigned int flags, @Unsigned long mask, int dfd, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fanotify_fd, unsigned int flags, long long unsigned int mask, int dfd, const u8* pathname, int ret)", lastStatement="return 0;", section="fexit/do_fanotify_mark", autoAttach=true)
    default public void exitFanotifyMark(int fanotify_fd, @Unsigned int flags, @Unsigned long mask, int dfd, String pathname, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int fanotify_fd, unsigned int flags, long long unsigned int mask, int dfd, const u8* pathname)", lastStatement="return 0;", section="kprobe/do_fanotify_mark", autoAttach=true)
    default public void kprobeEnterFanotifyMark(int fanotify_fd, @Unsigned int flags, @Unsigned long mask, int dfd, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int fanotify_fd, unsigned int flags, long long unsigned int mask, int dfd, const u8* pathname, int ret)", lastStatement="return 0;", section="kretprobe/do_fanotify_mark", autoAttach=true)
    default public void kprobeExitFanotifyMark(int fanotify_fd, @Unsigned int flags, @Unsigned long mask, int dfd, String pathname, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, short unsigned int mode, unsigned int flags)", lastStatement="return 0;", section="fentry/do_fchmodat", autoAttach=true)
    default public void enterFchmodat(int dfd, String filename2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, short unsigned int mode, unsigned int flags, int ret)", lastStatement="return 0;", section="fexit/do_fchmodat", autoAttach=true)
    default public void exitFchmodat(int dfd, String filename2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, const u8* filename, short unsigned int mode, unsigned int flags)", lastStatement="return 0;", section="kprobe/do_fchmodat", autoAttach=true)
    default public void kprobeEnterFchmodat(int dfd, String filename2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, const u8* filename, short unsigned int mode, unsigned int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_fchmodat", autoAttach=true)
    default public void kprobeExitFchmodat(int dfd, String filename2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, unsigned int user, unsigned int group, int flag)", lastStatement="return 0;", section="fentry/do_fchownat", autoAttach=true)
    default public void enterFchownat(int dfd, String filename2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, unsigned int user, unsigned int group, int flag, int ret)", lastStatement="return 0;", section="fexit/do_fchownat", autoAttach=true)
    default public void exitFchownat(int dfd, String filename2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group, int flag, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, const u8* filename, unsigned int user, unsigned int group, int flag)", lastStatement="return 0;", section="kprobe/do_fchownat", autoAttach=true)
    default public void kprobeEnterFchownat(int dfd, String filename2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, const u8* filename, unsigned int user, unsigned int group, int flag, int ret)", lastStatement="return 0;", section="kretprobe/do_fchownat", autoAttach=true)
    default public void kprobeExitFchownat(int dfd, String filename2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group, int flag, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, unsigned int cmd, long unsigned int arg, struct file* filp)", lastStatement="return 0;", section="fentry/do_fcntl", autoAttach=true)
    default public void enterFcntl(int fd2, @Unsigned int cmd, @Unsigned long arg2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, unsigned int cmd, long unsigned int arg, struct file* filp, long int ret)", lastStatement="return 0;", section="fexit/do_fcntl", autoAttach=true)
    default public void exitFcntl(int fd2, @Unsigned int cmd, @Unsigned long arg2, Ptr<runtime.file> filp, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int fd, unsigned int cmd, long unsigned int arg, struct file* filp)", lastStatement="return 0;", section="kprobe/do_fcntl", autoAttach=true)
    default public void kprobeEnterFcntl(int fd2, @Unsigned int cmd, @Unsigned long arg2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int fd, unsigned int cmd, long unsigned int arg, struct file* filp, long int ret)", lastStatement="return 0;", section="kretprobe/do_fcntl", autoAttach=true)
    default public void kprobeExitFcntl(int fd2, @Unsigned int cmd, @Unsigned long arg2, Ptr<runtime.file> filp, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, unsigned int cmd)", lastStatement="return 0;", section="fentry/__do_sys_flock", autoAttach=true)
    default public void enterFlock(@Unsigned int fd2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, unsigned int cmd, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_flock", autoAttach=true)
    default public void exitFlock(@Unsigned int fd2, @Unsigned int cmd, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int fd, unsigned int cmd)", lastStatement="return 0;", section="kprobe/__do_sys_flock", autoAttach=true)
    default public void kprobeEnterFlock(@Unsigned int fd2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int fd, unsigned int cmd, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_flock", autoAttach=true)
    default public void kprobeExitFlock(@Unsigned int fd2, @Unsigned int cmd, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_fork", autoAttach=true)
    default public void enterFork(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_fork", autoAttach=true)
    default public void exitFork(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_fork", autoAttach=true)
    default public void kprobeEnterFork(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_fork", autoAttach=true)
    default public void kprobeExitFork(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, struct __old_kernel_stat* statbuf)", lastStatement="return 0;", section="fentry/__do_sys_fstat", autoAttach=true)
    default public void enterFstat(@Unsigned int fd2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, struct __old_kernel_stat* statbuf, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_fstat", autoAttach=true)
    default public void exitFstat(@Unsigned int fd2, Ptr<OldDefinitions.__old_kernel_stat> statbuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int fd, struct __old_kernel_stat* statbuf)", lastStatement="return 0;", section="kprobe/__do_sys_fstat", autoAttach=true)
    default public void kprobeEnterFstat(@Unsigned int fd2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int fd, struct __old_kernel_stat* statbuf, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_fstat", autoAttach=true)
    default public void kprobeExitFstat(@Unsigned int fd2, Ptr<OldDefinitions.__old_kernel_stat> statbuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, struct statfs* buf)", lastStatement="return 0;", section="fentry/__do_sys_fstatfs", autoAttach=true)
    default public void enterFstatfs(@Unsigned int fd2, Ptr<DoDefinitions.statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, struct statfs* buf, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_fstatfs", autoAttach=true)
    default public void exitFstatfs(@Unsigned int fd2, Ptr<DoDefinitions.statfs> buf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int fd, struct statfs* buf)", lastStatement="return 0;", section="kprobe/__do_sys_fstatfs", autoAttach=true)
    default public void kprobeEnterFstatfs(@Unsigned int fd2, Ptr<DoDefinitions.statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int fd, struct statfs* buf, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_fstatfs", autoAttach=true)
    default public void kprobeExitFstatfs(@Unsigned int fd2, Ptr<DoDefinitions.statfs> buf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, int datasync)", lastStatement="return 0;", section="fentry/do_fsync", autoAttach=true)
    default public void enterFsync(@Unsigned int fd2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, int datasync, int ret)", lastStatement="return 0;", section="fexit/do_fsync", autoAttach=true)
    default public void exitFsync(@Unsigned int fd2, int datasync, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int fd, int datasync)", lastStatement="return 0;", section="kprobe/do_fsync", autoAttach=true)
    default public void kprobeEnterFsync(@Unsigned int fd2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int fd, int datasync, int ret)", lastStatement="return 0;", section="kretprobe/do_fsync", autoAttach=true)
    default public void kprobeExitFsync(@Unsigned int fd2, int datasync, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, long long int length, int small)", lastStatement="return 0;", section="fentry/do_sys_ftruncate", autoAttach=true)
    default public void enterFtruncate(@Unsigned int fd2, @OriginalName(value="loff_t") long length, int small) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int fd, long long int length, int small, long int ret)", lastStatement="return 0;", section="fexit/do_sys_ftruncate", autoAttach=true)
    default public void exitFtruncate(@Unsigned int fd2, @OriginalName(value="loff_t") long length, int small, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int fd, long long int length, int small)", lastStatement="return 0;", section="kprobe/do_sys_ftruncate", autoAttach=true)
    default public void kprobeEnterFtruncate(@Unsigned int fd2, @OriginalName(value="loff_t") long length, int small) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int fd, long long int length, int small, long int ret)", lastStatement="return 0;", section="kretprobe/do_sys_ftruncate", autoAttach=true)
    default public void kprobeExitFtruncate(@Unsigned int fd2, @OriginalName(value="loff_t") long length, int small, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int* uaddr, int op, unsigned int val, long long int* timeout, unsigned int* uaddr2, unsigned int val2, unsigned int val3)", lastStatement="return 0;", section="fentry/do_futex", autoAttach=true)
    default public void enterFutex(Ptr<@Unsigned Integer> uaddr, int op, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> timeout, Ptr<@Unsigned Integer> uaddr2, @Unsigned int val2, @Unsigned int val3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int* uaddr, int op, unsigned int val, long long int* timeout, unsigned int* uaddr2, unsigned int val2, unsigned int val3, long int ret)", lastStatement="return 0;", section="fexit/do_futex", autoAttach=true)
    default public void exitFutex(Ptr<@Unsigned Integer> uaddr, int op, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> timeout, Ptr<@Unsigned Integer> uaddr2, @Unsigned int val2, @Unsigned int val3, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int* uaddr, int op, unsigned int val, long long int* timeout, unsigned int* uaddr2, unsigned int val2, unsigned int val3)", lastStatement="return 0;", section="kprobe/do_futex", autoAttach=true)
    default public void kprobeEnterFutex(Ptr<@Unsigned Integer> uaddr, int op, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> timeout, Ptr<@Unsigned Integer> uaddr2, @Unsigned int val2, @Unsigned int val3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int* uaddr, int op, unsigned int val, long long int* timeout, unsigned int* uaddr2, unsigned int val2, unsigned int val3, long int ret)", lastStatement="return 0;", section="kretprobe/do_futex", autoAttach=true)
    default public void kprobeExitFutex(Ptr<@Unsigned Integer> uaddr, int op, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> timeout, Ptr<@Unsigned Integer> uaddr2, @Unsigned int val2, @Unsigned int val3, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int* policy, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int addr, long unsigned int flags)", lastStatement="return 0;", section="fentry/do_get_mempolicy", autoAttach=true)
    default public void enterGetMempolicy(Ptr<Integer> policy, Ptr<misc.nodemask_t> nmask, @Unsigned long addr2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int* policy, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int addr, long unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/do_get_mempolicy", autoAttach=true)
    default public void exitGetMempolicy(Ptr<Integer> policy, Ptr<misc.nodemask_t> nmask, @Unsigned long addr2, @Unsigned long flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int* policy, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int addr, long unsigned int flags)", lastStatement="return 0;", section="kprobe/do_get_mempolicy", autoAttach=true)
    default public void kprobeEnterGetMempolicy(Ptr<Integer> policy, Ptr<misc.nodemask_t> nmask, @Unsigned long addr2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int* policy, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int addr, long unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_get_mempolicy", autoAttach=true)
    default public void kprobeExitGetMempolicy(Ptr<Integer> policy, Ptr<misc.nodemask_t> nmask, @Unsigned long addr2, @Unsigned long flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct task_struct* p, int idx, struct user_desc* u_info)", lastStatement="return 0;", section="fentry/do_get_thread_area", autoAttach=true)
    default public void enterGetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct task_struct* p, int idx, struct user_desc* u_info, int ret)", lastStatement="return 0;", section="fexit/do_get_thread_area", autoAttach=true)
    default public void exitGetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct task_struct* p, int idx, struct user_desc* u_info)", lastStatement="return 0;", section="kprobe/do_get_thread_area", autoAttach=true)
    default public void kprobeEnterGetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct task_struct* p, int idx, struct user_desc* u_info, int ret)", lastStatement="return 0;", section="kretprobe/do_get_thread_area", autoAttach=true)
    default public void kprobeExitGetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, u8* buf, long unsigned int size)", lastStatement="return 0;", section="fentry/__do_sys_getcwd", autoAttach=true)
    default public void enterGetcwd(String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, u8* buf, long unsigned int size, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getcwd", autoAttach=true)
    default public void exitGetcwd(String buf, @Unsigned long size, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, u8* buf, long unsigned int size)", lastStatement="return 0;", section="kprobe/__do_sys_getcwd", autoAttach=true)
    default public void kprobeEnterGetcwd(String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, u8* buf, long unsigned int size, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getcwd", autoAttach=true)
    default public void kprobeExitGetcwd(String buf, @Unsigned long size, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_getegid", autoAttach=true)
    default public void enterGetegid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getegid", autoAttach=true)
    default public void exitGetegid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_getegid", autoAttach=true)
    default public void kprobeEnterGetegid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getegid", autoAttach=true)
    default public void kprobeExitGetegid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_geteuid", autoAttach=true)
    default public void enterGeteuid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_geteuid", autoAttach=true)
    default public void exitGeteuid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_geteuid", autoAttach=true)
    default public void kprobeEnterGeteuid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_geteuid", autoAttach=true)
    default public void kprobeExitGeteuid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_getgid", autoAttach=true)
    default public void enterGetgid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getgid", autoAttach=true)
    default public void exitGetgid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_getgid", autoAttach=true)
    default public void kprobeEnterGetgid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getgid", autoAttach=true)
    default public void kprobeExitGetgid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, u8* name, int len)", lastStatement="return 0;", section="fentry/__do_sys_gethostname", autoAttach=true)
    default public void enterGethostname(String name, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, u8* name, int len, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_gethostname", autoAttach=true)
    default public void exitGethostname(String name, int len, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, u8* name, int len)", lastStatement="return 0;", section="kprobe/__do_sys_gethostname", autoAttach=true)
    default public void kprobeEnterGethostname(String name, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, u8* name, int len, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_gethostname", autoAttach=true)
    default public void kprobeExitGethostname(String name, int len, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid)", lastStatement="return 0;", section="fentry/do_getpgid", autoAttach=true)
    default public void enterGetpgid(@OriginalName(value="pid_t") int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int ret)", lastStatement="return 0;", section="fexit/do_getpgid", autoAttach=true)
    default public void exitGetpgid(@OriginalName(value="pid_t") int pid2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pid)", lastStatement="return 0;", section="kprobe/do_getpgid", autoAttach=true)
    default public void kprobeEnterGetpgid(@OriginalName(value="pid_t") int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pid, int ret)", lastStatement="return 0;", section="kretprobe/do_getpgid", autoAttach=true)
    default public void kprobeExitGetpgid(@OriginalName(value="pid_t") int pid2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_getpgrp", autoAttach=true)
    default public void enterGetpgrp(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getpgrp", autoAttach=true)
    default public void exitGetpgrp(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_getpgrp", autoAttach=true)
    default public void kprobeEnterGetpgrp(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getpgrp", autoAttach=true)
    default public void kprobeExitGetpgrp(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_getpid", autoAttach=true)
    default public void enterGetpid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getpid", autoAttach=true)
    default public void exitGetpid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_getpid", autoAttach=true)
    default public void kprobeEnterGetpid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getpid", autoAttach=true)
    default public void kprobeExitGetpid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_getppid", autoAttach=true)
    default public void enterGetppid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getppid", autoAttach=true)
    default public void exitGetppid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_getppid", autoAttach=true)
    default public void kprobeEnterGetppid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getppid", autoAttach=true)
    default public void kprobeExitGetppid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who)", lastStatement="return 0;", section="fentry/__do_sys_getpriority", autoAttach=true)
    default public void enterGetpriority(int which, int who) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getpriority", autoAttach=true)
    default public void exitGetpriority(int which, int who, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int which, int who)", lastStatement="return 0;", section="kprobe/__do_sys_getpriority", autoAttach=true)
    default public void kprobeEnterGetpriority(int which, int who) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int which, int who, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getpriority", autoAttach=true)
    default public void kprobeExitGetpriority(int which, int who, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int who, struct rusage* ru)", lastStatement="return 0;", section="fentry/__do_sys_getrusage", autoAttach=true)
    default public void enterGetrusage(int who, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int who, struct rusage* ru, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getrusage", autoAttach=true)
    default public void exitGetrusage(int who, Ptr<runtime.rusage> ru, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int who, struct rusage* ru)", lastStatement="return 0;", section="kprobe/__do_sys_getrusage", autoAttach=true)
    default public void kprobeEnterGetrusage(int who, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int who, struct rusage* ru, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getrusage", autoAttach=true)
    default public void kprobeExitGetrusage(int who, Ptr<runtime.rusage> ru, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_gettid", autoAttach=true)
    default public void enterGettid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_gettid", autoAttach=true)
    default public void exitGettid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_gettid", autoAttach=true)
    default public void kprobeEnterGettid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_gettid", autoAttach=true)
    default public void kprobeExitGettid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_getuid", autoAttach=true)
    default public void enterGetuid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_getuid", autoAttach=true)
    default public void exitGetuid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_getuid", autoAttach=true)
    default public void kprobeEnterGetuid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_getuid", autoAttach=true)
    default public void kprobeExitGetuid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct module* mod)", lastStatement="return 0;", section="fentry/do_init_module", autoAttach=true)
    default public void enterInitModule(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct module* mod, int ret)", lastStatement="return 0;", section="fexit/do_init_module", autoAttach=true)
    default public void exitInitModule(Ptr<runtime.module> mod, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct module* mod)", lastStatement="return 0;", section="kprobe/do_init_module", autoAttach=true)
    default public void kprobeEnterInitModule(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct module* mod, int ret)", lastStatement="return 0;", section="kretprobe/do_init_module", autoAttach=true)
    default public void kprobeExitInitModule(Ptr<runtime.module> mod, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int flags)", lastStatement="return 0;", section="fentry/do_inotify_init", autoAttach=true)
    default public void enterInotifyInit(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int flags, int ret)", lastStatement="return 0;", section="fexit/do_inotify_init", autoAttach=true)
    default public void exitInotifyInit(int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int flags)", lastStatement="return 0;", section="kprobe/do_inotify_init", autoAttach=true)
    default public void kprobeEnterInotifyInit(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_inotify_init", autoAttach=true)
    default public void kprobeExitInotifyInit(int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int ctx_id, long int min_nr, long int nr, struct io_event* events, struct timespec64* ts)", lastStatement="return 0;", section="fentry/do_io_getevents", autoAttach=true)
    default public void enterIoGetevents(@Unsigned @OriginalName(value="aio_context_t") long ctx_id, long min_nr, long nr, Ptr<IoDefinitions.io_event> events, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int ctx_id, long int min_nr, long int nr, struct io_event* events, struct timespec64* ts, long int ret)", lastStatement="return 0;", section="fexit/do_io_getevents", autoAttach=true)
    default public void exitIoGetevents(@Unsigned @OriginalName(value="aio_context_t") long ctx_id, long min_nr, long nr, Ptr<IoDefinitions.io_event> events, Ptr<runtime.timespec64> ts, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int ctx_id, long int min_nr, long int nr, struct io_event* events, struct timespec64* ts)", lastStatement="return 0;", section="kprobe/do_io_getevents", autoAttach=true)
    default public void kprobeEnterIoGetevents(@Unsigned @OriginalName(value="aio_context_t") long ctx_id, long min_nr, long nr, Ptr<IoDefinitions.io_event> events, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int ctx_id, long int min_nr, long int nr, struct io_event* events, struct timespec64* ts, long int ret)", lastStatement="return 0;", section="kretprobe/do_io_getevents", autoAttach=true)
    default public void kprobeExitIoGetevents(@Unsigned @OriginalName(value="aio_context_t") long ctx_id, long min_nr, long nr, Ptr<IoDefinitions.io_event> events, Ptr<runtime.timespec64> ts, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who)", lastStatement="return 0;", section="fentry/__do_sys_ioprio_get", autoAttach=true)
    default public void enterIoprioGet(int which, int who) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_ioprio_get", autoAttach=true)
    default public void exitIoprioGet(int which, int who, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int which, int who)", lastStatement="return 0;", section="kprobe/__do_sys_ioprio_get", autoAttach=true)
    default public void kprobeEnterIoprioGet(int which, int who) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int which, int who, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_ioprio_get", autoAttach=true)
    default public void kprobeExitIoprioGet(int which, int who, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who, int ioprio)", lastStatement="return 0;", section="fentry/__do_sys_ioprio_set", autoAttach=true)
    default public void enterIoprioSet(int which, int who, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who, int ioprio, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_ioprio_set", autoAttach=true)
    default public void exitIoprioSet(int which, int who, int ioprio, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int which, int who, int ioprio)", lastStatement="return 0;", section="kprobe/__do_sys_ioprio_set", autoAttach=true)
    default public void kprobeEnterIoprioSet(int which, int who, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int which, int who, int ioprio, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_ioprio_set", autoAttach=true)
    default public void kprobeExitIoprioSet(int which, int who, int ioprio, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid1, int pid2, int type, long unsigned int idx1, long unsigned int idx2)", lastStatement="return 0;", section="fentry/__do_sys_kcmp", autoAttach=true)
    default public void enterKcmp(@OriginalName(value="pid_t") int pid1, @OriginalName(value="pid_t") int pid2, int type2, @Unsigned long idx1, @Unsigned long idx2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid1, int pid2, int type, long unsigned int idx1, long unsigned int idx2, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_kcmp", autoAttach=true)
    default public void exitKcmp(@OriginalName(value="pid_t") int pid1, @OriginalName(value="pid_t") int pid2, int type2, @Unsigned long idx1, @Unsigned long idx2, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pid1, int pid2, int type, long unsigned int idx1, long unsigned int idx2)", lastStatement="return 0;", section="kprobe/__do_sys_kcmp", autoAttach=true)
    default public void kprobeEnterKcmp(@OriginalName(value="pid_t") int pid1, @OriginalName(value="pid_t") int pid2, int type2, @Unsigned long idx1, @Unsigned long idx2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pid1, int pid2, int type, long unsigned int idx1, long unsigned int idx2, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_kcmp", autoAttach=true)
    default public void kprobeExitKcmp(@OriginalName(value="pid_t") int pid1, @OriginalName(value="pid_t") int pid2, int type2, @Unsigned long idx1, @Unsigned long idx2, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int kernel_fd, int initrd_fd, long unsigned int cmdline_len, const u8* cmdline_ptr, long unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_kexec_file_load", autoAttach=true)
    default public void enterKexecFileLoad(int kernel_fd, int initrd_fd, @Unsigned long cmdline_len, String cmdline_ptr, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int kernel_fd, int initrd_fd, long unsigned int cmdline_len, const u8* cmdline_ptr, long unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_kexec_file_load", autoAttach=true)
    default public void exitKexecFileLoad(int kernel_fd, int initrd_fd, @Unsigned long cmdline_len, String cmdline_ptr, @Unsigned long flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int kernel_fd, int initrd_fd, long unsigned int cmdline_len, const u8* cmdline_ptr, long unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_kexec_file_load", autoAttach=true)
    default public void kprobeEnterKexecFileLoad(int kernel_fd, int initrd_fd, @Unsigned long cmdline_len, String cmdline_ptr, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int kernel_fd, int initrd_fd, long unsigned int cmdline_len, const u8* cmdline_ptr, long unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_kexec_file_load", autoAttach=true)
    default public void kprobeExitKexecFileLoad(int kernel_fd, int initrd_fd, @Unsigned long cmdline_len, String cmdline_ptr, @Unsigned long flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int entry, long unsigned int nr_segments, struct kexec_segment* segments, long unsigned int flags)", lastStatement="return 0;", section="fentry/do_kexec_load", autoAttach=true)
    default public void enterKexecLoad(@Unsigned long entry, @Unsigned long nr_segments, Ptr<KexecDefinitions.kexec_segment> segments, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int entry, long unsigned int nr_segments, struct kexec_segment* segments, long unsigned int flags, int ret)", lastStatement="return 0;", section="fexit/do_kexec_load", autoAttach=true)
    default public void exitKexecLoad(@Unsigned long entry, @Unsigned long nr_segments, Ptr<KexecDefinitions.kexec_segment> segments, @Unsigned long flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int entry, long unsigned int nr_segments, struct kexec_segment* segments, long unsigned int flags)", lastStatement="return 0;", section="kprobe/do_kexec_load", autoAttach=true)
    default public void kprobeEnterKexecLoad(@Unsigned long entry, @Unsigned long nr_segments, Ptr<KexecDefinitions.kexec_segment> segments, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int entry, long unsigned int nr_segments, struct kexec_segment* segments, long unsigned int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_kexec_load", autoAttach=true)
    default public void kprobeExitKexecLoad(@Unsigned long entry, @Unsigned long nr_segments, Ptr<KexecDefinitions.kexec_segment> segments, @Unsigned long flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int option, long unsigned int arg2, long unsigned int arg3, long unsigned int arg4, long unsigned int arg5)", lastStatement="return 0;", section="fentry/__do_sys_keyctl", autoAttach=true)
    default public void enterKeyctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int option, long unsigned int arg2, long unsigned int arg3, long unsigned int arg4, long unsigned int arg5, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_keyctl", autoAttach=true)
    default public void exitKeyctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int option, long unsigned int arg2, long unsigned int arg3, long unsigned int arg4, long unsigned int arg5)", lastStatement="return 0;", section="kprobe/__do_sys_keyctl", autoAttach=true)
    default public void kprobeEnterKeyctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int option, long unsigned int arg2, long unsigned int arg3, long unsigned int arg4, long unsigned int arg5, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_keyctl", autoAttach=true)
    default public void kprobeExitKeyctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const const struct landlock_ruleset_attr* attr, const long unsigned int size, const unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_landlock_create_ruleset", autoAttach=true)
    default public void enterLandlockCreateRuleset(Ptr<LandlockDefinitions.landlock_ruleset_attr> attr2, @Unsigned long size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const const struct landlock_ruleset_attr* attr, const long unsigned int size, const unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_landlock_create_ruleset", autoAttach=true)
    default public void exitLandlockCreateRuleset(Ptr<LandlockDefinitions.landlock_ruleset_attr> attr2, @Unsigned long size, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const const struct landlock_ruleset_attr* attr, const long unsigned int size, const unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_landlock_create_ruleset", autoAttach=true)
    default public void kprobeEnterLandlockCreateRuleset(Ptr<LandlockDefinitions.landlock_ruleset_attr> attr2, @Unsigned long size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const const struct landlock_ruleset_attr* attr, const long unsigned int size, const unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_landlock_create_ruleset", autoAttach=true)
    default public void kprobeExitLandlockCreateRuleset(Ptr<LandlockDefinitions.landlock_ruleset_attr> attr2, @Unsigned long size, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int olddfd, struct filename* old, int newdfd, struct filename* new, int flags)", lastStatement="return 0;", section="fentry/do_linkat", autoAttach=true)
    default public void enterLinkat(int olddfd, Ptr<runtime.filename> old, int newdfd, Ptr<runtime.filename> _new, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int olddfd, struct filename* old, int newdfd, struct filename* new, int flags, int ret)", lastStatement="return 0;", section="fexit/do_linkat", autoAttach=true)
    default public void exitLinkat(int olddfd, Ptr<runtime.filename> old, int newdfd, Ptr<runtime.filename> _new, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int olddfd, struct filename* old, int newdfd, struct filename* new, int flags)", lastStatement="return 0;", section="kprobe/do_linkat", autoAttach=true)
    default public void kprobeEnterLinkat(int olddfd, Ptr<runtime.filename> old, int newdfd, Ptr<runtime.filename> _new, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int olddfd, struct filename* old, int newdfd, struct filename* new, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_linkat", autoAttach=true)
    default public void kprobeExitLinkat(int olddfd, Ptr<runtime.filename> old, int newdfd, Ptr<runtime.filename> _new, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* filename, struct __old_kernel_stat* statbuf)", lastStatement="return 0;", section="fentry/__do_sys_lstat", autoAttach=true)
    default public void enterLstat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* filename, struct __old_kernel_stat* statbuf, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_lstat", autoAttach=true)
    default public void exitLstat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* filename, struct __old_kernel_stat* statbuf)", lastStatement="return 0;", section="kprobe/__do_sys_lstat", autoAttach=true)
    default public void kprobeEnterLstat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* filename, struct __old_kernel_stat* statbuf, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_lstat", autoAttach=true)
    default public void kprobeExitLstat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mm_struct* mm, long unsigned int start, long unsigned int len_in, int behavior)", lastStatement="return 0;", section="fentry/do_madvise", autoAttach=true)
    default public void enterMadvise(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len_in, int behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mm_struct* mm, long unsigned int start, long unsigned int len_in, int behavior, int ret)", lastStatement="return 0;", section="fexit/do_madvise", autoAttach=true)
    default public void exitMadvise(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len_in, int behavior2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct mm_struct* mm, long unsigned int start, long unsigned int len_in, int behavior)", lastStatement="return 0;", section="kprobe/do_madvise", autoAttach=true)
    default public void kprobeEnterMadvise(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len_in, int behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct mm_struct* mm, long unsigned int start, long unsigned int len_in, int behavior, int ret)", lastStatement="return 0;", section="kretprobe/do_madvise", autoAttach=true)
    default public void kprobeExitMadvise(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len_in, int behavior2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int start, long unsigned int len, short unsigned int mode, short unsigned int mode_flags, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int flags)", lastStatement="return 0;", section="fentry/do_mbind", autoAttach=true)
    default public void enterMbind(@Unsigned long start, @Unsigned long len, @Unsigned short mode, @Unsigned short mode_flags, Ptr<misc.nodemask_t> nmask, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int start, long unsigned int len, short unsigned int mode, short unsigned int mode_flags, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/do_mbind", autoAttach=true)
    default public void exitMbind(@Unsigned long start, @Unsigned long len, @Unsigned short mode, @Unsigned short mode_flags, Ptr<misc.nodemask_t> nmask, @Unsigned long flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int start, long unsigned int len, short unsigned int mode, short unsigned int mode_flags, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int flags)", lastStatement="return 0;", section="kprobe/do_mbind", autoAttach=true)
    default public void kprobeEnterMbind(@Unsigned long start, @Unsigned long len, @Unsigned short mode, @Unsigned short mode_flags, Ptr<misc.nodemask_t> nmask, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int start, long unsigned int len, short unsigned int mode, short unsigned int mode_flags, struct {\n  long unsigned int bits[16];\n}* nmask, long unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_mbind", autoAttach=true)
    default public void kprobeExitMbind(@Unsigned long start, @Unsigned long len, @Unsigned short mode, @Unsigned short mode_flags, Ptr<misc.nodemask_t> nmask, @Unsigned long flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* uname, unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_memfd_create", autoAttach=true)
    default public void enterMemfdCreate(String uname, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* uname, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_memfd_create", autoAttach=true)
    default public void exitMemfdCreate(String uname, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* uname, unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_memfd_create", autoAttach=true)
    default public void kprobeEnterMemfdCreate(String uname, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* uname, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_memfd_create", autoAttach=true)
    default public void kprobeExitMemfdCreate(String uname, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mm_struct* mm, const struct {\n  long unsigned int bits[16];\n}* from, const struct {\n  long unsigned int bits[16];\n}* to, int flags)", lastStatement="return 0;", section="fentry/do_migrate_pages", autoAttach=true)
    default public void enterMigratePages(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.nodemask_t> from, Ptr<misc.nodemask_t> to, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mm_struct* mm, const struct {\n  long unsigned int bits[16];\n}* from, const struct {\n  long unsigned int bits[16];\n}* to, int flags, int ret)", lastStatement="return 0;", section="fexit/do_migrate_pages", autoAttach=true)
    default public void exitMigratePages(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.nodemask_t> from, Ptr<misc.nodemask_t> to, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct mm_struct* mm, const struct {\n  long unsigned int bits[16];\n}* from, const struct {\n  long unsigned int bits[16];\n}* to, int flags)", lastStatement="return 0;", section="kprobe/do_migrate_pages", autoAttach=true)
    default public void kprobeEnterMigratePages(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.nodemask_t> from, Ptr<misc.nodemask_t> to, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct mm_struct* mm, const struct {\n  long unsigned int bits[16];\n}* from, const struct {\n  long unsigned int bits[16];\n}* to, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_migrate_pages", autoAttach=true)
    default public void kprobeExitMigratePages(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.nodemask_t> from, Ptr<misc.nodemask_t> to, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int addr, long unsigned int pages, u8* vec)", lastStatement="return 0;", section="fentry/do_mincore", autoAttach=true)
    default public void enterMincore(@Unsigned long addr2, @Unsigned long pages, String vec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int addr, long unsigned int pages, u8* vec, long int ret)", lastStatement="return 0;", section="fexit/do_mincore", autoAttach=true)
    default public void exitMincore(@Unsigned long addr2, @Unsigned long pages, String vec, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int addr, long unsigned int pages, u8* vec)", lastStatement="return 0;", section="kprobe/do_mincore", autoAttach=true)
    default public void kprobeEnterMincore(@Unsigned long addr2, @Unsigned long pages, String vec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int addr, long unsigned int pages, u8* vec, long int ret)", lastStatement="return 0;", section="kretprobe/do_mincore", autoAttach=true)
    default public void kprobeExitMincore(@Unsigned long addr2, @Unsigned long pages, String vec, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name, short unsigned int mode)", lastStatement="return 0;", section="fentry/do_mkdirat", autoAttach=true)
    default public void enterMkdirat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name, short unsigned int mode, int ret)", lastStatement="return 0;", section="fexit/do_mkdirat", autoAttach=true)
    default public void exitMkdirat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, struct filename* name, short unsigned int mode)", lastStatement="return 0;", section="kprobe/do_mkdirat", autoAttach=true)
    default public void kprobeEnterMkdirat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, struct filename* name, short unsigned int mode, int ret)", lastStatement="return 0;", section="kretprobe/do_mkdirat", autoAttach=true)
    default public void kprobeExitMkdirat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name, short unsigned int mode, unsigned int dev)", lastStatement="return 0;", section="fentry/do_mknodat", autoAttach=true)
    default public void enterMknodat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name, short unsigned int mode, unsigned int dev, int ret)", lastStatement="return 0;", section="fexit/do_mknodat", autoAttach=true)
    default public void exitMknodat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, struct filename* name, short unsigned int mode, unsigned int dev)", lastStatement="return 0;", section="kprobe/do_mknodat", autoAttach=true)
    default public void kprobeEnterMknodat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, struct filename* name, short unsigned int mode, unsigned int dev, int ret)", lastStatement="return 0;", section="kretprobe/do_mknodat", autoAttach=true)
    default public void kprobeExitMknodat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int start, long unsigned int len, long unsigned int flags)", lastStatement="return 0;", section="fentry/do_mlock", autoAttach=true)
    default public void enterMlock(@Unsigned long start, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int start, long unsigned int len, long unsigned int flags, int ret)", lastStatement="return 0;", section="fexit/do_mlock", autoAttach=true)
    default public void exitMlock(@Unsigned long start, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int start, long unsigned int len, long unsigned int flags)", lastStatement="return 0;", section="kprobe/do_mlock", autoAttach=true)
    default public void kprobeEnterMlock(@Unsigned long start, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int start, long unsigned int len, long unsigned int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_mlock", autoAttach=true)
    default public void kprobeExitMlock(@Unsigned long start, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int flags)", lastStatement="return 0;", section="fentry/__do_sys_mlockall", autoAttach=true)
    default public void enterMlockall(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_mlockall", autoAttach=true)
    default public void exitMlockall(int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int flags)", lastStatement="return 0;", section="kprobe/__do_sys_mlockall", autoAttach=true)
    default public void kprobeEnterMlockall(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_mlockall", autoAttach=true)
    default public void kprobeExitMlockall(int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* file, long unsigned int addr, long unsigned int len, long unsigned int prot, long unsigned int flags, long unsigned int vm_flags, long unsigned int pgoff, long unsigned int* populate, struct list_head* uf)", lastStatement="return 0;", section="fentry/do_mmap", autoAttach=true)
    default public void enterMmap(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<@Unsigned Long> populate, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* file, long unsigned int addr, long unsigned int len, long unsigned int prot, long unsigned int flags, long unsigned int vm_flags, long unsigned int pgoff, long unsigned int* populate, struct list_head* uf, long unsigned int ret)", lastStatement="return 0;", section="fexit/do_mmap", autoAttach=true)
    default public void exitMmap(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<@Unsigned Long> populate, Ptr<ListDefinitions.list_head> uf, @Unsigned long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct file* file, long unsigned int addr, long unsigned int len, long unsigned int prot, long unsigned int flags, long unsigned int vm_flags, long unsigned int pgoff, long unsigned int* populate, struct list_head* uf)", lastStatement="return 0;", section="kprobe/do_mmap", autoAttach=true)
    default public void kprobeEnterMmap(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<@Unsigned Long> populate, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct file* file, long unsigned int addr, long unsigned int len, long unsigned int prot, long unsigned int flags, long unsigned int vm_flags, long unsigned int pgoff, long unsigned int* populate, struct list_head* uf, long unsigned int ret)", lastStatement="return 0;", section="kretprobe/do_mmap", autoAttach=true)
    default public void kprobeExitMmap(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<@Unsigned Long> populate, Ptr<ListDefinitions.list_head> uf, @Unsigned long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* dev_name, const u8* dir_name, const u8* type_page, long unsigned int flags, void* data_page)", lastStatement="return 0;", section="fentry/do_mount", autoAttach=true)
    default public void enterMount(String dev_name, String dir_name, String type_page, @Unsigned long flags, Ptr<?> data_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* dev_name, const u8* dir_name, const u8* type_page, long unsigned int flags, void* data_page, long int ret)", lastStatement="return 0;", section="fexit/do_mount", autoAttach=true)
    default public void exitMount(String dev_name, String dir_name, String type_page, @Unsigned long flags, Ptr<?> data_page, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* dev_name, const u8* dir_name, const u8* type_page, long unsigned int flags, void* data_page)", lastStatement="return 0;", section="kprobe/do_mount", autoAttach=true)
    default public void kprobeEnterMount(String dev_name, String dir_name, String type_page, @Unsigned long flags, Ptr<?> data_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* dev_name, const u8* dir_name, const u8* type_page, long unsigned int flags, void* data_page, long int ret)", lastStatement="return 0;", section="kretprobe/do_mount", autoAttach=true)
    default public void kprobeExitMount(String dev_name, String dir_name, String type_page, @Unsigned long flags, Ptr<?> data_page, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, struct mq_attr* new, struct mq_attr* old)", lastStatement="return 0;", section="fentry/do_mq_getsetattr", autoAttach=true)
    default public void enterMqGetsetattr(int mqdes, Ptr<MqDefinitions.mq_attr> _new, Ptr<MqDefinitions.mq_attr> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, struct mq_attr* new, struct mq_attr* old, int ret)", lastStatement="return 0;", section="fexit/do_mq_getsetattr", autoAttach=true)
    default public void exitMqGetsetattr(int mqdes, Ptr<MqDefinitions.mq_attr> _new, Ptr<MqDefinitions.mq_attr> old, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int mqdes, struct mq_attr* new, struct mq_attr* old)", lastStatement="return 0;", section="kprobe/do_mq_getsetattr", autoAttach=true)
    default public void kprobeEnterMqGetsetattr(int mqdes, Ptr<MqDefinitions.mq_attr> _new, Ptr<MqDefinitions.mq_attr> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int mqdes, struct mq_attr* new, struct mq_attr* old, int ret)", lastStatement="return 0;", section="kretprobe/do_mq_getsetattr", autoAttach=true)
    default public void kprobeExitMqGetsetattr(int mqdes, Ptr<MqDefinitions.mq_attr> _new, Ptr<MqDefinitions.mq_attr> old, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, const struct sigevent* notification)", lastStatement="return 0;", section="fentry/do_mq_notify", autoAttach=true)
    default public void enterMqNotify(@OriginalName(value="mqd_t") int mqdes, Ptr<runtime.sigevent> notification2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, const struct sigevent* notification, int ret)", lastStatement="return 0;", section="fexit/do_mq_notify", autoAttach=true)
    default public void exitMqNotify(@OriginalName(value="mqd_t") int mqdes, Ptr<runtime.sigevent> notification2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int mqdes, const struct sigevent* notification)", lastStatement="return 0;", section="kprobe/do_mq_notify", autoAttach=true)
    default public void kprobeEnterMqNotify(@OriginalName(value="mqd_t") int mqdes, Ptr<runtime.sigevent> notification2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int mqdes, const struct sigevent* notification, int ret)", lastStatement="return 0;", section="kretprobe/do_mq_notify", autoAttach=true)
    default public void kprobeExitMqNotify(@OriginalName(value="mqd_t") int mqdes, Ptr<runtime.sigevent> notification2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* u_name, int oflag, short unsigned int mode, struct mq_attr* attr)", lastStatement="return 0;", section="fentry/do_mq_open", autoAttach=true)
    default public void enterMqOpen(String u_name, int oflag, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* u_name, int oflag, short unsigned int mode, struct mq_attr* attr, int ret)", lastStatement="return 0;", section="fexit/do_mq_open", autoAttach=true)
    default public void exitMqOpen(String u_name, int oflag, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* u_name, int oflag, short unsigned int mode, struct mq_attr* attr)", lastStatement="return 0;", section="kprobe/do_mq_open", autoAttach=true)
    default public void kprobeEnterMqOpen(String u_name, int oflag, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* u_name, int oflag, short unsigned int mode, struct mq_attr* attr, int ret)", lastStatement="return 0;", section="kretprobe/do_mq_open", autoAttach=true)
    default public void kprobeExitMqOpen(String u_name, int oflag, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, u8* u_msg_ptr, long unsigned int msg_len, unsigned int* u_msg_prio, struct timespec64* ts)", lastStatement="return 0;", section="fentry/do_mq_timedreceive", autoAttach=true)
    default public void enterMqTimedreceive(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, Ptr<@Unsigned Integer> u_msg_prio, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, u8* u_msg_ptr, long unsigned int msg_len, unsigned int* u_msg_prio, struct timespec64* ts, int ret)", lastStatement="return 0;", section="fexit/do_mq_timedreceive", autoAttach=true)
    default public void exitMqTimedreceive(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, Ptr<@Unsigned Integer> u_msg_prio, Ptr<runtime.timespec64> ts, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int mqdes, u8* u_msg_ptr, long unsigned int msg_len, unsigned int* u_msg_prio, struct timespec64* ts)", lastStatement="return 0;", section="kprobe/do_mq_timedreceive", autoAttach=true)
    default public void kprobeEnterMqTimedreceive(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, Ptr<@Unsigned Integer> u_msg_prio, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int mqdes, u8* u_msg_ptr, long unsigned int msg_len, unsigned int* u_msg_prio, struct timespec64* ts, int ret)", lastStatement="return 0;", section="kretprobe/do_mq_timedreceive", autoAttach=true)
    default public void kprobeExitMqTimedreceive(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, Ptr<@Unsigned Integer> u_msg_prio, Ptr<runtime.timespec64> ts, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, const u8* u_msg_ptr, long unsigned int msg_len, unsigned int msg_prio, struct timespec64* ts)", lastStatement="return 0;", section="fentry/do_mq_timedsend", autoAttach=true)
    default public void enterMqTimedsend(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, @Unsigned int msg_prio, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int mqdes, const u8* u_msg_ptr, long unsigned int msg_len, unsigned int msg_prio, struct timespec64* ts, int ret)", lastStatement="return 0;", section="fexit/do_mq_timedsend", autoAttach=true)
    default public void exitMqTimedsend(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, @Unsigned int msg_prio, Ptr<runtime.timespec64> ts, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int mqdes, const u8* u_msg_ptr, long unsigned int msg_len, unsigned int msg_prio, struct timespec64* ts)", lastStatement="return 0;", section="kprobe/do_mq_timedsend", autoAttach=true)
    default public void kprobeEnterMqTimedsend(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, @Unsigned int msg_prio, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int mqdes, const u8* u_msg_ptr, long unsigned int msg_len, unsigned int msg_prio, struct timespec64* ts, int ret)", lastStatement="return 0;", section="kretprobe/do_mq_timedsend", autoAttach=true)
    default public void kprobeExitMqTimedsend(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, @Unsigned int msg_prio, Ptr<runtime.timespec64> ts, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* u_name)", lastStatement="return 0;", section="fentry/__do_sys_mq_unlink", autoAttach=true)
    default public void enterMqUnlink(String u_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* u_name, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_mq_unlink", autoAttach=true)
    default public void exitMqUnlink(String u_name, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* u_name)", lastStatement="return 0;", section="kprobe/__do_sys_mq_unlink", autoAttach=true)
    default public void kprobeEnterMqUnlink(String u_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* u_name, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_mq_unlink", autoAttach=true)
    default public void kprobeExitMqUnlink(String u_name, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int addr, long unsigned int old_len, long unsigned int new_len, long unsigned int flags, long unsigned int new_addr)", lastStatement="return 0;", section="fentry/__do_sys_mremap", autoAttach=true)
    default public void enterMremap(@Unsigned long addr2, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long flags, @Unsigned long new_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int addr, long unsigned int old_len, long unsigned int new_len, long unsigned int flags, long unsigned int new_addr, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_mremap", autoAttach=true)
    default public void exitMremap(@Unsigned long addr2, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long flags, @Unsigned long new_addr, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int addr, long unsigned int old_len, long unsigned int new_len, long unsigned int flags, long unsigned int new_addr)", lastStatement="return 0;", section="kprobe/__do_sys_mremap", autoAttach=true)
    default public void kprobeEnterMremap(@Unsigned long addr2, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long flags, @Unsigned long new_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int addr, long unsigned int old_len, long unsigned int new_len, long unsigned int flags, long unsigned int new_addr, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_mremap", autoAttach=true)
    default public void kprobeExitMremap(@Unsigned long addr2, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long flags, @Unsigned long new_addr, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int start, long unsigned int len, int flags)", lastStatement="return 0;", section="fentry/__do_sys_msync", autoAttach=true)
    default public void enterMsync(@Unsigned long start, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int start, long unsigned int len, int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_msync", autoAttach=true)
    default public void exitMsync(@Unsigned long start, @Unsigned long len, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int start, long unsigned int len, int flags)", lastStatement="return 0;", section="kprobe/__do_sys_msync", autoAttach=true)
    default public void kprobeEnterMsync(@Unsigned long start, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int start, long unsigned int len, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_msync", autoAttach=true)
    default public void kprobeExitMsync(@Unsigned long start, @Unsigned long len, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_munlockall", autoAttach=true)
    default public void enterMunlockall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_munlockall", autoAttach=true)
    default public void exitMunlockall(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_munlockall", autoAttach=true)
    default public void kprobeEnterMunlockall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_munlockall", autoAttach=true)
    default public void kprobeExitMunlockall(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mm_struct* mm, long unsigned int start, long unsigned int len, struct list_head* uf)", lastStatement="return 0;", section="fentry/do_munmap", autoAttach=true)
    default public void enterMunmap(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mm_struct* mm, long unsigned int start, long unsigned int len, struct list_head* uf, int ret)", lastStatement="return 0;", section="fexit/do_munmap", autoAttach=true)
    default public void exitMunmap(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len, Ptr<ListDefinitions.list_head> uf, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct mm_struct* mm, long unsigned int start, long unsigned int len, struct list_head* uf)", lastStatement="return 0;", section="kprobe/do_munmap", autoAttach=true)
    default public void kprobeEnterMunmap(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct mm_struct* mm, long unsigned int start, long unsigned int len, struct list_head* uf, int ret)", lastStatement="return 0;", section="kretprobe/do_munmap", autoAttach=true)
    default public void kprobeExitMunmap(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len, Ptr<ListDefinitions.list_head> uf, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct hrtimer_sleeper* t, enum hrtimer_mode mode)", lastStatement="return 0;", section="fentry/do_nanosleep", autoAttach=true)
    default public void enterNanosleep(Ptr<HrtimerDefinitions.hrtimer_sleeper> t, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct hrtimer_sleeper* t, enum hrtimer_mode mode, int ret)", lastStatement="return 0;", section="fexit/do_nanosleep", autoAttach=true)
    default public void exitNanosleep(Ptr<HrtimerDefinitions.hrtimer_sleeper> t, HrtimerDefinitions.hrtimer_mode mode, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct hrtimer_sleeper* t, enum hrtimer_mode mode)", lastStatement="return 0;", section="kprobe/do_nanosleep", autoAttach=true)
    default public void kprobeEnterNanosleep(Ptr<HrtimerDefinitions.hrtimer_sleeper> t, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct hrtimer_sleeper* t, enum hrtimer_mode mode, int ret)", lastStatement="return 0;", section="kretprobe/do_nanosleep", autoAttach=true)
    default public void kprobeExitNanosleep(Ptr<HrtimerDefinitions.hrtimer_sleeper> t, HrtimerDefinitions.hrtimer_mode mode, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, struct open_how* how)", lastStatement="return 0;", section="fentry/do_sys_openat2", autoAttach=true)
    default public void enterOpenat2(int dfd, String filename2, Ptr<OpenDefinitions.open_how> how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* filename, struct open_how* how, long int ret)", lastStatement="return 0;", section="fexit/do_sys_openat2", autoAttach=true)
    default public void exitOpenat2(int dfd, String filename2, Ptr<OpenDefinitions.open_how> how, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, const u8* filename, struct open_how* how)", lastStatement="return 0;", section="kprobe/do_sys_openat2", autoAttach=true)
    default public void kprobeEnterOpenat2(int dfd, String filename2, Ptr<OpenDefinitions.open_how> how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, const u8* filename, struct open_how* how, long int ret)", lastStatement="return 0;", section="kretprobe/do_sys_openat2", autoAttach=true)
    default public void kprobeExitOpenat2(int dfd, String filename2, Ptr<OpenDefinitions.open_how> how, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_pause", autoAttach=true)
    default public void enterPause(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_pause", autoAttach=true)
    default public void exitPause(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_pause", autoAttach=true)
    default public void kprobeEnterPause(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_pause", autoAttach=true)
    default public void kprobeExitPause(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pidfd, int sig, siginfo* info, unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_pidfd_send_signal", autoAttach=true)
    default public void enterPidfdSendSignal(int pidfd, int sig, Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> info2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pidfd, int sig, siginfo* info, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_pidfd_send_signal", autoAttach=true)
    default public void exitPidfdSendSignal(int pidfd, int sig, Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> info2, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pidfd, int sig, siginfo* info, unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_pidfd_send_signal", autoAttach=true)
    default public void kprobeEnterPidfdSendSignal(int pidfd, int sig, Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> info2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pidfd, int sig, siginfo* info, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_pidfd_send_signal", autoAttach=true)
    default public void kprobeExitPidfdSendSignal(int pidfd, int sig, Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> info2, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int* fildes, int flags)", lastStatement="return 0;", section="fentry/do_pipe2", autoAttach=true)
    default public void enterPipe2(Ptr<Integer> fildes, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int* fildes, int flags, int ret)", lastStatement="return 0;", section="fexit/do_pipe2", autoAttach=true)
    default public void exitPipe2(Ptr<Integer> fildes, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int* fildes, int flags)", lastStatement="return 0;", section="kprobe/do_pipe2", autoAttach=true)
    default public void kprobeEnterPipe2(Ptr<Integer> fildes, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int* fildes, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_pipe2", autoAttach=true)
    default public void kprobeExitPipe2(Ptr<Integer> fildes, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* new_root, const u8* put_old)", lastStatement="return 0;", section="fentry/__do_sys_pivot_root", autoAttach=true)
    default public void enterPivotRoot(String new_root, String put_old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* new_root, const u8* put_old, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_pivot_root", autoAttach=true)
    default public void exitPivotRoot(String new_root, String put_old, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* new_root, const u8* put_old)", lastStatement="return 0;", section="kprobe/__do_sys_pivot_root", autoAttach=true)
    default public void kprobeEnterPivotRoot(String new_root, String put_old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* new_root, const u8* put_old, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_pivot_root", autoAttach=true)
    default public void kprobeExitPivotRoot(String new_root, String put_old, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int flags, long unsigned int init_val)", lastStatement="return 0;", section="fentry/__do_sys_pkey_alloc", autoAttach=true)
    default public void enterPkeyAlloc(@Unsigned long flags, @Unsigned long init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int flags, long unsigned int init_val, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_pkey_alloc", autoAttach=true)
    default public void exitPkeyAlloc(@Unsigned long flags, @Unsigned long init_val, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int flags, long unsigned int init_val)", lastStatement="return 0;", section="kprobe/__do_sys_pkey_alloc", autoAttach=true)
    default public void kprobeEnterPkeyAlloc(@Unsigned long flags, @Unsigned long init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int flags, long unsigned int init_val, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_pkey_alloc", autoAttach=true)
    default public void kprobeExitPkeyAlloc(@Unsigned long flags, @Unsigned long init_val, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags)", lastStatement="return 0;", section="fentry/do_preadv", autoAttach=true)
    default public void enterPreadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags, long int ret)", lastStatement="return 0;", section="fexit/do_preadv", autoAttach=true)
    default public void exitPreadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags)", lastStatement="return 0;", section="kprobe/do_preadv", autoAttach=true)
    default public void kprobeEnterPreadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_preadv", autoAttach=true)
    default public void kprobeExitPreadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pidfd, const struct iovec* vec, long unsigned int vlen, int behavior, unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_process_madvise", autoAttach=true)
    default public void enterProcessMadvise(int pidfd, Ptr<runtime.iovec> vec, @Unsigned long vlen, int behavior2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pidfd, const struct iovec* vec, long unsigned int vlen, int behavior, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_process_madvise", autoAttach=true)
    default public void exitProcessMadvise(int pidfd, Ptr<runtime.iovec> vec, @Unsigned long vlen, int behavior2, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pidfd, const struct iovec* vec, long unsigned int vlen, int behavior, unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_process_madvise", autoAttach=true)
    default public void kprobeEnterProcessMadvise(int pidfd, Ptr<runtime.iovec> vec, @Unsigned long vlen, int behavior2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pidfd, const struct iovec* vec, long unsigned int vlen, int behavior, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_process_madvise", autoAttach=true)
    default public void kprobeExitProcessMadvise(int pidfd, Ptr<runtime.iovec> vec, @Unsigned long vlen, int behavior2, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags)", lastStatement="return 0;", section="fentry/do_pwritev", autoAttach=true)
    default public void enterPwritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags, long int ret)", lastStatement="return 0;", section="fexit/do_pwritev", autoAttach=true)
    default public void exitPwritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags)", lastStatement="return 0;", section="kprobe/do_pwritev", autoAttach=true)
    default public void kprobeEnterPwritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, long long int pos, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_pwritev", autoAttach=true)
    default public void kprobeExitPwritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, journal_s* journal, unsigned int start)", lastStatement="return 0;", section="fentry/do_readahead", autoAttach=true)
    default public void enterReadahead(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, journal_s* journal, unsigned int start, int ret)", lastStatement="return 0;", section="fexit/do_readahead", autoAttach=true)
    default public void exitReadahead(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int start, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, journal_s* journal, unsigned int start)", lastStatement="return 0;", section="kprobe/do_readahead", autoAttach=true)
    default public void kprobeEnterReadahead(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, journal_s* journal, unsigned int start, int ret)", lastStatement="return 0;", section="kretprobe/do_readahead", autoAttach=true)
    default public void kprobeExitReadahead(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int start, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* pathname, u8* buf, int bufsiz)", lastStatement="return 0;", section="fentry/do_readlinkat", autoAttach=true)
    default public void enterReadlinkat(int dfd, String pathname, String buf, int bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, const u8* pathname, u8* buf, int bufsiz, int ret)", lastStatement="return 0;", section="fexit/do_readlinkat", autoAttach=true)
    default public void exitReadlinkat(int dfd, String pathname, String buf, int bufsiz, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, const u8* pathname, u8* buf, int bufsiz)", lastStatement="return 0;", section="kprobe/do_readlinkat", autoAttach=true)
    default public void kprobeEnterReadlinkat(int dfd, String pathname, String buf, int bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, const u8* pathname, u8* buf, int bufsiz, int ret)", lastStatement="return 0;", section="kretprobe/do_readlinkat", autoAttach=true)
    default public void kprobeExitReadlinkat(int dfd, String pathname, String buf, int bufsiz, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags)", lastStatement="return 0;", section="fentry/do_readv", autoAttach=true)
    default public void enterReadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags, long int ret)", lastStatement="return 0;", section="fexit/do_readv", autoAttach=true)
    default public void exitReadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags)", lastStatement="return 0;", section="kprobe/do_readv", autoAttach=true)
    default public void kprobeEnterReadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_readv", autoAttach=true)
    default public void kprobeExitReadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name)", lastStatement="return 0;", section="fentry/do_reboot", autoAttach=true)
    default public void enterReboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name)", lastStatement="return 0;", section="fexit/do_reboot", autoAttach=true)
    default public void exitReboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name)", lastStatement="return 0;", section="kprobe/do_reboot", autoAttach=true)
    default public void kprobeEnterReboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name)", lastStatement="return 0;", section="kretprobe/do_reboot", autoAttach=true)
    default public void kprobeExitReboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, struct mmsghdr* mmsg, unsigned int vlen, unsigned int flags, struct timespec64* timeout)", lastStatement="return 0;", section="fentry/do_recvmmsg", autoAttach=true)
    default public void enterRecvmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, Ptr<runtime.timespec64> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, struct mmsghdr* mmsg, unsigned int vlen, unsigned int flags, struct timespec64* timeout, int ret)", lastStatement="return 0;", section="fexit/do_recvmmsg", autoAttach=true)
    default public void exitRecvmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, Ptr<runtime.timespec64> timeout, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int fd, struct mmsghdr* mmsg, unsigned int vlen, unsigned int flags, struct timespec64* timeout)", lastStatement="return 0;", section="kprobe/do_recvmmsg", autoAttach=true)
    default public void kprobeEnterRecvmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, Ptr<runtime.timespec64> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int fd, struct mmsghdr* mmsg, unsigned int vlen, unsigned int flags, struct timespec64* timeout, int ret)", lastStatement="return 0;", section="kretprobe/do_recvmmsg", autoAttach=true)
    default public void kprobeExitRecvmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, Ptr<runtime.timespec64> timeout, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int olddfd, struct filename* from, int newdfd, struct filename* to, unsigned int flags)", lastStatement="return 0;", section="fentry/do_renameat2", autoAttach=true)
    default public void enterRenameat2(int olddfd, Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int olddfd, struct filename* from, int newdfd, struct filename* to, unsigned int flags, int ret)", lastStatement="return 0;", section="fexit/do_renameat2", autoAttach=true)
    default public void exitRenameat2(int olddfd, Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, @Unsigned int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int olddfd, struct filename* from, int newdfd, struct filename* to, unsigned int flags)", lastStatement="return 0;", section="kprobe/do_renameat2", autoAttach=true)
    default public void kprobeEnterRenameat2(int olddfd, Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int olddfd, struct filename* from, int newdfd, struct filename* to, unsigned int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_renameat2", autoAttach=true)
    default public void kprobeExitRenameat2(int olddfd, Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, @Unsigned int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* _type, const u8* _description, const u8* _callout_info, int destringid)", lastStatement="return 0;", section="fentry/__do_sys_request_key", autoAttach=true)
    default public void enterRequestKey(String _type, String _description, String _callout_info, @OriginalName(value="key_serial_t") int destringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* _type, const u8* _description, const u8* _callout_info, int destringid, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_request_key", autoAttach=true)
    default public void exitRequestKey(String _type, String _description, String _callout_info, @OriginalName(value="key_serial_t") int destringid, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* _type, const u8* _description, const u8* _callout_info, int destringid)", lastStatement="return 0;", section="kprobe/__do_sys_request_key", autoAttach=true)
    default public void kprobeEnterRequestKey(String _type, String _description, String _callout_info, @OriginalName(value="key_serial_t") int destringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* _type, const u8* _description, const u8* _callout_info, int destringid, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_request_key", autoAttach=true)
    default public void kprobeExitRequestKey(String _type, String _description, String _callout_info, @OriginalName(value="key_serial_t") int destringid, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_restart_syscall", autoAttach=true)
    default public void enterRestartSyscall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_restart_syscall", autoAttach=true)
    default public void exitRestartSyscall(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_restart_syscall", autoAttach=true)
    default public void kprobeEnterRestartSyscall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_restart_syscall", autoAttach=true)
    default public void kprobeExitRestartSyscall(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name)", lastStatement="return 0;", section="fentry/do_rmdir", autoAttach=true)
    default public void enterRmdir(int dfd, Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name, int ret)", lastStatement="return 0;", section="fexit/do_rmdir", autoAttach=true)
    default public void exitRmdir(int dfd, Ptr<runtime.filename> name, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, struct filename* name)", lastStatement="return 0;", section="kprobe/do_rmdir", autoAttach=true)
    default public void kprobeEnterRmdir(int dfd, Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, struct filename* name, int ret)", lastStatement="return 0;", section="kretprobe/do_rmdir", autoAttach=true)
    default public void kprobeExitRmdir(int dfd, Ptr<runtime.filename> name, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int sig, kernel_siginfo* info)", lastStatement="return 0;", section="fentry/do_rt_sigqueueinfo", autoAttach=true)
    default public void enterRtSigqueueinfo(@OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int sig, kernel_siginfo* info, int ret)", lastStatement="return 0;", section="fexit/do_rt_sigqueueinfo", autoAttach=true)
    default public void exitRtSigqueueinfo(@OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pid, int sig, kernel_siginfo* info)", lastStatement="return 0;", section="kprobe/do_rt_sigqueueinfo", autoAttach=true)
    default public void kprobeEnterRtSigqueueinfo(@OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pid, int sig, kernel_siginfo* info, int ret)", lastStatement="return 0;", section="kretprobe/do_rt_sigqueueinfo", autoAttach=true)
    default public void kprobeExitRtSigqueueinfo(@OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int tgid, int pid, int sig, kernel_siginfo* info)", lastStatement="return 0;", section="fentry/do_rt_tgsigqueueinfo", autoAttach=true)
    default public void enterRtTgsigqueueinfo(@OriginalName(value="pid_t") int tgid, @OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int tgid, int pid, int sig, kernel_siginfo* info, int ret)", lastStatement="return 0;", section="fexit/do_rt_tgsigqueueinfo", autoAttach=true)
    default public void exitRtTgsigqueueinfo(@OriginalName(value="pid_t") int tgid, @OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int tgid, int pid, int sig, kernel_siginfo* info)", lastStatement="return 0;", section="kprobe/do_rt_tgsigqueueinfo", autoAttach=true)
    default public void kprobeEnterRtTgsigqueueinfo(@OriginalName(value="pid_t") int tgid, @OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int tgid, int pid, int sig, kernel_siginfo* info, int ret)", lastStatement="return 0;", section="kretprobe/do_rt_tgsigqueueinfo", autoAttach=true)
    default public void kprobeExitRtTgsigqueueinfo(@OriginalName(value="pid_t") int tgid, @OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int policy, struct sched_param* param)", lastStatement="return 0;", section="fentry/do_sched_setscheduler", autoAttach=true)
    default public void enterSchedSetscheduler(@OriginalName(value="pid_t") int pid2, int policy, Ptr<SchedDefinitions.sched_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int policy, struct sched_param* param, int ret)", lastStatement="return 0;", section="fexit/do_sched_setscheduler", autoAttach=true)
    default public void exitSchedSetscheduler(@OriginalName(value="pid_t") int pid2, int policy, Ptr<SchedDefinitions.sched_param> param2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pid, int policy, struct sched_param* param)", lastStatement="return 0;", section="kprobe/do_sched_setscheduler", autoAttach=true)
    default public void kprobeEnterSchedSetscheduler(@OriginalName(value="pid_t") int pid2, int policy, Ptr<SchedDefinitions.sched_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pid, int policy, struct sched_param* param, int ret)", lastStatement="return 0;", section="kretprobe/do_sched_setscheduler", autoAttach=true)
    default public void kprobeExitSchedSetscheduler(@OriginalName(value="pid_t") int pid2, int policy, Ptr<SchedDefinitions.sched_param> param2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name)", lastStatement="return 0;", section="fentry/do_sched_yield", autoAttach=true)
    default public void enterSchedYield() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name)", lastStatement="return 0;", section="fexit/do_sched_yield", autoAttach=true)
    default public void exitSchedYield() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name)", lastStatement="return 0;", section="kprobe/do_sched_yield", autoAttach=true)
    default public void kprobeEnterSchedYield() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name)", lastStatement="return 0;", section="kretprobe/do_sched_yield", autoAttach=true)
    default public void kprobeExitSchedYield() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int op, unsigned int flags, void* uargs)", lastStatement="return 0;", section="fentry/do_seccomp", autoAttach=true)
    default public void enterSeccomp(@Unsigned int op, @Unsigned int flags, Ptr<?> uargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int op, unsigned int flags, void* uargs, long int ret)", lastStatement="return 0;", section="fexit/do_seccomp", autoAttach=true)
    default public void exitSeccomp(@Unsigned int op, @Unsigned int flags, Ptr<?> uargs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int op, unsigned int flags, void* uargs)", lastStatement="return 0;", section="kprobe/do_seccomp", autoAttach=true)
    default public void kprobeEnterSeccomp(@Unsigned int op, @Unsigned int flags, Ptr<?> uargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int op, unsigned int flags, void* uargs, long int ret)", lastStatement="return 0;", section="kretprobe/do_seccomp", autoAttach=true)
    default public void kprobeExitSeccomp(@Unsigned int op, @Unsigned int flags, Ptr<?> uargs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int out_fd, int in_fd, long long int* ppos, long unsigned int count, long long int max)", lastStatement="return 0;", section="fentry/do_sendfile", autoAttach=true)
    default public void enterSendfile(int out_fd, int in_fd, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long count, @OriginalName(value="loff_t") long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int out_fd, int in_fd, long long int* ppos, long unsigned int count, long long int max, long int ret)", lastStatement="return 0;", section="fexit/do_sendfile", autoAttach=true)
    default public void exitSendfile(int out_fd, int in_fd, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long count, @OriginalName(value="loff_t") long max, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int out_fd, int in_fd, long long int* ppos, long unsigned int count, long long int max)", lastStatement="return 0;", section="kprobe/do_sendfile", autoAttach=true)
    default public void kprobeEnterSendfile(int out_fd, int in_fd, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long count, @OriginalName(value="loff_t") long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int out_fd, int in_fd, long long int* ppos, long unsigned int count, long long int max, long int ret)", lastStatement="return 0;", section="kretprobe/do_sendfile", autoAttach=true)
    default public void kprobeExitSendfile(int out_fd, int in_fd, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long count, @OriginalName(value="loff_t") long max, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, short unsigned int mode, short unsigned int flags, struct {\n  long unsigned int bits[16];\n}* nodes)", lastStatement="return 0;", section="fentry/do_set_mempolicy", autoAttach=true)
    default public void enterSetMempolicy(@Unsigned short mode, @Unsigned short flags, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, short unsigned int mode, short unsigned int flags, struct {\n  long unsigned int bits[16];\n}* nodes, long int ret)", lastStatement="return 0;", section="fexit/do_set_mempolicy", autoAttach=true)
    default public void exitSetMempolicy(@Unsigned short mode, @Unsigned short flags, Ptr<misc.nodemask_t> nodes, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, short unsigned int mode, short unsigned int flags, struct {\n  long unsigned int bits[16];\n}* nodes)", lastStatement="return 0;", section="kprobe/do_set_mempolicy", autoAttach=true)
    default public void kprobeEnterSetMempolicy(@Unsigned short mode, @Unsigned short flags, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, short unsigned int mode, short unsigned int flags, struct {\n  long unsigned int bits[16];\n}* nodes, long int ret)", lastStatement="return 0;", section="kretprobe/do_set_mempolicy", autoAttach=true)
    default public void kprobeExitSetMempolicy(@Unsigned short mode, @Unsigned short flags, Ptr<misc.nodemask_t> nodes, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct task_struct* p, int idx, struct user_desc* u_info, int can_allocate)", lastStatement="return 0;", section="fentry/do_set_thread_area", autoAttach=true)
    default public void enterSetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int can_allocate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct task_struct* p, int idx, struct user_desc* u_info, int can_allocate, int ret)", lastStatement="return 0;", section="fexit/do_set_thread_area", autoAttach=true)
    default public void exitSetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int can_allocate, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct task_struct* p, int idx, struct user_desc* u_info, int can_allocate)", lastStatement="return 0;", section="kprobe/do_set_thread_area", autoAttach=true)
    default public void kprobeEnterSetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int can_allocate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct task_struct* p, int idx, struct user_desc* u_info, int can_allocate, int ret)", lastStatement="return 0;", section="kretprobe/do_set_thread_area", autoAttach=true)
    default public void kprobeExitSetThreadArea(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int can_allocate, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int gidsetsize, unsigned int* grouplist)", lastStatement="return 0;", section="fentry/__do_sys_setgroups", autoAttach=true)
    default public void enterSetgroups(int gidsetsize, Ptr<@Unsigned @OriginalName(value="gid_t") Integer> grouplist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int gidsetsize, unsigned int* grouplist, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_setgroups", autoAttach=true)
    default public void exitSetgroups(int gidsetsize, Ptr<@Unsigned @OriginalName(value="gid_t") Integer> grouplist, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int gidsetsize, unsigned int* grouplist)", lastStatement="return 0;", section="kprobe/__do_sys_setgroups", autoAttach=true)
    default public void kprobeEnterSetgroups(int gidsetsize, Ptr<@Unsigned @OriginalName(value="gid_t") Integer> grouplist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int gidsetsize, unsigned int* grouplist, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_setgroups", autoAttach=true)
    default public void kprobeExitSetgroups(int gidsetsize, Ptr<@Unsigned @OriginalName(value="gid_t") Integer> grouplist, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, int flags)", lastStatement="return 0;", section="fentry/__do_sys_setns", autoAttach=true)
    default public void enterSetns(int fd2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_setns", autoAttach=true)
    default public void exitSetns(int fd2, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int fd, int flags)", lastStatement="return 0;", section="kprobe/__do_sys_setns", autoAttach=true)
    default public void kprobeEnterSetns(int fd2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int fd, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_setns", autoAttach=true)
    default public void kprobeExitSetns(int fd2, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int pgid)", lastStatement="return 0;", section="fentry/__do_sys_setpgid", autoAttach=true)
    default public void enterSetpgid(@OriginalName(value="pid_t") int pid2, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int pid, int pgid, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_setpgid", autoAttach=true)
    default public void exitSetpgid(@OriginalName(value="pid_t") int pid2, @OriginalName(value="pid_t") int pgid, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int pid, int pgid)", lastStatement="return 0;", section="kprobe/__do_sys_setpgid", autoAttach=true)
    default public void kprobeEnterSetpgid(@OriginalName(value="pid_t") int pid2, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int pid, int pgid, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_setpgid", autoAttach=true)
    default public void kprobeExitSetpgid(@OriginalName(value="pid_t") int pid2, @OriginalName(value="pid_t") int pgid, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who, int niceval)", lastStatement="return 0;", section="fentry/__do_sys_setpriority", autoAttach=true)
    default public void enterSetpriority(int which, int who, int niceval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int who, int niceval, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_setpriority", autoAttach=true)
    default public void exitSetpriority(int which, int who, int niceval, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int which, int who, int niceval)", lastStatement="return 0;", section="kprobe/__do_sys_setpriority", autoAttach=true)
    default public void kprobeEnterSetpriority(int which, int who, int niceval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int which, int who, int niceval, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_setpriority", autoAttach=true)
    default public void kprobeExitSetpriority(int which, int who, int niceval, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_setsid", autoAttach=true)
    default public void enterSetsid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_setsid", autoAttach=true)
    default public void exitSetsid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_setsid", autoAttach=true)
    default public void kprobeEnterSetsid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_setsid", autoAttach=true)
    default public void kprobeExitSetsid(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_sgetmask", autoAttach=true)
    default public void enterSgetmask(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_sgetmask", autoAttach=true)
    default public void exitSgetmask(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_sgetmask", autoAttach=true)
    default public void kprobeEnterSgetmask(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_sgetmask", autoAttach=true)
    default public void kprobeExitSgetmask(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int sig, struct k_sigaction* act, struct k_sigaction* oact)", lastStatement="return 0;", section="fentry/do_sigaction", autoAttach=true)
    default public void enterSigaction(int sig, Ptr<KDefinitions.k_sigaction> act, Ptr<KDefinitions.k_sigaction> oact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int sig, struct k_sigaction* act, struct k_sigaction* oact, int ret)", lastStatement="return 0;", section="fexit/do_sigaction", autoAttach=true)
    default public void exitSigaction(int sig, Ptr<KDefinitions.k_sigaction> act, Ptr<KDefinitions.k_sigaction> oact, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int sig, struct k_sigaction* act, struct k_sigaction* oact)", lastStatement="return 0;", section="kprobe/do_sigaction", autoAttach=true)
    default public void kprobeEnterSigaction(int sig, Ptr<KDefinitions.k_sigaction> act, Ptr<KDefinitions.k_sigaction> oact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int sig, struct k_sigaction* act, struct k_sigaction* oact, int ret)", lastStatement="return 0;", section="kretprobe/do_sigaction", autoAttach=true)
    default public void kprobeExitSigaction(int sig, Ptr<KDefinitions.k_sigaction> act, Ptr<KDefinitions.k_sigaction> oact, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const sigaltstack* ss, sigaltstack* oss, long unsigned int sp, long unsigned int min_ss_size)", lastStatement="return 0;", section="fentry/do_sigaltstack", autoAttach=true)
    default public void enterSigaltstack(Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> ss, Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> oss, @Unsigned long sp, @Unsigned long min_ss_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const sigaltstack* ss, sigaltstack* oss, long unsigned int sp, long unsigned int min_ss_size, int ret)", lastStatement="return 0;", section="fexit/do_sigaltstack", autoAttach=true)
    default public void exitSigaltstack(Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> ss, Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> oss, @Unsigned long sp, @Unsigned long min_ss_size, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const sigaltstack* ss, sigaltstack* oss, long unsigned int sp, long unsigned int min_ss_size)", lastStatement="return 0;", section="kprobe/do_sigaltstack", autoAttach=true)
    default public void kprobeEnterSigaltstack(Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> ss, Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> oss, @Unsigned long sp, @Unsigned long min_ss_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const sigaltstack* ss, sigaltstack* oss, long unsigned int sp, long unsigned int min_ss_size, int ret)", lastStatement="return 0;", section="kretprobe/do_sigaltstack", autoAttach=true)
    default public void kprobeExitSigaltstack(Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> ss, Ptr< @OriginalName(value="stack_t") runtime.sigaltstack> oss, @Unsigned long sp, @Unsigned long min_ss_size, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int call, long unsigned int* args)", lastStatement="return 0;", section="fentry/__do_sys_socketcall", autoAttach=true)
    default public void enterSocketcall(int call, Ptr<@Unsigned Long> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int call, long unsigned int* args, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_socketcall", autoAttach=true)
    default public void exitSocketcall(int call, Ptr<@Unsigned Long> args, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int call, long unsigned int* args)", lastStatement="return 0;", section="kprobe/__do_sys_socketcall", autoAttach=true)
    default public void kprobeEnterSocketcall(int call, Ptr<@Unsigned Long> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int call, long unsigned int* args, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_socketcall", autoAttach=true)
    default public void kprobeExitSocketcall(int call, Ptr<@Unsigned Long> args, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* in, long long int* off_in, struct file* out, long long int* off_out, long unsigned int len, unsigned int flags)", lastStatement="return 0;", section="fentry/do_splice", autoAttach=true)
    default public void enterSplice(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> off_in, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* in, long long int* off_in, struct file* out, long long int* off_out, long unsigned int len, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/do_splice", autoAttach=true)
    default public void exitSplice(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> off_in, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct file* in, long long int* off_in, struct file* out, long long int* off_out, long unsigned int len, unsigned int flags)", lastStatement="return 0;", section="kprobe/do_splice", autoAttach=true)
    default public void kprobeEnterSplice(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> off_in, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct file* in, long long int* off_in, struct file* out, long long int* off_out, long unsigned int len, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_splice", autoAttach=true)
    default public void kprobeExitSplice(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> off_in, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* filename, struct __old_kernel_stat* statbuf)", lastStatement="return 0;", section="fentry/__do_sys_stat", autoAttach=true)
    default public void enterStat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* filename, struct __old_kernel_stat* statbuf, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_stat", autoAttach=true)
    default public void exitStat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* filename, struct __old_kernel_stat* statbuf)", lastStatement="return 0;", section="kprobe/__do_sys_stat", autoAttach=true)
    default public void kprobeEnterStat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* filename, struct __old_kernel_stat* statbuf, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_stat", autoAttach=true)
    default public void kprobeExitStat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* pathname, struct statfs* buf)", lastStatement="return 0;", section="fentry/__do_sys_statfs", autoAttach=true)
    default public void enterStatfs(String pathname, Ptr<DoDefinitions.statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* pathname, struct statfs* buf, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_statfs", autoAttach=true)
    default public void exitStatfs(String pathname, Ptr<DoDefinitions.statfs> buf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* pathname, struct statfs* buf)", lastStatement="return 0;", section="kprobe/__do_sys_statfs", autoAttach=true)
    default public void kprobeEnterStatfs(String pathname, Ptr<DoDefinitions.statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* pathname, struct statfs* buf, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_statfs", autoAttach=true)
    default public void kprobeExitStatfs(String pathname, Ptr<DoDefinitions.statfs> buf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* filename, unsigned int flags, unsigned int mask, struct statx* buffer)", lastStatement="return 0;", section="fentry/do_statx", autoAttach=true)
    default public void enterStatx(int dfd, Ptr<runtime.filename> filename2, @Unsigned int flags, @Unsigned int mask, Ptr<runtime.statx> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* filename, unsigned int flags, unsigned int mask, struct statx* buffer, int ret)", lastStatement="return 0;", section="fexit/do_statx", autoAttach=true)
    default public void exitStatx(int dfd, Ptr<runtime.filename> filename2, @Unsigned int flags, @Unsigned int mask, Ptr<runtime.statx> buffer, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, struct filename* filename, unsigned int flags, unsigned int mask, struct statx* buffer)", lastStatement="return 0;", section="kprobe/do_statx", autoAttach=true)
    default public void kprobeEnterStatx(int dfd, Ptr<runtime.filename> filename2, @Unsigned int flags, @Unsigned int mask, Ptr<runtime.statx> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, struct filename* filename, unsigned int flags, unsigned int mask, struct statx* buffer, int ret)", lastStatement="return 0;", section="kretprobe/do_statx", autoAttach=true)
    default public void kprobeExitStatx(int dfd, Ptr<runtime.filename> filename2, @Unsigned int flags, @Unsigned int mask, Ptr<runtime.statx> buffer, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* specialfile)", lastStatement="return 0;", section="fentry/__do_sys_swapoff", autoAttach=true)
    default public void enterSwapoff(String specialfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* specialfile, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_swapoff", autoAttach=true)
    default public void exitSwapoff(String specialfile, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* specialfile)", lastStatement="return 0;", section="kprobe/__do_sys_swapoff", autoAttach=true)
    default public void kprobeEnterSwapoff(String specialfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* specialfile, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_swapoff", autoAttach=true)
    default public void kprobeExitSwapoff(String specialfile, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* specialfile, int swap_flags)", lastStatement="return 0;", section="fentry/__do_sys_swapon", autoAttach=true)
    default public void enterSwapon(String specialfile, int swap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* specialfile, int swap_flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_swapon", autoAttach=true)
    default public void exitSwapon(String specialfile, int swap_flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* specialfile, int swap_flags)", lastStatement="return 0;", section="kprobe/__do_sys_swapon", autoAttach=true)
    default public void kprobeEnterSwapon(String specialfile, int swap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* specialfile, int swap_flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_swapon", autoAttach=true)
    default public void kprobeExitSwapon(String specialfile, int swap_flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name)", lastStatement="return 0;", section="fentry/do_symlink", autoAttach=true)
    default public void enterSymlink() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int ret)", lastStatement="return 0;", section="fexit/do_symlink", autoAttach=true)
    default public void exitSymlink(int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name)", lastStatement="return 0;", section="kprobe/do_symlink", autoAttach=true)
    default public void kprobeEnterSymlink() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int ret)", lastStatement="return 0;", section="kretprobe/do_symlink", autoAttach=true)
    default public void kprobeExitSymlink(int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct filename* from, int newdfd, struct filename* to)", lastStatement="return 0;", section="fentry/do_symlinkat", autoAttach=true)
    default public void enterSymlinkat(Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct filename* from, int newdfd, struct filename* to, int ret)", lastStatement="return 0;", section="fexit/do_symlinkat", autoAttach=true)
    default public void exitSymlinkat(Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct filename* from, int newdfd, struct filename* to)", lastStatement="return 0;", section="kprobe/do_symlinkat", autoAttach=true)
    default public void kprobeEnterSymlinkat(Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct filename* from, int newdfd, struct filename* to, int ret)", lastStatement="return 0;", section="kretprobe/do_symlinkat", autoAttach=true)
    default public void kprobeExitSymlinkat(Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_sync", autoAttach=true)
    default public void enterSync(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_sync", autoAttach=true)
    default public void exitSync(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_sync", autoAttach=true)
    default public void kprobeEnterSync(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_sync", autoAttach=true)
    default public void kprobeExitSync(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct sysinfo* info)", lastStatement="return 0;", section="fentry/do_sysinfo", autoAttach=true)
    default public void enterSysinfo(Ptr<runtime.sysinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct sysinfo* info, int ret)", lastStatement="return 0;", section="fexit/do_sysinfo", autoAttach=true)
    default public void exitSysinfo(Ptr<runtime.sysinfo> info2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct sysinfo* info)", lastStatement="return 0;", section="kprobe/do_sysinfo", autoAttach=true)
    default public void kprobeEnterSysinfo(Ptr<runtime.sysinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct sysinfo* info, int ret)", lastStatement="return 0;", section="kretprobe/do_sysinfo", autoAttach=true)
    default public void kprobeExitSysinfo(Ptr<runtime.sysinfo> info2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int type, u8* buf, int len, int source)", lastStatement="return 0;", section="fentry/do_syslog", autoAttach=true)
    default public void enterSyslog(int type2, String buf, int len, int source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int type, u8* buf, int len, int source, int ret)", lastStatement="return 0;", section="fexit/do_syslog", autoAttach=true)
    default public void exitSyslog(int type2, String buf, int len, int source, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int type, u8* buf, int len, int source)", lastStatement="return 0;", section="kprobe/do_syslog", autoAttach=true)
    default public void kprobeEnterSyslog(int type2, String buf, int len, int source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int type, u8* buf, int len, int source, int ret)", lastStatement="return 0;", section="kretprobe/do_syslog", autoAttach=true)
    default public void kprobeExitSyslog(int type2, String buf, int len, int source, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* in, struct file* out, long unsigned int len, unsigned int flags)", lastStatement="return 0;", section="fentry/do_tee", autoAttach=true)
    default public void enterTee(Ptr<runtime.file> in, Ptr<runtime.file> out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file* in, struct file* out, long unsigned int len, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/do_tee", autoAttach=true)
    default public void exitTee(Ptr<runtime.file> in, Ptr<runtime.file> out, @Unsigned long len, @Unsigned int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct file* in, struct file* out, long unsigned int len, unsigned int flags)", lastStatement="return 0;", section="kprobe/do_tee", autoAttach=true)
    default public void kprobeEnterTee(Ptr<runtime.file> in, Ptr<runtime.file> out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct file* in, struct file* out, long unsigned int len, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_tee", autoAttach=true)
    default public void kprobeExitTee(Ptr<runtime.file> in, Ptr<runtime.file> out, @Unsigned long len, @Unsigned int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which_clock, struct sigevent* event, int* created_timer_id)", lastStatement="return 0;", section="fentry/do_timer_create", autoAttach=true)
    default public void enterTimerCreate(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.sigevent> event2, Ptr<@OriginalName(value="timer_t") Integer> created_timer_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which_clock, struct sigevent* event, int* created_timer_id, int ret)", lastStatement="return 0;", section="fexit/do_timer_create", autoAttach=true)
    default public void exitTimerCreate(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.sigevent> event2, Ptr<@OriginalName(value="timer_t") Integer> created_timer_id, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int which_clock, struct sigevent* event, int* created_timer_id)", lastStatement="return 0;", section="kprobe/do_timer_create", autoAttach=true)
    default public void kprobeEnterTimerCreate(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.sigevent> event2, Ptr<@OriginalName(value="timer_t") Integer> created_timer_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int which_clock, struct sigevent* event, int* created_timer_id, int ret)", lastStatement="return 0;", section="kretprobe/do_timer_create", autoAttach=true)
    default public void kprobeExitTimerCreate(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.sigevent> event2, Ptr<@OriginalName(value="timer_t") Integer> created_timer_id, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int timer_id, struct itimerspec64* setting)", lastStatement="return 0;", section="fentry/do_timer_gettime", autoAttach=true)
    default public void enterTimerGettime(@OriginalName(value="timer_t") int timer_id, Ptr<runtime.itimerspec64> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int timer_id, struct itimerspec64* setting, int ret)", lastStatement="return 0;", section="fexit/do_timer_gettime", autoAttach=true)
    default public void exitTimerGettime(@OriginalName(value="timer_t") int timer_id, Ptr<runtime.itimerspec64> setting, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int timer_id, struct itimerspec64* setting)", lastStatement="return 0;", section="kprobe/do_timer_gettime", autoAttach=true)
    default public void kprobeEnterTimerGettime(@OriginalName(value="timer_t") int timer_id, Ptr<runtime.itimerspec64> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int timer_id, struct itimerspec64* setting, int ret)", lastStatement="return 0;", section="kretprobe/do_timer_gettime", autoAttach=true)
    default public void kprobeExitTimerGettime(@OriginalName(value="timer_t") int timer_id, Ptr<runtime.itimerspec64> setting, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int timer_id, int tmr_flags, struct itimerspec64* new_spec64, struct itimerspec64* old_spec64)", lastStatement="return 0;", section="fentry/do_timer_settime", autoAttach=true)
    default public void enterTimerSettime(@OriginalName(value="timer_t") int timer_id, int tmr_flags, Ptr<runtime.itimerspec64> new_spec64, Ptr<runtime.itimerspec64> old_spec64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int timer_id, int tmr_flags, struct itimerspec64* new_spec64, struct itimerspec64* old_spec64, int ret)", lastStatement="return 0;", section="fexit/do_timer_settime", autoAttach=true)
    default public void exitTimerSettime(@OriginalName(value="timer_t") int timer_id, int tmr_flags, Ptr<runtime.itimerspec64> new_spec64, Ptr<runtime.itimerspec64> old_spec64, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int timer_id, int tmr_flags, struct itimerspec64* new_spec64, struct itimerspec64* old_spec64)", lastStatement="return 0;", section="kprobe/do_timer_settime", autoAttach=true)
    default public void kprobeEnterTimerSettime(@OriginalName(value="timer_t") int timer_id, int tmr_flags, Ptr<runtime.itimerspec64> new_spec64, Ptr<runtime.itimerspec64> old_spec64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int timer_id, int tmr_flags, struct itimerspec64* new_spec64, struct itimerspec64* old_spec64, int ret)", lastStatement="return 0;", section="kretprobe/do_timer_settime", autoAttach=true)
    default public void kprobeExitTimerSettime(@OriginalName(value="timer_t") int timer_id, int tmr_flags, Ptr<runtime.itimerspec64> new_spec64, Ptr<runtime.itimerspec64> old_spec64, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int clockid, int flags)", lastStatement="return 0;", section="fentry/__do_sys_timerfd_create", autoAttach=true)
    default public void enterTimerfdCreate(int clockid, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int clockid, int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_timerfd_create", autoAttach=true)
    default public void exitTimerfdCreate(int clockid, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int clockid, int flags)", lastStatement="return 0;", section="kprobe/__do_sys_timerfd_create", autoAttach=true)
    default public void kprobeEnterTimerfdCreate(int clockid, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int clockid, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_timerfd_create", autoAttach=true)
    default public void kprobeExitTimerfdCreate(int clockid, int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int ufd, struct itimerspec64* t)", lastStatement="return 0;", section="fentry/do_timerfd_gettime", autoAttach=true)
    default public void enterTimerfdGettime(int ufd, Ptr<runtime.itimerspec64> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int ufd, struct itimerspec64* t, int ret)", lastStatement="return 0;", section="fexit/do_timerfd_gettime", autoAttach=true)
    default public void exitTimerfdGettime(int ufd, Ptr<runtime.itimerspec64> t, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int ufd, struct itimerspec64* t)", lastStatement="return 0;", section="kprobe/do_timerfd_gettime", autoAttach=true)
    default public void kprobeEnterTimerfdGettime(int ufd, Ptr<runtime.itimerspec64> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int ufd, struct itimerspec64* t, int ret)", lastStatement="return 0;", section="kretprobe/do_timerfd_gettime", autoAttach=true)
    default public void kprobeExitTimerfdGettime(int ufd, Ptr<runtime.itimerspec64> t, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int ufd, int flags, const struct itimerspec64* new, struct itimerspec64* old)", lastStatement="return 0;", section="fentry/do_timerfd_settime", autoAttach=true)
    default public void enterTimerfdSettime(int ufd, int flags, Ptr<runtime.itimerspec64> _new, Ptr<runtime.itimerspec64> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int ufd, int flags, const struct itimerspec64* new, struct itimerspec64* old, int ret)", lastStatement="return 0;", section="fexit/do_timerfd_settime", autoAttach=true)
    default public void exitTimerfdSettime(int ufd, int flags, Ptr<runtime.itimerspec64> _new, Ptr<runtime.itimerspec64> old, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int ufd, int flags, const struct itimerspec64* new, struct itimerspec64* old)", lastStatement="return 0;", section="kprobe/do_timerfd_settime", autoAttach=true)
    default public void kprobeEnterTimerfdSettime(int ufd, int flags, Ptr<runtime.itimerspec64> _new, Ptr<runtime.itimerspec64> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int ufd, int flags, const struct itimerspec64* new, struct itimerspec64* old, int ret)", lastStatement="return 0;", section="kretprobe/do_timerfd_settime", autoAttach=true)
    default public void kprobeExitTimerfdSettime(int ufd, int flags, Ptr<runtime.itimerspec64> _new, Ptr<runtime.itimerspec64> old, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct tms* tms)", lastStatement="return 0;", section="fentry/do_sys_times", autoAttach=true)
    default public void enterTimes(Ptr<DoDefinitions.tms> tms2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct tms* tms)", lastStatement="return 0;", section="fexit/do_sys_times", autoAttach=true)
    default public void exitTimes(Ptr<DoDefinitions.tms> tms2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct tms* tms)", lastStatement="return 0;", section="kprobe/do_sys_times", autoAttach=true)
    default public void kprobeEnterTimes(Ptr<DoDefinitions.tms> tms2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct tms* tms)", lastStatement="return 0;", section="kretprobe/do_sys_times", autoAttach=true)
    default public void kprobeExitTimes(Ptr<DoDefinitions.tms> tms2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* pathname, long long int length)", lastStatement="return 0;", section="fentry/do_sys_truncate", autoAttach=true)
    default public void enterTruncate(String pathname, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const u8* pathname, long long int length, long int ret)", lastStatement="return 0;", section="fexit/do_sys_truncate", autoAttach=true)
    default public void exitTruncate(String pathname, @OriginalName(value="loff_t") long length, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const u8* pathname, long long int length)", lastStatement="return 0;", section="kprobe/do_sys_truncate", autoAttach=true)
    default public void kprobeEnterTruncate(String pathname, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const u8* pathname, long long int length, long int ret)", lastStatement="return 0;", section="kretprobe/do_sys_truncate", autoAttach=true)
    default public void kprobeExitTruncate(String pathname, @OriginalName(value="loff_t") long length, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mount* mnt, int flags)", lastStatement="return 0;", section="fentry/do_umount", autoAttach=true)
    default public void enterUmount(Ptr<runtime.mount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct mount* mnt, int flags, int ret)", lastStatement="return 0;", section="fexit/do_umount", autoAttach=true)
    default public void exitUmount(Ptr<runtime.mount> mnt, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, struct mount* mnt, int flags)", lastStatement="return 0;", section="kprobe/do_umount", autoAttach=true)
    default public void kprobeEnterUmount(Ptr<runtime.mount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, struct mount* mnt, int flags, int ret)", lastStatement="return 0;", section="kretprobe/do_umount", autoAttach=true)
    default public void kprobeExitUmount(Ptr<runtime.mount> mnt, int flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name)", lastStatement="return 0;", section="fentry/do_unlinkat", autoAttach=true)
    default public void enterUnlinkat(int dfd, Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int dfd, struct filename* name, int ret)", lastStatement="return 0;", section="fexit/do_unlinkat", autoAttach=true)
    default public void exitUnlinkat(int dfd, Ptr<runtime.filename> name, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int dfd, struct filename* name)", lastStatement="return 0;", section="kprobe/do_unlinkat", autoAttach=true)
    default public void kprobeEnterUnlinkat(int dfd, Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int dfd, struct filename* name, int ret)", lastStatement="return 0;", section="kretprobe/do_unlinkat", autoAttach=true)
    default public void kprobeExitUnlinkat(int dfd, Ptr<runtime.filename> name, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int dev, struct ustat* ubuf)", lastStatement="return 0;", section="fentry/__do_sys_ustat", autoAttach=true)
    default public void enterUstat(@Unsigned int dev, Ptr<DoDefinitions.ustat> ubuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, unsigned int dev, struct ustat* ubuf, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_ustat", autoAttach=true)
    default public void exitUstat(@Unsigned int dev, Ptr<DoDefinitions.ustat> ubuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, unsigned int dev, struct ustat* ubuf)", lastStatement="return 0;", section="kprobe/__do_sys_ustat", autoAttach=true)
    default public void kprobeEnterUstat(@Unsigned int dev, Ptr<DoDefinitions.ustat> ubuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, unsigned int dev, struct ustat* ubuf, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_ustat", autoAttach=true)
    default public void kprobeExitUstat(@Unsigned int dev, Ptr<DoDefinitions.ustat> ubuf, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, u8* filename, long long int mtime)", lastStatement="return 0;", section="fentry/do_utime", autoAttach=true)
    default public void enterUtime(String filename2, @OriginalName(value="time64_t") long mtime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, u8* filename, long long int mtime)", lastStatement="return 0;", section="fexit/do_utime", autoAttach=true)
    default public void exitUtime(String filename2, @OriginalName(value="time64_t") long mtime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, u8* filename, long long int mtime)", lastStatement="return 0;", section="kprobe/do_utime", autoAttach=true)
    default public void kprobeEnterUtime(String filename2, @OriginalName(value="time64_t") long mtime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, u8* filename, long long int mtime)", lastStatement="return 0;", section="kretprobe/do_utime", autoAttach=true)
    default public void kprobeExitUtime(String filename2, @OriginalName(value="time64_t") long mtime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_vfork", autoAttach=true)
    default public void enterVfork(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_vfork", autoAttach=true)
    default public void exitVfork(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_vfork", autoAttach=true)
    default public void kprobeEnterVfork(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_vfork", autoAttach=true)
    default public void kprobeExitVfork(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="fentry/__do_sys_vhangup", autoAttach=true)
    default public void enterVhangup(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_vhangup", autoAttach=true)
    default public void exitVhangup(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, const struct pt_regs* __unused)", lastStatement="return 0;", section="kprobe/__do_sys_vhangup", autoAttach=true)
    default public void kprobeEnterVhangup(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, const struct pt_regs* __unused, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_vhangup", autoAttach=true)
    default public void kprobeExitVhangup(Ptr<PtDefinitions.pt_regs> __unused, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, const struct iovec* uiov, long unsigned int nr_segs, unsigned int flags)", lastStatement="return 0;", section="fentry/__do_sys_vmsplice", autoAttach=true)
    default public void enterVmsplice(int fd2, Ptr<runtime.iovec> uiov, @Unsigned long nr_segs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int fd, const struct iovec* uiov, long unsigned int nr_segs, unsigned int flags, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_vmsplice", autoAttach=true)
    default public void exitVmsplice(int fd2, Ptr<runtime.iovec> uiov, @Unsigned long nr_segs, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int fd, const struct iovec* uiov, long unsigned int nr_segs, unsigned int flags)", lastStatement="return 0;", section="kprobe/__do_sys_vmsplice", autoAttach=true)
    default public void kprobeEnterVmsplice(int fd2, Ptr<runtime.iovec> uiov, @Unsigned long nr_segs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int fd, const struct iovec* uiov, long unsigned int nr_segs, unsigned int flags, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_vmsplice", autoAttach=true)
    default public void kprobeExitVmsplice(int fd2, Ptr<runtime.iovec> uiov, @Unsigned long nr_segs, @Unsigned int flags, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int upid, int* stat_addr, int options, struct rusage* ru)", lastStatement="return 0;", section="fentry/__do_sys_wait4", autoAttach=true)
    default public void enterWait4(@OriginalName(value="pid_t") int upid2, Ptr<Integer> stat_addr, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int upid, int* stat_addr, int options, struct rusage* ru, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_wait4", autoAttach=true)
    default public void exitWait4(@OriginalName(value="pid_t") int upid2, Ptr<Integer> stat_addr, int options, Ptr<runtime.rusage> ru, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int upid, int* stat_addr, int options, struct rusage* ru)", lastStatement="return 0;", section="kprobe/__do_sys_wait4", autoAttach=true)
    default public void kprobeEnterWait4(@OriginalName(value="pid_t") int upid2, Ptr<Integer> stat_addr, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int upid, int* stat_addr, int options, struct rusage* ru, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_wait4", autoAttach=true)
    default public void kprobeExitWait4(@OriginalName(value="pid_t") int upid2, Ptr<Integer> stat_addr, int options, Ptr<runtime.rusage> ru, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int upid, struct siginfo* infop, int options, struct rusage* ru)", lastStatement="return 0;", section="fentry/__do_sys_waitid", autoAttach=true)
    default public void enterWaitid(int which, @OriginalName(value="pid_t") int upid2, Ptr<runtime.siginfo> infop, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, int which, int upid, struct siginfo* infop, int options, struct rusage* ru, long int ret)", lastStatement="return 0;", section="fexit/__do_sys_waitid", autoAttach=true)
    default public void exitWaitid(int which, @OriginalName(value="pid_t") int upid2, Ptr<runtime.siginfo> infop, int options, Ptr<runtime.rusage> ru, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, int which, int upid, struct siginfo* infop, int options, struct rusage* ru)", lastStatement="return 0;", section="kprobe/__do_sys_waitid", autoAttach=true)
    default public void kprobeEnterWaitid(int which, @OriginalName(value="pid_t") int upid2, Ptr<runtime.siginfo> infop, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, int which, int upid, struct siginfo* infop, int options, struct rusage* ru, long int ret)", lastStatement="return 0;", section="kretprobe/__do_sys_waitid", autoAttach=true)
    default public void kprobeExitWaitid(int which, @OriginalName(value="pid_t") int upid2, Ptr<runtime.siginfo> infop, int options, Ptr<runtime.rusage> ru, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags)", lastStatement="return 0;", section="fentry/do_writev", autoAttach=true)
    default public void enterWritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_PROG($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags, long int ret)", lastStatement="return 0;", section="fexit/do_writev", autoAttach=true)
    default public void exitWritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags)", lastStatement="return 0;", section="kprobe/do_writev", autoAttach=true)
    default public void kprobeEnterWritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="int BPF_KRETPROBE($name, long unsigned int fd, const struct iovec* vec, long unsigned int vlen, int flags, long int ret)", lastStatement="return 0;", section="kretprobe/do_writev", autoAttach=true)
    default public void kprobeExitWritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }
}

