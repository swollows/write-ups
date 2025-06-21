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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.ParamDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TomoyoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_audit_inet_log(Ptr<tomoyo_request_info> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_inet_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_inet_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_inet_address((const struct sockaddr*)$arg1, (const unsigned int)$arg2, (const short unsigned int)$arg3, $arg4)")
    public static int tomoyo_check_inet_address(Ptr<runtime.sockaddr> addr2, @Unsigned int addr_len, @Unsigned short port2, Ptr<tomoyo_addr_info> address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_unix_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_unix_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_collect_entry() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tomoyo_condition> tomoyo_commit_condition(Ptr<tomoyo_condition> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_convert_time(@OriginalName(value="time64_t") long time64, Ptr<tomoyo_time> stamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_correct_domain((const u8*)$arg1)")
    public static boolean tomoyo_correct_domain(String domainname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_correct_path((const u8*)$arg1)")
    public static boolean tomoyo_correct_path(String filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_correct_path2((const u8*)$arg1, (const long unsigned int)$arg2)")
    public static boolean tomoyo_correct_path2(String filename2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_correct_word((const u8*)$arg1)")
    public static boolean tomoyo_correct_word(String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_correct_word2((const u8*)$arg1, $arg2)")
    public static boolean tomoyo_correct_word2(String string, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_del_acl(Ptr<ListDefinitions.list_head> element) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_del_condition(Ptr<ListDefinitions.list_head> element) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_domain_def((const u8*)$arg1)")
    public static boolean tomoyo_domain_def(String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_domain_quota_is_ok(Ptr<tomoyo_request_info> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_file_matches_pattern((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static boolean tomoyo_file_matches_pattern(String filename2, String filename_end, String pattern, String pattern_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_file_matches_pattern2((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static boolean tomoyo_file_matches_pattern2(String filename2, String filename_end, String pattern, String pattern_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_fill_path_info(Ptr<tomoyo_path_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_find_domain((const u8*)$arg1)")
    public static Ptr<tomoyo_domain_info> tomoyo_find_domain(String domainname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_gc_thread(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_get_attributes(Ptr<tomoyo_obj_info> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tomoyo_condition> tomoyo_get_condition(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tomoyo_path_info*)tomoyo_get_domainname($arg1))")
    public static Ptr<tomoyo_path_info> tomoyo_get_domainname(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tomoyo_path_info*)tomoyo_get_dqword($arg1))")
    public static Ptr<tomoyo_path_info> tomoyo_get_dqword(String start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)tomoyo_get_exe())")
    public static String tomoyo_get_exe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_get_mode((const struct tomoyo_policy_namespace*)$arg1, (const u8)$arg2, (const u8)$arg3)")
    public static int tomoyo_get_mode(Ptr<tomoyo_policy_namespace> ns, char profile, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_init_request_info($arg1, $arg2, (const u8)$arg3)")
    public static int tomoyo_init_request_info(Ptr<tomoyo_request_info> r, Ptr<tomoyo_domain_info> domain, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_merge_inet_acl($arg1, $arg2, (const _Bool)$arg3)")
    public static boolean tomoyo_merge_inet_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_merge_unix_acl($arg1, $arg2, (const _Bool)$arg3)")
    public static boolean tomoyo_merge_unix_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_name_used_by_io_buffer((const u8*)$arg1)")
    public static boolean tomoyo_name_used_by_io_buffer(String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_normalize_line(String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_notify_gc($arg1, (const _Bool)$arg2)")
    public static void tomoyo_notify_gc(Ptr<tomoyo_io_buffer> head, boolean is_register) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_parse_ipaddr_union(Ptr<tomoyo_acl_param> param2, Ptr<tomoyo_ipaddr_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_parse_name_union(Ptr<tomoyo_acl_param> param2, Ptr<tomoyo_name_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_parse_number_union(Ptr<tomoyo_acl_param> param2, Ptr<tomoyo_number_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char tomoyo_parse_ulong(Ptr<@Unsigned Long> result, Ptr<String> str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_matches_pattern((const struct tomoyo_path_info*)$arg1, (const struct tomoyo_path_info*)$arg2)")
    public static boolean tomoyo_path_matches_pattern(Ptr<tomoyo_path_info> filename2, Ptr<tomoyo_path_info> pattern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_matches_pattern2((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean tomoyo_path_matches_pattern2(String f, String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_permstr((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean tomoyo_permstr(String string, String keyword) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_ip($arg1, (const unsigned int)$arg2, (const struct tomoyo_ipaddr_union*)$arg3)")
    public static void tomoyo_print_ip(String buf, @Unsigned int size, Ptr<tomoyo_ipaddr_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_ipv6($arg1, (const unsigned int)$arg2, (const struct in6_addr*)$arg3, (const struct in6_addr*)$arg4)")
    public static void tomoyo_print_ipv6(String buffer, @Unsigned int buffer_len, Ptr<In6Definitions.in6_addr> min_ip, Ptr<In6Definitions.in6_addr> max_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_ulong($arg1, (const int)$arg2, (const long unsigned int)$arg3, (const u8)$arg4)")
    public static void tomoyo_print_ulong(String buffer, int buffer_len, @Unsigned long value, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String tomoyo_read_token(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_unlock(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_inet_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_inet_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_number_union((const struct tomoyo_number_union*)$arg1, (const struct tomoyo_number_union*)$arg2)")
    public static boolean tomoyo_same_number_union(Ptr<tomoyo_number_union> a, Ptr<tomoyo_number_union> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_unix_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_unix_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_scan_bprm($arg1, (const short unsigned int)$arg2, (const struct tomoyo_argv*)$arg3, (const short unsigned int)$arg4, (const struct tomoyo_envp*)$arg5)")
    public static boolean tomoyo_scan_bprm(Ptr<tomoyo_execve> ee, @Unsigned short argc, Ptr<tomoyo_argv> argv, @Unsigned short envc, Ptr<tomoyo_envp> envp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_bind_permission(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_connect_permission(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_listen_permission(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_sendmsg_permission(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_str_starts($arg1, (const u8*)$arg2)")
    public static boolean tomoyo_str_starts(Ptr<String> src, String find) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_try_to_gc((const enum tomoyo_policy_id)$arg1, $arg2)")
    public static void tomoyo_try_to_gc(tomoyo_policy_id type2, Ptr<ListDefinitions.list_head> element) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_unix_entry((const struct tomoyo_addr_info*)$arg1)")
    public static int tomoyo_unix_entry(Ptr<tomoyo_addr_info> address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_inet_network(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_unix_network(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_env_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_env_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_task_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_task_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_commit_ok($arg1, (const unsigned int)$arg2)")
    public static Ptr<?> tomoyo_commit_ok(Ptr<?> data, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_create_entry((const u8*)$arg1, (const short unsigned int)$arg2, $arg3, (const u8)$arg4)")
    public static void tomoyo_create_entry(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_env_perm($arg1, (const u8*)$arg2)")
    public static int tomoyo_env_perm(Ptr<tomoyo_request_info> r, String env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_get_group($arg1, (const u8)$arg2)")
    public static Ptr<tomoyo_group> tomoyo_get_group(Ptr<tomoyo_acl_param> param2, char idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tomoyo_path_info*)tomoyo_get_name((const u8*)$arg1))")
    public static Ptr<tomoyo_path_info> tomoyo_get_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_init_log($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static String tomoyo_init_log(Ptr<tomoyo_request_info> r, int len, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_initerface_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_memory_ok(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_mm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tomoyo_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tomoyo_poll_log(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String tomoyo_print_bprm(Ptr<LinuxDefinitions.linux_binprm> bprm, Ptr<tomoyo_page_dump> dump) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String tomoyo_print_header(Ptr<tomoyo_request_info> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tomoyo_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_log(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tomoyo_read_self(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_env_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_env_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_warn_oom((const u8*)$arg1)")
    public static void tomoyo_warn_oom(String function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long tomoyo_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_log($arg1, (const u8*)$arg2, $arg3_)")
    public static void tomoyo_write_log(Ptr<tomoyo_request_info> r, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_log2($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void tomoyo_write_log2(Ptr<tomoyo_request_info> r, int len, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_misc(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_self($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long tomoyo_write_self(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_address_matches_group((const _Bool)$arg1, (const unsigned int*)$arg2, (const struct tomoyo_group*)$arg3)")
    public static boolean tomoyo_address_matches_group(boolean is_ipv6, Ptr<@Unsigned @OriginalName(value="__be32") Integer> address, Ptr<tomoyo_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_assign_domain((const u8*)$arg1, (const _Bool)$arg2)")
    public static Ptr<tomoyo_domain_info> tomoyo_assign_domain(String domainname, boolean transit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_assign_namespace((const u8*)$arg1)")
    public static Ptr<tomoyo_policy_namespace> tomoyo_assign_namespace(String domainname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_acl($arg1, (_Bool (*)(struct tomoyo_request_info*, const struct tomoyo_acl_info*))$arg2)")
    public static void tomoyo_check_acl(Ptr<tomoyo_request_info> r, Ptr<?> check_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_dump_page(Ptr<LinuxDefinitions.linux_binprm> bprm, @Unsigned long pos, Ptr<tomoyo_page_dump> dump) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_encode((const u8*)$arg1)")
    public static String tomoyo_encode(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_encode2((const u8*)$arg1, $arg2)")
    public static String tomoyo_encode2(String str, int str_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_environ(Ptr<tomoyo_execve> ee) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_find_namespace((const u8*)$arg1, (const unsigned int)$arg2)")
    public static Ptr<tomoyo_policy_namespace> tomoyo_find_namespace(String name, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_find_next_domain(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_get_local_path($arg1, (const u8*)$arg2, (const int)$arg3)")
    public static String tomoyo_get_local_path(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_load_policy((const u8*)$arg1)")
    public static void tomoyo_load_policy(String filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_loader_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_number_matches_group((const long unsigned int)$arg1, (const long unsigned int)$arg2, (const struct tomoyo_group*)$arg3)")
    public static boolean tomoyo_number_matches_group(@Unsigned long min, @Unsigned long max, Ptr<tomoyo_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tomoyo_path_info*)tomoyo_path_matches_group((const struct tomoyo_path_info*)$arg1, (const struct tomoyo_group*)$arg2))")
    public static Ptr<tomoyo_path_info> tomoyo_path_matches_group(Ptr<tomoyo_path_info> pathname, Ptr<tomoyo_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_realpath_from_path((const struct path*)$arg1)")
    public static String tomoyo_realpath_from_path(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_realpath_nofollow((const u8*)$arg1)")
    public static String tomoyo_realpath_nofollow(String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_address_group((const struct tomoyo_acl_head*)$arg1, (const struct tomoyo_acl_head*)$arg2)")
    public static boolean tomoyo_same_address_group(Ptr<tomoyo_acl_head> a, Ptr<tomoyo_acl_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_aggregator((const struct tomoyo_acl_head*)$arg1, (const struct tomoyo_acl_head*)$arg2)")
    public static boolean tomoyo_same_aggregator(Ptr<tomoyo_acl_head> a, Ptr<tomoyo_acl_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_number_group((const struct tomoyo_acl_head*)$arg1, (const struct tomoyo_acl_head*)$arg2)")
    public static boolean tomoyo_same_number_group(Ptr<tomoyo_acl_head> a, Ptr<tomoyo_acl_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_path_group((const struct tomoyo_acl_head*)$arg1, (const struct tomoyo_acl_head*)$arg2)")
    public static boolean tomoyo_same_path_group(Ptr<tomoyo_acl_head> a, Ptr<tomoyo_acl_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_transition_control((const struct tomoyo_acl_head*)$arg1, (const struct tomoyo_acl_head*)$arg2)")
    public static boolean tomoyo_same_transition_control(Ptr<tomoyo_acl_head> a, Ptr<tomoyo_acl_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_trigger_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_update_domain($arg1, (const int)$arg2, $arg3, (_Bool (*)(const struct tomoyo_acl_info*, const struct tomoyo_acl_info*))$arg4, (_Bool (*)(struct tomoyo_acl_info*, struct tomoyo_acl_info*, const _Bool))$arg5)")
    public static int tomoyo_update_domain(Ptr<tomoyo_acl_info> new_entry, int size, Ptr<tomoyo_acl_param> param2, Ptr<?> check_duplicate, Ptr<?> merge_duplicate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_update_policy($arg1, (const int)$arg2, $arg3, (_Bool (*)(const struct tomoyo_acl_head*, const struct tomoyo_acl_head*))$arg4)")
    public static int tomoyo_update_policy(Ptr<tomoyo_acl_head> new_entry, int size, Ptr<tomoyo_acl_param> param2, Ptr<?> check_duplicate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_aggregator(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_group($arg1, (const u8)$arg2)")
    public static int tomoyo_write_group(Ptr<tomoyo_acl_param> param2, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_transition_control($arg1, (const u8)$arg2)")
    public static int tomoyo_write_transition_control(Ptr<tomoyo_acl_param> param2, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_add_entry(Ptr<tomoyo_domain_info> domain, String header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_add_slash(Ptr<tomoyo_path_info> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_addprintf($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void tomoyo_addprintf(String buffer, int len, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_bprm_check_security(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_bprm_committed_creds((const struct linux_binprm*)$arg1)")
    public static void tomoyo_bprm_committed_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_bprm_creds_for_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_mkdev_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_mkdev_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_mount_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_mount_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_open_permission($arg1, (const struct path*)$arg2, (const int)$arg3)")
    public static int tomoyo_check_open_permission(Ptr<tomoyo_domain_info> domain, Ptr<runtime.path> path2, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_path2_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_path2_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_path_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_path_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_check_path_number_acl($arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_check_path_number_acl(Ptr<tomoyo_request_info> r, Ptr<tomoyo_acl_info> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_check_profile() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_close_control(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tomoyo_path_info*)tomoyo_compare_name_union((const struct tomoyo_path_info*)$arg1, (const struct tomoyo_name_union*)$arg2))")
    public static Ptr<tomoyo_path_info> tomoyo_compare_name_union(Ptr<tomoyo_path_info> name, Ptr<tomoyo_name_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_compare_number_union((const long unsigned int)$arg1, (const struct tomoyo_number_union*)$arg2)")
    public static boolean tomoyo_compare_number_union(@Unsigned long value, Ptr<tomoyo_number_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_cred_prepare($arg1, (const struct cred*)$arg2, $arg3)")
    public static int tomoyo_cred_prepare(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tomoyo_domain_info> tomoyo_domain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_execute_permission($arg1, (const struct tomoyo_path_info*)$arg2)")
    public static int tomoyo_execute_permission(Ptr<tomoyo_request_info> r, Ptr<tomoyo_path_info> filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_file_fcntl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_file_open(Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_file_truncate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_find_yesno((const u8*)$arg1, (const u8*)$arg2)")
    public static @OriginalName(value="s8") byte tomoyo_find_yesno(String string, String find) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_flush(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_init_policy_namespace(Ptr<tomoyo_policy_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_inode_getattr((const struct path*)$arg1)")
    public static int tomoyo_inode_getattr(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_io_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void tomoyo_io_printf(Ptr<tomoyo_io_buffer> head, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_load_builtin_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_merge_mkdev_acl($arg1, $arg2, (const _Bool)$arg3)")
    public static boolean tomoyo_merge_mkdev_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_merge_path2_acl($arg1, $arg2, (const _Bool)$arg3)")
    public static boolean tomoyo_merge_path2_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_merge_path_acl($arg1, $arg2, (const _Bool)$arg3)")
    public static boolean tomoyo_merge_path_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_merge_path_number_acl($arg1, $arg2, (const _Bool)$arg3)")
    public static boolean tomoyo_merge_path_number_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_mkdev_perm((const u8)$arg1, (const struct path*)$arg2, (const unsigned int)$arg3, $arg4)")
    public static int tomoyo_mkdev_perm(char operation, Ptr<runtime.path> path2, @Unsigned int mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_mount_permission((const u8*)$arg1, (const struct path*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int tomoyo_mount_permission(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_open_control((const u8)$arg1, $arg2)")
    public static int tomoyo_open_control(char type2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_parse_policy(Ptr<tomoyo_io_buffer> head, String line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path2_perm((const u8)$arg1, (const struct path*)$arg2, (const struct path*)$arg3)")
    public static int tomoyo_path2_perm(char operation, Ptr<runtime.path> path1, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_chmod((const struct path*)$arg1, $arg2)")
    public static int tomoyo_path_chmod(Ptr<runtime.path> path2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_chown((const struct path*)$arg1, $arg2, $arg3)")
    public static int tomoyo_path_chown(Ptr<runtime.path> path2, misc.kuid_t uid, misc.kgid_t gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_chroot((const struct path*)$arg1)")
    public static int tomoyo_path_chroot(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_link($arg1, (const struct path*)$arg2, $arg3)")
    public static int tomoyo_path_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_mkdir((const struct path*)$arg1, $arg2, $arg3)")
    public static int tomoyo_path_mkdir(Ptr<runtime.path> parent, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_mknod((const struct path*)$arg1, $arg2, $arg3, $arg4)")
    public static int tomoyo_path_mknod(Ptr<runtime.path> parent, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_number_perm((const u8)$arg1, (const struct path*)$arg2, $arg3)")
    public static int tomoyo_path_number_perm(char type2, Ptr<runtime.path> path2, @Unsigned long number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_perm((const u8)$arg1, (const struct path*)$arg2, (const u8*)$arg3)")
    public static int tomoyo_path_perm(char operation, Ptr<runtime.path> path2, String target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_permission($arg1, $arg2, (const struct tomoyo_path_info*)$arg3)")
    public static int tomoyo_path_permission(Ptr<tomoyo_request_info> r, char operation, Ptr<tomoyo_path_info> filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_rename((const struct path*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const unsigned int)$arg5)")
    public static int tomoyo_path_rename(Ptr<runtime.path> old_parent, Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_parent, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_rmdir((const struct path*)$arg1, $arg2)")
    public static int tomoyo_path_rmdir(Ptr<runtime.path> parent, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_symlink((const struct path*)$arg1, $arg2, (const u8*)$arg3)")
    public static int tomoyo_path_symlink(Ptr<runtime.path> parent, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_truncate((const struct path*)$arg1)")
    public static int tomoyo_path_truncate(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_path_unlink((const struct path*)$arg1, $arg2)")
    public static int tomoyo_path_unlink(Ptr<runtime.path> parent, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tomoyo_poll_control(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tomoyo_poll_query(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_condition($arg1, (const struct tomoyo_condition*)$arg2)")
    public static boolean tomoyo_print_condition(Ptr<tomoyo_io_buffer> head, Ptr<tomoyo_condition> cond) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tomoyo_print_entry(Ptr<tomoyo_io_buffer> head, Ptr<tomoyo_acl_info> acl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_name_union($arg1, (const struct tomoyo_name_union*)$arg2)")
    public static void tomoyo_print_name_union(Ptr<tomoyo_io_buffer> head, Ptr<tomoyo_name_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_number_union($arg1, (const struct tomoyo_number_union*)$arg2)")
    public static void tomoyo_print_number_union(Ptr<tomoyo_io_buffer> head, Ptr<tomoyo_number_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_print_number_union_nospace($arg1, (const struct tomoyo_number_union*)$arg2)")
    public static void tomoyo_print_number_union_nospace(Ptr<tomoyo_io_buffer> head, Ptr<tomoyo_number_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_put_name_union(Ptr<tomoyo_name_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_put_number_union(Ptr<tomoyo_number_union> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_read_control($arg1, $arg2, (const int)$arg3)")
    public static @OriginalName(value="ssize_t") long tomoyo_read_control(Ptr<tomoyo_io_buffer> head, String buffer, int buffer_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_domain(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_exception(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_read_group($arg1, (const int)$arg2)")
    public static boolean tomoyo_read_group(Ptr<tomoyo_io_buffer> head, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_manager(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_pid(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_profile(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_query(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_stat(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_read_version(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_manager((const struct tomoyo_acl_head*)$arg1, (const struct tomoyo_acl_head*)$arg2)")
    public static boolean tomoyo_same_manager(Ptr<tomoyo_acl_head> a, Ptr<tomoyo_acl_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_mkdev_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_mkdev_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_mount_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_mount_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_path2_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_path2_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_path_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_path_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_path_number_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_path_number_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_same_task_acl((const struct tomoyo_acl_info*)$arg1, (const struct tomoyo_acl_info*)$arg2)")
    public static boolean tomoyo_same_task_acl(Ptr<tomoyo_acl_info> a, Ptr<tomoyo_acl_info> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_sb_mount((const u8*)$arg1, (const struct path*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int tomoyo_sb_mount(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_sb_pivotroot((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int tomoyo_sb_pivotroot(Ptr<runtime.path> old_path, Ptr<runtime.path> new_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_sb_umount(Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_select_domain($arg1, (const u8*)$arg2)")
    public static boolean tomoyo_select_domain(Ptr<tomoyo_io_buffer> head, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_set_group($arg1, (const u8*)$arg2)")
    public static void tomoyo_set_group(Ptr<tomoyo_io_buffer> head, String category) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_set_mode($arg1, (const u8*)$arg2, $arg3)")
    public static int tomoyo_set_mode(String name, String value, Ptr<tomoyo_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_socket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_supervisor($arg1, (const u8*)$arg2, $arg3_)")
    public static int tomoyo_supervisor(Ptr<tomoyo_request_info> r, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_task_alloc(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tomoyo_task_free(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_truncate(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_update_mkdev_acl((const u8)$arg1, $arg2)")
    public static int tomoyo_update_mkdev_acl(char perm, Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_update_mount_acl(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_update_stat((const u8)$arg1)")
    public static void tomoyo_update_stat(char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_answer(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_control($arg1, (const u8*)$arg2, (const int)$arg3)")
    public static @OriginalName(value="ssize_t") long tomoyo_write_control(Ptr<tomoyo_io_buffer> head, String buffer, int buffer_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_domain(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tomoyo_write_domain2($arg1, $arg2, $arg3, (const _Bool)$arg4)")
    public static int tomoyo_write_domain2(Ptr<tomoyo_policy_namespace> ns, Ptr<ListDefinitions.list_head> list, String data, boolean is_delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_exception(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_file(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_manager(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_pid(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_profile(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_stat(Ptr<tomoyo_io_buffer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tomoyo_write_task(Ptr<tomoyo_acl_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_log")
    @NotUsableInJava
    public static class tomoyo_log
    extends Struct {
        public ListDefinitions.list_head list;
        public String log;
        public int size;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_addr_info")
    @NotUsableInJava
    public static class tomoyo_addr_info
    extends Struct {
        public char protocol;
        public char operation;
        public tomoyo_inet_addr_info inet;
        public tomoyo_unix_addr_info unix0;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_unix_addr_info")
    @NotUsableInJava
    public static class tomoyo_unix_addr_info
    extends Struct {
        public Ptr<Character> addr;
        public @Unsigned int addr_len;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_inet_addr_info")
    @NotUsableInJava
    public static class tomoyo_inet_addr_info
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short port;
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> address;
        public boolean is_ipv6;
    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_special_mount")
    public static enum tomoyo_special_mount implements Enum<tomoyo_special_mount>,
    TypedEnum<tomoyo_special_mount, Integer>
    {
        TOMOYO_MOUNT_BIND,
        TOMOYO_MOUNT_MOVE,
        TOMOYO_MOUNT_REMOUNT,
        TOMOYO_MOUNT_MAKE_UNBINDABLE,
        TOMOYO_MOUNT_MAKE_PRIVATE,
        TOMOYO_MOUNT_MAKE_SLAVE,
        TOMOYO_MOUNT_MAKE_SHARED,
        TOMOYO_MAX_SPECIAL_MOUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_query")
    @NotUsableInJava
    public static class tomoyo_query
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<tomoyo_domain_info> domain;
        public String query;
        public @Unsigned long query_len;
        public @Unsigned int serial;
        public char timer;
        public char answer;
        public char retry;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_task")
    @NotUsableInJava
    public static class tomoyo_task
    extends Struct {
        public Ptr<tomoyo_domain_info> domain_info;
        public Ptr<tomoyo_domain_info> old_domain_info;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_time")
    @NotUsableInJava
    public static class tomoyo_time
    extends Struct {
        public @Unsigned short year;
        public char month;
        public char day;
        public char hour;
        public char min;
        public char sec;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_profile")
    @NotUsableInJava
    public static class tomoyo_profile
    extends Struct {
        public Ptr<tomoyo_path_info> comment;
        public Ptr<tomoyo_preference> learning;
        public Ptr<tomoyo_preference> permissive;
        public Ptr<tomoyo_preference> enforcing;
        public tomoyo_preference preference;
        public char default_config;
        public char @Size(value=42) [] config;
        public @Unsigned int @Size(value=2) [] pref;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_preference")
    @NotUsableInJava
    public static class tomoyo_preference
    extends Struct {
        public @Unsigned int learning_max_entry;
        public boolean enforcing_verbose;
        public boolean learning_verbose;
        public boolean permissive_verbose;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_manager")
    @NotUsableInJava
    public static class tomoyo_manager
    extends Struct {
        public tomoyo_acl_head head;
        public Ptr<tomoyo_path_info> manager;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_aggregator")
    @NotUsableInJava
    public static class tomoyo_aggregator
    extends Struct {
        public tomoyo_acl_head head;
        public Ptr<tomoyo_path_info> original_name;
        public Ptr<tomoyo_path_info> aggregated_name;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_transition_control")
    @NotUsableInJava
    public static class tomoyo_transition_control
    extends Struct {
        public tomoyo_acl_head head;
        public char type;
        public boolean is_last_name;
        public Ptr<tomoyo_path_info> domainname;
        public Ptr<tomoyo_path_info> program;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_io_buffer")
    @NotUsableInJava
    public static class tomoyo_io_buffer
    extends Struct {
        public Ptr<?> read;
        public Ptr<?> write;
        public Ptr<?> poll;
        public runtime.mutex io_sem;
        public String read_user_buf;
        public @Unsigned long read_user_buf_avail;
        public misc.r_of_tomoyo_io_buffer r;
        public misc.w_of_tomoyo_io_buffer w;
        public String read_buf;
        public @Unsigned long readbuf_size;
        public String write_buf;
        public @Unsigned long writebuf_size;
        public tomoyo_securityfs_interface_index type;
        public char users;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_acl_param")
    @NotUsableInJava
    public static class tomoyo_acl_param
    extends Struct {
        public String data;
        public Ptr<ListDefinitions.list_head> list;
        public Ptr<tomoyo_policy_namespace> ns;
        public boolean is_delete;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_unix_acl")
    @NotUsableInJava
    public static class tomoyo_unix_acl
    extends Struct {
        public tomoyo_acl_info head;
        public char protocol;
        public char perm;
        public tomoyo_name_union name;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_inet_acl")
    @NotUsableInJava
    public static class tomoyo_inet_acl
    extends Struct {
        public tomoyo_acl_info head;
        public char protocol;
        public char perm;
        public tomoyo_ipaddr_union address;
        public tomoyo_number_union port;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_env_acl")
    @NotUsableInJava
    public static class tomoyo_env_acl
    extends Struct {
        public tomoyo_acl_info head;
        public Ptr<tomoyo_path_info> env;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_mount_acl")
    @NotUsableInJava
    public static class tomoyo_mount_acl
    extends Struct {
        public tomoyo_acl_info head;
        public tomoyo_name_union dev_name;
        public tomoyo_name_union dir_name;
        public tomoyo_name_union fs_type;
        public tomoyo_number_union flags;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_path2_acl")
    @NotUsableInJava
    public static class tomoyo_path2_acl
    extends Struct {
        public tomoyo_acl_info head;
        public char perm;
        public tomoyo_name_union name1;
        public tomoyo_name_union name2;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_mkdev_acl")
    @NotUsableInJava
    public static class tomoyo_mkdev_acl
    extends Struct {
        public tomoyo_acl_info head;
        public char perm;
        public tomoyo_name_union name;
        public tomoyo_number_union mode;
        public tomoyo_number_union major;
        public tomoyo_number_union minor;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_path_number_acl")
    @NotUsableInJava
    public static class tomoyo_path_number_acl
    extends Struct {
        public tomoyo_acl_info head;
        public char perm;
        public tomoyo_name_union name;
        public tomoyo_number_union number;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_path_acl")
    @NotUsableInJava
    public static class tomoyo_path_acl
    extends Struct {
        public tomoyo_acl_info head;
        public @Unsigned short perm;
        public tomoyo_name_union name;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_task_acl")
    @NotUsableInJava
    public static class tomoyo_task_acl
    extends Struct {
        public tomoyo_acl_info head;
        public Ptr<tomoyo_path_info> domainname;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_policy_namespace")
    @NotUsableInJava
    public static class tomoyo_policy_namespace
    extends Struct {
        public Ptr<tomoyo_profile> @Size(value=256) [] profile_ptr;
        public ListDefinitions.list_head @Size(value=3) [] group_list;
        public ListDefinitions.list_head @Size(value=11) [] policy_list;
        public ListDefinitions.list_head @Size(value=256) [] acl_group;
        public ListDefinitions.list_head namespace_list;
        public @Unsigned int profile_version;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_condition")
    @NotUsableInJava
    public static class tomoyo_condition
    extends Struct {
        public tomoyo_shared_acl_head head;
        public @Unsigned int size;
        public @Unsigned short condc;
        public @Unsigned short numbers_count;
        public @Unsigned short names_count;
        public @Unsigned short argc;
        public @Unsigned short envc;
        public char grant_log;
        public Ptr<tomoyo_path_info> transit;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_condition_element")
    @NotUsableInJava
    public static class tomoyo_condition_element
    extends Struct {
        public char left;
        public char right;
        public boolean equals;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_envp")
    @NotUsableInJava
    public static class tomoyo_envp
    extends Struct {
        public Ptr<tomoyo_path_info> name;
        public Ptr<tomoyo_path_info> value;
        public boolean is_not;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_argv")
    @NotUsableInJava
    public static class tomoyo_argv
    extends Struct {
        public @Unsigned long index;
        public Ptr<tomoyo_path_info> value;
        public boolean is_not;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_page_dump")
    @NotUsableInJava
    public static class tomoyo_page_dump
    extends Struct {
        public Ptr<runtime.page> page;
        public String data;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_mini_stat")
    @NotUsableInJava
    public static class tomoyo_mini_stat
    extends Struct {
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="dev_t") int rdev;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_address_group")
    @NotUsableInJava
    public static class tomoyo_address_group
    extends Struct {
        public tomoyo_acl_head head;
        public tomoyo_ipaddr_union address;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_number_group")
    @NotUsableInJava
    public static class tomoyo_number_group
    extends Struct {
        public tomoyo_acl_head head;
        public tomoyo_number_union number;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_path_group")
    @NotUsableInJava
    public static class tomoyo_path_group
    extends Struct {
        public tomoyo_acl_head head;
        public Ptr<tomoyo_path_info> member_name;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_ipaddr_union")
    @NotUsableInJava
    public static class tomoyo_ipaddr_union
    extends Struct {
        public In6Definitions.in6_addr @Size(value=2) [] ip;
        public Ptr<tomoyo_group> group;
        public boolean is_ipv6;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_number_union")
    @NotUsableInJava
    public static class tomoyo_number_union
    extends Struct {
        public @Unsigned long @Size(value=2) [] values;
        public Ptr<tomoyo_group> group;
        public char @Size(value=2) [] value_type;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_group")
    @NotUsableInJava
    public static class tomoyo_group
    extends Struct {
        public tomoyo_shared_acl_head head;
        public Ptr<tomoyo_path_info> group_name;
        public ListDefinitions.list_head member_list;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_name_union")
    @NotUsableInJava
    public static class tomoyo_name_union
    extends Struct {
        public Ptr<tomoyo_path_info> filename;
        public Ptr<tomoyo_group> group;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_name")
    @NotUsableInJava
    public static class tomoyo_name
    extends Struct {
        public tomoyo_shared_acl_head head;
        public tomoyo_path_info entry;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_acl_info")
    @NotUsableInJava
    public static class tomoyo_acl_info
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<tomoyo_condition> cond;
        public @OriginalName(value="s8") byte is_deleted;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_domain_info")
    @NotUsableInJava
    public static class tomoyo_domain_info
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head acl_info_list;
        public Ptr<tomoyo_path_info> domainname;
        public Ptr<tomoyo_policy_namespace> ns;
        public @Unsigned long @Size(value=4) [] group;
        public char profile;
        public boolean is_deleted;
        public boolean @Size(value=2) [] flags;
        public AtomicDefinitions.atomic_t users;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_execve")
    @NotUsableInJava
    public static class tomoyo_execve
    extends Struct {
        public tomoyo_request_info r;
        public tomoyo_obj_info obj;
        public Ptr<LinuxDefinitions.linux_binprm> bprm;
        public Ptr<tomoyo_path_info> transition;
        public tomoyo_page_dump dump;
        public String tmp;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_obj_info")
    @NotUsableInJava
    public static class tomoyo_obj_info
    extends Struct {
        public boolean validate_done;
        public boolean @Size(value=4) [] stat_valid;
        public runtime.path path1;
        public runtime.path path2;
        public tomoyo_mini_stat @Size(value=4) [] stat;
        public Ptr<tomoyo_path_info> symlink_target;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_request_info")
    @NotUsableInJava
    public static class tomoyo_request_info
    extends Struct {
        public Ptr<tomoyo_obj_info> obj;
        public Ptr<tomoyo_execve> ee;
        public Ptr<tomoyo_domain_info> domain;
        public ParamDefinitions.param_of_tomoyo_request_info param;
        public Ptr<tomoyo_acl_info> matched_acl;
        public char param_type;
        public boolean granted;
        public char retry;
        public char profile;
        public char mode;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_path_info")
    @NotUsableInJava
    public static class tomoyo_path_info
    extends Struct {
        public String name;
        public @Unsigned int hash;
        public @Unsigned short const_len;
        public boolean is_dir;
        public boolean is_patterned;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_shared_acl_head")
    @NotUsableInJava
    public static class tomoyo_shared_acl_head
    extends Struct {
        public ListDefinitions.list_head list;
        public AtomicDefinitions.atomic_t users;
    }

    @Type(noCCodeGeneration=true, cType="struct tomoyo_acl_head")
    @NotUsableInJava
    public static class tomoyo_acl_head
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="s8") byte is_deleted;
    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_pref_index")
    public static enum tomoyo_pref_index implements Enum<tomoyo_pref_index>,
    TypedEnum<tomoyo_pref_index, Integer>
    {
        TOMOYO_PREF_MAX_AUDIT_LOG,
        TOMOYO_PREF_MAX_LEARNING_ENTRY,
        TOMOYO_MAX_PREF;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_policy_stat_type")
    public static enum tomoyo_policy_stat_type implements Enum<tomoyo_policy_stat_type>,
    TypedEnum<tomoyo_policy_stat_type, Integer>
    {
        TOMOYO_STAT_POLICY_UPDATES,
        TOMOYO_STAT_POLICY_LEARNING,
        TOMOYO_STAT_POLICY_PERMISSIVE,
        TOMOYO_STAT_POLICY_ENFORCING,
        TOMOYO_MAX_POLICY_STAT;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_mac_category_index")
    public static enum tomoyo_mac_category_index implements Enum<tomoyo_mac_category_index>,
    TypedEnum<tomoyo_mac_category_index, Integer>
    {
        TOMOYO_MAC_CATEGORY_FILE,
        TOMOYO_MAC_CATEGORY_NETWORK,
        TOMOYO_MAC_CATEGORY_MISC,
        TOMOYO_MAX_MAC_CATEGORY_INDEX;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_mac_index")
    public static enum tomoyo_mac_index implements Enum<tomoyo_mac_index>,
    TypedEnum<tomoyo_mac_index, Integer>
    {
        TOMOYO_MAC_FILE_EXECUTE,
        TOMOYO_MAC_FILE_OPEN,
        TOMOYO_MAC_FILE_CREATE,
        TOMOYO_MAC_FILE_UNLINK,
        TOMOYO_MAC_FILE_GETATTR,
        TOMOYO_MAC_FILE_MKDIR,
        TOMOYO_MAC_FILE_RMDIR,
        TOMOYO_MAC_FILE_MKFIFO,
        TOMOYO_MAC_FILE_MKSOCK,
        TOMOYO_MAC_FILE_TRUNCATE,
        TOMOYO_MAC_FILE_SYMLINK,
        TOMOYO_MAC_FILE_MKBLOCK,
        TOMOYO_MAC_FILE_MKCHAR,
        TOMOYO_MAC_FILE_LINK,
        TOMOYO_MAC_FILE_RENAME,
        TOMOYO_MAC_FILE_CHMOD,
        TOMOYO_MAC_FILE_CHOWN,
        TOMOYO_MAC_FILE_CHGRP,
        TOMOYO_MAC_FILE_IOCTL,
        TOMOYO_MAC_FILE_CHROOT,
        TOMOYO_MAC_FILE_MOUNT,
        TOMOYO_MAC_FILE_UMOUNT,
        TOMOYO_MAC_FILE_PIVOT_ROOT,
        TOMOYO_MAC_NETWORK_INET_STREAM_BIND,
        TOMOYO_MAC_NETWORK_INET_STREAM_LISTEN,
        TOMOYO_MAC_NETWORK_INET_STREAM_CONNECT,
        TOMOYO_MAC_NETWORK_INET_DGRAM_BIND,
        TOMOYO_MAC_NETWORK_INET_DGRAM_SEND,
        TOMOYO_MAC_NETWORK_INET_RAW_BIND,
        TOMOYO_MAC_NETWORK_INET_RAW_SEND,
        TOMOYO_MAC_NETWORK_UNIX_STREAM_BIND,
        TOMOYO_MAC_NETWORK_UNIX_STREAM_LISTEN,
        TOMOYO_MAC_NETWORK_UNIX_STREAM_CONNECT,
        TOMOYO_MAC_NETWORK_UNIX_DGRAM_BIND,
        TOMOYO_MAC_NETWORK_UNIX_DGRAM_SEND,
        TOMOYO_MAC_NETWORK_UNIX_SEQPACKET_BIND,
        TOMOYO_MAC_NETWORK_UNIX_SEQPACKET_LISTEN,
        TOMOYO_MAC_NETWORK_UNIX_SEQPACKET_CONNECT,
        TOMOYO_MAC_ENVIRON,
        TOMOYO_MAX_MAC_INDEX;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_securityfs_interface_index")
    public static enum tomoyo_securityfs_interface_index implements Enum<tomoyo_securityfs_interface_index>,
    TypedEnum<tomoyo_securityfs_interface_index, Integer>
    {
        TOMOYO_DOMAINPOLICY,
        TOMOYO_EXCEPTIONPOLICY,
        TOMOYO_PROCESS_STATUS,
        TOMOYO_STAT,
        TOMOYO_AUDIT,
        TOMOYO_VERSION,
        TOMOYO_PROFILE,
        TOMOYO_QUERY,
        TOMOYO_MANAGER;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_path_number_acl_index")
    public static enum tomoyo_path_number_acl_index implements Enum<tomoyo_path_number_acl_index>,
    TypedEnum<tomoyo_path_number_acl_index, Integer>
    {
        TOMOYO_TYPE_CREATE,
        TOMOYO_TYPE_MKDIR,
        TOMOYO_TYPE_MKFIFO,
        TOMOYO_TYPE_MKSOCK,
        TOMOYO_TYPE_IOCTL,
        TOMOYO_TYPE_CHMOD,
        TOMOYO_TYPE_CHOWN,
        TOMOYO_TYPE_CHGRP,
        TOMOYO_MAX_PATH_NUMBER_OPERATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_path2_acl_index")
    public static enum tomoyo_path2_acl_index implements Enum<tomoyo_path2_acl_index>,
    TypedEnum<tomoyo_path2_acl_index, Integer>
    {
        TOMOYO_TYPE_LINK,
        TOMOYO_TYPE_RENAME,
        TOMOYO_TYPE_PIVOT_ROOT,
        TOMOYO_MAX_PATH2_OPERATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_network_acl_index")
    public static enum tomoyo_network_acl_index implements Enum<tomoyo_network_acl_index>,
    TypedEnum<tomoyo_network_acl_index, Integer>
    {
        TOMOYO_NETWORK_BIND,
        TOMOYO_NETWORK_LISTEN,
        TOMOYO_NETWORK_CONNECT,
        TOMOYO_NETWORK_SEND,
        TOMOYO_MAX_NETWORK_OPERATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_mkdev_acl_index")
    public static enum tomoyo_mkdev_acl_index implements Enum<tomoyo_mkdev_acl_index>,
    TypedEnum<tomoyo_mkdev_acl_index, Integer>
    {
        TOMOYO_TYPE_MKBLOCK,
        TOMOYO_TYPE_MKCHAR,
        TOMOYO_MAX_MKDEV_OPERATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_memory_stat_type")
    public static enum tomoyo_memory_stat_type implements Enum<tomoyo_memory_stat_type>,
    TypedEnum<tomoyo_memory_stat_type, Integer>
    {
        TOMOYO_MEMORY_POLICY,
        TOMOYO_MEMORY_AUDIT,
        TOMOYO_MEMORY_QUERY,
        TOMOYO_MAX_MEMORY_STAT;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_path_acl_index")
    public static enum tomoyo_path_acl_index implements Enum<tomoyo_path_acl_index>,
    TypedEnum<tomoyo_path_acl_index, Integer>
    {
        TOMOYO_TYPE_EXECUTE,
        TOMOYO_TYPE_READ,
        TOMOYO_TYPE_WRITE,
        TOMOYO_TYPE_APPEND,
        TOMOYO_TYPE_UNLINK,
        TOMOYO_TYPE_GETATTR,
        TOMOYO_TYPE_RMDIR,
        TOMOYO_TYPE_TRUNCATE,
        TOMOYO_TYPE_SYMLINK,
        TOMOYO_TYPE_CHROOT,
        TOMOYO_TYPE_UMOUNT,
        TOMOYO_MAX_PATH_OPERATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_acl_entry_type_index")
    public static enum tomoyo_acl_entry_type_index implements Enum<tomoyo_acl_entry_type_index>,
    TypedEnum<tomoyo_acl_entry_type_index, Integer>
    {
        TOMOYO_TYPE_PATH_ACL,
        TOMOYO_TYPE_PATH2_ACL,
        TOMOYO_TYPE_PATH_NUMBER_ACL,
        TOMOYO_TYPE_MKDEV_ACL,
        TOMOYO_TYPE_MOUNT_ACL,
        TOMOYO_TYPE_INET_ACL,
        TOMOYO_TYPE_UNIX_ACL,
        TOMOYO_TYPE_ENV_ACL,
        TOMOYO_TYPE_MANUAL_TASK_ACL;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_transition_type")
    public static enum tomoyo_transition_type implements Enum<tomoyo_transition_type>,
    TypedEnum<tomoyo_transition_type, Integer>
    {
        TOMOYO_TRANSITION_CONTROL_NO_RESET,
        TOMOYO_TRANSITION_CONTROL_RESET,
        TOMOYO_TRANSITION_CONTROL_NO_INITIALIZE,
        TOMOYO_TRANSITION_CONTROL_INITIALIZE,
        TOMOYO_TRANSITION_CONTROL_NO_KEEP,
        TOMOYO_TRANSITION_CONTROL_KEEP,
        TOMOYO_MAX_TRANSITION_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_value_type")
    public static enum tomoyo_value_type implements Enum<tomoyo_value_type>,
    TypedEnum<tomoyo_value_type, Integer>
    {
        TOMOYO_VALUE_TYPE_INVALID,
        TOMOYO_VALUE_TYPE_DECIMAL,
        TOMOYO_VALUE_TYPE_OCTAL,
        TOMOYO_VALUE_TYPE_HEXADECIMAL;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_group_id")
    public static enum tomoyo_group_id implements Enum<tomoyo_group_id>,
    TypedEnum<tomoyo_group_id, Integer>
    {
        TOMOYO_PATH_GROUP,
        TOMOYO_NUMBER_GROUP,
        TOMOYO_ADDRESS_GROUP,
        TOMOYO_MAX_GROUP;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_grant_log")
    public static enum tomoyo_grant_log implements Enum<tomoyo_grant_log>,
    TypedEnum<tomoyo_grant_log, Integer>
    {
        TOMOYO_GRANTLOG_AUTO,
        TOMOYO_GRANTLOG_NO,
        TOMOYO_GRANTLOG_YES;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_domain_info_flags_index")
    public static enum tomoyo_domain_info_flags_index implements Enum<tomoyo_domain_info_flags_index>,
    TypedEnum<tomoyo_domain_info_flags_index, Integer>
    {
        TOMOYO_DIF_QUOTA_WARNED,
        TOMOYO_DIF_TRANSITION_FAILED,
        TOMOYO_MAX_DOMAIN_INFO_FLAGS;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_policy_id")
    public static enum tomoyo_policy_id implements Enum<tomoyo_policy_id>,
    TypedEnum<tomoyo_policy_id, Integer>
    {
        TOMOYO_ID_GROUP,
        TOMOYO_ID_ADDRESS_GROUP,
        TOMOYO_ID_PATH_GROUP,
        TOMOYO_ID_NUMBER_GROUP,
        TOMOYO_ID_TRANSITION_CONTROL,
        TOMOYO_ID_AGGREGATOR,
        TOMOYO_ID_MANAGER,
        TOMOYO_ID_CONDITION,
        TOMOYO_ID_NAME,
        TOMOYO_ID_ACL,
        TOMOYO_ID_DOMAIN,
        TOMOYO_MAX_POLICY;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_mode_index")
    public static enum tomoyo_mode_index implements Enum<tomoyo_mode_index>,
    TypedEnum<tomoyo_mode_index, Integer>
    {
        TOMOYO_CONFIG_DISABLED,
        TOMOYO_CONFIG_LEARNING,
        TOMOYO_CONFIG_PERMISSIVE,
        TOMOYO_CONFIG_ENFORCING,
        TOMOYO_CONFIG_MAX_MODE,
        TOMOYO_CONFIG_WANT_REJECT_LOG,
        TOMOYO_CONFIG_WANT_GRANT_LOG,
        TOMOYO_CONFIG_USE_DEFAULT;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_path_stat_index")
    public static enum tomoyo_path_stat_index implements Enum<tomoyo_path_stat_index>,
    TypedEnum<tomoyo_path_stat_index, Integer>
    {
        TOMOYO_PATH1,
        TOMOYO_PATH1_PARENT,
        TOMOYO_PATH2,
        TOMOYO_PATH2_PARENT,
        TOMOYO_MAX_PATH_STAT;

    }

    @Type(noCCodeGeneration=true, cType="enum tomoyo_conditions_index")
    public static enum tomoyo_conditions_index implements Enum<tomoyo_conditions_index>,
    TypedEnum<tomoyo_conditions_index, Integer>
    {
        TOMOYO_TASK_UID,
        TOMOYO_TASK_EUID,
        TOMOYO_TASK_SUID,
        TOMOYO_TASK_FSUID,
        TOMOYO_TASK_GID,
        TOMOYO_TASK_EGID,
        TOMOYO_TASK_SGID,
        TOMOYO_TASK_FSGID,
        TOMOYO_TASK_PID,
        TOMOYO_TASK_PPID,
        TOMOYO_EXEC_ARGC,
        TOMOYO_EXEC_ENVC,
        TOMOYO_TYPE_IS_SOCKET,
        TOMOYO_TYPE_IS_SYMLINK,
        TOMOYO_TYPE_IS_FILE,
        TOMOYO_TYPE_IS_BLOCK_DEV,
        TOMOYO_TYPE_IS_DIRECTORY,
        TOMOYO_TYPE_IS_CHAR_DEV,
        TOMOYO_TYPE_IS_FIFO,
        TOMOYO_MODE_SETUID,
        TOMOYO_MODE_SETGID,
        TOMOYO_MODE_STICKY,
        TOMOYO_MODE_OWNER_READ,
        TOMOYO_MODE_OWNER_WRITE,
        TOMOYO_MODE_OWNER_EXECUTE,
        TOMOYO_MODE_GROUP_READ,
        TOMOYO_MODE_GROUP_WRITE,
        TOMOYO_MODE_GROUP_EXECUTE,
        TOMOYO_MODE_OTHERS_READ,
        TOMOYO_MODE_OTHERS_WRITE,
        TOMOYO_MODE_OTHERS_EXECUTE,
        TOMOYO_EXEC_REALPATH,
        TOMOYO_SYMLINK_TARGET,
        TOMOYO_PATH1_UID,
        TOMOYO_PATH1_GID,
        TOMOYO_PATH1_INO,
        TOMOYO_PATH1_MAJOR,
        TOMOYO_PATH1_MINOR,
        TOMOYO_PATH1_PERM,
        TOMOYO_PATH1_TYPE,
        TOMOYO_PATH1_DEV_MAJOR,
        TOMOYO_PATH1_DEV_MINOR,
        TOMOYO_PATH2_UID,
        TOMOYO_PATH2_GID,
        TOMOYO_PATH2_INO,
        TOMOYO_PATH2_MAJOR,
        TOMOYO_PATH2_MINOR,
        TOMOYO_PATH2_PERM,
        TOMOYO_PATH2_TYPE,
        TOMOYO_PATH2_DEV_MAJOR,
        TOMOYO_PATH2_DEV_MINOR,
        TOMOYO_PATH1_PARENT_UID,
        TOMOYO_PATH1_PARENT_GID,
        TOMOYO_PATH1_PARENT_INO,
        TOMOYO_PATH1_PARENT_PERM,
        TOMOYO_PATH2_PARENT_UID,
        TOMOYO_PATH2_PARENT_GID,
        TOMOYO_PATH2_PARENT_INO,
        TOMOYO_PATH2_PARENT_PERM,
        TOMOYO_MAX_CONDITION_KEYWORD,
        TOMOYO_NUMBER_UNION,
        TOMOYO_NAME_UNION,
        TOMOYO_ARGV_ENTRY,
        TOMOYO_ENVP_ENTRY;

    }
}

