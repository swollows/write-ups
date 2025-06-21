/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.Arena
 *  java.lang.foreign.FunctionDescriptor
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.Linker
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.PaddingLayout
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.StructLayout
 *  java.lang.foreign.SymbolLookup
 *  java.lang.foreign.ValueLayout
 *  java.lang.foreign.ValueLayout$OfBoolean
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfDouble
 *  java.lang.foreign.ValueLayout$OfFloat
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.foreign.ValueLayout$OfShort
 *  java.lang.runtime.SwitchBootstraps
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.PaddingLayout;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Lib_4 {
    static final Arena LIBRARY_ARENA = Arena.ofAuto();
    static final boolean TRACE_DOWNCALLS = Boolean.getBoolean("jextract.trace.downcalls");
    static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.loaderLookup().or(Linker.nativeLinker().defaultLookup());
    public static final ValueLayout.OfBoolean C_BOOL = ValueLayout.JAVA_BOOLEAN;
    public static final ValueLayout.OfByte C_CHAR = ValueLayout.JAVA_BYTE;
    public static final ValueLayout.OfShort C_SHORT = ValueLayout.JAVA_SHORT;
    public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT;
    public static final ValueLayout.OfLong C_LONG_LONG = ValueLayout.JAVA_LONG;
    public static final ValueLayout.OfFloat C_FLOAT = ValueLayout.JAVA_FLOAT;
    public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = ValueLayout.ADDRESS.withTargetLayout((MemoryLayout)MemoryLayout.sequenceLayout((long)Long.MAX_VALUE, (MemoryLayout)ValueLayout.JAVA_BYTE));
    public static final ValueLayout.OfLong C_LONG = ValueLayout.JAVA_LONG;
    private static final int __BITS_PER_LONG = 64;
    private static final int __BITS_PER_LONG_LONG = 64;
    private static final int __FD_SETSIZE = 1024;
    private static final int BPF_LD = 0;
    private static final int BPF_LDX = 1;
    private static final int BPF_ST = 2;
    private static final int BPF_STX = 3;
    private static final int BPF_ALU = 4;
    private static final int BPF_JMP = 5;
    private static final int BPF_RET = 6;
    private static final int BPF_MISC = 7;
    private static final int BPF_W = 0;
    private static final int BPF_H = 8;
    private static final int BPF_B = 16;
    private static final int BPF_IMM = 0;
    private static final int BPF_ABS = 32;
    private static final int BPF_IND = 64;
    private static final int BPF_MEM = 96;
    private static final int BPF_LEN = 128;
    private static final int BPF_MSH = 160;
    private static final int BPF_ADD = 0;
    private static final int BPF_SUB = 16;
    private static final int BPF_MUL = 32;
    private static final int BPF_DIV = 48;
    private static final int BPF_OR = 64;
    private static final int BPF_AND = 80;
    private static final int BPF_LSH = 96;
    private static final int BPF_RSH = 112;
    private static final int BPF_NEG = 128;
    private static final int BPF_MOD = 144;
    private static final int BPF_XOR = 160;
    private static final int BPF_JA = 0;
    private static final int BPF_JEQ = 16;
    private static final int BPF_JGT = 32;
    private static final int BPF_JGE = 48;
    private static final int BPF_JSET = 64;
    private static final int BPF_K = 0;
    private static final int BPF_X = 8;
    private static final int BPF_MAXINSNS = 4096;
    private static final int BPF_JMP32 = 6;
    private static final int BPF_ALU64 = 7;
    private static final int BPF_DW = 24;
    private static final int BPF_MEMSX = 128;
    private static final int BPF_ATOMIC = 192;
    private static final int BPF_XADD = 192;
    private static final int BPF_MOV = 176;
    private static final int BPF_ARSH = 192;
    private static final int BPF_END = 208;
    private static final int BPF_TO_LE = 0;
    private static final int BPF_TO_BE = 8;
    private static final int BPF_JNE = 80;
    private static final int BPF_JLT = 160;
    private static final int BPF_JLE = 176;
    private static final int BPF_JSGT = 96;
    private static final int BPF_JSGE = 112;
    private static final int BPF_JSLT = 192;
    private static final int BPF_JSLE = 208;
    private static final int BPF_JCOND = 224;
    private static final int BPF_CALL = 128;
    private static final int BPF_EXIT = 144;
    private static final int BPF_FETCH = 1;
    private static final int BPF_PSEUDO_MAP_FD = 1;
    private static final int BPF_PSEUDO_MAP_IDX = 5;
    private static final int BPF_PSEUDO_MAP_VALUE = 2;
    private static final int BPF_PSEUDO_MAP_IDX_VALUE = 6;
    private static final int BPF_PSEUDO_BTF_ID = 3;
    private static final int BPF_PSEUDO_FUNC = 4;
    private static final int BPF_PSEUDO_CALL = 1;
    private static final int BPF_PSEUDO_KFUNC_CALL = 2;
    private static final int BPF_BUILD_ID_SIZE = 20;
    private static final int XDP_PACKET_HEADROOM = 256;
    private static final int BPF_TAG_SIZE = 8;
    private static final int true_ = 1;
    private static final int false_ = 0;
    private static final int __bool_true_false_are_defined = 1;
    private static final int _STDINT_H = 1;
    private static final int _FEATURES_H = 1;
    private static final int _DEFAULT_SOURCE = 1;
    private static final int __GLIBC_USE_ISOC2Y = 0;
    private static final int __GLIBC_USE_ISOC23 = 0;
    private static final int __USE_ISOC11 = 1;
    private static final int __USE_ISOC99 = 1;
    private static final int __USE_ISOC95 = 1;
    private static final int __USE_POSIX_IMPLICITLY = 1;
    private static final int _POSIX_SOURCE = 1;
    private static final int __USE_POSIX = 1;
    private static final int __USE_POSIX2 = 1;
    private static final int __USE_POSIX199309 = 1;
    private static final int __USE_POSIX199506 = 1;
    private static final int __USE_XOPEN2K = 1;
    private static final int __USE_XOPEN2K8 = 1;
    private static final int _ATFILE_SOURCE = 1;
    private static final int __WORDSIZE = 64;
    private static final int __WORDSIZE_TIME64_COMPAT32 = 1;
    private static final int __SYSCALL_WORDSIZE = 64;
    private static final int __USE_TIME_BITS64 = 1;
    private static final int __USE_MISC = 1;
    private static final int __USE_ATFILE = 1;
    private static final int __USE_FORTIFY_LEVEL = 0;
    private static final int __GLIBC_USE_DEPRECATED_GETS = 0;
    private static final int __GLIBC_USE_DEPRECATED_SCANF = 0;
    private static final int __GLIBC_USE_C23_STRTOL = 0;
    private static final int _STDC_PREDEF_H = 1;
    private static final int __STDC_IEC_559__ = 1;
    private static final int __STDC_IEC_559_COMPLEX__ = 1;
    private static final int __GNU_LIBRARY__ = 6;
    private static final int __GLIBC__ = 2;
    private static final int __GLIBC_MINOR__ = 41;
    private static final int _SYS_CDEFS_H = 1;
    private static final int __glibc_c99_flexarr_available = 1;
    private static final int __LDOUBLE_REDIRECTS_TO_FLOAT128_ABI = 0;
    private static final int __HAVE_GENERIC_SELECTION = 1;
    private static final int __GLIBC_USE_LIB_EXT2 = 0;
    private static final int __GLIBC_USE_IEC_60559_BFP_EXT = 0;
    private static final int __GLIBC_USE_IEC_60559_BFP_EXT_C23 = 0;
    private static final int __GLIBC_USE_IEC_60559_EXT = 0;
    private static final int __GLIBC_USE_IEC_60559_FUNCS_EXT = 0;
    private static final int __GLIBC_USE_IEC_60559_FUNCS_EXT_C23 = 0;
    private static final int __GLIBC_USE_IEC_60559_TYPES_EXT = 0;
    private static final int _BITS_TYPES_H = 1;
    private static final int _BITS_TYPESIZES_H = 1;
    private static final int __OFF_T_MATCHES_OFF64_T = 1;
    private static final int __INO_T_MATCHES_INO64_T = 1;
    private static final int __RLIM_T_MATCHES_RLIM64_T = 1;
    private static final int __STATFS_MATCHES_STATFS64 = 1;
    private static final int __KERNEL_OLD_TIMEVAL_MATCHES_TIMEVAL64 = 1;
    private static final int _BITS_TIME64_H = 1;
    private static final int _BITS_WCHAR_H = 1;
    private static final int _BITS_STDINT_INTN_H = 1;
    private static final int _BITS_STDINT_UINTN_H = 1;
    private static final int _BITS_STDINT_LEAST_H = 1;
    private static final int _STRING_H = 1;
    private static final int _BITS_TYPES_LOCALE_T_H = 1;
    private static final int _BITS_TYPES___LOCALE_T_H = 1;
    private static final int _STRINGS_H = 1;
    private static final int LIBBPF_MAJOR_VERSION = 1;
    private static final int LIBBPF_MINOR_VERSION = 5;
    private static final int MAPS_RELAX_COMPAT = 1;
    private static final int __GNUC_VA_LIST = 1;
    private static final int _STDIO_H = 1;
    private static final int _____fpos_t_defined = 1;
    private static final int ____mbstate_t_defined = 1;
    private static final int _____fpos64_t_defined = 1;
    private static final int ____FILE_defined = 1;
    private static final int __FILE_defined = 1;
    private static final int __struct_FILE_defined = 1;
    private static final int _IO_EOF_SEEN = 16;
    private static final int _IO_ERR_SEEN = 32;
    private static final int _IO_USER_LOCK = 32768;
    private static final int __cookie_io_functions_t_defined = 1;
    private static final int _IOFBF = 0;
    private static final int _IOLBF = 1;
    private static final int _IONBF = 2;
    private static final int BUFSIZ = 8192;
    private static final int SEEK_SET = 0;
    private static final int SEEK_CUR = 1;
    private static final int SEEK_END = 2;
    private static final int L_tmpnam = 20;
    private static final int TMP_MAX = 238328;
    private static final int _BITS_STDIO_LIM_H = 1;
    private static final int FILENAME_MAX = 4096;
    private static final int L_ctermid = 9;
    private static final int FOPEN_MAX = 16;
    private static final int __HAVE_FLOAT128 = 1;
    private static final int __HAVE_DISTINCT_FLOAT128 = 1;
    private static final int __HAVE_FLOAT64X = 1;
    private static final int __HAVE_FLOAT64X_LONG_DOUBLE = 1;
    private static final int __HAVE_FLOAT16 = 0;
    private static final int __HAVE_FLOAT32 = 1;
    private static final int __HAVE_FLOAT64 = 1;
    private static final int __HAVE_FLOAT32X = 1;
    private static final int __HAVE_FLOAT128X = 0;
    private static final int __HAVE_DISTINCT_FLOAT32 = 0;
    private static final int __HAVE_DISTINCT_FLOAT64 = 0;
    private static final int __HAVE_DISTINCT_FLOAT32X = 0;
    private static final int __HAVE_DISTINCT_FLOAT64X = 0;
    private static final int __HAVE_FLOATN_NOT_TYPEDEF = 0;
    private static final int _SYS_TYPES_H = 1;
    private static final int __clock_t_defined = 1;
    private static final int __clockid_t_defined = 1;
    private static final int __time_t_defined = 1;
    private static final int __timer_t_defined = 1;
    private static final int __BIT_TYPES_DEFINED__ = 1;
    private static final int _ENDIAN_H = 1;
    private static final int _BITS_ENDIAN_H = 1;
    private static final int __LITTLE_ENDIAN = 1234;
    private static final int __BIG_ENDIAN = 4321;
    private static final int __PDP_ENDIAN = 3412;
    private static final int _BITS_ENDIANNESS_H = 1;
    private static final int _BITS_BYTESWAP_H = 1;
    private static final int _BITS_UINTN_IDENTITY_H = 1;
    private static final int _SYS_SELECT_H = 1;
    private static final int __sigset_t_defined = 1;
    private static final int __timeval_defined = 1;
    private static final int _STRUCT_TIMESPEC = 1;
    private static final int _BITS_PTHREADTYPES_COMMON_H = 1;
    private static final int _THREAD_SHARED_TYPES_H = 1;
    private static final int _BITS_PTHREADTYPES_ARCH_H = 1;
    private static final int __SIZEOF_PTHREAD_MUTEX_T = 40;
    private static final int __SIZEOF_PTHREAD_ATTR_T = 56;
    private static final int __SIZEOF_PTHREAD_RWLOCK_T = 56;
    private static final int __SIZEOF_PTHREAD_BARRIER_T = 32;
    private static final int __SIZEOF_PTHREAD_MUTEXATTR_T = 4;
    private static final int __SIZEOF_PTHREAD_COND_T = 48;
    private static final int __SIZEOF_PTHREAD_CONDATTR_T = 4;
    private static final int __SIZEOF_PTHREAD_RWLOCKATTR_T = 8;
    private static final int __SIZEOF_PTHREAD_BARRIERATTR_T = 4;
    private static final int _THREAD_MUTEX_INTERNAL_H = 1;
    private static final int __PTHREAD_MUTEX_HAVE_PREV = 1;
    private static final int __have_pthread_attr_t = 1;
    private static final int BTF_MAGIC = 60319;
    private static final int BTF_VERSION = 1;
    private static final int BTF_MAX_TYPE = 1048575;
    private static final int BTF_MAX_NAME_OFFSET = 0xFFFFFF;
    private static final int BTF_MAX_VLEN = 65535;
    private static final int BTF_KIND_FUNC = 12;
    private static final int BTF_KIND_FUNC_PROTO = 13;
    private static final int BTF_KIND_VAR = 14;
    private static final int BTF_KIND_DATASEC = 15;
    private static final int BTF_KIND_FLOAT = 16;
    private static final int BTF_KIND_DECL_TAG = 17;
    private static final int BTF_KIND_TYPE_TAG = 18;
    private static final int BTF_KIND_ENUM64 = 19;
    private static final int _ERRNO_H = 1;
    private static final int _BITS_ERRNO_H = 1;
    private static final int EPERM = 1;
    private static final int ENOENT = 2;
    private static final int ESRCH = 3;
    private static final int EINTR = 4;
    private static final int EIO = 5;
    private static final int ENXIO = 6;
    private static final int E2BIG = 7;
    private static final int ENOEXEC = 8;
    private static final int EBADF = 9;
    private static final int ECHILD = 10;
    private static final int EAGAIN = 11;
    private static final int ENOMEM = 12;
    private static final int EACCES = 13;
    private static final int EFAULT = 14;
    private static final int ENOTBLK = 15;
    private static final int EBUSY = 16;
    private static final int EEXIST = 17;
    private static final int EXDEV = 18;
    private static final int ENODEV = 19;
    private static final int ENOTDIR = 20;
    private static final int EISDIR = 21;
    private static final int EINVAL = 22;
    private static final int ENFILE = 23;
    private static final int EMFILE = 24;
    private static final int ENOTTY = 25;
    private static final int ETXTBSY = 26;
    private static final int EFBIG = 27;
    private static final int ENOSPC = 28;
    private static final int ESPIPE = 29;
    private static final int EROFS = 30;
    private static final int EMLINK = 31;
    private static final int EPIPE = 32;
    private static final int EDOM = 33;
    private static final int ERANGE = 34;
    private static final int EDEADLK = 35;
    private static final int ENAMETOOLONG = 36;
    private static final int ENOLCK = 37;
    private static final int ENOSYS = 38;
    private static final int ENOTEMPTY = 39;
    private static final int ELOOP = 40;
    private static final int ENOMSG = 42;
    private static final int EIDRM = 43;
    private static final int ECHRNG = 44;
    private static final int EL2NSYNC = 45;
    private static final int EL3HLT = 46;
    private static final int EL3RST = 47;
    private static final int ELNRNG = 48;
    private static final int EUNATCH = 49;
    private static final int ENOCSI = 50;
    private static final int EL2HLT = 51;
    private static final int EBADE = 52;
    private static final int EBADR = 53;
    private static final int EXFULL = 54;
    private static final int ENOANO = 55;
    private static final int EBADRQC = 56;
    private static final int EBADSLT = 57;
    private static final int EBFONT = 59;
    private static final int ENOSTR = 60;
    private static final int ENODATA = 61;
    private static final int ETIME = 62;
    private static final int ENOSR = 63;
    private static final int ENONET = 64;
    private static final int ENOPKG = 65;
    private static final int EREMOTE = 66;
    private static final int ENOLINK = 67;
    private static final int EADV = 68;
    private static final int ESRMNT = 69;
    private static final int ECOMM = 70;
    private static final int EPROTO = 71;
    private static final int EMULTIHOP = 72;
    private static final int EDOTDOT = 73;
    private static final int EBADMSG = 74;
    private static final int EOVERFLOW = 75;
    private static final int ENOTUNIQ = 76;
    private static final int EBADFD = 77;
    private static final int EREMCHG = 78;
    private static final int ELIBACC = 79;
    private static final int ELIBBAD = 80;
    private static final int ELIBSCN = 81;
    private static final int ELIBMAX = 82;
    private static final int ELIBEXEC = 83;
    private static final int EILSEQ = 84;
    private static final int ERESTART = 85;
    private static final int ESTRPIPE = 86;
    private static final int EUSERS = 87;
    private static final int ENOTSOCK = 88;
    private static final int EDESTADDRREQ = 89;
    private static final int EMSGSIZE = 90;
    private static final int EPROTOTYPE = 91;
    private static final int ENOPROTOOPT = 92;
    private static final int EPROTONOSUPPORT = 93;
    private static final int ESOCKTNOSUPPORT = 94;
    private static final int EOPNOTSUPP = 95;
    private static final int EPFNOSUPPORT = 96;
    private static final int EAFNOSUPPORT = 97;
    private static final int EADDRINUSE = 98;
    private static final int EADDRNOTAVAIL = 99;
    private static final int ENETDOWN = 100;
    private static final int ENETUNREACH = 101;
    private static final int ENETRESET = 102;
    private static final int ECONNABORTED = 103;
    private static final int ECONNRESET = 104;
    private static final int ENOBUFS = 105;
    private static final int EISCONN = 106;
    private static final int ENOTCONN = 107;
    private static final int ESHUTDOWN = 108;
    private static final int ETOOMANYREFS = 109;
    private static final int ETIMEDOUT = 110;
    private static final int ECONNREFUSED = 111;
    private static final int EHOSTDOWN = 112;
    private static final int EHOSTUNREACH = 113;
    private static final int EALREADY = 114;
    private static final int EINPROGRESS = 115;
    private static final int ESTALE = 116;
    private static final int EUCLEAN = 117;
    private static final int ENOTNAM = 118;
    private static final int ENAVAIL = 119;
    private static final int EISNAM = 120;
    private static final int EREMOTEIO = 121;
    private static final int EDQUOT = 122;
    private static final int ENOMEDIUM = 123;
    private static final int EMEDIUMTYPE = 124;
    private static final int ECANCELED = 125;
    private static final int ENOKEY = 126;
    private static final int EKEYEXPIRED = 127;
    private static final int EKEYREVOKED = 128;
    private static final int EKEYREJECTED = 129;
    private static final int EOWNERDEAD = 130;
    private static final int ENOTRECOVERABLE = 131;
    private static final int ERFKILL = 132;
    private static final int EHWPOISON = 133;
    private static final int _UNISTD_H = 1;
    private static final int _XOPEN_VERSION = 700;
    private static final int _XOPEN_XCU_VERSION = 4;
    private static final int _XOPEN_XPG2 = 1;
    private static final int _XOPEN_XPG3 = 1;
    private static final int _XOPEN_XPG4 = 1;
    private static final int _XOPEN_UNIX = 1;
    private static final int _XOPEN_ENH_I18N = 1;
    private static final int _XOPEN_LEGACY = 1;
    private static final int _BITS_POSIX_OPT_H = 1;
    private static final int _POSIX_JOB_CONTROL = 1;
    private static final int _POSIX_SAVED_IDS = 1;
    private static final int _POSIX_CHOWN_RESTRICTED = 0;
    private static final int _POSIX_NO_TRUNC = 1;
    private static final int _XOPEN_REALTIME = 1;
    private static final int _XOPEN_REALTIME_THREADS = 1;
    private static final int _XOPEN_SHM = 1;
    private static final int _POSIX_REENTRANT_FUNCTIONS = 1;
    private static final int _POSIX_ASYNC_IO = 1;
    private static final int _LFS_ASYNCHRONOUS_IO = 1;
    private static final int _LFS64_ASYNCHRONOUS_IO = 1;
    private static final int _LFS_LARGEFILE = 1;
    private static final int _LFS64_LARGEFILE = 1;
    private static final int _LFS64_STDIO = 1;
    private static final int _POSIX_CPUTIME = 0;
    private static final int _POSIX_THREAD_CPUTIME = 0;
    private static final int _POSIX_REGEXP = 1;
    private static final int _POSIX_SHELL = 1;
    private static final int _POSIX_MONOTONIC_CLOCK = 0;
    private static final int _POSIX_V7_LP64_OFF64 = 1;
    private static final int _POSIX_V6_LP64_OFF64 = 1;
    private static final int _XBS5_LP64_OFF64 = 1;
    private static final int STDIN_FILENO = 0;
    private static final int STDOUT_FILENO = 1;
    private static final int STDERR_FILENO = 2;
    private static final int R_OK = 4;
    private static final int W_OK = 2;
    private static final int X_OK = 1;
    private static final int F_OK = 0;
    private static final int _GETOPT_POSIX_H = 1;
    private static final int _GETOPT_CORE_H = 1;
    private static final int F_ULOCK = 0;
    private static final int F_LOCK = 1;
    private static final int F_TLOCK = 2;
    private static final int F_TEST = 3;
    private static final int _FCNTL_H = 1;
    private static final int __O_LARGEFILE = 0;
    private static final int F_GETLK64 = 5;
    private static final int F_SETLK64 = 6;
    private static final int F_SETLKW64 = 7;
    private static final int O_ACCMODE = 3;
    private static final int O_RDONLY = 0;
    private static final int O_WRONLY = 1;
    private static final int O_RDWR = 2;
    private static final int O_CREAT = 64;
    private static final int O_EXCL = 128;
    private static final int O_NOCTTY = 256;
    private static final int O_TRUNC = 512;
    private static final int O_APPEND = 1024;
    private static final int O_NONBLOCK = 2048;
    private static final int O_SYNC = 0x101000;
    private static final int O_ASYNC = 8192;
    private static final int __O_DIRECTORY = 65536;
    private static final int __O_NOFOLLOW = 131072;
    private static final int __O_CLOEXEC = 524288;
    private static final int __O_DIRECT = 16384;
    private static final int __O_NOATIME = 262144;
    private static final int __O_PATH = 0x200000;
    private static final int __O_DSYNC = 4096;
    private static final int F_DUPFD = 0;
    private static final int F_GETFD = 1;
    private static final int F_SETFD = 2;
    private static final int F_GETFL = 3;
    private static final int F_SETFL = 4;
    private static final int __F_SETOWN = 8;
    private static final int __F_GETOWN = 9;
    private static final int __F_SETSIG = 10;
    private static final int __F_GETSIG = 11;
    private static final int __F_SETOWN_EX = 15;
    private static final int __F_GETOWN_EX = 16;
    private static final int F_DUPFD_CLOEXEC = 1030;
    private static final int FD_CLOEXEC = 1;
    private static final int F_RDLCK = 0;
    private static final int F_WRLCK = 1;
    private static final int F_UNLCK = 2;
    private static final int F_EXLCK = 4;
    private static final int F_SHLCK = 8;
    private static final int LOCK_SH = 1;
    private static final int LOCK_EX = 2;
    private static final int LOCK_NB = 4;
    private static final int LOCK_UN = 8;
    private static final int __POSIX_FADV_DONTNEED = 4;
    private static final int __POSIX_FADV_NOREUSE = 5;
    private static final int POSIX_FADV_NORMAL = 0;
    private static final int POSIX_FADV_RANDOM = 1;
    private static final int POSIX_FADV_SEQUENTIAL = 2;
    private static final int POSIX_FADV_WILLNEED = 3;
    private static final int _BITS_STAT_H = 1;
    private static final int _BITS_STRUCT_STAT_H = 1;
    private static final int __S_IFMT = 61440;
    private static final int __S_IFDIR = 16384;
    private static final int __S_IFCHR = 8192;
    private static final int __S_IFBLK = 24576;
    private static final int __S_IFREG = 32768;
    private static final int __S_IFIFO = 4096;
    private static final int __S_IFLNK = 40960;
    private static final int __S_IFSOCK = 49152;
    private static final int __S_ISUID = 2048;
    private static final int __S_ISGID = 1024;
    private static final int __S_ISVTX = 512;
    private static final int __S_IREAD = 256;
    private static final int __S_IWRITE = 128;
    private static final int __S_IEXEC = 64;
    private static final int AT_SYMLINK_NOFOLLOW = 256;
    private static final int AT_REMOVEDIR = 512;
    private static final int AT_SYMLINK_FOLLOW = 1024;
    private static final int AT_EACCESS = 512;
    private static final int ETH_ALEN = 6;
    private static final int ETH_TLEN = 2;
    private static final int ETH_HLEN = 14;
    private static final int ETH_ZLEN = 60;
    private static final int ETH_DATA_LEN = 1500;
    private static final int ETH_FRAME_LEN = 1514;
    private static final int ETH_FCS_LEN = 4;
    private static final int ETH_MIN_MTU = 68;
    private static final int ETH_P_LOOP = 96;
    private static final int ETH_P_PUP = 512;
    private static final int ETH_P_PUPAT = 513;
    private static final int ETH_P_TSN = 8944;
    private static final int ETH_P_ERSPAN2 = 8939;
    private static final int ETH_P_IP = 2048;
    private static final int ETH_P_X25 = 2053;
    private static final int ETH_P_ARP = 2054;
    private static final int ETH_P_BPQ = 2303;
    private static final int ETH_P_IEEEPUP = 2560;
    private static final int ETH_P_IEEEPUPAT = 2561;
    private static final int ETH_P_BATMAN = 17157;
    private static final int ETH_P_DEC = 24576;
    private static final int ETH_P_DNA_DL = 24577;
    private static final int ETH_P_DNA_RC = 24578;
    private static final int ETH_P_DNA_RT = 24579;
    private static final int ETH_P_LAT = 24580;
    private static final int ETH_P_DIAG = 24581;
    private static final int ETH_P_CUST = 24582;
    private static final int ETH_P_SCA = 24583;
    private static final int ETH_P_TEB = 25944;
    private static final int ETH_P_RARP = 32821;
    private static final int ETH_P_ATALK = 32923;
    private static final int ETH_P_AARP = 33011;
    private static final int ETH_P_8021Q = 33024;
    private static final int ETH_P_ERSPAN = 35006;
    private static final int ETH_P_IPX = 33079;
    private static final int ETH_P_IPV6 = 34525;
    private static final int ETH_P_PAUSE = 34824;
    private static final int ETH_P_SLOW = 34825;
    private static final int ETH_P_WCCP = 34878;
    private static final int ETH_P_MPLS_UC = 34887;
    private static final int ETH_P_MPLS_MC = 34888;
    private static final int ETH_P_ATMMPOA = 34892;
    private static final int ETH_P_PPP_DISC = 34915;
    private static final int ETH_P_PPP_SES = 34916;
    private static final int ETH_P_LINK_CTL = 34924;
    private static final int ETH_P_ATMFATE = 34948;
    private static final int ETH_P_PAE = 34958;
    private static final int ETH_P_PROFINET = 34962;
    private static final int ETH_P_REALTEK = 34969;
    private static final int ETH_P_AOE = 34978;
    private static final int ETH_P_ETHERCAT = 34980;
    private static final int ETH_P_8021AD = 34984;
    private static final int ETH_P_802_EX1 = 34997;
    private static final int ETH_P_PREAUTH = 35015;
    private static final int ETH_P_TIPC = 35018;
    private static final int ETH_P_LLDP = 35020;
    private static final int ETH_P_MRP = 35043;
    private static final int ETH_P_MACSEC = 35045;
    private static final int ETH_P_8021AH = 35047;
    private static final int ETH_P_MVRP = 35061;
    private static final int ETH_P_1588 = 35063;
    private static final int ETH_P_NCSI = 35064;
    private static final int ETH_P_PRP = 35067;
    private static final int ETH_P_CFM = 35074;
    private static final int ETH_P_FCOE = 35078;
    private static final int ETH_P_IBOE = 35093;
    private static final int ETH_P_TDLS = 35085;
    private static final int ETH_P_FIP = 35092;
    private static final int ETH_P_80221 = 35095;
    private static final int ETH_P_HSR = 35119;
    private static final int ETH_P_NSH = 35151;
    private static final int ETH_P_LOOPBACK = 36864;
    private static final int ETH_P_QINQ1 = 37120;
    private static final int ETH_P_QINQ2 = 37376;
    private static final int ETH_P_QINQ3 = 37632;
    private static final int ETH_P_EDSA = 56026;
    private static final int ETH_P_DSA_8021Q = 56027;
    private static final int ETH_P_DSA_A5PSW = 57345;
    private static final int ETH_P_IFE = 60734;
    private static final int ETH_P_AF_IUCV = 64507;
    private static final int ETH_P_802_3_MIN = 1536;
    private static final int ETH_P_802_3 = 1;
    private static final int ETH_P_AX25 = 2;
    private static final int ETH_P_ALL = 3;
    private static final int ETH_P_802_2 = 4;
    private static final int ETH_P_SNAP = 5;
    private static final int ETH_P_DDCMP = 6;
    private static final int ETH_P_WAN_PPP = 7;
    private static final int ETH_P_PPP_MP = 8;
    private static final int ETH_P_LOCALTALK = 9;
    private static final int ETH_P_CAN = 12;
    private static final int ETH_P_CANFD = 13;
    private static final int ETH_P_CANXL = 14;
    private static final int ETH_P_PPPTALK = 16;
    private static final int ETH_P_TR_802_2 = 17;
    private static final int ETH_P_MOBITEX = 21;
    private static final int ETH_P_CONTROL = 22;
    private static final int ETH_P_IRDA = 23;
    private static final int ETH_P_ECONET = 24;
    private static final int ETH_P_HDLC = 25;
    private static final int ETH_P_ARCNET = 26;
    private static final int ETH_P_DSA = 27;
    private static final int ETH_P_TRAILER = 28;
    private static final int ETH_P_PHONET = 245;
    private static final int ETH_P_IEEE802154 = 246;
    private static final int ETH_P_CAIF = 247;
    private static final int ETH_P_XDSA = 248;
    private static final int ETH_P_MAP = 249;
    private static final int ETH_P_MCTP = 250;
    private static final int __UAPI_DEF_ETHHDR = 1;
    private static final int PACKET_HOST = 0;
    private static final int PACKET_BROADCAST = 1;
    private static final int PACKET_MULTICAST = 2;
    private static final int PACKET_OTHERHOST = 3;
    private static final int PACKET_OUTGOING = 4;
    private static final int PACKET_LOOPBACK = 5;
    private static final int PACKET_USER = 6;
    private static final int PACKET_KERNEL = 7;
    private static final int PACKET_FASTROUTE = 6;
    private static final int PACKET_ADD_MEMBERSHIP = 1;
    private static final int PACKET_DROP_MEMBERSHIP = 2;
    private static final int PACKET_RECV_OUTPUT = 3;
    private static final int PACKET_RX_RING = 5;
    private static final int PACKET_STATISTICS = 6;
    private static final int PACKET_COPY_THRESH = 7;
    private static final int PACKET_AUXDATA = 8;
    private static final int PACKET_ORIGDEV = 9;
    private static final int PACKET_VERSION = 10;
    private static final int PACKET_HDRLEN = 11;
    private static final int PACKET_RESERVE = 12;
    private static final int PACKET_TX_RING = 13;
    private static final int PACKET_LOSS = 14;
    private static final int PACKET_VNET_HDR = 15;
    private static final int PACKET_TX_TIMESTAMP = 16;
    private static final int PACKET_TIMESTAMP = 17;
    private static final int PACKET_FANOUT = 18;
    private static final int PACKET_TX_HAS_OFF = 19;
    private static final int PACKET_QDISC_BYPASS = 20;
    private static final int PACKET_ROLLOVER_STATS = 21;
    private static final int PACKET_FANOUT_DATA = 22;
    private static final int PACKET_IGNORE_OUTGOING = 23;
    private static final int PACKET_VNET_HDR_SZ = 24;
    private static final int PACKET_FANOUT_HASH = 0;
    private static final int PACKET_FANOUT_LB = 1;
    private static final int PACKET_FANOUT_CPU = 2;
    private static final int PACKET_FANOUT_ROLLOVER = 3;
    private static final int PACKET_FANOUT_RND = 4;
    private static final int PACKET_FANOUT_QM = 5;
    private static final int PACKET_FANOUT_CBPF = 6;
    private static final int PACKET_FANOUT_EBPF = 7;
    private static final int PACKET_FANOUT_FLAG_ROLLOVER = 4096;
    private static final int PACKET_FANOUT_FLAG_UNIQUEID = 8192;
    private static final int PACKET_FANOUT_FLAG_IGNORE_OUTGOING = 16384;
    private static final int PACKET_FANOUT_FLAG_DEFRAG = 32768;
    private static final int TP_STATUS_KERNEL = 0;
    private static final int TP_STATUS_AVAILABLE = 0;
    private static final int TP_FT_REQ_FILL_RXHASH = 1;
    private static final int TPACKET_ALIGNMENT = 16;
    private static final int PACKET_MR_MULTICAST = 0;
    private static final int PACKET_MR_PROMISC = 1;
    private static final int PACKET_MR_ALLMULTI = 2;
    private static final int PACKET_MR_UNICAST = 3;
    private static final int IPTOS_TOS_MASK = 30;
    private static final int IPTOS_LOWDELAY = 16;
    private static final int IPTOS_THROUGHPUT = 8;
    private static final int IPTOS_RELIABILITY = 4;
    private static final int IPTOS_MINCOST = 2;
    private static final int IPTOS_PREC_MASK = 224;
    private static final int IPTOS_PREC_NETCONTROL = 224;
    private static final int IPTOS_PREC_INTERNETCONTROL = 192;
    private static final int IPTOS_PREC_CRITIC_ECP = 160;
    private static final int IPTOS_PREC_FLASHOVERRIDE = 128;
    private static final int IPTOS_PREC_FLASH = 96;
    private static final int IPTOS_PREC_IMMEDIATE = 64;
    private static final int IPTOS_PREC_PRIORITY = 32;
    private static final int IPTOS_PREC_ROUTINE = 0;
    private static final int IPOPT_COPY = 128;
    private static final int IPOPT_CLASS_MASK = 96;
    private static final int IPOPT_NUMBER_MASK = 31;
    private static final int IPOPT_CONTROL = 0;
    private static final int IPOPT_RESERVED1 = 32;
    private static final int IPOPT_MEASUREMENT = 64;
    private static final int IPOPT_RESERVED2 = 96;
    private static final int IPVERSION = 4;
    private static final int MAXTTL = 255;
    private static final int IPDEFTTL = 64;
    private static final int IPOPT_OPTVAL = 0;
    private static final int IPOPT_OLEN = 1;
    private static final int IPOPT_OFFSET = 2;
    private static final int IPOPT_MINOFF = 4;
    private static final int MAX_IPOPTLEN = 40;
    private static final int IPOPT_TS_TSONLY = 0;
    private static final int IPOPT_TS_TSANDADDR = 1;
    private static final int IPOPT_TS_PRESPEC = 3;
    private static final int IPV4_BEET_PHMAXLEN = 8;
    private static final int __UAPI_DEF_IF_IFCONF = 1;
    private static final int __UAPI_DEF_IF_IFMAP = 1;
    private static final int __UAPI_DEF_IF_IFNAMSIZ = 1;
    private static final int __UAPI_DEF_IF_IFREQ = 1;
    private static final int __UAPI_DEF_IF_NET_DEVICE_FLAGS = 1;
    private static final int __UAPI_DEF_IF_NET_DEVICE_FLAGS_LOWER_UP_DORMANT_ECHO = 1;
    private static final int __UAPI_DEF_IN_ADDR = 1;
    private static final int __UAPI_DEF_IN_IPPROTO = 1;
    private static final int __UAPI_DEF_IN_PKTINFO = 1;
    private static final int __UAPI_DEF_IP_MREQ = 1;
    private static final int __UAPI_DEF_SOCKADDR_IN = 1;
    private static final int __UAPI_DEF_IN_CLASS = 1;
    private static final int __UAPI_DEF_IN6_ADDR = 1;
    private static final int __UAPI_DEF_IN6_ADDR_ALT = 1;
    private static final int __UAPI_DEF_SOCKADDR_IN6 = 1;
    private static final int __UAPI_DEF_IPV6_MREQ = 1;
    private static final int __UAPI_DEF_IPPROTO_V6 = 1;
    private static final int __UAPI_DEF_IPV6_OPTIONS = 1;
    private static final int __UAPI_DEF_IN6_PKTINFO = 1;
    private static final int __UAPI_DEF_IP6_MTUINFO = 1;
    private static final int __UAPI_DEF_XATTR = 1;
    private static final int IPV6_FL_A_GET = 0;
    private static final int IPV6_FL_A_PUT = 1;
    private static final int IPV6_FL_A_RENEW = 2;
    private static final int IPV6_FL_F_CREATE = 1;
    private static final int IPV6_FL_F_EXCL = 2;
    private static final int IPV6_FL_F_REFLECT = 4;
    private static final int IPV6_FL_F_REMOTE = 8;
    private static final int IPV6_FL_S_NONE = 0;
    private static final int IPV6_FL_S_EXCL = 1;
    private static final int IPV6_FL_S_PROCESS = 2;
    private static final int IPV6_FL_S_USER = 3;
    private static final int IPV6_FL_S_ANY = 255;
    private static final int IPV6_FLOWINFO_FLOWLABEL = 1048575;
    private static final int IPV6_FLOWINFO_PRIORITY = 0xFF00000;
    private static final int IPV6_PRIORITY_UNCHARACTERIZED = 0;
    private static final int IPV6_PRIORITY_FILLER = 256;
    private static final int IPV6_PRIORITY_UNATTENDED = 512;
    private static final int IPV6_PRIORITY_RESERVED1 = 768;
    private static final int IPV6_PRIORITY_BULK = 1024;
    private static final int IPV6_PRIORITY_RESERVED2 = 1280;
    private static final int IPV6_PRIORITY_INTERACTIVE = 1536;
    private static final int IPV6_PRIORITY_CONTROL = 1792;
    private static final int IPV6_PRIORITY_8 = 2048;
    private static final int IPV6_PRIORITY_9 = 2304;
    private static final int IPV6_PRIORITY_10 = 2560;
    private static final int IPV6_PRIORITY_11 = 2816;
    private static final int IPV6_PRIORITY_12 = 3072;
    private static final int IPV6_PRIORITY_13 = 3328;
    private static final int IPV6_PRIORITY_14 = 3584;
    private static final int IPV6_PRIORITY_15 = 3840;
    private static final int IPPROTO_HOPOPTS = 0;
    private static final int IPPROTO_ROUTING = 43;
    private static final int IPPROTO_FRAGMENT = 44;
    private static final int IPPROTO_ICMPV6 = 58;
    private static final int IPPROTO_NONE = 59;
    private static final int IPPROTO_DSTOPTS = 60;
    private static final int IPPROTO_MH = 135;
    private static final int IPV6_TLV_PAD1 = 0;
    private static final int IPV6_TLV_PADN = 1;
    private static final int IPV6_TLV_ROUTERALERT = 5;
    private static final int IPV6_TLV_CALIPSO = 7;
    private static final int IPV6_TLV_IOAM = 49;
    private static final int IPV6_TLV_JUMBO = 194;
    private static final int IPV6_TLV_HAO = 201;
    private static final int IPV6_ADDRFORM = 1;
    private static final int IPV6_2292PKTINFO = 2;
    private static final int IPV6_2292HOPOPTS = 3;
    private static final int IPV6_2292DSTOPTS = 4;
    private static final int IPV6_2292RTHDR = 5;
    private static final int IPV6_2292PKTOPTIONS = 6;
    private static final int IPV6_CHECKSUM = 7;
    private static final int IPV6_2292HOPLIMIT = 8;
    private static final int IPV6_NEXTHOP = 9;
    private static final int IPV6_AUTHHDR = 10;
    private static final int IPV6_FLOWINFO = 11;
    private static final int IPV6_UNICAST_HOPS = 16;
    private static final int IPV6_MULTICAST_IF = 17;
    private static final int IPV6_MULTICAST_HOPS = 18;
    private static final int IPV6_MULTICAST_LOOP = 19;
    private static final int IPV6_ADD_MEMBERSHIP = 20;
    private static final int IPV6_DROP_MEMBERSHIP = 21;
    private static final int IPV6_ROUTER_ALERT = 22;
    private static final int IPV6_MTU_DISCOVER = 23;
    private static final int IPV6_MTU = 24;
    private static final int IPV6_RECVERR = 25;
    private static final int IPV6_V6ONLY = 26;
    private static final int IPV6_JOIN_ANYCAST = 27;
    private static final int IPV6_LEAVE_ANYCAST = 28;
    private static final int IPV6_MULTICAST_ALL = 29;
    private static final int IPV6_ROUTER_ALERT_ISOLATE = 30;
    private static final int IPV6_RECVERR_RFC4884 = 31;
    private static final int IPV6_PMTUDISC_DONT = 0;
    private static final int IPV6_PMTUDISC_WANT = 1;
    private static final int IPV6_PMTUDISC_DO = 2;
    private static final int IPV6_PMTUDISC_PROBE = 3;
    private static final int IPV6_PMTUDISC_INTERFACE = 4;
    private static final int IPV6_PMTUDISC_OMIT = 5;
    private static final int IPV6_FLOWLABEL_MGR = 32;
    private static final int IPV6_FLOWINFO_SEND = 33;
    private static final int IPV6_IPSEC_POLICY = 34;
    private static final int IPV6_XFRM_POLICY = 35;
    private static final int IPV6_HDRINCL = 36;
    private static final int IPV6_RECVPKTINFO = 49;
    private static final int IPV6_PKTINFO = 50;
    private static final int IPV6_RECVHOPLIMIT = 51;
    private static final int IPV6_HOPLIMIT = 52;
    private static final int IPV6_RECVHOPOPTS = 53;
    private static final int IPV6_HOPOPTS = 54;
    private static final int IPV6_RTHDRDSTOPTS = 55;
    private static final int IPV6_RECVRTHDR = 56;
    private static final int IPV6_RTHDR = 57;
    private static final int IPV6_RECVDSTOPTS = 58;
    private static final int IPV6_DSTOPTS = 59;
    private static final int IPV6_RECVPATHMTU = 60;
    private static final int IPV6_PATHMTU = 61;
    private static final int IPV6_DONTFRAG = 62;
    private static final int IPV6_RECVTCLASS = 66;
    private static final int IPV6_TCLASS = 67;
    private static final int IPV6_AUTOFLOWLABEL = 70;
    private static final int IPV6_ADDR_PREFERENCES = 72;
    private static final int IPV6_PREFER_SRC_TMP = 1;
    private static final int IPV6_PREFER_SRC_PUBLIC = 2;
    private static final int IPV6_PREFER_SRC_PUBTMP_DEFAULT = 256;
    private static final int IPV6_PREFER_SRC_COA = 4;
    private static final int IPV6_PREFER_SRC_HOME = 1024;
    private static final int IPV6_PREFER_SRC_CGA = 8;
    private static final int IPV6_PREFER_SRC_NONCGA = 2048;
    private static final int IPV6_MINHOPCOUNT = 73;
    private static final int IPV6_ORIGDSTADDR = 74;
    private static final int IPV6_TRANSPARENT = 75;
    private static final int IPV6_UNICAST_IF = 76;
    private static final int IPV6_RECVFRAGSIZE = 77;
    private static final int IPV6_FREEBIND = 78;
    private static final int IPV6_MIN_MTU = 1280;
    private static final int IPV6_SRCRT_STRICT = 1;
    private static final int IPV6_SRCRT_TYPE_0 = 0;
    private static final int IPV6_SRCRT_TYPE_2 = 2;
    private static final int IPV6_SRCRT_TYPE_3 = 3;
    private static final int IPV6_SRCRT_TYPE_4 = 4;
    private static final int IPV6_OPT_ROUTERALERT_MLD = 0;
    private static final int _K_SS_MAXSIZE = 128;
    private static final int SOCK_SNDBUF_LOCK = 1;
    private static final int SOCK_RCVBUF_LOCK = 2;
    private static final int SOCK_TXREHASH_DEFAULT = 255;
    private static final int SOCK_TXREHASH_DISABLED = 0;
    private static final int SOCK_TXREHASH_ENABLED = 1;
    private static final int _SYS_SOCKET_H = 1;
    private static final int __iovec_defined = 1;
    private static final int PF_UNSPEC = 0;
    private static final int PF_LOCAL = 1;
    private static final int PF_INET = 2;
    private static final int PF_AX25 = 3;
    private static final int PF_IPX = 4;
    private static final int PF_APPLETALK = 5;
    private static final int PF_NETROM = 6;
    private static final int PF_BRIDGE = 7;
    private static final int PF_ATMPVC = 8;
    private static final int PF_X25 = 9;
    private static final int PF_INET6 = 10;
    private static final int PF_ROSE = 11;
    private static final int PF_DECnet = 12;
    private static final int PF_NETBEUI = 13;
    private static final int PF_SECURITY = 14;
    private static final int PF_KEY = 15;
    private static final int PF_NETLINK = 16;
    private static final int PF_PACKET = 17;
    private static final int PF_ASH = 18;
    private static final int PF_ECONET = 19;
    private static final int PF_ATMSVC = 20;
    private static final int PF_RDS = 21;
    private static final int PF_SNA = 22;
    private static final int PF_IRDA = 23;
    private static final int PF_PPPOX = 24;
    private static final int PF_WANPIPE = 25;
    private static final int PF_LLC = 26;
    private static final int PF_IB = 27;
    private static final int PF_MPLS = 28;
    private static final int PF_CAN = 29;
    private static final int PF_TIPC = 30;
    private static final int PF_BLUETOOTH = 31;
    private static final int PF_IUCV = 32;
    private static final int PF_RXRPC = 33;
    private static final int PF_ISDN = 34;
    private static final int PF_PHONET = 35;
    private static final int PF_IEEE802154 = 36;
    private static final int PF_CAIF = 37;
    private static final int PF_ALG = 38;
    private static final int PF_NFC = 39;
    private static final int PF_VSOCK = 40;
    private static final int PF_KCM = 41;
    private static final int PF_QIPCRTR = 42;
    private static final int PF_SMC = 43;
    private static final int PF_XDP = 44;
    private static final int PF_MCTP = 45;
    private static final int PF_MAX = 46;
    private static final int SOL_RAW = 255;
    private static final int SOL_DECNET = 261;
    private static final int SOL_X25 = 262;
    private static final int SOL_PACKET = 263;
    private static final int SOL_ATM = 264;
    private static final int SOL_AAL = 265;
    private static final int SOL_IRDA = 266;
    private static final int SOL_NETBEUI = 267;
    private static final int SOL_LLC = 268;
    private static final int SOL_DCCP = 269;
    private static final int SOL_NETLINK = 270;
    private static final int SOL_TIPC = 271;
    private static final int SOL_RXRPC = 272;
    private static final int SOL_PPPOL2TP = 273;
    private static final int SOL_BLUETOOTH = 274;
    private static final int SOL_PNPIPE = 275;
    private static final int SOL_RDS = 276;
    private static final int SOL_IUCV = 277;
    private static final int SOL_CAIF = 278;
    private static final int SOL_ALG = 279;
    private static final int SOL_NFC = 280;
    private static final int SOL_KCM = 281;
    private static final int SOL_TLS = 282;
    private static final int SOL_XDP = 283;
    private static final int SOL_MPTCP = 284;
    private static final int SOL_MCTP = 285;
    private static final int SOL_SMC = 286;
    private static final int SOL_VSOCK = 287;
    private static final int SOMAXCONN = 4096;
    private static final int _BITS_SOCKADDR_H = 1;
    private static final int _SS_SIZE = 128;
    private static final int FIOSETOWN = 35073;
    private static final int SIOCSPGRP = 35074;
    private static final int FIOGETOWN = 35075;
    private static final int SIOCGPGRP = 35076;
    private static final int SIOCATMARK = 35077;
    private static final int SIOCGSTAMP_OLD = 35078;
    private static final int SIOCGSTAMPNS_OLD = 35079;
    private static final int SOL_SOCKET = 1;
    private static final int SO_DEBUG = 1;
    private static final int SO_REUSEADDR = 2;
    private static final int SO_TYPE = 3;
    private static final int SO_ERROR = 4;
    private static final int SO_DONTROUTE = 5;
    private static final int SO_BROADCAST = 6;
    private static final int SO_SNDBUF = 7;
    private static final int SO_RCVBUF = 8;
    private static final int SO_SNDBUFFORCE = 32;
    private static final int SO_RCVBUFFORCE = 33;
    private static final int SO_KEEPALIVE = 9;
    private static final int SO_OOBINLINE = 10;
    private static final int SO_NO_CHECK = 11;
    private static final int SO_PRIORITY = 12;
    private static final int SO_LINGER = 13;
    private static final int SO_BSDCOMPAT = 14;
    private static final int SO_REUSEPORT = 15;
    private static final int SO_PASSCRED = 16;
    private static final int SO_PEERCRED = 17;
    private static final int SO_RCVLOWAT = 18;
    private static final int SO_SNDLOWAT = 19;
    private static final int SO_RCVTIMEO_OLD = 20;
    private static final int SO_SNDTIMEO_OLD = 21;
    private static final int SO_SECURITY_AUTHENTICATION = 22;
    private static final int SO_SECURITY_ENCRYPTION_TRANSPORT = 23;
    private static final int SO_SECURITY_ENCRYPTION_NETWORK = 24;
    private static final int SO_BINDTODEVICE = 25;
    private static final int SO_ATTACH_FILTER = 26;
    private static final int SO_DETACH_FILTER = 27;
    private static final int SO_PEERNAME = 28;
    private static final int SO_ACCEPTCONN = 30;
    private static final int SO_PEERSEC = 31;
    private static final int SO_PASSSEC = 34;
    private static final int SO_MARK = 36;
    private static final int SO_PROTOCOL = 38;
    private static final int SO_DOMAIN = 39;
    private static final int SO_RXQ_OVFL = 40;
    private static final int SO_WIFI_STATUS = 41;
    private static final int SO_PEEK_OFF = 42;
    private static final int SO_NOFCS = 43;
    private static final int SO_LOCK_FILTER = 44;
    private static final int SO_SELECT_ERR_QUEUE = 45;
    private static final int SO_BUSY_POLL = 46;
    private static final int SO_MAX_PACING_RATE = 47;
    private static final int SO_BPF_EXTENSIONS = 48;
    private static final int SO_INCOMING_CPU = 49;
    private static final int SO_ATTACH_BPF = 50;
    private static final int SO_ATTACH_REUSEPORT_CBPF = 51;
    private static final int SO_ATTACH_REUSEPORT_EBPF = 52;
    private static final int SO_CNX_ADVICE = 53;
    private static final int SCM_TIMESTAMPING_OPT_STATS = 54;
    private static final int SO_MEMINFO = 55;
    private static final int SO_INCOMING_NAPI_ID = 56;
    private static final int SO_COOKIE = 57;
    private static final int SCM_TIMESTAMPING_PKTINFO = 58;
    private static final int SO_PEERGROUPS = 59;
    private static final int SO_ZEROCOPY = 60;
    private static final int SO_TXTIME = 61;
    private static final int SO_BINDTOIFINDEX = 62;
    private static final int SO_TIMESTAMP_OLD = 29;
    private static final int SO_TIMESTAMPNS_OLD = 35;
    private static final int SO_TIMESTAMPING_OLD = 37;
    private static final int SO_TIMESTAMP_NEW = 63;
    private static final int SO_TIMESTAMPNS_NEW = 64;
    private static final int SO_TIMESTAMPING_NEW = 65;
    private static final int SO_RCVTIMEO_NEW = 66;
    private static final int SO_SNDTIMEO_NEW = 67;
    private static final int SO_DETACH_REUSEPORT_BPF = 68;
    private static final int SO_PREFER_BUSY_POLL = 69;
    private static final int SO_BUSY_POLL_BUDGET = 70;
    private static final int SO_NETNS_COOKIE = 71;
    private static final int SO_BUF_LOCK = 72;
    private static final int SO_RESERVE_MEM = 73;
    private static final int SO_TXREHASH = 74;
    private static final int SO_RCVMARK = 75;
    private static final int SO_PASSPIDFD = 76;
    private static final int SO_PEERPIDFD = 77;
    private static final int SO_DEVMEM_LINEAR = 78;
    private static final int SO_DEVMEM_DMABUF = 79;
    private static final int SO_DEVMEM_DONTNEED = 80;
    private static final int SCM_TS_OPT_ID = 81;
    private static final int SO_RCVPRIORITY = 82;
    private static final int __osockaddr_defined = 1;
    private static final int IFNAMSIZ = 16;
    private static final int IFALIASZ = 256;
    private static final int ALTIFNAMSIZ = 128;
    private static final int GENERIC_HDLC_VERSION = 4;
    private static final int CLOCK_DEFAULT = 0;
    private static final int CLOCK_EXT = 1;
    private static final int CLOCK_INT = 2;
    private static final int CLOCK_TXINT = 3;
    private static final int CLOCK_TXFROMRX = 4;
    private static final int ENCODING_DEFAULT = 0;
    private static final int ENCODING_NRZ = 1;
    private static final int ENCODING_NRZI = 2;
    private static final int ENCODING_FM_MARK = 3;
    private static final int ENCODING_FM_SPACE = 4;

    Lib_4() {
    }

    static void traceDowncall(String name, Object ... args) {
        String traceArgs = Arrays.stream(args).map(Object::toString).collect(Collectors.joining(", "));
        System.out.printf("%s(%s)\n", name, traceArgs);
    }

    static MemorySegment findOrThrow(String symbol) {
        return (MemorySegment)SYMBOL_LOOKUP.find(symbol).orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: " + symbol));
    }

    static MethodHandle upcallHandle(Class<?> fi, String name, FunctionDescriptor fdesc) {
        try {
            return MethodHandles.lookup().findVirtual(fi, name, fdesc.toMethodType());
        } catch (ReflectiveOperationException ex) {
            throw new AssertionError((Object)ex);
        }
    }

    static MemoryLayout align(MemoryLayout layout, long align) {
        MemoryLayout memoryLayout = layout;
        Objects.requireNonNull(memoryLayout);
        MemoryLayout memoryLayout2 = memoryLayout;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{PaddingLayout.class, ValueLayout.class, GroupLayout.class, SequenceLayout.class}, (Object)memoryLayout2, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                PaddingLayout p;
                yield p = (PaddingLayout)memoryLayout2;
            }
            case 1 -> {
                ValueLayout v = (ValueLayout)memoryLayout2;
                yield v.withByteAlignment(align);
            }
            case 2 -> {
                GroupLayout g = (GroupLayout)memoryLayout2;
                MemoryLayout[] alignedMembers = (MemoryLayout[])g.memberLayouts().stream().map(m -> Lib_4.align(m, align)).toArray(MemoryLayout[]::new);
                if (g instanceof StructLayout) {
                    yield MemoryLayout.structLayout((MemoryLayout[])alignedMembers);
                }
                yield MemoryLayout.unionLayout((MemoryLayout[])alignedMembers);
            }
            case 3 -> {
                SequenceLayout s = (SequenceLayout)memoryLayout2;
                yield MemoryLayout.sequenceLayout((long)s.elementCount(), (MemoryLayout)Lib_4.align(s.elementLayout(), align));
            }
        };
    }

    public static int __BITS_PER_LONG() {
        return 64;
    }

    public static int __BITS_PER_LONG_LONG() {
        return 64;
    }

    public static int __FD_SETSIZE() {
        return 1024;
    }

    public static int BPF_LD() {
        return 0;
    }

    public static int BPF_LDX() {
        return 1;
    }

    public static int BPF_ST() {
        return 2;
    }

    public static int BPF_STX() {
        return 3;
    }

    public static int BPF_ALU() {
        return 4;
    }

    public static int BPF_JMP() {
        return 5;
    }

    public static int BPF_RET() {
        return 6;
    }

    public static int BPF_MISC() {
        return 7;
    }

    public static int BPF_W() {
        return 0;
    }

    public static int BPF_H() {
        return 8;
    }

    public static int BPF_B() {
        return 16;
    }

    public static int BPF_IMM() {
        return 0;
    }

    public static int BPF_ABS() {
        return 32;
    }

    public static int BPF_IND() {
        return 64;
    }

    public static int BPF_MEM() {
        return 96;
    }

    public static int BPF_LEN() {
        return 128;
    }

    public static int BPF_MSH() {
        return 160;
    }

    public static int BPF_ADD() {
        return 0;
    }

    public static int BPF_SUB() {
        return 16;
    }

    public static int BPF_MUL() {
        return 32;
    }

    public static int BPF_DIV() {
        return 48;
    }

    public static int BPF_OR() {
        return 64;
    }

    public static int BPF_AND() {
        return 80;
    }

    public static int BPF_LSH() {
        return 96;
    }

    public static int BPF_RSH() {
        return 112;
    }

    public static int BPF_NEG() {
        return 128;
    }

    public static int BPF_MOD() {
        return 144;
    }

    public static int BPF_XOR() {
        return 160;
    }

    public static int BPF_JA() {
        return 0;
    }

    public static int BPF_JEQ() {
        return 16;
    }

    public static int BPF_JGT() {
        return 32;
    }

    public static int BPF_JGE() {
        return 48;
    }

    public static int BPF_JSET() {
        return 64;
    }

    public static int BPF_K() {
        return 0;
    }

    public static int BPF_X() {
        return 8;
    }

    public static int BPF_MAXINSNS() {
        return 4096;
    }

    public static int BPF_JMP32() {
        return 6;
    }

    public static int BPF_ALU64() {
        return 7;
    }

    public static int BPF_DW() {
        return 24;
    }

    public static int BPF_MEMSX() {
        return 128;
    }

    public static int BPF_ATOMIC() {
        return 192;
    }

    public static int BPF_XADD() {
        return 192;
    }

    public static int BPF_MOV() {
        return 176;
    }

    public static int BPF_ARSH() {
        return 192;
    }

    public static int BPF_END() {
        return 208;
    }

    public static int BPF_TO_LE() {
        return 0;
    }

    public static int BPF_TO_BE() {
        return 8;
    }

    public static int BPF_JNE() {
        return 80;
    }

    public static int BPF_JLT() {
        return 160;
    }

    public static int BPF_JLE() {
        return 176;
    }

    public static int BPF_JSGT() {
        return 96;
    }

    public static int BPF_JSGE() {
        return 112;
    }

    public static int BPF_JSLT() {
        return 192;
    }

    public static int BPF_JSLE() {
        return 208;
    }

    public static int BPF_JCOND() {
        return 224;
    }

    public static int BPF_CALL() {
        return 128;
    }

    public static int BPF_EXIT() {
        return 144;
    }

    public static int BPF_FETCH() {
        return 1;
    }

    public static int BPF_PSEUDO_MAP_FD() {
        return 1;
    }

    public static int BPF_PSEUDO_MAP_IDX() {
        return 5;
    }

    public static int BPF_PSEUDO_MAP_VALUE() {
        return 2;
    }

    public static int BPF_PSEUDO_MAP_IDX_VALUE() {
        return 6;
    }

    public static int BPF_PSEUDO_BTF_ID() {
        return 3;
    }

    public static int BPF_PSEUDO_FUNC() {
        return 4;
    }

    public static int BPF_PSEUDO_CALL() {
        return 1;
    }

    public static int BPF_PSEUDO_KFUNC_CALL() {
        return 2;
    }

    public static int BPF_BUILD_ID_SIZE() {
        return 20;
    }

    public static int XDP_PACKET_HEADROOM() {
        return 256;
    }

    public static int BPF_TAG_SIZE() {
        return 8;
    }

    public static int true_() {
        return 1;
    }

    public static int false_() {
        return 0;
    }

    public static int __bool_true_false_are_defined() {
        return 1;
    }

    public static int _STDINT_H() {
        return 1;
    }

    public static int _FEATURES_H() {
        return 1;
    }

    public static int _DEFAULT_SOURCE() {
        return 1;
    }

    public static int __GLIBC_USE_ISOC2Y() {
        return 0;
    }

    public static int __GLIBC_USE_ISOC23() {
        return 0;
    }

    public static int __USE_ISOC11() {
        return 1;
    }

    public static int __USE_ISOC99() {
        return 1;
    }

    public static int __USE_ISOC95() {
        return 1;
    }

    public static int __USE_POSIX_IMPLICITLY() {
        return 1;
    }

    public static int _POSIX_SOURCE() {
        return 1;
    }

    public static int __USE_POSIX() {
        return 1;
    }

    public static int __USE_POSIX2() {
        return 1;
    }

    public static int __USE_POSIX199309() {
        return 1;
    }

    public static int __USE_POSIX199506() {
        return 1;
    }

    public static int __USE_XOPEN2K() {
        return 1;
    }

    public static int __USE_XOPEN2K8() {
        return 1;
    }

    public static int _ATFILE_SOURCE() {
        return 1;
    }

    public static int __WORDSIZE() {
        return 64;
    }

    public static int __WORDSIZE_TIME64_COMPAT32() {
        return 1;
    }

    public static int __SYSCALL_WORDSIZE() {
        return 64;
    }

    public static int __USE_TIME_BITS64() {
        return 1;
    }

    public static int __USE_MISC() {
        return 1;
    }

    public static int __USE_ATFILE() {
        return 1;
    }

    public static int __USE_FORTIFY_LEVEL() {
        return 0;
    }

    public static int __GLIBC_USE_DEPRECATED_GETS() {
        return 0;
    }

    public static int __GLIBC_USE_DEPRECATED_SCANF() {
        return 0;
    }

    public static int __GLIBC_USE_C23_STRTOL() {
        return 0;
    }

    public static int _STDC_PREDEF_H() {
        return 1;
    }

    public static int __STDC_IEC_559__() {
        return 1;
    }

    public static int __STDC_IEC_559_COMPLEX__() {
        return 1;
    }

    public static int __GNU_LIBRARY__() {
        return 6;
    }

    public static int __GLIBC__() {
        return 2;
    }

    public static int __GLIBC_MINOR__() {
        return 41;
    }

    public static int _SYS_CDEFS_H() {
        return 1;
    }

    public static int __glibc_c99_flexarr_available() {
        return 1;
    }

    public static int __LDOUBLE_REDIRECTS_TO_FLOAT128_ABI() {
        return 0;
    }

    public static int __HAVE_GENERIC_SELECTION() {
        return 1;
    }

    public static int __GLIBC_USE_LIB_EXT2() {
        return 0;
    }

    public static int __GLIBC_USE_IEC_60559_BFP_EXT() {
        return 0;
    }

    public static int __GLIBC_USE_IEC_60559_BFP_EXT_C23() {
        return 0;
    }

    public static int __GLIBC_USE_IEC_60559_EXT() {
        return 0;
    }

    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT() {
        return 0;
    }

    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT_C23() {
        return 0;
    }

    public static int __GLIBC_USE_IEC_60559_TYPES_EXT() {
        return 0;
    }

    public static int _BITS_TYPES_H() {
        return 1;
    }

    public static int _BITS_TYPESIZES_H() {
        return 1;
    }

    public static int __OFF_T_MATCHES_OFF64_T() {
        return 1;
    }

    public static int __INO_T_MATCHES_INO64_T() {
        return 1;
    }

    public static int __RLIM_T_MATCHES_RLIM64_T() {
        return 1;
    }

    public static int __STATFS_MATCHES_STATFS64() {
        return 1;
    }

    public static int __KERNEL_OLD_TIMEVAL_MATCHES_TIMEVAL64() {
        return 1;
    }

    public static int _BITS_TIME64_H() {
        return 1;
    }

    public static int _BITS_WCHAR_H() {
        return 1;
    }

    public static int _BITS_STDINT_INTN_H() {
        return 1;
    }

    public static int _BITS_STDINT_UINTN_H() {
        return 1;
    }

    public static int _BITS_STDINT_LEAST_H() {
        return 1;
    }

    public static int _STRING_H() {
        return 1;
    }

    public static int _BITS_TYPES_LOCALE_T_H() {
        return 1;
    }

    public static int _BITS_TYPES___LOCALE_T_H() {
        return 1;
    }

    public static int _STRINGS_H() {
        return 1;
    }

    public static int LIBBPF_MAJOR_VERSION() {
        return 1;
    }

    public static int LIBBPF_MINOR_VERSION() {
        return 5;
    }

    public static int MAPS_RELAX_COMPAT() {
        return 1;
    }

    public static int __GNUC_VA_LIST() {
        return 1;
    }

    public static int _STDIO_H() {
        return 1;
    }

    public static int _____fpos_t_defined() {
        return 1;
    }

    public static int ____mbstate_t_defined() {
        return 1;
    }

    public static int _____fpos64_t_defined() {
        return 1;
    }

    public static int ____FILE_defined() {
        return 1;
    }

    public static int __FILE_defined() {
        return 1;
    }

    public static int __struct_FILE_defined() {
        return 1;
    }

    public static int _IO_EOF_SEEN() {
        return 16;
    }

    public static int _IO_ERR_SEEN() {
        return 32;
    }

    public static int _IO_USER_LOCK() {
        return 32768;
    }

    public static int __cookie_io_functions_t_defined() {
        return 1;
    }

    public static int _IOFBF() {
        return 0;
    }

    public static int _IOLBF() {
        return 1;
    }

    public static int _IONBF() {
        return 2;
    }

    public static int BUFSIZ() {
        return 8192;
    }

    public static int SEEK_SET() {
        return 0;
    }

    public static int SEEK_CUR() {
        return 1;
    }

    public static int SEEK_END() {
        return 2;
    }

    public static int L_tmpnam() {
        return 20;
    }

    public static int TMP_MAX() {
        return 238328;
    }

    public static int _BITS_STDIO_LIM_H() {
        return 1;
    }

    public static int FILENAME_MAX() {
        return 4096;
    }

    public static int L_ctermid() {
        return 9;
    }

    public static int FOPEN_MAX() {
        return 16;
    }

    public static int __HAVE_FLOAT128() {
        return 1;
    }

    public static int __HAVE_DISTINCT_FLOAT128() {
        return 1;
    }

    public static int __HAVE_FLOAT64X() {
        return 1;
    }

    public static int __HAVE_FLOAT64X_LONG_DOUBLE() {
        return 1;
    }

    public static int __HAVE_FLOAT16() {
        return 0;
    }

    public static int __HAVE_FLOAT32() {
        return 1;
    }

    public static int __HAVE_FLOAT64() {
        return 1;
    }

    public static int __HAVE_FLOAT32X() {
        return 1;
    }

    public static int __HAVE_FLOAT128X() {
        return 0;
    }

    public static int __HAVE_DISTINCT_FLOAT32() {
        return 0;
    }

    public static int __HAVE_DISTINCT_FLOAT64() {
        return 0;
    }

    public static int __HAVE_DISTINCT_FLOAT32X() {
        return 0;
    }

    public static int __HAVE_DISTINCT_FLOAT64X() {
        return 0;
    }

    public static int __HAVE_FLOATN_NOT_TYPEDEF() {
        return 0;
    }

    public static int _SYS_TYPES_H() {
        return 1;
    }

    public static int __clock_t_defined() {
        return 1;
    }

    public static int __clockid_t_defined() {
        return 1;
    }

    public static int __time_t_defined() {
        return 1;
    }

    public static int __timer_t_defined() {
        return 1;
    }

    public static int __BIT_TYPES_DEFINED__() {
        return 1;
    }

    public static int _ENDIAN_H() {
        return 1;
    }

    public static int _BITS_ENDIAN_H() {
        return 1;
    }

    public static int __LITTLE_ENDIAN() {
        return 1234;
    }

    public static int __BIG_ENDIAN() {
        return 4321;
    }

    public static int __PDP_ENDIAN() {
        return 3412;
    }

    public static int _BITS_ENDIANNESS_H() {
        return 1;
    }

    public static int _BITS_BYTESWAP_H() {
        return 1;
    }

    public static int _BITS_UINTN_IDENTITY_H() {
        return 1;
    }

    public static int _SYS_SELECT_H() {
        return 1;
    }

    public static int __sigset_t_defined() {
        return 1;
    }

    public static int __timeval_defined() {
        return 1;
    }

    public static int _STRUCT_TIMESPEC() {
        return 1;
    }

    public static int _BITS_PTHREADTYPES_COMMON_H() {
        return 1;
    }

    public static int _THREAD_SHARED_TYPES_H() {
        return 1;
    }

    public static int _BITS_PTHREADTYPES_ARCH_H() {
        return 1;
    }

    public static int __SIZEOF_PTHREAD_MUTEX_T() {
        return 40;
    }

    public static int __SIZEOF_PTHREAD_ATTR_T() {
        return 56;
    }

    public static int __SIZEOF_PTHREAD_RWLOCK_T() {
        return 56;
    }

    public static int __SIZEOF_PTHREAD_BARRIER_T() {
        return 32;
    }

    public static int __SIZEOF_PTHREAD_MUTEXATTR_T() {
        return 4;
    }

    public static int __SIZEOF_PTHREAD_COND_T() {
        return 48;
    }

    public static int __SIZEOF_PTHREAD_CONDATTR_T() {
        return 4;
    }

    public static int __SIZEOF_PTHREAD_RWLOCKATTR_T() {
        return 8;
    }

    public static int __SIZEOF_PTHREAD_BARRIERATTR_T() {
        return 4;
    }

    public static int _THREAD_MUTEX_INTERNAL_H() {
        return 1;
    }

    public static int __PTHREAD_MUTEX_HAVE_PREV() {
        return 1;
    }

    public static int __have_pthread_attr_t() {
        return 1;
    }

    public static int BTF_MAGIC() {
        return 60319;
    }

    public static int BTF_VERSION() {
        return 1;
    }

    public static int BTF_MAX_TYPE() {
        return 1048575;
    }

    public static int BTF_MAX_NAME_OFFSET() {
        return 0xFFFFFF;
    }

    public static int BTF_MAX_VLEN() {
        return 65535;
    }

    public static int BTF_KIND_FUNC() {
        return 12;
    }

    public static int BTF_KIND_FUNC_PROTO() {
        return 13;
    }

    public static int BTF_KIND_VAR() {
        return 14;
    }

    public static int BTF_KIND_DATASEC() {
        return 15;
    }

    public static int BTF_KIND_FLOAT() {
        return 16;
    }

    public static int BTF_KIND_DECL_TAG() {
        return 17;
    }

    public static int BTF_KIND_TYPE_TAG() {
        return 18;
    }

    public static int BTF_KIND_ENUM64() {
        return 19;
    }

    public static int _ERRNO_H() {
        return 1;
    }

    public static int _BITS_ERRNO_H() {
        return 1;
    }

    public static int EPERM() {
        return 1;
    }

    public static int ENOENT() {
        return 2;
    }

    public static int ESRCH() {
        return 3;
    }

    public static int EINTR() {
        return 4;
    }

    public static int EIO() {
        return 5;
    }

    public static int ENXIO() {
        return 6;
    }

    public static int E2BIG() {
        return 7;
    }

    public static int ENOEXEC() {
        return 8;
    }

    public static int EBADF() {
        return 9;
    }

    public static int ECHILD() {
        return 10;
    }

    public static int EAGAIN() {
        return 11;
    }

    public static int ENOMEM() {
        return 12;
    }

    public static int EACCES() {
        return 13;
    }

    public static int EFAULT() {
        return 14;
    }

    public static int ENOTBLK() {
        return 15;
    }

    public static int EBUSY() {
        return 16;
    }

    public static int EEXIST() {
        return 17;
    }

    public static int EXDEV() {
        return 18;
    }

    public static int ENODEV() {
        return 19;
    }

    public static int ENOTDIR() {
        return 20;
    }

    public static int EISDIR() {
        return 21;
    }

    public static int EINVAL() {
        return 22;
    }

    public static int ENFILE() {
        return 23;
    }

    public static int EMFILE() {
        return 24;
    }

    public static int ENOTTY() {
        return 25;
    }

    public static int ETXTBSY() {
        return 26;
    }

    public static int EFBIG() {
        return 27;
    }

    public static int ENOSPC() {
        return 28;
    }

    public static int ESPIPE() {
        return 29;
    }

    public static int EROFS() {
        return 30;
    }

    public static int EMLINK() {
        return 31;
    }

    public static int EPIPE() {
        return 32;
    }

    public static int EDOM() {
        return 33;
    }

    public static int ERANGE() {
        return 34;
    }

    public static int EDEADLK() {
        return 35;
    }

    public static int ENAMETOOLONG() {
        return 36;
    }

    public static int ENOLCK() {
        return 37;
    }

    public static int ENOSYS() {
        return 38;
    }

    public static int ENOTEMPTY() {
        return 39;
    }

    public static int ELOOP() {
        return 40;
    }

    public static int ENOMSG() {
        return 42;
    }

    public static int EIDRM() {
        return 43;
    }

    public static int ECHRNG() {
        return 44;
    }

    public static int EL2NSYNC() {
        return 45;
    }

    public static int EL3HLT() {
        return 46;
    }

    public static int EL3RST() {
        return 47;
    }

    public static int ELNRNG() {
        return 48;
    }

    public static int EUNATCH() {
        return 49;
    }

    public static int ENOCSI() {
        return 50;
    }

    public static int EL2HLT() {
        return 51;
    }

    public static int EBADE() {
        return 52;
    }

    public static int EBADR() {
        return 53;
    }

    public static int EXFULL() {
        return 54;
    }

    public static int ENOANO() {
        return 55;
    }

    public static int EBADRQC() {
        return 56;
    }

    public static int EBADSLT() {
        return 57;
    }

    public static int EBFONT() {
        return 59;
    }

    public static int ENOSTR() {
        return 60;
    }

    public static int ENODATA() {
        return 61;
    }

    public static int ETIME() {
        return 62;
    }

    public static int ENOSR() {
        return 63;
    }

    public static int ENONET() {
        return 64;
    }

    public static int ENOPKG() {
        return 65;
    }

    public static int EREMOTE() {
        return 66;
    }

    public static int ENOLINK() {
        return 67;
    }

    public static int EADV() {
        return 68;
    }

    public static int ESRMNT() {
        return 69;
    }

    public static int ECOMM() {
        return 70;
    }

    public static int EPROTO() {
        return 71;
    }

    public static int EMULTIHOP() {
        return 72;
    }

    public static int EDOTDOT() {
        return 73;
    }

    public static int EBADMSG() {
        return 74;
    }

    public static int EOVERFLOW() {
        return 75;
    }

    public static int ENOTUNIQ() {
        return 76;
    }

    public static int EBADFD() {
        return 77;
    }

    public static int EREMCHG() {
        return 78;
    }

    public static int ELIBACC() {
        return 79;
    }

    public static int ELIBBAD() {
        return 80;
    }

    public static int ELIBSCN() {
        return 81;
    }

    public static int ELIBMAX() {
        return 82;
    }

    public static int ELIBEXEC() {
        return 83;
    }

    public static int EILSEQ() {
        return 84;
    }

    public static int ERESTART() {
        return 85;
    }

    public static int ESTRPIPE() {
        return 86;
    }

    public static int EUSERS() {
        return 87;
    }

    public static int ENOTSOCK() {
        return 88;
    }

    public static int EDESTADDRREQ() {
        return 89;
    }

    public static int EMSGSIZE() {
        return 90;
    }

    public static int EPROTOTYPE() {
        return 91;
    }

    public static int ENOPROTOOPT() {
        return 92;
    }

    public static int EPROTONOSUPPORT() {
        return 93;
    }

    public static int ESOCKTNOSUPPORT() {
        return 94;
    }

    public static int EOPNOTSUPP() {
        return 95;
    }

    public static int EPFNOSUPPORT() {
        return 96;
    }

    public static int EAFNOSUPPORT() {
        return 97;
    }

    public static int EADDRINUSE() {
        return 98;
    }

    public static int EADDRNOTAVAIL() {
        return 99;
    }

    public static int ENETDOWN() {
        return 100;
    }

    public static int ENETUNREACH() {
        return 101;
    }

    public static int ENETRESET() {
        return 102;
    }

    public static int ECONNABORTED() {
        return 103;
    }

    public static int ECONNRESET() {
        return 104;
    }

    public static int ENOBUFS() {
        return 105;
    }

    public static int EISCONN() {
        return 106;
    }

    public static int ENOTCONN() {
        return 107;
    }

    public static int ESHUTDOWN() {
        return 108;
    }

    public static int ETOOMANYREFS() {
        return 109;
    }

    public static int ETIMEDOUT() {
        return 110;
    }

    public static int ECONNREFUSED() {
        return 111;
    }

    public static int EHOSTDOWN() {
        return 112;
    }

    public static int EHOSTUNREACH() {
        return 113;
    }

    public static int EALREADY() {
        return 114;
    }

    public static int EINPROGRESS() {
        return 115;
    }

    public static int ESTALE() {
        return 116;
    }

    public static int EUCLEAN() {
        return 117;
    }

    public static int ENOTNAM() {
        return 118;
    }

    public static int ENAVAIL() {
        return 119;
    }

    public static int EISNAM() {
        return 120;
    }

    public static int EREMOTEIO() {
        return 121;
    }

    public static int EDQUOT() {
        return 122;
    }

    public static int ENOMEDIUM() {
        return 123;
    }

    public static int EMEDIUMTYPE() {
        return 124;
    }

    public static int ECANCELED() {
        return 125;
    }

    public static int ENOKEY() {
        return 126;
    }

    public static int EKEYEXPIRED() {
        return 127;
    }

    public static int EKEYREVOKED() {
        return 128;
    }

    public static int EKEYREJECTED() {
        return 129;
    }

    public static int EOWNERDEAD() {
        return 130;
    }

    public static int ENOTRECOVERABLE() {
        return 131;
    }

    public static int ERFKILL() {
        return 132;
    }

    public static int EHWPOISON() {
        return 133;
    }

    public static int _UNISTD_H() {
        return 1;
    }

    public static int _XOPEN_VERSION() {
        return 700;
    }

    public static int _XOPEN_XCU_VERSION() {
        return 4;
    }

    public static int _XOPEN_XPG2() {
        return 1;
    }

    public static int _XOPEN_XPG3() {
        return 1;
    }

    public static int _XOPEN_XPG4() {
        return 1;
    }

    public static int _XOPEN_UNIX() {
        return 1;
    }

    public static int _XOPEN_ENH_I18N() {
        return 1;
    }

    public static int _XOPEN_LEGACY() {
        return 1;
    }

    public static int _BITS_POSIX_OPT_H() {
        return 1;
    }

    public static int _POSIX_JOB_CONTROL() {
        return 1;
    }

    public static int _POSIX_SAVED_IDS() {
        return 1;
    }

    public static int _POSIX_CHOWN_RESTRICTED() {
        return 0;
    }

    public static int _POSIX_NO_TRUNC() {
        return 1;
    }

    public static int _XOPEN_REALTIME() {
        return 1;
    }

    public static int _XOPEN_REALTIME_THREADS() {
        return 1;
    }

    public static int _XOPEN_SHM() {
        return 1;
    }

    public static int _POSIX_REENTRANT_FUNCTIONS() {
        return 1;
    }

    public static int _POSIX_ASYNC_IO() {
        return 1;
    }

    public static int _LFS_ASYNCHRONOUS_IO() {
        return 1;
    }

    public static int _LFS64_ASYNCHRONOUS_IO() {
        return 1;
    }

    public static int _LFS_LARGEFILE() {
        return 1;
    }

    public static int _LFS64_LARGEFILE() {
        return 1;
    }

    public static int _LFS64_STDIO() {
        return 1;
    }

    public static int _POSIX_CPUTIME() {
        return 0;
    }

    public static int _POSIX_THREAD_CPUTIME() {
        return 0;
    }

    public static int _POSIX_REGEXP() {
        return 1;
    }

    public static int _POSIX_SHELL() {
        return 1;
    }

    public static int _POSIX_MONOTONIC_CLOCK() {
        return 0;
    }

    public static int _POSIX_V7_LP64_OFF64() {
        return 1;
    }

    public static int _POSIX_V6_LP64_OFF64() {
        return 1;
    }

    public static int _XBS5_LP64_OFF64() {
        return 1;
    }

    public static int STDIN_FILENO() {
        return 0;
    }

    public static int STDOUT_FILENO() {
        return 1;
    }

    public static int STDERR_FILENO() {
        return 2;
    }

    public static int R_OK() {
        return 4;
    }

    public static int W_OK() {
        return 2;
    }

    public static int X_OK() {
        return 1;
    }

    public static int F_OK() {
        return 0;
    }

    public static int _GETOPT_POSIX_H() {
        return 1;
    }

    public static int _GETOPT_CORE_H() {
        return 1;
    }

    public static int F_ULOCK() {
        return 0;
    }

    public static int F_LOCK() {
        return 1;
    }

    public static int F_TLOCK() {
        return 2;
    }

    public static int F_TEST() {
        return 3;
    }

    public static int _FCNTL_H() {
        return 1;
    }

    public static int __O_LARGEFILE() {
        return 0;
    }

    public static int F_GETLK64() {
        return 5;
    }

    public static int F_SETLK64() {
        return 6;
    }

    public static int F_SETLKW64() {
        return 7;
    }

    public static int O_ACCMODE() {
        return 3;
    }

    public static int O_RDONLY() {
        return 0;
    }

    public static int O_WRONLY() {
        return 1;
    }

    public static int O_RDWR() {
        return 2;
    }

    public static int O_CREAT() {
        return 64;
    }

    public static int O_EXCL() {
        return 128;
    }

    public static int O_NOCTTY() {
        return 256;
    }

    public static int O_TRUNC() {
        return 512;
    }

    public static int O_APPEND() {
        return 1024;
    }

    public static int O_NONBLOCK() {
        return 2048;
    }

    public static int O_SYNC() {
        return 0x101000;
    }

    public static int O_ASYNC() {
        return 8192;
    }

    public static int __O_DIRECTORY() {
        return 65536;
    }

    public static int __O_NOFOLLOW() {
        return 131072;
    }

    public static int __O_CLOEXEC() {
        return 524288;
    }

    public static int __O_DIRECT() {
        return 16384;
    }

    public static int __O_NOATIME() {
        return 262144;
    }

    public static int __O_PATH() {
        return 0x200000;
    }

    public static int __O_DSYNC() {
        return 4096;
    }

    public static int F_DUPFD() {
        return 0;
    }

    public static int F_GETFD() {
        return 1;
    }

    public static int F_SETFD() {
        return 2;
    }

    public static int F_GETFL() {
        return 3;
    }

    public static int F_SETFL() {
        return 4;
    }

    public static int __F_SETOWN() {
        return 8;
    }

    public static int __F_GETOWN() {
        return 9;
    }

    public static int __F_SETSIG() {
        return 10;
    }

    public static int __F_GETSIG() {
        return 11;
    }

    public static int __F_SETOWN_EX() {
        return 15;
    }

    public static int __F_GETOWN_EX() {
        return 16;
    }

    public static int F_DUPFD_CLOEXEC() {
        return 1030;
    }

    public static int FD_CLOEXEC() {
        return 1;
    }

    public static int F_RDLCK() {
        return 0;
    }

    public static int F_WRLCK() {
        return 1;
    }

    public static int F_UNLCK() {
        return 2;
    }

    public static int F_EXLCK() {
        return 4;
    }

    public static int F_SHLCK() {
        return 8;
    }

    public static int LOCK_SH() {
        return 1;
    }

    public static int LOCK_EX() {
        return 2;
    }

    public static int LOCK_NB() {
        return 4;
    }

    public static int LOCK_UN() {
        return 8;
    }

    public static int __POSIX_FADV_DONTNEED() {
        return 4;
    }

    public static int __POSIX_FADV_NOREUSE() {
        return 5;
    }

    public static int POSIX_FADV_NORMAL() {
        return 0;
    }

    public static int POSIX_FADV_RANDOM() {
        return 1;
    }

    public static int POSIX_FADV_SEQUENTIAL() {
        return 2;
    }

    public static int POSIX_FADV_WILLNEED() {
        return 3;
    }

    public static int _BITS_STAT_H() {
        return 1;
    }

    public static int _BITS_STRUCT_STAT_H() {
        return 1;
    }

    public static int __S_IFMT() {
        return 61440;
    }

    public static int __S_IFDIR() {
        return 16384;
    }

    public static int __S_IFCHR() {
        return 8192;
    }

    public static int __S_IFBLK() {
        return 24576;
    }

    public static int __S_IFREG() {
        return 32768;
    }

    public static int __S_IFIFO() {
        return 4096;
    }

    public static int __S_IFLNK() {
        return 40960;
    }

    public static int __S_IFSOCK() {
        return 49152;
    }

    public static int __S_ISUID() {
        return 2048;
    }

    public static int __S_ISGID() {
        return 1024;
    }

    public static int __S_ISVTX() {
        return 512;
    }

    public static int __S_IREAD() {
        return 256;
    }

    public static int __S_IWRITE() {
        return 128;
    }

    public static int __S_IEXEC() {
        return 64;
    }

    public static int AT_SYMLINK_NOFOLLOW() {
        return 256;
    }

    public static int AT_REMOVEDIR() {
        return 512;
    }

    public static int AT_SYMLINK_FOLLOW() {
        return 1024;
    }

    public static int AT_EACCESS() {
        return 512;
    }

    public static int ETH_ALEN() {
        return 6;
    }

    public static int ETH_TLEN() {
        return 2;
    }

    public static int ETH_HLEN() {
        return 14;
    }

    public static int ETH_ZLEN() {
        return 60;
    }

    public static int ETH_DATA_LEN() {
        return 1500;
    }

    public static int ETH_FRAME_LEN() {
        return 1514;
    }

    public static int ETH_FCS_LEN() {
        return 4;
    }

    public static int ETH_MIN_MTU() {
        return 68;
    }

    public static int ETH_P_LOOP() {
        return 96;
    }

    public static int ETH_P_PUP() {
        return 512;
    }

    public static int ETH_P_PUPAT() {
        return 513;
    }

    public static int ETH_P_TSN() {
        return 8944;
    }

    public static int ETH_P_ERSPAN2() {
        return 8939;
    }

    public static int ETH_P_IP() {
        return 2048;
    }

    public static int ETH_P_X25() {
        return 2053;
    }

    public static int ETH_P_ARP() {
        return 2054;
    }

    public static int ETH_P_BPQ() {
        return 2303;
    }

    public static int ETH_P_IEEEPUP() {
        return 2560;
    }

    public static int ETH_P_IEEEPUPAT() {
        return 2561;
    }

    public static int ETH_P_BATMAN() {
        return 17157;
    }

    public static int ETH_P_DEC() {
        return 24576;
    }

    public static int ETH_P_DNA_DL() {
        return 24577;
    }

    public static int ETH_P_DNA_RC() {
        return 24578;
    }

    public static int ETH_P_DNA_RT() {
        return 24579;
    }

    public static int ETH_P_LAT() {
        return 24580;
    }

    public static int ETH_P_DIAG() {
        return 24581;
    }

    public static int ETH_P_CUST() {
        return 24582;
    }

    public static int ETH_P_SCA() {
        return 24583;
    }

    public static int ETH_P_TEB() {
        return 25944;
    }

    public static int ETH_P_RARP() {
        return 32821;
    }

    public static int ETH_P_ATALK() {
        return 32923;
    }

    public static int ETH_P_AARP() {
        return 33011;
    }

    public static int ETH_P_8021Q() {
        return 33024;
    }

    public static int ETH_P_ERSPAN() {
        return 35006;
    }

    public static int ETH_P_IPX() {
        return 33079;
    }

    public static int ETH_P_IPV6() {
        return 34525;
    }

    public static int ETH_P_PAUSE() {
        return 34824;
    }

    public static int ETH_P_SLOW() {
        return 34825;
    }

    public static int ETH_P_WCCP() {
        return 34878;
    }

    public static int ETH_P_MPLS_UC() {
        return 34887;
    }

    public static int ETH_P_MPLS_MC() {
        return 34888;
    }

    public static int ETH_P_ATMMPOA() {
        return 34892;
    }

    public static int ETH_P_PPP_DISC() {
        return 34915;
    }

    public static int ETH_P_PPP_SES() {
        return 34916;
    }

    public static int ETH_P_LINK_CTL() {
        return 34924;
    }

    public static int ETH_P_ATMFATE() {
        return 34948;
    }

    public static int ETH_P_PAE() {
        return 34958;
    }

    public static int ETH_P_PROFINET() {
        return 34962;
    }

    public static int ETH_P_REALTEK() {
        return 34969;
    }

    public static int ETH_P_AOE() {
        return 34978;
    }

    public static int ETH_P_ETHERCAT() {
        return 34980;
    }

    public static int ETH_P_8021AD() {
        return 34984;
    }

    public static int ETH_P_802_EX1() {
        return 34997;
    }

    public static int ETH_P_PREAUTH() {
        return 35015;
    }

    public static int ETH_P_TIPC() {
        return 35018;
    }

    public static int ETH_P_LLDP() {
        return 35020;
    }

    public static int ETH_P_MRP() {
        return 35043;
    }

    public static int ETH_P_MACSEC() {
        return 35045;
    }

    public static int ETH_P_8021AH() {
        return 35047;
    }

    public static int ETH_P_MVRP() {
        return 35061;
    }

    public static int ETH_P_1588() {
        return 35063;
    }

    public static int ETH_P_NCSI() {
        return 35064;
    }

    public static int ETH_P_PRP() {
        return 35067;
    }

    public static int ETH_P_CFM() {
        return 35074;
    }

    public static int ETH_P_FCOE() {
        return 35078;
    }

    public static int ETH_P_IBOE() {
        return 35093;
    }

    public static int ETH_P_TDLS() {
        return 35085;
    }

    public static int ETH_P_FIP() {
        return 35092;
    }

    public static int ETH_P_80221() {
        return 35095;
    }

    public static int ETH_P_HSR() {
        return 35119;
    }

    public static int ETH_P_NSH() {
        return 35151;
    }

    public static int ETH_P_LOOPBACK() {
        return 36864;
    }

    public static int ETH_P_QINQ1() {
        return 37120;
    }

    public static int ETH_P_QINQ2() {
        return 37376;
    }

    public static int ETH_P_QINQ3() {
        return 37632;
    }

    public static int ETH_P_EDSA() {
        return 56026;
    }

    public static int ETH_P_DSA_8021Q() {
        return 56027;
    }

    public static int ETH_P_DSA_A5PSW() {
        return 57345;
    }

    public static int ETH_P_IFE() {
        return 60734;
    }

    public static int ETH_P_AF_IUCV() {
        return 64507;
    }

    public static int ETH_P_802_3_MIN() {
        return 1536;
    }

    public static int ETH_P_802_3() {
        return 1;
    }

    public static int ETH_P_AX25() {
        return 2;
    }

    public static int ETH_P_ALL() {
        return 3;
    }

    public static int ETH_P_802_2() {
        return 4;
    }

    public static int ETH_P_SNAP() {
        return 5;
    }

    public static int ETH_P_DDCMP() {
        return 6;
    }

    public static int ETH_P_WAN_PPP() {
        return 7;
    }

    public static int ETH_P_PPP_MP() {
        return 8;
    }

    public static int ETH_P_LOCALTALK() {
        return 9;
    }

    public static int ETH_P_CAN() {
        return 12;
    }

    public static int ETH_P_CANFD() {
        return 13;
    }

    public static int ETH_P_CANXL() {
        return 14;
    }

    public static int ETH_P_PPPTALK() {
        return 16;
    }

    public static int ETH_P_TR_802_2() {
        return 17;
    }

    public static int ETH_P_MOBITEX() {
        return 21;
    }

    public static int ETH_P_CONTROL() {
        return 22;
    }

    public static int ETH_P_IRDA() {
        return 23;
    }

    public static int ETH_P_ECONET() {
        return 24;
    }

    public static int ETH_P_HDLC() {
        return 25;
    }

    public static int ETH_P_ARCNET() {
        return 26;
    }

    public static int ETH_P_DSA() {
        return 27;
    }

    public static int ETH_P_TRAILER() {
        return 28;
    }

    public static int ETH_P_PHONET() {
        return 245;
    }

    public static int ETH_P_IEEE802154() {
        return 246;
    }

    public static int ETH_P_CAIF() {
        return 247;
    }

    public static int ETH_P_XDSA() {
        return 248;
    }

    public static int ETH_P_MAP() {
        return 249;
    }

    public static int ETH_P_MCTP() {
        return 250;
    }

    public static int __UAPI_DEF_ETHHDR() {
        return 1;
    }

    public static int PACKET_HOST() {
        return 0;
    }

    public static int PACKET_BROADCAST() {
        return 1;
    }

    public static int PACKET_MULTICAST() {
        return 2;
    }

    public static int PACKET_OTHERHOST() {
        return 3;
    }

    public static int PACKET_OUTGOING() {
        return 4;
    }

    public static int PACKET_LOOPBACK() {
        return 5;
    }

    public static int PACKET_USER() {
        return 6;
    }

    public static int PACKET_KERNEL() {
        return 7;
    }

    public static int PACKET_FASTROUTE() {
        return 6;
    }

    public static int PACKET_ADD_MEMBERSHIP() {
        return 1;
    }

    public static int PACKET_DROP_MEMBERSHIP() {
        return 2;
    }

    public static int PACKET_RECV_OUTPUT() {
        return 3;
    }

    public static int PACKET_RX_RING() {
        return 5;
    }

    public static int PACKET_STATISTICS() {
        return 6;
    }

    public static int PACKET_COPY_THRESH() {
        return 7;
    }

    public static int PACKET_AUXDATA() {
        return 8;
    }

    public static int PACKET_ORIGDEV() {
        return 9;
    }

    public static int PACKET_VERSION() {
        return 10;
    }

    public static int PACKET_HDRLEN() {
        return 11;
    }

    public static int PACKET_RESERVE() {
        return 12;
    }

    public static int PACKET_TX_RING() {
        return 13;
    }

    public static int PACKET_LOSS() {
        return 14;
    }

    public static int PACKET_VNET_HDR() {
        return 15;
    }

    public static int PACKET_TX_TIMESTAMP() {
        return 16;
    }

    public static int PACKET_TIMESTAMP() {
        return 17;
    }

    public static int PACKET_FANOUT() {
        return 18;
    }

    public static int PACKET_TX_HAS_OFF() {
        return 19;
    }

    public static int PACKET_QDISC_BYPASS() {
        return 20;
    }

    public static int PACKET_ROLLOVER_STATS() {
        return 21;
    }

    public static int PACKET_FANOUT_DATA() {
        return 22;
    }

    public static int PACKET_IGNORE_OUTGOING() {
        return 23;
    }

    public static int PACKET_VNET_HDR_SZ() {
        return 24;
    }

    public static int PACKET_FANOUT_HASH() {
        return 0;
    }

    public static int PACKET_FANOUT_LB() {
        return 1;
    }

    public static int PACKET_FANOUT_CPU() {
        return 2;
    }

    public static int PACKET_FANOUT_ROLLOVER() {
        return 3;
    }

    public static int PACKET_FANOUT_RND() {
        return 4;
    }

    public static int PACKET_FANOUT_QM() {
        return 5;
    }

    public static int PACKET_FANOUT_CBPF() {
        return 6;
    }

    public static int PACKET_FANOUT_EBPF() {
        return 7;
    }

    public static int PACKET_FANOUT_FLAG_ROLLOVER() {
        return 4096;
    }

    public static int PACKET_FANOUT_FLAG_UNIQUEID() {
        return 8192;
    }

    public static int PACKET_FANOUT_FLAG_IGNORE_OUTGOING() {
        return 16384;
    }

    public static int PACKET_FANOUT_FLAG_DEFRAG() {
        return 32768;
    }

    public static int TP_STATUS_KERNEL() {
        return 0;
    }

    public static int TP_STATUS_AVAILABLE() {
        return 0;
    }

    public static int TP_FT_REQ_FILL_RXHASH() {
        return 1;
    }

    public static int TPACKET_ALIGNMENT() {
        return 16;
    }

    public static int PACKET_MR_MULTICAST() {
        return 0;
    }

    public static int PACKET_MR_PROMISC() {
        return 1;
    }

    public static int PACKET_MR_ALLMULTI() {
        return 2;
    }

    public static int PACKET_MR_UNICAST() {
        return 3;
    }

    public static int IPTOS_TOS_MASK() {
        return 30;
    }

    public static int IPTOS_LOWDELAY() {
        return 16;
    }

    public static int IPTOS_THROUGHPUT() {
        return 8;
    }

    public static int IPTOS_RELIABILITY() {
        return 4;
    }

    public static int IPTOS_MINCOST() {
        return 2;
    }

    public static int IPTOS_PREC_MASK() {
        return 224;
    }

    public static int IPTOS_PREC_NETCONTROL() {
        return 224;
    }

    public static int IPTOS_PREC_INTERNETCONTROL() {
        return 192;
    }

    public static int IPTOS_PREC_CRITIC_ECP() {
        return 160;
    }

    public static int IPTOS_PREC_FLASHOVERRIDE() {
        return 128;
    }

    public static int IPTOS_PREC_FLASH() {
        return 96;
    }

    public static int IPTOS_PREC_IMMEDIATE() {
        return 64;
    }

    public static int IPTOS_PREC_PRIORITY() {
        return 32;
    }

    public static int IPTOS_PREC_ROUTINE() {
        return 0;
    }

    public static int IPOPT_COPY() {
        return 128;
    }

    public static int IPOPT_CLASS_MASK() {
        return 96;
    }

    public static int IPOPT_NUMBER_MASK() {
        return 31;
    }

    public static int IPOPT_CONTROL() {
        return 0;
    }

    public static int IPOPT_RESERVED1() {
        return 32;
    }

    public static int IPOPT_MEASUREMENT() {
        return 64;
    }

    public static int IPOPT_RESERVED2() {
        return 96;
    }

    public static int IPVERSION() {
        return 4;
    }

    public static int MAXTTL() {
        return 255;
    }

    public static int IPDEFTTL() {
        return 64;
    }

    public static int IPOPT_OPTVAL() {
        return 0;
    }

    public static int IPOPT_OLEN() {
        return 1;
    }

    public static int IPOPT_OFFSET() {
        return 2;
    }

    public static int IPOPT_MINOFF() {
        return 4;
    }

    public static int MAX_IPOPTLEN() {
        return 40;
    }

    public static int IPOPT_TS_TSONLY() {
        return 0;
    }

    public static int IPOPT_TS_TSANDADDR() {
        return 1;
    }

    public static int IPOPT_TS_PRESPEC() {
        return 3;
    }

    public static int IPV4_BEET_PHMAXLEN() {
        return 8;
    }

    public static int __UAPI_DEF_IF_IFCONF() {
        return 1;
    }

    public static int __UAPI_DEF_IF_IFMAP() {
        return 1;
    }

    public static int __UAPI_DEF_IF_IFNAMSIZ() {
        return 1;
    }

    public static int __UAPI_DEF_IF_IFREQ() {
        return 1;
    }

    public static int __UAPI_DEF_IF_NET_DEVICE_FLAGS() {
        return 1;
    }

    public static int __UAPI_DEF_IF_NET_DEVICE_FLAGS_LOWER_UP_DORMANT_ECHO() {
        return 1;
    }

    public static int __UAPI_DEF_IN_ADDR() {
        return 1;
    }

    public static int __UAPI_DEF_IN_IPPROTO() {
        return 1;
    }

    public static int __UAPI_DEF_IN_PKTINFO() {
        return 1;
    }

    public static int __UAPI_DEF_IP_MREQ() {
        return 1;
    }

    public static int __UAPI_DEF_SOCKADDR_IN() {
        return 1;
    }

    public static int __UAPI_DEF_IN_CLASS() {
        return 1;
    }

    public static int __UAPI_DEF_IN6_ADDR() {
        return 1;
    }

    public static int __UAPI_DEF_IN6_ADDR_ALT() {
        return 1;
    }

    public static int __UAPI_DEF_SOCKADDR_IN6() {
        return 1;
    }

    public static int __UAPI_DEF_IPV6_MREQ() {
        return 1;
    }

    public static int __UAPI_DEF_IPPROTO_V6() {
        return 1;
    }

    public static int __UAPI_DEF_IPV6_OPTIONS() {
        return 1;
    }

    public static int __UAPI_DEF_IN6_PKTINFO() {
        return 1;
    }

    public static int __UAPI_DEF_IP6_MTUINFO() {
        return 1;
    }

    public static int __UAPI_DEF_XATTR() {
        return 1;
    }

    public static int IPV6_FL_A_GET() {
        return 0;
    }

    public static int IPV6_FL_A_PUT() {
        return 1;
    }

    public static int IPV6_FL_A_RENEW() {
        return 2;
    }

    public static int IPV6_FL_F_CREATE() {
        return 1;
    }

    public static int IPV6_FL_F_EXCL() {
        return 2;
    }

    public static int IPV6_FL_F_REFLECT() {
        return 4;
    }

    public static int IPV6_FL_F_REMOTE() {
        return 8;
    }

    public static int IPV6_FL_S_NONE() {
        return 0;
    }

    public static int IPV6_FL_S_EXCL() {
        return 1;
    }

    public static int IPV6_FL_S_PROCESS() {
        return 2;
    }

    public static int IPV6_FL_S_USER() {
        return 3;
    }

    public static int IPV6_FL_S_ANY() {
        return 255;
    }

    public static int IPV6_FLOWINFO_FLOWLABEL() {
        return 1048575;
    }

    public static int IPV6_FLOWINFO_PRIORITY() {
        return 0xFF00000;
    }

    public static int IPV6_PRIORITY_UNCHARACTERIZED() {
        return 0;
    }

    public static int IPV6_PRIORITY_FILLER() {
        return 256;
    }

    public static int IPV6_PRIORITY_UNATTENDED() {
        return 512;
    }

    public static int IPV6_PRIORITY_RESERVED1() {
        return 768;
    }

    public static int IPV6_PRIORITY_BULK() {
        return 1024;
    }

    public static int IPV6_PRIORITY_RESERVED2() {
        return 1280;
    }

    public static int IPV6_PRIORITY_INTERACTIVE() {
        return 1536;
    }

    public static int IPV6_PRIORITY_CONTROL() {
        return 1792;
    }

    public static int IPV6_PRIORITY_8() {
        return 2048;
    }

    public static int IPV6_PRIORITY_9() {
        return 2304;
    }

    public static int IPV6_PRIORITY_10() {
        return 2560;
    }

    public static int IPV6_PRIORITY_11() {
        return 2816;
    }

    public static int IPV6_PRIORITY_12() {
        return 3072;
    }

    public static int IPV6_PRIORITY_13() {
        return 3328;
    }

    public static int IPV6_PRIORITY_14() {
        return 3584;
    }

    public static int IPV6_PRIORITY_15() {
        return 3840;
    }

    public static int IPPROTO_HOPOPTS() {
        return 0;
    }

    public static int IPPROTO_ROUTING() {
        return 43;
    }

    public static int IPPROTO_FRAGMENT() {
        return 44;
    }

    public static int IPPROTO_ICMPV6() {
        return 58;
    }

    public static int IPPROTO_NONE() {
        return 59;
    }

    public static int IPPROTO_DSTOPTS() {
        return 60;
    }

    public static int IPPROTO_MH() {
        return 135;
    }

    public static int IPV6_TLV_PAD1() {
        return 0;
    }

    public static int IPV6_TLV_PADN() {
        return 1;
    }

    public static int IPV6_TLV_ROUTERALERT() {
        return 5;
    }

    public static int IPV6_TLV_CALIPSO() {
        return 7;
    }

    public static int IPV6_TLV_IOAM() {
        return 49;
    }

    public static int IPV6_TLV_JUMBO() {
        return 194;
    }

    public static int IPV6_TLV_HAO() {
        return 201;
    }

    public static int IPV6_ADDRFORM() {
        return 1;
    }

    public static int IPV6_2292PKTINFO() {
        return 2;
    }

    public static int IPV6_2292HOPOPTS() {
        return 3;
    }

    public static int IPV6_2292DSTOPTS() {
        return 4;
    }

    public static int IPV6_2292RTHDR() {
        return 5;
    }

    public static int IPV6_2292PKTOPTIONS() {
        return 6;
    }

    public static int IPV6_CHECKSUM() {
        return 7;
    }

    public static int IPV6_2292HOPLIMIT() {
        return 8;
    }

    public static int IPV6_NEXTHOP() {
        return 9;
    }

    public static int IPV6_AUTHHDR() {
        return 10;
    }

    public static int IPV6_FLOWINFO() {
        return 11;
    }

    public static int IPV6_UNICAST_HOPS() {
        return 16;
    }

    public static int IPV6_MULTICAST_IF() {
        return 17;
    }

    public static int IPV6_MULTICAST_HOPS() {
        return 18;
    }

    public static int IPV6_MULTICAST_LOOP() {
        return 19;
    }

    public static int IPV6_ADD_MEMBERSHIP() {
        return 20;
    }

    public static int IPV6_DROP_MEMBERSHIP() {
        return 21;
    }

    public static int IPV6_ROUTER_ALERT() {
        return 22;
    }

    public static int IPV6_MTU_DISCOVER() {
        return 23;
    }

    public static int IPV6_MTU() {
        return 24;
    }

    public static int IPV6_RECVERR() {
        return 25;
    }

    public static int IPV6_V6ONLY() {
        return 26;
    }

    public static int IPV6_JOIN_ANYCAST() {
        return 27;
    }

    public static int IPV6_LEAVE_ANYCAST() {
        return 28;
    }

    public static int IPV6_MULTICAST_ALL() {
        return 29;
    }

    public static int IPV6_ROUTER_ALERT_ISOLATE() {
        return 30;
    }

    public static int IPV6_RECVERR_RFC4884() {
        return 31;
    }

    public static int IPV6_PMTUDISC_DONT() {
        return 0;
    }

    public static int IPV6_PMTUDISC_WANT() {
        return 1;
    }

    public static int IPV6_PMTUDISC_DO() {
        return 2;
    }

    public static int IPV6_PMTUDISC_PROBE() {
        return 3;
    }

    public static int IPV6_PMTUDISC_INTERFACE() {
        return 4;
    }

    public static int IPV6_PMTUDISC_OMIT() {
        return 5;
    }

    public static int IPV6_FLOWLABEL_MGR() {
        return 32;
    }

    public static int IPV6_FLOWINFO_SEND() {
        return 33;
    }

    public static int IPV6_IPSEC_POLICY() {
        return 34;
    }

    public static int IPV6_XFRM_POLICY() {
        return 35;
    }

    public static int IPV6_HDRINCL() {
        return 36;
    }

    public static int IPV6_RECVPKTINFO() {
        return 49;
    }

    public static int IPV6_PKTINFO() {
        return 50;
    }

    public static int IPV6_RECVHOPLIMIT() {
        return 51;
    }

    public static int IPV6_HOPLIMIT() {
        return 52;
    }

    public static int IPV6_RECVHOPOPTS() {
        return 53;
    }

    public static int IPV6_HOPOPTS() {
        return 54;
    }

    public static int IPV6_RTHDRDSTOPTS() {
        return 55;
    }

    public static int IPV6_RECVRTHDR() {
        return 56;
    }

    public static int IPV6_RTHDR() {
        return 57;
    }

    public static int IPV6_RECVDSTOPTS() {
        return 58;
    }

    public static int IPV6_DSTOPTS() {
        return 59;
    }

    public static int IPV6_RECVPATHMTU() {
        return 60;
    }

    public static int IPV6_PATHMTU() {
        return 61;
    }

    public static int IPV6_DONTFRAG() {
        return 62;
    }

    public static int IPV6_RECVTCLASS() {
        return 66;
    }

    public static int IPV6_TCLASS() {
        return 67;
    }

    public static int IPV6_AUTOFLOWLABEL() {
        return 70;
    }

    public static int IPV6_ADDR_PREFERENCES() {
        return 72;
    }

    public static int IPV6_PREFER_SRC_TMP() {
        return 1;
    }

    public static int IPV6_PREFER_SRC_PUBLIC() {
        return 2;
    }

    public static int IPV6_PREFER_SRC_PUBTMP_DEFAULT() {
        return 256;
    }

    public static int IPV6_PREFER_SRC_COA() {
        return 4;
    }

    public static int IPV6_PREFER_SRC_HOME() {
        return 1024;
    }

    public static int IPV6_PREFER_SRC_CGA() {
        return 8;
    }

    public static int IPV6_PREFER_SRC_NONCGA() {
        return 2048;
    }

    public static int IPV6_MINHOPCOUNT() {
        return 73;
    }

    public static int IPV6_ORIGDSTADDR() {
        return 74;
    }

    public static int IPV6_TRANSPARENT() {
        return 75;
    }

    public static int IPV6_UNICAST_IF() {
        return 76;
    }

    public static int IPV6_RECVFRAGSIZE() {
        return 77;
    }

    public static int IPV6_FREEBIND() {
        return 78;
    }

    public static int IPV6_MIN_MTU() {
        return 1280;
    }

    public static int IPV6_SRCRT_STRICT() {
        return 1;
    }

    public static int IPV6_SRCRT_TYPE_0() {
        return 0;
    }

    public static int IPV6_SRCRT_TYPE_2() {
        return 2;
    }

    public static int IPV6_SRCRT_TYPE_3() {
        return 3;
    }

    public static int IPV6_SRCRT_TYPE_4() {
        return 4;
    }

    public static int IPV6_OPT_ROUTERALERT_MLD() {
        return 0;
    }

    public static int _K_SS_MAXSIZE() {
        return 128;
    }

    public static int SOCK_SNDBUF_LOCK() {
        return 1;
    }

    public static int SOCK_RCVBUF_LOCK() {
        return 2;
    }

    public static int SOCK_TXREHASH_DEFAULT() {
        return 255;
    }

    public static int SOCK_TXREHASH_DISABLED() {
        return 0;
    }

    public static int SOCK_TXREHASH_ENABLED() {
        return 1;
    }

    public static int _SYS_SOCKET_H() {
        return 1;
    }

    public static int __iovec_defined() {
        return 1;
    }

    public static int PF_UNSPEC() {
        return 0;
    }

    public static int PF_LOCAL() {
        return 1;
    }

    public static int PF_INET() {
        return 2;
    }

    public static int PF_AX25() {
        return 3;
    }

    public static int PF_IPX() {
        return 4;
    }

    public static int PF_APPLETALK() {
        return 5;
    }

    public static int PF_NETROM() {
        return 6;
    }

    public static int PF_BRIDGE() {
        return 7;
    }

    public static int PF_ATMPVC() {
        return 8;
    }

    public static int PF_X25() {
        return 9;
    }

    public static int PF_INET6() {
        return 10;
    }

    public static int PF_ROSE() {
        return 11;
    }

    public static int PF_DECnet() {
        return 12;
    }

    public static int PF_NETBEUI() {
        return 13;
    }

    public static int PF_SECURITY() {
        return 14;
    }

    public static int PF_KEY() {
        return 15;
    }

    public static int PF_NETLINK() {
        return 16;
    }

    public static int PF_PACKET() {
        return 17;
    }

    public static int PF_ASH() {
        return 18;
    }

    public static int PF_ECONET() {
        return 19;
    }

    public static int PF_ATMSVC() {
        return 20;
    }

    public static int PF_RDS() {
        return 21;
    }

    public static int PF_SNA() {
        return 22;
    }

    public static int PF_IRDA() {
        return 23;
    }

    public static int PF_PPPOX() {
        return 24;
    }

    public static int PF_WANPIPE() {
        return 25;
    }

    public static int PF_LLC() {
        return 26;
    }

    public static int PF_IB() {
        return 27;
    }

    public static int PF_MPLS() {
        return 28;
    }

    public static int PF_CAN() {
        return 29;
    }

    public static int PF_TIPC() {
        return 30;
    }

    public static int PF_BLUETOOTH() {
        return 31;
    }

    public static int PF_IUCV() {
        return 32;
    }

    public static int PF_RXRPC() {
        return 33;
    }

    public static int PF_ISDN() {
        return 34;
    }

    public static int PF_PHONET() {
        return 35;
    }

    public static int PF_IEEE802154() {
        return 36;
    }

    public static int PF_CAIF() {
        return 37;
    }

    public static int PF_ALG() {
        return 38;
    }

    public static int PF_NFC() {
        return 39;
    }

    public static int PF_VSOCK() {
        return 40;
    }

    public static int PF_KCM() {
        return 41;
    }

    public static int PF_QIPCRTR() {
        return 42;
    }

    public static int PF_SMC() {
        return 43;
    }

    public static int PF_XDP() {
        return 44;
    }

    public static int PF_MCTP() {
        return 45;
    }

    public static int PF_MAX() {
        return 46;
    }

    public static int SOL_RAW() {
        return 255;
    }

    public static int SOL_DECNET() {
        return 261;
    }

    public static int SOL_X25() {
        return 262;
    }

    public static int SOL_PACKET() {
        return 263;
    }

    public static int SOL_ATM() {
        return 264;
    }

    public static int SOL_AAL() {
        return 265;
    }

    public static int SOL_IRDA() {
        return 266;
    }

    public static int SOL_NETBEUI() {
        return 267;
    }

    public static int SOL_LLC() {
        return 268;
    }

    public static int SOL_DCCP() {
        return 269;
    }

    public static int SOL_NETLINK() {
        return 270;
    }

    public static int SOL_TIPC() {
        return 271;
    }

    public static int SOL_RXRPC() {
        return 272;
    }

    public static int SOL_PPPOL2TP() {
        return 273;
    }

    public static int SOL_BLUETOOTH() {
        return 274;
    }

    public static int SOL_PNPIPE() {
        return 275;
    }

    public static int SOL_RDS() {
        return 276;
    }

    public static int SOL_IUCV() {
        return 277;
    }

    public static int SOL_CAIF() {
        return 278;
    }

    public static int SOL_ALG() {
        return 279;
    }

    public static int SOL_NFC() {
        return 280;
    }

    public static int SOL_KCM() {
        return 281;
    }

    public static int SOL_TLS() {
        return 282;
    }

    public static int SOL_XDP() {
        return 283;
    }

    public static int SOL_MPTCP() {
        return 284;
    }

    public static int SOL_MCTP() {
        return 285;
    }

    public static int SOL_SMC() {
        return 286;
    }

    public static int SOL_VSOCK() {
        return 287;
    }

    public static int SOMAXCONN() {
        return 4096;
    }

    public static int _BITS_SOCKADDR_H() {
        return 1;
    }

    public static int _SS_SIZE() {
        return 128;
    }

    public static int FIOSETOWN() {
        return 35073;
    }

    public static int SIOCSPGRP() {
        return 35074;
    }

    public static int FIOGETOWN() {
        return 35075;
    }

    public static int SIOCGPGRP() {
        return 35076;
    }

    public static int SIOCATMARK() {
        return 35077;
    }

    public static int SIOCGSTAMP_OLD() {
        return 35078;
    }

    public static int SIOCGSTAMPNS_OLD() {
        return 35079;
    }

    public static int SOL_SOCKET() {
        return 1;
    }

    public static int SO_DEBUG() {
        return 1;
    }

    public static int SO_REUSEADDR() {
        return 2;
    }

    public static int SO_TYPE() {
        return 3;
    }

    public static int SO_ERROR() {
        return 4;
    }

    public static int SO_DONTROUTE() {
        return 5;
    }

    public static int SO_BROADCAST() {
        return 6;
    }

    public static int SO_SNDBUF() {
        return 7;
    }

    public static int SO_RCVBUF() {
        return 8;
    }

    public static int SO_SNDBUFFORCE() {
        return 32;
    }

    public static int SO_RCVBUFFORCE() {
        return 33;
    }

    public static int SO_KEEPALIVE() {
        return 9;
    }

    public static int SO_OOBINLINE() {
        return 10;
    }

    public static int SO_NO_CHECK() {
        return 11;
    }

    public static int SO_PRIORITY() {
        return 12;
    }

    public static int SO_LINGER() {
        return 13;
    }

    public static int SO_BSDCOMPAT() {
        return 14;
    }

    public static int SO_REUSEPORT() {
        return 15;
    }

    public static int SO_PASSCRED() {
        return 16;
    }

    public static int SO_PEERCRED() {
        return 17;
    }

    public static int SO_RCVLOWAT() {
        return 18;
    }

    public static int SO_SNDLOWAT() {
        return 19;
    }

    public static int SO_RCVTIMEO_OLD() {
        return 20;
    }

    public static int SO_SNDTIMEO_OLD() {
        return 21;
    }

    public static int SO_SECURITY_AUTHENTICATION() {
        return 22;
    }

    public static int SO_SECURITY_ENCRYPTION_TRANSPORT() {
        return 23;
    }

    public static int SO_SECURITY_ENCRYPTION_NETWORK() {
        return 24;
    }

    public static int SO_BINDTODEVICE() {
        return 25;
    }

    public static int SO_ATTACH_FILTER() {
        return 26;
    }

    public static int SO_DETACH_FILTER() {
        return 27;
    }

    public static int SO_PEERNAME() {
        return 28;
    }

    public static int SO_ACCEPTCONN() {
        return 30;
    }

    public static int SO_PEERSEC() {
        return 31;
    }

    public static int SO_PASSSEC() {
        return 34;
    }

    public static int SO_MARK() {
        return 36;
    }

    public static int SO_PROTOCOL() {
        return 38;
    }

    public static int SO_DOMAIN() {
        return 39;
    }

    public static int SO_RXQ_OVFL() {
        return 40;
    }

    public static int SO_WIFI_STATUS() {
        return 41;
    }

    public static int SO_PEEK_OFF() {
        return 42;
    }

    public static int SO_NOFCS() {
        return 43;
    }

    public static int SO_LOCK_FILTER() {
        return 44;
    }

    public static int SO_SELECT_ERR_QUEUE() {
        return 45;
    }

    public static int SO_BUSY_POLL() {
        return 46;
    }

    public static int SO_MAX_PACING_RATE() {
        return 47;
    }

    public static int SO_BPF_EXTENSIONS() {
        return 48;
    }

    public static int SO_INCOMING_CPU() {
        return 49;
    }

    public static int SO_ATTACH_BPF() {
        return 50;
    }

    public static int SO_ATTACH_REUSEPORT_CBPF() {
        return 51;
    }

    public static int SO_ATTACH_REUSEPORT_EBPF() {
        return 52;
    }

    public static int SO_CNX_ADVICE() {
        return 53;
    }

    public static int SCM_TIMESTAMPING_OPT_STATS() {
        return 54;
    }

    public static int SO_MEMINFO() {
        return 55;
    }

    public static int SO_INCOMING_NAPI_ID() {
        return 56;
    }

    public static int SO_COOKIE() {
        return 57;
    }

    public static int SCM_TIMESTAMPING_PKTINFO() {
        return 58;
    }

    public static int SO_PEERGROUPS() {
        return 59;
    }

    public static int SO_ZEROCOPY() {
        return 60;
    }

    public static int SO_TXTIME() {
        return 61;
    }

    public static int SO_BINDTOIFINDEX() {
        return 62;
    }

    public static int SO_TIMESTAMP_OLD() {
        return 29;
    }

    public static int SO_TIMESTAMPNS_OLD() {
        return 35;
    }

    public static int SO_TIMESTAMPING_OLD() {
        return 37;
    }

    public static int SO_TIMESTAMP_NEW() {
        return 63;
    }

    public static int SO_TIMESTAMPNS_NEW() {
        return 64;
    }

    public static int SO_TIMESTAMPING_NEW() {
        return 65;
    }

    public static int SO_RCVTIMEO_NEW() {
        return 66;
    }

    public static int SO_SNDTIMEO_NEW() {
        return 67;
    }

    public static int SO_DETACH_REUSEPORT_BPF() {
        return 68;
    }

    public static int SO_PREFER_BUSY_POLL() {
        return 69;
    }

    public static int SO_BUSY_POLL_BUDGET() {
        return 70;
    }

    public static int SO_NETNS_COOKIE() {
        return 71;
    }

    public static int SO_BUF_LOCK() {
        return 72;
    }

    public static int SO_RESERVE_MEM() {
        return 73;
    }

    public static int SO_TXREHASH() {
        return 74;
    }

    public static int SO_RCVMARK() {
        return 75;
    }

    public static int SO_PASSPIDFD() {
        return 76;
    }

    public static int SO_PEERPIDFD() {
        return 77;
    }

    public static int SO_DEVMEM_LINEAR() {
        return 78;
    }

    public static int SO_DEVMEM_DMABUF() {
        return 79;
    }

    public static int SO_DEVMEM_DONTNEED() {
        return 80;
    }

    public static int SCM_TS_OPT_ID() {
        return 81;
    }

    public static int SO_RCVPRIORITY() {
        return 82;
    }

    public static int __osockaddr_defined() {
        return 1;
    }

    public static int IFNAMSIZ() {
        return 16;
    }

    public static int IFALIASZ() {
        return 256;
    }

    public static int ALTIFNAMSIZ() {
        return 128;
    }

    public static int GENERIC_HDLC_VERSION() {
        return 4;
    }

    public static int CLOCK_DEFAULT() {
        return 0;
    }

    public static int CLOCK_EXT() {
        return 1;
    }

    public static int CLOCK_INT() {
        return 2;
    }

    public static int CLOCK_TXINT() {
        return 3;
    }

    public static int CLOCK_TXFROMRX() {
        return 4;
    }

    public static int ENCODING_DEFAULT() {
        return 0;
    }

    public static int ENCODING_NRZ() {
        return 1;
    }

    public static int ENCODING_NRZI() {
        return 2;
    }

    public static int ENCODING_FM_MARK() {
        return 3;
    }

    public static int ENCODING_FM_SPACE() {
        return 4;
    }
}

