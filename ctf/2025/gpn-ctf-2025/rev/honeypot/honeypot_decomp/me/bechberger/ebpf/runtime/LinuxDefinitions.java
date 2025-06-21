/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LinuxDefinitions {

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int base; long long unsigned int size; }")
    @NotUsableInJava
    public static class AnonymousType379115456C72
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long base;
        public @Unsigned @OriginalName(value="phys_addr_t") long size;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_logo")
    @NotUsableInJava
    public static class linux_logo
    extends Struct {
        public int type;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int clutsize;
        public String clut;
        public String data;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_dirent")
    @NotUsableInJava
    public static class linux_dirent
    extends Struct {
        public @Unsigned long d_ino;
        public @Unsigned long d_off;
        public @Unsigned short d_reclen;
        public char @Size(value=0) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_dirent64")
    @NotUsableInJava
    public static class linux_dirent64
    extends Struct {
        public @Unsigned long d_ino;
        public long d_off;
        public @Unsigned short d_reclen;
        public char d_type;
        public char @Size(value=0) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_binprm__safe_trusted")
    @NotUsableInJava
    public static class linux_binprm__safe_trusted
    extends Struct {
        public Ptr<runtime.file> file;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_efi_tpm_eventlog")
    @NotUsableInJava
    public static class linux_efi_tpm_eventlog
    extends Struct {
        public @Unsigned int size;
        public @Unsigned int final_events_preboot_size;
        public char version;
        public char @Size(value=0) [] log;
    }

    @Type(noCCodeGeneration=true, cType="enum linux_mptcp_mib_field")
    public static enum linux_mptcp_mib_field implements Enum<linux_mptcp_mib_field>,
    TypedEnum<linux_mptcp_mib_field, Integer>
    {
        MPTCP_MIB_NUM,
        MPTCP_MIB_MPCAPABLEPASSIVE,
        MPTCP_MIB_MPCAPABLEACTIVE,
        MPTCP_MIB_MPCAPABLEACTIVEACK,
        MPTCP_MIB_MPCAPABLEPASSIVEACK,
        MPTCP_MIB_MPCAPABLEPASSIVEFALLBACK,
        MPTCP_MIB_MPCAPABLEACTIVEFALLBACK,
        MPTCP_MIB_MPCAPABLEACTIVEDROP,
        MPTCP_MIB_MPCAPABLEACTIVEDISABLED,
        MPTCP_MIB_MPCAPABLEENDPATTEMPT,
        MPTCP_MIB_TOKENFALLBACKINIT,
        MPTCP_MIB_RETRANSSEGS,
        MPTCP_MIB_JOINNOTOKEN,
        MPTCP_MIB_JOINSYNRX,
        MPTCP_MIB_JOINSYNBACKUPRX,
        MPTCP_MIB_JOINSYNACKRX,
        MPTCP_MIB_JOINSYNACKBACKUPRX,
        MPTCP_MIB_JOINSYNACKMAC,
        MPTCP_MIB_JOINACKRX,
        MPTCP_MIB_JOINACKMAC,
        MPTCP_MIB_JOINSYNTX,
        MPTCP_MIB_JOINSYNTXCREATSKERR,
        MPTCP_MIB_JOINSYNTXBINDERR,
        MPTCP_MIB_JOINSYNTXCONNECTERR,
        MPTCP_MIB_DSSNOMATCH,
        MPTCP_MIB_DSSCORRUPTIONFALLBACK,
        MPTCP_MIB_DSSCORRUPTIONRESET,
        MPTCP_MIB_INFINITEMAPTX,
        MPTCP_MIB_INFINITEMAPRX,
        MPTCP_MIB_DSSTCPMISMATCH,
        MPTCP_MIB_DATACSUMERR,
        MPTCP_MIB_OFOQUEUETAIL,
        MPTCP_MIB_OFOQUEUE,
        MPTCP_MIB_OFOMERGE,
        MPTCP_MIB_NODSSWINDOW,
        MPTCP_MIB_DUPDATA,
        MPTCP_MIB_ADDADDR,
        MPTCP_MIB_ADDADDRTX,
        MPTCP_MIB_ADDADDRTXDROP,
        MPTCP_MIB_ECHOADD,
        MPTCP_MIB_ECHOADDTX,
        MPTCP_MIB_ECHOADDTXDROP,
        MPTCP_MIB_PORTADD,
        MPTCP_MIB_ADDADDRDROP,
        MPTCP_MIB_JOINPORTSYNRX,
        MPTCP_MIB_JOINPORTSYNACKRX,
        MPTCP_MIB_JOINPORTACKRX,
        MPTCP_MIB_MISMATCHPORTSYNRX,
        MPTCP_MIB_MISMATCHPORTACKRX,
        MPTCP_MIB_RMADDR,
        MPTCP_MIB_RMADDRDROP,
        MPTCP_MIB_RMADDRTX,
        MPTCP_MIB_RMADDRTXDROP,
        MPTCP_MIB_RMSUBFLOW,
        MPTCP_MIB_MPPRIOTX,
        MPTCP_MIB_MPPRIORX,
        MPTCP_MIB_MPFAILTX,
        MPTCP_MIB_MPFAILRX,
        MPTCP_MIB_MPFASTCLOSETX,
        MPTCP_MIB_MPFASTCLOSERX,
        MPTCP_MIB_MPRSTTX,
        MPTCP_MIB_MPRSTRX,
        MPTCP_MIB_RCVPRUNED,
        MPTCP_MIB_SUBFLOWSTALE,
        MPTCP_MIB_SUBFLOWRECOVER,
        MPTCP_MIB_SNDWNDSHARED,
        MPTCP_MIB_RCVWNDSHARED,
        MPTCP_MIB_RCVWNDCONFLICTUPDATE,
        MPTCP_MIB_RCVWNDCONFLICT,
        MPTCP_MIB_CURRESTAB,
        MPTCP_MIB_BLACKHOLE,
        __MPTCP_MIB_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct linux_efi_initrd")
    @NotUsableInJava
    public static class linux_efi_initrd
    extends Struct {
        public @Unsigned long base;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_efi_memreserve")
    @NotUsableInJava
    public static class linux_efi_memreserve
    extends Struct {
        public int size;
        public AtomicDefinitions.atomic_t count;
        public @Unsigned @OriginalName(value="phys_addr_t") long next;
        public AnonymousType379115456C72 @Size(value=0) [] entry;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_efi_random_seed")
    @NotUsableInJava
    public static class linux_efi_random_seed
    extends Struct {
        public @Unsigned int size;
        public char @Size(value=0) [] bits;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_binprm")
    @NotUsableInJava
    public static class linux_binprm
    extends Struct {
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public @Unsigned long vma_pages;
        public @Unsigned long argmin;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long p;
        public @Unsigned int have_execfd;
        public @Unsigned int execfd_creds;
        public @Unsigned int secureexec;
        public @Unsigned int point_of_no_return;
        public Ptr<runtime.file> executable;
        public Ptr<runtime.file> interpreter;
        public Ptr<runtime.file> file;
        public Ptr<runtime.cred> cred;
        public int unsafe;
        public @Unsigned int per_clear;
        public int argc;
        public int envc;
        public String filename;
        public String interp;
        public String fdpath;
        public @Unsigned int interp_flags;
        public int execfd;
        public @Unsigned long loader;
        public @Unsigned long exec;
        public runtime.rlimit rlim_stack;
        public char @Size(value=256) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_binfmt")
    @NotUsableInJava
    public static class linux_binfmt
    extends Struct {
        public ListDefinitions.list_head lh;
        public Ptr<runtime.module> module;
        public Ptr<?> load_binary;
        public Ptr<?> load_shlib;
        public Ptr<?> core_dump;
        public @Unsigned long min_coredump;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_tls_mib")
    @NotUsableInJava
    public static class linux_tls_mib
    extends Struct {
        public @Unsigned long @Size(value=13) [] mibs;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_xfrm_mib")
    @NotUsableInJava
    public static class linux_xfrm_mib
    extends Struct {
        public @Unsigned long @Size(value=31) [] mibs;
    }

    @Type(noCCodeGeneration=true, cType="struct linux_mib")
    @NotUsableInJava
    public static class linux_mib
    extends Struct {
        public @Unsigned long @Size(value=132) [] mibs;
    }
}

