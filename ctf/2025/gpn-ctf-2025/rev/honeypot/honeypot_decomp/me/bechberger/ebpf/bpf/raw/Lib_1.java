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
import me.bechberger.ebpf.bpf.raw.Lib_1;
import me.bechberger.ebpf.bpf.raw.Lib_2;
import me.bechberger.ebpf.bpf.raw.Lib_4;

public class Lib_1
extends Lib_2 {
    private static final int BTF_FWD_STRUCT = 0;
    private static final int BTF_FWD_UNION = 1;
    private static final int BTF_FWD_ENUM = 2;
    public static final ValueLayout.OfInt useconds_t = Lib.C_INT;
    public static final ValueLayout.OfInt socklen_t = Lib.C_INT;
    private static final int _PC_LINK_MAX = 0;
    private static final int _PC_MAX_CANON = 1;
    private static final int _PC_MAX_INPUT = 2;
    private static final int _PC_NAME_MAX = 3;
    private static final int _PC_PATH_MAX = 4;
    private static final int _PC_PIPE_BUF = 5;
    private static final int _PC_CHOWN_RESTRICTED = 6;
    private static final int _PC_NO_TRUNC = 7;
    private static final int _PC_VDISABLE = 8;
    private static final int _PC_SYNC_IO = 9;
    private static final int _PC_ASYNC_IO = 10;
    private static final int _PC_PRIO_IO = 11;
    private static final int _PC_SOCK_MAXBUF = 12;
    private static final int _PC_FILESIZEBITS = 13;
    private static final int _PC_REC_INCR_XFER_SIZE = 14;
    private static final int _PC_REC_MAX_XFER_SIZE = 15;
    private static final int _PC_REC_MIN_XFER_SIZE = 16;
    private static final int _PC_REC_XFER_ALIGN = 17;
    private static final int _PC_ALLOC_SIZE_MIN = 18;
    private static final int _PC_SYMLINK_MAX = 19;
    private static final int _PC_2_SYMLINKS = 20;
    private static final int _SC_ARG_MAX = 0;
    private static final int _SC_CHILD_MAX = 1;
    private static final int _SC_CLK_TCK = 2;
    private static final int _SC_NGROUPS_MAX = 3;
    private static final int _SC_OPEN_MAX = 4;
    private static final int _SC_STREAM_MAX = 5;
    private static final int _SC_TZNAME_MAX = 6;
    private static final int _SC_JOB_CONTROL = 7;
    private static final int _SC_SAVED_IDS = 8;
    private static final int _SC_REALTIME_SIGNALS = 9;
    private static final int _SC_PRIORITY_SCHEDULING = 10;
    private static final int _SC_TIMERS = 11;
    private static final int _SC_ASYNCHRONOUS_IO = 12;
    private static final int _SC_PRIORITIZED_IO = 13;
    private static final int _SC_SYNCHRONIZED_IO = 14;
    private static final int _SC_FSYNC = 15;
    private static final int _SC_MAPPED_FILES = 16;
    private static final int _SC_MEMLOCK = 17;
    private static final int _SC_MEMLOCK_RANGE = 18;
    private static final int _SC_MEMORY_PROTECTION = 19;
    private static final int _SC_MESSAGE_PASSING = 20;
    private static final int _SC_SEMAPHORES = 21;
    private static final int _SC_SHARED_MEMORY_OBJECTS = 22;
    private static final int _SC_AIO_LISTIO_MAX = 23;
    private static final int _SC_AIO_MAX = 24;
    private static final int _SC_AIO_PRIO_DELTA_MAX = 25;
    private static final int _SC_DELAYTIMER_MAX = 26;
    private static final int _SC_MQ_OPEN_MAX = 27;
    private static final int _SC_MQ_PRIO_MAX = 28;
    private static final int _SC_VERSION = 29;
    private static final int _SC_PAGESIZE = 30;
    private static final int _SC_RTSIG_MAX = 31;
    private static final int _SC_SEM_NSEMS_MAX = 32;
    private static final int _SC_SEM_VALUE_MAX = 33;
    private static final int _SC_SIGQUEUE_MAX = 34;
    private static final int _SC_TIMER_MAX = 35;
    private static final int _SC_BC_BASE_MAX = 36;
    private static final int _SC_BC_DIM_MAX = 37;
    private static final int _SC_BC_SCALE_MAX = 38;
    private static final int _SC_BC_STRING_MAX = 39;
    private static final int _SC_COLL_WEIGHTS_MAX = 40;
    private static final int _SC_EQUIV_CLASS_MAX = 41;
    private static final int _SC_EXPR_NEST_MAX = 42;
    private static final int _SC_LINE_MAX = 43;
    private static final int _SC_RE_DUP_MAX = 44;
    private static final int _SC_CHARCLASS_NAME_MAX = 45;
    private static final int _SC_2_VERSION = 46;
    private static final int _SC_2_C_BIND = 47;
    private static final int _SC_2_C_DEV = 48;
    private static final int _SC_2_FORT_DEV = 49;
    private static final int _SC_2_FORT_RUN = 50;
    private static final int _SC_2_SW_DEV = 51;
    private static final int _SC_2_LOCALEDEF = 52;
    private static final int _SC_PII = 53;
    private static final int _SC_PII_XTI = 54;
    private static final int _SC_PII_SOCKET = 55;
    private static final int _SC_PII_INTERNET = 56;
    private static final int _SC_PII_OSI = 57;
    private static final int _SC_POLL = 58;
    private static final int _SC_SELECT = 59;
    private static final int _SC_UIO_MAXIOV = 60;
    private static final int _SC_IOV_MAX = 60;
    private static final int _SC_PII_INTERNET_STREAM = 61;
    private static final int _SC_PII_INTERNET_DGRAM = 62;
    private static final int _SC_PII_OSI_COTS = 63;
    private static final int _SC_PII_OSI_CLTS = 64;
    private static final int _SC_PII_OSI_M = 65;
    private static final int _SC_T_IOV_MAX = 66;
    private static final int _SC_THREADS = 67;
    private static final int _SC_THREAD_SAFE_FUNCTIONS = 68;
    private static final int _SC_GETGR_R_SIZE_MAX = 69;
    private static final int _SC_GETPW_R_SIZE_MAX = 70;
    private static final int _SC_LOGIN_NAME_MAX = 71;
    private static final int _SC_TTY_NAME_MAX = 72;
    private static final int _SC_THREAD_DESTRUCTOR_ITERATIONS = 73;
    private static final int _SC_THREAD_KEYS_MAX = 74;
    private static final int _SC_THREAD_STACK_MIN = 75;
    private static final int _SC_THREAD_THREADS_MAX = 76;
    private static final int _SC_THREAD_ATTR_STACKADDR = 77;
    private static final int _SC_THREAD_ATTR_STACKSIZE = 78;
    private static final int _SC_THREAD_PRIORITY_SCHEDULING = 79;
    private static final int _SC_THREAD_PRIO_INHERIT = 80;
    private static final int _SC_THREAD_PRIO_PROTECT = 81;
    private static final int _SC_THREAD_PROCESS_SHARED = 82;
    private static final int _SC_NPROCESSORS_CONF = 83;
    private static final int _SC_NPROCESSORS_ONLN = 84;
    private static final int _SC_PHYS_PAGES = 85;
    private static final int _SC_AVPHYS_PAGES = 86;
    private static final int _SC_ATEXIT_MAX = 87;
    private static final int _SC_PASS_MAX = 88;
    private static final int _SC_XOPEN_VERSION = 89;
    private static final int _SC_XOPEN_XCU_VERSION = 90;
    private static final int _SC_XOPEN_UNIX = 91;
    private static final int _SC_XOPEN_CRYPT = 92;
    private static final int _SC_XOPEN_ENH_I18N = 93;
    private static final int _SC_XOPEN_SHM = 94;
    private static final int _SC_2_CHAR_TERM = 95;
    private static final int _SC_2_C_VERSION = 96;
    private static final int _SC_2_UPE = 97;
    private static final int _SC_XOPEN_XPG2 = 98;
    private static final int _SC_XOPEN_XPG3 = 99;
    private static final int _SC_XOPEN_XPG4 = 100;
    private static final int _SC_CHAR_BIT = 101;
    private static final int _SC_CHAR_MAX = 102;
    private static final int _SC_CHAR_MIN = 103;
    private static final int _SC_INT_MAX = 104;
    private static final int _SC_INT_MIN = 105;
    private static final int _SC_LONG_BIT = 106;
    private static final int _SC_WORD_BIT = 107;
    private static final int _SC_MB_LEN_MAX = 108;
    private static final int _SC_NZERO = 109;
    private static final int _SC_SSIZE_MAX = 110;
    private static final int _SC_SCHAR_MAX = 111;
    private static final int _SC_SCHAR_MIN = 112;
    private static final int _SC_SHRT_MAX = 113;
    private static final int _SC_SHRT_MIN = 114;
    private static final int _SC_UCHAR_MAX = 115;
    private static final int _SC_UINT_MAX = 116;
    private static final int _SC_ULONG_MAX = 117;
    private static final int _SC_USHRT_MAX = 118;
    private static final int _SC_NL_ARGMAX = 119;
    private static final int _SC_NL_LANGMAX = 120;
    private static final int _SC_NL_MSGMAX = 121;
    private static final int _SC_NL_NMAX = 122;
    private static final int _SC_NL_SETMAX = 123;
    private static final int _SC_NL_TEXTMAX = 124;
    private static final int _SC_XBS5_ILP32_OFF32 = 125;
    private static final int _SC_XBS5_ILP32_OFFBIG = 126;
    private static final int _SC_XBS5_LP64_OFF64 = 127;
    private static final int _SC_XBS5_LPBIG_OFFBIG = 128;
    private static final int _SC_XOPEN_LEGACY = 129;
    private static final int _SC_XOPEN_REALTIME = 130;
    private static final int _SC_XOPEN_REALTIME_THREADS = 131;
    private static final int _SC_ADVISORY_INFO = 132;
    private static final int _SC_BARRIERS = 133;
    private static final int _SC_BASE = 134;
    private static final int _SC_C_LANG_SUPPORT = 135;
    private static final int _SC_C_LANG_SUPPORT_R = 136;
    private static final int _SC_CLOCK_SELECTION = 137;
    private static final int _SC_CPUTIME = 138;
    private static final int _SC_THREAD_CPUTIME = 139;
    private static final int _SC_DEVICE_IO = 140;
    private static final int _SC_DEVICE_SPECIFIC = 141;
    private static final int _SC_DEVICE_SPECIFIC_R = 142;
    private static final int _SC_FD_MGMT = 143;
    private static final int _SC_FIFO = 144;
    private static final int _SC_PIPE = 145;
    private static final int _SC_FILE_ATTRIBUTES = 146;
    private static final int _SC_FILE_LOCKING = 147;
    private static final int _SC_FILE_SYSTEM = 148;
    private static final int _SC_MONOTONIC_CLOCK = 149;
    private static final int _SC_MULTI_PROCESS = 150;
    private static final int _SC_SINGLE_PROCESS = 151;
    private static final int _SC_NETWORKING = 152;
    private static final int _SC_READER_WRITER_LOCKS = 153;
    private static final int _SC_SPIN_LOCKS = 154;
    private static final int _SC_REGEXP = 155;
    private static final int _SC_REGEX_VERSION = 156;
    private static final int _SC_SHELL = 157;
    private static final int _SC_SIGNALS = 158;
    private static final int _SC_SPAWN = 159;
    private static final int _SC_SPORADIC_SERVER = 160;
    private static final int _SC_THREAD_SPORADIC_SERVER = 161;
    private static final int _SC_SYSTEM_DATABASE = 162;
    private static final int _SC_SYSTEM_DATABASE_R = 163;
    private static final int _SC_TIMEOUTS = 164;
    private static final int _SC_TYPED_MEMORY_OBJECTS = 165;
    private static final int _SC_USER_GROUPS = 166;
    private static final int _SC_USER_GROUPS_R = 167;
    private static final int _SC_2_PBS = 168;
    private static final int _SC_2_PBS_ACCOUNTING = 169;
    private static final int _SC_2_PBS_LOCATE = 170;
    private static final int _SC_2_PBS_MESSAGE = 171;
    private static final int _SC_2_PBS_TRACK = 172;
    private static final int _SC_SYMLOOP_MAX = 173;
    private static final int _SC_STREAMS = 174;
    private static final int _SC_2_PBS_CHECKPOINT = 175;
    private static final int _SC_V6_ILP32_OFF32 = 176;
    private static final int _SC_V6_ILP32_OFFBIG = 177;
    private static final int _SC_V6_LP64_OFF64 = 178;
    private static final int _SC_V6_LPBIG_OFFBIG = 179;
    private static final int _SC_HOST_NAME_MAX = 180;
    private static final int _SC_TRACE = 181;
    private static final int _SC_TRACE_EVENT_FILTER = 182;
    private static final int _SC_TRACE_INHERIT = 183;
    private static final int _SC_TRACE_LOG = 184;
    private static final int _SC_LEVEL1_ICACHE_SIZE = 185;
    private static final int _SC_LEVEL1_ICACHE_ASSOC = 186;
    private static final int _SC_LEVEL1_ICACHE_LINESIZE = 187;
    private static final int _SC_LEVEL1_DCACHE_SIZE = 188;
    private static final int _SC_LEVEL1_DCACHE_ASSOC = 189;
    private static final int _SC_LEVEL1_DCACHE_LINESIZE = 190;
    private static final int _SC_LEVEL2_CACHE_SIZE = 191;
    private static final int _SC_LEVEL2_CACHE_ASSOC = 192;
    private static final int _SC_LEVEL2_CACHE_LINESIZE = 193;
    private static final int _SC_LEVEL3_CACHE_SIZE = 194;
    private static final int _SC_LEVEL3_CACHE_ASSOC = 195;
    private static final int _SC_LEVEL3_CACHE_LINESIZE = 196;
    private static final int _SC_LEVEL4_CACHE_SIZE = 197;
    private static final int _SC_LEVEL4_CACHE_ASSOC = 198;
    private static final int _SC_LEVEL4_CACHE_LINESIZE = 199;
    private static final int _SC_IPV6 = 235;
    private static final int _SC_RAW_SOCKETS = 236;
    private static final int _SC_V7_ILP32_OFF32 = 237;
    private static final int _SC_V7_ILP32_OFFBIG = 238;
    private static final int _SC_V7_LP64_OFF64 = 239;
    private static final int _SC_V7_LPBIG_OFFBIG = 240;
    private static final int _SC_SS_REPL_MAX = 241;
    private static final int _SC_TRACE_EVENT_NAME_MAX = 242;
    private static final int _SC_TRACE_NAME_MAX = 243;
    private static final int _SC_TRACE_SYS_MAX = 244;
    private static final int _SC_TRACE_USER_EVENT_MAX = 245;
    private static final int _SC_XOPEN_STREAMS = 246;
    private static final int _SC_THREAD_ROBUST_PRIO_INHERIT = 247;
    private static final int _SC_THREAD_ROBUST_PRIO_PROTECT = 248;
    private static final int _SC_MINSIGSTKSZ = 249;
    private static final int _SC_SIGSTKSZ = 250;
    private static final int _CS_PATH = 0;
    private static final int _CS_V6_WIDTH_RESTRICTED_ENVS = 1;
    private static final int _CS_GNU_LIBC_VERSION = 2;
    private static final int _CS_GNU_LIBPTHREAD_VERSION = 3;
    private static final int _CS_V5_WIDTH_RESTRICTED_ENVS = 4;
    private static final int _CS_V7_WIDTH_RESTRICTED_ENVS = 5;
    private static final int _CS_LFS_CFLAGS = 1000;
    private static final int _CS_LFS_LDFLAGS = 1001;
    private static final int _CS_LFS_LIBS = 1002;
    private static final int _CS_LFS_LINTFLAGS = 1003;
    private static final int _CS_LFS64_CFLAGS = 1004;
    private static final int _CS_LFS64_LDFLAGS = 1005;
    private static final int _CS_LFS64_LIBS = 1006;
    private static final int _CS_LFS64_LINTFLAGS = 1007;
    private static final int _CS_XBS5_ILP32_OFF32_CFLAGS = 1100;
    private static final int _CS_XBS5_ILP32_OFF32_LDFLAGS = 1101;
    private static final int _CS_XBS5_ILP32_OFF32_LIBS = 1102;
    private static final int _CS_XBS5_ILP32_OFF32_LINTFLAGS = 1103;
    private static final int _CS_XBS5_ILP32_OFFBIG_CFLAGS = 1104;
    private static final int _CS_XBS5_ILP32_OFFBIG_LDFLAGS = 1105;
    private static final int _CS_XBS5_ILP32_OFFBIG_LIBS = 1106;
    private static final int _CS_XBS5_ILP32_OFFBIG_LINTFLAGS = 1107;
    private static final int _CS_XBS5_LP64_OFF64_CFLAGS = 1108;
    private static final int _CS_XBS5_LP64_OFF64_LDFLAGS = 1109;
    private static final int _CS_XBS5_LP64_OFF64_LIBS = 1110;
    private static final int _CS_XBS5_LP64_OFF64_LINTFLAGS = 1111;
    private static final int _CS_XBS5_LPBIG_OFFBIG_CFLAGS = 1112;
    private static final int _CS_XBS5_LPBIG_OFFBIG_LDFLAGS = 1113;
    private static final int _CS_XBS5_LPBIG_OFFBIG_LIBS = 1114;
    private static final int _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS = 1115;
    private static final int _CS_POSIX_V6_ILP32_OFF32_CFLAGS = 1116;
    private static final int _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = 1117;
    private static final int _CS_POSIX_V6_ILP32_OFF32_LIBS = 1118;
    private static final int _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS = 1119;
    private static final int _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = 1120;
    private static final int _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = 1121;
    private static final int _CS_POSIX_V6_ILP32_OFFBIG_LIBS = 1122;
    private static final int _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS = 1123;
    private static final int _CS_POSIX_V6_LP64_OFF64_CFLAGS = 1124;
    private static final int _CS_POSIX_V6_LP64_OFF64_LDFLAGS = 1125;
    private static final int _CS_POSIX_V6_LP64_OFF64_LIBS = 1126;
    private static final int _CS_POSIX_V6_LP64_OFF64_LINTFLAGS = 1127;
    private static final int _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = 1128;
    private static final int _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = 1129;
    private static final int _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = 1130;
    private static final int _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS = 1131;
    private static final int _CS_POSIX_V7_ILP32_OFF32_CFLAGS = 1132;
    private static final int _CS_POSIX_V7_ILP32_OFF32_LDFLAGS = 1133;
    private static final int _CS_POSIX_V7_ILP32_OFF32_LIBS = 1134;
    private static final int _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS = 1135;
    private static final int _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS = 1136;
    private static final int _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS = 1137;
    private static final int _CS_POSIX_V7_ILP32_OFFBIG_LIBS = 1138;
    private static final int _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS = 1139;
    private static final int _CS_POSIX_V7_LP64_OFF64_CFLAGS = 1140;
    private static final int _CS_POSIX_V7_LP64_OFF64_LDFLAGS = 1141;
    private static final int _CS_POSIX_V7_LP64_OFF64_LIBS = 1142;
    private static final int _CS_POSIX_V7_LP64_OFF64_LINTFLAGS = 1143;
    private static final int _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS = 1144;
    private static final int _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS = 1145;
    private static final int _CS_POSIX_V7_LPBIG_OFFBIG_LIBS = 1146;
    private static final int _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS = 1147;
    private static final int _CS_V6_ENV = 1148;
    private static final int _CS_V7_ENV = 1149;
    private static final int TPACKET_V1 = 0;
    private static final int TPACKET_V2 = 1;
    private static final int TPACKET_V3 = 2;
    private static final int IPV4_DEVCONF_FORWARDING = 1;
    private static final int IPV4_DEVCONF_MC_FORWARDING = 2;
    private static final int IPV4_DEVCONF_PROXY_ARP = 3;
    private static final int IPV4_DEVCONF_ACCEPT_REDIRECTS = 4;
    private static final int IPV4_DEVCONF_SECURE_REDIRECTS = 5;
    private static final int IPV4_DEVCONF_SEND_REDIRECTS = 6;
    private static final int IPV4_DEVCONF_SHARED_MEDIA = 7;
    private static final int IPV4_DEVCONF_RP_FILTER = 8;
    private static final int IPV4_DEVCONF_ACCEPT_SOURCE_ROUTE = 9;
    private static final int IPV4_DEVCONF_BOOTP_RELAY = 10;
    private static final int IPV4_DEVCONF_LOG_MARTIANS = 11;
    private static final int IPV4_DEVCONF_TAG = 12;
    private static final int IPV4_DEVCONF_ARPFILTER = 13;
    private static final int IPV4_DEVCONF_MEDIUM_ID = 14;
    private static final int IPV4_DEVCONF_NOXFRM = 15;
    private static final int IPV4_DEVCONF_NOPOLICY = 16;
    private static final int IPV4_DEVCONF_FORCE_IGMP_VERSION = 17;
    private static final int IPV4_DEVCONF_ARP_ANNOUNCE = 18;
    private static final int IPV4_DEVCONF_ARP_IGNORE = 19;
    private static final int IPV4_DEVCONF_PROMOTE_SECONDARIES = 20;
    private static final int IPV4_DEVCONF_ARP_ACCEPT = 21;
    private static final int IPV4_DEVCONF_ARP_NOTIFY = 22;
    private static final int IPV4_DEVCONF_ACCEPT_LOCAL = 23;
    private static final int IPV4_DEVCONF_SRC_VMARK = 24;
    private static final int IPV4_DEVCONF_PROXY_ARP_PVLAN = 25;
    private static final int IPV4_DEVCONF_ROUTE_LOCALNET = 26;
    private static final int IPV4_DEVCONF_IGMPV2_UNSOLICITED_REPORT_INTERVAL = 27;
    private static final int IPV4_DEVCONF_IGMPV3_UNSOLICITED_REPORT_INTERVAL = 28;
    private static final int IPV4_DEVCONF_IGNORE_ROUTES_WITH_LINKDOWN = 29;
    private static final int IPV4_DEVCONF_DROP_UNICAST_IN_L2_MULTICAST = 30;
    private static final int IPV4_DEVCONF_DROP_GRATUITOUS_ARP = 31;
    private static final int IPV4_DEVCONF_BC_FORWARDING = 32;
    private static final int IPV4_DEVCONF_ARP_EVICT_NOCARRIER = 33;
    private static final int __IPV4_DEVCONF_MAX = 34;
    private static final int DEVCONF_FORWARDING = 0;
    private static final int DEVCONF_HOPLIMIT = 1;
    private static final int DEVCONF_MTU6 = 2;
    private static final int DEVCONF_ACCEPT_RA = 3;
    private static final int DEVCONF_ACCEPT_REDIRECTS = 4;
    private static final int DEVCONF_AUTOCONF = 5;
    private static final int DEVCONF_DAD_TRANSMITS = 6;
    private static final int DEVCONF_RTR_SOLICITS = 7;
    private static final int DEVCONF_RTR_SOLICIT_INTERVAL = 8;
    private static final int DEVCONF_RTR_SOLICIT_DELAY = 9;
    private static final int DEVCONF_USE_TEMPADDR = 10;
    private static final int DEVCONF_TEMP_VALID_LFT = 11;
    private static final int DEVCONF_TEMP_PREFERED_LFT = 12;
    private static final int DEVCONF_REGEN_MAX_RETRY = 13;
    private static final int DEVCONF_MAX_DESYNC_FACTOR = 14;
    private static final int DEVCONF_MAX_ADDRESSES = 15;
    private static final int DEVCONF_FORCE_MLD_VERSION = 16;
    private static final int DEVCONF_ACCEPT_RA_DEFRTR = 17;
    private static final int DEVCONF_ACCEPT_RA_PINFO = 18;
    private static final int DEVCONF_ACCEPT_RA_RTR_PREF = 19;
    private static final int DEVCONF_RTR_PROBE_INTERVAL = 20;
    private static final int DEVCONF_ACCEPT_RA_RT_INFO_MAX_PLEN = 21;
    private static final int DEVCONF_PROXY_NDP = 22;
    private static final int DEVCONF_OPTIMISTIC_DAD = 23;
    private static final int DEVCONF_ACCEPT_SOURCE_ROUTE = 24;
    private static final int DEVCONF_MC_FORWARDING = 25;
    private static final int DEVCONF_DISABLE_IPV6 = 26;
    private static final int DEVCONF_ACCEPT_DAD = 27;
    private static final int DEVCONF_FORCE_TLLAO = 28;
    private static final int DEVCONF_NDISC_NOTIFY = 29;
    private static final int DEVCONF_MLDV1_UNSOLICITED_REPORT_INTERVAL = 30;
    private static final int DEVCONF_MLDV2_UNSOLICITED_REPORT_INTERVAL = 31;
    private static final int DEVCONF_SUPPRESS_FRAG_NDISC = 32;
    private static final int DEVCONF_ACCEPT_RA_FROM_LOCAL = 33;
    private static final int DEVCONF_USE_OPTIMISTIC = 34;
    private static final int DEVCONF_ACCEPT_RA_MTU = 35;
    private static final int DEVCONF_STABLE_SECRET = 36;
    private static final int DEVCONF_USE_OIF_ADDRS_ONLY = 37;
    private static final int DEVCONF_ACCEPT_RA_MIN_HOP_LIMIT = 38;
    private static final int DEVCONF_IGNORE_ROUTES_WITH_LINKDOWN = 39;
    private static final int DEVCONF_DROP_UNICAST_IN_L2_MULTICAST = 40;
    private static final int DEVCONF_DROP_UNSOLICITED_NA = 41;
    private static final int DEVCONF_KEEP_ADDR_ON_DOWN = 42;
    private static final int DEVCONF_RTR_SOLICIT_MAX_INTERVAL = 43;
    private static final int DEVCONF_SEG6_ENABLED = 44;
    private static final int DEVCONF_SEG6_REQUIRE_HMAC = 45;
    private static final int DEVCONF_ENHANCED_DAD = 46;
    private static final int DEVCONF_ADDR_GEN_MODE = 47;
    private static final int DEVCONF_DISABLE_POLICY = 48;
    private static final int DEVCONF_ACCEPT_RA_RT_INFO_MIN_PLEN = 49;
    private static final int DEVCONF_NDISC_TCLASS = 50;
    private static final int DEVCONF_RPL_SEG_ENABLED = 51;
    private static final int DEVCONF_RA_DEFRTR_METRIC = 52;
    private static final int DEVCONF_IOAM6_ENABLED = 53;
    private static final int DEVCONF_IOAM6_ID = 54;
    private static final int DEVCONF_IOAM6_ID_WIDE = 55;
    private static final int DEVCONF_NDISC_EVICT_NOCARRIER = 56;
    private static final int DEVCONF_ACCEPT_UNTRACKED_NA = 57;
    private static final int DEVCONF_ACCEPT_RA_MIN_LFT = 58;
    private static final int DEVCONF_MAX = 59;
    public static final ValueLayout.OfShort __kernel_sa_family_t = Lib.C_SHORT;
    private static final int SOCK_STREAM = 1;
    private static final int SOCK_DGRAM = 2;
    private static final int SOCK_RAW = 3;
    private static final int SOCK_RDM = 4;
    private static final int SOCK_SEQPACKET = 5;
    private static final int SOCK_DCCP = 6;
    private static final int SOCK_PACKET = 10;
    private static final int SOCK_CLOEXEC = 524288;
    private static final int SOCK_NONBLOCK = 2048;
    public static final ValueLayout.OfShort sa_family_t = Lib.C_SHORT;
    private static final int MSG_OOB = 1;
    private static final int MSG_PEEK = 2;
    private static final int MSG_DONTROUTE = 4;
    private static final int MSG_CTRUNC = 8;
    private static final int MSG_PROXY = 16;
    private static final int MSG_TRUNC = 32;
    private static final int MSG_DONTWAIT = 64;
    private static final int MSG_EOR = 128;
    private static final int MSG_WAITALL = 256;
    private static final int MSG_FIN = 512;
    private static final int MSG_SYN = 1024;
    private static final int MSG_CONFIRM = 2048;
    private static final int MSG_RST = 4096;
    private static final int MSG_ERRQUEUE = 8192;
    private static final int MSG_NOSIGNAL = 16384;
    private static final int MSG_MORE = 32768;
    private static final int MSG_WAITFORONE = 65536;
    private static final int MSG_BATCH = 262144;
    private static final int MSG_SOCK_DEVMEM = 0x2000000;
    private static final int MSG_ZEROCOPY = 0x4000000;
    private static final int MSG_FASTOPEN = 0x20000000;
    private static final int MSG_CMSG_CLOEXEC = 0x40000000;
    private static final int SCM_RIGHTS = 1;
    private static final int SHUT_RD = 0;
    private static final int SHUT_WR = 1;
    private static final int SHUT_RDWR = 2;
    private static final int IFF_UP = 1;
    private static final int IFF_BROADCAST = 2;
    private static final int IFF_DEBUG = 4;
    private static final int IFF_LOOPBACK = 8;
    private static final int IFF_POINTOPOINT = 16;
    private static final int IFF_NOTRAILERS = 32;
    private static final int IFF_RUNNING = 64;
    private static final int IFF_NOARP = 128;
    private static final int IFF_PROMISC = 256;
    private static final int IFF_ALLMULTI = 512;
    private static final int IFF_MASTER = 1024;
    private static final int IFF_SLAVE = 2048;
    private static final int IFF_MULTICAST = 4096;
    private static final int IFF_PORTSEL = 8192;
    private static final int IFF_AUTOMEDIA = 16384;
    private static final int IFF_DYNAMIC = 32768;
    private static final int IFF_LOWER_UP = 65536;
    private static final int IFF_DORMANT = 131072;
    private static final int IFF_ECHO = 262144;
    private static final int IF_OPER_UNKNOWN = 0;
    private static final int IF_OPER_NOTPRESENT = 1;
    private static final int IF_OPER_DOWN = 2;
    private static final int IF_OPER_LOWERLAYERDOWN = 3;
    private static final int IF_OPER_TESTING = 4;
    private static final int IF_OPER_DORMANT = 5;
    private static final int IF_OPER_UP = 6;
    private static final int IF_LINK_MODE_DEFAULT = 0;
    private static final int IF_LINK_MODE_DORMANT = 1;
    private static final int IF_LINK_MODE_TESTING = 2;
    private static final int TCP_FLAG_CWR = 32768;
    private static final int TCP_FLAG_ECE = 16384;
    private static final int TCP_FLAG_URG = 8192;
    private static final int TCP_FLAG_ACK = 4096;
    private static final int TCP_FLAG_PSH = 2048;
    private static final int TCP_FLAG_RST = 1024;
    private static final int TCP_FLAG_SYN = 512;
    private static final int TCP_FLAG_FIN = 256;
    private static final int TCP_RESERVED_BITS = 15;
    private static final int TCP_DATA_OFFSET = 240;
    private static final int TCP_NO_QUEUE = 0;
    private static final int TCP_RECV_QUEUE = 1;
    private static final int TCP_SEND_QUEUE = 2;
    private static final int TCP_QUEUES_NR = 3;
    private static final int TFO_STATUS_UNSPEC = 0;
    private static final int TFO_COOKIE_UNAVAILABLE = 1;
    private static final int TFO_DATA_NOT_ACKED = 2;
    private static final int TFO_SYN_RETRANSMITTED = 3;
    private static final int TCP_CA_Open = 0;
    private static final int TCP_CA_Disorder = 1;
    private static final int TCP_CA_CWR = 2;
    private static final int TCP_CA_Recovery = 3;
    private static final int TCP_CA_Loss = 4;
    private static final int TCP_NLA_PAD = 0;
    private static final int TCP_NLA_BUSY = 1;
    private static final int TCP_NLA_RWND_LIMITED = 2;
    private static final int TCP_NLA_SNDBUF_LIMITED = 3;
    private static final int TCP_NLA_DATA_SEGS_OUT = 4;
    private static final int TCP_NLA_TOTAL_RETRANS = 5;
    private static final int TCP_NLA_PACING_RATE = 6;
    private static final int TCP_NLA_DELIVERY_RATE = 7;
    private static final int TCP_NLA_SND_CWND = 8;
    private static final int TCP_NLA_REORDERING = 9;
    private static final int TCP_NLA_MIN_RTT = 10;
    private static final int TCP_NLA_RECUR_RETRANS = 11;
    private static final int TCP_NLA_DELIVERY_RATE_APP_LMT = 12;
    private static final int TCP_NLA_SNDQ_SIZE = 13;
    private static final int TCP_NLA_CA_STATE = 14;
    private static final int TCP_NLA_SND_SSTHRESH = 15;
    private static final int TCP_NLA_DELIVERED = 16;
    private static final int TCP_NLA_DELIVERED_CE = 17;
    private static final int TCP_NLA_BYTES_SENT = 18;
    private static final int TCP_NLA_BYTES_RETRANS = 19;
    private static final int TCP_NLA_DSACK_DUPS = 20;
    private static final int TCP_NLA_REORD_SEEN = 21;
    private static final int TCP_NLA_SRTT = 22;
    private static final int TCP_NLA_TIMEOUT_REHASH = 23;
    private static final int TCP_NLA_BYTES_NOTSENT = 24;
    private static final int TCP_NLA_EDT = 25;
    private static final int TCP_NLA_TTL = 26;
    private static final int TCP_NLA_REHASH = 27;
    private static final int IPPROTO_IP = 0;
    private static final int IPPROTO_ICMP = 1;
    private static final int IPPROTO_IGMP = 2;
    private static final int IPPROTO_IPIP = 4;
    private static final int IPPROTO_TCP = 6;
    private static final int IPPROTO_EGP = 8;
    private static final int IPPROTO_PUP = 12;
    private static final int IPPROTO_UDP = 17;
    private static final int IPPROTO_IDP = 22;
    private static final int IPPROTO_TP = 29;
    private static final int IPPROTO_DCCP = 33;
    private static final int IPPROTO_IPV6 = 41;
    private static final int IPPROTO_RSVP = 46;
    private static final int IPPROTO_GRE = 47;
    private static final int IPPROTO_ESP = 50;
    private static final int IPPROTO_AH = 51;
    private static final int IPPROTO_MTP = 92;
    private static final int IPPROTO_BEETPH = 94;
    private static final int IPPROTO_ENCAP = 98;
    private static final int IPPROTO_PIM = 103;
    private static final int IPPROTO_COMP = 108;
    private static final int IPPROTO_L2TP = 115;
    private static final int IPPROTO_SCTP = 132;
    private static final int IPPROTO_UDPLITE = 136;
    private static final int IPPROTO_MPLS = 137;
    private static final int IPPROTO_ETHERNET = 143;
    private static final int IPPROTO_AGGFRAG = 144;
    private static final int IPPROTO_RAW = 255;
    private static final int IPPROTO_SMC = 256;
    private static final int IPPROTO_MPTCP = 262;
    private static final int IPPROTO_MAX = 263;
    public static final ValueLayout.OfLong __cpu_mask = Lib.C_LONG;
    private static final int BPF_FROM_LE = 0;
    private static final int BPF_FROM_BE = 8;
    private static final int BPF_XCHG = 225;
    private static final int BPF_CMPXCHG = 241;
    private static final int MAX_BPF_REG = 11;
    private static final int MAX_BPF_ATTACH_TYPE = 58;
    private static final int MAX_BPF_LINK_TYPE = 15;
    private static final int BPF_F_ALLOW_OVERRIDE = 1;
    private static final int BPF_F_ALLOW_MULTI = 2;
    private static final int BPF_F_REPLACE = 4;
    private static final int BPF_F_BEFORE = 8;
    private static final int BPF_F_AFTER = 16;
    private static final int BPF_F_ID = 32;
    private static final int BPF_F_STRICT_ALIGNMENT = 1;
    private static final int BPF_F_ANY_ALIGNMENT = 2;
    private static final int BPF_F_TEST_RND_HI32 = 4;
    private static final int BPF_F_TEST_STATE_FREQ = 8;
    private static final int BPF_F_SLEEPABLE = 16;
    private static final int BPF_F_XDP_HAS_FRAGS = 32;
    private static final int BPF_F_XDP_DEV_BOUND_ONLY = 64;
    private static final int BPF_F_TEST_REG_INVARIANTS = 128;
    private static final int BPF_F_NETFILTER_IP_DEFRAG = 1;
    private static final int BPF_F_QUERY_EFFECTIVE = 1;
    private static final int BPF_F_TEST_RUN_ON_CPU = 1;
    private static final int BPF_F_TEST_XDP_LIVE_FRAMES = 2;
    private static final int BPF_F_TEST_SKB_CHECKSUM_COMPLETE = 4;
    private static final int BPF_OBJ_NAME_LEN = 16;
    private static final int BPF_F_REDIRECT_FLAGS = 25;
    private static final MemorySegment NULL = MemorySegment.ofAddress((long)0L);
    private static final long _POSIX_C_SOURCE = 200809L;
    private static final int __TIMESIZE = 64;
    private static final long __STDC_IEC_60559_BFP__ = 201404L;
    private static final long __STDC_IEC_60559_COMPLEX__ = 201404L;
    private static final long __STDC_ISO_10646__ = 201706L;
    private static final int __WCHAR_MAX = Integer.MAX_VALUE;
    private static final int __WCHAR_MIN = Integer.MIN_VALUE;
    private static final int INT8_MIN = -128;
    private static final int INT16_MIN = Short.MIN_VALUE;
    private static final int INT32_MIN = Integer.MIN_VALUE;
    private static final long INT64_MIN = Long.MIN_VALUE;
    private static final int INT8_MAX = 127;
    private static final int INT16_MAX = Short.MAX_VALUE;
    private static final int INT32_MAX = Integer.MAX_VALUE;
    private static final long INT64_MAX = Long.MAX_VALUE;
    private static final int UINT8_MAX = 255;
    private static final int UINT16_MAX = 65535;
    private static final int UINT32_MAX = -1;
    private static final long UINT64_MAX = -1L;
    private static final int INT_LEAST8_MIN = -128;
    private static final int INT_LEAST16_MIN = Short.MIN_VALUE;
    private static final int INT_LEAST32_MIN = Integer.MIN_VALUE;
    private static final long INT_LEAST64_MIN = Long.MIN_VALUE;
    private static final int INT_LEAST8_MAX = 127;
    private static final int INT_LEAST16_MAX = Short.MAX_VALUE;
    private static final int INT_LEAST32_MAX = Integer.MAX_VALUE;
    private static final long INT_LEAST64_MAX = Long.MAX_VALUE;
    private static final int UINT_LEAST8_MAX = 255;
    private static final int UINT_LEAST16_MAX = 65535;
    private static final int UINT_LEAST32_MAX = -1;
    private static final long UINT_LEAST64_MAX = -1L;
    private static final int INT_FAST8_MIN = -128;
    private static final long INT_FAST16_MIN = Long.MIN_VALUE;
    private static final long INT_FAST32_MIN = Long.MIN_VALUE;
    private static final long INT_FAST64_MIN = Long.MIN_VALUE;
    private static final int INT_FAST8_MAX = 127;
    private static final long INT_FAST16_MAX = Long.MAX_VALUE;
    private static final long INT_FAST32_MAX = Long.MAX_VALUE;
    private static final long INT_FAST64_MAX = Long.MAX_VALUE;
    private static final int UINT_FAST8_MAX = 255;
    private static final long UINT_FAST16_MAX = -1L;
    private static final long UINT_FAST32_MAX = -1L;
    private static final long UINT_FAST64_MAX = -1L;
    private static final long INTPTR_MIN = Long.MIN_VALUE;
    private static final long INTPTR_MAX = Long.MAX_VALUE;
    private static final long UINTPTR_MAX = -1L;
    private static final long INTMAX_MIN = Long.MIN_VALUE;
    private static final long INTMAX_MAX = Long.MAX_VALUE;
    private static final long UINTMAX_MAX = -1L;
    private static final long PTRDIFF_MIN = Long.MIN_VALUE;
    private static final long PTRDIFF_MAX = Long.MAX_VALUE;
    private static final int SIG_ATOMIC_MIN = Integer.MIN_VALUE;
    private static final int SIG_ATOMIC_MAX = Integer.MAX_VALUE;
    private static final long SIZE_MAX = -1L;
    private static final int WCHAR_MIN = Integer.MIN_VALUE;
    private static final int WCHAR_MAX = Integer.MAX_VALUE;
    private static final int WINT_MIN = 0;
    private static final int WINT_MAX = -1;
    private static final int BPF_LOG_BUF_SIZE = 0xFFFFFF;
    private static final int EOF = -1;
    private static final int __HAVE_DISTINCT_FLOAT16 = 0;
    private static final int __HAVE_DISTINCT_FLOAT128X = 0;
    private static final int __HAVE_FLOAT128_UNLIKE_LDBL = 1;
    private static final int __BYTE_ORDER = 1234;
    private static final int __FLOAT_WORD_ORDER = 1234;
    private static final int LITTLE_ENDIAN = 1234;
    private static final int BIG_ENDIAN = 4321;
    private static final int PDP_ENDIAN = 3412;
    private static final int BYTE_ORDER = 1234;
    private static final long _SIGSET_NWORDS = 16L;
    private static final int __NFDBITS = 64;
    private static final int FD_SETSIZE = 1024;
    private static final int NFDBITS = 64;
    private static final int __PTHREAD_RWLOCK_ELISION_EXTRA = 0;
    private static final int BTF_INT_SIGNED = 1;
    private static final int BTF_INT_CHAR = 2;
    private static final int BTF_INT_BOOL = 4;
    private static final int EWOULDBLOCK = 11;
    private static final int EDEADLOCK = 35;
    private static final int ENOTSUP = 95;
    private static final long _POSIX_VERSION = 200809L;
    private static final long __POSIX2_THIS_VERSION = 200809L;
    private static final long _POSIX2_VERSION = 200809L;
    private static final long _POSIX2_C_VERSION = 200809L;
    private static final long _POSIX2_C_BIND = 200809L;
    private static final long _POSIX2_C_DEV = 200809L;
    private static final long _POSIX2_SW_DEV = 200809L;
    private static final long _POSIX2_LOCALEDEF = 200809L;
    private static final long _POSIX_PRIORITY_SCHEDULING = 200809L;
    private static final long _POSIX_SYNCHRONIZED_IO = 200809L;
    private static final long _POSIX_FSYNC = 200809L;
    private static final long _POSIX_MAPPED_FILES = 200809L;
    private static final long _POSIX_MEMLOCK = 200809L;
    private static final long _POSIX_MEMLOCK_RANGE = 200809L;
    private static final long _POSIX_MEMORY_PROTECTION = 200809L;
    private static final int _POSIX_VDISABLE = 0;
    private static final long _POSIX_THREADS = 200809L;
    private static final long _POSIX_THREAD_SAFE_FUNCTIONS = 200809L;
    private static final long _POSIX_THREAD_PRIORITY_SCHEDULING = 200809L;
    private static final long _POSIX_THREAD_ATTR_STACKSIZE = 200809L;
    private static final long _POSIX_THREAD_ATTR_STACKADDR = 200809L;
    private static final long _POSIX_THREAD_PRIO_INHERIT = 200809L;
    private static final long _POSIX_THREAD_PRIO_PROTECT = 200809L;
    private static final long _POSIX_THREAD_ROBUST_PRIO_INHERIT = 200809L;
    private static final int _POSIX_THREAD_ROBUST_PRIO_PROTECT = -1;
    private static final long _POSIX_SEMAPHORES = 200809L;
    private static final long _POSIX_REALTIME_SIGNALS = 200809L;
    private static final long _POSIX_ASYNCHRONOUS_IO = 200809L;
    private static final long _POSIX_PRIORITIZED_IO = 200809L;
    private static final long _POSIX_SHARED_MEMORY_OBJECTS = 200809L;
    private static final long _POSIX_READER_WRITER_LOCKS = 200809L;
    private static final long _POSIX_TIMEOUTS = 200809L;
    private static final long _POSIX_SPIN_LOCKS = 200809L;
    private static final long _POSIX_SPAWN = 200809L;
    private static final long _POSIX_TIMERS = 200809L;
    private static final long _POSIX_BARRIERS = 200809L;
    private static final long _POSIX_MESSAGE_PASSING = 200809L;
    private static final long _POSIX_THREAD_PROCESS_SHARED = 200809L;
    private static final long _POSIX_CLOCK_SELECTION = 200809L;
    private static final long _POSIX_ADVISORY_INFO = 200809L;
    private static final long _POSIX_IPV6 = 200809L;
    private static final long _POSIX_RAW_SOCKETS = 200809L;
    private static final long _POSIX2_CHAR_TERM = 200809L;
    private static final int _POSIX_SPORADIC_SERVER = -1;
    private static final int _POSIX_THREAD_SPORADIC_SERVER = -1;
    private static final int _POSIX_TRACE = -1;
    private static final int _POSIX_TRACE_EVENT_FILTER = -1;
    private static final int _POSIX_TRACE_INHERIT = -1;
    private static final int _POSIX_TRACE_LOG = -1;
    private static final int _POSIX_TYPED_MEMORY_OBJECTS = -1;
    private static final int _POSIX_V7_LPBIG_OFFBIG = -1;
    private static final int _POSIX_V6_LPBIG_OFFBIG = -1;
    private static final int _XBS5_LPBIG_OFFBIG = -1;
    private static final int L_SET = 0;
    private static final int L_INCR = 1;
    private static final int L_XTND = 2;
    private static final int _SC_PAGE_SIZE = 30;
    private static final int _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = 1;
    private static final int _CS_POSIX_V5_WIDTH_RESTRICTED_ENVS = 4;
    private static final int _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS = 5;
    private static final int O_NDELAY = 2048;
    private static final int O_FSYNC = 0x101000;
    private static final int __O_TMPFILE = 0x410000;
    private static final int F_GETLK = 5;
    private static final int F_SETLK = 6;
    private static final int F_SETLKW = 7;
    private static final int O_DIRECTORY = 65536;
    private static final int O_NOFOLLOW = 131072;
    private static final int O_CLOEXEC = 524288;
    private static final int O_DSYNC = 4096;
    private static final int O_RSYNC = 0x101000;
    private static final int F_SETOWN = 8;
    private static final int F_GETOWN = 9;
    private static final int FAPPEND = 1024;
    private static final int FFSYNC = 0x101000;
    private static final int FASYNC = 8192;
    private static final int FNONBLOCK = 2048;
    private static final int FNDELAY = 2048;
    private static final int POSIX_FADV_DONTNEED = 4;
    private static final int POSIX_FADV_NOREUSE = 5;
    private static final long UTIME_NOW = 0x3FFFFFFFL;
    private static final long UTIME_OMIT = 0x3FFFFFFEL;
    private static final int S_IFMT = 61440;
    private static final int S_IFDIR = 16384;
    private static final int S_IFCHR = 8192;
    private static final int S_IFBLK = 24576;
    private static final int S_IFREG = 32768;
    private static final int S_IFIFO = 4096;
    private static final int S_IFLNK = 40960;
    private static final int S_IFSOCK = 49152;
    private static final int S_ISUID = 2048;
    private static final int S_ISGID = 1024;
    private static final int S_ISVTX = 512;
    private static final int S_IRUSR = 256;
    private static final int S_IWUSR = 128;
    private static final int S_IXUSR = 64;
    private static final int S_IRWXU = 448;
    private static final int S_IRGRP = 32;
    private static final int S_IWGRP = 16;
    private static final int S_IXGRP = 8;
    private static final int S_IRWXG = 56;
    private static final int S_IROTH = 4;
    private static final int S_IWOTH = 2;
    private static final int S_IXOTH = 1;
    private static final int S_IRWXO = 7;
    private static final int AT_FDCWD = -100;
    private static final int ETH_MAX_MTU = 65535;
    private static final int TP_STATUS_USER = 1;
    private static final int TP_STATUS_COPY = 2;
    private static final int TP_STATUS_LOSING = 4;
    private static final int TP_STATUS_CSUMNOTREADY = 8;
    private static final int TP_STATUS_VLAN_VALID = 16;
    private static final int TP_STATUS_BLK_TMO = 32;
    private static final int TP_STATUS_VLAN_TPID_VALID = 64;
    private static final int TP_STATUS_CSUM_VALID = 128;
    private static final int TP_STATUS_GSO_TCP = 256;
    private static final int TP_STATUS_SEND_REQUEST = 1;
    private static final int TP_STATUS_SENDING = 2;
    private static final int TP_STATUS_WRONG_FORMAT = 4;
    private static final int TP_STATUS_TS_SOFTWARE = 0x20000000;
    private static final int TP_STATUS_TS_SYS_HARDWARE = 0x40000000;
    private static final int TP_STATUS_TS_RAW_HARDWARE = Integer.MIN_VALUE;
    private static final long TPACKET_HDRLEN = 52L;
    private static final long TPACKET2_HDRLEN = 52L;
    private static final long TPACKET3_HDRLEN = 68L;
    private static final int IPOPT_END = 0;
    private static final int IPOPT_NOOP = 1;
    private static final int IPOPT_SEC = 130;

    Lib_1() {
    }

    public static FunctionDescriptor btf__resolve_size$descriptor() {
        return btf__resolve_size.DESC;
    }

    public static MethodHandle btf__resolve_size$handle() {
        return btf__resolve_size.HANDLE;
    }

    public static MemorySegment btf__resolve_size$address() {
        return btf__resolve_size.ADDR;
    }

    public static long btf__resolve_size(MemorySegment btf2, int type_id) {
        MethodHandle mh$ = btf__resolve_size.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__resolve_size", btf2, type_id);
            }
            return mh$.invokeExact(btf2, type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__resolve_type$descriptor() {
        return btf__resolve_type.DESC;
    }

    public static MethodHandle btf__resolve_type$handle() {
        return btf__resolve_type.HANDLE;
    }

    public static MemorySegment btf__resolve_type$address() {
        return btf__resolve_type.ADDR;
    }

    public static int btf__resolve_type(MemorySegment btf2, int type_id) {
        MethodHandle mh$ = btf__resolve_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__resolve_type", btf2, type_id);
            }
            return mh$.invokeExact(btf2, type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__align_of$descriptor() {
        return btf__align_of.DESC;
    }

    public static MethodHandle btf__align_of$handle() {
        return btf__align_of.HANDLE;
    }

    public static MemorySegment btf__align_of$address() {
        return btf__align_of.ADDR;
    }

    public static int btf__align_of(MemorySegment btf2, int id) {
        MethodHandle mh$ = btf__align_of.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__align_of", btf2, id);
            }
            return mh$.invokeExact(btf2, id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__fd$descriptor() {
        return btf__fd.DESC;
    }

    public static MethodHandle btf__fd$handle() {
        return btf__fd.HANDLE;
    }

    public static MemorySegment btf__fd$address() {
        return btf__fd.ADDR;
    }

    public static int btf__fd(MemorySegment btf2) {
        MethodHandle mh$ = btf__fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__fd", btf2);
            }
            return mh$.invokeExact(btf2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__set_fd$descriptor() {
        return btf__set_fd.DESC;
    }

    public static MethodHandle btf__set_fd$handle() {
        return btf__set_fd.HANDLE;
    }

    public static MemorySegment btf__set_fd$address() {
        return btf__set_fd.ADDR;
    }

    public static void btf__set_fd(MemorySegment btf2, int fd2) {
        MethodHandle mh$ = btf__set_fd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__set_fd", btf2, fd2);
            }
            mh$.invokeExact(btf2, fd2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__raw_data$descriptor() {
        return btf__raw_data.DESC;
    }

    public static MethodHandle btf__raw_data$handle() {
        return btf__raw_data.HANDLE;
    }

    public static MemorySegment btf__raw_data$address() {
        return btf__raw_data.ADDR;
    }

    public static MemorySegment btf__raw_data(MemorySegment btf2, MemorySegment size) {
        MethodHandle mh$ = btf__raw_data.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__raw_data", btf2, size);
            }
            return mh$.invokeExact(btf2, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__name_by_offset$descriptor() {
        return btf__name_by_offset.DESC;
    }

    public static MethodHandle btf__name_by_offset$handle() {
        return btf__name_by_offset.HANDLE;
    }

    public static MemorySegment btf__name_by_offset$address() {
        return btf__name_by_offset.ADDR;
    }

    public static MemorySegment btf__name_by_offset(MemorySegment btf2, int offset) {
        MethodHandle mh$ = btf__name_by_offset.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__name_by_offset", btf2, offset);
            }
            return mh$.invokeExact(btf2, offset);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__str_by_offset$descriptor() {
        return btf__str_by_offset.DESC;
    }

    public static MethodHandle btf__str_by_offset$handle() {
        return btf__str_by_offset.HANDLE;
    }

    public static MemorySegment btf__str_by_offset$address() {
        return btf__str_by_offset.ADDR;
    }

    public static MemorySegment btf__str_by_offset(MemorySegment btf2, int offset) {
        MethodHandle mh$ = btf__str_by_offset.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__str_by_offset", btf2, offset);
            }
            return mh$.invokeExact(btf2, offset);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_ext__new$descriptor() {
        return btf_ext__new.DESC;
    }

    public static MethodHandle btf_ext__new$handle() {
        return btf_ext__new.HANDLE;
    }

    public static MemorySegment btf_ext__new$address() {
        return btf_ext__new.ADDR;
    }

    public static MemorySegment btf_ext__new(MemorySegment data, int size) {
        MethodHandle mh$ = btf_ext__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_ext__new", data, size);
            }
            return mh$.invokeExact(data, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_ext__free$descriptor() {
        return btf_ext__free.DESC;
    }

    public static MethodHandle btf_ext__free$handle() {
        return btf_ext__free.HANDLE;
    }

    public static MemorySegment btf_ext__free$address() {
        return btf_ext__free.ADDR;
    }

    public static void btf_ext__free(MemorySegment btf_ext) {
        MethodHandle mh$ = btf_ext__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_ext__free", btf_ext);
            }
            mh$.invokeExact(btf_ext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_ext__raw_data$descriptor() {
        return btf_ext__raw_data.DESC;
    }

    public static MethodHandle btf_ext__raw_data$handle() {
        return btf_ext__raw_data.HANDLE;
    }

    public static MemorySegment btf_ext__raw_data$address() {
        return btf_ext__raw_data.ADDR;
    }

    public static MemorySegment btf_ext__raw_data(MemorySegment btf_ext, MemorySegment size) {
        MethodHandle mh$ = btf_ext__raw_data.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_ext__raw_data", btf_ext, size);
            }
            return mh$.invokeExact(btf_ext, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_ext__endianness$descriptor() {
        return btf_ext__endianness.DESC;
    }

    public static MethodHandle btf_ext__endianness$handle() {
        return btf_ext__endianness.HANDLE;
    }

    public static MemorySegment btf_ext__endianness$address() {
        return btf_ext__endianness.ADDR;
    }

    public static int btf_ext__endianness(MemorySegment btf_ext) {
        MethodHandle mh$ = btf_ext__endianness.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_ext__endianness", btf_ext);
            }
            return mh$.invokeExact(btf_ext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_ext__set_endianness$descriptor() {
        return btf_ext__set_endianness.DESC;
    }

    public static MethodHandle btf_ext__set_endianness$handle() {
        return btf_ext__set_endianness.HANDLE;
    }

    public static MemorySegment btf_ext__set_endianness$address() {
        return btf_ext__set_endianness.ADDR;
    }

    public static int btf_ext__set_endianness(MemorySegment btf_ext, int endian) {
        MethodHandle mh$ = btf_ext__set_endianness.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_ext__set_endianness", btf_ext, endian);
            }
            return mh$.invokeExact(btf_ext, endian);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__find_str$descriptor() {
        return btf__find_str.DESC;
    }

    public static MethodHandle btf__find_str$handle() {
        return btf__find_str.HANDLE;
    }

    public static MemorySegment btf__find_str$address() {
        return btf__find_str.ADDR;
    }

    public static int btf__find_str(MemorySegment btf2, MemorySegment s2) {
        MethodHandle mh$ = btf__find_str.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__find_str", btf2, s2);
            }
            return mh$.invokeExact(btf2, s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_str$descriptor() {
        return btf__add_str.DESC;
    }

    public static MethodHandle btf__add_str$handle() {
        return btf__add_str.HANDLE;
    }

    public static MemorySegment btf__add_str$address() {
        return btf__add_str.ADDR;
    }

    public static int btf__add_str(MemorySegment btf2, MemorySegment s2) {
        MethodHandle mh$ = btf__add_str.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_str", btf2, s2);
            }
            return mh$.invokeExact(btf2, s2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_type$descriptor() {
        return btf__add_type.DESC;
    }

    public static MethodHandle btf__add_type$handle() {
        return btf__add_type.HANDLE;
    }

    public static MemorySegment btf__add_type$address() {
        return btf__add_type.ADDR;
    }

    public static int btf__add_type(MemorySegment btf2, MemorySegment src_btf, MemorySegment src_type) {
        MethodHandle mh$ = btf__add_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_type", btf2, src_btf, src_type);
            }
            return mh$.invokeExact(btf2, src_btf, src_type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_btf$descriptor() {
        return btf__add_btf.DESC;
    }

    public static MethodHandle btf__add_btf$handle() {
        return btf__add_btf.HANDLE;
    }

    public static MemorySegment btf__add_btf$address() {
        return btf__add_btf.ADDR;
    }

    public static int btf__add_btf(MemorySegment btf2, MemorySegment src_btf) {
        MethodHandle mh$ = btf__add_btf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_btf", btf2, src_btf);
            }
            return mh$.invokeExact(btf2, src_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_int$descriptor() {
        return btf__add_int.DESC;
    }

    public static MethodHandle btf__add_int$handle() {
        return btf__add_int.HANDLE;
    }

    public static MemorySegment btf__add_int$address() {
        return btf__add_int.ADDR;
    }

    public static int btf__add_int(MemorySegment btf2, MemorySegment name, long byte_sz, int encoding) {
        MethodHandle mh$ = btf__add_int.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_int", btf2, name, byte_sz, encoding);
            }
            return mh$.invokeExact(btf2, name, byte_sz, encoding);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_float$descriptor() {
        return btf__add_float.DESC;
    }

    public static MethodHandle btf__add_float$handle() {
        return btf__add_float.HANDLE;
    }

    public static MemorySegment btf__add_float$address() {
        return btf__add_float.ADDR;
    }

    public static int btf__add_float(MemorySegment btf2, MemorySegment name, long byte_sz) {
        MethodHandle mh$ = btf__add_float.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_float", btf2, name, byte_sz);
            }
            return mh$.invokeExact(btf2, name, byte_sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_ptr$descriptor() {
        return btf__add_ptr.DESC;
    }

    public static MethodHandle btf__add_ptr$handle() {
        return btf__add_ptr.HANDLE;
    }

    public static MemorySegment btf__add_ptr$address() {
        return btf__add_ptr.ADDR;
    }

    public static int btf__add_ptr(MemorySegment btf2, int ref_type_id) {
        MethodHandle mh$ = btf__add_ptr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_ptr", btf2, ref_type_id);
            }
            return mh$.invokeExact(btf2, ref_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_array$descriptor() {
        return btf__add_array.DESC;
    }

    public static MethodHandle btf__add_array$handle() {
        return btf__add_array.HANDLE;
    }

    public static MemorySegment btf__add_array$address() {
        return btf__add_array.ADDR;
    }

    public static int btf__add_array(MemorySegment btf2, int index_type_id, int elem_type_id, int nr_elems) {
        MethodHandle mh$ = btf__add_array.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_array", btf2, index_type_id, elem_type_id, nr_elems);
            }
            return mh$.invokeExact(btf2, index_type_id, elem_type_id, nr_elems);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_struct$descriptor() {
        return btf__add_struct.DESC;
    }

    public static MethodHandle btf__add_struct$handle() {
        return btf__add_struct.HANDLE;
    }

    public static MemorySegment btf__add_struct$address() {
        return btf__add_struct.ADDR;
    }

    public static int btf__add_struct(MemorySegment btf2, MemorySegment name, int sz) {
        MethodHandle mh$ = btf__add_struct.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_struct", btf2, name, sz);
            }
            return mh$.invokeExact(btf2, name, sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_union$descriptor() {
        return btf__add_union.DESC;
    }

    public static MethodHandle btf__add_union$handle() {
        return btf__add_union.HANDLE;
    }

    public static MemorySegment btf__add_union$address() {
        return btf__add_union.ADDR;
    }

    public static int btf__add_union(MemorySegment btf2, MemorySegment name, int sz) {
        MethodHandle mh$ = btf__add_union.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_union", btf2, name, sz);
            }
            return mh$.invokeExact(btf2, name, sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_field$descriptor() {
        return btf__add_field.DESC;
    }

    public static MethodHandle btf__add_field$handle() {
        return btf__add_field.HANDLE;
    }

    public static MemorySegment btf__add_field$address() {
        return btf__add_field.ADDR;
    }

    public static int btf__add_field(MemorySegment btf2, MemorySegment name, int field_type_id, int bit_offset, int bit_size) {
        MethodHandle mh$ = btf__add_field.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_field", btf2, name, field_type_id, bit_offset, bit_size);
            }
            return mh$.invokeExact(btf2, name, field_type_id, bit_offset, bit_size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_enum$descriptor() {
        return btf__add_enum.DESC;
    }

    public static MethodHandle btf__add_enum$handle() {
        return btf__add_enum.HANDLE;
    }

    public static MemorySegment btf__add_enum$address() {
        return btf__add_enum.ADDR;
    }

    public static int btf__add_enum(MemorySegment btf2, MemorySegment name, int bytes_sz) {
        MethodHandle mh$ = btf__add_enum.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_enum", btf2, name, bytes_sz);
            }
            return mh$.invokeExact(btf2, name, bytes_sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_enum_value$descriptor() {
        return btf__add_enum_value.DESC;
    }

    public static MethodHandle btf__add_enum_value$handle() {
        return btf__add_enum_value.HANDLE;
    }

    public static MemorySegment btf__add_enum_value$address() {
        return btf__add_enum_value.ADDR;
    }

    public static int btf__add_enum_value(MemorySegment btf2, MemorySegment name, long value) {
        MethodHandle mh$ = btf__add_enum_value.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_enum_value", btf2, name, value);
            }
            return mh$.invokeExact(btf2, name, value);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_enum64$descriptor() {
        return btf__add_enum64.DESC;
    }

    public static MethodHandle btf__add_enum64$handle() {
        return btf__add_enum64.HANDLE;
    }

    public static MemorySegment btf__add_enum64$address() {
        return btf__add_enum64.ADDR;
    }

    public static int btf__add_enum64(MemorySegment btf2, MemorySegment name, int bytes_sz, boolean is_signed) {
        MethodHandle mh$ = btf__add_enum64.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_enum64", btf2, name, bytes_sz, is_signed);
            }
            return mh$.invokeExact(btf2, name, bytes_sz, is_signed);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_enum64_value$descriptor() {
        return btf__add_enum64_value.DESC;
    }

    public static MethodHandle btf__add_enum64_value$handle() {
        return btf__add_enum64_value.HANDLE;
    }

    public static MemorySegment btf__add_enum64_value$address() {
        return btf__add_enum64_value.ADDR;
    }

    public static int btf__add_enum64_value(MemorySegment btf2, MemorySegment name, long value) {
        MethodHandle mh$ = btf__add_enum64_value.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_enum64_value", btf2, name, value);
            }
            return mh$.invokeExact(btf2, name, value);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int BTF_FWD_STRUCT() {
        return 0;
    }

    public static int BTF_FWD_UNION() {
        return 1;
    }

    public static int BTF_FWD_ENUM() {
        return 2;
    }

    public static FunctionDescriptor btf__add_fwd$descriptor() {
        return btf__add_fwd.DESC;
    }

    public static MethodHandle btf__add_fwd$handle() {
        return btf__add_fwd.HANDLE;
    }

    public static MemorySegment btf__add_fwd$address() {
        return btf__add_fwd.ADDR;
    }

    public static int btf__add_fwd(MemorySegment btf2, MemorySegment name, int fwd_kind) {
        MethodHandle mh$ = btf__add_fwd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_fwd", btf2, name, fwd_kind);
            }
            return mh$.invokeExact(btf2, name, fwd_kind);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_typedef$descriptor() {
        return btf__add_typedef.DESC;
    }

    public static MethodHandle btf__add_typedef$handle() {
        return btf__add_typedef.HANDLE;
    }

    public static MemorySegment btf__add_typedef$address() {
        return btf__add_typedef.ADDR;
    }

    public static int btf__add_typedef(MemorySegment btf2, MemorySegment name, int ref_type_id) {
        MethodHandle mh$ = btf__add_typedef.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_typedef", btf2, name, ref_type_id);
            }
            return mh$.invokeExact(btf2, name, ref_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_volatile$descriptor() {
        return btf__add_volatile.DESC;
    }

    public static MethodHandle btf__add_volatile$handle() {
        return btf__add_volatile.HANDLE;
    }

    public static MemorySegment btf__add_volatile$address() {
        return btf__add_volatile.ADDR;
    }

    public static int btf__add_volatile(MemorySegment btf2, int ref_type_id) {
        MethodHandle mh$ = btf__add_volatile.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_volatile", btf2, ref_type_id);
            }
            return mh$.invokeExact(btf2, ref_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_const$descriptor() {
        return btf__add_const.DESC;
    }

    public static MethodHandle btf__add_const$handle() {
        return btf__add_const.HANDLE;
    }

    public static MemorySegment btf__add_const$address() {
        return btf__add_const.ADDR;
    }

    public static int btf__add_const(MemorySegment btf2, int ref_type_id) {
        MethodHandle mh$ = btf__add_const.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_const", btf2, ref_type_id);
            }
            return mh$.invokeExact(btf2, ref_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_restrict$descriptor() {
        return btf__add_restrict.DESC;
    }

    public static MethodHandle btf__add_restrict$handle() {
        return btf__add_restrict.HANDLE;
    }

    public static MemorySegment btf__add_restrict$address() {
        return btf__add_restrict.ADDR;
    }

    public static int btf__add_restrict(MemorySegment btf2, int ref_type_id) {
        MethodHandle mh$ = btf__add_restrict.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_restrict", btf2, ref_type_id);
            }
            return mh$.invokeExact(btf2, ref_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_type_tag$descriptor() {
        return btf__add_type_tag.DESC;
    }

    public static MethodHandle btf__add_type_tag$handle() {
        return btf__add_type_tag.HANDLE;
    }

    public static MemorySegment btf__add_type_tag$address() {
        return btf__add_type_tag.ADDR;
    }

    public static int btf__add_type_tag(MemorySegment btf2, MemorySegment value, int ref_type_id) {
        MethodHandle mh$ = btf__add_type_tag.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_type_tag", btf2, value, ref_type_id);
            }
            return mh$.invokeExact(btf2, value, ref_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_func$descriptor() {
        return btf__add_func.DESC;
    }

    public static MethodHandle btf__add_func$handle() {
        return btf__add_func.HANDLE;
    }

    public static MemorySegment btf__add_func$address() {
        return btf__add_func.ADDR;
    }

    public static int btf__add_func(MemorySegment btf2, MemorySegment name, int linkage, int proto_type_id) {
        MethodHandle mh$ = btf__add_func.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_func", btf2, name, linkage, proto_type_id);
            }
            return mh$.invokeExact(btf2, name, linkage, proto_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_func_proto$descriptor() {
        return btf__add_func_proto.DESC;
    }

    public static MethodHandle btf__add_func_proto$handle() {
        return btf__add_func_proto.HANDLE;
    }

    public static MemorySegment btf__add_func_proto$address() {
        return btf__add_func_proto.ADDR;
    }

    public static int btf__add_func_proto(MemorySegment btf2, int ret_type_id) {
        MethodHandle mh$ = btf__add_func_proto.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_func_proto", btf2, ret_type_id);
            }
            return mh$.invokeExact(btf2, ret_type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_func_param$descriptor() {
        return btf__add_func_param.DESC;
    }

    public static MethodHandle btf__add_func_param$handle() {
        return btf__add_func_param.HANDLE;
    }

    public static MemorySegment btf__add_func_param$address() {
        return btf__add_func_param.ADDR;
    }

    public static int btf__add_func_param(MemorySegment btf2, MemorySegment name, int type_id) {
        MethodHandle mh$ = btf__add_func_param.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_func_param", btf2, name, type_id);
            }
            return mh$.invokeExact(btf2, name, type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_var$descriptor() {
        return btf__add_var.DESC;
    }

    public static MethodHandle btf__add_var$handle() {
        return btf__add_var.HANDLE;
    }

    public static MemorySegment btf__add_var$address() {
        return btf__add_var.ADDR;
    }

    public static int btf__add_var(MemorySegment btf2, MemorySegment name, int linkage, int type_id) {
        MethodHandle mh$ = btf__add_var.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_var", btf2, name, linkage, type_id);
            }
            return mh$.invokeExact(btf2, name, linkage, type_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_datasec$descriptor() {
        return btf__add_datasec.DESC;
    }

    public static MethodHandle btf__add_datasec$handle() {
        return btf__add_datasec.HANDLE;
    }

    public static MemorySegment btf__add_datasec$address() {
        return btf__add_datasec.ADDR;
    }

    public static int btf__add_datasec(MemorySegment btf2, MemorySegment name, int byte_sz) {
        MethodHandle mh$ = btf__add_datasec.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_datasec", btf2, name, byte_sz);
            }
            return mh$.invokeExact(btf2, name, byte_sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_datasec_var_info$descriptor() {
        return btf__add_datasec_var_info.DESC;
    }

    public static MethodHandle btf__add_datasec_var_info$handle() {
        return btf__add_datasec_var_info.HANDLE;
    }

    public static MemorySegment btf__add_datasec_var_info$address() {
        return btf__add_datasec_var_info.ADDR;
    }

    public static int btf__add_datasec_var_info(MemorySegment btf2, int var_type_id, int offset, int byte_sz) {
        MethodHandle mh$ = btf__add_datasec_var_info.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_datasec_var_info", btf2, var_type_id, offset, byte_sz);
            }
            return mh$.invokeExact(btf2, var_type_id, offset, byte_sz);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__add_decl_tag$descriptor() {
        return btf__add_decl_tag.DESC;
    }

    public static MethodHandle btf__add_decl_tag$handle() {
        return btf__add_decl_tag.HANDLE;
    }

    public static MemorySegment btf__add_decl_tag$address() {
        return btf__add_decl_tag.ADDR;
    }

    public static int btf__add_decl_tag(MemorySegment btf2, MemorySegment value, int ref_type_id, int component_idx) {
        MethodHandle mh$ = btf__add_decl_tag.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__add_decl_tag", btf2, value, ref_type_id, component_idx);
            }
            return mh$.invokeExact(btf2, value, ref_type_id, component_idx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__dedup$descriptor() {
        return btf__dedup.DESC;
    }

    public static MethodHandle btf__dedup$handle() {
        return btf__dedup.HANDLE;
    }

    public static MemorySegment btf__dedup$address() {
        return btf__dedup.ADDR;
    }

    public static int btf__dedup(MemorySegment btf2, MemorySegment opts) {
        MethodHandle mh$ = btf__dedup.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__dedup", btf2, opts);
            }
            return mh$.invokeExact(btf2, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf__relocate$descriptor() {
        return btf__relocate.DESC;
    }

    public static MethodHandle btf__relocate$handle() {
        return btf__relocate.HANDLE;
    }

    public static MemorySegment btf__relocate$address() {
        return btf__relocate.ADDR;
    }

    public static int btf__relocate(MemorySegment btf2, MemorySegment base_btf) {
        MethodHandle mh$ = btf__relocate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf__relocate", btf2, base_btf);
            }
            return mh$.invokeExact(btf2, base_btf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_dump__new$descriptor() {
        return btf_dump__new.DESC;
    }

    public static MethodHandle btf_dump__new$handle() {
        return btf_dump__new.HANDLE;
    }

    public static MemorySegment btf_dump__new$address() {
        return btf_dump__new.ADDR;
    }

    public static MemorySegment btf_dump__new(MemorySegment btf2, MemorySegment printf_fn, MemorySegment ctx, MemorySegment opts) {
        MethodHandle mh$ = btf_dump__new.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_dump__new", btf2, printf_fn, ctx, opts);
            }
            return mh$.invokeExact(btf2, printf_fn, ctx, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_dump__free$descriptor() {
        return btf_dump__free.DESC;
    }

    public static MethodHandle btf_dump__free$handle() {
        return btf_dump__free.HANDLE;
    }

    public static MemorySegment btf_dump__free$address() {
        return btf_dump__free.ADDR;
    }

    public static void btf_dump__free(MemorySegment d) {
        MethodHandle mh$ = btf_dump__free.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_dump__free", d);
            }
            mh$.invokeExact(d);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_dump__dump_type$descriptor() {
        return btf_dump__dump_type.DESC;
    }

    public static MethodHandle btf_dump__dump_type$handle() {
        return btf_dump__dump_type.HANDLE;
    }

    public static MemorySegment btf_dump__dump_type$address() {
        return btf_dump__dump_type.ADDR;
    }

    public static int btf_dump__dump_type(MemorySegment d, int id) {
        MethodHandle mh$ = btf_dump__dump_type.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_dump__dump_type", d, id);
            }
            return mh$.invokeExact(d, id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_dump__emit_type_decl$descriptor() {
        return btf_dump__emit_type_decl.DESC;
    }

    public static MethodHandle btf_dump__emit_type_decl$handle() {
        return btf_dump__emit_type_decl.HANDLE;
    }

    public static MemorySegment btf_dump__emit_type_decl$address() {
        return btf_dump__emit_type_decl.ADDR;
    }

    public static int btf_dump__emit_type_decl(MemorySegment d, int id, MemorySegment opts) {
        MethodHandle mh$ = btf_dump__emit_type_decl.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_dump__emit_type_decl", d, id, opts);
            }
            return mh$.invokeExact(d, id, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor btf_dump__dump_type_data$descriptor() {
        return btf_dump__dump_type_data.DESC;
    }

    public static MethodHandle btf_dump__dump_type_data$handle() {
        return btf_dump__dump_type_data.HANDLE;
    }

    public static MemorySegment btf_dump__dump_type_data$address() {
        return btf_dump__dump_type_data.ADDR;
    }

    public static int btf_dump__dump_type_data(MemorySegment d, int id, MemorySegment data, long data_sz, MemorySegment opts) {
        MethodHandle mh$ = btf_dump__dump_type_data.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("btf_dump__dump_type_data", d, id, data, data_sz, opts);
            }
            return mh$.invokeExact(d, id, data, data_sz, opts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __errno_location$descriptor() {
        return __errno_location.DESC;
    }

    public static MethodHandle __errno_location$handle() {
        return __errno_location.HANDLE;
    }

    public static MemorySegment __errno_location$address() {
        return __errno_location.ADDR;
    }

    public static MemorySegment __errno_location() {
        MethodHandle mh$ = __errno_location.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("__errno_location", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor access$descriptor() {
        return access.DESC;
    }

    public static MethodHandle access$handle() {
        return access.HANDLE;
    }

    public static MemorySegment access$address() {
        return access.ADDR;
    }

    public static int access(MemorySegment __name, int __type) {
        MethodHandle mh$ = access.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("access", __name, __type);
            }
            return mh$.invokeExact(__name, __type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor faccessat$descriptor() {
        return faccessat.DESC;
    }

    public static MethodHandle faccessat$handle() {
        return faccessat.HANDLE;
    }

    public static MemorySegment faccessat$address() {
        return faccessat.ADDR;
    }

    public static int faccessat(int __fd, MemorySegment __file, int __type, int __flag) {
        MethodHandle mh$ = faccessat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("faccessat", __fd, __file, __type, __flag);
            }
            return mh$.invokeExact(__fd, __file, __type, __flag);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor lseek$descriptor() {
        return lseek.DESC;
    }

    public static MethodHandle lseek$handle() {
        return lseek.HANDLE;
    }

    public static MemorySegment lseek$address() {
        return lseek.ADDR;
    }

    public static long lseek(int __fd, long __offset, int __whence) {
        MethodHandle mh$ = lseek.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("lseek", __fd, __offset, __whence);
            }
            return mh$.invokeExact(__fd, __offset, __whence);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor close$descriptor() {
        return close.DESC;
    }

    public static MethodHandle close$handle() {
        return close.HANDLE;
    }

    public static MemorySegment close$address() {
        return close.ADDR;
    }

    public static int close(int __fd) {
        MethodHandle mh$ = close.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("close", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor closefrom$descriptor() {
        return closefrom.DESC;
    }

    public static MethodHandle closefrom$handle() {
        return closefrom.HANDLE;
    }

    public static MemorySegment closefrom$address() {
        return closefrom.ADDR;
    }

    public static void closefrom(int __lowfd) {
        MethodHandle mh$ = closefrom.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("closefrom", __lowfd);
            }
            mh$.invokeExact(__lowfd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor read$descriptor() {
        return read.DESC;
    }

    public static MethodHandle read$handle() {
        return read.HANDLE;
    }

    public static MemorySegment read$address() {
        return read.ADDR;
    }

    public static long read(int __fd, MemorySegment __buf, long __nbytes) {
        MethodHandle mh$ = read.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("read", __fd, __buf, __nbytes);
            }
            return mh$.invokeExact(__fd, __buf, __nbytes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor write$descriptor() {
        return write.DESC;
    }

    public static MethodHandle write$handle() {
        return write.HANDLE;
    }

    public static MemorySegment write$address() {
        return write.ADDR;
    }

    public static long write(int __fd, MemorySegment __buf, long __n) {
        MethodHandle mh$ = write.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("write", __fd, __buf, __n);
            }
            return mh$.invokeExact(__fd, __buf, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor pread$descriptor() {
        return pread.DESC;
    }

    public static MethodHandle pread$handle() {
        return pread.HANDLE;
    }

    public static MemorySegment pread$address() {
        return pread.ADDR;
    }

    public static long pread(int __fd, MemorySegment __buf, long __nbytes, long __offset) {
        MethodHandle mh$ = pread.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("pread", __fd, __buf, __nbytes, __offset);
            }
            return mh$.invokeExact(__fd, __buf, __nbytes, __offset);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor pwrite$descriptor() {
        return pwrite.DESC;
    }

    public static MethodHandle pwrite$handle() {
        return pwrite.HANDLE;
    }

    public static MemorySegment pwrite$address() {
        return pwrite.ADDR;
    }

    public static long pwrite(int __fd, MemorySegment __buf, long __n, long __offset) {
        MethodHandle mh$ = pwrite.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("pwrite", __fd, __buf, __n, __offset);
            }
            return mh$.invokeExact(__fd, __buf, __n, __offset);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor pipe$descriptor() {
        return pipe.DESC;
    }

    public static MethodHandle pipe$handle() {
        return pipe.HANDLE;
    }

    public static MemorySegment pipe$address() {
        return pipe.ADDR;
    }

    public static int pipe(MemorySegment __pipedes) {
        MethodHandle mh$ = pipe.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("pipe", __pipedes);
            }
            return mh$.invokeExact(__pipedes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor alarm$descriptor() {
        return alarm.DESC;
    }

    public static MethodHandle alarm$handle() {
        return alarm.HANDLE;
    }

    public static MemorySegment alarm$address() {
        return alarm.ADDR;
    }

    public static int alarm(int __seconds) {
        MethodHandle mh$ = alarm.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("alarm", __seconds);
            }
            return mh$.invokeExact(__seconds);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sleep$descriptor() {
        return sleep.DESC;
    }

    public static MethodHandle sleep$handle() {
        return sleep.HANDLE;
    }

    public static MemorySegment sleep$address() {
        return sleep.ADDR;
    }

    public static int sleep(int __seconds) {
        MethodHandle mh$ = sleep.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sleep", __seconds);
            }
            return mh$.invokeExact(__seconds);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ualarm$descriptor() {
        return ualarm.DESC;
    }

    public static MethodHandle ualarm$handle() {
        return ualarm.HANDLE;
    }

    public static MemorySegment ualarm$address() {
        return ualarm.ADDR;
    }

    public static int ualarm(int __value2, int __interval) {
        MethodHandle mh$ = ualarm.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("ualarm", __value2, __interval);
            }
            return mh$.invokeExact(__value2, __interval);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor usleep$descriptor() {
        return usleep.DESC;
    }

    public static MethodHandle usleep$handle() {
        return usleep.HANDLE;
    }

    public static MemorySegment usleep$address() {
        return usleep.ADDR;
    }

    public static int usleep(int __useconds) {
        MethodHandle mh$ = usleep.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("usleep", __useconds);
            }
            return mh$.invokeExact(__useconds);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor pause$descriptor() {
        return pause.DESC;
    }

    public static MethodHandle pause$handle() {
        return pause.HANDLE;
    }

    public static MemorySegment pause$address() {
        return pause.ADDR;
    }

    public static int pause() {
        MethodHandle mh$ = pause.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("pause", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor chown$descriptor() {
        return chown.DESC;
    }

    public static MethodHandle chown$handle() {
        return chown.HANDLE;
    }

    public static MemorySegment chown$address() {
        return chown.ADDR;
    }

    public static int chown(MemorySegment __file, int __owner, int __group) {
        MethodHandle mh$ = chown.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("chown", __file, __owner, __group);
            }
            return mh$.invokeExact(__file, __owner, __group);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fchown$descriptor() {
        return fchown.DESC;
    }

    public static MethodHandle fchown$handle() {
        return fchown.HANDLE;
    }

    public static MemorySegment fchown$address() {
        return fchown.ADDR;
    }

    public static int fchown(int __fd, int __owner, int __group) {
        MethodHandle mh$ = fchown.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fchown", __fd, __owner, __group);
            }
            return mh$.invokeExact(__fd, __owner, __group);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor lchown$descriptor() {
        return lchown.DESC;
    }

    public static MethodHandle lchown$handle() {
        return lchown.HANDLE;
    }

    public static MemorySegment lchown$address() {
        return lchown.ADDR;
    }

    public static int lchown(MemorySegment __file, int __owner, int __group) {
        MethodHandle mh$ = lchown.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("lchown", __file, __owner, __group);
            }
            return mh$.invokeExact(__file, __owner, __group);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fchownat$descriptor() {
        return fchownat.DESC;
    }

    public static MethodHandle fchownat$handle() {
        return fchownat.HANDLE;
    }

    public static MemorySegment fchownat$address() {
        return fchownat.ADDR;
    }

    public static int fchownat(int __fd, MemorySegment __file, int __owner, int __group, int __flag) {
        MethodHandle mh$ = fchownat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fchownat", __fd, __file, __owner, __group, __flag);
            }
            return mh$.invokeExact(__fd, __file, __owner, __group, __flag);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor chdir$descriptor() {
        return chdir.DESC;
    }

    public static MethodHandle chdir$handle() {
        return chdir.HANDLE;
    }

    public static MemorySegment chdir$address() {
        return chdir.ADDR;
    }

    public static int chdir(MemorySegment __path) {
        MethodHandle mh$ = chdir.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("chdir", __path);
            }
            return mh$.invokeExact(__path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fchdir$descriptor() {
        return fchdir.DESC;
    }

    public static MethodHandle fchdir$handle() {
        return fchdir.HANDLE;
    }

    public static MemorySegment fchdir$address() {
        return fchdir.ADDR;
    }

    public static int fchdir(int __fd) {
        MethodHandle mh$ = fchdir.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fchdir", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getcwd$descriptor() {
        return getcwd.DESC;
    }

    public static MethodHandle getcwd$handle() {
        return getcwd.HANDLE;
    }

    public static MemorySegment getcwd$address() {
        return getcwd.ADDR;
    }

    public static MemorySegment getcwd(MemorySegment __buf, long __size) {
        MethodHandle mh$ = getcwd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getcwd", __buf, __size);
            }
            return mh$.invokeExact(__buf, __size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getwd$descriptor() {
        return getwd.DESC;
    }

    public static MethodHandle getwd$handle() {
        return getwd.HANDLE;
    }

    public static MemorySegment getwd$address() {
        return getwd.ADDR;
    }

    public static MemorySegment getwd(MemorySegment __buf) {
        MethodHandle mh$ = getwd.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getwd", __buf);
            }
            return mh$.invokeExact(__buf);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor dup$descriptor() {
        return dup.DESC;
    }

    public static MethodHandle dup$handle() {
        return dup.HANDLE;
    }

    public static MemorySegment dup$address() {
        return dup.ADDR;
    }

    public static int dup(int __fd) {
        MethodHandle mh$ = dup.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("dup", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor dup2$descriptor() {
        return dup2.DESC;
    }

    public static MethodHandle dup2$handle() {
        return dup2.HANDLE;
    }

    public static MemorySegment dup2$address() {
        return dup2.ADDR;
    }

    public static int dup2(int __fd, int __fd2) {
        MethodHandle mh$ = dup2.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("dup2", __fd, __fd2);
            }
            return mh$.invokeExact(__fd, __fd2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static AddressLayout __environ$layout() {
        return __environ.constants.LAYOUT;
    }

    public static MemorySegment __environ$segment() {
        return __environ.constants.SEGMENT;
    }

    public static MemorySegment __environ() {
        return __environ.constants.SEGMENT.get(__environ.constants.LAYOUT, 0L);
    }

    public static void __environ(MemorySegment varValue) {
        __environ.constants.SEGMENT.set(__environ.constants.LAYOUT, 0L, varValue);
    }

    public static FunctionDescriptor execve$descriptor() {
        return execve.DESC;
    }

    public static MethodHandle execve$handle() {
        return execve.HANDLE;
    }

    public static MemorySegment execve$address() {
        return execve.ADDR;
    }

    public static int execve(MemorySegment __path, MemorySegment __argv, MemorySegment __envp) {
        MethodHandle mh$ = execve.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("execve", __path, __argv, __envp);
            }
            return mh$.invokeExact(__path, __argv, __envp);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fexecve$descriptor() {
        return fexecve.DESC;
    }

    public static MethodHandle fexecve$handle() {
        return fexecve.HANDLE;
    }

    public static MemorySegment fexecve$address() {
        return fexecve.ADDR;
    }

    public static int fexecve(int __fd, MemorySegment __argv, MemorySegment __envp) {
        MethodHandle mh$ = fexecve.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fexecve", __fd, __argv, __envp);
            }
            return mh$.invokeExact(__fd, __argv, __envp);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor execv$descriptor() {
        return execv.DESC;
    }

    public static MethodHandle execv$handle() {
        return execv.HANDLE;
    }

    public static MemorySegment execv$address() {
        return execv.ADDR;
    }

    public static int execv(MemorySegment __path, MemorySegment __argv) {
        MethodHandle mh$ = execv.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("execv", __path, __argv);
            }
            return mh$.invokeExact(__path, __argv);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor execvp$descriptor() {
        return execvp.DESC;
    }

    public static MethodHandle execvp$handle() {
        return execvp.HANDLE;
    }

    public static MemorySegment execvp$address() {
        return execvp.ADDR;
    }

    public static int execvp(MemorySegment __file, MemorySegment __argv) {
        MethodHandle mh$ = execvp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("execvp", __file, __argv);
            }
            return mh$.invokeExact(__file, __argv);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor nice$descriptor() {
        return nice.DESC;
    }

    public static MethodHandle nice$handle() {
        return nice.HANDLE;
    }

    public static MemorySegment nice$address() {
        return nice.ADDR;
    }

    public static int nice(int __inc) {
        MethodHandle mh$ = nice.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("nice", __inc);
            }
            return mh$.invokeExact(__inc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor _exit$descriptor() {
        return _exit.DESC;
    }

    public static MethodHandle _exit$handle() {
        return _exit.HANDLE;
    }

    public static MemorySegment _exit$address() {
        return _exit.ADDR;
    }

    public static void _exit(int __status) {
        MethodHandle mh$ = _exit.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("_exit", __status);
            }
            mh$.invokeExact(__status);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int _PC_LINK_MAX() {
        return 0;
    }

    public static int _PC_MAX_CANON() {
        return 1;
    }

    public static int _PC_MAX_INPUT() {
        return 2;
    }

    public static int _PC_NAME_MAX() {
        return 3;
    }

    public static int _PC_PATH_MAX() {
        return 4;
    }

    public static int _PC_PIPE_BUF() {
        return 5;
    }

    public static int _PC_CHOWN_RESTRICTED() {
        return 6;
    }

    public static int _PC_NO_TRUNC() {
        return 7;
    }

    public static int _PC_VDISABLE() {
        return 8;
    }

    public static int _PC_SYNC_IO() {
        return 9;
    }

    public static int _PC_ASYNC_IO() {
        return 10;
    }

    public static int _PC_PRIO_IO() {
        return 11;
    }

    public static int _PC_SOCK_MAXBUF() {
        return 12;
    }

    public static int _PC_FILESIZEBITS() {
        return 13;
    }

    public static int _PC_REC_INCR_XFER_SIZE() {
        return 14;
    }

    public static int _PC_REC_MAX_XFER_SIZE() {
        return 15;
    }

    public static int _PC_REC_MIN_XFER_SIZE() {
        return 16;
    }

    public static int _PC_REC_XFER_ALIGN() {
        return 17;
    }

    public static int _PC_ALLOC_SIZE_MIN() {
        return 18;
    }

    public static int _PC_SYMLINK_MAX() {
        return 19;
    }

    public static int _PC_2_SYMLINKS() {
        return 20;
    }

    public static int _SC_ARG_MAX() {
        return 0;
    }

    public static int _SC_CHILD_MAX() {
        return 1;
    }

    public static int _SC_CLK_TCK() {
        return 2;
    }

    public static int _SC_NGROUPS_MAX() {
        return 3;
    }

    public static int _SC_OPEN_MAX() {
        return 4;
    }

    public static int _SC_STREAM_MAX() {
        return 5;
    }

    public static int _SC_TZNAME_MAX() {
        return 6;
    }

    public static int _SC_JOB_CONTROL() {
        return 7;
    }

    public static int _SC_SAVED_IDS() {
        return 8;
    }

    public static int _SC_REALTIME_SIGNALS() {
        return 9;
    }

    public static int _SC_PRIORITY_SCHEDULING() {
        return 10;
    }

    public static int _SC_TIMERS() {
        return 11;
    }

    public static int _SC_ASYNCHRONOUS_IO() {
        return 12;
    }

    public static int _SC_PRIORITIZED_IO() {
        return 13;
    }

    public static int _SC_SYNCHRONIZED_IO() {
        return 14;
    }

    public static int _SC_FSYNC() {
        return 15;
    }

    public static int _SC_MAPPED_FILES() {
        return 16;
    }

    public static int _SC_MEMLOCK() {
        return 17;
    }

    public static int _SC_MEMLOCK_RANGE() {
        return 18;
    }

    public static int _SC_MEMORY_PROTECTION() {
        return 19;
    }

    public static int _SC_MESSAGE_PASSING() {
        return 20;
    }

    public static int _SC_SEMAPHORES() {
        return 21;
    }

    public static int _SC_SHARED_MEMORY_OBJECTS() {
        return 22;
    }

    public static int _SC_AIO_LISTIO_MAX() {
        return 23;
    }

    public static int _SC_AIO_MAX() {
        return 24;
    }

    public static int _SC_AIO_PRIO_DELTA_MAX() {
        return 25;
    }

    public static int _SC_DELAYTIMER_MAX() {
        return 26;
    }

    public static int _SC_MQ_OPEN_MAX() {
        return 27;
    }

    public static int _SC_MQ_PRIO_MAX() {
        return 28;
    }

    public static int _SC_VERSION() {
        return 29;
    }

    public static int _SC_PAGESIZE() {
        return 30;
    }

    public static int _SC_RTSIG_MAX() {
        return 31;
    }

    public static int _SC_SEM_NSEMS_MAX() {
        return 32;
    }

    public static int _SC_SEM_VALUE_MAX() {
        return 33;
    }

    public static int _SC_SIGQUEUE_MAX() {
        return 34;
    }

    public static int _SC_TIMER_MAX() {
        return 35;
    }

    public static int _SC_BC_BASE_MAX() {
        return 36;
    }

    public static int _SC_BC_DIM_MAX() {
        return 37;
    }

    public static int _SC_BC_SCALE_MAX() {
        return 38;
    }

    public static int _SC_BC_STRING_MAX() {
        return 39;
    }

    public static int _SC_COLL_WEIGHTS_MAX() {
        return 40;
    }

    public static int _SC_EQUIV_CLASS_MAX() {
        return 41;
    }

    public static int _SC_EXPR_NEST_MAX() {
        return 42;
    }

    public static int _SC_LINE_MAX() {
        return 43;
    }

    public static int _SC_RE_DUP_MAX() {
        return 44;
    }

    public static int _SC_CHARCLASS_NAME_MAX() {
        return 45;
    }

    public static int _SC_2_VERSION() {
        return 46;
    }

    public static int _SC_2_C_BIND() {
        return 47;
    }

    public static int _SC_2_C_DEV() {
        return 48;
    }

    public static int _SC_2_FORT_DEV() {
        return 49;
    }

    public static int _SC_2_FORT_RUN() {
        return 50;
    }

    public static int _SC_2_SW_DEV() {
        return 51;
    }

    public static int _SC_2_LOCALEDEF() {
        return 52;
    }

    public static int _SC_PII() {
        return 53;
    }

    public static int _SC_PII_XTI() {
        return 54;
    }

    public static int _SC_PII_SOCKET() {
        return 55;
    }

    public static int _SC_PII_INTERNET() {
        return 56;
    }

    public static int _SC_PII_OSI() {
        return 57;
    }

    public static int _SC_POLL() {
        return 58;
    }

    public static int _SC_SELECT() {
        return 59;
    }

    public static int _SC_UIO_MAXIOV() {
        return 60;
    }

    public static int _SC_IOV_MAX() {
        return 60;
    }

    public static int _SC_PII_INTERNET_STREAM() {
        return 61;
    }

    public static int _SC_PII_INTERNET_DGRAM() {
        return 62;
    }

    public static int _SC_PII_OSI_COTS() {
        return 63;
    }

    public static int _SC_PII_OSI_CLTS() {
        return 64;
    }

    public static int _SC_PII_OSI_M() {
        return 65;
    }

    public static int _SC_T_IOV_MAX() {
        return 66;
    }

    public static int _SC_THREADS() {
        return 67;
    }

    public static int _SC_THREAD_SAFE_FUNCTIONS() {
        return 68;
    }

    public static int _SC_GETGR_R_SIZE_MAX() {
        return 69;
    }

    public static int _SC_GETPW_R_SIZE_MAX() {
        return 70;
    }

    public static int _SC_LOGIN_NAME_MAX() {
        return 71;
    }

    public static int _SC_TTY_NAME_MAX() {
        return 72;
    }

    public static int _SC_THREAD_DESTRUCTOR_ITERATIONS() {
        return 73;
    }

    public static int _SC_THREAD_KEYS_MAX() {
        return 74;
    }

    public static int _SC_THREAD_STACK_MIN() {
        return 75;
    }

    public static int _SC_THREAD_THREADS_MAX() {
        return 76;
    }

    public static int _SC_THREAD_ATTR_STACKADDR() {
        return 77;
    }

    public static int _SC_THREAD_ATTR_STACKSIZE() {
        return 78;
    }

    public static int _SC_THREAD_PRIORITY_SCHEDULING() {
        return 79;
    }

    public static int _SC_THREAD_PRIO_INHERIT() {
        return 80;
    }

    public static int _SC_THREAD_PRIO_PROTECT() {
        return 81;
    }

    public static int _SC_THREAD_PROCESS_SHARED() {
        return 82;
    }

    public static int _SC_NPROCESSORS_CONF() {
        return 83;
    }

    public static int _SC_NPROCESSORS_ONLN() {
        return 84;
    }

    public static int _SC_PHYS_PAGES() {
        return 85;
    }

    public static int _SC_AVPHYS_PAGES() {
        return 86;
    }

    public static int _SC_ATEXIT_MAX() {
        return 87;
    }

    public static int _SC_PASS_MAX() {
        return 88;
    }

    public static int _SC_XOPEN_VERSION() {
        return 89;
    }

    public static int _SC_XOPEN_XCU_VERSION() {
        return 90;
    }

    public static int _SC_XOPEN_UNIX() {
        return 91;
    }

    public static int _SC_XOPEN_CRYPT() {
        return 92;
    }

    public static int _SC_XOPEN_ENH_I18N() {
        return 93;
    }

    public static int _SC_XOPEN_SHM() {
        return 94;
    }

    public static int _SC_2_CHAR_TERM() {
        return 95;
    }

    public static int _SC_2_C_VERSION() {
        return 96;
    }

    public static int _SC_2_UPE() {
        return 97;
    }

    public static int _SC_XOPEN_XPG2() {
        return 98;
    }

    public static int _SC_XOPEN_XPG3() {
        return 99;
    }

    public static int _SC_XOPEN_XPG4() {
        return 100;
    }

    public static int _SC_CHAR_BIT() {
        return 101;
    }

    public static int _SC_CHAR_MAX() {
        return 102;
    }

    public static int _SC_CHAR_MIN() {
        return 103;
    }

    public static int _SC_INT_MAX() {
        return 104;
    }

    public static int _SC_INT_MIN() {
        return 105;
    }

    public static int _SC_LONG_BIT() {
        return 106;
    }

    public static int _SC_WORD_BIT() {
        return 107;
    }

    public static int _SC_MB_LEN_MAX() {
        return 108;
    }

    public static int _SC_NZERO() {
        return 109;
    }

    public static int _SC_SSIZE_MAX() {
        return 110;
    }

    public static int _SC_SCHAR_MAX() {
        return 111;
    }

    public static int _SC_SCHAR_MIN() {
        return 112;
    }

    public static int _SC_SHRT_MAX() {
        return 113;
    }

    public static int _SC_SHRT_MIN() {
        return 114;
    }

    public static int _SC_UCHAR_MAX() {
        return 115;
    }

    public static int _SC_UINT_MAX() {
        return 116;
    }

    public static int _SC_ULONG_MAX() {
        return 117;
    }

    public static int _SC_USHRT_MAX() {
        return 118;
    }

    public static int _SC_NL_ARGMAX() {
        return 119;
    }

    public static int _SC_NL_LANGMAX() {
        return 120;
    }

    public static int _SC_NL_MSGMAX() {
        return 121;
    }

    public static int _SC_NL_NMAX() {
        return 122;
    }

    public static int _SC_NL_SETMAX() {
        return 123;
    }

    public static int _SC_NL_TEXTMAX() {
        return 124;
    }

    public static int _SC_XBS5_ILP32_OFF32() {
        return 125;
    }

    public static int _SC_XBS5_ILP32_OFFBIG() {
        return 126;
    }

    public static int _SC_XBS5_LP64_OFF64() {
        return 127;
    }

    public static int _SC_XBS5_LPBIG_OFFBIG() {
        return 128;
    }

    public static int _SC_XOPEN_LEGACY() {
        return 129;
    }

    public static int _SC_XOPEN_REALTIME() {
        return 130;
    }

    public static int _SC_XOPEN_REALTIME_THREADS() {
        return 131;
    }

    public static int _SC_ADVISORY_INFO() {
        return 132;
    }

    public static int _SC_BARRIERS() {
        return 133;
    }

    public static int _SC_BASE() {
        return 134;
    }

    public static int _SC_C_LANG_SUPPORT() {
        return 135;
    }

    public static int _SC_C_LANG_SUPPORT_R() {
        return 136;
    }

    public static int _SC_CLOCK_SELECTION() {
        return 137;
    }

    public static int _SC_CPUTIME() {
        return 138;
    }

    public static int _SC_THREAD_CPUTIME() {
        return 139;
    }

    public static int _SC_DEVICE_IO() {
        return 140;
    }

    public static int _SC_DEVICE_SPECIFIC() {
        return 141;
    }

    public static int _SC_DEVICE_SPECIFIC_R() {
        return 142;
    }

    public static int _SC_FD_MGMT() {
        return 143;
    }

    public static int _SC_FIFO() {
        return 144;
    }

    public static int _SC_PIPE() {
        return 145;
    }

    public static int _SC_FILE_ATTRIBUTES() {
        return 146;
    }

    public static int _SC_FILE_LOCKING() {
        return 147;
    }

    public static int _SC_FILE_SYSTEM() {
        return 148;
    }

    public static int _SC_MONOTONIC_CLOCK() {
        return 149;
    }

    public static int _SC_MULTI_PROCESS() {
        return 150;
    }

    public static int _SC_SINGLE_PROCESS() {
        return 151;
    }

    public static int _SC_NETWORKING() {
        return 152;
    }

    public static int _SC_READER_WRITER_LOCKS() {
        return 153;
    }

    public static int _SC_SPIN_LOCKS() {
        return 154;
    }

    public static int _SC_REGEXP() {
        return 155;
    }

    public static int _SC_REGEX_VERSION() {
        return 156;
    }

    public static int _SC_SHELL() {
        return 157;
    }

    public static int _SC_SIGNALS() {
        return 158;
    }

    public static int _SC_SPAWN() {
        return 159;
    }

    public static int _SC_SPORADIC_SERVER() {
        return 160;
    }

    public static int _SC_THREAD_SPORADIC_SERVER() {
        return 161;
    }

    public static int _SC_SYSTEM_DATABASE() {
        return 162;
    }

    public static int _SC_SYSTEM_DATABASE_R() {
        return 163;
    }

    public static int _SC_TIMEOUTS() {
        return 164;
    }

    public static int _SC_TYPED_MEMORY_OBJECTS() {
        return 165;
    }

    public static int _SC_USER_GROUPS() {
        return 166;
    }

    public static int _SC_USER_GROUPS_R() {
        return 167;
    }

    public static int _SC_2_PBS() {
        return 168;
    }

    public static int _SC_2_PBS_ACCOUNTING() {
        return 169;
    }

    public static int _SC_2_PBS_LOCATE() {
        return 170;
    }

    public static int _SC_2_PBS_MESSAGE() {
        return 171;
    }

    public static int _SC_2_PBS_TRACK() {
        return 172;
    }

    public static int _SC_SYMLOOP_MAX() {
        return 173;
    }

    public static int _SC_STREAMS() {
        return 174;
    }

    public static int _SC_2_PBS_CHECKPOINT() {
        return 175;
    }

    public static int _SC_V6_ILP32_OFF32() {
        return 176;
    }

    public static int _SC_V6_ILP32_OFFBIG() {
        return 177;
    }

    public static int _SC_V6_LP64_OFF64() {
        return 178;
    }

    public static int _SC_V6_LPBIG_OFFBIG() {
        return 179;
    }

    public static int _SC_HOST_NAME_MAX() {
        return 180;
    }

    public static int _SC_TRACE() {
        return 181;
    }

    public static int _SC_TRACE_EVENT_FILTER() {
        return 182;
    }

    public static int _SC_TRACE_INHERIT() {
        return 183;
    }

    public static int _SC_TRACE_LOG() {
        return 184;
    }

    public static int _SC_LEVEL1_ICACHE_SIZE() {
        return 185;
    }

    public static int _SC_LEVEL1_ICACHE_ASSOC() {
        return 186;
    }

    public static int _SC_LEVEL1_ICACHE_LINESIZE() {
        return 187;
    }

    public static int _SC_LEVEL1_DCACHE_SIZE() {
        return 188;
    }

    public static int _SC_LEVEL1_DCACHE_ASSOC() {
        return 189;
    }

    public static int _SC_LEVEL1_DCACHE_LINESIZE() {
        return 190;
    }

    public static int _SC_LEVEL2_CACHE_SIZE() {
        return 191;
    }

    public static int _SC_LEVEL2_CACHE_ASSOC() {
        return 192;
    }

    public static int _SC_LEVEL2_CACHE_LINESIZE() {
        return 193;
    }

    public static int _SC_LEVEL3_CACHE_SIZE() {
        return 194;
    }

    public static int _SC_LEVEL3_CACHE_ASSOC() {
        return 195;
    }

    public static int _SC_LEVEL3_CACHE_LINESIZE() {
        return 196;
    }

    public static int _SC_LEVEL4_CACHE_SIZE() {
        return 197;
    }

    public static int _SC_LEVEL4_CACHE_ASSOC() {
        return 198;
    }

    public static int _SC_LEVEL4_CACHE_LINESIZE() {
        return 199;
    }

    public static int _SC_IPV6() {
        return 235;
    }

    public static int _SC_RAW_SOCKETS() {
        return 236;
    }

    public static int _SC_V7_ILP32_OFF32() {
        return 237;
    }

    public static int _SC_V7_ILP32_OFFBIG() {
        return 238;
    }

    public static int _SC_V7_LP64_OFF64() {
        return 239;
    }

    public static int _SC_V7_LPBIG_OFFBIG() {
        return 240;
    }

    public static int _SC_SS_REPL_MAX() {
        return 241;
    }

    public static int _SC_TRACE_EVENT_NAME_MAX() {
        return 242;
    }

    public static int _SC_TRACE_NAME_MAX() {
        return 243;
    }

    public static int _SC_TRACE_SYS_MAX() {
        return 244;
    }

    public static int _SC_TRACE_USER_EVENT_MAX() {
        return 245;
    }

    public static int _SC_XOPEN_STREAMS() {
        return 246;
    }

    public static int _SC_THREAD_ROBUST_PRIO_INHERIT() {
        return 247;
    }

    public static int _SC_THREAD_ROBUST_PRIO_PROTECT() {
        return 248;
    }

    public static int _SC_MINSIGSTKSZ() {
        return 249;
    }

    public static int _SC_SIGSTKSZ() {
        return 250;
    }

    public static int _CS_PATH() {
        return 0;
    }

    public static int _CS_V6_WIDTH_RESTRICTED_ENVS() {
        return 1;
    }

    public static int _CS_GNU_LIBC_VERSION() {
        return 2;
    }

    public static int _CS_GNU_LIBPTHREAD_VERSION() {
        return 3;
    }

    public static int _CS_V5_WIDTH_RESTRICTED_ENVS() {
        return 4;
    }

    public static int _CS_V7_WIDTH_RESTRICTED_ENVS() {
        return 5;
    }

    public static int _CS_LFS_CFLAGS() {
        return 1000;
    }

    public static int _CS_LFS_LDFLAGS() {
        return 1001;
    }

    public static int _CS_LFS_LIBS() {
        return 1002;
    }

    public static int _CS_LFS_LINTFLAGS() {
        return 1003;
    }

    public static int _CS_LFS64_CFLAGS() {
        return 1004;
    }

    public static int _CS_LFS64_LDFLAGS() {
        return 1005;
    }

    public static int _CS_LFS64_LIBS() {
        return 1006;
    }

    public static int _CS_LFS64_LINTFLAGS() {
        return 1007;
    }

    public static int _CS_XBS5_ILP32_OFF32_CFLAGS() {
        return 1100;
    }

    public static int _CS_XBS5_ILP32_OFF32_LDFLAGS() {
        return 1101;
    }

    public static int _CS_XBS5_ILP32_OFF32_LIBS() {
        return 1102;
    }

    public static int _CS_XBS5_ILP32_OFF32_LINTFLAGS() {
        return 1103;
    }

    public static int _CS_XBS5_ILP32_OFFBIG_CFLAGS() {
        return 1104;
    }

    public static int _CS_XBS5_ILP32_OFFBIG_LDFLAGS() {
        return 1105;
    }

    public static int _CS_XBS5_ILP32_OFFBIG_LIBS() {
        return 1106;
    }

    public static int _CS_XBS5_ILP32_OFFBIG_LINTFLAGS() {
        return 1107;
    }

    public static int _CS_XBS5_LP64_OFF64_CFLAGS() {
        return 1108;
    }

    public static int _CS_XBS5_LP64_OFF64_LDFLAGS() {
        return 1109;
    }

    public static int _CS_XBS5_LP64_OFF64_LIBS() {
        return 1110;
    }

    public static int _CS_XBS5_LP64_OFF64_LINTFLAGS() {
        return 1111;
    }

    public static int _CS_XBS5_LPBIG_OFFBIG_CFLAGS() {
        return 1112;
    }

    public static int _CS_XBS5_LPBIG_OFFBIG_LDFLAGS() {
        return 1113;
    }

    public static int _CS_XBS5_LPBIG_OFFBIG_LIBS() {
        return 1114;
    }

    public static int _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS() {
        return 1115;
    }

    public static int _CS_POSIX_V6_ILP32_OFF32_CFLAGS() {
        return 1116;
    }

    public static int _CS_POSIX_V6_ILP32_OFF32_LDFLAGS() {
        return 1117;
    }

    public static int _CS_POSIX_V6_ILP32_OFF32_LIBS() {
        return 1118;
    }

    public static int _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS() {
        return 1119;
    }

    public static int _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS() {
        return 1120;
    }

    public static int _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS() {
        return 1121;
    }

    public static int _CS_POSIX_V6_ILP32_OFFBIG_LIBS() {
        return 1122;
    }

    public static int _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS() {
        return 1123;
    }

    public static int _CS_POSIX_V6_LP64_OFF64_CFLAGS() {
        return 1124;
    }

    public static int _CS_POSIX_V6_LP64_OFF64_LDFLAGS() {
        return 1125;
    }

    public static int _CS_POSIX_V6_LP64_OFF64_LIBS() {
        return 1126;
    }

    public static int _CS_POSIX_V6_LP64_OFF64_LINTFLAGS() {
        return 1127;
    }

    public static int _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS() {
        return 1128;
    }

    public static int _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS() {
        return 1129;
    }

    public static int _CS_POSIX_V6_LPBIG_OFFBIG_LIBS() {
        return 1130;
    }

    public static int _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS() {
        return 1131;
    }

    public static int _CS_POSIX_V7_ILP32_OFF32_CFLAGS() {
        return 1132;
    }

    public static int _CS_POSIX_V7_ILP32_OFF32_LDFLAGS() {
        return 1133;
    }

    public static int _CS_POSIX_V7_ILP32_OFF32_LIBS() {
        return 1134;
    }

    public static int _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS() {
        return 1135;
    }

    public static int _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS() {
        return 1136;
    }

    public static int _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS() {
        return 1137;
    }

    public static int _CS_POSIX_V7_ILP32_OFFBIG_LIBS() {
        return 1138;
    }

    public static int _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS() {
        return 1139;
    }

    public static int _CS_POSIX_V7_LP64_OFF64_CFLAGS() {
        return 1140;
    }

    public static int _CS_POSIX_V7_LP64_OFF64_LDFLAGS() {
        return 1141;
    }

    public static int _CS_POSIX_V7_LP64_OFF64_LIBS() {
        return 1142;
    }

    public static int _CS_POSIX_V7_LP64_OFF64_LINTFLAGS() {
        return 1143;
    }

    public static int _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS() {
        return 1144;
    }

    public static int _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS() {
        return 1145;
    }

    public static int _CS_POSIX_V7_LPBIG_OFFBIG_LIBS() {
        return 1146;
    }

    public static int _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS() {
        return 1147;
    }

    public static int _CS_V6_ENV() {
        return 1148;
    }

    public static int _CS_V7_ENV() {
        return 1149;
    }

    public static FunctionDescriptor pathconf$descriptor() {
        return pathconf.DESC;
    }

    public static MethodHandle pathconf$handle() {
        return pathconf.HANDLE;
    }

    public static MemorySegment pathconf$address() {
        return pathconf.ADDR;
    }

    public static long pathconf(MemorySegment __path, int __name) {
        MethodHandle mh$ = pathconf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("pathconf", __path, __name);
            }
            return mh$.invokeExact(__path, __name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fpathconf$descriptor() {
        return fpathconf.DESC;
    }

    public static MethodHandle fpathconf$handle() {
        return fpathconf.HANDLE;
    }

    public static MemorySegment fpathconf$address() {
        return fpathconf.ADDR;
    }

    public static long fpathconf(int __fd, int __name) {
        MethodHandle mh$ = fpathconf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fpathconf", __fd, __name);
            }
            return mh$.invokeExact(__fd, __name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sysconf$descriptor() {
        return sysconf.DESC;
    }

    public static MethodHandle sysconf$handle() {
        return sysconf.HANDLE;
    }

    public static MemorySegment sysconf$address() {
        return sysconf.ADDR;
    }

    public static long sysconf(int __name) {
        MethodHandle mh$ = sysconf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sysconf", __name);
            }
            return mh$.invokeExact(__name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor confstr$descriptor() {
        return confstr.DESC;
    }

    public static MethodHandle confstr$handle() {
        return confstr.HANDLE;
    }

    public static MemorySegment confstr$address() {
        return confstr.ADDR;
    }

    public static long confstr(int __name, MemorySegment __buf, long __len) {
        MethodHandle mh$ = confstr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("confstr", __name, __buf, __len);
            }
            return mh$.invokeExact(__name, __buf, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getpid$descriptor() {
        return getpid.DESC;
    }

    public static MethodHandle getpid$handle() {
        return getpid.HANDLE;
    }

    public static MemorySegment getpid$address() {
        return getpid.ADDR;
    }

    public static int getpid() {
        MethodHandle mh$ = getpid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getpid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getppid$descriptor() {
        return getppid.DESC;
    }

    public static MethodHandle getppid$handle() {
        return getppid.HANDLE;
    }

    public static MemorySegment getppid$address() {
        return getppid.ADDR;
    }

    public static int getppid() {
        MethodHandle mh$ = getppid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getppid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getpgrp$descriptor() {
        return getpgrp.DESC;
    }

    public static MethodHandle getpgrp$handle() {
        return getpgrp.HANDLE;
    }

    public static MemorySegment getpgrp$address() {
        return getpgrp.ADDR;
    }

    public static int getpgrp() {
        MethodHandle mh$ = getpgrp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getpgrp", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __getpgid$descriptor() {
        return __getpgid.DESC;
    }

    public static MethodHandle __getpgid$handle() {
        return __getpgid.HANDLE;
    }

    public static MemorySegment __getpgid$address() {
        return __getpgid.ADDR;
    }

    public static int __getpgid(int __pid) {
        MethodHandle mh$ = __getpgid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("__getpgid", __pid);
            }
            return mh$.invokeExact(__pid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getpgid$descriptor() {
        return getpgid.DESC;
    }

    public static MethodHandle getpgid$handle() {
        return getpgid.HANDLE;
    }

    public static MemorySegment getpgid$address() {
        return getpgid.ADDR;
    }

    public static int getpgid(int __pid) {
        MethodHandle mh$ = getpgid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getpgid", __pid);
            }
            return mh$.invokeExact(__pid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setpgid$descriptor() {
        return setpgid.DESC;
    }

    public static MethodHandle setpgid$handle() {
        return setpgid.HANDLE;
    }

    public static MemorySegment setpgid$address() {
        return setpgid.ADDR;
    }

    public static int setpgid(int __pid, int __pgid) {
        MethodHandle mh$ = setpgid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setpgid", __pid, __pgid);
            }
            return mh$.invokeExact(__pid, __pgid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setpgrp$descriptor() {
        return setpgrp.DESC;
    }

    public static MethodHandle setpgrp$handle() {
        return setpgrp.HANDLE;
    }

    public static MemorySegment setpgrp$address() {
        return setpgrp.ADDR;
    }

    public static int setpgrp() {
        MethodHandle mh$ = setpgrp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setpgrp", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setsid$descriptor() {
        return setsid.DESC;
    }

    public static MethodHandle setsid$handle() {
        return setsid.HANDLE;
    }

    public static MemorySegment setsid$address() {
        return setsid.ADDR;
    }

    public static int setsid() {
        MethodHandle mh$ = setsid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setsid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getsid$descriptor() {
        return getsid.DESC;
    }

    public static MethodHandle getsid$handle() {
        return getsid.HANDLE;
    }

    public static MemorySegment getsid$address() {
        return getsid.ADDR;
    }

    public static int getsid(int __pid) {
        MethodHandle mh$ = getsid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getsid", __pid);
            }
            return mh$.invokeExact(__pid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getuid$descriptor() {
        return getuid.DESC;
    }

    public static MethodHandle getuid$handle() {
        return getuid.HANDLE;
    }

    public static MemorySegment getuid$address() {
        return getuid.ADDR;
    }

    public static int getuid() {
        MethodHandle mh$ = getuid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getuid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor geteuid$descriptor() {
        return geteuid.DESC;
    }

    public static MethodHandle geteuid$handle() {
        return geteuid.HANDLE;
    }

    public static MemorySegment geteuid$address() {
        return geteuid.ADDR;
    }

    public static int geteuid() {
        MethodHandle mh$ = geteuid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("geteuid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getgid$descriptor() {
        return getgid.DESC;
    }

    public static MethodHandle getgid$handle() {
        return getgid.HANDLE;
    }

    public static MemorySegment getgid$address() {
        return getgid.ADDR;
    }

    public static int getgid() {
        MethodHandle mh$ = getgid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getgid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getegid$descriptor() {
        return getegid.DESC;
    }

    public static MethodHandle getegid$handle() {
        return getegid.HANDLE;
    }

    public static MemorySegment getegid$address() {
        return getegid.ADDR;
    }

    public static int getegid() {
        MethodHandle mh$ = getegid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getegid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getgroups$descriptor() {
        return getgroups.DESC;
    }

    public static MethodHandle getgroups$handle() {
        return getgroups.HANDLE;
    }

    public static MemorySegment getgroups$address() {
        return getgroups.ADDR;
    }

    public static int getgroups(int __size, MemorySegment __list) {
        MethodHandle mh$ = getgroups.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getgroups", __size, __list);
            }
            return mh$.invokeExact(__size, __list);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setuid$descriptor() {
        return setuid.DESC;
    }

    public static MethodHandle setuid$handle() {
        return setuid.HANDLE;
    }

    public static MemorySegment setuid$address() {
        return setuid.ADDR;
    }

    public static int setuid(int __uid) {
        MethodHandle mh$ = setuid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setuid", __uid);
            }
            return mh$.invokeExact(__uid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setreuid$descriptor() {
        return setreuid.DESC;
    }

    public static MethodHandle setreuid$handle() {
        return setreuid.HANDLE;
    }

    public static MemorySegment setreuid$address() {
        return setreuid.ADDR;
    }

    public static int setreuid(int __ruid, int __euid) {
        MethodHandle mh$ = setreuid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setreuid", __ruid, __euid);
            }
            return mh$.invokeExact(__ruid, __euid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor seteuid$descriptor() {
        return seteuid.DESC;
    }

    public static MethodHandle seteuid$handle() {
        return seteuid.HANDLE;
    }

    public static MemorySegment seteuid$address() {
        return seteuid.ADDR;
    }

    public static int seteuid(int __uid) {
        MethodHandle mh$ = seteuid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("seteuid", __uid);
            }
            return mh$.invokeExact(__uid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setgid$descriptor() {
        return setgid.DESC;
    }

    public static MethodHandle setgid$handle() {
        return setgid.HANDLE;
    }

    public static MemorySegment setgid$address() {
        return setgid.ADDR;
    }

    public static int setgid(int __gid) {
        MethodHandle mh$ = setgid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setgid", __gid);
            }
            return mh$.invokeExact(__gid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setregid$descriptor() {
        return setregid.DESC;
    }

    public static MethodHandle setregid$handle() {
        return setregid.HANDLE;
    }

    public static MemorySegment setregid$address() {
        return setregid.ADDR;
    }

    public static int setregid(int __rgid, int __egid) {
        MethodHandle mh$ = setregid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setregid", __rgid, __egid);
            }
            return mh$.invokeExact(__rgid, __egid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setegid$descriptor() {
        return setegid.DESC;
    }

    public static MethodHandle setegid$handle() {
        return setegid.HANDLE;
    }

    public static MemorySegment setegid$address() {
        return setegid.ADDR;
    }

    public static int setegid(int __gid) {
        MethodHandle mh$ = setegid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setegid", __gid);
            }
            return mh$.invokeExact(__gid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fork$descriptor() {
        return fork.DESC;
    }

    public static MethodHandle fork$handle() {
        return fork.HANDLE;
    }

    public static MemorySegment fork$address() {
        return fork.ADDR;
    }

    public static int fork() {
        MethodHandle mh$ = fork.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fork", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vfork$descriptor() {
        return vfork.DESC;
    }

    public static MethodHandle vfork$handle() {
        return vfork.HANDLE;
    }

    public static MemorySegment vfork$address() {
        return vfork.ADDR;
    }

    public static int vfork() {
        MethodHandle mh$ = vfork.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("vfork", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ttyname$descriptor() {
        return ttyname.DESC;
    }

    public static MethodHandle ttyname$handle() {
        return ttyname.HANDLE;
    }

    public static MemorySegment ttyname$address() {
        return ttyname.ADDR;
    }

    public static MemorySegment ttyname(int __fd) {
        MethodHandle mh$ = ttyname.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("ttyname", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ttyname_r$descriptor() {
        return ttyname_r.DESC;
    }

    public static MethodHandle ttyname_r$handle() {
        return ttyname_r.HANDLE;
    }

    public static MemorySegment ttyname_r$address() {
        return ttyname_r.ADDR;
    }

    public static int ttyname_r(int __fd, MemorySegment __buf, long __buflen) {
        MethodHandle mh$ = ttyname_r.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("ttyname_r", __fd, __buf, __buflen);
            }
            return mh$.invokeExact(__fd, __buf, __buflen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor isatty$descriptor() {
        return isatty.DESC;
    }

    public static MethodHandle isatty$handle() {
        return isatty.HANDLE;
    }

    public static MemorySegment isatty$address() {
        return isatty.ADDR;
    }

    public static int isatty(int __fd) {
        MethodHandle mh$ = isatty.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("isatty", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ttyslot$descriptor() {
        return ttyslot.DESC;
    }

    public static MethodHandle ttyslot$handle() {
        return ttyslot.HANDLE;
    }

    public static MemorySegment ttyslot$address() {
        return ttyslot.ADDR;
    }

    public static int ttyslot() {
        MethodHandle mh$ = ttyslot.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("ttyslot", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor link$descriptor() {
        return link.DESC;
    }

    public static MethodHandle link$handle() {
        return link.HANDLE;
    }

    public static MemorySegment link$address() {
        return link.ADDR;
    }

    public static int link(MemorySegment __from, MemorySegment __to) {
        MethodHandle mh$ = link.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("link", __from, __to);
            }
            return mh$.invokeExact(__from, __to);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor linkat$descriptor() {
        return linkat.DESC;
    }

    public static MethodHandle linkat$handle() {
        return linkat.HANDLE;
    }

    public static MemorySegment linkat$address() {
        return linkat.ADDR;
    }

    public static int linkat(int __fromfd, MemorySegment __from, int __tofd, MemorySegment __to, int __flags) {
        MethodHandle mh$ = linkat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("linkat", __fromfd, __from, __tofd, __to, __flags);
            }
            return mh$.invokeExact(__fromfd, __from, __tofd, __to, __flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor symlink$descriptor() {
        return symlink.DESC;
    }

    public static MethodHandle symlink$handle() {
        return symlink.HANDLE;
    }

    public static MemorySegment symlink$address() {
        return symlink.ADDR;
    }

    public static int symlink(MemorySegment __from, MemorySegment __to) {
        MethodHandle mh$ = symlink.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("symlink", __from, __to);
            }
            return mh$.invokeExact(__from, __to);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor readlink$descriptor() {
        return readlink.DESC;
    }

    public static MethodHandle readlink$handle() {
        return readlink.HANDLE;
    }

    public static MemorySegment readlink$address() {
        return readlink.ADDR;
    }

    public static long readlink(MemorySegment __path, MemorySegment __buf, long __len) {
        MethodHandle mh$ = readlink.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("readlink", __path, __buf, __len);
            }
            return mh$.invokeExact(__path, __buf, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor symlinkat$descriptor() {
        return symlinkat.DESC;
    }

    public static MethodHandle symlinkat$handle() {
        return symlinkat.HANDLE;
    }

    public static MemorySegment symlinkat$address() {
        return symlinkat.ADDR;
    }

    public static int symlinkat(MemorySegment __from, int __tofd, MemorySegment __to) {
        MethodHandle mh$ = symlinkat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("symlinkat", __from, __tofd, __to);
            }
            return mh$.invokeExact(__from, __tofd, __to);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor readlinkat$descriptor() {
        return readlinkat.DESC;
    }

    public static MethodHandle readlinkat$handle() {
        return readlinkat.HANDLE;
    }

    public static MemorySegment readlinkat$address() {
        return readlinkat.ADDR;
    }

    public static long readlinkat(int __fd, MemorySegment __path, MemorySegment __buf, long __len) {
        MethodHandle mh$ = readlinkat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("readlinkat", __fd, __path, __buf, __len);
            }
            return mh$.invokeExact(__fd, __path, __buf, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor unlink$descriptor() {
        return unlink.DESC;
    }

    public static MethodHandle unlink$handle() {
        return unlink.HANDLE;
    }

    public static MemorySegment unlink$address() {
        return unlink.ADDR;
    }

    public static int unlink(MemorySegment __name) {
        MethodHandle mh$ = unlink.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("unlink", __name);
            }
            return mh$.invokeExact(__name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor unlinkat$descriptor() {
        return unlinkat.DESC;
    }

    public static MethodHandle unlinkat$handle() {
        return unlinkat.HANDLE;
    }

    public static MemorySegment unlinkat$address() {
        return unlinkat.ADDR;
    }

    public static int unlinkat(int __fd, MemorySegment __name, int __flag) {
        MethodHandle mh$ = unlinkat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("unlinkat", __fd, __name, __flag);
            }
            return mh$.invokeExact(__fd, __name, __flag);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor rmdir$descriptor() {
        return rmdir.DESC;
    }

    public static MethodHandle rmdir$handle() {
        return rmdir.HANDLE;
    }

    public static MemorySegment rmdir$address() {
        return rmdir.ADDR;
    }

    public static int rmdir(MemorySegment __path) {
        MethodHandle mh$ = rmdir.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("rmdir", __path);
            }
            return mh$.invokeExact(__path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor tcgetpgrp$descriptor() {
        return tcgetpgrp.DESC;
    }

    public static MethodHandle tcgetpgrp$handle() {
        return tcgetpgrp.HANDLE;
    }

    public static MemorySegment tcgetpgrp$address() {
        return tcgetpgrp.ADDR;
    }

    public static int tcgetpgrp(int __fd) {
        MethodHandle mh$ = tcgetpgrp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("tcgetpgrp", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor tcsetpgrp$descriptor() {
        return tcsetpgrp.DESC;
    }

    public static MethodHandle tcsetpgrp$handle() {
        return tcsetpgrp.HANDLE;
    }

    public static MemorySegment tcsetpgrp$address() {
        return tcsetpgrp.ADDR;
    }

    public static int tcsetpgrp(int __fd, int __pgrp_id) {
        MethodHandle mh$ = tcsetpgrp.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("tcsetpgrp", __fd, __pgrp_id);
            }
            return mh$.invokeExact(__fd, __pgrp_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getlogin$descriptor() {
        return getlogin.DESC;
    }

    public static MethodHandle getlogin$handle() {
        return getlogin.HANDLE;
    }

    public static MemorySegment getlogin$address() {
        return getlogin.ADDR;
    }

    public static MemorySegment getlogin() {
        MethodHandle mh$ = getlogin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getlogin", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getlogin_r$descriptor() {
        return getlogin_r.DESC;
    }

    public static MethodHandle getlogin_r$handle() {
        return getlogin_r.HANDLE;
    }

    public static MemorySegment getlogin_r$address() {
        return getlogin_r.ADDR;
    }

    public static int getlogin_r(MemorySegment __name, long __name_len) {
        MethodHandle mh$ = getlogin_r.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getlogin_r", __name, __name_len);
            }
            return mh$.invokeExact(__name, __name_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setlogin$descriptor() {
        return setlogin.DESC;
    }

    public static MethodHandle setlogin$handle() {
        return setlogin.HANDLE;
    }

    public static MemorySegment setlogin$address() {
        return setlogin.ADDR;
    }

    public static int setlogin(MemorySegment __name) {
        MethodHandle mh$ = setlogin.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setlogin", __name);
            }
            return mh$.invokeExact(__name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static AddressLayout optarg$layout() {
        return optarg.constants.LAYOUT;
    }

    public static MemorySegment optarg$segment() {
        return optarg.constants.SEGMENT;
    }

    public static MemorySegment optarg() {
        return optarg.constants.SEGMENT.get(optarg.constants.LAYOUT, 0L);
    }

    public static void optarg(MemorySegment varValue) {
        optarg.constants.SEGMENT.set(optarg.constants.LAYOUT, 0L, varValue);
    }

    public static ValueLayout.OfInt optind$layout() {
        return optind.constants.LAYOUT;
    }

    public static MemorySegment optind$segment() {
        return optind.constants.SEGMENT;
    }

    public static int optind() {
        return optind.constants.SEGMENT.get(optind.constants.LAYOUT, 0L);
    }

    public static void optind(int varValue) {
        optind.constants.SEGMENT.set(optind.constants.LAYOUT, 0L, varValue);
    }

    public static ValueLayout.OfInt opterr$layout() {
        return opterr.constants.LAYOUT;
    }

    public static MemorySegment opterr$segment() {
        return opterr.constants.SEGMENT;
    }

    public static int opterr() {
        return opterr.constants.SEGMENT.get(opterr.constants.LAYOUT, 0L);
    }

    public static void opterr(int varValue) {
        opterr.constants.SEGMENT.set(opterr.constants.LAYOUT, 0L, varValue);
    }

    public static ValueLayout.OfInt optopt$layout() {
        return optopt.constants.LAYOUT;
    }

    public static MemorySegment optopt$segment() {
        return optopt.constants.SEGMENT;
    }

    public static int optopt() {
        return optopt.constants.SEGMENT.get(optopt.constants.LAYOUT, 0L);
    }

    public static void optopt(int varValue) {
        optopt.constants.SEGMENT.set(optopt.constants.LAYOUT, 0L, varValue);
    }

    public static FunctionDescriptor getopt$descriptor() {
        return getopt.DESC;
    }

    public static MethodHandle getopt$handle() {
        return getopt.HANDLE;
    }

    public static MemorySegment getopt$address() {
        return getopt.ADDR;
    }

    public static int getopt(int ___argc, MemorySegment ___argv, MemorySegment __shortopts) {
        MethodHandle mh$ = getopt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getopt", ___argc, ___argv, __shortopts);
            }
            return mh$.invokeExact(___argc, ___argv, __shortopts);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor gethostname$descriptor() {
        return gethostname.DESC;
    }

    public static MethodHandle gethostname$handle() {
        return gethostname.HANDLE;
    }

    public static MemorySegment gethostname$address() {
        return gethostname.ADDR;
    }

    public static int gethostname(MemorySegment __name, long __len) {
        MethodHandle mh$ = gethostname.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("gethostname", __name, __len);
            }
            return mh$.invokeExact(__name, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sethostname$descriptor() {
        return sethostname.DESC;
    }

    public static MethodHandle sethostname$handle() {
        return sethostname.HANDLE;
    }

    public static MemorySegment sethostname$address() {
        return sethostname.ADDR;
    }

    public static int sethostname(MemorySegment __name, long __len) {
        MethodHandle mh$ = sethostname.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sethostname", __name, __len);
            }
            return mh$.invokeExact(__name, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sethostid$descriptor() {
        return sethostid.DESC;
    }

    public static MethodHandle sethostid$handle() {
        return sethostid.HANDLE;
    }

    public static MemorySegment sethostid$address() {
        return sethostid.ADDR;
    }

    public static int sethostid(long __id) {
        MethodHandle mh$ = sethostid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sethostid", __id);
            }
            return mh$.invokeExact(__id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getdomainname$descriptor() {
        return getdomainname.DESC;
    }

    public static MethodHandle getdomainname$handle() {
        return getdomainname.HANDLE;
    }

    public static MemorySegment getdomainname$address() {
        return getdomainname.ADDR;
    }

    public static int getdomainname(MemorySegment __name, long __len) {
        MethodHandle mh$ = getdomainname.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getdomainname", __name, __len);
            }
            return mh$.invokeExact(__name, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setdomainname$descriptor() {
        return setdomainname.DESC;
    }

    public static MethodHandle setdomainname$handle() {
        return setdomainname.HANDLE;
    }

    public static MemorySegment setdomainname$address() {
        return setdomainname.ADDR;
    }

    public static int setdomainname(MemorySegment __name, long __len) {
        MethodHandle mh$ = setdomainname.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setdomainname", __name, __len);
            }
            return mh$.invokeExact(__name, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor vhangup$descriptor() {
        return vhangup.DESC;
    }

    public static MethodHandle vhangup$handle() {
        return vhangup.HANDLE;
    }

    public static MemorySegment vhangup$address() {
        return vhangup.ADDR;
    }

    public static int vhangup() {
        MethodHandle mh$ = vhangup.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("vhangup", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor revoke$descriptor() {
        return revoke.DESC;
    }

    public static MethodHandle revoke$handle() {
        return revoke.HANDLE;
    }

    public static MemorySegment revoke$address() {
        return revoke.ADDR;
    }

    public static int revoke(MemorySegment __file) {
        MethodHandle mh$ = revoke.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("revoke", __file);
            }
            return mh$.invokeExact(__file);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor profil$descriptor() {
        return profil.DESC;
    }

    public static MethodHandle profil$handle() {
        return profil.HANDLE;
    }

    public static MemorySegment profil$address() {
        return profil.ADDR;
    }

    public static int profil(MemorySegment __sample_buffer, long __size, long __offset, int __scale) {
        MethodHandle mh$ = profil.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("profil", __sample_buffer, __size, __offset, __scale);
            }
            return mh$.invokeExact(__sample_buffer, __size, __offset, __scale);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor acct$descriptor() {
        return acct.DESC;
    }

    public static MethodHandle acct$handle() {
        return acct.HANDLE;
    }

    public static MemorySegment acct$address() {
        return acct.ADDR;
    }

    public static int acct(MemorySegment __name) {
        MethodHandle mh$ = acct.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("acct", __name);
            }
            return mh$.invokeExact(__name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getusershell$descriptor() {
        return getusershell.DESC;
    }

    public static MethodHandle getusershell$handle() {
        return getusershell.HANDLE;
    }

    public static MemorySegment getusershell$address() {
        return getusershell.ADDR;
    }

    public static MemorySegment getusershell() {
        MethodHandle mh$ = getusershell.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getusershell", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor endusershell$descriptor() {
        return endusershell.DESC;
    }

    public static MethodHandle endusershell$handle() {
        return endusershell.HANDLE;
    }

    public static MemorySegment endusershell$address() {
        return endusershell.ADDR;
    }

    public static void endusershell() {
        MethodHandle mh$ = endusershell.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("endusershell", new Object[0]);
            }
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setusershell$descriptor() {
        return setusershell.DESC;
    }

    public static MethodHandle setusershell$handle() {
        return setusershell.HANDLE;
    }

    public static MemorySegment setusershell$address() {
        return setusershell.ADDR;
    }

    public static void setusershell() {
        MethodHandle mh$ = setusershell.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setusershell", new Object[0]);
            }
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor daemon$descriptor() {
        return daemon.DESC;
    }

    public static MethodHandle daemon$handle() {
        return daemon.HANDLE;
    }

    public static MemorySegment daemon$address() {
        return daemon.ADDR;
    }

    public static int daemon(int __nochdir, int __noclose) {
        MethodHandle mh$ = daemon.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("daemon", __nochdir, __noclose);
            }
            return mh$.invokeExact(__nochdir, __noclose);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor chroot$descriptor() {
        return chroot.DESC;
    }

    public static MethodHandle chroot$handle() {
        return chroot.HANDLE;
    }

    public static MemorySegment chroot$address() {
        return chroot.ADDR;
    }

    public static int chroot(MemorySegment __path) {
        MethodHandle mh$ = chroot.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("chroot", __path);
            }
            return mh$.invokeExact(__path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getpass$descriptor() {
        return getpass.DESC;
    }

    public static MethodHandle getpass$handle() {
        return getpass.HANDLE;
    }

    public static MemorySegment getpass$address() {
        return getpass.ADDR;
    }

    public static MemorySegment getpass(MemorySegment __prompt) {
        MethodHandle mh$ = getpass.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getpass", __prompt);
            }
            return mh$.invokeExact(__prompt);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fsync$descriptor() {
        return fsync.DESC;
    }

    public static MethodHandle fsync$handle() {
        return fsync.HANDLE;
    }

    public static MemorySegment fsync$address() {
        return fsync.ADDR;
    }

    public static int fsync(int __fd) {
        MethodHandle mh$ = fsync.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fsync", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor gethostid$descriptor() {
        return gethostid.DESC;
    }

    public static MethodHandle gethostid$handle() {
        return gethostid.HANDLE;
    }

    public static MemorySegment gethostid$address() {
        return gethostid.ADDR;
    }

    public static long gethostid() {
        MethodHandle mh$ = gethostid.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("gethostid", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sync$descriptor() {
        return sync.DESC;
    }

    public static MethodHandle sync$handle() {
        return sync.HANDLE;
    }

    public static MemorySegment sync$address() {
        return sync.ADDR;
    }

    public static void sync() {
        MethodHandle mh$ = sync.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sync", new Object[0]);
            }
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getpagesize$descriptor() {
        return getpagesize.DESC;
    }

    public static MethodHandle getpagesize$handle() {
        return getpagesize.HANDLE;
    }

    public static MemorySegment getpagesize$address() {
        return getpagesize.ADDR;
    }

    public static int getpagesize() {
        MethodHandle mh$ = getpagesize.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getpagesize", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getdtablesize$descriptor() {
        return getdtablesize.DESC;
    }

    public static MethodHandle getdtablesize$handle() {
        return getdtablesize.HANDLE;
    }

    public static MemorySegment getdtablesize$address() {
        return getdtablesize.ADDR;
    }

    public static int getdtablesize() {
        MethodHandle mh$ = getdtablesize.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getdtablesize", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor truncate$descriptor() {
        return truncate.DESC;
    }

    public static MethodHandle truncate$handle() {
        return truncate.HANDLE;
    }

    public static MemorySegment truncate$address() {
        return truncate.ADDR;
    }

    public static int truncate(MemorySegment __file, long __length) {
        MethodHandle mh$ = truncate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("truncate", __file, __length);
            }
            return mh$.invokeExact(__file, __length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor ftruncate$descriptor() {
        return ftruncate.DESC;
    }

    public static MethodHandle ftruncate$handle() {
        return ftruncate.HANDLE;
    }

    public static MemorySegment ftruncate$address() {
        return ftruncate.ADDR;
    }

    public static int ftruncate(int __fd, long __length) {
        MethodHandle mh$ = ftruncate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("ftruncate", __fd, __length);
            }
            return mh$.invokeExact(__fd, __length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor brk$descriptor() {
        return brk.DESC;
    }

    public static MethodHandle brk$handle() {
        return brk.HANDLE;
    }

    public static MemorySegment brk$address() {
        return brk.ADDR;
    }

    public static int brk(MemorySegment __addr) {
        MethodHandle mh$ = brk.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("brk", __addr);
            }
            return mh$.invokeExact(__addr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sbrk$descriptor() {
        return sbrk.DESC;
    }

    public static MethodHandle sbrk$handle() {
        return sbrk.HANDLE;
    }

    public static MemorySegment sbrk$address() {
        return sbrk.ADDR;
    }

    public static MemorySegment sbrk(long __delta) {
        MethodHandle mh$ = sbrk.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sbrk", __delta);
            }
            return mh$.invokeExact(__delta);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor lockf$descriptor() {
        return lockf.DESC;
    }

    public static MethodHandle lockf$handle() {
        return lockf.HANDLE;
    }

    public static MemorySegment lockf$address() {
        return lockf.ADDR;
    }

    public static int lockf(int __fd, int __cmd, long __len) {
        MethodHandle mh$ = lockf.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("lockf", __fd, __cmd, __len);
            }
            return mh$.invokeExact(__fd, __cmd, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor fdatasync$descriptor() {
        return fdatasync.DESC;
    }

    public static MethodHandle fdatasync$handle() {
        return fdatasync.HANDLE;
    }

    public static MemorySegment fdatasync$address() {
        return fdatasync.ADDR;
    }

    public static int fdatasync(int __fildes) {
        MethodHandle mh$ = fdatasync.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("fdatasync", __fildes);
            }
            return mh$.invokeExact(__fildes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor crypt$descriptor() {
        return crypt.DESC;
    }

    public static MethodHandle crypt$handle() {
        return crypt.HANDLE;
    }

    public static MemorySegment crypt$address() {
        return crypt.ADDR;
    }

    public static MemorySegment crypt(MemorySegment __key, MemorySegment __salt) {
        MethodHandle mh$ = crypt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("crypt", __key, __salt);
            }
            return mh$.invokeExact(__key, __salt);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getentropy$descriptor() {
        return getentropy.DESC;
    }

    public static MethodHandle getentropy$handle() {
        return getentropy.HANDLE;
    }

    public static MemorySegment getentropy$address() {
        return getentropy.ADDR;
    }

    public static int getentropy(MemorySegment __buffer, long __length) {
        MethodHandle mh$ = getentropy.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getentropy", __buffer, __length);
            }
            return mh$.invokeExact(__buffer, __length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor creat$descriptor() {
        return creat.DESC;
    }

    public static MethodHandle creat$handle() {
        return creat.HANDLE;
    }

    public static MemorySegment creat$address() {
        return creat.ADDR;
    }

    public static int creat(MemorySegment __file, int __mode) {
        MethodHandle mh$ = creat.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("creat", __file, __mode);
            }
            return mh$.invokeExact(__file, __mode);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor posix_fadvise$descriptor() {
        return posix_fadvise.DESC;
    }

    public static MethodHandle posix_fadvise$handle() {
        return posix_fadvise.HANDLE;
    }

    public static MemorySegment posix_fadvise$address() {
        return posix_fadvise.ADDR;
    }

    public static int posix_fadvise(int __fd, long __offset, long __len, int __advise) {
        MethodHandle mh$ = posix_fadvise.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("posix_fadvise", __fd, __offset, __len, __advise);
            }
            return mh$.invokeExact(__fd, __offset, __len, __advise);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor posix_fallocate$descriptor() {
        return posix_fallocate.DESC;
    }

    public static MethodHandle posix_fallocate$handle() {
        return posix_fallocate.HANDLE;
    }

    public static MemorySegment posix_fallocate$address() {
        return posix_fallocate.ADDR;
    }

    public static int posix_fallocate(int __fd, long __offset, long __len) {
        MethodHandle mh$ = posix_fallocate.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("posix_fallocate", __fd, __offset, __len);
            }
            return mh$.invokeExact(__fd, __offset, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int TPACKET_V1() {
        return 0;
    }

    public static int TPACKET_V2() {
        return 1;
    }

    public static int TPACKET_V3() {
        return 2;
    }

    public static int IPV4_DEVCONF_FORWARDING() {
        return 1;
    }

    public static int IPV4_DEVCONF_MC_FORWARDING() {
        return 2;
    }

    public static int IPV4_DEVCONF_PROXY_ARP() {
        return 3;
    }

    public static int IPV4_DEVCONF_ACCEPT_REDIRECTS() {
        return 4;
    }

    public static int IPV4_DEVCONF_SECURE_REDIRECTS() {
        return 5;
    }

    public static int IPV4_DEVCONF_SEND_REDIRECTS() {
        return 6;
    }

    public static int IPV4_DEVCONF_SHARED_MEDIA() {
        return 7;
    }

    public static int IPV4_DEVCONF_RP_FILTER() {
        return 8;
    }

    public static int IPV4_DEVCONF_ACCEPT_SOURCE_ROUTE() {
        return 9;
    }

    public static int IPV4_DEVCONF_BOOTP_RELAY() {
        return 10;
    }

    public static int IPV4_DEVCONF_LOG_MARTIANS() {
        return 11;
    }

    public static int IPV4_DEVCONF_TAG() {
        return 12;
    }

    public static int IPV4_DEVCONF_ARPFILTER() {
        return 13;
    }

    public static int IPV4_DEVCONF_MEDIUM_ID() {
        return 14;
    }

    public static int IPV4_DEVCONF_NOXFRM() {
        return 15;
    }

    public static int IPV4_DEVCONF_NOPOLICY() {
        return 16;
    }

    public static int IPV4_DEVCONF_FORCE_IGMP_VERSION() {
        return 17;
    }

    public static int IPV4_DEVCONF_ARP_ANNOUNCE() {
        return 18;
    }

    public static int IPV4_DEVCONF_ARP_IGNORE() {
        return 19;
    }

    public static int IPV4_DEVCONF_PROMOTE_SECONDARIES() {
        return 20;
    }

    public static int IPV4_DEVCONF_ARP_ACCEPT() {
        return 21;
    }

    public static int IPV4_DEVCONF_ARP_NOTIFY() {
        return 22;
    }

    public static int IPV4_DEVCONF_ACCEPT_LOCAL() {
        return 23;
    }

    public static int IPV4_DEVCONF_SRC_VMARK() {
        return 24;
    }

    public static int IPV4_DEVCONF_PROXY_ARP_PVLAN() {
        return 25;
    }

    public static int IPV4_DEVCONF_ROUTE_LOCALNET() {
        return 26;
    }

    public static int IPV4_DEVCONF_IGMPV2_UNSOLICITED_REPORT_INTERVAL() {
        return 27;
    }

    public static int IPV4_DEVCONF_IGMPV3_UNSOLICITED_REPORT_INTERVAL() {
        return 28;
    }

    public static int IPV4_DEVCONF_IGNORE_ROUTES_WITH_LINKDOWN() {
        return 29;
    }

    public static int IPV4_DEVCONF_DROP_UNICAST_IN_L2_MULTICAST() {
        return 30;
    }

    public static int IPV4_DEVCONF_DROP_GRATUITOUS_ARP() {
        return 31;
    }

    public static int IPV4_DEVCONF_BC_FORWARDING() {
        return 32;
    }

    public static int IPV4_DEVCONF_ARP_EVICT_NOCARRIER() {
        return 33;
    }

    public static int __IPV4_DEVCONF_MAX() {
        return 34;
    }

    public static int DEVCONF_FORWARDING() {
        return 0;
    }

    public static int DEVCONF_HOPLIMIT() {
        return 1;
    }

    public static int DEVCONF_MTU6() {
        return 2;
    }

    public static int DEVCONF_ACCEPT_RA() {
        return 3;
    }

    public static int DEVCONF_ACCEPT_REDIRECTS() {
        return 4;
    }

    public static int DEVCONF_AUTOCONF() {
        return 5;
    }

    public static int DEVCONF_DAD_TRANSMITS() {
        return 6;
    }

    public static int DEVCONF_RTR_SOLICITS() {
        return 7;
    }

    public static int DEVCONF_RTR_SOLICIT_INTERVAL() {
        return 8;
    }

    public static int DEVCONF_RTR_SOLICIT_DELAY() {
        return 9;
    }

    public static int DEVCONF_USE_TEMPADDR() {
        return 10;
    }

    public static int DEVCONF_TEMP_VALID_LFT() {
        return 11;
    }

    public static int DEVCONF_TEMP_PREFERED_LFT() {
        return 12;
    }

    public static int DEVCONF_REGEN_MAX_RETRY() {
        return 13;
    }

    public static int DEVCONF_MAX_DESYNC_FACTOR() {
        return 14;
    }

    public static int DEVCONF_MAX_ADDRESSES() {
        return 15;
    }

    public static int DEVCONF_FORCE_MLD_VERSION() {
        return 16;
    }

    public static int DEVCONF_ACCEPT_RA_DEFRTR() {
        return 17;
    }

    public static int DEVCONF_ACCEPT_RA_PINFO() {
        return 18;
    }

    public static int DEVCONF_ACCEPT_RA_RTR_PREF() {
        return 19;
    }

    public static int DEVCONF_RTR_PROBE_INTERVAL() {
        return 20;
    }

    public static int DEVCONF_ACCEPT_RA_RT_INFO_MAX_PLEN() {
        return 21;
    }

    public static int DEVCONF_PROXY_NDP() {
        return 22;
    }

    public static int DEVCONF_OPTIMISTIC_DAD() {
        return 23;
    }

    public static int DEVCONF_ACCEPT_SOURCE_ROUTE() {
        return 24;
    }

    public static int DEVCONF_MC_FORWARDING() {
        return 25;
    }

    public static int DEVCONF_DISABLE_IPV6() {
        return 26;
    }

    public static int DEVCONF_ACCEPT_DAD() {
        return 27;
    }

    public static int DEVCONF_FORCE_TLLAO() {
        return 28;
    }

    public static int DEVCONF_NDISC_NOTIFY() {
        return 29;
    }

    public static int DEVCONF_MLDV1_UNSOLICITED_REPORT_INTERVAL() {
        return 30;
    }

    public static int DEVCONF_MLDV2_UNSOLICITED_REPORT_INTERVAL() {
        return 31;
    }

    public static int DEVCONF_SUPPRESS_FRAG_NDISC() {
        return 32;
    }

    public static int DEVCONF_ACCEPT_RA_FROM_LOCAL() {
        return 33;
    }

    public static int DEVCONF_USE_OPTIMISTIC() {
        return 34;
    }

    public static int DEVCONF_ACCEPT_RA_MTU() {
        return 35;
    }

    public static int DEVCONF_STABLE_SECRET() {
        return 36;
    }

    public static int DEVCONF_USE_OIF_ADDRS_ONLY() {
        return 37;
    }

    public static int DEVCONF_ACCEPT_RA_MIN_HOP_LIMIT() {
        return 38;
    }

    public static int DEVCONF_IGNORE_ROUTES_WITH_LINKDOWN() {
        return 39;
    }

    public static int DEVCONF_DROP_UNICAST_IN_L2_MULTICAST() {
        return 40;
    }

    public static int DEVCONF_DROP_UNSOLICITED_NA() {
        return 41;
    }

    public static int DEVCONF_KEEP_ADDR_ON_DOWN() {
        return 42;
    }

    public static int DEVCONF_RTR_SOLICIT_MAX_INTERVAL() {
        return 43;
    }

    public static int DEVCONF_SEG6_ENABLED() {
        return 44;
    }

    public static int DEVCONF_SEG6_REQUIRE_HMAC() {
        return 45;
    }

    public static int DEVCONF_ENHANCED_DAD() {
        return 46;
    }

    public static int DEVCONF_ADDR_GEN_MODE() {
        return 47;
    }

    public static int DEVCONF_DISABLE_POLICY() {
        return 48;
    }

    public static int DEVCONF_ACCEPT_RA_RT_INFO_MIN_PLEN() {
        return 49;
    }

    public static int DEVCONF_NDISC_TCLASS() {
        return 50;
    }

    public static int DEVCONF_RPL_SEG_ENABLED() {
        return 51;
    }

    public static int DEVCONF_RA_DEFRTR_METRIC() {
        return 52;
    }

    public static int DEVCONF_IOAM6_ENABLED() {
        return 53;
    }

    public static int DEVCONF_IOAM6_ID() {
        return 54;
    }

    public static int DEVCONF_IOAM6_ID_WIDE() {
        return 55;
    }

    public static int DEVCONF_NDISC_EVICT_NOCARRIER() {
        return 56;
    }

    public static int DEVCONF_ACCEPT_UNTRACKED_NA() {
        return 57;
    }

    public static int DEVCONF_ACCEPT_RA_MIN_LFT() {
        return 58;
    }

    public static int DEVCONF_MAX() {
        return 59;
    }

    public static int SOCK_STREAM() {
        return 1;
    }

    public static int SOCK_DGRAM() {
        return 2;
    }

    public static int SOCK_RAW() {
        return 3;
    }

    public static int SOCK_RDM() {
        return 4;
    }

    public static int SOCK_SEQPACKET() {
        return 5;
    }

    public static int SOCK_DCCP() {
        return 6;
    }

    public static int SOCK_PACKET() {
        return 10;
    }

    public static int SOCK_CLOEXEC() {
        return 524288;
    }

    public static int SOCK_NONBLOCK() {
        return 2048;
    }

    public static int MSG_OOB() {
        return 1;
    }

    public static int MSG_PEEK() {
        return 2;
    }

    public static int MSG_DONTROUTE() {
        return 4;
    }

    public static int MSG_CTRUNC() {
        return 8;
    }

    public static int MSG_PROXY() {
        return 16;
    }

    public static int MSG_TRUNC() {
        return 32;
    }

    public static int MSG_DONTWAIT() {
        return 64;
    }

    public static int MSG_EOR() {
        return 128;
    }

    public static int MSG_WAITALL() {
        return 256;
    }

    public static int MSG_FIN() {
        return 512;
    }

    public static int MSG_SYN() {
        return 1024;
    }

    public static int MSG_CONFIRM() {
        return 2048;
    }

    public static int MSG_RST() {
        return 4096;
    }

    public static int MSG_ERRQUEUE() {
        return 8192;
    }

    public static int MSG_NOSIGNAL() {
        return 16384;
    }

    public static int MSG_MORE() {
        return 32768;
    }

    public static int MSG_WAITFORONE() {
        return 65536;
    }

    public static int MSG_BATCH() {
        return 262144;
    }

    public static int MSG_SOCK_DEVMEM() {
        return 0x2000000;
    }

    public static int MSG_ZEROCOPY() {
        return 0x4000000;
    }

    public static int MSG_FASTOPEN() {
        return 0x20000000;
    }

    public static int MSG_CMSG_CLOEXEC() {
        return 0x40000000;
    }

    public static FunctionDescriptor __cmsg_nxthdr$descriptor() {
        return __cmsg_nxthdr.DESC;
    }

    public static MethodHandle __cmsg_nxthdr$handle() {
        return __cmsg_nxthdr.HANDLE;
    }

    public static MemorySegment __cmsg_nxthdr$address() {
        return __cmsg_nxthdr.ADDR;
    }

    public static MemorySegment __cmsg_nxthdr(MemorySegment __mhdr, MemorySegment __cmsg) {
        MethodHandle mh$ = __cmsg_nxthdr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("__cmsg_nxthdr", __mhdr, __cmsg);
            }
            return mh$.invokeExact(__mhdr, __cmsg);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int SCM_RIGHTS() {
        return 1;
    }

    public static int SHUT_RD() {
        return 0;
    }

    public static int SHUT_WR() {
        return 1;
    }

    public static int SHUT_RDWR() {
        return 2;
    }

    public static FunctionDescriptor socket$descriptor() {
        return socket.DESC;
    }

    public static MethodHandle socket$handle() {
        return socket.HANDLE;
    }

    public static MemorySegment socket$address() {
        return socket.ADDR;
    }

    public static int socket(int __domain, int __type, int __protocol) {
        MethodHandle mh$ = socket.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("socket", __domain, __type, __protocol);
            }
            return mh$.invokeExact(__domain, __type, __protocol);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor socketpair$descriptor() {
        return socketpair.DESC;
    }

    public static MethodHandle socketpair$handle() {
        return socketpair.HANDLE;
    }

    public static MemorySegment socketpair$address() {
        return socketpair.ADDR;
    }

    public static int socketpair(int __domain, int __type, int __protocol, MemorySegment __fds) {
        MethodHandle mh$ = socketpair.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("socketpair", __domain, __type, __protocol, __fds);
            }
            return mh$.invokeExact(__domain, __type, __protocol, __fds);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor bind$descriptor() {
        return bind.DESC;
    }

    public static MethodHandle bind$handle() {
        return bind.HANDLE;
    }

    public static MemorySegment bind$address() {
        return bind.ADDR;
    }

    public static int bind(int __fd, MemorySegment __addr, int __len) {
        MethodHandle mh$ = bind.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("bind", __fd, __addr, __len);
            }
            return mh$.invokeExact(__fd, __addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getsockname$descriptor() {
        return getsockname.DESC;
    }

    public static MethodHandle getsockname$handle() {
        return getsockname.HANDLE;
    }

    public static MemorySegment getsockname$address() {
        return getsockname.ADDR;
    }

    public static int getsockname(int __fd, MemorySegment __addr, MemorySegment __len) {
        MethodHandle mh$ = getsockname.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getsockname", __fd, __addr, __len);
            }
            return mh$.invokeExact(__fd, __addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor connect$descriptor() {
        return connect.DESC;
    }

    public static MethodHandle connect$handle() {
        return connect.HANDLE;
    }

    public static MemorySegment connect$address() {
        return connect.ADDR;
    }

    public static int connect(int __fd, MemorySegment __addr, int __len) {
        MethodHandle mh$ = connect.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("connect", __fd, __addr, __len);
            }
            return mh$.invokeExact(__fd, __addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getpeername$descriptor() {
        return getpeername.DESC;
    }

    public static MethodHandle getpeername$handle() {
        return getpeername.HANDLE;
    }

    public static MemorySegment getpeername$address() {
        return getpeername.ADDR;
    }

    public static int getpeername(int __fd, MemorySegment __addr, MemorySegment __len) {
        MethodHandle mh$ = getpeername.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getpeername", __fd, __addr, __len);
            }
            return mh$.invokeExact(__fd, __addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor send$descriptor() {
        return send.DESC;
    }

    public static MethodHandle send$handle() {
        return send.HANDLE;
    }

    public static MemorySegment send$address() {
        return send.ADDR;
    }

    public static long send(int __fd, MemorySegment __buf, long __n, int __flags) {
        MethodHandle mh$ = send.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("send", __fd, __buf, __n, __flags);
            }
            return mh$.invokeExact(__fd, __buf, __n, __flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor recv$descriptor() {
        return recv.DESC;
    }

    public static MethodHandle recv$handle() {
        return recv.HANDLE;
    }

    public static MemorySegment recv$address() {
        return recv.ADDR;
    }

    public static long recv(int __fd, MemorySegment __buf, long __n, int __flags) {
        MethodHandle mh$ = recv.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("recv", __fd, __buf, __n, __flags);
            }
            return mh$.invokeExact(__fd, __buf, __n, __flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sendto$descriptor() {
        return sendto.DESC;
    }

    public static MethodHandle sendto$handle() {
        return sendto.HANDLE;
    }

    public static MemorySegment sendto$address() {
        return sendto.ADDR;
    }

    public static long sendto(int __fd, MemorySegment __buf, long __n, int __flags, MemorySegment __addr, int __addr_len) {
        MethodHandle mh$ = sendto.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sendto", __fd, __buf, __n, __flags, __addr, __addr_len);
            }
            return mh$.invokeExact(__fd, __buf, __n, __flags, __addr, __addr_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor recvfrom$descriptor() {
        return recvfrom.DESC;
    }

    public static MethodHandle recvfrom$handle() {
        return recvfrom.HANDLE;
    }

    public static MemorySegment recvfrom$address() {
        return recvfrom.ADDR;
    }

    public static long recvfrom(int __fd, MemorySegment __buf, long __n, int __flags, MemorySegment __addr, MemorySegment __addr_len) {
        MethodHandle mh$ = recvfrom.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("recvfrom", __fd, __buf, __n, __flags, __addr, __addr_len);
            }
            return mh$.invokeExact(__fd, __buf, __n, __flags, __addr, __addr_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sendmsg$descriptor() {
        return sendmsg.DESC;
    }

    public static MethodHandle sendmsg$handle() {
        return sendmsg.HANDLE;
    }

    public static MemorySegment sendmsg$address() {
        return sendmsg.ADDR;
    }

    public static long sendmsg(int __fd, MemorySegment __message, int __flags) {
        MethodHandle mh$ = sendmsg.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sendmsg", __fd, __message, __flags);
            }
            return mh$.invokeExact(__fd, __message, __flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor recvmsg$descriptor() {
        return recvmsg.DESC;
    }

    public static MethodHandle recvmsg$handle() {
        return recvmsg.HANDLE;
    }

    public static MemorySegment recvmsg$address() {
        return recvmsg.ADDR;
    }

    public static long recvmsg(int __fd, MemorySegment __message, int __flags) {
        MethodHandle mh$ = recvmsg.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("recvmsg", __fd, __message, __flags);
            }
            return mh$.invokeExact(__fd, __message, __flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor getsockopt$descriptor() {
        return getsockopt.DESC;
    }

    public static MethodHandle getsockopt$handle() {
        return getsockopt.HANDLE;
    }

    public static MemorySegment getsockopt$address() {
        return getsockopt.ADDR;
    }

    public static int getsockopt(int __fd, int __level, int __optname, MemorySegment __optval, MemorySegment __optlen) {
        MethodHandle mh$ = getsockopt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("getsockopt", __fd, __level, __optname, __optval, __optlen);
            }
            return mh$.invokeExact(__fd, __level, __optname, __optval, __optlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor setsockopt$descriptor() {
        return setsockopt.DESC;
    }

    public static MethodHandle setsockopt$handle() {
        return setsockopt.HANDLE;
    }

    public static MemorySegment setsockopt$address() {
        return setsockopt.ADDR;
    }

    public static int setsockopt(int __fd, int __level, int __optname, MemorySegment __optval, int __optlen) {
        MethodHandle mh$ = setsockopt.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("setsockopt", __fd, __level, __optname, __optval, __optlen);
            }
            return mh$.invokeExact(__fd, __level, __optname, __optval, __optlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor listen$descriptor() {
        return listen.DESC;
    }

    public static MethodHandle listen$handle() {
        return listen.HANDLE;
    }

    public static MemorySegment listen$address() {
        return listen.ADDR;
    }

    public static int listen(int __fd, int __n) {
        MethodHandle mh$ = listen.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("listen", __fd, __n);
            }
            return mh$.invokeExact(__fd, __n);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor accept$descriptor() {
        return accept.DESC;
    }

    public static MethodHandle accept$handle() {
        return accept.HANDLE;
    }

    public static MemorySegment accept$address() {
        return accept.ADDR;
    }

    public static int accept(int __fd, MemorySegment __addr, MemorySegment __addr_len) {
        MethodHandle mh$ = accept.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("accept", __fd, __addr, __addr_len);
            }
            return mh$.invokeExact(__fd, __addr, __addr_len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor shutdown$descriptor() {
        return shutdown.DESC;
    }

    public static MethodHandle shutdown$handle() {
        return shutdown.HANDLE;
    }

    public static MemorySegment shutdown$address() {
        return shutdown.ADDR;
    }

    public static int shutdown(int __fd, int __how) {
        MethodHandle mh$ = shutdown.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("shutdown", __fd, __how);
            }
            return mh$.invokeExact(__fd, __how);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sockatmark$descriptor() {
        return sockatmark.DESC;
    }

    public static MethodHandle sockatmark$handle() {
        return sockatmark.HANDLE;
    }

    public static MemorySegment sockatmark$address() {
        return sockatmark.ADDR;
    }

    public static int sockatmark(int __fd) {
        MethodHandle mh$ = sockatmark.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sockatmark", __fd);
            }
            return mh$.invokeExact(__fd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor isfdtype$descriptor() {
        return isfdtype.DESC;
    }

    public static MethodHandle isfdtype$handle() {
        return isfdtype.HANDLE;
    }

    public static MemorySegment isfdtype$address() {
        return isfdtype.ADDR;
    }

    public static int isfdtype(int __fd, int __fdtype) {
        MethodHandle mh$ = isfdtype.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("isfdtype", __fd, __fdtype);
            }
            return mh$.invokeExact(__fd, __fdtype);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int IFF_UP() {
        return 1;
    }

    public static int IFF_BROADCAST() {
        return 2;
    }

    public static int IFF_DEBUG() {
        return 4;
    }

    public static int IFF_LOOPBACK() {
        return 8;
    }

    public static int IFF_POINTOPOINT() {
        return 16;
    }

    public static int IFF_NOTRAILERS() {
        return 32;
    }

    public static int IFF_RUNNING() {
        return 64;
    }

    public static int IFF_NOARP() {
        return 128;
    }

    public static int IFF_PROMISC() {
        return 256;
    }

    public static int IFF_ALLMULTI() {
        return 512;
    }

    public static int IFF_MASTER() {
        return 1024;
    }

    public static int IFF_SLAVE() {
        return 2048;
    }

    public static int IFF_MULTICAST() {
        return 4096;
    }

    public static int IFF_PORTSEL() {
        return 8192;
    }

    public static int IFF_AUTOMEDIA() {
        return 16384;
    }

    public static int IFF_DYNAMIC() {
        return 32768;
    }

    public static int IFF_LOWER_UP() {
        return 65536;
    }

    public static int IFF_DORMANT() {
        return 131072;
    }

    public static int IFF_ECHO() {
        return 262144;
    }

    public static int IF_OPER_UNKNOWN() {
        return 0;
    }

    public static int IF_OPER_NOTPRESENT() {
        return 1;
    }

    public static int IF_OPER_DOWN() {
        return 2;
    }

    public static int IF_OPER_LOWERLAYERDOWN() {
        return 3;
    }

    public static int IF_OPER_TESTING() {
        return 4;
    }

    public static int IF_OPER_DORMANT() {
        return 5;
    }

    public static int IF_OPER_UP() {
        return 6;
    }

    public static int IF_LINK_MODE_DEFAULT() {
        return 0;
    }

    public static int IF_LINK_MODE_DORMANT() {
        return 1;
    }

    public static int IF_LINK_MODE_TESTING() {
        return 2;
    }

    public static int TCP_FLAG_CWR() {
        return 32768;
    }

    public static int TCP_FLAG_ECE() {
        return 16384;
    }

    public static int TCP_FLAG_URG() {
        return 8192;
    }

    public static int TCP_FLAG_ACK() {
        return 4096;
    }

    public static int TCP_FLAG_PSH() {
        return 2048;
    }

    public static int TCP_FLAG_RST() {
        return 1024;
    }

    public static int TCP_FLAG_SYN() {
        return 512;
    }

    public static int TCP_FLAG_FIN() {
        return 256;
    }

    public static int TCP_RESERVED_BITS() {
        return 15;
    }

    public static int TCP_DATA_OFFSET() {
        return 240;
    }

    public static int TCP_NO_QUEUE() {
        return 0;
    }

    public static int TCP_RECV_QUEUE() {
        return 1;
    }

    public static int TCP_SEND_QUEUE() {
        return 2;
    }

    public static int TCP_QUEUES_NR() {
        return 3;
    }

    public static int TFO_STATUS_UNSPEC() {
        return 0;
    }

    public static int TFO_COOKIE_UNAVAILABLE() {
        return 1;
    }

    public static int TFO_DATA_NOT_ACKED() {
        return 2;
    }

    public static int TFO_SYN_RETRANSMITTED() {
        return 3;
    }

    public static int TCP_CA_Open() {
        return 0;
    }

    public static int TCP_CA_Disorder() {
        return 1;
    }

    public static int TCP_CA_CWR() {
        return 2;
    }

    public static int TCP_CA_Recovery() {
        return 3;
    }

    public static int TCP_CA_Loss() {
        return 4;
    }

    public static int TCP_NLA_PAD() {
        return 0;
    }

    public static int TCP_NLA_BUSY() {
        return 1;
    }

    public static int TCP_NLA_RWND_LIMITED() {
        return 2;
    }

    public static int TCP_NLA_SNDBUF_LIMITED() {
        return 3;
    }

    public static int TCP_NLA_DATA_SEGS_OUT() {
        return 4;
    }

    public static int TCP_NLA_TOTAL_RETRANS() {
        return 5;
    }

    public static int TCP_NLA_PACING_RATE() {
        return 6;
    }

    public static int TCP_NLA_DELIVERY_RATE() {
        return 7;
    }

    public static int TCP_NLA_SND_CWND() {
        return 8;
    }

    public static int TCP_NLA_REORDERING() {
        return 9;
    }

    public static int TCP_NLA_MIN_RTT() {
        return 10;
    }

    public static int TCP_NLA_RECUR_RETRANS() {
        return 11;
    }

    public static int TCP_NLA_DELIVERY_RATE_APP_LMT() {
        return 12;
    }

    public static int TCP_NLA_SNDQ_SIZE() {
        return 13;
    }

    public static int TCP_NLA_CA_STATE() {
        return 14;
    }

    public static int TCP_NLA_SND_SSTHRESH() {
        return 15;
    }

    public static int TCP_NLA_DELIVERED() {
        return 16;
    }

    public static int TCP_NLA_DELIVERED_CE() {
        return 17;
    }

    public static int TCP_NLA_BYTES_SENT() {
        return 18;
    }

    public static int TCP_NLA_BYTES_RETRANS() {
        return 19;
    }

    public static int TCP_NLA_DSACK_DUPS() {
        return 20;
    }

    public static int TCP_NLA_REORD_SEEN() {
        return 21;
    }

    public static int TCP_NLA_SRTT() {
        return 22;
    }

    public static int TCP_NLA_TIMEOUT_REHASH() {
        return 23;
    }

    public static int TCP_NLA_BYTES_NOTSENT() {
        return 24;
    }

    public static int TCP_NLA_EDT() {
        return 25;
    }

    public static int TCP_NLA_TTL() {
        return 26;
    }

    public static int TCP_NLA_REHASH() {
        return 27;
    }

    public static int IPPROTO_IP() {
        return 0;
    }

    public static int IPPROTO_ICMP() {
        return 1;
    }

    public static int IPPROTO_IGMP() {
        return 2;
    }

    public static int IPPROTO_IPIP() {
        return 4;
    }

    public static int IPPROTO_TCP() {
        return 6;
    }

    public static int IPPROTO_EGP() {
        return 8;
    }

    public static int IPPROTO_PUP() {
        return 12;
    }

    public static int IPPROTO_UDP() {
        return 17;
    }

    public static int IPPROTO_IDP() {
        return 22;
    }

    public static int IPPROTO_TP() {
        return 29;
    }

    public static int IPPROTO_DCCP() {
        return 33;
    }

    public static int IPPROTO_IPV6() {
        return 41;
    }

    public static int IPPROTO_RSVP() {
        return 46;
    }

    public static int IPPROTO_GRE() {
        return 47;
    }

    public static int IPPROTO_ESP() {
        return 50;
    }

    public static int IPPROTO_AH() {
        return 51;
    }

    public static int IPPROTO_MTP() {
        return 92;
    }

    public static int IPPROTO_BEETPH() {
        return 94;
    }

    public static int IPPROTO_ENCAP() {
        return 98;
    }

    public static int IPPROTO_PIM() {
        return 103;
    }

    public static int IPPROTO_COMP() {
        return 108;
    }

    public static int IPPROTO_L2TP() {
        return 115;
    }

    public static int IPPROTO_SCTP() {
        return 132;
    }

    public static int IPPROTO_UDPLITE() {
        return 136;
    }

    public static int IPPROTO_MPLS() {
        return 137;
    }

    public static int IPPROTO_ETHERNET() {
        return 143;
    }

    public static int IPPROTO_AGGFRAG() {
        return 144;
    }

    public static int IPPROTO_RAW() {
        return 255;
    }

    public static int IPPROTO_SMC() {
        return 256;
    }

    public static int IPPROTO_MPTCP() {
        return 262;
    }

    public static int IPPROTO_MAX() {
        return 263;
    }

    public static FunctionDescriptor __sched_cpucount$descriptor() {
        return __sched_cpucount.DESC;
    }

    public static MethodHandle __sched_cpucount$handle() {
        return __sched_cpucount.HANDLE;
    }

    public static MemorySegment __sched_cpucount$address() {
        return __sched_cpucount.ADDR;
    }

    public static int __sched_cpucount(long __setsize, MemorySegment __setp) {
        MethodHandle mh$ = __sched_cpucount.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("__sched_cpucount", __setsize, __setp);
            }
            return mh$.invokeExact(__setsize, __setp);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __sched_cpualloc$descriptor() {
        return __sched_cpualloc.DESC;
    }

    public static MethodHandle __sched_cpualloc$handle() {
        return __sched_cpualloc.HANDLE;
    }

    public static MemorySegment __sched_cpualloc$address() {
        return __sched_cpualloc.ADDR;
    }

    public static MemorySegment __sched_cpualloc(long __count) {
        MethodHandle mh$ = __sched_cpualloc.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("__sched_cpualloc", __count);
            }
            return mh$.invokeExact(__count);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor __sched_cpufree$descriptor() {
        return __sched_cpufree.DESC;
    }

    public static MethodHandle __sched_cpufree$handle() {
        return __sched_cpufree.HANDLE;
    }

    public static MemorySegment __sched_cpufree$address() {
        return __sched_cpufree.ADDR;
    }

    public static void __sched_cpufree(MemorySegment __set) {
        MethodHandle mh$ = __sched_cpufree.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("__sched_cpufree", __set);
            }
            mh$.invokeExact(__set);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_setparam$descriptor() {
        return sched_setparam.DESC;
    }

    public static MethodHandle sched_setparam$handle() {
        return sched_setparam.HANDLE;
    }

    public static MemorySegment sched_setparam$address() {
        return sched_setparam.ADDR;
    }

    public static int sched_setparam(int __pid, MemorySegment __param) {
        MethodHandle mh$ = sched_setparam.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_setparam", __pid, __param);
            }
            return mh$.invokeExact(__pid, __param);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_getparam$descriptor() {
        return sched_getparam.DESC;
    }

    public static MethodHandle sched_getparam$handle() {
        return sched_getparam.HANDLE;
    }

    public static MemorySegment sched_getparam$address() {
        return sched_getparam.ADDR;
    }

    public static int sched_getparam(int __pid, MemorySegment __param) {
        MethodHandle mh$ = sched_getparam.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_getparam", __pid, __param);
            }
            return mh$.invokeExact(__pid, __param);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_setscheduler$descriptor() {
        return sched_setscheduler.DESC;
    }

    public static MethodHandle sched_setscheduler$handle() {
        return sched_setscheduler.HANDLE;
    }

    public static MemorySegment sched_setscheduler$address() {
        return sched_setscheduler.ADDR;
    }

    public static int sched_setscheduler(int __pid, int __policy, MemorySegment __param) {
        MethodHandle mh$ = sched_setscheduler.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_setscheduler", __pid, __policy, __param);
            }
            return mh$.invokeExact(__pid, __policy, __param);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_getscheduler$descriptor() {
        return sched_getscheduler.DESC;
    }

    public static MethodHandle sched_getscheduler$handle() {
        return sched_getscheduler.HANDLE;
    }

    public static MemorySegment sched_getscheduler$address() {
        return sched_getscheduler.ADDR;
    }

    public static int sched_getscheduler(int __pid) {
        MethodHandle mh$ = sched_getscheduler.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_getscheduler", __pid);
            }
            return mh$.invokeExact(__pid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_yield$descriptor() {
        return sched_yield.DESC;
    }

    public static MethodHandle sched_yield$handle() {
        return sched_yield.HANDLE;
    }

    public static MemorySegment sched_yield$address() {
        return sched_yield.ADDR;
    }

    public static int sched_yield() {
        MethodHandle mh$ = sched_yield.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_yield", new Object[0]);
            }
            return mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_get_priority_max$descriptor() {
        return sched_get_priority_max.DESC;
    }

    public static MethodHandle sched_get_priority_max$handle() {
        return sched_get_priority_max.HANDLE;
    }

    public static MemorySegment sched_get_priority_max$address() {
        return sched_get_priority_max.ADDR;
    }

    public static int sched_get_priority_max(int __algorithm) {
        MethodHandle mh$ = sched_get_priority_max.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_get_priority_max", __algorithm);
            }
            return mh$.invokeExact(__algorithm);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_get_priority_min$descriptor() {
        return sched_get_priority_min.DESC;
    }

    public static MethodHandle sched_get_priority_min$handle() {
        return sched_get_priority_min.HANDLE;
    }

    public static MemorySegment sched_get_priority_min$address() {
        return sched_get_priority_min.ADDR;
    }

    public static int sched_get_priority_min(int __algorithm) {
        MethodHandle mh$ = sched_get_priority_min.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_get_priority_min", __algorithm);
            }
            return mh$.invokeExact(__algorithm);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static FunctionDescriptor sched_rr_get_interval$descriptor() {
        return sched_rr_get_interval.DESC;
    }

    public static MethodHandle sched_rr_get_interval$handle() {
        return sched_rr_get_interval.HANDLE;
    }

    public static MemorySegment sched_rr_get_interval$address() {
        return sched_rr_get_interval.ADDR;
    }

    public static int sched_rr_get_interval(int __pid, MemorySegment __t) {
        MethodHandle mh$ = sched_rr_get_interval.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                Lib_1.traceDowncall("sched_rr_get_interval", __pid, __t);
            }
            return mh$.invokeExact(__pid, __t);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int BPF_FROM_LE() {
        return 0;
    }

    public static int BPF_FROM_BE() {
        return 8;
    }

    public static int BPF_XCHG() {
        return 225;
    }

    public static int BPF_CMPXCHG() {
        return 241;
    }

    public static int MAX_BPF_REG() {
        return 11;
    }

    public static int MAX_BPF_ATTACH_TYPE() {
        return 58;
    }

    public static int MAX_BPF_LINK_TYPE() {
        return 15;
    }

    public static int BPF_F_ALLOW_OVERRIDE() {
        return 1;
    }

    public static int BPF_F_ALLOW_MULTI() {
        return 2;
    }

    public static int BPF_F_REPLACE() {
        return 4;
    }

    public static int BPF_F_BEFORE() {
        return 8;
    }

    public static int BPF_F_AFTER() {
        return 16;
    }

    public static int BPF_F_ID() {
        return 32;
    }

    public static int BPF_F_STRICT_ALIGNMENT() {
        return 1;
    }

    public static int BPF_F_ANY_ALIGNMENT() {
        return 2;
    }

    public static int BPF_F_TEST_RND_HI32() {
        return 4;
    }

    public static int BPF_F_TEST_STATE_FREQ() {
        return 8;
    }

    public static int BPF_F_SLEEPABLE() {
        return 16;
    }

    public static int BPF_F_XDP_HAS_FRAGS() {
        return 32;
    }

    public static int BPF_F_XDP_DEV_BOUND_ONLY() {
        return 64;
    }

    public static int BPF_F_TEST_REG_INVARIANTS() {
        return 128;
    }

    public static int BPF_F_NETFILTER_IP_DEFRAG() {
        return 1;
    }

    public static int BPF_F_QUERY_EFFECTIVE() {
        return 1;
    }

    public static int BPF_F_TEST_RUN_ON_CPU() {
        return 1;
    }

    public static int BPF_F_TEST_XDP_LIVE_FRAMES() {
        return 2;
    }

    public static int BPF_F_TEST_SKB_CHECKSUM_COMPLETE() {
        return 4;
    }

    public static int BPF_OBJ_NAME_LEN() {
        return 16;
    }

    public static int BPF_F_REDIRECT_FLAGS() {
        return 25;
    }

    public static MemorySegment NULL() {
        return NULL;
    }

    public static long _POSIX_C_SOURCE() {
        return 200809L;
    }

    public static int __TIMESIZE() {
        return 64;
    }

    public static long __STDC_IEC_60559_BFP__() {
        return 201404L;
    }

    public static long __STDC_IEC_60559_COMPLEX__() {
        return 201404L;
    }

    public static long __STDC_ISO_10646__() {
        return 201706L;
    }

    public static int __WCHAR_MAX() {
        return Integer.MAX_VALUE;
    }

    public static int __WCHAR_MIN() {
        return Integer.MIN_VALUE;
    }

    public static int INT8_MIN() {
        return -128;
    }

    public static int INT16_MIN() {
        return Short.MIN_VALUE;
    }

    public static int INT32_MIN() {
        return Integer.MIN_VALUE;
    }

    public static long INT64_MIN() {
        return Long.MIN_VALUE;
    }

    public static int INT8_MAX() {
        return 127;
    }

    public static int INT16_MAX() {
        return Short.MAX_VALUE;
    }

    public static int INT32_MAX() {
        return Integer.MAX_VALUE;
    }

    public static long INT64_MAX() {
        return Long.MAX_VALUE;
    }

    public static int UINT8_MAX() {
        return 255;
    }

    public static int UINT16_MAX() {
        return 65535;
    }

    public static int UINT32_MAX() {
        return -1;
    }

    public static long UINT64_MAX() {
        return -1L;
    }

    public static int INT_LEAST8_MIN() {
        return -128;
    }

    public static int INT_LEAST16_MIN() {
        return Short.MIN_VALUE;
    }

    public static int INT_LEAST32_MIN() {
        return Integer.MIN_VALUE;
    }

    public static long INT_LEAST64_MIN() {
        return Long.MIN_VALUE;
    }

    public static int INT_LEAST8_MAX() {
        return 127;
    }

    public static int INT_LEAST16_MAX() {
        return Short.MAX_VALUE;
    }

    public static int INT_LEAST32_MAX() {
        return Integer.MAX_VALUE;
    }

    public static long INT_LEAST64_MAX() {
        return Long.MAX_VALUE;
    }

    public static int UINT_LEAST8_MAX() {
        return 255;
    }

    public static int UINT_LEAST16_MAX() {
        return 65535;
    }

    public static int UINT_LEAST32_MAX() {
        return -1;
    }

    public static long UINT_LEAST64_MAX() {
        return -1L;
    }

    public static int INT_FAST8_MIN() {
        return -128;
    }

    public static long INT_FAST16_MIN() {
        return Long.MIN_VALUE;
    }

    public static long INT_FAST32_MIN() {
        return Long.MIN_VALUE;
    }

    public static long INT_FAST64_MIN() {
        return Long.MIN_VALUE;
    }

    public static int INT_FAST8_MAX() {
        return 127;
    }

    public static long INT_FAST16_MAX() {
        return Long.MAX_VALUE;
    }

    public static long INT_FAST32_MAX() {
        return Long.MAX_VALUE;
    }

    public static long INT_FAST64_MAX() {
        return Long.MAX_VALUE;
    }

    public static int UINT_FAST8_MAX() {
        return 255;
    }

    public static long UINT_FAST16_MAX() {
        return -1L;
    }

    public static long UINT_FAST32_MAX() {
        return -1L;
    }

    public static long UINT_FAST64_MAX() {
        return -1L;
    }

    public static long INTPTR_MIN() {
        return Long.MIN_VALUE;
    }

    public static long INTPTR_MAX() {
        return Long.MAX_VALUE;
    }

    public static long UINTPTR_MAX() {
        return -1L;
    }

    public static long INTMAX_MIN() {
        return Long.MIN_VALUE;
    }

    public static long INTMAX_MAX() {
        return Long.MAX_VALUE;
    }

    public static long UINTMAX_MAX() {
        return -1L;
    }

    public static long PTRDIFF_MIN() {
        return Long.MIN_VALUE;
    }

    public static long PTRDIFF_MAX() {
        return Long.MAX_VALUE;
    }

    public static int SIG_ATOMIC_MIN() {
        return Integer.MIN_VALUE;
    }

    public static int SIG_ATOMIC_MAX() {
        return Integer.MAX_VALUE;
    }

    public static long SIZE_MAX() {
        return -1L;
    }

    public static int WCHAR_MIN() {
        return Integer.MIN_VALUE;
    }

    public static int WCHAR_MAX() {
        return Integer.MAX_VALUE;
    }

    public static int WINT_MIN() {
        return 0;
    }

    public static int WINT_MAX() {
        return -1;
    }

    public static int BPF_LOG_BUF_SIZE() {
        return 0xFFFFFF;
    }

    public static int EOF() {
        return -1;
    }

    public static MemorySegment P_tmpdir() {
        class Holder {
            static final MemorySegment P_tmpdir = Lib.LIBRARY_ARENA.allocateFrom("/tmp");

            Holder() {
            }
        }
        return Holder.P_tmpdir;
    }

    public static int __HAVE_DISTINCT_FLOAT16() {
        return 0;
    }

    public static int __HAVE_DISTINCT_FLOAT128X() {
        return 0;
    }

    public static int __HAVE_FLOAT128_UNLIKE_LDBL() {
        return 1;
    }

    public static int __BYTE_ORDER() {
        return 1234;
    }

    public static int __FLOAT_WORD_ORDER() {
        return 1234;
    }

    public static int LITTLE_ENDIAN() {
        return 1234;
    }

    public static int BIG_ENDIAN() {
        return 4321;
    }

    public static int PDP_ENDIAN() {
        return 3412;
    }

    public static int BYTE_ORDER() {
        return 1234;
    }

    public static long _SIGSET_NWORDS() {
        return 16L;
    }

    public static int __NFDBITS() {
        return 64;
    }

    public static int FD_SETSIZE() {
        return 1024;
    }

    public static int NFDBITS() {
        return 64;
    }

    public static int __PTHREAD_RWLOCK_ELISION_EXTRA() {
        return 0;
    }

    public static int BTF_INT_SIGNED() {
        return 1;
    }

    public static int BTF_INT_CHAR() {
        return 2;
    }

    public static int BTF_INT_BOOL() {
        return 4;
    }

    public static MemorySegment BTF_ELF_SEC() {
        class Holder {
            static final MemorySegment BTF_ELF_SEC = Lib.LIBRARY_ARENA.allocateFrom(".BTF");

            Holder() {
            }
        }
        return Holder.BTF_ELF_SEC;
    }

    public static MemorySegment BTF_EXT_ELF_SEC() {
        class Holder {
            static final MemorySegment BTF_EXT_ELF_SEC = Lib.LIBRARY_ARENA.allocateFrom(".BTF.ext");

            Holder() {
            }
        }
        return Holder.BTF_EXT_ELF_SEC;
    }

    public static MemorySegment BTF_BASE_ELF_SEC() {
        class Holder {
            static final MemorySegment BTF_BASE_ELF_SEC = Lib.LIBRARY_ARENA.allocateFrom(".BTF.base");

            Holder() {
            }
        }
        return Holder.BTF_BASE_ELF_SEC;
    }

    public static MemorySegment MAPS_ELF_SEC() {
        class Holder {
            static final MemorySegment MAPS_ELF_SEC = Lib.LIBRARY_ARENA.allocateFrom(".maps");

            Holder() {
            }
        }
        return Holder.MAPS_ELF_SEC;
    }

    public static int EWOULDBLOCK() {
        return 11;
    }

    public static int EDEADLOCK() {
        return 35;
    }

    public static int ENOTSUP() {
        return 95;
    }

    public static long _POSIX_VERSION() {
        return 200809L;
    }

    public static long __POSIX2_THIS_VERSION() {
        return 200809L;
    }

    public static long _POSIX2_VERSION() {
        return 200809L;
    }

    public static long _POSIX2_C_VERSION() {
        return 200809L;
    }

    public static long _POSIX2_C_BIND() {
        return 200809L;
    }

    public static long _POSIX2_C_DEV() {
        return 200809L;
    }

    public static long _POSIX2_SW_DEV() {
        return 200809L;
    }

    public static long _POSIX2_LOCALEDEF() {
        return 200809L;
    }

    public static long _POSIX_PRIORITY_SCHEDULING() {
        return 200809L;
    }

    public static long _POSIX_SYNCHRONIZED_IO() {
        return 200809L;
    }

    public static long _POSIX_FSYNC() {
        return 200809L;
    }

    public static long _POSIX_MAPPED_FILES() {
        return 200809L;
    }

    public static long _POSIX_MEMLOCK() {
        return 200809L;
    }

    public static long _POSIX_MEMLOCK_RANGE() {
        return 200809L;
    }

    public static long _POSIX_MEMORY_PROTECTION() {
        return 200809L;
    }

    public static int _POSIX_VDISABLE() {
        return 0;
    }

    public static long _POSIX_THREADS() {
        return 200809L;
    }

    public static long _POSIX_THREAD_SAFE_FUNCTIONS() {
        return 200809L;
    }

    public static long _POSIX_THREAD_PRIORITY_SCHEDULING() {
        return 200809L;
    }

    public static long _POSIX_THREAD_ATTR_STACKSIZE() {
        return 200809L;
    }

    public static long _POSIX_THREAD_ATTR_STACKADDR() {
        return 200809L;
    }

    public static long _POSIX_THREAD_PRIO_INHERIT() {
        return 200809L;
    }

    public static long _POSIX_THREAD_PRIO_PROTECT() {
        return 200809L;
    }

    public static long _POSIX_THREAD_ROBUST_PRIO_INHERIT() {
        return 200809L;
    }

    public static int _POSIX_THREAD_ROBUST_PRIO_PROTECT() {
        return -1;
    }

    public static long _POSIX_SEMAPHORES() {
        return 200809L;
    }

    public static long _POSIX_REALTIME_SIGNALS() {
        return 200809L;
    }

    public static long _POSIX_ASYNCHRONOUS_IO() {
        return 200809L;
    }

    public static long _POSIX_PRIORITIZED_IO() {
        return 200809L;
    }

    public static long _POSIX_SHARED_MEMORY_OBJECTS() {
        return 200809L;
    }

    public static long _POSIX_READER_WRITER_LOCKS() {
        return 200809L;
    }

    public static long _POSIX_TIMEOUTS() {
        return 200809L;
    }

    public static long _POSIX_SPIN_LOCKS() {
        return 200809L;
    }

    public static long _POSIX_SPAWN() {
        return 200809L;
    }

    public static long _POSIX_TIMERS() {
        return 200809L;
    }

    public static long _POSIX_BARRIERS() {
        return 200809L;
    }

    public static long _POSIX_MESSAGE_PASSING() {
        return 200809L;
    }

    public static long _POSIX_THREAD_PROCESS_SHARED() {
        return 200809L;
    }

    public static long _POSIX_CLOCK_SELECTION() {
        return 200809L;
    }

    public static long _POSIX_ADVISORY_INFO() {
        return 200809L;
    }

    public static long _POSIX_IPV6() {
        return 200809L;
    }

    public static long _POSIX_RAW_SOCKETS() {
        return 200809L;
    }

    public static long _POSIX2_CHAR_TERM() {
        return 200809L;
    }

    public static int _POSIX_SPORADIC_SERVER() {
        return -1;
    }

    public static int _POSIX_THREAD_SPORADIC_SERVER() {
        return -1;
    }

    public static int _POSIX_TRACE() {
        return -1;
    }

    public static int _POSIX_TRACE_EVENT_FILTER() {
        return -1;
    }

    public static int _POSIX_TRACE_INHERIT() {
        return -1;
    }

    public static int _POSIX_TRACE_LOG() {
        return -1;
    }

    public static int _POSIX_TYPED_MEMORY_OBJECTS() {
        return -1;
    }

    public static int _POSIX_V7_LPBIG_OFFBIG() {
        return -1;
    }

    public static int _POSIX_V6_LPBIG_OFFBIG() {
        return -1;
    }

    public static int _XBS5_LPBIG_OFFBIG() {
        return -1;
    }

    public static MemorySegment __ILP32_OFF32_CFLAGS() {
        class Holder {
            static final MemorySegment __ILP32_OFF32_CFLAGS = Lib.LIBRARY_ARENA.allocateFrom("-m32");

            Holder() {
            }
        }
        return Holder.__ILP32_OFF32_CFLAGS;
    }

    public static MemorySegment __ILP32_OFF32_LDFLAGS() {
        class Holder {
            static final MemorySegment __ILP32_OFF32_LDFLAGS = Lib.LIBRARY_ARENA.allocateFrom("-m32");

            Holder() {
            }
        }
        return Holder.__ILP32_OFF32_LDFLAGS;
    }

    public static MemorySegment __ILP32_OFFBIG_CFLAGS() {
        class Holder {
            static final MemorySegment __ILP32_OFFBIG_CFLAGS = Lib.LIBRARY_ARENA.allocateFrom("-m32 -D_LARGEFILE_SOURCE -D_FILE_OFFSET_BITS=64");

            Holder() {
            }
        }
        return Holder.__ILP32_OFFBIG_CFLAGS;
    }

    public static MemorySegment __ILP32_OFFBIG_LDFLAGS() {
        class Holder {
            static final MemorySegment __ILP32_OFFBIG_LDFLAGS = Lib.LIBRARY_ARENA.allocateFrom("-m32");

            Holder() {
            }
        }
        return Holder.__ILP32_OFFBIG_LDFLAGS;
    }

    public static MemorySegment __LP64_OFF64_CFLAGS() {
        class Holder {
            static final MemorySegment __LP64_OFF64_CFLAGS = Lib.LIBRARY_ARENA.allocateFrom("-m64");

            Holder() {
            }
        }
        return Holder.__LP64_OFF64_CFLAGS;
    }

    public static MemorySegment __LP64_OFF64_LDFLAGS() {
        class Holder {
            static final MemorySegment __LP64_OFF64_LDFLAGS = Lib.LIBRARY_ARENA.allocateFrom("-m64");

            Holder() {
            }
        }
        return Holder.__LP64_OFF64_LDFLAGS;
    }

    public static int L_SET() {
        return 0;
    }

    public static int L_INCR() {
        return 1;
    }

    public static int L_XTND() {
        return 2;
    }

    public static int _SC_PAGE_SIZE() {
        return 30;
    }

    public static int _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS() {
        return 1;
    }

    public static int _CS_POSIX_V5_WIDTH_RESTRICTED_ENVS() {
        return 4;
    }

    public static int _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS() {
        return 5;
    }

    public static int O_NDELAY() {
        return 2048;
    }

    public static int O_FSYNC() {
        return 0x101000;
    }

    public static int __O_TMPFILE() {
        return 0x410000;
    }

    public static int F_GETLK() {
        return 5;
    }

    public static int F_SETLK() {
        return 6;
    }

    public static int F_SETLKW() {
        return 7;
    }

    public static int O_DIRECTORY() {
        return 65536;
    }

    public static int O_NOFOLLOW() {
        return 131072;
    }

    public static int O_CLOEXEC() {
        return 524288;
    }

    public static int O_DSYNC() {
        return 4096;
    }

    public static int O_RSYNC() {
        return 0x101000;
    }

    public static int F_SETOWN() {
        return 8;
    }

    public static int F_GETOWN() {
        return 9;
    }

    public static int FAPPEND() {
        return 1024;
    }

    public static int FFSYNC() {
        return 0x101000;
    }

    public static int FASYNC() {
        return 8192;
    }

    public static int FNONBLOCK() {
        return 2048;
    }

    public static int FNDELAY() {
        return 2048;
    }

    public static int POSIX_FADV_DONTNEED() {
        return 4;
    }

    public static int POSIX_FADV_NOREUSE() {
        return 5;
    }

    public static long UTIME_NOW() {
        return 0x3FFFFFFFL;
    }

    public static long UTIME_OMIT() {
        return 0x3FFFFFFEL;
    }

    public static int S_IFMT() {
        return 61440;
    }

    public static int S_IFDIR() {
        return 16384;
    }

    public static int S_IFCHR() {
        return 8192;
    }

    public static int S_IFBLK() {
        return 24576;
    }

    public static int S_IFREG() {
        return 32768;
    }

    public static int S_IFIFO() {
        return 4096;
    }

    public static int S_IFLNK() {
        return 40960;
    }

    public static int S_IFSOCK() {
        return 49152;
    }

    public static int S_ISUID() {
        return 2048;
    }

    public static int S_ISGID() {
        return 1024;
    }

    public static int S_ISVTX() {
        return 512;
    }

    public static int S_IRUSR() {
        return 256;
    }

    public static int S_IWUSR() {
        return 128;
    }

    public static int S_IXUSR() {
        return 64;
    }

    public static int S_IRWXU() {
        return 448;
    }

    public static int S_IRGRP() {
        return 32;
    }

    public static int S_IWGRP() {
        return 16;
    }

    public static int S_IXGRP() {
        return 8;
    }

    public static int S_IRWXG() {
        return 56;
    }

    public static int S_IROTH() {
        return 4;
    }

    public static int S_IWOTH() {
        return 2;
    }

    public static int S_IXOTH() {
        return 1;
    }

    public static int S_IRWXO() {
        return 7;
    }

    public static int AT_FDCWD() {
        return -100;
    }

    public static int ETH_MAX_MTU() {
        return 65535;
    }

    public static int TP_STATUS_USER() {
        return 1;
    }

    public static int TP_STATUS_COPY() {
        return 2;
    }

    public static int TP_STATUS_LOSING() {
        return 4;
    }

    public static int TP_STATUS_CSUMNOTREADY() {
        return 8;
    }

    public static int TP_STATUS_VLAN_VALID() {
        return 16;
    }

    public static int TP_STATUS_BLK_TMO() {
        return 32;
    }

    public static int TP_STATUS_VLAN_TPID_VALID() {
        return 64;
    }

    public static int TP_STATUS_CSUM_VALID() {
        return 128;
    }

    public static int TP_STATUS_GSO_TCP() {
        return 256;
    }

    public static int TP_STATUS_SEND_REQUEST() {
        return 1;
    }

    public static int TP_STATUS_SENDING() {
        return 2;
    }

    public static int TP_STATUS_WRONG_FORMAT() {
        return 4;
    }

    public static int TP_STATUS_TS_SOFTWARE() {
        return 0x20000000;
    }

    public static int TP_STATUS_TS_SYS_HARDWARE() {
        return 0x40000000;
    }

    public static int TP_STATUS_TS_RAW_HARDWARE() {
        return Integer.MIN_VALUE;
    }

    public static long TPACKET_HDRLEN() {
        return 52L;
    }

    public static long TPACKET2_HDRLEN() {
        return 52L;
    }

    public static long TPACKET3_HDRLEN() {
        return 68L;
    }

    public static int IPOPT_END() {
        return 0;
    }

    public static int IPOPT_NOOP() {
        return 1;
    }

    public static int IPOPT_SEC() {
        return 130;
    }

    private static class btf__resolve_size {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__resolve_size");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__resolve_size() {
        }
    }

    private static class btf__resolve_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__resolve_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__resolve_type() {
        }
    }

    private static class btf__align_of {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__align_of");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__align_of() {
        }
    }

    private static class btf__fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__fd() {
        }
    }

    private static class btf__set_fd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__set_fd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__set_fd() {
        }
    }

    private static class btf__raw_data {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__raw_data");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__raw_data() {
        }
    }

    private static class btf__name_by_offset {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__name_by_offset");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__name_by_offset() {
        }
    }

    private static class btf__str_by_offset {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__str_by_offset");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__str_by_offset() {
        }
    }

    private static class btf_ext__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_ext__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_ext__new() {
        }
    }

    private static class btf_ext__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_ext__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_ext__free() {
        }
    }

    private static class btf_ext__raw_data {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_ext__raw_data");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_ext__raw_data() {
        }
    }

    private static class btf_ext__endianness {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_ext__endianness");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_ext__endianness() {
        }
    }

    private static class btf_ext__set_endianness {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_ext__set_endianness");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_ext__set_endianness() {
        }
    }

    private static class btf__find_str {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__find_str");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__find_str() {
        }
    }

    private static class btf__add_str {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_str");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_str() {
        }
    }

    private static class btf__add_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_type() {
        }
    }

    private static class btf__add_btf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_btf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_btf() {
        }
    }

    private static class btf__add_int {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_int");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_int() {
        }
    }

    private static class btf__add_float {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_float");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_float() {
        }
    }

    private static class btf__add_ptr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_ptr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_ptr() {
        }
    }

    private static class btf__add_array {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_array");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_array() {
        }
    }

    private static class btf__add_struct {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_struct");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_struct() {
        }
    }

    private static class btf__add_union {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_union");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_union() {
        }
    }

    private static class btf__add_field {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_field");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_field() {
        }
    }

    private static class btf__add_enum {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_enum");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_enum() {
        }
    }

    private static class btf__add_enum_value {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_enum_value");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_enum_value() {
        }
    }

    private static class btf__add_enum64 {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_BOOL});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_enum64");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_enum64() {
        }
    }

    private static class btf__add_enum64_value {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_enum64_value");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_enum64_value() {
        }
    }

    private static class btf__add_fwd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_fwd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_fwd() {
        }
    }

    private static class btf__add_typedef {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_typedef");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_typedef() {
        }
    }

    private static class btf__add_volatile {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_volatile");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_volatile() {
        }
    }

    private static class btf__add_const {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_const");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_const() {
        }
    }

    private static class btf__add_restrict {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_restrict");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_restrict() {
        }
    }

    private static class btf__add_type_tag {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_type_tag");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_type_tag() {
        }
    }

    private static class btf__add_func {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_func");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_func() {
        }
    }

    private static class btf__add_func_proto {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_func_proto");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_func_proto() {
        }
    }

    private static class btf__add_func_param {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_func_param");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_func_param() {
        }
    }

    private static class btf__add_var {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_var");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_var() {
        }
    }

    private static class btf__add_datasec {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_datasec");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_datasec() {
        }
    }

    private static class btf__add_datasec_var_info {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_datasec_var_info");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_datasec_var_info() {
        }
    }

    private static class btf__add_decl_tag {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__add_decl_tag");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__add_decl_tag() {
        }
    }

    private static class btf__dedup {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__dedup");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__dedup() {
        }
    }

    private static class btf__relocate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf__relocate");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf__relocate() {
        }
    }

    private static class btf_dump__new {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_dump__new");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_dump__new() {
        }
    }

    private static class btf_dump__free {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_dump__free");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_dump__free() {
        }
    }

    private static class btf_dump__dump_type {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_dump__dump_type");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_dump__dump_type() {
        }
    }

    private static class btf_dump__emit_type_decl {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_dump__emit_type_decl");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_dump__emit_type_decl() {
        }
    }

    private static class btf_dump__dump_type_data {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("btf_dump__dump_type_data");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private btf_dump__dump_type_data() {
        }
    }

    private static class __errno_location {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("__errno_location");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __errno_location() {
        }
    }

    private static class access {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("access");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private access() {
        }
    }

    private static class faccessat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("faccessat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private faccessat() {
        }
    }

    private static class lseek {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("lseek");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private lseek() {
        }
    }

    private static class close {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("close");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private close() {
        }
    }

    private static class closefrom {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("closefrom");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private closefrom() {
        }
    }

    private static class read {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("read");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private read() {
        }
    }

    private static class write {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("write");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private write() {
        }
    }

    private static class pread {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("pread");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pread() {
        }
    }

    private static class pwrite {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("pwrite");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pwrite() {
        }
    }

    private static class pipe {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("pipe");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pipe() {
        }
    }

    private static class alarm {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("alarm");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private alarm() {
        }
    }

    private static class sleep {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sleep");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sleep() {
        }
    }

    private static class ualarm {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("ualarm");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ualarm() {
        }
    }

    private static class usleep {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("usleep");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private usleep() {
        }
    }

    private static class pause {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("pause");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pause() {
        }
    }

    private static class chown {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("chown");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private chown() {
        }
    }

    private static class fchown {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fchown");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fchown() {
        }
    }

    private static class lchown {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("lchown");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private lchown() {
        }
    }

    private static class fchownat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fchownat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fchownat() {
        }
    }

    private static class chdir {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("chdir");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private chdir() {
        }
    }

    private static class fchdir {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fchdir");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fchdir() {
        }
    }

    private static class getcwd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("getcwd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getcwd() {
        }
    }

    private static class getwd {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getwd");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getwd() {
        }
    }

    private static class dup {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("dup");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private dup() {
        }
    }

    private static class dup2 {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("dup2");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private dup2() {
        }
    }

    private static class execve {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("execve");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private execve() {
        }
    }

    private static class fexecve {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("fexecve");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fexecve() {
        }
    }

    private static class execv {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("execv");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private execv() {
        }
    }

    private static class execvp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("execvp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private execvp() {
        }
    }

    private static class nice {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("nice");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private nice() {
        }
    }

    private static class _exit {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("_exit");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private _exit() {
        }
    }

    private static class pathconf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("pathconf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private pathconf() {
        }
    }

    private static class fpathconf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fpathconf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fpathconf() {
        }
    }

    private static class sysconf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sysconf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sysconf() {
        }
    }

    private static class confstr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("confstr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private confstr() {
        }
    }

    private static class getpid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getpid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getpid() {
        }
    }

    private static class getppid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getppid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getppid() {
        }
    }

    private static class getpgrp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getpgrp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getpgrp() {
        }
    }

    private static class __getpgid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("__getpgid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __getpgid() {
        }
    }

    private static class getpgid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("getpgid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getpgid() {
        }
    }

    private static class setpgid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setpgid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setpgid() {
        }
    }

    private static class setpgrp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("setpgrp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setpgrp() {
        }
    }

    private static class setsid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("setsid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setsid() {
        }
    }

    private static class getsid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("getsid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getsid() {
        }
    }

    private static class getuid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getuid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getuid() {
        }
    }

    private static class geteuid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("geteuid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private geteuid() {
        }
    }

    private static class getgid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getgid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getgid() {
        }
    }

    private static class getegid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getegid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getegid() {
        }
    }

    private static class getgroups {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getgroups");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getgroups() {
        }
    }

    private static class setuid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setuid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setuid() {
        }
    }

    private static class setreuid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setreuid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setreuid() {
        }
    }

    private static class seteuid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("seteuid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private seteuid() {
        }
    }

    private static class setgid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setgid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setgid() {
        }
    }

    private static class setregid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setregid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setregid() {
        }
    }

    private static class setegid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setegid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setegid() {
        }
    }

    private static class fork {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("fork");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fork() {
        }
    }

    private static class vfork {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("vfork");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vfork() {
        }
    }

    private static class ttyname {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("ttyname");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ttyname() {
        }
    }

    private static class ttyname_r {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("ttyname_r");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ttyname_r() {
        }
    }

    private static class isatty {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("isatty");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private isatty() {
        }
    }

    private static class ttyslot {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("ttyslot");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ttyslot() {
        }
    }

    private static class link {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("link");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private link() {
        }
    }

    private static class linkat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("linkat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private linkat() {
        }
    }

    private static class symlink {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("symlink");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private symlink() {
        }
    }

    private static class readlink {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("readlink");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private readlink() {
        }
    }

    private static class symlinkat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("symlinkat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private symlinkat() {
        }
    }

    private static class readlinkat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("readlinkat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private readlinkat() {
        }
    }

    private static class unlink {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("unlink");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private unlink() {
        }
    }

    private static class unlinkat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("unlinkat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private unlinkat() {
        }
    }

    private static class rmdir {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("rmdir");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private rmdir() {
        }
    }

    private static class tcgetpgrp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("tcgetpgrp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private tcgetpgrp() {
        }
    }

    private static class tcsetpgrp {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("tcsetpgrp");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private tcsetpgrp() {
        }
    }

    private static class getlogin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getlogin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getlogin() {
        }
    }

    private static class getlogin_r {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("getlogin_r");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getlogin_r() {
        }
    }

    private static class setlogin {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("setlogin");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setlogin() {
        }
    }

    private static class getopt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getopt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getopt() {
        }
    }

    private static class gethostname {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("gethostname");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private gethostname() {
        }
    }

    private static class sethostname {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("sethostname");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sethostname() {
        }
    }

    private static class sethostid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("sethostid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sethostid() {
        }
    }

    private static class getdomainname {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("getdomainname");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getdomainname() {
        }
    }

    private static class setdomainname {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("setdomainname");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setdomainname() {
        }
    }

    private static class vhangup {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("vhangup");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private vhangup() {
        }
    }

    private static class revoke {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("revoke");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private revoke() {
        }
    }

    private static class profil {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("profil");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private profil() {
        }
    }

    private static class acct {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("acct");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private acct() {
        }
    }

    private static class getusershell {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getusershell");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getusershell() {
        }
    }

    private static class endusershell {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("endusershell");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private endusershell() {
        }
    }

    private static class setusershell {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("setusershell");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setusershell() {
        }
    }

    private static class daemon {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("daemon");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private daemon() {
        }
    }

    private static class chroot {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("chroot");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private chroot() {
        }
    }

    private static class getpass {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getpass");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getpass() {
        }
    }

    private static class fsync {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fsync");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fsync() {
        }
    }

    private static class gethostid {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("gethostid");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private gethostid() {
        }
    }

    private static class sync {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("sync");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sync() {
        }
    }

    private static class getpagesize {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getpagesize");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getpagesize() {
        }
    }

    private static class getdtablesize {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("getdtablesize");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getdtablesize() {
        }
    }

    private static class truncate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("truncate");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private truncate() {
        }
    }

    private static class ftruncate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("ftruncate");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private ftruncate() {
        }
    }

    private static class brk {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("brk");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private brk() {
        }
    }

    private static class sbrk {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("sbrk");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sbrk() {
        }
    }

    private static class lockf {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("lockf");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private lockf() {
        }
    }

    private static class fdatasync {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("fdatasync");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private fdatasync() {
        }
    }

    private static class crypt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("crypt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private crypt() {
        }
    }

    private static class getentropy {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("getentropy");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getentropy() {
        }
    }

    private static class creat {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("creat");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private creat() {
        }
    }

    private static class posix_fadvise {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_LONG, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("posix_fadvise");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private posix_fadvise() {
        }
    }

    private static class posix_fallocate {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_LONG, Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("posix_fallocate");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private posix_fallocate() {
        }
    }

    private static class __cmsg_nxthdr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__cmsg_nxthdr");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __cmsg_nxthdr() {
        }
    }

    private static class socket {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("socket");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private socket() {
        }
    }

    private static class socketpair {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("socketpair");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private socketpair() {
        }
    }

    private static class bind {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("bind");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private bind() {
        }
    }

    private static class getsockname {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getsockname");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getsockname() {
        }
    }

    private static class connect {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("connect");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private connect() {
        }
    }

    private static class getpeername {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getpeername");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getpeername() {
        }
    }

    private static class send {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("send");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private send() {
        }
    }

    private static class recv {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("recv");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private recv() {
        }
    }

    private static class sendto {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sendto");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sendto() {
        }
    }

    private static class recvfrom {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_LONG, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("recvfrom");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private recvfrom() {
        }
    }

    private static class sendmsg {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sendmsg");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sendmsg() {
        }
    }

    private static class recvmsg {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("recvmsg");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private recvmsg() {
        }
    }

    private static class getsockopt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("getsockopt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private getsockopt() {
        }
    }

    private static class setsockopt {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("setsockopt");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private setsockopt() {
        }
    }

    private static class listen {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("listen");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private listen() {
        }
    }

    private static class accept {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("accept");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private accept() {
        }
    }

    private static class shutdown {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("shutdown");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private shutdown() {
        }
    }

    private static class sockatmark {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sockatmark");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sockatmark() {
        }
    }

    private static class isfdtype {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("isfdtype");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private isfdtype() {
        }
    }

    private static class __sched_cpucount {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__sched_cpucount");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __sched_cpucount() {
        }
    }

    private static class __sched_cpualloc {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_POINTER, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG});
        public static final MemorySegment ADDR = Lib.findOrThrow("__sched_cpualloc");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __sched_cpualloc() {
        }
    }

    private static class __sched_cpufree {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("__sched_cpufree");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private __sched_cpufree() {
        }
    }

    private static class sched_setparam {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_setparam");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_setparam() {
        }
    }

    private static class sched_getparam {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_getparam");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_getparam() {
        }
    }

    private static class sched_setscheduler {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_setscheduler");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_setscheduler() {
        }
    }

    private static class sched_getscheduler {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_getscheduler");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_getscheduler() {
        }
    }

    private static class sched_yield {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[0]);
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_yield");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_yield() {
        }
    }

    private static class sched_get_priority_max {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_get_priority_max");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_get_priority_max() {
        }
    }

    private static class sched_get_priority_min {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_get_priority_min");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_get_priority_min() {
        }
    }

    private static class sched_rr_get_interval {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER});
        public static final MemorySegment ADDR = Lib.findOrThrow("sched_rr_get_interval");
        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC, new Linker.Option[0]);

        private sched_rr_get_interval() {
        }
    }

    public static class openat {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_POINTER, Lib.C_INT});
        private static final MemorySegment ADDR = Lib.findOrThrow("openat");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private openat(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static openat makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new openat(mh$, desc$, spreader$);
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

        public int apply(int __fd, MemorySegment __file, int __oflag, Object ... x3) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("openat", __fd, __file, __oflag, x3);
                }
                return this.spreader.invokeExact(__fd, __file, __oflag, x3);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class open {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_INT});
        private static final MemorySegment ADDR = Lib.findOrThrow("open");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private open(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static open makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new open(mh$, desc$, spreader$);
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

        public int apply(MemorySegment __file, int __oflag, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("open", __file, __oflag, x2);
                }
                return this.spreader.invokeExact(__file, __oflag, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class fcntl {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_INT, Lib.C_INT});
        private static final MemorySegment ADDR = Lib.findOrThrow("fcntl");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private fcntl(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static fcntl makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new fcntl(mh$, desc$, spreader$);
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

        public int apply(int __fd, int __cmd, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("fcntl", __fd, __cmd, x2);
                }
                return this.spreader.invokeExact(__fd, __cmd, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class syscall {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_LONG, (MemoryLayout[])new MemoryLayout[]{Lib.C_LONG});
        private static final MemorySegment ADDR = Lib.findOrThrow("syscall");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private syscall(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static syscall makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new syscall(mh$, desc$, spreader$);
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

        public long apply(long __sysno, Object ... x1) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("syscall", __sysno, x1);
                }
                return this.spreader.invokeExact(__sysno, x1);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class execlp {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("execlp");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private execlp(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static execlp makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new execlp(mh$, desc$, spreader$);
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

        public int apply(MemorySegment __file, MemorySegment __arg, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("execlp", __file, __arg, x2);
                }
                return this.spreader.invokeExact(__file, __arg, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class execl {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("execl");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private execl(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static execl makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new execl(mh$, desc$, spreader$);
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

        public int apply(MemorySegment __path, MemorySegment __arg, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("execl", __path, __arg, x2);
                }
                return this.spreader.invokeExact(__path, __arg, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    public static class execle {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER});
        private static final MemorySegment ADDR = Lib.findOrThrow("execle");
        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private execle(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        public static execle makeInvoker(MemoryLayout ... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg((int)BASE_DESC.argumentLayouts().size());
            MethodHandle mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, new Linker.Option[]{fva$});
            MethodHandle spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new execle(mh$, desc$, spreader$);
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

        public int apply(MemorySegment __path, MemorySegment __arg, Object ... x2) {
            try {
                if (Lib_4.TRACE_DOWNCALLS) {
                    Lib_4.traceDowncall("execle", __path, __arg, x2);
                }
                return this.spreader.invokeExact(__path, __arg, x2);
            } catch (ClassCastException | IllegalArgumentException ex$) {
                throw ex$;
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }
}

