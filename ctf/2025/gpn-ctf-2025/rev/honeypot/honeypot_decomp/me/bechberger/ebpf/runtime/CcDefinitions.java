/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SetupDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cc_mkdec(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cc_mkenc(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cc_platform_clear(cc_attr attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cc_platform_has(cc_attr attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cc_platform_set(cc_attr attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cc_random_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cc_setup_data")
    @NotUsableInJava
    public static class cc_setup_data
    extends Struct {
        public SetupDefinitions.setup_data header;
        public @Unsigned int cc_blob_address;
    }

    @Type(noCCodeGeneration=true, cType="struct cc_blob_sev_info")
    @NotUsableInJava
    public static class cc_blob_sev_info
    extends Struct {
        public @Unsigned int magic;
        public @Unsigned short version;
        public @Unsigned short reserved;
        public @Unsigned long secrets_phys;
        public @Unsigned int secrets_len;
        public @Unsigned int rsvd1;
        public @Unsigned long cpuid_phys;
        public @Unsigned int cpuid_len;
        public @Unsigned int rsvd2;
    }

    @Type(noCCodeGeneration=true, cType="struct cc_attr_flags")
    @NotUsableInJava
    public static class cc_attr_flags
    extends Struct {
        public @Unsigned long host_sev_snp;
        public @Unsigned long __resv;
    }

    @Type(noCCodeGeneration=true, cType="enum cc_vendor")
    public static enum cc_vendor implements Enum<cc_vendor>,
    TypedEnum<cc_vendor, Integer>
    {
        CC_VENDOR_NONE,
        CC_VENDOR_AMD,
        CC_VENDOR_INTEL;

    }

    @Type(noCCodeGeneration=true, cType="enum cc_attr")
    public static enum cc_attr implements Enum<cc_attr>,
    TypedEnum<cc_attr, Integer>
    {
        CC_ATTR_MEM_ENCRYPT,
        CC_ATTR_HOST_MEM_ENCRYPT,
        CC_ATTR_GUEST_MEM_ENCRYPT,
        CC_ATTR_GUEST_STATE_ENCRYPT,
        CC_ATTR_GUEST_UNROLL_STRING_IO,
        CC_ATTR_GUEST_SEV_SNP,
        CC_ATTR_HOST_SEV_SNP;

    }
}

