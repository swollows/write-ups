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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.X86Definitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KernelDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __kernel_physical_mapping_init(@Unsigned long paddr_start, @Unsigned long paddr_end, @Unsigned long page_size_mask,  @OriginalName(value="pgprot_t") runtime.pgprot prot, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kernel_text_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_accept(Ptr<runtime.socket> sock2, Ptr<Ptr<runtime.socket>> newsock, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addrlen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_file_open((const struct path*)$arg1, $arg2, (const struct cred*)$arg3)")
    public static Ptr<runtime.file> kernel_file_open(Ptr<runtime.path> path2, int flags, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_getpeername(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_getsockname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_ident_mapping_free(Ptr<X86Definitions.x86_mapping_info> info2, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_ident_mapping_init(Ptr<X86Definitions.x86_mapping_info> info2, Ptr<misc.pgd_t> pgd_page, @Unsigned long pstart, @Unsigned long pend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_init(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_init_freeable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_move_pages($arg1, $arg2, (const void**)$arg3, (const int*)$arg4, $arg5, $arg6)")
    public static int kernel_move_pages(@OriginalName(value="pid_t") int pid2, @Unsigned long nr_pages, Ptr<Ptr<?>> pages, Ptr<Integer> nodes, Ptr<Integer> status, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_panic_sysctls_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_panic_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_param_lock(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_param_unlock(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kernel_physical_mapping_change(@Unsigned long paddr_start, @Unsigned long paddr_end, @Unsigned long page_size_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kernel_physical_mapping_init(@Unsigned long paddr_start, @Unsigned long paddr_end, @Unsigned long page_size_mask,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_pte_init(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_randomize_memory() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, Ptr<runtime.kvec> vec, @Unsigned long num, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, Ptr<runtime.kvec> vec, @Unsigned long num, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_sendmsg_locked(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<runtime.kvec> vec, @Unsigned long num, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kernel_sock_ip_overhead(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_sock_shutdown(Ptr<runtime.socket> sock2, SockDefinitions.sock_shutdown_cmd how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_text_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kernel_can_power_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pid_t") int kernel_clone(Ptr<kernel_clone_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_delayacct_sysctls_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_fpu_begin_mask(@Unsigned int kfpu_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_fpu_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_map_pages_in_pgd(Ptr<misc.pgd_t> pgd, @Unsigned long pfn, @Unsigned long address, @Unsigned int numpages, @Unsigned long page_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kernel_page_present(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_power_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_restart(String cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_restart_prepare(String cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_sigaction(int sig, @OriginalName(value="__sighandler_t") Ptr<?> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_thread((int (*)(void*))$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="pid_t") int kernel_thread(Ptr<?> fn, Ptr<?> arg2, String name, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_tmpfile_open($arg1, (const struct path*)$arg2, $arg3, $arg4, (const struct cred*)$arg5)")
    public static Ptr<runtime.file> kernel_tmpfile_open(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> parentpath, @Unsigned @OriginalName(value="umode_t") short mode, int open_flag, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_unmap_pages_in_pgd(Ptr<misc.pgd_t> pgd, @Unsigned long address, @Unsigned long numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kernel_poison_pages(Ptr<runtime.page> page2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __kernel_read(Ptr<runtime.file> file2, Ptr<?> buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kernel_unpoison_pages(Ptr<runtime.page> page2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kernel_write($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long __kernel_write(Ptr<runtime.file> file2, Ptr<?> buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __kernel_write_iter(Ptr<runtime.file> file2, Ptr<IovDefinitions.iov_iter> from, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_do_mounts_initrd_sysctls_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_execve((const u8*)$arg1, (const u8**)$arg2, (const u8**)$arg3)")
    public static int kernel_execve(String kernel_filename, Ptr<String> argv, Ptr<String> envp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_exit_sysctls_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_exit_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_get_mempolicy(Ptr<Integer> policy, Ptr<@Unsigned Long> nmask, @Unsigned long maxnode, @Unsigned long addr2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_mbind($arg1, $arg2, $arg3, (const long unsigned int*)$arg4, $arg5, $arg6)")
    public static long kernel_mbind(@Unsigned long start, @Unsigned long len, @Unsigned long mode, Ptr<@Unsigned Long> nmask, @Unsigned long maxnode, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_migrate_pages($arg1, $arg2, (const long unsigned int*)$arg3, (const long unsigned int*)$arg4)")
    public static int kernel_migrate_pages(@OriginalName(value="pid_t") int pid2, @Unsigned long maxnode, Ptr<@Unsigned Long> old_nodes, Ptr<@Unsigned Long> new_nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernel_read(Ptr<runtime.file> file2, Ptr<?> buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernel_read_file(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, Ptr<Ptr<?>> buf, @Unsigned long buf_size, Ptr<@Unsigned Long> file_size, kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernel_read_file_from_fd(int fd2, @OriginalName(value="loff_t") long offset, Ptr<Ptr<?>> buf, @Unsigned long buf_size, Ptr<@Unsigned Long> file_size, kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_read_file_from_path((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @OriginalName(value="ssize_t") long kernel_read_file_from_path(String path2, @OriginalName(value="loff_t") long offset, Ptr<Ptr<?>> buf, @Unsigned long buf_size, Ptr<@Unsigned Long> file_size, kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_read_file_from_path_initns((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @OriginalName(value="ssize_t") long kernel_read_file_from_path_initns(String path2, @OriginalName(value="loff_t") long offset, Ptr<Ptr<?>> buf, @Unsigned long buf_size, Ptr<@Unsigned Long> file_size, kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_set_mempolicy($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static long kernel_set_mempolicy(int mode, Ptr<@Unsigned Long> nmask, @Unsigned long maxnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_to_ipc64_perm(Ptr<misc.kern_ipc_perm> in, Ptr<misc.ipc64_perm> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_wait(@OriginalName(value="pid_t") int pid2, Ptr<Integer> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long kernel_wait4(@OriginalName(value="pid_t") int upid2, Ptr<Integer> stat_addr, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long kernel_waitid(int which, @OriginalName(value="pid_t") int upid2, Ptr<misc.waitid_info> infop, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_waitid_prepare(Ptr<WaitDefinitions.wait_opts> wo, int which, @OriginalName(value="pid_t") int upid2, Ptr<misc.waitid_info> infop, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernel_write($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long kernel_write(Ptr<runtime.file> file2, Ptr<?> buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_acct_sysctls_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernel_exc_vmm_communication(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_get_random(String key2, @Unsigned long key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_kexec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_setlease(Ptr<runtime.file> filp, int arg2, Ptr<Ptr<FileDefinitions.file_lease>> lease, Ptr<Ptr<?>> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_termios_to_user_termio(Ptr<runtime.termio> termio2, Ptr<runtime.ktermios> termios3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_termios_to_user_termios(Ptr<runtime.termios2> u, Ptr<runtime.ktermios> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernel_termios_to_user_termios_1(Ptr<runtime.termios> u, Ptr<runtime.ktermios> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_sock_timeval")
    @NotUsableInJava
    public static class __kernel_sock_timeval
    extends Struct {
        public long tv_sec;
        public long tv_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int fds_bits[16]; }")
    @NotUsableInJava
    public static class __kernel_fd_set
    extends Struct {
        public @Unsigned long @Size(value=16) [] fds_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_old_itimerval")
    @NotUsableInJava
    public static class __kernel_old_itimerval
    extends Struct {
        public __kernel_old_timeval it_interval;
        public __kernel_old_timeval it_value;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_old_timespec")
    @NotUsableInJava
    public static class __kernel_old_timespec
    extends Struct {
        public @OriginalName(value="__kernel_old_time_t") long tv_sec;
        public long tv_nsec;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_old_timeval")
    @NotUsableInJava
    public static class __kernel_old_timeval
    extends Struct {
        public @OriginalName(value="__kernel_long_t") long tv_sec;
        public @OriginalName(value="__kernel_long_t") long tv_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_ethtool_ts_info")
    @NotUsableInJava
    public static class kernel_ethtool_ts_info
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int so_timestamping;
        public int phc_index;
        public misc.hwtstamp_tx_types tx_types;
        public misc.hwtstamp_rx_filters rx_filters;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_ethtool_coalesce")
    @NotUsableInJava
    public static class kernel_ethtool_coalesce
    extends Struct {
        public char use_cqe_mode_tx;
        public char use_cqe_mode_rx;
        public @Unsigned int tx_aggr_max_bytes;
        public @Unsigned int tx_aggr_max_frames;
        public @Unsigned int tx_aggr_time_usecs;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_ethtool_ringparam")
    @NotUsableInJava
    public static class kernel_ethtool_ringparam
    extends Struct {
        public @Unsigned int rx_buf_len;
        public char tcp_data_split;
        public char tx_push;
        public char rx_push;
        public @Unsigned int cqe_size;
        public @Unsigned int tx_push_buf_len;
        public @Unsigned int tx_push_buf_max_len;
    }

    @Type(noCCodeGeneration=true, cType="enum kernel_load_data_id")
    public static enum kernel_load_data_id implements Enum<kernel_load_data_id>,
    TypedEnum<kernel_load_data_id, Integer>
    {
        LOADING_UNKNOWN,
        LOADING_FIRMWARE,
        LOADING_MODULE,
        LOADING_KEXEC_IMAGE,
        LOADING_KEXEC_INITRAMFS,
        LOADING_POLICY,
        LOADING_X509_CERTIFICATE,
        LOADING_MAX_ID;

    }

    @Type(noCCodeGeneration=true, cType="enum kernel_read_file_id")
    public static enum kernel_read_file_id implements Enum<kernel_read_file_id>,
    TypedEnum<kernel_read_file_id, Integer>
    {
        READING_UNKNOWN,
        READING_FIRMWARE,
        READING_MODULE,
        READING_KEXEC_IMAGE,
        READING_KEXEC_INITRAMFS,
        READING_POLICY,
        READING_X509_CERTIFICATE,
        READING_MAX_ID;

    }

    @Type(noCCodeGeneration=true, cType="enum kernel_pkey_operation")
    public static enum kernel_pkey_operation implements Enum<kernel_pkey_operation>,
    TypedEnum<kernel_pkey_operation, Integer>
    {
        kernel_pkey_encrypt,
        kernel_pkey_decrypt,
        kernel_pkey_sign,
        kernel_pkey_verify;

    }

    @Type(noCCodeGeneration=true, cType="struct kernel_pkey_query")
    @NotUsableInJava
    public static class kernel_pkey_query
    extends Struct {
        public @Unsigned int supported_ops;
        public @Unsigned int key_size;
        public @Unsigned short max_data_size;
        public @Unsigned short max_sig_size;
        public @Unsigned short max_enc_size;
        public @Unsigned short max_dec_size;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_pkey_params")
    @NotUsableInJava
    public static class kernel_pkey_params
    extends Struct {
        public Ptr<runtime.key> key;
        public String encoding;
        public String hash_algo;
        public String info;
        public @Unsigned int in_len;
        @InlineUnion(value=9220)
        public @InlineUnion(value=9220) @Unsigned int out_len;
        @InlineUnion(value=9220)
        public @InlineUnion(value=9220) @Unsigned int in2_len;
        public kernel_pkey_operation op;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_sockaddr_storage")
    @NotUsableInJava
    public static class __kernel_sockaddr_storage
    extends Struct {
        @InlineUnion(value=8124)
        public  @InlineUnion(value=8124) AnonDefinitions.anon_member_of_anon_member_of___kernel_sockaddr_storage anon0$0;
        @InlineUnion(value=8124)
        public @InlineUnion(value=8124) Ptr<?> __align;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_clone_args")
    @NotUsableInJava
    public static class kernel_clone_args
    extends Struct {
        public @Unsigned long flags;
        public Ptr<Integer> pidfd;
        public Ptr<Integer> child_tid;
        public Ptr<Integer> parent_tid;
        public String name;
        public int exit_signal;
        public @Unsigned int kthread;
        public @Unsigned int io_thread;
        public @Unsigned int user_worker;
        public @Unsigned int no_files;
        public @Unsigned long stack;
        public @Unsigned long stack_size;
        public @Unsigned long tls;
        public Ptr<@OriginalName(value="pid_t") Integer> set_tid;
        public @Unsigned long set_tid_size;
        public int cgroup;
        public int idle;
        public Ptr<?> fn;
        public Ptr<?> fn_arg;
        public Ptr<runtime.cgroup> cgrp;
        public Ptr<CssDefinitions.css_set> cset;
    }

    @Type(noCCodeGeneration=true, cType="struct { int val[2]; }")
    @NotUsableInJava
    public static class __kernel_fsid_t
    extends Struct {
        public int @Size(value=2) [] val;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_itimerspec")
    @NotUsableInJava
    public static class __kernel_itimerspec
    extends Struct {
        public __kernel_timespec it_interval;
        public __kernel_timespec it_value;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_timex")
    @NotUsableInJava
    public static class __kernel_timex
    extends Struct {
        public @Unsigned int modes;
        public long offset;
        public long freq;
        public long maxerror;
        public long esterror;
        public int status;
        public long constant;
        public long precision;
        public long tolerance;
        public __kernel_timex_timeval time;
        public long tick;
        public long ppsfreq;
        public long jitter;
        public int shift;
        public long stabil;
        public long jitcnt;
        public long calcnt;
        public long errcnt;
        public long stbcnt;
        public int tai;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_timex_timeval")
    @NotUsableInJava
    public static class __kernel_timex_timeval
    extends Struct {
        public @OriginalName(value="__kernel_time64_t") long tv_sec;
        public long tv_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_cpustat")
    @NotUsableInJava
    public static class kernel_cpustat
    extends Struct {
        public @Unsigned long @Size(value=11) [] cpustat;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_hwtstamp_config")
    @NotUsableInJava
    public static class kernel_hwtstamp_config
    extends Struct {
        public int flags;
        public int tx_type;
        public int rx_filter;
        public Ptr<runtime.ifreq> ifr;
        public boolean copied_to_user;
        public misc.hwtstamp_source source;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_stat")
    @NotUsableInJava
    public static class kernel_stat
    extends Struct {
        public @Unsigned long irqs_sum;
        public @Unsigned int @Size(value=10) [] softirqs;
    }

    @Type(noCCodeGeneration=true, cType="enum kernel_gp_hint")
    public static enum kernel_gp_hint implements Enum<kernel_gp_hint>,
    TypedEnum<kernel_gp_hint, Integer>
    {
        GP_NO_HINT,
        GP_NON_CANONICAL,
        GP_CANONICAL;

    }

    @Type(noCCodeGeneration=true, cType="struct kernel_vm86_regs")
    @NotUsableInJava
    public static class kernel_vm86_regs
    extends Struct {
        public PtDefinitions.pt_regs pt;
        public @Unsigned short es;
        public @Unsigned short __esh;
        public @Unsigned short ds;
        public @Unsigned short __dsh;
        public @Unsigned short fs;
        public @Unsigned short __fsh;
        public @Unsigned short gs;
        public @Unsigned short __gsh;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_symbol")
    @NotUsableInJava
    public static class kernel_symbol
    extends Struct {
        public int value_offset;
        public int name_offset;
        public int namespace_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_param")
    @NotUsableInJava
    public static class kernel_param
    extends Struct {
        public String name;
        public Ptr<runtime.module> mod;
        public Ptr<kernel_param_ops> ops;
        public @Unsigned short perm;
        public @OriginalName(value="s8") byte level;
        public char flags;
        @InlineUnion(value=1492)
        public @InlineUnion(value=1492) Ptr<?> arg;
        @InlineUnion(value=1492)
        public @InlineUnion(value=1492) Ptr<misc.kparam_string> str;
        @InlineUnion(value=1492)
        public @InlineUnion(value=1492) Ptr<misc.kparam_array> arr;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int val; }")
    @NotUsableInJava
    public static class kernel_cap_t
    extends Struct {
        public @Unsigned long val;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_param_ops")
    @NotUsableInJava
    public static class kernel_param_ops
    extends Struct {
        public @Unsigned int flags;
        public Ptr<?> set;
        public Ptr<?> get;
        public Ptr<?> free;
    }

    @Type(noCCodeGeneration=true, cType="struct kernel_siginfo")
    @NotUsableInJava
    public static class kernel_siginfo
    extends Struct {
        public AnonDefinitions.anon_member_of_anon_member_of_siginfo_and_anon_member_of_siginfo_t_and_anon_member_of_kernel_siginfo_and_anon_member_of_kernel_siginfo_t anon0;
    }

    @Type(noCCodeGeneration=true, cType="struct __kernel_timespec")
    @NotUsableInJava
    public static class __kernel_timespec
    extends Struct {
        public @OriginalName(value="__kernel_time64_t") long tv_sec;
        public long tv_nsec;
    }
}

