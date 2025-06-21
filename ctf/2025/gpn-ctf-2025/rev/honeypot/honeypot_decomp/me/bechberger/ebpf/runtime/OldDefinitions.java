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
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class OldDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void old_ich_force_enable_hpet(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void old_ich_force_enable_hpet_user(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct old_linux_dirent")
    @NotUsableInJava
    public static class old_linux_dirent
    extends Struct {
        public @Unsigned long d_ino;
        public @Unsigned long d_offset;
        public @Unsigned short d_namlen;
        public char @Size(value=0) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct old_utimbuf32")
    @NotUsableInJava
    public static class old_utimbuf32
    extends Struct {
        public @OriginalName(value="old_time32_t") int actime;
        public @OriginalName(value="old_time32_t") int modtime;
    }

    @Type(noCCodeGeneration=true, cType="struct old_serial_port")
    @NotUsableInJava
    public static class old_serial_port
    extends Struct {
        public @Unsigned int uart;
        public @Unsigned int baud_base;
        public @Unsigned int port;
        public @Unsigned int irq;
        public @Unsigned @OriginalName(value="upf_t") long flags;
        public char io_type;
        public String iomem_base;
        public @Unsigned short iomem_reg_shift;
    }

    @Type(noCCodeGeneration=true, cType="struct __old_kernel_stat")
    @NotUsableInJava
    public static class __old_kernel_stat
    extends Struct {
        public @Unsigned short st_dev;
        public @Unsigned short st_ino;
        public @Unsigned short st_mode;
        public @Unsigned short st_nlink;
        public @Unsigned short st_uid;
        public @Unsigned short st_gid;
        public @Unsigned short st_rdev;
        public @Unsigned int st_size;
        public @Unsigned int st_atime;
        public @Unsigned int st_mtime;
        public @Unsigned int st_ctime;
    }

    @Type(noCCodeGeneration=true, cType="struct old_itimerval32")
    @NotUsableInJava
    public static class old_itimerval32
    extends Struct {
        public old_timeval32 it_interval;
        public old_timeval32 it_value;
    }

    @Type(noCCodeGeneration=true, cType="struct old_utsname")
    @NotUsableInJava
    public static class old_utsname
    extends Struct {
        public char @Size(value=65) [] sysname;
        public char @Size(value=65) [] nodename;
        public char @Size(value=65) [] release;
        public char @Size(value=65) [] version;
        public char @Size(value=65) [] machine;
    }

    @Type(noCCodeGeneration=true, cType="struct old_timex32")
    @NotUsableInJava
    public static class old_timex32
    extends Struct {
        public @Unsigned int modes;
        public int offset;
        public int freq;
        public int maxerror;
        public int esterror;
        public int status;
        public int constant;
        public int precision;
        public int tolerance;
        public old_timeval32 time;
        public int tick;
        public int ppsfreq;
        public int jitter;
        public int shift;
        public int stabil;
        public int jitcnt;
        public int calcnt;
        public int errcnt;
        public int stbcnt;
        public int tai;
    }

    @Type(noCCodeGeneration=true, cType="struct old_itimerspec32")
    @NotUsableInJava
    public static class old_itimerspec32
    extends Struct {
        public old_timespec32 it_interval;
        public old_timespec32 it_value;
    }

    @Type(noCCodeGeneration=true, cType="struct old_timeval32")
    @NotUsableInJava
    public static class old_timeval32
    extends Struct {
        public @OriginalName(value="old_time32_t") int tv_sec;
        public int tv_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct old_timespec32")
    @NotUsableInJava
    public static class old_timespec32
    extends Struct {
        public @OriginalName(value="old_time32_t") int tv_sec;
        public int tv_nsec;
    }
}

