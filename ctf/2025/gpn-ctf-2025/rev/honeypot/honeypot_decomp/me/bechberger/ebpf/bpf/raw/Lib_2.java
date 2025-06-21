/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.FunctionDescriptor
 *  java.lang.foreign.Linker
 *  java.lang.foreign.Linker$Option
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfDouble
 *  java.lang.foreign.ValueLayout$OfFloat
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.foreign.ValueLayout$OfShort
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.Lib_2;
import me.bechberger.ebpf.bpf.raw.Lib_3;
import me.bechberger.ebpf.bpf.raw.Lib_4;
import me.bechberger.ebpf.bpf.raw._IO_cookie_io_functions_t;

public class Lib_2
extends Lib_3 {
    private static final int BPF_FUNC_setsockopt = 49;
    private static final int BPF_FUNC_skb_adjust_room = 50;
    private static final int BPF_FUNC_redirect_map = 51;
    private static final int BPF_FUNC_sk_redirect_map = 52;
    private static final int BPF_FUNC_sock_map_update = 53;
    private static final int BPF_FUNC_xdp_adjust_meta = 54;
    private static final int BPF_FUNC_perf_event_read_value = 55;
    private static final int BPF_FUNC_perf_prog_read_value = 56;
    private static final int BPF_FUNC_getsockopt = 57;
    private static final int BPF_FUNC_override_return = 58;
    private static final int BPF_FUNC_sock_ops_cb_flags_set = 59;
    private static final int BPF_FUNC_msg_redirect_map = 60;
    private static final int BPF_FUNC_msg_apply_bytes = 61;
    private static final int BPF_FUNC_msg_cork_bytes = 62;
    private static final int BPF_FUNC_msg_pull_data = 63;
    private static final int BPF_FUNC_bind = 64;
    private static final int BPF_FUNC_xdp_adjust_tail = 65;
    private static final int BPF_FUNC_skb_get_xfrm_state = 66;
    private static final int BPF_FUNC_get_stack = 67;
    private static final int BPF_FUNC_skb_load_bytes_relative = 68;
    private static final int BPF_FUNC_fib_lookup = 69;
    private static final int BPF_FUNC_sock_hash_update = 70;
    private static final int BPF_FUNC_msg_redirect_hash = 71;
    private static final int BPF_FUNC_sk_redirect_hash = 72;
    private static final int BPF_FUNC_lwt_push_encap = 73;
    private static final int BPF_FUNC_lwt_seg6_store_bytes = 74;
    private static final int BPF_FUNC_lwt_seg6_adjust_srh = 75;
    private static final int BPF_FUNC_lwt_seg6_action = 76;
    private static final int BPF_FUNC_rc_repeat = 77;
    private static final int BPF_FUNC_rc_keydown = 78;
    private static final int BPF_FUNC_skb_cgroup_id = 79;
    private static final int BPF_FUNC_get_current_cgroup_id = 80;
    private static final int BPF_FUNC_get_local_storage = 81;
    private static final int BPF_FUNC_sk_select_reuseport = 82;
    private static final int BPF_FUNC_skb_ancestor_cgroup_id = 83;
    private static final int BPF_FUNC_sk_lookup_tcp = 84;
    private static final int BPF_FUNC_sk_lookup_udp = 85;
    private static final int BPF_FUNC_sk_release = 86;
    private static final int BPF_FUNC_map_push_elem = 87;
    private static final int BPF_FUNC_map_pop_elem = 88;
    private static final int BPF_FUNC_map_peek_elem = 89;
    private static final int BPF_FUNC_msg_push_data = 90;
    private static final int BPF_FUNC_msg_pop_data = 91;
    private static final int BPF_FUNC_rc_pointer_rel = 92;
    private static final int BPF_FUNC_spin_lock = 93;
    private static final int BPF_FUNC_spin_unlock = 94;
    private static final int BPF_FUNC_sk_fullsock = 95;
    private static final int BPF_FUNC_tcp_sock = 96;
    private static final int BPF_FUNC_skb_ecn_set_ce = 97;
    private static final int BPF_FUNC_get_listener_sock = 98;
    private static final int BPF_FUNC_skc_lookup_tcp = 99;
    private static final int BPF_FUNC_tcp_check_syncookie = 100;
    private static final int BPF_FUNC_sysctl_get_name = 101;
    private static final int BPF_FUNC_sysctl_get_current_value = 102;
    private static final int BPF_FUNC_sysctl_get_new_value = 103;
    private static final int BPF_FUNC_sysctl_set_new_value = 104;
    private static final int BPF_FUNC_strtol = 105;
    private static final int BPF_FUNC_strtoul = 106;
    private static final int BPF_FUNC_sk_storage_get = 107;
    private static final int BPF_FUNC_sk_storage_delete = 108;
    private static final int BPF_FUNC_send_signal = 109;
    private static final int BPF_FUNC_tcp_gen_syncookie = 110;
    private static final int BPF_FUNC_skb_output = 111;
    private static final int BPF_FUNC_probe_read_user = 112;
    private static final int BPF_FUNC_probe_read_kernel = 113;
    private static final int BPF_FUNC_probe_read_user_str = 114;
    private static final int BPF_FUNC_probe_read_kernel_str = 115;
    private static final int BPF_FUNC_tcp_send_ack = 116;
    private static final int BPF_FUNC_send_signal_thread = 117;
    private static final int BPF_FUNC_jiffies64 = 118;
    private static final int BPF_FUNC_read_branch_records = 119;
    private static final int BPF_FUNC_get_ns_current_pid_tgid = 120;
    private static final int BPF_FUNC_xdp_output = 121;
    private static final int BPF_FUNC_get_netns_cookie = 122;
    private static final int BPF_FUNC_get_current_ancestor_cgroup_id = 123;
    private static final int BPF_FUNC_sk_assign = 124;
    private static final int BPF_FUNC_ktime_get_boot_ns = 125;
    private static final int BPF_FUNC_seq_printf = 126;
    private static final int BPF_FUNC_seq_write = 127;
    private static final int BPF_FUNC_sk_cgroup_id = 128;
    private static final int BPF_FUNC_sk_ancestor_cgroup_id = 129;
    private static final int BPF_FUNC_ringbuf_output = 130;
    private static final int BPF_FUNC_ringbuf_reserve = 131;
    private static final int BPF_FUNC_ringbuf_submit = 132;
    private static final int BPF_FUNC_ringbuf_discard = 133;
    private static final int BPF_FUNC_ringbuf_query = 134;
    private static final int BPF_FUNC_csum_level = 135;
    private static final int BPF_FUNC_skc_to_tcp6_sock = 136;
    private static final int BPF_FUNC_skc_to_tcp_sock = 137;
    private static final int BPF_FUNC_skc_to_tcp_timewait_sock = 138;
    private static final int BPF_FUNC_skc_to_tcp_request_sock = 139;
    private static final int BPF_FUNC_skc_to_udp6_sock = 140;
    private static final int BPF_FUNC_get_task_stack = 141;
    private static final int BPF_FUNC_load_hdr_opt = 142;
    private static final int BPF_FUNC_store_hdr_opt = 143;
    private static final int BPF_FUNC_reserve_hdr_opt = 144;
    private static final int BPF_FUNC_inode_storage_get = 145;
    private static final int BPF_FUNC_inode_storage_delete = 146;
    private static final int BPF_FUNC_d_path = 147;
    private static final int BPF_FUNC_copy_from_user = 148;
    private static final int BPF_FUNC_snprintf_btf = 149;
    private static final int BPF_FUNC_seq_printf_btf = 150;
    private static final int BPF_FUNC_skb_cgroup_classid = 151;
    private static final int BPF_FUNC_redirect_neigh = 152;
    private static final int BPF_FUNC_per_cpu_ptr = 153;
    private static final int BPF_FUNC_this_cpu_ptr = 154;
    private static final int BPF_FUNC_redirect_peer = 155;
    private static final int BPF_FUNC_task_storage_get = 156;
    private static final int BPF_FUNC_task_storage_delete = 157;
    private static final int BPF_FUNC_get_current_task_btf = 158;
    private static final int BPF_FUNC_bprm_opts_set = 159;
    private static final int BPF_FUNC_ktime_get_coarse_ns = 160;
    private static final int BPF_FUNC_ima_inode_hash = 161;
    private static final int BPF_FUNC_sock_from_file = 162;
    private static final int BPF_FUNC_check_mtu = 163;
    private static final int BPF_FUNC_for_each_map_elem = 164;
    private static final int BPF_FUNC_snprintf = 165;
    private static final int BPF_FUNC_sys_bpf = 166;
    private static final int BPF_FUNC_btf_find_by_name_kind = 167;
    private static final int BPF_FUNC_sys_close = 168;
    private static final int BPF_FUNC_timer_init = 169;
    private static final int BPF_FUNC_timer_set_callback = 170;
    private static final int BPF_FUNC_timer_start = 171;
    private static final int BPF_FUNC_timer_cancel = 172;
    private static final int BPF_FUNC_get_func_ip = 173;
    private static final int BPF_FUNC_get_attach_cookie = 174;
    private static final int BPF_FUNC_task_pt_regs = 175;
    private static final int BPF_FUNC_get_branch_snapshot = 176;
    private static final int BPF_FUNC_trace_vprintk = 177;
    private static final int BPF_FUNC_skc_to_unix_sock = 178;
    private static final int BPF_FUNC_kallsyms_lookup_name = 179;
    private static final int BPF_FUNC_find_vma = 180;
    private static final int BPF_FUNC_loop = 181;
    private static final int BPF_FUNC_strncmp = 182;
    private static final int BPF_FUNC_get_func_arg = 183;
    private static final int BPF_FUNC_get_func_ret = 184;
    private static final int BPF_FUNC_get_func_arg_cnt = 185;
    private static final int BPF_FUNC_get_retval = 186;
    private static final int BPF_FUNC_set_retval = 187;
    private static final int BPF_FUNC_xdp_get_buff_len = 188;
    private static final int BPF_FUNC_xdp_load_bytes = 189;
    private static final int BPF_FUNC_xdp_store_bytes = 190;
    private static final int BPF_FUNC_copy_from_user_task = 191;
    private static final int BPF_FUNC_skb_set_tstamp = 192;
    private static final int BPF_FUNC_ima_file_hash = 193;
    private static final int BPF_FUNC_kptr_xchg = 194;
    private static final int BPF_FUNC_map_lookup_percpu_elem = 195;
    private static final int BPF_FUNC_skc_to_mptcp_sock = 196;
    private static final int BPF_FUNC_dynptr_from_mem = 197;
    private static final int BPF_FUNC_ringbuf_reserve_dynptr = 198;
    private static final int BPF_FUNC_ringbuf_submit_dynptr = 199;
    private static final int BPF_FUNC_ringbuf_discard_dynptr = 200;
    private static final int BPF_FUNC_dynptr_read = 201;
    private static final int BPF_FUNC_dynptr_write = 202;
    private static final int BPF_FUNC_dynptr_data = 203;
    private static final int BPF_FUNC_tcp_raw_gen_syncookie_ipv4 = 204;
    private static final int BPF_FUNC_tcp_raw_gen_syncookie_ipv6 = 205;
    private static final int BPF_FUNC_tcp_raw_check_syncookie_ipv4 = 206;
    private static final int BPF_FUNC_tcp_raw_check_syncookie_ipv6 = 207;
    private static final int BPF_FUNC_ktime_get_tai_ns = 208;
    private static final int BPF_FUNC_user_ringbuf_drain = 209;
    private static final int BPF_FUNC_cgrp_storage_get = 210;
    private static final int BPF_FUNC_cgrp_storage_delete = 211;
    private static final int __BPF_FUNC_MAX_ID = 212;
    private static final int BPF_F_RECOMPUTE_CSUM = 1;
    private static final int BPF_F_INVALIDATE_HASH = 2;
    private static final int BPF_F_HDR_FIELD_MASK = 15;
    private static final int BPF_F_PSEUDO_HDR = 16;
    private static final int BPF_F_MARK_MANGLED_0 = 32;
    private static final int BPF_F_MARK_ENFORCE = 64;
    private static final int BPF_F_TUNINFO_IPV6 = 1;
    private static final int BPF_F_SKIP_FIELD_MASK = 255;
    private static final int BPF_F_USER_STACK = 256;
    private static final int BPF_F_FAST_STACK_CMP = 512;
    private static final int BPF_F_REUSE_STACKID = 1024;
    private static final int BPF_F_USER_BUILD_ID = 2048;
    private static final int BPF_F_ZERO_CSUM_TX = 2;
    private static final int BPF_F_DONT_FRAGMENT = 4;
    private static final int BPF_F_SEQ_NUMBER = 8;
    private static final int BPF_F_NO_TUNNEL_KEY = 16;
    private static final int BPF_F_TUNINFO_FLAGS = 16;
    private static final long BPF_F_INDEX_MASK = 0xFFFFFFFFL;
    private static final long BPF_F_CURRENT_CPU = 0xFFFFFFFFL;
    private static final long BPF_F_CTXLEN_MASK = 0xFFFFF00000000L;
    private static final int BPF_F_CURRENT_NETNS = -1;
    private static final int BPF_CSUM_LEVEL_QUERY = 0;
    private static final int BPF_CSUM_LEVEL_INC = 1;
    private static final int BPF_CSUM_LEVEL_DEC = 2;
    private static final int BPF_CSUM_LEVEL_RESET = 3;
    private static final int BPF_F_ADJ_ROOM_FIXED_GSO = 1;
    private static final int BPF_F_ADJ_ROOM_ENCAP_L3_IPV4 = 2;
    private static final int BPF_F_ADJ_ROOM_ENCAP_L3_IPV6 = 4;
    private static final int BPF_F_ADJ_ROOM_ENCAP_L4_GRE = 8;
    private static final int BPF_F_ADJ_ROOM_ENCAP_L4_UDP = 16;
    private static final int BPF_F_ADJ_ROOM_NO_CSUM_RESET = 32;
    private static final int BPF_F_ADJ_ROOM_ENCAP_L2_ETH = 64;
    private static final int BPF_F_ADJ_ROOM_DECAP_L3_IPV4 = 128;
    private static final int BPF_F_ADJ_ROOM_DECAP_L3_IPV6 = 256;
    private static final int BPF_ADJ_ROOM_ENCAP_L2_MASK = 255;
    private static final int BPF_ADJ_ROOM_ENCAP_L2_SHIFT = 56;
    private static final int BPF_F_SYSCTL_BASE_NAME = 1;
    private static final int BPF_LOCAL_STORAGE_GET_F_CREATE = 1;
    private static final int BPF_SK_STORAGE_GET_F_CREATE = 1;
    private static final int BPF_F_GET_BRANCH_RECORDS_SIZE = 1;
    private static final int BPF_RB_NO_WAKEUP = 1;
    private static final int BPF_RB_FORCE_WAKEUP = 2;
    private static final int BPF_RB_AVAIL_DATA = 0;
    private static final int BPF_RB_RING_SIZE = 1;
    private static final int BPF_RB_CONS_POS = 2;
    private static final int BPF_RB_PROD_POS = 3;
    private static final int BPF_RINGBUF_BUSY_BIT = Integer.MIN_VALUE;
    private static final int BPF_RINGBUF_DISCARD_BIT = 0x40000000;
    private static final int BPF_RINGBUF_HDR_SZ = 8;
    private static final int BPF_SK_LOOKUP_F_REPLACE = 1;
    private static final int BPF_SK_LOOKUP_F_NO_REUSEPORT = 2;
    private static final int BPF_ADJ_ROOM_NET = 0;
    private static final int BPF_ADJ_ROOM_MAC = 1;
    private static final int BPF_HDR_START_MAC = 0;
    private static final int BPF_HDR_START_NET = 1;
    private static final int BPF_LWT_ENCAP_SEG6 = 0;
    private static final int BPF_LWT_ENCAP_SEG6_INLINE = 1;
    private static final int BPF_LWT_ENCAP_IP = 2;
    private static final int BPF_F_BPRM_SECUREEXEC = 1;
    private static final int BPF_F_INGRESS = 1;
    private static final int BPF_F_BROADCAST = 8;
    private static final int BPF_F_EXCLUDE_INGRESS = 16;
    private static final int BPF_SKB_TSTAMP_UNSPEC = 0;
    private static final int BPF_SKB_TSTAMP_DELIVERY_MONO = 1;
    private static final int BPF_SKB_CLOCK_REALTIME = 0;
    private static final int BPF_SKB_CLOCK_MONOTONIC = 1;
    private static final int BPF_SKB_CLOCK_TAI = 2;
    private static final int BPF_OK = 0;
    private static final int BPF_DROP = 2;
    private static final int BPF_REDIRECT = 7;
    private static final int BPF_LWT_REROUTE = 128;
    private static final int BPF_FLOW_DISSECTOR_CONTINUE = 129;
    private static final int TCX_NEXT = -1;
    private static final int TCX_PASS = 0;
    private static final int TCX_DROP = 2;
    private static final int TCX_REDIRECT = 7;
    private static final int XDP_ABORTED = 0;
    private static final int XDP_DROP = 1;
    private static final int XDP_PASS = 2;
    private static final int XDP_TX = 3;
    private static final int XDP_REDIRECT = 4;
    private static final int SK_DROP = 0;
    private static final int SK_PASS = 1;
    private static final int BPF_SOCK_OPS_RTO_CB_FLAG = 1;
    private static final int BPF_SOCK_OPS_RETRANS_CB_FLAG = 2;
    private static final int BPF_SOCK_OPS_STATE_CB_FLAG = 4;
    private static final int BPF_SOCK_OPS_RTT_CB_FLAG = 8;
    private static final int BPF_SOCK_OPS_PARSE_ALL_HDR_OPT_CB_FLAG = 16;
    private static final int BPF_SOCK_OPS_PARSE_UNKNOWN_HDR_OPT_CB_FLAG = 32;
    private static final int BPF_SOCK_OPS_WRITE_HDR_OPT_CB_FLAG = 64;
    private static final int BPF_SOCK_OPS_ALL_CB_FLAGS = 127;
    private static final int BPF_SOCK_OPS_VOID = 0;
    private static final int BPF_SOCK_OPS_TIMEOUT_INIT = 1;
    private static final int BPF_SOCK_OPS_RWND_INIT = 2;
    private static final int BPF_SOCK_OPS_TCP_CONNECT_CB = 3;
    private static final int BPF_SOCK_OPS_ACTIVE_ESTABLISHED_CB = 4;
    private static final int BPF_SOCK_OPS_PASSIVE_ESTABLISHED_CB = 5;
    private static final int BPF_SOCK_OPS_NEEDS_ECN = 6;
    private static final int BPF_SOCK_OPS_BASE_RTT = 7;
    private static final int BPF_SOCK_OPS_RTO_CB = 8;
    private static final int BPF_SOCK_OPS_RETRANS_CB = 9;
    private static final int BPF_SOCK_OPS_STATE_CB = 10;
    private static final int BPF_SOCK_OPS_TCP_LISTEN_CB = 11;
    private static final int BPF_SOCK_OPS_RTT_CB = 12;
    private static final int BPF_SOCK_OPS_PARSE_HDR_OPT_CB = 13;
    private static final int BPF_SOCK_OPS_HDR_OPT_LEN_CB = 14;
    private static final int BPF_SOCK_OPS_WRITE_HDR_OPT_CB = 15;
    private static final int BPF_TCP_ESTABLISHED = 1;
    private static final int BPF_TCP_SYN_SENT = 2;
    private static final int BPF_TCP_SYN_RECV = 3;
    private static final int BPF_TCP_FIN_WAIT1 = 4;
    private static final int BPF_TCP_FIN_WAIT2 = 5;
    private static final int BPF_TCP_TIME_WAIT = 6;
    private static final int BPF_TCP_CLOSE = 7;
    private static final int BPF_TCP_CLOSE_WAIT = 8;
    private static final int BPF_TCP_LAST_ACK = 9;
    private static final int BPF_TCP_LISTEN = 10;
    private static final int BPF_TCP_CLOSING = 11;
    private static final int BPF_TCP_NEW_SYN_RECV = 12;
    private static final int BPF_TCP_BOUND_INACTIVE = 13;
    private static final int BPF_TCP_MAX_STATES = 14;
    private static final int TCP_BPF_IW = 1001;
    private static final int TCP_BPF_SNDCWND_CLAMP = 1002;
    private static final int TCP_BPF_DELACK_MAX = 1003;
    private static final int TCP_BPF_RTO_MIN = 1004;
    private static final int TCP_BPF_SYN = 1005;
    private static final int TCP_BPF_SYN_IP = 1006;
    private static final int TCP_BPF_SYN_MAC = 1007;
    private static final int TCP_BPF_SOCK_OPS_CB_FLAGS = 1008;
    private static final int BPF_LOAD_HDR_OPT_TCP_SYN = 1;
    private static final int BPF_WRITE_HDR_TCP_CURRENT_MSS = 1;
    private static final int BPF_WRITE_HDR_TCP_SYNACK_COOKIE = 2;
    private static final int BPF_DEVCG_ACC_MKNOD = 1;
    private static final int BPF_DEVCG_ACC_READ = 2;
    private static final int BPF_DEVCG_ACC_WRITE = 4;
    private static final int BPF_DEVCG_DEV_BLOCK = 1;
    private static final int BPF_DEVCG_DEV_CHAR = 2;
    private static final int BPF_FIB_LOOKUP_DIRECT = 1;
    private static final int BPF_FIB_LOOKUP_OUTPUT = 2;
    private static final int BPF_FIB_LOOKUP_SKIP_NEIGH = 4;
    private static final int BPF_FIB_LOOKUP_TBID = 8;
    private static final int BPF_FIB_LOOKUP_SRC = 16;
    private static final int BPF_FIB_LOOKUP_MARK = 32;
    private static final int BPF_FIB_LKUP_RET_SUCCESS = 0;
    private static final int BPF_FIB_LKUP_RET_BLACKHOLE = 1;
    private static final int BPF_FIB_LKUP_RET_UNREACHABLE = 2;
    private static final int BPF_FIB_LKUP_RET_PROHIBIT = 3;
    private static final int BPF_FIB_LKUP_RET_NOT_FWDED = 4;
    private static final int BPF_FIB_LKUP_RET_FWD_DISABLED = 5;
    private static final int BPF_FIB_LKUP_RET_UNSUPP_LWT = 6;
    private static final int BPF_FIB_LKUP_RET_NO_NEIGH = 7;
    private static final int BPF_FIB_LKUP_RET_FRAG_NEEDED = 8;
    private static final int BPF_FIB_LKUP_RET_NO_SRC_ADDR = 9;
    private static final int BPF_MTU_CHK_SEGS = 1;
    private static final int BPF_MTU_CHK_RET_SUCCESS = 0;
    private static final int BPF_MTU_CHK_RET_FRAG_NEEDED = 1;
    private static final int BPF_MTU_CHK_RET_SEGS_TOOBIG = 2;
    private static final int BPF_FD_TYPE_RAW_TRACEPOINT = 0;
    private static final int BPF_FD_TYPE_TRACEPOINT = 1;
    private static final int BPF_FD_TYPE_KPROBE = 2;
    private static final int BPF_FD_TYPE_KRETPROBE = 3;
    private static final int BPF_FD_TYPE_UPROBE = 4;
    private static final int BPF_FD_TYPE_URETPROBE = 5;
    private static final int BPF_FLOW_DISSECTOR_F_PARSE_1ST_FRAG = 1;
    private static final int BPF_FLOW_DISSECTOR_F_STOP_AT_FLOW_LABEL = 2;
    private static final int BPF_FLOW_DISSECTOR_F_STOP_AT_ENCAP = 4;
    private static final int BTF_F_COMPACT = 1;
    private static final int BTF_F_NONAME = 2;
    private static final int BTF_F_PTR_RAW = 4;
    private static final int BTF_F_ZERO = 8;
    private static final int BPF_CORE_FIELD_BYTE_OFFSET = 0;
    private static final int BPF_CORE_FIELD_BYTE_SIZE = 1;
    private static final int BPF_CORE_FIELD_EXISTS = 2;
    private static final int BPF_CORE_FIELD_SIGNED = 3;
    private static final int BPF_CORE_FIELD_LSHIFT_U64 = 4;
    private static final int BPF_CORE_FIELD_RSHIFT_U64 = 5;
    private static final int BPF_CORE_TYPE_ID_LOCAL = 6;
    private static final int BPF_CORE_TYPE_ID_TARGET = 7;
    private static final int BPF_CORE_TYPE_EXISTS = 8;
    private static final int BPF_CORE_TYPE_SIZE = 9;
    private static final int BPF_CORE_ENUMVAL_EXISTS = 10;
    private static final int BPF_CORE_ENUMVAL_VALUE = 11;
    private static final int BPF_CORE_TYPE_MATCHES = 12;
    private static final int BPF_F_TIMER_ABS = 1;
    private static final int BPF_F_TIMER_CPU_PIN = 2;
    private static final int BPF_F_PAD_ZEROS = 1;
    public static final ValueLayout.OfLong ptrdiff_t = Lib.C_LONG;
    public static final ValueLayout.OfLong size_t = Lib.C_LONG;
    public static final ValueLayout.OfInt wchar_t = Lib.C_INT;
    public static final ValueLayout.OfByte __u_char = Lib.C_CHAR;
    public static final ValueLayout.OfShort __u_short = Lib.C_SHORT;
    public static final ValueLayout.OfInt __u_int = Lib.C_INT;
    public static final ValueLayout.OfLong __u_long = Lib.C_LONG;
    public static final ValueLayout.OfByte __int8_t = Lib.C_CHAR;
    public static final ValueLayout.OfByte __uint8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort __int16_t = Lib.C_SHORT;
    public static final ValueLayout.OfShort __uint16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt __int32_t = Lib.C_INT;
    public static final ValueLayout.OfInt __uint32_t = Lib.C_INT;
    public static final ValueLayout.OfLong __int64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __uint64_t = Lib.C_LONG;
    public static final ValueLayout.OfByte __int_least8_t = Lib.C_CHAR;
    public static final ValueLayout.OfByte __uint_least8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort __int_least16_t = Lib.C_SHORT;
    public static final ValueLayout.OfShort __uint_least16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt __int_least32_t = Lib.C_INT;
    public static final ValueLayout.OfInt __uint_least32_t = Lib.C_INT;
    public static final ValueLayout.OfLong __int_least64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __uint_least64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __quad_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __u_quad_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __intmax_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __uintmax_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __dev_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __uid_t = Lib.C_INT;
    public static final ValueLayout.OfInt __gid_t = Lib.C_INT;
    public static final ValueLayout.OfLong __ino_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __ino64_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __mode_t = Lib.C_INT;
    public static final ValueLayout.OfLong __nlink_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __off_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __off64_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __pid_t = Lib.C_INT;
    public static final ValueLayout.OfLong __clock_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __rlim_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __rlim64_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __id_t = Lib.C_INT;
    public static final ValueLayout.OfLong __time_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __useconds_t = Lib.C_INT;
    public static final ValueLayout.OfLong __suseconds_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __suseconds64_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __daddr_t = Lib.C_INT;
    public static final ValueLayout.OfInt __key_t = Lib.C_INT;
    public static final ValueLayout.OfInt __clockid_t = Lib.C_INT;
    public static final AddressLayout __timer_t = Lib.C_POINTER;
    public static final ValueLayout.OfLong __blksize_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __blkcnt_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __blkcnt64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __fsblkcnt_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __fsblkcnt64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __fsfilcnt_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __fsfilcnt64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __fsword_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __ssize_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __syscall_slong_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __syscall_ulong_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __loff_t = Lib.C_LONG;
    public static final AddressLayout __caddr_t = Lib.C_POINTER;
    public static final ValueLayout.OfLong __intptr_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __socklen_t = Lib.C_INT;
    public static final ValueLayout.OfInt __sig_atomic_t = Lib.C_INT;
    public static final ValueLayout.OfByte int8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort int16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt int32_t = Lib.C_INT;
    public static final ValueLayout.OfLong int64_t = Lib.C_LONG;
    public static final ValueLayout.OfByte uint8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort uint16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt uint32_t = Lib.C_INT;
    public static final ValueLayout.OfLong uint64_t = Lib.C_LONG;
    public static final ValueLayout.OfByte int_least8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort int_least16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt int_least32_t = Lib.C_INT;
    public static final ValueLayout.OfLong int_least64_t = Lib.C_LONG;
    public static final ValueLayout.OfByte uint_least8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort uint_least16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt uint_least32_t = Lib.C_INT;
    public static final ValueLayout.OfLong uint_least64_t = Lib.C_LONG;
    public static final ValueLayout.OfByte int_fast8_t = Lib.C_CHAR;
    public static final ValueLayout.OfLong int_fast16_t = Lib.C_LONG;
    public static final ValueLayout.OfLong int_fast32_t = Lib.C_LONG;
    public static final ValueLayout.OfLong int_fast64_t = Lib.C_LONG;
    public static final ValueLayout.OfByte uint_fast8_t = Lib.C_CHAR;
    public static final ValueLayout.OfLong uint_fast16_t = Lib.C_LONG;
    public static final ValueLayout.OfLong uint_fast32_t = Lib.C_LONG;
    public static final ValueLayout.OfLong uint_fast64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong intptr_t = Lib.C_LONG;
    public static final ValueLayout.OfLong uintptr_t = Lib.C_LONG;
    public static final ValueLayout.OfLong intmax_t = Lib.C_LONG;
    public static final ValueLayout.OfLong uintmax_t = Lib.C_LONG;
    public static final AddressLayout __locale_t = Lib.C_POINTER;
    public static final AddressLayout locale_t = Lib.C_POINTER;
    private static final int LIBBPF_STRICT_ALL = -1;
    private static final int LIBBPF_STRICT_NONE = 0;
    private static final int LIBBPF_STRICT_CLEAN_PTRS = 1;
    private static final int LIBBPF_STRICT_DIRECT_ERRS = 2;
    private static final int LIBBPF_STRICT_SEC_NAME = 4;
    private static final int LIBBPF_STRICT_NO_OBJECT_LIST = 8;
    private static final int LIBBPF_STRICT_AUTO_RLIMIT_MEMLOCK = 16;
    private static final int LIBBPF_STRICT_MAP_DEFINITIONS = 32;
    private static final int __LIBBPF_STRICT_LAST = 33;
    public static final ValueLayout.OfLong off_t = Lib.C_LONG;
    public static final ValueLayout.OfLong ssize_t = Lib.C_LONG;
    public static final ValueLayout.OfFloat _Float32 = Lib.C_FLOAT;
    public static final ValueLayout.OfDouble _Float64 = Lib.C_DOUBLE;
    public static final ValueLayout.OfDouble _Float32x = Lib.C_DOUBLE;
    public static final ValueLayout.OfByte u_char = Lib.C_CHAR;
    public static final ValueLayout.OfShort u_short = Lib.C_SHORT;
    public static final ValueLayout.OfInt u_int = Lib.C_INT;
    public static final ValueLayout.OfLong u_long = Lib.C_LONG;
    public static final ValueLayout.OfLong quad_t = Lib.C_LONG;
    public static final ValueLayout.OfLong u_quad_t = Lib.C_LONG;
    public static final ValueLayout.OfLong loff_t = Lib.C_LONG;
    public static final ValueLayout.OfLong ino_t = Lib.C_LONG;
    public static final ValueLayout.OfLong dev_t = Lib.C_LONG;
    public static final ValueLayout.OfInt gid_t = Lib.C_INT;
    public static final ValueLayout.OfInt mode_t = Lib.C_INT;
    public static final ValueLayout.OfLong nlink_t = Lib.C_LONG;
    public static final ValueLayout.OfInt uid_t = Lib.C_INT;
    public static final ValueLayout.OfInt pid_t = Lib.C_INT;
    public static final ValueLayout.OfInt id_t = Lib.C_INT;
    public static final ValueLayout.OfInt daddr_t = Lib.C_INT;
    public static final AddressLayout caddr_t = Lib.C_POINTER;
    public static final ValueLayout.OfInt key_t = Lib.C_INT;
    public static final ValueLayout.OfLong clock_t = Lib.C_LONG;
    public static final ValueLayout.OfInt clockid_t = Lib.C_INT;
    public static final ValueLayout.OfLong time_t = Lib.C_LONG;
    public static final AddressLayout timer_t = Lib.C_POINTER;
    public static final ValueLayout.OfLong ulong = Lib.C_LONG;
    public static final ValueLayout.OfShort ushort = Lib.C_SHORT;
    public static final ValueLayout.OfInt uint = Lib.C_INT;
    public static final ValueLayout.OfByte u_int8_t = Lib.C_CHAR;
    public static final ValueLayout.OfShort u_int16_t = Lib.C_SHORT;
    public static final ValueLayout.OfInt u_int32_t = Lib.C_INT;
    public static final ValueLayout.OfLong u_int64_t = Lib.C_LONG;
    public static final ValueLayout.OfLong register_t = Lib.C_LONG;
    public static final ValueLayout.OfLong suseconds_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __fd_mask = Lib.C_LONG;
    public static final ValueLayout.OfLong fd_mask = Lib.C_LONG;
    public static final ValueLayout.OfLong blksize_t = Lib.C_LONG;
    public static final ValueLayout.OfLong blkcnt_t = Lib.C_LONG;
    public static final ValueLayout.OfLong fsblkcnt_t = Lib.C_LONG;
    public static final ValueLayout.OfLong fsfilcnt_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __tss_t = Lib.C_INT;
    public static final ValueLayout.OfLong __thrd_t = Lib.C_LONG;
    public static final ValueLayout.OfLong pthread_t = Lib.C_LONG;
    public static final ValueLayout.OfInt pthread_key_t = Lib.C_INT;
    public static final ValueLayout.OfInt pthread_once_t = Lib.C_INT;
    public static final ValueLayout.OfInt pthread_spinlock_t = Lib.C_INT;
    private static final int __LIBBPF_ERRNO__START = 4000;
    private static final int LIBBPF_ERRNO__LIBELF = 4000;
    private static final int LIBBPF_ERRNO__FORMAT = 4001;
    private static final int LIBBPF_ERRNO__KVERSION = 4002;
    private static final int LIBBPF_ERRNO__ENDIAN = 4003;
    private static final int LIBBPF_ERRNO__INTERNAL = 4004;
    private static final int LIBBPF_ERRNO__RELOC = 4005;
    private static final int LIBBPF_ERRNO__LOAD = 4006;
    private static final int LIBBPF_ERRNO__VERIFY = 4007;
    private static final int LIBBPF_ERRNO__PROG2BIG = 4008;
    private static final int LIBBPF_ERRNO__KVER = 4009;
    private static final int LIBBPF_ERRNO__PROGTYPE = 4010;
    private static final int LIBBPF_ERRNO__WRNGPID = 4011;
    private static final int LIBBPF_ERRNO__INVSEQ = 4012;
    private static final int LIBBPF_ERRNO__NLPARSE = 4013;
    private static final int __LIBBPF_ERRNO__END = 4014;
    private static final int LIBBPF_WARN = 0;
    private static final int LIBBPF_INFO = 1;
    private static final int LIBBPF_DEBUG = 2;
    private static final int PROBE_ATTACH_MODE_DEFAULT = 0;
    private static final int PROBE_ATTACH_MODE_LEGACY = 1;
    private static final int PROBE_ATTACH_MODE_PERF = 2;
    private static final int PROBE_ATTACH_MODE_LINK = 3;
    private static final int BPF_TC_INGRESS = 1;
    private static final int BPF_TC_EGRESS = 2;
    private static final int BPF_TC_CUSTOM = 4;
    private static final int BPF_TC_F_REPLACE = 1;
    private static final int LIBBPF_PERF_EVENT_DONE = 0;
    private static final int LIBBPF_PERF_EVENT_ERROR = -1;
    private static final int LIBBPF_PERF_EVENT_CONT = -2;
    private static final int TRI_NO = 0;
    private static final int TRI_YES = 1;
    private static final int TRI_MODULE = 2;
    private static final int BTF_KIND_UNKN = 0;
    private static final int BTF_KIND_INT = 1;
    private static final int BTF_KIND_PTR = 2;
    private static final int BTF_KIND_ARRAY = 3;
    private static final int BTF_KIND_STRUCT = 4;
    private static final int BTF_KIND_UNION = 5;
    private static final int BTF_KIND_ENUM = 6;
    private static final int BTF_KIND_FWD = 7;
    private static final int BTF_KIND_TYPEDEF = 8;
    private static final int BTF_KIND_VOLATILE = 9;
    private static final int BTF_KIND_CONST = 10;
    private static final int BTF_KIND_RESTRICT = 11;
    private static final int NR_BTF_KINDS = 20;
    private static final int BTF_KIND_MAX = 19;
    private static final int BTF_VAR_STATIC = 0;
    private static final int BTF_VAR_GLOBAL_ALLOCATED = 1;
    private static final int BTF_VAR_GLOBAL_EXTERN = 2;
    private static final int BTF_FUNC_STATIC = 0;
    private static final int BTF_FUNC_GLOBAL = 1;
    private static final int BTF_FUNC_EXTERN = 2;
    private static final int BTF_LITTLE_ENDIAN = 0;
    private static final int BTF_BIG_ENDIAN = 1;

    Lib_2() {
    }

    public static int BPF_FUNC_setsockopt() {
        return 49;
    }

    public static int BPF_FUNC_skb_adjust_room() {
        return 50;
    }

    public static int BPF_FUNC_redirect_map() {
        return 51;
    }

    public static int BPF_FUNC_sk_redirect_map() {
        return 52;
    }

    public static int BPF_FUNC_sock_map_update() {
        return 53;
    }

    public static int BPF_FUNC_xdp_adjust_meta() {
        return 54;
    }

    public static int BPF_FUNC_perf_event_read_value() {
        return 55;
    }

    public static int BPF_FUNC_perf_prog_read_value() {
        return 56;
    }

    public static int BPF_FUNC_getsockopt() {
        return 57;
    }

    public static int BPF_FUNC_override_return() {
        return 58;
    }

    public static int BPF_FUNC_sock_ops_cb_flags_set() {
        return 59;
    }

    public static int BPF_FUNC_msg_redirect_map() {
        return 60;
    }

    public static int BPF_FUNC_msg_apply_bytes() {
        return 61;
    }

    public static int BPF_FUNC_msg_cork_bytes() {
        return 62;
    }

    public static int BPF_FUNC_msg_pull_data() {
        return 63;
    }

    public static int BPF_FUNC_bind() {
        return 64;
    }

    public static int BPF_FUNC_xdp_adjust_tail() {
        return 65;
    }

    public static int BPF_FUNC_skb_get_xfrm_state() {
        return 66;
    }

    public static int BPF_FUNC_get_stack() {
        return 67;
    }

    public static int BPF_FUNC_skb_load_bytes_relative() {
        return 68;
    }

    public static int BPF_FUNC_fib_lookup() {
        return 69;
    }

    public static int BPF_FUNC_sock_hash_update() {
        return 70;
    }

    public static int BPF_FUNC_msg_redirect_hash() {
        return 71;
    }

    public static int BPF_FUNC_sk_redirect_hash() {
        return 72;
    }

    public static int BPF_FUNC_lwt_push_encap() {
        return 73;
    }

    public static int BPF_FUNC_lwt_seg6_store_bytes() {
        return 74;
    }

    public static int BPF_FUNC_lwt_seg6_adjust_srh() {
        return 75;
    }

    public static int BPF_FUNC_lwt_seg6_action() {
        return 76;
    }

    public static int BPF_FUNC_rc_repeat() {
        return 77;
    }

    public static int BPF_FUNC_rc_keydown() {
        return 78;
    }

    public static int BPF_FUNC_skb_cgroup_id() {
        return 79;
    }

    public static int BPF_FUNC_get_current_cgroup_id() {
        return 80;
    }

    public static int BPF_FUNC_get_local_storage() {
        return 81;
    }

    public static int BPF_FUNC_sk_select_reuseport() {
        return 82;
    }

    public static int BPF_FUNC_skb_ancestor_cgroup_id() {
        return 83;
    }

    public static int BPF_FUNC_sk_lookup_tcp() {
        return 84;
    }

    public static int BPF_FUNC_sk_lookup_udp() {
        return 85;
    }

    public static int BPF_FUNC_sk_release() {
        return 86;
    }

    public static int BPF_FUNC_map_push_elem() {
        return 87;
    }

    public static int BPF_FUNC_map_pop_elem() {
        return 88;
    }

    public static int BPF_FUNC_map_peek_elem() {
        return 89;
    }

    public static int BPF_FUNC_msg_push_data() {
        return 90;
    }

    public static int BPF_FUNC_msg_pop_data() {
        return 91;
    }

    public static int BPF_FUNC_rc_pointer_rel() {
        return 92;
    }

    public static int BPF_FUNC_spin_lock() {
        return 93;
    }

    public static int BPF_FUNC_spin_unlock() {
        return 94;
    }

    public static int BPF_FUNC_sk_fullsock() {
        return 95;
    }

    public static int BPF_FUNC_tcp_sock() {
        return 96;
    }

    public static int BPF_FUNC_skb_ecn_set_ce() {
        return 97;
    }

    public static int BPF_FUNC_get_listener_sock() {
        return 98;
    }

    public static int BPF_FUNC_skc_lookup_tcp() {
        return 99;
    }

    public static int BPF_FUNC_tcp_check_syncookie() {
        return 100;
    }

    public static int BPF_FUNC_sysctl_get_name() {
        return 101;
    }

    public static int BPF_FUNC_sysctl_get_current_value() {
        return 102;
    }

    public static int BPF_FUNC_sysctl_get_new_value() {
        return 103;
    }

    public static int BPF_FUNC_sysctl_set_new_value() {
        return 104;
    }

    public static int BPF_FUNC_strtol() {
        return 105;
    }

    public static int BPF_FUNC_strtoul() {
        return 106;
    }

    public static int BPF_FUNC_sk_storage_get() {
        return 107;
    }

    public static int BPF_FUNC_sk_storage_delete() {
        return 108;
    }

    public static int BPF_FUNC_send_signal() {
        return 109;
    }

    public static int BPF_FUNC_tcp_gen_syncookie() {
        return 110;
    }

    public static int BPF_FUNC_skb_output() {
        return 111;
    }

    public static int BPF_FUNC_probe_read_user() {
        return 112;
    }

    public static int BPF_FUNC_probe_read_kernel() {
        return 113;
    }

    public static int BPF_FUNC_probe_read_user_str() {
        return 114;
    }

    public static int BPF_FUNC_probe_read_kernel_str() {
        return 115;
    }

    public static int BPF_FUNC_tcp_send_ack() {
        return 116;
    }

    public static int BPF_FUNC_send_signal_thread() {
        return 117;
    }

    public static int BPF_FUNC_jiffies64() {
        return 118;
    }

    public static int BPF_FUNC_read_branch_records() {
        return 119;
    }

    public static int BPF_FUNC_get_ns_current_pid_tgid() {
        return 120;
    }

    public static int BPF_FUNC_xdp_output() {
        return 121;
    }

    public static int BPF_FUNC_get_netns_cookie() {
        return 122;
    }

    public static int BPF_FUNC_get_current_ancestor_cgroup_id() {
        return 123;
    }

    public static int BPF_FUNC_sk_assign() {
        return 124;
    }

    public static int BPF_FUNC_ktime_get_boot_ns() {
        return 125;
    }

    public static int BPF_FUNC_seq_printf() {
        return 126;
    }

    public static int BPF_FUNC_seq_write() {
        return 127;
    }

    public static int BPF_FUNC_sk_cgroup_id() {
        return 128;
    }

    public static int BPF_FUNC_sk_ancestor_cgroup_id() {
        return 129;
    }

    public static int BPF_FUNC_ringbuf_output() {
        return 130;
    }

    public static int BPF_FUNC_ringbuf_reserve() {
        return 131;
    }

    public static int BPF_FUNC_ringbuf_submit() {
        return 132;
    }

    public static int BPF_FUNC_ringbuf_discard() {
        return 133;
    }

    public static int BPF_FUNC_ringbuf_query() {
        return 134;
    }

    public static int BPF_FUNC_csum_level() {
        return 135;
    }

    public static int BPF_FUNC_skc_to_tcp6_sock() {
        return 136;
    }

    public static int BPF_FUNC_skc_to_tcp_sock() {
        return 137;
    }

    public static int BPF_FUNC_skc_to_tcp_timewait_sock() {
        return 138;
    }

    public static int BPF_FUNC_skc_to_tcp_request_sock() {
        return 139;
    }

    public static int BPF_FUNC_skc_to_udp6_sock() {
        return 140;
    }

    public static int BPF_FUNC_get_task_stack() {
        return 141;
    }

    public static int BPF_FUNC_load_hdr_opt() {
        return 142;
    }

    public static int BPF_FUNC_store_hdr_opt() {
        return 143;
    }

    public static int BPF_FUNC_reserve_hdr_opt() {
        return 144;
    }

    public static int BPF_FUNC_inode_storage_get() {
        return 145;
    }

    public static int BPF_FUNC_inode_storage_delete() {
        return 146;
    }

    public static int BPF_FUNC_d_path() {
        return 147;
    }

    public static int BPF_FUNC_copy_from_user() {
        return 148;
    }

    public static int BPF_FUNC_snprintf_btf() {
        return 149;
    }

    public static int BPF_FUNC_seq_printf_btf() {
        return 150;
    }

    public static int BPF_FUNC_skb_cgroup_classid() {
        return 151;
    }

    public static int BPF_FUNC_redirect_neigh() {
        return 152;
    }

    public static int BPF_FUNC_per_cpu_ptr() {
        return 153;
    }

    public static int BPF_FUNC_this_cpu_ptr() {
        return 154;
    }

    public static int BPF_FUNC_redirect_peer() {
        return 155;
    }

    public static int BPF_FUNC_task_storage_get() {
        return 156;
    }

    public static int BPF_FUNC_task_storage_delete() {
        return 157;
    }

    public static int BPF_FUNC_get_current_task_btf() {
        return 158;
    }

    public static int BPF_FUNC_bprm_opts_set() {
        return 159;
    }

    public static int BPF_FUNC_ktime_get_coarse_ns() {
        return 160;
    }

    public static int BPF_FUNC_ima_inode_hash() {
        return 161;
    }

    public static int BPF_FUNC_sock_from_file() {
        return 162;
    }

    public static int BPF_FUNC_check_mtu() {
        return 163;
    }

    public static int BPF_FUNC_for_each_map_elem() {
        return 164;
    }

    public static int BPF_FUNC_snprintf() {
        return 165;
    }

    public static int BPF_FUNC_sys_bpf() {
        return 166;
    }

    public static int BPF_FUNC_btf_find_by_name_kind() {
        return 167;
    }

    public static int BPF_FUNC_sys_close() {
        return 168;
    }

    public static int BPF_FUNC_timer_init() {
        return 169;
    }

    public static int BPF_FUNC_timer_set_callback() {
        return 170;
    }

    public static int BPF_FUNC_timer_start() {
        return 171;
    }

    public static int BPF_FUNC_timer_cancel() {
        return 172;
    }

    public static int BPF_FUNC_get_func_ip() {
        return 173;
    }

    public static int BPF_FUNC_get_attach_cookie() {
        return 174;
    }

    public static int BPF_FUNC_task_pt_regs() {
        return 175;
    }

    public static int BPF_FUNC_get_branch_snapshot() {
        return 176;
    }

    public static int BPF_FUNC_trace_vprintk() {
        return 177;
    }

    public static int BPF_FUNC_skc_to_unix_sock() {
        return 178;
    }

    public static int BPF_FUNC_kallsyms_lookup_name() {
        return 179;
    }

    public static int BPF_FUNC_find_vma() {
        return 180;
    }

    public static int BPF_FUNC_loop() {
        return 181;
    }

    public static int BPF_FUNC_strncmp() {
        return 182;
    }

    public static int BPF_FUNC_get_func_arg() {
        return 183;
    }

    public static int BPF_FUNC_get_func_ret() {
        return 184;
    }

    public static int BPF_FUNC_get_func_arg_cnt() {
        return 185;
    }

    public static int BPF_FUNC_get_retval() {
        return 186;
    }

    public static int BPF_FUNC_set_retval() {
        return 187;
    }

    public static int BPF_FUNC_xdp_get_buff_len() {
        return 188;
    }

    public static int BPF_FUNC_xdp_load_bytes() {
        return 189;
    }

    public static int BPF_FUNC_xdp_store_bytes() {
        return 190;
    }

    public static int BPF_FUNC_copy_from_user_task() {
        return 191;
    }

    public static int BPF_FUNC_skb_set_tstamp() {
        return 192;
    }

    public static int BPF_FUNC_ima_file_hash() {
        return 193;
    }

    public static int BPF_FUNC_kptr_xchg() {
        return 194;
    }

    public static int BPF_FUNC_map_lookup_percpu_elem() {
        return 195;
    }

    public static int BPF_FUNC_skc_to_mptcp_sock() {
        return 196;
    }

    public static int BPF_FUNC_dynptr_from_mem() {
        return 197;
    }

    public static int BPF_FUNC_ringbuf_reserve_dynptr() {
        return 198;
    }

    public static int BPF_FUNC_ringbuf_submit_dynptr() {
        return 199;
    }

    public static int BPF_FUNC_ringbuf_discard_dynptr() {
        return 200;
    }

    public static int BPF_FUNC_dynptr_read() {
        return 201;
    }

    public static int BPF_FUNC_dynptr_write() {
        return 202;
    }

    public static int BPF_FUNC_dynptr_data() {
        return 203;
    }

    public static int BPF_FUNC_tcp_raw_gen_syncookie_ipv4() {
        return 204;
    }

    public static int BPF_FUNC_tcp_raw_gen_syncookie_ipv6() {
        return 205;
    }

    public static int BPF_FUNC_tcp_raw_check_syncookie_ipv4() {
        return 206;
    }

    public static int BPF_FUNC_tcp_raw_check_syncookie_ipv6() {
        return 207;
    }

    public static int BPF_FUNC_ktime_get_tai_ns() {
        return 208;
    }

    public static int BPF_FUNC_user_ringbuf_drain() {
        return 209;
    }

    public static int BPF_FUNC_cgrp_storage_get() {
        return 210;
    }

    public static int BPF_FUNC_cgrp_storage_delete() {
        return 211;
    }

    public static int __BPF_FUNC_MAX_ID() {
        return 212;
    }

    public static int BPF_F_RECOMPUTE_CSUM() {
        return 1;
    }

    public static int BPF_F_INVALIDATE_HASH() {
        return 2;
    }

    public static int BPF_F_HDR_FIELD_MASK() {
        return 15;
    }

    public static int BPF_F_PSEUDO_HDR() {
        return 16;
    }

    public static int BPF_F_MARK_MANGLED_0() {
        return 32;
    }

    public static int BPF_F_MARK_ENFORCE() {
        return 64;
    }

    public static int BPF_F_TUNINFO_IPV6() {
        return 1;
    }

    public static int BPF_F_SKIP_FIELD_MASK() {
        return 255;
    }

    public static int BPF_F_USER_STACK() {
        return 256;
    }

    public static int BPF_F_FAST_STACK_CMP() {
        return 512;
    }

    public static int BPF_F_REUSE_STACKID() {
        return 1024;
    }

    public static int BPF_F_USER_BUILD_ID() {
        return 2048;
    }

    public static int BPF_F_ZERO_CSUM_TX() {
        return 2;
    }

    public static int BPF_F_DONT_FRAGMENT() {
        return 4;
    }

    public static int BPF_F_SEQ_NUMBER() {
        return 8;
    }

    public static int BPF_F_NO_TUNNEL_KEY() {
        return 16;
    }

    public static int BPF_F_TUNINFO_FLAGS() {
        return 16;
    }

    public static long BPF_F_INDEX_MASK() {
        return 0xFFFFFFFFL;
    }

    public static long BPF_F_CURRENT_CPU() {
        return 0xFFFFFFFFL;
    }

    public static long BPF_F_CTXLEN_MASK() {
        return 0xFFFFF00000000L;
    }

    public static int BPF_F_CURRENT_NETNS() {
        return -1;
    }

    public static int BPF_CSUM_LEVEL_QUERY() {
        return 0;
    }

    public static int BPF_CSUM_LEVEL_INC() {
        return 1;
    }

    public static int BPF_CSUM_LEVEL_DEC() {
        return 2;
    }

    public static int BPF_CSUM_LEVEL_RESET() {
        return 3;
    }

    public static int BPF_F_ADJ_ROOM_FIXED_GSO() {
        return 1;
    }

    public static int BPF_F_ADJ_ROOM_ENCAP_L3_IPV4() {
        return 2;
    }

    public static int BPF_F_ADJ_ROOM_ENCAP_L3_IPV6() {
        return 4;
    }

    public static int BPF_F_ADJ_ROOM_ENCAP_L4_GRE() {
        return 8;
    }

    public static int BPF_F_ADJ_ROOM_ENCAP_L4_UDP() {
        return 16;
    }

    public static int BPF_F_ADJ_ROOM_NO_CSUM_RESET() {
        return 32;
    }

    public static int BPF_F_ADJ_ROOM_ENCAP_L2_ETH() {
        return 64;
    }

    public static int BPF_F_ADJ_ROOM_DECAP_L3_IPV4() {
        return 128;
    }

    public static int BPF_F_ADJ_ROOM_DECAP_L3_IPV6() {
        return 256;
    }

    public static int BPF_ADJ_ROOM_ENCAP_L2_MASK() {
        return 255;
    }

    public static int BPF_ADJ_ROOM_ENCAP_L2_SHIFT() {
        return 56;
    }

    public static int BPF_F_SYSCTL_BASE_NAME() {
        return 1;
    }

    public static int BPF_LOCAL_STORAGE_GET_F_CREATE() {
        return 1;
    }

    public static int BPF_SK_STORAGE_GET_F_CREATE() {
        return 1;
    }

    public static int BPF_F_GET_BRANCH_RECORDS_SIZE() {
        return 1;
    }

    public static int BPF_RB_NO_WAKEUP() {
        return 1;
    }

    public static int BPF_RB_FORCE_WAKEUP() {
        return 2;
    }

    public static int BPF_RB_AVAIL_DATA() {
        return 0;
    }

    public static int BPF_RB_RING_SIZE() {
        return 1;
    }

    public static int BPF_RB_CONS_POS() {
        return 2;
    }

    public static int BPF_RB_PROD_POS() {
        return 3;
    }

    public static int BPF_RINGBUF_BUSY_BIT() {
        return Integer.MIN_VALUE;
    }

    public static int BPF_RINGBUF_DISCARD_BIT() {
        return 0x40000000;
    }

    public static int BPF_RINGBUF_HDR_SZ() {
        return 8;
    }

    public static int BPF_SK_LOOKUP_F_REPLACE() {
        return 1;
    }

    public static int BPF_SK_LOOKUP_F_NO_REUSEPORT() {
        return 2;
    }

    public static int BPF_ADJ_ROOM_NET() {
        return 0;
    }

    public static int BPF_ADJ_ROOM_MAC() {
        return 1;
    }

    public static int BPF_HDR_START_MAC() {
        return 0;
    }

    public static int BPF_HDR_START_NET() {
        return 1;
    }

    public static int BPF_LWT_ENCAP_SEG6() {
        return 0;
    }

    public static int BPF_LWT_ENCAP_SEG6_INLINE() {
        return 1;
    }

    public static int BPF_LWT_ENCAP_IP() {
        return 2;
    }

    public static int BPF_F_BPRM_SECUREEXEC() {
        return 1;
    }

    public static int BPF_F_INGRESS() {
        return 1;
    }

    public static int BPF_F_BROADCAST() {
        return 8;
    }

    public static int BPF_F_EXCLUDE_INGRESS() {
        return 16;
    }

    public static int BPF_SKB_TSTAMP_UNSPEC() {
        return 0;
    }

    public static int BPF_SKB_TSTAMP_DELIVERY_MONO() {
        return 1;
    }

    public static int BPF_SKB_CLOCK_REALTIME() {
        return 0;
    }

    public static int BPF_SKB_CLOCK_MONOTONIC() {
        return 1;
    }

    public static int BPF_SKB_CLOCK_TAI() {
        return 2;
    }

    public static int BPF_OK() {
        return 0;
    }

    public static int BPF_DROP() {
        return 2;
    }

    public static int BPF_REDIRECT() {
        return 7;
    }

    public static int BPF_LWT_REROUTE() {
        return 128;
    }

    public static int BPF_FLOW_DISSECTOR_CONTINUE() {
        return 129;
    }

    public static int TCX_NEXT() {
        return -1;
    }

    public static int TCX_PASS() {
        return 0;
    }

    public static int TCX_DROP() {
        return 2;
    }

    public static int TCX_REDIRECT() {
        return 7;
    }

    public static int XDP_ABORTED() {
        return 0;
    }

    public static int XDP_DROP() {
        return 1;
    }

    public static int XDP_PASS() {
        return 2;
    }

    public static int XDP_TX() {
        return 3;
    }

    public static int XDP_REDIRECT() {
        return 4;
    }

    public static int SK_DROP() {
        return 0;
    }

    public static int SK_PASS() {
        return 1;
    }

    public static int BPF_SOCK_OPS_RTO_CB_FLAG() {
        return 1;
    }

    public static int BPF_SOCK_OPS_RETRANS_CB_FLAG() {
        return 2;
    }

    public static int BPF_SOCK_OPS_STATE_CB_FLAG() {
        return 4;
    }

    public static int BPF_SOCK_OPS_RTT_CB_FLAG() {
        return 8;
    }

    public static int BPF_SOCK_OPS_PARSE_ALL_HDR_OPT_CB_FLAG() {
        return 16;
    }

    public static int BPF_SOCK_OPS_PARSE_UNKNOWN_HDR_OPT_CB_FLAG() {
        return 32;
    }

    public static int BPF_SOCK_OPS_WRITE_HDR_OPT_CB_FLAG() {
        return 64;
    }

    public static int BPF_SOCK_OPS_ALL_CB_FLAGS() {
        return 127;
    }

    public static int BPF_SOCK_OPS_VOID() {
        return 0;
    }

    public static int BPF_SOCK_OPS_TIMEOUT_INIT() {
        return 1;
    }

    public static int BPF_SOCK_OPS_RWND_INIT() {
        return 2;
    }

    public static int BPF_SOCK_OPS_TCP_CONNECT_CB() {
        return 3;
    }

    public static int BPF_SOCK_OPS_ACTIVE_ESTABLISHED_CB() {
        return 4;
    }

    public static int BPF_SOCK_OPS_PASSIVE_ESTABLISHED_CB() {
        return 5;
    }

    public static int BPF_SOCK_OPS_NEEDS_ECN() {
        return 6;
    }

    public static int BPF_SOCK_OPS_BASE_RTT() {
        return 7;
    }

    public static int BPF_SOCK_OPS_RTO_CB() {
        return 8;
    }

    public static int BPF_SOCK_OPS_RETRANS_CB() {
        return 9;
    }

    public static int BPF_SOCK_OPS_STATE_CB() {
        return 10;
    }

    public static int BPF_SOCK_OPS_TCP_LISTEN_CB() {
        return 11;
    }

    public static int BPF_SOCK_OPS_RTT_CB() {
        return 12;
    }

    public static int BPF_SOCK_OPS_PARSE_HDR_OPT_CB() {
        return 13;
    }

    public static int BPF_SOCK_OPS_HDR_OPT_LEN_CB() {
        return 14;
    }

    public static int BPF_SOCK_OPS_WRITE_HDR_OPT_CB() {
        return 15;
    }

    public static int BPF_TCP_ESTABLISHED() {
        return 1;
    }

    public static int BPF_TCP_SYN_SENT() {
        return 2;
    }

    public static int BPF_TCP_SYN_RECV() {
        return 3;
    }

    public static int BPF_TCP_FIN_WAIT1() {
        return 4;
    }

    public static int BPF_TCP_FIN_WAIT2() {
        return 5;
    }

    public static int BPF_TCP_TIME_WAIT() {
        return 6;
    }

    public static int BPF_TCP_CLOSE() {
        return 7;
    }

    public static int BPF_TCP_CLOSE_WAIT() {
        return 8;
    }

    public static int BPF_TCP_LAST_ACK() {
        return 9;
    }

    public static int BPF_TCP_LISTEN() {
        return 10;
    }

    public static int BPF_TCP_CLOSING() {
        return 11;
    }

    public static int BPF_TCP_NEW_SYN_RECV() {
        return 12;
    }

    public static int BPF_TCP_BOUND_INACTIVE() {
        return 13;
    }

    public static int BPF_TCP_MAX_STATES() {
        return 14;
    }

    public static int TCP_BPF_IW() {
        return 1001;
    }

    public static int TCP_BPF_SNDCWND_CLAMP() {
        return 1002;
    }

    public static int TCP_BPF_DELACK_MAX() {
        return 1003;
    }

    public static int TCP_BPF_RTO_MIN() {
        return 1004;
    }

    public static int TCP_BPF_SYN() {
        return 1005;
    }

    public static int TCP_BPF_SYN_IP() {
        return 1006;
    }

    public static int TCP_BPF_SYN_MAC() {
        return 1007;
    }

    public static int TCP_BPF_SOCK_OPS_CB_FLAGS() {
        return 1008;
    }

    public static int BPF_LOAD_HDR_OPT_TCP_SYN() {
        return 1;
    }

    public static int BPF_WRITE_HDR_TCP_CURRENT_MSS() {
        return 1;
    }

    public static int BPF_WRITE_HDR_TCP_SYNACK_COOKIE() {
        return 2;
    }

    public static int BPF_DEVCG_ACC_MKNOD() {
        return 1;
    }

    public static int BPF_DEVCG_ACC_READ() {
        return 2;
    }

    public static int BPF_DEVCG_ACC_WRITE() {
        return 4;
    }

    public static int BPF_DEVCG_DEV_BLOCK() {
        return 1;
    }

    public static int BPF_DEVCG_DEV_CHAR() {
        return 2;
    }

    public static int BPF_FIB_LOOKUP_DIRECT() {
        return 1;
    }

    public static int BPF_FIB_LOOKUP_OUTPUT() {
        return 2;
    }

    public static int BPF_FIB_LOOKUP_SKIP_NEIGH() {
        return 4;
    }

    public static int BPF_FIB_LOOKUP_TBID() {
        return 8;
    }

    public static int BPF_FIB_LOOKUP_SRC() {
        return 16;
    }

    public static int BPF_FIB_LOOKUP_MARK() {
        return 32;
    }

    public static int BPF_FIB_LKUP_RET_SUCCESS() {
        return 0;
    }

    public static int BPF_FIB_LKUP_RET_BLACKHOLE() {
        return 1;
    }

    public static int BPF_FIB_LKUP_RET_UNREACHABLE() {
        return 2;
    }

    public static int BPF_FIB_LKUP_RET_PROHIBIT() {
        return 3;
    }

    public static int BPF_FIB_LKUP_RET_NOT_FWDED() {
        return 4;
    }

    public static int BPF_FIB_LKUP_RET_FWD_DISABLED() {
        return 5;
    }

    public static int BPF_FIB_LKUP_RET_UNSUPP_LWT() {
        return 6;
    }

    public static int BPF_FIB_LKUP_RET_NO_NEIGH() {
        return 7;
    }

    public static int BPF_FIB_LKUP_RET_FRAG_NEEDED() {
        return 8;
    }

    public static int BPF_FIB_LKUP_RET_NO_SRC_ADDR() {
        return 9;
    }

    public static int BPF_MTU_CHK_SEGS() {
        return 1;
    }

    public static int BPF_MTU_CHK_RET_SUCCESS() {
        return 0;
    }

    public static int BPF_MTU_CHK_RET_FRAG_NEEDED() {
        return 1;
    }

    public static int BPF_MTU_CHK_RET_SEGS_TOOBIG() {
        return 2;
    }

    public static int BPF_FD_TYPE_RAW_TRACEPOINT() {
        return 0;
    }

    public static int BPF_FD_TYPE_TRACEPOINT() {
        return 1;
    }

    public static int BPF_FD_TYPE_KPROBE() {
        return 2;
    }

    public static int BPF_FD_TYPE_KRETPROBE() {
        return 3;
    }

    public static int BPF_FD_TYPE_UPROBE() {
        return 4;
    }

    public static int BPF_FD_TYPE_URETPROBE() {
        return 5;
    }

    public static int BPF_FLOW_DISSECTOR_F_PARSE_1ST_FRAG() {
        return 1;
    }

    public static int BPF_FLOW_DISSECTOR_F_STOP_AT_FLOW_LABEL() {
        return 2;
    }

    public static int BPF_FLOW_DISSECTOR_F_STOP_AT_ENCAP() {
        return 4;
    }

    public static int BTF_F_COMPACT() {
        return 1;
    }

    public static int BTF_F_NONAME() {
        return 2;
    }

    public static int BTF_F_PTR_RAW() {
        return 4;
    }

    public static int BTF_F_ZERO() {
        return 8;
    }

    public static int BPF_CORE_FIELD_BYTE_OFFSET() {
        return 0;
    }

    public static int BPF_CORE_FIELD_BYTE_SIZE() {
        return 1;
    }

    public static int BPF_CORE_FIELD_EXISTS() {
        return 2;
    }

    public static int BPF_CORE_FIELD_SIGNED() {
        return 3;
    }

    public static int BPF_CORE_FIELD_LSHIFT_U64() {
        return 4;
    }

    public static int BPF_CORE_FIELD_RSHIFT_U64() {
        return 5;
    }

    public static int BPF_CORE_TYPE_ID_LOCAL() {
        return 6;
    }

    public static int BPF_CORE_TYPE_ID_TARGET() {
        return 7;
    }

    public static int BPF_CORE_TYPE_EXISTS() {
        return 8;
    }

    public static int BPF_CORE_TYPE_SIZE() {
        return 9;
    }

    public static int BPF_CORE_ENUMVAL_EXISTS() {
        return 10;
    }

    public static int BPF_CORE_ENUMVAL_VALUE() {
        return 11;
    }

    public static int BPF_CORE_TYPE_MATCHES() {
        return 12;
    }

    public static int BPF_F_TIMER_ABS() {
        return 1;
    }

    public static int BPF_F_TIMER_CPU_PIN() {
        return 2;
    }

    public static int BPF_F_PAD_ZEROS() {
        return 1;
    }

    public static FunctionDescriptor memcpy$descriptor() {
        return memcpy.DESC;
    }

    public static MethodHandle memcpy$handle() {
        return memcpy.HANDLE;
    }

    public static MemorySegment memcpy$address() {
        return memcpy.ADDR;
    }

    public static MemorySegment memcpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = memcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memcpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor memmove$descriptor() {
        return memmove.DESC;
    }

    public static MethodHandle memmove$handle() {
        return memmove.HANDLE;
    }

    public static MemorySegment memmove$address() {
        return memmove.ADDR;
    }

    public static MemorySegment memmove(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = memmove.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memmove", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor memccpy$descriptor() {
        return memccpy.DESC;
    }

    public static MethodHandle memccpy$handle() {
        return memccpy.HANDLE;
    }

    public static MemorySegment memccpy$address() {
        return memccpy.ADDR;
    }

    public static MemorySegment memccpy(MemorySegment __dest, MemorySegment __src, int __c, long __n) {
        MethodHandle mh$ = memccpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memccpy", __dest, __src, __c, __n);
            }
            return mh$.invokeExact(__dest, __src, __c, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor memset$descriptor() {
        return memset.DESC;
    }

    public static MethodHandle memset$handle() {
        return memset.HANDLE;
    }

    public static MemorySegment memset$address() {
        return memset.ADDR;
    }

    public static MemorySegment memset(MemorySegment __s, int __c, long __n) {
        MethodHandle mh$ = memset.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memset", __s, __c, __n);
            }
            return mh$.invokeExact(__s, __c, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor memcmp$descriptor() {
        return memcmp.DESC;
    }

    public static MethodHandle memcmp$handle() {
        return memcmp.HANDLE;
    }

    public static MemorySegment memcmp$address() {
        return memcmp.ADDR;
    }

    public static int memcmp(MemorySegment __s1, MemorySegment __s2, long __n) {
        MethodHandle mh$ = memcmp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memcmp", __s1, __s2, __n);
            }
            return mh$.invokeExact(__s1, __s2, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __memcmpeq$descriptor() {
        return __memcmpeq.DESC;
    }

    public static MethodHandle __memcmpeq$handle() {
        return __memcmpeq.HANDLE;
    }

    public static MemorySegment __memcmpeq$address() {
        return __memcmpeq.ADDR;
    }

    public static int __memcmpeq(MemorySegment __s1, MemorySegment __s2, long __n) {
        MethodHandle mh$ = __memcmpeq.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__memcmpeq", __s1, __s2, __n);
            }
            return mh$.invokeExact(__s1, __s2, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor memchr$descriptor() {
        return memchr.DESC;
    }

    public static MethodHandle memchr$handle() {
        return memchr.HANDLE;
    }

    public static MemorySegment memchr$address() {
        return memchr.ADDR;
    }

    public static MemorySegment memchr(MemorySegment __s, int __c, long __n) {
        MethodHandle mh$ = memchr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memchr", __s, __c, __n);
            }
            return mh$.invokeExact(__s, __c, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcpy$descriptor() {
        return strcpy.DESC;
    }

    public static MethodHandle strcpy$handle() {
        return strcpy.HANDLE;
    }

    public static MemorySegment strcpy$address() {
        return strcpy.ADDR;
    }

    public static MemorySegment strcpy(MemorySegment __dest, MemorySegment __src) {
        MethodHandle mh$ = strcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcpy", __dest, __src);
            }
            return mh$.invokeExact(__dest, __src);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strncpy$descriptor() {
        return strncpy.DESC;
    }

    public static MethodHandle strncpy$handle() {
        return strncpy.HANDLE;
    }

    public static MemorySegment strncpy$address() {
        return strncpy.ADDR;
    }

    public static MemorySegment strncpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = strncpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strncpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcat$descriptor() {
        return strcat.DESC;
    }

    public static MethodHandle strcat$handle() {
        return strcat.HANDLE;
    }

    public static MemorySegment strcat$address() {
        return strcat.ADDR;
    }

    public static MemorySegment strcat(MemorySegment __dest, MemorySegment __src) {
        MethodHandle mh$ = strcat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcat", __dest, __src);
            }
            return mh$.invokeExact(__dest, __src);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strncat$descriptor() {
        return strncat.DESC;
    }

    public static MethodHandle strncat$handle() {
        return strncat.HANDLE;
    }

    public static MemorySegment strncat$address() {
        return strncat.ADDR;
    }

    public static MemorySegment strncat(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = strncat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strncat", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcmp$descriptor() {
        return strcmp.DESC;
    }

    public static MethodHandle strcmp$handle() {
        return strcmp.HANDLE;
    }

    public static MemorySegment strcmp$address() {
        return strcmp.ADDR;
    }

    public static int strcmp(MemorySegment __s1, MemorySegment __s2) {
        MethodHandle mh$ = strcmp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcmp", __s1, __s2);
            }
            return mh$.invokeExact(__s1, __s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strncmp$descriptor() {
        return strncmp.DESC;
    }

    public static MethodHandle strncmp$handle() {
        return strncmp.HANDLE;
    }

    public static MemorySegment strncmp$address() {
        return strncmp.ADDR;
    }

    public static int strncmp(MemorySegment __s1, MemorySegment __s2, long __n) {
        MethodHandle mh$ = strncmp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strncmp", __s1, __s2, __n);
            }
            return mh$.invokeExact(__s1, __s2, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcoll$descriptor() {
        return strcoll.DESC;
    }

    public static MethodHandle strcoll$handle() {
        return strcoll.HANDLE;
    }

    public static MemorySegment strcoll$address() {
        return strcoll.ADDR;
    }

    public static int strcoll(MemorySegment __s1, MemorySegment __s2) {
        MethodHandle mh$ = strcoll.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcoll", __s1, __s2);
            }
            return mh$.invokeExact(__s1, __s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strxfrm$descriptor() {
        return strxfrm.DESC;
    }

    public static MethodHandle strxfrm$handle() {
        return strxfrm.HANDLE;
    }

    public static MemorySegment strxfrm$address() {
        return strxfrm.ADDR;
    }

    public static long strxfrm(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = strxfrm.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strxfrm", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcoll_l$descriptor() {
        return strcoll_l.DESC;
    }

    public static MethodHandle strcoll_l$handle() {
        return strcoll_l.HANDLE;
    }

    public static MemorySegment strcoll_l$address() {
        return strcoll_l.ADDR;
    }

    public static int strcoll_l(MemorySegment __s1, MemorySegment __s2, MemorySegment __l) {
        MethodHandle mh$ = strcoll_l.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcoll_l", __s1, __s2, __l);
            }
            return mh$.invokeExact(__s1, __s2, __l);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strxfrm_l$descriptor() {
        return strxfrm_l.DESC;
    }

    public static MethodHandle strxfrm_l$handle() {
        return strxfrm_l.HANDLE;
    }

    public static MemorySegment strxfrm_l$address() {
        return strxfrm_l.ADDR;
    }

    public static long strxfrm_l(MemorySegment __dest, MemorySegment __src, long __n, MemorySegment __l) {
        MethodHandle mh$ = strxfrm_l.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strxfrm_l", __dest, __src, __n, __l);
            }
            return mh$.invokeExact(__dest, __src, __n, __l);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strdup$descriptor() {
        return strdup.DESC;
    }

    public static MethodHandle strdup$handle() {
        return strdup.HANDLE;
    }

    public static MemorySegment strdup$address() {
        return strdup.ADDR;
    }

    public static MemorySegment strdup(MemorySegment __s) {
        MethodHandle mh$ = strdup.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strdup", __s);
            }
            return mh$.invokeExact(__s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strndup$descriptor() {
        return strndup.DESC;
    }

    public static MethodHandle strndup$handle() {
        return strndup.HANDLE;
    }

    public static MemorySegment strndup$address() {
        return strndup.ADDR;
    }

    public static MemorySegment strndup(MemorySegment __string, long __n) {
        MethodHandle mh$ = strndup.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strndup", __string, __n);
            }
            return mh$.invokeExact(__string, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strchr$descriptor() {
        return strchr.DESC;
    }

    public static MethodHandle strchr$handle() {
        return strchr.HANDLE;
    }

    public static MemorySegment strchr$address() {
        return strchr.ADDR;
    }

    public static MemorySegment strchr(MemorySegment __s, int __c) {
        MethodHandle mh$ = strchr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strchr", __s, __c);
            }
            return mh$.invokeExact(__s, __c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strrchr$descriptor() {
        return strrchr.DESC;
    }

    public static MethodHandle strrchr$handle() {
        return strrchr.HANDLE;
    }

    public static MemorySegment strrchr$address() {
        return strrchr.ADDR;
    }

    public static MemorySegment strrchr(MemorySegment __s, int __c) {
        MethodHandle mh$ = strrchr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strrchr", __s, __c);
            }
            return mh$.invokeExact(__s, __c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strchrnul$descriptor() {
        return strchrnul.DESC;
    }

    public static MethodHandle strchrnul$handle() {
        return strchrnul.HANDLE;
    }

    public static MemorySegment strchrnul$address() {
        return strchrnul.ADDR;
    }

    public static MemorySegment strchrnul(MemorySegment __s, int __c) {
        MethodHandle mh$ = strchrnul.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strchrnul", __s, __c);
            }
            return mh$.invokeExact(__s, __c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcspn$descriptor() {
        return strcspn.DESC;
    }

    public static MethodHandle strcspn$handle() {
        return strcspn.HANDLE;
    }

    public static MemorySegment strcspn$address() {
        return strcspn.ADDR;
    }

    public static long strcspn(MemorySegment __s, MemorySegment __reject) {
        MethodHandle mh$ = strcspn.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcspn", __s, __reject);
            }
            return mh$.invokeExact(__s, __reject);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strspn$descriptor() {
        return strspn.DESC;
    }

    public static MethodHandle strspn$handle() {
        return strspn.HANDLE;
    }

    public static MemorySegment strspn$address() {
        return strspn.ADDR;
    }

    public static long strspn(MemorySegment __s, MemorySegment __accept) {
        MethodHandle mh$ = strspn.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strspn", __s, __accept);
            }
            return mh$.invokeExact(__s, __accept);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strpbrk$descriptor() {
        return strpbrk.DESC;
    }

    public static MethodHandle strpbrk$handle() {
        return strpbrk.HANDLE;
    }

    public static MemorySegment strpbrk$address() {
        return strpbrk.ADDR;
    }

    public static MemorySegment strpbrk(MemorySegment __s, MemorySegment __accept) {
        MethodHandle mh$ = strpbrk.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strpbrk", __s, __accept);
            }
            return mh$.invokeExact(__s, __accept);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strstr$descriptor() {
        return strstr.DESC;
    }

    public static MethodHandle strstr$handle() {
        return strstr.HANDLE;
    }

    public static MemorySegment strstr$address() {
        return strstr.ADDR;
    }

    public static MemorySegment strstr(MemorySegment __haystack, MemorySegment __needle) {
        MethodHandle mh$ = strstr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strstr", __haystack, __needle);
            }
            return mh$.invokeExact(__haystack, __needle);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strtok$descriptor() {
        return strtok.DESC;
    }

    public static MethodHandle strtok$handle() {
        return strtok.HANDLE;
    }

    public static MemorySegment strtok$address() {
        return strtok.ADDR;
    }

    public static MemorySegment strtok(MemorySegment __s, MemorySegment __delim) {
        MethodHandle mh$ = strtok.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strtok", __s, __delim);
            }
            return mh$.invokeExact(__s, __delim);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __strtok_r$descriptor() {
        return __strtok_r.DESC;
    }

    public static MethodHandle __strtok_r$handle() {
        return __strtok_r.HANDLE;
    }

    public static MemorySegment __strtok_r$address() {
        return __strtok_r.ADDR;
    }

    public static MemorySegment __strtok_r(MemorySegment __s, MemorySegment __delim, MemorySegment __save_ptr) {
        MethodHandle mh$ = __strtok_r.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__strtok_r", __s, __delim, __save_ptr);
            }
            return mh$.invokeExact(__s, __delim, __save_ptr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strtok_r$descriptor() {
        return strtok_r.DESC;
    }

    public static MethodHandle strtok_r$handle() {
        return strtok_r.HANDLE;
    }

    public static MemorySegment strtok_r$address() {
        return strtok_r.ADDR;
    }

    public static MemorySegment strtok_r(MemorySegment __s, MemorySegment __delim, MemorySegment __save_ptr) {
        MethodHandle mh$ = strtok_r.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strtok_r", __s, __delim, __save_ptr);
            }
            return mh$.invokeExact(__s, __delim, __save_ptr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcasestr$descriptor() {
        return strcasestr.DESC;
    }

    public static MethodHandle strcasestr$handle() {
        return strcasestr.HANDLE;
    }

    public static MemorySegment strcasestr$address() {
        return strcasestr.ADDR;
    }

    public static MemorySegment strcasestr(MemorySegment __haystack, MemorySegment __needle) {
        MethodHandle mh$ = strcasestr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcasestr", __haystack, __needle);
            }
            return mh$.invokeExact(__haystack, __needle);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor memmem$descriptor() {
        return memmem.DESC;
    }

    public static MethodHandle memmem$handle() {
        return memmem.HANDLE;
    }

    public static MemorySegment memmem$address() {
        return memmem.ADDR;
    }

    public static MemorySegment memmem(MemorySegment __haystack, long __haystacklen, MemorySegment __needle, long __needlelen) {
        MethodHandle mh$ = memmem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("memmem", __haystack, __haystacklen, __needle, __needlelen);
            }
            return mh$.invokeExact(__haystack, __haystacklen, __needle, __needlelen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __mempcpy$descriptor() {
        return __mempcpy.DESC;
    }

    public static MethodHandle __mempcpy$handle() {
        return __mempcpy.HANDLE;
    }

    public static MemorySegment __mempcpy$address() {
        return __mempcpy.ADDR;
    }

    public static MemorySegment __mempcpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = __mempcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__mempcpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor mempcpy$descriptor() {
        return mempcpy.DESC;
    }

    public static MethodHandle mempcpy$handle() {
        return mempcpy.HANDLE;
    }

    public static MemorySegment mempcpy$address() {
        return mempcpy.ADDR;
    }

    public static MemorySegment mempcpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = mempcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("mempcpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strlen$descriptor() {
        return strlen.DESC;
    }

    public static MethodHandle strlen$handle() {
        return strlen.HANDLE;
    }

    public static MemorySegment strlen$address() {
        return strlen.ADDR;
    }

    public static long strlen(MemorySegment __s) {
        MethodHandle mh$ = strlen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strlen", __s);
            }
            return mh$.invokeExact(__s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strnlen$descriptor() {
        return strnlen.DESC;
    }

    public static MethodHandle strnlen$handle() {
        return strnlen.HANDLE;
    }

    public static MemorySegment strnlen$address() {
        return strnlen.ADDR;
    }

    public static long strnlen(MemorySegment __string, long __maxlen) {
        MethodHandle mh$ = strnlen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strnlen", __string, __maxlen);
            }
            return mh$.invokeExact(__string, __maxlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strerror$descriptor() {
        return strerror.DESC;
    }

    public static MethodHandle strerror$handle() {
        return strerror.HANDLE;
    }

    public static MemorySegment strerror$address() {
        return strerror.ADDR;
    }

    public static MemorySegment strerror(int __errnum) {
        MethodHandle mh$ = strerror.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strerror", __errnum);
            }
            return mh$.invokeExact(__errnum);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strerror_r$descriptor() {
        return strerror_r.DESC;
    }

    public static MethodHandle strerror_r$handle() {
        return strerror_r.HANDLE;
    }

    public static MemorySegment strerror_r$address() {
        return strerror_r.ADDR;
    }

    public static int strerror_r(int __errnum, MemorySegment __buf, long __buflen) {
        MethodHandle mh$ = strerror_r.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strerror_r", __errnum, __buf, __buflen);
            }
            return mh$.invokeExact(__errnum, __buf, __buflen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strerror_l$descriptor() {
        return strerror_l.DESC;
    }

    public static MethodHandle strerror_l$handle() {
        return strerror_l.HANDLE;
    }

    public static MemorySegment strerror_l$address() {
        return strerror_l.ADDR;
    }

    public static MemorySegment strerror_l(int __errnum, MemorySegment __l) {
        MethodHandle mh$ = strerror_l.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strerror_l", __errnum, __l);
            }
            return mh$.invokeExact(__errnum, __l);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bcmp$descriptor() {
        return bcmp.DESC;
    }

    public static MethodHandle bcmp$handle() {
        return bcmp.HANDLE;
    }

    public static MemorySegment bcmp$address() {
        return bcmp.ADDR;
    }

    public static int bcmp(MemorySegment __s1, MemorySegment __s2, long __n) {
        MethodHandle mh$ = bcmp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bcmp", __s1, __s2, __n);
            }
            return mh$.invokeExact(__s1, __s2, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bcopy$descriptor() {
        return bcopy.DESC;
    }

    public static MethodHandle bcopy$handle() {
        return bcopy.HANDLE;
    }

    public static MemorySegment bcopy$address() {
        return bcopy.ADDR;
    }

    public static void bcopy(MemorySegment __src, MemorySegment __dest, long __n) {
        MethodHandle mh$ = bcopy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bcopy", __src, __dest, __n);
            }
            mh$.invokeExact(__src, __dest, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bzero$descriptor() {
        return bzero.DESC;
    }

    public static MethodHandle bzero$handle() {
        return bzero.HANDLE;
    }

    public static MemorySegment bzero$address() {
        return bzero.ADDR;
    }

    public static void bzero(MemorySegment __s, long __n) {
        MethodHandle mh$ = bzero.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bzero", __s, __n);
            }
            mh$.invokeExact(__s, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor index$descriptor() {
        return index.DESC;
    }

    public static MethodHandle index$handle() {
        return index.HANDLE;
    }

    public static MemorySegment index$address() {
        return index.ADDR;
    }

    public static MemorySegment index(MemorySegment __s, int __c) {
        MethodHandle mh$ = index.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("index", __s, __c);
            }
            return mh$.invokeExact(__s, __c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor rindex$descriptor() {
        return rindex.DESC;
    }

    public static MethodHandle rindex$handle() {
        return rindex.HANDLE;
    }

    public static MemorySegment rindex$address() {
        return rindex.ADDR;
    }

    public static MemorySegment rindex(MemorySegment __s, int __c) {
        MethodHandle mh$ = rindex.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("rindex", __s, __c);
            }
            return mh$.invokeExact(__s, __c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ffs$descriptor() {
        return ffs.DESC;
    }

    public static MethodHandle ffs$handle() {
        return ffs.HANDLE;
    }

    public static MemorySegment ffs$address() {
        return ffs.ADDR;
    }

    public static int ffs(int __i) {
        MethodHandle mh$ = ffs.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ffs", __i);
            }
            return mh$.invokeExact(__i);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ffsl$descriptor() {
        return ffsl.DESC;
    }

    public static MethodHandle ffsl$handle() {
        return ffsl.HANDLE;
    }

    public static MemorySegment ffsl$address() {
        return ffsl.ADDR;
    }

    public static int ffsl(long __l) {
        MethodHandle mh$ = ffsl.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ffsl", __l);
            }
            return mh$.invokeExact(__l);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ffsll$descriptor() {
        return ffsll.DESC;
    }

    public static MethodHandle ffsll$handle() {
        return ffsll.HANDLE;
    }

    public static MemorySegment ffsll$address() {
        return ffsll.ADDR;
    }

    public static int ffsll(long __ll) {
        MethodHandle mh$ = ffsll.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ffsll", __ll);
            }
            return mh$.invokeExact(__ll);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcasecmp$descriptor() {
        return strcasecmp.DESC;
    }

    public static MethodHandle strcasecmp$handle() {
        return strcasecmp.HANDLE;
    }

    public static MemorySegment strcasecmp$address() {
        return strcasecmp.ADDR;
    }

    public static int strcasecmp(MemorySegment __s1, MemorySegment __s2) {
        MethodHandle mh$ = strcasecmp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcasecmp", __s1, __s2);
            }
            return mh$.invokeExact(__s1, __s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strncasecmp$descriptor() {
        return strncasecmp.DESC;
    }

    public static MethodHandle strncasecmp$handle() {
        return strncasecmp.HANDLE;
    }

    public static MemorySegment strncasecmp$address() {
        return strncasecmp.ADDR;
    }

    public static int strncasecmp(MemorySegment __s1, MemorySegment __s2, long __n) {
        MethodHandle mh$ = strncasecmp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strncasecmp", __s1, __s2, __n);
            }
            return mh$.invokeExact(__s1, __s2, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strcasecmp_l$descriptor() {
        return strcasecmp_l.DESC;
    }

    public static MethodHandle strcasecmp_l$handle() {
        return strcasecmp_l.HANDLE;
    }

    public static MemorySegment strcasecmp_l$address() {
        return strcasecmp_l.ADDR;
    }

    public static int strcasecmp_l(MemorySegment __s1, MemorySegment __s2, MemorySegment __loc) {
        MethodHandle mh$ = strcasecmp_l.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strcasecmp_l", __s1, __s2, __loc);
            }
            return mh$.invokeExact(__s1, __s2, __loc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strncasecmp_l$descriptor() {
        return strncasecmp_l.DESC;
    }

    public static MethodHandle strncasecmp_l$handle() {
        return strncasecmp_l.HANDLE;
    }

    public static MemorySegment strncasecmp_l$address() {
        return strncasecmp_l.ADDR;
    }

    public static int strncasecmp_l(MemorySegment __s1, MemorySegment __s2, long __n, MemorySegment __loc) {
        MethodHandle mh$ = strncasecmp_l.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strncasecmp_l", __s1, __s2, __n, __loc);
            }
            return mh$.invokeExact(__s1, __s2, __n, __loc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor explicit_bzero$descriptor() {
        return explicit_bzero.DESC;
    }

    public static MethodHandle explicit_bzero$handle() {
        return explicit_bzero.HANDLE;
    }

    public static MemorySegment explicit_bzero$address() {
        return explicit_bzero.ADDR;
    }

    public static void explicit_bzero(MemorySegment __s, long __n) {
        MethodHandle mh$ = explicit_bzero.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("explicit_bzero", __s, __n);
            }
            mh$.invokeExact(__s, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strsep$descriptor() {
        return strsep.DESC;
    }

    public static MethodHandle strsep$handle() {
        return strsep.HANDLE;
    }

    public static MemorySegment strsep$address() {
        return strsep.ADDR;
    }

    public static MemorySegment strsep(MemorySegment __stringp, MemorySegment __delim) {
        MethodHandle mh$ = strsep.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strsep", __stringp, __delim);
            }
            return mh$.invokeExact(__stringp, __delim);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strsignal$descriptor() {
        return strsignal.DESC;
    }

    public static MethodHandle strsignal$handle() {
        return strsignal.HANDLE;
    }

    public static MemorySegment strsignal$address() {
        return strsignal.ADDR;
    }

    public static MemorySegment strsignal(int __sig) {
        MethodHandle mh$ = strsignal.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strsignal", __sig);
            }
            return mh$.invokeExact(__sig);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __stpcpy$descriptor() {
        return __stpcpy.DESC;
    }

    public static MethodHandle __stpcpy$handle() {
        return __stpcpy.HANDLE;
    }

    public static MemorySegment __stpcpy$address() {
        return __stpcpy.ADDR;
    }

    public static MemorySegment __stpcpy(MemorySegment __dest, MemorySegment __src) {
        MethodHandle mh$ = __stpcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__stpcpy", __dest, __src);
            }
            return mh$.invokeExact(__dest, __src);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor stpcpy$descriptor() {
        return stpcpy.DESC;
    }

    public static MethodHandle stpcpy$handle() {
        return stpcpy.HANDLE;
    }

    public static MemorySegment stpcpy$address() {
        return stpcpy.ADDR;
    }

    public static MemorySegment stpcpy(MemorySegment __dest, MemorySegment __src) {
        MethodHandle mh$ = stpcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("stpcpy", __dest, __src);
            }
            return mh$.invokeExact(__dest, __src);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __stpncpy$descriptor() {
        return __stpncpy.DESC;
    }

    public static MethodHandle __stpncpy$handle() {
        return __stpncpy.HANDLE;
    }

    public static MemorySegment __stpncpy$address() {
        return __stpncpy.ADDR;
    }

    public static MemorySegment __stpncpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = __stpncpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__stpncpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor stpncpy$descriptor() {
        return stpncpy.DESC;
    }

    public static MethodHandle stpncpy$handle() {
        return stpncpy.HANDLE;
    }

    public static MemorySegment stpncpy$address() {
        return stpncpy.ADDR;
    }

    public static MemorySegment stpncpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = stpncpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("stpncpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strlcpy$descriptor() {
        return strlcpy.DESC;
    }

    public static MethodHandle strlcpy$handle() {
        return strlcpy.HANDLE;
    }

    public static MemorySegment strlcpy$address() {
        return strlcpy.ADDR;
    }

    public static long strlcpy(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = strlcpy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strlcpy", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor strlcat$descriptor() {
        return strlcat.DESC;
    }

    public static MethodHandle strlcat$handle() {
        return strlcat.HANDLE;
    }

    public static MemorySegment strlcat$address() {
        return strlcat.ADDR;
    }

    public static long strlcat(MemorySegment __dest, MemorySegment __src, long __n) {
        MethodHandle mh$ = strlcat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("strlcat", __dest, __src, __n);
            }
            return mh$.invokeExact(__dest, __src, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int LIBBPF_STRICT_ALL() {
        return -1;
    }

    public static int LIBBPF_STRICT_NONE() {
        return 0;
    }

    public static int LIBBPF_STRICT_CLEAN_PTRS() {
        return 1;
    }

    public static int LIBBPF_STRICT_DIRECT_ERRS() {
        return 2;
    }

    public static int LIBBPF_STRICT_SEC_NAME() {
        return 4;
    }

    public static int LIBBPF_STRICT_NO_OBJECT_LIST() {
        return 8;
    }

    public static int LIBBPF_STRICT_AUTO_RLIMIT_MEMLOCK() {
        return 16;
    }

    public static int LIBBPF_STRICT_MAP_DEFINITIONS() {
        return 32;
    }

    public static int __LIBBPF_STRICT_LAST() {
        return 33;
    }

    public static FunctionDescriptor libbpf_set_strict_mode$descriptor() {
        return libbpf_set_strict_mode.DESC;
    }

    public static MethodHandle libbpf_set_strict_mode$handle() {
        return libbpf_set_strict_mode.HANDLE;
    }

    public static MemorySegment libbpf_set_strict_mode$address() {
        return libbpf_set_strict_mode.ADDR;
    }

    public static int libbpf_set_strict_mode(int mode) {
        MethodHandle mh$ = libbpf_set_strict_mode.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_set_strict_mode", mode);
            }
            return mh$.invokeExact(mode);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_get_error$descriptor() {
        return libbpf_get_error.DESC;
    }

    public static MethodHandle libbpf_get_error$handle() {
        return libbpf_get_error.HANDLE;
    }

    public static MemorySegment libbpf_get_error$address() {
        return libbpf_get_error.ADDR;
    }

    public static long libbpf_get_error(MemorySegment ptr) {
        MethodHandle mh$ = libbpf_get_error.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_get_error", ptr);
            }
            return mh$.invokeExact(ptr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_find_kernel_btf$descriptor() {
        return libbpf_find_kernel_btf.DESC;
    }

    public static MethodHandle libbpf_find_kernel_btf$handle() {
        return libbpf_find_kernel_btf.HANDLE;
    }

    public static MemorySegment libbpf_find_kernel_btf$address() {
        return libbpf_find_kernel_btf.ADDR;
    }

    public static MemorySegment libbpf_find_kernel_btf() {
        MethodHandle mh$ = libbpf_find_kernel_btf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_find_kernel_btf", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__get_type$descriptor() {
        return bpf_program__get_type.DESC;
    }

    public static MethodHandle bpf_program__get_type$handle() {
        return bpf_program__get_type.HANDLE;
    }

    public static MemorySegment bpf_program__get_type$address() {
        return bpf_program__get_type.ADDR;
    }

    public static int bpf_program__get_type(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__get_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__get_type", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__get_expected_attach_type$descriptor() {
        return bpf_program__get_expected_attach_type.DESC;
    }

    public static MethodHandle bpf_program__get_expected_attach_type$handle() {
        return bpf_program__get_expected_attach_type.HANDLE;
    }

    public static MemorySegment bpf_program__get_expected_attach_type$address() {
        return bpf_program__get_expected_attach_type.ADDR;
    }

    public static int bpf_program__get_expected_attach_type(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__get_expected_attach_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__get_expected_attach_type", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__get_pin_path$descriptor() {
        return bpf_map__get_pin_path.DESC;
    }

    public static MethodHandle bpf_map__get_pin_path$handle() {
        return bpf_map__get_pin_path.HANDLE;
    }

    public static MemorySegment bpf_map__get_pin_path$address() {
        return bpf_map__get_pin_path.ADDR;
    }

    public static MemorySegment bpf_map__get_pin_path(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__get_pin_path.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__get_pin_path", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__get_raw_data$descriptor() {
        return btf__get_raw_data.DESC;
    }

    public static MethodHandle btf__get_raw_data$handle() {
        return btf__get_raw_data.HANDLE;
    }

    public static MemorySegment btf__get_raw_data$address() {
        return btf__get_raw_data.ADDR;
    }

    public static MemorySegment btf__get_raw_data(MemorySegment btf2, MemorySegment size) {
        MethodHandle mh$ = btf__get_raw_data.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__get_raw_data", btf2, size);
            }
            return mh$.invokeExact(btf2, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_ext__get_raw_data$descriptor() {
        return btf_ext__get_raw_data.DESC;
    }

    public static MethodHandle btf_ext__get_raw_data$handle() {
        return btf_ext__get_raw_data.HANDLE;
    }

    public static MemorySegment btf_ext__get_raw_data$address() {
        return btf_ext__get_raw_data.ADDR;
    }

    public static MemorySegment btf_ext__get_raw_data(MemorySegment btf_ext, MemorySegment size) {
        MethodHandle mh$ = btf_ext__get_raw_data.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf_ext__get_raw_data", btf_ext, size);
            }
            return mh$.invokeExact(btf_ext, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_set_memlock_rlim$descriptor() {
        return libbpf_set_memlock_rlim.DESC;
    }

    public static MethodHandle libbpf_set_memlock_rlim$handle() {
        return libbpf_set_memlock_rlim.HANDLE;
    }

    public static MemorySegment libbpf_set_memlock_rlim$address() {
        return libbpf_set_memlock_rlim.ADDR;
    }

    public static int libbpf_set_memlock_rlim(long memlock_bytes) {
        MethodHandle mh$ = libbpf_set_memlock_rlim.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_set_memlock_rlim", memlock_bytes);
            }
            return mh$.invokeExact(memlock_bytes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_create$descriptor() {
        return bpf_map_create.DESC;
    }

    public static MethodHandle bpf_map_create$handle() {
        return bpf_map_create.HANDLE;
    }

    public static MemorySegment bpf_map_create$address() {
        return bpf_map_create.ADDR;
    }

    public static int bpf_map_create(int map_type2, MemorySegment map_name, int key_size, int value_size, int max_entries, MemorySegment opts) {
        MethodHandle mh$ = bpf_map_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_create", map_type2, map_name, key_size, value_size, max_entries, opts);
            }
            return mh$.invokeExact(map_type2, map_name, key_size, value_size, max_entries, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_load$descriptor() {
        return bpf_prog_load.DESC;
    }

    public static MethodHandle bpf_prog_load$handle() {
        return bpf_prog_load.HANDLE;
    }

    public static MemorySegment bpf_prog_load$address() {
        return bpf_prog_load.ADDR;
    }

    public static int bpf_prog_load(int prog_type, MemorySegment prog_name, MemorySegment license, MemorySegment insns, long insn_cnt, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_load.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_load", prog_type, prog_name, license, insns, insn_cnt, opts);
            }
            return mh$.invokeExact(prog_type, prog_name, license, insns, insn_cnt, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_btf_load$descriptor() {
        return bpf_btf_load.DESC;
    }

    public static MethodHandle bpf_btf_load$handle() {
        return bpf_btf_load.HANDLE;
    }

    public static MemorySegment bpf_btf_load$address() {
        return bpf_btf_load.ADDR;
    }

    public static int bpf_btf_load(MemorySegment btf_data, long btf_size, MemorySegment opts) {
        MethodHandle mh$ = bpf_btf_load.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_btf_load", btf_data, btf_size, opts);
            }
            return mh$.invokeExact(btf_data, btf_size, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_update_elem$descriptor() {
        return bpf_map_update_elem.DESC;
    }

    public static MethodHandle bpf_map_update_elem$handle() {
        return bpf_map_update_elem.HANDLE;
    }

    public static MemorySegment bpf_map_update_elem$address() {
        return bpf_map_update_elem.ADDR;
    }

    public static int bpf_map_update_elem(int fd2, MemorySegment key2, MemorySegment value, long flags) {
        MethodHandle mh$ = bpf_map_update_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_update_elem", fd2, key2, value, flags);
            }
            return mh$.invokeExact(fd2, key2, value, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_lookup_elem$descriptor() {
        return bpf_map_lookup_elem.DESC;
    }

    public static MethodHandle bpf_map_lookup_elem$handle() {
        return bpf_map_lookup_elem.HANDLE;
    }

    public static MemorySegment bpf_map_lookup_elem$address() {
        return bpf_map_lookup_elem.ADDR;
    }

    public static int bpf_map_lookup_elem(int fd2, MemorySegment key2, MemorySegment value) {
        MethodHandle mh$ = bpf_map_lookup_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_lookup_elem", fd2, key2, value);
            }
            return mh$.invokeExact(fd2, key2, value);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_lookup_elem_flags$descriptor() {
        return bpf_map_lookup_elem_flags.DESC;
    }

    public static MethodHandle bpf_map_lookup_elem_flags$handle() {
        return bpf_map_lookup_elem_flags.HANDLE;
    }

    public static MemorySegment bpf_map_lookup_elem_flags$address() {
        return bpf_map_lookup_elem_flags.ADDR;
    }

    public static int bpf_map_lookup_elem_flags(int fd2, MemorySegment key2, MemorySegment value, long flags) {
        MethodHandle mh$ = bpf_map_lookup_elem_flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_lookup_elem_flags", fd2, key2, value, flags);
            }
            return mh$.invokeExact(fd2, key2, value, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_lookup_and_delete_elem$descriptor() {
        return bpf_map_lookup_and_delete_elem.DESC;
    }

    public static MethodHandle bpf_map_lookup_and_delete_elem$handle() {
        return bpf_map_lookup_and_delete_elem.HANDLE;
    }

    public static MemorySegment bpf_map_lookup_and_delete_elem$address() {
        return bpf_map_lookup_and_delete_elem.ADDR;
    }

    public static int bpf_map_lookup_and_delete_elem(int fd2, MemorySegment key2, MemorySegment value) {
        MethodHandle mh$ = bpf_map_lookup_and_delete_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_lookup_and_delete_elem", fd2, key2, value);
            }
            return mh$.invokeExact(fd2, key2, value);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_lookup_and_delete_elem_flags$descriptor() {
        return bpf_map_lookup_and_delete_elem_flags.DESC;
    }

    public static MethodHandle bpf_map_lookup_and_delete_elem_flags$handle() {
        return bpf_map_lookup_and_delete_elem_flags.HANDLE;
    }

    public static MemorySegment bpf_map_lookup_and_delete_elem_flags$address() {
        return bpf_map_lookup_and_delete_elem_flags.ADDR;
    }

    public static int bpf_map_lookup_and_delete_elem_flags(int fd2, MemorySegment key2, MemorySegment value, long flags) {
        MethodHandle mh$ = bpf_map_lookup_and_delete_elem_flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_lookup_and_delete_elem_flags", fd2, key2, value, flags);
            }
            return mh$.invokeExact(fd2, key2, value, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_delete_elem$descriptor() {
        return bpf_map_delete_elem.DESC;
    }

    public static MethodHandle bpf_map_delete_elem$handle() {
        return bpf_map_delete_elem.HANDLE;
    }

    public static MemorySegment bpf_map_delete_elem$address() {
        return bpf_map_delete_elem.ADDR;
    }

    public static int bpf_map_delete_elem(int fd2, MemorySegment key2) {
        MethodHandle mh$ = bpf_map_delete_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_delete_elem", fd2, key2);
            }
            return mh$.invokeExact(fd2, key2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_delete_elem_flags$descriptor() {
        return bpf_map_delete_elem_flags.DESC;
    }

    public static MethodHandle bpf_map_delete_elem_flags$handle() {
        return bpf_map_delete_elem_flags.HANDLE;
    }

    public static MemorySegment bpf_map_delete_elem_flags$address() {
        return bpf_map_delete_elem_flags.ADDR;
    }

    public static int bpf_map_delete_elem_flags(int fd2, MemorySegment key2, long flags) {
        MethodHandle mh$ = bpf_map_delete_elem_flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_delete_elem_flags", fd2, key2, flags);
            }
            return mh$.invokeExact(fd2, key2, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_get_next_key$descriptor() {
        return bpf_map_get_next_key.DESC;
    }

    public static MethodHandle bpf_map_get_next_key$handle() {
        return bpf_map_get_next_key.HANDLE;
    }

    public static MemorySegment bpf_map_get_next_key$address() {
        return bpf_map_get_next_key.ADDR;
    }

    public static int bpf_map_get_next_key(int fd2, MemorySegment key2, MemorySegment next_key) {
        MethodHandle mh$ = bpf_map_get_next_key.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_get_next_key", fd2, key2, next_key);
            }
            return mh$.invokeExact(fd2, key2, next_key);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_freeze$descriptor() {
        return bpf_map_freeze.DESC;
    }

    public static MethodHandle bpf_map_freeze$handle() {
        return bpf_map_freeze.HANDLE;
    }

    public static MemorySegment bpf_map_freeze$address() {
        return bpf_map_freeze.ADDR;
    }

    public static int bpf_map_freeze(int fd2) {
        MethodHandle mh$ = bpf_map_freeze.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_freeze", fd2);
            }
            return mh$.invokeExact(fd2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_delete_batch$descriptor() {
        return bpf_map_delete_batch.DESC;
    }

    public static MethodHandle bpf_map_delete_batch$handle() {
        return bpf_map_delete_batch.HANDLE;
    }

    public static MemorySegment bpf_map_delete_batch$address() {
        return bpf_map_delete_batch.ADDR;
    }

    public static int bpf_map_delete_batch(int fd2, MemorySegment keys, MemorySegment count, MemorySegment opts) {
        MethodHandle mh$ = bpf_map_delete_batch.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_delete_batch", fd2, keys, count, opts);
            }
            return mh$.invokeExact(fd2, keys, count, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_lookup_batch$descriptor() {
        return bpf_map_lookup_batch.DESC;
    }

    public static MethodHandle bpf_map_lookup_batch$handle() {
        return bpf_map_lookup_batch.HANDLE;
    }

    public static MemorySegment bpf_map_lookup_batch$address() {
        return bpf_map_lookup_batch.ADDR;
    }

    public static int bpf_map_lookup_batch(int fd2, MemorySegment in_batch, MemorySegment out_batch, MemorySegment keys, MemorySegment values, MemorySegment count, MemorySegment opts) {
        MethodHandle mh$ = bpf_map_lookup_batch.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_lookup_batch", fd2, in_batch, out_batch, keys, values, count, opts);
            }
            return mh$.invokeExact(fd2, in_batch, out_batch, keys, values, count, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_lookup_and_delete_batch$descriptor() {
        return bpf_map_lookup_and_delete_batch.DESC;
    }

    public static MethodHandle bpf_map_lookup_and_delete_batch$handle() {
        return bpf_map_lookup_and_delete_batch.HANDLE;
    }

    public static MemorySegment bpf_map_lookup_and_delete_batch$address() {
        return bpf_map_lookup_and_delete_batch.ADDR;
    }

    public static int bpf_map_lookup_and_delete_batch(int fd2, MemorySegment in_batch, MemorySegment out_batch, MemorySegment keys, MemorySegment values, MemorySegment count, MemorySegment opts) {
        MethodHandle mh$ = bpf_map_lookup_and_delete_batch.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_lookup_and_delete_batch", fd2, in_batch, out_batch, keys, values, count, opts);
            }
            return mh$.invokeExact(fd2, in_batch, out_batch, keys, values, count, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_update_batch$descriptor() {
        return bpf_map_update_batch.DESC;
    }

    public static MethodHandle bpf_map_update_batch$handle() {
        return bpf_map_update_batch.HANDLE;
    }

    public static MemorySegment bpf_map_update_batch$address() {
        return bpf_map_update_batch.ADDR;
    }

    public static int bpf_map_update_batch(int fd2, MemorySegment keys, MemorySegment values, MemorySegment count, MemorySegment opts) {
        MethodHandle mh$ = bpf_map_update_batch.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_update_batch", fd2, keys, values, count, opts);
            }
            return mh$.invokeExact(fd2, keys, values, count, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_obj_pin$descriptor() {
        return bpf_obj_pin.DESC;
    }

    public static MethodHandle bpf_obj_pin$handle() {
        return bpf_obj_pin.HANDLE;
    }

    public static MemorySegment bpf_obj_pin$address() {
        return bpf_obj_pin.ADDR;
    }

    public static int bpf_obj_pin(int fd2, MemorySegment pathname) {
        MethodHandle mh$ = bpf_obj_pin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_obj_pin", fd2, pathname);
            }
            return mh$.invokeExact(fd2, pathname);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_obj_pin_opts$descriptor() {
        return bpf_obj_pin_opts.DESC;
    }

    public static MethodHandle bpf_obj_pin_opts$handle() {
        return bpf_obj_pin_opts.HANDLE;
    }

    public static MemorySegment bpf_obj_pin_opts$address() {
        return bpf_obj_pin_opts.ADDR;
    }

    public static int bpf_obj_pin_opts(int fd2, MemorySegment pathname, MemorySegment opts) {
        MethodHandle mh$ = bpf_obj_pin_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_obj_pin_opts", fd2, pathname, opts);
            }
            return mh$.invokeExact(fd2, pathname, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_obj_get$descriptor() {
        return bpf_obj_get.DESC;
    }

    public static MethodHandle bpf_obj_get$handle() {
        return bpf_obj_get.HANDLE;
    }

    public static MemorySegment bpf_obj_get$address() {
        return bpf_obj_get.ADDR;
    }

    public static int bpf_obj_get(MemorySegment pathname) {
        MethodHandle mh$ = bpf_obj_get.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_obj_get", pathname);
            }
            return mh$.invokeExact(pathname);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_obj_get_opts$descriptor() {
        return bpf_obj_get_opts.DESC;
    }

    public static MethodHandle bpf_obj_get_opts$handle() {
        return bpf_obj_get_opts.HANDLE;
    }

    public static MemorySegment bpf_obj_get_opts$address() {
        return bpf_obj_get_opts.ADDR;
    }

    public static int bpf_obj_get_opts(MemorySegment pathname, MemorySegment opts) {
        MethodHandle mh$ = bpf_obj_get_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_obj_get_opts", pathname, opts);
            }
            return mh$.invokeExact(pathname, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_attach$descriptor() {
        return bpf_prog_attach.DESC;
    }

    public static MethodHandle bpf_prog_attach$handle() {
        return bpf_prog_attach.HANDLE;
    }

    public static MemorySegment bpf_prog_attach$address() {
        return bpf_prog_attach.ADDR;
    }

    public static int bpf_prog_attach(int prog_fd, int attachable_fd, int type2, int flags) {
        MethodHandle mh$ = bpf_prog_attach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_attach", prog_fd, attachable_fd, type2, flags);
            }
            return mh$.invokeExact(prog_fd, attachable_fd, type2, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_detach$descriptor() {
        return bpf_prog_detach.DESC;
    }

    public static MethodHandle bpf_prog_detach$handle() {
        return bpf_prog_detach.HANDLE;
    }

    public static MemorySegment bpf_prog_detach$address() {
        return bpf_prog_detach.ADDR;
    }

    public static int bpf_prog_detach(int attachable_fd, int type2) {
        MethodHandle mh$ = bpf_prog_detach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_detach", attachable_fd, type2);
            }
            return mh$.invokeExact(attachable_fd, type2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_detach2$descriptor() {
        return bpf_prog_detach2.DESC;
    }

    public static MethodHandle bpf_prog_detach2$handle() {
        return bpf_prog_detach2.HANDLE;
    }

    public static MemorySegment bpf_prog_detach2$address() {
        return bpf_prog_detach2.ADDR;
    }

    public static int bpf_prog_detach2(int prog_fd, int attachable_fd, int type2) {
        MethodHandle mh$ = bpf_prog_detach2.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_detach2", prog_fd, attachable_fd, type2);
            }
            return mh$.invokeExact(prog_fd, attachable_fd, type2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_attach_opts$descriptor() {
        return bpf_prog_attach_opts.DESC;
    }

    public static MethodHandle bpf_prog_attach_opts$handle() {
        return bpf_prog_attach_opts.HANDLE;
    }

    public static MemorySegment bpf_prog_attach_opts$address() {
        return bpf_prog_attach_opts.ADDR;
    }

    public static int bpf_prog_attach_opts(int prog_fd, int target, int type2, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_attach_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_attach_opts", prog_fd, target, type2, opts);
            }
            return mh$.invokeExact(prog_fd, target, type2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_detach_opts$descriptor() {
        return bpf_prog_detach_opts.DESC;
    }

    public static MethodHandle bpf_prog_detach_opts$handle() {
        return bpf_prog_detach_opts.HANDLE;
    }

    public static MemorySegment bpf_prog_detach_opts$address() {
        return bpf_prog_detach_opts.ADDR;
    }

    public static int bpf_prog_detach_opts(int prog_fd, int target, int type2, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_detach_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_detach_opts", prog_fd, target, type2, opts);
            }
            return mh$.invokeExact(prog_fd, target, type2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_create$descriptor() {
        return bpf_link_create.DESC;
    }

    public static MethodHandle bpf_link_create$handle() {
        return bpf_link_create.HANDLE;
    }

    public static MemorySegment bpf_link_create$address() {
        return bpf_link_create.ADDR;
    }

    public static int bpf_link_create(int prog_fd, int target_fd, int attach_type, MemorySegment opts) {
        MethodHandle mh$ = bpf_link_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_create", prog_fd, target_fd, attach_type, opts);
            }
            return mh$.invokeExact(prog_fd, target_fd, attach_type, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_detach$descriptor() {
        return bpf_link_detach.DESC;
    }

    public static MethodHandle bpf_link_detach$handle() {
        return bpf_link_detach.HANDLE;
    }

    public static MemorySegment bpf_link_detach$address() {
        return bpf_link_detach.ADDR;
    }

    public static int bpf_link_detach(int link_fd) {
        MethodHandle mh$ = bpf_link_detach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_detach", link_fd);
            }
            return mh$.invokeExact(link_fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_update$descriptor() {
        return bpf_link_update.DESC;
    }

    public static MethodHandle bpf_link_update$handle() {
        return bpf_link_update.HANDLE;
    }

    public static MemorySegment bpf_link_update$address() {
        return bpf_link_update.ADDR;
    }

    public static int bpf_link_update(int link_fd, int new_prog_fd, MemorySegment opts) {
        MethodHandle mh$ = bpf_link_update.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_update", link_fd, new_prog_fd, opts);
            }
            return mh$.invokeExact(link_fd, new_prog_fd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_iter_create$descriptor() {
        return bpf_iter_create.DESC;
    }

    public static MethodHandle bpf_iter_create$handle() {
        return bpf_iter_create.HANDLE;
    }

    public static MemorySegment bpf_iter_create$address() {
        return bpf_iter_create.ADDR;
    }

    public static int bpf_iter_create(int link_fd) {
        MethodHandle mh$ = bpf_iter_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_iter_create", link_fd);
            }
            return mh$.invokeExact(link_fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_get_next_id$descriptor() {
        return bpf_prog_get_next_id.DESC;
    }

    public static MethodHandle bpf_prog_get_next_id$handle() {
        return bpf_prog_get_next_id.HANDLE;
    }

    public static MemorySegment bpf_prog_get_next_id$address() {
        return bpf_prog_get_next_id.ADDR;
    }

    public static int bpf_prog_get_next_id(int start_id, MemorySegment next_id) {
        MethodHandle mh$ = bpf_prog_get_next_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_get_next_id", start_id, next_id);
            }
            return mh$.invokeExact(start_id, next_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_get_next_id$descriptor() {
        return bpf_map_get_next_id.DESC;
    }

    public static MethodHandle bpf_map_get_next_id$handle() {
        return bpf_map_get_next_id.HANDLE;
    }

    public static MemorySegment bpf_map_get_next_id$address() {
        return bpf_map_get_next_id.ADDR;
    }

    public static int bpf_map_get_next_id(int start_id, MemorySegment next_id) {
        MethodHandle mh$ = bpf_map_get_next_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_get_next_id", start_id, next_id);
            }
            return mh$.invokeExact(start_id, next_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_btf_get_next_id$descriptor() {
        return bpf_btf_get_next_id.DESC;
    }

    public static MethodHandle bpf_btf_get_next_id$handle() {
        return bpf_btf_get_next_id.HANDLE;
    }

    public static MemorySegment bpf_btf_get_next_id$address() {
        return bpf_btf_get_next_id.ADDR;
    }

    public static int bpf_btf_get_next_id(int start_id, MemorySegment next_id) {
        MethodHandle mh$ = bpf_btf_get_next_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_btf_get_next_id", start_id, next_id);
            }
            return mh$.invokeExact(start_id, next_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_get_next_id$descriptor() {
        return bpf_link_get_next_id.DESC;
    }

    public static MethodHandle bpf_link_get_next_id$handle() {
        return bpf_link_get_next_id.HANDLE;
    }

    public static MemorySegment bpf_link_get_next_id$address() {
        return bpf_link_get_next_id.ADDR;
    }

    public static int bpf_link_get_next_id(int start_id, MemorySegment next_id) {
        MethodHandle mh$ = bpf_link_get_next_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_get_next_id", start_id, next_id);
            }
            return mh$.invokeExact(start_id, next_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_get_fd_by_id$descriptor() {
        return bpf_prog_get_fd_by_id.DESC;
    }

    public static MethodHandle bpf_prog_get_fd_by_id$handle() {
        return bpf_prog_get_fd_by_id.HANDLE;
    }

    public static MemorySegment bpf_prog_get_fd_by_id$address() {
        return bpf_prog_get_fd_by_id.ADDR;
    }

    public static int bpf_prog_get_fd_by_id(int id) {
        MethodHandle mh$ = bpf_prog_get_fd_by_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_get_fd_by_id", id);
            }
            return mh$.invokeExact(id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_get_fd_by_id_opts$descriptor() {
        return bpf_prog_get_fd_by_id_opts.DESC;
    }

    public static MethodHandle bpf_prog_get_fd_by_id_opts$handle() {
        return bpf_prog_get_fd_by_id_opts.HANDLE;
    }

    public static MemorySegment bpf_prog_get_fd_by_id_opts$address() {
        return bpf_prog_get_fd_by_id_opts.ADDR;
    }

    public static int bpf_prog_get_fd_by_id_opts(int id, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_get_fd_by_id_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_get_fd_by_id_opts", id, opts);
            }
            return mh$.invokeExact(id, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_get_fd_by_id$descriptor() {
        return bpf_map_get_fd_by_id.DESC;
    }

    public static MethodHandle bpf_map_get_fd_by_id$handle() {
        return bpf_map_get_fd_by_id.HANDLE;
    }

    public static MemorySegment bpf_map_get_fd_by_id$address() {
        return bpf_map_get_fd_by_id.ADDR;
    }

    public static int bpf_map_get_fd_by_id(int id) {
        MethodHandle mh$ = bpf_map_get_fd_by_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_get_fd_by_id", id);
            }
            return mh$.invokeExact(id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_get_fd_by_id_opts$descriptor() {
        return bpf_map_get_fd_by_id_opts.DESC;
    }

    public static MethodHandle bpf_map_get_fd_by_id_opts$handle() {
        return bpf_map_get_fd_by_id_opts.HANDLE;
    }

    public static MemorySegment bpf_map_get_fd_by_id_opts$address() {
        return bpf_map_get_fd_by_id_opts.ADDR;
    }

    public static int bpf_map_get_fd_by_id_opts(int id, MemorySegment opts) {
        MethodHandle mh$ = bpf_map_get_fd_by_id_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_get_fd_by_id_opts", id, opts);
            }
            return mh$.invokeExact(id, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_btf_get_fd_by_id$descriptor() {
        return bpf_btf_get_fd_by_id.DESC;
    }

    public static MethodHandle bpf_btf_get_fd_by_id$handle() {
        return bpf_btf_get_fd_by_id.HANDLE;
    }

    public static MemorySegment bpf_btf_get_fd_by_id$address() {
        return bpf_btf_get_fd_by_id.ADDR;
    }

    public static int bpf_btf_get_fd_by_id(int id) {
        MethodHandle mh$ = bpf_btf_get_fd_by_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_btf_get_fd_by_id", id);
            }
            return mh$.invokeExact(id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_btf_get_fd_by_id_opts$descriptor() {
        return bpf_btf_get_fd_by_id_opts.DESC;
    }

    public static MethodHandle bpf_btf_get_fd_by_id_opts$handle() {
        return bpf_btf_get_fd_by_id_opts.HANDLE;
    }

    public static MemorySegment bpf_btf_get_fd_by_id_opts$address() {
        return bpf_btf_get_fd_by_id_opts.ADDR;
    }

    public static int bpf_btf_get_fd_by_id_opts(int id, MemorySegment opts) {
        MethodHandle mh$ = bpf_btf_get_fd_by_id_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_btf_get_fd_by_id_opts", id, opts);
            }
            return mh$.invokeExact(id, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_get_fd_by_id$descriptor() {
        return bpf_link_get_fd_by_id.DESC;
    }

    public static MethodHandle bpf_link_get_fd_by_id$handle() {
        return bpf_link_get_fd_by_id.HANDLE;
    }

    public static MemorySegment bpf_link_get_fd_by_id$address() {
        return bpf_link_get_fd_by_id.ADDR;
    }

    public static int bpf_link_get_fd_by_id(int id) {
        MethodHandle mh$ = bpf_link_get_fd_by_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_get_fd_by_id", id);
            }
            return mh$.invokeExact(id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_get_fd_by_id_opts$descriptor() {
        return bpf_link_get_fd_by_id_opts.DESC;
    }

    public static MethodHandle bpf_link_get_fd_by_id_opts$handle() {
        return bpf_link_get_fd_by_id_opts.HANDLE;
    }

    public static MemorySegment bpf_link_get_fd_by_id_opts$address() {
        return bpf_link_get_fd_by_id_opts.ADDR;
    }

    public static int bpf_link_get_fd_by_id_opts(int id, MemorySegment opts) {
        MethodHandle mh$ = bpf_link_get_fd_by_id_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_get_fd_by_id_opts", id, opts);
            }
            return mh$.invokeExact(id, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_obj_get_info_by_fd$descriptor() {
        return bpf_obj_get_info_by_fd.DESC;
    }

    public static MethodHandle bpf_obj_get_info_by_fd$handle() {
        return bpf_obj_get_info_by_fd.HANDLE;
    }

    public static MemorySegment bpf_obj_get_info_by_fd$address() {
        return bpf_obj_get_info_by_fd.ADDR;
    }

    public static int bpf_obj_get_info_by_fd(int bpf_fd, MemorySegment info2, MemorySegment info_len) {
        MethodHandle mh$ = bpf_obj_get_info_by_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_obj_get_info_by_fd", bpf_fd, info2, info_len);
            }
            return mh$.invokeExact(bpf_fd, info2, info_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_get_info_by_fd$descriptor() {
        return bpf_prog_get_info_by_fd.DESC;
    }

    public static MethodHandle bpf_prog_get_info_by_fd$handle() {
        return bpf_prog_get_info_by_fd.HANDLE;
    }

    public static MemorySegment bpf_prog_get_info_by_fd$address() {
        return bpf_prog_get_info_by_fd.ADDR;
    }

    public static int bpf_prog_get_info_by_fd(int prog_fd, MemorySegment info2, MemorySegment info_len) {
        MethodHandle mh$ = bpf_prog_get_info_by_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_get_info_by_fd", prog_fd, info2, info_len);
            }
            return mh$.invokeExact(prog_fd, info2, info_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map_get_info_by_fd$descriptor() {
        return bpf_map_get_info_by_fd.DESC;
    }

    public static MethodHandle bpf_map_get_info_by_fd$handle() {
        return bpf_map_get_info_by_fd.HANDLE;
    }

    public static MemorySegment bpf_map_get_info_by_fd$address() {
        return bpf_map_get_info_by_fd.ADDR;
    }

    public static int bpf_map_get_info_by_fd(int map_fd, MemorySegment info2, MemorySegment info_len) {
        MethodHandle mh$ = bpf_map_get_info_by_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map_get_info_by_fd", map_fd, info2, info_len);
            }
            return mh$.invokeExact(map_fd, info2, info_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_btf_get_info_by_fd$descriptor() {
        return bpf_btf_get_info_by_fd.DESC;
    }

    public static MethodHandle bpf_btf_get_info_by_fd$handle() {
        return bpf_btf_get_info_by_fd.HANDLE;
    }

    public static MemorySegment bpf_btf_get_info_by_fd$address() {
        return bpf_btf_get_info_by_fd.ADDR;
    }

    public static int bpf_btf_get_info_by_fd(int btf_fd, MemorySegment info2, MemorySegment info_len) {
        MethodHandle mh$ = bpf_btf_get_info_by_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_btf_get_info_by_fd", btf_fd, info2, info_len);
            }
            return mh$.invokeExact(btf_fd, info2, info_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link_get_info_by_fd$descriptor() {
        return bpf_link_get_info_by_fd.DESC;
    }

    public static MethodHandle bpf_link_get_info_by_fd$handle() {
        return bpf_link_get_info_by_fd.HANDLE;
    }

    public static MemorySegment bpf_link_get_info_by_fd$address() {
        return bpf_link_get_info_by_fd.ADDR;
    }

    public static int bpf_link_get_info_by_fd(int link_fd, MemorySegment info2, MemorySegment info_len) {
        MethodHandle mh$ = bpf_link_get_info_by_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link_get_info_by_fd", link_fd, info2, info_len);
            }
            return mh$.invokeExact(link_fd, info2, info_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_query_opts$descriptor() {
        return bpf_prog_query_opts.DESC;
    }

    public static MethodHandle bpf_prog_query_opts$handle() {
        return bpf_prog_query_opts.HANDLE;
    }

    public static MemorySegment bpf_prog_query_opts$address() {
        return bpf_prog_query_opts.ADDR;
    }

    public static int bpf_prog_query_opts(int target, int type2, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_query_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_query_opts", target, type2, opts);
            }
            return mh$.invokeExact(target, type2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_query$descriptor() {
        return bpf_prog_query.DESC;
    }

    public static MethodHandle bpf_prog_query$handle() {
        return bpf_prog_query.HANDLE;
    }

    public static MemorySegment bpf_prog_query$address() {
        return bpf_prog_query.ADDR;
    }

    public static int bpf_prog_query(int target_fd, int type2, int query_flags, MemorySegment attach_flags, MemorySegment prog_ids, MemorySegment prog_cnt) {
        MethodHandle mh$ = bpf_prog_query.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_query", target_fd, type2, query_flags, attach_flags, prog_ids, prog_cnt);
            }
            return mh$.invokeExact(target_fd, type2, query_flags, attach_flags, prog_ids, prog_cnt);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_raw_tracepoint_open_opts$descriptor() {
        return bpf_raw_tracepoint_open_opts.DESC;
    }

    public static MethodHandle bpf_raw_tracepoint_open_opts$handle() {
        return bpf_raw_tracepoint_open_opts.HANDLE;
    }

    public static MemorySegment bpf_raw_tracepoint_open_opts$address() {
        return bpf_raw_tracepoint_open_opts.ADDR;
    }

    public static int bpf_raw_tracepoint_open_opts(int prog_fd, MemorySegment opts) {
        MethodHandle mh$ = bpf_raw_tracepoint_open_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_raw_tracepoint_open_opts", prog_fd, opts);
            }
            return mh$.invokeExact(prog_fd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_raw_tracepoint_open$descriptor() {
        return bpf_raw_tracepoint_open.DESC;
    }

    public static MethodHandle bpf_raw_tracepoint_open$handle() {
        return bpf_raw_tracepoint_open.HANDLE;
    }

    public static MemorySegment bpf_raw_tracepoint_open$address() {
        return bpf_raw_tracepoint_open.ADDR;
    }

    public static int bpf_raw_tracepoint_open(MemorySegment name, int prog_fd) {
        MethodHandle mh$ = bpf_raw_tracepoint_open.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_raw_tracepoint_open", name, prog_fd);
            }
            return mh$.invokeExact(name, prog_fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_task_fd_query$descriptor() {
        return bpf_task_fd_query.DESC;
    }

    public static MethodHandle bpf_task_fd_query$handle() {
        return bpf_task_fd_query.HANDLE;
    }

    public static MemorySegment bpf_task_fd_query$address() {
        return bpf_task_fd_query.ADDR;
    }

    public static int bpf_task_fd_query(int pid2, int fd2, int flags, MemorySegment buf, MemorySegment buf_len, MemorySegment prog_id, MemorySegment fd_type, MemorySegment probe_offset, MemorySegment probe_addr) {
        MethodHandle mh$ = bpf_task_fd_query.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_task_fd_query", pid2, fd2, flags, buf, buf_len, prog_id, fd_type, probe_offset, probe_addr);
            }
            return mh$.invokeExact(pid2, fd2, flags, buf, buf_len, prog_id, fd_type, probe_offset, probe_addr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_enable_stats$descriptor() {
        return bpf_enable_stats.DESC;
    }

    public static MethodHandle bpf_enable_stats$handle() {
        return bpf_enable_stats.HANDLE;
    }

    public static MemorySegment bpf_enable_stats$address() {
        return bpf_enable_stats.ADDR;
    }

    public static int bpf_enable_stats(int type2) {
        MethodHandle mh$ = bpf_enable_stats.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_enable_stats", type2);
            }
            return mh$.invokeExact(type2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_bind_map$descriptor() {
        return bpf_prog_bind_map.DESC;
    }

    public static MethodHandle bpf_prog_bind_map$handle() {
        return bpf_prog_bind_map.HANDLE;
    }

    public static MemorySegment bpf_prog_bind_map$address() {
        return bpf_prog_bind_map.ADDR;
    }

    public static int bpf_prog_bind_map(int prog_fd, int map_fd, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_bind_map.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_bind_map", prog_fd, map_fd, opts);
            }
            return mh$.invokeExact(prog_fd, map_fd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_test_run_opts$descriptor() {
        return bpf_prog_test_run_opts.DESC;
    }

    public static MethodHandle bpf_prog_test_run_opts$handle() {
        return bpf_prog_test_run_opts.HANDLE;
    }

    public static MemorySegment bpf_prog_test_run_opts$address() {
        return bpf_prog_test_run_opts.ADDR;
    }

    public static int bpf_prog_test_run_opts(int prog_fd, MemorySegment opts) {
        MethodHandle mh$ = bpf_prog_test_run_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_test_run_opts", prog_fd, opts);
            }
            return mh$.invokeExact(prog_fd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_token_create$descriptor() {
        return bpf_token_create.DESC;
    }

    public static MethodHandle bpf_token_create$handle() {
        return bpf_token_create.HANDLE;
    }

    public static MemorySegment bpf_token_create$address() {
        return bpf_token_create.ADDR;
    }

    public static int bpf_token_create(int bpffs_fd, MemorySegment opts) {
        MethodHandle mh$ = bpf_token_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_token_create", bpffs_fd, opts);
            }
            return mh$.invokeExact(bpffs_fd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static AddressLayout stdin$layout() {
        return stdin.constants.LAYOUT;
    }

    public static MemorySegment stdin$segment() {
        return stdin.constants.SEGMENT;
    }

    public static MemorySegment stdin() {
        return stdin.constants.SEGMENT.get(stdin.constants.LAYOUT, 0L);
    }

    public static void stdin(MemorySegment varValue) {
        stdin.constants.SEGMENT.set(stdin.constants.LAYOUT, 0L, varValue);
    }

    public static AddressLayout stdout$layout() {
        return stdout.constants.LAYOUT;
    }

    public static MemorySegment stdout$segment() {
        return stdout.constants.SEGMENT;
    }

    public static MemorySegment stdout() {
        return stdout.constants.SEGMENT.get(stdout.constants.LAYOUT, 0L);
    }

    public static void stdout(MemorySegment varValue) {
        stdout.constants.SEGMENT.set(stdout.constants.LAYOUT, 0L, varValue);
    }

    public static AddressLayout stderr$layout() {
        return stderr.constants.LAYOUT;
    }

    public static MemorySegment stderr$segment() {
        return stderr.constants.SEGMENT;
    }

    public static MemorySegment stderr() {
        return stderr.constants.SEGMENT.get(stderr.constants.LAYOUT, 0L);
    }

    public static void stderr(MemorySegment varValue) {
        stderr.constants.SEGMENT.set(stderr.constants.LAYOUT, 0L, varValue);
    }

    public static FunctionDescriptor remove$descriptor() {
        return remove.DESC;
    }

    public static MethodHandle remove$handle() {
        return remove.HANDLE;
    }

    public static MemorySegment remove$address() {
        return remove.ADDR;
    }

    public static int remove(MemorySegment __filename) {
        MethodHandle mh$ = remove.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("remove", __filename);
            }
            return mh$.invokeExact(__filename);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor rename$descriptor() {
        return rename.DESC;
    }

    public static MethodHandle rename$handle() {
        return rename.HANDLE;
    }

    public static MemorySegment rename$address() {
        return rename.ADDR;
    }

    public static int rename(MemorySegment __old, MemorySegment __new) {
        MethodHandle mh$ = rename.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("rename", __old, __new);
            }
            return mh$.invokeExact(__old, __new);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor renameat$descriptor() {
        return renameat.DESC;
    }

    public static MethodHandle renameat$handle() {
        return renameat.HANDLE;
    }

    public static MemorySegment renameat$address() {
        return renameat.ADDR;
    }

    public static int renameat(int __oldfd, MemorySegment __old, int __newfd, MemorySegment __new) {
        MethodHandle mh$ = renameat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("renameat", __oldfd, __old, __newfd, __new);
            }
            return mh$.invokeExact(__oldfd, __old, __newfd, __new);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fclose$descriptor() {
        return fclose.DESC;
    }

    public static MethodHandle fclose$handle() {
        return fclose.HANDLE;
    }

    public static MemorySegment fclose$address() {
        return fclose.ADDR;
    }

    public static int fclose(MemorySegment __stream) {
        MethodHandle mh$ = fclose.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fclose", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor tmpfile$descriptor() {
        return tmpfile.DESC;
    }

    public static MethodHandle tmpfile$handle() {
        return tmpfile.HANDLE;
    }

    public static MemorySegment tmpfile$address() {
        return tmpfile.ADDR;
    }

    public static MemorySegment tmpfile() {
        MethodHandle mh$ = tmpfile.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("tmpfile", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor tmpnam$descriptor() {
        return tmpnam.DESC;
    }

    public static MethodHandle tmpnam$handle() {
        return tmpnam.HANDLE;
    }

    public static MemorySegment tmpnam$address() {
        return tmpnam.ADDR;
    }

    public static MemorySegment tmpnam(MemorySegment x0) {
        MethodHandle mh$ = tmpnam.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("tmpnam", x0);
            }
            return mh$.invokeExact(x0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor tmpnam_r$descriptor() {
        return tmpnam_r.DESC;
    }

    public static MethodHandle tmpnam_r$handle() {
        return tmpnam_r.HANDLE;
    }

    public static MemorySegment tmpnam_r$address() {
        return tmpnam_r.ADDR;
    }

    public static MemorySegment tmpnam_r(MemorySegment __s) {
        MethodHandle mh$ = tmpnam_r.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("tmpnam_r", __s);
            }
            return mh$.invokeExact(__s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor tempnam$descriptor() {
        return tempnam.DESC;
    }

    public static MethodHandle tempnam$handle() {
        return tempnam.HANDLE;
    }

    public static MemorySegment tempnam$address() {
        return tempnam.ADDR;
    }

    public static MemorySegment tempnam(MemorySegment __dir, MemorySegment __pfx) {
        MethodHandle mh$ = tempnam.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("tempnam", __dir, __pfx);
            }
            return mh$.invokeExact(__dir, __pfx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fflush$descriptor() {
        return fflush.DESC;
    }

    public static MethodHandle fflush$handle() {
        return fflush.HANDLE;
    }

    public static MemorySegment fflush$address() {
        return fflush.ADDR;
    }

    public static int fflush(MemorySegment __stream) {
        MethodHandle mh$ = fflush.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fflush", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fflush_unlocked$descriptor() {
        return fflush_unlocked.DESC;
    }

    public static MethodHandle fflush_unlocked$handle() {
        return fflush_unlocked.HANDLE;
    }

    public static MemorySegment fflush_unlocked$address() {
        return fflush_unlocked.ADDR;
    }

    public static int fflush_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = fflush_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fflush_unlocked", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fopen$descriptor() {
        return fopen.DESC;
    }

    public static MethodHandle fopen$handle() {
        return fopen.HANDLE;
    }

    public static MemorySegment fopen$address() {
        return fopen.ADDR;
    }

    public static MemorySegment fopen(MemorySegment __filename, MemorySegment __modes) {
        MethodHandle mh$ = fopen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fopen", __filename, __modes);
            }
            return mh$.invokeExact(__filename, __modes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor freopen$descriptor() {
        return freopen.DESC;
    }

    public static MethodHandle freopen$handle() {
        return freopen.HANDLE;
    }

    public static MemorySegment freopen$address() {
        return freopen.ADDR;
    }

    public static MemorySegment freopen(MemorySegment __filename, MemorySegment __modes, MemorySegment __stream) {
        MethodHandle mh$ = freopen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("freopen", __filename, __modes, __stream);
            }
            return mh$.invokeExact(__filename, __modes, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fdopen$descriptor() {
        return fdopen.DESC;
    }

    public static MethodHandle fdopen$handle() {
        return fdopen.HANDLE;
    }

    public static MemorySegment fdopen$address() {
        return fdopen.ADDR;
    }

    public static MemorySegment fdopen(int __fd, MemorySegment __modes) {
        MethodHandle mh$ = fdopen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fdopen", __fd, __modes);
            }
            return mh$.invokeExact(__fd, __modes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fopencookie$descriptor() {
        return fopencookie.DESC;
    }

    public static MethodHandle fopencookie$handle() {
        return fopencookie.HANDLE;
    }

    public static MemorySegment fopencookie$address() {
        return fopencookie.ADDR;
    }

    public static MemorySegment fopencookie(MemorySegment __magic_cookie, MemorySegment __modes, MemorySegment __io_funcs) {
        MethodHandle mh$ = fopencookie.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fopencookie", __magic_cookie, __modes, __io_funcs);
            }
            return mh$.invokeExact(__magic_cookie, __modes, __io_funcs);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fmemopen$descriptor() {
        return fmemopen.DESC;
    }

    public static MethodHandle fmemopen$handle() {
        return fmemopen.HANDLE;
    }

    public static MemorySegment fmemopen$address() {
        return fmemopen.ADDR;
    }

    public static MemorySegment fmemopen(MemorySegment __s, long __len, MemorySegment __modes) {
        MethodHandle mh$ = fmemopen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fmemopen", __s, __len, __modes);
            }
            return mh$.invokeExact(__s, __len, __modes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor open_memstream$descriptor() {
        return open_memstream.DESC;
    }

    public static MethodHandle open_memstream$handle() {
        return open_memstream.HANDLE;
    }

    public static MemorySegment open_memstream$address() {
        return open_memstream.ADDR;
    }

    public static MemorySegment open_memstream(MemorySegment __bufloc, MemorySegment __sizeloc) {
        MethodHandle mh$ = open_memstream.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("open_memstream", __bufloc, __sizeloc);
            }
            return mh$.invokeExact(__bufloc, __sizeloc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setbuf$descriptor() {
        return setbuf.DESC;
    }

    public static MethodHandle setbuf$handle() {
        return setbuf.HANDLE;
    }

    public static MemorySegment setbuf$address() {
        return setbuf.ADDR;
    }

    public static void setbuf(MemorySegment __stream, MemorySegment __buf) {
        MethodHandle mh$ = setbuf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("setbuf", __stream, __buf);
            }
            mh$.invokeExact(__stream, __buf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setvbuf$descriptor() {
        return setvbuf.DESC;
    }

    public static MethodHandle setvbuf$handle() {
        return setvbuf.HANDLE;
    }

    public static MemorySegment setvbuf$address() {
        return setvbuf.ADDR;
    }

    public static int setvbuf(MemorySegment __stream, MemorySegment __buf, int __modes, long __n) {
        MethodHandle mh$ = setvbuf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("setvbuf", __stream, __buf, __modes, __n);
            }
            return mh$.invokeExact(__stream, __buf, __modes, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setbuffer$descriptor() {
        return setbuffer.DESC;
    }

    public static MethodHandle setbuffer$handle() {
        return setbuffer.HANDLE;
    }

    public static MemorySegment setbuffer$address() {
        return setbuffer.ADDR;
    }

    public static void setbuffer(MemorySegment __stream, MemorySegment __buf, long __size) {
        MethodHandle mh$ = setbuffer.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("setbuffer", __stream, __buf, __size);
            }
            mh$.invokeExact(__stream, __buf, __size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setlinebuf$descriptor() {
        return setlinebuf.DESC;
    }

    public static MethodHandle setlinebuf$handle() {
        return setlinebuf.HANDLE;
    }

    public static MemorySegment setlinebuf$address() {
        return setlinebuf.ADDR;
    }

    public static void setlinebuf(MemorySegment __stream) {
        MethodHandle mh$ = setlinebuf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("setlinebuf", __stream);
            }
            mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vfprintf$descriptor() {
        return vfprintf.DESC;
    }

    public static MethodHandle vfprintf$handle() {
        return vfprintf.HANDLE;
    }

    public static MemorySegment vfprintf$address() {
        return vfprintf.ADDR;
    }

    public static int vfprintf(MemorySegment __s, MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vfprintf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vfprintf", __s, __format, __arg);
            }
            return mh$.invokeExact(__s, __format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vprintf$descriptor() {
        return vprintf.DESC;
    }

    public static MethodHandle vprintf$handle() {
        return vprintf.HANDLE;
    }

    public static MemorySegment vprintf$address() {
        return vprintf.ADDR;
    }

    public static int vprintf(MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vprintf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vprintf", __format, __arg);
            }
            return mh$.invokeExact(__format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vsprintf$descriptor() {
        return vsprintf.DESC;
    }

    public static MethodHandle vsprintf$handle() {
        return vsprintf.HANDLE;
    }

    public static MemorySegment vsprintf$address() {
        return vsprintf.ADDR;
    }

    public static int vsprintf(MemorySegment __s, MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vsprintf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vsprintf", __s, __format, __arg);
            }
            return mh$.invokeExact(__s, __format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vsnprintf$descriptor() {
        return vsnprintf.DESC;
    }

    public static MethodHandle vsnprintf$handle() {
        return vsnprintf.HANDLE;
    }

    public static MemorySegment vsnprintf$address() {
        return vsnprintf.ADDR;
    }

    public static int vsnprintf(MemorySegment __s, long __maxlen, MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vsnprintf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vsnprintf", __s, __maxlen, __format, __arg);
            }
            return mh$.invokeExact(__s, __maxlen, __format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vasprintf$descriptor() {
        return vasprintf.DESC;
    }

    public static MethodHandle vasprintf$handle() {
        return vasprintf.HANDLE;
    }

    public static MemorySegment vasprintf$address() {
        return vasprintf.ADDR;
    }

    public static int vasprintf(MemorySegment __ptr, MemorySegment __f, MemorySegment __arg) {
        MethodHandle mh$ = vasprintf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vasprintf", __ptr, __f, __arg);
            }
            return mh$.invokeExact(__ptr, __f, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vdprintf$descriptor() {
        return vdprintf.DESC;
    }

    public static MethodHandle vdprintf$handle() {
        return vdprintf.HANDLE;
    }

    public static MemorySegment vdprintf$address() {
        return vdprintf.ADDR;
    }

    public static int vdprintf(int __fd, MemorySegment __fmt, MemorySegment __arg) {
        MethodHandle mh$ = vdprintf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vdprintf", __fd, __fmt, __arg);
            }
            return mh$.invokeExact(__fd, __fmt, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vfscanf$descriptor() {
        return vfscanf.DESC;
    }

    public static MethodHandle vfscanf$handle() {
        return vfscanf.HANDLE;
    }

    public static MemorySegment vfscanf$address() {
        return vfscanf.ADDR;
    }

    public static int vfscanf(MemorySegment __s, MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vfscanf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vfscanf", __s, __format, __arg);
            }
            return mh$.invokeExact(__s, __format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vscanf$descriptor() {
        return vscanf.DESC;
    }

    public static MethodHandle vscanf$handle() {
        return vscanf.HANDLE;
    }

    public static MemorySegment vscanf$address() {
        return vscanf.ADDR;
    }

    public static int vscanf(MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vscanf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vscanf", __format, __arg);
            }
            return mh$.invokeExact(__format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vsscanf$descriptor() {
        return vsscanf.DESC;
    }

    public static MethodHandle vsscanf$handle() {
        return vsscanf.HANDLE;
    }

    public static MemorySegment vsscanf$address() {
        return vsscanf.ADDR;
    }

    public static int vsscanf(MemorySegment __s, MemorySegment __format, MemorySegment __arg) {
        MethodHandle mh$ = vsscanf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("vsscanf", __s, __format, __arg);
            }
            return mh$.invokeExact(__s, __format, __arg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fgetc$descriptor() {
        return fgetc.DESC;
    }

    public static MethodHandle fgetc$handle() {
        return fgetc.HANDLE;
    }

    public static MemorySegment fgetc$address() {
        return fgetc.ADDR;
    }

    public static int fgetc(MemorySegment __stream) {
        MethodHandle mh$ = fgetc.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fgetc", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getc$descriptor() {
        return getc.DESC;
    }

    public static MethodHandle getc$handle() {
        return getc.HANDLE;
    }

    public static MemorySegment getc$address() {
        return getc.ADDR;
    }

    public static int getc(MemorySegment __stream) {
        MethodHandle mh$ = getc.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getc", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getchar$descriptor() {
        return getchar.DESC;
    }

    public static MethodHandle getchar$handle() {
        return getchar.HANDLE;
    }

    public static MemorySegment getchar$address() {
        return getchar.ADDR;
    }

    public static int getchar() {
        MethodHandle mh$ = getchar.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getchar", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getc_unlocked$descriptor() {
        return getc_unlocked.DESC;
    }

    public static MethodHandle getc_unlocked$handle() {
        return getc_unlocked.HANDLE;
    }

    public static MemorySegment getc_unlocked$address() {
        return getc_unlocked.ADDR;
    }

    public static int getc_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = getc_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getc_unlocked", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getchar_unlocked$descriptor() {
        return getchar_unlocked.DESC;
    }

    public static MethodHandle getchar_unlocked$handle() {
        return getchar_unlocked.HANDLE;
    }

    public static MemorySegment getchar_unlocked$address() {
        return getchar_unlocked.ADDR;
    }

    public static int getchar_unlocked() {
        MethodHandle mh$ = getchar_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getchar_unlocked", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fgetc_unlocked$descriptor() {
        return fgetc_unlocked.DESC;
    }

    public static MethodHandle fgetc_unlocked$handle() {
        return fgetc_unlocked.HANDLE;
    }

    public static MemorySegment fgetc_unlocked$address() {
        return fgetc_unlocked.ADDR;
    }

    public static int fgetc_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = fgetc_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fgetc_unlocked", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fputc$descriptor() {
        return fputc.DESC;
    }

    public static MethodHandle fputc$handle() {
        return fputc.HANDLE;
    }

    public static MemorySegment fputc$address() {
        return fputc.ADDR;
    }

    public static int fputc(int __c, MemorySegment __stream) {
        MethodHandle mh$ = fputc.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fputc", __c, __stream);
            }
            return mh$.invokeExact(__c, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor putc$descriptor() {
        return putc.DESC;
    }

    public static MethodHandle putc$handle() {
        return putc.HANDLE;
    }

    public static MemorySegment putc$address() {
        return putc.ADDR;
    }

    public static int putc(int __c, MemorySegment __stream) {
        MethodHandle mh$ = putc.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("putc", __c, __stream);
            }
            return mh$.invokeExact(__c, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor putchar$descriptor() {
        return putchar.DESC;
    }

    public static MethodHandle putchar$handle() {
        return putchar.HANDLE;
    }

    public static MemorySegment putchar$address() {
        return putchar.ADDR;
    }

    public static int putchar(int __c) {
        MethodHandle mh$ = putchar.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("putchar", __c);
            }
            return mh$.invokeExact(__c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fputc_unlocked$descriptor() {
        return fputc_unlocked.DESC;
    }

    public static MethodHandle fputc_unlocked$handle() {
        return fputc_unlocked.HANDLE;
    }

    public static MemorySegment fputc_unlocked$address() {
        return fputc_unlocked.ADDR;
    }

    public static int fputc_unlocked(int __c, MemorySegment __stream) {
        MethodHandle mh$ = fputc_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fputc_unlocked", __c, __stream);
            }
            return mh$.invokeExact(__c, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor putc_unlocked$descriptor() {
        return putc_unlocked.DESC;
    }

    public static MethodHandle putc_unlocked$handle() {
        return putc_unlocked.HANDLE;
    }

    public static MemorySegment putc_unlocked$address() {
        return putc_unlocked.ADDR;
    }

    public static int putc_unlocked(int __c, MemorySegment __stream) {
        MethodHandle mh$ = putc_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("putc_unlocked", __c, __stream);
            }
            return mh$.invokeExact(__c, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor putchar_unlocked$descriptor() {
        return putchar_unlocked.DESC;
    }

    public static MethodHandle putchar_unlocked$handle() {
        return putchar_unlocked.HANDLE;
    }

    public static MemorySegment putchar_unlocked$address() {
        return putchar_unlocked.ADDR;
    }

    public static int putchar_unlocked(int __c) {
        MethodHandle mh$ = putchar_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("putchar_unlocked", __c);
            }
            return mh$.invokeExact(__c);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getw$descriptor() {
        return getw.DESC;
    }

    public static MethodHandle getw$handle() {
        return getw.HANDLE;
    }

    public static MemorySegment getw$address() {
        return getw.ADDR;
    }

    public static int getw(MemorySegment __stream) {
        MethodHandle mh$ = getw.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getw", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor putw$descriptor() {
        return putw.DESC;
    }

    public static MethodHandle putw$handle() {
        return putw.HANDLE;
    }

    public static MemorySegment putw$address() {
        return putw.ADDR;
    }

    public static int putw(int __w, MemorySegment __stream) {
        MethodHandle mh$ = putw.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("putw", __w, __stream);
            }
            return mh$.invokeExact(__w, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fgets$descriptor() {
        return fgets.DESC;
    }

    public static MethodHandle fgets$handle() {
        return fgets.HANDLE;
    }

    public static MemorySegment fgets$address() {
        return fgets.ADDR;
    }

    public static MemorySegment fgets(MemorySegment __s, int __n, MemorySegment __stream) {
        MethodHandle mh$ = fgets.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fgets", __s, __n, __stream);
            }
            return mh$.invokeExact(__s, __n, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __getdelim$descriptor() {
        return __getdelim.DESC;
    }

    public static MethodHandle __getdelim$handle() {
        return __getdelim.HANDLE;
    }

    public static MemorySegment __getdelim$address() {
        return __getdelim.ADDR;
    }

    public static long __getdelim(MemorySegment __lineptr, MemorySegment __n, int __delimiter, MemorySegment __stream) {
        MethodHandle mh$ = __getdelim.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__getdelim", __lineptr, __n, __delimiter, __stream);
            }
            return mh$.invokeExact(__lineptr, __n, __delimiter, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getdelim$descriptor() {
        return getdelim.DESC;
    }

    public static MethodHandle getdelim$handle() {
        return getdelim.HANDLE;
    }

    public static MemorySegment getdelim$address() {
        return getdelim.ADDR;
    }

    public static long getdelim(MemorySegment __lineptr, MemorySegment __n, int __delimiter, MemorySegment __stream) {
        MethodHandle mh$ = getdelim.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getdelim", __lineptr, __n, __delimiter, __stream);
            }
            return mh$.invokeExact(__lineptr, __n, __delimiter, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getline$descriptor() {
        return getline.DESC;
    }

    public static MethodHandle getline$handle() {
        return getline.HANDLE;
    }

    public static MemorySegment getline$address() {
        return getline.ADDR;
    }

    public static long getline(MemorySegment __lineptr, MemorySegment __n, MemorySegment __stream) {
        MethodHandle mh$ = getline.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("getline", __lineptr, __n, __stream);
            }
            return mh$.invokeExact(__lineptr, __n, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fputs$descriptor() {
        return fputs.DESC;
    }

    public static MethodHandle fputs$handle() {
        return fputs.HANDLE;
    }

    public static MemorySegment fputs$address() {
        return fputs.ADDR;
    }

    public static int fputs(MemorySegment __s, MemorySegment __stream) {
        MethodHandle mh$ = fputs.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fputs", __s, __stream);
            }
            return mh$.invokeExact(__s, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor puts$descriptor() {
        return puts.DESC;
    }

    public static MethodHandle puts$handle() {
        return puts.HANDLE;
    }

    public static MemorySegment puts$address() {
        return puts.ADDR;
    }

    public static int puts(MemorySegment __s) {
        MethodHandle mh$ = puts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("puts", __s);
            }
            return mh$.invokeExact(__s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ungetc$descriptor() {
        return ungetc.DESC;
    }

    public static MethodHandle ungetc$handle() {
        return ungetc.HANDLE;
    }

    public static MemorySegment ungetc$address() {
        return ungetc.ADDR;
    }

    public static int ungetc(int __c, MemorySegment __stream) {
        MethodHandle mh$ = ungetc.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ungetc", __c, __stream);
            }
            return mh$.invokeExact(__c, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fread$descriptor() {
        return fread.DESC;
    }

    public static MethodHandle fread$handle() {
        return fread.HANDLE;
    }

    public static MemorySegment fread$address() {
        return fread.ADDR;
    }

    public static long fread(MemorySegment __ptr, long __size, long __n, MemorySegment __stream) {
        MethodHandle mh$ = fread.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fread", __ptr, __size, __n, __stream);
            }
            return mh$.invokeExact(__ptr, __size, __n, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fwrite$descriptor() {
        return fwrite.DESC;
    }

    public static MethodHandle fwrite$handle() {
        return fwrite.HANDLE;
    }

    public static MemorySegment fwrite$address() {
        return fwrite.ADDR;
    }

    public static long fwrite(MemorySegment __ptr, long __size, long __n, MemorySegment __s) {
        MethodHandle mh$ = fwrite.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fwrite", __ptr, __size, __n, __s);
            }
            return mh$.invokeExact(__ptr, __size, __n, __s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fread_unlocked$descriptor() {
        return fread_unlocked.DESC;
    }

    public static MethodHandle fread_unlocked$handle() {
        return fread_unlocked.HANDLE;
    }

    public static MemorySegment fread_unlocked$address() {
        return fread_unlocked.ADDR;
    }

    public static long fread_unlocked(MemorySegment __ptr, long __size, long __n, MemorySegment __stream) {
        MethodHandle mh$ = fread_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fread_unlocked", __ptr, __size, __n, __stream);
            }
            return mh$.invokeExact(__ptr, __size, __n, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fwrite_unlocked$descriptor() {
        return fwrite_unlocked.DESC;
    }

    public static MethodHandle fwrite_unlocked$handle() {
        return fwrite_unlocked.HANDLE;
    }

    public static MemorySegment fwrite_unlocked$address() {
        return fwrite_unlocked.ADDR;
    }

    public static long fwrite_unlocked(MemorySegment __ptr, long __size, long __n, MemorySegment __stream) {
        MethodHandle mh$ = fwrite_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fwrite_unlocked", __ptr, __size, __n, __stream);
            }
            return mh$.invokeExact(__ptr, __size, __n, __stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fseek$descriptor() {
        return fseek.DESC;
    }

    public static MethodHandle fseek$handle() {
        return fseek.HANDLE;
    }

    public static MemorySegment fseek$address() {
        return fseek.ADDR;
    }

    public static int fseek(MemorySegment __stream, long __off, int __whence) {
        MethodHandle mh$ = fseek.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fseek", __stream, __off, __whence);
            }
            return mh$.invokeExact(__stream, __off, __whence);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ftell$descriptor() {
        return ftell.DESC;
    }

    public static MethodHandle ftell$handle() {
        return ftell.HANDLE;
    }

    public static MemorySegment ftell$address() {
        return ftell.ADDR;
    }

    public static long ftell(MemorySegment __stream) {
        MethodHandle mh$ = ftell.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ftell", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor rewind$descriptor() {
        return rewind.DESC;
    }

    public static MethodHandle rewind$handle() {
        return rewind.HANDLE;
    }

    public static MemorySegment rewind$address() {
        return rewind.ADDR;
    }

    public static void rewind(MemorySegment __stream) {
        MethodHandle mh$ = rewind.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("rewind", __stream);
            }
            mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fseeko$descriptor() {
        return fseeko.DESC;
    }

    public static MethodHandle fseeko$handle() {
        return fseeko.HANDLE;
    }

    public static MemorySegment fseeko$address() {
        return fseeko.ADDR;
    }

    public static int fseeko(MemorySegment __stream, long __off, int __whence) {
        MethodHandle mh$ = fseeko.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fseeko", __stream, __off, __whence);
            }
            return mh$.invokeExact(__stream, __off, __whence);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ftello$descriptor() {
        return ftello.DESC;
    }

    public static MethodHandle ftello$handle() {
        return ftello.HANDLE;
    }

    public static MemorySegment ftello$address() {
        return ftello.ADDR;
    }

    public static long ftello(MemorySegment __stream) {
        MethodHandle mh$ = ftello.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ftello", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fgetpos$descriptor() {
        return fgetpos.DESC;
    }

    public static MethodHandle fgetpos$handle() {
        return fgetpos.HANDLE;
    }

    public static MemorySegment fgetpos$address() {
        return fgetpos.ADDR;
    }

    public static int fgetpos(MemorySegment __stream, MemorySegment __pos) {
        MethodHandle mh$ = fgetpos.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fgetpos", __stream, __pos);
            }
            return mh$.invokeExact(__stream, __pos);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fsetpos$descriptor() {
        return fsetpos.DESC;
    }

    public static MethodHandle fsetpos$handle() {
        return fsetpos.HANDLE;
    }

    public static MemorySegment fsetpos$address() {
        return fsetpos.ADDR;
    }

    public static int fsetpos(MemorySegment __stream, MemorySegment __pos) {
        MethodHandle mh$ = fsetpos.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fsetpos", __stream, __pos);
            }
            return mh$.invokeExact(__stream, __pos);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor clearerr$descriptor() {
        return clearerr.DESC;
    }

    public static MethodHandle clearerr$handle() {
        return clearerr.HANDLE;
    }

    public static MemorySegment clearerr$address() {
        return clearerr.ADDR;
    }

    public static void clearerr(MemorySegment __stream) {
        MethodHandle mh$ = clearerr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("clearerr", __stream);
            }
            mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor feof$descriptor() {
        return feof.DESC;
    }

    public static MethodHandle feof$handle() {
        return feof.HANDLE;
    }

    public static MemorySegment feof$address() {
        return feof.ADDR;
    }

    public static int feof(MemorySegment __stream) {
        MethodHandle mh$ = feof.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("feof", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ferror$descriptor() {
        return ferror.DESC;
    }

    public static MethodHandle ferror$handle() {
        return ferror.HANDLE;
    }

    public static MemorySegment ferror$address() {
        return ferror.ADDR;
    }

    public static int ferror(MemorySegment __stream) {
        MethodHandle mh$ = ferror.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ferror", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor clearerr_unlocked$descriptor() {
        return clearerr_unlocked.DESC;
    }

    public static MethodHandle clearerr_unlocked$handle() {
        return clearerr_unlocked.HANDLE;
    }

    public static MemorySegment clearerr_unlocked$address() {
        return clearerr_unlocked.ADDR;
    }

    public static void clearerr_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = clearerr_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("clearerr_unlocked", __stream);
            }
            mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor feof_unlocked$descriptor() {
        return feof_unlocked.DESC;
    }

    public static MethodHandle feof_unlocked$handle() {
        return feof_unlocked.HANDLE;
    }

    public static MemorySegment feof_unlocked$address() {
        return feof_unlocked.ADDR;
    }

    public static int feof_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = feof_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("feof_unlocked", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ferror_unlocked$descriptor() {
        return ferror_unlocked.DESC;
    }

    public static MethodHandle ferror_unlocked$handle() {
        return ferror_unlocked.HANDLE;
    }

    public static MemorySegment ferror_unlocked$address() {
        return ferror_unlocked.ADDR;
    }

    public static int ferror_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = ferror_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ferror_unlocked", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perror$descriptor() {
        return perror.DESC;
    }

    public static MethodHandle perror$handle() {
        return perror.HANDLE;
    }

    public static MemorySegment perror$address() {
        return perror.ADDR;
    }

    public static void perror(MemorySegment __s) {
        MethodHandle mh$ = perror.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perror", __s);
            }
            mh$.invokeExact(__s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fileno$descriptor() {
        return fileno.DESC;
    }

    public static MethodHandle fileno$handle() {
        return fileno.HANDLE;
    }

    public static MemorySegment fileno$address() {
        return fileno.ADDR;
    }

    public static int fileno(MemorySegment __stream) {
        MethodHandle mh$ = fileno.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fileno", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fileno_unlocked$descriptor() {
        return fileno_unlocked.DESC;
    }

    public static MethodHandle fileno_unlocked$handle() {
        return fileno_unlocked.HANDLE;
    }

    public static MemorySegment fileno_unlocked$address() {
        return fileno_unlocked.ADDR;
    }

    public static int fileno_unlocked(MemorySegment __stream) {
        MethodHandle mh$ = fileno_unlocked.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("fileno_unlocked", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor pclose$descriptor() {
        return pclose.DESC;
    }

    public static MethodHandle pclose$handle() {
        return pclose.HANDLE;
    }

    public static MemorySegment pclose$address() {
        return pclose.ADDR;
    }

    public static int pclose(MemorySegment __stream) {
        MethodHandle mh$ = pclose.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("pclose", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor popen$descriptor() {
        return popen.DESC;
    }

    public static MethodHandle popen$handle() {
        return popen.HANDLE;
    }

    public static MemorySegment popen$address() {
        return popen.ADDR;
    }

    public static MemorySegment popen(MemorySegment __command, MemorySegment __modes) {
        MethodHandle mh$ = popen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("popen", __command, __modes);
            }
            return mh$.invokeExact(__command, __modes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ctermid$descriptor() {
        return ctermid.DESC;
    }

    public static MethodHandle ctermid$handle() {
        return ctermid.HANDLE;
    }

    public static MemorySegment ctermid$address() {
        return ctermid.ADDR;
    }

    public static MemorySegment ctermid(MemorySegment __s) {
        MethodHandle mh$ = ctermid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ctermid", __s);
            }
            return mh$.invokeExact(__s);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor flockfile$descriptor() {
        return flockfile.DESC;
    }

    public static MethodHandle flockfile$handle() {
        return flockfile.HANDLE;
    }

    public static MemorySegment flockfile$address() {
        return flockfile.ADDR;
    }

    public static void flockfile(MemorySegment __stream) {
        MethodHandle mh$ = flockfile.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("flockfile", __stream);
            }
            mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ftrylockfile$descriptor() {
        return ftrylockfile.DESC;
    }

    public static MethodHandle ftrylockfile$handle() {
        return ftrylockfile.HANDLE;
    }

    public static MemorySegment ftrylockfile$address() {
        return ftrylockfile.ADDR;
    }

    public static int ftrylockfile(MemorySegment __stream) {
        MethodHandle mh$ = ftrylockfile.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ftrylockfile", __stream);
            }
            return mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor funlockfile$descriptor() {
        return funlockfile.DESC;
    }

    public static MethodHandle funlockfile$handle() {
        return funlockfile.HANDLE;
    }

    public static MemorySegment funlockfile$address() {
        return funlockfile.ADDR;
    }

    public static void funlockfile(MemorySegment __stream) {
        MethodHandle mh$ = funlockfile.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("funlockfile", __stream);
            }
            mh$.invokeExact(__stream);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __uflow$descriptor() {
        return __uflow.DESC;
    }

    public static MethodHandle __uflow$handle() {
        return __uflow.HANDLE;
    }

    public static MemorySegment __uflow$address() {
        return __uflow.ADDR;
    }

    public static int __uflow(MemorySegment x0) {
        MethodHandle mh$ = __uflow.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__uflow", x0);
            }
            return mh$.invokeExact(x0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __overflow$descriptor() {
        return __overflow.DESC;
    }

    public static MethodHandle __overflow$handle() {
        return __overflow.HANDLE;
    }

    public static MemorySegment __overflow$address() {
        return __overflow.ADDR;
    }

    public static int __overflow(MemorySegment x0, int x1) {
        MethodHandle mh$ = __overflow.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("__overflow", x0, x1);
            }
            return mh$.invokeExact(x0, x1);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor select$descriptor() {
        return select.DESC;
    }

    public static MethodHandle select$handle() {
        return select.HANDLE;
    }

    public static MemorySegment select$address() {
        return select.ADDR;
    }

    public static int select(int __nfds, MemorySegment __readfds, MemorySegment __writefds, MemorySegment __exceptfds, MemorySegment __timeout) {
        MethodHandle mh$ = select.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("select", __nfds, __readfds, __writefds, __exceptfds, __timeout);
            }
            return mh$.invokeExact(__nfds, __readfds, __writefds, __exceptfds, __timeout);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor pselect$descriptor() {
        return pselect.DESC;
    }

    public static MethodHandle pselect$handle() {
        return pselect.HANDLE;
    }

    public static MemorySegment pselect$address() {
        return pselect.ADDR;
    }

    public static int pselect(int __nfds, MemorySegment __readfds, MemorySegment __writefds, MemorySegment __exceptfds, MemorySegment __timeout, MemorySegment __sigmask) {
        MethodHandle mh$ = pselect.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("pselect", __nfds, __readfds, __writefds, __exceptfds, __timeout, __sigmask);
            }
            return mh$.invokeExact(__nfds, __readfds, __writefds, __exceptfds, __timeout, __sigmask);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_major_version$descriptor() {
        return libbpf_major_version.DESC;
    }

    public static MethodHandle libbpf_major_version$handle() {
        return libbpf_major_version.HANDLE;
    }

    public static MemorySegment libbpf_major_version$address() {
        return libbpf_major_version.ADDR;
    }

    public static int libbpf_major_version() {
        MethodHandle mh$ = libbpf_major_version.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_major_version", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_minor_version$descriptor() {
        return libbpf_minor_version.DESC;
    }

    public static MethodHandle libbpf_minor_version$handle() {
        return libbpf_minor_version.HANDLE;
    }

    public static MemorySegment libbpf_minor_version$address() {
        return libbpf_minor_version.ADDR;
    }

    public static int libbpf_minor_version() {
        MethodHandle mh$ = libbpf_minor_version.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_minor_version", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_version_string$descriptor() {
        return libbpf_version_string.DESC;
    }

    public static MethodHandle libbpf_version_string$handle() {
        return libbpf_version_string.HANDLE;
    }

    public static MemorySegment libbpf_version_string$address() {
        return libbpf_version_string.ADDR;
    }

    public static MemorySegment libbpf_version_string() {
        MethodHandle mh$ = libbpf_version_string.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_version_string", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int __LIBBPF_ERRNO__START() {
        return 4000;
    }

    public static int LIBBPF_ERRNO__LIBELF() {
        return 4000;
    }

    public static int LIBBPF_ERRNO__FORMAT() {
        return 4001;
    }

    public static int LIBBPF_ERRNO__KVERSION() {
        return 4002;
    }

    public static int LIBBPF_ERRNO__ENDIAN() {
        return 4003;
    }

    public static int LIBBPF_ERRNO__INTERNAL() {
        return 4004;
    }

    public static int LIBBPF_ERRNO__RELOC() {
        return 4005;
    }

    public static int LIBBPF_ERRNO__LOAD() {
        return 4006;
    }

    public static int LIBBPF_ERRNO__VERIFY() {
        return 4007;
    }

    public static int LIBBPF_ERRNO__PROG2BIG() {
        return 4008;
    }

    public static int LIBBPF_ERRNO__KVER() {
        return 4009;
    }

    public static int LIBBPF_ERRNO__PROGTYPE() {
        return 4010;
    }

    public static int LIBBPF_ERRNO__WRNGPID() {
        return 4011;
    }

    public static int LIBBPF_ERRNO__INVSEQ() {
        return 4012;
    }

    public static int LIBBPF_ERRNO__NLPARSE() {
        return 4013;
    }

    public static int __LIBBPF_ERRNO__END() {
        return 4014;
    }

    public static FunctionDescriptor libbpf_strerror$descriptor() {
        return libbpf_strerror.DESC;
    }

    public static MethodHandle libbpf_strerror$handle() {
        return libbpf_strerror.HANDLE;
    }

    public static MemorySegment libbpf_strerror$address() {
        return libbpf_strerror.ADDR;
    }

    public static int libbpf_strerror(int err, MemorySegment buf, long size) {
        MethodHandle mh$ = libbpf_strerror.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_strerror", err, buf, size);
            }
            return mh$.invokeExact(err, buf, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_bpf_attach_type_str$descriptor() {
        return libbpf_bpf_attach_type_str.DESC;
    }

    public static MethodHandle libbpf_bpf_attach_type_str$handle() {
        return libbpf_bpf_attach_type_str.HANDLE;
    }

    public static MemorySegment libbpf_bpf_attach_type_str$address() {
        return libbpf_bpf_attach_type_str.ADDR;
    }

    public static MemorySegment libbpf_bpf_attach_type_str(int t) {
        MethodHandle mh$ = libbpf_bpf_attach_type_str.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_bpf_attach_type_str", t);
            }
            return mh$.invokeExact(t);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_bpf_link_type_str$descriptor() {
        return libbpf_bpf_link_type_str.DESC;
    }

    public static MethodHandle libbpf_bpf_link_type_str$handle() {
        return libbpf_bpf_link_type_str.HANDLE;
    }

    public static MemorySegment libbpf_bpf_link_type_str$address() {
        return libbpf_bpf_link_type_str.ADDR;
    }

    public static MemorySegment libbpf_bpf_link_type_str(int t) {
        MethodHandle mh$ = libbpf_bpf_link_type_str.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_bpf_link_type_str", t);
            }
            return mh$.invokeExact(t);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_bpf_map_type_str$descriptor() {
        return libbpf_bpf_map_type_str.DESC;
    }

    public static MethodHandle libbpf_bpf_map_type_str$handle() {
        return libbpf_bpf_map_type_str.HANDLE;
    }

    public static MemorySegment libbpf_bpf_map_type_str$address() {
        return libbpf_bpf_map_type_str.ADDR;
    }

    public static MemorySegment libbpf_bpf_map_type_str(int t) {
        MethodHandle mh$ = libbpf_bpf_map_type_str.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_bpf_map_type_str", t);
            }
            return mh$.invokeExact(t);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_bpf_prog_type_str$descriptor() {
        return libbpf_bpf_prog_type_str.DESC;
    }

    public static MethodHandle libbpf_bpf_prog_type_str$handle() {
        return libbpf_bpf_prog_type_str.HANDLE;
    }

    public static MemorySegment libbpf_bpf_prog_type_str$address() {
        return libbpf_bpf_prog_type_str.ADDR;
    }

    public static MemorySegment libbpf_bpf_prog_type_str(int t) {
        MethodHandle mh$ = libbpf_bpf_prog_type_str.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_bpf_prog_type_str", t);
            }
            return mh$.invokeExact(t);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int LIBBPF_WARN() {
        return 0;
    }

    public static int LIBBPF_INFO() {
        return 1;
    }

    public static int LIBBPF_DEBUG() {
        return 2;
    }

    public static FunctionDescriptor libbpf_set_print$descriptor() {
        return libbpf_set_print.DESC;
    }

    public static MethodHandle libbpf_set_print$handle() {
        return libbpf_set_print.HANDLE;
    }

    public static MemorySegment libbpf_set_print$address() {
        return libbpf_set_print.ADDR;
    }

    public static MemorySegment libbpf_set_print(MemorySegment fn) {
        MethodHandle mh$ = libbpf_set_print.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_set_print", fn);
            }
            return mh$.invokeExact(fn);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__open$descriptor() {
        return bpf_object__open.DESC;
    }

    public static MethodHandle bpf_object__open$handle() {
        return bpf_object__open.HANDLE;
    }

    public static MemorySegment bpf_object__open$address() {
        return bpf_object__open.ADDR;
    }

    public static MemorySegment bpf_object__open(MemorySegment path2) {
        MethodHandle mh$ = bpf_object__open.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__open", path2);
            }
            return mh$.invokeExact(path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__open_file$descriptor() {
        return bpf_object__open_file.DESC;
    }

    public static MethodHandle bpf_object__open_file$handle() {
        return bpf_object__open_file.HANDLE;
    }

    public static MemorySegment bpf_object__open_file$address() {
        return bpf_object__open_file.ADDR;
    }

    public static MemorySegment bpf_object__open_file(MemorySegment path2, MemorySegment opts) {
        MethodHandle mh$ = bpf_object__open_file.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__open_file", path2, opts);
            }
            return mh$.invokeExact(path2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__open_mem$descriptor() {
        return bpf_object__open_mem.DESC;
    }

    public static MethodHandle bpf_object__open_mem$handle() {
        return bpf_object__open_mem.HANDLE;
    }

    public static MemorySegment bpf_object__open_mem$address() {
        return bpf_object__open_mem.ADDR;
    }

    public static MemorySegment bpf_object__open_mem(MemorySegment obj_buf, long obj_buf_sz, MemorySegment opts) {
        MethodHandle mh$ = bpf_object__open_mem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__open_mem", obj_buf, obj_buf_sz, opts);
            }
            return mh$.invokeExact(obj_buf, obj_buf_sz, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__load$descriptor() {
        return bpf_object__load.DESC;
    }

    public static MethodHandle bpf_object__load$handle() {
        return bpf_object__load.HANDLE;
    }

    public static MemorySegment bpf_object__load$address() {
        return bpf_object__load.ADDR;
    }

    public static int bpf_object__load(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__load.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__load", obj);
            }
            return mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__close$descriptor() {
        return bpf_object__close.DESC;
    }

    public static MethodHandle bpf_object__close$handle() {
        return bpf_object__close.HANDLE;
    }

    public static MemorySegment bpf_object__close$address() {
        return bpf_object__close.ADDR;
    }

    public static void bpf_object__close(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__close.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__close", obj);
            }
            mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__pin_maps$descriptor() {
        return bpf_object__pin_maps.DESC;
    }

    public static MethodHandle bpf_object__pin_maps$handle() {
        return bpf_object__pin_maps.HANDLE;
    }

    public static MemorySegment bpf_object__pin_maps$address() {
        return bpf_object__pin_maps.ADDR;
    }

    public static int bpf_object__pin_maps(MemorySegment obj, MemorySegment path2) {
        MethodHandle mh$ = bpf_object__pin_maps.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__pin_maps", obj, path2);
            }
            return mh$.invokeExact(obj, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__unpin_maps$descriptor() {
        return bpf_object__unpin_maps.DESC;
    }

    public static MethodHandle bpf_object__unpin_maps$handle() {
        return bpf_object__unpin_maps.HANDLE;
    }

    public static MemorySegment bpf_object__unpin_maps$address() {
        return bpf_object__unpin_maps.ADDR;
    }

    public static int bpf_object__unpin_maps(MemorySegment obj, MemorySegment path2) {
        MethodHandle mh$ = bpf_object__unpin_maps.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__unpin_maps", obj, path2);
            }
            return mh$.invokeExact(obj, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__pin_programs$descriptor() {
        return bpf_object__pin_programs.DESC;
    }

    public static MethodHandle bpf_object__pin_programs$handle() {
        return bpf_object__pin_programs.HANDLE;
    }

    public static MemorySegment bpf_object__pin_programs$address() {
        return bpf_object__pin_programs.ADDR;
    }

    public static int bpf_object__pin_programs(MemorySegment obj, MemorySegment path2) {
        MethodHandle mh$ = bpf_object__pin_programs.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__pin_programs", obj, path2);
            }
            return mh$.invokeExact(obj, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__unpin_programs$descriptor() {
        return bpf_object__unpin_programs.DESC;
    }

    public static MethodHandle bpf_object__unpin_programs$handle() {
        return bpf_object__unpin_programs.HANDLE;
    }

    public static MemorySegment bpf_object__unpin_programs$address() {
        return bpf_object__unpin_programs.ADDR;
    }

    public static int bpf_object__unpin_programs(MemorySegment obj, MemorySegment path2) {
        MethodHandle mh$ = bpf_object__unpin_programs.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__unpin_programs", obj, path2);
            }
            return mh$.invokeExact(obj, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__pin$descriptor() {
        return bpf_object__pin.DESC;
    }

    public static MethodHandle bpf_object__pin$handle() {
        return bpf_object__pin.HANDLE;
    }

    public static MemorySegment bpf_object__pin$address() {
        return bpf_object__pin.ADDR;
    }

    public static int bpf_object__pin(MemorySegment object, MemorySegment path2) {
        MethodHandle mh$ = bpf_object__pin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__pin", object, path2);
            }
            return mh$.invokeExact(object, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__unpin$descriptor() {
        return bpf_object__unpin.DESC;
    }

    public static MethodHandle bpf_object__unpin$handle() {
        return bpf_object__unpin.HANDLE;
    }

    public static MemorySegment bpf_object__unpin$address() {
        return bpf_object__unpin.ADDR;
    }

    public static int bpf_object__unpin(MemorySegment object, MemorySegment path2) {
        MethodHandle mh$ = bpf_object__unpin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__unpin", object, path2);
            }
            return mh$.invokeExact(object, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__name$descriptor() {
        return bpf_object__name.DESC;
    }

    public static MethodHandle bpf_object__name$handle() {
        return bpf_object__name.HANDLE;
    }

    public static MemorySegment bpf_object__name$address() {
        return bpf_object__name.ADDR;
    }

    public static MemorySegment bpf_object__name(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__name", obj);
            }
            return mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__kversion$descriptor() {
        return bpf_object__kversion.DESC;
    }

    public static MethodHandle bpf_object__kversion$handle() {
        return bpf_object__kversion.HANDLE;
    }

    public static MemorySegment bpf_object__kversion$address() {
        return bpf_object__kversion.ADDR;
    }

    public static int bpf_object__kversion(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__kversion.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__kversion", obj);
            }
            return mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__set_kversion$descriptor() {
        return bpf_object__set_kversion.DESC;
    }

    public static MethodHandle bpf_object__set_kversion$handle() {
        return bpf_object__set_kversion.HANDLE;
    }

    public static MemorySegment bpf_object__set_kversion$address() {
        return bpf_object__set_kversion.ADDR;
    }

    public static int bpf_object__set_kversion(MemorySegment obj, int kern_version) {
        MethodHandle mh$ = bpf_object__set_kversion.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__set_kversion", obj, kern_version);
            }
            return mh$.invokeExact(obj, kern_version);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__token_fd$descriptor() {
        return bpf_object__token_fd.DESC;
    }

    public static MethodHandle bpf_object__token_fd$handle() {
        return bpf_object__token_fd.HANDLE;
    }

    public static MemorySegment bpf_object__token_fd$address() {
        return bpf_object__token_fd.ADDR;
    }

    public static int bpf_object__token_fd(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__token_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__token_fd", obj);
            }
            return mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__btf$descriptor() {
        return bpf_object__btf.DESC;
    }

    public static MethodHandle bpf_object__btf$handle() {
        return bpf_object__btf.HANDLE;
    }

    public static MemorySegment bpf_object__btf$address() {
        return bpf_object__btf.ADDR;
    }

    public static MemorySegment bpf_object__btf(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__btf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__btf", obj);
            }
            return mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__btf_fd$descriptor() {
        return bpf_object__btf_fd.DESC;
    }

    public static MethodHandle bpf_object__btf_fd$handle() {
        return bpf_object__btf_fd.HANDLE;
    }

    public static MemorySegment bpf_object__btf_fd$address() {
        return bpf_object__btf_fd.ADDR;
    }

    public static int bpf_object__btf_fd(MemorySegment obj) {
        MethodHandle mh$ = bpf_object__btf_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__btf_fd", obj);
            }
            return mh$.invokeExact(obj);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__find_program_by_name$descriptor() {
        return bpf_object__find_program_by_name.DESC;
    }

    public static MethodHandle bpf_object__find_program_by_name$handle() {
        return bpf_object__find_program_by_name.HANDLE;
    }

    public static MemorySegment bpf_object__find_program_by_name$address() {
        return bpf_object__find_program_by_name.ADDR;
    }

    public static MemorySegment bpf_object__find_program_by_name(MemorySegment obj, MemorySegment name) {
        MethodHandle mh$ = bpf_object__find_program_by_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__find_program_by_name", obj, name);
            }
            return mh$.invokeExact(obj, name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_prog_type_by_name$descriptor() {
        return libbpf_prog_type_by_name.DESC;
    }

    public static MethodHandle libbpf_prog_type_by_name$handle() {
        return libbpf_prog_type_by_name.HANDLE;
    }

    public static MemorySegment libbpf_prog_type_by_name$address() {
        return libbpf_prog_type_by_name.ADDR;
    }

    public static int libbpf_prog_type_by_name(MemorySegment name, MemorySegment prog_type, MemorySegment expected_attach_type) {
        MethodHandle mh$ = libbpf_prog_type_by_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_prog_type_by_name", name, prog_type, expected_attach_type);
            }
            return mh$.invokeExact(name, prog_type, expected_attach_type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_attach_type_by_name$descriptor() {
        return libbpf_attach_type_by_name.DESC;
    }

    public static MethodHandle libbpf_attach_type_by_name$handle() {
        return libbpf_attach_type_by_name.HANDLE;
    }

    public static MemorySegment libbpf_attach_type_by_name$address() {
        return libbpf_attach_type_by_name.ADDR;
    }

    public static int libbpf_attach_type_by_name(MemorySegment name, MemorySegment attach_type) {
        MethodHandle mh$ = libbpf_attach_type_by_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_attach_type_by_name", name, attach_type);
            }
            return mh$.invokeExact(name, attach_type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_find_vmlinux_btf_id$descriptor() {
        return libbpf_find_vmlinux_btf_id.DESC;
    }

    public static MethodHandle libbpf_find_vmlinux_btf_id$handle() {
        return libbpf_find_vmlinux_btf_id.HANDLE;
    }

    public static MemorySegment libbpf_find_vmlinux_btf_id$address() {
        return libbpf_find_vmlinux_btf_id.ADDR;
    }

    public static int libbpf_find_vmlinux_btf_id(MemorySegment name, int attach_type) {
        MethodHandle mh$ = libbpf_find_vmlinux_btf_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_find_vmlinux_btf_id", name, attach_type);
            }
            return mh$.invokeExact(name, attach_type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__next_program$descriptor() {
        return bpf_object__next_program.DESC;
    }

    public static MethodHandle bpf_object__next_program$handle() {
        return bpf_object__next_program.HANDLE;
    }

    public static MemorySegment bpf_object__next_program$address() {
        return bpf_object__next_program.ADDR;
    }

    public static MemorySegment bpf_object__next_program(MemorySegment obj, MemorySegment prog) {
        MethodHandle mh$ = bpf_object__next_program.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__next_program", obj, prog);
            }
            return mh$.invokeExact(obj, prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__prev_program$descriptor() {
        return bpf_object__prev_program.DESC;
    }

    public static MethodHandle bpf_object__prev_program$handle() {
        return bpf_object__prev_program.HANDLE;
    }

    public static MemorySegment bpf_object__prev_program$address() {
        return bpf_object__prev_program.ADDR;
    }

    public static MemorySegment bpf_object__prev_program(MemorySegment obj, MemorySegment prog) {
        MethodHandle mh$ = bpf_object__prev_program.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__prev_program", obj, prog);
            }
            return mh$.invokeExact(obj, prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_ifindex$descriptor() {
        return bpf_program__set_ifindex.DESC;
    }

    public static MethodHandle bpf_program__set_ifindex$handle() {
        return bpf_program__set_ifindex.HANDLE;
    }

    public static MemorySegment bpf_program__set_ifindex$address() {
        return bpf_program__set_ifindex.ADDR;
    }

    public static void bpf_program__set_ifindex(MemorySegment prog, int ifindex) {
        MethodHandle mh$ = bpf_program__set_ifindex.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_ifindex", prog, ifindex);
            }
            mh$.invokeExact(prog, ifindex);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__name$descriptor() {
        return bpf_program__name.DESC;
    }

    public static MethodHandle bpf_program__name$handle() {
        return bpf_program__name.HANDLE;
    }

    public static MemorySegment bpf_program__name$address() {
        return bpf_program__name.ADDR;
    }

    public static MemorySegment bpf_program__name(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__name", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__section_name$descriptor() {
        return bpf_program__section_name.DESC;
    }

    public static MethodHandle bpf_program__section_name$handle() {
        return bpf_program__section_name.HANDLE;
    }

    public static MemorySegment bpf_program__section_name$address() {
        return bpf_program__section_name.ADDR;
    }

    public static MemorySegment bpf_program__section_name(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__section_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__section_name", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__autoload$descriptor() {
        return bpf_program__autoload.DESC;
    }

    public static MethodHandle bpf_program__autoload$handle() {
        return bpf_program__autoload.HANDLE;
    }

    public static MemorySegment bpf_program__autoload$address() {
        return bpf_program__autoload.ADDR;
    }

    public static boolean bpf_program__autoload(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__autoload.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__autoload", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_autoload$descriptor() {
        return bpf_program__set_autoload.DESC;
    }

    public static MethodHandle bpf_program__set_autoload$handle() {
        return bpf_program__set_autoload.HANDLE;
    }

    public static MemorySegment bpf_program__set_autoload$address() {
        return bpf_program__set_autoload.ADDR;
    }

    public static int bpf_program__set_autoload(MemorySegment prog, boolean autoload) {
        MethodHandle mh$ = bpf_program__set_autoload.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_autoload", prog, autoload);
            }
            return mh$.invokeExact(prog, autoload);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__autoattach$descriptor() {
        return bpf_program__autoattach.DESC;
    }

    public static MethodHandle bpf_program__autoattach$handle() {
        return bpf_program__autoattach.HANDLE;
    }

    public static MemorySegment bpf_program__autoattach$address() {
        return bpf_program__autoattach.ADDR;
    }

    public static boolean bpf_program__autoattach(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__autoattach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__autoattach", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_autoattach$descriptor() {
        return bpf_program__set_autoattach.DESC;
    }

    public static MethodHandle bpf_program__set_autoattach$handle() {
        return bpf_program__set_autoattach.HANDLE;
    }

    public static MemorySegment bpf_program__set_autoattach$address() {
        return bpf_program__set_autoattach.ADDR;
    }

    public static void bpf_program__set_autoattach(MemorySegment prog, boolean autoattach) {
        MethodHandle mh$ = bpf_program__set_autoattach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_autoattach", prog, autoattach);
            }
            mh$.invokeExact(prog, autoattach);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__insns$descriptor() {
        return bpf_program__insns.DESC;
    }

    public static MethodHandle bpf_program__insns$handle() {
        return bpf_program__insns.HANDLE;
    }

    public static MemorySegment bpf_program__insns$address() {
        return bpf_program__insns.ADDR;
    }

    public static MemorySegment bpf_program__insns(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__insns.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__insns", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_insns$descriptor() {
        return bpf_program__set_insns.DESC;
    }

    public static MethodHandle bpf_program__set_insns$handle() {
        return bpf_program__set_insns.HANDLE;
    }

    public static MemorySegment bpf_program__set_insns$address() {
        return bpf_program__set_insns.ADDR;
    }

    public static int bpf_program__set_insns(MemorySegment prog, MemorySegment new_insns, long new_insn_cnt) {
        MethodHandle mh$ = bpf_program__set_insns.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_insns", prog, new_insns, new_insn_cnt);
            }
            return mh$.invokeExact(prog, new_insns, new_insn_cnt);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__insn_cnt$descriptor() {
        return bpf_program__insn_cnt.DESC;
    }

    public static MethodHandle bpf_program__insn_cnt$handle() {
        return bpf_program__insn_cnt.HANDLE;
    }

    public static MemorySegment bpf_program__insn_cnt$address() {
        return bpf_program__insn_cnt.ADDR;
    }

    public static long bpf_program__insn_cnt(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__insn_cnt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__insn_cnt", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__fd$descriptor() {
        return bpf_program__fd.DESC;
    }

    public static MethodHandle bpf_program__fd$handle() {
        return bpf_program__fd.HANDLE;
    }

    public static MemorySegment bpf_program__fd$address() {
        return bpf_program__fd.ADDR;
    }

    public static int bpf_program__fd(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__fd", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__pin$descriptor() {
        return bpf_program__pin.DESC;
    }

    public static MethodHandle bpf_program__pin$handle() {
        return bpf_program__pin.HANDLE;
    }

    public static MemorySegment bpf_program__pin$address() {
        return bpf_program__pin.ADDR;
    }

    public static int bpf_program__pin(MemorySegment prog, MemorySegment path2) {
        MethodHandle mh$ = bpf_program__pin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__pin", prog, path2);
            }
            return mh$.invokeExact(prog, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__unpin$descriptor() {
        return bpf_program__unpin.DESC;
    }

    public static MethodHandle bpf_program__unpin$handle() {
        return bpf_program__unpin.HANDLE;
    }

    public static MemorySegment bpf_program__unpin$address() {
        return bpf_program__unpin.ADDR;
    }

    public static int bpf_program__unpin(MemorySegment prog, MemorySegment path2) {
        MethodHandle mh$ = bpf_program__unpin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__unpin", prog, path2);
            }
            return mh$.invokeExact(prog, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__unload$descriptor() {
        return bpf_program__unload.DESC;
    }

    public static MethodHandle bpf_program__unload$handle() {
        return bpf_program__unload.HANDLE;
    }

    public static MemorySegment bpf_program__unload$address() {
        return bpf_program__unload.ADDR;
    }

    public static void bpf_program__unload(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__unload.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__unload", prog);
            }
            mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__open$descriptor() {
        return bpf_link__open.DESC;
    }

    public static MethodHandle bpf_link__open$handle() {
        return bpf_link__open.HANDLE;
    }

    public static MemorySegment bpf_link__open$address() {
        return bpf_link__open.ADDR;
    }

    public static MemorySegment bpf_link__open(MemorySegment path2) {
        MethodHandle mh$ = bpf_link__open.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__open", path2);
            }
            return mh$.invokeExact(path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__fd$descriptor() {
        return bpf_link__fd.DESC;
    }

    public static MethodHandle bpf_link__fd$handle() {
        return bpf_link__fd.HANDLE;
    }

    public static MemorySegment bpf_link__fd$address() {
        return bpf_link__fd.ADDR;
    }

    public static int bpf_link__fd(MemorySegment link2) {
        MethodHandle mh$ = bpf_link__fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__fd", link2);
            }
            return mh$.invokeExact(link2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__pin_path$descriptor() {
        return bpf_link__pin_path.DESC;
    }

    public static MethodHandle bpf_link__pin_path$handle() {
        return bpf_link__pin_path.HANDLE;
    }

    public static MemorySegment bpf_link__pin_path$address() {
        return bpf_link__pin_path.ADDR;
    }

    public static MemorySegment bpf_link__pin_path(MemorySegment link2) {
        MethodHandle mh$ = bpf_link__pin_path.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__pin_path", link2);
            }
            return mh$.invokeExact(link2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__pin$descriptor() {
        return bpf_link__pin.DESC;
    }

    public static MethodHandle bpf_link__pin$handle() {
        return bpf_link__pin.HANDLE;
    }

    public static MemorySegment bpf_link__pin$address() {
        return bpf_link__pin.ADDR;
    }

    public static int bpf_link__pin(MemorySegment link2, MemorySegment path2) {
        MethodHandle mh$ = bpf_link__pin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__pin", link2, path2);
            }
            return mh$.invokeExact(link2, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__unpin$descriptor() {
        return bpf_link__unpin.DESC;
    }

    public static MethodHandle bpf_link__unpin$handle() {
        return bpf_link__unpin.HANDLE;
    }

    public static MemorySegment bpf_link__unpin$address() {
        return bpf_link__unpin.ADDR;
    }

    public static int bpf_link__unpin(MemorySegment link2) {
        MethodHandle mh$ = bpf_link__unpin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__unpin", link2);
            }
            return mh$.invokeExact(link2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__update_program$descriptor() {
        return bpf_link__update_program.DESC;
    }

    public static MethodHandle bpf_link__update_program$handle() {
        return bpf_link__update_program.HANDLE;
    }

    public static MemorySegment bpf_link__update_program$address() {
        return bpf_link__update_program.ADDR;
    }

    public static int bpf_link__update_program(MemorySegment link2, MemorySegment prog) {
        MethodHandle mh$ = bpf_link__update_program.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__update_program", link2, prog);
            }
            return mh$.invokeExact(link2, prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__disconnect$descriptor() {
        return bpf_link__disconnect.DESC;
    }

    public static MethodHandle bpf_link__disconnect$handle() {
        return bpf_link__disconnect.HANDLE;
    }

    public static MemorySegment bpf_link__disconnect$address() {
        return bpf_link__disconnect.ADDR;
    }

    public static void bpf_link__disconnect(MemorySegment link2) {
        MethodHandle mh$ = bpf_link__disconnect.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__disconnect", link2);
            }
            mh$.invokeExact(link2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__detach$descriptor() {
        return bpf_link__detach.DESC;
    }

    public static MethodHandle bpf_link__detach$handle() {
        return bpf_link__detach.HANDLE;
    }

    public static MemorySegment bpf_link__detach$address() {
        return bpf_link__detach.ADDR;
    }

    public static int bpf_link__detach(MemorySegment link2) {
        MethodHandle mh$ = bpf_link__detach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__detach", link2);
            }
            return mh$.invokeExact(link2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__destroy$descriptor() {
        return bpf_link__destroy.DESC;
    }

    public static MethodHandle bpf_link__destroy$handle() {
        return bpf_link__destroy.HANDLE;
    }

    public static MemorySegment bpf_link__destroy$address() {
        return bpf_link__destroy.ADDR;
    }

    public static int bpf_link__destroy(MemorySegment link2) {
        MethodHandle mh$ = bpf_link__destroy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__destroy", link2);
            }
            return mh$.invokeExact(link2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach$descriptor() {
        return bpf_program__attach.DESC;
    }

    public static MethodHandle bpf_program__attach$handle() {
        return bpf_program__attach.HANDLE;
    }

    public static MemorySegment bpf_program__attach$address() {
        return bpf_program__attach.ADDR;
    }

    public static MemorySegment bpf_program__attach(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__attach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_perf_event$descriptor() {
        return bpf_program__attach_perf_event.DESC;
    }

    public static MethodHandle bpf_program__attach_perf_event$handle() {
        return bpf_program__attach_perf_event.HANDLE;
    }

    public static MemorySegment bpf_program__attach_perf_event$address() {
        return bpf_program__attach_perf_event.ADDR;
    }

    public static MemorySegment bpf_program__attach_perf_event(MemorySegment prog, int pfd) {
        MethodHandle mh$ = bpf_program__attach_perf_event.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_perf_event", prog, pfd);
            }
            return mh$.invokeExact(prog, pfd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_perf_event_opts$descriptor() {
        return bpf_program__attach_perf_event_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_perf_event_opts$handle() {
        return bpf_program__attach_perf_event_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_perf_event_opts$address() {
        return bpf_program__attach_perf_event_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_perf_event_opts(MemorySegment prog, int pfd, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_perf_event_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_perf_event_opts", prog, pfd, opts);
            }
            return mh$.invokeExact(prog, pfd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int PROBE_ATTACH_MODE_DEFAULT() {
        return 0;
    }

    public static int PROBE_ATTACH_MODE_LEGACY() {
        return 1;
    }

    public static int PROBE_ATTACH_MODE_PERF() {
        return 2;
    }

    public static int PROBE_ATTACH_MODE_LINK() {
        return 3;
    }

    public static FunctionDescriptor bpf_program__attach_kprobe$descriptor() {
        return bpf_program__attach_kprobe.DESC;
    }

    public static MethodHandle bpf_program__attach_kprobe$handle() {
        return bpf_program__attach_kprobe.HANDLE;
    }

    public static MemorySegment bpf_program__attach_kprobe$address() {
        return bpf_program__attach_kprobe.ADDR;
    }

    public static MemorySegment bpf_program__attach_kprobe(MemorySegment prog, boolean retprobe, MemorySegment func_name) {
        MethodHandle mh$ = bpf_program__attach_kprobe.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_kprobe", prog, retprobe, func_name);
            }
            return mh$.invokeExact(prog, retprobe, func_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_kprobe_opts$descriptor() {
        return bpf_program__attach_kprobe_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_kprobe_opts$handle() {
        return bpf_program__attach_kprobe_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_kprobe_opts$address() {
        return bpf_program__attach_kprobe_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_kprobe_opts(MemorySegment prog, MemorySegment func_name, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_kprobe_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_kprobe_opts", prog, func_name, opts);
            }
            return mh$.invokeExact(prog, func_name, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_kprobe_multi_opts$descriptor() {
        return bpf_program__attach_kprobe_multi_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_kprobe_multi_opts$handle() {
        return bpf_program__attach_kprobe_multi_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_kprobe_multi_opts$address() {
        return bpf_program__attach_kprobe_multi_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_kprobe_multi_opts(MemorySegment prog, MemorySegment pattern, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_kprobe_multi_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_kprobe_multi_opts", prog, pattern, opts);
            }
            return mh$.invokeExact(prog, pattern, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_uprobe_multi$descriptor() {
        return bpf_program__attach_uprobe_multi.DESC;
    }

    public static MethodHandle bpf_program__attach_uprobe_multi$handle() {
        return bpf_program__attach_uprobe_multi.HANDLE;
    }

    public static MemorySegment bpf_program__attach_uprobe_multi$address() {
        return bpf_program__attach_uprobe_multi.ADDR;
    }

    public static MemorySegment bpf_program__attach_uprobe_multi(MemorySegment prog, int pid2, MemorySegment binary_path, MemorySegment func_pattern, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_uprobe_multi.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_uprobe_multi", prog, pid2, binary_path, func_pattern, opts);
            }
            return mh$.invokeExact(prog, pid2, binary_path, func_pattern, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_ksyscall$descriptor() {
        return bpf_program__attach_ksyscall.DESC;
    }

    public static MethodHandle bpf_program__attach_ksyscall$handle() {
        return bpf_program__attach_ksyscall.HANDLE;
    }

    public static MemorySegment bpf_program__attach_ksyscall$address() {
        return bpf_program__attach_ksyscall.ADDR;
    }

    public static MemorySegment bpf_program__attach_ksyscall(MemorySegment prog, MemorySegment syscall_name, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_ksyscall.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_ksyscall", prog, syscall_name, opts);
            }
            return mh$.invokeExact(prog, syscall_name, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_uprobe$descriptor() {
        return bpf_program__attach_uprobe.DESC;
    }

    public static MethodHandle bpf_program__attach_uprobe$handle() {
        return bpf_program__attach_uprobe.HANDLE;
    }

    public static MemorySegment bpf_program__attach_uprobe$address() {
        return bpf_program__attach_uprobe.ADDR;
    }

    public static MemorySegment bpf_program__attach_uprobe(MemorySegment prog, boolean retprobe, int pid2, MemorySegment binary_path, long func_offset) {
        MethodHandle mh$ = bpf_program__attach_uprobe.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_uprobe", prog, retprobe, pid2, binary_path, func_offset);
            }
            return mh$.invokeExact(prog, retprobe, pid2, binary_path, func_offset);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_uprobe_opts$descriptor() {
        return bpf_program__attach_uprobe_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_uprobe_opts$handle() {
        return bpf_program__attach_uprobe_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_uprobe_opts$address() {
        return bpf_program__attach_uprobe_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_uprobe_opts(MemorySegment prog, int pid2, MemorySegment binary_path, long func_offset, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_uprobe_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_uprobe_opts", prog, pid2, binary_path, func_offset, opts);
            }
            return mh$.invokeExact(prog, pid2, binary_path, func_offset, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_usdt$descriptor() {
        return bpf_program__attach_usdt.DESC;
    }

    public static MethodHandle bpf_program__attach_usdt$handle() {
        return bpf_program__attach_usdt.HANDLE;
    }

    public static MemorySegment bpf_program__attach_usdt$address() {
        return bpf_program__attach_usdt.ADDR;
    }

    public static MemorySegment bpf_program__attach_usdt(MemorySegment prog, int pid2, MemorySegment binary_path, MemorySegment usdt_provider, MemorySegment usdt_name, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_usdt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_usdt", prog, pid2, binary_path, usdt_provider, usdt_name, opts);
            }
            return mh$.invokeExact(prog, pid2, binary_path, usdt_provider, usdt_name, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_tracepoint$descriptor() {
        return bpf_program__attach_tracepoint.DESC;
    }

    public static MethodHandle bpf_program__attach_tracepoint$handle() {
        return bpf_program__attach_tracepoint.HANDLE;
    }

    public static MemorySegment bpf_program__attach_tracepoint$address() {
        return bpf_program__attach_tracepoint.ADDR;
    }

    public static MemorySegment bpf_program__attach_tracepoint(MemorySegment prog, MemorySegment tp_category, MemorySegment tp_name) {
        MethodHandle mh$ = bpf_program__attach_tracepoint.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_tracepoint", prog, tp_category, tp_name);
            }
            return mh$.invokeExact(prog, tp_category, tp_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_tracepoint_opts$descriptor() {
        return bpf_program__attach_tracepoint_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_tracepoint_opts$handle() {
        return bpf_program__attach_tracepoint_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_tracepoint_opts$address() {
        return bpf_program__attach_tracepoint_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_tracepoint_opts(MemorySegment prog, MemorySegment tp_category, MemorySegment tp_name, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_tracepoint_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_tracepoint_opts", prog, tp_category, tp_name, opts);
            }
            return mh$.invokeExact(prog, tp_category, tp_name, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_raw_tracepoint$descriptor() {
        return bpf_program__attach_raw_tracepoint.DESC;
    }

    public static MethodHandle bpf_program__attach_raw_tracepoint$handle() {
        return bpf_program__attach_raw_tracepoint.HANDLE;
    }

    public static MemorySegment bpf_program__attach_raw_tracepoint$address() {
        return bpf_program__attach_raw_tracepoint.ADDR;
    }

    public static MemorySegment bpf_program__attach_raw_tracepoint(MemorySegment prog, MemorySegment tp_name) {
        MethodHandle mh$ = bpf_program__attach_raw_tracepoint.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_raw_tracepoint", prog, tp_name);
            }
            return mh$.invokeExact(prog, tp_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_raw_tracepoint_opts$descriptor() {
        return bpf_program__attach_raw_tracepoint_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_raw_tracepoint_opts$handle() {
        return bpf_program__attach_raw_tracepoint_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_raw_tracepoint_opts$address() {
        return bpf_program__attach_raw_tracepoint_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_raw_tracepoint_opts(MemorySegment prog, MemorySegment tp_name, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_raw_tracepoint_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_raw_tracepoint_opts", prog, tp_name, opts);
            }
            return mh$.invokeExact(prog, tp_name, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_trace$descriptor() {
        return bpf_program__attach_trace.DESC;
    }

    public static MethodHandle bpf_program__attach_trace$handle() {
        return bpf_program__attach_trace.HANDLE;
    }

    public static MemorySegment bpf_program__attach_trace$address() {
        return bpf_program__attach_trace.ADDR;
    }

    public static MemorySegment bpf_program__attach_trace(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__attach_trace.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_trace", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_trace_opts$descriptor() {
        return bpf_program__attach_trace_opts.DESC;
    }

    public static MethodHandle bpf_program__attach_trace_opts$handle() {
        return bpf_program__attach_trace_opts.HANDLE;
    }

    public static MemorySegment bpf_program__attach_trace_opts$address() {
        return bpf_program__attach_trace_opts.ADDR;
    }

    public static MemorySegment bpf_program__attach_trace_opts(MemorySegment prog, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_trace_opts.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_trace_opts", prog, opts);
            }
            return mh$.invokeExact(prog, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_lsm$descriptor() {
        return bpf_program__attach_lsm.DESC;
    }

    public static MethodHandle bpf_program__attach_lsm$handle() {
        return bpf_program__attach_lsm.HANDLE;
    }

    public static MemorySegment bpf_program__attach_lsm$address() {
        return bpf_program__attach_lsm.ADDR;
    }

    public static MemorySegment bpf_program__attach_lsm(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__attach_lsm.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_lsm", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_cgroup$descriptor() {
        return bpf_program__attach_cgroup.DESC;
    }

    public static MethodHandle bpf_program__attach_cgroup$handle() {
        return bpf_program__attach_cgroup.HANDLE;
    }

    public static MemorySegment bpf_program__attach_cgroup$address() {
        return bpf_program__attach_cgroup.ADDR;
    }

    public static MemorySegment bpf_program__attach_cgroup(MemorySegment prog, int cgroup_fd) {
        MethodHandle mh$ = bpf_program__attach_cgroup.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_cgroup", prog, cgroup_fd);
            }
            return mh$.invokeExact(prog, cgroup_fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_netns$descriptor() {
        return bpf_program__attach_netns.DESC;
    }

    public static MethodHandle bpf_program__attach_netns$handle() {
        return bpf_program__attach_netns.HANDLE;
    }

    public static MemorySegment bpf_program__attach_netns$address() {
        return bpf_program__attach_netns.ADDR;
    }

    public static MemorySegment bpf_program__attach_netns(MemorySegment prog, int netns_fd) {
        MethodHandle mh$ = bpf_program__attach_netns.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_netns", prog, netns_fd);
            }
            return mh$.invokeExact(prog, netns_fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_sockmap$descriptor() {
        return bpf_program__attach_sockmap.DESC;
    }

    public static MethodHandle bpf_program__attach_sockmap$handle() {
        return bpf_program__attach_sockmap.HANDLE;
    }

    public static MemorySegment bpf_program__attach_sockmap$address() {
        return bpf_program__attach_sockmap.ADDR;
    }

    public static MemorySegment bpf_program__attach_sockmap(MemorySegment prog, int map_fd) {
        MethodHandle mh$ = bpf_program__attach_sockmap.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_sockmap", prog, map_fd);
            }
            return mh$.invokeExact(prog, map_fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_xdp$descriptor() {
        return bpf_program__attach_xdp.DESC;
    }

    public static MethodHandle bpf_program__attach_xdp$handle() {
        return bpf_program__attach_xdp.HANDLE;
    }

    public static MemorySegment bpf_program__attach_xdp$address() {
        return bpf_program__attach_xdp.ADDR;
    }

    public static MemorySegment bpf_program__attach_xdp(MemorySegment prog, int ifindex) {
        MethodHandle mh$ = bpf_program__attach_xdp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_xdp", prog, ifindex);
            }
            return mh$.invokeExact(prog, ifindex);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_freplace$descriptor() {
        return bpf_program__attach_freplace.DESC;
    }

    public static MethodHandle bpf_program__attach_freplace$handle() {
        return bpf_program__attach_freplace.HANDLE;
    }

    public static MemorySegment bpf_program__attach_freplace$address() {
        return bpf_program__attach_freplace.ADDR;
    }

    public static MemorySegment bpf_program__attach_freplace(MemorySegment prog, int target_fd, MemorySegment attach_func_name) {
        MethodHandle mh$ = bpf_program__attach_freplace.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_freplace", prog, target_fd, attach_func_name);
            }
            return mh$.invokeExact(prog, target_fd, attach_func_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_netfilter$descriptor() {
        return bpf_program__attach_netfilter.DESC;
    }

    public static MethodHandle bpf_program__attach_netfilter$handle() {
        return bpf_program__attach_netfilter.HANDLE;
    }

    public static MemorySegment bpf_program__attach_netfilter$address() {
        return bpf_program__attach_netfilter.ADDR;
    }

    public static MemorySegment bpf_program__attach_netfilter(MemorySegment prog, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_netfilter.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_netfilter", prog, opts);
            }
            return mh$.invokeExact(prog, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_tcx$descriptor() {
        return bpf_program__attach_tcx.DESC;
    }

    public static MethodHandle bpf_program__attach_tcx$handle() {
        return bpf_program__attach_tcx.HANDLE;
    }

    public static MemorySegment bpf_program__attach_tcx$address() {
        return bpf_program__attach_tcx.ADDR;
    }

    public static MemorySegment bpf_program__attach_tcx(MemorySegment prog, int ifindex, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_tcx.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_tcx", prog, ifindex, opts);
            }
            return mh$.invokeExact(prog, ifindex, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_netkit$descriptor() {
        return bpf_program__attach_netkit.DESC;
    }

    public static MethodHandle bpf_program__attach_netkit$handle() {
        return bpf_program__attach_netkit.HANDLE;
    }

    public static MemorySegment bpf_program__attach_netkit$address() {
        return bpf_program__attach_netkit.ADDR;
    }

    public static MemorySegment bpf_program__attach_netkit(MemorySegment prog, int ifindex, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_netkit.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_netkit", prog, ifindex, opts);
            }
            return mh$.invokeExact(prog, ifindex, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__attach_struct_ops$descriptor() {
        return bpf_map__attach_struct_ops.DESC;
    }

    public static MethodHandle bpf_map__attach_struct_ops$handle() {
        return bpf_map__attach_struct_ops.HANDLE;
    }

    public static MemorySegment bpf_map__attach_struct_ops$address() {
        return bpf_map__attach_struct_ops.ADDR;
    }

    public static MemorySegment bpf_map__attach_struct_ops(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__attach_struct_ops.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__attach_struct_ops", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_link__update_map$descriptor() {
        return bpf_link__update_map.DESC;
    }

    public static MethodHandle bpf_link__update_map$handle() {
        return bpf_link__update_map.HANDLE;
    }

    public static MemorySegment bpf_link__update_map$address() {
        return bpf_link__update_map.ADDR;
    }

    public static int bpf_link__update_map(MemorySegment link2, MemorySegment map2) {
        MethodHandle mh$ = bpf_link__update_map.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_link__update_map", link2, map2);
            }
            return mh$.invokeExact(link2, map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__attach_iter$descriptor() {
        return bpf_program__attach_iter.DESC;
    }

    public static MethodHandle bpf_program__attach_iter$handle() {
        return bpf_program__attach_iter.HANDLE;
    }

    public static MemorySegment bpf_program__attach_iter$address() {
        return bpf_program__attach_iter.ADDR;
    }

    public static MemorySegment bpf_program__attach_iter(MemorySegment prog, MemorySegment opts) {
        MethodHandle mh$ = bpf_program__attach_iter.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__attach_iter", prog, opts);
            }
            return mh$.invokeExact(prog, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__type$descriptor() {
        return bpf_program__type.DESC;
    }

    public static MethodHandle bpf_program__type$handle() {
        return bpf_program__type.HANDLE;
    }

    public static MemorySegment bpf_program__type$address() {
        return bpf_program__type.ADDR;
    }

    public static int bpf_program__type(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__type", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_type$descriptor() {
        return bpf_program__set_type.DESC;
    }

    public static MethodHandle bpf_program__set_type$handle() {
        return bpf_program__set_type.HANDLE;
    }

    public static MemorySegment bpf_program__set_type$address() {
        return bpf_program__set_type.ADDR;
    }

    public static int bpf_program__set_type(MemorySegment prog, int type2) {
        MethodHandle mh$ = bpf_program__set_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_type", prog, type2);
            }
            return mh$.invokeExact(prog, type2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__expected_attach_type$descriptor() {
        return bpf_program__expected_attach_type.DESC;
    }

    public static MethodHandle bpf_program__expected_attach_type$handle() {
        return bpf_program__expected_attach_type.HANDLE;
    }

    public static MemorySegment bpf_program__expected_attach_type$address() {
        return bpf_program__expected_attach_type.ADDR;
    }

    public static int bpf_program__expected_attach_type(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__expected_attach_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__expected_attach_type", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_expected_attach_type$descriptor() {
        return bpf_program__set_expected_attach_type.DESC;
    }

    public static MethodHandle bpf_program__set_expected_attach_type$handle() {
        return bpf_program__set_expected_attach_type.HANDLE;
    }

    public static MemorySegment bpf_program__set_expected_attach_type$address() {
        return bpf_program__set_expected_attach_type.ADDR;
    }

    public static int bpf_program__set_expected_attach_type(MemorySegment prog, int type2) {
        MethodHandle mh$ = bpf_program__set_expected_attach_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_expected_attach_type", prog, type2);
            }
            return mh$.invokeExact(prog, type2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__flags$descriptor() {
        return bpf_program__flags.DESC;
    }

    public static MethodHandle bpf_program__flags$handle() {
        return bpf_program__flags.HANDLE;
    }

    public static MemorySegment bpf_program__flags$address() {
        return bpf_program__flags.ADDR;
    }

    public static int bpf_program__flags(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__flags", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_flags$descriptor() {
        return bpf_program__set_flags.DESC;
    }

    public static MethodHandle bpf_program__set_flags$handle() {
        return bpf_program__set_flags.HANDLE;
    }

    public static MemorySegment bpf_program__set_flags$address() {
        return bpf_program__set_flags.ADDR;
    }

    public static int bpf_program__set_flags(MemorySegment prog, int flags) {
        MethodHandle mh$ = bpf_program__set_flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_flags", prog, flags);
            }
            return mh$.invokeExact(prog, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__log_level$descriptor() {
        return bpf_program__log_level.DESC;
    }

    public static MethodHandle bpf_program__log_level$handle() {
        return bpf_program__log_level.HANDLE;
    }

    public static MemorySegment bpf_program__log_level$address() {
        return bpf_program__log_level.ADDR;
    }

    public static int bpf_program__log_level(MemorySegment prog) {
        MethodHandle mh$ = bpf_program__log_level.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__log_level", prog);
            }
            return mh$.invokeExact(prog);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_log_level$descriptor() {
        return bpf_program__set_log_level.DESC;
    }

    public static MethodHandle bpf_program__set_log_level$handle() {
        return bpf_program__set_log_level.HANDLE;
    }

    public static MemorySegment bpf_program__set_log_level$address() {
        return bpf_program__set_log_level.ADDR;
    }

    public static int bpf_program__set_log_level(MemorySegment prog, int log_level) {
        MethodHandle mh$ = bpf_program__set_log_level.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_log_level", prog, log_level);
            }
            return mh$.invokeExact(prog, log_level);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__log_buf$descriptor() {
        return bpf_program__log_buf.DESC;
    }

    public static MethodHandle bpf_program__log_buf$handle() {
        return bpf_program__log_buf.HANDLE;
    }

    public static MemorySegment bpf_program__log_buf$address() {
        return bpf_program__log_buf.ADDR;
    }

    public static MemorySegment bpf_program__log_buf(MemorySegment prog, MemorySegment log_size) {
        MethodHandle mh$ = bpf_program__log_buf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__log_buf", prog, log_size);
            }
            return mh$.invokeExact(prog, log_size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_log_buf$descriptor() {
        return bpf_program__set_log_buf.DESC;
    }

    public static MethodHandle bpf_program__set_log_buf$handle() {
        return bpf_program__set_log_buf.HANDLE;
    }

    public static MemorySegment bpf_program__set_log_buf$address() {
        return bpf_program__set_log_buf.ADDR;
    }

    public static int bpf_program__set_log_buf(MemorySegment prog, MemorySegment log_buf, long log_size) {
        MethodHandle mh$ = bpf_program__set_log_buf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_log_buf", prog, log_buf, log_size);
            }
            return mh$.invokeExact(prog, log_buf, log_size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_program__set_attach_target$descriptor() {
        return bpf_program__set_attach_target.DESC;
    }

    public static MethodHandle bpf_program__set_attach_target$handle() {
        return bpf_program__set_attach_target.HANDLE;
    }

    public static MemorySegment bpf_program__set_attach_target$address() {
        return bpf_program__set_attach_target.ADDR;
    }

    public static int bpf_program__set_attach_target(MemorySegment prog, int attach_prog_fd, MemorySegment attach_func_name) {
        MethodHandle mh$ = bpf_program__set_attach_target.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_program__set_attach_target", prog, attach_prog_fd, attach_func_name);
            }
            return mh$.invokeExact(prog, attach_prog_fd, attach_func_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__find_map_by_name$descriptor() {
        return bpf_object__find_map_by_name.DESC;
    }

    public static MethodHandle bpf_object__find_map_by_name$handle() {
        return bpf_object__find_map_by_name.HANDLE;
    }

    public static MemorySegment bpf_object__find_map_by_name$address() {
        return bpf_object__find_map_by_name.ADDR;
    }

    public static MemorySegment bpf_object__find_map_by_name(MemorySegment obj, MemorySegment name) {
        MethodHandle mh$ = bpf_object__find_map_by_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__find_map_by_name", obj, name);
            }
            return mh$.invokeExact(obj, name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__find_map_fd_by_name$descriptor() {
        return bpf_object__find_map_fd_by_name.DESC;
    }

    public static MethodHandle bpf_object__find_map_fd_by_name$handle() {
        return bpf_object__find_map_fd_by_name.HANDLE;
    }

    public static MemorySegment bpf_object__find_map_fd_by_name$address() {
        return bpf_object__find_map_fd_by_name.ADDR;
    }

    public static int bpf_object__find_map_fd_by_name(MemorySegment obj, MemorySegment name) {
        MethodHandle mh$ = bpf_object__find_map_fd_by_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__find_map_fd_by_name", obj, name);
            }
            return mh$.invokeExact(obj, name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__next_map$descriptor() {
        return bpf_object__next_map.DESC;
    }

    public static MethodHandle bpf_object__next_map$handle() {
        return bpf_object__next_map.HANDLE;
    }

    public static MemorySegment bpf_object__next_map$address() {
        return bpf_object__next_map.ADDR;
    }

    public static MemorySegment bpf_object__next_map(MemorySegment obj, MemorySegment map2) {
        MethodHandle mh$ = bpf_object__next_map.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__next_map", obj, map2);
            }
            return mh$.invokeExact(obj, map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__prev_map$descriptor() {
        return bpf_object__prev_map.DESC;
    }

    public static MethodHandle bpf_object__prev_map$handle() {
        return bpf_object__prev_map.HANDLE;
    }

    public static MemorySegment bpf_object__prev_map$address() {
        return bpf_object__prev_map.ADDR;
    }

    public static MemorySegment bpf_object__prev_map(MemorySegment obj, MemorySegment map2) {
        MethodHandle mh$ = bpf_object__prev_map.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__prev_map", obj, map2);
            }
            return mh$.invokeExact(obj, map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_autocreate$descriptor() {
        return bpf_map__set_autocreate.DESC;
    }

    public static MethodHandle bpf_map__set_autocreate$handle() {
        return bpf_map__set_autocreate.HANDLE;
    }

    public static MemorySegment bpf_map__set_autocreate$address() {
        return bpf_map__set_autocreate.ADDR;
    }

    public static int bpf_map__set_autocreate(MemorySegment map2, boolean autocreate) {
        MethodHandle mh$ = bpf_map__set_autocreate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_autocreate", map2, autocreate);
            }
            return mh$.invokeExact(map2, autocreate);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__autocreate$descriptor() {
        return bpf_map__autocreate.DESC;
    }

    public static MethodHandle bpf_map__autocreate$handle() {
        return bpf_map__autocreate.HANDLE;
    }

    public static MemorySegment bpf_map__autocreate$address() {
        return bpf_map__autocreate.ADDR;
    }

    public static boolean bpf_map__autocreate(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__autocreate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__autocreate", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_autoattach$descriptor() {
        return bpf_map__set_autoattach.DESC;
    }

    public static MethodHandle bpf_map__set_autoattach$handle() {
        return bpf_map__set_autoattach.HANDLE;
    }

    public static MemorySegment bpf_map__set_autoattach$address() {
        return bpf_map__set_autoattach.ADDR;
    }

    public static int bpf_map__set_autoattach(MemorySegment map2, boolean autoattach) {
        MethodHandle mh$ = bpf_map__set_autoattach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_autoattach", map2, autoattach);
            }
            return mh$.invokeExact(map2, autoattach);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__autoattach$descriptor() {
        return bpf_map__autoattach.DESC;
    }

    public static MethodHandle bpf_map__autoattach$handle() {
        return bpf_map__autoattach.HANDLE;
    }

    public static MemorySegment bpf_map__autoattach$address() {
        return bpf_map__autoattach.ADDR;
    }

    public static boolean bpf_map__autoattach(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__autoattach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__autoattach", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__fd$descriptor() {
        return bpf_map__fd.DESC;
    }

    public static MethodHandle bpf_map__fd$handle() {
        return bpf_map__fd.HANDLE;
    }

    public static MemorySegment bpf_map__fd$address() {
        return bpf_map__fd.ADDR;
    }

    public static int bpf_map__fd(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__fd", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__reuse_fd$descriptor() {
        return bpf_map__reuse_fd.DESC;
    }

    public static MethodHandle bpf_map__reuse_fd$handle() {
        return bpf_map__reuse_fd.HANDLE;
    }

    public static MemorySegment bpf_map__reuse_fd$address() {
        return bpf_map__reuse_fd.ADDR;
    }

    public static int bpf_map__reuse_fd(MemorySegment map2, int fd2) {
        MethodHandle mh$ = bpf_map__reuse_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__reuse_fd", map2, fd2);
            }
            return mh$.invokeExact(map2, fd2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__name$descriptor() {
        return bpf_map__name.DESC;
    }

    public static MethodHandle bpf_map__name$handle() {
        return bpf_map__name.HANDLE;
    }

    public static MemorySegment bpf_map__name$address() {
        return bpf_map__name.ADDR;
    }

    public static MemorySegment bpf_map__name(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__name", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__type$descriptor() {
        return bpf_map__type.DESC;
    }

    public static MethodHandle bpf_map__type$handle() {
        return bpf_map__type.HANDLE;
    }

    public static MemorySegment bpf_map__type$address() {
        return bpf_map__type.ADDR;
    }

    public static int bpf_map__type(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__type", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_type$descriptor() {
        return bpf_map__set_type.DESC;
    }

    public static MethodHandle bpf_map__set_type$handle() {
        return bpf_map__set_type.HANDLE;
    }

    public static MemorySegment bpf_map__set_type$address() {
        return bpf_map__set_type.ADDR;
    }

    public static int bpf_map__set_type(MemorySegment map2, int type2) {
        MethodHandle mh$ = bpf_map__set_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_type", map2, type2);
            }
            return mh$.invokeExact(map2, type2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__max_entries$descriptor() {
        return bpf_map__max_entries.DESC;
    }

    public static MethodHandle bpf_map__max_entries$handle() {
        return bpf_map__max_entries.HANDLE;
    }

    public static MemorySegment bpf_map__max_entries$address() {
        return bpf_map__max_entries.ADDR;
    }

    public static int bpf_map__max_entries(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__max_entries.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__max_entries", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_max_entries$descriptor() {
        return bpf_map__set_max_entries.DESC;
    }

    public static MethodHandle bpf_map__set_max_entries$handle() {
        return bpf_map__set_max_entries.HANDLE;
    }

    public static MemorySegment bpf_map__set_max_entries$address() {
        return bpf_map__set_max_entries.ADDR;
    }

    public static int bpf_map__set_max_entries(MemorySegment map2, int max_entries) {
        MethodHandle mh$ = bpf_map__set_max_entries.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_max_entries", map2, max_entries);
            }
            return mh$.invokeExact(map2, max_entries);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__map_flags$descriptor() {
        return bpf_map__map_flags.DESC;
    }

    public static MethodHandle bpf_map__map_flags$handle() {
        return bpf_map__map_flags.HANDLE;
    }

    public static MemorySegment bpf_map__map_flags$address() {
        return bpf_map__map_flags.ADDR;
    }

    public static int bpf_map__map_flags(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__map_flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__map_flags", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_map_flags$descriptor() {
        return bpf_map__set_map_flags.DESC;
    }

    public static MethodHandle bpf_map__set_map_flags$handle() {
        return bpf_map__set_map_flags.HANDLE;
    }

    public static MemorySegment bpf_map__set_map_flags$address() {
        return bpf_map__set_map_flags.ADDR;
    }

    public static int bpf_map__set_map_flags(MemorySegment map2, int flags) {
        MethodHandle mh$ = bpf_map__set_map_flags.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_map_flags", map2, flags);
            }
            return mh$.invokeExact(map2, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__numa_node$descriptor() {
        return bpf_map__numa_node.DESC;
    }

    public static MethodHandle bpf_map__numa_node$handle() {
        return bpf_map__numa_node.HANDLE;
    }

    public static MemorySegment bpf_map__numa_node$address() {
        return bpf_map__numa_node.ADDR;
    }

    public static int bpf_map__numa_node(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__numa_node.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__numa_node", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_numa_node$descriptor() {
        return bpf_map__set_numa_node.DESC;
    }

    public static MethodHandle bpf_map__set_numa_node$handle() {
        return bpf_map__set_numa_node.HANDLE;
    }

    public static MemorySegment bpf_map__set_numa_node$address() {
        return bpf_map__set_numa_node.ADDR;
    }

    public static int bpf_map__set_numa_node(MemorySegment map2, int numa_node) {
        MethodHandle mh$ = bpf_map__set_numa_node.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_numa_node", map2, numa_node);
            }
            return mh$.invokeExact(map2, numa_node);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__key_size$descriptor() {
        return bpf_map__key_size.DESC;
    }

    public static MethodHandle bpf_map__key_size$handle() {
        return bpf_map__key_size.HANDLE;
    }

    public static MemorySegment bpf_map__key_size$address() {
        return bpf_map__key_size.ADDR;
    }

    public static int bpf_map__key_size(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__key_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__key_size", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_key_size$descriptor() {
        return bpf_map__set_key_size.DESC;
    }

    public static MethodHandle bpf_map__set_key_size$handle() {
        return bpf_map__set_key_size.HANDLE;
    }

    public static MemorySegment bpf_map__set_key_size$address() {
        return bpf_map__set_key_size.ADDR;
    }

    public static int bpf_map__set_key_size(MemorySegment map2, int size) {
        MethodHandle mh$ = bpf_map__set_key_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_key_size", map2, size);
            }
            return mh$.invokeExact(map2, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__value_size$descriptor() {
        return bpf_map__value_size.DESC;
    }

    public static MethodHandle bpf_map__value_size$handle() {
        return bpf_map__value_size.HANDLE;
    }

    public static MemorySegment bpf_map__value_size$address() {
        return bpf_map__value_size.ADDR;
    }

    public static int bpf_map__value_size(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__value_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__value_size", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_value_size$descriptor() {
        return bpf_map__set_value_size.DESC;
    }

    public static MethodHandle bpf_map__set_value_size$handle() {
        return bpf_map__set_value_size.HANDLE;
    }

    public static MemorySegment bpf_map__set_value_size$address() {
        return bpf_map__set_value_size.ADDR;
    }

    public static int bpf_map__set_value_size(MemorySegment map2, int size) {
        MethodHandle mh$ = bpf_map__set_value_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_value_size", map2, size);
            }
            return mh$.invokeExact(map2, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__btf_key_type_id$descriptor() {
        return bpf_map__btf_key_type_id.DESC;
    }

    public static MethodHandle bpf_map__btf_key_type_id$handle() {
        return bpf_map__btf_key_type_id.HANDLE;
    }

    public static MemorySegment bpf_map__btf_key_type_id$address() {
        return bpf_map__btf_key_type_id.ADDR;
    }

    public static int bpf_map__btf_key_type_id(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__btf_key_type_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__btf_key_type_id", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__btf_value_type_id$descriptor() {
        return bpf_map__btf_value_type_id.DESC;
    }

    public static MethodHandle bpf_map__btf_value_type_id$handle() {
        return bpf_map__btf_value_type_id.HANDLE;
    }

    public static MemorySegment bpf_map__btf_value_type_id$address() {
        return bpf_map__btf_value_type_id.ADDR;
    }

    public static int bpf_map__btf_value_type_id(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__btf_value_type_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__btf_value_type_id", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__ifindex$descriptor() {
        return bpf_map__ifindex.DESC;
    }

    public static MethodHandle bpf_map__ifindex$handle() {
        return bpf_map__ifindex.HANDLE;
    }

    public static MemorySegment bpf_map__ifindex$address() {
        return bpf_map__ifindex.ADDR;
    }

    public static int bpf_map__ifindex(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__ifindex.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__ifindex", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_ifindex$descriptor() {
        return bpf_map__set_ifindex.DESC;
    }

    public static MethodHandle bpf_map__set_ifindex$handle() {
        return bpf_map__set_ifindex.HANDLE;
    }

    public static MemorySegment bpf_map__set_ifindex$address() {
        return bpf_map__set_ifindex.ADDR;
    }

    public static int bpf_map__set_ifindex(MemorySegment map2, int ifindex) {
        MethodHandle mh$ = bpf_map__set_ifindex.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_ifindex", map2, ifindex);
            }
            return mh$.invokeExact(map2, ifindex);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__map_extra$descriptor() {
        return bpf_map__map_extra.DESC;
    }

    public static MethodHandle bpf_map__map_extra$handle() {
        return bpf_map__map_extra.HANDLE;
    }

    public static MemorySegment bpf_map__map_extra$address() {
        return bpf_map__map_extra.ADDR;
    }

    public static long bpf_map__map_extra(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__map_extra.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__map_extra", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_map_extra$descriptor() {
        return bpf_map__set_map_extra.DESC;
    }

    public static MethodHandle bpf_map__set_map_extra$handle() {
        return bpf_map__set_map_extra.HANDLE;
    }

    public static MemorySegment bpf_map__set_map_extra$address() {
        return bpf_map__set_map_extra.ADDR;
    }

    public static int bpf_map__set_map_extra(MemorySegment map2, long map_extra) {
        MethodHandle mh$ = bpf_map__set_map_extra.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_map_extra", map2, map_extra);
            }
            return mh$.invokeExact(map2, map_extra);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_initial_value$descriptor() {
        return bpf_map__set_initial_value.DESC;
    }

    public static MethodHandle bpf_map__set_initial_value$handle() {
        return bpf_map__set_initial_value.HANDLE;
    }

    public static MemorySegment bpf_map__set_initial_value$address() {
        return bpf_map__set_initial_value.ADDR;
    }

    public static int bpf_map__set_initial_value(MemorySegment map2, MemorySegment data, long size) {
        MethodHandle mh$ = bpf_map__set_initial_value.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_initial_value", map2, data, size);
            }
            return mh$.invokeExact(map2, data, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__initial_value$descriptor() {
        return bpf_map__initial_value.DESC;
    }

    public static MethodHandle bpf_map__initial_value$handle() {
        return bpf_map__initial_value.HANDLE;
    }

    public static MemorySegment bpf_map__initial_value$address() {
        return bpf_map__initial_value.ADDR;
    }

    public static MemorySegment bpf_map__initial_value(MemorySegment map2, MemorySegment psize) {
        MethodHandle mh$ = bpf_map__initial_value.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__initial_value", map2, psize);
            }
            return mh$.invokeExact(map2, psize);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__is_internal$descriptor() {
        return bpf_map__is_internal.DESC;
    }

    public static MethodHandle bpf_map__is_internal$handle() {
        return bpf_map__is_internal.HANDLE;
    }

    public static MemorySegment bpf_map__is_internal$address() {
        return bpf_map__is_internal.ADDR;
    }

    public static boolean bpf_map__is_internal(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__is_internal.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__is_internal", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_pin_path$descriptor() {
        return bpf_map__set_pin_path.DESC;
    }

    public static MethodHandle bpf_map__set_pin_path$handle() {
        return bpf_map__set_pin_path.HANDLE;
    }

    public static MemorySegment bpf_map__set_pin_path$address() {
        return bpf_map__set_pin_path.ADDR;
    }

    public static int bpf_map__set_pin_path(MemorySegment map2, MemorySegment path2) {
        MethodHandle mh$ = bpf_map__set_pin_path.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_pin_path", map2, path2);
            }
            return mh$.invokeExact(map2, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__pin_path$descriptor() {
        return bpf_map__pin_path.DESC;
    }

    public static MethodHandle bpf_map__pin_path$handle() {
        return bpf_map__pin_path.HANDLE;
    }

    public static MemorySegment bpf_map__pin_path$address() {
        return bpf_map__pin_path.ADDR;
    }

    public static MemorySegment bpf_map__pin_path(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__pin_path.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__pin_path", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__is_pinned$descriptor() {
        return bpf_map__is_pinned.DESC;
    }

    public static MethodHandle bpf_map__is_pinned$handle() {
        return bpf_map__is_pinned.HANDLE;
    }

    public static MemorySegment bpf_map__is_pinned$address() {
        return bpf_map__is_pinned.ADDR;
    }

    public static boolean bpf_map__is_pinned(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__is_pinned.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__is_pinned", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__pin$descriptor() {
        return bpf_map__pin.DESC;
    }

    public static MethodHandle bpf_map__pin$handle() {
        return bpf_map__pin.HANDLE;
    }

    public static MemorySegment bpf_map__pin$address() {
        return bpf_map__pin.ADDR;
    }

    public static int bpf_map__pin(MemorySegment map2, MemorySegment path2) {
        MethodHandle mh$ = bpf_map__pin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__pin", map2, path2);
            }
            return mh$.invokeExact(map2, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__unpin$descriptor() {
        return bpf_map__unpin.DESC;
    }

    public static MethodHandle bpf_map__unpin$handle() {
        return bpf_map__unpin.HANDLE;
    }

    public static MemorySegment bpf_map__unpin$address() {
        return bpf_map__unpin.ADDR;
    }

    public static int bpf_map__unpin(MemorySegment map2, MemorySegment path2) {
        MethodHandle mh$ = bpf_map__unpin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__unpin", map2, path2);
            }
            return mh$.invokeExact(map2, path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__set_inner_map_fd$descriptor() {
        return bpf_map__set_inner_map_fd.DESC;
    }

    public static MethodHandle bpf_map__set_inner_map_fd$handle() {
        return bpf_map__set_inner_map_fd.HANDLE;
    }

    public static MemorySegment bpf_map__set_inner_map_fd$address() {
        return bpf_map__set_inner_map_fd.ADDR;
    }

    public static int bpf_map__set_inner_map_fd(MemorySegment map2, int fd2) {
        MethodHandle mh$ = bpf_map__set_inner_map_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__set_inner_map_fd", map2, fd2);
            }
            return mh$.invokeExact(map2, fd2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__inner_map$descriptor() {
        return bpf_map__inner_map.DESC;
    }

    public static MethodHandle bpf_map__inner_map$handle() {
        return bpf_map__inner_map.HANDLE;
    }

    public static MemorySegment bpf_map__inner_map$address() {
        return bpf_map__inner_map.ADDR;
    }

    public static MemorySegment bpf_map__inner_map(MemorySegment map2) {
        MethodHandle mh$ = bpf_map__inner_map.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__inner_map", map2);
            }
            return mh$.invokeExact(map2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__lookup_elem$descriptor() {
        return bpf_map__lookup_elem.DESC;
    }

    public static MethodHandle bpf_map__lookup_elem$handle() {
        return bpf_map__lookup_elem.HANDLE;
    }

    public static MemorySegment bpf_map__lookup_elem$address() {
        return bpf_map__lookup_elem.ADDR;
    }

    public static int bpf_map__lookup_elem(MemorySegment map2, MemorySegment key2, long key_sz, MemorySegment value, long value_sz, long flags) {
        MethodHandle mh$ = bpf_map__lookup_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__lookup_elem", map2, key2, key_sz, value, value_sz, flags);
            }
            return mh$.invokeExact(map2, key2, key_sz, value, value_sz, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__update_elem$descriptor() {
        return bpf_map__update_elem.DESC;
    }

    public static MethodHandle bpf_map__update_elem$handle() {
        return bpf_map__update_elem.HANDLE;
    }

    public static MemorySegment bpf_map__update_elem$address() {
        return bpf_map__update_elem.ADDR;
    }

    public static int bpf_map__update_elem(MemorySegment map2, MemorySegment key2, long key_sz, MemorySegment value, long value_sz, long flags) {
        MethodHandle mh$ = bpf_map__update_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__update_elem", map2, key2, key_sz, value, value_sz, flags);
            }
            return mh$.invokeExact(map2, key2, key_sz, value, value_sz, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__delete_elem$descriptor() {
        return bpf_map__delete_elem.DESC;
    }

    public static MethodHandle bpf_map__delete_elem$handle() {
        return bpf_map__delete_elem.HANDLE;
    }

    public static MemorySegment bpf_map__delete_elem$address() {
        return bpf_map__delete_elem.ADDR;
    }

    public static int bpf_map__delete_elem(MemorySegment map2, MemorySegment key2, long key_sz, long flags) {
        MethodHandle mh$ = bpf_map__delete_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__delete_elem", map2, key2, key_sz, flags);
            }
            return mh$.invokeExact(map2, key2, key_sz, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__lookup_and_delete_elem$descriptor() {
        return bpf_map__lookup_and_delete_elem.DESC;
    }

    public static MethodHandle bpf_map__lookup_and_delete_elem$handle() {
        return bpf_map__lookup_and_delete_elem.HANDLE;
    }

    public static MemorySegment bpf_map__lookup_and_delete_elem$address() {
        return bpf_map__lookup_and_delete_elem.ADDR;
    }

    public static int bpf_map__lookup_and_delete_elem(MemorySegment map2, MemorySegment key2, long key_sz, MemorySegment value, long value_sz, long flags) {
        MethodHandle mh$ = bpf_map__lookup_and_delete_elem.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__lookup_and_delete_elem", map2, key2, key_sz, value, value_sz, flags);
            }
            return mh$.invokeExact(map2, key2, key_sz, value, value_sz, flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_map__get_next_key$descriptor() {
        return bpf_map__get_next_key.DESC;
    }

    public static MethodHandle bpf_map__get_next_key$handle() {
        return bpf_map__get_next_key.HANDLE;
    }

    public static MemorySegment bpf_map__get_next_key$address() {
        return bpf_map__get_next_key.ADDR;
    }

    public static int bpf_map__get_next_key(MemorySegment map2, MemorySegment cur_key, MemorySegment next_key, long key_sz) {
        MethodHandle mh$ = bpf_map__get_next_key.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_map__get_next_key", map2, cur_key, next_key, key_sz);
            }
            return mh$.invokeExact(map2, cur_key, next_key, key_sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_xdp_attach$descriptor() {
        return bpf_xdp_attach.DESC;
    }

    public static MethodHandle bpf_xdp_attach$handle() {
        return bpf_xdp_attach.HANDLE;
    }

    public static MemorySegment bpf_xdp_attach$address() {
        return bpf_xdp_attach.ADDR;
    }

    public static int bpf_xdp_attach(int ifindex, int prog_fd, int flags, MemorySegment opts) {
        MethodHandle mh$ = bpf_xdp_attach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_xdp_attach", ifindex, prog_fd, flags, opts);
            }
            return mh$.invokeExact(ifindex, prog_fd, flags, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_xdp_detach$descriptor() {
        return bpf_xdp_detach.DESC;
    }

    public static MethodHandle bpf_xdp_detach$handle() {
        return bpf_xdp_detach.HANDLE;
    }

    public static MemorySegment bpf_xdp_detach$address() {
        return bpf_xdp_detach.ADDR;
    }

    public static int bpf_xdp_detach(int ifindex, int flags, MemorySegment opts) {
        MethodHandle mh$ = bpf_xdp_detach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_xdp_detach", ifindex, flags, opts);
            }
            return mh$.invokeExact(ifindex, flags, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_xdp_query$descriptor() {
        return bpf_xdp_query.DESC;
    }

    public static MethodHandle bpf_xdp_query$handle() {
        return bpf_xdp_query.HANDLE;
    }

    public static MemorySegment bpf_xdp_query$address() {
        return bpf_xdp_query.ADDR;
    }

    public static int bpf_xdp_query(int ifindex, int flags, MemorySegment opts) {
        MethodHandle mh$ = bpf_xdp_query.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_xdp_query", ifindex, flags, opts);
            }
            return mh$.invokeExact(ifindex, flags, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_xdp_query_id$descriptor() {
        return bpf_xdp_query_id.DESC;
    }

    public static MethodHandle bpf_xdp_query_id$handle() {
        return bpf_xdp_query_id.HANDLE;
    }

    public static MemorySegment bpf_xdp_query_id$address() {
        return bpf_xdp_query_id.ADDR;
    }

    public static int bpf_xdp_query_id(int ifindex, int flags, MemorySegment prog_id) {
        MethodHandle mh$ = bpf_xdp_query_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_xdp_query_id", ifindex, flags, prog_id);
            }
            return mh$.invokeExact(ifindex, flags, prog_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int BPF_TC_INGRESS() {
        return 1;
    }

    public static int BPF_TC_EGRESS() {
        return 2;
    }

    public static int BPF_TC_CUSTOM() {
        return 4;
    }

    public static int BPF_TC_F_REPLACE() {
        return 1;
    }

    public static FunctionDescriptor bpf_tc_hook_create$descriptor() {
        return bpf_tc_hook_create.DESC;
    }

    public static MethodHandle bpf_tc_hook_create$handle() {
        return bpf_tc_hook_create.HANDLE;
    }

    public static MemorySegment bpf_tc_hook_create$address() {
        return bpf_tc_hook_create.ADDR;
    }

    public static int bpf_tc_hook_create(MemorySegment hook) {
        MethodHandle mh$ = bpf_tc_hook_create.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_tc_hook_create", hook);
            }
            return mh$.invokeExact(hook);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_tc_hook_destroy$descriptor() {
        return bpf_tc_hook_destroy.DESC;
    }

    public static MethodHandle bpf_tc_hook_destroy$handle() {
        return bpf_tc_hook_destroy.HANDLE;
    }

    public static MemorySegment bpf_tc_hook_destroy$address() {
        return bpf_tc_hook_destroy.ADDR;
    }

    public static int bpf_tc_hook_destroy(MemorySegment hook) {
        MethodHandle mh$ = bpf_tc_hook_destroy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_tc_hook_destroy", hook);
            }
            return mh$.invokeExact(hook);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_tc_attach$descriptor() {
        return bpf_tc_attach.DESC;
    }

    public static MethodHandle bpf_tc_attach$handle() {
        return bpf_tc_attach.HANDLE;
    }

    public static MemorySegment bpf_tc_attach$address() {
        return bpf_tc_attach.ADDR;
    }

    public static int bpf_tc_attach(MemorySegment hook, MemorySegment opts) {
        MethodHandle mh$ = bpf_tc_attach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_tc_attach", hook, opts);
            }
            return mh$.invokeExact(hook, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_tc_detach$descriptor() {
        return bpf_tc_detach.DESC;
    }

    public static MethodHandle bpf_tc_detach$handle() {
        return bpf_tc_detach.HANDLE;
    }

    public static MemorySegment bpf_tc_detach$address() {
        return bpf_tc_detach.ADDR;
    }

    public static int bpf_tc_detach(MemorySegment hook, MemorySegment opts) {
        MethodHandle mh$ = bpf_tc_detach.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_tc_detach", hook, opts);
            }
            return mh$.invokeExact(hook, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_tc_query$descriptor() {
        return bpf_tc_query.DESC;
    }

    public static MethodHandle bpf_tc_query$handle() {
        return bpf_tc_query.HANDLE;
    }

    public static MemorySegment bpf_tc_query$address() {
        return bpf_tc_query.ADDR;
    }

    public static int bpf_tc_query(MemorySegment hook, MemorySegment opts) {
        MethodHandle mh$ = bpf_tc_query.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_tc_query", hook, opts);
            }
            return mh$.invokeExact(hook, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__new$descriptor() {
        return ring_buffer__new.DESC;
    }

    public static MethodHandle ring_buffer__new$handle() {
        return ring_buffer__new.HANDLE;
    }

    public static MemorySegment ring_buffer__new$address() {
        return ring_buffer__new.ADDR;
    }

    public static MemorySegment ring_buffer__new(int map_fd, MemorySegment sample_cb, MemorySegment ctx, MemorySegment opts) {
        MethodHandle mh$ = ring_buffer__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__new", map_fd, sample_cb, ctx, opts);
            }
            return mh$.invokeExact(map_fd, sample_cb, ctx, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__free$descriptor() {
        return ring_buffer__free.DESC;
    }

    public static MethodHandle ring_buffer__free$handle() {
        return ring_buffer__free.HANDLE;
    }

    public static MemorySegment ring_buffer__free$address() {
        return ring_buffer__free.ADDR;
    }

    public static void ring_buffer__free(MemorySegment rb) {
        MethodHandle mh$ = ring_buffer__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__free", rb);
            }
            mh$.invokeExact(rb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__add$descriptor() {
        return ring_buffer__add.DESC;
    }

    public static MethodHandle ring_buffer__add$handle() {
        return ring_buffer__add.HANDLE;
    }

    public static MemorySegment ring_buffer__add$address() {
        return ring_buffer__add.ADDR;
    }

    public static int ring_buffer__add(MemorySegment rb, int map_fd, MemorySegment sample_cb, MemorySegment ctx) {
        MethodHandle mh$ = ring_buffer__add.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__add", rb, map_fd, sample_cb, ctx);
            }
            return mh$.invokeExact(rb, map_fd, sample_cb, ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__poll$descriptor() {
        return ring_buffer__poll.DESC;
    }

    public static MethodHandle ring_buffer__poll$handle() {
        return ring_buffer__poll.HANDLE;
    }

    public static MemorySegment ring_buffer__poll$address() {
        return ring_buffer__poll.ADDR;
    }

    public static int ring_buffer__poll(MemorySegment rb, int timeout_ms) {
        MethodHandle mh$ = ring_buffer__poll.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__poll", rb, timeout_ms);
            }
            return mh$.invokeExact(rb, timeout_ms);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__consume$descriptor() {
        return ring_buffer__consume.DESC;
    }

    public static MethodHandle ring_buffer__consume$handle() {
        return ring_buffer__consume.HANDLE;
    }

    public static MemorySegment ring_buffer__consume$address() {
        return ring_buffer__consume.ADDR;
    }

    public static int ring_buffer__consume(MemorySegment rb) {
        MethodHandle mh$ = ring_buffer__consume.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__consume", rb);
            }
            return mh$.invokeExact(rb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__consume_n$descriptor() {
        return ring_buffer__consume_n.DESC;
    }

    public static MethodHandle ring_buffer__consume_n$handle() {
        return ring_buffer__consume_n.HANDLE;
    }

    public static MemorySegment ring_buffer__consume_n$address() {
        return ring_buffer__consume_n.ADDR;
    }

    public static int ring_buffer__consume_n(MemorySegment rb, long n) {
        MethodHandle mh$ = ring_buffer__consume_n.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__consume_n", rb, n);
            }
            return mh$.invokeExact(rb, n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__epoll_fd$descriptor() {
        return ring_buffer__epoll_fd.DESC;
    }

    public static MethodHandle ring_buffer__epoll_fd$handle() {
        return ring_buffer__epoll_fd.HANDLE;
    }

    public static MemorySegment ring_buffer__epoll_fd$address() {
        return ring_buffer__epoll_fd.ADDR;
    }

    public static int ring_buffer__epoll_fd(MemorySegment rb) {
        MethodHandle mh$ = ring_buffer__epoll_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__epoll_fd", rb);
            }
            return mh$.invokeExact(rb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring_buffer__ring$descriptor() {
        return ring_buffer__ring.DESC;
    }

    public static MethodHandle ring_buffer__ring$handle() {
        return ring_buffer__ring.HANDLE;
    }

    public static MemorySegment ring_buffer__ring$address() {
        return ring_buffer__ring.ADDR;
    }

    public static MemorySegment ring_buffer__ring(MemorySegment rb, int idx) {
        MethodHandle mh$ = ring_buffer__ring.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring_buffer__ring", rb, idx);
            }
            return mh$.invokeExact(rb, idx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__consumer_pos$descriptor() {
        return ring__consumer_pos.DESC;
    }

    public static MethodHandle ring__consumer_pos$handle() {
        return ring__consumer_pos.HANDLE;
    }

    public static MemorySegment ring__consumer_pos$address() {
        return ring__consumer_pos.ADDR;
    }

    public static long ring__consumer_pos(MemorySegment r) {
        MethodHandle mh$ = ring__consumer_pos.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__consumer_pos", r);
            }
            return mh$.invokeExact(r);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__producer_pos$descriptor() {
        return ring__producer_pos.DESC;
    }

    public static MethodHandle ring__producer_pos$handle() {
        return ring__producer_pos.HANDLE;
    }

    public static MemorySegment ring__producer_pos$address() {
        return ring__producer_pos.ADDR;
    }

    public static long ring__producer_pos(MemorySegment r) {
        MethodHandle mh$ = ring__producer_pos.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__producer_pos", r);
            }
            return mh$.invokeExact(r);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__avail_data_size$descriptor() {
        return ring__avail_data_size.DESC;
    }

    public static MethodHandle ring__avail_data_size$handle() {
        return ring__avail_data_size.HANDLE;
    }

    public static MemorySegment ring__avail_data_size$address() {
        return ring__avail_data_size.ADDR;
    }

    public static long ring__avail_data_size(MemorySegment r) {
        MethodHandle mh$ = ring__avail_data_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__avail_data_size", r);
            }
            return mh$.invokeExact(r);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__size$descriptor() {
        return ring__size.DESC;
    }

    public static MethodHandle ring__size$handle() {
        return ring__size.HANDLE;
    }

    public static MemorySegment ring__size$address() {
        return ring__size.ADDR;
    }

    public static long ring__size(MemorySegment r) {
        MethodHandle mh$ = ring__size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__size", r);
            }
            return mh$.invokeExact(r);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__map_fd$descriptor() {
        return ring__map_fd.DESC;
    }

    public static MethodHandle ring__map_fd$handle() {
        return ring__map_fd.HANDLE;
    }

    public static MemorySegment ring__map_fd$address() {
        return ring__map_fd.ADDR;
    }

    public static int ring__map_fd(MemorySegment r) {
        MethodHandle mh$ = ring__map_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__map_fd", r);
            }
            return mh$.invokeExact(r);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__consume$descriptor() {
        return ring__consume.DESC;
    }

    public static MethodHandle ring__consume$handle() {
        return ring__consume.HANDLE;
    }

    public static MemorySegment ring__consume$address() {
        return ring__consume.ADDR;
    }

    public static int ring__consume(MemorySegment r) {
        MethodHandle mh$ = ring__consume.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__consume", r);
            }
            return mh$.invokeExact(r);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ring__consume_n$descriptor() {
        return ring__consume_n.DESC;
    }

    public static MethodHandle ring__consume_n$handle() {
        return ring__consume_n.HANDLE;
    }

    public static MemorySegment ring__consume_n$address() {
        return ring__consume_n.ADDR;
    }

    public static int ring__consume_n(MemorySegment r, long n) {
        MethodHandle mh$ = ring__consume_n.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("ring__consume_n", r, n);
            }
            return mh$.invokeExact(r, n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor user_ring_buffer__new$descriptor() {
        return user_ring_buffer__new.DESC;
    }

    public static MethodHandle user_ring_buffer__new$handle() {
        return user_ring_buffer__new.HANDLE;
    }

    public static MemorySegment user_ring_buffer__new$address() {
        return user_ring_buffer__new.ADDR;
    }

    public static MemorySegment user_ring_buffer__new(int map_fd, MemorySegment opts) {
        MethodHandle mh$ = user_ring_buffer__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("user_ring_buffer__new", map_fd, opts);
            }
            return mh$.invokeExact(map_fd, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor user_ring_buffer__reserve$descriptor() {
        return user_ring_buffer__reserve.DESC;
    }

    public static MethodHandle user_ring_buffer__reserve$handle() {
        return user_ring_buffer__reserve.HANDLE;
    }

    public static MemorySegment user_ring_buffer__reserve$address() {
        return user_ring_buffer__reserve.ADDR;
    }

    public static MemorySegment user_ring_buffer__reserve(MemorySegment rb, int size) {
        MethodHandle mh$ = user_ring_buffer__reserve.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("user_ring_buffer__reserve", rb, size);
            }
            return mh$.invokeExact(rb, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor user_ring_buffer__reserve_blocking$descriptor() {
        return user_ring_buffer__reserve_blocking.DESC;
    }

    public static MethodHandle user_ring_buffer__reserve_blocking$handle() {
        return user_ring_buffer__reserve_blocking.HANDLE;
    }

    public static MemorySegment user_ring_buffer__reserve_blocking$address() {
        return user_ring_buffer__reserve_blocking.ADDR;
    }

    public static MemorySegment user_ring_buffer__reserve_blocking(MemorySegment rb, int size, int timeout_ms) {
        MethodHandle mh$ = user_ring_buffer__reserve_blocking.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("user_ring_buffer__reserve_blocking", rb, size, timeout_ms);
            }
            return mh$.invokeExact(rb, size, timeout_ms);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor user_ring_buffer__submit$descriptor() {
        return user_ring_buffer__submit.DESC;
    }

    public static MethodHandle user_ring_buffer__submit$handle() {
        return user_ring_buffer__submit.HANDLE;
    }

    public static MemorySegment user_ring_buffer__submit$address() {
        return user_ring_buffer__submit.ADDR;
    }

    public static void user_ring_buffer__submit(MemorySegment rb, MemorySegment sample2) {
        MethodHandle mh$ = user_ring_buffer__submit.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("user_ring_buffer__submit", rb, sample2);
            }
            mh$.invokeExact(rb, sample2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor user_ring_buffer__discard$descriptor() {
        return user_ring_buffer__discard.DESC;
    }

    public static MethodHandle user_ring_buffer__discard$handle() {
        return user_ring_buffer__discard.HANDLE;
    }

    public static MemorySegment user_ring_buffer__discard$address() {
        return user_ring_buffer__discard.ADDR;
    }

    public static void user_ring_buffer__discard(MemorySegment rb, MemorySegment sample2) {
        MethodHandle mh$ = user_ring_buffer__discard.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("user_ring_buffer__discard", rb, sample2);
            }
            mh$.invokeExact(rb, sample2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor user_ring_buffer__free$descriptor() {
        return user_ring_buffer__free.DESC;
    }

    public static MethodHandle user_ring_buffer__free$handle() {
        return user_ring_buffer__free.HANDLE;
    }

    public static MemorySegment user_ring_buffer__free$address() {
        return user_ring_buffer__free.ADDR;
    }

    public static void user_ring_buffer__free(MemorySegment rb) {
        MethodHandle mh$ = user_ring_buffer__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("user_ring_buffer__free", rb);
            }
            mh$.invokeExact(rb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__new$descriptor() {
        return perf_buffer__new.DESC;
    }

    public static MethodHandle perf_buffer__new$handle() {
        return perf_buffer__new.HANDLE;
    }

    public static MemorySegment perf_buffer__new$address() {
        return perf_buffer__new.ADDR;
    }

    public static MemorySegment perf_buffer__new(int map_fd, long page_cnt, MemorySegment sample_cb, MemorySegment lost_cb, MemorySegment ctx, MemorySegment opts) {
        MethodHandle mh$ = perf_buffer__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__new", map_fd, page_cnt, sample_cb, lost_cb, ctx, opts);
            }
            return mh$.invokeExact(map_fd, page_cnt, sample_cb, lost_cb, ctx, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int LIBBPF_PERF_EVENT_DONE() {
        return 0;
    }

    public static int LIBBPF_PERF_EVENT_ERROR() {
        return -1;
    }

    public static int LIBBPF_PERF_EVENT_CONT() {
        return -2;
    }

    public static FunctionDescriptor perf_buffer__new_raw$descriptor() {
        return perf_buffer__new_raw.DESC;
    }

    public static MethodHandle perf_buffer__new_raw$handle() {
        return perf_buffer__new_raw.HANDLE;
    }

    public static MemorySegment perf_buffer__new_raw$address() {
        return perf_buffer__new_raw.ADDR;
    }

    public static MemorySegment perf_buffer__new_raw(int map_fd, long page_cnt, MemorySegment attr2, MemorySegment event_cb, MemorySegment ctx, MemorySegment opts) {
        MethodHandle mh$ = perf_buffer__new_raw.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__new_raw", map_fd, page_cnt, attr2, event_cb, ctx, opts);
            }
            return mh$.invokeExact(map_fd, page_cnt, attr2, event_cb, ctx, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__free$descriptor() {
        return perf_buffer__free.DESC;
    }

    public static MethodHandle perf_buffer__free$handle() {
        return perf_buffer__free.HANDLE;
    }

    public static MemorySegment perf_buffer__free$address() {
        return perf_buffer__free.ADDR;
    }

    public static void perf_buffer__free(MemorySegment pb) {
        MethodHandle mh$ = perf_buffer__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__free", pb);
            }
            mh$.invokeExact(pb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__epoll_fd$descriptor() {
        return perf_buffer__epoll_fd.DESC;
    }

    public static MethodHandle perf_buffer__epoll_fd$handle() {
        return perf_buffer__epoll_fd.HANDLE;
    }

    public static MemorySegment perf_buffer__epoll_fd$address() {
        return perf_buffer__epoll_fd.ADDR;
    }

    public static int perf_buffer__epoll_fd(MemorySegment pb) {
        MethodHandle mh$ = perf_buffer__epoll_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__epoll_fd", pb);
            }
            return mh$.invokeExact(pb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__poll$descriptor() {
        return perf_buffer__poll.DESC;
    }

    public static MethodHandle perf_buffer__poll$handle() {
        return perf_buffer__poll.HANDLE;
    }

    public static MemorySegment perf_buffer__poll$address() {
        return perf_buffer__poll.ADDR;
    }

    public static int perf_buffer__poll(MemorySegment pb, int timeout_ms) {
        MethodHandle mh$ = perf_buffer__poll.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__poll", pb, timeout_ms);
            }
            return mh$.invokeExact(pb, timeout_ms);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__consume$descriptor() {
        return perf_buffer__consume.DESC;
    }

    public static MethodHandle perf_buffer__consume$handle() {
        return perf_buffer__consume.HANDLE;
    }

    public static MemorySegment perf_buffer__consume$address() {
        return perf_buffer__consume.ADDR;
    }

    public static int perf_buffer__consume(MemorySegment pb) {
        MethodHandle mh$ = perf_buffer__consume.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__consume", pb);
            }
            return mh$.invokeExact(pb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__consume_buffer$descriptor() {
        return perf_buffer__consume_buffer.DESC;
    }

    public static MethodHandle perf_buffer__consume_buffer$handle() {
        return perf_buffer__consume_buffer.HANDLE;
    }

    public static MemorySegment perf_buffer__consume_buffer$address() {
        return perf_buffer__consume_buffer.ADDR;
    }

    public static int perf_buffer__consume_buffer(MemorySegment pb, long buf_idx) {
        MethodHandle mh$ = perf_buffer__consume_buffer.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__consume_buffer", pb, buf_idx);
            }
            return mh$.invokeExact(pb, buf_idx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__buffer_cnt$descriptor() {
        return perf_buffer__buffer_cnt.DESC;
    }

    public static MethodHandle perf_buffer__buffer_cnt$handle() {
        return perf_buffer__buffer_cnt.HANDLE;
    }

    public static MemorySegment perf_buffer__buffer_cnt$address() {
        return perf_buffer__buffer_cnt.ADDR;
    }

    public static long perf_buffer__buffer_cnt(MemorySegment pb) {
        MethodHandle mh$ = perf_buffer__buffer_cnt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__buffer_cnt", pb);
            }
            return mh$.invokeExact(pb);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__buffer_fd$descriptor() {
        return perf_buffer__buffer_fd.DESC;
    }

    public static MethodHandle perf_buffer__buffer_fd$handle() {
        return perf_buffer__buffer_fd.HANDLE;
    }

    public static MemorySegment perf_buffer__buffer_fd$address() {
        return perf_buffer__buffer_fd.ADDR;
    }

    public static int perf_buffer__buffer_fd(MemorySegment pb, long buf_idx) {
        MethodHandle mh$ = perf_buffer__buffer_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__buffer_fd", pb, buf_idx);
            }
            return mh$.invokeExact(pb, buf_idx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor perf_buffer__buffer$descriptor() {
        return perf_buffer__buffer.DESC;
    }

    public static MethodHandle perf_buffer__buffer$handle() {
        return perf_buffer__buffer.HANDLE;
    }

    public static MemorySegment perf_buffer__buffer$address() {
        return perf_buffer__buffer.ADDR;
    }

    public static int perf_buffer__buffer(MemorySegment pb, int buf_idx, MemorySegment buf, MemorySegment buf_size) {
        MethodHandle mh$ = perf_buffer__buffer.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("perf_buffer__buffer", pb, buf_idx, buf, buf_size);
            }
            return mh$.invokeExact(pb, buf_idx, buf, buf_size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_linfo__free$descriptor() {
        return bpf_prog_linfo__free.DESC;
    }

    public static MethodHandle bpf_prog_linfo__free$handle() {
        return bpf_prog_linfo__free.HANDLE;
    }

    public static MemorySegment bpf_prog_linfo__free$address() {
        return bpf_prog_linfo__free.ADDR;
    }

    public static void bpf_prog_linfo__free(MemorySegment prog_linfo) {
        MethodHandle mh$ = bpf_prog_linfo__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_linfo__free", prog_linfo);
            }
            mh$.invokeExact(prog_linfo);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_linfo__new$descriptor() {
        return bpf_prog_linfo__new.DESC;
    }

    public static MethodHandle bpf_prog_linfo__new$handle() {
        return bpf_prog_linfo__new.HANDLE;
    }

    public static MemorySegment bpf_prog_linfo__new$address() {
        return bpf_prog_linfo__new.ADDR;
    }

    public static MemorySegment bpf_prog_linfo__new(MemorySegment info2) {
        MethodHandle mh$ = bpf_prog_linfo__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_linfo__new", info2);
            }
            return mh$.invokeExact(info2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_linfo__lfind_addr_func$descriptor() {
        return bpf_prog_linfo__lfind_addr_func.DESC;
    }

    public static MethodHandle bpf_prog_linfo__lfind_addr_func$handle() {
        return bpf_prog_linfo__lfind_addr_func.HANDLE;
    }

    public static MemorySegment bpf_prog_linfo__lfind_addr_func$address() {
        return bpf_prog_linfo__lfind_addr_func.ADDR;
    }

    public static MemorySegment bpf_prog_linfo__lfind_addr_func(MemorySegment prog_linfo, long addr2, int func_idx, int nr_skip) {
        MethodHandle mh$ = bpf_prog_linfo__lfind_addr_func.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_linfo__lfind_addr_func", prog_linfo, addr2, func_idx, nr_skip);
            }
            return mh$.invokeExact(prog_linfo, addr2, func_idx, nr_skip);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_prog_linfo__lfind$descriptor() {
        return bpf_prog_linfo__lfind.DESC;
    }

    public static MethodHandle bpf_prog_linfo__lfind$handle() {
        return bpf_prog_linfo__lfind.HANDLE;
    }

    public static MemorySegment bpf_prog_linfo__lfind$address() {
        return bpf_prog_linfo__lfind.ADDR;
    }

    public static MemorySegment bpf_prog_linfo__lfind(MemorySegment prog_linfo, int insn_off, int nr_skip) {
        MethodHandle mh$ = bpf_prog_linfo__lfind.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_prog_linfo__lfind", prog_linfo, insn_off, nr_skip);
            }
            return mh$.invokeExact(prog_linfo, insn_off, nr_skip);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_probe_bpf_prog_type$descriptor() {
        return libbpf_probe_bpf_prog_type.DESC;
    }

    public static MethodHandle libbpf_probe_bpf_prog_type$handle() {
        return libbpf_probe_bpf_prog_type.HANDLE;
    }

    public static MemorySegment libbpf_probe_bpf_prog_type$address() {
        return libbpf_probe_bpf_prog_type.ADDR;
    }

    public static int libbpf_probe_bpf_prog_type(int prog_type, MemorySegment opts) {
        MethodHandle mh$ = libbpf_probe_bpf_prog_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_probe_bpf_prog_type", prog_type, opts);
            }
            return mh$.invokeExact(prog_type, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_probe_bpf_map_type$descriptor() {
        return libbpf_probe_bpf_map_type.DESC;
    }

    public static MethodHandle libbpf_probe_bpf_map_type$handle() {
        return libbpf_probe_bpf_map_type.HANDLE;
    }

    public static MemorySegment libbpf_probe_bpf_map_type$address() {
        return libbpf_probe_bpf_map_type.ADDR;
    }

    public static int libbpf_probe_bpf_map_type(int map_type2, MemorySegment opts) {
        MethodHandle mh$ = libbpf_probe_bpf_map_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_probe_bpf_map_type", map_type2, opts);
            }
            return mh$.invokeExact(map_type2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_probe_bpf_helper$descriptor() {
        return libbpf_probe_bpf_helper.DESC;
    }

    public static MethodHandle libbpf_probe_bpf_helper$handle() {
        return libbpf_probe_bpf_helper.HANDLE;
    }

    public static MemorySegment libbpf_probe_bpf_helper$address() {
        return libbpf_probe_bpf_helper.ADDR;
    }

    public static int libbpf_probe_bpf_helper(int prog_type, int helper_id, MemorySegment opts) {
        MethodHandle mh$ = libbpf_probe_bpf_helper.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_probe_bpf_helper", prog_type, helper_id, opts);
            }
            return mh$.invokeExact(prog_type, helper_id, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_num_possible_cpus$descriptor() {
        return libbpf_num_possible_cpus.DESC;
    }

    public static MethodHandle libbpf_num_possible_cpus$handle() {
        return libbpf_num_possible_cpus.HANDLE;
    }

    public static MemorySegment libbpf_num_possible_cpus$address() {
        return libbpf_num_possible_cpus.ADDR;
    }

    public static int libbpf_num_possible_cpus() {
        MethodHandle mh$ = libbpf_num_possible_cpus.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_num_possible_cpus", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__open_skeleton$descriptor() {
        return bpf_object__open_skeleton.DESC;
    }

    public static MethodHandle bpf_object__open_skeleton$handle() {
        return bpf_object__open_skeleton.HANDLE;
    }

    public static MemorySegment bpf_object__open_skeleton$address() {
        return bpf_object__open_skeleton.ADDR;
    }

    public static int bpf_object__open_skeleton(MemorySegment s2, MemorySegment opts) {
        MethodHandle mh$ = bpf_object__open_skeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__open_skeleton", s2, opts);
            }
            return mh$.invokeExact(s2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__load_skeleton$descriptor() {
        return bpf_object__load_skeleton.DESC;
    }

    public static MethodHandle bpf_object__load_skeleton$handle() {
        return bpf_object__load_skeleton.HANDLE;
    }

    public static MemorySegment bpf_object__load_skeleton$address() {
        return bpf_object__load_skeleton.ADDR;
    }

    public static int bpf_object__load_skeleton(MemorySegment s2) {
        MethodHandle mh$ = bpf_object__load_skeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__load_skeleton", s2);
            }
            return mh$.invokeExact(s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__attach_skeleton$descriptor() {
        return bpf_object__attach_skeleton.DESC;
    }

    public static MethodHandle bpf_object__attach_skeleton$handle() {
        return bpf_object__attach_skeleton.HANDLE;
    }

    public static MemorySegment bpf_object__attach_skeleton$address() {
        return bpf_object__attach_skeleton.ADDR;
    }

    public static int bpf_object__attach_skeleton(MemorySegment s2) {
        MethodHandle mh$ = bpf_object__attach_skeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__attach_skeleton", s2);
            }
            return mh$.invokeExact(s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__detach_skeleton$descriptor() {
        return bpf_object__detach_skeleton.DESC;
    }

    public static MethodHandle bpf_object__detach_skeleton$handle() {
        return bpf_object__detach_skeleton.HANDLE;
    }

    public static MemorySegment bpf_object__detach_skeleton$address() {
        return bpf_object__detach_skeleton.ADDR;
    }

    public static void bpf_object__detach_skeleton(MemorySegment s2) {
        MethodHandle mh$ = bpf_object__detach_skeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__detach_skeleton", s2);
            }
            mh$.invokeExact(s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__destroy_skeleton$descriptor() {
        return bpf_object__destroy_skeleton.DESC;
    }

    public static MethodHandle bpf_object__destroy_skeleton$handle() {
        return bpf_object__destroy_skeleton.HANDLE;
    }

    public static MemorySegment bpf_object__destroy_skeleton$address() {
        return bpf_object__destroy_skeleton.ADDR;
    }

    public static void bpf_object__destroy_skeleton(MemorySegment s2) {
        MethodHandle mh$ = bpf_object__destroy_skeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__destroy_skeleton", s2);
            }
            mh$.invokeExact(s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__open_subskeleton$descriptor() {
        return bpf_object__open_subskeleton.DESC;
    }

    public static MethodHandle bpf_object__open_subskeleton$handle() {
        return bpf_object__open_subskeleton.HANDLE;
    }

    public static MemorySegment bpf_object__open_subskeleton$address() {
        return bpf_object__open_subskeleton.ADDR;
    }

    public static int bpf_object__open_subskeleton(MemorySegment s2) {
        MethodHandle mh$ = bpf_object__open_subskeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__open_subskeleton", s2);
            }
            return mh$.invokeExact(s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__destroy_subskeleton$descriptor() {
        return bpf_object__destroy_subskeleton.DESC;
    }

    public static MethodHandle bpf_object__destroy_subskeleton$handle() {
        return bpf_object__destroy_subskeleton.HANDLE;
    }

    public static MemorySegment bpf_object__destroy_subskeleton$address() {
        return bpf_object__destroy_subskeleton.ADDR;
    }

    public static void bpf_object__destroy_subskeleton(MemorySegment s2) {
        MethodHandle mh$ = bpf_object__destroy_subskeleton.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__destroy_subskeleton", s2);
            }
            mh$.invokeExact(s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_object__gen_loader$descriptor() {
        return bpf_object__gen_loader.DESC;
    }

    public static MethodHandle bpf_object__gen_loader$handle() {
        return bpf_object__gen_loader.HANDLE;
    }

    public static MemorySegment bpf_object__gen_loader$address() {
        return bpf_object__gen_loader.ADDR;
    }

    public static int bpf_object__gen_loader(MemorySegment obj, MemorySegment opts) {
        MethodHandle mh$ = bpf_object__gen_loader.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_object__gen_loader", obj, opts);
            }
            return mh$.invokeExact(obj, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int TRI_NO() {
        return 0;
    }

    public static int TRI_YES() {
        return 1;
    }

    public static int TRI_MODULE() {
        return 2;
    }

    public static FunctionDescriptor bpf_linker__new$descriptor() {
        return bpf_linker__new.DESC;
    }

    public static MethodHandle bpf_linker__new$handle() {
        return bpf_linker__new.HANDLE;
    }

    public static MemorySegment bpf_linker__new$address() {
        return bpf_linker__new.ADDR;
    }

    public static MemorySegment bpf_linker__new(MemorySegment filename2, MemorySegment opts) {
        MethodHandle mh$ = bpf_linker__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_linker__new", filename2, opts);
            }
            return mh$.invokeExact(filename2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_linker__add_file$descriptor() {
        return bpf_linker__add_file.DESC;
    }

    public static MethodHandle bpf_linker__add_file$handle() {
        return bpf_linker__add_file.HANDLE;
    }

    public static MemorySegment bpf_linker__add_file$address() {
        return bpf_linker__add_file.ADDR;
    }

    public static int bpf_linker__add_file(MemorySegment linker, MemorySegment filename2, MemorySegment opts) {
        MethodHandle mh$ = bpf_linker__add_file.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_linker__add_file", linker, filename2, opts);
            }
            return mh$.invokeExact(linker, filename2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_linker__finalize$descriptor() {
        return bpf_linker__finalize.DESC;
    }

    public static MethodHandle bpf_linker__finalize$handle() {
        return bpf_linker__finalize.HANDLE;
    }

    public static MemorySegment bpf_linker__finalize$address() {
        return bpf_linker__finalize.ADDR;
    }

    public static int bpf_linker__finalize(MemorySegment linker) {
        MethodHandle mh$ = bpf_linker__finalize.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_linker__finalize", linker);
            }
            return mh$.invokeExact(linker);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bpf_linker__free$descriptor() {
        return bpf_linker__free.DESC;
    }

    public static MethodHandle bpf_linker__free$handle() {
        return bpf_linker__free.HANDLE;
    }

    public static MemorySegment bpf_linker__free$address() {
        return bpf_linker__free.ADDR;
    }

    public static void bpf_linker__free(MemorySegment linker) {
        MethodHandle mh$ = bpf_linker__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("bpf_linker__free", linker);
            }
            mh$.invokeExact(linker);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_register_prog_handler$descriptor() {
        return libbpf_register_prog_handler.DESC;
    }

    public static MethodHandle libbpf_register_prog_handler$handle() {
        return libbpf_register_prog_handler.HANDLE;
    }

    public static MemorySegment libbpf_register_prog_handler$address() {
        return libbpf_register_prog_handler.ADDR;
    }

    public static int libbpf_register_prog_handler(MemorySegment sec, int prog_type, int exp_attach_type, MemorySegment opts) {
        MethodHandle mh$ = libbpf_register_prog_handler.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_register_prog_handler", sec, prog_type, exp_attach_type, opts);
            }
            return mh$.invokeExact(sec, prog_type, exp_attach_type, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor libbpf_unregister_prog_handler$descriptor() {
        return libbpf_unregister_prog_handler.DESC;
    }

    public static MethodHandle libbpf_unregister_prog_handler$handle() {
        return libbpf_unregister_prog_handler.HANDLE;
    }

    public static MemorySegment libbpf_unregister_prog_handler$address() {
        return libbpf_unregister_prog_handler.ADDR;
    }

    public static int libbpf_unregister_prog_handler(int handler_id2) {
        MethodHandle mh$ = libbpf_unregister_prog_handler.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("libbpf_unregister_prog_handler", handler_id2);
            }
            return mh$.invokeExact(handler_id2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int BTF_KIND_UNKN() {
        return 0;
    }

    public static int BTF_KIND_INT() {
        return 1;
    }

    public static int BTF_KIND_PTR() {
        return 2;
    }

    public static int BTF_KIND_ARRAY() {
        return 3;
    }

    public static int BTF_KIND_STRUCT() {
        return 4;
    }

    public static int BTF_KIND_UNION() {
        return 5;
    }

    public static int BTF_KIND_ENUM() {
        return 6;
    }

    public static int BTF_KIND_FWD() {
        return 7;
    }

    public static int BTF_KIND_TYPEDEF() {
        return 8;
    }

    public static int BTF_KIND_VOLATILE() {
        return 9;
    }

    public static int BTF_KIND_CONST() {
        return 10;
    }

    public static int BTF_KIND_RESTRICT() {
        return 11;
    }

    public static int NR_BTF_KINDS() {
        return 20;
    }

    public static int BTF_KIND_MAX() {
        return 19;
    }

    public static int BTF_VAR_STATIC() {
        return 0;
    }

    public static int BTF_VAR_GLOBAL_ALLOCATED() {
        return 1;
    }

    public static int BTF_VAR_GLOBAL_EXTERN() {
        return 2;
    }

    public static int BTF_FUNC_STATIC() {
        return 0;
    }

    public static int BTF_FUNC_GLOBAL() {
        return 1;
    }

    public static int BTF_FUNC_EXTERN() {
        return 2;
    }

    public static int BTF_LITTLE_ENDIAN() {
        return 0;
    }

    public static int BTF_BIG_ENDIAN() {
        return 1;
    }

    public static FunctionDescriptor btf__free$descriptor() {
        return btf__free.DESC;
    }

    public static MethodHandle btf__free$handle() {
        return btf__free.HANDLE;
    }

    public static MemorySegment btf__free$address() {
        return btf__free.ADDR;
    }

    public static void btf__free(MemorySegment btf2) {
        MethodHandle mh$ = btf__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__free", btf2);
            }
            mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__new$descriptor() {
        return btf__new.DESC;
    }

    public static MethodHandle btf__new$handle() {
        return btf__new.HANDLE;
    }

    public static MemorySegment btf__new$address() {
        return btf__new.ADDR;
    }

    public static MemorySegment btf__new(MemorySegment data, int size) {
        MethodHandle mh$ = btf__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__new", data, size);
            }
            return mh$.invokeExact(data, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__new_split$descriptor() {
        return btf__new_split.DESC;
    }

    public static MethodHandle btf__new_split$handle() {
        return btf__new_split.HANDLE;
    }

    public static MemorySegment btf__new_split$address() {
        return btf__new_split.ADDR;
    }

    public static MemorySegment btf__new_split(MemorySegment data, int size, MemorySegment base_btf) {
        MethodHandle mh$ = btf__new_split.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__new_split", data, size, base_btf);
            }
            return mh$.invokeExact(data, size, base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__new_empty$descriptor() {
        return btf__new_empty.DESC;
    }

    public static MethodHandle btf__new_empty$handle() {
        return btf__new_empty.HANDLE;
    }

    public static MemorySegment btf__new_empty$address() {
        return btf__new_empty.ADDR;
    }

    public static MemorySegment btf__new_empty() {
        MethodHandle mh$ = btf__new_empty.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__new_empty", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__new_empty_split$descriptor() {
        return btf__new_empty_split.DESC;
    }

    public static MethodHandle btf__new_empty_split$handle() {
        return btf__new_empty_split.HANDLE;
    }

    public static MemorySegment btf__new_empty_split$address() {
        return btf__new_empty_split.ADDR;
    }

    public static MemorySegment btf__new_empty_split(MemorySegment base_btf) {
        MethodHandle mh$ = btf__new_empty_split.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__new_empty_split", base_btf);
            }
            return mh$.invokeExact(base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__distill_base$descriptor() {
        return btf__distill_base.DESC;
    }

    public static MethodHandle btf__distill_base$handle() {
        return btf__distill_base.HANDLE;
    }

    public static MemorySegment btf__distill_base$address() {
        return btf__distill_base.ADDR;
    }

    public static int btf__distill_base(MemorySegment src_btf, MemorySegment new_base_btf, MemorySegment new_split_btf) {
        MethodHandle mh$ = btf__distill_base.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__distill_base", src_btf, new_base_btf, new_split_btf);
            }
            return mh$.invokeExact(src_btf, new_base_btf, new_split_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__parse$descriptor() {
        return btf__parse.DESC;
    }

    public static MethodHandle btf__parse$handle() {
        return btf__parse.HANDLE;
    }

    public static MemorySegment btf__parse$address() {
        return btf__parse.ADDR;
    }

    public static MemorySegment btf__parse(MemorySegment path2, MemorySegment btf_ext) {
        MethodHandle mh$ = btf__parse.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__parse", path2, btf_ext);
            }
            return mh$.invokeExact(path2, btf_ext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__parse_split$descriptor() {
        return btf__parse_split.DESC;
    }

    public static MethodHandle btf__parse_split$handle() {
        return btf__parse_split.HANDLE;
    }

    public static MemorySegment btf__parse_split$address() {
        return btf__parse_split.ADDR;
    }

    public static MemorySegment btf__parse_split(MemorySegment path2, MemorySegment base_btf) {
        MethodHandle mh$ = btf__parse_split.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__parse_split", path2, base_btf);
            }
            return mh$.invokeExact(path2, base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__parse_elf$descriptor() {
        return btf__parse_elf.DESC;
    }

    public static MethodHandle btf__parse_elf$handle() {
        return btf__parse_elf.HANDLE;
    }

    public static MemorySegment btf__parse_elf$address() {
        return btf__parse_elf.ADDR;
    }

    public static MemorySegment btf__parse_elf(MemorySegment path2, MemorySegment btf_ext) {
        MethodHandle mh$ = btf__parse_elf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__parse_elf", path2, btf_ext);
            }
            return mh$.invokeExact(path2, btf_ext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__parse_elf_split$descriptor() {
        return btf__parse_elf_split.DESC;
    }

    public static MethodHandle btf__parse_elf_split$handle() {
        return btf__parse_elf_split.HANDLE;
    }

    public static MemorySegment btf__parse_elf_split$address() {
        return btf__parse_elf_split.ADDR;
    }

    public static MemorySegment btf__parse_elf_split(MemorySegment path2, MemorySegment base_btf) {
        MethodHandle mh$ = btf__parse_elf_split.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__parse_elf_split", path2, base_btf);
            }
            return mh$.invokeExact(path2, base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__parse_raw$descriptor() {
        return btf__parse_raw.DESC;
    }

    public static MethodHandle btf__parse_raw$handle() {
        return btf__parse_raw.HANDLE;
    }

    public static MemorySegment btf__parse_raw$address() {
        return btf__parse_raw.ADDR;
    }

    public static MemorySegment btf__parse_raw(MemorySegment path2) {
        MethodHandle mh$ = btf__parse_raw.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__parse_raw", path2);
            }
            return mh$.invokeExact(path2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__parse_raw_split$descriptor() {
        return btf__parse_raw_split.DESC;
    }

    public static MethodHandle btf__parse_raw_split$handle() {
        return btf__parse_raw_split.HANDLE;
    }

    public static MemorySegment btf__parse_raw_split$address() {
        return btf__parse_raw_split.ADDR;
    }

    public static MemorySegment btf__parse_raw_split(MemorySegment path2, MemorySegment base_btf) {
        MethodHandle mh$ = btf__parse_raw_split.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__parse_raw_split", path2, base_btf);
            }
            return mh$.invokeExact(path2, base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__load_vmlinux_btf$descriptor() {
        return btf__load_vmlinux_btf.DESC;
    }

    public static MethodHandle btf__load_vmlinux_btf$handle() {
        return btf__load_vmlinux_btf.HANDLE;
    }

    public static MemorySegment btf__load_vmlinux_btf$address() {
        return btf__load_vmlinux_btf.ADDR;
    }

    public static MemorySegment btf__load_vmlinux_btf() {
        MethodHandle mh$ = btf__load_vmlinux_btf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__load_vmlinux_btf", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__load_module_btf$descriptor() {
        return btf__load_module_btf.DESC;
    }

    public static MethodHandle btf__load_module_btf$handle() {
        return btf__load_module_btf.HANDLE;
    }

    public static MemorySegment btf__load_module_btf$address() {
        return btf__load_module_btf.ADDR;
    }

    public static MemorySegment btf__load_module_btf(MemorySegment module_name, MemorySegment vmlinux_btf) {
        MethodHandle mh$ = btf__load_module_btf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__load_module_btf", module_name, vmlinux_btf);
            }
            return mh$.invokeExact(module_name, vmlinux_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__load_from_kernel_by_id$descriptor() {
        return btf__load_from_kernel_by_id.DESC;
    }

    public static MethodHandle btf__load_from_kernel_by_id$handle() {
        return btf__load_from_kernel_by_id.HANDLE;
    }

    public static MemorySegment btf__load_from_kernel_by_id$address() {
        return btf__load_from_kernel_by_id.ADDR;
    }

    public static MemorySegment btf__load_from_kernel_by_id(int id) {
        MethodHandle mh$ = btf__load_from_kernel_by_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__load_from_kernel_by_id", id);
            }
            return mh$.invokeExact(id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__load_from_kernel_by_id_split$descriptor() {
        return btf__load_from_kernel_by_id_split.DESC;
    }

    public static MethodHandle btf__load_from_kernel_by_id_split$handle() {
        return btf__load_from_kernel_by_id_split.HANDLE;
    }

    public static MemorySegment btf__load_from_kernel_by_id_split$address() {
        return btf__load_from_kernel_by_id_split.ADDR;
    }

    public static MemorySegment btf__load_from_kernel_by_id_split(int id, MemorySegment base_btf) {
        MethodHandle mh$ = btf__load_from_kernel_by_id_split.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__load_from_kernel_by_id_split", id, base_btf);
            }
            return mh$.invokeExact(id, base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__load_into_kernel$descriptor() {
        return btf__load_into_kernel.DESC;
    }

    public static MethodHandle btf__load_into_kernel$handle() {
        return btf__load_into_kernel.HANDLE;
    }

    public static MemorySegment btf__load_into_kernel$address() {
        return btf__load_into_kernel.ADDR;
    }

    public static int btf__load_into_kernel(MemorySegment btf2) {
        MethodHandle mh$ = btf__load_into_kernel.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__load_into_kernel", btf2);
            }
            return mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__find_by_name$descriptor() {
        return btf__find_by_name.DESC;
    }

    public static MethodHandle btf__find_by_name$handle() {
        return btf__find_by_name.HANDLE;
    }

    public static MemorySegment btf__find_by_name$address() {
        return btf__find_by_name.ADDR;
    }

    public static int btf__find_by_name(MemorySegment btf2, MemorySegment type_name) {
        MethodHandle mh$ = btf__find_by_name.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__find_by_name", btf2, type_name);
            }
            return mh$.invokeExact(btf2, type_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__find_by_name_kind$descriptor() {
        return btf__find_by_name_kind.DESC;
    }

    public static MethodHandle btf__find_by_name_kind$handle() {
        return btf__find_by_name_kind.HANDLE;
    }

    public static MemorySegment btf__find_by_name_kind$address() {
        return btf__find_by_name_kind.ADDR;
    }

    public static int btf__find_by_name_kind(MemorySegment btf2, MemorySegment type_name, int kind) {
        MethodHandle mh$ = btf__find_by_name_kind.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__find_by_name_kind", btf2, type_name, kind);
            }
            return mh$.invokeExact(btf2, type_name, kind);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__type_cnt$descriptor() {
        return btf__type_cnt.DESC;
    }

    public static MethodHandle btf__type_cnt$handle() {
        return btf__type_cnt.HANDLE;
    }

    public static MemorySegment btf__type_cnt$address() {
        return btf__type_cnt.ADDR;
    }

    public static int btf__type_cnt(MemorySegment btf2) {
        MethodHandle mh$ = btf__type_cnt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__type_cnt", btf2);
            }
            return mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__base_btf$descriptor() {
        return btf__base_btf.DESC;
    }

    public static MethodHandle btf__base_btf$handle() {
        return btf__base_btf.HANDLE;
    }

    public static MemorySegment btf__base_btf$address() {
        return btf__base_btf.ADDR;
    }

    public static MemorySegment btf__base_btf(MemorySegment btf2) {
        MethodHandle mh$ = btf__base_btf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__base_btf", btf2);
            }
            return mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__type_by_id$descriptor() {
        return btf__type_by_id.DESC;
    }

    public static MethodHandle btf__type_by_id$handle() {
        return btf__type_by_id.HANDLE;
    }

    public static MemorySegment btf__type_by_id$address() {
        return btf__type_by_id.ADDR;
    }

    public static MemorySegment btf__type_by_id(MemorySegment btf2, int id) {
        MethodHandle mh$ = btf__type_by_id.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__type_by_id", btf2, id);
            }
            return mh$.invokeExact(btf2, id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__pointer_size$descriptor() {
        return btf__pointer_size.DESC;
    }

    public static MethodHandle btf__pointer_size$handle() {
        return btf__pointer_size.HANDLE;
    }

    public static MemorySegment btf__pointer_size$address() {
        return btf__pointer_size.ADDR;
    }

    public static long btf__pointer_size(MemorySegment btf2) {
        MethodHandle mh$ = btf__pointer_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__pointer_size", btf2);
            }
            return mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__set_pointer_size$descriptor() {
        return btf__set_pointer_size.DESC;
    }

    public static MethodHandle btf__set_pointer_size$handle() {
        return btf__set_pointer_size.HANDLE;
    }

    public static MemorySegment btf__set_pointer_size$address() {
        return btf__set_pointer_size.ADDR;
    }

    public static int btf__set_pointer_size(MemorySegment btf2, long ptr_sz) {
        MethodHandle mh$ = btf__set_pointer_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__set_pointer_size", btf2, ptr_sz);
            }
            return mh$.invokeExact(btf2, ptr_sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__endianness$descriptor() {
        return btf__endianness.DESC;
    }

    public static MethodHandle btf__endianness$handle() {
        return btf__endianness.HANDLE;
    }

    public static MemorySegment btf__endianness$address() {
        return btf__endianness.ADDR;
    }

    public static int btf__endianness(MemorySegment btf2) {
        MethodHandle mh$ = btf__endianness.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__endianness", btf2);
            }
            return mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__set_endianness$descriptor() {
        return btf__set_endianness.DESC;
    }

    public static MethodHandle btf__set_endianness$handle() {
        return btf__set_endianness.HANDLE;
    }

    public static MemorySegment btf__set_endianness$address() {
        return btf__set_endianness.ADDR;
    }

    public static int btf__set_endianness(MemorySegment btf2, int endian) {
        MethodHandle mh$ = btf__set_endianness.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_2.traceDowncall("btf__set_endianness", btf2, endian);
            }
            return mh$.invokeExact(btf2, endian);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class memcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memcpy() {
        }
    }

    private static class memmove {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memmove");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memmove() {
        }
    }

    private static class memccpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memccpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memccpy() {
        }
    }

    private static class memset {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memset");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memset() {
        }
    }

    private static class memcmp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memcmp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memcmp() {
        }
    }

    private static class __memcmpeq {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("__memcmpeq");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __memcmpeq() {
        }
    }

    private static class memchr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memchr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memchr() {
        }
    }

    private static class strcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcpy() {
        }
    }

    private static class strncpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strncpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strncpy() {
        }
    }

    private static class strcat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcat() {
        }
    }

    private static class strncat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strncat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strncat() {
        }
    }

    private static class strcmp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcmp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcmp() {
        }
    }

    private static class strncmp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strncmp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strncmp() {
        }
    }

    private static class strcoll {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcoll");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcoll() {
        }
    }

    private static class strxfrm {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strxfrm");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strxfrm() {
        }
    }

    private static class strcoll_l {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcoll_l");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcoll_l() {
        }
    }

    private static class strxfrm_l {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strxfrm_l");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strxfrm_l() {
        }
    }

    private static class strdup {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strdup");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strdup() {
        }
    }

    private static class strndup {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strndup");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strndup() {
        }
    }

    private static class strchr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("strchr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strchr() {
        }
    }

    private static class strrchr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("strrchr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strrchr() {
        }
    }

    private static class strchrnul {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("strchrnul");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strchrnul() {
        }
    }

    private static class strcspn {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcspn");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcspn() {
        }
    }

    private static class strspn {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strspn");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strspn() {
        }
    }

    private static class strpbrk {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strpbrk");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strpbrk() {
        }
    }

    private static class strstr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strstr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strstr() {
        }
    }

    private static class strtok {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strtok");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strtok() {
        }
    }

    private static class __strtok_r {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__strtok_r");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __strtok_r() {
        }
    }

    private static class strtok_r {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strtok_r");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strtok_r() {
        }
    }

    private static class strcasestr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcasestr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcasestr() {
        }
    }

    private static class memmem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("memmem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private memmem() {
        }
    }

    private static class __mempcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("__mempcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __mempcpy() {
        }
    }

    private static class mempcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("mempcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private mempcpy() {
        }
    }

    private static class strlen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strlen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strlen() {
        }
    }

    private static class strnlen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strnlen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strnlen() {
        }
    }

    private static class strerror {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("strerror");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strerror() {
        }
    }

    private static class strerror_r {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("__xpg_strerror_r");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strerror_r() {
        }
    }

    private static class strerror_l {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strerror_l");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strerror_l() {
        }
    }

    private static class bcmp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bcmp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bcmp() {
        }
    }

    private static class bcopy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bcopy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bcopy() {
        }
    }

    private static class bzero {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bzero");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bzero() {
        }
    }

    private static class index {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("index");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private index() {
        }
    }

    private static class rindex {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("rindex");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private rindex() {
        }
    }

    private static class ffs {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("ffs");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ffs() {
        }
    }

    private static class ffsl {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("ffsl");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ffsl() {
        }
    }

    private static class ffsll {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("ffsll");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ffsll() {
        }
    }

    private static class strcasecmp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcasecmp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcasecmp() {
        }
    }

    private static class strncasecmp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strncasecmp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strncasecmp() {
        }
    }

    private static class strcasecmp_l {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strcasecmp_l");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strcasecmp_l() {
        }
    }

    private static class strncasecmp_l {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strncasecmp_l");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strncasecmp_l() {
        }
    }

    private static class explicit_bzero {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("explicit_bzero");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private explicit_bzero() {
        }
    }

    private static class strsep {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("strsep");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strsep() {
        }
    }

    private static class strsignal {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("strsignal");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strsignal() {
        }
    }

    private static class __stpcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__stpcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __stpcpy() {
        }
    }

    private static class stpcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("stpcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private stpcpy() {
        }
    }

    private static class __stpncpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("__stpncpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __stpncpy() {
        }
    }

    private static class stpncpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("stpncpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private stpncpy() {
        }
    }

    private static class strlcpy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strlcpy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strlcpy() {
        }
    }

    private static class strlcat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("strlcat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private strlcat() {
        }
    }

    private static class libbpf_set_strict_mode {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_set_strict_mode");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_set_strict_mode() {
        }
    }

    private static class libbpf_get_error {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_get_error");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_get_error() {
        }
    }

    private static class libbpf_find_kernel_btf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_find_kernel_btf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_find_kernel_btf() {
        }
    }

    private static class bpf_program__get_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__get_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__get_type() {
        }
    }

    private static class bpf_program__get_expected_attach_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__get_expected_attach_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__get_expected_attach_type() {
        }
    }

    private static class bpf_map__get_pin_path {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__get_pin_path");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__get_pin_path() {
        }
    }

    private static class btf__get_raw_data {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__get_raw_data");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__get_raw_data() {
        }
    }

    private static class btf_ext__get_raw_data {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_ext__get_raw_data");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_ext__get_raw_data() {
        }
    }

    private static class libbpf_set_memlock_rlim {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_set_memlock_rlim");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_set_memlock_rlim() {
        }
    }

    private static class bpf_map_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_create");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_create() {
        }
    }

    private static class bpf_prog_load {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_load");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_load() {
        }
    }

    private static class bpf_btf_load {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_btf_load");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_btf_load() {
        }
    }

    private static class bpf_map_update_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_update_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_update_elem() {
        }
    }

    private static class bpf_map_lookup_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_lookup_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_lookup_elem() {
        }
    }

    private static class bpf_map_lookup_elem_flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_lookup_elem_flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_lookup_elem_flags() {
        }
    }

    private static class bpf_map_lookup_and_delete_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_lookup_and_delete_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_lookup_and_delete_elem() {
        }
    }

    private static class bpf_map_lookup_and_delete_elem_flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_lookup_and_delete_elem_flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_lookup_and_delete_elem_flags() {
        }
    }

    private static class bpf_map_delete_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_delete_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_delete_elem() {
        }
    }

    private static class bpf_map_delete_elem_flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_delete_elem_flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_delete_elem_flags() {
        }
    }

    private static class bpf_map_get_next_key {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_get_next_key");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_get_next_key() {
        }
    }

    private static class bpf_map_freeze {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_freeze");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_freeze() {
        }
    }

    private static class bpf_map_delete_batch {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_delete_batch");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_delete_batch() {
        }
    }

    private static class bpf_map_lookup_batch {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_lookup_batch");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_lookup_batch() {
        }
    }

    private static class bpf_map_lookup_and_delete_batch {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_lookup_and_delete_batch");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_lookup_and_delete_batch() {
        }
    }

    private static class bpf_map_update_batch {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_update_batch");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_update_batch() {
        }
    }

    private static class bpf_obj_pin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_obj_pin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_obj_pin() {
        }
    }

    private static class bpf_obj_pin_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_obj_pin_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_obj_pin_opts() {
        }
    }

    private static class bpf_obj_get {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_obj_get");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_obj_get() {
        }
    }

    private static class bpf_obj_get_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_obj_get_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_obj_get_opts() {
        }
    }

    private static class bpf_prog_attach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_attach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_attach() {
        }
    }

    private static class bpf_prog_detach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_detach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_detach() {
        }
    }

    private static class bpf_prog_detach2 {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_detach2");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_detach2() {
        }
    }

    private static class bpf_prog_attach_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_attach_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_attach_opts() {
        }
    }

    private static class bpf_prog_detach_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_detach_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_detach_opts() {
        }
    }

    private static class bpf_link_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_create");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_create() {
        }
    }

    private static class bpf_link_detach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_detach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_detach() {
        }
    }

    private static class bpf_link_update {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_update");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_update() {
        }
    }

    private static class bpf_iter_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_iter_create");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_iter_create() {
        }
    }

    private static class bpf_prog_get_next_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_get_next_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_get_next_id() {
        }
    }

    private static class bpf_map_get_next_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_get_next_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_get_next_id() {
        }
    }

    private static class bpf_btf_get_next_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_btf_get_next_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_btf_get_next_id() {
        }
    }

    private static class bpf_link_get_next_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_get_next_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_get_next_id() {
        }
    }

    private static class bpf_prog_get_fd_by_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_get_fd_by_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_get_fd_by_id() {
        }
    }

    private static class bpf_prog_get_fd_by_id_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_get_fd_by_id_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_get_fd_by_id_opts() {
        }
    }

    private static class bpf_map_get_fd_by_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_get_fd_by_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_get_fd_by_id() {
        }
    }

    private static class bpf_map_get_fd_by_id_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_get_fd_by_id_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_get_fd_by_id_opts() {
        }
    }

    private static class bpf_btf_get_fd_by_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_btf_get_fd_by_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_btf_get_fd_by_id() {
        }
    }

    private static class bpf_btf_get_fd_by_id_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_btf_get_fd_by_id_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_btf_get_fd_by_id_opts() {
        }
    }

    private static class bpf_link_get_fd_by_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_get_fd_by_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_get_fd_by_id() {
        }
    }

    private static class bpf_link_get_fd_by_id_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_get_fd_by_id_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_get_fd_by_id_opts() {
        }
    }

    private static class bpf_obj_get_info_by_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_obj_get_info_by_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_obj_get_info_by_fd() {
        }
    }

    private static class bpf_prog_get_info_by_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_get_info_by_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_get_info_by_fd() {
        }
    }

    private static class bpf_map_get_info_by_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map_get_info_by_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map_get_info_by_fd() {
        }
    }

    private static class bpf_btf_get_info_by_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_btf_get_info_by_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_btf_get_info_by_fd() {
        }
    }

    private static class bpf_link_get_info_by_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link_get_info_by_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link_get_info_by_fd() {
        }
    }

    private static class bpf_prog_query_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_query_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_query_opts() {
        }
    }

    private static class bpf_prog_query {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_query");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_query() {
        }
    }

    private static class bpf_raw_tracepoint_open_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_raw_tracepoint_open_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_raw_tracepoint_open_opts() {
        }
    }

    private static class bpf_raw_tracepoint_open {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_raw_tracepoint_open");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_raw_tracepoint_open() {
        }
    }

    private static class bpf_task_fd_query {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_task_fd_query");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_task_fd_query() {
        }
    }

    private static class bpf_enable_stats {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_enable_stats");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_enable_stats() {
        }
    }

    private static class bpf_prog_bind_map {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_bind_map");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_bind_map() {
        }
    }

    private static class bpf_prog_test_run_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_test_run_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_test_run_opts() {
        }
    }

    private static class bpf_token_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_token_create");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_token_create() {
        }
    }

    private static class remove {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("remove");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private remove() {
        }
    }

    private static class rename {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("rename");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private rename() {
        }
    }

    private static class renameat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("renameat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private renameat() {
        }
    }

    private static class fclose {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fclose");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fclose() {
        }
    }

    private static class tmpfile {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("tmpfile");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private tmpfile() {
        }
    }

    private static class tmpnam {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("tmpnam");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private tmpnam() {
        }
    }

    private static class tmpnam_r {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("tmpnam_r");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private tmpnam_r() {
        }
    }

    private static class tempnam {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("tempnam");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private tempnam() {
        }
    }

    private static class fflush {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fflush");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fflush() {
        }
    }

    private static class fflush_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fflush_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fflush_unlocked() {
        }
    }

    private static class fopen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fopen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fopen() {
        }
    }

    private static class freopen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("freopen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private freopen() {
        }
    }

    private static class fdopen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fdopen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fdopen() {
        }
    }

    private static class fopencookie {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, _IO_cookie_io_functions_t.layout()});
        public static final MemorySegment ADDR = Lib.findOrThrow("fopencookie");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fopencookie() {
        }
    }

    private static class fmemopen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fmemopen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fmemopen() {
        }
    }

    private static class open_memstream {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("open_memstream");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private open_memstream() {
        }
    }

    private static class setbuf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("setbuf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setbuf() {
        }
    }

    private static class setvbuf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("setvbuf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setvbuf() {
        }
    }

    private static class setbuffer {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("setbuffer");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setbuffer() {
        }
    }

    private static class setlinebuf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("setlinebuf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setlinebuf() {
        }
    }

    private static class vfprintf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vfprintf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vfprintf() {
        }
    }

    private static class vprintf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vprintf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vprintf() {
        }
    }

    private static class vsprintf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vsprintf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vsprintf() {
        }
    }

    private static class vsnprintf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vsnprintf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vsnprintf() {
        }
    }

    private static class vasprintf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vasprintf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vasprintf() {
        }
    }

    private static class vdprintf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vdprintf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vdprintf() {
        }
    }

    private static class vfscanf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vfscanf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vfscanf() {
        }
    }

    private static class vscanf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vscanf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vscanf() {
        }
    }

    private static class vsscanf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("vsscanf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vsscanf() {
        }
    }

    private static class fgetc {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fgetc");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fgetc() {
        }
    }

    private static class getc {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getc");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getc() {
        }
    }

    private static class getchar {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getchar");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getchar() {
        }
    }

    private static class getc_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getc_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getc_unlocked() {
        }
    }

    private static class getchar_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getchar_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getchar_unlocked() {
        }
    }

    private static class fgetc_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fgetc_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fgetc_unlocked() {
        }
    }

    private static class fputc {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fputc");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fputc() {
        }
    }

    private static class putc {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("putc");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private putc() {
        }
    }

    private static class putchar {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("putchar");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private putchar() {
        }
    }

    private static class fputc_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fputc_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fputc_unlocked() {
        }
    }

    private static class putc_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("putc_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private putc_unlocked() {
        }
    }

    private static class putchar_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("putchar_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private putchar_unlocked() {
        }
    }

    private static class getw {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getw");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getw() {
        }
    }

    private static class putw {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("putw");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private putw() {
        }
    }

    private static class fgets {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fgets");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fgets() {
        }
    }

    private static class __getdelim {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__getdelim");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __getdelim() {
        }
    }

    private static class getdelim {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getdelim");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getdelim() {
        }
    }

    private static class getline {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getline");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getline() {
        }
    }

    private static class fputs {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fputs");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fputs() {
        }
    }

    private static class puts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("puts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private puts() {
        }
    }

    private static class ungetc {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ungetc");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ungetc() {
        }
    }

    private static class fread {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fread");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fread() {
        }
    }

    private static class fwrite {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fwrite");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fwrite() {
        }
    }

    private static class fread_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fread_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fread_unlocked() {
        }
    }

    private static class fwrite_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fwrite_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fwrite_unlocked() {
        }
    }

    private static class fseek {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fseek");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fseek() {
        }
    }

    private static class ftell {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ftell");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ftell() {
        }
    }

    private static class rewind {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("rewind");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private rewind() {
        }
    }

    private static class fseeko {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fseeko");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fseeko() {
        }
    }

    private static class ftello {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ftello");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ftello() {
        }
    }

    private static class fgetpos {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fgetpos");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fgetpos() {
        }
    }

    private static class fsetpos {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fsetpos");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fsetpos() {
        }
    }

    private static class clearerr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("clearerr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private clearerr() {
        }
    }

    private static class feof {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("feof");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private feof() {
        }
    }

    private static class ferror {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ferror");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ferror() {
        }
    }

    private static class clearerr_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("clearerr_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private clearerr_unlocked() {
        }
    }

    private static class feof_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("feof_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private feof_unlocked() {
        }
    }

    private static class ferror_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ferror_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ferror_unlocked() {
        }
    }

    private static class perror {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perror");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perror() {
        }
    }

    private static class fileno {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fileno");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fileno() {
        }
    }

    private static class fileno_unlocked {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fileno_unlocked");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fileno_unlocked() {
        }
    }

    private static class pclose {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("pclose");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pclose() {
        }
    }

    private static class popen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("popen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private popen() {
        }
    }

    private static class ctermid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ctermid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ctermid() {
        }
    }

    private static class flockfile {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("flockfile");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private flockfile() {
        }
    }

    private static class ftrylockfile {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ftrylockfile");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ftrylockfile() {
        }
    }

    private static class funlockfile {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("funlockfile");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private funlockfile() {
        }
    }

    private static class __uflow {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__uflow");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __uflow() {
        }
    }

    private static class __overflow {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("__overflow");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __overflow() {
        }
    }

    private static class select {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("select");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private select() {
        }
    }

    private static class pselect {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("pselect");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pselect() {
        }
    }

    private static class libbpf_major_version {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_major_version");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_major_version() {
        }
    }

    private static class libbpf_minor_version {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_minor_version");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_minor_version() {
        }
    }

    private static class libbpf_version_string {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_version_string");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_version_string() {
        }
    }

    private static class libbpf_strerror {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_strerror");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_strerror() {
        }
    }

    private static class libbpf_bpf_attach_type_str {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_bpf_attach_type_str");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_bpf_attach_type_str() {
        }
    }

    private static class libbpf_bpf_link_type_str {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_bpf_link_type_str");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_bpf_link_type_str() {
        }
    }

    private static class libbpf_bpf_map_type_str {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_bpf_map_type_str");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_bpf_map_type_str() {
        }
    }

    private static class libbpf_bpf_prog_type_str {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_bpf_prog_type_str");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_bpf_prog_type_str() {
        }
    }

    private static class libbpf_set_print {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_set_print");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_set_print() {
        }
    }

    private static class bpf_object__open {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__open");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__open() {
        }
    }

    private static class bpf_object__open_file {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__open_file");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__open_file() {
        }
    }

    private static class bpf_object__open_mem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__open_mem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__open_mem() {
        }
    }

    private static class bpf_object__load {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__load");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__load() {
        }
    }

    private static class bpf_object__close {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__close");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__close() {
        }
    }

    private static class bpf_object__pin_maps {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__pin_maps");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__pin_maps() {
        }
    }

    private static class bpf_object__unpin_maps {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__unpin_maps");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__unpin_maps() {
        }
    }

    private static class bpf_object__pin_programs {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__pin_programs");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__pin_programs() {
        }
    }

    private static class bpf_object__unpin_programs {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__unpin_programs");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__unpin_programs() {
        }
    }

    private static class bpf_object__pin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__pin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__pin() {
        }
    }

    private static class bpf_object__unpin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__unpin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__unpin() {
        }
    }

    private static class bpf_object__name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__name() {
        }
    }

    private static class bpf_object__kversion {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__kversion");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__kversion() {
        }
    }

    private static class bpf_object__set_kversion {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__set_kversion");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__set_kversion() {
        }
    }

    private static class bpf_object__token_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__token_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__token_fd() {
        }
    }

    private static class bpf_object__btf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__btf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__btf() {
        }
    }

    private static class bpf_object__btf_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__btf_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__btf_fd() {
        }
    }

    private static class bpf_object__find_program_by_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__find_program_by_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__find_program_by_name() {
        }
    }

    private static class libbpf_prog_type_by_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_prog_type_by_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_prog_type_by_name() {
        }
    }

    private static class libbpf_attach_type_by_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_attach_type_by_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_attach_type_by_name() {
        }
    }

    private static class libbpf_find_vmlinux_btf_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_find_vmlinux_btf_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_find_vmlinux_btf_id() {
        }
    }

    private static class bpf_object__next_program {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__next_program");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__next_program() {
        }
    }

    private static class bpf_object__prev_program {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__prev_program");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__prev_program() {
        }
    }

    private static class bpf_program__set_ifindex {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_ifindex");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_ifindex() {
        }
    }

    private static class bpf_program__name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__name() {
        }
    }

    private static class bpf_program__section_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__section_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__section_name() {
        }
    }

    private static class bpf_program__autoload {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_BOOL, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__autoload");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__autoload() {
        }
    }

    private static class bpf_program__set_autoload {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_BOOL});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_autoload");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_autoload() {
        }
    }

    private static class bpf_program__autoattach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_BOOL, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__autoattach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__autoattach() {
        }
    }

    private static class bpf_program__set_autoattach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_BOOL});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_autoattach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_autoattach() {
        }
    }

    private static class bpf_program__insns {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__insns");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__insns() {
        }
    }

    private static class bpf_program__set_insns {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_insns");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_insns() {
        }
    }

    private static class bpf_program__insn_cnt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__insn_cnt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__insn_cnt() {
        }
    }

    private static class bpf_program__fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__fd() {
        }
    }

    private static class bpf_program__pin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__pin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__pin() {
        }
    }

    private static class bpf_program__unpin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__unpin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__unpin() {
        }
    }

    private static class bpf_program__unload {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__unload");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__unload() {
        }
    }

    private static class bpf_link__open {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__open");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__open() {
        }
    }

    private static class bpf_link__fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__fd() {
        }
    }

    private static class bpf_link__pin_path {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__pin_path");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__pin_path() {
        }
    }

    private static class bpf_link__pin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__pin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__pin() {
        }
    }

    private static class bpf_link__unpin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__unpin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__unpin() {
        }
    }

    private static class bpf_link__update_program {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__update_program");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__update_program() {
        }
    }

    private static class bpf_link__disconnect {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__disconnect");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__disconnect() {
        }
    }

    private static class bpf_link__detach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__detach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__detach() {
        }
    }

    private static class bpf_link__destroy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__destroy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__destroy() {
        }
    }

    private static class bpf_program__attach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach() {
        }
    }

    private static class bpf_program__attach_perf_event {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_perf_event");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_perf_event() {
        }
    }

    private static class bpf_program__attach_perf_event_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_perf_event_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_perf_event_opts() {
        }
    }

    private static class bpf_program__attach_kprobe {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_BOOL, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_kprobe");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_kprobe() {
        }
    }

    private static class bpf_program__attach_kprobe_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_kprobe_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_kprobe_opts() {
        }
    }

    private static class bpf_program__attach_kprobe_multi_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_kprobe_multi_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_kprobe_multi_opts() {
        }
    }

    private static class bpf_program__attach_uprobe_multi {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_uprobe_multi");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_uprobe_multi() {
        }
    }

    private static class bpf_program__attach_ksyscall {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_ksyscall");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_ksyscall() {
        }
    }

    private static class bpf_program__attach_uprobe {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_BOOL, Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_uprobe");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_uprobe() {
        }
    }

    private static class bpf_program__attach_uprobe_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_uprobe_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_uprobe_opts() {
        }
    }

    private static class bpf_program__attach_usdt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_usdt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_usdt() {
        }
    }

    private static class bpf_program__attach_tracepoint {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_tracepoint");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_tracepoint() {
        }
    }

    private static class bpf_program__attach_tracepoint_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_tracepoint_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_tracepoint_opts() {
        }
    }

    private static class bpf_program__attach_raw_tracepoint {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_raw_tracepoint");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_raw_tracepoint() {
        }
    }

    private static class bpf_program__attach_raw_tracepoint_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_raw_tracepoint_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_raw_tracepoint_opts() {
        }
    }

    private static class bpf_program__attach_trace {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_trace");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_trace() {
        }
    }

    private static class bpf_program__attach_trace_opts {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_trace_opts");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_trace_opts() {
        }
    }

    private static class bpf_program__attach_lsm {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_lsm");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_lsm() {
        }
    }

    private static class bpf_program__attach_cgroup {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_cgroup");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_cgroup() {
        }
    }

    private static class bpf_program__attach_netns {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_netns");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_netns() {
        }
    }

    private static class bpf_program__attach_sockmap {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_sockmap");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_sockmap() {
        }
    }

    private static class bpf_program__attach_xdp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_xdp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_xdp() {
        }
    }

    private static class bpf_program__attach_freplace {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_freplace");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_freplace() {
        }
    }

    private static class bpf_program__attach_netfilter {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_netfilter");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_netfilter() {
        }
    }

    private static class bpf_program__attach_tcx {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_tcx");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_tcx() {
        }
    }

    private static class bpf_program__attach_netkit {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_netkit");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_netkit() {
        }
    }

    private static class bpf_map__attach_struct_ops {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__attach_struct_ops");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__attach_struct_ops() {
        }
    }

    private static class bpf_link__update_map {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_link__update_map");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_link__update_map() {
        }
    }

    private static class bpf_program__attach_iter {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__attach_iter");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__attach_iter() {
        }
    }

    private static class bpf_program__type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__type() {
        }
    }

    private static class bpf_program__set_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_type() {
        }
    }

    private static class bpf_program__expected_attach_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__expected_attach_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__expected_attach_type() {
        }
    }

    private static class bpf_program__set_expected_attach_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_expected_attach_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_expected_attach_type() {
        }
    }

    private static class bpf_program__flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__flags() {
        }
    }

    private static class bpf_program__set_flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_flags() {
        }
    }

    private static class bpf_program__log_level {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__log_level");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__log_level() {
        }
    }

    private static class bpf_program__set_log_level {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_log_level");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_log_level() {
        }
    }

    private static class bpf_program__log_buf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__log_buf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__log_buf() {
        }
    }

    private static class bpf_program__set_log_buf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_log_buf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_log_buf() {
        }
    }

    private static class bpf_program__set_attach_target {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_program__set_attach_target");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_program__set_attach_target() {
        }
    }

    private static class bpf_object__find_map_by_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__find_map_by_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__find_map_by_name() {
        }
    }

    private static class bpf_object__find_map_fd_by_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__find_map_fd_by_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__find_map_fd_by_name() {
        }
    }

    private static class bpf_object__next_map {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__next_map");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__next_map() {
        }
    }

    private static class bpf_object__prev_map {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__prev_map");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__prev_map() {
        }
    }

    private static class bpf_map__set_autocreate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_BOOL});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_autocreate");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_autocreate() {
        }
    }

    private static class bpf_map__autocreate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_BOOL, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__autocreate");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__autocreate() {
        }
    }

    private static class bpf_map__set_autoattach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_BOOL});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_autoattach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_autoattach() {
        }
    }

    private static class bpf_map__autoattach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_BOOL, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__autoattach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__autoattach() {
        }
    }

    private static class bpf_map__fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__fd() {
        }
    }

    private static class bpf_map__reuse_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__reuse_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__reuse_fd() {
        }
    }

    private static class bpf_map__name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__name() {
        }
    }

    private static class bpf_map__type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__type() {
        }
    }

    private static class bpf_map__set_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_type() {
        }
    }

    private static class bpf_map__max_entries {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__max_entries");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__max_entries() {
        }
    }

    private static class bpf_map__set_max_entries {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_max_entries");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_max_entries() {
        }
    }

    private static class bpf_map__map_flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__map_flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__map_flags() {
        }
    }

    private static class bpf_map__set_map_flags {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_map_flags");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_map_flags() {
        }
    }

    private static class bpf_map__numa_node {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__numa_node");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__numa_node() {
        }
    }

    private static class bpf_map__set_numa_node {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_numa_node");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_numa_node() {
        }
    }

    private static class bpf_map__key_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__key_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__key_size() {
        }
    }

    private static class bpf_map__set_key_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_key_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_key_size() {
        }
    }

    private static class bpf_map__value_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__value_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__value_size() {
        }
    }

    private static class bpf_map__set_value_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_value_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_value_size() {
        }
    }

    private static class bpf_map__btf_key_type_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__btf_key_type_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__btf_key_type_id() {
        }
    }

    private static class bpf_map__btf_value_type_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__btf_value_type_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__btf_value_type_id() {
        }
    }

    private static class bpf_map__ifindex {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__ifindex");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__ifindex() {
        }
    }

    private static class bpf_map__set_ifindex {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_ifindex");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_ifindex() {
        }
    }

    private static class bpf_map__map_extra {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__map_extra");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__map_extra() {
        }
    }

    private static class bpf_map__set_map_extra {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_map_extra");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_map_extra() {
        }
    }

    private static class bpf_map__set_initial_value {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_initial_value");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_initial_value() {
        }
    }

    private static class bpf_map__initial_value {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__initial_value");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__initial_value() {
        }
    }

    private static class bpf_map__is_internal {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_BOOL, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__is_internal");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__is_internal() {
        }
    }

    private static class bpf_map__set_pin_path {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_pin_path");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_pin_path() {
        }
    }

    private static class bpf_map__pin_path {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__pin_path");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__pin_path() {
        }
    }

    private static class bpf_map__is_pinned {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_BOOL, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__is_pinned");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__is_pinned() {
        }
    }

    private static class bpf_map__pin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__pin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__pin() {
        }
    }

    private static class bpf_map__unpin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__unpin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__unpin() {
        }
    }

    private static class bpf_map__set_inner_map_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__set_inner_map_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__set_inner_map_fd() {
        }
    }

    private static class bpf_map__inner_map {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__inner_map");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__inner_map() {
        }
    }

    private static class bpf_map__lookup_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__lookup_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__lookup_elem() {
        }
    }

    private static class bpf_map__update_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__update_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__update_elem() {
        }
    }

    private static class bpf_map__delete_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__delete_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__delete_elem() {
        }
    }

    private static class bpf_map__lookup_and_delete_elem {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__lookup_and_delete_elem");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__lookup_and_delete_elem() {
        }
    }

    private static class bpf_map__get_next_key {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_map__get_next_key");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_map__get_next_key() {
        }
    }

    private static class bpf_xdp_attach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_xdp_attach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_xdp_attach() {
        }
    }

    private static class bpf_xdp_detach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_xdp_detach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_xdp_detach() {
        }
    }

    private static class bpf_xdp_query {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_xdp_query");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_xdp_query() {
        }
    }

    private static class bpf_xdp_query_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_xdp_query_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_xdp_query_id() {
        }
    }

    private static class bpf_tc_hook_create {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_tc_hook_create");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_tc_hook_create() {
        }
    }

    private static class bpf_tc_hook_destroy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_tc_hook_destroy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_tc_hook_destroy() {
        }
    }

    private static class bpf_tc_attach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_tc_attach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_tc_attach() {
        }
    }

    private static class bpf_tc_detach {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_tc_detach");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_tc_detach() {
        }
    }

    private static class bpf_tc_query {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_tc_query");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_tc_query() {
        }
    }

    private static class ring_buffer__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__new() {
        }
    }

    private static class ring_buffer__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__free() {
        }
    }

    private static class ring_buffer__add {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__add");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__add() {
        }
    }

    private static class ring_buffer__poll {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__poll");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__poll() {
        }
    }

    private static class ring_buffer__consume {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__consume");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__consume() {
        }
    }

    private static class ring_buffer__consume_n {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__consume_n");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__consume_n() {
        }
    }

    private static class ring_buffer__epoll_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__epoll_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__epoll_fd() {
        }
    }

    private static class ring_buffer__ring {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring_buffer__ring");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring_buffer__ring() {
        }
    }

    private static class ring__consumer_pos {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__consumer_pos");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__consumer_pos() {
        }
    }

    private static class ring__producer_pos {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__producer_pos");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__producer_pos() {
        }
    }

    private static class ring__avail_data_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__avail_data_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__avail_data_size() {
        }
    }

    private static class ring__size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__size() {
        }
    }

    private static class ring__map_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__map_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__map_fd() {
        }
    }

    private static class ring__consume {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__consume");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__consume() {
        }
    }

    private static class ring__consume_n {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("ring__consume_n");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ring__consume_n() {
        }
    }

    private static class user_ring_buffer__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("user_ring_buffer__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private user_ring_buffer__new() {
        }
    }

    private static class user_ring_buffer__reserve {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("user_ring_buffer__reserve");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private user_ring_buffer__reserve() {
        }
    }

    private static class user_ring_buffer__reserve_blocking {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("user_ring_buffer__reserve_blocking");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private user_ring_buffer__reserve_blocking() {
        }
    }

    private static class user_ring_buffer__submit {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("user_ring_buffer__submit");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private user_ring_buffer__submit() {
        }
    }

    private static class user_ring_buffer__discard {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("user_ring_buffer__discard");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private user_ring_buffer__discard() {
        }
    }

    private static class user_ring_buffer__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("user_ring_buffer__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private user_ring_buffer__free() {
        }
    }

    private static class perf_buffer__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_LONG, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__new() {
        }
    }

    private static class perf_buffer__new_raw {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_LONG, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__new_raw");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__new_raw() {
        }
    }

    private static class perf_buffer__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__free() {
        }
    }

    private static class perf_buffer__epoll_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__epoll_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__epoll_fd() {
        }
    }

    private static class perf_buffer__poll {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__poll");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__poll() {
        }
    }

    private static class perf_buffer__consume {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__consume");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__consume() {
        }
    }

    private static class perf_buffer__consume_buffer {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__consume_buffer");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__consume_buffer() {
        }
    }

    private static class perf_buffer__buffer_cnt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__buffer_cnt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__buffer_cnt() {
        }
    }

    private static class perf_buffer__buffer_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__buffer_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__buffer_fd() {
        }
    }

    private static class perf_buffer__buffer {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("perf_buffer__buffer");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private perf_buffer__buffer() {
        }
    }

    private static class bpf_prog_linfo__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_linfo__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_linfo__free() {
        }
    }

    private static class bpf_prog_linfo__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_linfo__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_linfo__new() {
        }
    }

    private static class bpf_prog_linfo__lfind_addr_func {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG_LONG, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_linfo__lfind_addr_func");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_linfo__lfind_addr_func() {
        }
    }

    private static class bpf_prog_linfo__lfind {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_prog_linfo__lfind");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_prog_linfo__lfind() {
        }
    }

    private static class libbpf_probe_bpf_prog_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_probe_bpf_prog_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_probe_bpf_prog_type() {
        }
    }

    private static class libbpf_probe_bpf_map_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_probe_bpf_map_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_probe_bpf_map_type() {
        }
    }

    private static class libbpf_probe_bpf_helper {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_probe_bpf_helper");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_probe_bpf_helper() {
        }
    }

    private static class libbpf_num_possible_cpus {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_num_possible_cpus");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_num_possible_cpus() {
        }
    }

    private static class bpf_object__open_skeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__open_skeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__open_skeleton() {
        }
    }

    private static class bpf_object__load_skeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__load_skeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__load_skeleton() {
        }
    }

    private static class bpf_object__attach_skeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__attach_skeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__attach_skeleton() {
        }
    }

    private static class bpf_object__detach_skeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__detach_skeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__detach_skeleton() {
        }
    }

    private static class bpf_object__destroy_skeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__destroy_skeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__destroy_skeleton() {
        }
    }

    private static class bpf_object__open_subskeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__open_subskeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__open_subskeleton() {
        }
    }

    private static class bpf_object__destroy_subskeleton {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__destroy_subskeleton");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__destroy_subskeleton() {
        }
    }

    private static class bpf_object__gen_loader {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_object__gen_loader");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_object__gen_loader() {
        }
    }

    private static class bpf_linker__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_linker__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_linker__new() {
        }
    }

    private static class bpf_linker__add_file {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_linker__add_file");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_linker__add_file() {
        }
    }

    private static class bpf_linker__finalize {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_linker__finalize");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_linker__finalize() {
        }
    }

    private static class bpf_linker__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("bpf_linker__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bpf_linker__free() {
        }
    }

    private static class libbpf_register_prog_handler {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_register_prog_handler");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_register_prog_handler() {
        }
    }

    private static class libbpf_unregister_prog_handler {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("libbpf_unregister_prog_handler");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private libbpf_unregister_prog_handler() {
        }
    }

    private static class btf__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__free() {
        }
    }

    private static class btf__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__new() {
        }
    }

    private static class btf__new_split {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__new_split");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__new_split() {
        }
    }

    private static class btf__new_empty {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__new_empty");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__new_empty() {
        }
    }

    private static class btf__new_empty_split {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__new_empty_split");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__new_empty_split() {
        }
    }

    private static class btf__distill_base {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__distill_base");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__distill_base() {
        }
    }

    private static class btf__parse {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__parse");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__parse() {
        }
    }

    private static class btf__parse_split {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__parse_split");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__parse_split() {
        }
    }

    private static class btf__parse_elf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__parse_elf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__parse_elf() {
        }
    }

    private static class btf__parse_elf_split {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__parse_elf_split");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__parse_elf_split() {
        }
    }

    private static class btf__parse_raw {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__parse_raw");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__parse_raw() {
        }
    }

    private static class btf__parse_raw_split {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__parse_raw_split");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__parse_raw_split() {
        }
    }

    private static class btf__load_vmlinux_btf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__load_vmlinux_btf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__load_vmlinux_btf() {
        }
    }

    private static class btf__load_module_btf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__load_module_btf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__load_module_btf() {
        }
    }

    private static class btf__load_from_kernel_by_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__load_from_kernel_by_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__load_from_kernel_by_id() {
        }
    }

    private static class btf__load_from_kernel_by_id_split {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__load_from_kernel_by_id_split");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__load_from_kernel_by_id_split() {
        }
    }

    private static class btf__load_into_kernel {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__load_into_kernel");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__load_into_kernel() {
        }
    }

    private static class btf__find_by_name {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__find_by_name");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__find_by_name() {
        }
    }

    private static class btf__find_by_name_kind {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__find_by_name_kind");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__find_by_name_kind() {
        }
    }

    private static class btf__type_cnt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__type_cnt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__type_cnt() {
        }
    }

    private static class btf__base_btf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__base_btf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__base_btf() {
        }
    }

    private static class btf__type_by_id {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__type_by_id");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__type_by_id() {
        }
    }

    private static class btf__pointer_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__pointer_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__pointer_size() {
        }
    }

    private static class btf__set_pointer_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__set_pointer_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__set_pointer_size() {
        }
    }

    private static class btf__endianness {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__endianness");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__endianness() {
        }
    }

    private static class btf__set_endianness {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__set_endianness");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__set_endianness() {
        }
    }

    public static class sscanf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("sscanf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private sscanf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static sscanf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new sscanf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __s, MemorySegment __format, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("sscanf", __s, __format, x2);
                }
                return this.spreader.invokeExact(__s, __format, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class scanf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("scanf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private scanf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static scanf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new scanf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __format, Object ... x1) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("scanf", __format, x1);
                }
                return this.spreader.invokeExact(__format, x1);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class fscanf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("fscanf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private fscanf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static fscanf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new fscanf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __stream, MemorySegment __format, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("fscanf", __stream, __format, x2);
                }
                return this.spreader.invokeExact(__stream, __format, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class dprintf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("dprintf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private dprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static dprintf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new dprintf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(int __fd, MemorySegment __fmt, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("dprintf", __fd, __fmt, x2);
                }
                return this.spreader.invokeExact(__fd, __fmt, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class asprintf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("asprintf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private asprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static asprintf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new asprintf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __ptr, MemorySegment __fmt, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("asprintf", __ptr, __fmt, x2);
                }
                return this.spreader.invokeExact(__ptr, __fmt, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class __asprintf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("__asprintf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private __asprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static __asprintf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new __asprintf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __ptr, MemorySegment __fmt, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("__asprintf", __ptr, __fmt, x2);
                }
                return this.spreader.invokeExact(__ptr, __fmt, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class snprintf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("snprintf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private snprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static snprintf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new snprintf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __s, long __maxlen, MemorySegment __format, Object ... x3) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("snprintf", __s, __maxlen, __format, x3);
                }
                return this.spreader.invokeExact(__s, __maxlen, __format, x3);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class sprintf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("sprintf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private sprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static sprintf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new sprintf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __s, MemorySegment __format, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("sprintf", __s, __format, x2);
                }
                return this.spreader.invokeExact(__s, __format, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class printf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("printf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private printf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static printf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new printf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __format, Object ... x1) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("printf", __format, x1);
                }
                return this.spreader.invokeExact(__format, x1);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class fprintf {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("fprintf");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private fprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static fprintf makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new fprintf(mh$, desc$, spreader$);
        }

        public static MemorySegment address() {
            return ADDR;
        }

        public MethodHandle handle() {
            return this.handle;
        }

        public FunctionDescriptor descriptor() {
            return this.descriptor;
        }

        public int apply(MemorySegment __stream, MemorySegment __format, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("fprintf", __stream, __format, x2);
                }
                return this.spreader.invokeExact(__stream, __format, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }
}

